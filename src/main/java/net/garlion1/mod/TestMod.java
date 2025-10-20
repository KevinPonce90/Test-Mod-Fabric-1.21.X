package net.garlion1.mod;

import net.fabricmc.api.ModInitializer;
import net.garlion1.mod.item.Modems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        Modems.registerModItems();
	}
}