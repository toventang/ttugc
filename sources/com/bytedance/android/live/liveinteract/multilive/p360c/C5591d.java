package com.bytedance.android.live.liveinteract.multilive.p360c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.c.d */
public final class C5591d {

    /* renamed from: a */
    public final String f14232a;

    /* renamed from: b */
    public final boolean f14233b;

    static {
        Covode.recordClassIndex(6188);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5591d)) {
            return false;
        }
        C5591d dVar = (C5591d) obj;
        return C89219l.m154714a(this.f14232a, dVar.f14232a) && this.f14233b == dVar.f14233b;
    }

    public final int hashCode() {
        String str = this.f14232a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f14233b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "MultiLiveAudioStatus(interactId=" + this.f14232a + ", mute=" + this.f14233b + ")";
    }

    public C5591d(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f14232a = str;
        this.f14233b = z;
    }
}
