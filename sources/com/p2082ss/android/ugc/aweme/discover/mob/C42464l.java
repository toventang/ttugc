package com.p2082ss.android.ugc.aweme.discover.mob;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.l */
public final class C42464l {

    /* renamed from: a */
    public final String f98987a;

    /* renamed from: b */
    public final String f98988b;

    /* renamed from: c */
    public final String f98989c;

    /* renamed from: d */
    public final boolean f98990d;

    static {
        Covode.recordClassIndex(50413);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42464l)) {
            return false;
        }
        C42464l lVar = (C42464l) obj;
        return C89219l.m154714a(this.f98987a, lVar.f98987a) && C89219l.m154714a(this.f98988b, lVar.f98988b) && C89219l.m154714a(this.f98989c, lVar.f98989c) && this.f98990d == lVar.f98990d;
    }

    public final int hashCode() {
        String str = this.f98987a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f98988b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f98989c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f98990d;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "SearchMusicParams(event=" + this.f98987a + ", enterFrom=" + this.f98988b + ", musicId=" + this.f98989c + ", fromSearchResult=" + this.f98990d + ")";
    }

    public C42464l(String str, String str2, String str3, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f98987a = str;
        this.f98988b = str2;
        this.f98989c = str3;
        this.f98990d = z;
    }
}
