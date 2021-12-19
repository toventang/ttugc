package com.bytedance.ies.bullet.kit.p1148a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.bullet.kit.a.p */
public final class C16365p {

    /* renamed from: a */
    private final long f39354a;

    /* renamed from: b */
    private long f39355b;

    /* renamed from: c */
    private long f39356c;

    static {
        Covode.recordClassIndex(18658);
    }

    /* renamed from: b */
    public final long mo25950b() {
        return SystemClock.uptimeMillis() - this.f39354a;
    }

    public C16365p() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f39354a = uptimeMillis;
        this.f39355b = uptimeMillis;
        this.f39356c = uptimeMillis;
    }

    /* renamed from: a */
    public final long mo25949a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f39355b = uptimeMillis;
        long j = uptimeMillis - this.f39356c;
        this.f39356c = uptimeMillis;
        return j;
    }
}
