package com.bytedance.android.livesdk.p425aa.p428c;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.aa.c.m */
public final class C6535m {

    /* renamed from: a */
    public final int f16324a;

    /* renamed from: b */
    public final int f16325b;

    static {
        Covode.recordClassIndex(7271);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6535m)) {
            return false;
        }
        C6535m mVar = (C6535m) obj;
        return this.f16324a == mVar.f16324a && this.f16325b == mVar.f16325b;
    }

    public final int hashCode() {
        return (this.f16324a * 31) + this.f16325b;
    }

    public final String toString() {
        return "RoomPositionContextLog(roomPosition=" + this.f16324a + ", isFromDrawReq=" + this.f16325b + ")";
    }

    private /* synthetic */ C6535m() {
        this(-1, -1);
    }

    public C6535m(int i, int i2) {
        this.f16324a = i;
        this.f16325b = i2;
    }
}
