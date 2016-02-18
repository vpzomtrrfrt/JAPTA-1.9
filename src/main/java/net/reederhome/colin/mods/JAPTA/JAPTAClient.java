package net.reederhome.colin.mods.JAPTA;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class JAPTAClient {

    public static void registerClientThings() {
        registerBlock(JAPTA.cakeConverter, "cakeConverter");
        registerBlock(JAPTA.fluxHopper, "fluxHopper");
        registerBlock(JAPTA.chargingPlate, "chargingPlate");
        registerBlock(JAPTA.elevatorShaft, "elevatorShaft");
        registerBlock(JAPTA.elevatorTop, "elevatorTop");
        registerBlock(JAPTA.fluxBlaster, "fluxBlaster");
        registerBlock(JAPTA.itemBlaster, "itemBlaster");
        registerBlock(JAPTA.rngQuarry, "rngQuarry");
        registerBlock(JAPTA.chestCharger, "chestCharger");
        registerBlock(JAPTA.mover, "mover");

        registerItem(JAPTA.rfMeter, "rfMeter");
        registerItem(JAPTA.batteryPotato, "batteryPotato");
    }

    public static void registerItem(Item item, int meta, ModelResourceLocation loc) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, loc);
    }

    public static void registerItem(Item item, String name) {
        registerItem(item, 0, new ModelResourceLocation(JAPTA.MODID + ":" + name, "inventory"));
    }

    public static void registerBlock(Block block, String name) {
        registerItem(Item.getItemFromBlock(block), name);
    }
}
