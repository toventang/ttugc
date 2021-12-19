package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget;

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

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager */
public class VerticalViewPager extends AbstractC39191c {

    /* renamed from: a */
    public static final int[] f131253a = {16842931};

    /* renamed from: ak */
    private static final C57531h f131254ak = new C57531h();

    /* renamed from: b */
    public static final Interpolator f131255b = new Interpolator() {
        /* class com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.VerticalViewPager.animationInterpolatorC575202 */

        static {
            Covode.recordClassIndex(67464);
        }

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: e */
    static Field f131256e;

    /* renamed from: h */
    private static final Comparator<C57526c> f131257h = new Comparator<C57526c>() {
        /* class com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.VerticalViewPager.C575191 */

        static {
            Covode.recordClassIndex(67463);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C57526c cVar, C57526c cVar2) {
            return cVar.f131323b - cVar2.f131323b;
        }
    };

    /* renamed from: A */
    private boolean f131258A;

    /* renamed from: B */
    private boolean f131259B;

    /* renamed from: C */
    private int f131260C = 1;

    /* renamed from: D */
    private boolean f131261D;

    /* renamed from: E */
    private boolean f131262E;

    /* renamed from: F */
    private int f131263F;

    /* renamed from: G */
    private int f131264G;

    /* renamed from: H */
    private int f131265H;

    /* renamed from: I */
    private float f131266I;

    /* renamed from: J */
    private float f131267J;

    /* renamed from: K */
    private float f131268K;

    /* renamed from: L */
    private float f131269L;

    /* renamed from: M */
    private int f131270M = -1;

    /* renamed from: N */
    private VelocityTracker f131271N;

    /* renamed from: O */
    private int f131272O;

    /* renamed from: P */
    private int f131273P;

    /* renamed from: Q */
    private int f131274Q;

    /* renamed from: R */
    private int f131275R;

    /* renamed from: S */
    private boolean f131276S;

    /* renamed from: T */
    private long f131277T;

    /* renamed from: U */
    private C0819d f131278U;

    /* renamed from: V */
    private C0819d f131279V;

    /* renamed from: W */
    private boolean f131280W = true;

    /* renamed from: aa */
    private boolean f131281aa = false;

    /* renamed from: ab */
    private boolean f131282ab;

    /* renamed from: ac */
    private int f131283ac;

    /* renamed from: ad */
    private List<ViewPager.AbstractC1579e> f131284ad = new ArrayList();

    /* renamed from: ae */
    private ViewPager.AbstractC1579e f131285ae;

    /* renamed from: af */
    private AbstractC57529f f131286af;

    /* renamed from: ag */
    private ViewPager.AbstractC1580f f131287ag;

    /* renamed from: ah */
    private Method f131288ah;

    /* renamed from: ai */
    private int f131289ai;

    /* renamed from: aj */
    private ArrayList<View> f131290aj;

    /* renamed from: al */
    private final Runnable f131291al = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.VerticalViewPager.RunnableC575213 */

        static {
            Covode.recordClassIndex(67465);
        }

        public final void run() {
            VerticalViewPager.this.setScrollState(0);
            VerticalViewPager.this.mo94834f();
        }
    };

    /* renamed from: am */
    private int f131292am = 0;

    /* renamed from: an */
    private boolean f131293an = false;

    /* renamed from: c */
    public PagerAdapter f131294c;

    /* renamed from: d */
    public int f131295d;

    /* renamed from: f */
    private boolean f131296f = true;

    /* renamed from: g */
    private int f131297g;

    /* renamed from: i */
    private final ArrayList<C57526c> f131298i = new ArrayList<>();

    /* renamed from: j */
    private final C57526c f131299j = new C57526c();

    /* renamed from: k */
    private final Rect f131300k = new Rect();

    /* renamed from: l */
    private int f131301l = -1;

    /* renamed from: m */
    private Parcelable f131302m = null;

    /* renamed from: n */
    private ClassLoader f131303n = null;

    /* renamed from: o */
    private Scroller f131304o;

    /* renamed from: p */
    private boolean f131305p;

    /* renamed from: q */
    private C57530g f131306q;

    /* renamed from: r */
    private int f131307r;

    /* renamed from: s */
    private Drawable f131308s;

    /* renamed from: t */
    private int f131309t;

    /* renamed from: u */
    private int f131310u;

    /* renamed from: v */
    private float f131311v = -3.4028235E38f;

    /* renamed from: w */
    private float f131312w = Float.MAX_VALUE;

    /* renamed from: x */
    private int f131313x;

    /* renamed from: y */
    private int f131314y;

