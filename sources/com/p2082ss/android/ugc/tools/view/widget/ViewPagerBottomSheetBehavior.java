package com.p2082ss.android.ugc.tools.view.widget;

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
import com.p2082ss.android.ugc.tools.view.widget.C85065p;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior */
public class ViewPagerBottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0557b<V> {

    /* renamed from: a */
    private float f190133a;

    /* renamed from: b */
    public float f190134b = 0.5f;

    /* renamed from: c */
    public int f190135c;

    /* renamed from: d */
    int f190136d;

    /* renamed from: e */
    int f190137e;

    /* renamed from: f */
    public boolean f190138f;

    /* renamed from: g */
    public boolean f190139g;

    /* renamed from: h */
    public int f190140h = 4;

    /* renamed from: i */
    C0827a f190141i;

    /* renamed from: j */
    int f190142j;

    /* renamed from: k */
    WeakReference<V> f190143k;

    /* renamed from: l */
    WeakReference<View> f190144l;

    /* renamed from: m */
    public AbstractC85004a f190145m;

    /* renamed from: n */
    int f190146n;

    /* renamed from: o */
    boolean f190147o;

    /* renamed from: p */
    public double f190148p = 1.0d;

    /* renamed from: q */
    private int f190149q;

    /* renamed from: r */
    private boolean f190150r;

    /* renamed from: s */
    private boolean f190151s;

    /* renamed from: t */
    private int f190152t;

    /* renamed from: u */
    private boolean f190153u;

    /* renamed from: v */
    private VelocityTracker f190154v;

    /* renamed from: w */
    private int f190155w;

    /* renamed from: x */
    private boolean f190156x;

