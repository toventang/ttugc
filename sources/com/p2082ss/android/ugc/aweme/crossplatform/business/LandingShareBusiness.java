package com.p2082ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69094r;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69095s;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69096t;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69683d;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.LandingShareBusiness */
public class LandingShareBusiness extends AbsShareBusiness {
    static {
        Covode.recordClassIndex(48397);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness
    /* renamed from: b */
    public final void mo69697b() {
        if ((this.f94936l instanceof Activity) && this.f94912a != null) {
            C69684e.C69686b bVar = new C69684e.C69686b();
            bVar.mo109823a(ShareDependService.C68822a.m121324a().mo109325a(this.f94912a, ""));
            C68863ah.f154027a.mo109409a(bVar, (Activity) this.f94936l, true);
            bVar.mo109824a(this.f94912a);
            bVar.f155584o = true;
            bVar.mo109825a(new AbstractC69683d() {
                /* class com.p2082ss.android.ugc.aweme.crossplatform.business.LandingShareBusiness.C405691 */

                static {
                    Covode.recordClassIndex(48398);
                }

                @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69683d
                /* renamed from: a */
                public final void mo69718a(SharePackage sharePackage) {
                }

                @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69683d
                /* renamed from: a */
                public final void mo69719a(String str, SharePackage sharePackage) {
                }

                @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69683d
                /* renamed from: b */
                public final boolean mo69720b(SharePackage sharePackage) {
                    ShareDependService.C68822a.m121324a().mo109334a(LandingShareBusiness.this.f94936l, LandingShareBusiness.this.f94935k.f95068a.f95061j);
                    return true;
                }
            });
            bVar.f155573d = true;
            this.f94912a.f155492i.putString("aweme_id", this.f94935k.f95068a.f95061j);
            if (this.f94935k.f95071d.f95171d) {
                bVar.mo109827a(new C69096t());
            }
            if (this.f94913b.contains("copylink")) {
                bVar.mo109827a(new C69094r("fromWeb"));
            }
            if (this.f94913b.contains("browser")) {
                bVar.mo109827a(new C69095s());
            }
            bVar.f155574e = true;
            ShareDependService.C68822a.m121324a().mo109326a(C17873f.m33102j(), bVar.mo109831a(), R.style.wi).show();
        }
    }

    public LandingShareBusiness(C40589e eVar) {
        super(eVar);
    }
}
