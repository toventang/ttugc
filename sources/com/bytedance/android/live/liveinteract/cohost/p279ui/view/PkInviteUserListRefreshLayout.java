package com.bytedance.android.live.liveinteract.cohost.p279ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.java.ResourcesProtector;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout */
public class PkInviteUserListRefreshLayout extends ViewGroup {

    /* renamed from: q */
    private static final String f12567q = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: x */
    private static final int[] f12568x = {16842766};

    /* renamed from: A */
    private final Animation f12569A = new Animation() {
        /* class com.bytedance.android.live.liveinteract.cohost.p279ui.view.PkInviteUserListRefreshLayout.C47871 */

        static {
            Covode.recordClassIndex(5366);
        }

        public final void applyTransformation(float f, Transformation transformation) {
            int i;
            if (PkInviteUserListRefreshLayout.this.f12575d != PkInviteUserListRefreshLayout.this.f12573b) {
                i = PkInviteUserListRefreshLayout.this.f12575d + ((int) (((float) (PkInviteUserListRefreshLayout.this.f12573b - PkInviteUserListRefreshLayout.this.f12575d)) * f));
            } else {
                i = 0;
            }
            int top = i - PkInviteUserListRefreshLayout.this.f12572a.getTop();
            int top2 = PkInviteUserListRefreshLayout.this.f12572a.getTop();
            if (top + top2 < 0) {
                top = 0 - top2;
            }
            PkInviteUserListRefreshLayout.this.setTargetOffsetTopAndBottom(top);
        }
    };

    /* renamed from: B */
    private final Runnable f12570B = new Runnable() {
        /* class com.bytedance.android.live.liveinteract.cohost.p279ui.view.PkInviteUserListRefreshLayout.RunnableC47926 */

        static {
            Covode.recordClassIndex(5371);
        }

        public final void run() {
            PkInviteUserListRefreshLayout.this.f12579h = true;
            PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout = PkInviteUserListRefreshLayout.this;
            int paddingTop = pkInviteUserListRefreshLayout.f12578g + PkInviteUserListRefreshLayout.this.getPaddingTop();
            Animation.AnimationListener animationListener = PkInviteUserListRefreshLayout.this.f12586o;
            pkInviteUserListRefreshLayout.f12575d = paddingTop;
            pkInviteUserListRefreshLayout.f12584m.reset();
            pkInviteUserListRefreshLayout.f12584m.setDuration((long) pkInviteUserListRefreshLayout.f12577f);
            pkInviteUserListRefreshLayout.f12584m.setAnimationListener(animationListener);
            pkInviteUserListRefreshLayout.f12584m.setInterpolator(pkInviteUserListRefreshLayout.f12580i);
            pkInviteUserListRefreshLayout.f12572a.startAnimation(pkInviteUserListRefreshLayout.f12584m);
        }
    };

    /* renamed from: C */
    private final Runnable f12571C = new Runnable() {
        /* class com.bytedance.android.live.liveinteract.cohost.p279ui.view.PkInviteUserListRefreshLayout.RunnableC47937 */

        static {
            Covode.recordClassIndex(5372);
        }

        public final void run() {
            PkInviteUserListRefreshLayout.this.f12579h = true;
            PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout = PkInviteUserListRefreshLayout.this;
            pkInviteUserListRefreshLayout.mo10506a(pkInviteUserListRefreshLayout.f12578g + PkInviteUserListRefreshLayout.this.getPaddingTop(), PkInviteUserListRefreshLayout.this.f12585n);
        }
    };

    /* renamed from: a */
    public View f12572a;

    /* renamed from: b */
    public int f12573b;

    /* renamed from: c */
    public AbstractC4796b f12574c;

    /* renamed from: d */
    public int f12575d;

    /* renamed from: e */
    public boolean f12576e;

    /* renamed from: f */
    int f12577f;

    /* renamed from: g */
    public int f12578g;

    /* renamed from: h */
    public boolean f12579h;

    /* renamed from: i */
    final DecelerateInterpolator f12580i;

    /* renamed from: j */
    public int f12581j;

    /* renamed from: k */
    public EnumC4797c f12582k = EnumC4797c.NORMAL;

