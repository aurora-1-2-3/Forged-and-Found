package net.aurora.e.registries.components;

import net.aurora.e.ForgedAndFound;
import net.minecraft.core.component.DataComponentType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.UnaryOperator;

@SuppressWarnings("removal")
public class FAFDataComponents {
    public static final DeferredRegister<DataComponentType<?>> REGISTRY =
            DeferredRegister.createDataComponents(ForgedAndFound.MOD_ID);





    private static <T> DeferredHolder<DataComponentType<?>, DataComponentType<T>> register(String name, UnaryOperator<DataComponentType.Builder<T>> builderOperator){
        return REGISTRY.register(name, () -> builderOperator.apply(DataComponentType.builder()).build());
    }
}
