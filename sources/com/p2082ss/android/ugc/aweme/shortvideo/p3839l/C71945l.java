package com.p2082ss.android.ugc.aweme.shortvideo.p3839l;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.ProgressDialogC72983g;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.l.l */
public final /* synthetic */ class C71945l implements ProgressDialogC72983g.AbstractC72986c {

    /* renamed from: a */
    private final C71924b f161220a;

    static {
        Covode.recordClassIndex(84494);
    }

    C71945l(C71924b bVar) {
        this.f161220a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.ProgressDialogC72983g.AbstractC72986c
    /* renamed from: a */
    public final void mo113591a() {
        C71924b bVar = this.f161220a;
        bVar.f161182o = true;
        bVar.f161174g = null;
        C33744d dVar = new C33744d();
        bVar.mo113569a(dVar);
        AVExternalServiceImpl.m113114a().getAVMobService().onEventV3("click_cancel_loading", dVar.f79943a);
    }
}
