package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50367m;
import com.p2082ss.android.ugc.aweme.report.C67105b;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.l */
public final class C50388l extends AbstractC50367m {

    /* renamed from: a */
    private final AbstractC50382f f116332a;

    static {
        Covode.recordClassIndex(59519);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e
    /* renamed from: b */
    public final void mo85531b(View view) {
        C89219l.m154721d(view, "");
        this.f116332a.mo85551a("report");
        super.mo85531b(view);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e
    /* renamed from: a */
    public final void mo85530a(View view) {
        C89219l.m154721d(view, "");
        if (this.f116296f != null && C17873f.m33102j() != null) {
            Activity j = C17873f.m33102j();
            if (j == null) {
                C89219l.m154715b();
            }
            Aweme aweme = this.f116296f;
            if (aweme == null) {
                C89219l.m154715b();
            }
            if (aweme.isAd()) {
                Aweme aweme2 = this.f116296f;
                if (aweme2 == null) {
                    C89219l.m154715b();
                }
                if (aweme2.getAwemeRawAd() != null) {
                    Aweme aweme3 = this.f116296f;
                    if (aweme3 == null) {
                        C89219l.m154715b();
                    }
                    AwemeRawAd awemeRawAd = aweme3.getAwemeRawAd();
                    if (awemeRawAd == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(awemeRawAd, "");
                    if (awemeRawAd.isReportEnable()) {
                        IReportService a = C39223a.m79587a();
                        Activity a2 = C69124b.m122223a(j);
                        Aweme aweme4 = this.f116296f;
                        if (aweme4 == null) {
                            C89219l.m154715b();
                        }
                        a.mo68694b(a2, C67105b.m118760a(aweme4, "long_press", "ad"));
                        return;
                    }
                }
            }
            ShareDependService a3 = ShareDependService.C68822a.m121324a();
            Aweme aweme5 = this.f116296f;
            if (aweme5 == null) {
                C89219l.m154715b();
            }
            a3.mo109339a(aweme5, this.f116297g, j, "long_press", this.f116297g);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50388l(C50345a aVar, AbstractC50382f fVar) {
        super(aVar, fVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(fVar, "");
        this.f116332a = fVar;
    }
}
