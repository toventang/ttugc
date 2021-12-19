package com.p2082ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;
import java.util.Objects;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout */
public class HeaderFrameLayout extends FrameLayout {

    /* renamed from: e */
    public static final C38798a f91613e = new C38798a((byte) 0);

    /* renamed from: a */
    public View f91614a;

    /* renamed from: b */
    public int f91615b;

    /* renamed from: c */
    public int f91616c;

    /* renamed from: d */
    public Animator f91617d;

    /* renamed from: f */
    private int f91618f = -1;

    /* renamed from: g */
    private int f91619g;

    /* renamed from: h */
    private int f91620h;

    /* renamed from: i */
    private int f91621i;

    /* renamed from: j */
    private boolean f91622j;

    /* renamed from: k */
    private boolean f91623k;

    static {
        Covode.recordClassIndex(46347);
    }

    /* access modifiers changed from: protected */
    public boolean getCanScaleContent() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean getCanScroll() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout$a */
    public static final class C38798a {
        static {
            Covode.recordClassIndex(46348);
        }

        private C38798a() {
        }

        public /* synthetic */ C38798a(byte b) {
            this();
        }
    }

    public final View getHeader() {
        return this.f91614a;
    }

    public final int getHeaderId() {
        return this.f91618f;
    }

    public final int getScrollOffset() {
        return this.f91619g;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout$b */
    public static final class RunnableC38799b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HeaderFrameLayout f91624a;

        /* renamed from: b */
        final /* synthetic */ View f91625b;

        /* renamed from: c */
        final /* synthetic */ HeaderFrameLayout f91626c;

        static {
            Covode.recordClassIndex(46349);
        }

        public RunnableC38799b(HeaderFrameLayout headerFrameLayout, View view, HeaderFrameLayout headerFrameLayout2) {
            this.f91624a = headerFrameLayout;
            this.f91625b = view;
            this.f91626c = headerFrameLayout2;
        }

        public final void run() {
            if (this.f91625b.getMeasuredHeight() <= 0) {
                HeaderFrameLayout headerFrameLayout = this.f91624a;
                headerFrameLayout.measureChild(this.f91625b, headerFrameLayout.f91615b, this.f91624a.f91616c);
            }
            final ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f91624a, "scrollOffset", this.f91626c.getScrollOffset(), this.f91625b.getMeasuredHeight());
            C89219l.m154716b(ofInt, "");
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.setDuration(250L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.p2082ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.RunnableC38799b.C388001 */

                /* renamed from: a */
                final /* synthetic */ RunnableC38799b f91627a;

                static {
                    Covode.recordClassIndex(46350);
                }

                {
                    this.f91627a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    HeaderFrameLayout headerFrameLayout = this.f91627a.f91624a;
                    C89219l.m154716b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    headerFrameLayout.setScrollOffset(((Integer) animatedValue).intValue());
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter(this) {
                /* class com.p2082ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.RunnableC38799b.C388012 */

                /* renamed from: a */
                final /* synthetic */ RunnableC38799b f91628a;

                static {
                    Covode.recordClassIndex(46351);
                }

                public final void onAnimationCancel(Animator animator) {
                    this.f91628a.f91624a.f91617d = null;
                }

                public final void onAnimationEnd(Animator animator) {
                    this.f91628a.f91624a.f91617d = null;
                }

                {
                    this.f91628a = r1;
                }

                public final void onAnimationStart(Animator animator, boolean z) {
                    Animator animator2 = this.f91628a.f91624a.f91617d;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    this.f91628a.f91624a.f91617d = ofInt;
                }
            });
            ofInt.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout$c */
    public static final class RunnableC38802c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HeaderFrameLayout f91630a;

        /* renamed from: b */
        final /* synthetic */ View f91631b;

        /* renamed from: c */
        final /* synthetic */ HeaderFrameLayout f91632c;

        static {
            Covode.recordClassIndex(46352);
        }

        public RunnableC38802c(HeaderFrameLayout headerFrameLayout, View view, HeaderFrameLayout headerFrameLayout2) {
            this.f91630a = headerFrameLayout;
            this.f91631b = view;
            this.f91632c = headerFrameLayout2;
        }

        public final void run() {
            if (this.f91631b.getMeasuredHeight() <= 0) {
                HeaderFrameLayout headerFrameLayout = this.f91630a;
                headerFrameLayout.measureChild(this.f91631b, headerFrameLayout.f91615b, this.f91630a.f91616c);
            }
            final ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f91630a, "scrollOffset", this.f91632c.getScrollOffset(), 0);
            C89219l.m154716b(ofInt, "");
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.setDuration(250L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.p2082ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.RunnableC38802c.C388031 */

                /* renamed from: a */
                final /* synthetic */ RunnableC38802c f91633a;

                static {
                    Covode.recordClassIndex(46353);
                }

                {
                    this.f91633a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    HeaderFrameLayout headerFrameLayout = this.f91633a.f91630a;
                    C89219l.m154716b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    headerFrameLayout.setScrollOffset(((Integer) animatedValue).intValue());
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter(this) {
                /* class com.p2082ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.RunnableC38802c.C388042 */

                /* renamed from: a */
                final /* synthetic */ RunnableC38802c f91634a;

                static {
                    Covode.recordClassIndex(46354);
                }

                public final void onAnimationCancel(Animator animator) {
                    this.f91634a.f91630a.f91617d = null;
                }

                public final void onAnimationEnd(Animator animator) {
                    this.f91634a.f91630a.f91617d = null;
                }

                {
                    this.f91634a = r1;
                }

                public final void onAnimationStart(Animator animator, boolean z) {
                    Animator animator2 = this.f91634a.f91630a.f91617d;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    this.f91634a.f91630a.f91617d = ofInt;
                }
            });
            ofInt.start();
        }
    }

    public final void setScrollOffset(int i) {
        if (this.f91619g != i) {
            this.f91619g = i;
            requestLayout();
        }
    }

    public void onViewRemoved(View view) {
        C89219l.m154721d(view, "");
        super.onViewRemoved(view);
        if (C89219l.m154714a(this.f91614a, view)) {
            this.f91614a = null;
        }
    }

    public final void setHeaderId(int i) {
        if (this.f91618f != i) {
            View findViewById = findViewById(i);
            if (!C89219l.m154714a(this.f91614a, findViewById)) {
                this.f91614a = findViewById;
                requestLayout();
            }
            this.f91618f = i;
        }
    }

    public void onViewAdded(View view) {
        C89219l.m154721d(view, "");
        super.onViewAdded(view);
        if (this.f91618f != -1 && view.getId() == this.f91618f) {
            if (this.f91614a == null) {
                this.f91614a = view;
                return;
            }
            throw new RuntimeException("dup header");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(7694);
        this.f91615b = i;
        this.f91616c = i2;
        super.onMeasure(i, i2);
        MethodCollector.m26664o(7694);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7828);
        MethodCollector.m26664o(7828);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int paddingLeft = i + getPaddingLeft();
        int paddingTop = i2 + getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int paddingBottom = i4 - getPaddingBottom();
        Iterator it = C89271h.m154766a(0, getChildCount()).iterator();
        while (it.hasNext()) {
            View childAt = getChildAt(((AbstractC89040af) it).mo143429a());
            C89219l.m154716b(childAt, "");
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (layoutParams2.gravity == -1) {
                    i5 = 8388659;
                } else {
                    i5 = layoutParams2.gravity;
                }
                int i13 = Build.VERSION.SDK_INT;
                int absoluteGravity = Gravity.getAbsoluteGravity(i5, getLayoutDirection());
                int i14 = absoluteGravity & 7;
                int i15 = absoluteGravity & 112;
                if (i14 == 1) {
                    i6 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams2.leftMargin;
                    i7 = layoutParams2.rightMargin;
                    i8 = i6 - i7;
                } else if (i14 != 5) {
                    i8 = paddingLeft;
                } else {
                    i6 = paddingRight - measuredWidth;
                    i7 = layoutParams2.rightMargin;
                    i8 = i6 - i7;
                }
                if (i15 == 16) {
                    i9 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams2.topMargin;
                    i10 = layoutParams2.bottomMargin;
                    i11 = i9 - i10;
                } else if (i15 != 80) {
                    i11 = layoutParams2.topMargin + paddingTop;
                } else {
                    i9 = paddingBottom - measuredHeight;
                    i10 = layoutParams2.bottomMargin;
                    i11 = i9 - i10;
                }
                int i16 = measuredWidth + i8;
                int i17 = measuredHeight + i11;
                C89219l.m154721d(childAt, "");
                if (C89219l.m154714a(childAt, this.f91614a)) {
                    i12 = this.f91619g - childAt.getMeasuredHeight();
                    i11 += i12;
                } else {
                    if (this.f91614a != null) {
                        i11 += this.f91619g;
                        if (!getCanScaleContent()) {
                            i12 = this.f91619g;
                        }
                    }
                    childAt.layout(i8, i11, i16, i17);
                }
                i17 += i12;
                childAt.layout(i8, i11, i16, i17);
            }
        }
    }
}
