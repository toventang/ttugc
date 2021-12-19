package com.p2082ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.AbstractC17371f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.f */
public final class C33079f implements AbstractC17371f {

    /* renamed from: a */
    public final AbstractC33102w f78640a;

    static {
        Covode.recordClassIndex(39891);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C33079f) && C89219l.m154714a(this.f78640a, ((C33079f) obj).f78640a);
        }
        return true;
    }

    public final int hashCode() {
        AbstractC33102w wVar = this.f78640a;
        if (wVar != null) {
            return wVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ActivityForResultConfig(listener=" + this.f78640a + ")";
    }

    public C33079f(AbstractC33102w wVar) {
        C89219l.m154721d(wVar, "");
        this.f78640a = wVar;
    }
}
