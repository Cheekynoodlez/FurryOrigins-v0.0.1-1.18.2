package net.cheekynoodlez.furryorigins.item;


import net.cheekynoodlez.furryorigins.FurryOrigins;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
public class ModItems {

    public static final Item RAM_STICK_4G  = registerItem("ram_stick_4g",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.RAM_STICK_4G)));

    public static final Item RAM_STICK_8G  = registerItem("ram_stick_8g",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.RAM_STICK_8G)));

    public static final Item RAM_STICK_16G  = registerItem("ram_stick_16g",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.RAM_STICK_16G)));

    public static final Item SERGAL_CHEESE  = registerItem("sergal_cheese",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.SERGAL_CHEESE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FurryOrigins.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FurryOrigins.LOGGER.info("Registering Mod Items for Furry Origins");


    }
}
