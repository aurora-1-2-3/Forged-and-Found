package net.aurora.forgedandfound.util;

import net.aurora.forgedandfound.ForgedAndFound;
import net.minecraft.resources.ResourceLocation;


public class FAFUtility {
    public static class FAFConstants{

    }

    public static class FAFMethods{
        // HELPER METHODS
        public static ResourceLocation ID(String path) {
            return ResourceLocation.fromNamespaceAndPath(ForgedAndFound.MOD_ID, path);
        }
    }
}
