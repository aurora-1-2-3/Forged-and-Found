package net.aurora.forgedandfound.util;

import net.aurora.forgedandfound.ForgedAndFound;
import net.minecraft.resources.ResourceLocation;


public class FAFUtility {
        // CONSTANTS
        public static final ResourceLocation ENTITY_INTERACTION_RANGE_ID = ResourceLocation.withDefaultNamespace("entity_interaction_range");
        public static final ResourceLocation SWEEP_DAMAGE_RATIO_ID = ResourceLocation.withDefaultNamespace("sweep_damage_ratio");

        // HELPER METHODS
        public static ResourceLocation ID(String path) {
            return ResourceLocation.fromNamespaceAndPath(ForgedAndFound.MOD_ID, path);
        }
}
