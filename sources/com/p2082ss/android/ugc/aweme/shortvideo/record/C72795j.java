package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.j */
public final class C72795j {

    /* renamed from: a */
    public final int f163234a = 7;

    /* renamed from: b */
    public final int f163235b = 30;

    static {
        Covode.recordClassIndex(85481);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72795j)) {
            return false;
        }
        C72795j jVar = (C72795j) obj;
        return this.f163234a == jVar.f163234a && this.f163235b == jVar.f163235b;
    }

    public final int hashCode() {
        return (this.f163234a * 31) + this.f163235b;
    }

    public final String toString() {
        return "CameraFpsRange(min=" + this.f163234a + ", max=" + this.f163235b + ")";
    }
}
