package com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.a.c */
public final class C68345c {
    @AbstractC27891c(mo46611a = "is_show")

    /* renamed from: a */
    public final boolean f152933a;
    @AbstractC27891c(mo46611a = "h5_url")

    /* renamed from: b */
    public final String f152934b;

    static {
        Covode.recordClassIndex(80570);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68345c)) {
            return false;
        }
        C68345c cVar = (C68345c) obj;
        return this.f152933a == cVar.f152933a && C89219l.m154714a(this.f152934b, cVar.f152934b);
    }

    public final int hashCode() {
        boolean z = this.f152933a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f152934b;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "JoinBetaEntrance(show=" + this.f152933a + ", url=" + this.f152934b + ")";
    }
}
