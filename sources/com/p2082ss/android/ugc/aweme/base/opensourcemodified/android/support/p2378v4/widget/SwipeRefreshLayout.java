package com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget;

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
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import androidx.core.content.C0643b;
import androidx.core.p037h.AbstractC0780j;
import androidx.core.p037h.AbstractC0784n;
import androidx.core.p037h.C0783m;
import androidx.core.p037h.C0787q;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;

/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout */
public class SwipeRefreshLayout extends ViewGroup implements AbstractC0780j, AbstractC0784n, AbstractC34638b {

    /* renamed from: G */
    private static final int[] f81707G = {16842766};

    /* renamed from: n */
    private static final String f81708n = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: o */
    private static final String f81709o = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: A */
    private float f81710A;

    /* renamed from: B */
    private float f81711B;

    /* renamed from: C */
    private boolean f81712C;

    /* renamed from: D */
    private int f81713D;

    /* renamed from: E */
    private boolean f81714E;

    /* renamed from: F */
    private final DecelerateInterpolator f81715F;

    /* renamed from: H */
    private int f81716H;

    /* renamed from: I */
    private Animation f81717I;

    /* renamed from: J */
    private Animation f81718J;

    /* renamed from: K */
    private Animation f81719K;

    /* renamed from: L */
    private Animation f81720L;

    /* renamed from: M */
    private Animation f81721M;

    /* renamed from: N */
    private int f81722N;

    /* renamed from: O */
    private AbstractC34633a f81723O;

    /* renamed from: P */
    private Animation.AnimationListener f81724P;

    /* renamed from: Q */
    private final Animation f81725Q;

    /* renamed from: R */
    private final Animation f81726R;

    /* renamed from: a */
    AbstractC34634b f81727a;

    /* renamed from: b */
    public boolean f81728b;

    /* renamed from: c */
    int f81729c;

    /* renamed from: d */
    boolean f81730d;

    /* renamed from: e */
    C34636a f81731e;

    /* renamed from: f */
    protected int f81732f;

    /* renamed from: g */
    float f81733g;

    /* renamed from: h */
    protected int f81734h;

    /* renamed from: i */
    int f81735i;

    /* renamed from: j */
    C34639c f81736j;

    /* renamed from: k */
    boolean f81737k;

    /* renamed from: l */
    boolean f81738l;

    /* renamed from: m */
    AbstractC34644d f81739m;

    /* renamed from: p */
    private View f81740p;

    /* renamed from: q */
    private int f81741q;

    /* renamed from: r */
    private float f81742r;

    /* renamed from: s */
    private boolean f81743s;

    /* renamed from: t */
    private float f81744t;

    /* renamed from: u */
    private final C0787q f81745u;

    /* renamed from: v */
    private final C0783m f81746v;

    /* renamed from: w */
    private final int[] f81747w;

    /* renamed from: x */
    private final int[] f81748x;

    /* renamed from: y */
    private boolean f81749y;

    /* renamed from: z */
    private int f81750z;

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout$a */
    public interface AbstractC34633a {
        static {
            Covode.recordClassIndex(41600);
        }

        /* renamed from: a */
        boolean mo61154a();
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout$b */
    public interface AbstractC34634b {
        static {
            Covode.recordClassIndex(41601);
        }

        /* renamed from: a */
        void mo59551a();
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout$c */
    public interface AbstractC34635c {
        static {
            Covode.recordClassIndex(41602);
        }
    }

