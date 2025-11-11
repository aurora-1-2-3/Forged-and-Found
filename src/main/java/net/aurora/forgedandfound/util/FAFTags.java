package net.aurora.forgedandfound.util;

import net.aurora.forgedandfound.ForgedAndFound;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class FAFTags {
    public static class Items {
        // code shit here

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ForgedAndFound.MOD_ID, name));
        }

    }
}