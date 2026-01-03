package net.aurora.e.registries.effects;

import net.aurora.e.ForgedAndFound;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FAFEffects {
    public static final DeferredRegister<MobEffect> REGISTRY =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, ForgedAndFound.MOD_ID);

    public static final Holder<MobEffect> SIPHON_EFFECT = REGISTRY.register("siphon",
            () -> new SiphonEffect(MobEffectCategory.BENEFICIAL, 0x1D232A));
}
