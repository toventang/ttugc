package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.e */
public final class C39244e {

    /* renamed from: a */
    public boolean f92687a;

    /* renamed from: b */
    public String f92688b;

    /* renamed from: c */
    public Strategy f92689c;

    /* renamed from: d */
    public String f92690d;

    /* renamed from: e */
    public Set<String> f92691e;

    /* renamed from: f */
    public Set<String> f92692f;

    /* renamed from: g */
    public Set<String> f92693g;

    /* renamed from: h */
    public Set<String> f92694h;

    /* renamed from: i */
    public Set<String> f92695i;

    static {
        Covode.recordClassIndex(46902);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39244e)) {
            return false;
        }
        C39244e eVar = (C39244e) obj;
        return this.f92687a == eVar.f92687a && C89219l.m154714a(this.f92688b, eVar.f92688b) && C89219l.m154714a(this.f92689c, eVar.f92689c) && C89219l.m154714a(this.f92690d, eVar.f92690d) && C89219l.m154714a(this.f92691e, eVar.f92691e) && C89219l.m154714a(this.f92692f, eVar.f92692f) && C89219l.m154714a(this.f92693g, eVar.f92693g) && C89219l.m154714a(this.f92694h, eVar.f92694h) && C89219l.m154714a(this.f92695i, eVar.f92695i);
    }

    public final int hashCode() {
        boolean z = this.f92687a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f92688b;
        int i5 = 0;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        Strategy strategy = this.f92689c;
        int hashCode2 = (hashCode + (strategy != null ? strategy.hashCode() : 0)) * 31;
        String str2 = this.f92690d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set<String> set = this.f92691e;
        int hashCode4 = (hashCode3 + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.f92692f;
        int hashCode5 = (hashCode4 + (set2 != null ? set2.hashCode() : 0)) * 31;
        Set<String> set3 = this.f92693g;
        int hashCode6 = (hashCode5 + (set3 != null ? set3.hashCode() : 0)) * 31;
        Set<String> set4 = this.f92694h;
        int hashCode7 = (hashCode6 + (set4 != null ? set4.hashCode() : 0)) * 31;
        Set<String> set5 = this.f92695i;
        if (set5 != null) {
            i5 = set5.hashCode();
        }
        return hashCode7 + i5;
    }

    public final String toString() {
        return "InterceptResult(flag=" + this.f92687a + ", domain=" + this.f92688b + ", strategy=" + this.f92689c + ", interceptedUrl=" + this.f92690d + ", headerParams=" + this.f92691e + ", urlParams=" + this.f92692f + ", bodyParams=" + this.f92693g + ", replaceParams=" + this.f92694h + ", ruleNames=" + this.f92695i + ")";
    }

    private C39244e(boolean z, String str, Set<String> set, Set<String> set2, Set<String> set3, Set<String> set4, Set<String> set5) {
        C89219l.m154721d(set, "");
        C89219l.m154721d(set2, "");
        C89219l.m154721d(set3, "");
        C89219l.m154721d(set4, "");
        C89219l.m154721d(set5, "");
        this.f92687a = z;
        this.f92688b = null;
        this.f92689c = null;
        this.f92690d = str;
        this.f92691e = set;
        this.f92692f = set2;
        this.f92693g = set3;
        this.f92694h = set4;
        this.f92695i = set5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39244e(boolean z, String str, Set set, Set set2, Set set3, Set set4, Set set5, int i) {
        this(z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? new LinkedHashSet() : set, (i & 32) != 0 ? new LinkedHashSet() : set2, (i & 64) != 0 ? new LinkedHashSet() : set3, (i & 128) != 0 ? new LinkedHashSet() : set4, (i & 256) != 0 ? new LinkedHashSet() : set5);
    }
}
