package api.visualprospecting;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.World;

@SideOnly(Side.CLIENT)
public abstract class VPProspectingCallbackHandler {
    public abstract void prospectPotentialNewVein(World aWorld, int aX, int aY, int aZ, short aMeta);
}
