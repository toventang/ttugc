package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.api.CancelVideoMaskApi;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49674b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bk */
public final class C50125bk extends AbstractC50032a {

    /* renamed from: f */
    public static final C50126a f115715f = new C50126a((byte) 0);

    static {
        Covode.recordClassIndex(59251);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50032a
    /* renamed from: b */
    public final int mo85138b() {
        return R.layout.td;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bk$a */
    public static final class C50126a {
        static {
            Covode.recordClassIndex(59252);
        }

        private C50126a() {
        }

        public /* synthetic */ C50126a(byte b) {
            this();
        }
    }

    public C50125bk(View view) {
        super(view);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bk$b */
    public static final class C50127b implements AbstractC88986z<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ C50125bk f115716a;

        static {
            Covode.recordClassIndex(59253);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C50127b(C50125bk bkVar) {
            this.f115716a = bkVar;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            String errorMsg;
            C89219l.m154721d(th, "");
            if (th instanceof C34485a) {
                C34485a aVar = (C34485a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    errorMsg = this.f115716a.f113959R.getString(R.string.dcn);
                } else {
                    errorMsg = aVar.getErrorMsg();
                }
                new C79459a(C17867d.m33078a()).mo123052a(errorMsg).mo123053a();
                return;
            }
            new C79459a(C17867d.m33078a()).mo123050a(R.string.dcn).mo123053a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            BaseResponse baseResponse2 = baseResponse;
            C89219l.m154721d(baseResponse2, "");
            if (baseResponse2.status_code == 0) {
                Aweme aweme = this.f115716a.f113953L;
                C89219l.m154716b(aweme, "");
                aweme.setReportMaskInfo(new VideoMaskInfo(null, null, null, null, null, null, 63, null));
                AwemeService.m70060b().mo60677a(this.f115716a.f113953L);
                View view = ((AbstractC50032a) this.f115716a).f115489a;
                if (view != null) {
                    view.setVisibility(8);
                }
                this.f115716a.mo85139c();
                AbstractC81915c.m141874a(new C49674b());
            }
        }
    }

    /* renamed from: a */
    public final void mo85270a(String str) {
        C33744d a = new C33744d().mo59983a("enter_from", this.f113954M);
        Aweme aweme = this.f113953L;
        C89219l.m154716b(aweme, "");
        C33744d a2 = a.mo59983a("group_id", aweme.getAid());
        Aweme aweme2 = this.f113953L;
        C89219l.m154716b(aweme2, "");
        C39162r.m79460a(str, a2.mo59983a("author_id", aweme2.getAuthorUid()).f79943a);
    }

    /* renamed from: b */
    public final void mo85271b(String str) {
        AwemeRawAd awemeRawAd;
        Aweme aweme = this.f113953L;
        C89219l.m154716b(aweme, "");
        if (aweme.isAd() && this.f113959R != null) {
            C38182f.C38184b a = C38182f.m77418a();
            a.f90211a = "background_ad";
            a.f90212b = str;
            a.mo66504c("report_mask").mo66497b(this.f113953L).mo66495a(this.f113959R);
            Aweme aweme2 = this.f113953L;
            if (aweme2 != null) {
                awemeRawAd = aweme2.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C18129a.m33746a("background_ad", str, awemeRawAd).mo28900b("refer", "report_mask").mo28902c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bk$c */
    static final class View$OnClickListenerC50128c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50125bk f115717a;

        static {
            Covode.recordClassIndex(59254);
        }

        View$OnClickListenerC50128c(C50125bk bkVar) {
            this.f115717a = bkVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C50125bk bkVar = this.f115717a;
            Context context = bkVar.f113959R;
            C89219l.m154716b(context, "");
            if (!C80422fe.m139425a(context)) {
                new C79459a(bkVar.f113959R).mo123052a(bkVar.f113959R.getString(R.string.dcq)).mo123053a();
            } else if (bkVar.f113953L != null) {
                Aweme aweme = bkVar.f113953L;
                C89219l.m154716b(aweme, "");
                if (aweme.getReportMaskInfo() != null) {
                    Aweme aweme2 = bkVar.f113953L;
                    C89219l.m154716b(aweme2, "");
                    String aid = aweme2.getAid();
                    C89219l.m154716b(aid, "");
                    Aweme aweme3 = bkVar.f113953L;
                    C89219l.m154716b(aweme3, "");
                    Integer maskType = aweme3.getReportMaskInfo().getMaskType();
                    Aweme aweme4 = bkVar.f113953L;
                    C89219l.m154716b(aweme4, "");
                    CancelVideoMaskApi.m91764a(aid, maskType, aweme4.getReportMaskInfo().getStatus()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C50127b(bkVar));
                }
            }
            this.f115717a.mo85270a("showpost_click");
            this.f115717a.mo85271b("play");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50032a
    /* renamed from: a */
    public final void mo85137a(Aweme aweme) {
        String string;
        String string2;
        String string3;
        C89219l.m154721d(aweme, "");
        if (C80635y.m139812g(aweme)) {
            View view = ((AbstractC50032a) this).f115489a;
            if (view == null || view.getVisibility() != 0) {
                TextView textView = this.f115490b;
                if (textView != null) {
                    Aweme aweme2 = this.f113953L;
                    C89219l.m154716b(aweme2, "");
                    VideoMaskInfo reportMaskInfo = aweme2.getReportMaskInfo();
                    if (reportMaskInfo == null || (string3 = reportMaskInfo.getTitle()) == null) {
                        string3 = this.f113959R.getString(R.string.fah);
                    }
                    textView.setText(string3);
                }
                TextView textView2 = this.f115492d;
                if (textView2 != null) {
                    Aweme aweme3 = this.f113953L;
                    C89219l.m154716b(aweme3, "");
                    VideoMaskInfo reportMaskInfo2 = aweme3.getReportMaskInfo();
                    if (reportMaskInfo2 == null || (string2 = reportMaskInfo2.getContent()) == null) {
                        string2 = this.f113959R.getString(R.string.faf);
                    }
                    textView2.setText(string2);
                }
                TextView textView3 = this.f115491c;
                if (textView3 != null) {
                    Aweme aweme4 = this.f113953L;
                    C89219l.m154716b(aweme4, "");
                    VideoMaskInfo reportMaskInfo3 = aweme4.getReportMaskInfo();
                    if (reportMaskInfo3 == null || (string = reportMaskInfo3.getCancelMaskLabel()) == null) {
                        string = this.f113959R.getString(R.string.fag);
                    }
                    textView3.setText(string);
                    textView3.setOnClickListener(new View$OnClickListenerC50128c(this));
                }
                View view2 = ((AbstractC50032a) this).f115489a;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                mo85270a("reportlayer_show");
                mo85271b("othershow");
                return;
            }
            return;
        }
        View view3 = ((AbstractC50032a) this).f115489a;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }
}
