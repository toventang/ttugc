package com.p2082ss.android.ugc.aweme.feed.caption;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23319b;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46759bu;
import com.p2082ss.android.ugc.aweme.experiment.C46984gq;
import com.p2082ss.android.ugc.aweme.experiment.C47037o;
import com.p2082ss.android.ugc.aweme.experiment.C47038p;
import com.p2082ss.android.ugc.aweme.experiment.ClaCrowdsourcingEntrypoints;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49513e;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionModel;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50532ah;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50555t;
import com.p2082ss.android.ugc.aweme.main.p3433f.C59089a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.feed.caption.c */
public final class C49337c extends AbstractC49544a {

    /* renamed from: C */
    public static final int f113384C;

    /* renamed from: D */
    public static final int f113385D = (((int) C13628n.m24520b(C17867d.m33078a(), 58.0f)) + C34723i.m70927b());

    /* renamed from: E */
    public static final int f113386E;

    /* renamed from: F */
    public static final int f113387F;

    /* renamed from: G */
    public static final int f113388G = ((int) C13628n.m24520b(C17867d.m33078a(), 32.0f));

    /* renamed from: H */
    public static final C49338a f113389H = new C49338a((byte) 0);

    /* renamed from: A */
    public boolean f113390A = true;

    /* renamed from: B */
    public C23226a f113391B;

    /* renamed from: a */
    public AbstractC23317a f113392a;

    /* renamed from: b */
    FrameLayout f113393b;

    /* renamed from: c */
    public LinearLayout f113394c;

    /* renamed from: d */
    public LinearLayout f113395d;

    /* renamed from: e */
    public ImageView f113396e;

    /* renamed from: f */
    public TuxTextView f113397f;

    /* renamed from: g */
    public View f113398g;

    /* renamed from: h */
    public ImageView f113399h;

    /* renamed from: i */
    public ImageView f113400i;

    /* renamed from: j */
    public boolean f113401j;

    /* renamed from: k */
    public boolean f113402k;

    /* renamed from: l */
    public boolean f113403l;

    /* renamed from: m */
    public boolean f113404m;

    /* renamed from: n */
    public boolean f113405n;

    /* renamed from: o */
    public boolean f113406o;

    /* renamed from: p */
    public String f113407p = "";

    /* renamed from: q */
    public ValueAnimator f113408q;

    /* renamed from: r */
    public boolean f113409r;

    /* renamed from: s */
    public long f113410s = -1;

    /* renamed from: t */
    public long f113411t = -1;

    /* renamed from: u */
    public boolean f113412u;

    /* renamed from: v */
    boolean f113413v;

    /* renamed from: w */
    public boolean f113414w;

    /* renamed from: x */
    public boolean f113415x;

    /* renamed from: y */
    public boolean f113416y;

    /* renamed from: z */
    public boolean f113417z;

