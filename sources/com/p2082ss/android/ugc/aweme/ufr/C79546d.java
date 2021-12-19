package com.p2082ss.android.ugc.aweme.ufr;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ufr.d */
public final class C79546d {

    /* renamed from: a */
    public final EnumC79549g f178516a;

    /* renamed from: b */
    public final C79547e f178517b;

    static {
        Covode.recordClassIndex(92750);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79546d)) {
            return false;
        }
        C79546d dVar = (C79546d) obj;
        return C89219l.m154714a(this.f178516a, dVar.f178516a) && C89219l.m154714a(this.f178517b, dVar.f178517b);
    }

    public final int hashCode() {
        EnumC79549g gVar = this.f178516a;
        int i = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        C79547e eVar = this.f178517b;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UFRResponse(curStep=" + this.f178516a + ", result=" + this.f178517b + ")";
    }

    public C79546d(EnumC79549g gVar, C79547e eVar) {
        C89219l.m154719c(eVar, "");
        this.f178516a = gVar;
        this.f178517b = eVar;
    }
}
