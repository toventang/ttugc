package com.bytedance.android.live.liveinteract.cohost.p279ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.a */
public final class C4803a extends FrameLayout {

    /* renamed from: a */
    public AbstractC88412b f12619a;

    /* renamed from: b */
    private final AbstractC89244h f12620b;

    /* renamed from: c */
    private final AbstractC89244h f12621c;

    /* renamed from: d */
    private final AbstractC89244h f12622d;

    /* renamed from: e */
    private final AbstractC89244h f12623e;

    /* renamed from: f */
    private final AbstractC89244h f12624f;

    static {
        Covode.recordClassIndex(5384);
    }

    private final Animation getMAnimation1() {
        return (Animation) this.f12623e.getValue();
    }

    private final Animation getMAnimation2() {
        return (Animation) this.f12624f.getValue();
    }

    public final View getMAnimView1() {
        return (View) this.f12620b.getValue();
    }

    public final View getMAnimView2() {
        return (View) this.f12621c.getValue();
    }

    public final VHeadView getMUserAvatar() {
        return (VHeadView) this.f12622d.getValue();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.a$a */
    static final class C4804a extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C4803a f12625a;

        static {
            Covode.recordClassIndex(5385);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4804a(C4803a aVar) {
            super(0);
            this.f12625a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f12625a.findViewById(R.id.ffr);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.a$b */
    static final class C4805b extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C4803a f12626a;

        static {
            Covode.recordClassIndex(5386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4805b(C4803a aVar) {
            super(0);
            this.f12626a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f12626a.findViewById(R.id.ffs);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.a$e */
    static final class C4810e extends AbstractC89220m implements AbstractC89171a<VHeadView> {

        /* renamed from: a */
        final /* synthetic */ C4803a f12631a;

        static {
            Covode.recordClassIndex(5391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4810e(C4803a aVar) {
            super(0);
            this.f12631a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VHeadView invoke() {
            return this.f12631a.findViewById(R.id.bys);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC88412b bVar = this.f12619a;
        if (bVar != null) {
            bVar.dispose();
        }
        getMAnimation1().cancel();
        getMAnimation2().cancel();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.a$c */
    static final class C4806c extends AbstractC89220m implements AbstractC89171a<Animation> {

        /* renamed from: a */
        final /* synthetic */ C4803a f12627a;

        static {
            Covode.recordClassIndex(5387);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4806c(C4803a aVar) {
            super(0);
            this.f12627a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Animation invoke() {
            MethodCollector.m26663i(5822);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f12627a.getContext(), R.anim.ej);
            loadAnimation.setDuration(1300);
            loadAnimation.setRepeatCount(1);
            loadAnimation.setInterpolator(new LinearInterpolator());
            loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC4807a(this));
            MethodCollector.m26664o(5822);
            return loadAnimation;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.a$c$a  reason: invalid class name */
        public static final class animationAnimation$AnimationListenerC4807a implements Animation.AnimationListener {

            /* renamed from: a */
            final /* synthetic */ C4806c f12628a;

            static {
                Covode.recordClassIndex(5388);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            animationAnimation$AnimationListenerC4807a(C4806c cVar) {
                this.f12628a = cVar;
            }

            public final void onAnimationEnd(Animation animation) {
                C13628n.m24510a(this.f12628a.f12627a.getMAnimView1(), 4);
                this.f12628a.f12627a.getMAnimView2().setAlpha(1.0f);
                this.f12628a.f12627a.getMAnimView2().setScaleX(1.0f);
                this.f12628a.f12627a.getMAnimView2().setScaleY(1.0f);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.a$d */
    static final class C4808d extends AbstractC89220m implements AbstractC89171a<Animation> {

        /* renamed from: a */
        final /* synthetic */ C4803a f12629a;

        static {
            Covode.recordClassIndex(5389);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4808d(C4803a aVar) {
            super(0);
            this.f12629a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Animation invoke() {
            MethodCollector.m26663i(5653);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f12629a.getContext(), R.anim.ej);
            loadAnimation.setDuration(1300);
            loadAnimation.setStartOffset(700);
            loadAnimation.setRepeatCount(1);
            loadAnimation.setInterpolator(new LinearInterpolator());
            loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC4809a(this));
            MethodCollector.m26664o(5653);
            return loadAnimation;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.a$d$a  reason: invalid class name */
        public static final class animationAnimation$AnimationListenerC4809a implements Animation.AnimationListener {

            /* renamed from: a */
            final /* synthetic */ C4808d f12630a;

            static {
                Covode.recordClassIndex(5390);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            animationAnimation$AnimationListenerC4809a(C4808d dVar) {
                this.f12630a = dVar;
            }

            public final void onAnimationEnd(Animation animation) {
                C13628n.m24510a(this.f12630a.f12629a.getMAnimView2(), 4);
                this.f12630a.f12629a.getMAnimView2().setAlpha(1.0f);
                this.f12630a.f12629a.getMAnimView2().setScaleX(1.0f);
                this.f12630a.f12629a.getMAnimView2().setScaleY(1.0f);
            }
        }
    }

    /* renamed from: a */
    public final void mo10533a() {
        C13628n.m24510a(getMAnimView1(), 0);
        getMAnimView1().startAnimation(getMAnimation1());
        C13628n.m24510a(getMAnimView2(), 0);
        getMAnimView2().startAnimation(getMAnimation2());
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.a$f */
    public static final class C4811f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C4803a f12632a;

        static {
            Covode.recordClassIndex(5392);
        }

        public C4811f(C4803a aVar) {
            this.f12632a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f12632a.mo10533a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C4803a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5826);
        this.f12620b = C89250i.m154773a((AbstractC89171a) new C4804a(this));
        this.f12621c = C89250i.m154773a((AbstractC89171a) new C4805b(this));
        this.f12622d = C89250i.m154773a((AbstractC89171a) new C4810e(this));
        this.f12623e = C89250i.m154773a((AbstractC89171a) new C4806c(this));
        this.f12624f = C89250i.m154773a((AbstractC89171a) new C4808d(this));
        LayoutInflater.from(getContext()).inflate(R.layout.beq, this);
        MethodCollector.m26664o(5826);
    }

    public /* synthetic */ C4803a(Context context, byte b) {
        this(context);
    }
}
