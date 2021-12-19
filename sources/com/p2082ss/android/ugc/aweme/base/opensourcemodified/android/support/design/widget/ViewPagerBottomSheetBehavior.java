package com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
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
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior */
public class ViewPagerBottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0557b<V> {

    /* renamed from: a */
    public int f81675a;

    /* renamed from: b */
    int f81676b;

    /* renamed from: c */
    int f81677c;

    /* renamed from: d */
    public boolean f81678d;

    /* renamed from: e */
    public boolean f81679e;

    /* renamed from: f */
    public int f81680f = 4;

    /* renamed from: g */
    C0827a f81681g;

    /* renamed from: h */
    int f81682h;

    /* renamed from: i */
    WeakReference<V> f81683i;

    /* renamed from: j */
    WeakReference<View> f81684j;

    /* renamed from: k */
    public AbstractC34617a f81685k;

    /* renamed from: l */
    int f81686l;

    /* renamed from: m */
    boolean f81687m;

    /* renamed from: n */
    private float f81688n;

    /* renamed from: o */
    private int f81689o;

    /* renamed from: p */
    private boolean f81690p;

    /* renamed from: q */
    private boolean f81691q;

    /* renamed from: r */
    private int f81692r;

    /* renamed from: s */
    private boolean f81693s;

    /* renamed from: t */
    private VelocityTracker f81694t;

    /* renamed from: u */
    private int f81695u;

    /* renamed from: v */
    private boolean f81696v;

