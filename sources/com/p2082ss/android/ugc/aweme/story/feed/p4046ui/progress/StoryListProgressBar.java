package com.p2082ss.android.ugc.aweme.story.feed.p4046ui.progress;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.feed.ui.progress.StoryListProgressBar */
public final class StoryListProgressBar extends LinearLayout {

    /* renamed from: a */
    public static final C77246a f173274a = new C77246a((byte) 0);

    /* renamed from: b */
    private final Context f173275b;

    /* renamed from: c */
    private int f173276c;

    /* renamed from: d */
    private float f173277d;

    /* renamed from: e */
    private float f173278e;

    /* renamed from: f */
    private C77258a f173279f;

    /* renamed from: g */
    private boolean f173280g;

    /* renamed from: h */
    private int f173281h;

    /* renamed from: i */
    private int f173282i;

    /* renamed from: j */
    private AbstractC89172b<? super Boolean, C89391z> f173283j;

    static {
        Covode.recordClassIndex(90261);
    }

    public StoryListProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.ui.progress.StoryListProgressBar$a */
    public static final class C77246a {
        static {
            Covode.recordClassIndex(90262);
        }

        private C77246a() {
        }

        public /* synthetic */ C77246a(byte b) {
            this();
        }
    }

    public final int getCurrentPosition() {
        return this.f173276c;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Boolean, h.z>, h.f.a.b<java.lang.Boolean, h.z> */
    public final AbstractC89172b<Boolean, C89391z> getOnProgressBarSelected() {
        return this.f173283j;
    }

    /* renamed from: a */
    private boolean m135018a() {
        if (getOrientation() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m135019b() {
        this.f173276c = 0;
        this.f173281h = 0;
        this.f173282i = 0;
        this.f173278e = this.f173277d;
        m135022d(0);
        removeAllViews();
    }

    public final void setOnProgressBarSelected(AbstractC89172b<? super Boolean, C89391z> bVar) {
        this.f173283j = bVar;
    }

    public final void setProgressBarConfig(C77258a aVar) {
        this.f173279f = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.ui.progress.StoryListProgressBar$j */
    public static final class C77255j implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ StoryListProgressBar f173304a;

        /* renamed from: b */
        final /* synthetic */ int f173305b;

        /* renamed from: c */
        final /* synthetic */ int f173306c;

        static {
            Covode.recordClassIndex(90271);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationCancel(Animator animator) {
            int i = this.f173306c - 1;
            int i2 = this.f173305b;
            if (i >= i2) {
                while (true) {
                    View childAt = this.f173304a.getChildAt(i);
                    if (childAt != null) {
                        this.f173304a.removeView(childAt);
                    }
                    if (i != i2) {
                        i--;
                    } else {
                        return;
                    }
                }
            }
        }

        public final void onAnimationEnd(Animator animator) {
            int i = this.f173306c - 1;
            int i2 = this.f173305b;
            if (i >= i2) {
                while (true) {
                    View childAt = this.f173304a.getChildAt(i);
                    if (childAt != null) {
                        this.f173304a.removeView(childAt);
                    }
                    if (i != i2) {
                        i--;
                    } else {
                        return;
                    }
                }
            }
        }

        C77255j(StoryListProgressBar storyListProgressBar, int i, int i2) {
            this.f173304a = storyListProgressBar;
            this.f173305b = i;
            this.f173306c = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.feed.ui.progress.StoryListProgressBar$b */
    public static final class C77247b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ StoryListProgressBar f173284a;

        /* renamed from: b */
        final /* synthetic */ int f173285b;

        static {
            Covode.recordClassIndex(90263);
        }

        C77247b(StoryListProgressBar storyListProgressBar, int i) {
            this.f173284a = storyListProgressBar;
            this.f173285b = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i = this.f173285b;
            for (int i2 = 0; i2 < i; i2++) {
                View childAt = this.f173284a.getChildAt(i2);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = (int) floatValue;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.feed.ui.progress.StoryListProgressBar$c */
    public static final class C77248c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ StoryListProgressBar f173286a;

        /* renamed from: b */
        final /* synthetic */ int f173287b;

        /* renamed from: c */
        final /* synthetic */ int f173288c;

        static {
            Covode.recordClassIndex(90264);
        }

        C77248c(StoryListProgressBar storyListProgressBar, int i, int i2) {
            this.f173286a = storyListProgressBar;
            this.f173287b = i;
            this.f173288c = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i = this.f173288c;
            for (int i2 = this.f173287b; i2 < i; i2++) {
                View childAt = this.f173286a.getChildAt(i2);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = (int) floatValue;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.feed.ui.progress.StoryListProgressBar$d */
    public static final class C77249d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ StoryListProgressBar f173289a;

        /* renamed from: b */
        final /* synthetic */ int f173290b;

        static {
            Covode.recordClassIndex(90265);
        }

        C77249d(StoryListProgressBar storyListProgressBar, int i) {
            this.f173289a = storyListProgressBar;
            this.f173290b = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i = this.f173290b;
            for (int i2 = 0; i2 < i; i2++) {
                View childAt = this.f173289a.getChildAt(i2);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.height = (int) floatValue;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.feed.ui.progress.StoryListProgressBar$e */
    public static final class C77250e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ StoryListProgressBar f173291a;

        /* renamed from: b */
        final /* synthetic */ int f173292b;

        /* renamed from: c */
        final /* synthetic */ int f173293c;

        static {
            Covode.recordClassIndex(90266);
        }

        C77250e(StoryListProgressBar storyListProgressBar, int i, int i2) {
            this.f173291a = storyListProgressBar;
            this.f173292b = i;
            this.f173293c = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i = this.f173293c;
            for (int i2 = this.f173292b; i2 < i; i2++) {
                View childAt = this.f173291a.getChildAt(i2);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.height = (int) floatValue;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.feed.ui.progress.StoryListProgressBar$f */
    public static final class C77251f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ StoryListProgressBar f173294a;

        /* renamed from: b */
        final /* synthetic */ int f173295b;

        static {
            Covode.recordClassIndex(90267);
        }

        C77251f(StoryListProgressBar storyListProgressBar, int i) {
            this.f173294a = storyListProgressBar;
            this.f173295b = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i = this.f173295b;
            for (int i2 = 0; i2 < i; i2++) {
                View childAt = this.f173294a.getChildAt(i2);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = (int) floatValue;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.feed.ui.progress.StoryListProgressBar$g */
    public static final class C77252g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ StoryListProgressBar f173296a;

        /* renamed from: b */
        final /* synthetic */ int f173297b;

        /* renamed from: c */
        final /* synthetic */ int f173298c;

        static {
            Covode.recordClassIndex(90268);
        }

        C77252g(StoryListProgressBar storyListProgressBar, int i, int i2) {
            this.f173296a = storyListProgressBar;
            this.f173297b = i;
            this.f173298c = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i = this.f173298c;
            for (int i2 = this.f173297b; i2 < i; i2++) {
                View childAt = this.f173296a.getChildAt(i2);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.width = (int) floatValue;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.feed.ui.progress.StoryListProgressBar$h */
    public static final class C77253h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ StoryListProgressBar f173299a;

        /* renamed from: b */
        final /* synthetic */ int f173300b;

        static {
            Covode.recordClassIndex(90269);
        }

        C77253h(StoryListProgressBar storyListProgressBar, int i) {
            this.f173299a = storyListProgressBar;
            this.f173300b = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i = this.f173300b;
            for (int i2 = 0; i2 < i; i2++) {
                View childAt = this.f173299a.getChildAt(i2);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.height = (int) floatValue;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.feed.ui.progress.StoryListProgressBar$i */
    public static final class C77254i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ StoryListProgressBar f173301a;

        /* renamed from: b */
        final /* synthetic */ int f173302b;

        /* renamed from: c */
        final /* synthetic */ int f173303c;

        static {
            Covode.recordClassIndex(90270);
        }

        C77254i(StoryListProgressBar storyListProgressBar, int i, int i2) {
            this.f173301a = storyListProgressBar;
            this.f173302b = i;
            this.f173303c = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i = this.f173303c;
            for (int i2 = this.f173302b; i2 < i; i2++) {
                View childAt = this.f173301a.getChildAt(i2);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    layoutParams.height = (int) floatValue;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* renamed from: d */
    private void m135022d(int i) {
        float f;
        float f2;
        int childCount = getChildCount();
        if (i > this.f173276c) {
            for (int i2 = 0; i2 < i; i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof StoryProgressBar) {
                    if (i2 < i) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    ((StoryProgressBar) childAt).mo120862a(f2, false);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            if (childAt2 instanceof StoryProgressBar) {
                if (i3 >= i) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                ((StoryProgressBar) childAt2).mo120862a(f, false);
            }
        }
    }

    /* renamed from: a */
    public final void mo120843a(int i) {
        int childCount = getChildCount();
        if (childCount != i) {
            if (childCount <= 0 || this.f173280g) {
                m135019b();
                m135023e(i);
                for (int i2 = 0; i2 < i; i2++) {
                    addView(m135016a(i2, i));
                }
            } else if (childCount < i) {
                m135020b(i);
            } else {
                m135021c(i);
            }
        }
    }

    /* renamed from: e */
    private final void m135023e(int i) {
        if (i > 0) {
            this.f173278e = this.f173277d;
            if (m135018a()) {
                int measuredWidth = getMeasuredWidth();
                if (measuredWidth > 0) {
                    this.f173282i = getMeasuredHeight();
                    float f = this.f173278e;
                    int i2 = (int) ((((float) measuredWidth) - (((float) (i - 1)) * f)) / ((float) i));
                    this.f173281h = i2;
                    if (((float) i2) < f) {
                        int i3 = (measuredWidth / ((i * 2) - 1)) + 1;
                        this.f173281h = i3;
                        this.f173278e = (float) i3;
                        return;
                    }
                    return;
                }
                return;
            }
            int measuredHeight = getMeasuredHeight();
            if (measuredHeight > 0) {
                this.f173281h = getMeasuredWidth();
                float f2 = this.f173278e;
                int i4 = (int) ((((float) measuredHeight) - (((float) (i - 1)) * f2)) / ((float) i));
                this.f173282i = i4;
                if (((float) i4) < f2) {
                    int i5 = (measuredHeight / ((i * 2) - 1)) + 1;
                    this.f173282i = i5;
                    this.f173278e = (float) i5;
                }
            }
        }
    }

    /* renamed from: b */
    private final void m135020b(int i) {
        View childAt;
        ValueAnimator ofFloat;
        ValueAnimator ofFloat2;
        int childCount = getChildCount();
        if (i > childCount && (childAt = getChildAt(childCount - 1)) != null) {
            for (int i2 = childCount; i2 < i; i2++) {
                addView(m135016a(i2, i));
            }
            m135023e(i);
            if (m135018a()) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.rightMargin = (int) this.f173278e;
                int i3 = Build.VERSION.SDK_INT;
                layoutParams2.setMarginEnd((int) this.f173278e);
                childAt.setLayoutParams(layoutParams2);
                float measuredWidth = (float) childAt.getMeasuredWidth();
                float f = (float) this.f173281h;
                ofFloat = ObjectAnimator.ofFloat(measuredWidth, f);
                C89219l.m154716b(ofFloat, "");
                ofFloat.addUpdateListener(new C77247b(this, childCount));
                ofFloat2 = ObjectAnimator.ofFloat(0.0f, f);
                C89219l.m154716b(ofFloat2, "");
                ofFloat2.addUpdateListener(new C77248c(this, childCount, i));
            } else {
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.bottomMargin = (int) this.f173278e;
                childAt.setLayoutParams(layoutParams4);
                float measuredHeight = (float) childAt.getMeasuredHeight();
                float f2 = (float) this.f173282i;
                ofFloat = ObjectAnimator.ofFloat(measuredHeight, f2);
                C89219l.m154716b(ofFloat, "");
                ofFloat.addUpdateListener(new C77249d(this, childCount));
                ofFloat2 = ObjectAnimator.ofFloat(0.0f, f2);
                C89219l.m154716b(ofFloat2, "");
                ofFloat2.addUpdateListener(new C77250e(this, childCount, i));
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.start();
        }
    }

    /* renamed from: c */
    private final void m135021c(int i) {
        View childAt;
        ValueAnimator ofFloat;
        ValueAnimator ofFloat2;
        int childCount = getChildCount();
        if (i < childCount && (childAt = getChildAt(i - 1)) != null) {
            m135023e(i);
            if (m135018a()) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.rightMargin = 0;
                int i2 = Build.VERSION.SDK_INT;
                layoutParams2.setMarginEnd(0);
                childAt.setLayoutParams(layoutParams2);
                float measuredWidth = (float) childAt.getMeasuredWidth();
                ofFloat = ObjectAnimator.ofFloat(measuredWidth, (float) this.f173281h);
                C89219l.m154716b(ofFloat, "");
                ofFloat.addUpdateListener(new C77251f(this, i));
                ofFloat2 = ObjectAnimator.ofFloat(measuredWidth, 0.0f);
                C89219l.m154716b(ofFloat2, "");
                ofFloat2.addUpdateListener(new C77252g(this, i, childCount));
            } else {
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.bottomMargin = 0;
                childAt.setLayoutParams(layoutParams4);
                float measuredHeight = (float) childAt.getMeasuredHeight();
                float f = (float) this.f173282i;
                ofFloat = ObjectAnimator.ofFloat(measuredHeight, f);
                C89219l.m154716b(ofFloat, "");
                ofFloat.addUpdateListener(new C77253h(this, i));
                ofFloat2 = ObjectAnimator.ofFloat(f, 0.0f);
                C89219l.m154716b(ofFloat2, "");
                ofFloat2.addUpdateListener(new C77254i(this, i, childCount));
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat2).with(ofFloat);
            animatorSet.addListener(new C77255j(this, i, childCount));
            animatorSet.start();
        }
    }

    /* renamed from: a */
    private final StoryProgressBar m135016a(int i, int i2) {
        LinearLayout.LayoutParams layoutParams;
        Context context = this.f173275b;
        C89219l.m154716b(context, "");
        StoryProgressBar storyProgressBar = new StoryProgressBar(context, (byte) 0);
        if (m135018a()) {
            layoutParams = new LinearLayout.LayoutParams(-2, -1);
            layoutParams.width = this.f173281h;
            if (i < i2 - 1) {
                layoutParams.rightMargin = (int) this.f173278e;
                int i3 = Build.VERSION.SDK_INT;
                layoutParams.setMarginEnd((int) this.f173278e);
            }
        } else {
            storyProgressBar.setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.height = this.f173282i;
            layoutParams.width = this.f173281h;
            if (i < i2 - 1) {
                layoutParams.bottomMargin = (int) this.f173278e;
            }
        }
        storyProgressBar.setLayoutParams(layoutParams);
        C77258a aVar = this.f173279f;
        if (aVar != null) {
            storyProgressBar.setProgressBarConfig(aVar);
        }
        return storyProgressBar;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(3818);
        super.onMeasure(i, i2);
        if (this.f173280g) {
            int childCount = getChildCount();
            m135023e(childCount);
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != null) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.height = this.f173282i;
                        layoutParams2.width = this.f173281h;
                        if (i3 < childCount - 1) {
                            if (m135018a()) {
                                layoutParams2.rightMargin = (int) this.f173278e;
                                int i4 = Build.VERSION.SDK_INT;
                                layoutParams2.setMarginEnd((int) this.f173278e);
                            } else {
                                layoutParams2.bottomMargin = (int) this.f173278e;
                            }
                        }
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        MethodCollector.m26664o(3818);
                        throw nullPointerException;
                    }
                }
            }
            this.f173280g = false;
        }
        MethodCollector.m26664o(3818);
    }

    private /* synthetic */ StoryListProgressBar(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StoryListProgressBar(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(3859);
        this.f173275b = getContext();
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        float applyDimension = TypedValue.applyDimension(1, 3.0f, system.getDisplayMetrics());
        this.f173277d = applyDimension;
        this.f173278e = applyDimension;
        this.f173280g = true;
        MethodCollector.m26664o(3859);
    }

    /* renamed from: a */
    public final void mo120844a(int i, float f, long j) {
        if (this.f173276c != i) {
            m135022d(i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof StoryProgressBar) {
                    ((StoryProgressBar) childAt).mo120862a(1.0f, false);
                }
            }
            int childCount = getChildCount();
            for (int i3 = i + 1; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2 instanceof StoryProgressBar) {
                    ((StoryProgressBar) childAt2).mo120862a(0.0f, false);
                }
            }
            int childCount2 = getChildCount();
            if (i >= 0 && childCount2 > i) {
                View childAt3 = getChildAt(i);
                if (childAt3 instanceof StoryProgressBar) {
                    StoryProgressBar storyProgressBar = (StoryProgressBar) childAt3;
                    storyProgressBar.setAnimationInterval(j);
                    storyProgressBar.mo120862a(f, true);
                }
            }
        }
        this.f173276c = i;
    }
}
