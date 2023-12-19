package lemon_juice.better_berries_plus.util;

import lemon_juice.better_berries_plus.item.BetterBerriesPlusItems;
import net.minecraft.world.level.ItemLike;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

import static net.minecraft.world.level.block.ComposterBlock.COMPOSTABLES;

public class BetterBerriesPlusCompostables {
    public static void setup(final FMLCommonSetupEvent event) {

        add(0.3F, BetterBerriesPlusItems.CANDLEBERRIES.get());
        add(0.3F, BetterBerriesPlusItems.CRANBERRIES.get());
        add(0.3F, BetterBerriesPlusItems.MULBERRIES.get());
        add(0.3F, BetterBerriesPlusItems.STRAWBERRIES.get());


        add(0.35F, BetterBerriesPlusItems.CANDLEBERRY_JUICE.get());
        add(0.35F, BetterBerriesPlusItems.CRANBERRY_JUICE.get());
        add(0.35F, BetterBerriesPlusItems.MULBERRY_JUICE.get());
        add(0.35F, BetterBerriesPlusItems.STRAWBERRY_JUICE.get());

        add(0.4F, BetterBerriesPlusItems.CANDLEBERRY_SMOOTHIE.get());
        add(0.4F, BetterBerriesPlusItems.CRANBERRY_SMOOTHIE.get());
        add(0.4F, BetterBerriesPlusItems.MULBERRY_SMOOTHIE.get());
        add(0.4F, BetterBerriesPlusItems.STRAWBERRY_SMOOTHIE.get());

        add(0.35F, BetterBerriesPlusItems.BLACKBERRY_JAM.get());
        add(0.35F, BetterBerriesPlusItems.BLUEBERRY_JAM.get());
        add(0.35F, BetterBerriesPlusItems.CANDLEBERRY_JAM.get());
        add(0.35F, BetterBerriesPlusItems.CRANBERRY_JAM.get());
        add(0.35F, BetterBerriesPlusItems.GLOW_BERRY_JAM.get());
        add(0.35F, BetterBerriesPlusItems.MALOBERRY_JAM.get());
        add(0.35F, BetterBerriesPlusItems.MULBERRY_JAM.get());
        add(0.35F, BetterBerriesPlusItems.RASPBERRY_JAM.get());
        add(0.35F, BetterBerriesPlusItems.STRAWBERRY_JAM.get());
        add(0.35F, BetterBerriesPlusItems.SWEET_BERRY_JAM.get());
        add(0.35F, BetterBerriesPlusItems.SPOOKY_JAM.get());

        add(0.95F, BetterBerriesPlusItems.BLACKBERRY_JAM_AND_TOAST.get());
        add(0.95F, BetterBerriesPlusItems.BLUEBERRY_JAM_AND_TOAST.get());
        add(0.95F, BetterBerriesPlusItems.CANDLEBERRY_JAM_AND_TOAST.get());
        add(0.95F, BetterBerriesPlusItems.CRANBERRY_JAM_AND_TOAST.get());
        add(0.95F, BetterBerriesPlusItems.GLOW_BERRY_JAM_AND_TOAST.get());
        add(0.95F, BetterBerriesPlusItems.MALOBERRY_JAM_AND_TOAST.get());
        add(0.95F, BetterBerriesPlusItems.MULBERRY_JAM_AND_TOAST.get());
        add(0.95F, BetterBerriesPlusItems.RASPBERRY_JAM_AND_TOAST.get());
        add(0.95F, BetterBerriesPlusItems.STRAWBERRY_JAM_AND_TOAST.get());
        add(0.95F, BetterBerriesPlusItems.SWEET_BERRY_JAM_AND_TOAST.get());
        add(0.95F, BetterBerriesPlusItems.SPOOKY_JAM_AND_TOAST.get());
    }

    public static void add(float quantity, ItemLike itemLike) {
        COMPOSTABLES.put(itemLike.asItem(), quantity);
    }
}
