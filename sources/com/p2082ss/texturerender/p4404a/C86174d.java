package com.p2082ss.texturerender.p4404a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.texturerender.C86203l;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.texturerender.a.d */
public class C86174d {

    /* renamed from: a */
    public boolean f192198a;

    /* renamed from: b */
    public boolean f192199b;

    /* renamed from: c */
    public HashMap<Integer, Integer> f192200c = new HashMap<>();

    static {
        Covode.recordClassIndex(101317);
    }

    public String toString() {
        return "Config:[opengSR:" + this.f192198a + " opengSharpen:" + this.f192199b + " config:" + this.f192200c.toString() + "]";
    }

    /* renamed from: a */
    public final boolean mo136482a() {
        for (Map.Entry<Integer, Integer> entry : this.f192200c.entrySet()) {
            if (!(entry.getKey().intValue() == 1 || entry.getKey().intValue() == 5)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C86174d mo136481a(boolean z) {
        this.f192198a = z;
        this.f192200c.put(5, Integer.valueOf(z ? 1 : 0));
        return this;
    }

    /* renamed from: a */
    public final boolean mo136483a(int i) {
        Integer num = this.f192200c.get(Integer.valueOf(i));
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo136484a(C86174d dVar) {
        boolean z = dVar.f192198a;
        if (z && !this.f192198a) {
            return false;
        }
        if (dVar.f192199b) {
            if (!this.f192199b) {
                return false;
            }
            return true;
        } else if (z) {
            return true;
        } else {
            if (this.f192198a || this.f192199b) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public final C86174d mo136480a(int i, int i2) {
        boolean z;
        C86203l.m148116a("EffectConfig", "setEffectOpen effect:" + i + ",isOpen:" + i2);
        boolean z2 = false;
        if (i == 1) {
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f192199b = z;
        } else if (i == 5) {
            if (i2 == 1) {
                z2 = true;
            }
            this.f192198a = z2;
        }
        this.f192200c.put(Integer.valueOf(i), Integer.valueOf(i2));
        return this;
    }
}
