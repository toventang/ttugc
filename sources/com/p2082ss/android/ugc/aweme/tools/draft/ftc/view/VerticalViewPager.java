package com.p2082ss.android.ugc.aweme.tools.draft.ftc.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.core.p033d.AbstractC0653f;
import androidx.core.p033d.C0651e;
import androidx.core.p037h.AbstractC0788r;
import androidx.core.p037h.C0726a;
import androidx.core.p037h.C0753ad;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.p038a.C0733d;
import androidx.core.p037h.p038a.C0740f;
import androidx.core.widget.C0819d;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.widget.AbstractC39191c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager */
public class VerticalViewPager extends AbstractC39191c {

    /* renamed from: a */
    public static final int[] f175998a = {16842931};

    /* renamed from: ak */
    private static final C78364h f175999ak = new C78364h();

    /* renamed from: b */
    public static final Interpolator f176000b = new Interpolator() {
        /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager.animationInterpolatorC783532 */

        static {
            Covode.recordClassIndex(91475);
        }

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: e */
    static Field f176001e;

    /* renamed from: h */
    private static final Comparator<C78359c> f176002h = new Comparator<C78359c>() {
        /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager.C783521 */

        static {
            Covode.recordClassIndex(91474);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C78359c cVar, C78359c cVar2) {
            return cVar.f176068b - cVar2.f176068b;
        }
    };

    /* renamed from: A */
    private boolean f176003A;

    /* renamed from: B */
    private boolean f176004B;

    /* renamed from: C */
    private int f176005C = 1;

    /* renamed from: D */
    private boolean f176006D;

    /* renamed from: E */
    private boolean f176007E;

    /* renamed from: F */
    private int f176008F;

    /* renamed from: G */
    private int f176009G;

    /* renamed from: H */
    private int f176010H;

    /* renamed from: I */
    private float f176011I;

    /* renamed from: J */
    private float f176012J;

    /* renamed from: K */
    private float f176013K;

    /* renamed from: L */
    private float f176014L;

    /* renamed from: M */
    private int f176015M = -1;

    /* renamed from: N */
    private VelocityTracker f176016N;

    /* renamed from: O */
    private int f176017O;

    /* renamed from: P */
    private int f176018P;

    /* renamed from: Q */
    private int f176019Q;

    /* renamed from: R */
    private int f176020R;

    /* renamed from: S */
    private boolean f176021S;

    /* renamed from: T */
    private long f176022T;

    /* renamed from: U */
    private C0819d f176023U;

    /* renamed from: V */
    private C0819d f176024V;

    /* renamed from: W */
    private boolean f176025W = true;

    /* renamed from: aa */
    private boolean f176026aa = false;

    /* renamed from: ab */
    private boolean f176027ab;

    /* renamed from: ac */
    private int f176028ac;

    /* renamed from: ad */
    private List<ViewPager.AbstractC1579e> f176029ad = new ArrayList();

    /* renamed from: ae */
    private ViewPager.AbstractC1579e f176030ae;

    /* renamed from: af */
    private AbstractC78362f f176031af;

    /* renamed from: ag */
    private ViewPager.AbstractC1580f f176032ag;

    /* renamed from: ah */
    private Method f176033ah;

    /* renamed from: ai */
    private int f176034ai;

    /* renamed from: aj */
    private ArrayList<View> f176035aj;

    /* renamed from: al */
    private final Runnable f176036al = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager.RunnableC783543 */

        static {
            Covode.recordClassIndex(91476);
        }

        public final void run() {
            VerticalViewPager.this.setScrollState(0);
            VerticalViewPager.this.mo122261f();
        }
    };

    /* renamed from: am */
    private int f176037am = 0;

    /* renamed from: an */
    private boolean f176038an = false;

    /* renamed from: c */
    public PagerAdapter f176039c;

    /* renamed from: d */
    public int f176040d;

    /* renamed from: f */
    private boolean f176041f = true;

    /* renamed from: g */
    private int f176042g;

    /* renamed from: i */
    private final ArrayList<C78359c> f176043i = new ArrayList<>();

    /* renamed from: j */
    private final C78359c f176044j = new C78359c();

    /* renamed from: k */
    private final Rect f176045k = new Rect();

    /* renamed from: l */
    private int f176046l = -1;

    /* renamed from: m */
    private Parcelable f176047m = null;

    /* renamed from: n */
    private ClassLoader f176048n = null;

    /* renamed from: o */
    private Scroller f176049o;

    /* renamed from: p */
    private boolean f176050p;

    /* renamed from: q */
    private C78363g f176051q;

    /* renamed from: r */
    private int f176052r;

    /* renamed from: s */
    private Drawable f176053s;

    /* renamed from: t */
    private int f176054t;

    /* renamed from: u */
    private int f176055u;

    /* renamed from: v */
    private float f176056v = -3.4028235E38f;

    /* renamed from: w */
    private float f176057w = Float.MAX_VALUE;

    /* renamed from: x */
    private int f176058x;

    /* renamed from: y */
    private int f176059y;

