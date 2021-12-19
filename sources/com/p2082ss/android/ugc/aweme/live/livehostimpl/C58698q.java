package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.livesdkapi.depend.AbstractC11622a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.q */
final /* synthetic */ class C58698q implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC11622a f133622a;

    static {
        Covode.recordClassIndex(69000);
    }

    C58698q(AbstractC11622a aVar) {
        this.f133622a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC11622a aVar = this.f133622a;
        C17873f.C17875b bVar = (C17873f.C17875b) obj;
        if (bVar == null) {
            return;
        }
        if (Boolean.TRUE.equals(Boolean.valueOf(bVar.f42646b))) {
            aVar.mo8667a();
        } else if (Boolean.FALSE.equals(Boolean.valueOf(bVar.f42646b))) {
            aVar.mo8668b();
        }
    }
}
