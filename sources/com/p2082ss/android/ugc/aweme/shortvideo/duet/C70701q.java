package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.C14171ac;
import com.bytedance.creativex.recorder.sticker.p948b.C14335a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20371ai;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.navigation.AbstractC22259h;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e;
import com.p2082ss.android.ugc.aweme.property.C65350at;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.DuetContext;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70670f;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75457a;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtPanelRecycleView;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtPanelRelativeLayout;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.tools.view.style.StyleTextView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4619j.C89271h;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q */
public final class C70701q extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: F */
    public static final C70703b f158253F = new C70703b((byte) 0);

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f158254a = {new C89232y(C70701q.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C70701q.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C89232y(C70701q.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0)};

    /* renamed from: A */
    public boolean f158255A;

    /* renamed from: B */
    public final AbstractC31193a f158256B;

    /* renamed from: C */
    public boolean f158257C;

    /* renamed from: D */
    public final Runnable f158258D;

    /* renamed from: E */
    public final AbstractC89172b<AbstractC14318d, C89391z> f158259E;

    /* renamed from: G */
    private View f158260G;

    /* renamed from: H */
    private AVDmtPanelRelativeLayout f158261H;

    /* renamed from: I */
    private AVDmtPanelRecycleView f158262I;

    /* renamed from: J */
    private View f158263J;

    /* renamed from: K */
    private View f158264K;

    /* renamed from: L */
    private View f158265L;

    /* renamed from: M */
    private View f158266M;

    /* renamed from: N */
    private View f158267N;

    /* renamed from: O */
    private final AbstractC89244h f158268O;

    /* renamed from: P */
    private AbstractC46415f f158269P;

    /* renamed from: Q */
    private final AbstractC89248d f158270Q;

    /* renamed from: R */
    private final AbstractC89248d f158271R;

    /* renamed from: S */
    private final AbstractC89248d f158272S;

    /* renamed from: T */
    private final C21582f f158273T;

    /* renamed from: U */
    private final LiveData<C14335a> f158274U;

    /* renamed from: b */
    public int f158275b;

    /* renamed from: c */
    public int f158276c = 1;

    /* renamed from: d */
    public RelativeLayout f158277d;

    /* renamed from: e */
    public ImageView f158278e;

    /* renamed from: f */
    public TextView f158279f;

    /* renamed from: g */
    DmtStatusView f158280g;

    /* renamed from: h */
    public View f158281h;

    /* renamed from: i */
    public View f158282i;

    /* renamed from: j */
    public StyleTextView f158283j;

    /* renamed from: k */
    public final SafeHandler f158284k = new SafeHandler(this);

    /* renamed from: l */
    C70691m f158285l;

    /* renamed from: t */
    C70662c f158286t;

    /* renamed from: u */
    public C70670f f158287u;

    /* renamed from: v */
    final AbstractC22259h f158288v;

    /* renamed from: w */
    public final AbstractC89183m<Float, Float, C89391z> f158289w;

    /* renamed from: x */
    public final AbstractC89171a<C89391z> f158290x;

    /* renamed from: y */
    public boolean f158291y;

    /* renamed from: z */
    float f158292z;

    static {
        Covode.recordClassIndex(83172);
    }

    /* renamed from: a */
    public final DuetLayoutModeViewModel mo111521a() {
        return (DuetLayoutModeViewModel) this.f158268O.getValue();
    }

    /* renamed from: b */
    public final AbstractC14177d mo111524b() {
        return (AbstractC14177d) this.f158270Q.mo23374a(this, f158254a[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final ShortVideoContext mo111525d() {
        return (ShortVideoContext) this.f158271R.mo23374a(this, f158254a[1]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$b */
    public static final class C70703b {
        static {
            Covode.recordClassIndex(83174);
        }

        private C70703b() {
        }

        public /* synthetic */ C70703b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f158273T;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$v */
    static final class C70724v implements AbstractC22259h {

        /* renamed from: a */
        final /* synthetic */ C70701q f158316a;

        static {
            Covode.recordClassIndex(83195);
        }

        C70724v(C70701q qVar) {
            this.f158316a = qVar;
        }

        @Override // com.bytedance.scene.navigation.AbstractC22259h
        /* renamed from: a */
        public final boolean mo36540a() {
            this.f158316a.mo111520D();
            return true;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$d */
    static final class RunnableC70705d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70701q f158297a;

        static {
            Covode.recordClassIndex(83176);
        }

        RunnableC70705d(C70701q qVar) {
            this.f158297a = qVar;
        }

        public final void run() {
            C70701q.m124943b(this.f158297a).setEnabled(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$c */
    static final class C70704c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70701q f158296a;

        static {
            Covode.recordClassIndex(83175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70704c(C70701q qVar) {
            super(0);
            this.f158296a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C70701q qVar = this.f158296a;
            qVar.f158256B.mo56767a(0, 0.5f, 0.0f, 0);
            qVar.f158256B.mo56765a(0.5f, 0.0f, 0.0f, 0.0f, 1.0f);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$e */
    static final class RunnableC70706e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70701q f158298a;

        static {
            Covode.recordClassIndex(83177);
        }

        RunnableC70706e(C70701q qVar) {
            this.f158298a = qVar;
        }

        public final void run() {
            C70701q.m124943b(this.f158298a).setRotation(0.0f);
            C70701q.m124943b(this.f158298a).setEnabled(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$s */
    static final class RunnableC70720s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70701q f158312a;

        static {
            Covode.recordClassIndex(83191);
        }

        RunnableC70720s(C70701q qVar) {
            this.f158312a = qVar;
        }

        public final void run() {
            Animation a = C75457a.m132326a(1.0f, 0.0f, 300);
            a.setAnimationListener(new Animation.AnimationListener(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.duet.C70701q.RunnableC70720s.animationAnimation$AnimationListenerC707211 */

                /* renamed from: a */
                final /* synthetic */ RunnableC70720s f158313a;

                static {
                    Covode.recordClassIndex(83192);
                }

                public final void onAnimationRepeat(Animation animation) {
                    C89219l.m154721d(animation, "");
                }

                public final void onAnimationStart(Animation animation) {
                    C89219l.m154721d(animation, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f158313a = r1;
                }

                public final void onAnimationEnd(Animation animation) {
                    C89219l.m154721d(animation, "");
                    C70701q.m124947f(this.f158313a.f158312a).setVisibility(4);
                }
            });
            C70701q.m124947f(this.f158312a).startAnimation(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$t */
    public static final class C70722t extends AbstractC40906e.C40907a {

        /* renamed from: a */
        final /* synthetic */ C70701q f158314a;

        static {
            Covode.recordClassIndex(83193);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
        /* renamed from: a */
        public final void mo70104a() {
            this.f158314a.mo111524b().mo22779a(new C14171ac(false, false, 6));
        }

        @Override // com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40904c, com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e.C40907a
        /* renamed from: d */
        public final void mo70109d() {
            this.f158314a.mo111524b().mo22779a(new C14171ac(true, false, 6));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70722t(C70701q qVar) {
            this.f158314a = qVar;
        }
    }

    /* renamed from: D */
    public final void mo111520D() {
        C70670f fVar = this.f158287u;
        if (fVar != null) {
            fVar.mo111497a();
        }
        mo111521a().mo111484a(false);
        C22227b.m41826b(this).mo36532a(this.f158288v);
    }

    /* renamed from: C */
    public final void mo111519C() {
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        DuetLayoutListViewModel duetLayoutListViewModel = (DuetLayoutListViewModel) C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(DuetLayoutListViewModel.class);
        AbstractC46415f fVar = this.f158269P;
        if (fVar == null) {
            C89219l.m154710a("effectPlatform");
        }
        C1213t<C35324a<EffectChannelResponse>> a = duetLayoutListViewModel.mo111466a(fVar, "duet-layout");
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        a.observe((ActivityC0945e) activity2, new C70719r(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$a */
    public static final class C70702a extends AbstractC89220m implements AbstractC89171a<DuetLayoutModeViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f158293a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f158294b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f158295c;

        static {
            Covode.recordClassIndex(83173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C70702a(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f158293a = jVar;
            this.f158294b = cVar;
            this.f158295c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f158293a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f158295c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f158295c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f158294b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m124957xa4ae6a1d(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f158293a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f158294b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m124957xa4ae6a1d(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.duet.C70701q.C70702a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_shortvideo_duet_DuetLayoutScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m124957xa4ae6a1d(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$k */
    public static final class C70712k implements AbstractC1214u<C14335a> {

        /* renamed from: a */
        final /* synthetic */ C70701q f158304a;

        static {
            Covode.recordClassIndex(83183);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70712k(C70701q qVar) {
            this.f158304a = qVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C14335a aVar) {
            C14335a aVar2 = aVar;
            if (aVar2 != null && aVar2.f34706a == 20 && aVar2.f34707b == 16176) {
                this.f158304a.f158276c = aVar2.f34708c;
                DuetLayoutModeViewModel a = this.f158304a.mo111521a();
                int i = 2;
                if (aVar2.f34708c == 2) {
                    i = 1;
                }
                a.mo33689c(new DuetLayoutModeViewModel.C70656b(i));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$f */
    static final class View$OnClickListenerC70707f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C70701q f158299a;

        static {
            Covode.recordClassIndex(83178);
        }

        View$OnClickListenerC70707f(C70701q qVar) {
            this.f158299a = qVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f158299a.mo111519C();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$i */
    static final class View$OnClickListenerC70710i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C70701q f158302a;

        static {
            Covode.recordClassIndex(83181);
        }

        View$OnClickListenerC70710i(C70701q qVar) {
            this.f158302a = qVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f158302a.mo111520D();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$w */
    public static final class C70725w implements IFetchEffectListener {

        /* renamed from: a */
        final /* synthetic */ Effect f158317a;

        /* renamed from: b */
        final /* synthetic */ int f158318b;

        /* renamed from: c */
        final /* synthetic */ C70701q f158319c;

        /* renamed from: d */
        final /* synthetic */ List f158320d;

        /* renamed from: e */
        final /* synthetic */ DuetContext f158321e;

        static {
            Covode.recordClassIndex(83196);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            this.f158319c.mo111522a(this.f158317a, this.f158321e, this.f158318b);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            if (effect != null) {
                C70690l.m124932c(effect);
            }
        }

        C70725w(Effect effect, int i, C70701q qVar, List list, DuetContext duetContext) {
            this.f158317a = effect;
            this.f158318b = i;
            this.f158319c = qVar;
            this.f158320d = list;
            this.f158321e = duetContext;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m124942a(C70701q qVar) {
        View view = qVar.f158282i;
        if (view == null) {
            C89219l.m154710a("cameraLayout");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m124943b(C70701q qVar) {
        View view = qVar.f158281h;
        if (view == null) {
            C89219l.m154710a("ivCamera");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m124944c(C70701q qVar) {
        ImageView imageView = qVar.f158278e;
        if (imageView == null) {
            C89219l.m154710a("mSwitchIcon");
        }
        return imageView;
    }

    /* renamed from: d */
    public static final /* synthetic */ TextView m124945d(C70701q qVar) {
        TextView textView = qVar.f158279f;
        if (textView == null) {
            C89219l.m154710a("mSwitchText");
        }
        return textView;
    }

    /* renamed from: e */
    public static final /* synthetic */ RelativeLayout m124946e(C70701q qVar) {
        RelativeLayout relativeLayout = qVar.f158277d;
        if (relativeLayout == null) {
            C89219l.m154710a("mSwitchContainer");
        }
        return relativeLayout;
    }

    /* renamed from: f */
    public static final /* synthetic */ StyleTextView m124947f(C70701q qVar) {
        StyleTextView styleTextView = qVar.f158283j;
        if (styleTextView == null) {
            C89219l.m154710a("stickerPromptView");
        }
        return styleTextView;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$m */
    static final class C70714m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C70701q f158306a;

        static {
            Covode.recordClassIndex(83185);
        }

        C70714m(C70701q qVar) {
            this.f158306a = qVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            ViewGroup.LayoutParams layoutParams = C70701q.m124942a(this.f158306a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            float b = C13628n.m24520b(this.f158306a.f52549m, 32.0f);
            Activity activity = this.f158306a.f52549m;
            if (activity == null) {
                C89219l.m154715b();
            }
            marginLayoutParams.topMargin = (int) (b + ((float) C70636dh.m124833c(activity)));
            C70701q.m124942a(this.f158306a).setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$u */
    static final class C70723u<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C70701q f158315a;

        static {
            Covode.recordClassIndex(83194);
        }

        C70723u(C70701q qVar) {
            this.f158315a = qVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            float f;
            Boolean bool = (Boolean) obj;
            C70701q qVar = this.f158315a;
            C89219l.m154716b(bool, "");
            qVar.f158255A = bool.booleanValue();
            View a = C70701q.m124942a(this.f158315a);
            if (this.f158315a.f158255A) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            a.setAlpha(f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$h */
    static final class View$OnClickListenerC70709h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C70701q f158301a;

        static {
            Covode.recordClassIndex(83180);
        }

        View$OnClickListenerC70709h(C70701q qVar) {
            this.f158301a = qVar;
        }

        public final void onClick(View view) {
            int i;
            T t;
            ClickAgent.onClick(view);
            C70701q qVar = this.f158301a;
            Activity activity = qVar.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            Activity activity2 = this.f158301a.f52549m;
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C20391d<Integer> layoutDirection = ((ChangeDuetLayoutState) ((BaseJediViewModel) C20531t.m38716a((ActivityC0945e) activity).mo33800a(ChangeDuetLayoutViewModel.class)).mo33676a((ActivityC0945e) activity2)).getLayoutDirection();
            int i2 = 0;
            if (layoutDirection == null || (t = layoutDirection.f48283b) == null) {
                i = 0;
            } else {
                i = t.intValue();
            }
            qVar.f158275b = i;
            C70701q qVar2 = this.f158301a;
            if (qVar2.f158275b != 1) {
                i2 = 1;
            }
            qVar2.f158275b = i2;
            Activity activity3 = this.f158301a.f52549m;
            Objects.requireNonNull(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ((ChangeDuetLayoutViewModel) C20531t.m38716a((ActivityC0945e) activity3).mo33800a(ChangeDuetLayoutViewModel.class)).mo111464a(this.f158301a.f158275b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$j */
    static final class View$OnClickListenerC70711j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C70701q f158303a;

        static {
            Covode.recordClassIndex(83182);
        }

        View$OnClickListenerC70711j(C70701q qVar) {
            this.f158303a = qVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f158303a.f158255A) {
                C70701q qVar = this.f158303a;
                PrivacyCert privacyCert = new PrivacyCert(new C13349j("1039"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()});
                View view2 = qVar.f158281h;
                if (view2 == null) {
                    C89219l.m154710a("ivCamera");
                }
                view2.animate().rotationBy(-180.0f).setDuration(200).withStartAction(new RunnableC70705d(qVar)).withEndAction(new RunnableC70706e(qVar)).start();
                int unused = qVar.mo111524b().mo22774a(false, privacyCert, (String) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$r */
    public static final class C70719r<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70701q f158311a;

        static {
            Covode.recordClassIndex(83190);
        }

        C70719r(C70701q qVar) {
            this.f158311a = qVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            ArrayList arrayList;
            C35324a aVar = (C35324a) obj;
            C70701q qVar = this.f158311a;
            if (aVar != null) {
                if (aVar.f83351b == C35324a.EnumC35325a.LOADING) {
                    DmtStatusView dmtStatusView = qVar.f158280g;
                    if (dmtStatusView == null) {
                        C89219l.m154710a("statusView");
                    }
                    dmtStatusView.mo27384f();
                } else if (aVar.f83351b == C35324a.EnumC35325a.ERROR) {
                    DmtStatusView dmtStatusView2 = qVar.f158280g;
                    if (dmtStatusView2 == null) {
                        C89219l.m154710a("statusView");
                    }
                    dmtStatusView2.mo27387h();
                } else if (aVar.f83351b == C35324a.EnumC35325a.SUCCESS) {
                    M m = aVar.f83350a;
                    if (m == null || C13617h.m24465a(m.getAllCategoryEffects())) {
                        DmtStatusView dmtStatusView3 = qVar.f158280g;
                        if (dmtStatusView3 == null) {
                            C89219l.m154710a("statusView");
                        }
                        dmtStatusView3.mo27385g();
                        return;
                    }
                    DmtStatusView dmtStatusView4 = qVar.f158280g;
                    if (dmtStatusView4 == null) {
                        C89219l.m154710a("statusView");
                    }
                    dmtStatusView4.mo27382d();
                    C70691m mVar = qVar.f158285l;
                    if (mVar != null) {
                        List<Effect> allCategoryEffects = m.getAllCategoryEffects();
                        Effect effect = qVar.mo111525d().f155817b.f155659o.f155695q;
                        C89219l.m154721d(allCategoryEffects, "");
                        if (C13603b.m24435a((Collection) allCategoryEffects)) {
                            arrayList = new ArrayList();
                        } else {
                            arrayList = new ArrayList();
                            if (allCategoryEffects == null) {
                                C89219l.m154715b();
                            }
                            for (Effect effect2 : allCategoryEffects) {
                                arrayList.add(new StickerWrapper(effect2, ""));
                            }
                        }
                        mVar.f158228a = arrayList;
                        if (effect != null) {
                            Iterator<? extends StickerWrapper> it = mVar.f158228a.iterator();
                            int i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (!C89219l.m154714a((Object) ((StickerWrapper) it.next()).f169181a.getEffect_id(), (Object) effect.getEffect_id())) {
                                    i++;
                                } else if (i >= 0) {
                                    mVar.mo111513a(i, false);
                                }
                            }
                        }
                    }
                    C70691m mVar2 = qVar.f158285l;
                    if (mVar2 != null) {
                        mVar2.notifyDataSetChanged();
                    }
                    qVar.mo111523a(m.getAllCategoryEffects());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo111523a(List<? extends Effect> list) {
        T t;
        if (mo111525d().f155752M) {
            DuetContext duetContext = mo111525d().f155817b.f155659o;
            C89219l.m154716b(duetContext, "");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89219l.m154714a((Object) C70690l.m124932c(t), (Object) duetContext.f155693o)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                int b = C89271h.m154769b(list.indexOf(t2), 0);
                AbstractC46415f fVar = this.f158269P;
                if (fVar == null) {
                    C89219l.m154710a("effectPlatform");
                }
                if (fVar.mo78918c(t2)) {
                    mo111522a(t2, duetContext, b);
                    return;
                }
                AbstractC46415f fVar2 = this.f158269P;
                if (fVar2 == null) {
                    C89219l.m154710a("effectPlatform");
                }
                fVar2.mo78915b(t2, new C70725w(t2, b, this, list, duetContext));
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View view = this.f158260G;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        View findViewById = view.findViewById(R.id.apm);
        C89219l.m154716b(findViewById, "");
        this.f158277d = (RelativeLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.apn);
        C89219l.m154716b(findViewById2, "");
        this.f158278e = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.apo);
        C89219l.m154716b(findViewById3, "");
        this.f158279f = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.aph);
        C89219l.m154716b(findViewById4, "");
        this.f158261H = (AVDmtPanelRelativeLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.apk);
        C89219l.m154716b(findViewById5, "");
        this.f158262I = (AVDmtPanelRecycleView) findViewById5;
        View findViewById6 = view.findViewById(R.id.apl);
        C89219l.m154716b(findViewById6, "");
        this.f158263J = findViewById6;
        View findViewById7 = view.findViewById(R.id.api);
        C89219l.m154716b(findViewById7, "");
        this.f158264K = findViewById7;
        View findViewById8 = view.findViewById(R.id.apj);
        C89219l.m154716b(findViewById8, "");
        this.f158280g = (DmtStatusView) findViewById8;
        LayoutInflater from = LayoutInflater.from(this.f52549m);
        View view2 = this.f158260G;
        if (view2 == null) {
            C89219l.m154710a("rootView");
        }
        Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        View a = C1764a.m5927a(from, R.layout.eb, (ViewGroup) view2, false);
        C89219l.m154716b(a, "");
        this.f158265L = a;
        if (a == null) {
            C89219l.m154710a("errorView");
        }
        View findViewById9 = a.findViewById(R.id.awr);
        C89219l.m154716b(findViewById9, "");
        this.f158266M = findViewById9;
        if (findViewById9 == null) {
            C89219l.m154710a("retryView");
        }
        findViewById9.setOnClickListener(new View$OnClickListenerC70707f(this));
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) activity).mo33800a(ChangeDuetLayoutViewModel.class);
        C89219l.m154716b(a2, "");
        selectNonNullSubscribe(a2, C70727r.f158323a, new C20370ah(), new C70708g(this));
        RelativeLayout relativeLayout = this.f158277d;
        if (relativeLayout == null) {
            C89219l.m154710a("mSwitchContainer");
        }
        relativeLayout.setOnClickListener(new View$OnClickListenerC70709h(this));
        View view3 = this.f158263J;
        if (view3 == null) {
            C89219l.m154710a("mOutsideView");
        }
        view3.setOnClickListener(new View$OnClickListenerC70710i(this));
        DmtStatusView dmtStatusView = this.f158280g;
        if (dmtStatusView == null) {
            C89219l.m154710a("statusView");
        }
        DmtStatusView.C17269a a3 = DmtStatusView.C17269a.m31905a(mo36483q());
        View view4 = this.f158265L;
        if (view4 == null) {
            C89219l.m154710a("errorView");
        }
        DmtStatusView.C17269a b = a3.mo27408c(view4).mo27405b();
        b.f41304g = 1;
        dmtStatusView.setBuilder(b);
        View view5 = this.f158282i;
        if (view5 == null) {
            C89219l.m154710a("cameraLayout");
        }
        view5.setVisibility(0);
        View view6 = this.f158282i;
        if (view6 == null) {
            C89219l.m154710a("cameraLayout");
        }
        View findViewById10 = view6.findViewById(R.id.bwm);
        C89219l.m154716b(findViewById10, "");
        this.f158281h = findViewById10;
        if (C65350at.m117036a()) {
            View view7 = this.f158281h;
            if (view7 == null) {
                C89219l.m154710a("ivCamera");
            }
            Objects.requireNonNull(view7, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) view7).setImageResource(2131232558);
        } else {
            View view8 = this.f158281h;
            if (view8 == null) {
                C89219l.m154710a("ivCamera");
            }
            Objects.requireNonNull(view8, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) view8).setImageResource(2131232557);
        }
        View view9 = this.f158282i;
        if (view9 == null) {
            C89219l.m154710a("cameraLayout");
        }
        View findViewById11 = view9.findViewById(R.id.ex1);
        C89219l.m154716b(findViewById11, "");
        this.f158267N = findViewById11;
        View view10 = this.f158282i;
        if (view10 == null) {
            C89219l.m154710a("cameraLayout");
        }
        view10.setOnClickListener(new View$OnClickListenerC70711j(this));
        LiveData<C14335a> liveData = this.f158274U;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        liveData.observe((ActivityC0945e) activity2, new C70712k(this));
        selectNonNullSubscribe(mo111521a(), C70729t.f158325a, C20371ai.m38577a(), new C70715n(this));
        selectNonNullSubscribe(mo111521a(), C70730u.f158326a, C20371ai.m38577a(), new C70716o(this));
        selectNonNullSubscribe(mo111521a(), C70731v.f158327a, C20371ai.m38577a(), new C70717p(this));
        selectNonNullSubscribe(mo111521a(), C70732w.f158328a, C20371ai.m38577a(), new C70718q(this));
        selectNonNullSubscribe(mo111521a(), C70728s.f158324a, C20371ai.m38577a(), new C70713l(this));
        ((AbstractC71864a) this.f158272S.mo23374a(this, f158254a[2])).mo113515d().mo7036a(this, new C70714m(this));
        View view11 = this.f158260G;
        if (view11 == null) {
            C89219l.m154710a("rootView");
        }
        View view12 = this.f158282i;
        if (view12 == null) {
            C89219l.m154710a("cameraLayout");
        }
        C70662c cVar = new C70662c(view11, view12);
        this.f158286t = cVar;
        cVar.f158165a = new C70722t(this);
        mo111524b().mo22824l().mo6997a(this, new C70723u(this));
        Activity activity3 = this.f52549m;
        if (activity3 == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity3, "");
        this.f158269P = C46404c.m89554a(activity3, null);
        Activity activity4 = this.f52549m;
        Objects.requireNonNull(activity4, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActivityC0218d dVar = (ActivityC0218d) activity4;
        ShortVideoContext d = mo111525d();
        AbstractC46415f fVar = this.f158269P;
        if (fVar == null) {
            C89219l.m154710a("effectPlatform");
        }
        this.f158285l = new C70691m(dVar, d, fVar, mo111521a());
        AVDmtPanelRecycleView aVDmtPanelRecycleView = this.f158262I;
        if (aVDmtPanelRecycleView == null) {
            C89219l.m154710a("mModeRecyclerView");
        }
        aVDmtPanelRecycleView.setAdapter(this.f158285l);
        AVDmtPanelRecycleView aVDmtPanelRecycleView2 = this.f158262I;
        if (aVDmtPanelRecycleView2 == null) {
            C89219l.m154710a("mModeRecyclerView");
        }
        aVDmtPanelRecycleView2.setLayoutManager(new LinearLayoutManager(0, false));
        mo111519C();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$g */
    static final class C70708g extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20391d<? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70701q f158300a;

        static {
            Covode.recordClassIndex(83179);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70708g(C70701q qVar) {
            super(2);
            this.f158300a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C20391d<? extends Integer> dVar) {
            C20391d<? extends Integer> dVar2 = dVar;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(dVar2, "");
            this.f158300a.f158275b = dVar2.f48283b.intValue();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$l */
    static final class C70713l extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70701q f158305a;

        static {
            Covode.recordClassIndex(83184);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70713l(C70701q qVar) {
            super(2);
            this.f158305a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            num.intValue();
            C89219l.m154721d(bVar, "");
            C70670f fVar = this.f158305a.f158287u;
            if (fVar != null) {
                fVar.mo111497a();
            }
            this.f158305a.f158291y = true;
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.e5, viewGroup, false);
        View findViewById = a.findViewById(R.id.apq);
        C89219l.m154716b(findViewById, "");
        this.f158260G = findViewById;
        View findViewById2 = a.findViewById(R.id.bti);
        C89219l.m154716b(findViewById2, "");
        this.f158282i = findViewById2;
        View findViewById3 = a.findViewById(R.id.e97);
        C89219l.m154716b(findViewById3, "");
        this.f158283j = (StyleTextView) findViewById3;
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$p */
    static final class C70717p extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70701q f158309a;

        static {
            Covode.recordClassIndex(83188);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70717p(C70701q qVar) {
            super(2);
            this.f158309a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(bVar, "");
            if (intValue == 0) {
                this.f158309a.f158259E.invoke(new AbstractC14318d.C14319a());
            } else if (intValue == 1) {
                AbstractC89172b<AbstractC14318d, C89391z> bVar2 = this.f158309a.f158259E;
                AbstractC31193a aVar = this.f158309a.f158256B;
                ViewGroup.LayoutParams layoutParams = this.f158309a.mo111524b().mo22750D().getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                bVar2.invoke(new C70682i(aVar, new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams)));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$q */
    static final class C70718q extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70701q f158310a;

        static {
            Covode.recordClassIndex(83189);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70718q(C70701q qVar) {
            super(2);
            this.f158310a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, String str) {
            String str2 = str;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(str2, "");
            C70701q.m124947f(this.f158310a).setText(str2);
            this.f158310a.f158284k.removeCallbacks(this.f158310a.f158258D);
            if (TextUtils.isEmpty(str2)) {
                C70701q.m124947f(this.f158310a).setVisibility(8);
            } else {
                C70701q.m124947f(this.f158310a).setVisibility(0);
                this.f158310a.f158284k.postDelayed(this.f158310a.f158258D, 5000);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$x */
    static final class C70726x extends AbstractC89220m implements AbstractC89183m<Float, Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70701q f158322a;

        static {
            Covode.recordClassIndex(83197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70726x(C70701q qVar) {
            super(2);
            this.f158322a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Float f, Float f2) {
            int i;
            float floatValue = f.floatValue();
            float floatValue2 = f2.floatValue();
            C70701q qVar = this.f158322a;
            if (qVar.f158276c == 0) {
                i = 1;
            } else {
                i = this.f158322a.f158276c;
            }
            float f3 = floatValue2 / ((float) i);
            int e = C70636dh.m124836e(qVar.f52549m);
            if (qVar.f158291y) {
                qVar.f158292z = f3;
                qVar.f158256B.mo56767a(0, 0.5f, (-floatValue) / ((float) e), 0);
                qVar.f158291y = false;
            }
            float f4 = (float) e;
            qVar.f158256B.mo56765a(0.5f, ((-floatValue) + f3) / f4, 0.0f, (-(f3 - qVar.f158292z)) / f4, 1.0f);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$n */
    static final class C70715n extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70701q f158307a;

        static {
            Covode.recordClassIndex(83186);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70715n(C70701q qVar) {
            super(2);
            this.f158307a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(bVar, "");
            this.f158307a.f158275b = 0;
            if (intValue == 1) {
                C70701q.m124944c(this.f158307a).setImageDrawable(this.f158307a.mo36486t().getResources().getDrawable(2131232266));
                C70701q.m124945d(this.f158307a).setText(this.f158307a.mo36486t().getResources().getString(R.string.be_));
                C70701q.m124946e(this.f158307a).setVisibility(0);
            } else if (intValue != 2) {
                C70701q.m124946e(this.f158307a).setVisibility(4);
            } else {
                C70701q.m124944c(this.f158307a).setImageDrawable(this.f158307a.mo36486t().getResources().getDrawable(2131232270));
                C70701q.m124945d(this.f158307a).setText(this.f158307a.mo36486t().getResources().getString(R.string.bea));
                C70701q.m124946e(this.f158307a).setVisibility(0);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.q$o */
    static final class C70716o extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70701q f158308a;

        static {
            Covode.recordClassIndex(83187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70716o(C70701q qVar) {
            super(2);
            this.f158308a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(bVar, "");
            C70670f.EnumC70671a aVar = C70670f.EnumC70671a.NONE;
            if (intValue == 1) {
                aVar = C70670f.EnumC70671a.UP_DOWN;
            } else if (intValue == 2) {
                aVar = C70670f.EnumC70671a.THREE_SCREEN;
            }
            C70701q qVar = this.f158308a;
            View view = this.f158308a.f52550n;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
            qVar.f158287u = new C70670f((ViewGroup) view, aVar);
            C70670f fVar = this.f158308a.f158287u;
            if (fVar != null) {
                AbstractC89183m<Float, Float, C89391z> mVar = this.f158308a.f158289w;
                AbstractC89171a<C89391z> aVar2 = this.f158308a.f158290x;
                fVar.f158189h = mVar;
                fVar.f158190i = aVar2;
            }
            C70670f fVar2 = this.f158308a.f158287u;
            if (fVar2 != null) {
                int i = C70680g.f158201a[fVar2.f158192k.ordinal()];
                if (i != 1) {
                    if (i == 2 && C70683j.f158213a.mo70163b("duet_layout_three_screen_drag_gesture_hint")) {
                        fVar2.f158188g = (-fVar2.f158185d) / 3.0f;
                    }
                } else if (C70683j.f158213a.mo70163b("duet_layout_up_down_drag_gesture_hint")) {
                    fVar2.f158188g = (-fVar2.f158185d) / 4.0f;
                }
                fVar2.f158182a.setTranslationY(fVar2.f158188g);
                fVar2.f158182a.mo5835c();
                fVar2.f158182a.mo5828a(fVar2);
                fVar2.f158182a.setAnimation("duet_layout_drag_lottie_mt.json");
                fVar2.f158182a.setRepeatCount(1);
                fVar2.f158182a.setRepeatMode(1);
                fVar2.f158182a.postDelayed(new C70670f.RunnableC70676f(new C70670f.C70678h(fVar2)), fVar2.f158187f);
                Context context = fVar2.f158191j.getContext();
                C89219l.m154716b(context, "");
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, -context.getResources().getDimension(R.dimen.j8)).setDuration(fVar2.f158184c);
                duration.removeAllUpdateListeners();
                fVar2.f158183b = duration;
                ValueAnimator valueAnimator = fVar2.f158183b;
                if (valueAnimator != null) {
                    valueAnimator.addUpdateListener(new C70670f.C70679i(fVar2));
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: a */
    public final void mo111522a(Effect effect, DuetContext duetContext, int i) {
        if (effect != null && duetContext != null && this.f52549m != null) {
            C70691m mVar = this.f158285l;
            if (mVar != null) {
                mVar.mo111513a(i, false);
            }
            Activity activity = this.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            JediViewModel a = C20531t.m38716a((ActivityC0945e) activity).mo33800a(ChangeDuetLayoutViewModel.class);
            C89219l.m154716b(a, "");
            ChangeDuetLayoutViewModel changeDuetLayoutViewModel = (ChangeDuetLayoutViewModel) a;
            if (duetContext.f155694p != 0) {
                changeDuetLayoutViewModel.mo111464a(duetContext.f155694p);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super com.bytedance.creativex.recorder.gesture.api.d, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C70701q(C21582f fVar, LiveData<C14335a> liveData, AbstractC89172b<? super AbstractC14318d, C89391z> bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(liveData, "");
        C89219l.m154721d(bVar, "");
        this.f158273T = fVar;
        this.f158274U = liveData;
        this.f158259E = bVar;
        AbstractC89277c a = C89204ab.m154669a(DuetLayoutModeViewModel.class);
        this.f158268O = C89250i.m154773a((AbstractC89171a) new C70702a(this, a, a));
        this.f158288v = new C70724v(this);
        this.f158289w = new C70726x(this);
        this.f158290x = new C70704c(this);
        this.f158291y = true;
        this.f158255A = true;
        this.f158270Q = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);
        this.f158271R = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);
        this.f158272S = C21572a.m40504a(getDiContainer(), AbstractC71864a.class);
        this.f158256B = mo111524b().mo22747A().getEffectController();
        this.f158257C = true;
        this.f158258D = new RunnableC70720s(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