    public void setOnSwipeChangeListener(AbstractC34635c cVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.AbstractC34638b
    /* renamed from: a */
    public final boolean mo61107a() {
        return this.f81728b;
    }

    public int getProgressCircleDiameter() {
        return this.f81722N;
    }

    public int getProgressViewEndOffset() {
        return this.f81735i;
    }

    public int getProgressViewStartOffset() {
        return this.f81734h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61106a(Animation.AnimationListener animationListener) {
        C346263 r2 = new Animation() {
            /* class com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.C346263 */

            static {
                Covode.recordClassIndex(41593);
            }

            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
            }
        };
        this.f81718J = r2;
        r2.setDuration(150);
        this.f81731e.f81762a = animationListener;
        this.f81731e.clearAnimation();
        this.f81731e.startAnimation(this.f81718J);
    }

    /* renamed from: c */
    private static boolean m70713c() {
        int i = Build.VERSION.SDK_INT;
        return false;
    }

    public int getNestedScrollAxes() {
        return this.f81745u.mo2913a();
    }

    public boolean hasNestedScrollingParent() {
        return this.f81746v.mo2905a(0);
    }

    @Override // androidx.core.p037h.AbstractC0780j
    public boolean isNestedScrollingEnabled() {
        return this.f81746v.f2940a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo61108b();
    }

    @Override // androidx.core.p037h.AbstractC0780j
    public void stopNestedScroll() {
        this.f81746v.mo2910b(0);
    }

    /* renamed from: d */
    private void m70714d() {
        this.f81719K = m70708b(this.f81736j.getAlpha(), 76);
    }

    /* renamed from: e */
    private void m70716e() {
        this.f81720L = m70708b(this.f81736j.getAlpha(), 255);
    }

    static {
        Covode.recordClassIndex(41590);
    }

    /* renamed from: f */
    private void m70717f() {
        if (this.f81740p == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f81731e)) {
                    this.f81740p = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private boolean m70718g() {
        AbstractC34633a aVar = this.f81723O;
        if (aVar != null) {
            return aVar.mo61154a();
        }
        int i = Build.VERSION.SDK_INT;
        return this.f81740p.canScrollVertically(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo61108b() {
        this.f81739m.mo61198a();
        this.f81731e.clearAnimation();
        this.f81736j.stop();
        this.f81731e.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f81730d) {
            setAnimationProgress(0.0f);
        } else {
            mo61105a(this.f81734h - this.f81729c, true);
        }
        this.f81729c = this.f81731e.getTop();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f81742r = (float) i;
    }

    public void setDoNotCatchException(boolean z) {
        this.f81743s = z;
    }

    public void setOnChildScrollUpCallback(AbstractC34633a aVar) {
        this.f81723O = aVar;
    }

    public void setOnRefreshListener(AbstractC34634b bVar) {
        this.f81727a = bVar;
    }

    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f81746v.mo2902a(z);
    }

    public boolean startNestedScroll(int i) {
        return this.f81746v.mo2906a(i, 0);
    }

    private void setColorViewAlpha(int i) {
        this.f81731e.getBackground().setAlpha(i);
        this.f81736j.setAlpha(i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo61108b();
        }
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f81731e.setBackgroundColor(i);
        this.f81736j.mo61167b(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0643b.m2378c(getContext(), i));
    }

    /* renamed from: a */
    private void m70705a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f81713D) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f81713D = motionEvent.getPointerId(i);
        }
    }

    /* renamed from: d */
    private void m70715d(float f) {
        float f2 = this.f81711B;
        int i = this.f81741q;
        if (f - f2 > ((float) i) && !this.f81712C) {
            this.f81710A = f2 + ((float) i);
            this.f81712C = true;
            this.f81736j.setAlpha(76);
        }
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onStopNestedScroll(View view) {
        this.f81745u.mo2914a(0);
        this.f81749y = false;
        float f = this.f81744t;
        if (f > 0.0f) {
            m70711c(f);
            this.f81744t = 0.0f;
        }
        stopNestedScroll();
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f) {
        if (m70713c()) {
            setColorViewAlpha((int) (f * 255.0f));
            return;
        }
        this.f81731e.setScaleX(f);
        this.f81731e.setScaleY(f);
    }

    public void setColorSchemeColors(int... iArr) {
        m70717f();
        C34639c cVar = this.f81736j;
        cVar.f81772b.mo61191a(iArr);
        cVar.f81772b.mo61189a(0);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0643b.m2378c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    /* renamed from: c */
    private void m70711c(float f) {
        if (f > this.f81742r) {
            m70706a(true, true);
            return;
        }
        this.f81728b = false;
        this.f81736j.mo61166b(0.0f);
        animationAnimation$AnimationListenerC346285 r2 = null;
        if (!this.f81730d) {
            r2 = new Animation.AnimationListener() {
                /* class com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.animationAnimation$AnimationListenerC346285 */

                static {
                    Covode.recordClassIndex(41595);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (!SwipeRefreshLayout.this.f81730d) {
                        SwipeRefreshLayout.this.mo61106a((Animation.AnimationListener) null);
                    }
                }
            };
        }
        m70710b(this.f81729c, this.f81739m.mo61197a(r2));
        this.f81736j.mo61165a(false);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f81722N = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f81722N = (int) (displayMetrics.density * 40.0f);
            }
            this.f81731e.setImageDrawable(null);
            this.f81736j.mo61164a(i);
            this.f81731e.setImageDrawable(this.f81736j);
        }
    }

