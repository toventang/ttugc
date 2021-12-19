package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.p1777x.p1779b.C23684c;
import com.bytedance.p1777x.p1779b.C23687f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38222ai;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import java.util.List;
import java.util.concurrent.Executor;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bt */
public final class C38733bt implements AbstractC38677bd {
    static {
        Covode.recordClassIndex(46274);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38677bd
    /* renamed from: a */
    public final void mo67246a(C23684c cVar) {
        C38703bs.m78519a(cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38677bd
    /* renamed from: b */
    public final boolean mo67250b(Aweme aweme) {
        return C38703bs.m78532c(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38677bd
    /* renamed from: a */
    public final boolean mo67249a(Aweme aweme) {
        return C38703bs.m78530b(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38677bd
    /* renamed from: c */
    public final void mo67251c(Aweme aweme) {
        C38222ai omVast;
        C23687f fVar;
        String str;
        Video video;
        VideoUrlModel playAddr;
        List<String> urlList;
        C38222ai omVast2;
        if (C38703bs.m78530b(aweme) || C38703bs.m78532c(aweme)) {
            AwemeRawAd awemeRawAd = null;
            if (aweme != null) {
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 == null || (omVast2 = awemeRawAd2.getOmVast()) == null || !omVast2.loading) {
                    AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                    if (!(awemeRawAd3 == null || (omVast = awemeRawAd3.getOmVast()) == null || (fVar = omVast.vast) == null || (str = fVar.adTitle) == null || str.length() == 0)) {
                        if (aweme == null || (video = aweme.getVideo()) == null || (playAddr = video.getPlayAddr()) == null || (urlList = playAddr.getUrlList()) == null || urlList.isEmpty()) {
                            C38182f.C38184b b = C38182f.m77418a().mo66497b(aweme);
                            b.f90211a = "draw_ad";
                            b.f90212b = "show_fail";
                            b.mo66491a(C89041ag.m154412a(C89387v.m154943a("error_message", "vast_mediafile_missing"))).mo66495a((Context) null);
                            if (aweme != null) {
                                awemeRawAd = aweme.getAwemeRawAd();
                            }
                            C18129a.m33746a("draw_ad", "show_fail", awemeRawAd).mo28897a("error_message", "vast_mediafile_missing").mo28902c();
                            return;
                        }
                        return;
                    }
                } else {
                    C38182f.C38184b b2 = C38182f.m77418a().mo66497b(aweme);
                    b2.f90211a = "draw_ad";
                    b2.f90212b = "show_fail";
                    b2.mo66491a(new C33744d().mo59983a("error_message", "vast_wrapper_late_response").f79943a).mo66495a((Context) null);
                    C18129a.m33746a("draw_ad", "show_fail", aweme.getAwemeRawAd()).mo28897a("error_message", "vast_wrapper_late_response").mo28902c();
                    return;
                }
            }
            C38182f.C38184b b3 = C38182f.m77418a().mo66497b(aweme);
            b3.f90211a = "draw_ad";
            b3.f90212b = "show_fail";
            b3.mo66491a(C89041ag.m154412a(C89387v.m154943a("error_message", "vast_title_missing"))).mo66495a((Context) null);
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            C18129a.m33746a("draw_ad", "show_fail", awemeRawAd).mo28897a("error_message", "vast_title_missing").mo28902c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38677bd
    /* renamed from: a */
    public final void mo67247a(Aweme aweme, C84208l lVar) {
        String str;
        String obj;
        if (aweme != null && lVar != null && C38701br.m78512a(aweme, 3)) {
            C38182f.C38184b b = C38182f.m77418a().mo66497b(aweme);
            b.f90211a = "draw_ad";
            b.f90212b = "show_fail";
            C33744d a = new C33744d().mo59983a("error_message", "vast_mediafile_bad_response").mo59980a("error_code", lVar.f188035d);
            Object obj2 = lVar.f188037f;
            String str2 = "";
            if (obj2 == null || (str = obj2.toString()) == null) {
                str = str2;
            }
            b.mo66491a(a.mo59983a("error_detail", str).f79943a).mo66495a((Context) null);
            C18129a.C18130a a2 = C18129a.m33746a("draw_ad", "show_fail", aweme.getAwemeRawAd()).mo28897a("error_message", "vast_mediafile_bad_response").mo28897a("error_code", Integer.valueOf(lVar.f188035d));
            Object obj3 = lVar.f188037f;
            if (!(obj3 == null || (obj = obj3.toString()) == null)) {
                str2 = obj;
            }
            a2.mo28897a("error_detail", str2).mo28902c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38677bd
    /* renamed from: a */
    public final void mo67248a(Aweme aweme, Executor executor, boolean z) {
        C38703bs.m78522a(aweme, executor, z);
    }
}
