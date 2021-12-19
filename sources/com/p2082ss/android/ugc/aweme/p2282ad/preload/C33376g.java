package com.p2082ss.android.ugc.aweme.p2282ad.preload;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.preload.g */
public final class C33376g {

    /* renamed from: a */
    public final String f79318a;

    /* renamed from: b */
    public final long f79319b;

    static {
        Covode.recordClassIndex(40222);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33376g)) {
            return false;
        }
        C33376g gVar = (C33376g) obj;
        return C89219l.m154714a(this.f79318a, gVar.f79318a) && this.f79319b == gVar.f79319b;
    }

    public final int hashCode() {
        String str = this.f79318a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f79319b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "PreloadAdWebStateMsg(channel=" + this.f79318a + ", clickTime=" + this.f79319b + ")";
    }

    public C33376g(String str, long j) {
        this.f79318a = str;
        this.f79319b = j;
    }
}
