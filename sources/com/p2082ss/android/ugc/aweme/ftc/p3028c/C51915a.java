package com.p2082ss.android.ugc.aweme.ftc.p3028c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.c.a */
public final class C51915a implements AbstractC81914b {

    /* renamed from: a */
    public final C43223c f119607a;

    static {
        Covode.recordClassIndex(61284);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C51915a) && C89219l.m154714a(this.f119607a, ((C51915a) obj).f119607a);
        }
        return true;
    }

    public final int hashCode() {
        C43223c cVar = this.f119607a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DeleteDraftEvent(data=" + this.f119607a + ")";
    }

    public C51915a(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        this.f119607a = cVar;
    }
}
