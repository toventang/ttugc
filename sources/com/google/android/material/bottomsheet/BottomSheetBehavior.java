package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p030b.C0622a;
import androidx.core.p037h.C0792v;
import androidx.customview.p040a.C0827a;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0557b<V> {

    /* renamed from: a */
    public boolean f62887a = true;

    /* renamed from: b */
    public int f62888b;

    /* renamed from: c */
    public boolean f62889c;

    /* renamed from: d */
    public int f62890d;

    /* renamed from: e */
    int f62891e;

    /* renamed from: f */
    int f62892f;

    /* renamed from: g */
    int f62893g;

    /* renamed from: h */
    public boolean f62894h;

    /* renamed from: i */
    public boolean f62895i;

    /* renamed from: j */
    public int f62896j = 4;

    /* renamed from: k */
    C0827a f62897k;

    /* renamed from: l */
    int f62898l;

    /* renamed from: m */
    WeakReference<V> f62899m;

    /* renamed from: n */
    WeakReference<View> f62900n;

    /* renamed from: o */
    public AbstractC26607a f62901o;

    /* renamed from: p */
    int f62902p;

    /* renamed from: q */
    boolean f62903q;

    /* renamed from: r */
    private float f62904r;

    /* renamed from: s */
    private int f62905s;

    /* renamed from: t */
    private boolean f62906t;

    /* renamed from: u */
    private int f62907u;

    /* renamed from: v */
    private boolean f62908v;

    /* renamed from: w */
    private VelocityTracker f62909w;

    /* renamed from: x */
    private int f62910x;

    /* renamed from: y */
    private Map<View, Integer> f62911y;

    /* renamed from: z */
    private final C0827a.AbstractC0830a f62912z = new C0827a.AbstractC0830a() {
        /* class com.google.android.material.bottomsheet.BottomSheetBehavior.C266052 */

        static {
            Covode.recordClassIndex(32052);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: b */
        public final int mo3038b() {
            if (BottomSheetBehavior.this.f62894h) {
                return BottomSheetBehavior.this.f62898l;
            }
            return BottomSheetBehavior.this.f62893g;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3033a(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.mo43979d(1);
            }
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: c */
        public final int mo3040c(View view, int i) {
            return view.getLeft();
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: b */
        public final boolean mo3039b(View view, int i) {
            View view2;
            if (BottomSheetBehavior.this.f62896j == 1 || BottomSheetBehavior.this.f62903q) {
                return false;
            }
            if ((BottomSheetBehavior.this.f62896j != 3 || BottomSheetBehavior.this.f62902p != i || (view2 = BottomSheetBehavior.this.f62900n.get()) == null || !view2.canScrollVertically(-1)) && BottomSheetBehavior.this.f62899m != null && BottomSheetBehavior.this.f62899m.get() == view) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final int mo3031a(View view, int i, int i2) {
            int i3;
            int b = BottomSheetBehavior.this.mo43975b();
            if (BottomSheetBehavior.this.f62894h) {
                i3 = BottomSheetBehavior.this.f62898l;
            } else {
                i3 = BottomSheetBehavior.this.f62893g;
            }
            return C0622a.m2312a(i, b, i3);
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo3035a(android.view.View r6, float r7, float r8) {
            /*
            // Method dump skipped, instructions count: 239
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C266052.mo3035a(android.view.View, float, float):void");
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3037a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo43980e(i2);
        }
    };

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public static abstract class AbstractC26607a {
        static {
            Covode.recordClassIndex(32055);
        }

        /* renamed from: a */
        public abstract void mo37774a(View view, float f);

        /* renamed from: a */
        public abstract void mo37775a(View view, int i);
    }

    static {
        Covode.recordClassIndex(32050);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: b */
    public final boolean mo2532b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return m52755a(this, view, motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public boolean mo2524a(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (C0792v.m2781o(coordinatorLayout) && !C0792v.m2781o(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        coordinatorLayout.mo2469a(v, i);
        this.f62898l = coordinatorLayout.getHeight();
        if (this.f62889c) {
            if (this.f62890d == 0) {
                this.f62890d = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.hj);
            }
            this.f62905s = Math.max(this.f62890d, this.f62898l - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.f62905s = this.f62888b;
        }
        this.f62891e = Math.max(0, this.f62898l - v.getHeight());
        this.f62892f = this.f62898l / 2;
        m52758c();
        int i2 = this.f62896j;
        if (i2 == 3) {
            C0792v.m2767d(v, mo43975b());
        } else if (i2 == 6) {
            C0792v.m2767d(v, this.f62892f);
        } else if (this.f62894h && i2 == 5) {
            C0792v.m2767d(v, this.f62898l);
        } else if (i2 == 4) {
            C0792v.m2767d(v, this.f62893g);
        } else if (i2 == 1 || i2 == 2) {
            C0792v.m2767d(v, top - v.getTop());
        }
        if (this.f62897k == null) {
            this.f62897k = C0827a.m2924a(coordinatorLayout, this.f62912z);
        }
        this.f62899m = new WeakReference<>(v);
        this.f62900n = new WeakReference<>(m52756b(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2528a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        C0827a aVar;
        if (!v.isShown()) {
            this.f62906t = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m52759d();
        }
        if (this.f62909w == null) {
            this.f62909w = VelocityTracker.obtain();
        }
        this.f62909w.addMovement(motionEvent);
        View view2 = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f62910x = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f62900n;
            if (!(weakReference == null || (view = weakReference.get()) == null || !coordinatorLayout.mo2473a(view, x, this.f62910x))) {
                this.f62902p = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f62903q = true;
            }
            this.f62906t = this.f62902p == -1 && !coordinatorLayout.mo2473a(v, x, this.f62910x);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f62903q = false;
            this.f62902p = -1;
            if (this.f62906t) {
                this.f62906t = false;
                return false;
            }
        }
        if (!this.f62906t && (aVar = this.f62897k) != null && aVar.mo3021a(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f62900n;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        return actionMasked == 2 && view2 != null && !this.f62906t && this.f62896j != 1 && !coordinatorLayout.mo2473a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f62897k != null && Math.abs(((float) this.f62910x) - motionEvent.getY()) > ((float) this.f62897k.f3066b);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2531a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f62907u = 0;
        this.f62908v = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2530a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view == this.f62900n.get()) {
            return this.f62896j != 3 || super.mo2530a(coordinatorLayout, v, view, f, f2);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo43974a(View view, float f) {
        if (this.f62895i) {
            return true;
        }
        if (view.getTop() >= this.f62893g && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f62893g)) / ((float) this.f62888b) > 0.5f) {
            return true;
        }
        return false;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.C266061 */

            static {
                Covode.recordClassIndex(32054);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        final int f62917a;

        static {
            Covode.recordClassIndex(32053);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f62917a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f62917a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f62917a);
        }
    }

    /* renamed from: d */
    private void m52759d() {
        this.f62902p = -1;
        VelocityTracker velocityTracker = this.f62909w;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f62909w = null;
        }
    }

    /* renamed from: b */
    public final int mo43975b() {
        if (this.f62887a) {
            return this.f62891e;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class RunnableC26608b implements Runnable {

        /* renamed from: b */
        private final View f62919b;

        /* renamed from: c */
        private final int f62920c;

        static {
            Covode.recordClassIndex(32056);
        }

        public final void run() {
            if (BottomSheetBehavior.this.f62897k == null || !BottomSheetBehavior.this.f62897k.mo3027c()) {
                BottomSheetBehavior.this.mo43979d(this.f62920c);
            } else {
                C0792v.m2750a(this.f62919b, this);
            }
        }

        RunnableC26608b(View view, int i) {
            this.f62919b = view;
            this.f62920c = i;
        }
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: c */
    private void m52758c() {
        if (this.f62887a) {
            this.f62893g = Math.max(this.f62898l - this.f62905s, this.f62891e);
        } else {
            this.f62893g = this.f62898l - this.f62905s;
        }
    }

    /* renamed from: a */
    private static float m52753a(BottomSheetBehavior bottomSheetBehavior) {
        try {
            VelocityTracker velocityTracker = bottomSheetBehavior.f62909w;
            if (velocityTracker == null) {
                return 0.0f;
            }
            velocityTracker.computeCurrentVelocity(1000, bottomSheetBehavior.f62904r);
            return bottomSheetBehavior.f62909w.getYVelocity(bottomSheetBehavior.f62902p);
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    /* renamed from: a */
    public static <V extends View> BottomSheetBehavior<V> m52754a(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C0560e) {
            CoordinatorLayout.AbstractC0557b bVar = ((CoordinatorLayout.C0560e) layoutParams).f2416a;
            if (bVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) bVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: b */
    private View m52756b(View view) {
        if (C0792v.m2786t(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View b = m52756b(viewGroup.getChildAt(i));
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo43979d(int i) {
        AbstractC26607a aVar;
        if (this.f62896j != i) {
            this.f62896j = i;
            if (i == 6 || i == 3) {
                m52757b(true);
            } else if (i == 5 || i == 4) {
                m52757b(false);
            }
            V v = this.f62899m.get();
            if (v != null && (aVar = this.f62901o) != null) {
                aVar.mo37775a((View) v, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo43980e(int i) {
        AbstractC26607a aVar;
        V v = this.f62899m.get();
        if (v != null && (aVar = this.f62901o) != null) {
            int i2 = this.f62893g;
            if (i > i2) {
                aVar.mo37774a(v, ((float) (i2 - i)) / ((float) (this.f62898l - i2)));
            } else {
                aVar.mo37774a(v, ((float) (i2 - i)) / ((float) (i2 - mo43975b())));
            }
        }
    }

    /* renamed from: b */
    private void m52757b(boolean z) {
        WeakReference<V> weakReference = this.f62899m;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                int i = Build.VERSION.SDK_INT;
                if (z) {
                    if (this.f62911y == null) {
                        this.f62911y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.f62899m.get()) {
                        if (!z) {
                            Map<View, Integer> map = this.f62911y;
                            if (map != null && map.containsKey(childAt)) {
                                C0792v.m2740a(childAt, this.f62911y.get(childAt).intValue());
                            }
                        } else {
                            int i3 = Build.VERSION.SDK_INT;
                            this.f62911y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            C0792v.m2740a(childAt, 4);
                        }
                    }
                }
                if (!z) {
                    this.f62911y = null;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo43978c(final int i) {
        if (i != this.f62896j) {
            WeakReference<V> weakReference = this.f62899m;
            if (weakReference != null) {
                final V v = weakReference.get();
                if (v != null) {
                    ViewParent parent = v.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !C0792v.m2791y(v)) {
                        mo43977b(v, i);
                    } else {
                        v.post(new Runnable() {
                            /* class com.google.android.material.bottomsheet.BottomSheetBehavior.RunnableC266041 */

                            static {
                                Covode.recordClassIndex(32051);
                            }

                            public final void run() {
                                BottomSheetBehavior.this.mo43977b(v, i);
                            }
                        });
                    }
                }
            } else if (i == 4 || i == 3 || i == 6 || (this.f62894h && i == 5)) {
                this.f62896j = i;
            }
        }
    }

    /* renamed from: b */
    public final void mo43976b(int i) {
        WeakReference<V> weakReference;
        V v;
        if (i == -1) {
            if (!this.f62889c) {
                this.f62889c = true;
            } else {
                return;
            }
        } else if (this.f62889c || this.f62888b != i) {
            this.f62889c = false;
            this.f62888b = Math.max(0, i);
            this.f62893g = this.f62898l - i;
        } else {
            return;
        }
        if (this.f62896j == 4 && (weakReference = this.f62899m) != null && (v = weakReference.get()) != null) {
            v.requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo43973a(boolean z) {
        int i;
        if (this.f62887a != z) {
            this.f62887a = z;
            if (this.f62899m != null) {
                m52758c();
            }
            if (!this.f62887a || this.f62896j != 6) {
                i = this.f62896j;
            } else {
                i = 3;
            }
            mo43979d(i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final Parcelable mo2513a(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo2513a(coordinatorLayout, (View) v), this.f62896j);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k6, R.attr.k7, R.attr.k_, R.attr.ka});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            mo43976b(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            mo43976b(peekValue.data);
        }
        this.f62894h = obtainStyledAttributes.getBoolean(1, false);
        mo43973a(obtainStyledAttributes.getBoolean(0, true));
        this.f62895i = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f62904r = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo43977b(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f62893g;
        } else if (i == 6) {
            int i3 = this.f62892f;
            if (!this.f62887a || i3 > (i2 = this.f62891e)) {
                i2 = i3;
            } else {
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo43975b();
        } else if (!this.f62894h || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i)));
        } else {
            i2 = this.f62898l;
        }
        if (this.f62897k.mo3022a(view, view.getLeft(), i2)) {
            mo43979d(2);
            C0792v.m2750a(view, new RunnableC26608b(view, i));
            return;
        }
        mo43979d(i);
    }

    /* renamed from: a */
    private static boolean m52755a(BottomSheetBehavior bottomSheetBehavior, View view, MotionEvent motionEvent) {
        try {
            if (!view.isShown()) {
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (bottomSheetBehavior.f62896j == 1 && actionMasked == 0) {
                return true;
            }
            C0827a aVar = bottomSheetBehavior.f62897k;
            if (aVar != null) {
                aVar.mo3026b(motionEvent);
            }
            if (actionMasked == 0) {
                bottomSheetBehavior.m52759d();
            }
            if (bottomSheetBehavior.f62909w == null) {
                bottomSheetBehavior.f62909w = VelocityTracker.obtain();
            }
            bottomSheetBehavior.f62909w.addMovement(motionEvent);
            if (actionMasked == 2 && !bottomSheetBehavior.f62906t && Math.abs(((float) bottomSheetBehavior.f62910x) - motionEvent.getY()) > ((float) bottomSheetBehavior.f62897k.f3066b)) {
                bottomSheetBehavior.f62897k.mo3018a(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            if (!bottomSheetBehavior.f62906t) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2518a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo2518a(coordinatorLayout, v, savedState.f3089d);
        if (savedState.f62917a == 1 || savedState.f62917a == 2) {
            this.f62896j = 4;
        } else {
            this.f62896j = savedState.f62917a;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2519a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3 = 3;
        if (v.getTop() == mo43975b()) {
            mo43979d(3);
        } else if (view == this.f62900n.get() && this.f62908v) {
            if (this.f62907u > 0) {
                i2 = mo43975b();
            } else if (!this.f62894h || !mo43974a(v, m52753a(this))) {
                if (this.f62907u == 0) {
                    int top = v.getTop();
                    if (!this.f62887a) {
                        int i4 = this.f62892f;
                        if (top < i4) {
                            if (top < Math.abs(top - this.f62893g)) {
                                i2 = 0;
                            } else {
                                i2 = this.f62892f;
                            }
                        } else if (Math.abs(top - i4) < Math.abs(top - this.f62893g)) {
                            i2 = this.f62892f;
                        } else {
                            i2 = this.f62893g;
                        }
                        i3 = 6;
                    } else if (Math.abs(top - this.f62891e) < Math.abs(top - this.f62893g)) {
                        i2 = this.f62891e;
                    } else {
                        i2 = this.f62893g;
                    }
                } else {
                    i2 = this.f62893g;
                }
                i3 = 4;
            } else {
                i2 = this.f62898l;
                i3 = 5;
            }
            if (this.f62897k.mo3022a((View) v, v.getLeft(), i2)) {
                mo43979d(2);
                C0792v.m2750a(v, new RunnableC26608b(v, i3));
            } else {
                mo43979d(i3);
            }
            this.f62908v = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2522a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1 && view == this.f62900n.get()) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < mo43975b()) {
                    iArr[1] = top - mo43975b();
                    C0792v.m2767d(v, -iArr[1]);
                    mo43979d(3);
                } else {
                    iArr[1] = i2;
                    C0792v.m2767d(v, -i2);
                    mo43979d(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.f62893g;
                if (i4 <= i5 || this.f62894h) {
                    iArr[1] = i2;
                    C0792v.m2767d(v, -i2);
                    mo43979d(1);
                } else {
                    iArr[1] = top - i5;
                    C0792v.m2767d(v, -iArr[1]);
                    mo43979d(4);
                }
            }
            mo43980e(v.getTop());
            this.f62907u = i2;
            this.f62908v = true;
        }
    }
}
