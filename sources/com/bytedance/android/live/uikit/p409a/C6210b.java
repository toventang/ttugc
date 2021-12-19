package com.bytedance.android.live.uikit.p409a;

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
import androidx.core.p037h.C0792v;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.uikit.p409a.C6221c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.java.ResourcesProtector;

/* renamed from: com.bytedance.android.live.uikit.a.b */
public class C6210b extends ViewGroup {

    /* renamed from: m */
    private static final String f15495m = C6210b.class.getSimpleName();

    /* renamed from: y */
    private static final int[] f15496y = {16842766};

    /* renamed from: A */
    private Animation f15497A;

    /* renamed from: B */
    private Animation f15498B;

    /* renamed from: C */
    private Animation f15499C;

    /* renamed from: D */
    private Animation f15500D;

    /* renamed from: E */
    private Animation f15501E;

    /* renamed from: F */
    private int f15502F;

    /* renamed from: G */
    private int f15503G;

    /* renamed from: H */
    private Animation.AnimationListener f15504H = new Animation.AnimationListener() {
        /* class com.bytedance.android.live.uikit.p409a.C6210b.animationAnimation$AnimationListenerC62111 */

        static {
            Covode.recordClassIndex(6917);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        public final void onAnimationEnd(Animation animation) {
            if (C6210b.this.f15508b) {
                C6210b.this.f15515i.setAlpha(255);
                C6210b.this.f15515i.start();
                if (C6210b.this.f15517k && C6210b.this.f15507a != null) {
                    C6210b.this.f15507a.mo12161a();
                }
            } else {
                C6210b.this.f15515i.stop();
                C6210b.this.f15511e.setVisibility(8);
                C6210b.this.setColorViewAlpha(255);
                if (C6210b.this.f15510d) {
                    C6210b.this.setAnimationProgress(0.0f);
                } else {
                    C6210b bVar = C6210b.this;
                    bVar.mo12130a(bVar.f15514h - C6210b.this.f15509c, true);
                }
            }
            C6210b bVar2 = C6210b.this;
            bVar2.f15509c = bVar2.f15511e.getTop();
        }
    };

    /* renamed from: I */
    private final Animation f15505I = new Animation() {
        /* class com.bytedance.android.live.uikit.p409a.C6210b.C62166 */

        static {
            Covode.recordClassIndex(6922);
        }

        public final void applyTransformation(float f, Transformation transformation) {
            float f2;
            if (!C6210b.this.f15518l) {
                f2 = C6210b.this.f15516j - ((float) Math.abs(C6210b.this.f15514h));
            } else {
                f2 = C6210b.this.f15516j;
            }
            C6210b.this.mo12130a((C6210b.this.f15512f + ((int) (((float) (((int) f2) - C6210b.this.f15512f)) * f))) - C6210b.this.f15511e.getTop(), false);
        }
    };

    /* renamed from: J */
    private final Animation f15506J = new Animation() {
        /* class com.bytedance.android.live.uikit.p409a.C6210b.C62177 */

        static {
            Covode.recordClassIndex(6923);
        }

        public final void applyTransformation(float f, Transformation transformation) {
            C6210b.this.mo12129a(f);
        }
    };

    /* renamed from: a */
    public AbstractC6220b f15507a;

    /* renamed from: b */
    public boolean f15508b;

    /* renamed from: c */
    public int f15509c;

    /* renamed from: d */
    public boolean f15510d;

    /* renamed from: e */
    public C6208a f15511e;

    /* renamed from: f */
    protected int f15512f;

    /* renamed from: g */
    public float f15513g;

    /* renamed from: h */
    protected int f15514h;

    /* renamed from: i */
    public C6221c f15515i;

    /* renamed from: j */
    public float f15516j;

    /* renamed from: k */
    public boolean f15517k;

    /* renamed from: l */
    public boolean f15518l;

    /* renamed from: n */
    private View f15519n;

    /* renamed from: o */
    private AbstractC6219a f15520o;

    /* renamed from: p */
    private int f15521p;

    /* renamed from: q */
    private float f15522q = -1.0f;

    /* renamed from: r */
    private int f15523r;

    /* renamed from: s */
    private boolean f15524s;

    /* renamed from: t */
    private float f15525t;

    /* renamed from: u */
    private boolean f15526u;

    /* renamed from: v */
    private int f15527v = -1;

    /* renamed from: w */
    private boolean f15528w;

    /* renamed from: x */
    private final DecelerateInterpolator f15529x;

    /* renamed from: z */
    private int f15530z = -1;

    /* renamed from: com.bytedance.android.live.uikit.a.b$a */
    public interface AbstractC6219a {
        static {
            Covode.recordClassIndex(6925);
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.a.b$b */
    public interface AbstractC6220b {
        static {
            Covode.recordClassIndex(6926);
        }

        /* renamed from: a */
        void mo12161a();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    /* renamed from: a */
    public final void mo12131a(Animation.AnimationListener animationListener) {
        C62133 r2 = new Animation() {
            /* class com.bytedance.android.live.uikit.p409a.C6210b.C62133 */

            static {
                Covode.recordClassIndex(6919);
            }

            public final void applyTransformation(float f, Transformation transformation) {
                C6210b.this.setAnimationProgress(1.0f - f);
            }
        };
        this.f15498B = r2;
        r2.setDuration(150);
        this.f15511e.f15488a = animationListener;
        this.f15511e.clearAnimation();
        this.f15511e.startAnimation(this.f15498B);
    }

    /* renamed from: a */
    public final void mo12130a(int i, boolean z) {
        this.f15511e.bringToFront();
        this.f15511e.offsetTopAndBottom(i);
        this.f15509c = this.f15511e.getTop();
        if (z) {
            int i2 = Build.VERSION.SDK_INT;
        }
    }

    /* renamed from: a */
    private static boolean m13496a() {
        int i = Build.VERSION.SDK_INT;
        return false;
    }

    /* renamed from: c */
    private boolean m13499c() {
        int i = Build.VERSION.SDK_INT;
        return this.f15519n.canScrollVertically(-1);
    }

    static {
        Covode.recordClassIndex(6916);
    }

    /* renamed from: b */
    private void m13498b() {
        if (this.f15519n == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f15511e)) {
                    this.f15519n = childAt;
                    return;
                }
            }
        }
    }

    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f15522q = (float) i;
    }

