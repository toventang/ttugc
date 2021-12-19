package com.bytedance.android.live.design.view.sheet;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LiveBottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0557b<V> {

    /* renamed from: A */
    private static final int f11384A = R.style.r9;

    /* renamed from: B */
    private boolean f11385B;

    /* renamed from: C */
    private int f11386C;

    /* renamed from: D */
    private boolean f11387D;

    /* renamed from: E */
    private int f11388E;

    /* renamed from: F */
    private int f11389F;

    /* renamed from: G */
    private final ArrayList<AbstractC4107a> f11390G = new ArrayList<>();

    /* renamed from: H */
    private VelocityTracker f11391H;

    /* renamed from: I */
    private int f11392I;

    /* renamed from: J */
    private Map<View, Integer> f11393J;

    /* renamed from: K */
    private int f11394K = -1;

    /* renamed from: L */
    private int f11395L = -1;

    /* renamed from: M */
    private float f11396M;

    /* renamed from: N */
    private int f11397N = -1;

    /* renamed from: O */
    private float f11398O;

    /* renamed from: P */
    private int f11399P = -1;

    /* renamed from: Q */
    private float f11400Q;

    /* renamed from: R */
    private float f11401R;

    /* renamed from: S */
    private final C0827a.AbstractC0830a f11402S = new C0827a.AbstractC0830a() {
        /* class com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.C41052 */

        static {
            Covode.recordClassIndex(4652);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: b */
        public final int mo3038b() {
            if (LiveBottomSheetBehavior.this.f11413k) {
                return LiveBottomSheetBehavior.this.f11419q;
            }
            return LiveBottomSheetBehavior.this.f11411i;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3033a(int i) {
            if (i == 1 && LiveBottomSheetBehavior.this.f11415m) {
                LiveBottomSheetBehavior.this.mo9583d(1);
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
            if (LiveBottomSheetBehavior.this.f11416n == 1 || LiveBottomSheetBehavior.this.f11423u) {
                return false;
            }
            if ((LiveBottomSheetBehavior.this.f11416n != 3 || LiveBottomSheetBehavior.this.f11422t != i || LiveBottomSheetBehavior.this.f11421s == null || (view2 = LiveBottomSheetBehavior.this.f11421s.get()) == null || !view2.canScrollVertically(-1)) && LiveBottomSheetBehavior.this.f11420r != null && LiveBottomSheetBehavior.this.f11420r.get() == view) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final int mo3031a(View view, int i, int i2) {
            int i3;
            int b = LiveBottomSheetBehavior.this.mo9577b();
            if (LiveBottomSheetBehavior.this.f11413k) {
                i3 = LiveBottomSheetBehavior.this.f11419q;
            } else {
                i3 = LiveBottomSheetBehavior.this.f11411i;
            }
            return C0622a.m2312a(i, b, i3);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3035a(View view, float f, float f2) {
            int i;
            int i2 = 4;
            if (f2 < 0.0f || LiveBottomSheetBehavior.this.mo9581b(view, f2)) {
                if (LiveBottomSheetBehavior.this.f11404b) {
                    i = LiveBottomSheetBehavior.this.f11408f;
                } else if (view.getTop() > LiveBottomSheetBehavior.this.f11409g) {
                    i = LiveBottomSheetBehavior.this.f11409g;
                    i2 = 6;
                    LiveBottomSheetBehavior.this.mo9573a(view, i2, i, true);
                } else {
                    i = LiveBottomSheetBehavior.this.f11407e;
                }
            } else if (LiveBottomSheetBehavior.this.f11413k && LiveBottomSheetBehavior.this.mo9576a(view, f2)) {
                i = LiveBottomSheetBehavior.this.f11419q;
                i2 = 5;
                LiveBottomSheetBehavior.this.mo9573a(view, i2, i, true);
            } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                int top = view.getTop();
                if (!LiveBottomSheetBehavior.this.f11404b) {
                    if (top < LiveBottomSheetBehavior.this.f11409g) {
                        if (top < Math.abs(top - LiveBottomSheetBehavior.this.f11411i)) {
                            i = LiveBottomSheetBehavior.this.f11407e;
                        } else {
                            i = LiveBottomSheetBehavior.this.f11409g;
                        }
                    } else if (Math.abs(top - LiveBottomSheetBehavior.this.f11409g) < Math.abs(top - LiveBottomSheetBehavior.this.f11411i)) {
                        i = LiveBottomSheetBehavior.this.f11409g;
                    } else {
                        i = LiveBottomSheetBehavior.this.f11411i;
                        LiveBottomSheetBehavior.this.mo9573a(view, i2, i, true);
                    }
                    i2 = 6;
                    LiveBottomSheetBehavior.this.mo9573a(view, i2, i, true);
                } else if (Math.abs(top - LiveBottomSheetBehavior.this.f11408f) < Math.abs(top - LiveBottomSheetBehavior.this.f11411i)) {
                    i = LiveBottomSheetBehavior.this.f11408f;
                } else {
                    i = LiveBottomSheetBehavior.this.f11411i;
                    LiveBottomSheetBehavior.this.mo9573a(view, i2, i, true);
                }
            } else {
                if (!LiveBottomSheetBehavior.this.f11404b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - LiveBottomSheetBehavior.this.f11409g) < Math.abs(top2 - LiveBottomSheetBehavior.this.f11411i)) {
                        i = LiveBottomSheetBehavior.this.f11409g;
                        i2 = 6;
                        LiveBottomSheetBehavior.this.mo9573a(view, i2, i, true);
                    }
                }
                i = LiveBottomSheetBehavior.this.f11411i;
                LiveBottomSheetBehavior.this.mo9573a(view, i2, i, true);
            }
            i2 = 3;
            LiveBottomSheetBehavior.this.mo9573a(view, i2, i, true);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3037a(View view, int i, int i2, int i3, int i4) {
            LiveBottomSheetBehavior.this.mo9584e(i2);
        }
    };

    /* renamed from: a */
    public int f11403a;

    /* renamed from: b */
    public boolean f11404b = true;

    /* renamed from: c */
    public int f11405c = -1;

    /* renamed from: d */
    public int f11406d;

    /* renamed from: e */
    int f11407e;

    /* renamed from: f */
    int f11408f;

    /* renamed from: g */
    int f11409g;

    /* renamed from: h */
    public float f11410h = 0.5f;

    /* renamed from: i */
    int f11411i;

    /* renamed from: j */
    float f11412j = -1.0f;

    /* renamed from: k */
    public boolean f11413k;

    /* renamed from: l */
    public boolean f11414l;

    /* renamed from: m */
    public boolean f11415m = true;

    /* renamed from: n */
    public int f11416n = 4;

    /* renamed from: o */
    C0827a f11417o;

    /* renamed from: p */
    int f11418p;

    /* renamed from: q */
    public int f11419q;

    /* renamed from: r */
    WeakReference<V> f11420r;

    /* renamed from: s */
    WeakReference<View> f11421s;

    /* renamed from: t */
    int f11422t;

    /* renamed from: u */
    boolean f11423u;

    /* renamed from: v */
    private boolean f11424v;

    /* renamed from: w */
    private float f11425w;

    /* renamed from: x */
    private boolean f11426x;

    /* renamed from: y */
    private int f11427y;

    /* renamed from: z */
    private LiveBottomSheetBehavior<V>.RunnableC4108b f11428z;

    /* renamed from: com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior$a */
    public static abstract class AbstractC4107a {
        static {
            Covode.recordClassIndex(4655);
        }

        /* renamed from: a */
        public abstract void mo9571a(View view, float f);

        /* renamed from: a */
        public abstract void mo9572a(View view, int i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2515a(V v, int i) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2520a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2525a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        int i5 = v.getContext().getResources().getConfiguration().orientation;
        int size = View.MeasureSpec.getSize(i3);
        if (i5 == 1) {
            int i6 = this.f11395L;
            if (i6 == -1) {
                float f = this.f11396M;
                i6 = f > 0.0f ? (int) (f * ((float) size)) : -1;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
            if (i6 != -1) {
                v.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
                return true;
            }
            int i7 = this.f11399P;
            if (i7 == -1) {
                float f2 = this.f11400Q;
                if (f2 > 0.0f) {
                    i7 = (int) (((float) size) * f2);
                }
                return super.mo2525a(coordinatorLayout, v, i, i2, i3, i4);
            }
            if (i7 != -1) {
                v.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
                return true;
            }
            return super.mo2525a(coordinatorLayout, v, i, i2, i3, i4);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(makeMeasureSpec, ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin + i4, marginLayoutParams2.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2524a(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (C0792v.m2781o(coordinatorLayout) && !C0792v.m2781o(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f11420r == null) {
            this.f11420r = new WeakReference<>(v);
            if (C0792v.m2766d(v) == 0) {
                C0792v.m2740a((View) v, 1);
            }
        }
        if (this.f11417o == null) {
            this.f11417o = C0827a.m2924a(coordinatorLayout, this.f11402S);
        }
        int top = v.getTop();
        coordinatorLayout.mo2469a(v, i);
        this.f11418p = coordinatorLayout.getWidth();
        this.f11419q = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f11388E = height;
        int i2 = this.f11419q;
        this.f11389F = (int) (((float) i2) * 0.15f);
        if (i2 - height < this.f11427y) {
            this.f11388E = i2;
        }
        this.f11408f = Math.max(0, i2 - this.f11388E);
        this.f11409g = (int) (((float) this.f11419q) * (1.0f - this.f11410h));
        m9945e();
        int i3 = this.f11416n;
        if (i3 == 3) {
            C0792v.m2767d(v, mo9577b());
        } else if (i3 == 6) {
            C0792v.m2767d(v, this.f11409g);
        } else if (this.f11413k && i3 == 5) {
            C0792v.m2767d(v, this.f11419q);
        } else if (i3 == 4) {
            C0792v.m2767d(v, this.f11411i);
        } else if (i3 == 1 || i3 == 2) {
            C0792v.m2767d(v, top - v.getTop());
        }
        this.f11421s = new WeakReference<>(m9941b(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2528a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        WeakReference<View> weakReference;
        View view;
        C0827a aVar;
        if (!v.isShown() || !this.f11415m) {
            this.f11385B = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m9946f();
        }
        if (this.f11391H == null) {
            this.f11391H = VelocityTracker.obtain();
        }
        this.f11391H.addMovement(motionEvent);
        View view2 = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f11392I = (int) motionEvent.getY();
            if (!(this.f11416n == 2 || (weakReference = this.f11421s) == null || (view = weakReference.get()) == null || !coordinatorLayout.mo2473a(view, x, this.f11392I))) {
                this.f11422t = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f11423u = true;
            }
            this.f11385B = this.f11422t == -1 && !coordinatorLayout.mo2473a(v, x, this.f11392I);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f11423u = false;
            this.f11422t = -1;
            if (this.f11385B) {
                this.f11385B = false;
                return false;
            }
        }
        if (!this.f11385B && (aVar = this.f11417o) != null && aVar.mo3021a(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f11421s;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        return actionMasked == 2 && view2 != null && !this.f11385B && this.f11416n != 1 && !coordinatorLayout.mo2473a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f11417o != null && Math.abs(((float) this.f11392I) - motionEvent.getY()) > ((float) this.f11417o.f3066b);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2531a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f11386C = 0;
        this.f11387D = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2530a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f11421s;
        if (weakReference == null || view != weakReference.get() || (this.f11416n == 3 && !super.mo2530a(coordinatorLayout, v, view, f, f2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo9575a(boolean z) {
        if (this.f11404b != z) {
            this.f11404b = z;
            if (this.f11420r != null) {
                m9945e();
            }
            mo9583d((!this.f11404b || this.f11416n != 6) ? this.f11416n : 3);
        }
    }

    /* renamed from: a */
    public final void mo9574a(AbstractC4107a aVar) {
        if (!this.f11390G.contains(aVar)) {
            this.f11390G.add(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo9576a(View view, float f) {
        if (this.f11414l) {
            return true;
        }
        if (view.getTop() < this.f11411i) {
            return false;
        }
        int d = m9944d();
        float abs = Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f11411i));
        if (abs > ((float) this.f11389F) || abs / ((float) d) > 0.25f) {
            return true;
        }
        return false;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.SavedState.C41061 */

            static {
                Covode.recordClassIndex(4654);
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
        final int f11433a;

        /* renamed from: b */
        int f11434b;

        /* renamed from: e */
        boolean f11435e;

        /* renamed from: f */
        boolean f11436f;

        /* renamed from: g */
        boolean f11437g;

        static {
            Covode.recordClassIndex(4653);
        }

        public SavedState(Parcelable parcelable, LiveBottomSheetBehavior<?> liveBottomSheetBehavior) {
            super(parcelable);
            this.f11433a = liveBottomSheetBehavior.f11416n;
            this.f11434b = liveBottomSheetBehavior.f11405c;
            this.f11435e = liveBottomSheetBehavior.f11404b;
            this.f11436f = liveBottomSheetBehavior.f11413k;
            this.f11437g = liveBottomSheetBehavior.f11414l;
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f11433a);
            parcel.writeInt(this.f11434b);
            parcel.writeInt(this.f11435e ? 1 : 0);
            parcel.writeInt(this.f11436f ? 1 : 0);
            parcel.writeInt(this.f11437g ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            boolean z2;
            this.f11433a = parcel.readInt();
            this.f11434b = parcel.readInt();
            boolean z3 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f11435e = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f11436f = z2;
            this.f11437g = parcel.readInt() == 1 ? true : z3;
        }
    }

    static {
        Covode.recordClassIndex(4650);
    }

    /* renamed from: f */
    private void m9946f() {
        this.f11422t = -1;
        VelocityTracker velocityTracker = this.f11391H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11391H = null;
        }
    }

    /* renamed from: b */
    public final int mo9577b() {
        if (this.f11404b) {
            return this.f11408f;
        }
        return this.f11407e;
    }

    /* renamed from: c */
    private void m9942c() {
        V v;
        if (this.f11420r != null) {
            m9945e();
            if (this.f11416n == 4 && (v = this.f11420r.get()) != null) {
                v.requestLayout();
            }
        }
    }

    /* renamed from: d */
    private int m9944d() {
        int i = this.f11405c;
        if (i == -1) {
            return Math.min(Math.max(this.f11406d, (int) (((float) this.f11419q) * this.f11401R)), this.f11388E);
        }
        return i;
    }

    /* renamed from: e */
    private void m9945e() {
        int d = m9944d();
        if (this.f11404b) {
            this.f11411i = Math.max(this.f11419q - d, this.f11408f);
        } else {
            this.f11411i = this.f11419q - d;
        }
    }

    /* renamed from: g */
    private float m9948g() {
        VelocityTracker velocityTracker = this.f11391H;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f11425w);
        return this.f11391H.getYVelocity(this.f11422t);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2514a() {
        super.mo2514a();
        this.f11420r = null;
        this.f11417o = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior$b */
    public class RunnableC4108b implements Runnable {

        /* renamed from: a */
        public boolean f11438a;

        /* renamed from: b */
        int f11439b;

        /* renamed from: d */
        private final View f11441d;

        static {
            Covode.recordClassIndex(4656);
        }

        public final void run() {
            if (LiveBottomSheetBehavior.this.f11417o == null || !LiveBottomSheetBehavior.this.f11417o.mo3027c()) {
                LiveBottomSheetBehavior.this.mo9583d(this.f11439b);
            } else {
                C0792v.m2750a(this.f11441d, this);
            }
            this.f11438a = false;
        }

        RunnableC4108b(View view, int i) {
            this.f11441d = view;
            this.f11439b = i;
        }
    }

    public LiveBottomSheetBehavior() {
    }

    /* renamed from: b */
    public final void mo9578b(int i) {
        if (i == -1) {
            if (!this.f11426x) {
                this.f11426x = true;
            } else {
                return;
            }
        } else if (this.f11426x || this.f11405c != i) {
            this.f11426x = false;
            this.f11405c = Math.max(0, i);
        } else {
            return;
        }
        m9942c();
    }

    /* renamed from: a */
    public static <V extends View> LiveBottomSheetBehavior<V> m9940a(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C0560e) {
            CoordinatorLayout.AbstractC0557b bVar = ((CoordinatorLayout.C0560e) layoutParams).f2416a;
            if (bVar instanceof LiveBottomSheetBehavior) {
                return (LiveBottomSheetBehavior) bVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: b */
    private View m9941b(View view) {
        if (C0792v.m2786t(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View b = m9941b(viewGroup.getChildAt(i));
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: f */
    private void m9947f(final int i) {
        final V v = this.f11420r.get();
        if (v != null) {
            ViewParent parent = v.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C0792v.m2791y(v)) {
                mo9579b((View) v, i);
            } else {
                v.post(new Runnable() {
                    /* class com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.RunnableC41041 */

                    static {
                        Covode.recordClassIndex(4651);
                    }

                    public final void run() {
                        LiveBottomSheetBehavior.this.mo9579b(v, i);
                    }
                });
            }
        }
    }

    /* renamed from: c */
    public final void mo9582c(int i) {
        if (i != this.f11416n) {
            if (this.f11420r != null) {
                m9947f(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.f11413k && i == 5)) {
                this.f11416n = i;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo9583d(int i) {
        V v;
        if (this.f11416n != i) {
            this.f11416n = i;
            WeakReference<V> weakReference = this.f11420r;
            if (!(weakReference == null || (v = weakReference.get()) == null)) {
                if (i == 3) {
                    m9943c(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    m9943c(false);
                }
                for (int i2 = 0; i2 < this.f11390G.size(); i2++) {
                    this.f11390G.get(i2).mo9572a((View) v, i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo9584e(int i) {
        float f;
        float f2;
        V v = this.f11420r.get();
        if (!(v == null || this.f11390G.isEmpty())) {
            int i2 = this.f11411i;
            if (i > i2 || i2 == mo9577b()) {
                int i3 = this.f11411i;
                f = (float) (i3 - i);
                f2 = (float) (this.f11419q - i3);
            } else {
                int i4 = this.f11411i;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo9577b());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f11390G.size(); i5++) {
                this.f11390G.get(i5).mo9571a(v, f3);
            }
        }
    }

    /* renamed from: c */
    private void m9943c(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f11420r;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                int i = Build.VERSION.SDK_INT;
                if (z) {
                    if (this.f11393J == null) {
                        this.f11393J = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.f11420r.get()) {
                        if (z) {
                            int i3 = Build.VERSION.SDK_INT;
                            this.f11393J.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f11424v) {
                                C0792v.m2740a(childAt, 4);
                            }
                        } else if (this.f11424v && (map = this.f11393J) != null && map.containsKey(childAt)) {
                            C0792v.m2740a(childAt, this.f11393J.get(childAt).intValue());
                        }
                    }
                }
                if (!z) {
                    this.f11393J = null;
                } else if (this.f11424v) {
                    this.f11420r.get().sendAccessibilityEvent(8);
                }
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2517a(CoordinatorLayout.C0560e eVar) {
        super.mo2517a(eVar);
        this.f11420r = null;
        this.f11417o = null;
    }

    /* renamed from: b */
    public final void mo9580b(boolean z) {
        if (this.f11413k != z) {
            this.f11413k = z;
            if (!z && this.f11416n == 5) {
                mo9582c(4);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final Parcelable mo2513a(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo2513a(coordinatorLayout, (View) v), (LiveBottomSheetBehavior<?>) this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9579b(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f11411i;
        } else if (i == 6) {
            int i3 = this.f11409g;
            if (!this.f11404b || i3 > (i2 = this.f11408f)) {
                i2 = i3;
            } else {
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo9577b();
        } else if (!this.f11413k || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i)));
        } else {
            i2 = this.f11419q;
        }
        mo9573a(view, i, i2, false);
    }

    public LiveBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843840, R.attr.jf, R.attr.k6, R.attr.k7, R.attr.k_, R.attr.ka, R.attr.a30, R.attr.a31, R.attr.a32, R.attr.a33, R.attr.a34, R.attr.a35, R.attr.a36, R.attr.a37, R.attr.a38});
        if (Build.VERSION.SDK_INT >= 21) {
            this.f11412j = obtainStyledAttributes.getDimension(0, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(4);
        if (peekValue == null || peekValue.data != -1) {
            mo9578b(obtainStyledAttributes.getDimensionPixelSize(4, -1));
        } else {
            mo9578b(peekValue.data);
        }
        mo9580b(obtainStyledAttributes.getBoolean(3, false));
        mo9575a(obtainStyledAttributes.getBoolean(2, true));
        this.f11414l = obtainStyledAttributes.getBoolean(5, false);
        this.f11415m = obtainStyledAttributes.getBoolean(6, true);
        this.f11395L = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        TypedValue typedValue = new TypedValue();
        obtainStyledAttributes.getValue(8, typedValue);
        this.f11396M = typedValue.getFloat();
        this.f11397N = obtainStyledAttributes.getDimensionPixelSize(11, -1);
        obtainStyledAttributes.getValue(12, typedValue);
        this.f11398O = typedValue.getFloat();
        this.f11399P = obtainStyledAttributes.getDimensionPixelSize(9, -1);
        obtainStyledAttributes.getValue(10, typedValue);
        this.f11400Q = typedValue.getFloat();
        obtainStyledAttributes.getValue(14, typedValue);
        this.f11401R = typedValue.getFloat();
        this.f11406d = obtainStyledAttributes.getDimensionPixelSize(13, 0);
        obtainStyledAttributes.recycle();
        this.f11425w = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo9581b(View view, float f) {
        int b = this.f11419q - mo9577b();
        float abs = Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) mo9577b()));
        if (abs >= ((float) this.f11389F) || abs / ((float) b) >= 0.25f) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2518a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo2518a(coordinatorLayout, v, savedState.f3089d);
        int i = this.f11403a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f11405c = savedState.f11434b;
            }
            int i2 = this.f11403a;
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f11404b = savedState.f11435e;
            }
            int i3 = this.f11403a;
            if (i3 == -1 || (i3 & 4) == 4) {
                this.f11413k = savedState.f11436f;
            }
            int i4 = this.f11403a;
            if (i4 == -1 || (i4 & 8) == 8) {
                this.f11414l = savedState.f11437g;
            }
        }
        if (savedState.f11433a == 1 || savedState.f11433a == 2) {
            this.f11416n = 4;
        } else {
            this.f11416n = savedState.f11433a;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: b */
    public final boolean mo2532b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f11416n == 1 && actionMasked == 0) {
            return true;
        }
        C0827a aVar = this.f11417o;
        if (aVar != null) {
            aVar.mo3026b(motionEvent);
        }
        if (actionMasked == 0) {
            m9946f();
        }
        if (this.f11391H == null) {
            this.f11391H = VelocityTracker.obtain();
        }
        this.f11391H.addMovement(motionEvent);
        if (this.f11417o != null && actionMasked == 2 && !this.f11385B && Math.abs(((float) this.f11392I) - motionEvent.getY()) > ((float) this.f11417o.f3066b)) {
            this.f11417o.mo3018a(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (!this.f11385B) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9573a(View view, int i, int i2, boolean z) {
        C0827a aVar = this.f11417o;
        if (aVar == null || (!z ? !aVar.mo3022a(view, view.getLeft(), i2) : !aVar.mo3020a(view.getLeft(), i2))) {
            mo9583d(i);
            return;
        }
        mo9583d(2);
        if (this.f11428z == null) {
            this.f11428z = new RunnableC4108b(view, i);
        }
        if (!this.f11428z.f11438a) {
            this.f11428z.f11439b = i;
            C0792v.m2750a(view, this.f11428z);
            this.f11428z.f11438a = true;
            return;
        }
        this.f11428z.f11439b = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2519a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3 = 3;
        if (v.getTop() == mo9577b()) {
            mo9583d(3);
            return;
        }
        WeakReference<View> weakReference = this.f11421s;
        if (weakReference != null && view == weakReference.get() && this.f11387D) {
            if (this.f11386C > 0 || mo9581b(v, m9948g())) {
                if (this.f11404b) {
                    i2 = this.f11408f;
                } else {
                    int top = v.getTop();
                    i2 = this.f11409g;
                    if (top <= i2) {
                        i2 = this.f11407e;
                    }
                    i3 = 6;
                }
            } else if (!this.f11413k || !mo9576a(v, m9948g())) {
                if (this.f11386C == 0) {
                    int top2 = v.getTop();
                    if (!this.f11404b) {
                        int i4 = this.f11409g;
                        if (top2 < i4) {
                            if (top2 < Math.abs(top2 - this.f11411i)) {
                                i2 = this.f11407e;
                            } else {
                                i2 = this.f11409g;
                            }
                        } else if (Math.abs(top2 - i4) < Math.abs(top2 - this.f11411i)) {
                            i2 = this.f11409g;
                        } else {
                            i2 = this.f11411i;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.f11408f) < Math.abs(top2 - this.f11411i)) {
                        i2 = this.f11408f;
                    } else {
                        i2 = this.f11411i;
                    }
                } else {
                    if (!this.f11404b) {
                        int top3 = v.getTop();
                        if (Math.abs(top3 - this.f11409g) < Math.abs(top3 - this.f11411i)) {
                            i2 = this.f11409g;
                            i3 = 6;
                        }
                    }
                    i2 = this.f11411i;
                }
                i3 = 4;
            } else {
                i2 = this.f11419q;
                i3 = 5;
            }
            mo9573a((View) v, i3, i2, false);
            this.f11387D = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2522a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f11421s;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (view == view2) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < mo9577b()) {
                        iArr[1] = top - mo9577b();
                        C0792v.m2767d(v, -iArr[1]);
                        mo9583d(3);
                    } else if (this.f11415m) {
                        iArr[1] = i2;
                        C0792v.m2767d(v, -i2);
                        mo9583d(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.f11411i;
                    if (i4 > i5 && !this.f11413k) {
                        iArr[1] = top - i5;
                        C0792v.m2767d(v, -iArr[1]);
                        mo9583d(4);
                    } else if (this.f11415m) {
                        iArr[1] = i2;
                        C0792v.m2767d(v, -i2);
                        mo9583d(1);
                    } else {
                        return;
                    }
                }
                mo9584e(v.getTop());
                this.f11386C = i2;
                this.f11387D = true;
            }
        }
    }
}
