package com.p2082ss.android.ugc.aweme.feed.assem.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48198ba;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.p2082ss.android.ugc.aweme.feed.helper.C49645l;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50559x;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.main.p3428b.C59043a;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59240f;
import com.p2082ss.android.ugc.aweme.p2307ai.View$OnTouchListenerC33468a;
import com.p2082ss.android.ugc.aweme.p2483co.C36153g;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.C69508y;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71904j;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h */
public final class View$OnClickListenerC49022h extends AbstractC48491a<View$OnClickListenerC49022h> implements View.OnClickListener {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f112953u = {new C89232y(View$OnClickListenerC49022h.class, "videoShareVM", "getVideoShareVM()Lcom/ss/android/ugc/aweme/feed/assem/share/VideoShareViewModel;", 0)};

    /* renamed from: v */
    public static final C49035m f112954v = new C49035m((byte) 0);

    /* renamed from: A */
    private SparseArray f112955A;

    /* renamed from: w */
    private final AbstractC89248d f112956w;

    /* renamed from: x */
    private final AbstractC89244h f112957x;

    /* renamed from: y */
    private final AbstractC89244h f112958y;

    /* renamed from: z */
    private C36153g f112959z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$b */
    public static final class C49024b extends AbstractC89220m implements AbstractC89172b<C49067r, C49067r> {
        public static final C49024b INSTANCE = new C49024b();

        static {
            Covode.recordClassIndex(57815);
        }

        public C49024b() {
            super(1);
        }

