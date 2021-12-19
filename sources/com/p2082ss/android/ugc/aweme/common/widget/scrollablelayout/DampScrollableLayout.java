package com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38676bc;
import com.p2082ss.android.ugc.aweme.common.p2636h.C39122a;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout */
public class DampScrollableLayout extends LinearLayout {

    /* renamed from: a */
    public static final String f92544a = DampScrollableLayout.class.getSimpleName();

    /* renamed from: A */
    protected int f92545A;

    /* renamed from: B */
    protected boolean f92546B;

    /* renamed from: C */
    protected int f92547C;

    /* renamed from: D */
    protected int f92548D;

    /* renamed from: E */
    protected int f92549E;

    /* renamed from: F */
    protected int f92550F;

    /* renamed from: G */
    protected int f92551G;

    /* renamed from: H */
    protected boolean f92552H;

    /* renamed from: I */
    protected int f92553I;

    /* renamed from: J */
    public AbstractC38676bc f92554J;

    /* renamed from: K */
    protected boolean f92555K;

    /* renamed from: L */
    public List<ScrollableLayout.AbstractC39210b> f92556L;

    /* renamed from: M */
    protected ScrollableLayout.AbstractC39210b f92557M;

    /* renamed from: N */
    protected C39211a f92558N;

    /* renamed from: O */
    protected boolean f92559O;

    /* renamed from: P */
    private boolean f92560P;

    /* renamed from: Q */
    private boolean f92561Q;

    /* renamed from: b */
    protected Context f92562b;

    /* renamed from: c */
    protected Scroller f92563c;

    /* renamed from: d */
    protected float f92564d;

    /* renamed from: e */
    protected float f92565e;

    /* renamed from: f */
    protected float f92566f;

    /* renamed from: g */
    protected float f92567g;

    /* renamed from: h */
    protected VelocityTracker f92568h;

    /* renamed from: i */
    protected int f92569i;

    /* renamed from: j */
    protected int f92570j;

    /* renamed from: k */
    protected int f92571k;

    /* renamed from: l */
    protected boolean f92572l;

    /* renamed from: m */
    protected float f92573m;

    /* renamed from: n */
    protected float f92574n;

    /* renamed from: o */
    protected float f92575o;

    /* renamed from: p */
    protected float f92576p;

    /* renamed from: q */
    protected float f92577q;

    /* renamed from: r */
    protected float f92578r;

    /* renamed from: s */
    protected View f92579s;

    /* renamed from: t */
    protected ViewPager f92580t;

    /* renamed from: u */
    protected EnumC39208a f92581u;

    /* renamed from: v */
    protected int f92582v;

    /* renamed from: w */
    protected int f92583w;

    /* renamed from: x */
    protected int f92584x;

    /* renamed from: y */
    protected boolean f92585y;

    /* renamed from: z */
    protected boolean f92586z;

    public int getCurScrollY() {
        return this.f92551G;
    }

    public C39211a getHelper() {
        return this.f92558N;
    }

    public int getMaxY() {
        return this.f92548D;
    }

    public int getMinY() {
        return this.f92547C;
    }

    public int getTabsMarginTop() {
        return this.f92550F;
    }

    /* renamed from: c */
    private void m79550c() {
        this.f92563c.forceFinished(true);
    }

    static {
        Covode.recordClassIndex(46839);
    }