    /* renamed from: z */
    private boolean f176060z;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager$a */
    interface AbstractC78357a {
        static {
            Covode.recordClassIndex(91480);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager$b */
    public interface AbstractC78358b {
        static {
            Covode.recordClassIndex(91481);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager$f */
    public interface AbstractC78362f {
        static {
            Covode.recordClassIndex(91485);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager$c */
    public static class C78359c {

        /* renamed from: a */
        Object f176067a;

        /* renamed from: b */
        int f176068b;

        /* renamed from: c */
        boolean f176069c;

        /* renamed from: d */
        float f176070d;

        /* renamed from: e */
        float f176071e;

        static {
            Covode.recordClassIndex(91482);
        }

        C78359c() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager$h */
    public static class C78364h implements Comparator<View> {
        static {
            Covode.recordClassIndex(91487);
        }

        C78364h() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            C78360d dVar = (C78360d) view.getLayoutParams();
            C78360d dVar2 = (C78360d) view2.getLayoutParams();
            if (dVar.f176072a == dVar2.f176072a) {
                return dVar.f176076e - dVar2.f176076e;
            }
            if (dVar.f176072a) {
                return 1;
            }
            return -1;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39191c
    /* renamed from: a */
    public final boolean mo67976a() {
        return this.f176038an;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39193e
    /* renamed from: b */
    public final boolean mo67981b() {
        return this.f176021S;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39190b
    public PagerAdapter getAdapter() {
        return this.f176039c;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39190b
    public int getCurrentItem() {
        return this.f176040d;
    }

    public int getExpectedAdapterCount() {
        return this.f176042g;
    }

    public int getOffscreenPageLimit() {
        return this.f176005C;
    }

    public int getPageMargin() {
        return this.f176052r;
    }

    /* renamed from: a */
    private void m136822a(int i, boolean z, boolean z2, int i2) {
        PagerAdapter pagerAdapter = this.f176039c;
        boolean z3 = false;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f176040d != i || this.f176043i.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f176039c.getCount()) {
                i = this.f176039c.getCount() - 1;
            }
            int i3 = this.f176005C;
            int i4 = this.f176040d;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f176043i.size(); i5++) {
                    this.f176043i.get(i5).f176069c = true;
                }
            }
            if (this.f176040d != i) {
                z3 = true;
            }
            if (this.f176025W) {
                this.f176040d = i;
                if (z3) {
                    List<ViewPager.AbstractC1579e> list = this.f176029ad;
                    if (list != null && !list.isEmpty()) {
                        for (ViewPager.AbstractC1579e eVar : this.f176029ad) {
                            eVar.onPageSelected(i);
                        }
                    }
                    ViewPager.AbstractC1579e eVar2 = this.f176030ae;
                    if (eVar2 != null) {
                        eVar2.onPageSelected(i);
                    }
                }
                requestLayout();
                return;
            }
            m136816a(i);
            m136820a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    private void m136820a(int i, boolean z, int i2, boolean z2) {
        C78359c b = m136829b(i);
        int clientHeight = b != null ? (int) (((float) getClientHeight()) * Math.max(this.f176056v, Math.min(b.f176071e, this.f176057w))) : 0;
        if (z) {
            m136818a(clientHeight, i2);
            if (z2) {
                List<ViewPager.AbstractC1579e> list = this.f176029ad;
                if (list != null && !list.isEmpty()) {
                    for (ViewPager.AbstractC1579e eVar : this.f176029ad) {
                        eVar.onPageSelected(i);
                    }
                }
                ViewPager.AbstractC1579e eVar2 = this.f176030ae;
                if (eVar2 != null) {
                    eVar2.onPageSelected(i);
                    return;
                }
                return;
            }
            return;
        }
        if (z2) {
            List<ViewPager.AbstractC1579e> list2 = this.f176029ad;
            if (list2 != null && !list2.isEmpty()) {
                for (ViewPager.AbstractC1579e eVar3 : this.f176029ad) {
                    eVar3.onPageSelected(i);
                }
            }
            ViewPager.AbstractC1579e eVar4 = this.f176030ae;
            if (eVar4 != null) {
                eVar4.onPageSelected(i);
            }
        }
        m136826a(false);
        scrollTo(0, clientHeight);
        m136833c(clientHeight);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39190b
    /* renamed from: a */
    public final void mo67974a(ViewPager.AbstractC1579e eVar) {
        if (eVar != null) {
            this.f176029ad.add(eVar);
        }
    }

    /* renamed from: a */
    private void m136825a(C78359c cVar, int i, C78359c cVar2) {
        C78359c cVar3;
        C78359c cVar4;
        int count = this.f176039c.getCount();
        int clientHeight = getClientHeight();
        float f = clientHeight > 0 ? ((float) this.f176052r) / ((float) clientHeight) : 0.0f;
        if (cVar2 != null) {
            int i2 = cVar2.f176068b;
            if (i2 < cVar.f176068b) {
                float f2 = cVar2.f176071e + cVar2.f176070d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= cVar.f176068b && i4 < this.f176043i.size()) {
                    C78359c cVar5 = this.f176043i.get(i4);
                    while (true) {
                        cVar4 = cVar5;
                        if (i3 > cVar4.f176068b && i4 < this.f176043i.size() - 1) {
                            i4++;
                            cVar5 = this.f176043i.get(i4);
                        }
                    }
                    while (i3 < cVar4.f176068b) {
                        f2 += this.f176039c.getPageWidth(i3) + f;
                        i3++;
                    }
                    cVar4.f176071e = f2;
                    f2 += cVar4.f176070d + f;
                    i3++;
                }
            } else if (i2 > cVar.f176068b) {
                int size = this.f176043i.size() - 1;
                float f3 = cVar2.f176071e;
                int i5 = i2 - 1;
                while (i5 >= cVar.f176068b && size >= 0) {
                    C78359c cVar6 = this.f176043i.get(size);
                    while (true) {
                        cVar3 = cVar6;
                        if (i5 < cVar3.f176068b && size > 0) {
                            size--;
                            cVar6 = this.f176043i.get(size);
                        }
                    }
                    while (i5 > cVar3.f176068b) {
                        f3 -= this.f176039c.getPageWidth(i5) + f;
                        i5--;
                    }
                    f3 -= cVar3.f176070d + f;
                    cVar3.f176071e = f3;
                    i5--;
                }
            }
        }
        int size2 = this.f176043i.size();
        float f4 = cVar.f176071e;
        int i6 = cVar.f176068b - 1;
        this.f176056v = cVar.f176068b == 0 ? cVar.f176071e : -3.4028235E38f;
        int i7 = count - 1;
        this.f176057w = cVar.f176068b == i7 ? (cVar.f176071e + cVar.f176070d) - 1.0f : Float.MAX_VALUE;
        int i8 = i - 1;
        while (i8 >= 0) {
            C78359c cVar7 = this.f176043i.get(i8);
            while (i6 > cVar7.f176068b) {
                f4 -= this.f176039c.getPageWidth(i6) + f;
                i6--;
            }
            f4 -= cVar7.f176070d + f;
            cVar7.f176071e = f4;
            if (cVar7.f176068b == 0) {
                this.f176056v = f4;
            }
            i8--;
            i6--;
        }
        float f5 = cVar.f176071e + cVar.f176070d + f;
        int i9 = cVar.f176068b + 1;
        int i10 = i + 1;
        while (i10 < size2) {
            C78359c cVar8 = this.f176043i.get(i10);
            while (i9 < cVar8.f176068b) {
                f5 += this.f176039c.getPageWidth(i9) + f;
                i9++;
            }
            if (cVar8.f176068b == i7) {
                this.f176057w = (cVar8.f176070d + f5) - 1.0f;
            }
            cVar8.f176071e = f5;
            f5 += cVar8.f176070d + f;
            i10++;
            i9++;
        }
        this.f176026aa = false;
    }

    /* renamed from: a */
    private void m136819a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f176043i.isEmpty()) {
            C78359c b = m136829b(this.f176040d);
            int min = (int) ((b != null ? Math.min(b.f176071e, this.f176057w) : 0.0f) * ((float) ((i - getPaddingTop()) - getPaddingBottom())));
            if (min != getScrollY()) {
                m136826a(false);
                scrollTo(getScrollX(), min);
            }
        } else if (!this.f176049o.isFinished()) {
            this.f176049o.setFinalY(getCurrentItem() * getClientHeight());
        } else {
            scrollTo(getScrollX(), (int) ((((float) getScrollY()) / ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4))) * ((float) (((i - getPaddingTop()) - getPaddingBottom()) + i3))));
        }
    }

    /* renamed from: a */
    private void m136826a(boolean z) {
        boolean z2;
        if (this.f176037am == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.f176049o.isFinished()) {
                this.f176049o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f176049o.getCurrX();
                int currY = this.f176049o.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        m136833c(currY);
                    }
                }
            }
        } else {
            z2 = false;
        }
        this.f176004B = false;
        for (int i = 0; i < this.f176043i.size(); i++) {
            C78359c cVar = this.f176043i.get(i);
            if (cVar.f176069c) {
                cVar.f176069c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            C0792v.m2750a(this, this.f176036al);
        } else {
            this.f176036al.run();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39193e
    /* renamed from: a */
    public final void mo67970a(float f) {
        if (!this.f176021S) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.f176039c != null) {
            try {
                this.f176012J += f;
                float scrollY = ((float) getScrollY()) - f;
                float clientHeight = (float) getClientHeight();
                float f2 = this.f176056v * clientHeight;
                float f3 = this.f176057w * clientHeight;
                C78359c cVar = this.f176043i.get(0);
                ArrayList<C78359c> arrayList = this.f176043i;
                C78359c cVar2 = arrayList.get(arrayList.size() - 1);
                if (cVar.f176068b != 0) {
                    f2 = cVar.f176071e * clientHeight;
                }
                if (cVar2.f176068b != this.f176039c.getCount() - 1) {
                    f3 = cVar2.f176071e * clientHeight;
                }
                if (scrollY < f2) {
                    scrollY = f2;
                } else if (scrollY > f3) {
                    scrollY = f3;
                }
                int i = (int) scrollY;
                this.f176012J += scrollY - ((float) i);
                scrollTo(getScrollX(), i);
                m136833c(i);
                MotionEvent obtain = MotionEvent.obtain(this.f176022T, SystemClock.uptimeMillis(), 2, 0.0f, this.f176012J, 0);
                if (this.f176016N == null) {
                    this.f176016N = VelocityTracker.obtain();
                }
                VelocityTracker velocityTracker = this.f176016N;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(obtain);
                    obtain.recycle();
                }
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    private void m136823a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f176015M) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f176012J = motionEvent.getY(i);
            this.f176015M = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f176016N;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m136827a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof AbstractC78358b) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i3 + scrollY;
                if (i5 >= childAt.getTop() && i5 < childAt.getBottom() && (i4 = i2 + scrollX) >= childAt.getLeft() && i4 < childAt.getRight() && m136827a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z || !view.canScrollVertically(-i)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager$d */
    public static class C78360d extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f176072a;

        /* renamed from: b */
        public int f176073b;

        /* renamed from: c */
        float f176074c;

        /* renamed from: d */
        boolean f176075d;

        /* renamed from: e */
        int f176076e;

        /* renamed from: f */
        int f176077f;

        static {
            Covode.recordClassIndex(91483);
        }

        public C78360d() {
            super(-1, -1);
        }

        public C78360d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VerticalViewPager.f175998a);
            this.f176073b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager$g */
    public class C78363g extends DataSetObserver {
        static {
            Covode.recordClassIndex(91486);
        }

        public final void onChanged() {
            VerticalViewPager.this.mo122260e();
        }

        public final void onInvalidated() {
            VerticalViewPager.this.mo122260e();
        }

        private C78363g() {
        }

        /* synthetic */ C78363g(VerticalViewPager verticalViewPager, byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo122261f() {
        m136816a(this.f176040d);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C78360d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f176025W = true;
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: i */
    private void m136837i() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: k */
    private void m136839k() {
        this.f176006D = false;
        this.f176007E = false;
        VelocityTracker velocityTracker = this.f176016N;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f176016N = null;
        }
    }

    /* renamed from: l */
    private boolean m136840l() {
        int i = this.f176040d;
        if (i <= 0) {
            return false;
        }
        mo122248a(i - 1, true);
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = C0651e.m2387a(new AbstractC0653f<SavedState>() {
            /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager.SavedState.C783561 */

            static {
                Covode.recordClassIndex(91479);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // androidx.core.p033d.AbstractC0653f
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ SavedState[] mo2683a(int i) {
                return new SavedState[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // androidx.core.p033d.AbstractC0653f
            /* renamed from: a */
            public final /* synthetic */ SavedState mo2682a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        });

        /* renamed from: a */
        int f176064a;

        /* renamed from: b */
        Parcelable f176065b;

        /* renamed from: c */
        ClassLoader f176066c;

        static {
            Covode.recordClassIndex(91478);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f176064a + "}";
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f176064a);
            parcel.writeParcelable(this.f176065b, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f176064a = parcel.readInt();
            this.f176065b = parcel.readParcelable(classLoader);
            this.f176066c = classLoader;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager$e */
    class C78361e extends C0726a {
        static {
            Covode.recordClassIndex(91484);
        }

        /* renamed from: a */
        private boolean m136854a() {
            if (VerticalViewPager.this.f176039c == null || VerticalViewPager.this.f176039c.getCount() <= 1) {
                return false;
            }
            return true;
        }

        C78361e() {
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final void mo2808a(View view, C0733d dVar) {
            super.mo2808a(view, dVar);
            dVar.mo2834a((CharSequence) ViewPager.class.getName());
            dVar.mo2844d(m136854a());
            if (VerticalViewPager.this.canScrollVertically(1)) {
                dVar.mo2829a(4096);
            }
            if (VerticalViewPager.this.canScrollVertically(-1)) {
                dVar.mo2829a(8192);
            }
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: d */
        public final void mo2813d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2813d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            C0740f a = C0740f.m2624a();
            a.mo2859a(m136854a());
            if (accessibilityEvent.getEventType() == 4096 && VerticalViewPager.this.f176039c != null) {
                a.mo2858a(VerticalViewPager.this.f176039c.getCount());
                a.mo2860b(VerticalViewPager.this.f176040d);
                a.mo2861c(VerticalViewPager.this.f176040d);
            }
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final boolean mo2809a(View view, int i, Bundle bundle) {
            if (super.mo2809a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !VerticalViewPager.this.canScrollVertically(-1)) {
                    return false;
                }
                VerticalViewPager verticalViewPager = VerticalViewPager.this;
                verticalViewPager.setCurrentItem(verticalViewPager.f176040d - 1);
                return true;
            } else if (!VerticalViewPager.this.canScrollVertically(1)) {
                return false;
            } else {
                VerticalViewPager verticalViewPager2 = VerticalViewPager.this;
                verticalViewPager2.setCurrentItem(verticalViewPager2.f176040d + 1);
                return true;
            }
        }
    }

    /* renamed from: h */
    private boolean m136836h() {
        this.f176015M = -1;
        m136839k();
        return this.f176023U.mo3010a() | this.f176024V.mo3010a();
    }

    /* renamed from: m */
    private boolean m136841m() {
        PagerAdapter pagerAdapter = this.f176039c;
        if (pagerAdapter == null || this.f176040d >= pagerAdapter.getCount() - 1) {
            return false;
        }
        mo122248a(this.f176040d + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f176053s;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f176036al);
        Scroller scroller = this.f176049o;
        if (scroller != null && !scroller.isFinished()) {
            this.f176049o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f176064a = this.f176040d;
        PagerAdapter pagerAdapter = this.f176039c;
        if (pagerAdapter != null) {
            savedState.f176065b = pagerAdapter.saveState();
        }
        return savedState;
    }

    static {
        Covode.recordClassIndex(91473);
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            f176001e = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    /* renamed from: g */
    private void m136835g() {
        if (this.f176034ai != 0) {
            ArrayList<View> arrayList = this.f176035aj;
            if (arrayList == null) {
                this.f176035aj = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f176035aj.add(getChildAt(i));
            }
            Collections.sort(this.f176035aj, f175999ak);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39193e
    /* renamed from: c */
    public final boolean mo67983c() {
        if (this.f176006D) {
            return false;
        }
        this.f176021S = true;
        setScrollState(1);
        this.f176014L = 0.0f;
        this.f176012J = 0.0f;
        VelocityTracker velocityTracker = this.f176016N;
        if (velocityTracker == null) {
            this.f176016N = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f176016N.addMovement(obtain);
        obtain.recycle();
        this.f176022T = uptimeMillis;
        return true;
    }

    /* renamed from: j */
    private C78359c m136838j() {
        float f;
        float f2;
        int i;
        int clientHeight = getClientHeight();
        float f3 = 0.0f;
        if (clientHeight > 0) {
            f = ((float) getScrollY()) / ((float) clientHeight);
            f2 = ((float) this.f176052r) / ((float) clientHeight);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C78359c cVar = null;
        float f4 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f176043i.size()) {
            C78359c cVar2 = this.f176043i.get(i3);
            if (!z && cVar2.f176068b != (i = i2 + 1)) {
                cVar2 = this.f176044j;
                cVar2.f176071e = f3 + f4 + f2;
                cVar2.f176068b = i;
                cVar2.f176070d = this.f176039c.getPageWidth(cVar2.f176068b);
                i3--;
            }
            f3 = cVar2.f176071e;
            float f5 = cVar2.f176070d + f3 + f2;
            if (!z && f < f3) {
                return cVar;
            }
            if (f < f5 || i3 == this.f176043i.size() - 1) {
                return cVar2;
            }
            i2 = cVar2.f176068b;
            f4 = cVar2.f176070d;
            i3++;
            cVar = cVar2;
            z = false;
        }
        return cVar;
    }

    public void computeScroll() {
        this.f176050p = true;
        if (this.f176049o.isFinished() || !this.f176049o.computeScrollOffset()) {
            m136826a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f176049o.getCurrX();
        int currY = this.f176049o.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m136833c(currY)) {
                this.f176049o.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        C0792v.m2764c(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39193e
    /* renamed from: d */
    public final void mo67987d() {
        if (this.f176021S) {
            if (this.f176039c != null) {
                VelocityTracker velocityTracker = this.f176016N;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f176018P);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f176015M);
                this.f176004B = true;
                int clientHeight = getClientHeight();
                int scrollY = getScrollY();
                C78359c j = m136838j();
                m136822a(m136813a(j.f176068b, ((((float) scrollY) / ((float) clientHeight)) - j.f176071e) / j.f176070d, yVelocity, (int) (this.f176012J - this.f176014L)), true, true, yVelocity);
            }
            m136839k();
            this.f176021S = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo122260e() {
        boolean z;
        int count = this.f176039c.getCount();
        this.f176042g = count;
        if (this.f176043i.size() >= (this.f176005C * 2) + 1 || this.f176043i.size() >= count) {
            z = false;
        } else {
            z = true;
        }
        int i = this.f176040d;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f176043i.size()) {
            C78359c cVar = this.f176043i.get(i2);
            int itemPosition = this.f176039c.getItemPosition(cVar.f176067a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f176043i.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f176039c.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.f176039c.destroyItem((ViewGroup) this, cVar.f176068b, cVar.f176067a);
                    if (this.f176040d == cVar.f176068b) {
                        i = Math.max(0, Math.min(this.f176040d, count - 1));
                    }
                } else if (cVar.f176068b != itemPosition) {
                    if (cVar.f176068b == this.f176040d) {
                        i = itemPosition;
                    }
                    cVar.f176068b = itemPosition;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f176039c.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f176043i, f176002h);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C78360d dVar = (C78360d) getChildAt(i3).getLayoutParams();
                if (!dVar.f176072a) {
                    dVar.f176074c = 0.0f;
                }
            }
            m136821a(i, false, true);
            requestLayout();
        }
    }

    public void setCanTouch(boolean z) {
        this.f176041f = z;
    }

    public void setDisableScroll(boolean z) {
        this.f176038an = z;
    }

    public void setOnAdapterChangeListener(AbstractC78362f fVar) {
        this.f176031af = fVar;
    }

    public void setScroller(Scroller scroller) {
        this.f176049o = scroller;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f176003A != z) {
            this.f176003A = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setCurrentItemWithDefaultVelocity(int i) {
        this.f176004B = false;
        m136822a(i, true, true, 1);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C78360d) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f176041f || !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C78360d(getContext(), attributeSet);
    }

    public void removeView(View view) {
        if (this.f176060z) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i) {
        this.f176004B = false;
        m136821a(i, !this.f176025W, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.f176005C) {
            this.f176005C = i;
            mo122261f();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f176052r;
        this.f176052r = i;
        int height = getHeight();
        m136819a(height, height, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f176053s) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static float m136828b(float f) {
        double d = (double) (f - 0.5f);
        Double.isNaN(d);
        return (float) Math.sin((double) ((float) (d * 0.4712389167638204d)));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.f176053s = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    /* renamed from: a */
    private C78359c m136815a(View view) {
        for (int i = 0; i < this.f176043i.size(); i++) {
            C78359c cVar = this.f176043i.get(i);
            if (this.f176039c.isViewFromObject(view, cVar.f176067a)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    private C78359c m136829b(int i) {
        for (int i2 = 0; i2 < this.f176043i.size(); i2++) {
            C78359c cVar = this.f176043i.get(i2);
            if (cVar.f176068b == i) {
                return cVar;
            }
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        C78359c a;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = m136815a(childAt)) != null && a.f176068b == this.f176040d) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public boolean canScrollVertically(int i) {
        if (this.f176039c == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i < 0) {
            if (scrollY > ((int) (((float) clientHeight) * this.f176056v))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollY >= ((int) (((float) clientHeight) * this.f176057w))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C78359c a;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = m136815a(childAt)) != null && a.f176068b == this.f176040d && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.f176039c;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f176065b, savedState.f176066c);
            m136821a(savedState.f176064a, false, true);
            return;
        }
        this.f176046l = savedState.f176064a;
        this.f176047m = savedState.f176065b;
        this.f176048n = savedState.f176066c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|(3:2|3|4)|5|6|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChildrenDrawingOrderEnabledCompat(boolean r7) {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r0 = 7
            java.lang.reflect.Method r0 = r6.f176033ah
            r5 = 0
            r4 = 1
            if (r0 != 0) goto L_0x0019
            java.lang.Class<android.view.ViewGroup> r3 = android.view.ViewGroup.class
            java.lang.String r2 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0019 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0019 }
            r1[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0019 }
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r2, r1)     // Catch:{ NoSuchMethodException -> 0x0019 }
            r6.f176033ah = r0     // Catch:{ NoSuchMethodException -> 0x0019 }
        L_0x0019:
            java.lang.reflect.Method r2 = r6.f176033ah     // Catch:{ Exception -> 0x0026 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0026 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0026 }
            r1[r5] = r0     // Catch:{ Exception -> 0x0026 }
            r2.invoke(r6, r1)     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager.setChildrenDrawingOrderEnabledCompat(boolean):void");
    }

    /* renamed from: c */
    private boolean m136833c(int i) {
        if (this.f176043i.size() != 0) {
            C78359c j = m136838j();
            int clientHeight = getClientHeight();
            int i2 = this.f176052r;
            int i3 = clientHeight + i2;
            float f = (float) i2;
            float f2 = (float) clientHeight;
            int i4 = j.f176068b;
            float f3 = ((((float) i) / f2) - j.f176071e) / (j.f176070d + (f / f2));
            this.f176027ab = false;
            m136817a(i4, f3, (int) (((float) i3) * f3));
            if (this.f176027ab) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f176025W) {
            return false;
        } else {
            this.f176027ab = false;
            m136817a(0, 0.0f, 0);
            if (this.f176027ab) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 21) {
                    z = m136834d(17);
                } else if (keyCode == 22) {
                    z = m136834d(66);
                } else if (keyCode == 61) {
                    if (keyEvent.hasNoModifiers()) {
                        z = m136834d(2);
                    } else if (keyEvent.hasModifiers(1)) {
                        z = m136834d(1);
                    }
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public void setScrollState(int i) {
        boolean z;
        int i2;
        if (this.f176037am != i) {
            this.f176037am = i;
            if (this.f176032ag != null) {
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (z) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    getChildAt(i3).setLayerType(i2, null);
                }
            }
            List<ViewPager.AbstractC1579e> list = this.f176029ad;
            if (!(list == null || list.isEmpty())) {
                for (ViewPager.AbstractC1579e eVar : this.f176029ad) {
                    eVar.onPageScrollStateChanged(i);
                }
            }
        }
    }

    /* renamed from: b */
    private C78359c m136831b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return m136815a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* renamed from: c */
    private boolean m136832c(float f) {
        boolean z;
        this.f176012J = f;
        float scrollY = ((float) getScrollY()) + (this.f176012J - f);
        float clientHeight = (float) getClientHeight();
        float f2 = this.f176056v * clientHeight;
        float f3 = this.f176057w * clientHeight;
        boolean z2 = false;
        if (this.f176043i.size() <= 0) {
            return false;
        }
        C78359c cVar = this.f176043i.get(0);
        ArrayList<C78359c> arrayList = this.f176043i;
        boolean z3 = true;
        C78359c cVar2 = arrayList.get(arrayList.size() - 1);
        if (cVar.f176068b != 0) {
            f2 = cVar.f176071e * clientHeight;
            z = false;
        } else {
            z = true;
        }
        if (cVar2.f176068b != this.f176039c.getCount() - 1) {
            f3 = cVar2.f176071e * clientHeight;
            z3 = false;
        }
        if (scrollY < f2) {
            if (z) {
                z2 = this.f176023U.mo3011a(Math.abs(f2 - scrollY) / clientHeight);
            }
            scrollY = f2;
        } else if (scrollY > f3) {
            if (z3) {
                z2 = this.f176024V.mo3011a(Math.abs(scrollY - f3) / clientHeight);
            }
            scrollY = f3;
        }
        int i = (int) scrollY;
        this.f176011I += scrollY - ((float) i);
        scrollTo(getScrollX(), i);
        m136833c(i);
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r7 != 2) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m136834d(int r7) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager.m136834d(int):boolean");
    }

    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        try {
            super.draw(canvas);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f176039c) != null && pagerAdapter.getCount() > 1)) {
            if (!this.f176023U.f3048a.isFinished()) {
                int save = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), this.f176056v * ((float) height));
                this.f176023U.mo3009a(width, height);
                z = false | this.f176023U.mo3012a(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f176024V.f3048a.isFinished()) {
                int save2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((float) ((-width2) - getPaddingLeft()), (-(this.f176057w + 1.0f)) * ((float) height2));
                this.f176024V.mo3009a(width2, height2);
                z |= this.f176024V.mo3012a(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                C0792v.m2764c(this);
                return;
            }
            return;
        }
        this.f176023U.f3048a.finish();
        this.f176024V.f3048a.finish();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.f176052r > 0 && this.f176053s != null && this.f176043i.size() > 0 && this.f176039c != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            float f2 = (float) height;
            float f3 = ((float) this.f176052r) / f2;
            int i = 0;
            C78359c cVar = this.f176043i.get(0);
            float f4 = cVar.f176071e;
            int size = this.f176043i.size();
            int i2 = this.f176043i.get(size - 1).f176068b;
            for (int i3 = cVar.f176068b; i3 < i2; i3++) {
                while (i3 > cVar.f176068b && i < size) {
                    i++;
                    cVar = this.f176043i.get(i);
                }
                if (i3 == cVar.f176068b) {
                    f = (cVar.f176071e + cVar.f176070d) * f2;
                    f4 = cVar.f176071e + cVar.f176070d + f3;
                } else {
                    float pageWidth = this.f176039c.getPageWidth(i3);
                    f = (f4 + pageWidth) * f2;
                    f4 += pageWidth + f3;
                }
                int i4 = this.f176052r;
                if (((float) i4) + f > ((float) scrollY)) {
                    this.f176053s.setBounds(this.f176054t, (int) f, this.f176055u, (int) (((float) i4) + f + 0.5f));
                    this.f176053s.draw(canvas);
                }
                if (f > ((float) (scrollY + height))) {
                    return;
                }
            }
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f176039c;
        if (pagerAdapter2 != null) {
            m136824a(pagerAdapter2, (C78363g) null);
            this.f176039c.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f176043i.size(); i++) {
                C78359c cVar = this.f176043i.get(i);
                this.f176039c.destroyItem((ViewGroup) this, cVar.f176068b, cVar.f176067a);
            }
            this.f176039c.finishUpdate((ViewGroup) this);
            this.f176043i.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C78360d) getChildAt(i2).getLayoutParams()).f176072a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f176040d = 0;
            scrollTo(0, 0);
        }
        this.f176039c = pagerAdapter;
        this.f176042g = 0;
        if (pagerAdapter != null) {
            if (this.f176051q == null) {
                this.f176051q = new C78363g(this, (byte) 0);
            }
            m136824a(this.f176039c, this.f176051q);
            this.f176004B = false;
            boolean z = this.f176025W;
            this.f176025W = true;
            this.f176042g = this.f176039c.getCount();
            if (this.f176046l >= 0) {
                this.f176039c.restoreState(this.f176047m, this.f176048n);
                m136821a(this.f176046l, false, true);
                this.f176046l = -1;
                this.f176047m = null;
                this.f176048n = null;
            } else if (!z) {
                mo122261f();
            } else {
                requestLayout();
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        try {
            if (this.f176021S) {
                return false;
            }
            int action = motionEvent.getAction() & 255;
            if (action != 3) {
                if (action != 1) {
                    if (action != 0) {
                        if (this.f176006D) {
                            return true;
                        }
                        if (this.f176007E) {
                            return false;
                        }
                    }
                    if (action == 0) {
                        this.f176011I = motionEvent.getX();
                        this.f176013K = motionEvent.getX();
                        this.f176012J = motionEvent.getY();
                        this.f176014L = motionEvent.getY();
                        this.f176015M = motionEvent.getPointerId(0);
                        this.f176007E = false;
                        this.f176050p = true;
                        this.f176049o.computeScrollOffset();
                        if (this.f176037am != 2 || Math.abs(this.f176049o.getFinalY() - this.f176049o.getCurrY()) <= this.f176020R) {
                            m136826a(false);
                            this.f176006D = false;
                        } else {
                            this.f176049o.abortAnimation();
                            this.f176004B = false;
                            mo122261f();
                            this.f176006D = true;
                            m136837i();
                            setScrollState(1);
                        }
                    } else if (action == 2) {
                        int i = this.f176015M;
                        if (i != -1) {
                            int findPointerIndex = motionEvent.findPointerIndex(i);
                            float y = motionEvent.getY(findPointerIndex);
                            float f2 = y - this.f176012J;
                            float abs = Math.abs(f2);
                            float x = motionEvent.getX(findPointerIndex);
                            float abs2 = Math.abs(x - this.f176013K);
                            if (f2 != 0.0f) {
                                float f3 = this.f176012J;
                                if (f3 >= ((float) this.f176009G) || f2 <= 0.0f) {
                                    if (f3 <= ((float) (getHeight() - this.f176009G)) || f2 >= 0.0f) {
                                        if (m136827a(this, false, (int) f2, (int) x, (int) y)) {
                                            this.f176011I = x;
                                            this.f176012J = y;
                                            this.f176007E = true;
                                            return false;
                                        }
                                    }
                                }
                            }
                            int i2 = this.f176010H;
                            if (abs > ((float) i2) && abs * 0.5f > abs2) {
                                this.f176006D = true;
                                m136837i();
                                setScrollState(1);
                                if (f2 > 0.0f) {
                                    f = this.f176014L + ((float) this.f176010H);
                                } else {
                                    f = this.f176014L - ((float) this.f176010H);
                                }
                                this.f176012J = f;
                                this.f176011I = x;
                                setScrollingCacheEnabled(true);
                            } else if (abs2 > ((float) i2)) {
                                this.f176007E = true;
                            }
                            if (this.f176006D && m136832c(y)) {
                                C0792v.m2764c(this);
                            }
                        }
                    } else if (action == 6) {
                        m136823a(motionEvent);
                    }
                    if (this.f176016N == null) {
                        this.f176016N = VelocityTracker.obtain();
                    }
                    this.f176016N.addMovement(motionEvent);
                    return this.f176006D;
                }
            }
            m136836h();
            return false;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        boolean z;
        float f;
        try {
            if (this.f176021S) {
                return true;
            }
            if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && (pagerAdapter = this.f176039c) != null) {
                if (pagerAdapter.getCount() != 0) {
                    if (this.f176016N == null) {
                        this.f176016N = VelocityTracker.obtain();
                    }
                    this.f176016N.addMovement(motionEvent);
                    int action = motionEvent.getAction() & 255;
                    if (action != 0) {
                        if (action != 1) {
                            if (action == 2) {
                                if (!this.f176006D) {
                                    int findPointerIndex = motionEvent.findPointerIndex(this.f176015M);
                                    if (findPointerIndex == -1) {
                                        z = m136836h();
                                    } else {
                                        float y = motionEvent.getY(findPointerIndex);
                                        float abs = Math.abs(y - this.f176012J);
                                        float x = motionEvent.getX(findPointerIndex);
                                        float abs2 = Math.abs(x - this.f176011I);
                                        if (abs > ((float) this.f176010H) && abs > abs2) {
                                            this.f176006D = true;
                                            m136837i();
                                            float f2 = this.f176014L;
                                            if (y - f2 > 0.0f) {
                                                f = f2 + ((float) this.f176010H);
                                            } else {
                                                f = f2 - ((float) this.f176010H);
                                            }
                                            this.f176012J = f;
                                            this.f176011I = x;
                                            setScrollState(1);
                                            setScrollingCacheEnabled(true);
                                            ViewParent parent = getParent();
                                            if (parent != null) {
                                                parent.requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                                if (this.f176006D) {
                                    z = false | m136832c(motionEvent.getY(motionEvent.findPointerIndex(this.f176015M)));
                                }
                            } else if (action != 3) {
                                if (action == 5) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    this.f176012J = motionEvent.getY(actionIndex);
                                    this.f176015M = motionEvent.getPointerId(actionIndex);
                                } else if (action == 6) {
                                    m136823a(motionEvent);
                                    this.f176012J = motionEvent.getY(motionEvent.findPointerIndex(this.f176015M));
                                }
                            } else if (this.f176006D) {
                                m136820a(this.f176040d, true, 0, false);
                                z = m136836h();
                            }
                        } else if (this.f176006D) {
                            VelocityTracker velocityTracker = this.f176016N;
                            velocityTracker.computeCurrentVelocity(1000, (float) this.f176018P);
                            int yVelocity = (int) velocityTracker.getYVelocity(this.f176015M);
                            this.f176004B = true;
                            int clientHeight = getClientHeight();
                            int scrollY = getScrollY();
                            C78359c j = m136838j();
                            if (j != null) {
                                float f3 = (float) clientHeight;
                                m136822a(m136813a(j.f176068b, ((((float) scrollY) / f3) - j.f176071e) / (j.f176070d + (((float) this.f176052r) / f3)), yVelocity, (int) (motionEvent.getY(motionEvent.findPointerIndex(this.f176015M)) - this.f176014L)), true, true, yVelocity);
                            }
                            z = m136836h();
                        }
                        if (z) {
                            C0792v.m2764c(this);
                        }
                    } else {
                        this.f176049o.abortAnimation();
                        this.f176004B = false;
                        mo122261f();
                        this.f176011I = motionEvent.getX();
                        this.f176013K = motionEvent.getX();
                        this.f176012J = motionEvent.getY();
                        this.f176014L = motionEvent.getY();
                        this.f176015M = motionEvent.getPointerId(0);
                    }
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalStateException e2) {
            if (this.f176039c.getCount() != this.f176042g) {
                this.f176039c.notifyDataSetChanged();
            }
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r7.f176068b == r17.f176040d) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        r12 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (r12 < 0) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        r13 = r17.f176043i.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        r11 = getClientHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (r11 > 0) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        r2 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        r1 = r17.f176040d - 1;
        r15 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
        if (r1 < 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (r15 < r2) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        if (r1 >= r4) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (r13 == null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r1 != r13.f176068b) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        if (r13.f176069c != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        r17.f176043i.remove(r12);
        r17.f176039c.destroyItem((android.view.ViewGroup) r17, r1, r13.f176067a);
        r12 = r12 - 1;
        r8 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        r13 = r17.f176043i.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        if (r13 == null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bb, code lost:
        if (r1 != r13.f176068b) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        r15 = r15 + r13.f176070d;
        r12 = r12 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c4, code lost:
        r13 = r17.f176043i.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cd, code lost:
        r15 = r15 + m136830b(r1, r12 + 1).f176070d;
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        r13 = r17.f176043i.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e3, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e5, code lost:
        r2 = (2.0f - r7.f176070d) + (((float) getPaddingLeft()) / ((float) r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f2, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0101, code lost:
        if (r7 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0105, code lost:
        r4 = r7.f176070d;
        r2 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010b, code lost:
        if (r4 >= 2.0f) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0113, code lost:
        if (r2 >= r17.f176043i.size()) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0115, code lost:
        r13 = r17.f176043i.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011d, code lost:
        if (r11 > 0) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011f, code lost:
        r1 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0120, code lost:
        r11 = r17.f176040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0122, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0124, code lost:
        if (r11 >= r6) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0128, code lost:
        if (r4 < r1) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012a, code lost:
        if (r11 <= r9) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012c, code lost:
        if (r13 == null) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0130, code lost:
        if (r11 != r13.f176068b) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0134, code lost:
        if (r13.f176069c != false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0136, code lost:
        r17.f176043i.remove(r2);
        r17.f176039c.destroyItem((android.view.ViewGroup) r17, r11, r13.f176067a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0148, code lost:
        if (r2 >= r17.f176043i.size()) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x014a, code lost:
        r13 = r17.f176043i.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0153, code lost:
        if (r13 == null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0157, code lost:
        if (r11 != r13.f176068b) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0159, code lost:
        r4 = r4 + r13.f176070d;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0164, code lost:
        if (r2 >= r17.f176043i.size()) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0166, code lost:
        r13 = r17.f176043i.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016f, code lost:
        r0 = m136830b(r11, r2);
        r2 = r2 + 1;
        r4 = r4 + r0.f176070d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x017e, code lost:
        if (r2 >= r17.f176043i.size()) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0180, code lost:
        r13 = r17.f176043i.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0189, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x018b, code lost:
        r1 = (((float) getPaddingRight()) / ((float) r11)) + 2.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0195, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0197, code lost:
        m136825a(r7, r8, r10);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m136816a(int r18) {
        /*
        // Method dump skipped, instructions count: 629
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager.m136816a(int):void");
    }

    /* renamed from: a */
    private static void m136824a(PagerAdapter pagerAdapter, C78363g gVar) {
        try {
            Field field = f176001e;
            if (field != null) {
                field.set(pagerAdapter, gVar);
            }
        } catch (IllegalAccessException unused) {
        }
    }

    /* renamed from: a */
    public final void mo122248a(int i, boolean z) {
        this.f176004B = false;
        m136821a(i, z, false);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f176034ai == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C78360d) this.f176035aj.get(i2).getLayoutParams()).f176077f;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C78359c a;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a = m136815a(childAt)) != null && a.f176068b == this.f176040d && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    /* renamed from: b */
    private C78359c m136830b(int i, int i2) {
        C78359c cVar = new C78359c();
        cVar.f176068b = i;
        cVar.f176067a = this.f176039c.instantiateItem((ViewGroup) this, i);
        cVar.f176070d = this.f176039c.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f176043i.size()) {
            this.f176043i.add(cVar);
        } else {
            this.f176043i.add(i2, cVar);
        }
        return cVar;
    }

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f176049o = new Scroller(context2, f176000b);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.f176010H = viewConfiguration.getScaledPagingTouchSlop();
        this.f176017O = (int) (400.0f * f);
        this.f176018P = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f176023U = new C0819d(context2);
        this.f176024V = new C0819d(context2);
        this.f176019Q = (int) (25.0f * f);
        this.f176020R = (int) (2.0f * f);
        this.f176008F = (int) (f * 16.0f);
        C0792v.m2747a(this, new C78361e());
        if (C0792v.m2766d(this) == 0) {
            C0792v.m2740a((View) this, 1);
        }
        C0792v.m2748a(this, new AbstractC0788r() {
            /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager.C783554 */

            /* renamed from: b */
            private final Rect f176063b = new Rect();

            static {
                Covode.recordClassIndex(91477);
            }

            @Override // androidx.core.p037h.AbstractC0788r
            /* renamed from: a */
            public final C0753ad mo553a(View view, C0753ad adVar) {
                C0753ad a = C0792v.m2737a(view, adVar);
                if (a.f2888b.mo2877b()) {
                    return a;
                }
                Rect rect = this.f176063b;
                rect.left = a.mo2865a();
                rect.top = a.mo2867b();
                rect.right = a.mo2868c();
                rect.bottom = a.mo2869d();
                int childCount = VerticalViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0753ad b = C0792v.m2757b(VerticalViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.mo2865a(), rect.left);
                    rect.top = Math.min(b.mo2867b(), rect.top);
                    rect.right = Math.min(b.mo2868c(), rect.right);
                    rect.bottom = Math.min(b.mo2869d(), rect.bottom);
                }
                return a.mo2866a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* renamed from: a */
    private Rect m136814a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.VerticalViewPager.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m136818a(int i, int i2) {
        int scrollY;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f176049o;
        if (scroller == null || scroller.isFinished()) {
            scrollY = getScrollY();
        } else {
            if (this.f176050p) {
                scrollY = this.f176049o.getCurrY();
            } else {
                scrollY = this.f176049o.getStartY();
            }
            this.f176049o.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int scrollX = getScrollX();
        int i3 = 0 - scrollX;
        int i4 = i - scrollY;
        if (i3 == 0 && i4 == 0) {
            m136826a(false);
            mo122261f();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientHeight = getClientHeight();
        int i5 = clientHeight / 2;
        float f = (float) clientHeight;
        float f2 = (float) i5;
        float b = f2 + (m136828b(Math.min(1.0f, (((float) Math.abs(i3)) * 1.0f) / f)) * f2);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(b / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i3)) / ((f * this.f176039c.getPageWidth(this.f176040d)) + ((float) this.f176052r))) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.f176050p = false;
        this.f176049o.startScroll(scrollX, scrollY, i3, i4, min);
        C0792v.m2764c(this);
    }

    /* renamed from: a */
    private void m136821a(int i, boolean z, boolean z2) {
        m136822a(i, z, z2, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C78360d dVar = (C78360d) layoutParams;
        dVar.f176072a |= view instanceof AbstractC78357a;
        if (!this.f176060z) {
            super.addView(view, i, layoutParams);
        } else if (!dVar.f176072a) {
            dVar.f176075d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C78359c a;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (a = m136815a(childAt)) != null && a.f176068b == this.f176040d) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
                arrayList.add(this);
            }
        }
    }

    /* renamed from: a */
    private void m136817a(int i, float f, int i2) {
        int i3;
        int i4;
        if (this.f176028ac > 0) {
            int scrollY = getScrollY();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                C78360d dVar = (C78360d) childAt.getLayoutParams();
                if (dVar.f176072a) {
                    int i6 = dVar.f176073b & 112;
                    if (i6 == 16) {
                        i3 = Math.max((height - childAt.getMeasuredHeight()) / 2, paddingTop);
                        i4 = paddingTop;
                        paddingTop = i3;
                    } else if (i6 == 48) {
                        i4 = childAt.getHeight() + paddingTop;
                    } else if (i6 != 80) {
                        i4 = paddingTop;
                    } else {
                        i3 = (height - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                        i4 = paddingTop;
                        paddingTop = i3;
                    }
                    int top = (paddingTop + scrollY) - childAt.getTop();
                    if (top != 0) {
                        childAt.offsetTopAndBottom(top);
                    }
                    paddingTop = i4;
                }
            }
        }
        List<ViewPager.AbstractC1579e> list = this.f176029ad;
        if (list != null && !list.isEmpty()) {
            for (ViewPager.AbstractC1579e eVar : this.f176029ad) {
                eVar.onPageScrolled(i, f, i2);
            }
        }
        ViewPager.AbstractC1579e eVar2 = this.f176030ae;
        if (eVar2 != null) {
            eVar2.onPageScrolled(i, f, i2);
        }
        if (this.f176032ag != null) {
            int scrollY2 = getScrollY();
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = getChildAt(i7);
                if (!((C78360d) childAt2.getLayoutParams()).f176072a) {
                    this.f176032ag.mo5330a(childAt2, ((float) (childAt2.getTop() - scrollY2)) / ((float) getClientHeight()));
                }
            }
        }
        this.f176027ab = true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            int i5 = this.f176052r;
            m136819a(i2, i4, i5, i5);
        }
    }

    /* renamed from: a */
    private int m136813a(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) <= this.f176019Q || Math.abs(i2) <= this.f176017O) {
            if (i >= this.f176040d) {
                f2 = 0.6f;
            } else {
                f2 = 0.4f;
            }
            i = (int) (((float) i) + f + f2);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f176043i.size() <= 0) {
            return i;
        }
        ArrayList<C78359c> arrayList = this.f176043i;
        return Math.max(this.f176043i.get(0).f176068b, Math.min(i, arrayList.get(arrayList.size() - 1).f176068b));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        int i9 = i3 - i;
        int i10 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollY = getScrollY();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C78360d dVar = (C78360d) childAt.getLayoutParams();
                if (dVar.f176072a) {
                    int i13 = dVar.f176073b & 7;
                    int i14 = dVar.f176073b & 112;
                    if (i13 == 1) {
                        i5 = Math.max((i9 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                        i6 = paddingLeft;
                        paddingLeft = i5;
                    } else if (i13 == 3) {
                        i6 = childAt.getMeasuredWidth() + paddingLeft;
                    } else if (i13 != 5) {
                        i6 = paddingLeft;
                    } else {
                        i5 = (i9 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i6 = paddingLeft;
                        paddingLeft = i5;
                    }
                    if (i14 == 16) {
                        i7 = Math.max((i10 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        i8 = paddingTop;
                        paddingTop = i7;
                    } else if (i14 == 48) {
                        i8 = childAt.getMeasuredHeight() + paddingTop;
                    } else if (i14 != 80) {
                        i8 = paddingTop;
                    } else {
                        i7 = (i10 - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                        i8 = paddingTop;
                        paddingTop = i7;
                    }
                    int i15 = paddingTop + scrollY;
                    childAt.layout(paddingLeft, i15, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + i15);
                    i11++;
                    paddingTop = i8;
                    paddingLeft = i6;
                }
            }
        }
        int i16 = (i10 - paddingTop) - paddingBottom;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                C78360d dVar2 = (C78360d) childAt2.getLayoutParams();
                C78359c a = m136815a(childAt2);
                if (!dVar2.f176072a && a != null) {
                    float f = (float) i16;
                    int i18 = ((int) (a.f176071e * f)) + paddingTop;
                    if (dVar2.f176075d) {
                        dVar2.f176075d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((i9 - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f * dVar2.f176074c), 1073741824));
                    }
                    childAt2.layout(paddingLeft, i18, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + i18);
                }
            }
        }
        this.f176054t = paddingLeft;
        this.f176055u = i9 - paddingRight;
        this.f176028ac = i11;
        if (this.f176025W) {
            z2 = false;
            m136820a(this.f176040d, false, 0, false);
        } else {
            z2 = false;
        }
        this.f176025W = z2;
    }
}