    /* renamed from: l */
    public boolean f12583l;

    /* renamed from: m */
    final Animation f12584m = new Animation() {
        /* class com.bytedance.android.live.liveinteract.cohost.p279ui.view.PkInviteUserListRefreshLayout.C47882 */

        static {
            Covode.recordClassIndex(5367);
        }

        public final void applyTransformation(float f, Transformation transformation) {
            int i;
            if (PkInviteUserListRefreshLayout.this.f12575d != PkInviteUserListRefreshLayout.this.f12581j) {
                i = PkInviteUserListRefreshLayout.this.f12575d + ((int) (((float) (PkInviteUserListRefreshLayout.this.f12581j - PkInviteUserListRefreshLayout.this.f12575d)) * f));
            } else {
                i = 0;
            }
            int top = i - PkInviteUserListRefreshLayout.this.f12572a.getTop();
            int top2 = PkInviteUserListRefreshLayout.this.f12572a.getTop();
            if (top + top2 < 0) {
                top = 0 - top2;
            }
            PkInviteUserListRefreshLayout.this.setTargetOffsetTopAndBottom(top);
        }
    };

    /* renamed from: n */
    public final Animation.AnimationListener f12585n = new animationAnimation$AnimationListenerC4795a() {
        /* class com.bytedance.android.live.liveinteract.cohost.p279ui.view.PkInviteUserListRefreshLayout.C47893 */

        static {
            Covode.recordClassIndex(5368);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.view.PkInviteUserListRefreshLayout.animationAnimation$AnimationListenerC4795a
        public final void onAnimationEnd(Animation animation) {
            PkInviteUserListRefreshLayout.this.f12578g = 0;
            PkInviteUserListRefreshLayout.this.f12582k = EnumC4797c.NORMAL;
            PkInviteUserListRefreshLayout.this.f12583l = false;
            PkInviteUserListRefreshLayout.this.f12574c.mo10428c();
        }
    };

    /* renamed from: o */
    public final Animation.AnimationListener f12586o = new animationAnimation$AnimationListenerC4795a() {
        /* class com.bytedance.android.live.liveinteract.cohost.p279ui.view.PkInviteUserListRefreshLayout.C47904 */

        static {
            Covode.recordClassIndex(5369);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.p279ui.view.PkInviteUserListRefreshLayout.animationAnimation$AnimationListenerC4795a
        public final void onAnimationEnd(Animation animation) {
            PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout = PkInviteUserListRefreshLayout.this;
            pkInviteUserListRefreshLayout.f12578g = pkInviteUserListRefreshLayout.f12581j;
            PkInviteUserListRefreshLayout.this.f12582k = EnumC4797c.REFRESHING;
        }
    };

    /* renamed from: p */
    public final Runnable f12587p = new Runnable() {
        /* class com.bytedance.android.live.liveinteract.cohost.p279ui.view.PkInviteUserListRefreshLayout.RunnableC47915 */

        static {
            Covode.recordClassIndex(5370);
        }

        public final void run() {
            PkInviteUserListRefreshLayout.this.f12579h = true;
            PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout = PkInviteUserListRefreshLayout.this;
            pkInviteUserListRefreshLayout.mo10506a(pkInviteUserListRefreshLayout.f12578g + PkInviteUserListRefreshLayout.this.getPaddingTop(), PkInviteUserListRefreshLayout.this.f12585n);
        }
    };

    /* renamed from: r */
    private int f12588r;

    /* renamed from: s */
    private float f12589s = -1.0f;

    /* renamed from: t */
    private float f12590t;

    /* renamed from: u */
    private float f12591u;

    /* renamed from: v */
    private boolean f12592v;

    /* renamed from: w */
    private int f12593w = -1;

    /* renamed from: y */
    private View f12594y;

    /* renamed from: z */
    private boolean f12595z;

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout$b */
    public interface AbstractC4796b {
        static {
            Covode.recordClassIndex(5375);
        }

        /* renamed from: a */
        void mo10426a();

        /* renamed from: b */
        void mo10427b();

        /* renamed from: c */
        void mo10428c();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    /* renamed from: b */
    private boolean m10920b() {
        int i = Build.VERSION.SDK_INT;
        return this.f12572a.canScrollVertically(-1);
    }

    /* renamed from: c */
    private void m10921c() {
        removeCallbacks(this.f12571C);
        postDelayed(this.f12571C, 300);
    }

    static {
        Covode.recordClassIndex(5365);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f12571C);
        removeCallbacks(this.f12587p);
        removeCallbacks(this.f12570B);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f12587p);
        removeCallbacks(this.f12571C);
        removeCallbacks(this.f12570B);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout$c */
    enum EnumC4797c {
        NORMAL,
        LOOSEN,
        REFRESHING;

        static {
            Covode.recordClassIndex(5376);
        }
    }

    /* renamed from: a */
    private void m10917a() {
        if (this.f12572a == null) {
            if (getChildCount() <= 2 || isInEditMode()) {
                View childAt = getChildAt(1);
                this.f12572a = childAt;
                childAt.setOnTouchListener(new View.OnTouchListener() {
                    /* class com.bytedance.android.live.liveinteract.cohost.p279ui.view.PkInviteUserListRefreshLayout.View$OnTouchListenerC47948 */

                    static {
                        Covode.recordClassIndex(5373);
                    }

                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return PkInviteUserListRefreshLayout.this.f12583l;
                    }
                });
                this.f12573b = this.f12572a.getTop() + getPaddingTop();
            } else {
                throw new IllegalStateException("SwipeRefreshLayout can only host two children");
            }
        }
        if (this.f12589s == -1.0f && getParent() != null && ((View) getParent()).getHeight() > 0) {
            this.f12589s = (float) ((int) Math.min(((float) ((View) getParent()).getHeight()) * 0.6f, getResources().getDisplayMetrics().density * 120.0f));
        }
    }

    public void setOnRefreshListener(AbstractC4796b bVar) {
        this.f12574c = bVar;
    }

    public void setmIsDisable(boolean z) {
        this.f12595z = z;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.PkInviteUserListRefreshLayout$a  reason: invalid class name */
    class animationAnimation$AnimationListenerC4795a implements Animation.AnimationListener {
        static {
            Covode.recordClassIndex(5374);
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        private animationAnimation$AnimationListenerC4795a() {
        }

        /* synthetic */ animationAnimation$AnimationListenerC4795a(PkInviteUserListRefreshLayout pkInviteUserListRefreshLayout, byte b) {
            this();
        }
    }

    public void setRefreshing(boolean z) {
        if (this.f12576e != z) {
            m10917a();
            this.f12576e = z;
        }
    }

    /* renamed from: a */
    private void m10918a(int i) {
        int top = this.f12572a.getTop();
        float f = (float) i;
        float f2 = this.f12589s;
        if (f > f2) {
            i = ((int) f2) + (((int) (f - f2)) / 2);
        } else if (i < 0) {
            i = 0;
        }
        setTargetOffsetTopAndBottom(i - top);
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f12572a.offsetTopAndBottom(i);
        this.f12594y.offsetTopAndBottom(i);
        this.f12578g = this.f12572a.getTop();
        invalidate();
    }

    /* renamed from: a */
    private void m10919a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f12593w) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f12591u = motionEvent.getY(i);
            this.f12593w = motionEvent.getPointerId(i);
        }
    }

