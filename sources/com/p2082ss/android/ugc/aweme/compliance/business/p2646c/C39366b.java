package com.p2082ss.android.ugc.aweme.compliance.business.p2646c;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.c.b */
public final class C39366b {

    /* renamed from: a */
    public boolean f92922a;

    /* renamed from: b */
    public String f92923b;

    /* renamed from: c */
    public String f92924c;

    /* renamed from: d */
    public String f92925d;

    /* renamed from: e */
    public Set<String> f92926e;

    /* renamed from: f */
    public Set<String> f92927f;

    /* renamed from: g */
    public Set<String> f92928g;

    /* renamed from: h */
    public Set<String> f92929h;

    /* renamed from: i */
    public Set<String> f92930i;

    /* renamed from: j */
    public Set<String> f92931j;

    static {
        Covode.recordClassIndex(47050);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39366b)) {
            return false;
        }
        C39366b bVar = (C39366b) obj;
        return this.f92922a == bVar.f92922a && C89219l.m154714a(this.f92923b, bVar.f92923b) && C89219l.m154714a(this.f92924c, bVar.f92924c) && C89219l.m154714a(this.f92925d, bVar.f92925d) && C89219l.m154714a(this.f92926e, bVar.f92926e) && C89219l.m154714a(this.f92927f, bVar.f92927f) && C89219l.m154714a(this.f92928g, bVar.f92928g) && C89219l.m154714a(this.f92929h, bVar.f92929h) && C89219l.m154714a(this.f92930i, bVar.f92930i) && C89219l.m154714a(this.f92931j, bVar.f92931j);
    }

    public final int hashCode() {
        boolean z = this.f92922a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f92923b;
        int i5 = 0;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f92924c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f92925d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Set<String> set = this.f92926e;
        int hashCode4 = (hashCode3 + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.f92927f;
        int hashCode5 = (hashCode4 + (set2 != null ? set2.hashCode() : 0)) * 31;
        Set<String> set3 = this.f92928g;
        int hashCode6 = (hashCode5 + (set3 != null ? set3.hashCode() : 0)) * 31;
        Set<String> set4 = this.f92929h;
        int hashCode7 = (hashCode6 + (set4 != null ? set4.hashCode() : 0)) * 31;
        Set<String> set5 = this.f92930i;
        int hashCode8 = (hashCode7 + (set5 != null ? set5.hashCode() : 0)) * 31;
        Set<String> set6 = this.f92931j;
        if (set6 != null) {
            i5 = set6.hashCode();
        }
        return hashCode8 + i5;
    }

    public final String toString() {
        return "HeaderParamInterceptResult(flag=" + this.f92922a + ", netType=" + this.f92923b + ", url=" + this.f92924c + ", interceptedUrl=" + this.f92925d + ", headerKeys=" + this.f92926e + ", interceptedHeaderKeys=" + this.f92927f + ", cookieKeys=" + this.f92928g + ", interceptedCookieKeys=" + this.f92929h + ", urlQueryKeys=" + this.f92930i + ", interceptedUrlQueryKeys=" + this.f92931j + ")";
    }

    public /* synthetic */ C39366b(String str, String str2) {
        this(false, str, str2, new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet(), new LinkedHashSet());
    }

    public C39366b(boolean z, String str, String str2, Set<String> set, Set<String> set2, Set<String> set3, Set<String> set4, Set<String> set5, Set<String> set6) {
        C89219l.m154721d(set, "");
        C89219l.m154721d(set2, "");
        C89219l.m154721d(set3, "");
        C89219l.m154721d(set4, "");
        C89219l.m154721d(set5, "");
        C89219l.m154721d(set6, "");
        this.f92922a = z;
        this.f92923b = str;
        this.f92924c = str2;
        this.f92925d = null;
        this.f92926e = set;
        this.f92927f = set2;
        this.f92928g = set3;
        this.f92929h = set4;
        this.f92930i = set5;
        this.f92931j = set6;
    }
}
