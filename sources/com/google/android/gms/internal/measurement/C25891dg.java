package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.dg */
public final class C25891dg {
    static {
        Covode.recordClassIndex(31306);
    }

    /* renamed from: a */
    static int m50109a(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return m50108a(hashCode);
    }

    /* renamed from: a */
    static int m50108a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }
}
