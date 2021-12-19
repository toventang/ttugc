package com.p2082ss.android.ugc.aweme.kids.p3302a.p3307e;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.a.e.a */
public final class C57107a {

    /* renamed from: a */
    public final String f130019a;

    /* renamed from: b */
    public final String f130020b;

    static {
        Covode.recordClassIndex(67001);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57107a)) {
            return false;
        }
        C57107a aVar = (C57107a) obj;
        return C89219l.m154714a(this.f130019a, aVar.f130019a) && C89219l.m154714a(this.f130020b, aVar.f130020b);
    }

    public final int hashCode() {
        String str = this.f130019a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f130020b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MusicCategory(categoryName=" + this.f130019a + ", categoryId=" + this.f130020b + ")";
    }

    private /* synthetic */ C57107a() {
        this("", "");
    }

    private C57107a(String str, String str2) {
        this.f130019a = str;
        this.f130020b = str2;
    }
}
