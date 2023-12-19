package lemon_juice.better_berries_plus;

import lemon_juice.better_berries_plus.block.BetterBerriesPlusBlocks;
import lemon_juice.better_berries_plus.creativetab.BetterBerriesPlusCreativeTab;
import lemon_juice.better_berries_plus.item.BetterBerriesPlusItems;
import lemon_juice.better_berries_plus.util.BetterBerriesPlusCompostables;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(BetterBerriesPlus.MOD_ID)
public class BetterBerriesPlus {
    public static final String MOD_ID = "better_berries_plus";

    public BetterBerriesPlus(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

        // Register Items & Blocks
        BetterBerriesPlusItems.register(modEventBus);
        BetterBerriesPlusBlocks.register(modEventBus);

        // Register Creative Tab
        BetterBerriesPlusCreativeTab.register(modEventBus);
        modEventBus.addListener(BetterBerriesPlusCreativeTab::registerTabs);

        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            //Register Compostables
            BetterBerriesPlusCompostables.setup(event);
        });
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
