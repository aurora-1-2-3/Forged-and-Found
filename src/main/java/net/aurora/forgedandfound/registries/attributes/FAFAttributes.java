package net.aurora.forgedandfound.registries.attributes;

import net.aurora.forgedandfound.ForgedAndFound;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FAFAttributes {
    public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(
            BuiltInRegistries.ATTRIBUTE, ForgedAndFound.MOD_ID);

    public static final Holder<Attribute> SWEEP_RANGE = REGISTRY.register("sweep_range",
            () -> new RangedAttribute("attribute.name.genric.sweep_range", 1.0D, 0.1D, 10.0D).setSyncable(true));
}
