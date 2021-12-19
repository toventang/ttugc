package com.bytedance.android.live.p253j;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.j.c */
public final class C4370c {

    /* renamed from: a */
    public final long f11888a;

    /* renamed from: b */
    public final boolean f11889b;

    static {
        Covode.recordClassIndex(4944);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4370c)) {
            return false;
        }
        C4370c cVar = (C4370c) obj;
        return this.f11888a == cVar.f11888a && this.f11889b == cVar.f11889b;
    }

    public final String toString() {
        return "MicRoomJumpEvent(roomId=" + this.f11888a + ", autoJump=" + this.f11889b + ")";
    }

    public final int hashCode() {
        long j = this.f11888a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.f11889b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return i + i2;
    }

    public C4370c(long j, boolean z) {
        this.f11888a = j;
        this.f11889b = z;
    }
}
