package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.report.C67105b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.j */
public final class C69267j extends C69266i {

    /* renamed from: a */
    private final C11666c f154819a;

    static {
        Covode.recordClassIndex(81597);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69267j(Activity activity, C11666c cVar) {
        super(activity, cVar);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(cVar, "");
        this.f154819a = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h, com.p2082ss.android.ugc.aweme.share.improve.pkg.C69266i
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        Aweme b = AwemeService.m70060b().mo60684b(this.f154819a.f27806M);
        if (b != null) {
            C39223a.m79587a().mo68694b(C69124b.m122223a(context), C67105b.m118759a(b, "live_ad", this.f154819a.f27813c, "ad"));
        }
    }
}
