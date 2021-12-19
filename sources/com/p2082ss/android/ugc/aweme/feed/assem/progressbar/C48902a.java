package com.p2082ss.android.ugc.aweme.feed.assem.progressbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.C1175ad;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p795b.AbstractC12659j;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.p795b.C12661l;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AudioControlView;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48198ba;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48200bc;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49670ae;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50458e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.C50443c;
import com.p2082ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p2082ss.android.ugc.aweme.p3426m.C58977b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.NewVideoPlayerProgressbar;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
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

/* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a */
public final class C48902a extends AbstractC48491a<C48902a> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f112797u = {new C89232y(C48902a.class, "progressBarVM", "getProgressBarVM()Lcom/ss/android/ugc/aweme/feed/assem/progressbar/VideoProgressBarViewModel;", 0)};

    /* renamed from: A */
    private final AbstractC89244h f112798A = C89250i.m154774a(EnumC89331m.NONE, new C48929p(this));

    /* renamed from: B */
    private AnimatorSet f112799B;

    /* renamed from: C */
    private final AbstractC89248d f112800C;

    /* renamed from: D */
    private final AbstractC89244h f112801D;

    /* renamed from: E */
    private final AbstractC89244h f112802E;

    /* renamed from: F */
    private final AbstractC89244h f112803F;

    /* renamed from: G */
    private final AbstractC34466a f112804G;

    /* renamed from: H */
    private SparseArray f112805H;

    /* renamed from: v */
    public AudioControlView f112806v;

    /* renamed from: w */
    public NewVideoPlayerProgressbar f112807w;

    /* renamed from: x */
    LineProgressBar f112808x;

    /* renamed from: y */
    public AnimatorSet f112809y;

    /* renamed from: z */
    public AnimatorSet f112810z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$b */
    public static final class C48915b extends AbstractC89220m implements AbstractC89172b<C48951m, C48951m> {
        public static final C48915b INSTANCE = new C48915b();

        static {
            Covode.recordClassIndex(57703);
        }

        public C48915b() {
            super(1);
        }

        public final C48951m invoke(C48951m mVar) {
            C89219l.m154719c(mVar, "");
            return mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$g */
    public static final class C48920g extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C48920g INSTANCE = new C48920g();

        static {
            Covode.recordClassIndex(57708);
        }

        public C48920g() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$j */
    public static final class C48923j extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {
        public static final C48923j INSTANCE = new C48923j();

        static {
            Covode.recordClassIndex(57711);
        }

        public C48923j() {
            super(1);
        }

        public final C48200bc invoke(C48200bc bcVar) {
            C89219l.m154719c(bcVar, "");
            return bcVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$m */
    public static final class C48926m extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {
        public static final C48926m INSTANCE = new C48926m();

        static {
            Covode.recordClassIndex(57714);
        }

        public C48926m() {
            super(1);
        }

        public final C48198ba invoke(C48198ba baVar) {
            C89219l.m154719c(baVar, "");
            return baVar;
        }
    }

    static {
        Covode.recordClassIndex(57690);
    }

    /* renamed from: P */
    private final VideoViewModel m92112P() {
        return (VideoViewModel) this.f112801D.getValue();
    }

    /* renamed from: Q */
    private final VideoPlayViewModel m92113Q() {
        return (VideoPlayViewModel) this.f112802E.getValue();
    }

    /* renamed from: R */
    private final VideoEventDispatchViewModel m92114R() {
        return (VideoEventDispatchViewModel) this.f112803F.getValue();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.to;
    }

    /* renamed from: G */
    public final Activity mo80725G() {
        return (Activity) this.f112798A.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112805H == null) {
            this.f112805H = new SparseArray();
        }
        View view = (View) this.f112805H.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112805H.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: I */
    public final VideoProgressBarViewModel mo80726I() {
        return (VideoProgressBarViewModel) this.f112800C.mo23374a(this, f112797u[0]);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$c */
    public static final class C48916c extends AbstractC89220m implements AbstractC89171a<C12874b<C48951m>> {
        public static final C48916c INSTANCE = new C48916c();

        static {
            Covode.recordClassIndex(57704);
        }

        public C48916c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48951m> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$d */
    public static final class C48917d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112823a;

        static {
            Covode.recordClassIndex(57705);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48917d(AbstractC12693u uVar) {
            super(0);
            this.f112823a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112823a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$h */
    public static final class C48921h extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C48921h INSTANCE = new C48921h();

        static {
            Covode.recordClassIndex(57709);
        }

        public C48921h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$i */
    public static final class C48922i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48922i INSTANCE = new C48922i();

        static {
            Covode.recordClassIndex(57710);
        }

        public C48922i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$k */
    public static final class C48924k extends AbstractC89220m implements AbstractC89171a<C12874b<C48200bc>> {
        public static final C48924k INSTANCE = new C48924k();

        static {
            Covode.recordClassIndex(57712);
        }

        public C48924k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48200bc> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$l */
    public static final class C48925l extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48925l INSTANCE = new C48925l();

        static {
            Covode.recordClassIndex(57713);
        }

        public C48925l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$n */
    public static final class C48927n extends AbstractC89220m implements AbstractC89171a<C12874b<C48198ba>> {
        public static final C48927n INSTANCE = new C48927n();

        static {
            Covode.recordClassIndex(57715);
        }

        public C48927n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48198ba> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$o */
    public static final class C48928o extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48928o INSTANCE = new C48928o();

        static {
            Covode.recordClassIndex(57716);
        }

        public C48928o() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$s */
    public static final class C48932s implements AudioControlView.AbstractC34658b {

        /* renamed from: a */
        final /* synthetic */ C48902a f112829a;

        static {
            Covode.recordClassIndex(57720);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AudioControlView.AbstractC34658b
        /* renamed from: a */
        public final void mo61283a() {
            this.f112829a.mo80727J();
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AudioControlView.AbstractC34658b
        /* renamed from: b */
        public final void mo61284b() {
            this.f112829a.mo80728K();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48932s(C48902a aVar) {
            this.f112829a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$v */
    public static final class C48935v implements AudioControlView.AbstractC34658b {

        /* renamed from: a */
        final /* synthetic */ C48902a f112832a;

        static {
            Covode.recordClassIndex(57723);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AudioControlView.AbstractC34658b
        /* renamed from: a */
        public final void mo61283a() {
            this.f112832a.mo80728K();
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.AudioControlView.AbstractC34658b
        /* renamed from: b */
        public final void mo61284b() {
            this.f112832a.mo80727J();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48935v(C48902a aVar) {
            this.f112832a = aVar;
        }
    }

    /* renamed from: L */
    public final void mo80729L() {
        LineProgressBar lineProgressBar = this.f112808x;
        if (lineProgressBar != null) {
            lineProgressBar.mo85737b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$e */
    public static final class C48918e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112824a;

        static {
            Covode.recordClassIndex(57706);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48918e(AbstractC12693u uVar) {
            super(0);
            this.f112824a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112824a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$f */
    public static final class C48919f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112825a;

        static {
            Covode.recordClassIndex(57707);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48919f(AbstractC12693u uVar) {
            super(0);
            this.f112825a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112825a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$p */
    static final class C48929p extends AbstractC89220m implements AbstractC89171a<Activity> {

        /* renamed from: a */
        final /* synthetic */ C48902a f112826a;

        static {
            Covode.recordClassIndex(57717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48929p(C48902a aVar) {
            super(0);
            this.f112826a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Activity invoke() {
            Context az_ = this.f112826a.az_();
            Objects.requireNonNull(az_, "null cannot be cast to non-null type android.app.Activity");
            return az_;
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: F */
    public final void mo20549F() {
        super.mo20549F();
        C34727m.m70944a(new RunnableC48933t(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$a */
    public static final class C48903a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112811a;

        static {
            Covode.recordClassIndex(57691);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48903a(AbstractC89277c cVar) {
            super(0);
            this.f112811a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112811a).getName();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        super.mo20533y();
        AbstractC12818f.C12819a.m23063a(this, mo80726I(), C48940b.f112837a, C12856l.m23100a(), C48934u.f112831a, 4);
    }

    /* renamed from: K */
    public final void mo80728K() {
        if (this.f112807w != null && this.f112806v != null) {
            AnimatorSet animatorSet = this.f112799B;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f112807w;
            if (newVideoPlayerProgressbar != null) {
                newVideoPlayerProgressbar.setAlpha(0.0f);
            }
            AudioControlView audioControlView = this.f112806v;
            if (audioControlView != null) {
                audioControlView.setAlpha(1.0f);
            }
        }
    }

    /* renamed from: N */
    public final void mo80731N() {
        C12661l.m22798b(this);
        hashCode();
        AbstractC12659j jVar = this.f30901n;
        if (jVar != null) {
            jVar.hashCode();
        }
        this.f112804G.hashCode();
        if (mo80725G() instanceof AbstractC34472g) {
            Activity G = mo80725G();
            Objects.requireNonNull(G, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.IKeyDownListenerActivity");
            ((AbstractC34472g) G).registerActivityOnKeyDownListener(this.f112804G);
        }
    }

    /* renamed from: O */
    public final void mo80732O() {
        C12661l.m22798b(this);
        hashCode();
        AbstractC12659j jVar = this.f30901n;
        if (jVar != null) {
            jVar.hashCode();
        }
        this.f112804G.hashCode();
        if (mo80725G() instanceof AbstractC34472g) {
            Activity G = mo80725G();
            Objects.requireNonNull(G, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.IKeyDownListenerActivity");
            ((AbstractC34472g) G).unRegisterActivityOnKeyDownListener(this.f112804G);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$t */
    static final class RunnableC48933t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48902a f112830a;

        static {
            Covode.recordClassIndex(57721);
        }

        RunnableC48933t(C48902a aVar) {
            this.f112830a = aVar;
        }

        public final void run() {
            C48902a aVar = this.f112830a;
            aVar.mo80728K();
            AnimatorSet animatorSet = aVar.f112809y;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
            }
            AnimatorSet animatorSet2 = aVar.f112809y;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = aVar.f112810z;
            if (animatorSet3 != null) {
                animatorSet3.removeAllListeners();
            }
            AnimatorSet animatorSet4 = aVar.f112810z;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
            AudioControlView audioControlView = aVar.f112806v;
            if (audioControlView != null) {
                audioControlView.f81843c = null;
            }
            LineProgressBar lineProgressBar = aVar.f112808x;
            if (lineProgressBar != null) {
                lineProgressBar.mo85738c();
            }
            LineProgressBar lineProgressBar2 = aVar.f112808x;
            if (lineProgressBar2 != null) {
                lineProgressBar2.clearAnimation();
            }
            NewVideoPlayerProgressbar newVideoPlayerProgressbar = aVar.f112807w;
            if (newVideoPlayerProgressbar != null) {
                newVideoPlayerProgressbar.clearAnimation();
            }
            aVar.mo80732O();
        }
    }

    public C48902a() {
        AbstractC89277c a = C89204ab.m154669a(VideoProgressBarViewModel.class);
        this.f112800C = C14530k.m26542a(this, a, AbstractC12848i.C12851c.f31277a, new C48903a(a), C48916c.INSTANCE, new C48917d(this), C48915b.INSTANCE, null, null, new C48918e(this), new C48919f(this));
        this.f112801D = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C48921h.INSTANCE, C48922i.INSTANCE, C48920g.INSTANCE);
        this.f112802E = new C14524g(C89204ab.m154669a(VideoPlayViewModel.class), this, C48924k.INSTANCE, C48925l.INSTANCE, C48923j.INSTANCE);
        this.f112803F = new C14524g(C89204ab.m154669a(VideoEventDispatchViewModel.class), this, C48927n.INSTANCE, C48928o.INSTANCE, C48926m.INSTANCE);
        this.f112804G = new C48931r(this);
    }

    /* renamed from: J */
    public final void mo80727J() {
        ObjectAnimator objectAnimator;
        if (this.f112807w != null && this.f112806v != null) {
            if (this.f112810z != null || this.f112809y != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f112799B = animatorSet;
                animatorSet.addListener(new C48930q(this));
                AnimatorSet animatorSet2 = this.f112799B;
                if (animatorSet2 != null) {
                    NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f112807w;
                    ObjectAnimator objectAnimator2 = null;
                    if (newVideoPlayerProgressbar != null) {
                        objectAnimator = newVideoPlayerProgressbar.getShowAnim();
                    } else {
                        objectAnimator = null;
                    }
                    AnimatorSet.Builder play = animatorSet2.play(objectAnimator);
                    if (play != null) {
                        AudioControlView audioControlView = this.f112806v;
                        if (audioControlView != null) {
                            objectAnimator2 = audioControlView.getHideVolumeAnim();
                        }
                        play.after(objectAnimator2);
                    }
                }
                AnimatorSet animatorSet3 = this.f112799B;
                if (animatorSet3 != null) {
                    animatorSet3.start();
                }
            }
        }
    }

    /* renamed from: M */
    public final void mo80730M() {
        NewVideoPlayerProgressbar newVideoPlayerProgressbar;
        NewVideoPlayerProgressbar newVideoPlayerProgressbar2;
        mo80726I().f112789k = SystemClock.elapsedRealtime();
        if (((VideoItemParams) C12661l.m22797a(this)).mAweme != null) {
            if (C76706a.m134281g(((VideoItemParams) C12661l.m22797a(this)).mAweme) && (newVideoPlayerProgressbar2 = this.f112807w) != null) {
                newVideoPlayerProgressbar2.setVisibility(8);
            }
            if (!C50443c.m94610b(((VideoItemParams) C12661l.m22797a(this)).mAweme)) {
                Aweme aweme = ((VideoItemParams) C12661l.m22797a(this)).mAweme;
                C89219l.m154716b(aweme, "");
                if (aweme.getVideoControl() != null) {
                    Aweme aweme2 = ((VideoItemParams) C12661l.m22797a(this)).mAweme;
                    C89219l.m154716b(aweme2, "");
                    if (aweme2.getVideoControl().showProgressBar == 1) {
                        NewVideoPlayerProgressbar newVideoPlayerProgressbar3 = this.f112807w;
                        if (newVideoPlayerProgressbar3 != null) {
                            newVideoPlayerProgressbar3.setProgress(0);
                        }
                        Aweme aweme3 = ((VideoItemParams) C12661l.m22797a(this)).mAweme;
                        C89219l.m154716b(aweme3, "");
                        if (!(aweme3.getVideo() == null || (newVideoPlayerProgressbar = this.f112807w) == null)) {
                            Aweme aweme4 = ((VideoItemParams) C12661l.m22797a(this)).mAweme;
                            C89219l.m154716b(aweme4, "");
                            Video video = aweme4.getVideo();
                            C89219l.m154716b(video, "");
                            newVideoPlayerProgressbar.setMax(video.getDuration());
                        }
                        C34729o.m70955a(this.f112807w, 0);
                        return;
                    }
                }
            }
            C34729o.m70955a(this.f112807w, 8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$q */
    public static final class C48930q extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C48902a f112827a;

        static {
            Covode.recordClassIndex(57718);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48930q(C48902a aVar) {
            this.f112827a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            this.f112827a.mo80726I().mo80722a(0, null, false);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
        AudioControlView audioControlView = this.f112806v;
        if (audioControlView != null) {
            audioControlView.setOnAudioControlViewHideListener(new C48932s(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$ag */
    static final class C48911ag extends AbstractC89220m implements AbstractC89172b<C48951m, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48902a f112819a;

        static {
            Covode.recordClassIndex(57699);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48911ag(C48902a aVar) {
            super(1);
            this.f112819a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C48951m mVar) {
            ObjectAnimator objectAnimator;
            C48951m mVar2 = mVar;
            C89219l.m154721d(mVar2, "");
            if (mVar2.f112850c) {
                AudioControlView audioControlView = this.f112819a.f112806v;
                if (audioControlView != null) {
                    audioControlView.mo61267c();
                }
            } else if (this.f112819a.f112807w != null) {
                this.f112819a.f112810z = new AnimatorSet();
                AnimatorSet animatorSet = this.f112819a.f112810z;
                if (animatorSet != null) {
                    AudioControlView audioControlView2 = this.f112819a.f112806v;
                    ObjectAnimator objectAnimator2 = null;
                    if (audioControlView2 != null) {
                        objectAnimator = audioControlView2.getShowVolumeAnim();
                    } else {
                        objectAnimator = null;
                    }
                    AnimatorSet.Builder play = animatorSet.play(objectAnimator);
                    if (play != null) {
                        NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f112819a.f112807w;
                        if (newVideoPlayerProgressbar != null) {
                            objectAnimator2 = newVideoPlayerProgressbar.getHideAnim();
                        }
                        play.after(objectAnimator2);
                    }
                }
                AnimatorSet animatorSet2 = this.f112819a.f112810z;
                if (animatorSet2 != null) {
                    animatorSet2.addListener(new AnimatorListenerAdapter(this) {
                        /* class com.p2082ss.android.ugc.aweme.feed.assem.progressbar.C48902a.C48911ag.C489121 */

                        /* renamed from: a */
                        final /* synthetic */ C48911ag f112820a;

                        static {
                            Covode.recordClassIndex(57700);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f112820a = r1;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            C89219l.m154721d(animator, "");
                            AudioControlView audioControlView = this.f112820a.f112819a.f112806v;
                            if (audioControlView != null) {
                                audioControlView.mo61267c();
                            }
                        }
                    });
                }
                AnimatorSet animatorSet3 = this.f112819a.f112810z;
                if (animatorSet3 != null) {
                    animatorSet3.start();
                }
                AudioControlView audioControlView3 = this.f112819a.f112806v;
                if (audioControlView3 != null) {
                    Integer.valueOf(audioControlView3.getVisibility());
                }
                AudioControlView audioControlView4 = this.f112819a.f112806v;
                if (audioControlView4 != null) {
                    Float.valueOf(audioControlView4.getAlpha());
                }
                C12661l.m22798b(this.f112819a);
                this.f112819a.hashCode();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$ah */
    static final class C48913ah extends AbstractC89220m implements AbstractC89172b<C48951m, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48902a f112821a;

        static {
            Covode.recordClassIndex(57701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48913ah(C48902a aVar) {
            super(1);
            this.f112821a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C48951m mVar) {
            ObjectAnimator objectAnimator;
            C48951m mVar2 = mVar;
            C89219l.m154721d(mVar2, "");
            if (mVar2.f112850c) {
                AudioControlView audioControlView = this.f112821a.f112806v;
                if (audioControlView != null) {
                    audioControlView.mo61266b();
                }
            } else if (this.f112821a.f112807w != null) {
                this.f112821a.f112809y = new AnimatorSet();
                AnimatorSet animatorSet = this.f112821a.f112809y;
                if (animatorSet != null) {
                    AudioControlView audioControlView2 = this.f112821a.f112806v;
                    ObjectAnimator objectAnimator2 = null;
                    if (audioControlView2 != null) {
                        objectAnimator = audioControlView2.getShowVolumeAnim();
                    } else {
                        objectAnimator = null;
                    }
                    AnimatorSet.Builder play = animatorSet.play(objectAnimator);
                    if (play != null) {
                        NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f112821a.f112807w;
                        if (newVideoPlayerProgressbar != null) {
                            objectAnimator2 = newVideoPlayerProgressbar.getHideAnim();
                        }
                        play.after(objectAnimator2);
                    }
                }
                AnimatorSet animatorSet2 = this.f112821a.f112809y;
                if (animatorSet2 != null) {
                    animatorSet2.addListener(new AnimatorListenerAdapter(this) {
                        /* class com.p2082ss.android.ugc.aweme.feed.assem.progressbar.C48902a.C48913ah.C489141 */

                        /* renamed from: a */
                        final /* synthetic */ C48913ah f112822a;

                        static {
                            Covode.recordClassIndex(57702);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f112822a = r1;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            C89219l.m154721d(animator, "");
                            AudioControlView audioControlView = this.f112822a.f112821a.f112806v;
                            if (audioControlView != null) {
                                audioControlView.mo61266b();
                            }
                        }
                    });
                }
                AnimatorSet animatorSet3 = this.f112821a.f112809y;
                if (animatorSet3 != null) {
                    animatorSet3.start();
                }
                AudioControlView audioControlView3 = this.f112821a.f112806v;
                if (audioControlView3 != null) {
                    Integer.valueOf(audioControlView3.getVisibility());
                }
                C12661l.m22798b(this.f112821a);
                AudioControlView audioControlView4 = this.f112821a.f112806v;
                if (audioControlView4 != null) {
                    Float.valueOf(audioControlView4.getAlpha());
                }
                this.f112821a.hashCode();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        this.f112806v = (AudioControlView) view.findViewById(R.id.mr);
        this.f112807w = (NewVideoPlayerProgressbar) view.findViewById(R.id.fd_);
        this.f112808x = (LineProgressBar) view.findViewById(R.id.c9d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C34728n.m70946a(1.0d));
        layoutParams.gravity = 80;
        if (C33403c.C33406b.f79409a.f79391t) {
            int a = C34728n.m70946a(8.0d);
            layoutParams.leftMargin = a;
            layoutParams.rightMargin = a;
        }
        view.setLayoutParams(layoutParams);
        AudioControlView audioControlView = this.f112806v;
        if (audioControlView != null) {
            audioControlView.setOnAudioControlViewHideListener(new C48935v(this));
        }
        AbstractC12818f.C12819a.m23063a(this, m92112P(), C48946h.f112843a, (C12854k) null, C48906ac.f112814a, 6);
        AbstractC12818f.C12819a.m23063a(this, m92112P(), C48948j.f112845a, (C12854k) null, new C48907ad(this), 6);
        AbstractC12818f.C12819a.m23063a(this, m92112P(), C48949k.f112846a, (C12854k) null, new C48908ae(this), 6);
        AbstractC12818f.C12819a.m23063a(this, m92113Q(), C48950l.f112847a, C12856l.m23100a(), C48909af.f112817a, 4);
        AbstractC12818f.C12819a.m23063a(this, m92113Q(), C48941c.f112838a, (C12854k) null, C48936w.f112833a, 6);
        AbstractC12818f.C12819a.m23063a(this, m92113Q(), C48942d.f112839a, (C12854k) null, C48937x.f112834a, 6);
        AbstractC12818f.C12819a.m23063a(this, m92112P(), C48943e.f112840a, (C12854k) null, C48938y.f112835a, 6);
        AbstractC12818f.C12819a.m23063a(this, m92114R(), C48944f.f112841a, (C12854k) null, C48939z.f112836a, 6);
        AbstractC12818f.C12819a.m23063a(this, m92114R(), C48945g.f112842a, (C12854k) null, C48904aa.f112812a, 6);
        AbstractC12818f.C12819a.m23063a(this, m92114R(), C48947i.f112844a, (C12854k) null, C48905ab.f112813a, 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$w */
    static final class C48936w extends AbstractC89220m implements AbstractC89183m<C48902a, C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C48936w f112833a = new C48936w();

        static {
            Covode.recordClassIndex(57724);
        }

        C48936w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48902a aVar, C12776a<? extends C89391z> aVar2) {
            C48902a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            if (aVar2 != null) {
                aVar3.mo80731N();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$x */
    static final class C48937x extends AbstractC89220m implements AbstractC89183m<C48902a, C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C48937x f112834a = new C48937x();

        static {
            Covode.recordClassIndex(57725);
        }

        C48937x() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48902a aVar, C12776a<? extends C89391z> aVar2) {
            C48902a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            if (aVar2 != null) {
                aVar3.mo80731N();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$y */
    static final class C48938y extends AbstractC89220m implements AbstractC89183m<C48902a, C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C48938y f112835a = new C48938y();

        static {
            Covode.recordClassIndex(57726);
        }

        C48938y() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48902a aVar, C12776a<? extends C89391z> aVar2) {
            C48902a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            if (aVar2 != null) {
                aVar3.mo80732O();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$aa */
    static final class C48904aa extends AbstractC89220m implements AbstractC89183m<C48902a, C49670ae, C89391z> {

        /* renamed from: a */
        public static final C48904aa f112812a = new C48904aa();

        static {
            Covode.recordClassIndex(57692);
        }

        C48904aa() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48902a aVar, C49670ae aeVar) {
            C48902a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aeVar != null) {
                C34729o.m70955a(aVar2.mo20528t(), 0);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$af */
    static final class C48909af extends AbstractC89220m implements AbstractC89183m<C48902a, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C48909af f112817a = new C48909af();

        static {
            Covode.recordClassIndex(57697);
        }

        C48909af() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48902a aVar, C12776a<? extends Boolean> aVar2) {
            final C48902a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            C89219l.m154721d(aVar2, "");
            C48902a.m22850a(aVar3.mo80726I(), new AbstractC89172b<C48951m, C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.feed.assem.progressbar.C48902a.C48909af.C489101 */

                static {
                    Covode.recordClassIndex(57698);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C48951m mVar) {
                    C48951m mVar2 = mVar;
                    C89219l.m154721d(mVar2, "");
                    if (!mVar2.f112849b) {
                        C48902a aVar = aVar3;
                        NewVideoPlayerProgressbar newVideoPlayerProgressbar = aVar.f112807w;
                        if (newVideoPlayerProgressbar != null) {
                            newVideoPlayerProgressbar.setProgress(0);
                        }
                        NewVideoPlayerProgressbar newVideoPlayerProgressbar2 = aVar.f112807w;
                        if (newVideoPlayerProgressbar2 != null) {
                            newVideoPlayerProgressbar2.clearAnimation();
                        }
                        NewVideoPlayerProgressbar newVideoPlayerProgressbar3 = aVar.f112807w;
                        if (newVideoPlayerProgressbar3 != null) {
                            newVideoPlayerProgressbar3.setVisibility(4);
                        }
                        LineProgressBar lineProgressBar = aVar.f112808x;
                        if (lineProgressBar != null) {
                            lineProgressBar.clearAnimation();
                        }
                        LineProgressBar lineProgressBar2 = aVar.f112808x;
                        if (lineProgressBar2 != null) {
                            lineProgressBar2.mo85738c();
                        }
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$ac */
    static final class C48906ac extends AbstractC89220m implements AbstractC89183m<C48902a, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C48906ac f112814a = new C48906ac();

        static {
            Covode.recordClassIndex(57694);
        }

        C48906ac() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48902a aVar, C12776a<? extends Boolean> aVar2) {
            T t;
            C48902a aVar3 = aVar;
            C12776a<? extends Boolean> aVar4 = aVar2;
            C89219l.m154721d(aVar3, "");
            if (!(aVar4 == null || (t = aVar4.f31085a) == null)) {
                if (t.booleanValue()) {
                    LineProgressBar lineProgressBar = aVar3.f112808x;
                    if (lineProgressBar != null) {
                        lineProgressBar.mo85736a();
                    }
                } else {
                    aVar3.mo80729L();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$ad */
    static final class C48907ad extends AbstractC89220m implements AbstractC89183m<C48902a, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48902a f112815a;

        static {
            Covode.recordClassIndex(57695);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48907ad(C48902a aVar) {
            super(2);
            this.f112815a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48902a aVar, C12776a<? extends Integer> aVar2) {
            C48902a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            if (aVar2 != null) {
                this.f112815a.hashCode();
                C12661l.m22798b(aVar3);
                aVar3.mo80726I().hashCode();
                aVar3.mo80726I().mo80723a(true);
                aVar3.mo80727J();
                aVar3.mo80731N();
                aVar3.mo80730M();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$ae */
    static final class C48908ae extends AbstractC89220m implements AbstractC89183m<C48902a, C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48902a f112816a;

        static {
            Covode.recordClassIndex(57696);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48908ae(C48902a aVar) {
            super(2);
            this.f112816a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48902a aVar, C12776a<? extends C89391z> aVar2) {
            C48902a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            if (aVar2 != null) {
                this.f112816a.hashCode();
                C12661l.m22798b(aVar3);
                aVar3.mo80726I().hashCode();
                aVar3.mo80726I().mo80723a(false);
                aVar3.mo80732O();
                aVar3.mo80730M();
                aVar3.mo80729L();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$u */
    static final class C48934u extends AbstractC89220m implements AbstractC89183m<C48902a, Integer, C89391z> {

        /* renamed from: a */
        public static final C48934u f112831a = new C48934u();

        static {
            Covode.recordClassIndex(57722);
        }

        C48934u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48902a aVar, Integer num) {
            C48902a aVar2 = aVar;
            int intValue = num.intValue();
            C89219l.m154721d(aVar2, "");
            NewVideoPlayerProgressbar newVideoPlayerProgressbar = aVar2.f112807w;
            if (newVideoPlayerProgressbar != null) {
                newVideoPlayerProgressbar.setMax(((C48951m) aVar2.mo80726I().mo20673e()).f112852e);
            }
            NewVideoPlayerProgressbar newVideoPlayerProgressbar2 = aVar2.f112807w;
            if (newVideoPlayerProgressbar2 != null) {
                newVideoPlayerProgressbar2.setProgress(intValue);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$z */
    static final class C48939z extends AbstractC89220m implements AbstractC89183m<C48902a, C18017a, C89391z> {

        /* renamed from: a */
        public static final C48939z f112836a = new C48939z();

        static {
            Covode.recordClassIndex(57727);
        }

        C48939z() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48902a aVar, C18017a aVar2) {
            boolean z;
            C48902a aVar3 = aVar;
            C18017a aVar4 = aVar2;
            C89219l.m154721d(aVar3, "");
            if (aVar4 != null) {
                VideoProgressBarViewModel I = aVar3.mo80726I();
                if (aVar4.f42891a != 4) {
                    z = true;
                } else {
                    z = false;
                }
                I.mo20662a(new VideoProgressBarViewModel.C48900d(z));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$ab */
    static final class C48905ab extends AbstractC89220m implements AbstractC89183m<C48902a, C50458e, C89391z> {

        /* renamed from: a */
        public static final C48905ab f112813a = new C48905ab();

        static {
            Covode.recordClassIndex(57693);
        }

        C48905ab() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48902a aVar, C50458e eVar) {
            int i;
            String str;
            Aweme aweme;
            C48902a aVar2 = aVar;
            C50458e eVar2 = eVar;
            C89219l.m154721d(aVar2, "");
            if (eVar2 != null) {
                VideoProgressBarViewModel I = aVar2.mo80726I();
                NewVideoPlayerProgressbar newVideoPlayerProgressbar = aVar2.f112807w;
                if (newVideoPlayerProgressbar != null) {
                    i = newVideoPlayerProgressbar.getProgress();
                } else {
                    i = 0;
                }
                C89219l.m154721d(eVar2, "");
                VideoItemParams videoItemParams = (VideoItemParams) I.mo23342g();
                String str2 = null;
                if (!(videoItemParams == null || videoItemParams.mAweme == null || eVar2.f116539a == null)) {
                    Aweme aweme2 = eVar2.f116539a;
                    if (aweme2 != null) {
                        str = aweme2.getAid();
                    } else {
                        str = null;
                    }
                    VideoItemParams videoItemParams2 = (VideoItemParams) I.mo23342g();
                    if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null)) {
                        str2 = aweme.getAid();
                    }
                    if (str == str2 && (i != 0 || SystemClock.elapsedRealtime() >= I.f112789k + 600)) {
                        I.mo20662a(new VideoProgressBarViewModel.C48899c(I, eVar2));
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.progressbar.a$r */
    static final class C48931r implements AbstractC34466a {

        /* renamed from: a */
        final /* synthetic */ C48902a f112828a;

        static {
            Covode.recordClassIndex(57719);
        }

        C48931r(C48902a aVar) {
            this.f112828a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            boolean z;
            boolean z2;
            boolean z3;
            if (i != 25 && i != 24) {
                return false;
            }
            VideoProgressBarViewModel I = this.f112828a.mo80726I();
            if (i == 24) {
                z = true;
            } else {
                z = false;
            }
            C58977b.m108350a().mo96452b();
            AbstractC89568bz unused = C89624i.m155555a(I.aP_(), null, null, new VideoProgressBarViewModel.C48898b(I, z, null), 3);
            VideoProgressBarViewModel I2 = this.f112828a.mo80726I();
            AudioControlView audioControlView = this.f112828a.f112806v;
            if (audioControlView == null || !audioControlView.mo61270e()) {
                z2 = false;
            } else {
                z2 = true;
            }
            I2.mo80724a(z2, this.f112828a.mo80725G());
            this.f112828a.hashCode();
            AbstractC12659j jVar = this.f112828a.f30901n;
            if (jVar != null) {
                jVar.hashCode();
            }
            C12661l.m22798b(this.f112828a);
            VideoProgressBarViewModel I3 = this.f112828a.mo80726I();
            AudioControlView audioControlView2 = this.f112828a.f112806v;
            if (audioControlView2 == null || !audioControlView2.mo61270e()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!I3.mo80724a(z3, this.f112828a.mo80725G())) {
                return false;
            }
            this.f112828a.mo80726I().mo80722a(i, keyEvent, true);
            NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f112828a.f112807w;
            if (newVideoPlayerProgressbar != null) {
                newVideoPlayerProgressbar.setAlpha(0.0f);
            }
            if (i == 25) {
                C48902a aVar = this.f112828a;
                if (aVar.f112806v != null) {
                    C48902a.m22850a(aVar.mo80726I(), new C48913ah(aVar));
                }
            } else {
                C48902a aVar2 = this.f112828a;
                if (aVar2.f112806v != null) {
                    C48902a.m22850a(aVar2.mo80726I(), new C48911ag(aVar2));
                }
            }
            return true;
        }
    }
}
