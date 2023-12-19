package lemon_juice.better_berries_plus.creativetab;

import lemon_juice.better_berries_plus.BetterBerriesPlus;
import lemon_juice.better_berries_plus.item.BetterBerriesPlusItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterBerriesPlusCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterBerriesPlus.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BETTER_BERRIES_PLUS_TAB = CREATIVE_MODE_TABS.register("better_berries_plus", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_berries_plus"))
            .icon(() -> new ItemStack(BetterBerriesPlusItems.SPOOKY_JAM.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == BETTER_BERRIES_PLUS_TAB.get()) {
            event.accept(BetterBerriesPlusItems.CANDLEBERRIES.get());
            event.accept(BetterBerriesPlusItems.CRANBERRIES.get());
            event.accept(BetterBerriesPlusItems.MULBERRIES.get());
            event.accept(BetterBerriesPlusItems.STRAWBERRIES.get());

            event.accept(BetterBerriesPlusItems.CANDLEBERRY_JUICE.get());
            event.accept(BetterBerriesPlusItems.CRANBERRY_JUICE.get());
            event.accept(BetterBerriesPlusItems.MULBERRY_JUICE.get());
            event.accept(BetterBerriesPlusItems.STRAWBERRY_JUICE.get());

            event.accept(BetterBerriesPlusItems.CANDLEBERRY_SMOOTHIE.get());
            event.accept(BetterBerriesPlusItems.CRANBERRY_SMOOTHIE.get());
            event.accept(BetterBerriesPlusItems.MULBERRY_SMOOTHIE.get());
            event.accept(BetterBerriesPlusItems.STRAWBERRY_SMOOTHIE.get());

            event.accept(BetterBerriesPlusItems.BLACKBERRY_JAM.get());
            event.accept(BetterBerriesPlusItems.BLUEBERRY_JAM.get());
            event.accept(BetterBerriesPlusItems.CANDLEBERRY_JAM.get());
            event.accept(BetterBerriesPlusItems.CRANBERRY_JAM.get());
            event.accept(BetterBerriesPlusItems.GLOW_BERRY_JAM.get());
            event.accept(BetterBerriesPlusItems.MALOBERRY_JAM.get());
            event.accept(BetterBerriesPlusItems.MULBERRY_JAM.get());
            event.accept(BetterBerriesPlusItems.RASPBERRY_JAM.get());
            event.accept(BetterBerriesPlusItems.STRAWBERRY_JAM.get());
            event.accept(BetterBerriesPlusItems.SWEET_BERRY_JAM.get());

            event.accept(BetterBerriesPlusItems.BLACKBERRY_JAM_AND_TOAST.get());
            event.accept(BetterBerriesPlusItems.BLUEBERRY_JAM_AND_TOAST.get());
            event.accept(BetterBerriesPlusItems.CANDLEBERRY_JAM_AND_TOAST.get());
            event.accept(BetterBerriesPlusItems.CRANBERRY_JAM_AND_TOAST.get());
            event.accept(BetterBerriesPlusItems.GLOW_BERRY_JAM_AND_TOAST.get());
            event.accept(BetterBerriesPlusItems.MALOBERRY_JAM_AND_TOAST.get());
            event.accept(BetterBerriesPlusItems.MULBERRY_JAM_AND_TOAST.get());
            event.accept(BetterBerriesPlusItems.RASPBERRY_JAM_AND_TOAST.get());
            event.accept(BetterBerriesPlusItems.STRAWBERRY_JAM_AND_TOAST.get());
            event.accept(BetterBerriesPlusItems.SWEET_BERRY_JAM_AND_TOAST.get());

            event.accept(BetterBerriesPlusItems.SPOOKY_JAM.get());
            event.accept(BetterBerriesPlusItems.SPOOKY_JAM_AND_TOAST.get());
        }
    }

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
