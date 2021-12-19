package com.p2082ss.android.ttve.common;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ttve.common.f */
public final class C30646f {

    /* renamed from: a */
    public int f73266a = 720;

    /* renamed from: b */
    public int f73267b = 1280;

    static {
        Covode.recordClassIndex(37188);
    }

    public C30646f() {
    }

    public final int hashCode() {
        return (this.f73266a * 65537) + 1 + this.f73267b;
    }

    public final String toString() {
        return this.f73266a + "x" + this.f73267b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C30646f)) {
            return false;
        }
        C30646f fVar = (C30646f) obj;
        if (this.f73266a == fVar.f73266a && this.f73267b == fVar.f73267b) {
            return true;
        }
        return false;
    }

    public C30646f(int i, int i2) {
        this.f73266a = i;
        this.f73267b = i2;
    }
}
