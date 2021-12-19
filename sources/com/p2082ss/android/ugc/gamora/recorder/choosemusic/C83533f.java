package com.p2082ss.android.ugc.gamora.recorder.choosemusic;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2560h;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46790cg;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2730de.C40977l;
import com.p2082ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65350at;
import com.p2082ss.android.ugc.aweme.property.C65473f;
import com.p2082ss.android.ugc.aweme.shortvideo.C69837ao;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69929ci;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.Mission;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k;
import com.p2082ss.android.ugc.aweme.views.CircleDraweeView;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.C83495b;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
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
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f */
public final class C83533f extends AbstractC22219j implements AbstractC20382b {

    /* renamed from: E */
    public static final C83534a f186543E = new C83534a((byte) 0);

    /* renamed from: A */
    public boolean f186544A;

    /* renamed from: B */
    public final C83506b f186545B;

    /* renamed from: C */
    public final AbstractC75655o f186546C;

    /* renamed from: D */
    final ShortVideoContext f186547D;

    /* renamed from: F */
    private boolean f186548F = true;

    /* renamed from: G */
    private FrameLayout f186549G;

    /* renamed from: H */
    private ImageView f186550H;

    /* renamed from: I */
    private Space f186551I;

    /* renamed from: J */
    private final AbstractC89244h f186552J = C89250i.m154773a((AbstractC89171a) C83543e.f186583a);

    /* renamed from: K */
    private final AbstractC89244h f186553K = C89250i.m154773a((AbstractC89171a) new C83539ae(this));

    /* renamed from: L */
    private final C2560h<Boolean> f186554L;

    /* renamed from: a */
    AbstractC83507c f186555a;

    /* renamed from: b */
    public AbstractC23317a f186556b;

    /* renamed from: c */
    public ShortVideoContextViewModel f186557c;

    /* renamed from: d */
    public ImageView f186558d;

    /* renamed from: e */
    public TextView f186559e;

    /* renamed from: f */
    RelativeLayout f186560f;

    /* renamed from: g */
    public FrameLayout f186561g;

    /* renamed from: h */
    boolean f186562h;

    /* renamed from: i */
    boolean f186563i;

    /* renamed from: j */
    public View f186564j;

    /* renamed from: k */
    public Animator f186565k;

    /* renamed from: l */
    public View f186566l;

    /* renamed from: t */
    public boolean f186567t;

    /* renamed from: u */
    LinearLayout f186568u;

    /* renamed from: v */
    public TextView f186569v;

    /* renamed from: w */
    LinearLayout f186570w;

    /* renamed from: x */
    public CircleDraweeView f186571x;

    /* renamed from: y */
    public View f186572y;

    /* renamed from: z */
    public ImageView f186573z;

    static {
        Covode.recordClassIndex(97419);
    }

    /* renamed from: a */
    public final boolean mo128561a() {
        return ((Boolean) this.f186552J.getValue()).booleanValue();
    }

