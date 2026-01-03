package net.aurora.e.registries.items;

import net.aurora.e.ForgedAndFound;
import net.aurora.e.registries.items.custom.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FAFItems {
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ForgedAndFound.MOD_ID);

    // DAGGER
    public static final DeferredItem<ObsidianKnifeItem> OBSIDIAN_KNIFE = REGISTRY.register("obsidian_knife",
            () -> new ObsidianKnifeItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(ObsidianKnifeItem.createAttributes(1, -1.5f, -1, -19.0f))));


    // BACULUS
    public static final DeferredItem<BaculusItem> BACULUS = REGISTRY.register("baculus",
            () -> new BaculusItem(new Item.Properties().durability(345)));


}
