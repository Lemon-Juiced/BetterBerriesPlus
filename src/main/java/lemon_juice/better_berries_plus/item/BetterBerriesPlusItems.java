package lemon_juice.better_berries_plus.item;

import lemon_juice.better_berries.item.custom.BerryItemNameBlockItem;
import lemon_juice.better_berries.item.custom.DrinkItem;
import lemon_juice.better_berries_plus.BetterBerriesPlus;
import lemon_juice.better_berries_plus.block.BetterBerriesPlusBlocks;
import lemon_juice.better_berries_plus.item.custom.*;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static lemon_juice.better_berries.item.BetterBerriesFoods.*;
import static lemon_juice.better_berries_plus.item.BetterBerriesPlusFoods.*;
import static net.minecraft.world.item.Items.GLASS_BOTTLE;

public class BetterBerriesPlusItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterBerriesPlus.MOD_ID);

    // Berries
    public static final DeferredItem<Item> CANDLEBERRIES = ITEMS.register("candleberries", () -> new BerryItemNameBlockItem(BetterBerriesPlusBlocks.CANDLEBERRY_BUSH.get(), (new Item.Properties()).food(BERRIES)));
    public static final DeferredItem<Item> CRANBERRIES = ITEMS.register("cranberries", () -> new BerryItemNameBlockItem(BetterBerriesPlusBlocks.CRANBERRY_BUSH.get(), (new Item.Properties()).food(BERRIES)));
    public static final DeferredItem<Item> MULBERRIES = ITEMS.register("mulberries", () -> new BerryItemNameBlockItem(BetterBerriesPlusBlocks.MULBERRY_BUSH.get(), (new Item.Properties()).food(BERRIES)));
    public static final DeferredItem<Item> STRAWBERRIES = ITEMS.register("strawberries", () -> new BerryItemNameBlockItem(BetterBerriesPlusBlocks.STRAWBERRY_BUSH.get(), (new Item.Properties()).food(BERRIES)));

    // Juice Items
    public static final DeferredItem<Item> CANDLEBERRY_JUICE = ITEMS.register("candleberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(JUICE_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> CRANBERRY_JUICE = ITEMS.register("cranberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(JUICE_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> MULBERRY_JUICE = ITEMS.register("mulberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(JUICE_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> STRAWBERRY_JUICE = ITEMS.register("strawberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(JUICE_BOTTLE).stacksTo(16)));

    // Smoothie Items
    public static final DeferredItem<Item> CANDLEBERRY_SMOOTHIE = ITEMS.register("candleberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(SMOOTHIE_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> CRANBERRY_SMOOTHIE = ITEMS.register("cranberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(SMOOTHIE_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> MULBERRY_SMOOTHIE = ITEMS.register("mulberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(SMOOTHIE_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> STRAWBERRY_SMOOTHIE = ITEMS.register("strawberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(SMOOTHIE_BOTTLE).stacksTo(16)));

    // Jam Items
    public static final DeferredItem<Item> BLACKBERRY_JAM = ITEMS.register("blackberry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(JAM_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> BLUEBERRY_JAM = ITEMS.register("blueberry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(JAM_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> CANDLEBERRY_JAM = ITEMS.register("candleberry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(JAM_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> CRANBERRY_JAM = ITEMS.register("cranberry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(JAM_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> GLOW_BERRY_JAM = ITEMS.register("glow_berry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(JAM_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> MALOBERRY_JAM = ITEMS.register("maloberry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(JAM_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> MULBERRY_JAM = ITEMS.register("mulberry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(JAM_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> RASPBERRY_JAM = ITEMS.register("raspberry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(JAM_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> STRAWBERRY_JAM = ITEMS.register("strawberry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(JAM_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> SWEET_BERRY_JAM = ITEMS.register("sweet_berry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(JAM_BOTTLE).stacksTo(16)));

    // Jam and Toast Items
    public static final DeferredItem<Item> BLACKBERRY_JAM_AND_TOAST = ITEMS.register("blackberry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(JAM_AND_TOAST)));
    public static final DeferredItem<Item> BLUEBERRY_JAM_AND_TOAST = ITEMS.register("blueberry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(JAM_AND_TOAST)));
    public static final DeferredItem<Item> CANDLEBERRY_JAM_AND_TOAST = ITEMS.register("candleberry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(JAM_AND_TOAST)));
    public static final DeferredItem<Item> CRANBERRY_JAM_AND_TOAST = ITEMS.register("cranberry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(JAM_AND_TOAST)));
    public static final DeferredItem<Item> GLOW_BERRY_JAM_AND_TOAST = ITEMS.register("glow_berry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(JAM_AND_TOAST)));
    public static final DeferredItem<Item> MALOBERRY_JAM_AND_TOAST = ITEMS.register("maloberry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(JAM_AND_TOAST)));
    public static final DeferredItem<Item> MULBERRY_JAM_AND_TOAST = ITEMS.register("mulberry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(JAM_AND_TOAST)));
    public static final DeferredItem<Item> RASPBERRY_JAM_AND_TOAST = ITEMS.register("raspberry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(JAM_AND_TOAST)));
    public static final DeferredItem<Item> STRAWBERRY_JAM_AND_TOAST = ITEMS.register("strawberry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(JAM_AND_TOAST)));
    public static final DeferredItem<Item> SWEET_BERRY_JAM_AND_TOAST = ITEMS.register("sweet_berry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(JAM_AND_TOAST)));


    // SpookyJam
    public static final DeferredItem<Item> SPOOKY_JAM = ITEMS.register("spooky_jam", () -> new SpookyJamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(SPOOKY_JAM_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> SPOOKY_JAM_AND_TOAST = ITEMS.register("spooky_jam_and_toast", () -> new SpookyJamAndToastItem(new Item.Properties().food(BetterBerriesPlusFoods.SPOOKY_JAM_AND_TOAST)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}