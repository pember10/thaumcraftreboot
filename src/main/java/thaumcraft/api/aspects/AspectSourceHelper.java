package thaumcraft.api.aspects;

import java.lang.reflect.Method;

import net.minecraft.client.renderer.FaceInfo;
import net.minecraft.world.entity.Entity;
import thaumcraft.Thaumcraft;

public class AspectSourceHelper {
    static Method drainEssentia;
    static Method findEssentia;

    public static boolean drainEssentia(Entity entity, Aspect aspect, FaceInfo direction, int range) {
        try {
            if (drainEssentia == null) {
                Class<?> fake = Class.forName("thaumcraft.common.lib.events.EssentiaHandler");
                drainEssentia = fake.getMethod("drainEssentia", new Class[] { Entity.class, Aspect.class, FaceInfo.class, int.class });
            }
            return ((Boolean)drainEssentia.invoke(null, new Object[] { entity, aspect, direction, Integer.valueOf(range) })).booleanValue();
        }
        catch (Exception ex) {
            Thaumcraft.LOGGER.error("[Thaumcraft API] Could not invoke thaumcraft.common.lib.events.EssentiaHandler method drainEssentia", ex);
            return false;
        }
    }

    public static boolean findEssentia(Entity entity, Aspect aspect, FaceInfo direction, int range) {
        try {
            if (drainEssentia == null) {
                Class<?> fake = Class.forName("thaumcraft.common.lib.events.EssentiaHandler");
                drainEssentia = fake.getMethod("findEssentia", new Class[] { Entity.class, Aspect.class, FaceInfo.class, int.class });
            }
            return ((Boolean)drainEssentia.invoke(null, new Object[] { entity, aspect, direction, Integer.valueOf(range) })).booleanValue();
        }
        catch (Exception ex) {
            Thaumcraft.LOGGER.error("[Thaumcraft API] Could not invoke thaumcraft.common.lib.events.EssentiaHandler method findEssentia", ex);
            return false;
        }
    }
}
