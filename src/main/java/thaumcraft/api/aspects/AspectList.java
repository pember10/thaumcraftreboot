package thaumcraft.api.aspects;

import java.io.Serializable;
import java.util.LinkedHashMap;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;

public class AspectList implements Serializable {
    public LinkedHashMap<Aspect, Integer> aspects = new LinkedHashMap<Aspect, Integer>();

    public int size() {
        return this.aspects.size();
    }

    public int visSize() {
        int q = 0;

        for (Aspect as : this.aspects.keySet()) {
            q += getAmount(as);
        }

        return q;
    }

    public Aspect[] getAspects() {
        Aspect[] q = new Aspect[1];
        return (Aspect[]) this.aspects.keySet().toArray((Object[]) q);
    }

    public Aspect[] getPrimalAspects() {
        AspectList t = new AspectList();
        for (Aspect as : this.aspects.keySet()) {
            if (as.isPrimal()) {
                t.add(as, 1);
            }
        }
        Aspect[] q = new Aspect[1];
        return (Aspect[]) t.aspects.keySet().toArray((Object[]) q);
    }

    public Aspect[] getAspectsSorted() {
        try {
            Aspect[] out = (Aspect[]) this.aspects.keySet().toArray((Object[]) new Aspect[0]);
            boolean change = false;
            while (true) {
                change = false;
                for (int a = 0; a < out.length - 1; a++) {
                    Aspect e1 = out[a];
                    Aspect e2 = out[a + 1];
                    if (e1 != null && e2 != null && e1.getTag().compareTo(e2.getTag()) > 0) {
                        out[a] = e2;
                        out[a + 1] = e1;
                        change = true;
                        break;
                    }
                }
                if (change != true)
                    return out;
            }
        } catch (Exception e) {
            return getAspects();
        }
    }

    public Aspect[] getAspectsSortedAmount() {
        try {
            Aspect[] out = (Aspect[]) this.aspects.keySet().toArray((Object[]) new Aspect[1]);
            boolean change = false;
            while (true) {
                change = false;
                for (int a = 0; a < out.length - 1; a++) {
                    int e1 = getAmount(out[a]);
                    int e2 = getAmount(out[a + 1]);
                    if (e1 > 0 && e2 > 0 && e2 > e1) {
                        Aspect ea = out[a];
                        Aspect eb = out[a + 1];
                        out[a] = eb;
                        out[a + 1] = ea;
                        change = true;
                        break;
                    }
                }
                if (change != true)
                    return out;
            }
        } catch (Exception e) {
            return getAspects();
        }
    }

    public int getAmount(Aspect key) {
        return (this.aspects.get(key) == null) ? 0 : ((Integer) this.aspects.get(key)).intValue();
    }

    public boolean reduce(Aspect key, int amount) {
        if (getAmount(key) >= amount) {
            int am = getAmount(key) - amount;
            this.aspects.put(key, Integer.valueOf(am));
            return true;
        }
        return false;
    }

    public AspectList add(Aspect aspect, int amount) {
        if (this.aspects.containsKey(aspect)) {
            int oldAmount = ((Integer) this.aspects.get(aspect)).intValue();
            amount += oldAmount;
        }
        this.aspects.put(aspect, Integer.valueOf(amount));
        return this;
    }

    public AspectList add(AspectList in) {
        for (Aspect a : in.getAspects())
            add(a, in.getAmount(a));
        return this;
    }

    public AspectList remove(Aspect key, int amount) {
        int am = getAmount(key) - amount;
        if (am <= 0) {
            this.aspects.remove(key);
        } else {
            this.aspects.put(key, Integer.valueOf(am));
        }
        return this;
    }

    public AspectList remove(Aspect key) {
        this.aspects.remove(key);
        return this;
    }

    public AspectList merge(AspectList in) {
        for (Aspect a : in.getAspects())
            merge(a, in.getAmount(a));
        return this;
    }

    public AspectList merge(Aspect aspect, int amount) {
        if (this.aspects.containsKey(aspect)) {
            int oldAmount = ((Integer) this.aspects.get(aspect)).intValue();
            if (amount < oldAmount)
                amount = oldAmount;

        }
        this.aspects.put(aspect, Integer.valueOf(amount));
        return this;
    }

    public void readFromNBT(CompoundTag compoundTag) {
        this.readFromNBT(compoundTag, "Aspects");
    }

    public void readFromNBT(CompoundTag compoundTag, String label) {
        this.aspects.clear();
        var tagList = compoundTag.getList(label, 10);
        for (int i = 0; i < tagList.size(); i++) {
            var rs = tagList.getCompound(i);
            if (rs.get("key") != null)
                add(Aspect.getAspect(rs.getString("key")), rs.getInt("Amount"));
        }
    }

    public void writeToNBT(CompoundTag compoundTag) {
        this.writeToNBT(compoundTag, "Aspects");
    }

    public void writeToNBT(CompoundTag compoundTag, String label) {
        var tagList = new ListTag();
        compoundTag.put(label, compoundTag);
        for (Aspect aspect : getAspects()) {
            if (aspect != null) {
                var f = new CompoundTag();
                f.putString("key", aspect.getTag());
                f.putInt("amount", getAmount(aspect));
                tagList.add((Tag)f);
            }
        }
    }
}