        public final C49067r invoke(C49067r rVar) {
            C89219l.m154719c(rVar, "");
            return rVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$g */
    public static final class C49029g extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C49029g INSTANCE = new C49029g();

        static {
            Covode.recordClassIndex(57820);
        }

        public C49029g() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$j */
    public static final class C49032j extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {
        public static final C49032j INSTANCE = new C49032j();

        static {
            Covode.recordClassIndex(57823);
        }

        public C49032j() {
            super(1);
        }

        public final C48198ba invoke(C48198ba baVar) {
            C89219l.m154719c(baVar, "");
            return baVar;
        }
    }

    static {
        Covode.recordClassIndex(57813);
    }

    /* renamed from: K */
    private final VideoViewModel m92188K() {
        return (VideoViewModel) this.f112957x.getValue();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.t5;
    }

    /* renamed from: G */
    public final VideoShareViewModel mo80785G() {
        return (VideoShareViewModel) this.f112956w.mo23374a(this, f112953u[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112955A == null) {
            this.f112955A = new SparseArray();
        }
        View view = (View) this.f112955A.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112955A.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$m */
    public static final class C49035m {
        static {
            Covode.recordClassIndex(57826);
        }

        private C49035m() {
        }

        public /* synthetic */ C49035m(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$c */
    public static final class C49025c extends AbstractC89220m implements AbstractC89171a<C12874b<C49067r>> {
        public static final C49025c INSTANCE = new C49025c();

        static {
            Covode.recordClassIndex(57816);
        }

        public C49025c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C49067r> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$d */
    public static final class C49026d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112961a;

        static {
            Covode.recordClassIndex(57817);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49026d(AbstractC12693u uVar) {
            super(0);
            this.f112961a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112961a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$h */
    public static final class C49030h extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C49030h INSTANCE = new C49030h();

        static {
            Covode.recordClassIndex(57821);
        }

        public C49030h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$i */
    public static final class C49031i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C49031i INSTANCE = new C49031i();

        static {
            Covode.recordClassIndex(57822);
        }

        public C49031i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$k */
    public static final class C49033k extends AbstractC89220m implements AbstractC89171a<C12874b<C48198ba>> {
        public static final C49033k INSTANCE = new C49033k();

        static {
            Covode.recordClassIndex(57824);
        }

        public C49033k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48198ba> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$l */
    public static final class C49034l extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C49034l INSTANCE = new C49034l();

        static {
            Covode.recordClassIndex(57825);
        }

        public C49034l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$n */
    public static final class RunnableC49036n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f112964a;

        static {
            Covode.recordClassIndex(57827);
        }

        RunnableC49036n(FrameLayout frameLayout) {
            this.f112964a = frameLayout;
        }

        public final void run() {
            this.f112964a.clearAnimation();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: E */
    public final void mo20548E() {
        super.mo20548E();
        mo80787J();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$e */
    public static final class C49027e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112962a;

        static {
            Covode.recordClassIndex(57818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49027e(AbstractC12693u uVar) {
            super(0);
            this.f112962a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112962a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$f */
    public static final class C49028f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112963a;

        static {
            Covode.recordClassIndex(57819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49028f(AbstractC12693u uVar) {
            super(0);
            this.f112963a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112963a.bD_().f30985g;
        }
    }

    /* renamed from: I */
    public final C36153g mo80786I() {
        if (this.f112959z == null) {
            this.f112959z = new C36153g();
        }
        return this.f112959z;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a, com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final void mo20466a() {
        super.mo20466a();
        mo80785G().mo80765a((Context) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$a */
    public static final class C49023a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112960a;

        static {
            Covode.recordClassIndex(57814);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49023a(AbstractC89277c cVar) {
            super(0);
            this.f112960a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112960a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$o */
    static final class RunnableC49037o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f112965a;

        /* renamed from: b */
        final /* synthetic */ View$OnClickListenerC49022h f112966b;

        static {
            Covode.recordClassIndex(57828);
        }

        RunnableC49037o(FrameLayout frameLayout, View$OnClickListenerC49022h hVar) {
            this.f112965a = frameLayout;
            this.f112966b = hVar;
        }

        public final void run() {
            C34577e.m70591a((RemoteImageView) this.f112966b.mo20546C().findViewById(R.id.dxv), 2131233153);
            this.f112965a.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150).withEndAction(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.assem.share.View$OnClickListenerC49022h.RunnableC49037o.RunnableC490381 */

                /* renamed from: a */
                final /* synthetic */ RunnableC49037o f112967a;

                static {
                    Covode.recordClassIndex(57829);
                }

                {
                    this.f112967a = r1;
                }

                public final void run() {
                    this.f112967a.f112965a.clearAnimation();
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$x */
    static final class RunnableC49055x implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RemoteImageView f112987a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f112988b;

        static {
            Covode.recordClassIndex(57846);
        }

        RunnableC49055x(RemoteImageView remoteImageView, FrameLayout frameLayout) {
            this.f112987a = remoteImageView;
            this.f112988b = frameLayout;
        }

        public final void run() {
            C34577e.m70591a(this.f112987a, 2131231780);
            this.f112988b.animate().scaleX(1.16f).scaleY(1.16f).setDuration(150).withEndAction(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.assem.share.View$OnClickListenerC49022h.RunnableC49055x.RunnableC490561 */

                /* renamed from: a */
                final /* synthetic */ RunnableC49055x f112989a;

                static {
                    Covode.recordClassIndex(57847);
                }

                {
                    this.f112989a = r1;
                }

                public final void run() {
                    this.f112989a.f112988b.animate().scaleX(0.8f).scaleY(0.8f).setDuration(150).withEndAction(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.feed.assem.share.View$OnClickListenerC49022h.RunnableC49055x.RunnableC490561.RunnableC490571 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC490561 f112990a;

                        static {
                            Covode.recordClassIndex(57848);
                        }

                        {
                            this.f112990a = r1;
                        }

                        public final void run() {
                            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.16f, 0.8f, 1.16f, 1, 0.5f, 1, 0.5f);
                            scaleAnimation.setDuration(600);
                            scaleAnimation.setRepeatMode(2);
                            scaleAnimation.setRepeatCount(-1);
                            this.f112990a.f112989a.f112988b.startAnimation(scaleAnimation);
                        }
                    }).start();
                }
            }).start();
        }
    }

    /* renamed from: J */
    public final void mo80787J() {
        FrameLayout frameLayout = (FrameLayout) mo20546C().findViewById(R.id.dxn);
        if (frameLayout != null) {
            Animation animation = frameLayout.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            C34727m.m70944a(new RunnableC49036n(frameLayout));
        }
        mo80785G().mo80768i();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        AbstractC12818f.C12819a.m23063a(this, mo80785G(), C49059j.f112992a, (C12854k) null, C49039p.f112968a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80785G(), C49060k.f112993a, (C12854k) null, C49040q.f112969a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80785G(), C49061l.f112994a, (C12854k) null, C49041r.f112970a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80785G(), C49062m.f112995a, C12856l.m23103b(), C49042s.f112971a, 4);
        super.mo20533y();
    }

    public View$OnClickListenerC49022h() {
        AbstractC12848i.C12851c cVar = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a = C89204ab.m154669a(VideoShareViewModel.class);
        this.f112956w = C14530k.m26542a(this, a, cVar == null ? AbstractC12848i.C12851c.f31277a : cVar, new C49023a(a), C49025c.INSTANCE, new C49026d(this), C49024b.INSTANCE, null, null, new C49027e(this), new C49028f(this));
        this.f112957x = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C49030h.INSTANCE, C49031i.INSTANCE, C49029g.INSTANCE);
        this.f112958y = new C14524g(C89204ab.m154669a(VideoEventDispatchViewModel.class), this, C49033k.INSTANCE, C49034l.INSTANCE, C49032j.INSTANCE);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a, com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: b */
    public final /* synthetic */ void mo20469b(VideoItemParams videoItemParams) {
        mo20469b(videoItemParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: a */
    public final void mo80495a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
        super.mo20469b(videoItemParams);
        mo80785G().mo80765a(az_());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
        C36153g I = mo80786I();
        if (I != null) {
            I.mo63274b();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        ((RemoteImageView) mo20546C().findViewById(R.id.dxv)).setOnClickListener(this);
        ((RemoteImageView) mo20546C().findViewById(R.id.dxv)).setOnTouchListener(new View$OnTouchListenerC33468a(0.6f));
        ((TuxTextView) mo20546C().findViewById(R.id.dxq)).setOnClickListener(this);
        ((FrameLayout) mo20546C().findViewById(R.id.dxn)).setOnClickListener(this);
        C36153g I = mo80786I();
        if (I != null) {
            I.f85409a = mo20528t();
            I.f85410b = mo20546C();
            I.f85411c = (FrameLayout) mo20546C().findViewById(R.id.dxn);
            I.f85412d = (RemoteImageView) mo20546C().findViewById(R.id.dxv);
        }
        AbstractC12818f.C12819a.m23063a(this, m92188K(), C49063n.f112996a, (C12854k) null, C49051t.f112983a, 6);
        AbstractC12818f.C12819a.m23070b(this, m92188K(), C49064o.f112997a, (C12854k) null, C49052u.f112984a, 6);
        AbstractC12818f.C12819a.m23070b(this, m92188K(), C49065p.f112998a, (C12854k) null, C49053v.f112985a, 6);
        AbstractC12818f.C12819a.m23070b(this, (VideoEventDispatchViewModel) this.f112958y.getValue(), C49066q.f112999a, (C12854k) null, C49054w.f112986a, 6);
    }

    public final void onClick(View view) {
        RemoteImageView remoteImageView;
        DataCenter dataCenter;
        Aweme aweme;
        String uid;
        String str;
        String str2;
        C49812b a;
        C49812b a2;
        String uid2;
        String str3;
        ClickAgent.onClick(view);
        if (!C58001a.m104815a(view, 1200)) {
            C49021g.m92187a();
            C39162r.m79460a("verify_precise_exp", new C33744d().mo59983a("scene", "enter_share").f79943a);
            VideoShareViewModel G = mo80785G();
            View C = mo20546C();
            String str4 = null;
            if (C != null) {
                remoteImageView = (RemoteImageView) C.findViewById(R.id.dxv);
            } else {
                remoteImageView = null;
            }
            VideoItemParams videoItemParams = (VideoItemParams) G.mo23342g();
            if (videoItemParams != null && (dataCenter = videoItemParams.dataCenter) != null) {
                String str5 = "";
                C89219l.m154716b(dataCenter, str5);
                VideoItemParams videoItemParams2 = (VideoItemParams) G.mo23342g();
                if (videoItemParams2 != null && (aweme = videoItemParams2.mAweme) != null) {
                    dataCenter.mo60191a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", aweme.getAid());
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - G.f112923v < 800) {
                        G.f112923v = 0;
                    } else if (C37699a.m76252aX(aweme)) {
                        new C79459a(G.mo23343h()).mo123050a(R.string.o2).mo123053a();
                    } else {
                        G.f112923v = currentTimeMillis;
                        if (((aweme.isCanPlay() && !aweme.isDelete()) || C50559x.m94790a(aweme, ((FeedBaseViewModel) G).f112230o) || C58956a.m108316b(aweme)) && (((FeedBaseViewModel) G).f112230o == 1000 || C50559x.m94790a(aweme, ((FeedBaseViewModel) G).f112230o) || !C58956a.m108315a(aweme))) {
                            if (C69508y.f155284b && !C56216k.m102133c()) {
                                C69508y.m122723c(aweme);
                            }
                            dataCenter.mo60191a("video_share_click", (Object) null);
                            if (G.f112922n) {
                                C33744d a3 = new C33744d().mo59983a("group_id", C59208ac.m108771e(aweme)).mo59983a("author_id", C59208ac.m108758a(aweme));
                                Context h = G.mo23343h();
                                if (!(h instanceof Activity)) {
                                    h = null;
                                }
                                Activity activity = (Activity) h;
                                if (activity != null) {
                                    str3 = C68863ah.f154028b.mo109365b(activity);
                                } else {
                                    str3 = null;
                                }
                                C39162r.m79460a("share_highlight_click", a3.mo59983a("show_content", str3).mo59980a("is_pop_up", 0).f79943a);
                            } else if (remoteImageView != null) {
                                C49645l.m93085a();
                                C49645l.m93088a(remoteImageView, G.f112231p, C59208ac.m108771e(aweme), C59208ac.m108758a(aweme));
                            }
                            SecApiImpl.m119993a().reportData("share");
                            G.mo80768i();
                            String str6 = G.f112231p;
                            if (str6 == null) {
                                str6 = str5;
                            }
                            boolean c = C56216k.m102133c();
                            int hashCode = str6.hashCode();
                            if (hashCode != -1271119582) {
                                if (hashCode == 1691937916 && str6.equals("homepage_hot")) {
                                    C17867d.m33078a();
                                    C39162r.m79455a("click_share_button", "homepage_hot", aweme.getAid(), 0);
                                    C59240f f = new C59240f(c).mo96797a("homepage_hot").mo96749g(aweme);
                                    f.f135194p = (String) dataCenter.mo60195b("playlist_id", str5);
                                    f.f135193e = (String) dataCenter.mo60195b("playlist_id_key", str5);
                                    f.f135192d = (String) dataCenter.mo60195b("playlist_type", str5);
                                    C59240f fVar = (C59240f) f.mo96801c((String) dataCenter.mo60195b("tab_name", str5)).mo96802d(C59208ac.m108764b(aweme, ((FeedBaseViewModel) G).f112230o));
                                    User author = aweme.getAuthor();
                                    if (!(author == null || (uid2 = author.getUid()) == null)) {
                                        str5 = uid2;
                                    }
                                    fVar.f135190b = str5;
                                    fVar.f135200v = C76706a.m134276b(aweme);
                                    fVar.f135222V = C76598h.m134176a(aweme.getAuthor());
                                    fVar.f135199u = Boolean.valueOf(C76706a.m134281g(aweme));
                                    C79900c.m138667a(fVar, aweme, "homepage_hot").mo96792f();
                                    if (C37699a.m76314s(aweme)) {
                                        C38000g.m77050a().mo65909u(G.mo23343h(), aweme);
                                    }
                                    AbstractC81915c.m141874a(new C59043a());
                                }
                            } else if (str6.equals("homepage_follow")) {
                                C17867d.m33078a();
                                C39162r.m79455a("click_share_button", "homepage_follow", aweme.getAid(), 0);
                                C59240f f2 = new C59240f(c).mo96797a("homepage_follow").mo96749g(aweme);
                                f2.f135194p = (String) dataCenter.mo60195b("playlist_id", str5);
                                f2.f135193e = (String) dataCenter.mo60195b("playlist_id_key", str5);
                                f2.f135192d = (String) dataCenter.mo60195b("playlist_type", str5);
                                C59240f fVar2 = (C59240f) f2.mo96801c((String) dataCenter.mo60195b("tab_name", str5)).mo96802d(C59208ac.m108764b(aweme, ((FeedBaseViewModel) G).f112230o));
                                User author2 = aweme.getAuthor();
                                if (!(author2 == null || (uid = author2.getUid()) == null)) {
                                    str5 = uid;
                                }
                                fVar2.f135190b = str5;
                                fVar2.mo96792f();
                                AbstractC81915c.m141874a(new C59043a());
                            }
                            if (G.f112236u == 2) {
                                C17867d.m33078a();
                                C39162r.m79455a("click_share_button", str6, aweme.getAid(), 0);
                                Context h2 = G.mo23343h();
                                if (h2 == null || (a2 = FeedParamProvider.C49809a.m93270a(h2)) == null) {
                                    str = null;
                                } else {
                                    str = a2.getSearchResultId();
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str = C59208ac.m108771e(aweme);
                                }
                                C59240f fVar3 = new C59240f(c);
                                String str7 = G.f112231p;
                                if (str7 == null) {
                                    str7 = str5;
                                }
                                C59240f f3 = fVar3.mo96797a(str7).mo96749g(aweme);
                                f3.f135194p = (String) dataCenter.mo60195b("playlist_id", str5);
                                f3.f135193e = (String) dataCenter.mo60195b("playlist_id_key", str5);
                                f3.f135192d = (String) dataCenter.mo60195b("playlist_type", str5);
                                C59240f fVar4 = (C59240f) f3.mo96801c((String) dataCenter.mo60195b("tab_name", str5)).mo96802d(C59208ac.m108764b(aweme, ((FeedBaseViewModel) G).f112230o));
                                User author3 = aweme.getAuthor();
                                if (author3 == null || (str2 = author3.getUid()) == null) {
                                    str2 = str5;
                                }
                                fVar4.f135190b = str2;
                                Context h3 = G.mo23343h();
                                if (!(h3 == null || (a = FeedParamProvider.C49809a.m93270a(h3)) == null)) {
                                    str4 = a.getSearchId();
                                }
                                AbstractC59233c a4 = fVar4.mo96810l(str4).mo96804f(str).mo96788a(C80632w.m139800a(aweme, "click_more_button", str6));
                                String str8 = G.f112231p;
                                if (str8 != null) {
                                    str5 = str8;
                                }
                                C79900c.m138667a(a4, aweme, str5).mo96792f();
                            }
                            AbstractC81915c.m141874a(new C59043a());
                        } else if (aweme.isImage()) {
                            new C79459a(G.mo23343h()).mo123050a(R.string.civ).mo123053a();
                        } else {
                            new C79459a(G.mo23343h()).mo123052a(C58956a.m108314a(aweme, R.string.h8k)).mo123053a();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$t */
    static final class C49051t extends AbstractC89220m implements AbstractC89183m<View$OnClickListenerC49022h, C12776a<? extends String>, C89391z> {

        /* renamed from: a */
        public static final C49051t f112983a = new C49051t();

        static {
            Covode.recordClassIndex(57842);
        }

        C49051t() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View$OnClickListenerC49022h hVar, C12776a<? extends String> aVar) {
            View$OnClickListenerC49022h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            if (aVar != null) {
                hVar2.mo80787J();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$u */
    static final class C49052u extends AbstractC89220m implements AbstractC89183m<View$OnClickListenerC49022h, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C49052u f112984a = new C49052u();

        static {
            Covode.recordClassIndex(57843);
        }

        C49052u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View$OnClickListenerC49022h hVar, C12776a<? extends Integer> aVar) {
            View$OnClickListenerC49022h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            if (aVar != null) {
                hVar2.mo80785G().mo20662a(VideoShareViewModel.C49010g.f112932a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$v */
    static final class C49053v extends AbstractC89220m implements AbstractC89183m<View$OnClickListenerC49022h, C12776a<? extends VideoItemParams>, C89391z> {

        /* renamed from: a */
        public static final C49053v f112985a = new C49053v();

        static {
            Covode.recordClassIndex(57844);
        }

        C49053v() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View$OnClickListenerC49022h hVar, C12776a<? extends VideoItemParams> aVar) {
            View$OnClickListenerC49022h hVar2 = hVar;
            C12776a<? extends VideoItemParams> aVar2 = aVar;
            C89219l.m154721d(hVar2, "");
            if (aVar2 != null) {
                VideoShareViewModel G = hVar2.mo80785G();
                T t = aVar2.f31085a;
                if (t != null) {
                    G.mo20662a(new VideoShareViewModel.C49009f(G, t));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$p */
    static final class C49039p extends AbstractC89220m implements AbstractC89183m<View$OnClickListenerC49022h, C49018d, C89391z> {

        /* renamed from: a */
        public static final C49039p f112968a = new C49039p();

        static {
            Covode.recordClassIndex(57830);
        }

        C49039p() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View$OnClickListenerC49022h hVar, C49018d dVar) {
            int i;
            View$OnClickListenerC49022h hVar2 = hVar;
            C49018d dVar2 = dVar;
            C89219l.m154721d(hVar2, "");
            if (dVar2 != null) {
                FrameLayout frameLayout = (FrameLayout) hVar2.mo20546C().findViewById(R.id.dxn);
                if (dVar2.f112943a) {
                    i = 0;
                } else {
                    i = 8;
                }
                frameLayout.setVisibility(i);
                Float f = dVar2.f112944b;
                if (f != null) {
                    frameLayout.setAlpha(f.floatValue());
                }
                frameLayout.setEnabled(dVar2.f112945c);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$q */
    static final class C49040q extends AbstractC89220m implements AbstractC89183m<View$OnClickListenerC49022h, C49019e, C89391z> {

        /* renamed from: a */
        public static final C49040q f112969a = new C49040q();

        static {
            Covode.recordClassIndex(57831);
        }

        C49040q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View$OnClickListenerC49022h hVar, C49019e eVar) {
            int i;
            View$OnClickListenerC49022h hVar2 = hVar;
            C49019e eVar2 = eVar;
            C89219l.m154721d(hVar2, "");
            if (eVar2 != null) {
                TuxTextView tuxTextView = (TuxTextView) hVar2.mo20546C().findViewById(R.id.dxq);
                if (eVar2.f112946a) {
                    i = 0;
                } else {
                    i = 8;
                }
                tuxTextView.setVisibility(i);
                Float f = eVar2.f112947b;
                if (f != null && f.floatValue() > 0.0f) {
                    tuxTextView.setTextSize(1, f.floatValue());
                }
                String str = eVar2.f112948c;
                if (str != null && str.length() > 0) {
                    tuxTextView.setText(str);
                }
                if (hVar2.mo80786I() != null) {
                    TuxTextView tuxTextView2 = (TuxTextView) hVar2.mo20546C().findViewById(R.id.dxq);
                    C89219l.m154716b(tuxTextView2, "");
                    C36153g.m73653a(tuxTextView2);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$r */
    static final class C49041r extends AbstractC89220m implements AbstractC89183m<View$OnClickListenerC49022h, C49020f, C89391z> {

        /* renamed from: a */
        public static final C49041r f112970a = new C49041r();

        static {
            Covode.recordClassIndex(57832);
        }

        C49041r() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View$OnClickListenerC49022h hVar, C49020f fVar) {
            View$OnClickListenerC49022h hVar2 = hVar;
            C49020f fVar2 = fVar;
            C89219l.m154721d(hVar2, "");
            if (fVar2 != null) {
                Drawable drawable = fVar2.f112949a;
                if (drawable != null) {
                    ((RemoteImageView) hVar2.mo20546C().findViewById(R.id.dxv)).setImageDrawable(drawable);
                }
                ViewGroup.LayoutParams layoutParams = fVar2.f112950b;
                if (layoutParams != null) {
                    RemoteImageView remoteImageView = (RemoteImageView) hVar2.mo20546C().findViewById(R.id.dxv);
                    C89219l.m154716b(remoteImageView, "");
                    remoteImageView.getLayoutParams().width = layoutParams.width;
                    RemoteImageView remoteImageView2 = (RemoteImageView) hVar2.mo20546C().findViewById(R.id.dxv);
                    C89219l.m154716b(remoteImageView2, "");
                    remoteImageView2.getLayoutParams().height = layoutParams.height;
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$w */
    static final class C49054w extends AbstractC89220m implements AbstractC89183m<View$OnClickListenerC49022h, C71904j, C89391z> {

        /* renamed from: a */
        public static final C49054w f112986a = new C49054w();

        static {
            Covode.recordClassIndex(57845);
        }

        C49054w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View$OnClickListenerC49022h hVar, C71904j jVar) {
            String str;
            int k;
            Aweme aweme;
            Aweme aweme2;
            MethodCollector.m26663i(5518);
            View$OnClickListenerC49022h hVar2 = hVar;
            C71904j jVar2 = jVar;
            C89219l.m154721d(hVar2, "");
            if (jVar2 != null) {
                VideoShareViewModel G = hVar2.mo80785G();
                C89219l.m154721d(jVar2, "");
                if (jVar2.f161106c == 7) {
                    String str2 = jVar2.f161109f;
                    VideoItemParams videoItemParams = (VideoItemParams) G.mo23342g();
                    String str3 = null;
                    if (videoItemParams == null || (aweme2 = videoItemParams.mAweme) == null) {
                        str = null;
                    } else {
                        str = aweme2.getAid();
                    }
                    if (TextUtils.equals(str2, str)) {
                        synchronized (G) {
                            try {
                                String str4 = jVar2.f161109f;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                C89219l.m154716b(str4, "");
                                G.f112920l++;
                                if (!(G.mo80769j() || (k = VideoShareViewModel.m92171k()) == 0 || k == -2)) {
                                    try {
                                        Activity j = C17873f.m33102j();
                                        Context h = G.mo23343h();
                                        if (!(h instanceof Activity)) {
                                            h = null;
                                        }
                                        if (j == ((Activity) h)) {
                                            Aweme a = AwemeChangeCallBack.m108593a((ActivityC0945e) C17873f.m33102j());
                                            C89219l.m154716b(a, "");
                                            String aid = a.getAid();
                                            VideoItemParams videoItemParams2 = (VideoItemParams) G.mo23342g();
                                            if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null)) {
                                                str3 = aweme.getAid();
                                            }
                                            TextUtils.equals(aid, str3);
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            } catch (Throwable th) {
                                MethodCollector.m26664o(5518);
                                throw th;
                            }
                        }
                    }
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(5518);
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.share.h$s */
    static final class C49042s extends AbstractC89220m implements AbstractC89183m<View$OnClickListenerC49022h, C12776a<? extends C89378p<? extends EnumC49016b, ? extends Object>>, C89391z> {

        /* renamed from: a */
        public static final C49042s f112971a = new C49042s();

        static {
            Covode.recordClassIndex(57833);
        }

        C49042s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
            r3 = r10.f31085a;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.feed.assem.share.View$OnClickListenerC49022h r9, com.bytedance.assem.arch.extensions.C12776a<? extends p4600h.C89378p<? extends com.p2082ss.android.ugc.aweme.feed.assem.share.EnumC49016b, ? extends java.lang.Object>> r10) {
            /*
            // Method dump skipped, instructions count: 304
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.share.View$OnClickListenerC49022h.C49042s.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
