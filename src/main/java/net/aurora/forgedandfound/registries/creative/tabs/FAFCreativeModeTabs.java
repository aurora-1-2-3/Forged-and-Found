package net.aurora.forgedandfound.registries.creative.tabs;

import net.aurora.forgedandfound.ForgedAndFound;
import net.aurora.forgedandfound.registries.items.FAFItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class FAFCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ForgedAndFound.MOD_ID);

    public static final Supplier<CreativeModeTab> WEAPON_TAB = REGISTRY.register("weapon_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(FAFItems.DIAMOND_KATANA.get()))
                    .title(Component.translatable("creative_tab.forgedandfound.weapons"))
                    .displayItems((params, output) -> {

                        output.accept(FAFItems.IRON_DAGGER);
                        output.accept(FAFItems.GOLD_DAGGER);
                        output.accept(FAFItems.DIAMOND_DAGGER);
                        output.accept(FAFItems.NETHERITE_DAGGER);

                        output.accept(FAFItems.IRON_SICKLE);
                        output.accept(FAFItems.GOLD_SICKLE);
                        output.accept(FAFItems.DIAMOND_SICKLE);
                        output.accept(FAFItems.NETHERITE_SICKLE);

                        output.accept(FAFItems.IRON_SAI);
                        output.accept(FAFItems.GOLD_SAI);
                        output.accept(FAFItems.DIAMOND_SAI);
                        output.accept(FAFItems.NETHERITE_SAI);

                        output.accept(FAFItems.IRON_FRYING_PAN);
                        output.accept(FAFItems.GOLD_FRYING_PAN);
                        output.accept(FAFItems.DIAMOND_FRYING_PAN);
                        output.accept(FAFItems.NETHERITE_FRYING_PAN);

                        output.accept(FAFItems.IRON_BAT);
                        output.accept(FAFItems.GOLD_BAT);
                        output.accept(FAFItems.DIAMOND_BAT);
                        output.accept(FAFItems.NETHERITE_BAT);

                        output.accept(FAFItems.IRON_KALIX);
                        output.accept(FAFItems.GOLD_KALIX);
                        output.accept(FAFItems.DIAMOND_KALIX);
                        output.accept(FAFItems.NETHERITE_KALIX);

                        output.accept(FAFItems.IRON_BACULUS);
                        output.accept(FAFItems.GOLD_BACULUS);
                        output.accept(FAFItems.DIAMOND_BACULUS);
                        output.accept(FAFItems.NETHERITE_BACULUS);

                        output.accept(FAFItems.IRON_GLAIVE);
                        output.accept(FAFItems.GOLD_GLAIVE);
                        output.accept(FAFItems.DIAMOND_GLAIVE);
                        output.accept(FAFItems.NETHERITE_GLAIVE);

                        output.accept(FAFItems.IRON_HALBERD);
                        output.accept(FAFItems.GOLD_HALBERD);
                        output.accept(FAFItems.DIAMOND_HALBERD);
                        output.accept(FAFItems.NETHERITE_HALBERD);

                        output.accept(FAFItems.IRON_LABRYS);
                        output.accept(FAFItems.GOLD_LABRYS);
                        output.accept(FAFItems.DIAMOND_LABRYS);
                        output.accept(FAFItems.NETHERITE_LABRYS);

                        output.accept(FAFItems.IRON_KATANA);
                        output.accept(FAFItems.GOLD_KATANA);
                        output.accept(FAFItems.DIAMOND_KATANA);
                        output.accept(FAFItems.NETHERITE_KATANA);

                        output.accept(FAFItems.IRON_SCYTHE);
                        output.accept(FAFItems.GOLD_SCYTHE);
                        output.accept(FAFItems.DIAMOND_SCYTHE);
                        output.accept(FAFItems.NETHERITE_SCYTHE);

                        output.accept(FAFItems.IRON_SPEAR);
                        output.accept(FAFItems.GOLD_SPEAR);
                        output.accept(FAFItems.DIAMOND_SPEAR);
                        output.accept(FAFItems.NETHERITE_SPEAR);

                        output.accept(FAFItems.IRON_ZWEIHANDER);
                        output.accept(FAFItems.GOLD_ZWEIHANDER);
                        output.accept(FAFItems.DIAMOND_ZWEIHANDER);
                        output.accept(FAFItems.NETHERITE_ZWEIHANDER);

                    }).build());

}
