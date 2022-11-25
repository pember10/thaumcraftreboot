package thaumcraft.api.aspects;

import net.minecraft.client.renderer.FaceInfo;

public interface IEssentiaTransport {
    boolean isConnectable(FaceInfo paramFaceInfo);

    boolean canInputFrom(FaceInfo paramFaceInfo);

    boolean canOutputTo(FaceInfo paramFaceInfo);

    void setSuction(Aspect paramAspect, int paramInt);

    Aspect getSuctionType(FaceInfo paramFaceInfo);

    int getSuctionAmount(FaceInfo paramFaceInfo);

    int takeEssentia(Aspect paramAspect, int paramInt, FaceInfo paramFaceInfo);

    int addEssentia(Aspect paramAspect, int paramInt, FaceInfo paramFaceInfo);

    Aspect getEssentiaType(FaceInfo paramFaceInfo);

    int getEssentiaAmount(FaceInfo paramFaceInfo);

    int getMinimumSuction();

    boolean renderExtendedTube();
}