    /* renamed from: c */
    private static int m92426c(boolean z) {
        return z ? 0 : 8;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$a */
    public static final class C49338a {
        static {
            Covode.recordClassIndex(58139);
        }

        private C49338a() {
        }

        public /* synthetic */ C49338a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$l */
    static final class C49353l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C49337c f113439a;

        static {
            Covode.recordClassIndex(58154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49353l(C49337c cVar) {
            super(0);
            this.f113439a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            this.f113439a.f113405n = true;
            this.f113439a.f113406o = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: d */
    public final boolean mo80939d() {
        if (!this.f113412u || !this.f113414w || this.f113401j) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$m */
    static final class C49354m extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C49337c f113440a;

        static {
            Covode.recordClassIndex(58155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49354m(C49337c cVar) {
            super(0);
            this.f113440a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f113440a.f113405n = false;
            if (!this.f113440a.f113406o) {
                this.f113440a.mo80934b();
            }
            this.f113440a.f113406o = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: p */
    private final void m92428p() {
        if (!this.f113417z) {
            this.f113417z = true;
            C39162r.m79460a("edit_transl_show", new C33744d().mo59983a("enter_from", this.f113954M).mo59983a("group_id", C59208ac.m108771e(this.f113953L)).mo59983a("author_id", C59208ac.m108758a(this.f113953L)).f79943a);
        }
    }

    static {
        Covode.recordClassIndex(58138);
        int b = (int) C13628n.m24520b(C17867d.m33078a(), 16.0f);
        f113384C = b;
        int b2 = (int) C13628n.m24520b(C17867d.m33078a(), 56.0f);
        f113386E = b2;
        f113387F = Math.min((int) C13628n.m24520b(C17867d.m33078a(), 320.0f), (C34723i.m70928b(C17867d.m33078a()) - b) - b2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d A[EDGE_INSN: B:29:0x004d->B:23:0x004d ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel mo80937c() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f113953L
            r8 = 0
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.feed.model.CaptionModel r0 = r0.getCaptionModel()
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.feed.model.CaptionLanguage r0 = r0.getOriginalCaptionLanguage()
            if (r0 == 0) goto L_0x0059
            long r0 = r0.getLanguageId()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L_0x001f:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f113953L
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.feed.model.CaptionModel r0 = r0.getCaptionModel()
            if (r0 == 0) goto L_0x004f
            java.util.List r0 = r0.getCaptionList()
            if (r0 == 0) goto L_0x004f
            java.util.Iterator r6 = r0.iterator()
        L_0x0039:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r5 = r6.next()
            r0 = r5
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r0 = (com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel) r0
            long r3 = r0.getLanguageId()
            if (r7 != 0) goto L_0x0050
        L_0x004c:
            r8 = r5
        L_0x004d:
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r8 = (com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel) r8
        L_0x004f:
            return r8
        L_0x0050:
            long r1 = r7.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0039
            goto L_0x004c
        L_0x0059:
            r7 = r8
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.caption.C49337c.mo80937c():com.ss.android.ugc.aweme.feed.model.CaptionItemModel");
    }

    /* renamed from: o */
    private final boolean m92427o() {
        ClaCrowdsourcingEntrypoints a;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String claSubtitleId;
        Intent intent;
        Intent intent2;
        Fragment fragment = this.f113963V;
        String str7 = "";
        C89219l.m154716b(fragment, str7);
        ActivityC0945e activity = fragment.getActivity();
        if (!(activity == null || (intent = activity.getIntent()) == null || intent.getIntExtra("bottom_view_type", 0) != 1)) {
            Fragment fragment2 = this.f113963V;
            C89219l.m154716b(fragment2, str7);
            ActivityC0945e activity2 = fragment2.getActivity();
            if (activity2 == null || (intent2 = activity2.getIntent()) == null || intent2.getIntExtra("translation_status", 0) != 0) {
                return false;
            }
        }
        if (C47037o.m90296a() && (a = C47038p.m90297a()) != null) {
            CaptionItemModel a2 = C50555t.m94779a(this.f113953L);
            String str8 = null;
            if (a2 != null) {
                str = a2.getLanguageName();
            } else {
                str = null;
            }
            C46984gq subtitleType = a.getSubtitleType();
            if (subtitleType != null) {
                str2 = subtitleType.f109483a;
            } else {
                str2 = null;
            }
            if (C89219l.m154714a((Object) str, (Object) str2)) {
                CaptionItemModel b = C50555t.m94783b(this.f113953L);
                if (b != null) {
                    str3 = b.getLanguageName();
                } else {
                    str3 = null;
                }
                C46984gq subtitleType2 = a.getSubtitleType();
                if (subtitleType2 != null) {
                    str4 = subtitleType2.f109484b;
                } else {
                    str4 = null;
                }
                if (C89219l.m154714a((Object) str3, (Object) str4)) {
                    CaptionItemModel b2 = C50555t.m94783b(this.f113953L);
                    if (b2 != null) {
                        str5 = b2.getVersionType();
                    } else {
                        str5 = null;
                    }
                    C46984gq subtitleType3 = a.getSubtitleType();
                    if (subtitleType3 != null) {
                        str8 = subtitleType3.f109485c;
                    }
                    if (C89219l.m154714a((Object) str5, (Object) str8)) {
                        ITranslatedCaptionService j = TranslatedCaptionCacheServiceImpl.m146355j();
                        if (a.isEnrolled()) {
                            if (!a.isOptOut()) {
                                CaptionItemModel b3 = C50555t.m94783b(this.f113953L);
                                if (!(b3 == null || (claSubtitleId = b3.getClaSubtitleId()) == null)) {
                                    str7 = claSubtitleId;
                                }
                                if (!j.mo108894d(str7)) {
                                    return true;
                                }
                            }
                            return false;
                        } else if (a.getPassAgs() && a.isTargetedUser() && j.mo108897g()) {
                            CaptionItemModel b4 = C50555t.m94783b(this.f113953L);
                            if (b4 == null || (str6 = b4.getClaSubtitleId()) == null) {
                                str6 = str7;
                            }
                            if (!j.mo108894d(str6)) {
                                Aweme aweme = this.f113953L;
                                C89219l.m154716b(aweme, str7);
                                String aid = aweme.getAid();
                                C89219l.m154716b(aid, str7);
                                j.mo108889b(aid);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void mo80940e() {
        String e;
        String str;
        Video video;
        CaptionModel captionModel;
        CaptionLanguage originalCaptionLanguage;
        String str2;
        Video video2;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage2;
        C33744d a = new C33744d().mo59983a("enter_from", this.f113954M).mo59983a("subtitle_type", C50532ah.m94727c(this.f113953L)).mo59980a("have_transl", C50532ah.m94726b(this.f113953L) ? 1 : 0).mo59980a("use_transl", !this.f113401j ? 1 : 0);
        if (this.f113401j) {
            Aweme aweme = this.f113953L;
            if (aweme == null || (video2 = aweme.getVideo()) == null || (captionModel2 = video2.getCaptionModel()) == null || (originalCaptionLanguage2 = captionModel2.getOriginalCaptionLanguage()) == null || (e = originalCaptionLanguage2.getLanguageName()) == null) {
                e = "";
            }
        } else {
            e = C50532ah.m94729e(this.f113953L);
        }
        C33744d a2 = a.mo59983a("to_lang", e);
        if (this.f113401j) {
            str = C50532ah.m94729e(this.f113953L);
        } else {
            Aweme aweme2 = this.f113953L;
            if (aweme2 == null || (video = aweme2.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || (str = originalCaptionLanguage.getLanguageName()) == null) {
                str = "";
            }
        }
        C33744d a3 = a2.mo59983a("subtitle_lang", str).mo59980a("have_tts", this.f113413v ? 1 : 0).mo59980a("use_tts", mo80939d() ? 1 : 0).mo59980a("cla_subtitle_type", C50532ah.m94724a(this.f113401j, this.f113953L));
        CaptionItemModel b = C50555t.m94783b(this.f113953L);
        if (b == null || !C50555t.m94782a(b)) {
            str2 = "manual";
        } else {
            str2 = "translator";
        }
        C33744d a4 = a3.mo59983a("transl_type", str2);
        Aweme aweme3 = this.f113953L;
        C89219l.m154716b(aweme3, "");
        C33744d a5 = a4.mo59983a("group_id", aweme3.getAid());
        Aweme aweme4 = this.f113953L;
        C89219l.m154716b(aweme4, "");
        C39162r.m79460a("change_subtitle_lang", a5.mo59983a("author_id", aweme4.getAuthorUid()).f79943a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0140, code lost:
        if (p4600h.C89391z.f203057a == null) goto L_0x0142;
     */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0147  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80934b() {
        /*
        // Method dump skipped, instructions count: 422
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.caption.C49337c.mo80934b():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$g */
    static final class RunnableC49344g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49337c f113428a;

        /* renamed from: b */
        final /* synthetic */ String f113429b;

        /* renamed from: c */
        final /* synthetic */ C33942b f113430c;

        static {
            Covode.recordClassIndex(58145);
        }

        RunnableC49344g(C49337c cVar, String str, C33942b bVar) {
            this.f113428a = cVar;
            this.f113429b = str;
            this.f113430c = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:77:0x017c, code lost:
            if (r0 == null) goto L_0x017e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 1992
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.caption.C49337c.RunnableC49344g.run():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$c */
    public static final class C49340c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C49337c f113422a;

        static {
            Covode.recordClassIndex(58141);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C49340c(C49337c cVar) {
            this.f113422a = cVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f113422a.mo80934b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$e */
    public static final class C49342e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C49337c f113426a;

        static {
            Covode.recordClassIndex(58143);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C49342e(C49337c cVar) {
            this.f113426a = cVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f113426a.mo80934b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final boolean mo80933a(C33942b bVar) {
        return C50539g.m94742a(bVar, C49343f.f113427a);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$f */
    static final class C49343f<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C49343f f113427a = new C49343f();

        static {
            Covode.recordClassIndex(58144);
        }

        C49343f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            Aweme aweme = (Aweme) obj;
            C89219l.m154721d(aweme, "");
            return C50532ah.m94725a(aweme);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$n */
    public static final class View$OnClickListenerC49355n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23226a f113441a;

        static {
            Covode.recordClassIndex(58156);
        }

        View$OnClickListenerC49355n(C23226a aVar) {
            this.f113441a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f113441a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$o */
    public static final class View$OnClickListenerC49356o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23226a f113442a;

        static {
            Covode.recordClassIndex(58157);
        }

        View$OnClickListenerC49356o(C23226a aVar) {
            this.f113442a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f113442a.dismiss();
        }
    }

    public C49337c(View view) {
        super(view, ((Boolean) C46759bu.f108957c.getValue()).booleanValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    public final void mo80938c(C33942b bVar) {
        if (bVar != null) {
            String str = bVar.f80277a;
            C89219l.m154716b(str, "");
            C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC49344g(this, str, bVar)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$k */
    static final class C49349k extends AbstractC89220m implements AbstractC89172b<C23322d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C49337c f113435a;

        static {
            Covode.recordClassIndex(58150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49349k(C49337c cVar) {
            super(1);
            this.f113435a = cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$k$a */
        static final class View$OnClickListenerC49350a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C49349k f113436a;

            static {
                Covode.recordClassIndex(58151);
            }

            View$OnClickListenerC49350a(C49349k kVar) {
                this.f113436a = kVar;
            }

            public final void onClick(View view) {
                CaptionItemModel b;
                String translatorId;
                ClickAgent.onClick(view);
                Aweme aweme = this.f113436a.f113435a.f113953L;
                if (aweme != null && (b = C50555t.m94783b(aweme)) != null && (translatorId = b.getTranslatorId()) != null) {
                    Context context = this.f113436a.f113435a.f113959R;
                    C89219l.m154716b(context, "");
                    C50555t.m94781a(context, translatorId, "caption_menu", false, this.f113436a.f113435a.f113953L);
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23322d dVar) {
            int i;
            Aweme aweme;
            CaptionItemModel b;
            C23322d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            C49337c cVar = this.f113435a;
            if (C47037o.m90296a() && (aweme = cVar.f113953L) != null && (b = C50555t.m94783b(aweme)) != null && C50555t.m94782a(b)) {
                C23322d.C23323a aVar = new C23322d.C23323a();
                aVar.f55277d = R.string.ag3;
                aVar.f55279f = new View$OnClickListenerC49350a(this);
                dVar2.mo38014a(aVar);
            }
            if (C50532ah.m94730f(this.f113435a.f113953L)) {
                C23322d.C23324b bVar = new C23322d.C23324b();
                if (this.f113435a.f113401j) {
                    i = R.string.fhh;
                } else {
                    i = R.string.fhg;
                }
                bVar.f55282c = i;
                bVar.f55285f = new View$OnClickListenerC49351b(this);
                dVar2.mo38015a(bVar);
            }
            C23322d.C23324b bVar2 = new C23322d.C23324b();
            bVar2.f55282c = R.string.h74;
            bVar2.f55285f = new View$OnClickListenerC49352c(this);
            dVar2.mo38015a(bVar2);
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$k$c */
        static final class View$OnClickListenerC49352c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C49349k f113438a;

            static {
                Covode.recordClassIndex(58153);
            }

            View$OnClickListenerC49352c(C49349k kVar) {
                this.f113438a = kVar;
            }

            public final void onClick(View view) {
                String e;
                String str;
                Video video;
                CaptionModel captionModel;
                CaptionLanguage originalCaptionLanguage;
                ClickAgent.onClick(view);
                this.f113438a.f113435a.f113406o = true;
                this.f113438a.f113435a.mo80932a(true);
                C49337c cVar = this.f113438a.f113435a;
                C33744d a = new C33744d().mo59983a("enter_from", cVar.f113954M).mo59980a("use_transl", !cVar.f113401j ? 1 : 0).mo59983a("subtitle_type", C50532ah.m94727c(cVar.f113953L)).mo59980a("have_transl", C50532ah.m94726b(cVar.f113953L) ? 1 : 0);
                if (cVar.f113401j) {
                    Aweme aweme = cVar.f113953L;
                    if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || (e = originalCaptionLanguage.getLanguageName()) == null) {
                        e = "";
                    }
                } else {
                    e = C50532ah.m94729e(cVar.f113953L);
                }
                C33744d a2 = a.mo59983a("subtitle_lang", e).mo59980a("have_tts", cVar.f113413v ? 1 : 0).mo59980a("use_tts", cVar.mo80939d() ? 1 : 0).mo59980a("cla_subtitle_type", C50532ah.m94724a(cVar.f113401j, cVar.f113953L));
                CaptionItemModel b = C50555t.m94783b(cVar.f113953L);
                if (b == null || !C50555t.m94782a(b)) {
                    str = "manual";
                } else {
                    str = "translator";
                }
                C33744d a3 = a2.mo59983a("transl_type", str);
                Aweme aweme2 = cVar.f113953L;
                C89219l.m154716b(aweme2, "");
                C33744d a4 = a3.mo59983a("group_id", aweme2.getAid());
                Aweme aweme3 = cVar.f113953L;
                C89219l.m154716b(aweme3, "");
                C39162r.m79460a("hide_subtitle", a4.mo59983a("author_id", aweme3.getAuthorUid()).f79943a);
                this.f113438a.f113435a.f113405n = false;
                AbstractC23317a aVar = this.f113438a.f113435a.f113392a;
                if (aVar != null) {
                    aVar.dismiss();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$k$b */
        static final class View$OnClickListenerC49351b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C49349k f113437a;

            static {
                Covode.recordClassIndex(58152);
            }

            View$OnClickListenerC49351b(C49349k kVar) {
                this.f113437a = kVar;
            }

            public final void onClick(View view) {
                int i;
                ClickAgent.onClick(view);
                this.f113437a.f113435a.f113411t = SystemClock.elapsedRealtime();
                this.f113437a.f113435a.f113406o = true;
                TuxTextView tuxTextView = this.f113437a.f113435a.f113397f;
                if (tuxTextView != null) {
                    tuxTextView.setText("");
                }
                TuxTextView tuxTextView2 = this.f113437a.f113435a.f113397f;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(8);
                }
                View view2 = this.f113437a.f113435a.f113398g;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                ImageView imageView = this.f113437a.f113435a.f113399h;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!this.f113437a.f113435a.f113414w || C49513e.m92753a()) {
                    LinearLayout linearLayout = this.f113437a.f113435a.f113395d;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    ImageView imageView2 = this.f113437a.f113435a.f113396e;
                    if (imageView2 != null) {
                        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                        rotateAnimation.setDuration(1500);
                        rotateAnimation.setRepeatCount(-1);
                        rotateAnimation.setInterpolator(new LinearInterpolator());
                        imageView2.setAnimation(rotateAnimation);
                    }
                    LinearLayout linearLayout2 = this.f113437a.f113435a.f113394c;
                    if (linearLayout2 != null) {
                        linearLayout2.setEnabled(false);
                    }
                }
                AbstractC80747i O = C81079v.m140776O();
                C89219l.m154716b(O, "");
                AbstractC81002f L = O.mo123918L();
                if (this.f113437a.f113435a.f113401j) {
                    CaptionItemModel b = C50555t.m94783b(this.f113437a.f113435a.f113953L);
                    if (b != null) {
                        i = b.getSubId();
                    }
                    i = 0;
                } else {
                    CaptionItemModel a = C50555t.m94779a(this.f113437a.f113435a.f113953L);
                    if (a != null) {
                        i = a.getSubId();
                    }
                    i = 0;
                }
                L.mo124445a(i);
                this.f113437a.f113435a.f113390A = false;
                this.f113437a.f113435a.f113958Q.mo60191a("use_translated_caption", Boolean.valueOf(this.f113437a.f113435a.f113401j));
                if (!this.f113437a.f113435a.f113401j) {
                    ITranslatedCaptionService j = TranslatedCaptionCacheServiceImpl.m146355j();
                    Aweme aweme = this.f113437a.f113435a.f113953L;
                    C89219l.m154716b(aweme, "");
                    String aid = aweme.getAid();
                    C89219l.m154716b(aid, "");
                    j.mo108886a(aid);
                }
                this.f113437a.f113435a.f113401j = true ^ this.f113437a.f113435a.f113401j;
                this.f113437a.f113435a.mo80940e();
                this.f113437a.f113435a.f113405n = false;
                AbstractC23317a aVar = this.f113437a.f113435a.f113392a;
                if (aVar != null) {
                    aVar.dismiss();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60189a("update_audio_state", (AbstractC1214u<C33942b>) this.f113951J);
            dataCenter.mo60189a("update_caption_text", (AbstractC1214u<C33942b>) this.f113951J);
            dataCenter.mo60189a("on_page_selected", (AbstractC1214u<C33942b>) this.f113951J);
            dataCenter.mo60189a("on_page_unselected", (AbstractC1214u<C33942b>) this.f113951J);
            dataCenter.mo60189a("in_video_view_holder", (AbstractC1214u<C33942b>) this.f113951J);
            dataCenter.mo60189a("play_complete_first_time", (AbstractC1214u<C33942b>) this.f113951J);
            dataCenter.mo60189a("on_render_ready", (AbstractC1214u<C33942b>) this.f113951J);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        MethodCollector.m26663i(4251);
        if (!this.f113952K) {
            this.f113952K = true;
            View view = this.f113960S;
            if (!(view instanceof FrameLayout)) {
                view = null;
            }
            FrameLayout frameLayout = (FrameLayout) view;
            if (frameLayout != null) {
                frameLayout.addView(this.f113961T);
                MethodCollector.m26664o(4251);
                return;
            }
        }
        MethodCollector.m26664o(4251);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$b */
    public static final class C49339b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C49337c f113418a;

        /* renamed from: b */
        final /* synthetic */ boolean f113419b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f113420c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89236c f113421d;

        static {
            Covode.recordClassIndex(58140);
        }

        C49339b(C49337c cVar, boolean z, C89233z.C89236c cVar2, C89233z.C89236c cVar3) {
            this.f113418a = cVar;
            this.f113419b = z;
            this.f113420c = cVar2;
            this.f113421d = cVar3;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView = this.f113418a.f113400i;
            if (imageView != null) {
                C89219l.m154716b(valueAnimator, "");
                imageView.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
            if (!this.f113419b) {
                LinearLayout linearLayout = this.f113418a.f113394c;
                if (linearLayout != null) {
                    C89219l.m154716b(valueAnimator, "");
                    linearLayout.setAlpha(valueAnimator.getAnimatedFraction());
                }
                LinearLayout linearLayout2 = this.f113418a.f113394c;
                if (linearLayout2 != null) {
                    C89219l.m154716b(valueAnimator, "");
                    linearLayout2.setScaleX(((((float) C49337c.f113388G) * 1.0f) / ((float) this.f113420c.element)) + ((((float) (this.f113420c.element - C49337c.f113388G)) * valueAnimator.getAnimatedFraction()) / ((float) this.f113420c.element)));
                }
                LinearLayout linearLayout3 = this.f113418a.f113394c;
                if (linearLayout3 != null) {
                    C89219l.m154716b(valueAnimator, "");
                    linearLayout3.setScaleY(((((float) C49337c.f113388G) * 1.0f) / ((float) this.f113421d.element)) + ((((float) (this.f113421d.element - C49337c.f113388G)) * valueAnimator.getAnimatedFraction()) / ((float) this.f113421d.element)));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$d */
    public static final class C49341d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C49337c f113423a;

        /* renamed from: b */
        final /* synthetic */ int f113424b;

        /* renamed from: c */
        final /* synthetic */ int f113425c;

        static {
            Covode.recordClassIndex(58142);
        }

        C49341d(C49337c cVar, int i, int i2) {
            this.f113423a = cVar;
            this.f113424b = i;
            this.f113425c = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView = this.f113423a.f113400i;
            if (imageView != null) {
                C89219l.m154716b(valueAnimator, "");
                imageView.setAlpha(valueAnimator.getAnimatedFraction());
            }
            LinearLayout linearLayout = this.f113423a.f113394c;
            if (linearLayout != null) {
                C89219l.m154716b(valueAnimator, "");
                linearLayout.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
            LinearLayout linearLayout2 = this.f113423a.f113394c;
            if (linearLayout2 != null) {
                int i = this.f113424b;
                C89219l.m154716b(valueAnimator, "");
                linearLayout2.setScaleX(((((float) i) - (((float) (i - C49337c.f113388G)) * valueAnimator.getAnimatedFraction())) * 1.0f) / ((float) this.f113424b));
            }
            LinearLayout linearLayout3 = this.f113423a.f113394c;
            if (linearLayout3 != null) {
                int i2 = this.f113425c;
                C89219l.m154716b(valueAnimator, "");
                linearLayout3.setScaleY(((((float) i2) - (((float) (i2 - C49337c.f113388G)) * valueAnimator.getAnimatedFraction())) * 1.0f) / ((float) this.f113425c));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$p */
    public static final class View$OnClickListenerC49357p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49337c f113443a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f113444b;

        /* renamed from: c */
        final /* synthetic */ C23226a f113445c;

        static {
            Covode.recordClassIndex(58158);
        }

        View$OnClickListenerC49357p(C49337c cVar, ActivityC0945e eVar, C23226a aVar) {
            this.f113443a = cVar;
            this.f113444b = eVar;
            this.f113445c = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C49337c cVar = this.f113443a;
            C33744d a = new C33744d().mo59983a("enter_from", cVar.f113954M);
            String str2 = "translate_tts";
            if (cVar.mo80939d()) {
                str = str2;
            } else {
                str = "translate_subtitle";
            }
            C39162r.m79460a("enter_setting_page", a.mo59983a("enter_method", str).f79943a);
            SmartRoute buildRoute = SmartRouter.buildRoute(this.f113444b, "aweme://setting");
            if (!this.f113443a.mo80939d()) {
                str2 = "translate_subtitle";
            }
            buildRoute.withParam("enter_from", str2).open();
            this.f113445c.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        C89219l.m154721d(view, "");
        View a = C1870c.m6045a((Activity) this.f113959R, (int) R.layout.tj);
        this.f113393b = (FrameLayout) a.findViewById(R.id.a1n);
        this.f113394c = (LinearLayout) a.findViewById(R.id.a1r);
        this.f113395d = (LinearLayout) a.findViewById(R.id.a1p);
        this.f113396e = (ImageView) a.findViewById(R.id.a1o);
        this.f113397f = (TuxTextView) a.findViewById(R.id.a1q);
        this.f113398g = a.findViewById(R.id.ena);
        this.f113399h = (ImageView) a.findViewById(R.id.enf);
        this.f113400i = (ImageView) a.findViewById(R.id.bex);
        this.f113961T = a;
    }

    /* renamed from: b */
    public final void mo80936b(boolean z) {
        C39162r.m79460a("click_edit_transl", new C33744d().mo59983a("enter_from", this.f113954M).mo59983a("group_id", C59208ac.m108771e(this.f113953L)).mo59983a("author_id", C59208ac.m108758a(this.f113953L)).mo59980a("is_new", z ? 1 : 0).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$j */
    static final class View$OnClickListenerC49348j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49337c f113434a;

        static {
            Covode.recordClassIndex(58149);
        }

        View$OnClickListenerC49348j(C49337c cVar) {
            this.f113434a = cVar;
        }

        public final void onClick(View view) {
            String str;
            Video video;
            CaptionModel captionModel;
            CaptionLanguage originalCaptionLanguage;
            String languageName;
            ClickAgent.onClick(view);
            this.f113434a.mo80932a(false);
            C49337c cVar = this.f113434a;
            C33744d a = new C33744d().mo59983a("enter_from", cVar.f113954M);
            Aweme aweme = cVar.f113953L;
            String str2 = "";
            C89219l.m154716b(aweme, str2);
            C33744d a2 = a.mo59983a("group_id", aweme.getAid());
            Aweme aweme2 = cVar.f113953L;
            C89219l.m154716b(aweme2, str2);
            C33744d a3 = a2.mo59983a("author_id", aweme2.getAuthorUid()).mo59980a("use_transl", !cVar.f113401j ? 1 : 0).mo59983a("subtitle_type", C50532ah.m94727c(cVar.f113953L)).mo59980a("have_transl", C50532ah.m94726b(cVar.f113953L) ? 1 : 0);
            if (cVar.f113401j) {
                Aweme aweme3 = cVar.f113953L;
                if (!(aweme3 == null || (video = aweme3.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || (languageName = originalCaptionLanguage.getLanguageName()) == null)) {
                    str2 = languageName;
                }
            } else {
                str2 = C50532ah.m94729e(cVar.f113953L);
            }
            C33744d a4 = a3.mo59983a("subtitle_lang", str2).mo59980a("have_tts", cVar.f113413v ? 1 : 0).mo59980a("use_tts", cVar.mo80939d() ? 1 : 0).mo59980a("cla_subtitle_type", C50532ah.m94724a(cVar.f113401j, cVar.f113953L));
            CaptionItemModel b = C50555t.m94783b(cVar.f113953L);
            if (b == null || !C50555t.m94782a(b)) {
                str = "manual";
            } else {
                str = "translator";
            }
            C39162r.m79460a("expand_subtitle", a4.mo59983a("transl_type", str).f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$h */
    static final class View$OnClickListenerC49345h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49337c f113431a;

        static {
            Covode.recordClassIndex(58146);
        }

        View$OnClickListenerC49345h(C49337c cVar) {
            this.f113431a = cVar;
        }

        public final void onClick(View view) {
            String str;
            EnumC23352h hVar;
            ClickAgent.onClick(view);
            C49337c cVar = this.f113431a;
            C33744d a = new C33744d().mo59980a("have_transl", C50532ah.m94726b(cVar.f113953L) ? 1 : 0).mo59980a("use_transl", !cVar.f113401j ? 1 : 0).mo59983a("subtitle_type", C50532ah.m94727c(cVar.f113953L)).mo59983a("subtitle_lang", C50532ah.m94729e(cVar.f113953L)).mo59980a("have_tts", cVar.f113413v ? 1 : 0).mo59980a("use_tts", cVar.mo80939d() ? 1 : 0).mo59980a("cla_subtitle_type", C50532ah.m94724a(cVar.f113401j, cVar.f113953L));
            Aweme aweme = cVar.f113953L;
            C89219l.m154716b(aweme, "");
            C33744d a2 = a.mo59983a("group_id", aweme.getAid());
            Aweme aweme2 = cVar.f113953L;
            C89219l.m154716b(aweme2, "");
            C33744d a3 = a2.mo59983a("author_id", aweme2.getAuthorUid()).mo59983a("enter_from", cVar.f113954M);
            CaptionItemModel b = C50555t.m94783b(cVar.f113953L);
            if (b == null || !C50555t.m94782a(b)) {
                str = "manual";
            } else {
                str = "translator";
            }
            C39162r.m79460a("click_subtitle", a3.mo59983a("transl_type", str).f79943a);
            if (!C49334a.m92423a()) {
                Aweme aweme3 = cVar.f113953L;
                C89219l.m154716b(aweme3, "");
                if (aweme3.getAuthorUid() != null) {
                    Aweme aweme4 = cVar.f113953L;
                    C89219l.m154716b(aweme4, "");
                    String authorUid = aweme4.getAuthorUid();
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    if (!C89219l.m154714a((Object) authorUid, (Object) g.getCurUserId())) {
                        Activity j = C17873f.m33102j();
                        if (!(j instanceof ActivityC0945e)) {
                            j = null;
                        }
                        ActivityC0945e eVar = (ActivityC0945e) j;
                        if (eVar != null) {
                            cVar.mo80930a(eVar);
                            return;
                        }
                    }
                }
            }
            C49337c cVar2 = this.f113431a;
            if (cVar2.f113394c != null) {
                LinearLayout linearLayout = cVar2.f113394c;
                if (linearLayout == null) {
                    C89219l.m154715b();
                }
                if (linearLayout.getVisibility() == 0) {
                    int i = -((int) C13628n.m24520b(cVar2.f113959R, 8.0f));
                    Context context = cVar2.f113959R;
                    C89219l.m154716b(context, "");
                    C23319b bVar = new C23319b(context);
                    LinearLayout linearLayout2 = cVar2.f113394c;
                    if (linearLayout2 == null) {
                        C89219l.m154715b();
                    }
                    AbstractC23332b d = ((C23319b) bVar.mo38041b(linearLayout2).mo38028a(C0643b.m2378c(cVar2.f113959R, R.color.c7)).mo38030a(-1001L)).mo38011a(new C49349k(cVar2)).mo38042b(new C49353l(cVar2)).mo38035a(new C49354m(cVar2)).mo38039b(i).mo38044c().mo38043b(true).mo38046d(C49337c.f113384C);
                    if (cVar2.f113404m) {
                        hVar = EnumC23352h.BOTTOM;
                    } else {
                        hVar = EnumC23352h.TOP;
                    }
                    d.mo38034a(hVar);
                    cVar2.f113392a = d.mo38012d();
                    AbstractC23317a aVar = cVar2.f113392a;
                    if (aVar == null) {
                        C89219l.m154715b();
                    }
                    aVar.mo38001a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.c$i */
    static final class View$OnClickListenerC49346i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49337c f113432a;

        static {
            Covode.recordClassIndex(58147);
        }

        View$OnClickListenerC49346i(C49337c cVar) {
            this.f113432a = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:56:0x0153  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r12) {
            /*
            // Method dump skipped, instructions count: 360
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.caption.C49337c.View$OnClickListenerC49346i.onClick(android.view.View):void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo80930a(ActivityC0945e eVar) {
        if (mo80939d()) {
            C33744d a = new C33744d().mo59980a("use_transl", !this.f113401j ? 1 : 0).mo59980a("have_transl", C50532ah.m94726b(this.f113953L) ? 1 : 0).mo59983a("subtitle_type", C50532ah.m94727c(this.f113953L)).mo59983a("subtitle_lang", C50532ah.m94729e(this.f113953L)).mo59980a("have_tts", this.f113413v ? 1 : 0).mo59980a("use_tts", mo80939d() ? 1 : 0).mo59980a("cla_subtitle_type", C50532ah.m94724a(this.f113401j, this.f113953L));
            Aweme aweme = this.f113953L;
            C89219l.m154716b(aweme, "");
            C33744d a2 = a.mo59983a("group_id", aweme.getAid());
            Aweme aweme2 = this.f113953L;
            C89219l.m154716b(aweme2, "");
            C39162r.m79460a("tts_intro_show", a2.mo59983a("author_id", aweme2.getAuthorUid()).mo59983a("enter_from", this.f113954M).f79943a);
        } else {
            C33744d a3 = new C33744d().mo59980a("use_transl", !this.f113401j ? 1 : 0).mo59980a("have_transl", C50532ah.m94726b(this.f113953L) ? 1 : 0).mo59983a("subtitle_type", C50532ah.m94727c(this.f113953L)).mo59983a("subtitle_lang", C50532ah.m94729e(this.f113953L)).mo59980a("have_tts", this.f113413v ? 1 : 0).mo59980a("use_tts", mo80939d() ? 1 : 0).mo59980a("cla_subtitle_type", C50532ah.m94724a(this.f113401j, this.f113953L));
            Aweme aweme3 = this.f113953L;
            C89219l.m154716b(aweme3, "");
            C33744d a4 = a3.mo59983a("group_id", aweme3.getAid());
            Aweme aweme4 = this.f113953L;
            C89219l.m154716b(aweme4, "");
            C39162r.m79460a("subtitle_intro_show", a4.mo59983a("author_id", aweme4.getAuthorUid()).mo59983a("enter_from", this.f113954M).f79943a);
        }
        C49334a.m92424b();
        C49335b bVar = new C49335b(eVar, (byte) 0);
        C23226a aVar = new C23226a.C23227a().mo37816a(bVar).f55057a;
        bVar.getBtnDismiss().setOnClickListener(new View$OnClickListenerC49355n(aVar));
        bVar.getIvClose().setOnClickListener(new View$OnClickListenerC49356o(aVar));
        View$OnClickListenerC49357p pVar = new View$OnClickListenerC49357p(this, eVar, aVar);
        bVar.getTvGoSetting().setOnClickListener(pVar);
        bVar.mo80921a(pVar, mo80939d());
        aVar.show(eVar.getSupportFragmentManager(), "feed_caption_intro");
    }

    /* renamed from: a */
    public final void mo80932a(boolean z) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        this.f113402k = z;
        TranslatedCaptionCacheServiceImpl.m146355j().mo108887a(this.f113402k);
        AbstractC81915c.m141874a(new C59089a(!this.f113402k));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 200);
        C89219l.m154716b(ofInt, "");
        ofInt.setDuration(200L);
        this.f113408q = ofInt;
        if (!C80471gb.m139482a() && (linearLayout4 = this.f113394c) != null) {
            linearLayout4.setPivotX(0.0f);
        }
        if (this.f113404m) {
            LinearLayout linearLayout5 = this.f113394c;
            if (linearLayout5 != null) {
                linearLayout5.setPivotY(0.0f);
            }
        } else {
            LinearLayout linearLayout6 = this.f113394c;
            if (linearLayout6 != null) {
                linearLayout6.setPivotY((float) linearLayout6.getHeight());
            }
        }
        if (!z) {
            LinearLayout linearLayout7 = this.f113394c;
            if (linearLayout7 != null) {
                linearLayout7.setAlpha(1.0f);
            }
            LinearLayout linearLayout8 = this.f113394c;
            if (linearLayout8 != null) {
                linearLayout8.setScaleX(1.0f);
            }
            LinearLayout linearLayout9 = this.f113394c;
            if (linearLayout9 != null) {
                linearLayout9.setScaleY(1.0f);
            }
            String str = this.f113407p;
            boolean isEmpty = TextUtils.isEmpty(str);
            C89233z.C89236c cVar = new C89233z.C89236c();
            int i = f113387F;
            cVar.element = i;
            C89233z.C89236c cVar2 = new C89233z.C89236c();
            cVar2.element = f113388G;
            if (isEmpty) {
                TuxTextView tuxTextView = this.f113397f;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                }
                View view = this.f113398g;
                if (view != null) {
                    view.setVisibility(8);
                }
                ImageView imageView = this.f113399h;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                TuxTextView tuxTextView2 = this.f113397f;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(0);
                }
                boolean o = m92427o();
                View view2 = this.f113398g;
                if (view2 != null) {
                    view2.setVisibility(m92426c(o));
                }
                if (o) {
                    m92428p();
                }
                TuxTextView tuxTextView3 = this.f113397f;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(str);
                }
                LinearLayout linearLayout10 = this.f113394c;
                if (linearLayout10 != null) {
                    linearLayout10.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                }
                LinearLayout linearLayout11 = this.f113394c;
                if (linearLayout11 == null) {
                    C89219l.m154715b();
                }
                cVar.element = linearLayout11.getMeasuredWidth();
                LinearLayout linearLayout12 = this.f113394c;
                if (linearLayout12 == null) {
                    C89219l.m154715b();
                }
                cVar2.element = linearLayout12.getMeasuredHeight();
                if (C80471gb.m139482a() && (linearLayout3 = this.f113394c) != null) {
                    linearLayout3.setPivotX((float) cVar.element);
                }
                if (!this.f113404m && (linearLayout2 = this.f113394c) != null) {
                    linearLayout2.setPivotY((float) cVar2.element);
                }
            }
            if (cVar.element > 0 && cVar2.element > 0) {
                ofInt.addUpdateListener(new C49339b(this, isEmpty, cVar, cVar2));
            }
            ofInt.addListener(new C49340c(this));
        } else {
            LinearLayout linearLayout13 = this.f113394c;
            if (linearLayout13 == null) {
                C89219l.m154715b();
            }
            int width = linearLayout13.getWidth();
            LinearLayout linearLayout14 = this.f113394c;
            if (linearLayout14 == null) {
                C89219l.m154715b();
            }
            int height = linearLayout14.getHeight();
            if (C80471gb.m139482a() && (linearLayout = this.f113394c) != null) {
                linearLayout.setPivotX((float) width);
            }
            ImageView imageView2 = this.f113400i;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            ImageView imageView3 = this.f113400i;
            if (imageView3 != null) {
                imageView3.setAlpha(0.0f);
            }
            if (width > 0 && height > 0) {
                ofInt.addUpdateListener(new C49341d(this, width, height));
            }
            ofInt.addListener(new C49342e(this));
        }
        ofInt.start();
    }
}
