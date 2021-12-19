package com.p2082ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
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
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.C34621a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior */
public class ViewPagerBottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0557b<V> {

    /* renamed from: a */
    public float f76007a;

    /* renamed from: b */
    public int f76008b;

    /* renamed from: c */
    int f76009c;

    /* renamed from: d */
    int f76010d;

    /* renamed from: e */
    public boolean f76011e;

    /* renamed from: f */
    public boolean f76012f;

    /* renamed from: g */
    public int f76013g = 4;

    /* renamed from: h */
    C0827a f76014h;

    /* renamed from: i */
    int f76015i;

    /* renamed from: j */
    WeakReference<V> f76016j;

    /* renamed from: k */
    WeakReference<View> f76017k;

    /* renamed from: l */
    public AbstractC31806a f76018l;

    /* renamed from: m */
    int f76019m;

    /* renamed from: n */
    boolean f76020n;

    /* renamed from: o */
    public AbstractC31807b f76021o;

    /* renamed from: p */
    private float f76022p;

    /* renamed from: q */
    private int f76023q;

    /* renamed from: r */
    private boolean f76024r;

    /* renamed from: s */
    private boolean f76025s;

    /* renamed from: t */
    private boolean f76026t;

    /* renamed from: u */
    private VelocityTracker f76027u;

    /* renamed from: v */
    private int f76028v;

