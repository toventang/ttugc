package com.bytedance.ies.powerpreload.p1243b;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.C17807d;
import com.bytedance.ies.powerpreload.p1244c.C17802a;
import com.bytedance.ies.powerpreload.task.AbstractC17825c;
import com.bytedance.ies.powerpreload.task.AbstractRunnableC17828f;
import com.bytedance.ies.powerpreload.task.C17818a;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpreload.b.j */
public final class C17795j implements AbstractC17825c {

    /* renamed from: a */
    public IRetrofitFactory f42474a;

    /* renamed from: b */
    public AbstractC17825c f42475b;

    static {
        Covode.recordClassIndex(20359);
    }

    @Override // com.bytedance.ies.powerpreload.task.AbstractC17825c
    /* renamed from: a */
    public final AbstractRunnableC17828f<AbstractC17789d> mo28269a(AbstractC17789d dVar, C17807d dVar2, Bundle bundle) {
        AbstractRunnableC17828f<AbstractC17789d> a;
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(dVar2, "");
        AbstractC17825c cVar = this.f42475b;
        if (cVar != null && (a = cVar.mo28269a(dVar, dVar2, bundle)) != null) {
            return a;
        }
        if (dVar instanceof AbstractC17788c) {
            if (this.f42474a == null) {
                return new AbstractRunnableC17828f.C17830b(dVar, dVar2, bundle);
            }
            AbstractC17788c cVar2 = (AbstractC17788c) dVar;
            IRetrofitFactory iRetrofitFactory = this.f42474a;
            if (iRetrofitFactory == null) {
                C89219l.m154707a();
            }
            return new C17802a(cVar2, dVar2, bundle, iRetrofitFactory);
        } else if (dVar instanceof AbstractC17787b) {
            return new C17818a((AbstractC17787b) dVar, dVar2, bundle);
        } else {
            return new AbstractRunnableC17828f.C17830b((AbstractC17787b) dVar, dVar2, bundle);
        }
    }
}
