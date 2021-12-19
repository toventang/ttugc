package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50345a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50381e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50387k;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout.C50392b;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout.C50397e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout.C50398f;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.share.DialogC69418s;
import com.p2082ss.android.ugc.aweme.shortvideo.animationInterpolatorC69832aj;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.n */
public final class C50369n extends AbstractC50367m {

    /* renamed from: h */
    public static final C50370a f116298h = new C50370a((byte) 0);

    /* renamed from: k */
    private static final int f116299k = ((int) C13628n.m24520b(C17867d.m33078a(), 8.0f));

    /* renamed from: l */
    private static final animationInterpolatorC69832aj f116300l = new animationInterpolatorC69832aj(0.25f, 0.1f, 0.25f);

    /* renamed from: a */
    public ViewGroup f116301a;

    /* renamed from: b */
    public ViewGroup f116302b;

    /* renamed from: c */
    public ViewGroup f116303c;

    /* renamed from: d */
    public boolean f116304d;

    /* renamed from: e */
    public final C50345a f116305e;

    /* renamed from: i */
    private final AbstractC50382f f116306i;

    /* renamed from: j */
    private AnimatorSet f116307j;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.n$a */
    public static final class C50370a {
        static {
            Covode.recordClassIndex(59498);
        }

        private C50370a() {
        }