    /* renamed from: a */
    private static int m10916a(Resources resources) {
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
        if (this.f12595z) {
            return false;
        }
        m10917a();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f12579h && actionMasked == 0) {
            this.f12579h = false;
        }
        if (!isEnabled() || this.f12579h || m10920b()) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f12593w;
                    if (i == -1) {
                        C3854a.m9453a(6, f12567q, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        C3854a.m9453a(6, f12567q, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y = motionEvent.getY(findPointerIndex);
                    if (y - this.f12590t > ((float) this.f12588r)) {
                        this.f12591u = y;
                        this.f12592v = true;
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m10919a(motionEvent);
                    }
                }
            }
            this.f12592v = false;
            this.f12593w = -1;
        } else {
            float y2 = motionEvent.getY();
            this.f12590t = y2;
            this.f12591u = y2;
            this.f12593w = motionEvent.getPointerId(0);
            this.f12592v = false;
        }
        return this.f12592v;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f12595z) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f12579h && actionMasked == 0) {
            this.f12579h = false;
        }
        if (!isEnabled() || this.f12579h || m10920b()) {
            return false;
        }
        if (actionMasked == 0) {
            float y = motionEvent.getY();
            this.f12590t = y;
            this.f12591u = y;
            this.f12593w = motionEvent.getPointerId(0);
            this.f12592v = false;
        } else if (actionMasked == 1) {
            if (this.f12582k == EnumC4797c.LOOSEN) {
                removeCallbacks(this.f12571C);
                this.f12570B.run();
                setRefreshing(true);
                this.f12583l = true;
                AbstractC4796b bVar = this.f12574c;
                if (bVar != null) {
                    bVar.mo10427b();
                }
            } else {
                m10921c();
            }
            this.f12592v = false;
            this.f12593w = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f12593w);
            if (findPointerIndex < 0) {
                C3854a.m9453a(6, f12567q, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex);
            float f = y2 - this.f12590t;
            if (!this.f12592v && f > ((float) this.f12588r)) {
                this.f12592v = true;
            }
            if (this.f12592v) {
                AbstractC4796b bVar2 = this.f12574c;
                if (bVar2 != null) {
                    bVar2.mo10426a();
                }
                if (f > this.f12589s) {
                    if (this.f12582k == EnumC4797c.NORMAL) {
                        this.f12582k = EnumC4797c.LOOSEN;
                    }
                    m10918a((int) f);
                } else {
                    if (this.f12582k == EnumC4797c.LOOSEN) {
                        this.f12582k = EnumC4797c.NORMAL;
                    }
                    m10918a((int) f);
                    if (this.f12591u > y2 && this.f12572a.getTop() == getPaddingTop()) {
                        removeCallbacks(this.f12571C);
                    }
                }
                this.f12591u = y2;
            }
        } else if (actionMasked == 3) {
            m10921c();
            this.f12592v = false;
            this.f12593w = -1;
            return false;
        } else if (actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            this.f12591u = motionEvent.getY(actionIndex);
            this.f12593w = motionEvent.getPointerId(actionIndex);
        } else if (actionMasked == 6) {
            m10919a(motionEvent);
        }
        return true;
    }

    public PkInviteUserListRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(6312);
        this.f12588r = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f12577f = m10916a(getResources());
        this.f12580i = new DecelerateInterpolator(2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12568x);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(6312);
    }

    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(6465);
        super.onMeasure(i, i2);
        if (getChildCount() <= 1) {
            IllegalStateException illegalStateException = new IllegalStateException("SwipeRefreshLayout must have the headerview and contentview");
            MethodCollector.m26664o(6465);
            throw illegalStateException;
        } else if (getChildCount() <= 2 || isInEditMode()) {
            if (this.f12594y == null) {
                View childAt = getChildAt(0);
                this.f12594y = childAt;
                measureChild(childAt, i, i2);
                int measuredHeight = this.f12594y.getMeasuredHeight();
                this.f12581j = measuredHeight;
                this.f12589s = (float) measuredHeight;
            }
            getChildAt(1).measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            MethodCollector.m26664o(6465);
        } else {
            IllegalStateException illegalStateException2 = new IllegalStateException("SwipeRefreshLayout can only host two children");
            MethodCollector.m26664o(6465);
            throw illegalStateException2;
        }
    }

    /* renamed from: a */
    public final void mo10506a(int i, Animation.AnimationListener animationListener) {
        this.f12575d = i;
        this.f12569A.reset();
        this.f12569A.setDuration((long) this.f12577f);
        this.f12569A.setAnimationListener(animationListener);
        this.f12569A.setInterpolator(this.f12580i);
        this.f12572a.startAnimation(this.f12569A);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0 && getChildCount() != 1) {
            View childAt = getChildAt(1);
            int paddingLeft = getPaddingLeft();
            int paddingTop = this.f12578g + getPaddingTop();
            int paddingLeft2 = ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft;
            childAt.layout(paddingLeft, paddingTop, paddingLeft2, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            this.f12594y.layout(paddingLeft, paddingTop - this.f12581j, paddingLeft2, paddingTop);
        }
    }
}
