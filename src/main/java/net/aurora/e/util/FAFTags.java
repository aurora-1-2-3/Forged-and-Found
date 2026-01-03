package net.aurora.e.util;

import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class FAFTags {
    public static class Items {
        // code shit here

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(FAFUtility.ID(name));
        }

    }

    /*public static class Entities {


        private static TagKey<EntityType<?>> tag(String name) {
            return TagKey.create(Registries.ENTITY_TYPE, FAFUtility.ID(name));
        }
    }*/
}