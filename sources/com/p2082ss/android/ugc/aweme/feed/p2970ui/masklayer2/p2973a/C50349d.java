package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50345a;
import com.p2082ss.android.ugc.aweme.share.DialogC69418s;
import com.p2082ss.android.ugc.aweme.shortvideo.animationInterpolatorC69832aj;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.d */
public final class C50349d extends AbstractC50367m {

    /* renamed from: e */
    public static final C50350a f116267e = new C50350a((byte) 0);

    /* renamed from: k */
    private static final int f116268k = ((int) C13628n.m24520b(C17867d.m33078a(), 8.0f));

    /* renamed from: l */
    private static final animationInterpolatorC69832aj f116269l = new animationInterpolatorC69832aj(0.25f, 0.1f, 0.25f);

    /* renamed from: a */
    public ViewGroup f116270a;

    /* renamed from: b */
    public ViewGroup f116271b;

    /* renamed from: c */
    public ViewGroup f116272c;

    /* renamed from: d */
    public boolean f116273d;

    /* renamed from: h */
    private AnimatorSet f116274h;

    /* renamed from: i */
    private final C50345a f116275i;

    /* renamed from: j */
    private final AbstractC50382f f116276j;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.d$a */
    public static final class C50350a {
        static {
            Covode.recordClassIndex(59478);
        }

        private C50350a() {
        }

