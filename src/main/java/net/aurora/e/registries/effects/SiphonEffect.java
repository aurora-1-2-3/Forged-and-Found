package net.aurora.e.registries.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class SiphonEffect extends MobEffect {
    public static final int SIPHONED_EFFECTS_DURATION = 200;
    protected SiphonEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

}
