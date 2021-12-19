package com.bytedance.ies.xelement.defaultimpl.player.engine.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19193b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.C19169n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.api.a */
public final class C19155a implements AbstractC19193b<AbstractC19186f, C19169n> {
    static {
        Covode.recordClassIndex(21918);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.f.a.b] */
    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19193b
    /* renamed from: a */
    public final /* synthetic */ void mo30516a(AbstractC19186f fVar, AbstractC89172b<? super C19169n, C89391z> bVar) {
        C19169n nVar;
        AbstractC19186f fVar2 = fVar;
        if (fVar2 == null) {
            nVar = null;
        } else {
            nVar = new C19169n(fVar2.getPlayUrl(), fVar2.getLocalPath(), fVar2.getPlayModel(), 12);
        }
        bVar.invoke(nVar);
    }
}
