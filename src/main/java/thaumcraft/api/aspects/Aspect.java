package thaumcraft.api.aspects;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import net.minecraft.resources.ResourceLocation;
//net.minecraft.client.resources.I18n

public class Aspect {
    String tag;
    Aspect[] components;
    int color;
    private String chatColor;
    ResourceLocation image;
    int blend;

    public Aspect(String tag, Aspect[] components, int color, ResourceLocation image, int blend) {
        if (aspectsList.containsKey(tag))
            throw new IllegalArgumentException(tag + " already registered!"); 

        this.tag = tag;
        this.components = components;
        this.color = color;
        this.image = image;
        this.blend = blend;
    }

    public Aspect(String tag, Aspect[] components, int color) {
        this(tag, components, color, new ResourceLocation("thaumcraft", "textures/aspects/" + tag.toLowerCase() + ".png"), 1);
    }

    public Aspect(String tag, Aspect[] components, int color, int blend) {
        this(tag, components, color, new ResourceLocation("thaumcraft", "textures/aspects/" + tag.toLowerCase() + ".png"), blend);
    }

    public Aspect(String tag, int color, String chatColor, int blend) {
        this(tag, (Aspect[])null, color, blend);
    }

    public int getColor() {
        return this.color;
    }

    public String getName() {
        return org.apache.commons.lang3.text.WordUtils.capitalizeFully(this.tag);
    }

