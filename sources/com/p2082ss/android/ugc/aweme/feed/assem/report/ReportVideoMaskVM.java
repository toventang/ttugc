package com.p2082ss.android.ugc.aweme.feed.assem.report;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Audio;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49673ah;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49674b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.C33205b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.report.ReportVideoMaskVM */
public final class ReportVideoMaskVM extends FeedBaseViewModel<C48980h> {
    static {
        Covode.recordClassIndex(57740);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C48980h();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.ReportVideoMaskVM$b */
    static final class C48954b extends AbstractC89220m implements AbstractC89172b<C48980h, C48980h> {

        /* renamed from: a */
        final /* synthetic */ VideoItemParams f112856a;

        /* renamed from: b */
        final /* synthetic */ ReportVideoMaskVM f112857b;

        static {
            Covode.recordClassIndex(57743);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48954b(VideoItemParams videoItemParams, ReportVideoMaskVM reportVideoMaskVM) {
            super(1);
            this.f112856a = videoItemParams;
            this.f112857b = reportVideoMaskVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48980h invoke(C48980h hVar) {
            C48980h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            return this.f112857b.mo23372a((AbstractC12853j) hVar2, this.f112856a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.ReportVideoMaskVM$a */
    public static final class C48952a implements AbstractC88986z<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ ReportVideoMaskVM f112853a;

        /* renamed from: b */
        final /* synthetic */ Context f112854b;

        static {
            Covode.recordClassIndex(57741);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.ReportVideoMaskVM$a$a */
        static final class C48953a extends AbstractC89220m implements AbstractC89172b<C48980h, C48980h> {

            /* renamed from: a */
            public static final C48953a f112855a = new C48953a();

            static {
                Covode.recordClassIndex(57742);
            }

            C48953a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C48980h invoke(C48980h hVar) {
                C89219l.m154721d(hVar, "");
                return C48980h.m92147a(false, new VideoMaskInfo(null, null, null, null, null, null, 63, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            String errorMsg;
            C89219l.m154721d(th, "");
            if (th instanceof C34485a) {
                C34485a aVar = (C34485a) th;
                if (TextUtils.isEmpty(aVar.getErrorMsg())) {
                    errorMsg = this.f112854b.getString(R.string.dcn);
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
            Aweme aweme;
            Video video;
            String aid;
            BaseResponse baseResponse2 = baseResponse;
            String str = "";
            C89219l.m154721d(baseResponse2, str);
            if (baseResponse2.status_code == 0) {
                this.f112853a.mo20662a(C48953a.f112855a);
                VideoItemParams videoItemParams = (VideoItemParams) this.f112853a.mo23342g();
                Audio audio = null;
                if (videoItemParams != null) {
                    aweme = videoItemParams.mAweme;
                } else {
                    aweme = null;
                }
                if (aweme == null || !aweme.isAd()) {
                    AbstractC80747i O = C81079v.m140776O();
                    if (aweme != null) {
                        video = aweme.getVideo();
                        audio = aweme.getAudio();
                    } else {
                        video = null;
                    }
                    O.mo123923a(video, audio, false, true);
                } else if (C37699a.m76251aW(aweme)) {
                    AbstractC33208e a = C33205b.m68071a();
                    if (a != null) {
                        a.mo59097b();
                    }
                } else {
                    C81079v.m140776O().mo123950y();
                }
                if (!(aweme == null || (aid = aweme.getAid()) == null)) {
                    str = aid;
                }
                AbstractC81915c.m141874a(new C49673ah(false, str));
                AbstractC81915c.m141874a(new C49674b());
            }
        }

        C48952a(ReportVideoMaskVM reportVideoMaskVM, Context context) {
            this.f112853a = reportVideoMaskVM;
            this.f112854b = context;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.ReportVideoMaskVM$c */
    static final class C48955c extends AbstractC89220m implements AbstractC89172b<C48980h, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ReportVideoMaskVM f112858a;

        static {
            Covode.recordClassIndex(57744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48955c(ReportVideoMaskVM reportVideoMaskVM) {
            super(1);
            this.f112858a = reportVideoMaskVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C48980h hVar) {
            Aweme aweme;
            Aweme aweme2;
            String aid;
            C48980h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            if (hVar2.f112881a) {
                VideoItemParams videoItemParams = (VideoItemParams) this.f112858a.mo23342g();
                Aweme aweme3 = null;
                if (videoItemParams != null) {
                    aweme = videoItemParams.mAweme;
                } else {
                    aweme = null;
                }
                if (C80635y.m139811f(aweme)) {
                    ReportVideoMaskVM reportVideoMaskVM = this.f112858a;
                    VideoItemParams videoItemParams2 = (VideoItemParams) reportVideoMaskVM.mo23342g();
                    if (videoItemParams2 != null) {
                        aweme3 = videoItemParams2.mAweme;
                    }
                    if (C37699a.m76251aW(aweme3)) {
                        AbstractC33208e a = C33205b.m68071a();
                        if (a != null) {
                            a.mo59099c();
                        }
                    } else {
                        C81079v.m140776O().mo123908B();
                    }
                    VideoItemParams videoItemParams3 = (VideoItemParams) reportVideoMaskVM.mo23342g();
                    if (!(videoItemParams3 == null || (aweme2 = videoItemParams3.mAweme) == null || (aid = aweme2.getAid()) == null)) {
                        AbstractC81915c.m141874a(new C49673ah(true, aid));
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo80745a(String str) {
        String str2;
        Aweme aweme;
        Aweme aweme2;
        C89219l.m154721d(str, "");
        C33744d a = new C33744d().mo59983a("enter_from", this.f112231p);
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        String str3 = null;
        if (videoItemParams == null || (aweme2 = videoItemParams.mAweme) == null) {
            str2 = null;
        } else {
            str2 = aweme2.getAid();
        }
        C33744d a2 = a.mo59983a("group_id", str2);
        VideoItemParams videoItemParams2 = (VideoItemParams) mo23342g();
        if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null)) {
            str3 = aweme.getAuthorUid();
        }
        C39162r.m79460a(str, a2.mo59983a("author_id", str3).f79943a);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* renamed from: a */
    public final /* synthetic */ C48980h mo80488a(C48980h hVar, VideoItemParams videoItemParams) {
        VideoMaskInfo videoMaskInfo;
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        if (aweme != null) {
            videoMaskInfo = aweme.getReportMaskInfo();
        } else {
            videoMaskInfo = null;
        }
        return C48980h.m92147a(C80635y.m139812g(videoItemParams.mAweme), videoMaskInfo);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.AbstractC14529j
    /* renamed from: b */
    public final /* synthetic */ VideoItemParams mo23373b(AbstractC12853j jVar, VideoItemParams videoItemParams) {
        VideoMaskInfo videoMaskInfo;
        C48980h hVar = (C48980h) jVar;
        VideoItemParams videoItemParams2 = videoItemParams;
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(videoItemParams2, "");
        Aweme aweme = videoItemParams2.mAweme;
        if (aweme != null) {
            videoMaskInfo = aweme.getReportMaskInfo();
        } else {
            videoMaskInfo = null;
        }
        if (!C89219l.m154714a(videoMaskInfo, hVar.f112882b)) {
            Aweme aweme2 = videoItemParams2.mAweme;
            if (aweme2 != null) {
                aweme2.setReportMaskInfo(hVar.f112882b);
            }
            AwemeService.m70060b().mo60677a(videoItemParams2.mAweme);
        }
        return videoItemParams2;
    }

    /* renamed from: a */
    public final void mo80744a(Context context, String str) {
        Aweme aweme;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        AwemeRawAd awemeRawAd = null;
        if (videoItemParams != null) {
            aweme = videoItemParams.mAweme;
            if (aweme != null && !aweme.isAd()) {
                return;
            }
        } else {
            aweme = null;
        }
        C38182f.C38184b a = C38182f.m77418a();
        a.f90211a = "background_ad";
        a.f90212b = str;
        a.mo66504c("report_mask").mo66497b(aweme).mo66495a(context);
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        }
        C18129a.m33746a("background_ad", str, awemeRawAd).mo28900b("refer", "report_mask").mo28902c();
    }
}
