package lemon_juice.better_berries_plus.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties JAM_BOTTLE = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties JAM_AND_TOAST = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.9F).build();

    public static final FoodProperties SPOOKY_JAM_BOTTLE = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.WITHER, 100, 1), 1f).build();
    public static final FoodProperties SPOOKY_JAM_AND_TOAST = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.9F).effect(new MobEffectInstance(MobEffects.WITHER, 100, 1), 1f).build();

}
