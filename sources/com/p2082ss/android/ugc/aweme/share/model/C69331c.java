package com.p2082ss.android.ugc.aweme.share.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.silent.EnumC69448c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.model.c */
public final class C69331c {

    /* renamed from: a */
    public final EnumC69448c f154898a;

    /* renamed from: b */
    public String f154899b;

    /* renamed from: c */
    public String f154900c;

    /* renamed from: d */
    public Aweme f154901d;

    static {
        Covode.recordClassIndex(81662);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69331c)) {
            return false;
        }
        C69331c cVar = (C69331c) obj;
        return C89219l.m154714a(this.f154898a, cVar.f154898a) && C89219l.m154714a(this.f154899b, cVar.f154899b) && C89219l.m154714a(this.f154900c, cVar.f154900c) && C89219l.m154714a(this.f154901d, cVar.f154901d);
    }

    public final int hashCode() {
        EnumC69448c cVar = this.f154898a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        String str = this.f154899b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f154900c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Aweme aweme = this.f154901d;
        if (aweme != null) {
            i = aweme.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "SilentShareInfo(silentShareChannel=" + this.f154898a + ", silentShareLink=" + this.f154899b + ", silentShareForm=" + this.f154900c + ", silentShareAweme=" + this.f154901d + ")";
    }

    /* renamed from: a */
    public final void mo109609a(String str) {
        C89219l.m154721d(str, "");
        this.f154899b = str;
    }

    /* renamed from: b */
    public final void mo109610b(String str) {
        C89219l.m154721d(str, "");
        this.f154900c = str;
    }

    public C69331c(EnumC69448c cVar, String str, String str2, Aweme aweme) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(aweme, "");
        this.f154898a = cVar;
        this.f154899b = str;
        this.f154900c = str2;
        this.f154901d = aweme;
    }
}
