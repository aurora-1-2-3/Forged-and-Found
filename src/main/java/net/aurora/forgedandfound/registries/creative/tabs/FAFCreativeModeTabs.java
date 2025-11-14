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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(FAFItems.DIAMOND_KATANA.get()))
                    .title(Component.translatable("creative_tab.forgedandfound.weapons"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(FAFItems.DIAMOND_BACULUS);
                        output.accept(FAFItems.DIAMOND_BAT);
                        output.accept(FAFItems.DIAMOND_DAGGER);
                        output.accept(FAFItems.DIAMOND_FRYING_PAN);
                        output.accept(FAFItems.DIAMOND_GLAIVE);
                        output.accept(FAFItems.DIAMOND_HALBERD);
                        output.accept(FAFItems.DIAMOND_KALIX);
                        output.accept(FAFItems.DIAMOND_KATANA);
                        output.accept(FAFItems.DIAMOND_LABRYS);
                        output.accept(FAFItems.DIAMOND_SAI);
                        output.accept(FAFItems.DIAMOND_SCYTHE);
                        output.accept(FAFItems.DIAMOND_SICKLE);
                        output.accept(FAFItems.DIAMOND_SPEAR);
                        output.accept(FAFItems.DIAMOND_ZWEIHANDER);

                    }).build());
}
