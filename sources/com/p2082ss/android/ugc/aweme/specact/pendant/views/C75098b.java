package com.p2082ss.android.ugc.aweme.specact.pendant.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.airbnb.lottie.AbstractC2186i;
import com.airbnb.lottie.C2044e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.pendant.OptimizedLottieAnimationView;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3932b.C74973a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3934d.C74993b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.p3935e.C75003b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3937e.AbstractC75025f;
import com.p2082ss.android.ugc.trill.R;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b */
public final class C75098b extends View$OnTouchListenerC75114c {

    /* renamed from: m */
    public static final C75099a f168797m = new C75099a((byte) 0);

    /* renamed from: a */
    public int f168798a;

    /* renamed from: b */
    public View f168799b;

    /* renamed from: c */
    public TextView f168800c;

    /* renamed from: d */
    public View f168801d;

    /* renamed from: e */
    public View f168802e;

    /* renamed from: f */
    public View f168803f;

    /* renamed from: g */
    public TextView f168804g;

    /* renamed from: h */
    public View f168805h;

    /* renamed from: i */
    public C75003b f168806i;

    /* renamed from: j */
    public C74973a f168807j;

    /* renamed from: k */
    public C74993b f168808k;

    /* renamed from: l */
    public Animator f168809l;

    /* renamed from: p */
    private GradientDrawable f168810p;

    /* renamed from: q */
    private final AbstractC89244h f168811q;

    /* renamed from: r */
    private final AbstractC89244h f168812r;

    /* renamed from: s */
    private final AbstractC89244h f168813s;

    /* renamed from: t */
    private final AbstractC89244h f168814t;

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b$e */
    public static final class C75103e<T> implements AbstractC2186i {

        /* renamed from: a */
        final /* synthetic */ OptimizedLottieAnimationView f168820a;

        static {
            Covode.recordClassIndex(87976);
        }

        public C75103e(OptimizedLottieAnimationView optimizedLottieAnimationView) {
            this.f168820a = optimizedLottieAnimationView;
        }

        @Override // com.airbnb.lottie.AbstractC2186i
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo5889a(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(87971);
    }

    private final View getPendantLayout() {
        return (View) this.f168814t.getValue();
    }

    public final TextView getBonusTextView() {
        return (TextView) this.f168813s.getValue();
    }

    public final OptimizedLottieAnimationView getLottieView() {
        return (OptimizedLottieAnimationView) this.f168812r.getValue();
    }