    /* renamed from: w */
    private final C0827a.AbstractC0830a f76029w = new C0827a.AbstractC0830a() {
        /* class com.p2082ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.C318042 */

        static {
            Covode.recordClassIndex(38545);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: b */
        public final int mo3038b() {
            int i;
            int i2;
            if (ViewPagerBottomSheetBehavior.this.f76011e) {
                i = ViewPagerBottomSheetBehavior.this.f76015i;
                i2 = ViewPagerBottomSheetBehavior.this.f76009c;
            } else {
                i = ViewPagerBottomSheetBehavior.this.f76010d;
                i2 = ViewPagerBottomSheetBehavior.this.f76009c;
            }
            return i - i2;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3033a(int i) {
            if (i == 1) {
                ViewPagerBottomSheetBehavior.this.mo57754c(1);
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
            if (ViewPagerBottomSheetBehavior.this.f76013g == 1 || ViewPagerBottomSheetBehavior.this.f76020n) {
                return false;
            }
            if ((ViewPagerBottomSheetBehavior.this.f76013g != 3 || ViewPagerBottomSheetBehavior.this.f76019m != i || (view2 = ViewPagerBottomSheetBehavior.this.f76017k.get()) == null || !view2.canScrollVertically(-1)) && ViewPagerBottomSheetBehavior.this.f76016j != null && ViewPagerBottomSheetBehavior.this.f76016j.get() == view) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final int mo3031a(View view, int i, int i2) {
            int i3;
            int i4 = ViewPagerBottomSheetBehavior.this.f76009c;
            if (ViewPagerBottomSheetBehavior.this.f76011e) {
                i3 = ViewPagerBottomSheetBehavior.this.f76015i;
            } else {
                i3 = ViewPagerBottomSheetBehavior.this.f76010d;
            }
            return C0622a.m2312a(i, i4, i3);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3035a(View view, float f, float f2) {
            int i;
            int i2 = 3;
            if (f2 < 0.0f && Math.abs(f2) > ViewPagerBottomSheetBehavior.this.f76007a && Math.abs(f2) > Math.abs(f)) {
                i = ViewPagerBottomSheetBehavior.this.f76009c;
            } else if (!ViewPagerBottomSheetBehavior.this.f76011e || !ViewPagerBottomSheetBehavior.this.mo57749a(view, f2)) {
                if (f2 <= 0.0f || Math.abs(f2) <= ViewPagerBottomSheetBehavior.this.f76007a || Math.abs(f2) <= Math.abs(f)) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewPagerBottomSheetBehavior.this.f76009c) < Math.abs(top - ViewPagerBottomSheetBehavior.this.f76010d)) {
                        i = ViewPagerBottomSheetBehavior.this.f76009c;
                    }
                }
                i = ViewPagerBottomSheetBehavior.this.f76010d;
                i2 = 4;
            } else {
                i = ViewPagerBottomSheetBehavior.this.f76015i;
                i2 = 5;
            }
            if (ViewPagerBottomSheetBehavior.this.f76014h.mo3020a(view.getLeft(), i)) {
                ViewPagerBottomSheetBehavior.this.mo57754c(2);
                C0792v.m2750a(view, new RunnableC31808c(view, i2));
                return;
            }
            ViewPagerBottomSheetBehavior.this.mo57754c(i2);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3037a(View view, int i, int i2, int i3, int i4) {
            ViewPagerBottomSheetBehavior.this.mo57753c();
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior$a */
    public static abstract class AbstractC31806a {
        static {
            Covode.recordClassIndex(38548);
        }

        /* renamed from: a */
        public abstract void mo57736a(View view);

        /* renamed from: a */
        public abstract void mo57737a(View view, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior$b */
    public interface AbstractC31807b {
        static {
            Covode.recordClassIndex(38549);
        }

        /* renamed from: a */
        void mo57738a();
    }

    static {
        Covode.recordClassIndex(38543);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2528a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        if (!v.isShown()) {
            this.f76025s = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m66142d();
        }
        if (this.f76027u == null) {
            this.f76027u = VelocityTracker.obtain();
        }
        this.f76027u.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f76028v = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f76017k;
            if (!(weakReference == null || (view = weakReference.get()) == null || !coordinatorLayout.mo2473a(view, x, this.f76028v))) {
                this.f76019m = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f76020n = true;
            }
            this.f76025s = this.f76019m == -1 && !coordinatorLayout.mo2473a(v, x, this.f76028v);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f76020n = false;
            this.f76019m = -1;
            if (this.f76025s) {
                this.f76025s = false;
                return false;
            }
        }
        if (!this.f76025s && this.f76014h.mo3021a(motionEvent)) {
            return true;
        }
        View view2 = this.f76017k.get();
        return actionMasked == 2 && view2 != null && !this.f76025s && this.f76013g != 1 && !coordinatorLayout.mo2473a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.f76028v) - motionEvent.getY()) > ((float) this.f76014h.f3066b);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2530a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view == this.f76017k.get()) {
            return this.f76013g != 3 || super.mo2530a(coordinatorLayout, v, view, f, f2);
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior$SavedState */
    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.p2082ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.SavedState.C318051 */

            static {
                Covode.recordClassIndex(38547);
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
        final int f76034a;

        static {
            Covode.recordClassIndex(38546);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f76034a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f76034a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f76034a);
        }
    }

    public ViewPagerBottomSheetBehavior() {
    }

    /* renamed from: d */
    private void m66142d() {
        this.f76019m = -1;
        VelocityTracker velocityTracker = this.f76027u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f76027u = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior$c */
    public class RunnableC31808c implements Runnable {

        /* renamed from: b */
        private final View f76036b;

        /* renamed from: c */
        private final int f76037c;

        static {
            Covode.recordClassIndex(38550);
        }

        public final void run() {
            if (ViewPagerBottomSheetBehavior.this.f76014h == null || !ViewPagerBottomSheetBehavior.this.f76014h.mo3027c()) {
                ViewPagerBottomSheetBehavior.this.mo57754c(this.f76037c);
            } else {
                C0792v.m2750a(this.f76036b, this);
            }
        }

        RunnableC31808c(View view, int i) {
            this.f76036b = view;
            this.f76037c = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo57753c() {
        AbstractC31806a aVar;
        V v = this.f76016j.get();
        if (v != null && (aVar = this.f76018l) != null) {
            aVar.mo57736a(v);
        }
    }

    /* renamed from: b */
    public final void mo57750b() {
        if (3 != this.f76013g) {
            WeakReference<V> weakReference = this.f76016j;
            if (weakReference == null) {
                this.f76013g = 3;
                return;
            }
            final V v = weakReference.get();
            if (v != null) {
                ViewParent parent = v.getParent();
                if (parent == null || !parent.isLayoutRequested() || !C0792v.m2791y(v)) {
                    mo57752b(v, 3);
                } else {
                    v.post(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.RunnableC318031 */

                        /* renamed from: b */
                        final /* synthetic */ int f76031b = 3;

                        static {
                            Covode.recordClassIndex(38544);
                        }

                        public final void run() {
                            ViewPagerBottomSheetBehavior.this.mo57752b(v, this.f76031b);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    public static <V extends View> ViewPagerBottomSheetBehavior<V> m66141b(V v) {
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

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo57748a(View view) {
        View a;
        if (C0792v.m2786t(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View a2 = C34621a.m70700a((ViewPager) view);
            if (!(a2 == null || (a = mo57748a(a2)) == null)) {
                return a;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a3 = mo57748a(viewGroup.getChildAt(i));
                if (a3 != null) {
                    return a3;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo57754c(int i) {
        AbstractC31806a aVar;
        if (this.f76013g != i) {
            this.f76013g = i;
            V v = this.f76016j.get();
            if (v != null && (aVar = this.f76018l) != null) {
                aVar.mo57737a(v, i);
            }
        }
    }

    /* renamed from: b */
    public final void mo57751b(int i) {
        WeakReference<V> weakReference;
        V v;
        if (i == -1) {
            if (!this.f76024r) {
                this.f76024r = true;
            } else {
                return;
            }
        } else if (this.f76024r || this.f76023q != i) {
            this.f76024r = false;
            this.f76023q = Math.max(0, i);
            this.f76010d = this.f76015i - i;
        } else {
            return;
        }
        if (this.f76013g == 4 && (weakReference = this.f76016j) != null && (v = weakReference.get()) != null) {
            v.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2523a(int i) {
        this.f76026t = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final Parcelable mo2513a(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo2513a(coordinatorLayout, (View) v), this.f76013g);
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k6, R.attr.k7, R.attr.k_, R.attr.ka});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            mo57751b(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            mo57751b(peekValue.data);
        }
        this.f76011e = obtainStyledAttributes.getBoolean(1, false);
        this.f76012f = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f76022p = (float) viewConfiguration.getScaledMaximumFlingVelocity();
        this.f76007a = (float) viewConfiguration.getScaledMinimumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2516a(V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f76009c) {
            mo57754c(3);
            return;
        }
        WeakReference<View> weakReference = this.f76017k;
        if (weakReference != null && view == weakReference.get() && this.f76026t) {
            this.f76027u.computeCurrentVelocity(1000, this.f76022p);
            float xVelocity = this.f76027u.getXVelocity(this.f76019m);
            float yVelocity = this.f76027u.getYVelocity(this.f76019m);
            if (yVelocity < 0.0f && Math.abs(yVelocity) > this.f76007a && Math.abs(yVelocity) > Math.abs(xVelocity)) {
                i = this.f76009c;
            } else if (!this.f76011e || !mo57749a(v, yVelocity)) {
                if (yVelocity <= 0.0f || Math.abs(yVelocity) <= this.f76007a || Math.abs(yVelocity) <= Math.abs(xVelocity)) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f76009c) < Math.abs(top - this.f76010d)) {
                        i = this.f76009c;
                    }
                }
                i = this.f76010d;
                i2 = 4;
            } else {
                i = this.f76015i;
                i2 = 5;
            }
            if (this.f76014h.mo3022a((View) v, v.getLeft(), i)) {
                mo57754c(2);
                C0792v.m2750a(v, new RunnableC31808c(v, i2));
            } else {
                mo57754c(i2);
            }
            this.f76026t = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo57752b(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f76010d;
        } else if (i == 3) {
            i2 = this.f76009c;
        } else if (!this.f76011e || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i)));
        } else {
            i2 = this.f76015i;
        }
        if (this.f76014h.mo3022a(view, view.getLeft(), i2)) {
            mo57754c(2);
            C0792v.m2750a(view, new RunnableC31808c(view, i));
            return;
        }
        mo57754c(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo57749a(View view, float f) {
        if (this.f76012f) {
            return true;
        }
        if (view.getTop() >= this.f76010d && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f76010d)) / ((float) this.f76023q) > 0.5f) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2518a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo2518a(coordinatorLayout, v, savedState.f3089d);
        if (savedState.f76034a == 1 || savedState.f76034a == 2) {
            this.f76013g = 4;
        } else {
            this.f76013g = savedState.f76034a;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: b */
    public final boolean mo2532b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        AbstractC31807b bVar;
        try {
            if (!v.isShown()) {
                return false;
            }
            if (motionEvent.getAction() == 0 && this.f76013g == 3) {
                Rect rect = new Rect();
                v.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && (bVar = this.f76021o) != null) {
                    bVar.mo57738a();
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (this.f76013g == 1 && actionMasked == 0) {
                return true;
            }
            C0827a aVar = this.f76014h;
            if (aVar != null) {
                aVar.mo3026b(motionEvent);
            }
            if (actionMasked == 0) {
                m66142d();
            }
            if (this.f76027u == null) {
                this.f76027u = VelocityTracker.obtain();
            }
            this.f76027u.addMovement(motionEvent);
            if (actionMasked == 2 && !this.f76025s && Math.abs(((float) this.f76028v) - motionEvent.getY()) > ((float) this.f76014h.f3066b)) {
                this.f76014h.mo3018a(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            if (!this.f76025s) {
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            if (!TextUtils.isEmpty(e.getMessage()) && e.getMessage().contains("pointerIndex out of range")) {
                return false;
            }
            throw e;
        }
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
        this.f76015i = coordinatorLayout.getHeight();
        if (this.f76024r) {
            if (this.f76008b == 0) {
                this.f76008b = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.hj);
            }
            i2 = Math.max(this.f76008b, this.f76015i - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.f76023q;
        }
        int max = Math.max(0, this.f76015i - v.getHeight());
        this.f76009c = max;
        int max2 = Math.max(this.f76015i - i2, max);
        this.f76010d = max2;
        int i3 = this.f76013g;
        if (i3 == 3) {
            C0792v.m2767d(v, this.f76009c);
        } else if (this.f76011e && i3 == 5) {
            C0792v.m2767d(v, this.f76015i);
        } else if (i3 == 4) {
            C0792v.m2767d(v, max2);
        } else if (i3 == 1 || i3 == 2) {
            C0792v.m2767d(v, top - v.getTop());
        }
        if (this.f76014h == null) {
            this.f76014h = C0827a.m2924a(coordinatorLayout, this.f76029w);
        }
        this.f76016j = new WeakReference<>(v);
        this.f76017k = new WeakReference<>(mo57748a(v));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2521a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == this.f76017k.get()) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                int i4 = this.f76009c;
                if (i3 < i4) {
                    iArr[1] = top - i4;
                    C0792v.m2767d(v, -iArr[1]);
                    mo57754c(3);
                } else {
                    iArr[1] = i2;
                    C0792v.m2767d(v, -i2);
                    mo57754c(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.f76010d;
                if (i3 <= i5 || this.f76011e) {
                    iArr[1] = i2;
                    C0792v.m2767d(v, -i2);
                    mo57754c(1);
                } else {
                    iArr[1] = top - i5;
                    C0792v.m2767d(v, -iArr[1]);
                    mo57754c(4);
                }
            }
            v.getTop();
            mo57753c();
            this.f76026t = true;
        }
    }
}