    public String getLocalizedDescription() {
        return "tc.aspect" + this.tag;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Aspect[] getComponents() {
        return this.components;
    }

    public void setComponents(Aspect[] components) {
        this.components = components;
    }

    public ResourceLocation getImage() {
        return this.image;
    }

    public static Aspect getAspect(String tag) {
        return aspectsList.get(tag);
    }

    public int getBlend() {
        return this.blend;
    }

    public void setBlend(int blend) {
        this.blend = blend;
    }

    public boolean isPrimal() {
        var comps = getComponents();
        return (comps == null || comps.length != 2);
    }

    public static ArrayList<Aspect> getPrimalAspects() {
        var result = new ArrayList<Aspect>();
        var pa = aspectsList.values();
        for (var aspect : pa) {
            if (aspect.isPrimal())
                result.add(aspect);
        }
        return result;
    }

    public static ArrayList<Aspect> getCompoundAspects() {
        var result = new ArrayList<Aspect>();
        var pa = aspectsList.values();
        for (var aspect : pa) {
            if (!aspect.isPrimal())
                result.add(aspect);
        }
        return result;
    }

    public String getChatColor() {
        return this.chatColor;
    }

    public void setChatColor(String chatColor) {
        this.chatColor = chatColor;
    }

    public static LinkedHashMap<String, Aspect> aspectsList = new LinkedHashMap<String, Aspect>();

    public static final Aspect AIR = new Aspect("aer", 16777086, "e", 1);
    public static final Aspect EARTH = new Aspect("terra", 5685248, "2", 1);
    public static final Aspect FIRE = new Aspect("ignis", 16734721, "c", 1);
    public static final Aspect WATER = new Aspect("aqua", 3986684, "3", 1);
    public static final Aspect ORDER = new Aspect("ordo", 14013676, "7", 1);
    public static final Aspect ENTROPY = new Aspect("perditio", 4210752, "8", 771);

    public static final Aspect VOID = new Aspect("vacuos", new Aspect[] { AIR, ENTROPY }, 8947848, 771);
    public static final Aspect LIGHT = new Aspect("lux", new Aspect[] { AIR, FIRE }, 16774755);
    public static final Aspect WEATHER = new Aspect("tempestas", new Aspect[] { AIR, WATER }, 16777215);
    public static final Aspect MOTION = new Aspect("motus", new Aspect[] { AIR, ORDER }, 13487348);
    public static final Aspect COLD = new Aspect("gelum", new Aspect[] { FIRE, ENTROPY }, 14811135);
    public static final Aspect CRYSTAL = new Aspect("vitreus", new Aspect[] { EARTH, ORDER }, 8454143);
    public static final Aspect LIFE = new Aspect("victus", new Aspect[] { WATER, EARTH }, 14548997);
    public static final Aspect POISON = new Aspect("venenum", new Aspect[] { WATER, ENTROPY }, 9039872);
    public static final Aspect ENERGY = new Aspect("potentia", new Aspect[] { ORDER, FIRE }, 12648447);
    public static final Aspect EXCHANGE = new Aspect("permutatio", new Aspect[] { ENTROPY, ORDER }, 5735255);

    public static final Aspect METAL = new Aspect("metallum", new Aspect[] { EARTH, CRYSTAL }, 11908557);
    public static final Aspect DEATH = new Aspect("mortuus", new Aspect[] { LIFE, ENTROPY }, 8943496);
    public static final Aspect FLIGHT = new Aspect("volatus", new Aspect[] { AIR, MOTION }, 15198167);
    public static final Aspect DARKNESS = new Aspect("tenebrae", new Aspect[] { VOID, LIGHT }, 2236962);
    public static final Aspect SOUL = new Aspect("spiritus", new Aspect[] { LIFE, DEATH }, 15461371);
    public static final Aspect HEAL = new Aspect("sano", new Aspect[] { LIFE, ORDER }, 16723764);
    public static final Aspect TRAVEL = new Aspect("iter", new Aspect[] { MOTION, EARTH }, 14702683);
    public static final Aspect ELDRITCH = new Aspect("alienis", new Aspect[] { VOID, DARKNESS }, 8409216);
    public static final Aspect MAGIC = new Aspect("praecantatio", new Aspect[] { VOID, ENERGY }, 9896128);
    public static final Aspect AURA = new Aspect("auram", new Aspect[] { MAGIC, AIR }, 16761087);
    public static final Aspect TAINT = new Aspect("vitium", new Aspect[] { MAGIC, ENTROPY }, 8388736);
    public static final Aspect SLIME = new Aspect("limus", new Aspect[] { LIFE, WATER }, 129024);
    public static final Aspect PLANT = new Aspect("herba", new Aspect[] { LIFE, EARTH }, 109568);
    public static final Aspect TREE = new Aspect("arbor", new Aspect[] { AIR, PLANT }, 8873265);
    public static final Aspect BEAST = new Aspect("bestia", new Aspect[] { MOTION, LIFE }, 10445833);
    public static final Aspect FLESH = new Aspect("corpus", new Aspect[] { DEATH, BEAST }, 15615885);
    public static final Aspect UNDEAD = new Aspect("exanimis", new Aspect[] { MOTION, DEATH }, 3817472);
    public static final Aspect MIND = new Aspect("cognitio", new Aspect[] { FIRE, SOUL }, 16761523);
    public static final Aspect SENSES = new Aspect("sensus", new Aspect[] { AIR, SOUL }, 1038847);
    public static final Aspect MAN = new Aspect("humanus", new Aspect[] { BEAST, MIND }, 16766912);
    public static final Aspect CROP = new Aspect("messis", new Aspect[] { PLANT, MAN }, 14791537);
    public static final Aspect MINE = new Aspect("perfodio", new Aspect[] { MAN, EARTH }, 14471896);
    public static final Aspect TOOL = new Aspect("instrumentum", new Aspect[] { MAN, ORDER }, 4210926);
    public static final Aspect HARVEST = new Aspect("meto", new Aspect[] { CROP, TOOL }, 15641986);
    public static final Aspect WEAPON = new Aspect("telum", new Aspect[] { TOOL, FIRE }, 12603472);
    public static final Aspect ARMOR = new Aspect("tutamen", new Aspect[] { TOOL, EARTH }, 49344);
    public static final Aspect HUNGER = new Aspect("fames", new Aspect[] { LIFE, VOID }, 10093317);
    public static final Aspect GREED = new Aspect("lucrum", new Aspect[] { MAN, HUNGER }, 15121988);
    public static final Aspect CRAFT = new Aspect("fabrico", new Aspect[] { MAN, TOOL }, 8428928);
    public static final Aspect CLOTH = new Aspect("pannus", new Aspect[] { TOOL, BEAST }, 15395522);
    public static final Aspect MECHANISM = new Aspect("machina", new Aspect[] { MOTION, TOOL }, 8421536);
    public static final Aspect TRAP = new Aspect("vinculum", new Aspect[] { MOTION, ENTROPY }, 10125440);
}
