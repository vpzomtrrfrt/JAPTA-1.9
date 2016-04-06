package net.reederhome.colin.mods.JAPTA;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
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
        registerBlock(JAPTA.bonemealApplicator, "bonemealApplicator");
        registerBlock(JAPTA.powerCabinetBase, "powerCabinetBase");
        registerBlock(JAPTA.heatConverter, "heatConverter");
        registerBlock(JAPTA.furnaceBooster, "furnaceBooster");

        ModelResourceLocation[] powerCabinetLocations = new ModelResourceLocation[16];

        for(int i = 0; i < 16; i++) {
            registerBlock(JAPTA.powerCabinet, i, "powerCabinet"+i);
            powerCabinetLocations[i] = locationForName("powerCabinet"+i);
        }

        ModelBakery.registerItemVariants(Item.getItemFromBlock(JAPTA.powerCabinet), powerCabinetLocations);

        registerItem(JAPTA.rfMeter, "rfMeter");
        registerItem(JAPTA.batteryPotato, "batteryPotato");
        registerItem(JAPTA.diagnosticTool, "diagnosticTool");
    }

    public static void registerItem(Item item, int meta, ModelResourceLocation loc) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, loc);
    }

    public static void registerItem(Item item, int meta, String name) {
        registerItem(item, meta, locationForName(name));
    }

    public static void registerItem(Item item, String name) {
        registerItem(item, 0, name);
    }

    public static void registerBlock(Block block, String name) {
        registerBlock(block, 0, name);
    }

    public static void registerBlock(Block block, int meta, String name) {
        registerItem(Item.getItemFromBlock(block), meta, name);
    }

    private static ModelResourceLocation locationForName(String name) {
        return new ModelResourceLocation(JAPTA.MODID + ":" + name, "inventory");
    }
}