    /* renamed from: z */
    private boolean f131315z;

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager$a */
    interface AbstractC57524a {
        static {
            Covode.recordClassIndex(67469);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager$b */
    public interface AbstractC57525b {
        static {
            Covode.recordClassIndex(67470);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager$f */
    public interface AbstractC57529f {
        static {
            Covode.recordClassIndex(67474);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager$c */
    public static class C57526c {

        /* renamed from: a */
        Object f131322a;

        /* renamed from: b */
        int f131323b;

        /* renamed from: c */
        boolean f131324c;

        /* renamed from: d */
        float f131325d;

        /* renamed from: e */
        float f131326e;

        static {
            Covode.recordClassIndex(67471);
        }

        C57526c() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager$h */
    public static class C57531h implements Comparator<View> {
        static {
            Covode.recordClassIndex(67476);
        }

        C57531h() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            C57527d dVar = (C57527d) view.getLayoutParams();
            C57527d dVar2 = (C57527d) view2.getLayoutParams();
            if (dVar.f131327a == dVar2.f131327a) {
                return dVar.f131331e - dVar2.f131331e;
            }
            if (dVar.f131327a) {
                return 1;
            }
            return -1;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39191c
    /* renamed from: a */
    public final boolean mo67976a() {
        return this.f131293an;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39193e
    /* renamed from: b */
    public final boolean mo67981b() {
        return this.f131276S;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39190b
    public PagerAdapter getAdapter() {
        return this.f131294c;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39190b
    public int getCurrentItem() {
        return this.f131295d;
    }

    public int getExpectedAdapterCount() {
        return this.f131297g;
    }

    public int getOffscreenPageLimit() {
        return this.f131260C;
    }

    public int getPageMargin() {
        return this.f131307r;
    }

    /* renamed from: a */
    private void m104203a(int i, boolean z, boolean z2, int i2) {
        PagerAdapter pagerAdapter = this.f131294c;
        boolean z3 = false;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f131295d != i || this.f131298i.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f131294c.getCount()) {
                i = this.f131294c.getCount() - 1;
            }
            int i3 = this.f131260C;
            int i4 = this.f131295d;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f131298i.size(); i5++) {
                    this.f131298i.get(i5).f131324c = true;
                }
            }
            if (this.f131295d != i) {
                z3 = true;
            }
            if (this.f131280W) {
                this.f131295d = i;
                if (z3) {
                    List<ViewPager.AbstractC1579e> list = this.f131284ad;
                    if (list != null && !list.isEmpty()) {
                        for (ViewPager.AbstractC1579e eVar : this.f131284ad) {
                            eVar.onPageSelected(i);
                        }
                    }
                    ViewPager.AbstractC1579e eVar2 = this.f131285ae;
                    if (eVar2 != null) {
                        eVar2.onPageSelected(i);
                    }
                }
                requestLayout();
                return;
            }
            m104197a(i);
            m104201a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    private void m104201a(int i, boolean z, int i2, boolean z2) {
        C57526c b = m104210b(i);
        int clientHeight = b != null ? (int) (((float) getClientHeight()) * Math.max(this.f131311v, Math.min(b.f131326e, this.f131312w))) : 0;
        if (z) {
            m104199a(clientHeight, i2);
            if (z2) {
                List<ViewPager.AbstractC1579e> list = this.f131284ad;
                if (list != null && !list.isEmpty()) {
                    for (ViewPager.AbstractC1579e eVar : this.f131284ad) {
                        eVar.onPageSelected(i);
                    }
                }
                ViewPager.AbstractC1579e eVar2 = this.f131285ae;
                if (eVar2 != null) {
                    eVar2.onPageSelected(i);
                    return;
                }
                return;
            }
            return;
        }
        if (z2) {
            List<ViewPager.AbstractC1579e> list2 = this.f131284ad;
            if (list2 != null && !list2.isEmpty()) {
                for (ViewPager.AbstractC1579e eVar3 : this.f131284ad) {
                    eVar3.onPageSelected(i);
                }
            }
            ViewPager.AbstractC1579e eVar4 = this.f131285ae;
            if (eVar4 != null) {
                eVar4.onPageSelected(i);
            }
        }
        m104207a(false);
        scrollTo(0, clientHeight);
        m104214c(clientHeight);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39190b
    /* renamed from: a */
    public final void mo67974a(ViewPager.AbstractC1579e eVar) {
        if (eVar != null) {
            this.f131284ad.add(eVar);
        }
    }

    /* renamed from: a */
    private void m104206a(C57526c cVar, int i, C57526c cVar2) {
        C57526c cVar3;
        C57526c cVar4;
        int count = this.f131294c.getCount();
        int clientHeight = getClientHeight();
        float f = clientHeight > 0 ? ((float) this.f131307r) / ((float) clientHeight) : 0.0f;
        if (cVar2 != null) {
            int i2 = cVar2.f131323b;
            if (i2 < cVar.f131323b) {
                float f2 = cVar2.f131326e + cVar2.f131325d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= cVar.f131323b && i4 < this.f131298i.size()) {
                    C57526c cVar5 = this.f131298i.get(i4);
                    while (true) {
                        cVar4 = cVar5;
                        if (i3 > cVar4.f131323b && i4 < this.f131298i.size() - 1) {
                            i4++;
                            cVar5 = this.f131298i.get(i4);
                        }
                    }
                    while (i3 < cVar4.f131323b) {
                        f2 += this.f131294c.getPageWidth(i3) + f;
                        i3++;
                    }
                    cVar4.f131326e = f2;
                    f2 += cVar4.f131325d + f;
                    i3++;
                }
            } else if (i2 > cVar.f131323b) {
                int size = this.f131298i.size() - 1;
                float f3 = cVar2.f131326e;
                int i5 = i2 - 1;
                while (i5 >= cVar.f131323b && size >= 0) {
                    C57526c cVar6 = this.f131298i.get(size);
                    while (true) {
                        cVar3 = cVar6;
                        if (i5 < cVar3.f131323b && size > 0) {
                            size--;
                            cVar6 = this.f131298i.get(size);
                        }
                    }
                    while (i5 > cVar3.f131323b) {
                        f3 -= this.f131294c.getPageWidth(i5) + f;
                        i5--;
                    }
                    f3 -= cVar3.f131325d + f;
                    cVar3.f131326e = f3;
                    i5--;
                }
            }
        }
        int size2 = this.f131298i.size();
        float f4 = cVar.f131326e;
        int i6 = cVar.f131323b - 1;
        this.f131311v = cVar.f131323b == 0 ? cVar.f131326e : -3.4028235E38f;
        int i7 = count - 1;
        this.f131312w = cVar.f131323b == i7 ? (cVar.f131326e + cVar.f131325d) - 1.0f : Float.MAX_VALUE;
        int i8 = i - 1;
        while (i8 >= 0) {
            C57526c cVar7 = this.f131298i.get(i8);
            while (i6 > cVar7.f131323b) {
                f4 -= this.f131294c.getPageWidth(i6) + f;
                i6--;
            }
            f4 -= cVar7.f131325d + f;
            cVar7.f131326e = f4;
            if (cVar7.f131323b == 0) {
                this.f131311v = f4;
            }
            i8--;
            i6--;
        }
        float f5 = cVar.f131326e + cVar.f131325d + f;
        int i9 = cVar.f131323b + 1;
        int i10 = i + 1;
        while (i10 < size2) {
            C57526c cVar8 = this.f131298i.get(i10);
            while (i9 < cVar8.f131323b) {
                f5 += this.f131294c.getPageWidth(i9) + f;
                i9++;
            }
            if (cVar8.f131323b == i7) {
                this.f131312w = (cVar8.f131325d + f5) - 1.0f;
            }
            cVar8.f131326e = f5;
            f5 += cVar8.f131325d + f;
            i10++;
            i9++;
        }
        this.f131281aa = false;
    }

    /* renamed from: a */
    private void m104200a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f131298i.isEmpty()) {
            C57526c b = m104210b(this.f131295d);
            int min = (int) ((b != null ? Math.min(b.f131326e, this.f131312w) : 0.0f) * ((float) ((i - getPaddingTop()) - getPaddingBottom())));
            if (min != getScrollY()) {
                m104207a(false);
                scrollTo(getScrollX(), min);
            }
        } else if (!this.f131304o.isFinished()) {
            this.f131304o.setFinalY(getCurrentItem() * getClientHeight());
        } else {
            scrollTo(getScrollX(), (int) ((((float) getScrollY()) / ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + i4))) * ((float) (((i - getPaddingTop()) - getPaddingBottom()) + i3))));
        }
    }

    /* renamed from: a */
    private void m104207a(boolean z) {
        boolean z2;
        if (this.f131292am == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.f131304o.isFinished()) {
                this.f131304o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f131304o.getCurrX();
                int currY = this.f131304o.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        m104214c(currY);
                    }
                }
            }
        } else {
            z2 = false;
        }
        this.f131259B = false;
        for (int i = 0; i < this.f131298i.size(); i++) {
            C57526c cVar = this.f131298i.get(i);
            if (cVar.f131324c) {
                cVar.f131324c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            C0792v.m2750a(this, this.f131291al);
        } else {
            this.f131291al.run();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39193e
    /* renamed from: a */
    public final void mo67970a(float f) {
        if (!this.f131276S) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.f131294c != null) {
            try {
                this.f131267J += f;
                float scrollY = ((float) getScrollY()) - f;
                float clientHeight = (float) getClientHeight();
                float f2 = this.f131311v * clientHeight;
                float f3 = this.f131312w * clientHeight;
                C57526c cVar = this.f131298i.get(0);
                ArrayList<C57526c> arrayList = this.f131298i;
                C57526c cVar2 = arrayList.get(arrayList.size() - 1);
                if (cVar.f131323b != 0) {
                    f2 = cVar.f131326e * clientHeight;
                }
                if (cVar2.f131323b != this.f131294c.getCount() - 1) {
                    f3 = cVar2.f131326e * clientHeight;
                }
                if (scrollY < f2) {
                    scrollY = f2;
                } else if (scrollY > f3) {
                    scrollY = f3;
                }
                int i = (int) scrollY;
                this.f131267J += scrollY - ((float) i);
                scrollTo(getScrollX(), i);
                m104214c(i);
                MotionEvent obtain = MotionEvent.obtain(this.f131277T, SystemClock.uptimeMillis(), 2, 0.0f, this.f131267J, 0);
                if (this.f131271N == null) {
                    this.f131271N = VelocityTracker.obtain();
                }
                VelocityTracker velocityTracker = this.f131271N;
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
    private void m104204a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f131270M) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f131267J = motionEvent.getY(i);
            this.f131270M = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f131271N;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m104208a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof AbstractC57525b) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i3 + scrollY;
                if (i5 >= childAt.getTop() && i5 < childAt.getBottom() && (i4 = i2 + scrollX) >= childAt.getLeft() && i4 < childAt.getRight() && m104208a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z || !view.canScrollVertically(-i)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager$d */
    public static class C57527d extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f131327a;

        /* renamed from: b */
        public int f131328b;

        /* renamed from: c */
        float f131329c;

        /* renamed from: d */
        boolean f131330d;

        /* renamed from: e */
        int f131331e;

        /* renamed from: f */
        int f131332f;

        static {
            Covode.recordClassIndex(67472);
        }

        public C57527d() {
            super(-1, -1);
        }

        public C57527d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VerticalViewPager.f131253a);
            this.f131328b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager$g */
    public class C57530g extends DataSetObserver {
        static {
            Covode.recordClassIndex(67475);
        }

        public final void onChanged() {
            VerticalViewPager.this.mo94833e();
        }

        public final void onInvalidated() {
            VerticalViewPager.this.mo94833e();
        }

        private C57530g() {
        }

        /* synthetic */ C57530g(VerticalViewPager verticalViewPager, byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo94834f() {
        m104197a(this.f131295d);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C57527d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f131280W = true;
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: i */
    private void m104218i() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: k */
    private void m104220k() {
        this.f131261D = false;
        this.f131262E = false;
        VelocityTracker velocityTracker = this.f131271N;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f131271N = null;
        }
    }

    /* renamed from: l */
    private boolean m104221l() {
        int i = this.f131295d;
        if (i <= 0) {
            return false;
        }
        mo94821a(i - 1, true);
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager$SavedState */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = C0651e.m2387a(new AbstractC0653f<SavedState>() {
            /* class com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.VerticalViewPager.SavedState.C575231 */

            static {
                Covode.recordClassIndex(67468);
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
        int f131319a;

        /* renamed from: b */
        Parcelable f131320b;

        /* renamed from: c */
        ClassLoader f131321c;

        static {
            Covode.recordClassIndex(67467);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f131319a + "}";
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f131319a);
            parcel.writeParcelable(this.f131320b, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f131319a = parcel.readInt();
            this.f131320b = parcel.readParcelable(classLoader);
            this.f131321c = classLoader;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VerticalViewPager$e */
    class C57528e extends C0726a {
        static {
            Covode.recordClassIndex(67473);
        }

        /* renamed from: a */
        private boolean m104235a() {
            if (VerticalViewPager.this.f131294c == null || VerticalViewPager.this.f131294c.getCount() <= 1) {
                return false;
            }
            return true;
        }

        C57528e() {
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final void mo2808a(View view, C0733d dVar) {
            super.mo2808a(view, dVar);
            dVar.mo2834a((CharSequence) ViewPager.class.getName());
            dVar.mo2844d(m104235a());
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
            a.mo2859a(m104235a());
            if (accessibilityEvent.getEventType() == 4096 && VerticalViewPager.this.f131294c != null) {
                a.mo2858a(VerticalViewPager.this.f131294c.getCount());
                a.mo2860b(VerticalViewPager.this.f131295d);
                a.mo2861c(VerticalViewPager.this.f131295d);
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
                verticalViewPager.setCurrentItem(verticalViewPager.f131295d - 1);
                return true;
            } else if (!VerticalViewPager.this.canScrollVertically(1)) {
                return false;
            } else {
                VerticalViewPager verticalViewPager2 = VerticalViewPager.this;
                verticalViewPager2.setCurrentItem(verticalViewPager2.f131295d + 1);
                return true;
            }
        }
    }

    /* renamed from: h */
    private boolean m104217h() {
        this.f131270M = -1;
        m104220k();
        return this.f131278U.mo3010a() | this.f131279V.mo3010a();
    }

    /* renamed from: m */
    private boolean m104222m() {
        PagerAdapter pagerAdapter = this.f131294c;
        if (pagerAdapter == null || this.f131295d >= pagerAdapter.getCount() - 1) {
            return false;
        }
        mo94821a(this.f131295d + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f131308s;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f131291al);
        Scroller scroller = this.f131304o;
        if (scroller != null && !scroller.isFinished()) {
            this.f131304o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f131319a = this.f131295d;
        PagerAdapter pagerAdapter = this.f131294c;
        if (pagerAdapter != null) {
            savedState.f131320b = pagerAdapter.saveState();
        }
        return savedState;
    }

    static {
        Covode.recordClassIndex(67462);
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            f131256e = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    /* renamed from: g */
    private void m104216g() {
        if (this.f131289ai != 0) {
            ArrayList<View> arrayList = this.f131290aj;
            if (arrayList == null) {
                this.f131290aj = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f131290aj.add(getChildAt(i));
            }
            Collections.sort(this.f131290aj, f131254ak);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39193e
    /* renamed from: c */
    public final boolean mo67983c() {
        if (this.f131261D) {
            return false;
        }
        this.f131276S = true;
        setScrollState(1);
        this.f131269L = 0.0f;
        this.f131267J = 0.0f;
        VelocityTracker velocityTracker = this.f131271N;
        if (velocityTracker == null) {
            this.f131271N = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f131271N.addMovement(obtain);
        obtain.recycle();
        this.f131277T = uptimeMillis;
        return true;
    }

    /* renamed from: j */
    private C57526c m104219j() {
        float f;
        float f2;
        int i;
        int clientHeight = getClientHeight();
        float f3 = 0.0f;
        if (clientHeight > 0) {
            f = ((float) getScrollY()) / ((float) clientHeight);
            f2 = ((float) this.f131307r) / ((float) clientHeight);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C57526c cVar = null;
        float f4 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f131298i.size()) {
            C57526c cVar2 = this.f131298i.get(i3);
            if (!z && cVar2.f131323b != (i = i2 + 1)) {
                cVar2 = this.f131299j;
                cVar2.f131326e = f3 + f4 + f2;
                cVar2.f131323b = i;
                cVar2.f131325d = this.f131294c.getPageWidth(cVar2.f131323b);
                i3--;
            }
            f3 = cVar2.f131326e;
            float f5 = cVar2.f131325d + f3 + f2;
            if (!z && f < f3) {
                return cVar;
            }
            if (f < f5 || i3 == this.f131298i.size() - 1) {
                return cVar2;
            }
            i2 = cVar2.f131323b;
            f4 = cVar2.f131325d;
            i3++;
            cVar = cVar2;
            z = false;
        }
        return cVar;
    }

    public void computeScroll() {
        this.f131305p = true;
        if (this.f131304o.isFinished() || !this.f131304o.computeScrollOffset()) {
            m104207a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f131304o.getCurrX();
        int currY = this.f131304o.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m104214c(currY)) {
                this.f131304o.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        C0792v.m2764c(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.AbstractC39193e
    /* renamed from: d */
    public final void mo67987d() {
        if (this.f131276S) {
            if (this.f131294c != null) {
                VelocityTracker velocityTracker = this.f131271N;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f131273P);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f131270M);
                this.f131259B = true;
                int clientHeight = getClientHeight();
                int scrollY = getScrollY();
                C57526c j = m104219j();
                m104203a(m104194a(j.f131323b, ((((float) scrollY) / ((float) clientHeight)) - j.f131326e) / j.f131325d, yVelocity, (int) (this.f131267J - this.f131269L)), true, true, yVelocity);
            }
            m104220k();
            this.f131276S = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo94833e() {
        boolean z;
        int count = this.f131294c.getCount();
        this.f131297g = count;
        if (this.f131298i.size() >= (this.f131260C * 2) + 1 || this.f131298i.size() >= count) {
            z = false;
        } else {
            z = true;
        }
        int i = this.f131295d;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f131298i.size()) {
            C57526c cVar = this.f131298i.get(i2);
            int itemPosition = this.f131294c.getItemPosition(cVar.f131322a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f131298i.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f131294c.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.f131294c.destroyItem((ViewGroup) this, cVar.f131323b, cVar.f131322a);
                    if (this.f131295d == cVar.f131323b) {
                        i = Math.max(0, Math.min(this.f131295d, count - 1));
                    }
                } else if (cVar.f131323b != itemPosition) {
                    if (cVar.f131323b == this.f131295d) {
                        i = itemPosition;
                    }
                    cVar.f131323b = itemPosition;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f131294c.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f131298i, f131257h);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C57527d dVar = (C57527d) getChildAt(i3).getLayoutParams();
                if (!dVar.f131327a) {
                    dVar.f131329c = 0.0f;
                }
            }
            m104202a(i, false, true);
            requestLayout();
        }
    }

    public void setCanTouch(boolean z) {
        this.f131296f = z;
    }

    public void setDisableScroll(boolean z) {
        this.f131293an = z;
    }

    public void setOnAdapterChangeListener(AbstractC57529f fVar) {
        this.f131286af = fVar;
    }

    public void setScroller(Scroller scroller) {
        this.f131304o = scroller;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f131258A != z) {
            this.f131258A = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setCurrentItemWithDefaultVelocity(int i) {
        this.f131259B = false;
        m104203a(i, true, true, 1);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C57527d) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f131296f || !super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C57527d(getContext(), attributeSet);
    }

    public void removeView(View view) {
        if (this.f131315z) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i) {
        this.f131259B = false;
        m104202a(i, !this.f131280W, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.f131260C) {
            this.f131260C = i;
            mo94834f();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f131307r;
        this.f131307r = i;
        int height = getHeight();
        m104200a(height, height, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f131308s) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static float m104209b(float f) {
        double d = (double) (f - 0.5f);
        Double.isNaN(d);
        return (float) Math.sin((double) ((float) (d * 0.4712389167638204d)));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.f131308s = drawable;
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
    private C57526c m104196a(View view) {
        for (int i = 0; i < this.f131298i.size(); i++) {
            C57526c cVar = this.f131298i.get(i);
            if (this.f131294c.isViewFromObject(view, cVar.f131322a)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    private C57526c m104210b(int i) {
        for (int i2 = 0; i2 < this.f131298i.size(); i2++) {
            C57526c cVar = this.f131298i.get(i2);
            if (cVar.f131323b == i) {
                return cVar;
            }
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        C57526c a;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = m104196a(childAt)) != null && a.f131323b == this.f131295d) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public boolean canScrollVertically(int i) {
        if (this.f131294c == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i < 0) {
            if (scrollY > ((int) (((float) clientHeight) * this.f131311v))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollY >= ((int) (((float) clientHeight) * this.f131312w))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C57526c a;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = m104196a(childAt)) != null && a.f131323b == this.f131295d && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        PagerAdapter pagerAdapter = this.f131294c;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f131320b, savedState.f131321c);
            m104202a(savedState.f131319a, false, true);
            return;
        }
        this.f131301l = savedState.f131319a;
        this.f131302m = savedState.f131320b;
        this.f131303n = savedState.f131321c;
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
            java.lang.reflect.Method r0 = r6.f131288ah
            r5 = 0
            r4 = 1
            if (r0 != 0) goto L_0x0019
            java.lang.Class<android.view.ViewGroup> r3 = android.view.ViewGroup.class
            java.lang.String r2 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0019 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0019 }
            r1[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0019 }
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r2, r1)     // Catch:{ NoSuchMethodException -> 0x0019 }
            r6.f131288ah = r0     // Catch:{ NoSuchMethodException -> 0x0019 }
        L_0x0019:
            java.lang.reflect.Method r2 = r6.f131288ah     // Catch:{ Exception -> 0x0026 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0026 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0026 }
            r1[r5] = r0     // Catch:{ Exception -> 0x0026 }
            r2.invoke(r6, r1)     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.VerticalViewPager.setChildrenDrawingOrderEnabledCompat(boolean):void");
    }

    /* renamed from: c */
    private boolean m104214c(int i) {
        if (this.f131298i.size() != 0) {
            C57526c j = m104219j();
            int clientHeight = getClientHeight();
            int i2 = this.f131307r;
            int i3 = clientHeight + i2;
            float f = (float) i2;
            float f2 = (float) clientHeight;
            int i4 = j.f131323b;
            float f3 = ((((float) i) / f2) - j.f131326e) / (j.f131325d + (f / f2));
            this.f131282ab = false;
            m104198a(i4, f3, (int) (((float) i3) * f3));
            if (this.f131282ab) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f131280W) {
            return false;
        } else {
            this.f131282ab = false;
            m104198a(0, 0.0f, 0);
            if (this.f131282ab) {
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
                    z = m104215d(17);
                } else if (keyCode == 22) {
                    z = m104215d(66);
                } else if (keyCode == 61) {
                    if (keyEvent.hasNoModifiers()) {
                        z = m104215d(2);
                    } else if (keyEvent.hasModifiers(1)) {
                        z = m104215d(1);
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
        if (this.f131292am != i) {
            this.f131292am = i;
            if (this.f131287ag != null) {
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
            List<ViewPager.AbstractC1579e> list = this.f131284ad;
            if (!(list == null || list.isEmpty())) {
                for (ViewPager.AbstractC1579e eVar : this.f131284ad) {
                    eVar.onPageScrollStateChanged(i);
                }
            }
        }
    }

    /* renamed from: b */
    private C57526c m104212b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return m104196a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* renamed from: c */
    private boolean m104213c(float f) {
        boolean z;
        this.f131267J = f;
        float scrollY = ((float) getScrollY()) + (this.f131267J - f);
        float clientHeight = (float) getClientHeight();
        float f2 = this.f131311v * clientHeight;
        float f3 = this.f131312w * clientHeight;
        boolean z2 = false;
        if (this.f131298i.size() <= 0) {
            return false;
        }
        C57526c cVar = this.f131298i.get(0);
        ArrayList<C57526c> arrayList = this.f131298i;
        boolean z3 = true;
        C57526c cVar2 = arrayList.get(arrayList.size() - 1);
        if (cVar.f131323b != 0) {
            f2 = cVar.f131326e * clientHeight;
            z = false;
        } else {
            z = true;
        }
        if (cVar2.f131323b != this.f131294c.getCount() - 1) {
            f3 = cVar2.f131326e * clientHeight;
            z3 = false;
        }
        if (scrollY < f2) {
            if (z) {
                z2 = this.f131278U.mo3011a(Math.abs(f2 - scrollY) / clientHeight);
            }
            scrollY = f2;
        } else if (scrollY > f3) {
            if (z3) {
                z2 = this.f131279V.mo3011a(Math.abs(scrollY - f3) / clientHeight);
            }
            scrollY = f3;
        }
        int i = (int) scrollY;
        this.f131266I += scrollY - ((float) i);
        scrollTo(getScrollX(), i);
        m104214c(i);
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r7 != 2) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m104215d(int r7) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.VerticalViewPager.m104215d(int):boolean");
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
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f131294c) != null && pagerAdapter.getCount() > 1)) {
            if (!this.f131278U.f3048a.isFinished()) {
                int save = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), this.f131311v * ((float) height));
                this.f131278U.mo3009a(width, height);
                z = false | this.f131278U.mo3012a(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f131279V.f3048a.isFinished()) {
                int save2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((float) ((-width2) - getPaddingLeft()), (-(this.f131312w + 1.0f)) * ((float) height2));
                this.f131279V.mo3009a(width2, height2);
                z |= this.f131279V.mo3012a(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                C0792v.m2764c(this);
                return;
            }
            return;
        }
        this.f131278U.f3048a.finish();
        this.f131279V.f3048a.finish();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.f131307r > 0 && this.f131308s != null && this.f131298i.size() > 0 && this.f131294c != null) {
            int scrollY = getScrollY();
            int height = getHeight();
            float f2 = (float) height;
            float f3 = ((float) this.f131307r) / f2;
            int i = 0;
            C57526c cVar = this.f131298i.get(0);
            float f4 = cVar.f131326e;
            int size = this.f131298i.size();
            int i2 = this.f131298i.get(size - 1).f131323b;
            for (int i3 = cVar.f131323b; i3 < i2; i3++) {
                while (i3 > cVar.f131323b && i < size) {
                    i++;
                    cVar = this.f131298i.get(i);
                }
                if (i3 == cVar.f131323b) {
                    f = (cVar.f131326e + cVar.f131325d) * f2;
                    f4 = cVar.f131326e + cVar.f131325d + f3;
                } else {
                    float pageWidth = this.f131294c.getPageWidth(i3);
                    f = (f4 + pageWidth) * f2;
                    f4 += pageWidth + f3;
                }
                int i4 = this.f131307r;
                if (((float) i4) + f > ((float) scrollY)) {
                    this.f131308s.setBounds(this.f131309t, (int) f, this.f131310u, (int) (((float) i4) + f + 0.5f));
                    this.f131308s.draw(canvas);
                }
                if (f > ((float) (scrollY + height))) {
                    return;
                }
            }
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f131294c;
        if (pagerAdapter2 != null) {
            m104205a(pagerAdapter2, (C57530g) null);
            this.f131294c.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f131298i.size(); i++) {
                C57526c cVar = this.f131298i.get(i);
                this.f131294c.destroyItem((ViewGroup) this, cVar.f131323b, cVar.f131322a);
            }
            this.f131294c.finishUpdate((ViewGroup) this);
            this.f131298i.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C57527d) getChildAt(i2).getLayoutParams()).f131327a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f131295d = 0;
            scrollTo(0, 0);
        }
        this.f131294c = pagerAdapter;
        this.f131297g = 0;
        if (pagerAdapter != null) {
            if (this.f131306q == null) {
                this.f131306q = new C57530g(this, (byte) 0);
            }
            m104205a(this.f131294c, this.f131306q);
            this.f131259B = false;
            boolean z = this.f131280W;
            this.f131280W = true;
            this.f131297g = this.f131294c.getCount();
            if (this.f131301l >= 0) {
                this.f131294c.restoreState(this.f131302m, this.f131303n);
                m104202a(this.f131301l, false, true);
                this.f131301l = -1;
                this.f131302m = null;
                this.f131303n = null;
            } else if (!z) {
                mo94834f();
            } else {
                requestLayout();
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        try {
            if (this.f131276S) {
                return false;
            }
            int action = motionEvent.getAction() & 255;
            if (action != 3) {
                if (action != 1) {
                    if (action != 0) {
                        if (this.f131261D) {
                            return true;
                        }
                        if (this.f131262E) {
                            return false;
                        }
                    }
                    if (action == 0) {
                        this.f131266I = motionEvent.getX();
                        this.f131268K = motionEvent.getX();
                        this.f131267J = motionEvent.getY();
                        this.f131269L = motionEvent.getY();
                        this.f131270M = motionEvent.getPointerId(0);
                        this.f131262E = false;
                        this.f131305p = true;
                        this.f131304o.computeScrollOffset();
                        if (this.f131292am != 2 || Math.abs(this.f131304o.getFinalY() - this.f131304o.getCurrY()) <= this.f131275R) {
                            m104207a(false);
                            this.f131261D = false;
                        } else {
                            this.f131304o.abortAnimation();
                            this.f131259B = false;
                            mo94834f();
                            this.f131261D = true;
                            m104218i();
                            setScrollState(1);
                        }
                    } else if (action == 2) {
                        int i = this.f131270M;
                        if (i != -1) {
                            int findPointerIndex = motionEvent.findPointerIndex(i);
                            float y = motionEvent.getY(findPointerIndex);
                            float f2 = y - this.f131267J;
                            float abs = Math.abs(f2);
                            float x = motionEvent.getX(findPointerIndex);
                            float abs2 = Math.abs(x - this.f131268K);
                            if (f2 != 0.0f) {
                                float f3 = this.f131267J;
                                if (f3 >= ((float) this.f131264G) || f2 <= 0.0f) {
                                    if (f3 <= ((float) (getHeight() - this.f131264G)) || f2 >= 0.0f) {
                                        if (m104208a(this, false, (int) f2, (int) x, (int) y)) {
                                            this.f131266I = x;
                                            this.f131267J = y;
                                            this.f131262E = true;
                                            return false;
                                        }
                                    }
                                }
                            }
                            int i2 = this.f131265H;
                            if (abs > ((float) i2) && abs * 0.5f > abs2) {
                                this.f131261D = true;
                                m104218i();
                                setScrollState(1);
                                if (f2 > 0.0f) {
                                    f = this.f131269L + ((float) this.f131265H);
                                } else {
                                    f = this.f131269L - ((float) this.f131265H);
                                }
                                this.f131267J = f;
                                this.f131266I = x;
                                setScrollingCacheEnabled(true);
                            } else if (abs2 > ((float) i2)) {
                                this.f131262E = true;
                            }
                            if (this.f131261D && m104213c(y)) {
                                C0792v.m2764c(this);
                            }
                        }
                    } else if (action == 6) {
                        m104204a(motionEvent);
                    }
                    if (this.f131271N == null) {
                        this.f131271N = VelocityTracker.obtain();
                    }
                    this.f131271N.addMovement(motionEvent);
                    return this.f131261D;
                }
            }
            m104217h();
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
            if (this.f131276S) {
                return true;
            }
            if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && (pagerAdapter = this.f131294c) != null) {
                if (pagerAdapter.getCount() != 0) {
                    if (this.f131271N == null) {
                        this.f131271N = VelocityTracker.obtain();
                    }
                    this.f131271N.addMovement(motionEvent);
                    int action = motionEvent.getAction() & 255;
                    if (action != 0) {
                        if (action != 1) {
                            if (action == 2) {
                                if (!this.f131261D) {
                                    int findPointerIndex = motionEvent.findPointerIndex(this.f131270M);
                                    if (findPointerIndex == -1) {
                                        z = m104217h();
                                    } else {
                                        float y = motionEvent.getY(findPointerIndex);
                                        float abs = Math.abs(y - this.f131267J);
                                        float x = motionEvent.getX(findPointerIndex);
                                        float abs2 = Math.abs(x - this.f131266I);
                                        if (abs > ((float) this.f131265H) && abs > abs2) {
                                            this.f131261D = true;
                                            m104218i();
                                            float f2 = this.f131269L;
                                            if (y - f2 > 0.0f) {
                                                f = f2 + ((float) this.f131265H);
                                            } else {
                                                f = f2 - ((float) this.f131265H);
                                            }
                                            this.f131267J = f;
                                            this.f131266I = x;
                                            setScrollState(1);
                                            setScrollingCacheEnabled(true);
                                            ViewParent parent = getParent();
                                            if (parent != null) {
                                                parent.requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                                if (this.f131261D) {
                                    z = false | m104213c(motionEvent.getY(motionEvent.findPointerIndex(this.f131270M)));
                                }
                            } else if (action != 3) {
                                if (action == 5) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    this.f131267J = motionEvent.getY(actionIndex);
                                    this.f131270M = motionEvent.getPointerId(actionIndex);
                                } else if (action == 6) {
                                    m104204a(motionEvent);
                                    this.f131267J = motionEvent.getY(motionEvent.findPointerIndex(this.f131270M));
                                }
                            } else if (this.f131261D) {
                                m104201a(this.f131295d, true, 0, false);
                                z = m104217h();
                            }
                        } else if (this.f131261D) {
                            VelocityTracker velocityTracker = this.f131271N;
                            velocityTracker.computeCurrentVelocity(1000, (float) this.f131273P);
                            int yVelocity = (int) velocityTracker.getYVelocity(this.f131270M);
                            this.f131259B = true;
                            int clientHeight = getClientHeight();
                            int scrollY = getScrollY();
                            C57526c j = m104219j();
                            if (j != null) {
                                float f3 = (float) clientHeight;
                                m104203a(m104194a(j.f131323b, ((((float) scrollY) / f3) - j.f131326e) / (j.f131325d + (((float) this.f131307r) / f3)), yVelocity, (int) (motionEvent.getY(motionEvent.findPointerIndex(this.f131270M)) - this.f131269L)), true, true, yVelocity);
                            }
                            z = m104217h();
                        }
                        if (z) {
                            C0792v.m2764c(this);
                        }
                    } else {
                        this.f131304o.abortAnimation();
                        this.f131259B = false;
                        mo94834f();
                        this.f131266I = motionEvent.getX();
                        this.f131268K = motionEvent.getX();
                        this.f131267J = motionEvent.getY();
                        this.f131269L = motionEvent.getY();
                        this.f131270M = motionEvent.getPointerId(0);
                    }
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalStateException e2) {
            if (this.f131294c.getCount() != this.f131297g) {
                this.f131294c.notifyDataSetChanged();
            }
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r7.f131323b == r17.f131295d) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        r12 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (r12 < 0) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        r13 = r17.f131298i.get(r12);
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
        r1 = r17.f131295d - 1;
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
        if (r1 != r13.f131323b) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0098, code lost:
        if (r13.f131324c != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        r17.f131298i.remove(r12);
        r17.f131294c.destroyItem((android.view.ViewGroup) r17, r1, r13.f131322a);
        r12 = r12 - 1;
        r8 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        r13 = r17.f131298i.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        if (r13 == null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bb, code lost:
        if (r1 != r13.f131323b) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        r15 = r15 + r13.f131325d;
        r12 = r12 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c4, code lost:
        r13 = r17.f131298i.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cd, code lost:
        r15 = r15 + m104211b(r1, r12 + 1).f131325d;
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        if (r12 < 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        r13 = r17.f131298i.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e3, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e5, code lost:
        r2 = (2.0f - r7.f131325d) + (((float) getPaddingLeft()) / ((float) r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f2, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0101, code lost:
        if (r7 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0105, code lost:
        r4 = r7.f131325d;
        r2 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010b, code lost:
        if (r4 >= 2.0f) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0113, code lost:
        if (r2 >= r17.f131298i.size()) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0115, code lost:
        r13 = r17.f131298i.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011d, code lost:
        if (r11 > 0) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011f, code lost:
        r1 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0120, code lost:
        r11 = r17.f131295d;
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
        if (r11 != r13.f131323b) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0134, code lost:
        if (r13.f131324c != false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0136, code lost:
        r17.f131298i.remove(r2);
        r17.f131294c.destroyItem((android.view.ViewGroup) r17, r11, r13.f131322a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0148, code lost:
        if (r2 >= r17.f131298i.size()) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x014a, code lost:
        r13 = r17.f131298i.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0153, code lost:
        if (r13 == null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0157, code lost:
        if (r11 != r13.f131323b) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0159, code lost:
        r4 = r4 + r13.f131325d;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0164, code lost:
        if (r2 >= r17.f131298i.size()) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0166, code lost:
        r13 = r17.f131298i.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016f, code lost:
        r0 = m104211b(r11, r2);
        r2 = r2 + 1;
        r4 = r4 + r0.f131325d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x017e, code lost:
        if (r2 >= r17.f131298i.size()) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0180, code lost:
        r13 = r17.f131298i.get(r2);
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
        m104206a(r7, r8, r10);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m104197a(int r18) {
        /*
        // Method dump skipped, instructions count: 629
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.VerticalViewPager.m104197a(int):void");
    }

    /* renamed from: a */
    private static void m104205a(PagerAdapter pagerAdapter, C57530g gVar) {
        try {
            Field field = f131256e;
            if (field != null) {
                field.set(pagerAdapter, gVar);
            }
        } catch (IllegalAccessException unused) {
        }
    }

    /* renamed from: a */
    public final void mo94821a(int i, boolean z) {
        this.f131259B = false;
        m104202a(i, z, false);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f131289ai == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C57527d) this.f131290aj.get(i2).getLayoutParams()).f131332f;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C57526c a;
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
            if (childAt.getVisibility() == 0 && (a = m104196a(childAt)) != null && a.f131323b == this.f131295d && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    /* renamed from: b */
    private C57526c m104211b(int i, int i2) {
        C57526c cVar = new C57526c();
        cVar.f131323b = i;
        cVar.f131322a = this.f131294c.instantiateItem((ViewGroup) this, i);
        cVar.f131325d = this.f131294c.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f131298i.size()) {
            this.f131298i.add(cVar);
        } else {
            this.f131298i.add(i2, cVar);
        }
        return cVar;
    }

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f131304o = new Scroller(context2, f131255b);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.f131265H = viewConfiguration.getScaledPagingTouchSlop();
        this.f131272O = (int) (400.0f * f);
        this.f131273P = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f131278U = new C0819d(context2);
        this.f131279V = new C0819d(context2);
        this.f131274Q = (int) (25.0f * f);
        this.f131275R = (int) (2.0f * f);
        this.f131263F = (int) (f * 16.0f);
        C0792v.m2747a(this, new C57528e());
        if (C0792v.m2766d(this) == 0) {
            C0792v.m2740a((View) this, 1);
        }
        C0792v.m2748a(this, new AbstractC0788r() {
            /* class com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.VerticalViewPager.C575224 */

            /* renamed from: b */
            private final Rect f131318b = new Rect();

            static {
                Covode.recordClassIndex(67466);
            }

            @Override // androidx.core.p037h.AbstractC0788r
            /* renamed from: a */
            public final C0753ad mo553a(View view, C0753ad adVar) {
                C0753ad a = C0792v.m2737a(view, adVar);
                if (a.f2888b.mo2877b()) {
                    return a;
                }
                Rect rect = this.f131318b;
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
    private Rect m104195a(Rect rect, View view) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.VerticalViewPager.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m104199a(int i, int i2) {
        int scrollY;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f131304o;
        if (scroller == null || scroller.isFinished()) {
            scrollY = getScrollY();
        } else {
            if (this.f131305p) {
                scrollY = this.f131304o.getCurrY();
            } else {
                scrollY = this.f131304o.getStartY();
            }
            this.f131304o.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int scrollX = getScrollX();
        int i3 = 0 - scrollX;
        int i4 = i - scrollY;
        if (i3 == 0 && i4 == 0) {
            m104207a(false);
            mo94834f();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientHeight = getClientHeight();
        int i5 = clientHeight / 2;
        float f = (float) clientHeight;
        float f2 = (float) i5;
        float b = f2 + (m104209b(Math.min(1.0f, (((float) Math.abs(i3)) * 1.0f) / f)) * f2);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(b / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i3)) / ((f * this.f131294c.getPageWidth(this.f131295d)) + ((float) this.f131307r))) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.f131305p = false;
        this.f131304o.startScroll(scrollX, scrollY, i3, i4, min);
        C0792v.m2764c(this);
    }

    /* renamed from: a */
    private void m104202a(int i, boolean z, boolean z2) {
        m104203a(i, z, z2, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C57527d dVar = (C57527d) layoutParams;
        dVar.f131327a |= view instanceof AbstractC57524a;
        if (!this.f131315z) {
            super.addView(view, i, layoutParams);
        } else if (!dVar.f131327a) {
            dVar.f131330d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C57526c a;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (a = m104196a(childAt)) != null && a.f131323b == this.f131295d) {
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
    private void m104198a(int i, float f, int i2) {
        int i3;
        int i4;
        if (this.f131283ac > 0) {
            int scrollY = getScrollY();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                C57527d dVar = (C57527d) childAt.getLayoutParams();
                if (dVar.f131327a) {
                    int i6 = dVar.f131328b & 112;
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
        List<ViewPager.AbstractC1579e> list = this.f131284ad;
        if (list != null && !list.isEmpty()) {
            for (ViewPager.AbstractC1579e eVar : this.f131284ad) {
                eVar.onPageScrolled(i, f, i2);
            }
        }
        ViewPager.AbstractC1579e eVar2 = this.f131285ae;
        if (eVar2 != null) {
            eVar2.onPageScrolled(i, f, i2);
        }
        if (this.f131287ag != null) {
            int scrollY2 = getScrollY();
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = getChildAt(i7);
                if (!((C57527d) childAt2.getLayoutParams()).f131327a) {
                    this.f131287ag.mo5330a(childAt2, ((float) (childAt2.getTop() - scrollY2)) / ((float) getClientHeight()));
                }
            }
        }
        this.f131282ab = true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            int i5 = this.f131307r;
            m104200a(i2, i4, i5, i5);
        }
    }

    /* renamed from: a */
    private int m104194a(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) <= this.f131274Q || Math.abs(i2) <= this.f131272O) {
            if (i >= this.f131295d) {
                f2 = 0.6f;
            } else {
                f2 = 0.4f;
            }
            i = (int) (((float) i) + f + f2);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f131298i.size() <= 0) {
            return i;
        }
        ArrayList<C57526c> arrayList = this.f131298i;
        return Math.max(this.f131298i.get(0).f131323b, Math.min(i, arrayList.get(arrayList.size() - 1).f131323b));
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
                C57527d dVar = (C57527d) childAt.getLayoutParams();
                if (dVar.f131327a) {
                    int i13 = dVar.f131328b & 7;
                    int i14 = dVar.f131328b & 112;
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
                C57527d dVar2 = (C57527d) childAt2.getLayoutParams();
                C57526c a = m104196a(childAt2);
                if (!dVar2.f131327a && a != null) {
                    float f = (float) i16;
                    int i18 = ((int) (a.f131326e * f)) + paddingTop;
                    if (dVar2.f131330d) {
                        dVar2.f131330d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((i9 - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f * dVar2.f131329c), 1073741824));
                    }
                    childAt2.layout(paddingLeft, i18, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + i18);
                }
            }
        }
        this.f131309t = paddingLeft;
        this.f131310u = i9 - paddingRight;
        this.f131283ac = i11;
        if (this.f131280W) {
            z2 = false;
            m104201a(this.f131295d, false, 0, false);
        } else {
            z2 = false;
        }
        this.f131280W = z2;
    }
}