    /* renamed from: a */
    private static int m70703a(Resources resources) {
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

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        m70717f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f81714E && actionMasked == 0) {
            this.f81714E = false;
        }
        if (!isEnabled() || this.f81714E || m70718g() || this.f81728b || this.f81749y) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f81713D;
                    if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                        return false;
                    }
                    m70715d(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m70705a(motionEvent);
                    }
                }
            }
            this.f81712C = false;
            this.f81713D = -1;
        } else {
            mo61105a(this.f81734h - this.f81731e.getTop(), true);
            int pointerId = motionEvent.getPointerId(0);
            this.f81713D = pointerId;
            this.f81712C = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f81711B = motionEvent.getY(findPointerIndex2);
        }
        return this.f81712C;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.AbstractC34638b
    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.f81728b == z) {
            m70706a(z, false);
            return;
        }
        this.f81728b = z;
        if (!this.f81738l) {
            i = this.f81735i + this.f81734h;
        } else {
            i = this.f81735i;
        }
        mo61105a(i - this.f81729c, true);
        this.f81737k = false;
        Animation.AnimationListener animationListener = this.f81724P;
        this.f81731e.setVisibility(0);
        int i2 = Build.VERSION.SDK_INT;
        this.f81736j.setAlpha(255);
        C346252 r2 = new Animation() {
            /* class com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.C346252 */

            static {
                Covode.recordClassIndex(41592);
            }

            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f);
            }
        };
        this.f81717I = r2;
        r2.setDuration((long) this.f81750z);
        if (animationListener != null) {
            this.f81731e.f81762a = animationListener;
        }
        this.f81731e.clearAnimation();
        this.f81731e.startAnimation(this.f81717I);
    }

    /* renamed from: b */
    private void m70709b(float f) {
        int i;
        this.f81736j.mo61165a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f81742r));
        double d = (double) min;
        Double.isNaN(d);
        float max = (Math.max((float) (d - 0.4d), 0.0f) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f81742r;
        if (this.f81738l) {
            i = this.f81735i - this.f81734h;
        } else {
            i = this.f81735i;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = ((float) (max2 - pow)) * 2.0f;
        int i2 = this.f81734h + ((int) ((f2 * min) + (f2 * f3 * 2.0f)));
        if (this.f81731e.getVisibility() != 0) {
            this.f81731e.setVisibility(0);
        }
        if (!this.f81730d) {
            this.f81731e.setScaleX(1.0f);
            this.f81731e.setScaleY(1.0f);
        }
        if (this.f81730d) {
            setAnimationProgress(Math.min(1.0f, f / this.f81742r));
        }
        if (f < this.f81742r) {
            if (this.f81736j.getAlpha() > 76 && !m70707a(this.f81719K)) {
                m70714d();
            }
        } else if (this.f81736j.getAlpha() < 255 && !m70707a(this.f81720L)) {
            m70716e();
        }
        this.f81736j.mo61166b(Math.min(0.8f, max * 0.8f));
        this.f81736j.mo61163a(Math.min(1.0f, max));
        this.f81736j.mo61168c((((max * 0.4f) - 16.0f) + (f3 * 2.0f)) * 0.5f);
        mo61105a(i2 - this.f81729c, true);
        this.f81739m.mo61203c();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f81714E && actionMasked == 0) {
            this.f81714E = false;
        }
        if (!isEnabled() || this.f81714E || m70718g() || this.f81728b || this.f81749y) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f81713D);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    float y = motionEvent.getY(findPointerIndex);
                    m70715d(y);
                    if (this.f81712C) {
                        float f = (y - this.f81710A) * 0.5f;
                        if (f > 0.0f) {
                            m70709b(f);
                        } else {
                            m70709b(0.0f);
                            return false;
                        }
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            return false;
                        }
                        this.f81713D = motionEvent.getPointerId(actionIndex);
                    } else if (actionMasked == 6) {
                        m70705a(motionEvent);
                    }
                }
            }
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f81713D);
            if (findPointerIndex2 < 0) {
                return false;
            }
            if (this.f81712C) {
                this.f81712C = false;
                m70711c((motionEvent.getY(findPointerIndex2) - this.f81710A) * 0.5f);
            }
            this.f81713D = -1;
            return false;
        }
        this.f81713D = motionEvent.getPointerId(0);
        this.f81712C = false;
        return true;
    }

    /* renamed from: a */
    private static boolean m70707a(Animation animation) {
        if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61103a(float f) {
        int i = this.f81732f;
        mo61105a((i + ((int) (((float) (this.f81734h - i)) * f))) - this.f81731e.getTop(), false);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f81746v.mo2903a(f, f2);
    }

    /* renamed from: a */
    public final void mo61104a(int i, int i2) {
        this.f81730d = false;
        this.f81734h = i;
        this.f81735i = i2;
        this.f81738l = true;
        mo61108b();
        this.f81728b = false;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f81716H;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        if (i2 >= i3) {
            return i2 + 1;
        }
        return i2;
    }

    /* renamed from: a */
    private void m70704a(int i, Animation.AnimationListener animationListener) {
        this.f81739m.mo61199a(i, animationListener);
        this.f81732f = i;
        this.f81725Q.reset();
        this.f81725Q.setDuration(200);
        this.f81725Q.setInterpolator(this.f81715F);
        if (animationListener != null) {
            this.f81731e.f81762a = animationListener;
        }
        this.f81731e.clearAnimation();
        this.f81731e.startAnimation(this.f81725Q);
    }

    /* renamed from: b */
    private Animation m70708b(final int i, final int i2) {
        if (this.f81730d && m70713c()) {
            return null;
        }
        C346274 r2 = new Animation() {
            /* class com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.C346274 */

            static {
                Covode.recordClassIndex(41594);
            }

            public final void applyTransformation(float f, Transformation transformation) {
                C34639c cVar = SwipeRefreshLayout.this.f81736j;
                int i = i;
                cVar.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        r2.setDuration(300);
        this.f81731e.f81762a = null;
        this.f81731e.clearAnimation();
        this.f81731e.startAnimation(r2);
        return r2;
    }

    /* renamed from: b */
    private void m70710b(int i, Animation.AnimationListener animationListener) {
        this.f81739m.mo61202b(i, animationListener);
        if (this.f81730d) {
            m70712c(i, animationListener);
            return;
        }
        this.f81732f = i;
        this.f81726R.reset();
        this.f81726R.setDuration(200);
        this.f81726R.setInterpolator(this.f81715F);
        if (animationListener != null) {
            this.f81731e.f81762a = animationListener;
        }
        this.f81731e.clearAnimation();
        this.f81731e.startAnimation(this.f81726R);
    }

    /* renamed from: c */
    private void m70712c(int i, Animation.AnimationListener animationListener) {
        this.f81732f = i;
        if (m70713c()) {
            this.f81733g = (float) this.f81736j.getAlpha();
        } else {
            this.f81733g = this.f81731e.getScaleX();
        }
        C346318 r2 = new Animation() {
            /* class com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.C346318 */

            static {
                Covode.recordClassIndex(41598);
            }

            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(SwipeRefreshLayout.this.f81733g + ((-SwipeRefreshLayout.this.f81733g) * f));
                SwipeRefreshLayout.this.mo61103a(f);
            }
        };
        this.f81721M = r2;
        r2.setDuration(150);
        if (animationListener != null) {
            this.f81731e.f81762a = animationListener;
        }
        this.f81731e.clearAnimation();
        this.f81731e.startAnimation(this.f81721M);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(13634);
        this.f81742r = -1.0f;
        this.f81747w = new int[2];
        this.f81748x = new int[2];
        this.f81713D = -1;
        this.f81716H = -1;
        this.f81724P = new Animation.AnimationListener() {
            /* class com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.animationAnimation$AnimationListenerC346241 */

            static {
                Covode.recordClassIndex(41591);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (SwipeRefreshLayout.this.f81728b) {
                    SwipeRefreshLayout.this.f81739m.mo61201b();
                    SwipeRefreshLayout.this.f81736j.setAlpha(255);
                    SwipeRefreshLayout.this.f81736j.start();
                    if (SwipeRefreshLayout.this.f81737k && SwipeRefreshLayout.this.f81727a != null) {
                        SwipeRefreshLayout.this.f81727a.mo59551a();
                    }
                    SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                    swipeRefreshLayout.f81729c = swipeRefreshLayout.f81731e.getTop();
                    return;
                }
                SwipeRefreshLayout.this.mo61108b();
            }
        };
        this.f81725Q = new Animation() {
            /* class com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.C346296 */

            static {
                Covode.recordClassIndex(41596);
            }

            public final void applyTransformation(float f, Transformation transformation) {
                int i;
                if (!SwipeRefreshLayout.this.f81738l) {
                    i = SwipeRefreshLayout.this.f81735i - Math.abs(SwipeRefreshLayout.this.f81734h);
                } else {
                    i = SwipeRefreshLayout.this.f81735i;
                }
                SwipeRefreshLayout.this.mo61105a((SwipeRefreshLayout.this.f81732f + ((int) (((float) (i - SwipeRefreshLayout.this.f81732f)) * f))) - SwipeRefreshLayout.this.f81731e.getTop(), false);
                SwipeRefreshLayout.this.f81736j.mo61163a(1.0f - f);
            }
        };
        this.f81726R = new Animation() {
            /* class com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.C346307 */

            static {
                Covode.recordClassIndex(41597);
            }

            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.mo61103a(f);
            }
        };
        this.f81739m = new AbstractC34644d() {
            /* class com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.C346329 */

            static {
                Covode.recordClassIndex(41599);
            }
        };
        this.f81741q = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f81750z = m70703a(getResources());
        setWillNotDraw(false);
        this.f81715F = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f81722N = (int) (displayMetrics.density * 40.0f);
        this.f81731e = new C34636a(getContext());
        C34639c cVar = new C34639c(getContext(), this);
        this.f81736j = cVar;
        cVar.mo61167b(-328966);
        this.f81731e.setImageDrawable(this.f81736j);
        this.f81731e.setVisibility(8);
        addView(this.f81731e);
        C0792v.m2754a((ViewGroup) this);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f81735i = i;
        this.f81742r = (float) i;
        this.f81745u = new C0787q();
        this.f81746v = new C0783m(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f81722N;
        this.f81729c = i2;
        this.f81734h = i2;
        mo61103a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f81707G);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(13634);
    }

    /* renamed from: a */
    private void m70706a(boolean z, boolean z2) {
        if (this.f81728b != z) {
            this.f81737k = z2;
            m70717f();
            this.f81728b = z;
            if (z) {
                m70704a(this.f81729c, this.f81724P);
            } else {
                mo61106a(this.f81724P);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(13812);
        super.onMeasure(i, i2);
        if (this.f81740p == null) {
            m70717f();
        }
        View view = this.f81740p;
        if (view == null) {
            MethodCollector.m26664o(13812);
            return;
        }
        try {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        } catch (IllegalStateException e) {
            C51423a.m95788a("", e);
            C13468b.m24211a(e, f81708n);
            if (this.f81743s) {
                MethodCollector.m26664o(13812);
                throw e;
            }
        }
        this.f81731e.measure(View.MeasureSpec.makeMeasureSpec(this.f81722N, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f81722N, 1073741824));
        this.f81716H = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f81731e) {
                this.f81716H = i3;
                MethodCollector.m26664o(13812);
                return;
            }
        }
        MethodCollector.m26664o(13812);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61105a(int i, boolean z) {
        this.f81731e.bringToFront();
        C0792v.m2767d(this.f81731e, i);
        this.f81729c = this.f81731e.getTop();
        if (z) {
            int i2 = Build.VERSION.SDK_INT;
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f81746v.mo2904a(f, f2, z);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f81745u.mo2915a(i, 0);
        startNestedScroll(i & 2);
        this.f81744t = 0.0f;
        this.f81749y = true;
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if (!isEnabled() || this.f81714E || this.f81728b || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f81746v.mo2908a(i, i2, iArr, iArr2);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f81744t;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f81744t = 0.0f;
                } else {
                    this.f81744t = f - f2;
                    iArr[1] = i2;
                }
                m70709b(this.f81744t);
            }
        }
        if (this.f81738l && i2 > 0 && this.f81744t == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f81731e.setVisibility(8);
        }
        int[] iArr2 = this.f81747w;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f81746v.mo2907a(i, i2, i3, i4, iArr);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f81748x);
        int i5 = i4 + this.f81748x[1];
        if (i5 < 0 && !m70718g()) {
            float abs = this.f81744t + ((float) Math.abs(i5));
            this.f81744t = abs;
            m70709b(abs);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f81740p == null) {
                m70717f();
            }
            View view = this.f81740p;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                try {
                    view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                } catch (Exception e) {
                    C51423a.m95788a("", e);
                    C13468b.m24211a(e, f81708n);
                    if (this.f81743s) {
                        throw e;
                    }
                }
                int measuredWidth2 = this.f81731e.getMeasuredWidth();
                int measuredHeight2 = this.f81731e.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.f81729c;
                this.f81731e.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }
}
