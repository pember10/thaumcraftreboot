package thaumcraft.api;

import thaumcraft.api.internal.DummyInternalMethodHandler;
import thaumcraft.api.internal.IInternalMethodHandler;

public class ThaumcraftApi {
    public static IInternalMethodHandler internalMethods = (IInternalMethodHandler)new DummyInternalMethodHandler();
}
