package lemon_juice.better_berries_plus.block;

import lemon_juice.better_berries_plus.BetterBerriesPlus;
import lemon_juice.better_berries_plus.block.custom.CandleberryBushBlock;
import lemon_juice.better_berries_plus.block.custom.CranberryBushBlock;
import lemon_juice.better_berries_plus.block.custom.MulberryBushBlock;
import lemon_juice.better_berries_plus.block.custom.StrawberryBushBlock;
import lemon_juice.better_berries_plus.item.BetterBerriesPlusItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BetterBerriesPlusBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BetterBerriesPlus.MOD_ID);

    public static final DeferredBlock<Block> CANDLEBERRY_BUSH = registerBlockWithoutBlockItem("candleberry_bush", () -> new CandleberryBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> CRANBERRY_BUSH = registerBlockWithoutBlockItem("cranberry_bush", () -> new CranberryBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> MULBERRY_BUSH = registerBlockWithoutBlockItem("mulberry_bush", () -> new MulberryBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> STRAWBERRY_BUSH = registerBlockWithoutBlockItem("strawberry_bush", () -> new StrawberryBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));


    private static <T extends Block> DeferredBlock<Block> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredBlock<Block> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredBlock<Block> block) {
        return BetterBerriesPlusItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
