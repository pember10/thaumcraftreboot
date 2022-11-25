package thaumcraft.api.aspects;

public interface IAspectContainer {
    AspectList getAspects();

    void setAspects(AspectList paramAspectList);

    boolean doesContainerAccept(Aspect paramAspect);

    int addToContainer(Aspect paramAspect, int paramInt);

    boolean takeFromContainer(Aspect paramAspect, int paramInt);

    boolean doesContainerContainAmount(Aspect paramAspect, int paramInt);

    int containerContains(Aspect paramAspect);
}
