package com.google.android.gms.common.stats;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    static {
        Covode.recordClassIndex(30995);
    }

    /* renamed from: a */
    public abstract long mo41844a();

    /* renamed from: b */
    public abstract int mo41845b();

    /* renamed from: c */
    public abstract long mo41846c();

    /* renamed from: d */
    public abstract String mo41847d();

    public String toString() {
        long a = mo41844a();
        int b = mo41845b();
        long c = mo41846c();
        String d = mo41847d();
        return new StringBuilder(String.valueOf(d).length() + 53).append(a).append("\t").append(b).append("\t").append(c).append(d).toString();
    }
}
