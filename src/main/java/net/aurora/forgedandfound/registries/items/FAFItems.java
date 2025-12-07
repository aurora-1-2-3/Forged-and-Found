package net.aurora.forgedandfound.registries.items;

import net.aurora.forgedandfound.ForgedAndFound;
import net.aurora.forgedandfound.registries.items.custom.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FAFItems {
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ForgedAndFound.MOD_ID);

    // DAGGER
    public static final DeferredItem<DaggerItem> IRON_DAGGER = REGISTRY.register("iron_dagger",
            () -> new DaggerItem(Tiers.IRON, new Item.Properties()
                    .attributes(DaggerItem.createAttributes(Tiers.IRON, 1, -1.5f, -1))));
    public static final DeferredItem<DaggerItem> GOLD_DAGGER = REGISTRY.register("gold_dagger",
            () -> new DaggerItem(Tiers.GOLD, new Item.Properties()
                    .attributes(DaggerItem.createAttributes(Tiers.GOLD, 1, -1.5f, -1))));
    public static final DeferredItem<DaggerItem> DIAMOND_DAGGER = REGISTRY.register("diamond_dagger",
            () -> new DaggerItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(DaggerItem.createAttributes(Tiers.DIAMOND, 1, -1.5f, -1))));
    public static final DeferredItem<DaggerItem> NETHERITE_DAGGER = REGISTRY.register("netherite_dagger",
            () -> new DaggerItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(DaggerItem.createAttributes(Tiers.NETHERITE, 1, -1.5f, -1))));


    // BACULUS
    public static final DeferredItem<BaculusItem> IRON_BACULUS = REGISTRY.register("iron_baculus",
            () -> new BaculusItem(Tiers.IRON, new Item.Properties()
                    .attributes(BaculusItem.createAttributes(Tiers.IRON, 3, -2f, 3, 0.5f)), 0.50D));
    public static final DeferredItem<BaculusItem> GOLD_BACULUS = REGISTRY.register("gold_baculus",
            () -> new BaculusItem(Tiers.GOLD, new Item.Properties()
                    .attributes(BaculusItem.createAttributes(Tiers.GOLD, 3, -2f, 3, 0.5f)), 0.50D));
    public static final DeferredItem<BaculusItem> DIAMOND_BACULUS = REGISTRY.register("diamond_baculus",
            () -> new BaculusItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(BaculusItem.createAttributes(Tiers.DIAMOND, 3, -2f, 3, 0.5f)), 0.50D));
    public static final DeferredItem<BaculusItem> NETHERITE_BACULUS = REGISTRY.register("netherite_baculus",
            () -> new BaculusItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(BaculusItem.createAttributes(Tiers.NETHERITE, 3, -2f, 3, 0.5f)), 0.50D));

    
    // BAT
    public static final DeferredItem<BatItem> IRON_BAT = REGISTRY.register("iron_bat",
            () -> new BatItem(Tiers.IRON, new Item.Properties()));
    public static final DeferredItem<BatItem> GOLD_BAT = REGISTRY.register("gold_bat",
            () -> new BatItem(Tiers.GOLD, new Item.Properties()));
    public static final DeferredItem<BatItem> DIAMOND_BAT = REGISTRY.register("diamond_bat",
            () -> new BatItem(Tiers.DIAMOND, new Item.Properties()));
    public static final DeferredItem<BatItem> NETHERITE_BAT = REGISTRY.register("netherite_bat",
            () -> new BatItem(Tiers.NETHERITE, new Item.Properties()));

    
    // FRYING PAN
    public static final DeferredItem<FryingPanItem> IRON_FRYING_PAN = REGISTRY.register("iron_frying_pan",
            () -> new FryingPanItem(Tiers.IRON, new Item.Properties()));
    public static final DeferredItem<FryingPanItem> GOLD_FRYING_PAN = REGISTRY.register("gold_frying_pan",
            () -> new FryingPanItem(Tiers.GOLD, new Item.Properties()));
    public static final DeferredItem<FryingPanItem> DIAMOND_FRYING_PAN = REGISTRY.register("diamond_frying_pan",
            () -> new FryingPanItem(Tiers.DIAMOND, new Item.Properties()));
    public static final DeferredItem<FryingPanItem> NETHERITE_FRYING_PAN = REGISTRY.register("netherite_frying_pan",
            () -> new FryingPanItem(Tiers.NETHERITE, new Item.Properties()));

    
    // GLAIVE
    public static final DeferredItem<GlaiveItem> IRON_GLAIVE = REGISTRY.register("iron_glaive",
            () -> new GlaiveItem(Tiers.IRON, new Item.Properties()
                    .attributes(GlaiveItem.createAttributes(Tiers.IRON, 3, -3f, 3.5, 0.4f)), 1.25D));
    public static final DeferredItem<GlaiveItem> GOLD_GLAIVE = REGISTRY.register("gold_glaive",
            () -> new GlaiveItem(Tiers.GOLD, new Item.Properties()
                    .attributes(GlaiveItem.createAttributes(Tiers.GOLD, 3, -3f, 3.5, 0.4f)), 1.25D));
    public static final DeferredItem<GlaiveItem> DIAMOND_GLAIVE = REGISTRY.register("diamond_glaive",
            () -> new GlaiveItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(GlaiveItem.createAttributes(Tiers.DIAMOND, 3, -3f, 3.5, 0.4f)), 1.25D));
    public static final DeferredItem<GlaiveItem> NETHERITE_GLAIVE = REGISTRY.register("netherite_glaive",
            () -> new GlaiveItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(GlaiveItem.createAttributes(Tiers.NETHERITE, 3, -3f, 3.5, 0.4f)), 1.25D));

    
    // HALBERD
    public static final DeferredItem<HalberdItem> IRON_HALBERD = REGISTRY.register("iron_halberd",
            () -> new HalberdItem(Tiers.IRON, new Item.Properties()
                    .attributes(HalberdItem.createAttributes(Tiers.IRON, 5, -3.5f, 3.5, 0.5f)), 0.75D));
    public static final DeferredItem<HalberdItem> GOLD_HALBERD = REGISTRY.register("gold_halberd",
            () -> new HalberdItem(Tiers.GOLD, new Item.Properties()
                    .attributes(HalberdItem.createAttributes(Tiers.GOLD, 5, -3.5f, 3.5, 0.5f)), 0.75D));
    public static final DeferredItem<HalberdItem> DIAMOND_HALBERD = REGISTRY.register("diamond_halberd",
            () -> new HalberdItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(HalberdItem.createAttributes(Tiers.DIAMOND, 5, -3.5f, 3.5, 0.5f)), 0.75D));
    public static final DeferredItem<HalberdItem> NETHERITE_HALBERD = REGISTRY.register("netherite_halberd",
            () -> new HalberdItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(HalberdItem.createAttributes(Tiers.NETHERITE, 5, -3.5f, 3.5, 0.5f)), 0.75D));

    
    // KALIX
    public static final DeferredItem<KalixItem> IRON_KALIX = REGISTRY.register("iron_kalix",
            () -> new KalixItem(Tiers.IRON, new Item.Properties()
                    .attributes(KalixItem.createAttributes(Tiers.IRON, 3, -2.5f, 3, 0.5D)), 0.50D));
    public static final DeferredItem<KalixItem> GOLD_KALIX = REGISTRY.register("gold_kalix",
            () -> new KalixItem(Tiers.GOLD, new Item.Properties()
                    .attributes(KalixItem.createAttributes(Tiers.GOLD, 3, -2.5f, 3, 0.5D)), 0.50D));
    public static final DeferredItem<KalixItem> DIAMOND_KALIX = REGISTRY.register("diamond_kalix",
            () -> new KalixItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(KalixItem.createAttributes(Tiers.DIAMOND, 3, -2.5f, 3, 0.5D)), 0.50D));
    public static final DeferredItem<KalixItem> NETHERITE_KALIX = REGISTRY.register("netherite_kalix",
            () -> new KalixItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(KalixItem.createAttributes(Tiers.NETHERITE, 3, -2.5f, 3, 0.5D)), 0.50D));

    
    // KATANA
    public static final DeferredItem<KatanaItem> IRON_KATANA = REGISTRY.register("iron_katana",
            () -> new KatanaItem(Tiers.IRON, new Item.Properties()
                    .attributes(KatanaItem.createAttributes(Tiers.IRON, 3, -2f, 3, 0.5f)), 0.25D));
    public static final DeferredItem<KatanaItem> GOLD_KATANA = REGISTRY.register("gold_katana",
            () -> new KatanaItem(Tiers.GOLD, new Item.Properties()
                    .attributes(KatanaItem.createAttributes(Tiers.GOLD, 3, -2f, 3, 0.5f)), 0.25D));
    public static final DeferredItem<KatanaItem> DIAMOND_KATANA = REGISTRY.register("diamond_katana",
            () -> new KatanaItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(KatanaItem.createAttributes(Tiers.DIAMOND, 3, -2f, 3, 0.5f)), 0.25D));
    public static final DeferredItem<KatanaItem> NETHERITE_KATANA = REGISTRY.register("netherite_katana",
            () -> new KatanaItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(KatanaItem.createAttributes(Tiers.NETHERITE, 3, -2f, 3, 0.5f)), 0.25D));

    
    // LABRYS
    public static final DeferredItem<LabrysItem> IRON_LABRYS = REGISTRY.register("iron_labrys",
            () -> new LabrysItem(Tiers.IRON, new Item.Properties()
                    .attributes(LabrysItem.createAttributes(Tiers.IRON, 6, -3.5f, 3, 0.6D)), 0.25D));
    public static final DeferredItem<LabrysItem> GOLD_LABRYS = REGISTRY.register("gold_labrys",
            () -> new LabrysItem(Tiers.GOLD, new Item.Properties()
                    .attributes(LabrysItem.createAttributes(Tiers.GOLD, 6, -3.5f, 3, 0.6D)), 0.25D));
    public static final DeferredItem<LabrysItem> DIAMOND_LABRYS = REGISTRY.register("diamond_labrys",
            () -> new LabrysItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(LabrysItem.createAttributes(Tiers.DIAMOND, 6, -3.5f, 3, 0.6D)), 0.25D));
    public static final DeferredItem<LabrysItem> NETHERITE_LABRYS = REGISTRY.register("netherite_labrys",
            () -> new LabrysItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(LabrysItem.createAttributes(Tiers.NETHERITE, 6, -3.5f, 3, 0.6D)), 0.25D));

    
    // SAI
    public static final DeferredItem<SaiItem> IRON_SAI = REGISTRY.register("iron_sai",
            () -> new SaiItem(Tiers.IRON, new Item.Properties()
                    .attributes(SaiItem.createAttributes(Tiers.IRON, 1, -1.5f, -2))));
    public static final DeferredItem<SaiItem> GOLD_SAI = REGISTRY.register("gold_sai",
            () -> new SaiItem(Tiers.GOLD, new Item.Properties()
                    .attributes(SaiItem.createAttributes(Tiers.GOLD, 1, -1.5f, -2))));
    public static final DeferredItem<SaiItem> DIAMOND_SAI = REGISTRY.register("diamond_sai",
            () -> new SaiItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(SaiItem.createAttributes(Tiers.DIAMOND, 1, -1.5f, -2))));
    public static final DeferredItem<SaiItem> NETHERITE_SAI = REGISTRY.register("netherite_sai",
            () -> new SaiItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(SaiItem.createAttributes(Tiers.NETHERITE, 1, -1.5f, -2))));

    
    // SCYTHE
    public static final DeferredItem<ScytheItem> IRON_SCYTHE = REGISTRY.register("iron_scythe",
            () -> new ScytheItem(Tiers.IRON, new Item.Properties()
                    .attributes(ScytheItem.createAttributes(Tiers.IRON, 3, -3.5f,3.5, 0.7f)), 1.0D));
    public static final DeferredItem<ScytheItem> GOLD_SCYTHE = REGISTRY.register("gold_scythe",
            () -> new ScytheItem(Tiers.GOLD, new Item.Properties()
                    .attributes(ScytheItem.createAttributes(Tiers.GOLD, 3, -3.5f,3.5, 0.7f)), 1.0D));
    public static final DeferredItem<ScytheItem> DIAMOND_SCYTHE = REGISTRY.register("diamond_scythe",
            () -> new ScytheItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(ScytheItem.createAttributes(Tiers.DIAMOND, 3, -3.5f,3.5, 0.7f)), 1.0D));
    public static final DeferredItem<ScytheItem> NETHERITE_SCYTHE = REGISTRY.register("netherite_scythe",
            () -> new ScytheItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(ScytheItem.createAttributes(Tiers.NETHERITE, 3, -3.5f,3.5, 0.7f)), 1.0D));

    
    // SICKLE
    public static final DeferredItem<SickleItem> IRON_SICKLE = REGISTRY.register("iron_sickle",
            () -> new SickleItem(Tiers.IRON, new Item.Properties()));
    public static final DeferredItem<SickleItem> GOLD_SICKLE = REGISTRY.register("gold_sickle",
            () -> new SickleItem(Tiers.GOLD, new Item.Properties()));
    public static final DeferredItem<SickleItem> DIAMOND_SICKLE = REGISTRY.register("diamond_sickle",
            () -> new SickleItem(Tiers.DIAMOND, new Item.Properties()));
    public static final DeferredItem<SickleItem> NETHERITE_SICKLE = REGISTRY.register("netherite_sickle",
            () -> new SickleItem(Tiers.NETHERITE, new Item.Properties()));

    
    // SPEAR
    public static final DeferredItem<SpearItem> IRON_SPEAR = REGISTRY.register("iron_spear",
            () -> new SpearItem(Tiers.IRON, new Item.Properties()
                    .attributes(SpearItem.createAttributes(Tiers.IRON, 4, -3.5f, 3.5))));
    public static final DeferredItem<SpearItem> GOLD_SPEAR = REGISTRY.register("gold_spear",
            () -> new SpearItem(Tiers.GOLD, new Item.Properties()
                    .attributes(SpearItem.createAttributes(Tiers.GOLD, 4, -3.5f, 3.5))));
    public static final DeferredItem<SpearItem> DIAMOND_SPEAR = REGISTRY.register("diamond_spear",
            () -> new SpearItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(SpearItem.createAttributes(Tiers.DIAMOND, 4, -3.5f, 3.5))));
    public static final DeferredItem<SpearItem> NETHERITE_SPEAR = REGISTRY.register("netherite_spear",
            () -> new SpearItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(SpearItem.createAttributes(Tiers.NETHERITE, 4, -3.5f, 3.5))));

    // ZWEIHANDER
    public static final DeferredItem<ZweihanderItem> IRON_ZWEIHANDER = REGISTRY.register("iron_zweihander",
            () -> new ZweihanderItem(Tiers.IRON, new Item.Properties()
                    .attributes(ZweihanderItem.createAttributes(Tiers.IRON, 7, -3.9f, 3, 0.5D)), 0.75D));
    public static final DeferredItem<ZweihanderItem> GOLD_ZWEIHANDER = REGISTRY.register("gold_zweihander",
            () -> new ZweihanderItem(Tiers.GOLD, new Item.Properties()
                    .attributes(ZweihanderItem.createAttributes(Tiers.GOLD, 7, -3.9f, 3, 0.5D)), 0.75D));
    public static final DeferredItem<ZweihanderItem> DIAMOND_ZWEIHANDER = REGISTRY.register("diamond_zweihander",
            () -> new ZweihanderItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(ZweihanderItem.createAttributes(Tiers.DIAMOND, 7, -3.9f, 3, 0.5D)), 0.75D));
    public static final DeferredItem<ZweihanderItem> NETHERITE_ZWEIHANDER = REGISTRY.register("netherite_zweihander",
            () -> new ZweihanderItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(ZweihanderItem.createAttributes(Tiers.NETHERITE, 7, -3.9f, 3, 0.5D)), 0.75D));


}