    /* renamed from: b */
    public final SafeHandler mo128562b() {
        return (SafeHandler) this.f186553K.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$a */
    public static final class C83534a {
        static {
            Covode.recordClassIndex(97420);
        }

        private C83534a() {
        }

        public /* synthetic */ C83534a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$ae */
    static final class C83539ae extends AbstractC89220m implements AbstractC89171a<SafeHandler> {

        /* renamed from: a */
        final /* synthetic */ C83533f f186579a;

        static {
            Covode.recordClassIndex(97425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83539ae(C83533f fVar) {
            super(0);
            this.f186579a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SafeHandler invoke() {
            return new SafeHandler(this.f186579a);
        }
    }

    /* renamed from: D */
    public final void mo128556D() {
        AbstractC23317a aVar = this.f186556b;
        if (aVar != null) {
            aVar.dismiss();
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$ac */
    public static final class RunnableC83537ac implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83533f f186577a;

        static {
            Covode.recordClassIndex(97423);
        }

        RunnableC83537ac(C83533f fVar) {
            this.f186577a = fVar;
        }

        public final void run() {
            TextView textView = this.f186577a.f186569v;
            if (textView != null) {
                textView.requestFocus();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$ad */
    public static final class RunnableC83538ad implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83533f f186578a;

        static {
            Covode.recordClassIndex(97424);
        }

        RunnableC83538ad(C83533f fVar) {
            this.f186578a = fVar;
        }

        public final void run() {
            TextView c = C83533f.m143914c(this.f186578a);
            if (c != null) {
                c.requestFocus();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$d */
    public static final class RunnableC83542d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83533f f186582a;

        static {
            Covode.recordClassIndex(97428);
        }

        RunnableC83542d(C83533f fVar) {
            this.f186582a = fVar;
        }

        public final void run() {
            C83533f.m143914c(this.f186582a).clearFocus();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$e */
    static final class C83543e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C83543e f186583a = new C83543e();

        static {
            Covode.recordClassIndex(97429);
        }

        C83543e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C46790cg.m90136a());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$y */
    static final class RunnableC83564y implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83533f f186604a;

        static {
            Covode.recordClassIndex(97450);
        }

        RunnableC83564y(C83533f fVar) {
            this.f186604a = fVar;
        }

        public final void run() {
            TextView textView = this.f186604a.f186569v;
            if (textView != null) {
                textView.requestFocus();
            }
        }
    }

    /* renamed from: F */
    public final void mo128558F() {
        LinearLayout linearLayout = this.f186568u;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final boolean mo128565d() {
        return C72847c.m128642h(this.f186546C.mo119294f());
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        Animator animator = this.f186565k;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$aa */
    public static final class RunnableC83535aa implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83533f f186574a;

        static {
            Covode.recordClassIndex(97421);
        }

        RunnableC83535aa(C83533f fVar) {
            this.f186574a = fVar;
        }

        public final void run() {
            C83533f.m143914c(this.f186574a).requestFocus();
            C83533f.m143914c(this.f186574a).setSelected(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$z */
    public static final class RunnableC83565z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83533f f186605a;

        static {
            Covode.recordClassIndex(97451);
        }

        RunnableC83565z(C83533f fVar) {
            this.f186605a = fVar;
        }

        public final void run() {
            TextView textView = this.f186605a.f186569v;
            if (textView != null) {
                textView.requestFocus();
            }
            TextView textView2 = this.f186605a.f186569v;
            if (textView2 != null) {
                textView2.setSelected(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo128555C() {
        if (this.f186555a == null) {
            Activity activity = this.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.f186555a = new C69929ci((ActivityC0945e) activity);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$ab */
    static final class RunnableC83536ab implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83533f f186575a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f186576b;

        static {
            Covode.recordClassIndex(97422);
        }

        RunnableC83536ab(C83533f fVar, C89233z.C89238e eVar) {
            this.f186575a = fVar;
            this.f186576b = eVar;
        }

        public final void run() {
            LinearLayout linearLayout;
            if (this.f186575a.f52549m != null) {
                Activity activity = this.f186575a.f52549m;
                if (activity == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity, "");
                if (!activity.isFinishing() && this.f186576b.element != null) {
                    C83533f fVar = this.f186575a;
                    T t = this.f186576b.element;
                    C83533f fVar2 = this.f186575a;
                    TextView textView = fVar2.f186569v;
                    if ((textView == null || (linearLayout = fVar2.f186568u) == null || linearLayout.getVisibility() != 0 || textView.getVisibility() != 0) && (textView = fVar2.f186559e) == null) {
                        C89219l.m154710a("tvChooseMusic");
                    }
                    fVar.f186556b = t.mo38041b(textView).mo38034a(EnumC23352h.BOTTOM).mo38012d();
                    AbstractC23317a aVar = this.f186575a.f186556b;
                    if (aVar != null) {
                        aVar.mo38001a();
                    }
                }
            }
        }
    }

    /* renamed from: E */
    public final void mo128557E() {
        ImageView imageView = this.f186558d;
        if (imageView == null) {
            C89219l.m154710a("ivChooseMusic");
        }
        imageView.setVisibility(0);
        TextView textView = this.f186559e;
        if (textView == null) {
            C89219l.m154710a("tvChooseMusic");
        }
        textView.setVisibility(0);
        TextView textView2 = this.f186559e;
        if (textView2 == null) {
            C89219l.m154710a("tvChooseMusic");
        }
        textView2.setText(R.string.fsz);
        if (C65350at.m117036a()) {
            ImageView imageView2 = this.f186558d;
            if (imageView2 == null) {
                C89219l.m154710a("ivChooseMusic");
            }
            imageView2.setImageResource(2131232533);
        } else {
            ImageView imageView3 = this.f186558d;
            if (imageView3 == null) {
                C89219l.m154710a("ivChooseMusic");
            }
            imageView3.setImageResource(2131232345);
        }
        mo128562b().post(new RunnableC83542d(this));
        mo128563b(false);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$x */
    public static final class View$OnClickListenerC83563x implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83533f f186603a;

        static {
            Covode.recordClassIndex(97449);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnClickListenerC83563x(C83533f fVar) {
            this.f186603a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ShortVideoContextViewModel shortVideoContextViewModel = this.f186603a.f186557c;
            if (shortVideoContextViewModel == null) {
                C89219l.m154710a("shortVideoContextViewModel");
            }
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.f155842a;
            C39162r.m79460a("change_music_grey", new C84425b().mo129406a("creation_id", shortVideoContext.f155830o).mo129406a("shoot_way", shortVideoContext.f155831p).f188764a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$t */
    static final class C83559t<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83533f f186599a;

        static {
            Covode.recordClassIndex(97445);
        }

        C83559t(C83533f fVar) {
            this.f186599a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C83533f fVar = this.f186599a;
            fVar.mo128555C();
            AbstractC83507c cVar = fVar.f186555a;
            if (cVar != null) {
                cVar.mo110340a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$w */
    public static final class C83562w extends AbstractView$OnClickListenerC81441k {

        /* renamed from: a */
        final /* synthetic */ C83533f f186602a;

        static {
            Covode.recordClassIndex(97448);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83562w(C83533f fVar) {
            super(500, false, 2);
            this.f186602a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81441k
        /* renamed from: a */
        public final void mo78773a(View view) {
            String musicId;
            String str;
            String str2;
            C89219l.m154721d(view, "");
            C83533f fVar = this.f186602a;
            AVExternalServiceImpl.m113114a().provideAVPerformance().start(OpenMusicPanelPerformanceMonitor.f142464a, "start_choose_music");
            ShortVideoContextViewModel shortVideoContextViewModel = fVar.f186557c;
            if (shortVideoContextViewModel == null) {
                C89219l.m154710a("shortVideoContextViewModel");
            }
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.f155842a;
            ShortVideoContextViewModel shortVideoContextViewModel2 = fVar.f186557c;
            if (shortVideoContextViewModel2 == null) {
                C89219l.m154710a("shortVideoContextViewModel");
            }
            ShortVideoContext shortVideoContext2 = shortVideoContextViewModel2.f155842a;
            C89219l.m154716b(shortVideoContext2, "");
            Mission a = C63238c.f143585l.mo93813a(shortVideoContext2.f155794ad.f155707c);
            if (!(a == null || (musicId = a.getMusicId()) == null || musicId.length() == 0)) {
                Integer num = null;
                if (!a.isMusicToasted()) {
                    C69905c cVar = C70005cr.m123611a().f156482a;
                    if (cVar != null) {
                        str2 = cVar.getMid();
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.equals(str2, a.getMusicId())) {
                        a.setMusicToasted(true);
                        shortVideoContext2.f155794ad.f155707c = C63238c.f143585l.mo93816a(shortVideoContext2.f155794ad.f155707c, a);
                    }
                }
                if (!a.isMusicToasted()) {
                    C85041d.m146226b(fVar.f52549m, R.string.d3s).mo129984b();
                    C84425b a2 = new C84425b().mo129403a("reason", 1).mo129406a("mission_id", a.getMissionId()).mo129406a("page_source", a.getEnterFrom());
                    AbstractC32846a e = C63238c.f143594u.mo93906e();
                    if (e != null) {
                        num = Integer.valueOf(e.mo58670m());
                    }
                    C84425b a3 = a2.mo129405a("creator_followers", num);
                    if (C63253l.f143623a.mo73330z().mo93832j()) {
                        str = "0";
                    } else {
                        str = "1";
                    }
                    C39162r.m79460a("mission_requirement_toast", a3.mo129406a("creator_type", str).f188764a);
                }
            }
            if (!C40977l.m82500a(view, 1200)) {
                C89219l.m154716b(shortVideoContext, "");
                if (!shortVideoContext.mo110022c()) {
                    fVar.f186545B.f186507n.mo6999a(C89391z.f203057a);
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ FrameLayout m143911a(C83533f fVar) {
        FrameLayout frameLayout = fVar.f186561g;
        if (frameLayout == null) {
            C89219l.m154710a("musicRootContainer");
        }
        return frameLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m143913b(C83533f fVar) {
        ImageView imageView = fVar.f186558d;
        if (imageView == null) {
            C89219l.m154710a("ivChooseMusic");
        }
        return imageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m143914c(C83533f fVar) {
        TextView textView = fVar.f186559e;
        if (textView == null) {
            C89219l.m154710a("tvChooseMusic");
        }
        return textView;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$j */
    static final class C83548j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83533f f186588a;

        static {
            Covode.recordClassIndex(97434);
        }

        C83548j(C83533f fVar) {
            this.f186588a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C83533f fVar = this.f186588a;
            C89219l.m154716b(bool, "");
            fVar.mo128563b(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$m */
    static final class View$OnClickListenerC83551m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83533f f186591a;

        static {
            Covode.recordClassIndex(97437);
        }

        View$OnClickListenerC83551m(C83533f fVar) {
            this.f186591a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f186591a.f186545B.f186509p.mo6999a(Boolean.valueOf(!this.f186591a.f186544A));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$v */
    static final class C83561v<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83533f f186601a;

        static {
            Covode.recordClassIndex(97447);
        }

        C83561v(C83533f fVar) {
            this.f186601a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C83533f fVar = this.f186601a;
            C89219l.m154716b(bool, "");
            fVar.mo128559a(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$h */
    static final class C83546h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83533f f186586a;

        static {
            Covode.recordClassIndex(97432);
        }

        C83546h(C83533f fVar) {
            this.f186586a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C83533f.m143914c(this.f186586a).setMaxWidth((int) C13628n.m24520b(this.f186586a.mo36484r(), 104.0f));
            C83533f fVar = this.f186586a;
            C89219l.m154716b(bool, "");
            fVar.mo128564c(bool.booleanValue());
            this.f186586a.f186567t = bool.booleanValue();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$i */
    static final class C83547i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83533f f186587a;

        static {
            Covode.recordClassIndex(97433);
        }

        C83547i(C83533f fVar) {
            this.f186587a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                this.f186587a.f186544A = true;
                i = 2131230855;
            } else {
                this.f186587a.f186544A = false;
                i = 2131230856;
            }
            ImageView imageView = this.f186587a.f186573z;
            if (imageView != null) {
                imageView.setImageResource(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$k */
    static final class View$OnClickListenerC83549k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83533f f186589a;

        static {
            Covode.recordClassIndex(97435);
        }

        View$OnClickListenerC83549k(C83533f fVar) {
            this.f186589a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f186589a.f186545B.f186502i.mo6999a(C89391z.f203057a);
            this.f186589a.mo128564c(false);
            C83533f.m143914c(this.f186589a).setMaxWidth((int) C13628n.m24520b(this.f186589a.mo36484r(), 140.0f));
            this.f186589a.f186567t = false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$l */
    static final class View$OnClickListenerC83550l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83533f f186590a;

        static {
            Covode.recordClassIndex(97436);
        }

        View$OnClickListenerC83550l(C83533f fVar) {
            this.f186590a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f186590a.mo128557E();
            this.f186590a.f186545B.f186502i.mo6999a(C89391z.f203057a);
            this.f186590a.mo128564c(false);
            C83533f.m143914c(this.f186590a).setMaxWidth((int) C13628n.m24520b(this.f186590a.mo36484r(), 140.0f));
            this.f186590a.f186567t = false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$o */
    static final class C83553o<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83533f f186593a;

        static {
            Covode.recordClassIndex(97439);
        }

        C83553o(C83533f fVar) {
            this.f186593a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            ViewGroup.LayoutParams layoutParams = C83533f.m143911a(this.f186593a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Activity activity = this.f186593a.f52549m;
            if (activity == null) {
                C89219l.m154715b();
            }
            marginLayoutParams.topMargin = C70636dh.m124833c(activity) + C71812ep.m126783a(7.0d, C63247i.f143610a);
            C83533f.m143911a(this.f186593a).setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$p */
    static final class C83554p<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83533f f186594a;

        static {
            Covode.recordClassIndex(97440);
        }

        C83554p(C83533f fVar) {
            this.f186594a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C83533f fVar = this.f186594a;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C83562w wVar = new C83562w(fVar);
                RelativeLayout relativeLayout = fVar.f186560f;
                if (relativeLayout == null) {
                    C89219l.m154710a("chooseMusicContainer");
                }
                relativeLayout.setOnClickListener(wVar);
                LinearLayout linearLayout = fVar.f186570w;
                if (linearLayout != null) {
                    linearLayout.setOnClickListener(wVar);
                    return;
                }
                return;
            }
            View$OnClickListenerC83563x xVar = new View$OnClickListenerC83563x(fVar);
            RelativeLayout relativeLayout2 = fVar.f186560f;
            if (relativeLayout2 == null) {
                C89219l.m154710a("chooseMusicContainer");
            }
            relativeLayout2.setOnClickListener(xVar);
            LinearLayout linearLayout2 = fVar.f186570w;
            if (linearLayout2 != null) {
                linearLayout2.setOnClickListener(xVar);
            }
        }
    }

    /* renamed from: a */
    public static String m143912a(C69905c cVar) {
        boolean z;
        String name = cVar.getName();
        if (name == null || name.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder(cVar.getName());
        String singer = cVar.getSinger();
        if (!(singer == null || singer.length() == 0)) {
            sb.append('-');
            sb.append(cVar.getSinger());
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* renamed from: c */
    public final void mo128564c(boolean z) {
        int i;
        int i2 = 0;
        if (z) {
            i = 0;
            i2 = 8;
        } else {
            i = 8;
        }
        View view = this.f186566l;
        if (view != null) {
            view.setVisibility(i);
        }
        FrameLayout frameLayout = this.f186549G;
        if (frameLayout != null) {
            frameLayout.setVisibility(i);
        }
        Space space = this.f186551I;
        if (space != null) {
            space.setVisibility(i2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$n */
    static final class C83552n<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83533f f186592a;

        static {
            Covode.recordClassIndex(97438);
        }

        C83552n(C83533f fVar) {
            this.f186592a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Effect effect = (Effect) obj;
            if (!this.f186592a.mo128561a()) {
                return;
            }
            if (C72847c.m128642h(effect) || C83533f.m143914c(this.f186592a).getAlpha() != 1.0f || this.f186592a.f186545B.f186500g.mo6996a() == null) {
                this.f186592a.f186567t = false;
                this.f186592a.mo128564c(false);
                return;
            }
            this.f186592a.f186567t = true;
            this.f186592a.mo128564c(true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$q */
    static final class C83555q<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83533f f186595a;

        static {
            Covode.recordClassIndex(97441);
        }

        C83555q(C83533f fVar) {
            this.f186595a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num == null) {
                this.f186595a.mo128556D();
                return;
            }
            C83533f fVar = this.f186595a;
            int intValue = num.intValue();
            AbstractC23317a aVar = fVar.f186556b;
            if (aVar == null || !aVar.isShowing()) {
                fVar.mo128555C();
                C89233z.C89238e eVar = new C89233z.C89238e();
                T t = null;
                if (intValue == 1) {
                    AbstractC83507c cVar = fVar.f186555a;
                    if (cVar != null) {
                        t = (T) cVar.mo110341b();
                    }
                } else {
                    AbstractC83507c cVar2 = fVar.f186555a;
                    if (cVar2 != null) {
                        t = (T) cVar2.mo110342c();
                    }
                }
                eVar.element = t;
                fVar.mo128562b().post(new RunnableC83536ab(fVar, eVar));
                TextView textView = fVar.f186559e;
                if (textView == null) {
                    C89219l.m154710a("tvChooseMusic");
                }
                textView.setOnTouchListener(new View$OnTouchListenerC83540b(fVar));
                TextView textView2 = fVar.f186569v;
                if (textView2 != null) {
                    textView2.setOnTouchListener(new View$OnTouchListenerC83541c(fVar));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$u */
    static final class C83560u<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83533f f186600a;

        static {
            Covode.recordClassIndex(97446);
        }

        C83560u(C83533f fVar) {
            this.f186600a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            int i2;
            Boolean bool = (Boolean) obj;
            ImageView b = C83533f.m143913b(this.f186600a);
            C89219l.m154716b(bool, "");
            int i3 = 0;
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            b.setVisibility(i);
            CircleDraweeView circleDraweeView = this.f186600a.f186571x;
            if (circleDraweeView != null) {
                if (bool.booleanValue()) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                circleDraweeView.setVisibility(i2);
            }
            View view = this.f186600a.f186572y;
            if (view != null) {
                if (!bool.booleanValue()) {
                    i3 = 8;
                }
                view.setVisibility(i3);
            }
        }
    }

    /* renamed from: a */
    public final void mo128559a(boolean z) {
        LinearLayout linearLayout = this.f186568u;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            if (!z || !this.f186548F) {
                TextView textView = this.f186559e;
                if (textView == null) {
                    C89219l.m154710a("tvChooseMusic");
                }
                textView.setVisibility(8);
                return;
            }
            TextView textView2 = this.f186559e;
            if (textView2 == null) {
                C89219l.m154710a("tvChooseMusic");
            }
            textView2.setVisibility(0);
            mo128562b().post(new RunnableC83535aa(this));
        } else if (!z || !this.f186548F) {
            TextView textView3 = this.f186569v;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        } else {
            TextView textView4 = this.f186569v;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            mo128562b().post(new RunnableC83565z(this));
        }
    }

    /* renamed from: b */
    public final void mo128563b(boolean z) {
        if (!z || this.f186568u == null) {
            LinearLayout linearLayout = this.f186568u;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout = this.f186560f;
            if (relativeLayout == null) {
                C89219l.m154710a("chooseMusicContainer");
            }
            relativeLayout.setVisibility(0);
            mo128562b().post(new RunnableC83538ad(this));
            return;
        }
        RelativeLayout relativeLayout2 = this.f186560f;
        if (relativeLayout2 == null) {
            C89219l.m154710a("chooseMusicContainer");
        }
        relativeLayout2.setVisibility(8);
        LinearLayout linearLayout2 = this.f186568u;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        mo128562b().post(new RunnableC83537ac(this));
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$f */
    static final class C83544f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83533f f186584a;

        static {
            Covode.recordClassIndex(97430);
        }

        C83544f(C83533f fVar) {
            this.f186584a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            C83533f fVar = this.f186584a;
            ShortVideoContextViewModel shortVideoContextViewModel = fVar.f186557c;
            if (shortVideoContextViewModel == null) {
                C89219l.m154710a("shortVideoContextViewModel");
            }
            ShortVideoContext shortVideoContext = shortVideoContextViewModel.f155842a;
            C89219l.m154716b(shortVideoContext, "");
            if (shortVideoContext.mo110022c()) {
                StitchParams stitchParams = shortVideoContext.f155743D.f155846a;
                if (stitchParams == null) {
                    C89219l.m154715b();
                }
                fVar.f186563i = true;
                TextView textView = fVar.f186559e;
                if (textView == null) {
                    C89219l.m154710a("tvChooseMusic");
                }
                textView.setClickable(false);
                TextView textView2 = fVar.f186559e;
                if (textView2 == null) {
                    C89219l.m154710a("tvChooseMusic");
                }
                textView2.setAlpha(0.5f);
                ImageView imageView = fVar.f186558d;
                if (imageView == null) {
                    C89219l.m154710a("ivChooseMusic");
                }
                imageView.setImageAlpha(127);
                if (!shortVideoContext.mo110025d()) {
                    fVar.f186562h = true;
                    RelativeLayout relativeLayout = fVar.f186560f;
                    if (relativeLayout == null) {
                        C89219l.m154710a("chooseMusicContainer");
                    }
                    relativeLayout.setVisibility(4);
                } else {
                    C69905c music = stitchParams.getMusic();
                    TextView textView3 = fVar.f186559e;
                    if (textView3 == null) {
                        C89219l.m154710a("tvChooseMusic");
                    }
                    if (music == null || (str = music.getMusicName()) == null) {
                        str = "";
                    }
                    textView3.setText(str);
                    if (!fVar.mo128561a()) {
                        if (C65350at.m117036a()) {
                            ImageView imageView2 = fVar.f186558d;
                            if (imageView2 == null) {
                                C89219l.m154710a("ivChooseMusic");
                            }
                            imageView2.setImageResource(2131232533);
                        } else {
                            ImageView imageView3 = fVar.f186558d;
                            if (imageView3 == null) {
                                C89219l.m154710a("ivChooseMusic");
                            }
                            imageView3.setImageResource(2131232531);
                        }
                    }
                }
                fVar.mo128558F();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$g */
    static final class C83545g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83533f f186585a;

        static {
            Covode.recordClassIndex(97431);
        }

        C83545g(C83533f fVar) {
            this.f186585a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            View view = this.f186585a.f186564j;
            if (view != null) {
                C89219l.m154716b(bool, "");
                if (bool.booleanValue()) {
                    this.f186585a.mo128563b(false);
                    view.setVisibility(0);
                    if (this.f186585a.f186565k == null) {
                        C83533f fVar = this.f186585a;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", 0.0f, 360.0f);
                        ofFloat.setRepeatCount(-1);
                        ofFloat.setDuration(1000L);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        fVar.f186565k = ofFloat;
                    }
                    Animator animator = this.f186585a.f186565k;
                    if (animator != null) {
                        animator.start();
                    }
                    this.f186585a.mo128564c(false);
                    C83533f.m143914c(this.f186585a).setText(this.f186585a.mo36486t().getResources().getText(R.string.g1j));
                    C83533f.m143913b(this.f186585a).setVisibility(4);
                } else if (view.getVisibility() != 8) {
                    view.setVisibility(8);
                    Animator animator2 = this.f186585a.f186565k;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    this.f186585a.f186565k = null;
                    C83533f.m143913b(this.f186585a).setVisibility(0);
                    C83533f.m143914c(this.f186585a).setText(R.string.fsz);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$r */
    static final class C83556r<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83533f f186596a;

        static {
            Covode.recordClassIndex(97442);
        }

        C83556r(C83533f fVar) {
            this.f186596a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C83533f.m143913b(this.f186596a).setImageAlpha(255);
                C83533f.m143914c(this.f186596a).setAlpha(1.0f);
                C72847c.m128627a(this.f186596a.f186546C.mo119294f());
                if ((!this.f186596a.mo128561a() || this.f186596a.f186545B.f186500g.mo6996a() == null || this.f186596a.mo128565d()) && !this.f186596a.f186567t) {
                    z = false;
                } else {
                    z = true;
                    this.f186596a.f186567t = true;
                    View view = this.f186596a.f186566l;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                }
                this.f186596a.mo128560a(true, z);
                return;
            }
            C83533f.m143913b(this.f186596a).setImageAlpha(127);
            C83533f.m143914c(this.f186596a).setAlpha(0.5f);
            View view2 = this.f186596a.f186566l;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            this.f186596a.mo128560a(false, false);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$s */
    static final class C83557s<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83533f f186597a;

        static {
            Covode.recordClassIndex(97443);
        }

        C83557s(C83533f fVar) {
            this.f186597a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C69905c cVar = (C69905c) obj;
            View view = this.f186597a.f186564j;
            if (view != null) {
                view.setVisibility(8);
            }
            if (cVar == null) {
                this.f186597a.mo128557E();
                if (this.f186597a.mo128561a()) {
                    this.f186597a.f186567t = false;
                    this.f186597a.mo128564c(false);
                    return;
                }
                return;
            }
            C83533f.m143914c(this.f186597a).setText(C83533f.m143912a(cVar));
            if (this.f186597a.mo128561a()) {
                if (C83533f.m143914c(this.f186597a).getAlpha() == 1.0f && !this.f186597a.mo128565d()) {
                    this.f186597a.f186567t = true;
                    this.f186597a.mo128564c(true);
                }
            } else if (C65350at.m117036a()) {
                C83533f.m143913b(this.f186597a).setImageResource(2131232533);
            } else {
                C83533f.m143913b(this.f186597a).setImageResource(2131232531);
            }
            this.f186597a.mo128562b().post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.gamora.recorder.choosemusic.C83533f.C83557s.RunnableC835581 */

                /* renamed from: a */
                final /* synthetic */ C83557s f186598a;

                static {
                    Covode.recordClassIndex(97444);
                }

                {
                    this.f186598a = r1;
                }

                public final void run() {
                    C83533f.m143914c(this.f186598a.f186597a).requestFocus();
                }
            });
            C83533f fVar = this.f186597a;
            TextView textView = fVar.f186569v;
            if (textView != null) {
                textView.setText(C83533f.m143912a(cVar));
            }
            C84402a.m145169a(fVar.f186571x, cVar.getCoverMedium(), 22, 22);
            if (C83495b.m143876a(fVar.f186547D, fVar.f186546C.mo119294f())) {
                fVar.mo128563b(true);
                fVar.mo128562b().post(new RunnableC83564y(fVar));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$b */
    static final class View$OnTouchListenerC83540b implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C83533f f186580a;

        static {
            Covode.recordClassIndex(97426);
        }

        View$OnTouchListenerC83540b(C83533f fVar) {
            this.f186580a = fVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f186580a.mo128556D();
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.f$c */
    static final class View$OnTouchListenerC83541c implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C83533f f186581a;

        static {
            Covode.recordClassIndex(97427);
        }

        View$OnTouchListenerC83541c(C83533f fVar) {
            this.f186581a = fVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            this.f186581a.mo128556D();
            return false;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.bhs, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public final void mo128560a(boolean z, boolean z2) {
        if (z) {
            CircleDraweeView circleDraweeView = this.f186571x;
            if (circleDraweeView != null) {
                circleDraweeView.setImageAlpha(255);
            }
            TextView textView = this.f186569v;
            if (textView != null) {
                textView.setAlpha(1.0f);
            }
            if (z2) {
                Space space = this.f186551I;
                if (space != null) {
                    space.setVisibility(8);
                }
                FrameLayout frameLayout = this.f186549G;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            }
            ImageView imageView = this.f186573z;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        CircleDraweeView circleDraweeView2 = this.f186571x;
        if (circleDraweeView2 != null) {
            circleDraweeView2.setImageAlpha(127);
        }
        TextView textView2 = this.f186569v;
        if (textView2 != null) {
            textView2.setAlpha(0.5f);
        }
        FrameLayout frameLayout2 = this.f186549G;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        Space space2 = this.f186551I;
        if (space2 != null) {
            space2.setVisibility(0);
        }
        ImageView imageView2 = this.f186573z;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        MethodCollector.m26663i(8365);
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        View c = mo36475c(R.id.co9);
        C89219l.m154716b(c, "");
        this.f186561g = (FrameLayout) c;
        View c2 = mo36475c(R.id.dli);
        C89219l.m154716b(c2, "");
        this.f186560f = (RelativeLayout) c2;
        View c3 = mo36475c(R.id.btx);
        C89219l.m154716b(c3, "");
        this.f186558d = (ImageView) c3;
        View c4 = mo36475c(R.id.etm);
        C89219l.m154716b(c4, "");
        TextView textView = (TextView) c4;
        this.f186559e = textView;
        if (textView == null) {
            C89219l.m154710a("tvChooseMusic");
        }
        textView.setText(R.string.fsz);
        if (C65350at.m117036a()) {
            ImageView imageView = this.f186558d;
            if (imageView == null) {
                C89219l.m154710a("ivChooseMusic");
            }
            imageView.setImageResource(2131232533);
        } else {
            ImageView imageView2 = this.f186558d;
            if (imageView2 == null) {
                C89219l.m154710a("ivChooseMusic");
            }
            imageView2.setImageResource(2131232345);
        }
        this.f186564j = mo36475c(R.id.bu0);
        View c5 = mo36475c(R.id.ccg);
        this.f186566l = c5;
        if (c5 != null) {
            c5.setVisibility(8);
        }
        Activity activity = this.f52549m;
        if (activity != null) {
            Space space = null;
            AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
            C89219l.m154716b(a, "");
            this.f186557c = (ShortVideoContextViewModel) a;
            View c6 = mo36475c(R.id.ni);
            if (!(c6 instanceof ViewStub)) {
                c6 = null;
            }
            ViewStub viewStub = (ViewStub) c6;
            if (C65473f.m117200b() && viewStub != null) {
                View inflate = viewStub.inflate();
                if (!(inflate instanceof LinearLayout)) {
                    inflate = null;
                }
                this.f186568u = (LinearLayout) inflate;
                View b = mo36474b(R.id.nk);
                if (!(b instanceof TextView)) {
                    b = null;
                }
                this.f186569v = (TextView) b;
                View b2 = mo36474b(R.id.nl);
                if (!(b2 instanceof LinearLayout)) {
                    b2 = null;
                }
                this.f186570w = (LinearLayout) b2;
                View b3 = mo36474b(R.id.ng);
                if (!(b3 instanceof CircleDraweeView)) {
                    b3 = null;
                }
                this.f186571x = (CircleDraweeView) b3;
                View b4 = mo36474b(R.id.nh);
                if (!(b4 instanceof View)) {
                    b4 = null;
                }
                this.f186572y = b4;
                View b5 = mo36474b(R.id.nb);
                if (!(b5 instanceof FrameLayout)) {
                    b5 = null;
                }
                this.f186549G = (FrameLayout) b5;
                View b6 = mo36474b(R.id.na);
                if (!(b6 instanceof ImageView)) {
                    b6 = null;
                }
                this.f186550H = (ImageView) b6;
                View b7 = mo36474b(R.id.nj);
                if (!(b7 instanceof ImageView)) {
                    b7 = null;
                }
                this.f186573z = (ImageView) b7;
                View b8 = mo36474b(R.id.nm);
                if (b8 instanceof Space) {
                    space = b8;
                }
                this.f186551I = space;
            }
            Typeface a2 = C69837ao.m123399a();
            if (a2 != null) {
                TextView textView2 = this.f186559e;
                if (textView2 == null) {
                    C89219l.m154710a("tvChooseMusic");
                }
                textView2.setTypeface(a2);
                TextView textView3 = this.f186569v;
                if (textView3 != null) {
                    textView3.setTypeface(a2);
                }
            }
            this.f186554L.mo7036a(this, new C83553o(this));
            this.f186545B.f186504k.mo7036a(this, new C83554p(this));
            this.f186545B.f186505l.mo6997a(this, new C83555q(this));
            this.f186545B.f186499f.mo7036a(this, new C83556r(this));
            this.f186545B.f186500g.mo6997a(this, new C83557s(this));
            this.f186545B.f186498e.mo6997a(this, new C83559t(this));
            this.f186545B.f186495b.mo7036a(this, new C83560u(this));
            this.f186545B.f186496c.mo7036a(this, new C83561v(this));
            this.f186545B.f186506m.mo6997a(this, new C83544f(this));
            ShortVideoContextViewModel shortVideoContextViewModel = this.f186557c;
            if (shortVideoContextViewModel == null) {
                C89219l.m154710a("shortVideoContextViewModel");
            } else if (shortVideoContextViewModel != null) {
                ShortVideoContextViewModel shortVideoContextViewModel2 = this.f186557c;
                if (shortVideoContextViewModel2 == null) {
                    C89219l.m154710a("shortVideoContextViewModel");
                }
                if (shortVideoContextViewModel2.f155842a.f155778aL) {
                    ShortVideoContextViewModel shortVideoContextViewModel3 = this.f186557c;
                    if (shortVideoContextViewModel3 == null) {
                        C89219l.m154710a("shortVideoContextViewModel");
                    }
                    if (shortVideoContextViewModel3.f155842a.f155752M) {
                        mo128559a(false);
                        mo128558F();
                    }
                }
            }
            this.f186545B.f186501h.mo6997a(this, new C83545g(this));
            this.f186545B.f186503j.mo6997a(this, new C83546h(this));
            this.f186545B.f186508o.mo7036a(this, new C83547i(this));
            this.f186545B.f186510q.mo6997a(this, new C83548j(this));
            View view2 = this.f186566l;
            if (view2 != null) {
                view2.setOnClickListener(new View$OnClickListenerC83549k(this));
            }
            ImageView imageView3 = this.f186550H;
            if (imageView3 != null) {
                imageView3.setOnClickListener(new View$OnClickListenerC83550l(this));
            }
            CircleDraweeView circleDraweeView = this.f186571x;
            if (circleDraweeView != null) {
                circleDraweeView.setOnClickListener(new View$OnClickListenerC83551m(this));
            }
            this.f186546C.mo119302n().mo119323b().observe(this, new C83552n(this));
            MethodCollector.m26664o(8365);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.m26664o(8365);
        throw nullPointerException;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
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

    public C83533f(C83506b bVar, C2560h<Boolean> hVar, AbstractC75655o oVar, ShortVideoContext shortVideoContext) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(shortVideoContext, "");
        this.f186545B = bVar;
        this.f186554L = hVar;
        this.f186546C = oVar;
        this.f186547D = shortVideoContext;
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
