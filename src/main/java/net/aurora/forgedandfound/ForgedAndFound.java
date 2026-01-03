package net.aurora.forgedandfound;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

import java.util.List;

@Mod(ForgedAndFound.MOD_ID)
public class ForgedAndFound {
    public static final String MOD_ID = "forgedandfound";
    public static final Logger LOGGER = LogUtils.getLogger();

    static final List<DeferredRegister<?>> REGISTERS = List.of(

    );


    public ForgedAndFound(IEventBus modEventBus, ModContainer modContainer) {
        for (var register : REGISTERS) {
            register.register(modEventBus);
        }

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
    // test commit
}
