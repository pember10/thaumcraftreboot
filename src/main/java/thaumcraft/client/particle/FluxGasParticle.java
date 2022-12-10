package thaumcraft.client.particle;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.RisingParticle;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FluxGasParticle extends RisingParticle {    

    private static ClientLevel CLIENT_LEVEL = Minecraft.getInstance().level;

    protected FluxGasParticle(double xo, double yo, double zo,
            double xd, double yd, double zd) {
        super(CLIENT_LEVEL, xo, yo, zo, xd, yd, zd);
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    @Override
    public float getQuadSize(float s) {
        float size = ((float)this.age + s) / (float)this.lifetime;
        return this.quadSize * (1.0F - size * size * 0.5F);
    }

    @Override
    protected int getLightColor(float c) {
        float f = ((float)this.age + c) / (float)this.lifetime;
        f = Mth.clamp(f, 0.0F, 1.0F);
        int i = super.getLightColor(c);
        int j = i & 255;
        int k = i >> 16 & 255;
        j += (int)(f * 15.0F * 16.0F);
        if (j > 240) {
            j = 240;
        }

        return j | k << 16;
    }

    @Override
    public void move(double x, double y, double z) {
        this.setBoundingBox(this.getBoundingBox().move(x, y, z));
        this.setLocationFromBoundingbox();
    }

    
    
}
