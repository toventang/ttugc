package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a;

import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.b */
public final class C64940b<AREA> {

    /* renamed from: a */
    public final AREA f146761a;

    /* renamed from: b */
    public final AbstractC89277c<? extends AbstractC12748a> f146762b;

    static {
        Covode.recordClassIndex(76408);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64940b)) {
            return false;
        }
        C64940b bVar = (C64940b) obj;
        return C89219l.m154714a(this.f146761a, bVar.f146761a) && C89219l.m154714a(this.f146762b, bVar.f146762b);
    }

    public final int hashCode() {
        AREA area = this.f146761a;
        int i = 0;
        int hashCode = (area != null ? area.hashCode() : 0) * 31;
        AbstractC89277c<? extends AbstractC12748a> cVar = this.f146762b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProfileNavAction(entrance=" + ((Object) this.f146761a) + ", assemClass=" + this.f146762b + ")";
    }

    public C64940b(AREA area, AbstractC89277c<? extends AbstractC12748a> cVar) {
        C89219l.m154721d(area, "");
        C89219l.m154721d(cVar, "");
        this.f146761a = area;
        this.f146762b = cVar;
    }
}
