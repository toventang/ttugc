package com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3886a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.p033d.C0646a;
import com.C1764a;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24098m;
import com.google.p1998c.p1999a.C27252o;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.google.p1998c.p2006h.p2007a.C27659u;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.base.p2376g.C34588a;
import com.p2082ss.android.ugc.aweme.beauty.C34806c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2341au.C33975a;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.photo.p3546a.C62856b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.publish.p3612b.p3613a.C65512a;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3623c.C65630a;
import com.p2082ss.android.ugc.aweme.scheduler.C67295g;
import com.p2082ss.android.ugc.aweme.settings.C68743i;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C69893bo;
import com.p2082ss.android.ugc.aweme.shortvideo.C70003cp;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70620cw;
import com.p2082ss.android.ugc.aweme.shortvideo.C71798ef;
import com.p2082ss.android.ugc.aweme.shortvideo.C71813eq;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.C71818ev;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74088f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.C74086d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.C74087e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.C74089g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3887b.C74080a;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.HardcodeAdaptiveResult;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73914o;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73917r;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73920u;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73964ar;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73979bb;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74001bp;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.turbo.api.C79340b;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.aweme.utils.C80540hn;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84906m;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import dmt.p4542av.video.C88168aj;
import dmt.p4542av.video.C88278m;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.v.a.a */
public final class C74062a implements AbstractC74088f {

    /* renamed from: A */
    private AbstractFutureC27655q<C65616g> f166231A;

    /* renamed from: B */
    private long f166232B = 0;

    /* renamed from: C */
    private double f166233C;

    /* renamed from: D */
    private String f166234D;

    /* renamed from: E */
    private String f166235E;

    /* renamed from: a */
    public final String f166236a;

    /* renamed from: b */
    public C73914o f166237b;

    /* renamed from: c */
    final int f166238c;

    /* renamed from: d */
    final int f166239d;

    /* renamed from: e */
    final C70003cp f166240e = new C70003cp();

    /* renamed from: f */
    final AbstractC71893j f166241f;

    /* renamed from: g */
    public SynthetiseResult f166242g;

    /* renamed from: h */
    public final C0646a f166243h;

    /* renamed from: i */
    C65512a<C65616g> f166244i;

    /* renamed from: j */
    C65512a<C65616g> f166245j;

    /* renamed from: k */
    public final C74075c f166246k;

    /* renamed from: l */
    public final C70620cw f166247l;

    /* renamed from: m */
    public boolean f166248m = false;

    /* renamed from: n */
    public long f166249n = 0;

    /* renamed from: o */
    public long f166250o = 0;

    /* renamed from: p */
    public long f166251p = 0;

    /* renamed from: q */
    public long f166252q = 0;

    /* renamed from: r */
    public long f166253r = 0;

    /* renamed from: s */
    public boolean f166254s;

    /* renamed from: t */
    public boolean f166255t;

    /* renamed from: u */
    public C71813eq f166256u;

    /* renamed from: v */
    public final String f166257v;

    /* renamed from: w */
    public final boolean f166258w;

    /* renamed from: x */
    public final int f166259x;

    /* renamed from: y */
    public C65616g f166260y;

    /* renamed from: z */
    private C65512a<SynthetiseResult> f166261z;

    static {
        Covode.recordClassIndex(86814);
    }

    /* renamed from: a */
    static boolean m130241a(int i) {
        return i == 1;
    }

