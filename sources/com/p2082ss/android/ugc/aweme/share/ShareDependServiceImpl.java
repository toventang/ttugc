package com.p2082ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import androidx.appcompat.app.DialogInterfaceC0216c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.p2082ss.android.ugc.aweme.feed.helper.C49658w;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50532ah;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50540h;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p3070im.p3071a.C53589a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.report.C67105b;
import com.p2082ss.android.ugc.aweme.share.gif.AbstractC68942h;
import com.p2082ss.android.ugc.aweme.share.gif.C68935b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.utils.C80310cp;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.ShareDependServiceImpl */
public final class ShareDependServiceImpl extends AbstractC68851ab {
    static {
        Covode.recordClassIndex(81113);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final AbstractC68942h mo109324a() {
        return new C68935b();
    }

    @Override // com.p2082ss.android.ugc.aweme.share.AbstractC68851ab, com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: c */
    public final boolean mo109350c() {
        return C53589a.m98814a();
    }

    /* renamed from: d */
    public static ShareDependService m121327d() {
        MethodCollector.m26663i(8434);
        Object a = C81908b.m141854a(ShareDependService.class, false);
        if (a != null) {
            ShareDependService shareDependService = (ShareDependService) a;
            MethodCollector.m26664o(8434);
            return shareDependService;
        }
        if (C81908b.f183321dR == null) {
            synchronized (ShareDependService.class) {
                try {
                    if (C81908b.f183321dR == null) {
                        C81908b.f183321dR = new ShareDependServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8434);
                    throw th;
                }
            }
        }
        AbstractC68851ab abVar = (AbstractC68851ab) C81908b.f183321dR;
        MethodCollector.m26664o(8434);
        return abVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final boolean mo109345a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        if (!C58901f.m108229a(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109340a(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar, "");
        C49658w.m93103a().storeLong(bVar.mo109548a(), System.currentTimeMillis());
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109328a(Activity activity) {
        C89219l.m154721d(activity, "");
        DialogInterfaceC0216c a = new DialogInterfaceC0216c.C0217a(activity, R.style.l7).mo445a(R.string.dgi).mo454b(R.string.dgh).mo455b(R.string.a8y, new DialogInterface.OnClickListener(activity) {
            /* class com.p2082ss.android.ugc.aweme.utils.permission.C80614b.DialogInterface$OnClickListenerC806162 */

            /* renamed from: a */
            final /* synthetic */ Activity f180264a;

            static {
                Covode.recordClassIndex(93890);
            }

            {
                this.f180264a = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (C51648a.f118980a.mo87318b(this.f180264a)) {
                    this.f180264a.finish();
                }
            }
        }).mo446a(R.string.as0, new DialogInterface.OnClickListener(activity) {
            /* class com.p2082ss.android.ugc.aweme.utils.permission.C80614b.DialogInterface$OnClickListenerC806151 */

            /* renamed from: a */
            final /* synthetic */ Activity f180262a;

            /* renamed from: b */
            final /* synthetic */ AbstractC80617a f180263b = null;

            static {
                Covode.recordClassIndex(93889);
            }

            {
                this.f180262a = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C80310cp.m139213a(this.f180262a);
            }
        }).mo453a();
        try {
            a.setCancelable(false);
            a.setCanceledOnTouchOutside(false);
            a.show();
        } catch (Exception unused) {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109338a(Aweme aweme, String str) {
        String str2;
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        if (C58901f.m108229a(aweme)) {
            if (aweme != null) {
                str2 = "type " + aweme.getAwemeType();
                Video video = aweme.getVideo();
                if (video != null) {
                    str2 = str2 + " width " + video.getWidth() + " height " + video.getHeight();
                }
            } else {
                str2 = "";
            }
            C33830n.m69192a("livewall_not_show", "", new C33743c().mo59971a("setting", Boolean.valueOf(!C58901f.m108236c())).mo59971a("isInValidValueAweme", Boolean.valueOf(C58901f.m108235b(aweme))).mo59976a("message", str2).mo59977a());
        } else if (aweme != null) {
            C39162r.m79460a("wall_paper_show", new C33744d().mo59983a("group_id", aweme.getAid()).mo59983a("request_id", aweme.getRequestId()).mo59983a("enter_from", str).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.AbstractC68851ab, com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109332a(Context context, Aweme aweme, String str, String str2, String str3) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C50540h.f116809a = aweme;
        SmartRouter.buildRoute(context, "//setting//privacy").withParam("tab_name", str).withParam("enter_from", str2).withParam("impr_id", str3).open();
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareDependService
    /* renamed from: a */
    public final void mo109339a(Aweme aweme, String str, Context context, String str2, String str3) {
        String mixId;
        String str4 = str2;
        String str5 = "";
        C89219l.m154721d(aweme, str5);
        C89219l.m154721d(str, str5);
        C89219l.m154721d(context, str5);
        C89219l.m154721d(str4, str5);
        C89219l.m154721d(str3, str5);
        if (aweme.isAd() && aweme.getAwemeRawAd() != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(awemeRawAd, str5);
            if (awemeRawAd.isReportEnable()) {
                C39223a.m79587a().mo68694b(C69124b.m122223a(context), C67105b.m118760a(aweme, "creative", "ad"));
                return;
            }
        }
        String aid = aweme.getAid();
        C89219l.m154716b(aid, str5);
        int awemeType = aweme.getAwemeType();
        String str6 = "mix";
        if (awemeType == 13) {
            str6 = "forward";
        } else if (awemeType != 300) {
            str6 = "video";
        } else {
            PlayListInfo playListInfo = aweme.playlist_info;
            if (!(playListInfo == null || (mixId = playListInfo.getMixId()) == null)) {
                aid = mixId;
            }
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", str6).appendQueryParameter("object_id", aid);
        User author = aweme.getAuthor();
        C89219l.m154716b(author, str5);
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("owner_id", author.getUid()).appendQueryParameter("enter_from", str3);
        if (C50532ah.m94726b(aweme)) {
            appendQueryParameter2.appendQueryParameter("subtitle_id", String.valueOf(C50532ah.m94728d(aweme)));
        }
        C39223a.m79587a().mo68688a(C69124b.m122223a(context), appendQueryParameter2);
        IReportService a = C39223a.m79587a();
        String a2 = C39223a.m79587a().mo68686a(aweme);
        String e = C59208ac.m108771e(aweme);
        String e2 = C59208ac.m108771e(aweme);
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            str5 = author2.getUid();
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = C39223a.m79587a().mo68687a(str);
        }
        a.mo68692a(str, a2, e, e2, str5, "", str4, aweme);
    }
}
