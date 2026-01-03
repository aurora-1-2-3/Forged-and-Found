package net.aurora.e.registries.creative.tabs;

import net.aurora.e.ForgedAndFound;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredRegister;

public class FAFCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ForgedAndFound.MOD_ID);

   /* public static final Supplier<CreativeModeTab> WEAPON_TAB = REGISTRY.register("weapon_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(FAFItems.OBSIDIAN_KNIFE.get()))
                    .title(Component.translatable("creative_tab.forgedandfound.weapons"))
                    .displayItems((params, output) -> {

                        output.accept(FAFItems.OBSIDIAN_KNIFE);
                        output.accept(FAFItems.BACULUS);

                    }).build());*/

}
