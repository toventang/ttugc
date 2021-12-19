package com.bytedance.android.live.broadcast.p192c.p193a;

import android.os.SystemClock;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.c.a.e */
public class C3197e extends C3866a {

    /* renamed from: a */
    public long f9218a;

    /* renamed from: b */
    public long f9219b;

    static {
        Covode.recordClassIndex(3678);
    }

    /* renamed from: a */
    public void mo8548a() {
    }

    /* renamed from: a */
    public void mo8549a(int i, String str) {
    }

    /* renamed from: b */
    public void mo8550b() {
    }

    /* renamed from: b */
    public void mo8551b(int i, String str) {
    }

    /* renamed from: c */
    public final long mo8552c() {
        long j;
        if (this.f9218a > 0) {
            j = SystemClock.uptimeMillis() - this.f9218a;
        } else {
            j = 0;
        }
        this.f9218a = 0;
        return j;
    }

    /* renamed from: d */
    public final long mo8553d() {
        long j;
        if (this.f9219b > 0) {
            j = SystemClock.uptimeMillis() - this.f9219b;
        } else {
            j = 0;
        }
        this.f9219b = 0;
        return j;
    }
}
