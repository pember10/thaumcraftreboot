package thaumcraft.common.utilities;

public class Helpers {
    public static int ToIntColor(int red, int green, int blue, float alpha) {
        var rgbaAsIntString = String.format("0x%02x%02x%02x%02x", red, green, blue, alpha);
        return Integer.parseInt(rgbaAsIntString);
    }
}
