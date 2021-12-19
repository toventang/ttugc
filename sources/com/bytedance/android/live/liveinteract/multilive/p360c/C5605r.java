package com.bytedance.android.live.liveinteract.multilive.p360c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.c.r */
public final class C5605r {

    /* renamed from: a */
    public final String f14247a;

    /* renamed from: b */
    public final boolean f14248b;

    static {
        Covode.recordClassIndex(6202);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5605r)) {
            return false;
        }
        C5605r rVar = (C5605r) obj;
        return C89219l.m154714a(this.f14247a, rVar.f14247a) && this.f14248b == rVar.f14248b;
    }

    public final int hashCode() {
        String str = this.f14247a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f14248b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "MultiLiveVideoStatus(interactId=" + this.f14247a + ", mute=" + this.f14248b + ")";
    }

    public C5605r(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f14247a = str;
        this.f14248b = z;
    }
}