    public void setOnRefreshListener(AbstractC6220b bVar) {
        this.f15507a = bVar;
    }

    public void setStartEndRefreshListener(AbstractC6219a aVar) {
        this.f15520o = aVar;
    }

    public void setColorSchemeColors(int... iArr) {
        m13498b();
        C6221c cVar = this.f15515i;
        cVar.f15545c.mo12188a(iArr);
        cVar.f15545c.f15571j = 0;
    }

    public void setColorViewAlpha(int i) {
        this.f15511e.getBackground().setAlpha(i);
        this.f15515i.setAlpha(i);
    }

    /* renamed from: a */
    private void m13494a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f15527v) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f15527v = motionEvent.getPointerId(i);
        }
    }

    public void setAnimationProgress(float f) {
        if (m13496a()) {
            setColorViewAlpha((int) (f * 255.0f));
            return;
        }
        this.f15511e.setScaleX(f);
        this.f15511e.setScaleY(f);
    }

    public void setColorSchemeResources(int... iArr) {
        Resources resources = getResources();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = resources.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setProgressBackgroundColor(int i) {
        this.f15511e.setBackgroundColor(i);
        this.f15515i.mo12166b(getResources().getColor(i));
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                int i2 = (int) (displayMetrics.density * 56.0f);
                this.f15502F = i2;
                this.f15503G = i2;
            } else {
                int i3 = (int) (displayMetrics.density * 40.0f);
                this.f15502F = i3;
                this.f15503G = i3;
            }
            this.f15511e.setImageDrawable(null);
            this.f15515i.mo12163a(i);
            this.f15511e.setImageDrawable(this.f15515i);
        }
    }

    /* renamed from: a */
    private static int m13491a(Resources resources) {
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

    public void setRefreshing(boolean z) {
        float f;
        if (!z || this.f15508b == z) {
            m13495a(z, false);
            return;
        }
        this.f15508b = z;
        if (!this.f15518l) {
            f = this.f15516j + ((float) this.f15514h);
        } else {
            f = this.f15516j;
        }
        mo12130a(((int) f) - this.f15509c, true);
        this.f15517k = false;
        Animation.AnimationListener animationListener = this.f15504H;
        this.f15511e.setVisibility(0);
        int i = Build.VERSION.SDK_INT;
        this.f15515i.setAlpha(255);
        C62122 r2 = new Animation() {
            /* class com.bytedance.android.live.uikit.p409a.C6210b.C62122 */

            static {
                Covode.recordClassIndex(6918);
            }

            public final void applyTransformation(float f, Transformation transformation) {
                C6210b.this.setAnimationProgress(f);
            }
        };
        this.f15497A = r2;
        r2.setDuration((long) this.f15523r);
        if (animationListener != null) {
            this.f15511e.f15488a = animationListener;
        }
        this.f15511e.clearAnimation();
        this.f15511e.startAnimation(this.f15497A);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.p409a.C6210b.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private static boolean m13497a(Animation animation) {
        if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f15528w && actionMasked == 0) {
            this.f15528w = false;
        }
        if (!isEnabled() || this.f15528w || m13499c()) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f15527v);
                    if (findPointerIndex < 0) {
                        C3854a.m9453a(6, f15495m, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    try {
                        float y = (motionEvent.getY(findPointerIndex) - this.f15525t) * 0.5f;
                        if (this.f15526u) {
                            this.f15515i.mo12164a(true);
                            float f2 = y / this.f15522q;
                            if (f2 < 0.0f) {
                                return false;
                            }
                            float min = Math.min(1.0f, Math.abs(f2));
                            double d = (double) min;
                            Double.isNaN(d);
                            float max = (Math.max((float) (d - 0.4d), 0.0f) * 5.0f) / 3.0f;
                            float abs = Math.abs(y) - this.f15522q;
                            if (this.f15518l) {
                                f = this.f15516j - ((float) this.f15514h);
                            } else {
                                f = this.f15516j;
                            }
                            double max2 = (double) (Math.max(0.0f, Math.min(abs, f * 2.0f) / f) / 4.0f);
                            double pow = Math.pow(max2, 2.0d);
                            Double.isNaN(max2);
                            float f3 = ((float) (max2 - pow)) * 2.0f;
                            int i = this.f15514h + ((int) ((f * min) + (f * f3 * 2.0f)));
                            if (this.f15511e.getVisibility() != 0) {
                                this.f15511e.setVisibility(0);
                            }
                            if (!this.f15510d) {
                                this.f15511e.setScaleX(1.0f);
                                this.f15511e.setScaleY(1.0f);
                            }
                            float f4 = this.f15522q;
                            if (y < f4) {
                                if (this.f15510d) {
                                    setAnimationProgress(y / f4);
                                }
                                if (this.f15515i.getAlpha() > 76 && !m13497a(this.f15499C)) {
                                    this.f15499C = m13492a(this.f15515i.getAlpha(), 76);
                                }
                                this.f15515i.mo12162a(Math.min(0.8f, max * 0.8f));
                                C6221c cVar = this.f15515i;
                                float min2 = Math.min(1.0f, max);
                                C6221c.C6226b bVar = cVar.f15545c;
                                if (min2 != bVar.f15577p) {
                                    bVar.f15577p = min2;
                                    bVar.mo12191c();
                                }
                            } else if (this.f15515i.getAlpha() < 255 && !m13497a(this.f15500D)) {
                                this.f15500D = m13492a(this.f15515i.getAlpha(), 255);
                            }
                            this.f15515i.f15545c.mo12192c((((max * 0.4f) - 16.0f) + (f3 * 2.0f)) * 0.5f);
                            mo12130a(i - this.f15509c, true);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return true;
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        this.f15527v = motionEvent.getPointerId(motionEvent.getActionIndex());
                    } else if (actionMasked == 6) {
                        m13494a(motionEvent);
                    }
                }
            }
            int i2 = this.f15527v;
            if (i2 == -1) {
                if (actionMasked == 1) {
                    C3854a.m9453a(6, f15495m, "Got ACTION_UP event but don't have an active pointer id.");
                }
                return false;
            }
            try {
                float y2 = motionEvent.getY(motionEvent.findPointerIndex(i2));
                this.f15526u = false;
                if ((y2 - this.f15525t) * 0.5f > this.f15522q) {
                    m13495a(true, true);
                } else {
                    this.f15508b = false;
                    this.f15515i.mo12162a(0.0f);
                    animationAnimation$AnimationListenerC62155 r6 = null;
                    if (!this.f15510d) {
                        r6 = new Animation.AnimationListener() {
                            /* class com.bytedance.android.live.uikit.p409a.C6210b.animationAnimation$AnimationListenerC62155 */

                            static {
                                Covode.recordClassIndex(6921);
                            }

                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                            }

                            public final void onAnimationEnd(Animation animation) {
                                if (!C6210b.this.f15510d) {
                                    C6210b.this.mo12131a((Animation.AnimationListener) null);
                                }
                            }
                        };
                    }
                    int i3 = this.f15509c;
                    if (this.f15510d) {
                        this.f15512f = i3;
                        if (m13496a()) {
                            this.f15513g = (float) this.f15515i.getAlpha();
                        } else {
                            this.f15513g = this.f15511e.getScaleX();
                        }
                        C62188 r2 = new Animation() {
                            /* class com.bytedance.android.live.uikit.p409a.C6210b.C62188 */

                            static {
                                Covode.recordClassIndex(6924);
                            }

                            public final void applyTransformation(float f, Transformation transformation) {
                                C6210b.this.setAnimationProgress(C6210b.this.f15513g + ((-C6210b.this.f15513g) * f));
                                C6210b.this.mo12129a(f);
                            }
                        };
                        this.f15501E = r2;
                        r2.setDuration(150);
                        if (r6 != null) {
                            this.f15511e.f15488a = r6;
                        }
                        this.f15511e.clearAnimation();
                        this.f15511e.startAnimation(this.f15501E);
                    } else {
                        this.f15512f = i3;
                        this.f15506J.reset();
                        this.f15506J.setDuration(200);
                        this.f15506J.setInterpolator(this.f15529x);
                        if (r6 != null) {
                            this.f15511e.f15488a = r6;
                        }
                        this.f15511e.clearAnimation();
                        this.f15511e.startAnimation(this.f15506J);
                    }
                    this.f15515i.mo12164a(false);
                    C3854a.m9453a(3, f15495m, "on touch cancel refresh");
                }
                this.f15527v = -1;
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
                return true;
            }
        } else {
            this.f15527v = motionEvent.getPointerId(0);
            this.f15526u = false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo12129a(float f) {
        int i = this.f15512f;
        mo12130a((i + ((int) (((float) (this.f15514h - i)) * f))) - this.f15511e.getTop(), false);
    }

    /* renamed from: a */
    private static float m13490a(MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex < 0) {
            return -1.0f;
        }
        return motionEvent.getY(findPointerIndex);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f15530z;
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
    private Animation m13492a(final int i, final int i2) {
        if (this.f15510d && m13496a()) {
            return null;
        }
        C62144 r2 = new Animation() {
            /* class com.bytedance.android.live.uikit.p409a.C6210b.C62144 */

            static {
                Covode.recordClassIndex(6920);
            }

            public final void applyTransformation(float f, Transformation transformation) {
                C6221c cVar = C6210b.this.f15515i;
                int i = i;
                cVar.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        r2.setDuration(300);
        this.f15511e.f15488a = null;
        this.f15511e.clearAnimation();
        this.f15511e.startAnimation(r2);
        return r2;
    }

    public C6210b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(13124);
        this.f15521p = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f15523r = m13491a(getResources());
        setWillNotDraw(false);
        this.f15529x = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f15496y);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f15502F = (int) (displayMetrics.density * 40.0f);
        this.f15503G = (int) (displayMetrics.density * 40.0f);
        this.f15511e = new C6208a(getContext());
        C6221c cVar = new C6221c(getContext(), this);
        this.f15515i = cVar;
        cVar.mo12166b(-328966);
        this.f15511e.setImageDrawable(this.f15515i);
        this.f15511e.setVisibility(8);
        addView(this.f15511e);
        C0792v.m2754a((ViewGroup) this);
        float f = displayMetrics.density * 64.0f;
        this.f15516j = f;
        this.f15522q = f;
        MethodCollector.m26664o(13124);
    }

    /* renamed from: a */
    private void m13493a(int i, Animation.AnimationListener animationListener) {
        this.f15512f = i;
        this.f15505I.reset();
        this.f15505I.setDuration(200);
        this.f15505I.setInterpolator(this.f15529x);
        if (animationListener != null) {
            this.f15511e.f15488a = animationListener;
        }
        this.f15511e.clearAnimation();
        this.f15511e.startAnimation(this.f15505I);
    }

    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(13196);
        super.onMeasure(i, i2);
        if (this.f15519n == null) {
            m13498b();
        }
        View view = this.f15519n;
        if (view == null) {
            MethodCollector.m26664o(13196);
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f15511e.measure(View.MeasureSpec.makeMeasureSpec(this.f15502F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f15503G, 1073741824));
        if (!this.f15518l && !this.f15524s) {
            this.f15524s = true;
            int i3 = -this.f15511e.getMeasuredHeight();
            this.f15514h = i3;
            this.f15509c = i3;
        }
        this.f15530z = -1;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == this.f15511e) {
                this.f15530z = i4;
                MethodCollector.m26664o(13196);
                return;
            }
        }
        MethodCollector.m26664o(13196);
    }

    /* renamed from: a */
    private void m13495a(boolean z, boolean z2) {
        if (this.f15508b != z) {
            this.f15517k = z2;
            m13498b();
            this.f15508b = z;
            if (z) {
                m13493a(this.f15509c, this.f15504H);
            } else {
                mo12131a(this.f15504H);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f15519n == null) {
                m13498b();
            }
            View view = this.f15519n;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f15511e.getMeasuredWidth();
                int measuredHeight2 = this.f15511e.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.f15509c;
                this.f15511e.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }
}
