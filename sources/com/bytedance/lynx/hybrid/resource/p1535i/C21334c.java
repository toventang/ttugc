package com.bytedance.lynx.hybrid.resource.p1535i;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.lynx.hybrid.resource.i.c */
public final class C21334c {

    /* renamed from: a */
    private final long f50656a;

    /* renamed from: b */
    private long f50657b;

    /* renamed from: c */
    private long f50658c;

    static {
        Covode.recordClassIndex(24952);
    }

    public C21334c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f50656a = uptimeMillis;
        this.f50657b = uptimeMillis;
        this.f50658c = uptimeMillis;
    }

    /* renamed from: a */
    public final long mo34935a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f50657b = uptimeMillis;
        long j = uptimeMillis - this.f50658c;
        this.f50658c = uptimeMillis;
        return j;
    }
}
