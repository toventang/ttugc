package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.Scroller;
import androidx.core.content.C0643b;
import androidx.core.p037h.AbstractC0780j;
import androidx.core.p037h.AbstractC0784n;
import androidx.core.p037h.C0783m;
import androidx.core.p037h.C0787q;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DoubleColorBallAnimationView;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.AbstractC34638b;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.AbstractC34644d;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;

/* renamed from: com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout */
public class DoubleBallSwipeRefreshLayout extends ViewGroup implements AbstractC0780j, AbstractC0784n, AbstractC34638b {

    /* renamed from: H */
    private static final int[] f181808H = {16842766};

    /* renamed from: p */
    private static final String f181809p = DoubleBallSwipeRefreshLayout.class.getSimpleName();

    /* renamed from: A */
    private int f181810A;

    /* renamed from: B */
    private float f181811B;

    /* renamed from: C */
    private float f181812C;

    /* renamed from: D */
    private boolean f181813D;

    /* renamed from: E */
    private int f181814E = -1;

    /* renamed from: F */
    private boolean f181815F;

    /* renamed from: G */
    private final DecelerateInterpolator f181816G;

    /* renamed from: I */
    private Animation f181817I;

    /* renamed from: J */
    private Animation f181818J;

    /* renamed from: K */
    private Animation f181819K;

    /* renamed from: L */
    private Animation f181820L;

    /* renamed from: M */
    private int f181821M;

    /* renamed from: N */
    private int f181822N;

    /* renamed from: O */
    private int f181823O;

    /* renamed from: P */
    private AbstractC81403a f181824P;

    /* renamed from: Q */
    private SwipeRefreshLayout.AbstractC34635c f181825Q;

