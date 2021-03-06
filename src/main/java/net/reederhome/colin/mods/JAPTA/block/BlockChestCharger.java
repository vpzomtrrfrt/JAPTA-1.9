package net.reederhome.colin.mods.JAPTA.block;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.reederhome.colin.mods.JAPTA.JAPTA;
import net.reederhome.colin.mods.JAPTA.tileentity.TileEntityChestCharger;

public class BlockChestCharger extends BlockModelContainer {
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityChestCharger();
    }

    public BlockChestCharger() {
        super(Material.ROCK);
        setHardness(2);
        setCreativeTab(JAPTA.tab);
        setUnlocalizedName("chestCharger");
    }
}
