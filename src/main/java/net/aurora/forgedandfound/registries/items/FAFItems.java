package net.aurora.forgedandfound.registries.items;

import net.aurora.forgedandfound.ForgedAndFound;
import net.aurora.forgedandfound.registries.items.custom.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FAFItems {
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ForgedAndFound.MOD_ID);

    // Baculus
    public static final DeferredItem<BaculusItem> DIAMOND_BACULUS = REGISTRY.register("diamond_baculus",
            () -> new BaculusItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(BaculusItem.createAttributes(Tiers.DIAMOND, 3, -2f, 3, 0.5f)), 0.50D));

    // Bat
    public static final DeferredItem<BatItem> DIAMOND_BAT = REGISTRY.register("diamond_bat",
            () -> new BatItem(Tiers.DIAMOND, new Item.Properties()));

    // Dagger
    public static final DeferredItem<DaggerItem> DIAMOND_DAGGER = REGISTRY.register("diamond_dagger",
            () -> new DaggerItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(DaggerItem.createAttributes(Tiers.DIAMOND, 1, -1.5f,-3))));

    // Frying Pan
    public static final DeferredItem<FryingPanItem> DIAMOND_FRYING_PAN = REGISTRY.register("diamond_frying_pan",
            () -> new FryingPanItem(Tiers.DIAMOND, new Item.Properties()));

    // Glaive
    public static final DeferredItem<GlaiveItem> DIAMOND_GLAIVE = REGISTRY.register("diamond_glaive",
            () -> new GlaiveItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(GlaiveItem.createAttributes(Tiers.DIAMOND, 3, -3f,3.5, 0.4f)), 1.25D));

    // Halberd
    public static final DeferredItem<HalberdItem> DIAMOND_HALBERD = REGISTRY.register("diamond_halberd",
            () -> new HalberdItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(HalberdItem.createAttributes(Tiers.DIAMOND, 5, -4f, 3.5, 0.5f)), 0.75D));

    // Kalix
    public static final DeferredItem<KalixItem> DIAMOND_KALIX = REGISTRY.register("diamond_kalix",
            () -> new KalixItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(KalixItem.createAttributes(Tiers.DIAMOND, 3, -2.5f, 3, 0.5D)), 0.50D));

    // Katana
    public static final DeferredItem<KatanaItem> DIAMOND_KATANA = REGISTRY.register("diamond_katana",
            () -> new KatanaItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(KatanaItem.createAttributes(Tiers.DIAMOND, 3, -2f, 3, 0.5f)), 0.25D));

    // Labrys
    public static final DeferredItem<LabrysItem> DIAMOND_LABRYS = REGISTRY.register("diamond_labrys",
            () -> new LabrysItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(LabrysItem.createAttributes(Tiers.DIAMOND, 6, -4f, 3, 0.6D)), 0.25D));

    // Sai
    public static final DeferredItem<SaiItem> DIAMOND_SAI = REGISTRY.register("diamond_sai",
            () -> new SaiItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(SaiItem.createAttributes(Tiers.DIAMOND, 1, -1.5f, -2))));

    // Scythe
    public static final DeferredItem<ScytheItem> DIAMOND_SCYTHE = REGISTRY.register("diamond_scythe",
            () -> new ScytheItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(ScytheItem.createAttributes(Tiers.DIAMOND, 3, -3.5f,3.5, 0.7f)), 1.0D));

    // Sickle
    public static final DeferredItem<SickleItem> DIAMOND_SICKLE = REGISTRY.register("diamond_sickle",
            () -> new SickleItem(Tiers.DIAMOND, new Item.Properties()));

    // Spear
    public static final DeferredItem<SpearItem> DIAMOND_SPEAR = REGISTRY.register("diamond_spear",
            () -> new SpearItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(SpearItem.createAttributes(Tiers.DIAMOND, 4, -3.5f, 3.5))));

    // Zweihander
    public static final DeferredItem<ZweihanderItem> DIAMOND_ZWEIHANDER = REGISTRY.register("diamond_zweihander",
            () -> new ZweihanderItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(ZweihanderItem.createAttributes(Tiers.DIAMOND, 7, -3.9f, 3, 0.5D)), 0.75D));

}