    /* renamed from: w */
    private final C0827a.AbstractC0830a f81697w = new C0827a.AbstractC0830a() {
        /* class com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.C346151 */

        static {
            Covode.recordClassIndex(41580);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: b */
        public final int mo3038b() {
            int i;
            int i2;
            if (ViewPagerBottomSheetBehavior.this.f81678d) {
                i = ViewPagerBottomSheetBehavior.this.f81682h;
                i2 = ViewPagerBottomSheetBehavior.this.f81676b;
            } else {
                i = ViewPagerBottomSheetBehavior.this.f81677c;
                i2 = ViewPagerBottomSheetBehavior.this.f81676b;
            }
            return i - i2;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3033a(int i) {
            if (i == 1) {
                ViewPagerBottomSheetBehavior.this.mo61094c(1);
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
            if (ViewPagerBottomSheetBehavior.this.f81680f == 1 || ViewPagerBottomSheetBehavior.this.f81687m) {
                return false;
            }
            if ((ViewPagerBottomSheetBehavior.this.f81680f != 3 || ViewPagerBottomSheetBehavior.this.f81686l != i || (view2 = ViewPagerBottomSheetBehavior.this.f81684j.get()) == null || !view2.canScrollVertically(-1)) && ViewPagerBottomSheetBehavior.this.f81683i != null && ViewPagerBottomSheetBehavior.this.f81683i.get() == view) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final int mo3031a(View view, int i, int i2) {
            int i3;
            int i4 = ViewPagerBottomSheetBehavior.this.f81676b;
            if (ViewPagerBottomSheetBehavior.this.f81678d) {
                i3 = ViewPagerBottomSheetBehavior.this.f81682h;
            } else {
                i3 = ViewPagerBottomSheetBehavior.this.f81677c;
            }
            return C0622a.m2312a(i, i4, i3);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3035a(View view, float f, float f2) {
            int i;
            int i2 = 3;
            if (f2 < 0.0f) {
                i = ViewPagerBottomSheetBehavior.this.f81676b;
            } else if (!ViewPagerBottomSheetBehavior.this.f81678d || !ViewPagerBottomSheetBehavior.this.mo61090a(view, f2)) {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewPagerBottomSheetBehavior.this.f81676b) < Math.abs(top - ViewPagerBottomSheetBehavior.this.f81677c)) {
                        i = ViewPagerBottomSheetBehavior.this.f81676b;
                    } else {
                        i = ViewPagerBottomSheetBehavior.this.f81677c;
                    }
                } else {
                    i = ViewPagerBottomSheetBehavior.this.f81677c;
                }
                i2 = 4;
            } else {
                i = ViewPagerBottomSheetBehavior.this.f81682h;
                i2 = 5;
            }
            if (ViewPagerBottomSheetBehavior.this.f81681g.mo3020a(view.getLeft(), i)) {
                ViewPagerBottomSheetBehavior.this.mo61094c(2);
                C0792v.m2750a(view, new RunnableC34620c(view, i2));
                return;
            }
            ViewPagerBottomSheetBehavior.this.mo61094c(i2);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3037a(View view, int i, int i2, int i3, int i4) {
            ViewPagerBottomSheetBehavior.this.mo61095d(i2);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior$a */
    public static abstract class AbstractC34617a {
        static {
            Covode.recordClassIndex(41583);
        }

        /* renamed from: a */
        public abstract void mo61099a(View view, float f);

        /* renamed from: a */
        public abstract void mo61100a(View view, int i);
    }

    static {
        Covode.recordClassIndex(41579);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2524a(CoordinatorLayout coordinatorLayout, V v, int i) {
        int i2;
        if (C0792v.m2781o(coordinatorLayout) && !C0792v.m2781o(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        coordinatorLayout.mo2469a(v, i);
        this.f81682h = coordinatorLayout.getHeight();
        if (this.f81690p) {
            if (this.f81675a == 0) {
                this.f81675a = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.hj);
            }
            i2 = Math.max(this.f81675a, this.f81682h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.f81689o;
        }
        int max = Math.max(0, this.f81682h - v.getHeight());
        this.f81676b = max;
        int max2 = Math.max(this.f81682h - i2, max);
        this.f81677c = max2;
        int i3 = this.f81680f;
        if (i3 == 3) {
            C0792v.m2767d(v, this.f81676b);
        } else if (this.f81678d && i3 == 5) {
            C0792v.m2767d(v, this.f81682h);
        } else if (i3 == 4) {
            C0792v.m2767d(v, max2);
        } else if (i3 == 1 || i3 == 2) {
            C0792v.m2767d(v, top - v.getTop());
        }
        if (this.f81681g == null) {
            this.f81681g = C0827a.m2924a(coordinatorLayout, this.f81697w);
        }
        this.f81683i = new WeakReference<>(v);
        this.f81684j = new WeakReference<>(m70673c(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public boolean mo2528a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        if (!v.isShown()) {
            this.f81691q = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m70674c();
        }
        if (this.f81694t == null) {
            this.f81694t = VelocityTracker.obtain();
        }
        this.f81694t.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f81695u = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f81684j;
            if (!(weakReference == null || (view = weakReference.get()) == null || !coordinatorLayout.mo2473a(view, x, this.f81695u))) {
                this.f81686l = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f81687m = true;
            }
            this.f81691q = this.f81686l == -1 && !coordinatorLayout.mo2473a(v, x, this.f81695u);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f81687m = false;
            this.f81686l = -1;
            if (this.f81691q) {
                this.f81691q = false;
                return false;
            }
        }
        if (!this.f81691q && this.f81681g.mo3021a(motionEvent)) {
            return true;
        }
        View view2 = this.f81684j.get();
        return actionMasked == 2 && view2 != null && !this.f81691q && this.f81680f != 1 && !coordinatorLayout.mo2473a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.f81695u) - motionEvent.getY()) > ((float) this.f81681g.f3066b);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2530a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view == this.f81684j.get()) {
            return this.f81680f != 3 || super.mo2530a(coordinatorLayout, v, view, f, f2);
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior$SavedState */
    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.SavedState.C346161 */

            static {
                Covode.recordClassIndex(41582);
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
        final int f81699a;

        static {
            Covode.recordClassIndex(41581);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f81699a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f81699a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f81699a);
        }
    }

    public ViewPagerBottomSheetBehavior() {
    }

    /* renamed from: c */
    private void m70674c() {
        this.f81686l = -1;
        VelocityTracker velocityTracker = this.f81694t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f81694t = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior$c */
    class RunnableC34620c implements Runnable {

        /* renamed from: b */
        private final View f81704b;

        /* renamed from: c */
        private final int f81705c;

        static {
            Covode.recordClassIndex(41586);
        }

        public final void run() {
            if (ViewPagerBottomSheetBehavior.this.f81681g == null || !ViewPagerBottomSheetBehavior.this.f81681g.mo3027c()) {
                ViewPagerBottomSheetBehavior.this.mo61094c(this.f81705c);
            } else {
                C0792v.m2750a(this.f81704b, this);
            }
        }

        RunnableC34620c(View view, int i) {
            this.f81704b = view;
            this.f81705c = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo61091b() {
        this.f81684j = new WeakReference<>(m70673c(this.f81683i.get()));
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior$b */
    static class C34618b extends ViewPager.C1582h {

        /* renamed from: a */
        public final ViewPagerBottomSheetBehavior f81700a;

        /* renamed from: b */
        private final ViewPager f81701b;

        static {
            Covode.recordClassIndex(41584);
        }

        @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            this.f81701b.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.C34618b.RunnableC346191 */

                static {
                    Covode.recordClassIndex(41585);
                }

                public final void run() {
                    if (C34618b.this.f81700a.f81683i != null) {
                        C34618b.this.f81700a.mo61091b();
                    }
                }
            });
        }

        private C34618b(ViewPager viewPager, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
            this.f81701b = viewPager;
            this.f81700a = viewPagerBottomSheetBehavior;
        }

        /* synthetic */ C34618b(ViewPager viewPager, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior, byte b) {
            this(viewPager, viewPagerBottomSheetBehavior);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo61094c(int i) {
        AbstractC34617a aVar;
        if (this.f81680f != i) {
            this.f81680f = i;
            V v = this.f81683i.get();
            if (v != null && (aVar = this.f81685k) != null) {
                aVar.mo61100a((View) v, i);
            }
        }
    }

    /* renamed from: a */
    public static <V extends View> ViewPagerBottomSheetBehavior<V> m70672a(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C0560e) {
            CoordinatorLayout.AbstractC0557b bVar = ((CoordinatorLayout.C0560e) layoutParams).f2416a;
            if (bVar instanceof ViewPagerBottomSheetBehavior) {
                return (ViewPagerBottomSheetBehavior) bVar;
            }
            throw new IllegalArgumentException("The view is not associated with ViewPagerBottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: b */
    public final void mo61092b(int i) {
        WeakReference<V> weakReference;
        V v;
        if (i == -1) {
            if (!this.f81690p) {
                this.f81690p = true;
            } else {
                return;
            }
        } else if (this.f81690p || this.f81689o != i) {
            this.f81690p = false;
            this.f81689o = Math.max(0, i);
            this.f81677c = this.f81682h - i;
        } else {
            return;
        }
        if (this.f81680f == 4 && (weakReference = this.f81683i) != null && (v = weakReference.get()) != null) {
            v.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo61095d(int i) {
        AbstractC34617a aVar;
        V v = this.f81683i.get();
        if (v != null && (aVar = this.f81685k) != null) {
            int i2 = this.f81677c;
            if (i > i2) {
                aVar.mo61099a(v, ((float) (i2 - i)) / ((float) (this.f81682h - i2)));
            } else {
                aVar.mo61099a(v, ((float) (i2 - i)) / ((float) (i2 - this.f81676b)));
            }
        }
    }

    /* renamed from: c */
    private View m70673c(View view) {
        if (view == null) {
            return null;
        }
        if (this.f81696v) {
            return this.f81684j.get();
        }
        if (C0792v.m2786t(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View c = m70673c(C34621a.m70700a((ViewPager) view));
            if (c != null) {
                return c;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getVisibility() == 0) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View c2 = m70673c(viewGroup.getChildAt(i));
                    if (c2 != null) {
                        return c2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo61093b(View view) {
        V v = this.f81683i.get();
        if (v != null) {
            if (view != null) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == v) {
                        View c = m70673c(view);
                        if (c != null) {
                            this.f81684j = new WeakReference<>(c);
                            this.f81696v = true;
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("child is not a child of current View.");
            }
            if (this.f81696v) {
                this.f81696v = false;
                mo61091b();
            }
        }
    }

    /* renamed from: a */
    public final void mo61089a(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(new C34618b(viewPager, this, (byte) 0));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2523a(int i) {
        this.f81692r = 0;
        this.f81693s = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final Parcelable mo2513a(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo2513a(coordinatorLayout, (View) v), this.f81680f);
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k6, R.attr.k7, R.attr.k_, R.attr.ka});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            mo61092b(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            mo61092b(peekValue.data);
        }
        this.f81678d = obtainStyledAttributes.getBoolean(1, false);
        this.f81679e = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f81688n = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2516a(V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f81676b) {
            mo61094c(3);
            return;
        }
        WeakReference<View> weakReference = this.f81684j;
        if (weakReference != null && view == weakReference.get() && this.f81693s) {
            if (this.f81692r > 0) {
                i = this.f81676b;
            } else {
                if (this.f81678d) {
                    this.f81694t.computeCurrentVelocity(1000, this.f81688n);
                    if (mo61090a(v, this.f81694t.getYVelocity(this.f81686l))) {
                        i = this.f81682h;
                        i2 = 5;
                    }
                }
                if (this.f81692r == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f81676b) < Math.abs(top - this.f81677c)) {
                        i = this.f81676b;
                    } else {
                        i = this.f81677c;
                    }
                } else {
                    i = this.f81677c;
                }
                i2 = 4;
            }
            if (this.f81681g.mo3022a((View) v, v.getLeft(), i)) {
                mo61094c(2);
                C0792v.m2750a(v, new RunnableC34620c(v, i2));
            } else {
                mo61094c(i2);
            }
            this.f81693s = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo61090a(View view, float f) {
        if (this.f81679e) {
            return true;
        }
        if (view.getTop() >= this.f81677c && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f81677c)) / ((float) this.f81689o) > 0.5f) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2518a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo2518a(coordinatorLayout, v, savedState.f3089d);
        if (savedState.f81699a == 1 || savedState.f81699a == 2) {
            this.f81680f = 4;
        } else {
            this.f81680f = savedState.f81699a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081 A[RETURN] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2532b(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.mo2532b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2521a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == this.f81684j.get()) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                int i4 = this.f81676b;
                if (i3 < i4) {
                    iArr[1] = top - i4;
                    C0792v.m2767d(v, -iArr[1]);
                    mo61094c(3);
                } else {
                    iArr[1] = i2;
                    C0792v.m2767d(v, -i2);
                    mo61094c(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.f81677c;
                if (i3 <= i5 || this.f81678d) {
                    iArr[1] = i2;
                    C0792v.m2767d(v, -i2);
                    mo61094c(1);
                } else {
                    iArr[1] = top - i5;
                    C0792v.m2767d(v, -iArr[1]);
                    mo61094c(4);
                }
            }
            mo61095d(v.getTop());
            this.f81692r = i2;
            this.f81693s = true;
        }
    }
}
