package com.p2082ss.android.ugc.aweme.share.business;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.business.c */
public final class C68892c implements AbstractC56264b {

    /* renamed from: a */
    private final Context f154103a;

    static {
        Covode.recordClassIndex(81197);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
    /* renamed from: a */
    public final void mo90144a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
    /* renamed from: b */
    public final void mo90150b(SharePackage sharePackage) {
        C89219l.m154721d(sharePackage, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
    /* renamed from: c */
    public final void mo90151c(SharePackage sharePackage) {
        C89219l.m154721d(sharePackage, "");
    }

    public C68892c(Context context) {
        C89219l.m154721d(context, "");
        this.f154103a = context;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
    /* renamed from: a */
    public final boolean mo90149a(SharePackage sharePackage) {
        C89219l.m154721d(sharePackage, "");
        if (!C37699a.m76218U(C68893d.m121577a(sharePackage))) {
            return true;
        }
        new C79459a(this.f154103a).mo123050a(R.string.o7).mo123053a();
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b
    /* renamed from: a */
    public final void mo90147a(String str, SharePackage sharePackage) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(sharePackage, "");
        Aweme a = C68893d.m121577a(sharePackage);
        if (a != null) {
            ShareDependService.C68822a.m121324a().mo109331a(this.f154103a, a, "");
        }
    }
}
