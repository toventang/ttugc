package com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui.C68386g;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.l */
final /* synthetic */ class C68394l implements AbstractC88433f {

    /* renamed from: a */
    private final C68386g f153118a;

    static {
        Covode.recordClassIndex(80623);
    }

    C68394l(C68386g gVar) {
        this.f153118a = gVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C68386g gVar = this.f153118a;
        C68386g.C68389a aVar = (C68386g.C68389a) ((C34800h) ((C68415n) obj).f95762k).f82204g;
        String str = aVar.f153111a;
        gVar.f153076G.mo57616a(str, Integer.valueOf(aVar.f153112b ? 1 : 0));
        if (gVar.f153078I != null) {
            gVar.f153078I.put(aVar.f153111a, aVar.f153112b ? 1 : 0);
        }
    }
}
