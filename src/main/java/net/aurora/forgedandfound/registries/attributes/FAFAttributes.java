package net.aurora.forgedandfound.registries.attributes;

import net.aurora.forgedandfound.ForgedAndFound;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FAFAttributes {
    public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(
            BuiltInRegistries.ATTRIBUTE, ForgedAndFound.MOD_ID);
}
