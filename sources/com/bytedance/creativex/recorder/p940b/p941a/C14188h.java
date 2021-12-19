package com.bytedance.creativex.recorder.p940b.p941a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.creativex.recorder.b.a.h */
public final class C14188h {

    /* renamed from: a */
    public final long f34461a;

    /* renamed from: b */
    public final long f34462b;

    /* renamed from: c */
    public final long f34463c;

    static {
        Covode.recordClassIndex(16257);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14188h)) {
            return false;
        }
        C14188h hVar = (C14188h) obj;
        return this.f34461a == hVar.f34461a && this.f34462b == hVar.f34462b && this.f34463c == hVar.f34463c;
    }

    public final int hashCode() {
        long j = this.f34461a;
        long j2 = this.f34462b;
        long j3 = this.f34463c;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "FirstFrameData(frameTimeMillis=" + this.f34461a + ", effectTimeMillis=" + this.f34462b + ", uiCurrentTimeMillis=" + this.f34463c + ")";
    }

    public C14188h(long j, long j2, long j3) {
        this.f34461a = j;
        this.f34462b = j2;
        this.f34463c = j3;
    }
}
