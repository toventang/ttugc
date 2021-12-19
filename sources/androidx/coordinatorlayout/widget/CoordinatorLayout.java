package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C0643b;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p036g.C0691d;
import androidx.core.p036g.C0693f;
import androidx.core.p037h.AbstractC0785o;
import androidx.core.p037h.AbstractC0788r;
import androidx.core.p037h.C0753ad;
import androidx.core.p037h.C0774e;
import androidx.core.p037h.C0787q;
import androidx.core.p037h.C0792v;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements AbstractC0785o {

    /* renamed from: a */
    static final String f2390a;

    /* renamed from: b */
    static final Class<?>[] f2391b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    static final ThreadLocal<Map<String, Constructor<AbstractC0557b>>> f2392c = new ThreadLocal<>();

    /* renamed from: d */
    static final Comparator<View> f2393d;

    /* renamed from: h */
    private static final C0693f.AbstractC0694a<Rect> f2394h = new C0693f.C0696c(12);

    /* renamed from: e */
    C0753ad f2395e;

    /* renamed from: f */
    boolean f2396f;

    /* renamed from: g */
    ViewGroup.OnHierarchyChangeListener f2397g;

    /* renamed from: i */
    private final List<View> f2398i;

    /* renamed from: j */
    private final C0563a<View> f2399j;

    /* renamed from: k */
    private final List<View> f2400k;

    /* renamed from: l */
    private final List<View> f2401l;

    /* renamed from: m */
    private final int[] f2402m;

    /* renamed from: n */
    private boolean f2403n;

    /* renamed from: o */
    private boolean f2404o;

    /* renamed from: p */
    private int[] f2405p;

    /* renamed from: q */
    private View f2406q;

    /* renamed from: r */
    private View f2407r;

    /* renamed from: s */
    private ViewTreeObserver$OnPreDrawListenerC0561f f2408s;

    /* renamed from: t */
    private boolean f2409t;

    /* renamed from: u */
    private Drawable f2410u;

    /* renamed from: v */
    private AbstractC0788r f2411v;

    /* renamed from: w */
    private final C0787q f2412w;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public interface AbstractC0556a {
        static {
            Covode.recordClassIndex(631);
        }

        AbstractC0557b getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public @interface AbstractC0558c {
        static {
            Covode.recordClassIndex(633);
        }

        /* renamed from: a */
        Class<? extends AbstractC0557b> mo2534a();
    }

    /* renamed from: c */
    private static int m2123c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static int m2126d(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private static int m2129e(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public static abstract class AbstractC0557b<V extends View> {
        static {
            Covode.recordClassIndex(632);
        }

        /* renamed from: a */
        public void mo2514a() {
        }

        /* renamed from: a */
        public void mo2515a(V v, int i) {
        }

        /* renamed from: a */
        public void mo2516a(V v, View view) {
        }

        /* renamed from: a */
        public void mo2517a(C0560e eVar) {
        }

        /* renamed from: a */
        public void mo2518a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo2521a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: a */
        public boolean mo2523a(int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2524a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2525a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2526a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2527a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2528a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2529a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2530a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: b */
        public boolean mo2532b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo2533b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public AbstractC0557b() {
        }

        /* renamed from: a */
        public boolean mo2531a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo2523a(i);
            }
            return false;
        }

        /* renamed from: a */
        public Parcelable mo2513a(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public AbstractC0557b(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public void mo2519a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo2516a(v, view);
            }
        }

        /* renamed from: a */
        public void mo2522a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo2521a(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        /* renamed from: a */
        public void mo2520a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo2515a(v, i2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    static class C0562g implements Comparator<View> {
        static {
            Covode.recordClassIndex(637);
        }

        C0562g() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            float w = C0792v.m2789w(view);
            float w2 = C0792v.m2789w(view2);
            if (w > w2) {
                return -1;
            }
            if (w < w2) {
                return 1;
            }
            return 0;
        }
    }

    public final C0753ad getLastWindowInsets() {
        return this.f2395e;
    }

    public Drawable getStatusBarBackground() {
        return this.f2410u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r13 == false) goto L_0x007b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2120a(android.view.MotionEvent r24, int r25) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m2120a(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: a */
    public final void mo2469a(View view, int i) {
        C0560e eVar = (C0560e) view.getLayoutParams();
        int i2 = 0;
        if (eVar.f2426k == null && eVar.f2421f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (eVar.f2426k != null) {
            View view2 = eVar.f2426k;
            Rect a = mo14580a();
            Rect a2 = mo14580a();
            try {
                m2116a(view2, a);
                C0560e eVar2 = (C0560e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m2114a(i, a, a2, eVar2, measuredWidth, measuredHeight);
                m2118a(eVar2, a2, measuredWidth, measuredHeight);
                view.layout(a2.left, a2.top, a2.right, a2.bottom);
            } finally {
                m2115a(a);
                m2115a(a2);
            }
        } else if (eVar.f2420e >= 0) {
            int i3 = eVar.f2420e;
            C0560e eVar3 = (C0560e) view.getLayoutParams();
            int a3 = C0774e.m2693a(m2126d(eVar3.f2418c), i);
            int i4 = a3 & 7;
            int i5 = a3 & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i == 1) {
                i3 = width - i3;
            }
            int b = mo31074b(i3) - measuredWidth2;
            if (i4 == 1) {
                b += measuredWidth2 / 2;
            } else if (i4 == 5) {
                b += measuredWidth2;
            }
            if (i5 == 16) {
                i2 = 0 + (measuredHeight2 / 2);
            } else if (i5 == 80) {
                i2 = measuredHeight2 + 0;
            }
            int max = Math.max(getPaddingLeft() + eVar3.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth2) - eVar3.rightMargin));
            int max2 = Math.max(getPaddingTop() + eVar3.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - eVar3.bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
        } else {
            C0560e eVar4 = (C0560e) view.getLayoutParams();
            Rect a4 = mo14580a();
            a4.set(getPaddingLeft() + eVar4.leftMargin, getPaddingTop() + eVar4.topMargin, (getWidth() - getPaddingRight()) - eVar4.rightMargin, (getHeight() - getPaddingBottom()) - eVar4.bottomMargin);
            if (this.f2395e != null && C0792v.m2781o(this) && !C0792v.m2781o(view)) {
                a4.left += this.f2395e.f2888b.mo2883g().f2759b;
                a4.top += this.f2395e.f2888b.mo2883g().f2760c;
                a4.right -= this.f2395e.f2888b.mo2883g().f2761d;
                a4.bottom -= this.f2395e.f2888b.mo2883g().f2762e;
            }
            Rect a5 = mo14580a();
            C0774e.m2694a(m2123c(eVar4.f2418c), view.getMeasuredWidth(), view.getMeasuredHeight(), a4, a5, i);
            view.layout(a5.left, a5.top, a5.right, a5.bottom);
            m2115a(a4);
            m2115a(a5);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2467a(int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int height;
        int i3;
        AbstractC0557b bVar;
        int e = C0792v.m2768e(this);
        int size = this.f2398i.size();
        Rect a = mo14580a();
        Rect a2 = mo14580a();
        Rect a3 = mo14580a();
        for (int i4 = 0; i4 < size; i4++) {
            View view = this.f2398i.get(i4);
            C0560e eVar = (C0560e) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i5 = 0; i5 < i4; i5++) {
                    if (eVar.f2427l == this.f2398i.get(i5)) {
                        C0560e eVar2 = (C0560e) view.getLayoutParams();
                        if (eVar2.f2426k != null) {
                            Rect a4 = mo14580a();
                            Rect a5 = mo14580a();
                            Rect a6 = mo14580a();
                            m2116a(eVar2.f2426k, a4);
                            m2117a(view, false, a5);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            e = e;
                            m2114a(e, a4, a6, eVar2, measuredWidth, measuredHeight);
                            boolean z3 = (a6.left == a5.left && a6.top == a5.top) ? false : true;
                            m2118a(eVar2, a6, measuredWidth, measuredHeight);
                            int i6 = a6.left - a5.left;
                            int i7 = a6.top - a5.top;
                            if (i6 != 0) {
                                C0792v.m2769e(view, i6);
                            }
                            if (i7 != 0) {
                                C0792v.m2767d(view, i7);
                            }
                            if (z3 && (bVar = eVar2.f2416a) != null) {
                                bVar.mo2533b(this, view, eVar2.f2426k);
                            }
                            m2115a(a4);
                            m2115a(a5);
                            m2115a(a6);
                        }
                    }
                }
                m2117a(view, true, a2);
                if (eVar.f2422g != 0 && !a2.isEmpty()) {
                    int a7 = C0774e.m2693a(eVar.f2422g, e);
                    int i8 = a7 & 112;
                    if (i8 == 48) {
                        a.top = Math.max(a.top, a2.bottom);
                    } else if (i8 == 80) {
                        a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                    }
                    int i9 = a7 & 7;
                    if (i9 == 3) {
                        a.left = Math.max(a.left, a2.right);
                    } else if (i9 == 5) {
                        a.right = Math.max(a.right, getWidth() - a2.left);
                    }
                }
                if (eVar.f2423h != 0 && view.getVisibility() == 0 && C0792v.m2788v(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    C0560e eVar3 = (C0560e) view.getLayoutParams();
                    AbstractC0557b bVar2 = eVar3.f2416a;
                    Rect a8 = mo14580a();
                    Rect a9 = mo14580a();
                    a9.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (bVar2 == null || !bVar2.mo2526a(this, view, a8)) {
                        a8.set(a9);
                    } else if (!a9.contains(a8)) {
                        throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a8.toShortString() + " | Bounds:" + a9.toShortString());
                    }
                    m2115a(a9);
                    if (!a8.isEmpty()) {
                        int a10 = C0774e.m2693a(eVar3.f2423h, e);
                        if ((a10 & 48) != 48 || (i3 = (a8.top - eVar3.topMargin) - eVar3.f2425j) >= a.top) {
                            z = false;
                        } else {
                            m2128d(view, a.top - i3);
                            z = true;
                        }
                        if ((a10 & 80) == 80 && (height = ((getHeight() - a8.bottom) - eVar3.bottomMargin) + eVar3.f2425j) < a.bottom) {
                            m2128d(view, height - a.bottom);
                        } else if (!z) {
                            m2128d(view, 0);
                        }
                        if ((a10 & 3) != 3 || (i2 = (a8.left - eVar3.leftMargin) - eVar3.f2424i) >= a.left) {
                            z2 = false;
                        } else {
                            m2125c(view, a.left - i2);
                            z2 = true;
                        }
                        if ((a10 & 5) == 5 && (width = ((getWidth() - a8.right) - eVar3.rightMargin) + eVar3.f2424i) < a.right) {
                            m2125c(view, width - a.right);
                        } else if (!z2) {
                            m2125c(view, 0);
                        }
                    }
                    m2115a(a8);
                }
                if (i != 2) {
                    a3.set(((C0560e) view.getLayoutParams()).f2430o);
                    if (!a3.equals(a2)) {
                        ((C0560e) view.getLayoutParams()).f2430o.set(a2);
                    }
                }
                for (int i10 = i4 + 1; i10 < size; i10++) {
                    View view2 = this.f2398i.get(i10);
                    C0560e eVar4 = (C0560e) view2.getLayoutParams();
                    AbstractC0557b bVar3 = eVar4.f2416a;
                    if (bVar3 != null && bVar3.mo2529a(this, view2, view)) {
                        if (i == 0) {
                            if (eVar4.f2429n) {
                                eVar4.f2429n = false;
                            }
                        } else if (i == 2) {
                        }
                        boolean b = bVar3.mo2533b(this, view2, view);
                        if (i == 1) {
                            eVar4.f2429n = b;
                        }
                    }
                }
            }
        }
        m2115a(a);
        m2115a(a2);
        m2115a(a3);
    }

    /* renamed from: a */
    public final void mo2468a(View view) {
        List b = this.f2399j.mo2544b(view);
        if (!(b == null || b.isEmpty())) {
            for (int i = 0; i < b.size(); i++) {
                View view2 = (View) b.get(i);
                AbstractC0557b bVar = ((C0560e) view2.getLayoutParams()).f2416a;
                if (bVar != null) {
                    bVar.mo2533b(this, view2, view);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo2473a(View view, int i, int i2) {
        Rect a = mo14580a();
        m2116a(view, a);
        try {
            return a.contains(i, i2);
        } finally {
            m2115a(a);
        }
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: a */
    public final boolean mo2474a(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0560e eVar = (C0560e) childAt.getLayoutParams();
                AbstractC0557b bVar = eVar.f2416a;
                if (bVar != null) {
                    boolean a = bVar.mo2531a(this, childAt, view, view2, i, i2);
                    z |= a;
                    eVar.mo2537a(i2, a);
                } else {
                    eVar.mo2537a(i2, false);
                }
            }
        }
        return z;
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: a */
    public final void mo2471a(View view, int i, int i2, int i3, int i4, int i5) {
        AbstractC0557b bVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0560e eVar = (C0560e) childAt.getLayoutParams();
                if (eVar.mo2539a(i5) && (bVar = eVar.f2416a) != null) {
                    bVar.mo2520a(this, childAt, view, i, i2, i3, i4, i5);
                    z = true;
                }
            }
        }
        if (z) {
            mo2467a(1);
        }
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: a */
    public final void mo2472a(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0557b bVar;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0560e eVar = (C0560e) childAt.getLayoutParams();
                if (eVar.mo2539a(i3) && (bVar = eVar.f2416a) != null) {
                    int[] iArr2 = this.f2402m;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    bVar.mo2522a(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f2402m;
                    if (i > 0) {
                        i4 = Math.max(i4, iArr3[0]);
                    } else {
                        i4 = Math.min(i4, iArr3[0]);
                    }
                    int[] iArr4 = this.f2402m;
                    if (i2 > 0) {
                        i5 = Math.max(i5, iArr4[1]);
                    } else {
                        i5 = Math.min(i5, iArr4[1]);
                    }
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo2467a(1);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    class ViewTreeObserver$OnPreDrawListenerC0561f implements ViewTreeObserver.OnPreDrawListener {
        static {
            Covode.recordClassIndex(636);
        }

        public final boolean onPreDraw() {
            CoordinatorLayout.this.mo2467a(0);
            return true;
        }

        ViewTreeObserver$OnPreDrawListenerC0561f() {
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0560e(-2, -2);
    }

    public int getNestedScrollAxes() {
        return this.f2412w.mo2913a();
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.C05551 */

            static {
                Covode.recordClassIndex(630);
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
        SparseArray<Parcelable> f2414a;

        static {
            Covode.recordClassIndex(629);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2414a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f2414a.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f2414a;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f2414a.keyAt(i3);
                parcelableArr[i3] = this.f2414a.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: a */
    private static Rect mo14580a() {
        Rect acquire = f2394h.acquire();
        if (acquire == null) {
            return new Rect();
        }
        return acquire;
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        mo66065b();
        return Collections.unmodifiableList(this.f2398i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2410u;
        if (drawable != null && drawable.isStateful() && (false || drawable.setState(drawableState))) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: c */
    private void mo66066c() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C0792v.m2781o(this)) {
                if (this.f2411v == null) {
                    this.f2411v = new AbstractC0788r() {
                        /* class androidx.coordinatorlayout.widget.CoordinatorLayout.C05541 */

                        static {
                            Covode.recordClassIndex(628);
                        }

                        @Override // androidx.core.p037h.AbstractC0788r
                        /* renamed from: a */
                        public final C0753ad mo553a(View view, C0753ad adVar) {
                            boolean z;
                            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                            if (!C0691d.m2448a(coordinatorLayout.f2395e, adVar)) {
                                coordinatorLayout.f2395e = adVar;
                                boolean z2 = true;
                                if (adVar == null || adVar.f2888b.mo2883g().f2760c <= 0) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                coordinatorLayout.f2396f = z;
                                if (coordinatorLayout.f2396f || coordinatorLayout.getBackground() != null) {
                                    z2 = false;
                                }
                                coordinatorLayout.setWillNotDraw(z2);
                                if (!adVar.f2888b.mo2877b()) {
                                    int childCount = coordinatorLayout.getChildCount();
                                    for (int i = 0; i < childCount; i++) {
                                        View childAt = coordinatorLayout.getChildAt(i);
                                        if (C0792v.m2781o(childAt) && ((C0560e) childAt.getLayoutParams()).f2416a != null && adVar.f2888b.mo2877b()) {
                                            break;
                                        }
                                    }
                                }
                                coordinatorLayout.requestLayout();
                            }
                            return adVar;
                        }
                    };
                }
                C0792v.m2748a(this, this.f2411v);
                setSystemUiVisibility(1280);
                return;
            }
            C0792v.m2748a(this, (AbstractC0788r) null);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2119a(false);
        if (this.f2409t) {
            if (this.f2408s == null) {
                this.f2408s = new ViewTreeObserver$OnPreDrawListenerC0561f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2408s);
        }
        if (this.f2395e == null && C0792v.m2781o(this)) {
            C0792v.m2780n(this);
        }
        this.f2404o = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2119a(false);
        if (this.f2409t && this.f2408s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2408s);
        }
        View view = this.f2407r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2404o = false;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable a;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0557b bVar = ((C0560e) childAt.getLayoutParams()).f2416a;
            if (!(id == -1 || bVar == null || (a = bVar.mo2513a(this, childAt)) == null)) {
                sparseArray.append(id, a);
            }
        }
        savedState.f2414a = sparseArray;
        return savedState;
    }

    static {
        String str;
        Covode.recordClassIndex(627);
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        f2390a = str;
        if (Build.VERSION.SDK_INT >= 21) {
            f2393d = new C0562g();
        } else {
            f2393d = null;
        }
    }

    /* renamed from: b */
    private void mo66065b() {
        View childAt;
        int e;
        int a;
        this.f2398i.clear();
        C0563a<View> aVar = this.f2399j;
        int size = aVar.f2436b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> c = aVar.f2436b.mo2163c(i);
            if (c != null) {
                c.clear();
                aVar.f2435a.release(c);
            }
        }
        aVar.f2436b.clear();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = getChildAt(i2);
            C0560e d = mo31075d(childAt2);
            if (d.f2421f == -1) {
                d.f2427l = null;
                d.f2426k = null;
            } else {
                if (d.f2426k != null && d.f2426k.getId() == d.f2421f) {
                    View view = d.f2426k;
                    for (ViewParent parent = d.f2426k.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt2) {
                            d.f2427l = null;
                            d.f2426k = null;
                        } else {
                            if (parent instanceof View) {
                                view = (View) parent;
                            }
                        }
                    }
                    d.f2427l = view;
                }
                d.f2426k = findViewById(d.f2421f);
                if (d.f2426k != null) {
                    if (d.f2426k != this) {
                        View view2 = d.f2426k;
                        ViewParent parent2 = d.f2426k.getParent();
                        while (true) {
                            if (parent2 == this || parent2 == null) {
                                d.f2427l = view2;
                            } else if (parent2 != childAt2) {
                                if (parent2 instanceof View) {
                                    view2 = (View) parent2;
                                }
                                parent2 = parent2.getParent();
                            } else if (isInEditMode()) {
                                d.f2427l = null;
                                d.f2426k = null;
                            } else {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                        }
                    } else if (isInEditMode()) {
                        d.f2427l = null;
                        d.f2426k = null;
                    } else {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                } else if (isInEditMode()) {
                    d.f2427l = null;
                    d.f2426k = null;
                } else {
                    throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(d.f2421f) + " to anchor view " + childAt2);
                }
            }
            this.f2399j.mo2543a(childAt2);
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != i2 && ((childAt = getChildAt(i3)) == d.f2427l || (((a = C0774e.m2693a(((C0560e) childAt.getLayoutParams()).f2422g, (e = C0792v.m2768e(this)))) != 0 && (C0774e.m2693a(d.f2423h, e) & a) == a) || (d.f2416a != null && d.f2416a.mo2529a(this, childAt2, childAt))))) {
                    if (!this.f2399j.f2436b.containsKey(childAt)) {
                        this.f2399j.mo2543a(childAt);
                    }
                    C0563a<View> aVar2 = this.f2399j;
                    if (!aVar2.f2436b.containsKey(childAt) || !aVar2.f2436b.containsKey(childAt2)) {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    ArrayList<T> arrayList = aVar2.f2436b.get(childAt);
                    if (arrayList == null) {
                        arrayList = aVar2.f2435a.acquire();
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        aVar2.f2436b.put(childAt, arrayList);
                    }
                    arrayList.add(childAt2);
                }
            }
        }
        this.f2398i.addAll(this.f2399j.mo2542a());
        Collections.reverse(this.f2398i);
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2397g = onHierarchyChangeListener;
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    class ViewGroup$OnHierarchyChangeListenerC0559d implements ViewGroup.OnHierarchyChangeListener {
        static {
            Covode.recordClassIndex(634);
        }

        ViewGroup$OnHierarchyChangeListenerC0559d() {
        }

        public final void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.f2397g != null) {
                CoordinatorLayout.this.f2397g.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo2467a(2);
            if (CoordinatorLayout.this.f2397g != null) {
                CoordinatorLayout.this.f2397g.onChildViewRemoved(view, view2);
            }
        }
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onStopNestedScroll(View view) {
        mo2476b(view, 0);
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        mo66066c();
    }

    /* renamed from: b */
    private int mo31074b(int i) {
        int[] iArr = this.f2405p;
        if (iArr != null && i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C0560e) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0560e(getContext(), attributeSet);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0643b.m2369a(getContext(), i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f2410u) {
            return true;
        }
        return false;
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public static class C0560e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public AbstractC0557b f2416a;

        /* renamed from: b */
        boolean f2417b;

        /* renamed from: c */
        public int f2418c;

        /* renamed from: d */
        public int f2419d;

        /* renamed from: e */
        public int f2420e = -1;

        /* renamed from: f */
        public int f2421f = -1;

        /* renamed from: g */
        public int f2422g;

        /* renamed from: h */
        public int f2423h;

        /* renamed from: i */
        int f2424i;

        /* renamed from: j */
        int f2425j;

        /* renamed from: k */
        View f2426k;

        /* renamed from: l */
        View f2427l;

        /* renamed from: m */
        boolean f2428m;

        /* renamed from: n */
        public boolean f2429n;

        /* renamed from: o */
        public final Rect f2430o = new Rect();

        /* renamed from: p */
        Object f2431p;

        /* renamed from: q */
        private boolean f2432q;

        /* renamed from: r */
        private boolean f2433r;

        static {
            Covode.recordClassIndex(635);
        }

        public C0560e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public final void mo2538a(AbstractC0557b bVar) {
            AbstractC0557b bVar2 = this.f2416a;
            if (bVar2 != bVar) {
                if (bVar2 != null) {
                    bVar2.mo2514a();
                }
                this.f2416a = bVar;
                this.f2431p = null;
                this.f2417b = true;
                if (bVar != null) {
                    bVar.mo2517a(this);
                }
            }
        }

        public C0560e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo2539a(int i) {
            if (i == 0) {
                return this.f2432q;
            }
            if (i != 1) {
                return false;
            }
            return this.f2433r;
        }

        public C0560e(C0560e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
        }

        public C0560e(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo2537a(int i, boolean z) {
            if (i == 0) {
                this.f2432q = z;
            } else if (i == 1) {
                this.f2433r = z;
            }
        }

        C0560e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931, R.attr.zb, R.attr.zc, R.attr.zd, R.attr.a0v, R.attr.a19, R.attr.a1_});
            this.f2418c = obtainStyledAttributes.getInteger(0, 0);
            this.f2421f = obtainStyledAttributes.getResourceId(1, -1);
            this.f2419d = obtainStyledAttributes.getInteger(2, 0);
            this.f2420e = obtainStyledAttributes.getInteger(6, -1);
            this.f2422g = obtainStyledAttributes.getInt(5, 0);
            this.f2423h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f2417b = hasValue;
            if (hasValue) {
                this.f2416a = CoordinatorLayout.m2113a(context, attributeSet, obtainStyledAttributes.getString(3));
            }
            obtainStyledAttributes.recycle();
            AbstractC0557b bVar = this.f2416a;
            if (bVar != null) {
                bVar.mo2517a(this);
            }
        }
    }

    /* renamed from: a */
    private static void m2115a(Rect rect) {
        rect.setEmpty();
        f2394h.release(rect);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0560e) {
            return new C0560e((C0560e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0560e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0560e(layoutParams);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m2119a(true);
        }
        boolean a = m2120a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m2119a(true);
        }
        return a;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f2403n) {
            m2119a(false);
            this.f2403n = true;
        }
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f2410u;
        if (drawable != null && drawable.isVisible() != z) {
            this.f2410u.setVisible(z, false);
        }
    }

    /* renamed from: b */
    public final List<View> mo2475b(View view) {
        C0563a<View> aVar = this.f2399j;
        int size = aVar.f2436b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> c = aVar.f2436b.mo2163c(i);
            if (c != null && c.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aVar.f2436b.mo2162b(i));
            }
        }
        this.f2401l.clear();
        if (arrayList != null) {
            this.f2401l.addAll(arrayList);
        }
        return this.f2401l;
    }

    public void onDraw(Canvas canvas) {
        C0753ad adVar;
        int i;
        super.onDraw(canvas);
        if (this.f2396f && this.f2410u != null && (adVar = this.f2395e) != null && (i = adVar.f2888b.mo2883g().f2760c) > 0) {
            this.f2410u.setBounds(0, 0, getWidth(), i);
            this.f2410u.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3089d);
        SparseArray<Parcelable> sparseArray = savedState.f2414a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0557b bVar = mo31075d(childAt).f2416a;
            if (!(id == -1 || bVar == null || (parcelable2 = sparseArray.get(id)) == null)) {
                bVar.mo2518a(this, childAt, parcelable2);
            }
        }
    }

    /* renamed from: d */
    private static C0560e mo31075d(View view) {
        C0560e eVar = (C0560e) view.getLayoutParams();
        if (!eVar.f2417b) {
            if (view instanceof AbstractC0556a) {
                eVar.mo2538a(((AbstractC0556a) view).getBehavior());
                eVar.f2417b = true;
            } else {
                Class<?> cls = view.getClass();
                while (true) {
                    if (cls == null) {
                        break;
                    }
                    AbstractC0558c cVar = (AbstractC0558c) cls.getAnnotation(AbstractC0558c.class);
                    if (cVar == null) {
                        cls = cls.getSuperclass();
                    } else {
                        try {
                            eVar.mo2538a((AbstractC0557b) cVar.mo2534a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            break;
                        } catch (Exception unused) {
                            cVar.mo2534a().getName();
                        }
                    }
                }
                eVar.f2417b = true;
            }
        }
        return eVar;
    }

    /* renamed from: c */
    public final List<View> mo2478c(View view) {
        List b = this.f2399j.mo2544b(view);
        this.f2401l.clear();
        if (b != null) {
            this.f2401l.addAll(b);
        }
        return this.f2401l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r7 != false) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r16) {
        /*
            r15 = this;
            r5 = r15
            r8 = r16
            int r4 = r8.getActionMasked()
            android.view.View r0 = r5.f2406q
            r6 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0052
            boolean r7 = r5.m2120a(r8, r6)
            if (r7 == 0) goto L_0x0050
        L_0x0013:
            android.view.View r0 = r5.f2406q
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0560e) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r1 = r0.f2416a
            if (r1 == 0) goto L_0x0050
            android.view.View r0 = r5.f2406q
            boolean r2 = r1.mo2532b(r5, r0, r8)
        L_0x0025:
            android.view.View r1 = r5.f2406q
            r0 = 0
            if (r1 != 0) goto L_0x0038
            boolean r0 = super.onTouchEvent(r8)
            r2 = r2 | r0
        L_0x002f:
            if (r4 == r6) goto L_0x0034
            r0 = 3
            if (r4 != r0) goto L_0x0037
        L_0x0034:
            r5.m2119a(r3)
        L_0x0037:
            return r2
        L_0x0038:
            if (r7 == 0) goto L_0x002f
            long r7 = android.os.SystemClock.uptimeMillis()
            r11 = 3
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = r7
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r7, r9, r11, r12, r13, r14)
            super.onTouchEvent(r0)
            if (r0 == 0) goto L_0x002f
            r0.recycle()
            goto L_0x002f
        L_0x0050:
            r2 = 0
            goto L_0x0025
        L_0x0052:
            r7 = 0
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f2410u;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2410u = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2410u.setState(getDrawableState());
                }
                C0705a.m2503b(this.f2410u, C0792v.m2768e(this));
                Drawable drawable4 = this.f2410u;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f2410u.setCallback(this);
            }
            C0792v.m2764c(this);
        }
    }

    /* renamed from: a */
    private void m2119a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0557b bVar = ((C0560e) childAt.getLayoutParams()).f2416a;
            if (bVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    bVar.mo2528a(this, childAt, obtain);
                } else {
                    bVar.mo2532b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0560e) getChildAt(i2).getLayoutParams()).f2428m = false;
        }
        this.f2406q = null;
        this.f2403n = false;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.py);
    }

    /* renamed from: c */
    private static void m2125c(View view, int i) {
        C0560e eVar = (C0560e) view.getLayoutParams();
        if (eVar.f2424i != i) {
            C0792v.m2769e(view, i - eVar.f2424i);
            eVar.f2424i = i;
        }
    }

    /* renamed from: d */
    private static void m2128d(View view, int i) {
        C0560e eVar = (C0560e) view.getLayoutParams();
        if (eVar.f2425j != i) {
            C0792v.m2767d(view, i - eVar.f2425j);
            eVar.f2425j = i;
        }
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: b */
    public final void mo2476b(View view, int i) {
        this.f2412w.mo2914a(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0560e eVar = (C0560e) childAt.getLayoutParams();
            if (eVar.mo2539a(i)) {
                AbstractC0557b bVar = eVar.f2416a;
                if (bVar != null) {
                    bVar.mo2519a(this, childAt, view, i);
                }
                eVar.mo2537a(i, false);
                eVar.f2429n = false;
            }
        }
        this.f2407r = null;
    }

    /* renamed from: a */
    private void m2116a(View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        Matrix matrix = C0564b.f2439a.get();
        if (matrix == null) {
            matrix = new Matrix();
            C0564b.f2439a.set(matrix);
        } else {
            matrix.reset();
        }
        C0564b.m2172a(this, view, matrix);
        RectF rectF = C0564b.f2440b.get();
        if (rectF == null) {
            rectF = new RectF();
            C0564b.f2440b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r20 != false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0165, code lost:
        if (r20 != false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0167, code lost:
        r28 = java.lang.Math.max(0, (r19 - r21) - r14);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r32, int r33) {
        /*
        // Method dump skipped, instructions count: 442
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo2477b(view, view2, i, 0);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo2474a(view, view2, i, 0);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0557b bVar = ((C0560e) view.getLayoutParams()).f2416a;
        if (bVar == null || !bVar.mo2527a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    /* renamed from: a */
    private void m2117a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m2116a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0557b bVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0560e eVar = (C0560e) childAt.getLayoutParams();
                if (eVar.mo2539a(0) && (bVar = eVar.f2416a) != null) {
                    z |= bVar.mo2530a(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.f2398i = new ArrayList();
        this.f2399j = new C0563a<>();
        this.f2400k = new ArrayList();
        this.f2401l = new ArrayList();
        this.f2402m = new int[2];
        this.f2412w = new C0787q();
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.yi, R.attr.afi}, 0, R.style.si);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.yi, R.attr.afi}, i, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2405p = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f2405p.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f2405p;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f2410u = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        mo66066c();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC0559d());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout$b>>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static AbstractC0557b m2113a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f2390a;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<AbstractC0557b>>> threadLocal = f2392c;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f2391b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (AbstractC0557b) constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(str)), e);
        }
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo2472a(view, i, i2, iArr, 0);
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: b */
    public final void mo2477b(View view, View view2, int i, int i2) {
        this.f2412w.mo2915a(i, i2);
        this.f2407r = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C0560e) getChildAt(i3).getLayoutParams()).mo2539a(i2);
        }
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                ((C0560e) childAt.getLayoutParams()).mo2539a(0);
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m2118a(C0560e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - eVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: a */
    public final void mo2470a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo2471a(view, i, i2, i3, i4, 0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0557b bVar;
        int e = C0792v.m2768e(this);
        int size = this.f2398i.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f2398i.get(i5);
            if (view.getVisibility() != 8 && ((bVar = ((C0560e) view.getLayoutParams()).f2416a) == null || !bVar.mo2524a(this, view, e))) {
                mo2469a(view, e);
            }
        }
    }

    /* renamed from: a */
    private static void m2114a(int i, Rect rect, Rect rect2, C0560e eVar, int i2, int i3) {
        int width;
        int height;
        int a = C0774e.m2693a(m2129e(eVar.f2418c), i);
        int a2 = C0774e.m2693a(m2123c(eVar.f2419d), i);
        int i4 = a & 7;
        int i5 = a & 112;
        int i6 = a2 & 7;
        int i7 = a2 & 112;
        if (i6 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i6 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i7 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i7 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }
}
