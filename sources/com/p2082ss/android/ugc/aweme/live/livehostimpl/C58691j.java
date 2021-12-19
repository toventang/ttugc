package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.livesdkapi.depend.AbstractC11624b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.j */
final /* synthetic */ class C58691j implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC11624b f133615a;

    static {
        Covode.recordClassIndex(68993);
    }

    C58691j(AbstractC11624b bVar) {
        this.f133615a = bVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC11624b bVar = this.f133615a;
        C17873f.C17874a aVar = (C17873f.C17874a) obj;
        if (aVar != null) {
            bVar.onActivityCreated(aVar.f42643a, aVar.f42644b);
        }
    }
}
