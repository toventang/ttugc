package com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout */
public class ScrollableLayout extends LinearLayout {

    /* renamed from: A */
    protected boolean f92589A;

    /* renamed from: B */
    protected int f92590B;

    /* renamed from: C */
    protected int f92591C;

    /* renamed from: D */
    protected int f92592D;

    /* renamed from: E */
    protected int f92593E;

    /* renamed from: F */
    protected boolean f92594F;

    /* renamed from: G */
    protected int f92595G;

    /* renamed from: H */
    protected boolean f92596H;

    /* renamed from: I */
    protected AbstractC39210b f92597I;

    /* renamed from: J */
    protected C39211a f92598J;

    /* renamed from: K */
    protected boolean f92599K;

    /* renamed from: L */
    int f92600L;

    /* renamed from: M */
    private boolean f92601M;

    /* renamed from: a */
    protected Context f92602a;

    /* renamed from: b */
    protected Scroller f92603b;

    /* renamed from: c */
    protected float f92604c;

    /* renamed from: d */
    protected float f92605d;

    /* renamed from: e */
    protected float f92606e;

    /* renamed from: f */
    protected float f92607f;

    /* renamed from: g */
    protected VelocityTracker f92608g;

    /* renamed from: h */
    protected int f92609h;

    /* renamed from: i */
    protected int f92610i;

    /* renamed from: j */
    protected int f92611j;

    /* renamed from: k */
    protected boolean f92612k;

    /* renamed from: l */
    protected float f92613l;

    /* renamed from: m */
    protected float f92614m;

    /* renamed from: n */
    protected float f92615n;

    /* renamed from: o */
    protected float f92616o;

    /* renamed from: p */
    protected float f92617p;

    /* renamed from: q */
    protected float f92618q;

    /* renamed from: r */
    protected View f92619r;

    /* renamed from: s */
    protected ViewPager f92620s;

    /* renamed from: t */
    protected EnumC39209a f92621t;

    /* renamed from: u */
    protected int f92622u;

    /* renamed from: v */
    protected int f92623v;

    /* renamed from: w */
    protected int f92624w;

    /* renamed from: x */
    protected boolean f92625x;

    /* renamed from: y */
    protected boolean f92626y;

    /* renamed from: z */
    protected int f92627z;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout$b */
    public interface AbstractC39210b {
        static {
            Covode.recordClassIndex(46843);
        }

        /* renamed from: a */
        void mo62628a(float f, float f2);

        boolean av_();

        /* renamed from: b */
        void mo62635b(int i, int i2);
    }

    static {
        Covode.recordClassIndex(46841);
    }

    public int getCurScrollY() {
        return this.f92593E;
    }

    public C39211a getHelper() {
        return this.f92598J;
    }

    public int getMaxY() {
        return this.f92591C;
    }

    public int getMinY() {
        return this.f92590B;
    }

    public int getTabsMarginTop() {
        return this.f92592D;
    }