        public /* synthetic */ C50350a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(59477);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e
    /* renamed from: b */
    public final void mo85531b(View view) {
        C89219l.m154721d(view, "");
        mo85530a(view);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.d$e */
    static final class C50354e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C50349d f116280a;

        static {
            Covode.recordClassIndex(59482);
        }

        C50354e(C50349d dVar) {
            this.f116280a = dVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            ViewGroup viewGroup = this.f116280a.f116271b;
            if (viewGroup != null) {
                viewGroup.setScrollX(intValue);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.d$c */
    static final class C50352c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C50349d f116278a;

        static {
            Covode.recordClassIndex(59480);
        }

        C50352c(C50349d dVar) {
            this.f116278a = dVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup viewGroup;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            ViewGroup viewGroup2 = this.f116278a.f116271b;
            if (viewGroup2 != null) {
                viewGroup2.setAlpha(floatValue);
            }
            if (floatValue <= 0.0f && (viewGroup = this.f116278a.f116271b) != null) {
                viewGroup.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.d$d */
    static final class C50353d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C50349d f116279a;

        static {
            Covode.recordClassIndex(59481);
        }

        C50353d(C50349d dVar) {
            this.f116279a = dVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            if (this.f116279a.f116273d) {
                ViewGroup viewGroup = this.f116279a.f116272c;
                if (viewGroup != null) {
                    viewGroup.setScrollX(intValue);
                    return;
                }
                return;
            }
            ViewGroup viewGroup2 = this.f116279a.f116270a;
            if (viewGroup2 != null) {
                viewGroup2.setScrollX(intValue);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.d$f */
    static final class C50355f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C50349d f116281a;

        static {
            Covode.recordClassIndex(59483);
        }

        C50355f(C50349d dVar) {
            this.f116281a = dVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            ViewGroup viewGroup = this.f116281a.f116271b;
            if (!(viewGroup == null || (layoutParams = viewGroup.getLayoutParams()) == null)) {
                layoutParams.height = intValue;
            }
            ViewGroup viewGroup2 = this.f116281a.f116271b;
            if (viewGroup2 != null) {
                viewGroup2.requestLayout();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.d$b */
    static final class C50351b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C50349d f116277a;

        static {
            Covode.recordClassIndex(59479);
        }

        C50351b(C50349d dVar) {
            this.f116277a = dVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup viewGroup;
            ViewGroup viewGroup2;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            if (this.f116277a.f116273d) {
                ViewGroup viewGroup3 = this.f116277a.f116272c;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(floatValue);
                }
                if (floatValue > 0.0f && (viewGroup2 = this.f116277a.f116272c) != null) {
                    viewGroup2.setVisibility(0);
                    return;
                }
                return;
            }
            ViewGroup viewGroup4 = this.f116277a.f116270a;
            if (viewGroup4 != null) {
                viewGroup4.setAlpha(floatValue);
            }
            if (floatValue > 0.0f && (viewGroup = this.f116277a.f116270a) != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e
    /* renamed from: a */
    public final void mo85530a(View view) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        C89219l.m154721d(view, "");
        AnimatorSet animatorSet = this.f116274h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new C50351b(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        C89219l.m154716b(ofFloat2, "");
        ofFloat2.setDuration(200L);
        ofFloat2.addUpdateListener(new C50352c(this));
        int i2 = f116268k;
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, 0);
        C89219l.m154716b(ofInt, "");
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new C50353d(this));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, -i2);
        C89219l.m154716b(ofInt2, "");
        ofInt2.setDuration(300L);
        ofInt2.addUpdateListener(new C50354e(this));
        int[] iArr = new int[2];
        ViewGroup viewGroup = this.f116271b;
        if (viewGroup == null) {
            C89219l.m154715b();
        }
        iArr[0] = viewGroup.getMeasuredHeight();
        ViewGroup viewGroup2 = this.f116270a;
        if (viewGroup2 == null) {
            C89219l.m154715b();
        }
        iArr[1] = viewGroup2.getMeasuredHeight();
        ValueAnimator ofInt3 = ValueAnimator.ofInt(iArr);
        C89219l.m154716b(ofInt3, "");
        ofInt3.setDuration(300L);
        ofInt3.addUpdateListener(new C50355f(this));
        ViewGroup viewGroup3 = this.f116271b;
        DialogC69418s sVar = null;
        if (viewGroup3 != null) {
            layoutParams = viewGroup3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i3 = marginLayoutParams.topMargin;
        ViewGroup viewGroup4 = this.f116270a;
        int[] iArr2 = new int[2];
        if (viewGroup4 != null) {
            viewGroup4.getLocationOnScreen(iArr2);
        }
        if (C29843f.m60136c()) {
            i = iArr2[1] - C34723i.m70927b();
        } else {
            i = iArr2[1];
        }
        C50356g gVar = new C50356g(this, marginLayoutParams, i, i3);
        gVar.setDuration(200);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f116274h = animatorSet2;
        animatorSet2.setInterpolator(f116269l);
        if (this.f116273d) {
            ofFloat.setDuration(200L);
            ofFloat2.setDuration(200L);
            ViewGroup viewGroup5 = this.f116271b;
            if (viewGroup5 != null) {
                viewGroup5.startAnimation(gVar);
            }
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ofInt, ofInt2, ofInt3);
        animatorSet2.start();
        C39162r.m79460a("block_videos_click_back", new C33744d().mo59983a("click_method", "button").mo59983a("enter_from", this.f116275i.f116265c).mo59983a("enter_method", "long_press").f79943a);
        AbstractC50382f fVar = this.f116276j;
        if (fVar instanceof DialogC69418s) {
            sVar = fVar;
        }
        DialogC69418s sVar2 = sVar;
        if (sVar2 != null) {
            ((ConstraintLayout) sVar2.findViewById(R.id.cyw)).setPadding(0, C89241a.m154730a(C13628n.m24520b(sVar2.getContext(), 8.0f)), 0, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.d$g */
    public static final class C50356g extends Animation {

        /* renamed from: a */
        final /* synthetic */ C50349d f116282a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup.MarginLayoutParams f116283b;

        /* renamed from: c */
        final /* synthetic */ int f116284c;

        /* renamed from: d */
        final /* synthetic */ int f116285d;

        static {
            Covode.recordClassIndex(59484);
        }

        /* access modifiers changed from: protected */
        public final void applyTransformation(float f, Transformation transformation) {
            ViewGroup.MarginLayoutParams marginLayoutParams = this.f116283b;
            int i = this.f116284c;
            int i2 = this.f116285d;
            marginLayoutParams.topMargin = ((int) (((float) (i - i2)) * f)) + i2;
            ViewGroup viewGroup = this.f116282a.f116271b;
            if (viewGroup != null) {
                viewGroup.setLayoutParams(this.f116283b);
            }
        }

        C50356g(C50349d dVar, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
            this.f116282a = dVar;
            this.f116283b = marginLayoutParams;
            this.f116284c = i;
            this.f116285d = i2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50349d(C50345a aVar, AbstractC50382f fVar) {
        super(aVar, fVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(fVar, "");
        this.f116275i = aVar;
        this.f116276j = fVar;
        this.f116270a = fVar.mo85550a();
        this.f116271b = fVar.mo85552b();
    }
}
