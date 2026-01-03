package net.aurora.e.events;

import net.aurora.e.ForgedAndFound;
import net.aurora.e.registries.effects.FAFEffects;
import net.aurora.e.registries.effects.SiphonEffect;
import net.aurora.e.registries.items.custom.BaculusItem;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.FinalizeSpawnEvent;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;


@SuppressWarnings("removal")
@EventBusSubscriber(modid = ForgedAndFound.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class FAFEvents {

    @SubscribeEvent
    public static void onAttackBlockedWithBaculus(LivingIncomingDamageEvent event) {
        if ((event.getEntity() instanceof Player player) && player.isBlocking() && (player.getUseItem().getItem() instanceof BaculusItem baculusItem)) {
            player.addEffect(new MobEffectInstance(
                    FAFEffects.SIPHON_EFFECT, BaculusItem.SIPHON_EFFECT_DURATION, 0
            ));
            player.getCooldowns().addCooldown(baculusItem, BaculusItem.BACULUS_COOLDOWN);
        }
    }

    @SubscribeEvent
    public static void onEntityAttackedWithSiphonEffect(LivingIncomingDamageEvent event) {
        LivingEntity target = event.getEntity();
        if (event.getSource().getEntity() instanceof LivingEntity attacker && attacker.hasEffect(FAFEffects.SIPHON_EFFECT) && !target.getActiveEffects().isEmpty()) {
            attacker.removeEffect(FAFEffects.SIPHON_EFFECT);

            for (MobEffectInstance effect : target.getActiveEffects()) {
                if(effect.getEffect() == FAFEffects.SIPHON_EFFECT) continue;

                attacker.addEffect(new MobEffectInstance(
                        effect.getEffect(),
                        SiphonEffect.SIPHONED_EFFECTS_DURATION,
                        effect.getAmplifier(),
                        effect.isAmbient(),
                        effect.isVisible(),
                        effect.showIcon()
                ));
            }
        }
    }

    @SubscribeEvent
    public static void onMobSpawn(FinalizeSpawnEvent event) {
        if (event.getLevel() instanceof ServerLevel serverLevel) {
            String spawnDimensionTag = "spawned_in_" + serverLevel.dimension().location().getPath();
            event.getEntity().addTag(spawnDimensionTag);
        }
    }
}

