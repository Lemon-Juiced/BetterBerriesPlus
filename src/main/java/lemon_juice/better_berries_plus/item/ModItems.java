package lemon_juice.better_berries_plus.item;

import lemon_juice.better_berries_plus.BetterBerriesPlus;
import lemon_juice.better_berries_plus.block.ModBlocks;
import lemon_juice.better_berries_plus.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.Items.GLASS_BOTTLE;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterBerriesPlus.MOD_ID);

    // Berries
    public static final RegistryObject<Item> CANDLEBERRIES = ITEMS.register("candleberries", () -> new BerryItemNameBlockItem(ModBlocks.CANDLEBERRY_BUSH.get(), (new Item.Properties()).food(ModFoods.BERRIES)));
    public static final RegistryObject<Item> CRANBERRIES = ITEMS.register("cranberries", () -> new BerryItemNameBlockItem(ModBlocks.CRANBERRY_BUSH.get(), (new Item.Properties()).food(ModFoods.BERRIES)));
    public static final RegistryObject<Item> MULBERRIES = ITEMS.register("mulberries", () -> new BerryItemNameBlockItem(ModBlocks.MULBERRY_BUSH.get(), (new Item.Properties()).food(ModFoods.BERRIES)));
    public static final RegistryObject<Item> STRAWBERRIES = ITEMS.register("strawberries", () -> new BerryItemNameBlockItem(ModBlocks.STRAWBERRY_BUSH.get(), (new Item.Properties()).food(ModFoods.BERRIES)));

    // Juice Items
    public static final RegistryObject<Item> CANDLEBERRY_JUICE = ITEMS.register("candleberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JUICE_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> CRANBERRY_JUICE = ITEMS.register("cranberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JUICE_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> MULBERRY_JUICE = ITEMS.register("mulberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JUICE_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> STRAWBERRY_JUICE = ITEMS.register("strawberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JUICE_BOTTLE).stacksTo(16)));

    // Smoothie Items
    public static final RegistryObject<Item> CANDLEBERRY_SMOOTHIE = ITEMS.register("candleberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.SMOOTHIE_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> CRANBERRY_SMOOTHIE = ITEMS.register("cranberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.SMOOTHIE_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> MULBERRY_SMOOTHIE = ITEMS.register("mulberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.SMOOTHIE_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> STRAWBERRY_SMOOTHIE = ITEMS.register("strawberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.SMOOTHIE_BOTTLE).stacksTo(16)));

    // Jam Items
    public static final RegistryObject<Item> BLACKBERRY_JAM = ITEMS.register("blackberry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JAM_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> BLUEBERRY_JAM = ITEMS.register("blueberry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JAM_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> CANDLEBERRY_JAM = ITEMS.register("candleberry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JAM_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> CRANBERRY_JAM = ITEMS.register("cranberry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JAM_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> GLOW_BERRY_JAM = ITEMS.register("glow_berry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JAM_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> MALOBERRY_JAM = ITEMS.register("maloberry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JAM_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> MULBERRY_JAM = ITEMS.register("mulberry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JAM_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> RASPBERRY_JAM = ITEMS.register("raspberry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JAM_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> STRAWBERRY_JAM = ITEMS.register("strawberry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JAM_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> SWEET_BERRY_JAM = ITEMS.register("sweet_berry_jam", () -> new JamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JAM_BOTTLE).stacksTo(16)));

    // Jam and Toast Items
    public static final RegistryObject<Item> BLACKBERRY_JAM_AND_TOAST = ITEMS.register("blackberry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(ModFoods.JAM_AND_TOAST)));
    public static final RegistryObject<Item> BLUEBERRY_JAM_AND_TOAST = ITEMS.register("blueberry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(ModFoods.JAM_AND_TOAST)));
    public static final RegistryObject<Item> CANDLEBERRY_JAM_AND_TOAST = ITEMS.register("candleberry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(ModFoods.JAM_AND_TOAST)));
    public static final RegistryObject<Item> CRANBERRY_JAM_AND_TOAST = ITEMS.register("cranberry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(ModFoods.JAM_AND_TOAST)));
    public static final RegistryObject<Item> GLOW_BERRY_JAM_AND_TOAST = ITEMS.register("glow_berry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(ModFoods.JAM_AND_TOAST)));
    public static final RegistryObject<Item> MALOBERRY_JAM_AND_TOAST = ITEMS.register("maloberry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(ModFoods.JAM_AND_TOAST)));
    public static final RegistryObject<Item> MULBERRY_JAM_AND_TOAST = ITEMS.register("mulberry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(ModFoods.JAM_AND_TOAST)));
    public static final RegistryObject<Item> RASPBERRY_JAM_AND_TOAST = ITEMS.register("raspberry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(ModFoods.JAM_AND_TOAST)));
    public static final RegistryObject<Item> STRAWBERRY_JAM_AND_TOAST = ITEMS.register("strawberry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(ModFoods.JAM_AND_TOAST)));
    public static final RegistryObject<Item> SWEET_BERRY_JAM_AND_TOAST = ITEMS.register("sweet_berry_jam_and_toast", () -> new JamAndToastItem(new Item.Properties().food(ModFoods.JAM_AND_TOAST)));


    // SpookyJam
    public static final RegistryObject<Item> SPOOKY_JAM = ITEMS.register("spooky_jam", () -> new SpookyJamItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.SPOOKY_JAM_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> SPOOKY_JAM_AND_TOAST = ITEMS.register("spooky_jam_and_toast", () -> new SpookyJamAndToastItem(new Item.Properties().food(ModFoods.SPOOKY_JAM_AND_TOAST)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}