package com.p2082ss.android.ugc.aweme.share;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.discover.hitrank.C42066d;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56204e;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3265b.C56268a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69683d;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.r */
public final class C69417r implements AbstractC56264b {

    /* renamed from: a */
    private final C56268a f155054a;

    static {
        Covode.recordClassIndex(81754);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
    /* renamed from: a */
    public final void mo90144a() {
    }

    public C69417r(C56268a aVar) {
        C89219l.m154721d(aVar, "");
        this.f155054a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
    /* renamed from: b */
    public final void mo90150b(SharePackage sharePackage) {
        C89219l.m154721d(sharePackage, "");
        if (!C56204e.m102118b()) {
            this.f155054a.f128343a.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
    /* renamed from: a */
    public final boolean mo90149a(SharePackage sharePackage) {
        C89219l.m154721d(sharePackage, "");
        String string = sharePackage.f155492i.getString("aid", "");
        if (string == null) {
            string = "";
        }
        if (C37699a.m76218U(AwemeService.m70060b().mo60690d(string))) {
            new C79459a(this.f155054a.f128358j).mo123050a(R.string.o7).mo123053a();
            return false;
        }
        C89219l.m154721d(sharePackage, "");
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
    /* renamed from: c */
    public final void mo90151c(SharePackage sharePackage) {
        C89219l.m154721d(sharePackage, "");
        Bundle bundle = sharePackage.f155492i;
        if (C89219l.m154714a((Object) bundle.getString("is_star"), (Object) "1")) {
            C42066d.m84194a(bundle.getString("author_id", ""), bundle.getString("sec_author_id", ""), 3, null);
        }
        AbstractC69683d dVar = this.f155054a.f128349g;
        if (dVar != null) {
            dVar.mo69718a(sharePackage);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
    /* renamed from: a */
    public final void mo90147a(String str, SharePackage sharePackage) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(sharePackage, "");
        AbstractC56264b.C56265a.m102234a(str, sharePackage);
    }
}
