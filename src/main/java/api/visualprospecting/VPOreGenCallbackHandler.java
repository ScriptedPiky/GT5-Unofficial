package api.visualprospecting;

public abstract class VPOreGenCallbackHandler {
    // aX and aZ are chunk coordinates
    public abstract void prospectPotentialNewVein(String oreMixName, int aX, int aZ);
}