    /* renamed from: b */
    public boolean mo68060b() {
        if (this.f92551G >= this.f92548D) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo68057a() {
        if (this.f92551G != 0) {
            scrollTo(0, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout$a */
    public enum EnumC39208a {
        UP,
        DOWN;

        static {
            Covode.recordClassIndex(46840);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        View view = this.f92579s;
        if (view != null && !view.isClickable()) {
            this.f92579s.setClickable(true);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof ViewPager)) {
                this.f92580t = (ViewPager) childAt;
            }
        }
        super.onFinishInflate();
    }

    public void computeScroll() {
        if (this.f92563c.computeScrollOffset()) {
            int currY = this.f92563c.getCurrY();
            if (this.f92581u == EnumC39208a.UP) {
                if (mo68060b()) {
                    int finalY = this.f92563c.getFinalY() - currY;
                    int duration = this.f92563c.getDuration() - this.f92563c.timePassed();
                    this.f92558N.mo68099a(m79549a(finalY, duration), finalY, duration);
                    m79550c();
                    return;
                }
                scrollTo(0, currY);
            } else if (this.f92558N.mo68100b()) {
                scrollTo(0, getScrollY() + (currY - this.f92545A));
                if ((Math.abs(m79549a(this.f92563c.getFinalY() - currY, this.f92563c.getDuration() - this.f92563c.timePassed())) <= 0 || Math.abs(Math.max(this.f92563c.getFinalY(), this.f92547C) - this.f92551G) < 5) && this.f92551G < this.f92549E) {
                    this.f92563c.abortAnimation();
                    Scroller scroller = this.f92563c;
                    int i = this.f92551G;
                    scroller.startScroll(0, i, 0, -i, Math.abs(i) * 2);
                    this.f92581u = EnumC39208a.UP;
                    return;
                } else if (this.f92551G <= this.f92547C) {
                    m79550c();
                    if ((getParent() instanceof SpringLayout) && this.f92561Q) {
                        float currVelocity = this.f92563c.getCurrVelocity();
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
            this.f92545A = currY;
        }
    }

    public void setMinY(int i) {
        this.f92547C = i;
    }

    public void setOnScrollListener(ScrollableLayout.AbstractC39210b bVar) {
        this.f92557M = bVar;
    }

    public void setScrollMinY(int i) {
        this.f92553I = i;
    }

    public void setTabsMarginTop(int i) {
        this.f92550F = i;
        this.f92560P = true;
    }

    public void setMaxScrollHeight(int i) {
        int min = Math.min(i, this.f92582v - this.f92550F);
        this.f92548D = min;
        this.f92548D = Math.max(min, 0);
    }

    /* renamed from: a */
    public final void mo68058a(float f) {
        Float valueOf = Float.valueOf(1.0f);
        C39122a.m79418a(this, new C89378p(valueOf, valueOf), new C89378p(valueOf, Float.valueOf(f)));
        this.f92563c.abortAnimation();
    }

    public boolean canScrollVertically(int i) {
        View a = this.f92558N.mo68098a();
        if (i < 0) {
            if (getScrollY() > this.f92547C) {
                return true;
            }
            return false;
        } else if (i <= 0 || a == null) {
            return super.canScrollVertically(i);
        } else {
            if (a.canScrollVertically(i) || getScrollY() < this.f92548D) {
                return true;
            }
            return false;
        }
    }

    public void setCanScrollUp(boolean z) {
        if (z) {
            this.f92548D = this.f92582v - this.f92550F;
        }
        if (this.f92560P || this.f92555K != z) {
            this.f92555K = z;
            if (!z) {
                if (this.f92551G != 0) {
                    scrollTo(0, 0);
                }
                this.f92548D = 0;
            }
            this.f92560P = false;
        }
    }

    /* renamed from: a */
    public final void mo68059a(ScrollableLayout.AbstractC39210b bVar) {
        if (bVar != null && !this.f92556L.contains(bVar)) {
            this.f92556L.add(bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016f, code lost:
        if (r4.av_() == false) goto L_0x0171;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r17) {
        /*
        // Method dump skipped, instructions count: 577
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public DampScrollableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private int m79549a(int i, int i2) {
        if (this.f92563c == null || i2 == 0) {
            return 0;
        }
        return i / i2;
    }

    public void scrollBy(int i, int i2) {
        int i3;
        int scrollY = getScrollY();
        if (i2 < 0 && (i3 = scrollY + i2) < this.f92549E) {
            i2 = (int) (((float) i2) * 1.2f * (1.0f - ((1.0f / ((float) this.f92547C)) * ((float) i3))));
        }
        int i4 = i2 + scrollY;
        int i5 = this.f92548D;
        if (i4 >= i5 || i4 <= (i5 = this.f92547C)) {
            i4 = i5;
        }
        super.scrollBy(i, i4 - scrollY);
    }

    public void scrollTo(int i, int i2) {
        int i3 = this.f92548D;
        if (i2 >= i3 || i2 <= (i3 = this.f92547C)) {
            i2 = i3;
        }
        this.f92551G = i2;
        ScrollableLayout.AbstractC39210b bVar = this.f92557M;
        if (bVar != null && (!(bVar instanceof AbstractC18234b) || ((AbstractC18234b) bVar).af_())) {
            this.f92557M.mo62635b(i2, this.f92548D);
        }
        for (ScrollableLayout.AbstractC39210b bVar2 : this.f92556L) {
            bVar2.mo62635b(i2, this.f92548D);
        }
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(9164);
        View childAt = getChildAt(0);
        this.f92579s = childAt;
        if (childAt != null) {
            measureChildWithMargins(childAt, i, 0, 0, 0);
            this.f92582v = this.f92579s.getMeasuredHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) + (this.f92582v - this.f92550F), 1073741824));
        if (!this.f92559O) {
            this.f92548D = this.f92582v - this.f92550F;
            this.f92559O = true;
        }
        if (!this.f92555K) {
            this.f92548D = 0;
        }
        MethodCollector.m26664o(9164);
    }

    public DampScrollableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(9010);
        this.f92553I = 10;
        this.f92555K = true;
        this.f92556L = new ArrayList();
        this.f92559O = false;
        this.f92562b = context;
        this.f92558N = new C39211a();
        this.f92563c = new Scroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f92569i = viewConfiguration.getScaledTouchSlop();
        this.f92570j = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f92571k = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f92584x = Build.VERSION.SDK_INT;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ahd});
        this.f92550F = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(9010);
    }
}
