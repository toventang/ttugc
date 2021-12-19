package com.p2082ss.android.ugc.aweme.filter.repository.internal;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50695c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a */
public final class C50710a {

    /* renamed from: a */
    public final C50695c f117057a;

    /* renamed from: b */
    public final boolean f117058b;

    static {
        Covode.recordClassIndex(59872);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50710a)) {
            return false;
        }
        C50710a aVar = (C50710a) obj;
        return C89219l.m154714a(this.f117057a, aVar.f117057a) && this.f117058b == aVar.f117058b;
    }

    public final int hashCode() {
        C50695c cVar = this.f117057a;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        boolean z = this.f117058b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "FilterDataResponse(data=" + this.f117057a + ", brokenData=" + this.f117058b + ")";
    }

    public /* synthetic */ C50710a(C50695c cVar) {
        this(cVar, false);
    }

    public C50710a(C50695c cVar, boolean z) {
        C89219l.m154721d(cVar, "");
        this.f117057a = cVar;
        this.f117058b = z;
    }
}
