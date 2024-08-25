package net.capitano.mod;

import net.capitano.mod.block.ModBlocks;
import net.capitano.mod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ArmoryOfFun implements ModInitializer {
    public static final String MOD_ID = "armoryoffun";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}