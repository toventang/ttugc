package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import androidx.core.p030b.C0622a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34691k;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49758k;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49759l;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49760m;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout */
public class SlideSwitchLayout extends HorizontalScrollView {

    /* renamed from: b */
    public static final int f115402b = C34723i.m70930c(C17867d.m33078a());

    /* renamed from: d */
    public static final int f115403d = ((int) C13628n.m24520b(C17867d.m33078a(), 8.0f));

    /* renamed from: q */
    private static final int f115404q = ViewConfiguration.getMaximumFlingVelocity();

    /* renamed from: x */
    private static final int f115405x = ((int) C13628n.m24520b(C17867d.m33078a(), 500.0f));

    /* renamed from: A */
    private Runnable f115406A;

    /* renamed from: B */
    private AbstractC34691k f115407B;

    /* renamed from: C */
    private AbstractC49760m f115408C;

    /* renamed from: D */
    private AbstractC49759l f115409D;

    /* renamed from: a */
    boolean f115410a;

    /* renamed from: c */
    public boolean f115411c;

    /* renamed from: e */
    public long f115412e;

    /* renamed from: f */
    public boolean f115413f;

    /* renamed from: g */
    public int f115414g;

    /* renamed from: h */
    public int f115415h;

    /* renamed from: i */
    boolean f115416i;

    /* renamed from: j */
    public AbstractC49758k f115417j;

    /* renamed from: k */
    private boolean f115418k;

    /* renamed from: l */
    private int f115419l;

    /* renamed from: m */
    private int f115420m;

    /* renamed from: n */
    private int f115421n;

    /* renamed from: o */
    private List<C50018a> f115422o;

    /* renamed from: p */
    private VelocityTracker f115423p;

    /* renamed from: r */
    private int f115424r;

    /* renamed from: s */
    private int f115425s;

    /* renamed from: t */
    private int f115426t;

    /* renamed from: u */
    private boolean f115427u;

    /* renamed from: v */
    private boolean f115428v;

    /* renamed from: w */
    private boolean f115429w;

    /* renamed from: y */
    private boolean f115430y;

    /* renamed from: z */
    private boolean f115431z;

    public void fling(int i) {
    }

