package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.eg */
public final class C25918eg {
    static {
        Covode.recordClassIndex(31333);
    }

    /* renamed from: a */
    static int m50161a(Set<?> set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 = ((i2 + i) ^ -1) ^ -1;
        }
        return i2;
    }

    /* renamed from: a */
    static boolean m50162a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
