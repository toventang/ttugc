package com.bytedance.sdk.bdlynx.p1687e;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.p1687e.p1689b.p1690a.C22638a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.e.f */
public abstract class AbstractC22658f implements AbstractC22657e {

    /* renamed from: b */
    public boolean f53521b;

    static {
        Covode.recordClassIndex(26475);
    }

    /* renamed from: a */
    public abstract void mo36902a(C22638a aVar);

    /* renamed from: b */
    public void mo36903b(C22638a aVar) {
        C89219l.m154719c(aVar, "");
    }

    @Override // com.bytedance.sdk.bdlynx.p1687e.AbstractC22657e
    /* renamed from: a_ */
    public final void mo36925a_(C22638a aVar) {
        C89219l.m154719c(aVar, "");
        mo36902a(aVar);
        this.f53521b = true;
    }

    @Override // com.bytedance.sdk.bdlynx.p1687e.AbstractC22657e
    /* renamed from: b_ */
    public final void mo36926b_(C22638a aVar) {
        C89219l.m154719c(aVar, "");
        if (this.f53521b) {
            mo36903b(aVar);
        } else {
            mo36902a(aVar);
        }
        this.f53521b = true;
    }

    @Override // com.bytedance.sdk.bdlynx.p1687e.AbstractC22657e
    /* renamed from: c */
    public final void mo36927c(C22638a aVar) {
        C89219l.m154719c(aVar, "");
        if (this.f53521b) {
            mo36903b(aVar);
        } else {
            mo36902a(aVar);
        }
    }
}