    /* renamed from: R */
    private Animation.AnimationListener f181826R = new Animation.AnimationListener() {
        /* class com.p2082ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.animationAnimation$AnimationListenerC813941 */

        static {
            Covode.recordClassIndex(94742);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        public final void onAnimationEnd(Animation animation) {
            if (DoubleBallSwipeRefreshLayout.this.f181830b) {
                DoubleBallSwipeRefreshLayout.this.f181843o.mo61201b();
                DoubleBallSwipeRefreshLayout.this.f181839k.setAlpha(255);
                if (DoubleBallSwipeRefreshLayout.this.f181841m && DoubleBallSwipeRefreshLayout.this.f181829a != null) {
                    DoubleBallSwipeRefreshLayout.this.f181829a.mo59551a();
                    return;
                }
                return;
            }
            DoubleBallSwipeRefreshLayout.this.mo124944b();
        }
    };

    /* renamed from: S */
    private final Animation f181827S = new Animation() {
        /* class com.p2082ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.C813996 */

        static {
            Covode.recordClassIndex(94747);
        }

        public final void applyTransformation(float f, Transformation transformation) {
            if (!DoubleBallSwipeRefreshLayout.this.f181842n) {
                Math.abs(DoubleBallSwipeRefreshLayout.this.f181837i);
            }
            DoubleBallSwipeRefreshLayout.this.f181839k.mo125144a(1.0f - f);
        }
    };

    /* renamed from: T */
    private final Animation f181828T = new Animation() {
        /* class com.p2082ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.C814007 */

        static {
            Covode.recordClassIndex(94748);
        }

        public final void applyTransformation(float f, Transformation transformation) {
        }
    };

    /* renamed from: a */
    SwipeRefreshLayout.AbstractC34634b f181829a;

    /* renamed from: b */
    public boolean f181830b;

    /* renamed from: c */
    public float f181831c = -1.0f;

    /* renamed from: d */
    int f181832d;

    /* renamed from: e */
    boolean f181833e;

    /* renamed from: f */
    DoubleColorBallAnimationView f181834f;

    /* renamed from: g */
    protected int f181835g;

    /* renamed from: h */
    float f181836h;

    /* renamed from: i */
    protected int f181837i;

    /* renamed from: j */
    int f181838j;

    /* renamed from: k */
    C81454n f181839k;

    /* renamed from: l */
    Animation f181840l;

    /* renamed from: m */
    boolean f181841m;

    /* renamed from: n */
    boolean f181842n;

    /* renamed from: o */
    AbstractC34644d f181843o = new AbstractC34644d() {
        /* class com.p2082ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.C814029 */

        static {
            Covode.recordClassIndex(94750);
        }
    };

    /* renamed from: q */
    private View f181844q;

    /* renamed from: r */
    private int f181845r;

    /* renamed from: s */
    private boolean f181846s;

    /* renamed from: t */
    private Scroller f181847t;

    /* renamed from: u */
    private float f181848u;

    /* renamed from: v */
    private final C0787q f181849v;

    /* renamed from: w */
    private final C0783m f181850w;

    /* renamed from: x */
    private final int[] f181851x = new int[2];

    /* renamed from: y */
    private final int[] f181852y = new int[2];

    /* renamed from: z */
    private boolean f181853z;

    /* renamed from: com.ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout$a */
    public interface AbstractC81403a {
        static {
            Covode.recordClassIndex(94751);
        }

        /* renamed from: a */
        boolean mo124989a();
    }

    public void setColorScheme(int... iArr) {
    }

    @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.AbstractC34638b
    /* renamed from: a */
    public final boolean mo61107a() {
        return this.f181830b;
    }

    public int getProgressCircleDiameter() {
        return this.f181821M;
    }

    public int getProgressViewEndOffset() {
        return this.f181838j;
    }

    public int getProgressViewStartOffset() {
        return this.f181837i;
    }

    /* renamed from: c */
    private static boolean m141097c() {
        int i = Build.VERSION.SDK_INT;
        return false;
    }

    /* renamed from: h */
    private void m141102h() {
        int i = Build.VERSION.SDK_INT;
    }

    public int getNestedScrollAxes() {
        return this.f181849v.mo2913a();
    }

    public boolean hasNestedScrollingParent() {
        return this.f181850w.mo2905a(0);
    }

    @Override // androidx.core.p037h.AbstractC0780j
    public boolean isNestedScrollingEnabled() {
        return this.f181850w.f2940a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo124944b();
    }

    @Override // androidx.core.p037h.AbstractC0780j
    public void stopNestedScroll() {
        this.f181850w.mo2910b(0);
    }

    /* renamed from: d */
    private void m141098d() {
        this.f181818J = m141087a(this.f181839k.getAlpha(), 76);
    }

    /* renamed from: e */
    private void m141099e() {
        this.f181819K = m141087a(this.f181839k.getAlpha(), 255);
    }

    static {
        Covode.recordClassIndex(94741);
    }

    /* renamed from: f */
    private void m141100f() {
        if (this.f181844q == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f181834f)) {
                    this.f181844q = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private boolean m141101g() {
        AbstractC81403a aVar = this.f181824P;
        if (aVar != null) {
            return aVar.mo124989a();
        }
        int i = Build.VERSION.SDK_INT;
        return this.f181844q.canScrollVertically(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo124944b() {
        this.f181843o.mo61198a();
        this.f181839k.stop();
        setColorViewAlpha(255);
        if (this.f181833e) {
            setAnimationProgress(0.0f);
        } else {
            m141102h();
        }
    }

    public void computeScroll() {
        if (this.f181847t.computeScrollOffset()) {
            scrollTo(this.f181847t.getCurrX(), this.f181847t.getCurrY());
            invalidate();
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f181831c = (float) i;
    }

    public void setDoNotCatchException(boolean z) {
        this.f181846s = z;
    }

    public void setOnChildScrollUpCallback(AbstractC81403a aVar) {
        this.f181824P = aVar;
    }

    public void setOnRefreshListener(SwipeRefreshLayout.AbstractC34634b bVar) {
        this.f181829a = bVar;
    }

    public void setOnSwipeChangeListener(SwipeRefreshLayout.AbstractC34635c cVar) {
        this.f181825Q = cVar;
    }

    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    private void setColorViewAlpha(int i) {
        this.f181839k.setAlpha(i);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f181850w.mo2902a(z);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f181839k.mo125148b(i);
    }

    public boolean startNestedScroll(int i) {
        return this.f181850w.mo2906a(i, 0);
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f) {
        if (m141097c()) {
            setColorViewAlpha((int) (f * 255.0f));
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo124944b();
        }
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0643b.m2378c(getContext(), i));
    }

    /* renamed from: c */
    private void m141095c(float f) {
        float f2 = this.f181812C;
        int i = this.f181845r;
        if (f - f2 > ((float) i) && !this.f181813D) {
            this.f181811B = f2 + ((float) i);
            this.f181813D = true;
            this.f181839k.setAlpha(76);
        }
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onStopNestedScroll(View view) {
        this.f181849v.mo2914a(0);
        this.f181853z = false;
        float f = this.f181848u;
        if (f > 0.0f) {
            m141093b(f);
            this.f181848u = 0.0f;
        }
        stopNestedScroll();
    }

    public void setColorSchemeColors(int... iArr) {
        m141100f();
        C81454n nVar = this.f181839k;
        nVar.f182067b.mo125172a(iArr);
        nVar.f182067b.mo125170a(0);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0643b.m2378c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    /* renamed from: a */
    private void m141090a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f181814E) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f181814E = motionEvent.getPointerId(i);
        }
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f181821M = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f181821M = (int) (displayMetrics.density * 40.0f);
            }
            this.f181839k.mo125145a(i);
        }
    }

    /* renamed from: a */
    private static int m141086a(Resources resources) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(17694721);
        if (matchConfig == null) {
            return resources.getInteger(17694721);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(17694721);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i = 0; i < min; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(17694721);
        }
    }