    public final ProgressBarTimerView getProgressBarTimerView() {
        return (ProgressBarTimerView) this.f168811q.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b$a */
    public static final class C75099a {
        static {
            Covode.recordClassIndex(87972);
        }

        private C75099a() {
        }

        public /* synthetic */ C75099a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b$b */
    static final class C75100b extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C75098b f168815a;

        static {
            Covode.recordClassIndex(87973);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75100b(C75098b bVar) {
            super(0);
            this.f168815a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f168815a.findViewById(R.id.tk);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b$f */
    static final class C75104f extends AbstractC89220m implements AbstractC89171a<OptimizedLottieAnimationView> {

        /* renamed from: a */
        final /* synthetic */ C75098b f168821a;

        static {
            Covode.recordClassIndex(87977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75104f(C75098b bVar) {
            super(0);
            this.f168821a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ OptimizedLottieAnimationView invoke() {
            return this.f168821a.findViewById(R.id.ei7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b$g */
    static final class C75105g extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C75098b f168822a;

        static {
            Covode.recordClassIndex(87978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75105g(C75098b bVar) {
            super(0);
            this.f168822a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f168822a.findViewById(R.id.d0a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b$m */
    static final class C75111m extends AbstractC89220m implements AbstractC89171a<ProgressBarTimerView> {

        /* renamed from: a */
        final /* synthetic */ C75098b f168835a;

        static {
            Covode.recordClassIndex(87984);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75111m(C75098b bVar) {
            super(0);
            this.f168835a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProgressBarTimerView invoke() {
            return this.f168835a.findViewById(R.id.d_9);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f168809l;
        if (animator != null && animator.isStarted()) {
            animator.cancel();
        }
    }

    /* renamed from: a */
    public final void mo118214a() {
        this.f168798a = 0;
        getProgressBarTimerView().mo118188a(0.0f);
    }

    /* renamed from: b */
    public final void mo118215b() {
        getBonusTextView().setVisibility(8);
        getBonusTextView().setText("");
        getBonusTextView().setTranslationY(mo118213a(2.0f));
        getBonusTextView().setScaleY(1.0f);
        getBonusTextView().setScaleX(1.0f);
        getBonusTextView().setAlpha(1.0f);
    }

    /* renamed from: c */
    public final Animator mo118216c() {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(getBonusTextView(), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationY", mo118213a(6.0f), mo118213a(5.0f))).setDuration(133L);
        C89219l.m154716b(duration, "");
        ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(getBonusTextView(), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 1.3f), PropertyValuesHolder.ofFloat("scaleX", 1.0f, 1.3f), PropertyValuesHolder.ofFloat("translationY", mo118213a(5.0f), mo118213a(7.0f))).setDuration(166L);
        C89219l.m154716b(duration2, "");
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(getBonusTextView(), "translationY", mo118213a(7.0f), mo118213a(-1.5f)).setDuration(800L);
        C89219l.m154716b(duration3, "");
        ObjectAnimator duration4 = ObjectAnimator.ofPropertyValuesHolder(getBonusTextView(), PropertyValuesHolder.ofFloat("scaleY", 1.3f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 1.3f, 1.0f)).setDuration(367L);
        C89219l.m154716b(duration4, "");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration3).with(duration4);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(getBonusTextView(), "alpha", 1.0f, 1.0f).setDuration(300L);
        C89219l.m154716b(duration5, "");
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(getBonusTextView(), "alpha", 1.0f, 0.0f).setDuration(133L);
        C89219l.m154716b(duration6, "");
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(duration, duration2, animatorSet, duration5, duration6);
        return animatorSet2;
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b$h */
    public static final class C75106h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C75098b f168823a;

        static {
            Covode.recordClassIndex(87979);
        }

        public C75106h(C75098b bVar) {
            this.f168823a = bVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f168823a.f168809l = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b$i */
    public static final class C75107i extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f168824a = 0;

        /* renamed from: b */
        final /* synthetic */ int f168825b = 64;

        /* renamed from: c */
        final /* synthetic */ int f168826c = 0;

        /* renamed from: d */
        final /* synthetic */ int f168827d = 1;

        /* renamed from: e */
        final /* synthetic */ AbstractC89171a f168828e = null;

        static {
            Covode.recordClassIndex(87980);
        }

        public final void onAnimationEnd(Animator animator) {
            AbstractC89171a aVar = this.f168828e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            AbstractC89171a aVar = this.f168828e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b$k */
    public static final class C75109k extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C75098b f168831a;

        /* renamed from: b */
        final /* synthetic */ String f168832b;

        static {
            Covode.recordClassIndex(87982);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f168831a.mo118215b();
        }

        public final void onAnimationStart(Animator animator) {
            this.f168831a.getBonusTextView().setText(this.f168832b);
        }

        public C75109k(C75098b bVar, String str) {
            this.f168831a = bVar;
            this.f168832b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b$l */
    public static final class C75110l extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C75098b f168833a;

        /* renamed from: b */
        final /* synthetic */ String f168834b;

        static {
            Covode.recordClassIndex(87983);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f168833a.mo118215b();
        }

        public final void onAnimationStart(Animator animator) {
            this.f168833a.getBonusTextView().setText(this.f168834b);
        }

        public C75110l(C75098b bVar, String str) {
            this.f168833a = bVar;
            this.f168834b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b$j */
    public static final class C75108j extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C75098b f168829a;

        /* renamed from: b */
        final /* synthetic */ String f168830b;

        static {
            Covode.recordClassIndex(87981);
        }

        public final void onAnimationStart(Animator animator) {
            this.f168829a.getBonusTextView().setText(this.f168830b);
        }

        public C75108j(C75098b bVar, String str) {
            this.f168829a = bVar;
            this.f168830b = str;
        }
    }

    /* renamed from: a */
    public final float mo118213a(float f) {
        return C13628n.m24520b(getContext(), f);
    }

    public final void setProgressForegroundColor(List<String> list) {
        C89219l.m154721d(list, "");
        getProgressBarTimerView().setProgressForegroundColor(list);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b$c */
    public static final class View$OnClickListenerC75101c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C75098b f168816a;

        static {
            Covode.recordClassIndex(87974);
        }

        public View$OnClickListenerC75101c(C75098b bVar) {
            this.f168816a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C75003b bVar = this.f168816a.f168806i;
            if (bVar != null) {
                bVar.mo118114a();
            }
            C39162r.onEventV3("widget_bubble_close_click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b$d */
    public static final class C75102d<T> implements AbstractC2186i {

        /* renamed from: a */
        final /* synthetic */ OptimizedLottieAnimationView f168817a;

        /* renamed from: b */
        final /* synthetic */ InputStream f168818b;

        /* renamed from: c */
        final /* synthetic */ AbstractC75025f f168819c;

        static {
            Covode.recordClassIndex(87975);
        }

        public C75102d(OptimizedLottieAnimationView optimizedLottieAnimationView, InputStream inputStream, AbstractC75025f fVar) {
            this.f168817a = optimizedLottieAnimationView;
            this.f168818b = inputStream;
            this.f168819c = fVar;
        }

        @Override // com.airbnb.lottie.AbstractC2186i
        /* renamed from: a */
        public final /* synthetic */ void mo5889a(Object obj) {
            C2044e eVar = (C2044e) obj;
            OptimizedLottieAnimationView optimizedLottieAnimationView = this.f168817a;
            C89219l.m154716b(eVar, "");
            optimizedLottieAnimationView.setComposition(eVar);
            AbstractC75025f fVar = this.f168819c;
            if (fVar != null) {
                fVar.mo118086a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b$n */
    public static final class View$OnClickListenerC75112n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C75098b f168836a;

        static {
            Covode.recordClassIndex(87985);
        }

        public View$OnClickListenerC75112n(C75098b bVar) {
            this.f168836a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C74993b bVar = this.f168836a.f168808k;
            if (bVar != null) {
                bVar.mo118111a();
            }
            C39162r.m79460a("widget_bubble2_close_click", new C33744d().mo59983a(StringSet.type, "watch_video").f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.views.b$o */
    public static final class C75113o implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C75098b f168837a;

        /* renamed from: b */
        final /* synthetic */ int f168838b;

        static {
            Covode.recordClassIndex(87986);
        }

        public C75113o(C75098b bVar, int i) {
            this.f168837a = bVar;
            this.f168838b = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ProgressBarTimerView progressBarTimerView = this.f168837a.getProgressBarTimerView();
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            progressBarTimerView.mo118188a(((Float) animatedValue).floatValue() / ((float) this.f168838b));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        if (!(motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null)) {
            if (valueOf.intValue() == 0) {
                setAlpha(0.7f);
            } else if (valueOf.intValue() == 1 || valueOf.intValue() == 3) {
                setAlpha(1.0f);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setProgressBackgroundColor(List<String> list) {
        C89219l.m154721d(list, "");
        try {
            this.f168810p = m131881a(Color.parseColor(list.get(0)), Color.parseColor(list.get(1)));
            getPendantLayout().setBackground(this.f168810p);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C75098b(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        this.f168811q = C89250i.m154773a((AbstractC89171a) new C75111m(this));
        this.f168812r = C89250i.m154773a((AbstractC89171a) new C75104f(this));
        this.f168813s = C89250i.m154773a((AbstractC89171a) new C75100b(this));
        this.f168814t = C89250i.m154773a((AbstractC89171a) new C75105g(this));
        Objects.requireNonNull(C1764a.m5927a(LayoutInflater.from(context), R.layout.b0n, this, true), "null cannot be cast to non-null type android.view.View");
        if (this.f168810p == null) {
            int c = C0643b.m2378c(getContext(), R.color.c5);
            this.f168810p = m131881a(c, c);
            this.f168853n = true;
        }
    }

    public /* synthetic */ C75098b(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    private static GradientDrawable m131881a(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(2);
        gradientDrawable.setShape(1);
        gradientDrawable.setColors(new int[]{i, i2});
        return gradientDrawable;
    }
}
