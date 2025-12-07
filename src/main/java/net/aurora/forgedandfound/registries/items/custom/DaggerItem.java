package net.aurora.forgedandfound.registries.items.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.phys.Vec3;


public class DaggerItem extends WeaponSweeplessItem{
    public DaggerItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack itemStack, LivingEntity targetEntity, LivingEntity attackerEntity) {
        if(isAttackingFromBehind(attackerEntity, targetEntity)) {
            double attackDamage = attackerEntity.getAttributeValue(Attributes.ATTACK_DAMAGE);
            float backStabDamage = (float) (attackDamage * 2.0f);

            targetEntity.hurt(attackerEntity.damageSources().mobAttack(attackerEntity), backStabDamage);
            itemStack.hurtAndBreak(15, attackerEntity, EquipmentSlot.MAINHAND);
            return true;
        }
        return super.hurtEnemy(itemStack, targetEntity, attackerEntity);
    }

    private boolean isAttackingFromBehind(LivingEntity attacker, LivingEntity target) {
        Vec3 targetDirection = target.getLookAngle().normalize();
        Vec3 attackerDirection = attacker.position().subtract(target.position()).normalize();

        return targetDirection.dot(attackerDirection) < -0.5;
    }
}
