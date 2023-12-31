package lemon_juice.better_berries_plus.item.custom;

import lemon_juice.better_berries.item.custom.DrinkItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SpookyJamItem extends DrinkItem {
    public SpookyJamItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.translatable("tooltip.better_berries_plus.spooky_jam"));
    }
}
