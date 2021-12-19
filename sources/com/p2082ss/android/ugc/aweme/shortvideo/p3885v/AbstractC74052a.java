package com.p2082ss.android.ugc.aweme.shortvideo.p3885v;

import android.os.SystemClock;
import android.util.Log;
import androidx.core.p033d.C0646a;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24098m;
import com.google.p1998c.p1999a.C27252o;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.google.p1998c.p2006h.p2007a.C27659u;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2341au.C33975a;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.photo.p3546a.C62856b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.publish.p3612b.p3613a.C65512a;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3623c.C65630a;
import com.p2082ss.android.ugc.aweme.scheduler.C67295g;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69890bl;
import com.p2082ss.android.ugc.aweme.shortvideo.C69893bo;
import com.p2082ss.android.ugc.aweme.shortvideo.C70003cp;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70620cw;
import com.p2082ss.android.ugc.aweme.shortvideo.C71813eq;
import com.p2082ss.android.ugc.aweme.shortvideo.C71818ev;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3888c.C74082a;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73914o;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73917r;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73964ar;
import com.p2082ss.android.ugc.aweme.turbo.api.C79340b;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.aweme.utils.C80540hn;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.v.a */
public abstract class AbstractC74052a implements AbstractC74088f {

    /* renamed from: a */
    public C73914o f166203a;

    /* renamed from: b */
    final C70003cp f166204b = new C70003cp();

    /* renamed from: c */
    protected SynthetiseResult f166205c;

    /* renamed from: d */
    C65512a<SynthetiseResult> f166206d;

    /* renamed from: e */
    public boolean f166207e;

    /* renamed from: f */
    public final C74082a f166208f;

    /* renamed from: g */
    protected BaseShortVideoContext f166209g;

    /* renamed from: h */
    private final int f166210h;

    /* renamed from: i */
    private final int f166211i;

    /* renamed from: j */
    private final AbstractC71893j f166212j;

    /* renamed from: k */
    private final C0646a f166213k;

    /* renamed from: l */
    private C65512a<C65616g> f166214l;

    /* renamed from: m */
    private AbstractFutureC27655q<C65616g> f166215m;

    /* renamed from: n */
    private C65512a<C65616g> f166216n;

    /* renamed from: o */
    private AbstractFutureC27655q<? extends C69831ai> f166217o;

    /* renamed from: p */
    private final C70620cw f166218p;

    /* renamed from: q */
    private final String f166219q;

    static {
        Covode.recordClassIndex(86804);
    }

    /* renamed from: d */
    public abstract void mo116441d(C65616g gVar);

    /* renamed from: e */
    public abstract void mo116442e();

    /* renamed from: e */
    public abstract void mo116443e(C65616g gVar);

    /* renamed from: f */
    public abstract void mo116444f();

    /* renamed from: f */
    public abstract void mo116445f(C65616g gVar);

    /* renamed from: g */
    public abstract void mo116446g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo116447h() {
    }

