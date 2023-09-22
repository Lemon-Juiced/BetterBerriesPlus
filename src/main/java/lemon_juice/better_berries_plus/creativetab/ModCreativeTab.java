package lemon_juice.better_berries_plus.creativetab;

import lemon_juice.better_berries_plus.BetterBerriesPlus;
import lemon_juice.better_berries_plus.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterBerriesPlus.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BETTER_BERRIES_PLUS_TAB = CREATIVE_MODE_TABS.register("better_berries_plus", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_berries_plus"))
            .icon(() -> new ItemStack(ModItems.SPOOKY_JAM.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == BETTER_BERRIES_PLUS_TAB.get()) {
            event.accept(ModItems.CANDLEBERRIES.get());
            event.accept(ModItems.CRANBERRIES.get());
            event.accept(ModItems.MULBERRIES.get());
            event.accept(ModItems.STRAWBERRIES.get());

            event.accept(ModItems.CANDLEBERRY_JUICE.get());
            event.accept(ModItems.CRANBERRY_JUICE.get());
            event.accept(ModItems.MULBERRY_JUICE.get());
            event.accept(ModItems.STRAWBERRY_JUICE.get());

            event.accept(ModItems.CANDLEBERRY_SMOOTHIE.get());
            event.accept(ModItems.CRANBERRY_SMOOTHIE.get());
            event.accept(ModItems.MULBERRY_SMOOTHIE.get());
            event.accept(ModItems.STRAWBERRY_SMOOTHIE.get());

            event.accept(ModItems.BLACKBERRY_JAM.get());
            event.accept(ModItems.BLUEBERRY_JAM.get());
            event.accept(ModItems.CANDLEBERRY_JAM.get());
            event.accept(ModItems.CRANBERRY_JAM.get());
            event.accept(ModItems.GLOW_BERRY_JAM.get());
            event.accept(ModItems.MALOBERRY_JAM.get());
            event.accept(ModItems.MULBERRY_JAM.get());
            event.accept(ModItems.RASPBERRY_JAM.get());
            event.accept(ModItems.STRAWBERRY_JAM.get());
            event.accept(ModItems.SWEET_BERRY_JAM.get());

            event.accept(ModItems.BLACKBERRY_JAM_AND_TOAST.get());
            event.accept(ModItems.BLUEBERRY_JAM_AND_TOAST.get());
            event.accept(ModItems.CANDLEBERRY_JAM_AND_TOAST.get());
            event.accept(ModItems.CRANBERRY_JAM_AND_TOAST.get());
            event.accept(ModItems.GLOW_BERRY_JAM_AND_TOAST.get());
            event.accept(ModItems.MALOBERRY_JAM_AND_TOAST.get());
            event.accept(ModItems.MULBERRY_JAM_AND_TOAST.get());
            event.accept(ModItems.RASPBERRY_JAM_AND_TOAST.get());
            event.accept(ModItems.STRAWBERRY_JAM_AND_TOAST.get());
            event.accept(ModItems.SWEET_BERRY_JAM_AND_TOAST.get());

            event.accept(ModItems.SPOOKY_JAM.get());
            event.accept(ModItems.SPOOKY_JAM_AND_TOAST.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
