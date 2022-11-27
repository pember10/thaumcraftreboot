package thaumcraft.common.lib.research;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import thaumcraft.api.aspects.AspectList;

public class PlayerKnowledge {
    public Map<String, ArrayList<String>> researchCompleted = new HashMap<String, ArrayList<String>>();
    public Map<String, AspectList> aspectsDiscovered = new HashMap<String, AspectList>();
    public Map<String, ArrayList<String>> objectsScanned = new HashMap<String, ArrayList<String>>();
    public Map<String, ArrayList<String>> entitiesScanned = new HashMap<String, ArrayList<String>>();
    public Map<String, ArrayList<String>> phenomenaScanned = new HashMap<String, ArrayList<String>>();
    public Map<String, Integer> warpCount = new HashMap<String, Integer>();
    public Map<String, Integer> warp = new HashMap<String, Integer>();
    public Map<String, Integer> warpSticky = new HashMap<String, Integer>();
    public Map<String, Integer> warpTemp = new HashMap<String, Integer>();

    public void wipePlayerKnowledge(String player) {
        this.researchCompleted.remove(player);
        this.aspectsDiscovered.remove(player);
        this.objectsScanned.remove(player);
        this.entitiesScanned.remove(player);
        this.phenomenaScanned.remove(player);

        this.warp.remove(player);
        this.warpTemp.remove(player);
        this.warpSticky.remove(player);
    }

    // public AspectList getAspectsDiscovered(String player) {
    //     AspectList known = this.aspectsDiscovered.get(player);
    //     if (known == null || known.size() <= 6) {
    //         addDiscoveredPrimalAspects(player);
    //         known = this.aspectsDiscovered.get(player);
    //     }
    //     return known;
    // }
}
