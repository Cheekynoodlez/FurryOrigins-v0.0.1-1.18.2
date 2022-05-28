package net.cheekynoodlez.furryorigins;

import net.cheekynoodlez.furryorigins.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.Inject;

public class FurryOrigins implements ModInitializer {

	public static final String MOD_ID = "furryorigins";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();


	}

}

