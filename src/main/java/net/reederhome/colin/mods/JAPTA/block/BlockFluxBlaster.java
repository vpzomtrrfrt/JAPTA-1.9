package net.reederhome.colin.mods.JAPTA.block;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.reederhome.colin.mods.JAPTA.tileentity.TileEntityFluxBlaster;

public class BlockFluxBlaster extends BlockBlaster {
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityFluxBlaster();
    }

    @Override
    protected String getBlasterType() {
        return "flux";
    }
}