    /* renamed from: y */
    private final C0827a.AbstractC0830a f190157y = new C0827a.AbstractC0830a() {
        /* class com.p2082ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.C850022 */

        static {
            Covode.recordClassIndex(99022);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: b */
        public final int mo3038b() {
            int i;
            int i2;
            if (ViewPagerBottomSheetBehavior.this.f190138f) {
                i = ViewPagerBottomSheetBehavior.this.f190142j;
                i2 = ViewPagerBottomSheetBehavior.this.f190136d;
            } else {
                i = ViewPagerBottomSheetBehavior.this.f190137e;
                i2 = ViewPagerBottomSheetBehavior.this.f190136d;
            }
            return i - i2;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3033a(int i) {
            if (i == 1) {
                ViewPagerBottomSheetBehavior.this.mo129925d(1);
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
            if (ViewPagerBottomSheetBehavior.this.f190140h == 1 || ViewPagerBottomSheetBehavior.this.f190147o) {
                return false;
            }
            if ((ViewPagerBottomSheetBehavior.this.f190140h != 3 || ViewPagerBottomSheetBehavior.this.f190146n != i || ViewPagerBottomSheetBehavior.this.f190144l == null || (view2 = ViewPagerBottomSheetBehavior.this.f190144l.get()) == null || !view2.canScrollVertically(-1)) && ViewPagerBottomSheetBehavior.this.f190143k != null && ViewPagerBottomSheetBehavior.this.f190143k.get() == view) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final int mo3031a(View view, int i, int i2) {
            int i3;
            double d = (double) i2;
            Double.isNaN(d);
            int i4 = i - ((int) (d * (1.0d - ViewPagerBottomSheetBehavior.this.f190148p)));
            int i5 = ViewPagerBottomSheetBehavior.this.f190136d;
            if (ViewPagerBottomSheetBehavior.this.f190138f) {
                i3 = ViewPagerBottomSheetBehavior.this.f190142j;
            } else {
                i3 = ViewPagerBottomSheetBehavior.this.f190137e;
            }
            return C0622a.m2312a(i4, i5, i3);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3035a(View view, float f, float f2) {
            int i;
            int i2 = 3;
            if (f2 < 0.0f) {
                i = ViewPagerBottomSheetBehavior.this.f190136d;
            } else if (!ViewPagerBottomSheetBehavior.this.f190138f || !ViewPagerBottomSheetBehavior.this.mo129920a(view, f2)) {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewPagerBottomSheetBehavior.this.f190136d) < Math.abs(top - ViewPagerBottomSheetBehavior.this.f190137e)) {
                        i = ViewPagerBottomSheetBehavior.this.f190136d;
                    } else {
                        i = ViewPagerBottomSheetBehavior.this.f190137e;
                    }
                } else {
                    i = ViewPagerBottomSheetBehavior.this.f190137e;
                }
                i2 = 4;
            } else {
                i = ViewPagerBottomSheetBehavior.this.f190142j;
                i2 = 5;
            }
            if (ViewPagerBottomSheetBehavior.this.f190141i.mo3020a(view.getLeft(), i)) {
                ViewPagerBottomSheetBehavior.this.mo129925d(2);
                C0792v.m2750a(view, new RunnableC85007c(view, i2));
                return;
            }
            ViewPagerBottomSheetBehavior.this.mo129925d(i2);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3037a(View view, int i, int i2, int i3, int i4) {
            ViewPagerBottomSheetBehavior.this.mo129921b();
        }
    };

    /* renamed from: com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior$a */
    public static abstract class AbstractC85004a {
        static {
            Covode.recordClassIndex(99025);
        }

        /* renamed from: a */
        public abstract void mo114395a(View view);

        /* renamed from: a */
        public abstract void mo114396a(View view, int i);
    }

    static {
        Covode.recordClassIndex(99020);
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
        this.f190142j = coordinatorLayout.getHeight();
        if (this.f190150r) {
            if (this.f190135c == 0) {
                this.f190135c = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.hj);
            }
            i2 = Math.max(this.f190135c, this.f190142j - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.f190149q;
        }
        int max = Math.max(0, this.f190142j - v.getHeight());
        this.f190136d = max;
        int max2 = Math.max(this.f190142j - i2, max);
        this.f190137e = max2;
        int i3 = this.f190140h;
        if (i3 == 3) {
            int top2 = v.getTop();
            int i4 = this.f190136d;
            if (top2 != i4) {
                C0792v.m2767d(v, i4);
            }
        } else if (this.f190138f && i3 == 5) {
            C0792v.m2767d(v, this.f190142j);
        } else if (i3 == 4) {
            C0792v.m2767d(v, max2);
        } else if (i3 == 1 || i3 == 2) {
            C0792v.m2767d(v, top - v.getTop());
        }
        if (this.f190141i == null) {
            this.f190141i = C0827a.m2924a(coordinatorLayout, this.f190157y);
        }
        this.f190143k = new WeakReference<>(v);
        this.f190144l = new WeakReference<>(mo129918a(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2528a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        if (!v.isShown()) {
            this.f190151s = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m146100c();
        }
        if (this.f190154v == null) {
            this.f190154v = VelocityTracker.obtain();
        }
        this.f190154v.addMovement(motionEvent);
        View view2 = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f190155w = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f190144l;
            if (!(weakReference == null || (view = weakReference.get()) == null || !coordinatorLayout.mo2473a(view, x, this.f190155w))) {
                this.f190146n = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f190147o = true;
            }
            this.f190151s = this.f190146n == -1 && !coordinatorLayout.mo2473a(v, x, this.f190155w);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f190147o = false;
            this.f190146n = -1;
            if (this.f190151s) {
                this.f190151s = false;
                return false;
            }
        }
        if (!this.f190151s && this.f190141i.mo3021a(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f190144l;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        return actionMasked == 2 && view2 != null && !this.f190151s && this.f190140h != 1 && !coordinatorLayout.mo2473a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.f190155w) - motionEvent.getY()) > ((float) this.f190141i.f3066b);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2530a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f190144l;
        if (view == (weakReference != null ? weakReference.get() : null)) {
            return this.f190140h != 3 || super.mo2530a(coordinatorLayout, v, view, f, f2);
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior$SavedState */
    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.p2082ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.SavedState.C850031 */

            static {
                Covode.recordClassIndex(99024);
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
        final int f190162a;

        static {
            Covode.recordClassIndex(99023);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f190162a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f190162a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f190162a);
        }
    }

    /* renamed from: c */
    private void m146100c() {
        this.f190146n = -1;
        VelocityTracker velocityTracker = this.f190154v;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f190154v = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior$c */
    public class RunnableC85007c implements Runnable {

        /* renamed from: b */
        private final View f190167b;

        /* renamed from: c */
        private final int f190168c;

        static {
            Covode.recordClassIndex(99028);
        }

        public final void run() {
            if (ViewPagerBottomSheetBehavior.this.f190141i == null || !ViewPagerBottomSheetBehavior.this.f190141i.mo3027c()) {
                ViewPagerBottomSheetBehavior.this.mo129925d(this.f190168c);
            } else {
                C0792v.m2750a(this.f190167b, this);
            }
        }

        RunnableC85007c(View view, int i) {
            this.f190167b = view;
            this.f190168c = i;
        }
    }

    public ViewPagerBottomSheetBehavior() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo129921b() {
        AbstractC85004a aVar;
        V v = this.f190143k.get();
        if (v != null && (aVar = this.f190145m) != null) {
            aVar.mo114395a(v);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior$b */
    static class C85005b extends ViewPager.C1582h {

        /* renamed from: a */
        public final ViewPagerBottomSheetBehavior f190163a;

        /* renamed from: b */
        private final ViewPager f190164b;

        static {
            Covode.recordClassIndex(99026);
        }

        @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            this.f190164b.post(new Runnable() {
                /* class com.p2082ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.C85005b.RunnableC850061 */

                static {
                    Covode.recordClassIndex(99027);
                }

                public final void run() {
                    if (C85005b.this.f190163a.f190143k != null) {
                        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = C85005b.this.f190163a;
                        viewPagerBottomSheetBehavior.f190144l = new WeakReference<>(viewPagerBottomSheetBehavior.mo129918a(viewPagerBottomSheetBehavior.f190143k.get()));
                    }
                }
            });
        }

        private C85005b(ViewPager viewPager, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
            this.f190164b = viewPager;
            this.f190163a = viewPagerBottomSheetBehavior;
        }

        /* synthetic */ C85005b(ViewPager viewPager, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior, byte b) {
            this(viewPager, viewPagerBottomSheetBehavior);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo129925d(int i) {
        AbstractC85004a aVar;
        if (this.f190140h != i) {
            this.f190140h = i;
            V v = this.f190143k.get();
            if (v != null && (aVar = this.f190145m) != null) {
                aVar.mo114396a(v, i);
            }
        }
    }

    public ViewPagerBottomSheetBehavior(Context context) {
        super(context, null);
        mo129922b(-1);
        this.f190133a = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: a */
    public final void mo129919a(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(new C85005b(viewPager, this, (byte) 0));
    }

    /* renamed from: b */
    public final void mo129922b(int i) {
        WeakReference<V> weakReference;
        V v;
        if (i == -1) {
            if (!this.f190150r) {
                this.f190150r = true;
            } else {
                return;
            }
        } else if (this.f190150r || this.f190149q != i) {
            this.f190150r = false;
            this.f190149q = Math.max(0, i);
            this.f190137e = this.f190142j - i;
        } else {
            return;
        }
        if (this.f190140h == 4 && (weakReference = this.f190143k) != null && (v = weakReference.get()) != null) {
            v.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo129918a(View view) {
        if (view == null) {
            return null;
        }
        if (this.f190156x) {
            WeakReference<View> weakReference = this.f190144l;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        } else if (C0792v.m2786t(view)) {
            return view;
        } else {
            if (view instanceof ViewPager) {
                View a = mo129918a(C85065p.C85066a.m146265a((ViewPager) view));
                if (a != null) {
                    return a;
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getVisibility() == 0) {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View a2 = mo129918a(viewGroup.getChildAt(i));
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: c */
    public final void mo129924c(final int i) {
        if (i != this.f190140h) {
            WeakReference<V> weakReference = this.f190143k;
            if (weakReference != null) {
                final V v = weakReference.get();
                if (v != null) {
                    ViewParent parent = v.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !C0792v.m2791y(v)) {
                        mo129923b(v, i);
                    } else {
                        v.post(new Runnable() {
                            /* class com.p2082ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.RunnableC850011 */

                            static {
                                Covode.recordClassIndex(99021);
                            }

                            public final void run() {
                                ViewPagerBottomSheetBehavior.this.mo129923b(v, i);
                            }
                        });
                    }
                }
            } else if (i == 4 || i == 3 || (this.f190138f && i == 5)) {
                this.f190140h = i;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2523a(int i) {
        this.f190152t = 0;
        this.f190153u = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final Parcelable mo2513a(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo2513a(coordinatorLayout, (View) v), this.f190140h);
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k6, R.attr.k7, R.attr.k_, R.attr.ka});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            mo129922b(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            mo129922b(peekValue.data);
        }
        this.f190138f = obtainStyledAttributes.getBoolean(1, false);
        this.f190139g = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f190133a = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo129923b(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f190137e;
        } else if (i == 3) {
            i2 = this.f190136d;
        } else if (!this.f190138f || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i)));
        } else {
            i2 = this.f190142j;
        }
        if (this.f190141i.mo3022a(view, view.getLeft(), i2)) {
            mo129925d(2);
            C0792v.m2750a(view, new RunnableC85007c(view, i));
            return;
        }
        mo129925d(i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2516a(V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f190136d) {
            mo129925d(3);
            return;
        }
        WeakReference<View> weakReference = this.f190144l;
        if (weakReference != null && view == weakReference.get() && this.f190153u) {
            if (this.f190152t > 0) {
                i = this.f190136d;
            } else {
                if (this.f190138f) {
                    this.f190154v.computeCurrentVelocity(1000, this.f190133a);
                    if (mo129920a(v, this.f190154v.getYVelocity(this.f190146n))) {
                        i = this.f190142j;
                        i2 = 5;
                    }
                }
                if (this.f190152t == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f190136d) < Math.abs(top - this.f190137e)) {
                        i = this.f190136d;
                    } else {
                        i = this.f190137e;
                    }
                } else {
                    i = this.f190137e;
                }
                i2 = 4;
            }
            if (this.f190141i.mo3022a((View) v, v.getLeft(), i)) {
                mo129925d(2);
                C0792v.m2750a(v, new RunnableC85007c(v, i2));
            } else {
                mo129925d(i2);
            }
            this.f190153u = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo129920a(View view, float f) {
        if (this.f190139g) {
            return true;
        }
        if (view.getTop() >= this.f190137e && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f190137e)) / ((float) this.f190149q) > this.f190134b) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2518a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo2518a(coordinatorLayout, v, savedState.f3089d);
        if (savedState.f190162a == 1 || savedState.f190162a == 2) {
            this.f190140h = 4;
        } else {
            this.f190140h = savedState.f190162a;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.mo2532b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public void mo2521a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        View view2;
        WeakReference<View> weakReference = this.f190144l;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view == view2) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                int i4 = this.f190136d;
                if (i3 < i4) {
                    iArr[1] = top - i4;
                    C0792v.m2767d(v, -iArr[1]);
                    mo129925d(3);
                } else {
                    iArr[1] = i2;
                    C0792v.m2767d(v, -i2);
                    mo129925d(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.f190137e;
                if (i3 <= i5 || this.f190138f) {
                    iArr[1] = i2;
                    C0792v.m2767d(v, -i2);
                    mo129925d(1);
                } else {
                    iArr[1] = top - i5;
                    C0792v.m2767d(v, -iArr[1]);
                    mo129925d(4);
                }
            }
            v.getTop();
            mo129921b();
            this.f190152t = i2;
            this.f190153u = true;
        }
    }
}
