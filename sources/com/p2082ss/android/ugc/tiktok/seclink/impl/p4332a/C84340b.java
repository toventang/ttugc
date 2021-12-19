package com.p2082ss.android.ugc.tiktok.seclink.impl.p4332a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tiktok.seclink.impl.a.b */
public final class C84340b {
    @AbstractC27891c(mo46611a = "pattern")

    /* renamed from: a */
    public String f188576a;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: b */
    public int f188577b;

    static {
        Covode.recordClassIndex(98291);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84340b)) {
            return false;
        }
        C84340b bVar = (C84340b) obj;
        return C89219l.m154714a(this.f188576a, bVar.f188576a) && this.f188577b == bVar.f188577b;
    }

    public final int hashCode() {
        String str = this.f188576a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f188577b;
    }

    public final String toString() {
        return "SecLinkConfigItem(pattern=" + this.f188576a + ", type=" + this.f188577b + ")";
    }

    private /* synthetic */ C84340b() {
        this("");
    }

    private C84340b(String str) {
        C89219l.m154721d(str, "");
        this.f188576a = str;
        this.f188577b = -1;
    }
}
