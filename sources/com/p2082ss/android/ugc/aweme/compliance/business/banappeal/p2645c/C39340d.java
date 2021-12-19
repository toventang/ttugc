package com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2645c;

import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.c.d */
public final class C39340d {

    /* renamed from: a */
    public final String f92866a;

    /* renamed from: b */
    public final String f92867b;

    /* renamed from: c */
    public final AbstractC89172b<View, C89391z> f92868c;

    static {
        Covode.recordClassIndex(47020);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39340d)) {
            return false;
        }
        C39340d dVar = (C39340d) obj;
        return C89219l.m154714a(this.f92866a, dVar.f92866a) && C89219l.m154714a(this.f92867b, dVar.f92867b) && C89219l.m154714a(this.f92868c, dVar.f92868c);
    }

    public final int hashCode() {
        String str = this.f92866a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f92867b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AbstractC89172b<View, C89391z> bVar = this.f92868c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "DialogHyperLinkState(prefixLinkText=" + this.f92866a + ", linkText=" + this.f92867b + ", linkClickListener=" + this.f92868c + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super android.view.View, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39340d(String str, String str2, AbstractC89172b<? super View, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(bVar, "");
        this.f92866a = str;
        this.f92867b = str2;
        this.f92868c = bVar;
    }
}
