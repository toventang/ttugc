package com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2645c;

import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.c.c */
public final class C39339c {

    /* renamed from: a */
    public final String f92864a;

    /* renamed from: b */
    public final AbstractC89172b<View, C89391z> f92865b;

    static {
        Covode.recordClassIndex(47019);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39339c)) {
            return false;
        }
        C39339c cVar = (C39339c) obj;
        return C89219l.m154714a(this.f92864a, cVar.f92864a) && C89219l.m154714a(this.f92865b, cVar.f92865b);
    }

    public final int hashCode() {
        String str = this.f92864a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        AbstractC89172b<View, C89391z> bVar = this.f92865b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AppealSecondButtonState(title=" + this.f92864a + ", listener=" + this.f92865b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super android.view.View, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39339c(String str, AbstractC89172b<? super View, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        this.f92864a = str;
        this.f92865b = bVar;
    }
}