    public final String toString() {
        return "PublisherImpl2";
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.v.a.a$a */
    static class C74073a {

        /* renamed from: a */
        C27252o f166286a;

        static {
            Covode.recordClassIndex(86825);
        }

        C74073a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.v.a.a$b */
    public static class C74074b {

        /* renamed from: a */
        C27252o f166287a;

        static {
            Covode.recordClassIndex(86826);
        }

        C74074b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo116460a() {
            this.f166287a = C27252o.m54255b(C80540hn.f180153b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo116457a(String str) {
        if (!C63244g.m114602a().mo73255A().mo93901a()) {
            return false;
        }
        if (this.f166237b == null) {
            return true;
        }
        this.f166237b.onError(new C71818ev(new C74086d(toString() + "#" + str)));
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74088f
    /* renamed from: j */
    public final void mo116449j() {
        if (this.f166261z != null) {
            C67295g.m119228a("PublishParallel PublisherImpl2 pause");
            this.f166241f.mo113549a(this.f166237b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74088f
    /* renamed from: k */
    public final void mo116450k() {
        if (this.f166261z != null) {
            C67295g.m119228a("PublishParallel PublisherImpl2 resume");
            this.f166241f.mo113553b(this.f166237b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74088f
    /* renamed from: d */
    public final void mo116440d() {
        C67295g.m119228a("PublishParallel PublisherImpl2 cancel");
        C70005cr.m123611a();
        boolean g = C70005cr.m123616g();
        C84911q.m145928d("Publisher cancelSynthetise publishing:".concat(String.valueOf(g)));
        if (g) {
            C39162r.m79460a("user_cancel_publish", new C84425b().mo129406a("publish_id", this.f166257v).mo129403a("video_type", this.f166238c).mo129403a("video_upload_type", this.f166239d).mo129406a("cancel_step", "user").f188764a);
            this.f166243h.mo2676b();
            C70005cr.m123611a().mo110449a(10);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.v.a.a$c */
    class C74075c {

        /* renamed from: a */
        AbstractC71893j f166288a;

        /* renamed from: b */
        int f166289b;

        /* renamed from: c */
        String f166290c;

        /* renamed from: d */
        int f166291d;

        /* renamed from: e */
        long f166292e;

        /* renamed from: f */
        C27252o f166293f;

        static {
            Covode.recordClassIndex(86827);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo116461a(boolean z) {
            C84911q.m145921a("PublishDurationMonitor LOG_START");
            this.f166293f = C27252o.m54255b(C80540hn.f180153b);
            this.f166292e = SystemClock.uptimeMillis();
            C39162r.m79460a("click_publish_button", new C84425b().mo129403a("compose_finish", z ? 1 : 0).f188764a);
        }

        C74075c(AbstractC71893j jVar, int i, String str, int i2) {
            this.f166288a = jVar;
            this.f166289b = i;
            this.f166290c = str;
            this.f166291d = i2;
        }
    }

    /* renamed from: a */
    public static void m130240a(Throwable th) {
        try {
            C34611o.m70668a("aweme_upload_video_funnel", new C33743c().mo59976a(StringSet.type, "pure_exception").mo59976a("exception", Log.getStackTraceString(th)).mo59977a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C33743c mo116452a(C33743c cVar) {
        if (cVar == null) {
            cVar = new C33743c();
        }
        cVar.mo59974a("video_type", Integer.valueOf(this.f166238c)).mo59976a("item_type", this.f166241f.getClass().getSimpleName());
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74088f
    /* renamed from: a */
    public final void mo116434a(final BaseShortVideoContext baseShortVideoContext) {
        this.f166241f.f161077c = 0;
        this.f166247l.mo111421a("startPublish()");
        C80510gr.m139548f(this.f166257v);
        this.f166241f.mo113547a();
        this.f166248m = true;
        C65512a<SynthetiseResult> aVar = this.f166261z;
        if (aVar == null) {
            this.f166247l.mo111421a("startPublish() synthetise()");
            m130243c(baseShortVideoContext, 0);
            this.f166246k.mo116461a(false);
            return;
        }
        boolean isDone = aVar.isDone();
        if (isDone) {
            this.f166247l.mo111421a("synthetise() already done");
        } else {
            this.f166247l.mo111421a("synthetise() not finished.");
        }
        this.f166246k.mo116461a(isDone);
        C27646l.m55298a(this.f166261z, new AbstractC27645k<SynthetiseResult>() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3886a.C74062a.C740631 */

            static {
                Covode.recordClassIndex(86815);
            }

            @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
            public final void onFailure(Throwable th) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
            public final /* synthetic */ void onSuccess(SynthetiseResult synthetiseResult) {
                if (!C74062a.this.f166243h.mo2675a()) {
                    C74062a.this.mo116458b(baseShortVideoContext, 0);
                }
            }
        }, ExecutorC34605m.f81660a);
    }

    /* renamed from: b */
    private void m130242b(BaseShortVideoContext baseShortVideoContext) {
        String e;
        String str;
        String str2;
        C79340b.m138147a().videoComposeStart();
        this.f166249n = SystemClock.uptimeMillis();
        int b = C74089g.m130288b(C40963b.m82473a());
        C84425b bVar = new C84425b();
        if (this.f166238c == 0) {
            e = ((VideoPublishEditModel) baseShortVideoContext).getVideoResolution();
        } else if ("upload".equals(this.f166235E)) {
            e = C65357b.m117050f();
        } else {
            e = C65357b.m117049e();
        }
        C84425b a = bVar.mo129406a("resolution", e);
        String str3 = "0";
        if (C65357b.m117043a()) {
            str = "1";
        } else {
            str = str3;
        }
        C84425b a2 = a.mo129406a("is_hardcode", str).mo129406a("bite_rate", new StringBuilder().append(C65357b.m117047c()).toString()).mo129406a("video_quality", new StringBuilder().append(C65357b.m117048d()).toString()).mo129406a("_perf_monitor", "1").mo129406a("publish_id", this.f166257v).mo129403a("pre_publish_type", this.f166259x).mo129403a("publish_type", this.f166259x);
        if (C74087e.m130277a()) {
            str2 = "1";
        } else {
            str2 = str3;
        }
        C84425b a3 = a2.mo129406a("user_enable_pre_publish", str2);
        if (C63244g.m114602a().mo73277e().getEnablePreUploadByUser(false)) {
            str3 = "1";
        }
        a3.mo129406a("feature_enable_pre_publish", str3).mo129403a("total_available_memory_mb", b - C74089g.m130291d()).mo129405a("total_available_memory_percentage", Float.valueOf(C74089g.m130283a(b))).mo129403a("total_memory_mb", b).mo129403a("jvm_allow_memory_mb", C74089g.m130284a()).mo129403a("jvm_available_memory_mb", C74089g.m130284a() - C74089g.m130287b()).mo129405a("jvm_available_memory_percentage", Float.valueOf(C74089g.m130289c())).mo129406a("fps", new StringBuilder().append(this.f166233C).toString());
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            bVar.mo129403a("source_duration", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength());
            if (!TextUtils.isEmpty(videoPublishEditModel.mShootWay) && !TextUtils.isEmpty(videoPublishEditModel.clientId) && !TextUtils.isEmpty(videoPublishEditModel.shareId)) {
                bVar.mo129406a("channel", videoPublishEditModel.clientId);
                bVar.mo129406a("shoot_way", videoPublishEditModel.mShootWay);
                bVar.mo129406a("open_platform_share_id", videoPublishEditModel.shareId);
            }
            HardcodeAdaptiveResult hardcodeAdaptiveResult = videoPublishEditModel.hardcodeAdaptiveResult;
            if (hardcodeAdaptiveResult != null) {
                bVar.mo129405a("hw_opt_bitrate_set_result", Float.valueOf(hardcodeAdaptiveResult.getHwOptBitrate()));
                bVar.mo129405a("pre_bitrate_status", Float.valueOf(hardcodeAdaptiveResult.getPreBitrateStatus()));
            }
        }
        C39162r.m79460a("video_compose_start", bVar.f188764a);
        this.f166232B = C80540hn.f180153b.mo45347a();
        C84911q.m145928d("Publisher uploadSynthetiseStartEvent");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74088f
    /* renamed from: a */
    public final void mo116435a(BaseShortVideoContext baseShortVideoContext, int i) {
        this.f166241f.f161077c = i;
        this.f166247l.mo111421a("prePublish() publishType:".concat(String.valueOf(i)));
        if (this.f166261z == null) {
            m130243c(baseShortVideoContext, i);
        }
        mo116458b(baseShortVideoContext, i);
    }

    /* renamed from: c */
    private void m130243c(final BaseShortVideoContext baseShortVideoContext, final int i) {
        int i2;
        C67295g.m119228a("PublishParallel PublisherImpl2 synthetise start");
        if (this.f166238c == 0) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            this.f166233C = (double) videoPublishEditModel.videoFps();
            this.f166234D = videoPublishEditModel.creationId;
            i2 = videoPublishEditModel.videoEditorType;
        } else {
            i2 = -1;
        }
        this.f166235E = C62856b.m113272a(this.f166238c, baseShortVideoContext);
        C80510gr.m139539b(this.f166257v, C1764a.m5929a(Locale.US, "id:%s vt:%d ut:%d et:%d", new Object[]{this.f166257v, Integer.valueOf(this.f166238c), Integer.valueOf(this.f166239d), Integer.valueOf(i2)}));
        C70005cr.m123611a().mo110449a(2);
        C73917r.m130009a(this.f166234D, C62856b.m113273b(this.f166238c));
        C65512a<SynthetiseResult> b = this.f166241f.mo113551b(baseShortVideoContext);
        m130242b(baseShortVideoContext);
        this.f166261z = b;
        C39162r.m79460a("av_memory_log", new C84425b().mo129406a("scene", "start_synthetise").mo129406a("shoot_way", this.f166236a).mo129404a("dalvikPss", C73964ar.f166038a.f166040c).mo129404a("nativePss", C73964ar.f166038a.f166041d).mo129404a("otherPss", C73964ar.f166038a.f166043f).mo129404a("totalPss", C73964ar.f166038a.f166042e).f188764a);
        C27646l.m55298a(b, new AbstractC27645k<SynthetiseResult>() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3886a.C74062a.C740663 */

            static {
                Covode.recordClassIndex(86818);
            }

            @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
            public final void onFailure(Throwable th) {
                C80510gr.m139528a(C74062a.this.f166257v, C65630a.m117453b(th), th.getMessage());
                C74062a.this.f166247l.mo111421a("synthetise failed");
                C39162r.m79460a("av_memory_log", new C84425b().mo129406a("scene", "failed_synthetise").mo129406a("shoot_way", C74062a.this.f166236a).mo129406a("synthetise_start", "failed").mo129404a("dalvikPss", C73964ar.f166038a.f166040c).mo129404a("nativePss", C73964ar.f166038a.f166041d).mo129404a("otherPss", C73964ar.f166038a.f166043f).mo129404a("totalPss", C73964ar.f166038a.f166042e).f188764a);
                C70005cr.m123611a().mo110449a(9);
                if (C74062a.this.f166248m) {
                    C74062a.this.mo116456a(false, th, "homepage_follow", baseShortVideoContext, null);
                } else {
                    C74062a.this.mo116456a(false, th, "video_post_page", baseShortVideoContext, null);
                }
                if (C74062a.this.f166237b != null) {
                    C74062a.this.f166237b.onError(new C71818ev(th));
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
            public final /* synthetic */ void onSuccess(SynthetiseResult synthetiseResult) {
                String str;
                SynthetiseResult synthetiseResult2 = synthetiseResult;
                if (synthetiseResult2 != null) {
                    str = "encode:" + synthetiseResult2.synthetiseCPUEncode;
                    C70005cr.m123611a().f156495o = synthetiseResult2.outputFile;
                } else {
                    str = "";
                }
                C80510gr.m139544c(C74062a.this.f166257v, str);
                try {
                    if (C74062a.this.f166248m) {
                        C74062a.this.mo116456a(true, null, "homepage_follow", baseShortVideoContext, synthetiseResult2);
                    } else {
                        C74062a.this.mo116456a(true, null, "video_post_page", baseShortVideoContext, synthetiseResult2);
                    }
                    C39162r.m79460a("av_memory_log", new C84425b().mo129406a("scene", "success_synthetise").mo129406a("shoot_way", C74062a.this.f166236a).mo129406a("synthetise_start", "success").mo129404a("dalvikPss", C73964ar.f166038a.f166040c).mo129404a("nativePss", C73964ar.f166038a.f166041d).mo129404a("otherPss", C73964ar.f166038a.f166043f).mo129404a("totalPss", C73964ar.f166038a.f166042e).f188764a);
                    C74062a.this.f166242g = synthetiseResult2;
                    C74062a.this.f166247l.mo111421a("synthetise() finished, result = ".concat(String.valueOf(synthetiseResult2)));
                    if (!C74062a.this.f166243h.mo2675a()) {
                        C74062a.this.mo116458b(baseShortVideoContext, i);
                    }
                } catch (Exception e) {
                    C34611o.m70668a("aweme_synthetise_error_log", new C33743c().mo59976a("exception", C24098m.m45633c(e)).mo59977a());
                }
            }
        }, C27659u.EnumC27662a.INSTANCE);
        b.mo104629b(new RunnableC74076b(this, b), C27659u.EnumC27662a.INSTANCE);
        C27646l.m55298a(b, new AbstractC27645k<SynthetiseResult>() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3886a.C74062a.C740674 */

            static {
                Covode.recordClassIndex(86819);
            }

            @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
            public final void onFailure(Throwable th) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
            public final /* synthetic */ void onSuccess(SynthetiseResult synthetiseResult) {
                SynthetiseResult synthetiseResult2 = synthetiseResult;
                if (!C74062a.this.f166243h.mo2675a() && synthetiseResult2 != null && C74062a.this.f166237b != null && synthetiseResult2.outputFile != null) {
                    C74062a.this.f166237b.onSynthetiseSuccess(synthetiseResult2.outputFile);
                }
            }
        }, ExecutorC34605m.f81660a);
    }

    /* renamed from: b */
    public final void mo116458b(final BaseShortVideoContext baseShortVideoContext, final int i) {
        if (!mo116457a("createVideo")) {
            if (this.f166231A == null) {
                AbstractFutureC27655q<C65616g> c = this.f166241f.mo113555c(baseShortVideoContext);
                this.f166231A = c;
                if (c != null) {
                    this.f166247l.mo111421a("createVideo() synthetiseResult = " + this.f166242g);
                    final C74074b bVar = new C74074b();
                    bVar.mo116460a();
                    C27646l.m55298a(this.f166231A, new AbstractC27645k<C65616g>() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3886a.C74062a.C740685 */

                        static {
                            Covode.recordClassIndex(86820);
                        }

                        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                        public final void onFailure(Throwable th) {
                            int a = C65630a.m117450a(th, 11);
                            if (!C80422fe.m139425a(C63247i.f143610a)) {
                                a = -2;
                            }
                            C80510gr.m139529a(C74062a.this.f166257v, a, C65630a.m117455d(th), th.getMessage());
                            C74062a.this.f166247l.mo111421a("create video failed.");
                            C84911q.m145924a(th);
                            C70005cr.m123611a().mo110449a(9);
                            if (C74062a.this.f166237b != null) {
                                C74062a.this.f166237b.onError(new C71818ev(th));
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                        public final /* synthetic */ void onSuccess(C65616g gVar) {
                            C80510gr.m139546d(C74062a.this.f166257v, C74001bp.m130145a(gVar));
                            C74074b bVar = bVar;
                            if (bVar.f166287a.f64413a) {
                                bVar.f166287a.mo45341c();
                                C39162r.m79460a("get_video_key", new C84425b().mo129406a("duration", C1764a.m5929a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) bVar.f166287a.mo45339a(TimeUnit.NANOSECONDS)) / 1.0E9f)})).f188764a);
                            }
                            C74062a.this.f166247l.mo111421a("create video finished.");
                        }
                    }, ExecutorC34605m.f81660a);
                    C39162r.m79460a("publish_start", new C84425b().mo129406a("shoot_entrance", this.f166236a).mo129406a("is_photo", "0").f188764a);
                } else {
                    return;
                }
            }
            C27646l.m55298a(this.f166231A, new AbstractC27645k<C65616g>() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3886a.C74062a.C740696 */

                static {
                    Covode.recordClassIndex(86821);
                }

                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final void onFailure(Throwable th) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final /* synthetic */ void onSuccess(C65616g gVar) {
                    boolean z;
                    C65616g gVar2 = gVar;
                    C74062a.this.f166260y = gVar2;
                    int i = i;
                    if (i != 1) {
                        C74062a aVar = C74062a.this;
                        BaseShortVideoContext baseShortVideoContext = baseShortVideoContext;
                        if (i != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!aVar.mo116457a("uploadVideo")) {
                            C67295g.m119228a("PublishParallel PublisherImpl2 uploadVideo start");
                            if (aVar.f166244i == null) {
                                aVar.f166247l.mo111421a("uploadVideo() synthetiseResult = " + aVar.f166242g);
                                aVar.f166251p = SystemClock.uptimeMillis();
                                if (!C74062a.m130241a(aVar.f166239d)) {
                                    aVar.f166256u = new C71813eq(baseShortVideoContext, aVar.f166241f, aVar.f166238c, null, aVar.f166257v, aVar.f166259x);
                                    aVar.f166256u.mo113473a(true, null);
                                    try {
                                        String stackTraceString = Log.getStackTraceString(new Exception());
                                        C33975a.f80359a.mo61044a("upload_video_start");
                                        C34611o.m70668a("aweme_upload_video_funnel", aVar.mo116452a((C33743c) null).mo59976a(StringSet.type, "upload_video_start").mo59976a("extra", C33975a.f80359a.mo61045a()).mo59976a("stack_trace", stackTraceString).mo59977a());
                                        aVar.mo116453a("upload_video_start", stackTraceString);
                                    } catch (Exception e) {
                                        C74062a.m130240a(e);
                                    }
                                }
                                aVar.f166244i = aVar.f166241f.mo113546a(baseShortVideoContext, gVar2);
                                C27646l.m55298a(aVar.f166244i, new AbstractC27645k<C65616g>(baseShortVideoContext, gVar2) {
                                    /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3886a.C74062a.C740707 */

                                    /* renamed from: a */
                                    final /* synthetic */ BaseShortVideoContext f166280a;

                                    /* renamed from: b */
                                    final /* synthetic */ C65616g f166281b;

                                    static {
                                        Covode.recordClassIndex(86822);
                                    }

                                    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                                    public final void onFailure(Throwable th) {
                                        String str;
                                        int c = C65630a.m117454c(th);
                                        String str2 = C74062a.this.f166257v;
                                        if (th.getMessage() != null) {
                                            str = th.getMessage();
                                        } else {
                                            str = "";
                                        }
                                        C80510gr.m139538b(str2, c, str);
                                        try {
                                            C74062a.this.mo116454a(false, new C33743c().mo59976a("throwable", Log.getStackTraceString(th)).mo59976a("args", C63238c.f143575b.mo46674b(this.f166280a)).mo59976a("result", C63238c.f143575b.mo46674b(this.f166281b)));
                                        } catch (Exception e) {
                                            C74062a.m130240a(e);
                                        }
                                        C70005cr.m123611a().mo110449a(9);
                                        C74062a.this.mo116455a(false, th.toString(), this.f166281b);
                                        if (C74062a.this.f166237b != null) {
                                            C74062a.this.f166237b.onError(new C71818ev(th, C65630a.m117451a(c)));
                                        }
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                                    public final /* synthetic */ void onSuccess(C65616g gVar) {
                                        C80510gr.m139545d(C74062a.this.f166257v);
                                        try {
                                            C74062a.this.mo116454a(true, new C33743c().mo59976a("resultCode", C63238c.f143575b.mo46674b(gVar)).mo59976a("args", C63238c.f143575b.mo46674b(this.f166280a)).mo59976a("result", C63238c.f143575b.mo46674b(this.f166281b)));
                                        } catch (Exception e) {
                                            C74062a.m130240a(e);
                                        }
                                        C74062a.this.mo116455a(true, "", this.f166281b);
                                    }

                                    {
                                        this.f166280a = r2;
                                        this.f166281b = r3;
                                    }
                                }, ExecutorC34605m.f81660a);
                            }
                            if (!z) {
                                C27646l.m55298a(aVar.f166244i, new AbstractC27645k<C65616g>(baseShortVideoContext) {
                                    /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3886a.C74062a.C740718 */

                                    /* renamed from: a */
                                    final /* synthetic */ BaseShortVideoContext f166283a;

                                    static {
                                        Covode.recordClassIndex(86823);
                                    }

                                    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                                    public final void onFailure(Throwable th) {
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                                    public final /* synthetic */ void onSuccess(C65616g gVar) {
                                        C65616g gVar2 = gVar;
                                        C74062a aVar = C74062a.this;
                                        BaseShortVideoContext baseShortVideoContext = this.f166283a;
                                        if (!aVar.mo116457a("uploadCoverTextImage")) {
                                            if (aVar.f166245j == null) {
                                                aVar.f166245j = aVar.f166241f.mo113552b(baseShortVideoContext, aVar.f166260y);
                                                C27646l.m55298a(aVar.f166245j, new AbstractC27645k<C65616g>() {
                                                    /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3886a.C74062a.C740729 */

                                                    static {
                                                        Covode.recordClassIndex(86824);
                                                    }

                                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                                                    public final /* synthetic */ void onSuccess(C65616g gVar) {
                                                        String str = C74062a.this.f166257v;
                                                        C89219l.m154721d(str, "");
                                                        C80510gr.m139531a(str, BehaviorType.SUCCESS, "CT", null, null, 24);
                                                    }

                                                    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                                                    public final void onFailure(Throwable th) {
                                                        String str;
                                                        String str2 = C74062a.this.f166257v;
                                                        if (th.getMessage() != null) {
                                                            str = th.getMessage();
                                                        } else {
                                                            str = "";
                                                        }
                                                        C89219l.m154721d(str2, "");
                                                        C89219l.m154721d(str, "");
                                                        C80510gr.m139530a(str2, BehaviorType.FAILED, "CT", "0", str);
                                                        if (C74062a.this.f166237b != null) {
                                                            C74062a.this.f166237b.onError(new C71818ev(th, C65630a.m117451a(C65630a.m117454c(th))));
                                                        }
                                                    }
                                                }, ExecutorC34605m.f81660a);
                                                aVar.f166245j.mo104629b(new RunnableC74078d(aVar), ExecutorC34605m.f81660a);
                                            }
                                            C27646l.m55298a(aVar.f166245j, new AbstractC27645k<C65616g>(gVar2, baseShortVideoContext) {
                                                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3886a.C74062a.C7406410 */

                                                /* renamed from: a */
                                                final /* synthetic */ C65616g f166264a;

                                                /* renamed from: b */
                                                final /* synthetic */ BaseShortVideoContext f166265b;

                                                static {
                                                    Covode.recordClassIndex(86816);
                                                }

                                                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                                                public final void onFailure(Throwable th) {
                                                }

                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                                                public final /* synthetic */ void onSuccess(C65616g gVar) {
                                                    C65616g gVar2 = gVar;
                                                    C84911q.m145928d(this + " onUploadCoverTextImageSuccess");
                                                    if (gVar2 != null) {
                                                        this.f166264a.f147919h = gVar2.f147919h;
                                                    }
                                                    C74062a aVar = C74062a.this;
                                                    BaseShortVideoContext baseShortVideoContext = this.f166265b;
                                                    C65616g gVar3 = this.f166264a;
                                                    if (!aVar.mo116457a("createAweme")) {
                                                        aVar.f166247l.mo111421a("createAweme() synthetiseResult = " + aVar.f166242g + " \nargs " + baseShortVideoContext);
                                                        if (aVar.f166237b != null) {
                                                            aVar.f166237b.onProgressUpdate(aVar.f166240e.mo110445a(3, 0), false);
                                                        }
                                                        C74073a aVar2 = new C74073a();
                                                        aVar2.f166286a = C27252o.m54255b(C80540hn.f180153b);
                                                        C27646l.m55298a(aVar.f166241f.mo113544a(baseShortVideoContext, gVar3, aVar.f166242g), new AbstractC27645k<C69831ai>(baseShortVideoContext, gVar3, aVar2) {
                                                            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3886a.C74062a.C740652 */

                                                            /* renamed from: a */
                                                            final /* synthetic */ BaseShortVideoContext f166267a;

                                                            /* renamed from: b */
                                                            final /* synthetic */ C65616g f166268b;

                                                            /* renamed from: c */
                                                            final /* synthetic */ C74073a f166269c;

                                                            static {
                                                                Covode.recordClassIndex(86817);
                                                            }

                                                            @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                                                            public final void onFailure(Throwable th) {
                                                                int a = C65630a.m117450a(th, 13);
                                                                if (!C80422fe.m139425a(C63247i.f143610a)) {
                                                                    a = -2;
                                                                }
                                                                C80510gr.m139543c(C74062a.this.f166257v, a, C65630a.m117455d(th));
                                                                C70005cr.m123611a().mo110449a(9);
                                                                if (C74062a.this.f166237b != null) {
                                                                    C74062a.this.f166237b.onError(new C71818ev(th));
                                                                }
                                                            }

                                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                            @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                                                            public final /* synthetic */ void onSuccess(C69831ai aiVar) {
                                                                String str;
                                                                C69831ai aiVar2 = aiVar;
                                                                C74062a.this.f166253r = SystemClock.uptimeMillis();
                                                                if (!(C74062a.this.f166242g == null || C74062a.this.f166242g.outputVideoFileInfo == null)) {
                                                                    aiVar2.realVideoHeight = C74062a.this.f166242g.outputVideoFileInfo.getHeight();
                                                                    aiVar2.realVideoWidth = C74062a.this.f166242g.outputVideoFileInfo.getWidth();
                                                                }
                                                                BaseShortVideoContext baseShortVideoContext = this.f166267a;
                                                                if ((baseShortVideoContext instanceof VideoPublishEditModel) && ((VideoPublishEditModel) baseShortVideoContext).mShoutOutsData != null) {
                                                                    aiVar2.shoutoutData = ((VideoPublishEditModel) this.f166267a).mShoutOutsData;
                                                                    C74418d dVar = ((VideoPublishEditModel) this.f166267a).mShoutOutsData;
                                                                    if (C74418d.MODE_CREATE.equals(dVar.getShoutOutsMode()) || C74418d.MODE_EDIT.equals(dVar.getShoutOutsMode())) {
                                                                        aiVar2.shoutOutsType = 1;
                                                                    }
                                                                    if (C74418d.MODE_SEND.equals(dVar.getShoutOutsMode())) {
                                                                        aiVar2.shoutOutsType = 2;
                                                                    }
                                                                }
                                                                C80510gr.m139547e(C74062a.this.f166257v);
                                                                aiVar2.materialId = this.f166268b.f147920i;
                                                                C63238c.f143593t.mo93791a("mus_af_post_video");
                                                                C74073a aVar = this.f166269c;
                                                                if (aVar.f166286a.f64413a) {
                                                                    aVar.f166286a.mo45341c();
                                                                    C39162r.m79460a("url_upload", new C84425b().mo129406a("duration", C1764a.m5929a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) aVar.f166286a.mo45339a(TimeUnit.NANOSECONDS)) / 1.0E9f)})).f188764a);
                                                                }
                                                                if (C74062a.this.f166237b != null) {
                                                                    C70005cr.m123611a().mo110449a(10);
                                                                    C74062a.this.f166237b.onSuccess(aiVar2, false);
                                                                    C74075c cVar = C74062a.this.f166246k;
                                                                    BaseShortVideoContext baseShortVideoContext2 = this.f166267a;
                                                                    boolean z = C74062a.this.f166255t;
                                                                    boolean z2 = C74062a.this.f166254s;
                                                                    if (cVar.f166293f.f64413a) {
                                                                        C84911q.m145921a("PublishDurationMonitor LOG_END");
                                                                        long a = cVar.f166293f.mo45339a(TimeUnit.MILLISECONDS);
                                                                        C34611o.m70668a("type_av_compose_upload", new C33743c().mo59973a("speed", Float.valueOf((((float) cVar.f166288a.mo113557d(baseShortVideoContext2)) * 1.0f) / ((float) a))).mo59975a("processTime", Long.valueOf(a)).mo59977a());
                                                                        C74080a.m130261a(baseShortVideoContext2, cVar.f166291d, a, cVar.f166289b, cVar.f166290c, C74062a.this.f166250o, C74062a.this.f166249n, C74062a.this.f166252q, C74062a.this.f166251p, C74062a.this.f166253r, cVar.f166292e, z, C74062a.this.f166258w, C74062a.this.f166259x, z2, C74062a.this.f166242g, cVar.f166288a, C74062a.this.f166256u);
                                                                        C84911q.m145928d("PublishDurationMonitor publish_finish ".concat(String.valueOf(a)));
                                                                        if (C68743i.m121176a()) {
                                                                            C33743c a2 = new C33743c().mo59974a("video_type", Integer.valueOf(cVar.f166291d));
                                                                            if (C74062a.this.f166258w) {
                                                                                str = "1";
                                                                            } else {
                                                                                str = "0";
                                                                            }
                                                                            C12290b.m22060a("user_publish_success_rate_parallel", 0, a2.mo59976a("retry_publish", str).mo59974a("video_upload_type", Integer.valueOf(cVar.f166289b)).mo59977a());
                                                                        }
                                                                        cVar.f166293f.mo45341c();
                                                                    }
                                                                }
                                                            }

                                                            {
                                                                this.f166267a = r2;
                                                                this.f166268b = r3;
                                                                this.f166269c = r4;
                                                            }
                                                        }, ExecutorC34605m.f81660a);
                                                    }
                                                }

                                                {
                                                    this.f166264a = r2;
                                                    this.f166265b = r3;
                                                }
                                            }, ExecutorC34605m.f81660a);
                                        }
                                    }

                                    {
                                        this.f166283a = r2;
                                    }
                                }, ExecutorC34605m.f81660a);
                                aVar.f166244i.mo104629b(new RunnableC74077c(aVar), ExecutorC34605m.f81660a);
                            }
                        }
                    }
                }
            }, ExecutorC34605m.f81660a);
            if (i == 0) {
                this.f166255t = this.f166241f.mo113558e(baseShortVideoContext);
                C73914o oVar = this.f166237b;
                if (oVar != null) {
                    oVar.onProgressUpdate(this.f166240e.mo110445a(2, 0), false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0064, code lost:
        if (r4 != null) goto L_0x001b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116453a(java.lang.String r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3886a.C74062a.mo116453a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo116454a(boolean z, C33743c cVar) {
        String str;
        int i;
        try {
            String stackTraceString = Log.getStackTraceString(new Exception());
            C33975a.f80359a.mo61044a("upload_video_end");
            C34588a aVar = C33975a.f80359a;
            StringBuilder sb = new StringBuilder("upload_video_end");
            if (z) {
                str = "_success";
            } else {
                str = "_failure";
            }
            aVar.mo61044a(sb.append(str).toString());
            C33743c a = mo116452a(cVar).mo59976a(StringSet.type, "upload_video_end");
            if (z) {
                i = 0;
            } else {
                i = 1;
            }
            C34611o.m70668a("aweme_upload_video_funnel", a.mo59974a("status", Integer.valueOf(i)).mo59976a("extra", C33975a.f80359a.mo61045a()).mo59976a("stack_trace", stackTraceString).mo59977a());
            mo116453a("upload_video_end", stackTraceString);
        } catch (Exception e) {
            m130240a(e);
        }
    }

    /* renamed from: a */
    public final void mo116455a(boolean z, String str, C65616g gVar) {
        this.f166252q = SystemClock.uptimeMillis();
        if (!m130241a(this.f166239d)) {
            C65611c cVar = null;
            if (gVar instanceof C65611c) {
                cVar = (C65611c) gVar;
            }
            this.f166256u.mo113472a(z, str, null, true, cVar);
        }
    }

    /* renamed from: a */
    public final void mo116456a(boolean z, Throwable th, String str, BaseShortVideoContext baseShortVideoContext, SynthetiseResult synthetiseResult) {
        long j;
        String str2;
        String th2;
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        String str3;
        CompileProbeResult.ResultData data;
        this.f166250o = SystemClock.uptimeMillis();
        long j3 = 0;
        if (this.f166232B > 0) {
            j = C80540hn.f180153b.mo45347a() - this.f166232B;
        } else {
            j = 0;
        }
        this.f166232B = j;
        Locale locale = Locale.US;
        double d = (double) this.f166232B;
        Double.isNaN(d);
        int i5 = 0;
        String a = C1764a.m5929a(locale, "%d", new Object[]{Integer.valueOf((int) (d / 1000000.0d))});
        C84425b a2 = new C84425b().mo129406a("duration", a).mo129406a("status", String.valueOf(z ? 1 : 0));
        if (C65357b.m117043a()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C84425b a3 = a2.mo129406a("is_hardcode", str2).mo129406a("bite_rate", new StringBuilder().append(C65357b.m117047c()).toString()).mo129406a("video_quality", new StringBuilder().append(C65357b.m117048d()).toString()).mo129406a("_perf_monitor", "1").mo129406a("fps", new StringBuilder().append(this.f166233C).toString()).mo129406a("publish_id", this.f166257v).mo129403a("is_hd_setting", C88278m.m153408a(baseShortVideoContext) ? 1 : 0).mo129406a("current_page", str);
        if (th == null) {
            th2 = null;
        } else {
            th2 = th.toString();
        }
        a3.mo129406a("fail_info", th2);
        if (th instanceof C71798ef) {
            a3.mo129406a("error_code", new StringBuilder().append(((C71798ef) th).getCode()).toString());
        }
        if (this.f166238c == 0) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            String str4 = "";
            if (C84902i.m145892a(videoPublishEditModel.mOutputFile)) {
                j3 = C84896h.m145876i(videoPublishEditModel.mOutputFile);
                if (synthetiseResult == null || synthetiseResult.outputVideoFileInfo == null) {
                    i2 = C88168aj.m153239c(videoPublishEditModel.mOutputFile);
                    j2 = -1;
                    i3 = -1;
                    i = -1;
                } else {
                    i2 = synthetiseResult.outputVideoFileInfo.getBitrate();
                    str4 = synthetiseResult.outputVideoFileInfo.getResolution();
                    j2 = synthetiseResult.outputVideoFileInfo.getDuration();
                    i3 = synthetiseResult.outputVideoFileInfo.getCodecType();
                    i = synthetiseResult.outputVideoFileInfo.getGop();
                }
            } else {
                j2 = -1;
                i = -1;
                i2 = 0;
                i3 = -1;
            }
            if (!(videoPublishEditModel.compileProbeResult == null || (data = videoPublishEditModel.compileProbeResult.getData()) == null)) {
                a3.mo129405a("pre_psnr", Float.valueOf(data.getPsnr())).mo129403a("pre_encoder_type", data.getEncoderType()).mo129403a("pre_encode_width", data.getEncodeWidth()).mo129403a("pre_encode_height", data.getEncodeHeight()).mo129403a("pre_max_bitrate", data.getMaxBitrate()).mo129403a("pre_preset", data.getPreset()).mo129403a("pre_crf", data.getCrf()).mo129403a("pre_gop", data.getGop()).mo129405a("pre_qpoffset", Double.valueOf(data.getQpoffset())).mo129403a("pre_optimize_crf", data.getOptimizeCrf());
            }
            if (videoPublishEditModel.hardcodeAdaptiveResult != null) {
                a3.mo129405a("hw_opt_bitrate_set_result", Float.valueOf(videoPublishEditModel.hardcodeAdaptiveResult.getHwOptBitrate()));
                a3.mo129405a("pre_bitrate_status", Float.valueOf(videoPublishEditModel.hardcodeAdaptiveResult.getPreBitrateStatus()));
            }
            int[] a4 = C73979bb.m130117a(videoPublishEditModel.getPreviewInfo());
            if (a4 != null) {
                i4 = a4[8];
            } else {
                i4 = -1;
            }
            C89378p<Integer, Integer> a5 = C84906m.m145912a(videoPublishEditModel);
            int i6 = 1;
            if (a5.getFirst().intValue() + a5.getSecond().intValue() <= 1) {
                if (a5.getFirst().intValue() + a5.getSecond().intValue() == 1) {
                    i6 = 0;
                } else {
                    i6 = -1;
                }
            }
            this.f166254s = videoPublishEditModel.isSyntheticHardEncode;
            if (videoPublishEditModel.isSyntheticHardEncode) {
                str3 = "hardcoding";
            } else {
                str3 = "softcoding";
            }
            i5 = 0;
            a3.mo129406a("compose_coding", str3).mo129403a("file_bitrate", i2).mo129406a("resolution", str4).mo129404a("file_duration_ms", j2).mo129403a("codec_type", i3).mo129403a("gop", i).mo129403a("source_codec_type", i4).mo129403a("is_multi_content", i6).mo129406a("original_resolution", C70976bp.m125319o(videoPublishEditModel)).mo129406a("file_size", C1764a.m5929a(Locale.US, "%d", new Object[]{Long.valueOf(j3 / 1024)}));
            if (C80720e.m139927b(videoPublishEditModel.getLocalTempPath())) {
                j3 += new File(videoPublishEditModel.getLocalTempPath()).length();
            }
            if (videoPublishEditModel.getLocalFinalPath() != null) {
                j3 += C84896h.m145876i(videoPublishEditModel.getLocalFinalPath());
            }
            C73917r.m130008a(this.f166234D, j3);
            C73920u.C73921a a6 = C73917r.m130006a();
            if (a6 != null) {
                a3.mo129403a("init_available_size_mb", (int) a6.f165958a).mo129403a("max_publish_usage_mb", (int) a6.f165959b).mo129406a("available_size_detail", a6.f165960c);
            }
            if (!TextUtils.isEmpty(videoPublishEditModel.mShootWay) && !TextUtils.isEmpty(videoPublishEditModel.clientId) && !TextUtils.isEmpty(videoPublishEditModel.shareId)) {
                a3.mo129406a("channel", videoPublishEditModel.clientId);
                a3.mo129406a("shoot_way", videoPublishEditModel.mShootWay);
                a3.mo129406a("open_platform_share_id", videoPublishEditModel.shareId);
            }
            a3.mo129405a("select_gear_by_upload_speed", videoPublishEditModel.getUploadSpeedSettingsIndex());
            a3.mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("filter_id_list", VideoPublishEditModel.translateNullFilter(videoPublishEditModel.mCurFilterIds)).mo129406a("effect_list", videoPublishEditModel.getEditEffectList()).mo129406a("info_sticker_list", videoPublishEditModel.getInfoStickerList()).mo129406a("prop_list", videoPublishEditModel.mStickerID).mo129407a("beautify_used", videoPublishEditModel.faceBeautyOpen).mo129403a("publish_type", this.f166259x).mo129406a("beautify_info", C34806c.f82228a).mo129406a("watermark_resolution", videoPublishEditModel.mWatermarkVideoWidth + "*" + videoPublishEditModel.mWatermarkVideoHeight).mo129406a("content_type", C71817eu.m126792c(videoPublishEditModel)).mo129403a("is_hd_video", C88278m.m153410b(videoPublishEditModel) ? 1 : 0).mo129406a("content_source", C71817eu.m126790a(videoPublishEditModel)).mo129404a("source_duration", j2);
            C74080a.m130259a(a3, synthetiseResult, baseShortVideoContext);
        }
        if (C63244g.m114602a().mo73287o().mo104784d()) {
            i5 = C63244g.m114602a().mo73287o().mo104785e();
        }
        a3.mo129403a("publish_cnt", i5);
        C39162r.m79460a("video_compose_end", a3.f188764a);
        C84911q.m145928d("uploadSynthetiseEndEvent: ".concat(String.valueOf(a)));
    }

    public C74062a(AbstractC71893j jVar, int i, int i2, int i3, String str, boolean z, AbstractC74304x<C69831ai> xVar) {
        this.f166241f = jVar;
        this.f166236a = str;
        this.f166238c = i2;
        this.f166239d = i3;
        this.f166258w = z;
        this.f166259x = i;
        String str2 = DeviceRegisterManager.getDeviceId() + "-" + SystemClock.uptimeMillis();
        this.f166257v = str2;
        jVar.f161078d = str2;
        jVar.f161079e = z;
        if (xVar != null) {
            C73914o oVar = new C73914o();
            this.f166237b = oVar;
            oVar.add(new C69893bo(xVar));
        }
        C0646a aVar = new C0646a();
        this.f166243h = aVar;
        jVar.mo113548a(aVar);
        this.f166246k = new C74075c(jVar, i3, str, i2);
        C70620cw cwVar = new C70620cw(this);
        this.f166247l = cwVar;
        cwVar.mo111421a("new Publisher() type = ".concat(String.valueOf(i2)));
    }
}