    /* renamed from: b */
    private void m141093b(float f) {
        if (f > this.f181831c) {
            m141091a(true, true);
            return;
        }
        this.f181830b = false;
        this.f181839k.mo125147b(0.0f);
        animationAnimation$AnimationListenerC813985 r2 = null;
        if (!this.f181833e) {
            r2 = new Animation.AnimationListener() {
                /* class com.p2082ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.animationAnimation$AnimationListenerC813985 */

                static {
                    Covode.recordClassIndex(94746);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (!DoubleBallSwipeRefreshLayout.this.f181833e) {
                        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = DoubleBallSwipeRefreshLayout.this;
                        doubleBallSwipeRefreshLayout.f181840l = new Animation() {
                            /* class com.p2082ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.C813963 */

                            static {
                                Covode.recordClassIndex(94744);
                            }

                            public final void applyTransformation(float f, Transformation transformation) {
                                DoubleBallSwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
                            }
                        };
                        doubleBallSwipeRefreshLayout.f181840l.setDuration(150);
                    }
                }
            };
        }
        m141094b(this.f181832d, this.f181843o.mo61197a(r2));
        this.f181839k.mo125146a(false);
        if (this.f181825Q == null) {
            this.f181847t.startScroll(0, getScrollY(), 0, -getScrollY(), Math.abs(getScrollY() * 2));
            invalidate();
            this.f181834f.mo27420b();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        m141100f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f181815F && actionMasked == 0) {
            this.f181815F = false;
        }
        if (!isEnabled() || this.f181815F || m141101g() || this.f181830b || this.f181853z) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f181814E;
                    if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                        return false;
                    }
                    m141095c(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m141090a(motionEvent);
                    }
                }
            }
            this.f181813D = false;
            this.f181814E = -1;
        } else {
            int pointerId = motionEvent.getPointerId(0);
            this.f181814E = pointerId;
            this.f181813D = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f181812C = motionEvent.getY(findPointerIndex2);
        }
        return this.f181813D;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.AbstractC34638b
    public void setRefreshing(boolean z) {
        if (!z || this.f181830b == z) {
            m141091a(z, false);
            return;
        }
        this.f181830b = z;
        m141102h();
        this.f181841m = false;
        if (this.f181825Q == null) {
            Animation.AnimationListener animationListener = this.f181826R;
            int i = Build.VERSION.SDK_INT;
            this.f181839k.setAlpha(255);
            C813952 r2 = new Animation() {
                /* class com.p2082ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.C813952 */

                static {
                    Covode.recordClassIndex(94743);
                }

                public final void applyTransformation(float f, Transformation transformation) {
                    DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = DoubleBallSwipeRefreshLayout.this;
                    doubleBallSwipeRefreshLayout.scrollTo(0, (int) (doubleBallSwipeRefreshLayout.f181831c * f));
                }
            };
            this.f181817I = r2;
            r2.setDuration((long) this.f181810A);
            if (animationListener != null) {
                animationListener.onAnimationEnd(this.f181817I);
            }
            this.f181834f.mo27419a();
            mo106902a(this.f181847t, getScrollY(), (int) (-this.f181831c));
        }
    }

    /* renamed from: a */
    private void m141088a(float f) {
        int i;
        this.f181839k.mo125146a(true);
        float f2 = f / this.f181831c;
        double min = (double) Math.min(1.0f, Math.abs(f2));
        Double.isNaN(min);
        float max = (Math.max((float) (min - 0.4d), 0.0f) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f181831c;
        if (this.f181842n) {
            i = this.f181838j - this.f181837i;
        } else {
            i = this.f181838j;
        }
        float f3 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f4 = ((float) (max2 - pow)) * 2.0f;
        if (this.f181833e) {
            setAnimationProgress(Math.min(1.0f, f / this.f181831c));
        }
        if (f < this.f181831c) {
            if (this.f181839k.getAlpha() > 76 && !m141092a(this.f181818J)) {
                m141098d();
            }
        } else if (this.f181839k.getAlpha() < 255 && !m141092a(this.f181819K)) {
            m141099e();
        }
        if (this.f181825Q == null) {
            float atan = (float) Math.atan((double) f2);
            scrollTo(0, (int) ((-this.f181831c) * atan));
            this.f181834f.setProgress(Math.max(0.0f, Math.min(1.0f, atan - 0.5f)));
        } else {
            Math.min(f, this.f181831c);
            Math.min(f2, 1.0f);
        }
        this.f181839k.mo125147b(Math.min(0.8f, max * 0.8f));
        this.f181839k.mo125144a(Math.min(1.0f, max));
        this.f181839k.mo125149c((((max * 0.4f) - 16.0f) + (f4 * 2.0f)) * 0.5f);
        m141102h();
        this.f181843o.mo61203c();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f181815F && actionMasked == 0) {
            this.f181815F = false;
        }
        if (!isEnabled() || this.f181815F || m141101g() || this.f181830b || this.f181853z) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f181814E);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    float y = motionEvent.getY(findPointerIndex);
                    m141095c(y);
                    if (this.f181813D) {
                        float f = (y - this.f181811B) * 0.5f;
                        if (f > 0.0f) {
                            m141088a(f);
                        } else {
                            m141088a(0.0f);
                            return false;
                        }
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            return false;
                        }
                        this.f181814E = motionEvent.getPointerId(actionIndex);
                    } else if (actionMasked == 6) {
                        m141090a(motionEvent);
                    }
                }
            }
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f181814E);
            if (findPointerIndex2 < 0) {
                return false;
            }
            if (this.f181813D) {
                this.f181813D = false;
                m141093b((motionEvent.getY(findPointerIndex2) - this.f181811B) * 0.5f);
            }
            this.f181814E = -1;
            return false;
        }
        this.f181814E = motionEvent.getPointerId(0);
        this.f181813D = false;
        return true;
    }

    /* renamed from: a */
    private static boolean m141092a(Animation animation) {
        if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        }
        return true;
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f181850w.mo2903a(f, f2);
    }

    /* renamed from: a */
    private Animation m141087a(final int i, final int i2) {
        if (this.f181833e && m141097c()) {
            return null;
        }
        C813974 r2 = new Animation() {
            /* class com.p2082ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.C813974 */

            static {
                Covode.recordClassIndex(94745);
            }

            public final void applyTransformation(float f, Transformation transformation) {
                C81454n nVar = DoubleBallSwipeRefreshLayout.this.f181839k;
                int i = i;
                nVar.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        r2.setDuration(300);
        return r2;
    }

    /* renamed from: b */
    private void m141094b(int i, Animation.AnimationListener animationListener) {
        this.f181843o.mo61202b(i, animationListener);
        if (this.f181833e) {
            m141096c(i, animationListener);
            return;
        }
        this.f181835g = i;
        this.f181828T.reset();
        this.f181828T.setDuration(200);
        this.f181828T.setInterpolator(this.f181816G);
        if (animationListener != null) {
            animationListener.onAnimationEnd(this.f181827S);
        }
    }

    /* renamed from: c */
    private void m141096c(int i, Animation.AnimationListener animationListener) {
        this.f181835g = i;
        if (m141097c()) {
            this.f181836h = (float) this.f181839k.getAlpha();
        }
        C814018 r2 = new Animation() {
            /* class com.p2082ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout.C814018 */

            static {
                Covode.recordClassIndex(94749);
            }

            public final void applyTransformation(float f, Transformation transformation) {
                DoubleBallSwipeRefreshLayout.this.setAnimationProgress(DoubleBallSwipeRefreshLayout.this.f181836h + ((-DoubleBallSwipeRefreshLayout.this.f181836h) * f));
            }
        };
        this.f181820L = r2;
        r2.setDuration(150);
        if (animationListener != null) {
            animationListener.onAnimationEnd(this.f181820L);
        }
    }

    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(12387);
        super.onMeasure(i, i2);
        if (this.f181844q == null) {
            m141100f();
        }
        View view = this.f181844q;
        if (view == null) {
            MethodCollector.m26664o(12387);
            return;
        }
        try {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        } catch (IllegalStateException e) {
            C51423a.m95788a("", e);
            C13468b.m24211a(e, "DoubleBallSwipeRefreshLayout");
            if (this.f181846s) {
                MethodCollector.m26664o(12387);
                throw e;
            }
        }
        this.f181834f.measure(View.MeasureSpec.makeMeasureSpec(this.f181823O, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f181823O, 1073741824));
        MethodCollector.m26664o(12387);
    }

    public DoubleBallSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(12270);
        this.f181845r = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f181847t = new Scroller(context, new AccelerateDecelerateInterpolator());
        this.f181810A = m141086a(getResources());
        setWillNotDraw(false);
        this.f181816G = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f181821M = (int) (displayMetrics.density * 40.0f);
        this.f181822N = (int) (displayMetrics.density * 56.0f);
        this.f181823O = (int) (displayMetrics.density * 32.0f);
        C81454n nVar = new C81454n(getContext(), this);
        this.f181839k = nVar;
        nVar.mo125148b(-328966);
        C0792v.m2754a((ViewGroup) this);
        int i = (int) (displayMetrics.density * 56.0f);
        this.f181838j = i;
        this.f181831c = (float) i;
        this.f181849v = new C0787q();
        this.f181850w = new C0783m(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f181821M;
        this.f181832d = i2;
        this.f181837i = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f181808H);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        DoubleColorBallAnimationView doubleColorBallAnimationView = new DoubleColorBallAnimationView(getContext());
        this.f181834f = doubleColorBallAnimationView;
        addView(doubleColorBallAnimationView);
        MethodCollector.m26664o(12270);
    }

    /* renamed from: a */
    private void m141089a(int i, Animation.AnimationListener animationListener) {
        this.f181843o.mo61199a(i, animationListener);
        this.f181835g = i;
        this.f181827S.reset();
        this.f181827S.setDuration(200);
        this.f181827S.setInterpolator(this.f181816G);
        if (this.f181825Q == null) {
            this.f181834f.setCycleBias(1);
            this.f181834f.mo27419a();
            this.f181847t.startScroll(0, getScrollY(), 0, (-getScrollY()) - this.f181822N, Math.abs(((-getScrollY()) - this.f181822N) * 2));
            invalidate();
        }
        if (animationListener != null) {
            animationListener.onAnimationEnd(this.f181827S);
        }
    }

    /* renamed from: a */
    private void m141091a(boolean z, boolean z2) {
        if (this.f181830b != z) {
            this.f181841m = z2;
            m141100f();
            this.f181830b = z;
            if (z) {
                m141089a(this.f181832d, this.f181826R);
            } else if (this.f181825Q == null) {
                this.f181847t.forceFinished(true);
                this.f181847t.startScroll(0, getScrollY(), 0, -getScrollY(), Math.abs(getScrollY() * 2));
                invalidate();
                this.f181834f.mo27420b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo106902a(Scroller scroller, int i, int i2) {
        scroller.startScroll(0, i, 0, i2);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f181850w.mo2904a(f, f2, z);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f181849v.mo2915a(i, 0);
        startNestedScroll(i & 2);
        this.f181848u = 0.0f;
        this.f181853z = true;
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if (!isEnabled() || this.f181815F || this.f181830b || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f181850w.mo2908a(i, i2, iArr, iArr2);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f181848u;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f181848u = 0.0f;
                } else {
                    this.f181848u = f - f2;
                    iArr[1] = i2;
                }
                m141088a(this.f181848u);
            }
        }
        int[] iArr2 = this.f181851x;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f181850w.mo2907a(i, i2, i3, i4, iArr);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f181852y);
        int i5 = i4 + this.f181852y[1];
        if (i5 < 0 && !m141101g()) {
            float abs = this.f181848u + ((float) Math.abs(i5));
            this.f181848u = abs;
            m141088a(abs);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f181844q == null) {
                m141100f();
            }
            View view = this.f181844q;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                try {
                    view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                } catch (Exception e) {
                    C51423a.m95788a("", e);
                    C13468b.m24211a(e, "DoubleBallSwipeRefreshLayout");
                    if (this.f181846s) {
                        throw e;
                    }
                }
                int measuredWidth2 = this.f181834f.getMeasuredWidth();
                int i5 = (measuredWidth - measuredWidth2) / 2;
                this.f181834f.layout(i5, -((this.f181822N + this.f181834f.getMeasuredHeight()) / 2), measuredWidth2 + i5, 0);
            }
        }
    }
}
