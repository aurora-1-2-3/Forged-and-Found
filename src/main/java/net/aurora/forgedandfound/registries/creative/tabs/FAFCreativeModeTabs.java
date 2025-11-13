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

    /*public static final Supplier<CreativeModeTab> BASIC_TAB = REGISTRY.register("basic_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.IRON_AXE))
                    .title(Component.translatable("creative_tab.forgedandfound.basic_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ITEM);

                    }).build());*/
}
