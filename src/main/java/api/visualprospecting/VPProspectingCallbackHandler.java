package api.visualprospecting;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public abstract class VPProspectingCallbackHandler {
    // aX, aY, and aZ are block coordinates
    public abstract void prospectPotentialNewVein(World aWorld, int aX, int aY, int aZ, EntityPlayer aPlayer);
}
