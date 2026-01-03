package net.aurora.e.registries.items.custom;

import net.aurora.e.util.FAFUtility;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.component.ItemAttributeModifiers;


public class ObsidianKnifeItem extends WeaponSweeplessItem {
    public ObsidianKnifeItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    public static ItemAttributeModifiers createAttributes(float attackDamage, float attackSpeed, double reach, float health) {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, attackDamage, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, attackSpeed, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .add(Attributes.ENTITY_INTERACTION_RANGE, new AttributeModifier(FAFUtility.ENTITY_INTERACTION_RANGE_ID, reach, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .add(Attributes.MAX_HEALTH, new AttributeModifier(FAFUtility.MAX_HEALTH, health, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .build();
    }

    @Override
    public boolean hurtEnemy(ItemStack itemStack, LivingEntity targetEntity, LivingEntity attackerEntity) {
        if (targetEntity.getTags().contains("spawned_in_the_nether") && !(targetEntity instanceof WitherBoss)) {
            targetEntity.hurt(attackerEntity.damageSources().mobAttack(attackerEntity), Float.MAX_VALUE);
            targetEntity.setHealth(0.0F);
        }
        return super.hurtEnemy(itemStack, targetEntity, attackerEntity);
    }
}
