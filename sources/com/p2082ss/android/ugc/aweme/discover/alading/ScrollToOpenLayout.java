package com.p2082ss.android.ugc.aweme.discover.alading;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import androidx.core.p037h.AbstractC0781k;
import androidx.core.p037h.AbstractC0785o;
import androidx.core.p037h.C0787q;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1722h.C23163i;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout */
public final class ScrollToOpenLayout extends LinearLayout implements AbstractC0785o {

    /* renamed from: a */
    public static final C41799a f97504a = new C41799a((byte) 0);

    /* renamed from: b */
    private boolean f97505b;

    /* renamed from: c */
    private final C0787q f97506c;

    /* renamed from: d */
    private int f97507d;

    /* renamed from: e */
    private int f97508e;

    /* renamed from: f */
    private int f97509f;

    /* renamed from: g */
    private AbstractC41800b f97510g;

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout$b */
    public interface AbstractC41800b {
        static {
            Covode.recordClassIndex(49716);
        }
    }

    static {
        Covode.recordClassIndex(49714);
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: a */
    public final boolean mo2474a(View view, View view2, int i, int i2) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        return i == 1;
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        C89219l.m154721d(view, "");
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout$a */
    public static final class C41799a {
        static {
            Covode.recordClassIndex(49715);
        }

        private C41799a() {
        }

        public /* synthetic */ C41799a(byte b) {
            this();
        }
    }

    public final boolean getEnable() {
        return this.f97505b;
    }

    public final int getNestedScrollAxes() {
        return this.f97506c.mo2913a();
    }

    /* access modifiers changed from: protected */
    public final int computeHorizontalScrollRange() {
        if (!this.f97505b) {
            return super.computeHorizontalScrollRange();
        }
        int childCount = getChildCount();
        int i = 0;
        if (childCount >= 0) {
            int i2 = 0;
            while (true) {
                View childAt = getChildAt(i2);
                C89219l.m154716b(childAt, "");
                i += childAt.getWidth();
                if (i2 == childCount) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() != 2) {
            throw new IllegalArgumentException("ScrollToOpenLayout must have two child");
        } else if (getChildAt(0) instanceof AbstractC0781k) {
            View childAt = getChildAt(0);
            C89219l.m154716b(childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.width = -1;
            childAt.setLayoutParams(layoutParams);
        } else {
            throw new IllegalArgumentException("first child must be an instance of NestedScrollingChild2");
        }
    }

    /* renamed from: a */
    private final double m83753a() {
        if (!C23163i.m43664a(this)) {
            double scrollX = (double) getScrollX();
            double d = (double) this.f97507d;
            Double.isNaN(scrollX);
            Double.isNaN(d);
            return Math.max(0.05d, 1.0d - Math.pow(scrollX / d, 0.9d));
        }
        double d2 = (double) (-getScrollX());
        double d3 = (double) this.f97507d;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.max(0.05d, 1.0d - Math.pow(d2 / d3, 0.9d));
    }

    public final void setEnable(boolean z) {
        this.f97505b = z;
    }

    public final void setOnScrollToEndListener(AbstractC41800b bVar) {
        this.f97510g = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrollToOpenLayout(Context context) {
        this(context, null);
        C89219l.m154721d(context, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout$c */
    static final class C41801c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ScrollToOpenLayout f97511a;

        static {
            Covode.recordClassIndex(49717);
        }

        C41801c(ScrollToOpenLayout scrollToOpenLayout) {
            this.f97511a = scrollToOpenLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollToOpenLayout scrollToOpenLayout = this.f97511a;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            scrollToOpenLayout.scrollTo(((Integer) animatedValue).intValue(), 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout$d */
    static final class C41802d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ScrollToOpenLayout f97512a;

        static {
            Covode.recordClassIndex(49718);
        }

        C41802d(ScrollToOpenLayout scrollToOpenLayout) {
            this.f97512a = scrollToOpenLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollToOpenLayout scrollToOpenLayout = this.f97512a;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            scrollToOpenLayout.scrollTo(-((Integer) animatedValue).intValue(), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout$e */
    public static final class C41803e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ScrollToOpenLayout f97513a;

        /* renamed from: b */
        final /* synthetic */ float f97514b;

        static {
            Covode.recordClassIndex(49719);
        }

        C41803e(ScrollToOpenLayout scrollToOpenLayout, float f) {
            this.f97513a = scrollToOpenLayout;
            this.f97514b = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollToOpenLayout scrollToOpenLayout = this.f97513a;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            scrollToOpenLayout.scrollTo(((Integer) animatedValue).intValue(), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout$f */
    public static final class C41804f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ScrollToOpenLayout f97515a;

        /* renamed from: b */
        final /* synthetic */ float f97516b;

        static {
            Covode.recordClassIndex(49720);
        }

        C41804f(ScrollToOpenLayout scrollToOpenLayout, float f) {
            this.f97515a = scrollToOpenLayout;
            this.f97516b = f;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollToOpenLayout scrollToOpenLayout = this.f97515a;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            scrollToOpenLayout.scrollTo(-((Integer) animatedValue).intValue(), 0);
        }
    }

    /* renamed from: a */
    private final void m83754a(float f) {
        if (f >= 0.0f) {
            if (!C23163i.m43664a(this)) {
                double d = (double) this.f97507d;
                Double.isNaN(d);
                double d2 = (double) f;
                Double.isNaN(d2);
                ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) (d * 0.66d * d2), 0);
                ofInt.setDuration((long) (600.0f * f));
                ofInt.setInterpolator(new LinearInterpolator());
                ofInt.addUpdateListener(new C41803e(this, f));
                ofInt.start();
                return;
            }
            double d3 = (double) this.f97507d;
            Double.isNaN(d3);
            double d4 = (double) f;
            Double.isNaN(d4);
            ValueAnimator ofInt2 = ValueAnimator.ofInt(0, (int) (d3 * 0.66d * d4), 0);
            ofInt2.setDuration((long) (600.0f * f));
            ofInt2.setInterpolator(new LinearInterpolator());
            ofInt2.addUpdateListener(new C41804f(this, f));
            ofInt2.start();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrollToOpenLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154721d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(3604);
        super.onMeasure(i, i2);
        View childAt = getChildAt(1);
        C89219l.m154716b(childAt, "");
        this.f97507d = childAt.getMeasuredWidth();
        MethodCollector.m26664o(3604);
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: b */
    public final void mo2476b(View view, int i) {
        C89219l.m154721d(view, "");
        this.f97506c.mo2914a(i);
        if (i != 0) {
            return;
        }
        if (!C23163i.m43664a(this)) {
            if (getScrollX() > 0) {
                getScrollX();
                ValueAnimator ofInt = ValueAnimator.ofInt(getScrollX(), 0);
                double scrollX = (double) getScrollX();
                double d = (double) this.f97507d;
                Double.isNaN(scrollX);
                Double.isNaN(d);
                ofInt.setDuration((long) ((scrollX / d) * 200.0d));
                ofInt.addUpdateListener(new C41801c(this));
                ofInt.start();
            }
        } else if (getScrollX() < 0) {
            getScrollX();
            ValueAnimator ofInt2 = ValueAnimator.ofInt(-getScrollX(), 0);
            double d2 = (double) (-getScrollX());
            double d3 = (double) this.f97507d;
            Double.isNaN(d2);
            Double.isNaN(d3);
            ofInt2.setDuration((long) ((d2 / d3) * 200.0d));
            ofInt2.addUpdateListener(new C41802d(this));
            ofInt2.start();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ScrollToOpenLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4191);
        this.f97505b = true;
        this.f97506c = new C0787q();
        setOrientation(0);
        MethodCollector.m26664o(4191);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final boolean onNestedPreFling(View view, float f, float f2) {
        C89219l.m154721d(view, "");
        if (!this.f97505b) {
            return false;
        }
        OverScroller overScroller = new OverScroller(view.getContext());
        overScroller.fling(0, 0, (int) f, (int) f2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.f97508e = overScroller.getFinalX();
        this.f97509f = 0;
        return false;
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: b */
    public final void mo2477b(View view, View view2, int i, int i2) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        this.f97506c.mo2915a(i, i2);
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: a */
    public final void mo2472a(View view, int i, int i2, int[] iArr, int i3) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(iArr, "");
        if (!this.f97505b || i3 != 0) {
            return;
        }
        if (!C23163i.m43664a(this)) {
            if (i < 0 && getScrollX() > 0) {
                double a = m83753a();
                double d = (double) i;
                Double.isNaN(d);
                scrollBy(Math.max((int) (d * a), -getScrollX()), 0);
                iArr[0] = i;
            }
        } else if (i > 0 && getScrollX() < 0) {
            double a2 = m83753a();
            double d2 = (double) i;
            Double.isNaN(d2);
            scrollBy(Math.min((int) (d2 * a2), -getScrollX()), 0);
            iArr[0] = i;
        }
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: a */
    public final void mo2471a(View view, int i, int i2, int i3, int i4, int i5) {
        C89219l.m154721d(view, "");
        if (this.f97505b) {
            if (!C23163i.m43664a(this)) {
                if (i5 == 0) {
                    if (i3 > 0) {
                        requestDisallowInterceptTouchEvent(true);
                        double a = m83753a();
                        double d = (double) i3;
                        Double.isNaN(d);
                        scrollBy(Math.min((int) (d * a), this.f97507d - getScrollX()), 0);
                    }
                } else if (i > 0) {
                    int i6 = this.f97509f + i;
                    this.f97509f = i6;
                    if (i3 > 0) {
                        int i7 = this.f97508e - i6;
                        Context context = getContext();
                        C89219l.m154716b(context, "");
                        Resources resources = context.getResources();
                        C89219l.m154716b(resources, "");
                        float applyDimension = TypedValue.applyDimension(1, 800.0f, resources.getDisplayMetrics());
                        m83754a(Math.min((float) i7, applyDimension) / applyDimension);
                    }
                } else if (i < 0) {
                    int i8 = this.f97509f - i;
                    this.f97509f = i8;
                    if (i3 < 0) {
                        int i9 = i8 - this.f97508e;
                        Context context2 = getContext();
                        C89219l.m154716b(context2, "");
                        Resources resources2 = context2.getResources();
                        C89219l.m154716b(resources2, "");
                        float applyDimension2 = TypedValue.applyDimension(1, 800.0f, resources2.getDisplayMetrics());
                        m83754a(Math.min((float) i9, applyDimension2) / applyDimension2);
                    }
                }
            } else if (i5 == 0) {
                if (i3 < 0) {
                    requestDisallowInterceptTouchEvent(true);
                    double a2 = m83753a();
                    double d2 = (double) i3;
                    Double.isNaN(d2);
                    scrollBy(Math.max((int) (d2 * a2), (-this.f97507d) - getScrollX()), 0);
                }
            } else if (i < 0) {
                int i10 = this.f97509f - i;
                this.f97509f = i10;
                if (i3 < 0) {
                    int i11 = i10 - this.f97508e;
                    Context context3 = getContext();
                    C89219l.m154716b(context3, "");
                    Resources resources3 = context3.getResources();
                    C89219l.m154716b(resources3, "");
                    float applyDimension3 = TypedValue.applyDimension(1, 800.0f, resources3.getDisplayMetrics());
                    m83754a(Math.min((float) i11, applyDimension3) / applyDimension3);
                }
            }
        }
    }
}