    public String toString() {
        return "AbstractPublisher";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C69840ar mo116448i() {
        return new C69840ar();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74088f
    /* renamed from: j */
    public void mo116449j() {
        if (this.f166206d != null) {
            C67295g.m119228a("PublishParallel AbstractPublisher pause");
            this.f166212j.mo113549a(this.f166203a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74088f
    /* renamed from: k */
    public void mo116450k() {
        if (this.f166206d != null) {
            C67295g.m119228a("PublishParallel AbstractPublisher resume");
            this.f166212j.mo113553b(this.f166203a);
        }
    }

    /* renamed from: c */
    public final void mo116438c() {
        if (!this.f166207e) {
            this.f166207e = this.f166212j.mo113558e(this.f166209g);
            C84911q.m145928d(this + " saveToCameraIfNeed " + this.f166207e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74088f
    /* renamed from: d */
    public final void mo116440d() {
        C67295g.m119228a("PublishParallel AbstractPublisher cancel");
        C84911q.m145928d("Publisher cancelPrePublishReal");
        C70005cr.m123611a();
        if (C70005cr.m123616g()) {
            this.f166213k.mo2676b();
            C74082a aVar = this.f166208f;
            C39162r.m79460a("user_cancel_publish", new C84425b().mo129406a("publish_id", aVar.f166317n).mo129403a("video_type", aVar.f166310g).mo129403a("video_upload_type", aVar.f166311h).mo129406a("cancel_step", "user").f188764a);
            C70005cr.m123611a().mo110449a(10);
        }
    }

    /* renamed from: b */
    public final void mo116436b() {
        if (!m130220a("createVideo")) {
            if (this.f166215m == null) {
                AbstractFutureC27655q<C65616g> c = this.f166212j.mo113555c(this.f166209g);
                this.f166215m = c;
                if (c != null) {
                    C74082a aVar = this.f166208f;
                    BaseShortVideoContext baseShortVideoContext = this.f166209g;
                    C84911q.m145928d("Publisher createVideo() synthetiseResult = " + aVar.f166312i);
                    aVar.f166319p = new C74082a.C74084b();
                    aVar.f166319p.f166330a = C27252o.m54255b(C80540hn.f180153b);
                    C39162r.m79460a("publish_start", C69890bl.m123458a(baseShortVideoContext).mo129406a("shoot_entrance", aVar.f166313j).mo129406a("is_photo", "0").f188764a);
                    C27646l.m55298a(this.f166215m, new AbstractC27645k<C65616g>() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a.C740553 */

                        static {
                            Covode.recordClassIndex(86807);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                        public final /* synthetic */ void onSuccess(C65616g gVar) {
                            AbstractC74052a.this.f166208f.mo116470a(true, gVar, null);
                        }

                        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                        public final void onFailure(Throwable th) {
                            AbstractC74052a.this.f166208f.mo116470a(false, null, th);
                            if (AbstractC74052a.this.f166203a != null) {
                                AbstractC74052a.this.f166203a.onError(new C71818ev(th));
                            }
                        }
                    }, ExecutorC34605m.f81660a);
                } else {
                    return;
                }
            }
            C27646l.m55298a(this.f166215m, new AbstractC27645k<C65616g>() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a.C740564 */

                static {
                    Covode.recordClassIndex(86808);
                }

                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final void onFailure(Throwable th) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final /* synthetic */ void onSuccess(C65616g gVar) {
                    C84911q.m145928d(this + " onCreateVideoSuccess");
                    AbstractC74052a.this.mo116441d(gVar);
                }
            }, ExecutorC34605m.f81660a);
            C73914o oVar = this.f166203a;
            if (oVar != null) {
                oVar.onProgressUpdate(this.f166204b.mo110445a(2, 0), false);
            }
        }
    }

    /* renamed from: a */
    public final void mo116432a() {
        String e;
        Object obj;
        String str;
        if (this.f166206d == null) {
            C65512a<SynthetiseResult> b = this.f166212j.mo113551b(this.f166209g);
            C74082a aVar = this.f166208f;
            BaseShortVideoContext baseShortVideoContext = this.f166209g;
            C79340b.m138147a().videoComposeStart();
            int i = -1;
            VideoPublishEditModel videoPublishEditModel = null;
            boolean z = true;
            if (aVar.f166310g == 0) {
                videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
                aVar.f166314k = (double) videoPublishEditModel.videoFps();
                aVar.f166316m = videoPublishEditModel.creationId;
                i = videoPublishEditModel.videoEditorType;
            }
            aVar.f166309f = C62856b.m113272a(aVar.f166310g, baseShortVideoContext);
            C80510gr.m139539b(aVar.f166317n, C1764a.m5929a(Locale.US, "id:%s vt:%d ut:%d et:%d", new Object[]{aVar.f166317n, Integer.valueOf(aVar.f166310g), Integer.valueOf(aVar.f166311h), Integer.valueOf(i)}));
            C70005cr.m123611a().mo110449a(2);
            C73917r.m130009a(aVar.f166316m, C62856b.m113273b(aVar.f166310g));
            C39162r.m79460a("av_memory_log", new C84425b().mo129406a("scene", "start_synthetise").mo129406a("shoot_way", aVar.f166313j).mo129404a("dalvikPss", C73964ar.f166038a.f166040c).mo129404a("nativePss", C73964ar.f166038a.f166041d).mo129404a("otherPss", C73964ar.f166038a.f166043f).mo129404a("totalPss", C73964ar.f166038a.f166042e).f188764a);
            aVar.f166304a = SystemClock.uptimeMillis();
            int b2 = C74089g.m130288b(C40963b.m82473a());
            C84425b a = C69890bl.m123458a(videoPublishEditModel);
            if (aVar.f166310g == 0) {
                e = ((VideoPublishEditModel) baseShortVideoContext).getVideoResolution();
            } else if ("upload".equals(aVar.f166309f)) {
                e = C65357b.m117050f();
            } else {
                e = C65357b.m117049e();
            }
            C84425b a2 = a.mo129406a("resolution", e);
            if (aVar.f166310g != 0) {
                z = false;
            }
            String str2 = "0";
            if (z) {
                obj = Integer.valueOf(((VideoPublishEditModel) baseShortVideoContext).getPreviewInfo().getPreviewVideoLength());
            } else {
                obj = str2;
            }
            C84425b a3 = a2.mo129405a("source_duration", obj).mo129406a("bite_rate", new StringBuilder().append(C65357b.m117047c()).toString()).mo129406a("video_quality", new StringBuilder().append(C65357b.m117048d()).toString()).mo129406a("_perf_monitor", "1").mo129406a("publish_id", aVar.f166317n).mo129403a("pre_publish_type", aVar.f166326w).mo129403a("publish_type", aVar.f166326w);
            if (C74087e.m130277a()) {
                str = "1";
            } else {
                str = str2;
            }
            C84425b a4 = a3.mo129406a("user_enable_pre_publish", str);
            if (C63244g.m114602a().mo73277e().getEnablePreUploadByUser(false)) {
                str2 = "1";
            }
            C39162r.m79460a("video_compose_start", a4.mo129406a("feature_enable_pre_publish", str2).mo129403a("total_available_memory_mb", b2 - C74089g.m130291d()).mo129405a("total_available_memory_percentage", Float.valueOf(C74089g.m130283a(b2))).mo129403a("total_memory_mb", b2).mo129403a("jvm_allow_memory_mb", C74089g.m130284a()).mo129403a("jvm_available_memory_mb", C74089g.m130284a() - C74089g.m130287b()).mo129405a("jvm_available_memory_percentage", Float.valueOf(C74089g.m130289c())).mo129406a("fps", new StringBuilder().append(aVar.f166314k).toString()).f188764a);
            aVar.f166315l = C80540hn.f180153b.mo45347a();
            C84911q.m145928d("Publisher uploadSynthetiseStartEvent");
            this.f166206d = b;
            C27646l.m55298a(b, new AbstractC27645k<SynthetiseResult>() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a.C740531 */

                static {
                    Covode.recordClassIndex(86805);
                }

                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final void onFailure(Throwable th) {
                    AbstractC74052a.this.f166208f.mo116471a(false, (SynthetiseResult) null, th, (Object) AbstractC74052a.this.f166209g);
                    if (AbstractC74052a.this.f166203a != null) {
                        AbstractC74052a.this.f166203a.onError(new C71818ev(th));
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final /* synthetic */ void onSuccess(SynthetiseResult synthetiseResult) {
                    SynthetiseResult synthetiseResult2 = synthetiseResult;
                    try {
                        AbstractC74052a.this.f166208f.mo116471a(true, synthetiseResult2, (Throwable) null, (Object) AbstractC74052a.this.f166209g);
                        AbstractC74052a.this.f166205c = synthetiseResult2;
                    } catch (Exception e) {
                        C34611o.m70668a("aweme_synthetise_error_log", AbstractC74052a.this.mo116448i().mo110189a("exception", C24098m.m45633c(e)).mo110191a());
                    }
                }
            }, C27659u.EnumC27662a.INSTANCE);
            this.f166206d.mo104629b(new RunnableC74079b(this), C27659u.EnumC27662a.INSTANCE);
        }
        C27646l.m55298a(this.f166206d, new AbstractC27645k<SynthetiseResult>() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a.C740542 */

            static {
                Covode.recordClassIndex(86806);
            }

            @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
            public final void onFailure(Throwable th) {
                C63244g.m114602a().mo73287o().mo104792l().mo104817a("synthesis", "synthesis failed. Reason: " + Log.getStackTraceString(th));
                AbstractC74052a.this.mo116447h();
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
            public final /* synthetic */ void onSuccess(SynthetiseResult synthetiseResult) {
                SynthetiseResult synthetiseResult2 = synthetiseResult;
                C84911q.m145928d(this + " onSynthesisSuccess");
                if (AbstractC74052a.this.f166205c == null) {
                    AbstractC74052a.this.f166205c = synthetiseResult2;
                }
                AbstractC74052a.this.mo116446g();
                if (!(AbstractC74052a.this.f166203a == null || synthetiseResult2 == null || synthetiseResult2.outputFile == null)) {
                    AbstractC74052a.this.f166203a.onSynthetiseSuccess(synthetiseResult2.outputFile);
                }
                C63244g.m114602a().mo73287o().mo104792l().mo104817a("synthesis", "synthesis success.");
            }
        }, ExecutorC34605m.f81660a);
    }

    /* renamed from: a */
    private boolean m130220a(String str) {
        if (!C63244g.m114602a().mo73255A().mo93901a()) {
            return false;
        }
        if (this.f166203a == null) {
            return true;
        }
        this.f166203a.onError(new C71818ev(new C74086d(toString() + "#" + str)));
        return true;
    }

    /* renamed from: b */
    public final void mo116437b(C65616g gVar) {
        if (!m130220a("uploadCoverTextImage")) {
            if (this.f166216n == null) {
                C65512a<C65616g> b = this.f166212j.mo113552b(this.f166209g, gVar);
                this.f166216n = b;
                C27646l.m55298a(b, new AbstractC27645k<C65616g>() {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a.C740597 */

                    static {
                        Covode.recordClassIndex(86811);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                    public final /* bridge */ /* synthetic */ void onSuccess(C65616g gVar) {
                    }

                    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                    public final void onFailure(Throwable th) {
                        if (AbstractC74052a.this.f166203a != null) {
                            AbstractC74052a.this.f166203a.onError(new C71818ev(th, C65630a.m117451a(C65630a.m117454c(th))));
                        }
                    }
                }, ExecutorC34605m.f81660a);
                m130219a(this.f166216n, 4);
            }
            C27646l.m55298a(this.f166216n, new AbstractC27645k<C65616g>() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a.C740608 */

                static {
                    Covode.recordClassIndex(86812);
                }

                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final void onFailure(Throwable th) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final /* synthetic */ void onSuccess(C65616g gVar) {
                    C84911q.m145928d(this + " onUploadCoverTextImageSuccess");
                    AbstractC74052a.this.mo116445f(gVar);
                }
            }, ExecutorC34605m.f81660a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74088f
    /* renamed from: a */
    public final void mo116434a(BaseShortVideoContext baseShortVideoContext) {
        this.f166209g = baseShortVideoContext;
        this.f166212j.f161077c = 0;
        this.f166218p.mo111421a("startPublish()");
        C80510gr.m139548f(this.f166219q);
        this.f166212j.mo113547a();
        C74082a aVar = this.f166208f;
        aVar.f166324u = true;
        C74082a.C74085c cVar = aVar.f166322s;
        boolean z = aVar.f166325v;
        C84911q.m145921a("PublishDurationMonitor LOG_START");
        cVar.f166336f = C27252o.m54255b(C80540hn.f180153b);
        cVar.f166335e = SystemClock.uptimeMillis();
        C39162r.m79460a("click_publish_button", new C84425b().mo129403a("compose_finish", z ? 1 : 0).f188764a);
        C84911q.m145928d(this + " onPublishStart");
        mo116444f();
    }

    /* renamed from: c */
    public final void mo116439c(final C65616g gVar) {
        if (!m130220a("createAweme") && this.f166217o == null) {
            C73914o oVar = this.f166203a;
            if (oVar != null) {
                oVar.onProgressUpdate(this.f166204b.mo110445a(3, 0), false);
            }
            C74082a aVar = this.f166208f;
            BaseShortVideoContext baseShortVideoContext = this.f166209g;
            C84911q.m145928d("Publisher createAweme() synthetiseResult = " + aVar.f166312i + " \nargs " + baseShortVideoContext);
            aVar.f166321r = new C74082a.C74083a(baseShortVideoContext);
            aVar.f166321r.f166328a = C27252o.m54255b(C80540hn.f180153b);
            AbstractFutureC27655q<? extends C69831ai> a = this.f166212j.mo113544a(this.f166209g, gVar, this.f166205c);
            this.f166217o = a;
            C27646l.m55298a(a, new AbstractC27645k<C69831ai>() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a.C740619 */

                static {
                    Covode.recordClassIndex(86813);
                }

                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final void onFailure(Throwable th) {
                    AbstractC74052a.this.f166208f.mo116469a(false, gVar, null, th, AbstractC74052a.this.f166209g, AbstractC74052a.this.f166207e);
                    if (AbstractC74052a.this.f166203a != null) {
                        AbstractC74052a.this.f166203a.onError(new C71818ev(th));
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final /* synthetic */ void onSuccess(C69831ai aiVar) {
                    C69831ai aiVar2 = aiVar;
                    AbstractC74052a.this.f166208f.mo116469a(true, gVar, aiVar2, null, AbstractC74052a.this.f166209g, AbstractC74052a.this.f166207e);
                    if (AbstractC74052a.this.f166203a != null) {
                        AbstractC74052a.this.f166203a.onSuccess(aiVar2, false);
                    }
                }
            }, ExecutorC34605m.f81660a);
        }
    }

    /* renamed from: a */
    public final void mo116433a(final C65616g gVar) {
        if (!m130220a("uploadVideo")) {
            if (this.f166214l == null) {
                C74082a aVar = this.f166208f;
                BaseShortVideoContext baseShortVideoContext = this.f166209g;
                C84911q.m145928d("Publisher uploadVideo() synthetiseResult = " + aVar.f166312i);
                aVar.f166306c = SystemClock.uptimeMillis();
                if (!C74082a.m130265a(aVar.f166311h)) {
                    aVar.f166320q = new C71813eq(baseShortVideoContext, aVar.f166323t, aVar.f166310g, null, aVar.f166317n, aVar.f166326w);
                    aVar.f166320q.mo113473a(true, null);
                    try {
                        String stackTraceString = Log.getStackTraceString(new Exception());
                        C33975a.f80359a.mo61044a("upload_video_start");
                        C40982q.m82522a("aweme_upload_video_funnel", aVar.mo116467a(C69890bl.m123459b(baseShortVideoContext)).mo110189a(StringSet.type, "upload_video_start").mo110189a("extra", C33975a.f80359a.mo61045a()).mo110189a("stack_trace", stackTraceString).mo110191a());
                        aVar.mo116468a("upload_video_start", stackTraceString);
                    } catch (Exception e) {
                        C74082a.m130263a(e);
                    }
                }
                C65512a<C65616g> a = this.f166212j.mo113546a(this.f166209g, gVar);
                this.f166214l = a;
                C27646l.m55298a(a, new AbstractC27645k<C65616g>() {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a.C740586 */

                    static {
                        Covode.recordClassIndex(86810);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                    public final /* synthetic */ void onSuccess(C65616g gVar) {
                        AbstractC74052a.this.f166208f.mo116472a(true, (Throwable) null, gVar, (Object) AbstractC74052a.this.f166209g);
                    }

                    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                    public final void onFailure(Throwable th) {
                        AbstractC74052a.this.f166208f.mo116472a(false, th, gVar, (Object) AbstractC74052a.this.f166209g);
                        if (AbstractC74052a.this.f166203a != null) {
                            AbstractC74052a.this.f166203a.onError(new C71818ev(th, C65630a.m117451a(C65630a.m117454c(th))));
                        }
                    }
                }, ExecutorC34605m.f81660a);
                m130219a(this.f166214l, 1);
            }
            C27646l.m55298a(this.f166214l, new AbstractC27645k<C65616g>() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a.C740575 */

                static {
                    Covode.recordClassIndex(86809);
                }

                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final void onFailure(Throwable th) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final /* synthetic */ void onSuccess(C65616g gVar) {
                    C84911q.m145928d(this + " onUploadSuccess");
                    AbstractC74052a.this.mo116443e(gVar);
                }
            }, ExecutorC34605m.f81660a);
        }
    }

    /* renamed from: a */
    private void m130219a(C65512a<C65616g> aVar, int i) {
        aVar.mo104629b(new RunnableC74081c(this, i, aVar), ExecutorC34605m.f81660a);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74088f
    /* renamed from: a */
    public final void mo116435a(BaseShortVideoContext baseShortVideoContext, int i) {
        this.f166209g = baseShortVideoContext;
        this.f166212j.f161077c = i;
        this.f166218p.mo111421a("prePublish() publishType:".concat(String.valueOf(i)));
        C84911q.m145928d(this + " onPrePublishStart");
        mo116442e();
    }

    public AbstractC74052a(AbstractC71893j jVar, int i, int i2, int i3, String str, boolean z, AbstractC74304x<C69831ai> xVar) {
        this.f166212j = jVar;
        this.f166210h = i2;
        this.f166211i = i3;
        String str2 = DeviceRegisterManager.getDeviceId() + "-" + SystemClock.uptimeMillis();
        this.f166219q = str2;
        jVar.f161078d = str2;
        jVar.f161079e = z;
        if (xVar != null) {
            C73914o oVar = new C73914o();
            this.f166203a = oVar;
            oVar.add(new C69893bo(xVar));
        }
        C0646a aVar = new C0646a();
        this.f166213k = aVar;
        jVar.mo113548a(aVar);
        C70620cw cwVar = new C70620cw(this);
        this.f166218p = cwVar;
        cwVar.mo111421a("new Publisher() type = ".concat(String.valueOf(i2)));
        this.f166208f = new C74082a(jVar, i, i2, i3, str2, str, z);
    }
}