    public int getCurrentItem() {
        return this.f115415h;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a */
    public static class C50018a {

        /* renamed from: a */
        public int f115437a;

        /* renamed from: b */
        public String f115438b;

        /* renamed from: c */
        public boolean f115439c = true;

        static {
            Covode.recordClassIndex(59140);
        }

        public final int hashCode() {
            return this.f115438b.hashCode();
        }

        public C50018a(String str) {
            this.f115438b = str;
            this.f115437a = 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C50018a)) {
                return false;
            }
            return this.f115438b.equals(((C50018a) obj).f115438b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85083a() {
        m93900b(this.f115415h);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f115423p = VelocityTracker.obtain();
    }

    public String getCurrentItemName() {
        if (this.f115422o.isEmpty()) {
            return "";
        }
        return this.f115422o.get(this.f115415h).f115438b;
    }

    static {
        Covode.recordClassIndex(59136);
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
    }

    public void setCanScroll(boolean z) {
        this.f115411c = z;
    }

    public void setOnFeedScrollListener(AbstractC49759l lVar) {
        this.f115409D = lVar;
    }

    public void setOnFlingEndListener(AbstractC34691k kVar) {
        this.f115407B = kVar;
    }

    public void setOnFlingToIndexListener(AbstractC49760m mVar) {
        this.f115408C = mVar;
    }

    public void setOnPageChangeListener(AbstractC49758k kVar) {
        this.f115417j = kVar;
    }

    public void setOverScrollLeftAction(Runnable runnable) {
        this.f115406A = runnable;
    }

    public void setScrowToChildWhenRequestChildFocus(boolean z) {
        this.f115418k = z;
    }

    /* renamed from: b */
    private void m93900b(int i) {
        setScrollX(i * f115402b);
    }

    private void setCurrentItem(int i) {
        m93896a(i, true, "FROM_SLIDE");
    }

    /* renamed from: b */
    private boolean m93901b(MotionEvent motionEvent) {
        if (!m93903d(motionEvent) || !m93902c(motionEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m93902c(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (this.f115418k) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        }
        return 0;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            mo85083a();
        }
    }

    public void setCurrentItem(String str) {
        m93897a(str, true, "FROM_SLIDE");
    }

    /* renamed from: b */
    public final void mo85085b(String str) {
        m93897a(str, false, "FROM_SLIDE");
    }

    public void setCanScrollToProfile(boolean z) {
        for (int i = 0; i < this.f115422o.size(); i++) {
            C50018a aVar = this.f115422o.get(i);
            if (TextUtils.equals(aVar.f115438b, "page_profile")) {
                aVar.f115439c = z;
                return;
            }
        }
    }

    /* renamed from: d */
    private boolean m93903d(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        Runnable runnable;
        int findPointerIndex = motionEvent.findPointerIndex(this.f115424r);
        boolean z4 = false;
        if (findPointerIndex == -1) {
            return false;
        }
        int x = (int) motionEvent.getX(findPointerIndex);
        int abs = Math.abs(x - this.f115419l);
        int i2 = f115402b;
        if (abs <= i2) {
            z = true;
        } else {
            z = false;
        }
        int i3 = this.f115419l;
        if (x - i3 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            int i4 = this.f115421n - (x - i3);
            int i5 = this.f115415h;
            if (i5 <= 0) {
                i = i5;
            } else {
                i = i5 - 1;
            }
            int i6 = this.f115420m;
            if (i5 < i6) {
                i6 = i5 + 1;
            }
            if (i4 < 0 || !m93898a(i)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i4 <= this.f115420m * i2 && m93898a(i6)) {
                z4 = true;
            }
            if (z2) {
                z = z3;
            } else {
                z = z4;
            }
            if (!z3 && !this.f115431z && (runnable = this.f115406A) != null) {
                this.f115431z = true;
                runnable.run();
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m93898a(int i) {
        if (this.f115422o.isEmpty() || i >= this.f115422o.size()) {
            return false;
        }
        return this.f115422o.get(i).f115439c;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f115411c) {
            return false;
        }
        if (this.f115413f) {
            return true;
        }
        if (this.f115412e != 0 && System.currentTimeMillis() - this.f115412e < 150) {
            return this.f115416i;
        }
        if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
            return false;
        }
        this.f115416i = false;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f115425s = (int) motionEvent.getX();
            this.f115426t = (int) motionEvent.getY();
            m93899a(motionEvent);
            this.f115429w = true;
        } else if (action == 1) {
            this.f115416i = false;
        } else if (action != 2) {
            this.f115416i = true;
        } else {
            float abs = Math.abs(((float) this.f115425s) - motionEvent.getX());
            float abs2 = Math.abs(((float) this.f115426t) - motionEvent.getY());
            int i = f115403d;
            if ((abs > ((float) i) || abs2 > ((float) i)) && this.f115429w) {
                if (abs - abs2 >= 0.0f) {
                    this.f115416i = true;
                } else {
                    this.f115416i = false;
                }
                this.f115429w = false;
            }
        }
        return this.f115416i;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        if (!this.f115411c) {
            return false;
        }
        int action = motionEvent.getAction();
        if (this.f115423p == null) {
            this.f115423p = VelocityTracker.obtain();
        }
        this.f115423p.addMovement(motionEvent);
        if (action == 0) {
            return m93899a(motionEvent);
        }
        if (action != 1) {
            if (action == 2) {
                if (this.f115409D != null) {
                    getScrollX();
                }
                return m93901b(motionEvent);
            } else if (action != 3) {
                return false;
            }
        }
        int x = (int) motionEvent.getX();
        VelocityTracker velocityTracker = this.f115423p;
        if (x <= this.f115425s) {
            z = true;
        } else {
            z = false;
        }
        velocityTracker.computeCurrentVelocity(1000, (float) f115404q);
        float xVelocity = velocityTracker.getXVelocity(this.f115424r);
        int scrollX = getScrollX();
        int i2 = f115402b;
        int i3 = scrollX % i2;
        if (i3 == 0) {
            AbstractC34691k kVar = this.f115407B;
            if (kVar != null && z) {
                kVar.mo61352a();
            }
        } else {
            int scrollX2 = getScrollX() / i2;
            if (Math.abs(xVelocity) >= ((float) f115405x) ? xVelocity >= 0.0f : i3 <= i2 / 2) {
                i = 0;
            } else {
                i = 1;
            }
            m93896a(C0622a.m2312a(scrollX2 + i, 0, this.f115420m), true, "FROM_SLIDE");
            VelocityTracker velocityTracker2 = this.f115423p;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
                this.f115423p.recycle();
                this.f115423p = null;
            }
        }
        this.f115430y = false;
        boolean b = m93901b(motionEvent);
        this.f115431z = false;
        return b;
    }

    /* renamed from: a */
    private boolean m93899a(MotionEvent motionEvent) {
        this.f115424r = motionEvent.getPointerId(0);
        this.f115419l = (int) motionEvent.getX();
        this.f115421n = getScrollX();
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo85084a(String str) {
        if (C80471gb.m139483a(getContext())) {
            this.f115422o.add(0, new C50018a(str));
        } else {
            this.f115422o.add(new C50018a(str));
        }
        this.f115420m = this.f115422o.size() - 1;
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    public SlideSwitchLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void scrollBy(int i, int i2) {
        if ((-i) != f115402b) {
            super.scrollBy(i, i2);
        }
    }

    /* renamed from: a */
    private void m93895a(final int i, final String str) {
        post(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.SlideSwitchLayout.RunnableC500162 */

            static {
                Covode.recordClassIndex(59138);
            }

            public final void run() {
                SlideSwitchLayout.this.smoothScrollTo(i * SlideSwitchLayout.f115402b, 0);
                SlideSwitchLayout.this.f115412e = System.currentTimeMillis();
                SlideSwitchLayout slideSwitchLayout = SlideSwitchLayout.this;
                slideSwitchLayout.f115414g = slideSwitchLayout.f115415h;
                SlideSwitchLayout.this.f115415h = i;
            }
        });
        this.f115413f = true;
        postDelayed(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.SlideSwitchLayout.RunnableC500173 */

            static {
                Covode.recordClassIndex(59139);
            }

            public final void run() {
                SlideSwitchLayout.this.f115413f = false;
            }
        }, 150);
    }

    public void requestChildFocus(View view, View view2) {
        if (!(view2 == null || view2.getTag() == null)) {
            Object tag = view2.getTag();
            if ((tag instanceof String) && TextUtils.equals((String) tag, "relation_search_tag")) {
                super.requestChildFocus(view, view2);
                return;
            }
        }
        if (!TextUtils.equals(getCurrentItemName(), "page_feed")) {
            super.requestChildFocus(view, view2);
        }
    }

    private SlideSwitchLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(8696);
        this.f115418k = true;
        this.f115422o = new ArrayList(5);
        this.f115411c = false;
        this.f115427u = true;
        this.f115428v = true;
        this.f115429w = false;
        this.f115413f = false;
        this.f115414g = 0;
        this.f115415h = 0;
        this.f115430y = false;
        this.f115416i = false;
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.SlideSwitchLayout.ViewTreeObserver$OnPreDrawListenerC500151 */

            static {
                Covode.recordClassIndex(59137);
            }

            public final boolean onPreDraw() {
                SlideSwitchLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                SlideSwitchLayout slideSwitchLayout = SlideSwitchLayout.this;
                if (slideSwitchLayout.f115410a) {
                    return false;
                }
                slideSwitchLayout.f115410a = true;
                slideSwitchLayout.mo85083a();
                return false;
            }
        });
        MethodCollector.m26664o(8696);
    }

    /* renamed from: a */
    private void m93896a(int i, boolean z, String str) {
        if (!z) {
            int i2 = this.f115415h;
            if (i != i2) {
                this.f115414g = i2;
                this.f115415h = i;
                if (this.f115410a) {
                    m93900b(i);
                }
            }
        } else if (i != this.f115415h || getScrollX() != f115402b * i) {
            m93895a(i, str);
        }
    }

    /* renamed from: a */
    private void m93897a(String str, boolean z, String str2) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f115422o.size()) {
                break;
            } else if (TextUtils.equals(str, this.f115422o.get(i2).f115438b)) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        m93896a(i, z, str2);
    }
}
