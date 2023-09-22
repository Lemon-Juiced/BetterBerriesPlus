package lemon_juice.better_berries_plus.util;

import lemon_juice.better_berries_plus.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import static net.minecraft.world.level.block.ComposterBlock.COMPOSTABLES;

public class ModCompostables {
    public static void setup(final FMLCommonSetupEvent event) {

        add(0.3F, ModItems.CANDLEBERRIES.get());
        add(0.3F, ModItems.CRANBERRIES.get());
        add(0.3F, ModItems.MULBERRIES.get());
        add(0.3F, ModItems.STRAWBERRIES.get());


        add(0.35F, ModItems.CANDLEBERRY_JUICE.get());
        add(0.35F, ModItems.CRANBERRY_JUICE.get());
        add(0.35F, ModItems.MULBERRY_JUICE.get());
        add(0.35F, ModItems.STRAWBERRY_JUICE.get());

        add(0.4F, ModItems.CANDLEBERRY_SMOOTHIE.get());
        add(0.4F, ModItems.CRANBERRY_SMOOTHIE.get());
        add(0.4F, ModItems.MULBERRY_SMOOTHIE.get());
        add(0.4F, ModItems.STRAWBERRY_SMOOTHIE.get());

        add(0.35F, ModItems.BLACKBERRY_JAM.get());
        add(0.35F, ModItems.BLUEBERRY_JAM.get());
        add(0.35F, ModItems.CANDLEBERRY_JAM.get());
        add(0.35F, ModItems.CRANBERRY_JAM.get());
        add(0.35F, ModItems.GLOW_BERRY_JAM.get());
        add(0.35F, ModItems.MALOBERRY_JAM.get());
        add(0.35F, ModItems.MULBERRY_JAM.get());
        add(0.35F, ModItems.RASPBERRY_JAM.get());
        add(0.35F, ModItems.STRAWBERRY_JAM.get());
        add(0.35F, ModItems.SWEET_BERRY_JAM.get());
        add(0.35F, ModItems.SPOOKY_JAM.get());

        add(0.95F, ModItems.BLACKBERRY_JAM_AND_TOAST.get());
        add(0.95F, ModItems.BLUEBERRY_JAM_AND_TOAST.get());
        add(0.95F, ModItems.CANDLEBERRY_JAM_AND_TOAST.get());
        add(0.95F, ModItems.CRANBERRY_JAM_AND_TOAST.get());
        add(0.95F, ModItems.GLOW_BERRY_JAM_AND_TOAST.get());
        add(0.95F, ModItems.MALOBERRY_JAM_AND_TOAST.get());
        add(0.95F, ModItems.MULBERRY_JAM_AND_TOAST.get());
        add(0.95F, ModItems.RASPBERRY_JAM_AND_TOAST.get());
        add(0.95F, ModItems.STRAWBERRY_JAM_AND_TOAST.get());
        add(0.95F, ModItems.SWEET_BERRY_JAM_AND_TOAST.get());
        add(0.95F, ModItems.SPOOKY_JAM_AND_TOAST.get());
    }

    public static void add(float quantity, ItemLike itemLike) {
        COMPOSTABLES.put(itemLike.asItem(), quantity);
    }
}
