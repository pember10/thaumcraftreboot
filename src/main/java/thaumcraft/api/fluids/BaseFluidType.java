package thaumcraft.api.fluids;

import java.util.function.Consumer;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.math.Vector3f;

import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.FogRenderer.FogMode;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.fluids.FluidType;

public class BaseFluidType extends FluidType {

    private final ResourceLocation stillTexture;
    public ResourceLocation getStillTexture() {
        return stillTexture;
    }

    private final ResourceLocation flowingTexture;
    public ResourceLocation getFlowingTexture() {
        return flowingTexture;
    }

    private final ResourceLocation overlayTexture;
    public ResourceLocation getOverlayTexture() {
        return overlayTexture;
    }

    private final int tintColor;
    public int getTintColor() {
        return tintColor;
    }

    private final Vector3f fogColor;

    public Vector3f getFogColor() {
        return fogColor;
    }

    public BaseFluidType(final ResourceLocation stillTexture, final ResourceLocation flowingTexture,
     final ResourceLocation overlayTexture, final int tintColor, final Vector3f fogColor, final Properties properties) {
        super(properties);
        
        this.stillTexture = stillTexture;
        this.flowingTexture = flowingTexture;
        this.overlayTexture = overlayTexture;
        this.tintColor = tintColor;
        this.fogColor = fogColor;
    }

    @Override
    public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
        consumer.accept(new IClientFluidTypeExtensions() {
            @Override
            public ResourceLocation getStillTexture() {
                return stillTexture;
            }
            
            @Override
            public ResourceLocation getFlowingTexture() {
                return flowingTexture;
            }

            @Override
            public @Nullable ResourceLocation getOverlayTexture() {
                return overlayTexture;
            }

            @Override
            public int getTintColor() {
                return tintColor;
            }

            @Override
            public @NotNull Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level,
                    int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
                return fogColor;
            }

            @Override
            public void modifyFogRender(Camera camera, FogMode mode, float renderDistance, float partialTick,
                    float nearDistance, float farDistance, FogShape shape) {
                RenderSystem.setShaderFogStart(1f);
                RenderSystem.setShaderFogEnd(6f);
            }
        });
    }
}
