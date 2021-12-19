package com.p2082ss.ugc.effectplatform.task.p4458b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.AbstractC86700d;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86701e;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.C86702f;
import com.p2082ss.ugc.effectplatform.p4449f.C86784d;
import p4519d.p4520a.p4533f.AbstractC88064c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.task.b.d */
public final class C86901d implements AbstractC88064c<C86701e, C86702f> {

    /* renamed from: a */
    private final AbstractC86700d f195925a;

    static {
        Covode.recordClassIndex(102666);
    }

    public C86901d(AbstractC86700d dVar) {
        this.f195925a = dVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4519d.p4520a.p4533f.AbstractC88064c
    /* renamed from: a */
    public final /* synthetic */ C86702f mo140606a(C86701e eVar) {
        C86701e eVar2 = eVar;
        C89219l.m154719c(eVar2, "");
        AbstractC86700d dVar = this.f195925a;
        if (dVar != null) {
            C86702f fetchFromNetwork = dVar.fetchFromNetwork(eVar2);
            if (fetchFromNetwork.f195517a == 200) {
                return fetchFromNetwork;
            }
            throw new C86784d(fetchFromNetwork.f195517a, fetchFromNetwork.f195520d);
        }
        throw new C86784d(3, "networker is null!");
    }
}
