package com.bytedance.android.livesdk.lynx.lynxcard;

import com.bytedance.android.livesdk.container.p513j.C8273c;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.c */
public final class C9369c {

    /* renamed from: a */
    public final C8273c f22857a;

    /* renamed from: b */
    public final int f22858b;

    static {
        Covode.recordClassIndex(10876);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9369c)) {
            return false;
        }
        C9369c cVar = (C9369c) obj;
        return C89219l.m154714a(this.f22857a, cVar.f22857a) && this.f22858b == cVar.f22858b;
    }

    public final int hashCode() {
        C8273c cVar = this.f22857a;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f22858b;
    }

    public final String toString() {
        return "LoadData(lynxCardView=" + this.f22857a + ", priority=" + this.f22858b + ")";
    }

    public C9369c(C8273c cVar, int i) {
        C89219l.m154721d(cVar, "");
        this.f22857a = cVar;
        this.f22858b = i;
    }
}