    /* renamed from: b */
    private boolean m79555b() {
        if (this.f92593E >= this.f92591C) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo68079a() {
        if (this.f92593E != 0) {
            scrollTo(0, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout$a */
    public enum EnumC39209a {
        UP,
        DOWN;

        static {
            Covode.recordClassIndex(46842);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        View view = this.f92619r;
        if (view != null && !view.isClickable()) {
            this.f92619r.setClickable(true);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof ViewPager)) {
                this.f92620s = (ViewPager) childAt;
            }
        }
        super.onFinishInflate();
    }

    public void computeScroll() {
        if (this.f92603b.computeScrollOffset()) {
            int currY = this.f92603b.getCurrY();
            int i = 0;
            if (this.f92621t != EnumC39209a.UP) {
                if (this.f92598J.mo68100b()) {
                    scrollTo(0, getScrollY() + (currY - this.f92627z));
                    if (this.f92593E <= this.f92590B) {
                        this.f92603b.forceFinished(true);
                        if ((getParent() instanceof SpringLayout) && this.f92601M) {
                            float currVelocity = this.f92603b.getCurrVelocity();
                            if (currVelocity > 0.0f) {
                                currVelocity = -currVelocity;
                            }
                            ((SpringLayout) getParent()).mo38159a(currVelocity);
                            return;
                        }
                        return;
                    }
                }
                invalidate();
            } else if (m79555b()) {
                int finalY = this.f92603b.getFinalY() - currY;
                int duration = this.f92603b.getDuration() - this.f92603b.timePassed();
                C39211a aVar = this.f92598J;
                Scroller scroller = this.f92603b;
                if (scroller != null) {
                    if (this.f92624w >= 14) {
                        i = (int) scroller.getCurrVelocity();
                    } else {
                        i = finalY / duration;
                    }
                }
                aVar.mo68099a(i, finalY, duration);
                this.f92603b.forceFinished(true);
                return;
            } else {
                scrollTo(0, currY);
            }
            this.f92627z = currY;
        }
    }

    public void setMinY(int i) {
        this.f92590B = i;
    }

    public void setOnScrollListener(AbstractC39210b bVar) {
        this.f92597I = bVar;
    }

    public void setScrollMinY(int i) {
        this.f92595G = i;
    }

    public void setTabsMarginTop(int i) {
        this.f92592D = i;
    }

    public void setCanScrollUp(boolean z) {
        if (this.f92596H != z) {
            this.f92596H = z;
            if (z) {
                this.f92591C = this.f92622u - this.f92592D;
                return;
            }
            if (this.f92593E != 0) {
                scrollTo(0, 0);
            }
            this.f92591C = 0;
        }
    }

    public void setMaxScrollHeight(int i) {
        int min = Math.min(i, this.f92622u - this.f92592D);
        this.f92591C = min;
        this.f92591C = Math.max(min, 0);
    }

    public boolean canScrollVertically(int i) {
        View a;
        if (i < 0) {
            if (getScrollY() > this.f92590B) {
                return true;
            }
            return false;
        } else if (i <= 0 || (a = this.f92598J.mo68098a()) == null) {
            return super.canScrollVertically(i);
        } else {
            if (a.canScrollVertically(i) || getScrollY() < this.f92591C) {
                return true;
            }
            return false;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        EnumC39209a aVar;
        int i;
        try {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int abs = (int) Math.abs(x - this.f92604c);
            int abs2 = (int) Math.abs(y - this.f92605d);
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f92589A = false;
                this.f92612k = false;
                this.f92613l = motionEvent.getRawX();
                this.f92614m = motionEvent.getRawY();
                this.f92625x = true;
                this.f92626y = true;
                this.f92604c = x;
                this.f92605d = y;
                this.f92606e = x;
                this.f92607f = y;
                this.f92623v = getScrollY();
                if (((int) y) + getScrollY() <= this.f92622u) {
                    z = true;
                } else {
                    z = false;
                }
                this.f92594F = z;
                VelocityTracker velocityTracker = this.f92608g;
                if (velocityTracker == null) {
                    this.f92608g = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                this.f92608g.addMovement(motionEvent);
                this.f92603b.forceFinished(true);
                this.f92601M = false;
            } else if (action == 1) {
                AbstractC39210b bVar = this.f92597I;
                if (bVar != null) {
                    bVar.av_();
                }
                if (this.f92626y && abs2 > abs && abs2 > this.f92609h) {
                    this.f92608g.computeCurrentVelocity(1000, (float) this.f92611j);
                    float f = -this.f92608g.getYVelocity();
                    if (Math.abs(f) > ((float) this.f92610i)) {
                        if (f > 0.0f) {
                            aVar = EnumC39209a.UP;
                        } else {
                            aVar = EnumC39209a.DOWN;
                        }
                        this.f92621t = aVar;
                        if (aVar != EnumC39209a.UP || !m79555b()) {
                            this.f92603b.fling(0, getScrollY(), 0, (int) f, 0, 0, -2147483647, Integer.MAX_VALUE);
                            this.f92601M = true;
                            this.f92603b.computeScrollOffset();
                            this.f92627z = getScrollY();
                            invalidate();
                        }
                    }
                    if (this.f92594F || !m79555b()) {
                        int action2 = motionEvent.getAction();
                        motionEvent.setAction(3);
                        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                        motionEvent.setAction(action2);
                        return dispatchTouchEvent;
                    }
                }
            } else if (action != 2) {
                if (action == 3) {
                    AbstractC39210b bVar2 = this.f92597I;
                    if (bVar2 != null) {
                        bVar2.av_();
                    }
                    if (this.f92626y && this.f92594F && (abs > (i = this.f92609h) || abs2 > i)) {
                        int action3 = motionEvent.getAction();
                        motionEvent.setAction(3);
                        boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                        motionEvent.setAction(action3);
                        return dispatchTouchEvent2;
                    }
                }
            } else if (!this.f92589A) {
                if (this.f92608g == null) {
                    this.f92608g = VelocityTracker.obtain();
                }
                this.f92608g.addMovement(motionEvent);
                float f2 = this.f92607f - y;
                AbstractC39210b bVar3 = this.f92597I;
                if (bVar3 != null) {
                    bVar3.mo62628a(this.f92606e - x, f2);
                }
                if (this.f92625x) {
                    int i2 = this.f92609h;
                    if (abs > i2 && abs > abs2) {
                        this.f92625x = false;
                        this.f92626y = false;
                    } else if (abs2 > i2 && abs2 > abs) {
                        this.f92625x = false;
                        this.f92626y = true;
                    }
                }
                if (this.f92626y && abs2 > this.f92609h && abs2 > abs && (!m79555b() || this.f92598J.mo68100b())) {
                    ViewPager viewPager = this.f92620s;
                    if (viewPager != null) {
                        viewPager.requestDisallowInterceptTouchEvent(true);
                    }
                    scrollBy(0, (int) (f2 + 0.5f));
                }
                this.f92606e = x;
                this.f92607f = y;
                this.f92615n = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                this.f92616o = rawY;
                this.f92617p = (float) ((int) (this.f92615n - this.f92613l));
                float f3 = (float) ((int) (rawY - this.f92614m));
                this.f92618q = f3;
                if (Math.abs(f3) <= ((float) this.f92595G) || Math.abs(this.f92618q) * 0.1f <= Math.abs(this.f92617p)) {
                    this.f92612k = true;
                } else {
                    this.f92612k = false;
                }
            }
            super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return true;
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void scrollBy(int i, int i2) {
        int scrollY = getScrollY();
        if (scrollY + i2 < this.f92600L) {
            i2 /= 3;
        }
        int i3 = i2 + scrollY;
        int i4 = this.f92591C;
        if (i3 >= i4 || i3 <= (i4 = this.f92590B)) {
            i3 = i4;
        }
        super.scrollBy(i, i3 - scrollY);
    }

    public void scrollTo(int i, int i2) {
        int i3 = this.f92591C;
        if (i2 >= i3) {
            i2 = i3;
        } else {
            int i4 = this.f92590B;
            if (i2 <= i4) {
                i2 = i4;
            }
        }
        this.f92593E = i2;
        AbstractC39210b bVar = this.f92597I;
        if (bVar != null) {
            bVar.mo62635b(i2, i3);
        }
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(11040);
        View childAt = getChildAt(0);
        this.f92619r = childAt;
        if (childAt != null) {
            measureChildWithMargins(childAt, i, 0, 0, 0);
            this.f92622u = this.f92619r.getMeasuredHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) + (this.f92622u - this.f92592D), 1073741824));
        if (!this.f92599K) {
            this.f92591C = this.f92622u - this.f92592D;
            this.f92599K = true;
        }
        if (!this.f92596H) {
            this.f92591C = 0;
        }
        MethodCollector.m26664o(11040);
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(10891);
        this.f92595G = 10;
        this.f92596H = true;
        this.f92602a = context;
        this.f92598J = new C39211a();
        this.f92603b = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f92609h = viewConfiguration.getScaledTouchSlop();
        this.f92610i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f92611j = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f92624w = Build.VERSION.SDK_INT;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ahd});
        this.f92592D = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(10891);
    }
}
