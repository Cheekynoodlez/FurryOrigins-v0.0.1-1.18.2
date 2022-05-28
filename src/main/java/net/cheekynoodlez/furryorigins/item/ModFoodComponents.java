package net.cheekynoodlez.furryorigins.item;


import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {

    public static final FoodComponent RAM_STICK_4G = (new FoodComponent.Builder()).hunger(1).saturationModifier(0)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 100, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 1.0F).alwaysEdible().build();

    public static final FoodComponent RAM_STICK_8G = (new FoodComponent.Builder()).hunger(1).saturationModifier(0)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 100, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 1), 1.0F).alwaysEdible().build();

    public static final FoodComponent RAM_STICK_16G = (new FoodComponent.Builder()).hunger(1).saturationModifier(0)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 200, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 1200, 2), 1.0F).alwaysEdible().build();


    public static final FoodComponent SERGAL_CHEESE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).build();

    }
