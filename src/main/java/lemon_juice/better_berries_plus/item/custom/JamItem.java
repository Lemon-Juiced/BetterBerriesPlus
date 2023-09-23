package lemon_juice.better_berries_plus.item.custom;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class JamItem extends DrinkItem{
    public JamItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        return new ItemStack(Items.GLASS_BOTTLE);
    }
}
