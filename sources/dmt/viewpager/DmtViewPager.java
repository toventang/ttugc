package dmt.viewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.C0643b;
import androidx.core.p037h.AbstractC0788r;
import androidx.core.p037h.C0726a;
import androidx.core.p037h.C0753ad;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.p038a.C0733d;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DmtViewPager extends ViewGroup {

    /* renamed from: ak */
    private static final C88331h f200449ak = new C88331h();

    /* renamed from: d */
    private static final Comparator<C88325b> f200450d = new Comparator<C88325b>() {
        /* class dmt.viewpager.DmtViewPager.C883191 */

        static {
            Covode.recordClassIndex(104357);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C88325b bVar, C88325b bVar2) {
            return bVar.f200518b - bVar2.f200518b;
        }
    };

    /* renamed from: e */
    private static final Interpolator f200451e = new Interpolator() {
        /* class dmt.viewpager.DmtViewPager.animationInterpolatorC883202 */

        static {
            Covode.recordClassIndex(104358);
        }

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: g */
    static final int[] f200452g = {16842931};

    /* renamed from: A */
    private int f200453A;

    /* renamed from: B */
    private int f200454B;

    /* renamed from: C */
    private boolean f200455C;

    /* renamed from: D */
    private boolean f200456D;

    /* renamed from: E */
    private int f200457E = 1;

    /* renamed from: F */
    private boolean f200458F;

    /* renamed from: G */
    private boolean f200459G;

    /* renamed from: H */
    private int f200460H;

    /* renamed from: I */
    private int f200461I;

    /* renamed from: J */
    private int f200462J;

    /* renamed from: K */
    private float f200463K;

    /* renamed from: L */
    private float f200464L;

    /* renamed from: M */
    private float f200465M;

    /* renamed from: N */
    private float f200466N;

    /* renamed from: O */
    private int f200467O = -1;

    /* renamed from: P */
    private VelocityTracker f200468P;

    /* renamed from: Q */
    private int f200469Q;

    /* renamed from: R */
    private int f200470R;

    /* renamed from: S */
    private int f200471S;

    /* renamed from: T */
    private int f200472T;

    /* renamed from: U */
    private EdgeEffect f200473U;

    /* renamed from: V */
    private EdgeEffect f200474V;

    /* renamed from: W */
    private boolean f200475W = true;

    /* renamed from: a */
    private boolean f200476a = true;

    /* renamed from: aa */
    private boolean f200477aa = false;

    /* renamed from: ab */
    private boolean f200478ab;

    /* renamed from: ac */
    private int f200479ac;

    /* renamed from: ad */
    private List<ViewPager.AbstractC1579e> f200480ad;

    /* renamed from: ae */
    private ViewPager.AbstractC1579e f200481ae;

    /* renamed from: af */
    private ViewPager.AbstractC1579e f200482af;

    /* renamed from: ag */
    private AbstractC88329f f200483ag;

    /* renamed from: ah */
    private int f200484ah;

    /* renamed from: ai */
    private int f200485ai;

    /* renamed from: aj */
    private ArrayList<View> f200486aj;

    /* renamed from: al */
    private final Runnable f200487al = new Runnable() {
        /* class dmt.viewpager.DmtViewPager.RunnableC883213 */

        static {
            Covode.recordClassIndex(104359);
        }

        public final void run() {
            DmtViewPager.this.setScrollState(0);
            DmtViewPager.this.mo142817d();
        }
    };

    /* renamed from: am */
    private int f200488am = 0;

    /* renamed from: b */
    private boolean f200489b = true;

    /* renamed from: c */
    private int f200490c;

    /* renamed from: f */
    private final ArrayList<C88325b> f200491f = new ArrayList<>();

    /* renamed from: h */
    PagerAdapter f200492h;

    /* renamed from: i */
    int f200493i;

    /* renamed from: j */
    public boolean f200494j;

    /* renamed from: k */
    public boolean f200495k;

    /* renamed from: l */
    public List<AbstractC88328e> f200496l;

    /* renamed from: m */
    private final C88325b f200497m = new C88325b();

    /* renamed from: n */
    private final Rect f200498n = new Rect();

    /* renamed from: o */
    private int f200499o = -1;

    /* renamed from: p */
    private Parcelable f200500p = null;

    /* renamed from: q */
    private ClassLoader f200501q = null;

    /* renamed from: r */
    private Scroller f200502r;

    /* renamed from: s */
    private boolean f200503s;

    /* renamed from: t */
    private C88330g f200504t;

    /* renamed from: u */
    private int f200505u;

    /* renamed from: v */
    private Drawable f200506v;

    /* renamed from: w */
    private int f200507w;

    /* renamed from: x */
    private int f200508x;

    /* renamed from: y */
    private float f200509y = -3.4028235E38f;

    /* renamed from: z */
    private float f200510z = Float.MAX_VALUE;

    /* renamed from: dmt.viewpager.DmtViewPager$a */
    public @interface AbstractC88324a {
        static {
            Covode.recordClassIndex(104363);
        }
    }

    /* renamed from: dmt.viewpager.DmtViewPager$e */
    public interface AbstractC88328e {
        static {
            Covode.recordClassIndex(104367);
        }

        /* renamed from: a */
        void mo116221a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    /* renamed from: dmt.viewpager.DmtViewPager$f */
    public interface AbstractC88329f {
        static {
            Covode.recordClassIndex(104368);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.viewpager.DmtViewPager$b */
    public static class C88325b {

        /* renamed from: a */
        Object f200517a;

        /* renamed from: b */
        int f200518b;

        /* renamed from: c */
        boolean f200519c;

        /* renamed from: d */
        float f200520d;

        /* renamed from: e */
        float f200521e;

        static {
            Covode.recordClassIndex(104364);
        }

        C88325b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.viewpager.DmtViewPager$h */
    public static class C88331h implements Comparator<View> {
        static {
            Covode.recordClassIndex(104370);
        }

        C88331h() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            C88326c cVar = (C88326c) view.getLayoutParams();
            C88326c cVar2 = (C88326c) view2.getLayoutParams();
            if (cVar.f200522a == cVar2.f200522a) {
                return cVar.f200526e - cVar2.f200526e;
            }
            if (cVar.f200522a) {
                return 1;
            }
            return -1;
        }
    }

    public PagerAdapter getAdapter() {
        return this.f200492h;
    }

    public int getCurrentItem() {
        return this.f200493i;
    }

    public int getOffscreenPageLimit() {
        return this.f200457E;
    }

    public int getPageMargin() {
        return this.f200505u;
    }

    /* renamed from: a */
    private static void m153497a(PagerAdapter pagerAdapter, C88330g gVar) {
        try {
            Method declaredMethod = PagerAdapter.class.getDeclaredMethod("setViewPagerObserver", DataSetObserver.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(pagerAdapter, gVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m153495a(int i, boolean z, boolean z2, int i2) {
        PagerAdapter pagerAdapter = this.f200492h;
        boolean z3 = false;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f200493i != i || this.f200491f.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f200492h.getCount()) {
                i = this.f200492h.getCount() - 1;
            }
            int i3 = this.f200457E;
            int i4 = this.f200493i;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f200491f.size(); i5++) {
                    this.f200491f.get(i5).f200519c = true;
                }
            }
            boolean z4 = this.f200493i != i;
            if (this.f200489b || !z) {
                z3 = true;
            }
            this.f200476a = z3;
            if (this.f200475W) {
                this.f200493i = i;
                if (z4) {
                    m153507d(i);
                }
                requestLayout();
                return;
            }
            mo61354a(i);
            m153493a(i, z, i2, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    private void m153493a(int i, boolean z, int i2, boolean z2) {
        C88325b b = m153500b(i);
        int clientWidth = b != null ? (int) (((float) getClientWidth()) * Math.max(this.f200509y, Math.min(b.f200521e, this.f200510z))) : 0;
        if (z) {
            m153491a(clientWidth, i2);
            if (z2) {
                m153507d(i);
                return;
            }
            return;
        }
        if (z2) {
            m153507d(i);
        }
        m153499a(false);
        scrollTo(clientWidth, 0);
        m153506c(clientWidth);
    }

    /* renamed from: a */
    public void mo61356a(ViewPager.AbstractC1579e eVar) {
        if (this.f200480ad == null) {
            this.f200480ad = new ArrayList();
        }
        this.f200480ad.add(eVar);
    }

    /* renamed from: a */
    private void m153498a(C88325b bVar, int i, C88325b bVar2) {
        C88325b bVar3;
        C88325b bVar4;
        int count = this.f200492h.getCount();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f200505u) / ((float) clientWidth) : 0.0f;
        if (bVar2 != null) {
            int i2 = bVar2.f200518b;
            if (i2 < bVar.f200518b) {
                float f2 = bVar2.f200521e + bVar2.f200520d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bVar.f200518b && i4 < this.f200491f.size()) {
                    C88325b bVar5 = this.f200491f.get(i4);
                    while (true) {
                        bVar4 = bVar5;
                        if (i3 > bVar4.f200518b && i4 < this.f200491f.size() - 1) {
                            i4++;
                            bVar5 = this.f200491f.get(i4);
                        }
                    }
                    while (i3 < bVar4.f200518b) {
                        f2 += this.f200492h.getPageWidth(i3) + f;
                        i3++;
                    }
                    bVar4.f200521e = f2;
                    f2 += bVar4.f200520d + f;
                    i3++;
                }
            } else if (i2 > bVar.f200518b) {
                int size = this.f200491f.size() - 1;
                float f3 = bVar2.f200521e;
                int i5 = i2 - 1;
                while (i5 >= bVar.f200518b && size >= 0) {
                    C88325b bVar6 = this.f200491f.get(size);
                    while (true) {
                        bVar3 = bVar6;
                        if (i5 < bVar3.f200518b && size > 0) {
                            size--;
                            bVar6 = this.f200491f.get(size);
                        }
                    }
                    while (i5 > bVar3.f200518b) {
                        f3 -= this.f200492h.getPageWidth(i5) + f;
                        i5--;
                    }
                    f3 -= bVar3.f200520d + f;
                    bVar3.f200521e = f3;
                    i5--;
                }
            }
        }
        int size2 = this.f200491f.size();
        float f4 = bVar.f200521e;
        int i6 = bVar.f200518b - 1;
        this.f200509y = bVar.f200518b == 0 ? bVar.f200521e : -3.4028235E38f;
        int i7 = count - 1;
        this.f200510z = bVar.f200518b == i7 ? (bVar.f200521e + bVar.f200520d) - 1.0f : Float.MAX_VALUE;
        int i8 = i - 1;
        while (i8 >= 0) {
            C88325b bVar7 = this.f200491f.get(i8);
            while (i6 > bVar7.f200518b) {
                f4 -= this.f200492h.getPageWidth(i6) + f;
                i6--;
            }
            f4 -= bVar7.f200520d + f;
            bVar7.f200521e = f4;
            if (bVar7.f200518b == 0) {
                this.f200509y = f4;
            }
            i8--;
            i6--;
        }
        float f5 = bVar.f200521e + bVar.f200520d + f;
        int i9 = bVar.f200518b + 1;
        int i10 = i + 1;
        while (i10 < size2) {
            C88325b bVar8 = this.f200491f.get(i10);
            while (i9 < bVar8.f200518b) {
                f5 += this.f200492h.getPageWidth(i9) + f;
                i9++;
            }
            if (bVar8.f200518b == i7) {
                this.f200510z = (bVar8.f200520d + f5) - 1.0f;
            }
            bVar8.f200521e = f5;
            f5 += bVar8.f200520d + f;
            i10++;
            i9++;
        }
        this.f200477aa = false;
    }

    /* renamed from: a */
    private void m153492a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f200491f.isEmpty()) {
            C88325b b = m153500b(this.f200493i);
            int min = (int) ((b != null ? Math.min(b.f200521e, this.f200510z) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m153499a(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.f200502r.isFinished()) {
            this.f200502r.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    /* renamed from: a */
    private void m153499a(boolean z) {
        boolean z2;
        if (this.f200488am == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.f200502r.isFinished()) {
                this.f200502r.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f200502r.getCurrX();
                int currY = this.f200502r.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m153506c(currX);
                    }
                }
            } else if (this.f200502r.getCurrX() != getScrollX()) {
                scrollTo(this.f200502r.getCurrX(), this.f200502r.getCurrY());
            }
        } else {
            z2 = false;
        }
        this.f200494j = false;
        for (int i = 0; i < this.f200491f.size(); i++) {
            C88325b bVar = this.f200491f.get(i);
            if (bVar.f200519c) {
                bVar.f200519c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            C0792v.m2750a(this, this.f200487al);
        } else {
            this.f200487al.run();
        }
    }

    /* renamed from: a */
    private void m153496a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f200467O) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f200463K = motionEvent.getX(i);
            this.f200467O = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f200468P;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    public boolean mo61298a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && mo61298a(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    /* renamed from: dmt.viewpager.DmtViewPager$c */
    public static class C88326c extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f200522a;

        /* renamed from: b */
        public int f200523b;

        /* renamed from: c */
        float f200524c;

        /* renamed from: d */
        boolean f200525d;

        /* renamed from: e */
        public int f200526e;

        /* renamed from: f */
        public int f200527f;

        static {
            Covode.recordClassIndex(104365);
        }

        public C88326c() {
            super(-1, -1);
        }

        public C88326c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DmtViewPager.f200452g);
            this.f200523b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.viewpager.DmtViewPager$g */
    public class C88330g extends DataSetObserver {
        static {
            Covode.recordClassIndex(104369);
        }

        public final void onChanged() {
            DmtViewPager.this.mo142814c();
        }

        public final void onInvalidated() {
            DmtViewPager.this.mo142814c();
        }

        C88330g() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo142817d() {
        mo61354a(this.f200493i);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C88326c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f200475W = true;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class dmt.viewpager.DmtViewPager.SavedState.C883231 */

            static {
                Covode.recordClassIndex(104362);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        int f200514a;

        /* renamed from: b */
        Parcelable f200515b;

        /* renamed from: e */
        ClassLoader f200516e;

        static {
            Covode.recordClassIndex(104361);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f200514a + "}";
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f200514a);
            parcel.writeParcelable(this.f200515b, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f200514a = parcel.readInt();
            this.f200515b = parcel.readParcelable(classLoader);
            this.f200516e = classLoader;
        }
    }

    /* renamed from: g */
    private void m153511g() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: i */
    private void m153513i() {
        this.f200458F = false;
        this.f200459G = false;
        VelocityTracker velocityTracker = this.f200468P;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f200468P = null;
        }
    }

    /* renamed from: j */
    private boolean m153514j() {
        int i = this.f200493i;
        if (i <= 0) {
            return false;
        }
        mo61355a(i - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: dmt.viewpager.DmtViewPager$d */
    public class C88327d extends C0726a {
        static {
            Covode.recordClassIndex(104366);
        }

        /* renamed from: a */
        private boolean m153523a() {
            if (DmtViewPager.this.f200492h == null || DmtViewPager.this.f200492h.getCount() <= 1) {
                return false;
            }
            return true;
        }

        C88327d() {
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final void mo2808a(View view, C0733d dVar) {
            super.mo2808a(view, dVar);
            dVar.mo2834a((CharSequence) getClass().getName());
            dVar.mo2844d(m153523a());
            if (DmtViewPager.this.canScrollHorizontally(1)) {
                dVar.mo2829a(4096);
            }
            if (DmtViewPager.this.canScrollHorizontally(-1)) {
                dVar.mo2829a(8192);
            }
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: d */
        public final void mo2813d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2813d(view, accessibilityEvent);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setScrollable(m153523a());
            if (accessibilityEvent.getEventType() == 4096 && DmtViewPager.this.f200492h != null) {
                accessibilityEvent.setItemCount(DmtViewPager.this.f200492h.getCount());
                accessibilityEvent.setFromIndex(DmtViewPager.this.f200493i);
                accessibilityEvent.setToIndex(DmtViewPager.this.f200493i);
            }
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final boolean mo2809a(View view, int i, Bundle bundle) {
            if (super.mo2809a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !DmtViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                DmtViewPager dmtViewPager = DmtViewPager.this;
                dmtViewPager.setCurrentItem(dmtViewPager.f200493i - 1);
                return true;
            } else if (!DmtViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                DmtViewPager dmtViewPager2 = DmtViewPager.this;
                dmtViewPager2.setCurrentItem(dmtViewPager2.f200493i + 1);
                return true;
            }
        }
    }

    /* renamed from: k */
    private boolean m153515k() {
        PagerAdapter pagerAdapter = this.f200492h;
        if (pagerAdapter == null || this.f200493i >= pagerAdapter.getCount() - 1) {
            return false;
        }
        mo61355a(this.f200493i + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f200506v;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f200487al);
        Scroller scroller = this.f200502r;
        if (scroller != null && !scroller.isFinished()) {
            this.f200502r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f200514a = this.f200493i;
        PagerAdapter pagerAdapter = this.f200492h;
        if (pagerAdapter != null) {
            savedState.f200515b = pagerAdapter.saveState();
        }
        return savedState;
    }

    static {
        Covode.recordClassIndex(104356);
    }

    /* renamed from: e */
    private void m153508e() {
        if (this.f200485ai != 0) {
            ArrayList<View> arrayList = this.f200486aj;
            if (arrayList == null) {
                this.f200486aj = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f200486aj.add(getChildAt(i));
            }
            Collections.sort(this.f200486aj, f200449ak);
        }
    }

    /* renamed from: f */
    private boolean m153510f() {
        this.f200467O = -1;
        m153513i();
        this.f200473U.onRelease();
        this.f200474V.onRelease();
        if (this.f200473U.isFinished() || this.f200474V.isFinished()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private C88325b m153512h() {
        float f;
        float f2;
        int i;
        int clientWidth = getClientWidth();
        float f3 = 0.0f;
        if (clientWidth > 0) {
            f = ((float) getScrollX()) / ((float) clientWidth);
            f2 = ((float) this.f200505u) / ((float) clientWidth);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C88325b bVar = null;
        float f4 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f200491f.size()) {
            C88325b bVar2 = this.f200491f.get(i3);
            if (!z && bVar2.f200518b != (i = i2 + 1)) {
                bVar2 = this.f200497m;
                bVar2.f200521e = f3 + f4 + f2;
                bVar2.f200518b = i;
                bVar2.f200520d = this.f200492h.getPageWidth(bVar2.f200518b);
                i3--;
            }
            f3 = bVar2.f200521e;
            float f5 = bVar2.f200520d + f3 + f2;
            if (!z && f < f3) {
                return bVar;
            }
            if (f < f5 || i3 == this.f200491f.size() - 1) {
                return bVar2;
            }
            i2 = bVar2.f200518b;
            f4 = bVar2.f200520d;
            i3++;
            bVar = bVar2;
            z = false;
        }
        return bVar;
    }

    public void computeScroll() {
        this.f200503s = true;
        if (this.f200502r.isFinished() || !this.f200502r.computeScrollOffset()) {
            m153499a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f200502r.getCurrX();
        int currY = this.f200502r.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m153506c(currX)) {
                this.f200502r.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0792v.m2764c(this);
    }

    /* renamed from: a */
    private void mo61357a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f200502r = new Scroller(context, f200451e);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f200462J = viewConfiguration.getScaledPagingTouchSlop();
        this.f200469Q = (int) (400.0f * f);
        this.f200470R = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f200473U = new EdgeEffect(context);
        this.f200474V = new EdgeEffect(context);
        this.f200471S = (int) (25.0f * f);
        this.f200472T = (int) (2.0f * f);
        this.f200460H = (int) (f * 16.0f);
        C0792v.m2747a(this, new C88327d());
        if (C0792v.m2766d(this) == 0) {
            C0792v.m2740a((View) this, 1);
        }
        C0792v.m2748a(this, new AbstractC0788r() {
            /* class dmt.viewpager.DmtViewPager.C883224 */

            /* renamed from: b */
            private final Rect f200513b = new Rect();

            static {
                Covode.recordClassIndex(104360);
            }

            @Override // androidx.core.p037h.AbstractC0788r
            /* renamed from: a */
            public final C0753ad mo553a(View view, C0753ad adVar) {
                C0753ad a = C0792v.m2737a(view, adVar);
                if (a.f2888b.mo2877b()) {
                    return a;
                }
                Rect rect = this.f200513b;
                rect.left = a.mo2865a();
                rect.top = a.mo2867b();
                rect.right = a.mo2868c();
                rect.bottom = a.mo2869d();
                int childCount = DmtViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0753ad b = C0792v.m2757b(DmtViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.mo2865a(), rect.left);
                    rect.top = Math.min(b.mo2867b(), rect.top);
                    rect.right = Math.min(b.mo2868c(), rect.right);
                    rect.bottom = Math.min(b.mo2869d(), rect.bottom);
                }
                return a.mo2866a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* renamed from: b */
    private void mo142801b() {
        View view;
        if (getAdapter().getCount() == 3) {
            this.f200491f.size();
            getScrollX();
            getX();
            getChildCount();
            for (int i = 0; i < this.f200491f.size(); i++) {
                this.f200491f.get(i).f200517a.getClass();
                this.f200491f.get(i);
                if ((this.f200491f.get(i).f200517a instanceof Fragment) && (view = ((Fragment) this.f200491f.get(i).f200517a).getView()) != null) {
                    view.getLayoutParams();
                    view.getLeft();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo142814c() {
        boolean z;
        int count = this.f200492h.getCount();
        this.f200490c = count;
        if (this.f200491f.size() >= (this.f200457E * 2) + 1 || this.f200491f.size() >= count) {
            z = false;
        } else {
            z = true;
        }
        int i = this.f200493i;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f200491f.size()) {
            C88325b bVar = this.f200491f.get(i2);
            int itemPosition = this.f200492h.getItemPosition(bVar.f200517a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f200491f.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f200492h.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.f200492h.destroyItem((ViewGroup) this, bVar.f200518b, bVar.f200517a);
                    if (this.f200493i == bVar.f200518b) {
                        i = Math.max(0, Math.min(this.f200493i, count - 1));
                    }
                } else if (bVar.f200518b != itemPosition) {
                    if (bVar.f200518b == this.f200493i) {
                        i = itemPosition;
                    }
                    bVar.f200518b = itemPosition;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f200492h.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f200491f, f200450d);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C88326c cVar = (C88326c) getChildAt(i3).getLayoutParams();
                if (!cVar.f200522a) {
                    cVar.f200524c = 0.0f;
                }
            }
            m153494a(i, false, true);
            requestLayout();
        }
    }

    public void setCanTouchBeforeScrollIdle(boolean z) {
        this.f200489b = z;
    }

    public void setDefaultGutterSize(int i) {
        this.f200460H = i;
    }

    public void setOnPageChangeListener(ViewPager.AbstractC1579e eVar) {
        this.f200481ae = eVar;
    }

    public void setScroller(Scroller scroller) {
        this.f200502r = scroller;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f200456D != z) {
            this.f200456D = z;
        }
    }

    /* renamed from: b */
    public void mo61358b(ViewPager.AbstractC1579e eVar) {
        List<ViewPager.AbstractC1579e> list = this.f200480ad;
        if (list != null) {
            list.remove(eVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* renamed from: a */
    private static float m153485a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C88326c) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C88326c(getContext(), attributeSet);
    }

    public void setCurrentItem(int i) {
        this.f200494j = false;
        m153494a(i, !this.f200475W, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.f200457E) {
            this.f200457E = i;
            mo142817d();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.f200505u;
        this.f200505u = i;
        int width = getWidth();
        m153492a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0643b.m2369a(getContext(), i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f200506v) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private C88325b m153500b(int i) {
        for (int i2 = 0; i2 < this.f200491f.size(); i2++) {
            C88325b bVar = this.f200491f.get(i2);
            if (bVar.f200518b == i) {
                return bVar;
            }
        }
        return null;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1 && !this.f200476a) {
            motionEvent.setAction(1);
        }
        if (!this.f200476a) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void removeView(View view) {
        MethodCollector.m26663i(13178);
        if (this.f200455C) {
            removeViewInLayout(view);
            MethodCollector.m26664o(13178);
            return;
        }
        super.removeView(view);
        MethodCollector.m26664o(13178);
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.f200506v = drawable;
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
    private C88325b m153487a(View view) {
        for (int i = 0; i < this.f200491f.size(); i++) {
            C88325b bVar = this.f200491f.get(i);
            if (this.f200492h.isViewFromObject(view, bVar.f200517a)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    private void m153507d(int i) {
        ViewPager.AbstractC1579e eVar = this.f200481ae;
        if (eVar != null) {
            eVar.onPageSelected(i);
        }
        List<ViewPager.AbstractC1579e> list = this.f200480ad;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ViewPager.AbstractC1579e eVar2 = this.f200480ad.get(i2);
                if (eVar2 != null) {
                    eVar2.onPageSelected(i);
                }
            }
        }
        ViewPager.AbstractC1579e eVar3 = this.f200482af;
        if (eVar3 != null) {
            eVar3.onPageSelected(i);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        C88325b a;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = m153487a(childAt)) != null && a.f200518b == this.f200493i) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f200492h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f200509y))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.f200510z))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C88325b a;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = m153487a(childAt)) != null && a.f200518b == this.f200493i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
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
        super.onRestoreInstanceState(savedState.f3089d);
        PagerAdapter pagerAdapter = this.f200492h;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f200515b, savedState.f200516e);
            m153494a(savedState.f200514a, false, true);
            return;
        }
        this.f200499o = savedState.f200514a;
        this.f200500p = savedState.f200515b;
        this.f200501q = savedState.f200516e;
    }

    public DmtViewPager(Context context) {
        super(context);
        MethodCollector.m26663i(13015);
        mo61357a();
        MethodCollector.m26664o(13015);
    }

    /* renamed from: b */
    private C88325b m153502b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return m153487a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* renamed from: c */
    private boolean m153506c(int i) {
        if (this.f200491f.size() != 0) {
            C88325b h = m153512h();
            int clientWidth = getClientWidth();
            int i2 = this.f200505u;
            int i3 = clientWidth + i2;
            float f = (float) i2;
            float f2 = (float) clientWidth;
            int i4 = h.f200518b;
            float f3 = ((((float) i) / f2) - h.f200521e) / (h.f200520d + (f / f2));
            this.f200478ab = false;
            m153490a(i4, f3, (int) (((float) i3) * f3));
            if (this.f200478ab) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f200475W) {
            return false;
        } else {
            this.f200478ab = false;
            m153490a(0, 0.0f, 0);
            if (this.f200478ab) {
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
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode == 61) {
                            if (keyEvent.hasNoModifiers()) {
                                z = m153509e(2);
                            } else if (keyEvent.hasModifiers(1)) {
                                z = m153509e(1);
                            }
                        }
                    } else if (keyEvent.hasModifiers(2)) {
                        z = m153515k();
                    } else {
                        z = m153509e(66);
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    z = m153514j();
                } else {
                    z = m153509e(17);
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        boolean z;
        int i2;
        if (this.f200488am != i) {
            this.f200488am = i;
            if (this.f200483ag != null) {
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (z) {
                        i2 = this.f200484ah;
                    } else {
                        i2 = 0;
                    }
                    getChildAt(i3).setLayerType(i2, null);
                }
            }
            if (i == 0) {
                this.f200476a = true;
            }
            ViewPager.AbstractC1579e eVar = this.f200481ae;
            if (eVar != null) {
                eVar.onPageScrollStateChanged(i);
            }
            List<ViewPager.AbstractC1579e> list = this.f200480ad;
            if (list != null) {
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ViewPager.AbstractC1579e eVar2 = this.f200480ad.get(i4);
                    if (eVar2 != null) {
                        eVar2.onPageScrollStateChanged(i);
                    }
                }
            }
            ViewPager.AbstractC1579e eVar3 = this.f200482af;
            if (eVar3 != null) {
                eVar3.onPageScrollStateChanged(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r7 != 2) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m153509e(int r7) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.viewpager.DmtViewPager.m153509e(int):boolean");
    }

    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f200492h) != null && pagerAdapter.getCount() > 1)) {
            if (!this.f200473U.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f200509y * ((float) width));
                this.f200473U.setSize(height, width);
                z = false | this.f200473U.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f200474V.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f200510z + 1.0f)) * ((float) width2));
                this.f200474V.setSize(height2, width2);
                z |= this.f200474V.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                C0792v.m2764c(this);
                return;
            }
            return;
        }
        this.f200473U.finish();
        this.f200474V.finish();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        int i = 13247;
        MethodCollector.m26663i(13247);
        super.onDraw(canvas);
        if (this.f200505u > 0 && this.f200506v != null && this.f200491f.size() > 0 && this.f200492h != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f2 = (float) width;
            float f3 = ((float) this.f200505u) / f2;
            int i2 = 0;
            C88325b bVar = this.f200491f.get(0);
            float f4 = bVar.f200521e;
            int size = this.f200491f.size();
            int i3 = bVar.f200518b;
            int i4 = this.f200491f.get(size - 1).f200518b;
            while (true) {
                if (i3 >= i4) {
                    break;
                }
                while (i3 > bVar.f200518b && i2 < size) {
                    i2++;
                    bVar = this.f200491f.get(i2);
                }
                if (i3 == bVar.f200518b) {
                    f = (bVar.f200521e + bVar.f200520d) * f2;
                    f4 = bVar.f200521e + bVar.f200520d + f3;
                } else {
                    float pageWidth = this.f200492h.getPageWidth(i3);
                    f = (f4 + pageWidth) * f2;
                    f4 += pageWidth + f3;
                }
                if (((float) this.f200505u) + f > ((float) scrollX)) {
                    this.f200506v.setBounds(Math.round(f), this.f200507w, Math.round(((float) this.f200505u) + f), this.f200508x);
                    this.f200506v.draw(canvas);
                }
                if (f > ((float) (scrollX + width))) {
                    i = 13247;
                    break;
                } else {
                    i3++;
                    i = 13247;
                }
            }
        }
        MethodCollector.m26664o(i);
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f200492h;
        if (pagerAdapter2 != null) {
            m153497a(pagerAdapter2, (C88330g) null);
            this.f200492h.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.f200491f.size(); i++) {
                C88325b bVar = this.f200491f.get(i);
                this.f200492h.destroyItem((ViewGroup) this, bVar.f200518b, bVar.f200517a);
            }
            this.f200492h.finishUpdate((ViewGroup) this);
            this.f200491f.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C88326c) getChildAt(i2).getLayoutParams()).f200522a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.f200493i = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.f200492h;
        this.f200492h = pagerAdapter;
        this.f200490c = 0;
        if (pagerAdapter != null) {
            if (this.f200504t == null) {
                this.f200504t = new C88330g();
            }
            m153497a(this.f200492h, this.f200504t);
            this.f200494j = false;
            boolean z = this.f200475W;
            this.f200475W = true;
            this.f200490c = this.f200492h.getCount();
            if (this.f200499o >= 0) {
                this.f200492h.restoreState(this.f200500p, this.f200501q);
                m153494a(this.f200499o, false, true);
                this.f200499o = -1;
                this.f200500p = null;
                this.f200501q = null;
            } else if (!z) {
                mo142817d();
            } else {
                requestLayout();
            }
        }
        List<AbstractC88328e> list = this.f200496l;
        if (!(list == null || list.isEmpty())) {
            int size = this.f200496l.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.f200496l.get(i3).mo116221a(pagerAdapter3, pagerAdapter);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m153510f();
            return false;
        }
        if (action != 0) {
            if (this.f200458F) {
                return true;
            }
            if (this.f200459G) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f200465M = x;
            this.f200463K = x;
            float y = motionEvent.getY();
            this.f200466N = y;
            this.f200464L = y;
            this.f200467O = motionEvent.getPointerId(0);
            this.f200459G = false;
            this.f200503s = true;
            this.f200502r.computeScrollOffset();
            if (this.f200488am != 2 || Math.abs(this.f200502r.getFinalX() - this.f200502r.getCurrX()) <= this.f200472T) {
                m153499a(false);
                this.f200458F = false;
            } else {
                this.f200502r.abortAnimation();
                this.f200494j = false;
                mo142817d();
                this.f200458F = true;
                m153511g();
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f200467O;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f2 = x2 - this.f200463K;
                float abs = Math.abs(f2);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f200466N);
                if (f2 != 0.0f) {
                    float f3 = this.f200463K;
                    if ((f3 >= ((float) this.f200461I) || f2 <= 0.0f) && ((f3 <= ((float) (getWidth() - this.f200461I)) || f2 >= 0.0f) && mo61298a(this, false, (int) f2, (int) x2, (int) y2))) {
                        this.f200463K = x2;
                        this.f200464L = y2;
                        this.f200459G = true;
                        return false;
                    }
                }
                int i2 = this.f200462J;
                if (abs > ((float) i2) && abs * 0.5f > abs2) {
                    this.f200458F = true;
                    m153511g();
                    setScrollState(1);
                    if (f2 > 0.0f) {
                        f = this.f200465M + ((float) this.f200462J);
                    } else {
                        f = this.f200465M - ((float) this.f200462J);
                    }
                    this.f200463K = f;
                    this.f200464L = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i2)) {
                    this.f200459G = true;
                }
                if (this.f200458F && m153505b(x2)) {
                    C0792v.m2764c(this);
                }
            }
        } else if (action == 6) {
            m153496a(motionEvent);
        }
        if (this.f200468P == null) {
            this.f200468P = VelocityTracker.obtain();
        }
        this.f200468P.addMovement(motionEvent);
        return this.f200458F;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        boolean z;
        float f;
        float f2;
        if (this.f200495k) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.f200492h) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.f200468P == null) {
            this.f200468P = VelocityTracker.obtain();
        }
        this.f200468P.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.f200458F) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f200467O);
                        if (findPointerIndex == -1) {
                            z = m153510f();
                        } else {
                            float x = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x - this.f200463K);
                            float y = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y - this.f200464L);
                            if (abs > ((float) this.f200462J) && abs > abs2) {
                                this.f200458F = true;
                                m153511g();
                                float f3 = this.f200465M;
                                if (x - f3 > 0.0f) {
                                    f2 = f3 + ((float) this.f200462J);
                                } else {
                                    f2 = f3 - ((float) this.f200462J);
                                }
                                this.f200463K = f2;
                                this.f200464L = y;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.f200458F) {
                        z = false | m153505b(motionEvent.getX(motionEvent.findPointerIndex(this.f200467O)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f200463K = motionEvent.getX(actionIndex);
                        this.f200467O = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m153496a(motionEvent);
                        this.f200463K = motionEvent.getX(motionEvent.findPointerIndex(this.f200467O));
                    }
                } else if (this.f200458F) {
                    m153493a(this.f200493i, true, 0, false);
                    z = m153510f();
                }
            } else if (this.f200458F) {
                VelocityTracker velocityTracker = this.f200468P;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f200470R);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f200467O);
                this.f200494j = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C88325b h = m153512h();
                float f4 = (float) clientWidth;
                int i = h.f200518b;
                float f5 = ((((float) scrollX) / f4) - h.f200521e) / (h.f200520d + (((float) this.f200505u) / f4));
                if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f200467O)) - this.f200465M)) <= this.f200471S || Math.abs(xVelocity) <= this.f200469Q) {
                    if (i >= this.f200493i) {
                        f = 0.4f;
                    } else {
                        f = 0.6f;
                    }
                    i += (int) (f5 + f);
                } else if (xVelocity <= 0) {
                    i++;
                }
                if (this.f200491f.size() > 0) {
                    ArrayList<C88325b> arrayList = this.f200491f;
                    i = Math.max(this.f200491f.get(0).f200518b, Math.min(i, arrayList.get(arrayList.size() - 1).f200518b));
                }
                m153495a(i, true, true, xVelocity);
                z = m153510f();
            }
            if (z) {
                C0792v.m2764c(this);
            }
        } else {
            this.f200502r.abortAnimation();
            this.f200494j = false;
            mo142817d();
            float x2 = motionEvent.getX();
            this.f200465M = x2;
            this.f200463K = x2;
            float y2 = motionEvent.getY();
            this.f200466N = y2;
            this.f200464L = y2;
            this.f200467O = motionEvent.getPointerId(0);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r4.f200518b == r17.f200493i) goto L_0x0066;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void mo61354a(int r18) {
        /*
        // Method dump skipped, instructions count: 657
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.viewpager.DmtViewPager.mo61354a(int):void");
    }

    /* renamed from: b */
    private boolean m153505b(float f) {
        boolean z;
        boolean z2;
        this.f200463K = f;
        float scrollX = ((float) getScrollX()) + (this.f200463K - f);
        float clientWidth = (float) getClientWidth();
        float f2 = this.f200509y * clientWidth;
        float f3 = this.f200510z * clientWidth;
        boolean z3 = false;
        C88325b bVar = this.f200491f.get(0);
        ArrayList<C88325b> arrayList = this.f200491f;
        C88325b bVar2 = arrayList.get(arrayList.size() - 1);
        if (bVar.f200518b != 0) {
            f2 = bVar.f200521e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f200518b != this.f200492h.getCount() - 1) {
            f3 = bVar2.f200521e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f2) {
            if (z) {
                this.f200473U.onPull(Math.abs(f2 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f2;
        } else if (scrollX > f3) {
            if (z2) {
                this.f200474V.onPull(Math.abs(scrollX - f3) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.f200463K += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m153506c(i);
        return z3;
    }

    /* renamed from: a */
    public void mo61355a(int i, boolean z) {
        this.f200494j = false;
        m153494a(i, z, false);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f200485ai == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C88326c) this.f200486aj.get(i2).getLayoutParams()).f200527f;
    }

    /* renamed from: b */
    private C88325b m153501b(int i, int i2) {
        C88325b bVar = new C88325b();
        bVar.f200518b = i;
        bVar.f200517a = this.f200492h.instantiateItem((ViewGroup) this, i);
        bVar.f200520d = this.f200492h.getPageWidth(i);
        if (i2 < 0 || i2 >= this.f200491f.size()) {
            this.f200491f.add(bVar);
        } else {
            this.f200491f.add(i2, bVar);
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C88325b a;
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
            if (childAt.getVisibility() == 0 && (a = m153487a(childAt)) != null && a.f200518b == this.f200493i && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    /* renamed from: a */
    private Rect m153486a(Rect rect, View view) {
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

    public DmtViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(13016);
        mo61357a();
        MethodCollector.m26664o(13016);
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
        throw new UnsupportedOperationException("Method not decompiled: dmt.viewpager.DmtViewPager.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m153491a(int i, int i2) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f200502r;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            if (this.f200503s) {
                scrollX = this.f200502r.getCurrX();
            } else {
                scrollX = this.f200502r.getStartX();
            }
            this.f200502r.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int scrollY = getScrollY();
        int i3 = i - scrollX;
        int i4 = 0 - scrollY;
        if (i3 == 0 && i4 == 0) {
            m153499a(false);
            mo142817d();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i5 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i5;
        float a = f2 + (m153485a(Math.min(1.0f, (((float) Math.abs(i3)) * 1.0f) / f)) * f2);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(a / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i3)) / ((f * this.f200492h.getPageWidth(this.f200493i)) + ((float) this.f200505u))) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.f200503s = false;
        this.f200502r.startScroll(scrollX, scrollY, i3, i4, min);
        C0792v.m2764c(this);
    }

    /* renamed from: a */
    private void m153494a(int i, boolean z, boolean z2) {
        m153495a(i, z, z2, 0);
        new Throwable();
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C88325b a;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (a = m153487a(childAt)) != null && a.f200518b == this.f200493i) {
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

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        MethodCollector.m26663i(13177);
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C88326c cVar = (C88326c) layoutParams;
        boolean z2 = cVar.f200522a;
        if (view.getClass().getAnnotation(AbstractC88324a.class) != null) {
            z = true;
        } else {
            z = false;
        }
        cVar.f200522a = z2 | z;
        if (!this.f200455C) {
            super.addView(view, i, layoutParams);
            MethodCollector.m26664o(13177);
        } else if (!cVar.f200522a) {
            cVar.f200525d = true;
            addViewInLayout(view, i, layoutParams);
            MethodCollector.m26664o(13177);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Cannot add pager decor view during layout");
            MethodCollector.m26664o(13177);
            throw illegalStateException;
        }
    }

    /* renamed from: a */
    private void m153490a(int i, float f, int i2) {
        int i3;
        int i4;
        if (this.f200479ac > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                C88326c cVar = (C88326c) childAt.getLayoutParams();
                if (cVar.f200522a) {
                    int i6 = cVar.f200523b & 7;
                    if (i6 == 1) {
                        i3 = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                        i4 = paddingLeft;
                        paddingLeft = i3;
                    } else if (i6 == 3) {
                        i4 = childAt.getWidth() + paddingLeft;
                    } else if (i6 != 5) {
                        i4 = paddingLeft;
                    } else {
                        i3 = (width - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i4 = paddingLeft;
                        paddingLeft = i3;
                    }
                    int left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = i4;
                }
            }
        }
        m153504b(i, f, i2);
        if (this.f200483ag != null) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = getChildAt(i7);
                if (!((C88326c) childAt2.getLayoutParams()).f200522a) {
                    childAt2.getLeft();
                    getClientWidth();
                }
            }
        }
        this.f200478ab = true;
    }

    /* renamed from: b */
    private void m153504b(int i, float f, int i2) {
        ViewPager.AbstractC1579e eVar = this.f200481ae;
        if (eVar != null) {
            eVar.onPageScrolled(i, f, i2);
        }
        List<ViewPager.AbstractC1579e> list = this.f200480ad;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ViewPager.AbstractC1579e eVar2 = this.f200480ad.get(i3);
                if (eVar2 != null) {
                    eVar2.onPageScrolled(i, f, i2);
                }
            }
        }
        ViewPager.AbstractC1579e eVar3 = this.f200482af;
        if (eVar3 != null) {
            eVar3.onPageScrolled(i, f, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f200505u;
            m153492a(i, i3, i5, i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C88325b a;
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
        int scrollX = getScrollX();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C88326c cVar = (C88326c) childAt.getLayoutParams();
                if (cVar.f200522a) {
                    int i13 = cVar.f200523b & 7;
                    int i14 = cVar.f200523b & 112;
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
                    int i15 = paddingLeft + scrollX;
                    childAt.layout(i15, paddingTop, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + paddingTop);
                    i11++;
                    paddingTop = i8;
                    paddingLeft = i6;
                }
            }
        }
        int i16 = (i9 - paddingLeft) - paddingRight;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                C88326c cVar2 = (C88326c) childAt2.getLayoutParams();
                if (!cVar2.f200522a && (a = m153487a(childAt2)) != null) {
                    float f = (float) i16;
                    int i18 = ((int) (a.f200521e * f)) + paddingLeft;
                    if (cVar2.f200525d) {
                        cVar2.f200525d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * cVar2.f200524c), 1073741824), View.MeasureSpec.makeMeasureSpec((i10 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i18, paddingTop, childAt2.getMeasuredWidth() + i18, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f200507w = paddingTop;
        this.f200508x = i10 - paddingBottom;
        this.f200479ac = i11;
        if (this.f200475W) {
            z2 = false;
            m153493a(this.f200493i, false, 0, false);
        } else {
            z2 = false;
        }
        this.f200475W = z2;
    }
}
