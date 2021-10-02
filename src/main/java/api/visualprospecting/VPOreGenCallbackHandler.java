package api.visualprospecting;

import net.minecraft.world.World;

public abstract class VPOreGenCallbackHandler {
    // aX and aZ are chunk coordinates
    public abstract void prospectPotentialNewVein(String oreMixName, World aWorld, int aX, int aZ);
}
