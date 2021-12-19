package com.google.android.gms.common.util;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.util.g */
public final class C25605g implements AbstractC25603e {

    /* renamed from: a */
    public static final C25605g f60716a = new C25605g();

    private C25605g() {
    }

    @Override // com.google.android.gms.common.util.AbstractC25603e
    /* renamed from: a */
    public final long mo41857a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.AbstractC25603e
    /* renamed from: b */
    public final long mo41858b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.AbstractC25603e
    /* renamed from: c */
    public final long mo41859c() {
        return System.nanoTime();
    }

    static {
        Covode.recordClassIndex(31015);
    }
}