        public /* synthetic */ C50370a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(59497);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e
    /* renamed from: b */
    public final void mo85531b(View view) {
        C89219l.m154721d(view, "");
        mo85530a(view);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.n$e */
    static final class C50374e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C50369n f116311a;

        static {
            Covode.recordClassIndex(59502);
        }

        C50374e(C50369n nVar) {
            this.f116311a = nVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            ViewGroup viewGroup = this.f116311a.f116302b;
            if (viewGroup != null) {
                viewGroup.setScrollX(intValue);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.n$c */
    static final class C50372c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C50369n f116309a;

        static {
            Covode.recordClassIndex(59500);
        }

        C50372c(C50369n nVar) {
            this.f116309a = nVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup viewGroup;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            ViewGroup viewGroup2 = this.f116309a.f116302b;
            if (viewGroup2 != null) {
                viewGroup2.setAlpha(floatValue);
            }
            if (floatValue > 0.0f && (viewGroup = this.f116309a.f116302b) != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.n$f */
    static final class C50375f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C50369n f116312a;

        static {
            Covode.recordClassIndex(59503);
        }

        C50375f(C50369n nVar) {
            this.f116312a = nVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            ViewGroup viewGroup = this.f116312a.f116302b;
            if (!(viewGroup == null || (layoutParams = viewGroup.getLayoutParams()) == null)) {
                layoutParams.height = intValue;
            }
            ViewGroup viewGroup2 = this.f116312a.f116302b;
            if (viewGroup2 != null) {
                viewGroup2.requestLayout();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.n$b */
    static final class C50371b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C50369n f116308a;

        static {
            Covode.recordClassIndex(59499);
        }

        C50371b(C50369n nVar) {
            this.f116308a = nVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            if (this.f116308a.f116304d) {
                ViewGroup viewGroup = this.f116308a.f116303c;
                if (viewGroup != null) {
                    viewGroup.setAlpha(floatValue);
                }
            } else {
                ViewGroup viewGroup2 = this.f116308a.f116301a;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(floatValue);
                }
            }
            if (floatValue > 0.0f) {
                return;
            }
            if (this.f116308a.f116304d) {
                ViewGroup viewGroup3 = this.f116308a.f116303c;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    return;
                }
                return;
            }
            ViewGroup viewGroup4 = this.f116308a.f116301a;
            if (viewGroup4 != null) {
                viewGroup4.setVisibility(4);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.n$d */
    static final class C50373d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C50369n f116310a;

        static {
            Covode.recordClassIndex(59501);
        }

        C50373d(C50369n nVar) {
            this.f116310a = nVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup viewGroup;
            ViewGroup viewGroup2;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            if (this.f116310a.f116304d) {
                ViewGroup viewGroup3 = this.f116310a.f116303c;
                if (viewGroup3 != null) {
                    viewGroup3.setScrollX(intValue);
                }
                ViewGroup viewGroup4 = this.f116310a.f116303c;
                if (viewGroup4 != null && viewGroup4.getScrollX() == intValue && (viewGroup2 = this.f116310a.f116303c) != null) {
                    viewGroup2.setVisibility(8);
                    return;
                }
                return;
            }
            ViewGroup viewGroup5 = this.f116310a.f116301a;
            if (viewGroup5 != null) {
                viewGroup5.setScrollX(intValue);
            }
            ViewGroup viewGroup6 = this.f116310a.f116301a;
            if (viewGroup6 != null && viewGroup6.getScrollX() == intValue && (viewGroup = this.f116310a.f116301a) != null) {
                viewGroup.setVisibility(8);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e
    /* renamed from: a */
    public final void mo85530a(View view) {
        ViewGroup.LayoutParams layoutParams;
        MethodCollector.m26663i(5882);
        C89219l.m154721d(view, "");
        ViewGroup viewGroup = this.f116302b;
        Dialog dialog = null;
        if (viewGroup != null && viewGroup.getChildCount() == 0) {
            AbstractC50382f fVar = this.f116306i;
            C50398f fVar2 = new C50398f(fVar != null ? fVar.getContext() : null);
            C50387k kVar = new C50387k(new C50397e(0, 0), this.f116305e.mo85526a(this.f116306i));
            C89219l.m154721d(kVar, "");
            AbstractC50357e eVar = kVar.f116331b;
            if (eVar != null) {
                fVar2.f116356g = (C50349d) eVar;
                ViewGroup viewGroup2 = this.f116302b;
                if (viewGroup2 != null) {
                    viewGroup2.addView(fVar2);
                }
                int i = 0;
                for (C50381e eVar2 : this.f116305e.mo85529c(this.f116306i)) {
                    AbstractC50382f fVar3 = this.f116306i;
                    C50392b bVar = new C50392b(fVar3 != null ? fVar3.getContext() : null);
                    if (i == 0) {
                        bVar.mo85561a(eVar2.f116326a, eVar2.f116327b, true);
                    } else {
                        bVar.mo85561a(eVar2.f116326a, eVar2.f116327b, false);
                    }
                    ViewGroup viewGroup3 = this.f116302b;
                    if (viewGroup3 != null) {
                        viewGroup3.addView(bVar);
                    }
                    i++;
                }
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.masklayer2.action.BackPrimaryAction");
                MethodCollector.m26664o(5882);
                throw nullPointerException;
            }
        }
        ViewGroup viewGroup4 = this.f116302b;
        if (viewGroup4 != null) {
            viewGroup4.measure(View.MeasureSpec.makeMeasureSpec(viewGroup4.getWidth(), Integer.MIN_VALUE), 0);
        }
        AnimatorSet animatorSet = this.f116307j;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new C50371b(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        C89219l.m154716b(ofFloat2, "");
        ofFloat2.setDuration(300L);
        ofFloat2.addUpdateListener(new C50372c(this));
        int i2 = f116299k;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i2);
        C89219l.m154716b(ofInt, "");
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new C50373d(this));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(-i2, 0);
        C89219l.m154716b(ofInt2, "");
        ofInt2.setDuration(300L);
        ofInt2.addUpdateListener(new C50374e(this));
        int[] iArr = new int[2];
        ViewGroup viewGroup5 = this.f116301a;
        if (viewGroup5 == null) {
            C89219l.m154715b();
        }
        iArr[0] = viewGroup5.getMeasuredHeight();
        ViewGroup viewGroup6 = this.f116302b;
        if (viewGroup6 == null) {
            C89219l.m154715b();
        }
        iArr[1] = viewGroup6.getMeasuredHeight();
        ValueAnimator ofInt3 = ValueAnimator.ofInt(iArr);
        C89219l.m154716b(ofInt3, "");
        ofInt3.setDuration(300L);
        ofInt3.addUpdateListener(new C50375f(this));
        int a = C34723i.m70924a(C17867d.m33078a());
        ViewGroup viewGroup7 = this.f116302b;
        if (viewGroup7 == null || (layoutParams = viewGroup7.getLayoutParams()) == null) {
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            MethodCollector.m26664o(5882);
            throw nullPointerException2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i3 = marginLayoutParams.topMargin;
        ViewGroup viewGroup8 = this.f116302b;
        if (viewGroup8 == null) {
            C89219l.m154715b();
        }
        C50376g gVar = new C50376g(this, marginLayoutParams, (a - viewGroup8.getMeasuredHeight()) / 2, i3);
        gVar.setDuration(200);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f116307j = animatorSet2;
        animatorSet2.setInterpolator(f116300l);
        if (this.f116304d) {
            ofFloat.setDuration(200L);
            ofFloat2.setDuration(200L);
            ViewGroup viewGroup9 = this.f116302b;
            if (viewGroup9 != null) {
                viewGroup9.startAnimation(gVar);
            }
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ofInt, ofInt2, ofInt3);
        animatorSet2.start();
        C33744d a2 = new C33744d().mo59983a("enter_from", this.f116305e.f116265c);
        Aweme aweme = this.f116305e.f116264b;
        C33744d a3 = a2.mo59983a("group_id", aweme != null ? aweme.getAid() : null);
        Aweme aweme2 = this.f116305e.f116264b;
        C39162r.m79460a("click_block_videos", a3.mo59983a("author_id", aweme2 != null ? aweme2.getAuthorUid() : null).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108763b(this.f116305e.f116264b))).mo59983a("enter_method", "long_press").f79943a);
        AbstractC50382f fVar4 = this.f116306i;
        if (fVar4 instanceof DialogC69418s) {
            dialog = fVar4;
        }
        Dialog dialog2 = dialog;
        if (dialog2 != null) {
            ((ConstraintLayout) dialog2.findViewById(R.id.cyw)).setPadding(0, 0, 0, 0);
            MethodCollector.m26664o(5882);
            return;
        }
        MethodCollector.m26664o(5882);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.n$g */
    public static final class C50376g extends Animation {

        /* renamed from: a */
        final /* synthetic */ C50369n f116313a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup.MarginLayoutParams f116314b;

        /* renamed from: c */
        final /* synthetic */ int f116315c;

        /* renamed from: d */
        final /* synthetic */ int f116316d;

        static {
            Covode.recordClassIndex(59504);
        }

        /* access modifiers changed from: protected */
        public final void applyTransformation(float f, Transformation transformation) {
            ViewGroup.MarginLayoutParams marginLayoutParams = this.f116314b;
            int i = this.f116315c;
            int i2 = this.f116316d;
            marginLayoutParams.topMargin = ((int) (((float) (i - i2)) * f)) + i2;
            ViewGroup viewGroup = this.f116313a.f116302b;
            if (viewGroup != null) {
                viewGroup.setLayoutParams(this.f116314b);
            }
        }

        C50376g(C50369n nVar, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
            this.f116313a = nVar;
            this.f116314b = marginLayoutParams;
            this.f116315c = i;
            this.f116316d = i2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50369n(C50345a aVar, AbstractC50382f fVar) {
        super(aVar, fVar);
        ViewGroup viewGroup;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(fVar, "");
        this.f116305e = aVar;
        this.f116306i = fVar;
        ViewGroup viewGroup2 = null;
        if (fVar != null) {
            viewGroup = fVar.mo85550a();
        } else {
            viewGroup = null;
        }
        this.f116301a = viewGroup;
        this.f116302b = fVar != null ? fVar.mo85552b() : viewGroup2;
    }
}
