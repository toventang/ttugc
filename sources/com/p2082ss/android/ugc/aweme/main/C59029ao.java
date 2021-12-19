package com.p2082ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.main.C59014ae;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.main.ao */
final /* synthetic */ class C59029ao implements AbstractC88433f {

    /* renamed from: a */
    private final C59014ae f134401a;

    static {
        Covode.recordClassIndex(69374);
    }

    C59029ao(C59014ae aeVar) {
        this.f134401a = aeVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C59014ae aeVar = this.f134401a;
        C59014ae.C59018a aVar = (C59014ae.C59018a) obj;
        if (aVar.f134389b && C17873f.f42636l) {
            aVar.f134388a.mo68645h();
        }
        if (aeVar.f134348F != null) {
            aeVar.f134348F.dispose();
        }
    }
}
