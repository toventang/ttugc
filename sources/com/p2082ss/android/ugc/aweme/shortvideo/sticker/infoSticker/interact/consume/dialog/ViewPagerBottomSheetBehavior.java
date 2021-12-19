package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.app.Dialog;
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
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p030b.C0622a;
import androidx.core.p037h.C0792v;
import androidx.customview.p040a.C0827a;
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior */
public class ViewPagerBottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0557b<V> {

    /* renamed from: a */
    public int f163601a;

    /* renamed from: b */
    int f163602b;

    /* renamed from: c */
    int f163603c;

    /* renamed from: d */
    public boolean f163604d;

    /* renamed from: e */
    public boolean f163605e;

    /* renamed from: f */
    public int f163606f = 4;

    /* renamed from: g */
    C0827a f163607g;

    /* renamed from: h */
    int f163608h;

    /* renamed from: i */
    WeakReference<V> f163609i;

    /* renamed from: j */
    WeakReference<View> f163610j;

    /* renamed from: k */
    WeakReference<Dialog> f163611k;

    /* renamed from: l */
    public AbstractC72909a f163612l;

    /* renamed from: m */
    int f163613m;

    /* renamed from: n */
    boolean f163614n;

    /* renamed from: o */
    private float f163615o;

    /* renamed from: p */
    private int f163616p;

    /* renamed from: q */
    private boolean f163617q;

    /* renamed from: r */
    private boolean f163618r;

    /* renamed from: s */
    private int f163619s;

    /* renamed from: t */
    private boolean f163620t;

    /* renamed from: u */
    private VelocityTracker f163621u;

    /* renamed from: v */
    private int f163622v;

    /* renamed from: w */
    private final C0827a.AbstractC0830a f163623w = new C0827a.AbstractC0830a() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior.C729072 */

        static {
            Covode.recordClassIndex(85606);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: b */
        public final int mo3038b() {
            int i;
            int i2;
            if (ViewPagerBottomSheetBehavior.this.f163604d) {
                i = ViewPagerBottomSheetBehavior.this.f163608h;
                i2 = ViewPagerBottomSheetBehavior.this.f163602b;
            } else {
                i = ViewPagerBottomSheetBehavior.this.f163603c;
                i2 = ViewPagerBottomSheetBehavior.this.f163602b;
            }
            return i - i2;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3033a(int i) {
            if (i == 1) {
                ViewPagerBottomSheetBehavior.this.mo115293b(1);
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
            if (ViewPagerBottomSheetBehavior.this.f163606f == 1 || ViewPagerBottomSheetBehavior.this.f163614n) {
                return false;
            }
            if ((ViewPagerBottomSheetBehavior.this.f163606f != 3 || ViewPagerBottomSheetBehavior.this.f163613m != i || (view2 = ViewPagerBottomSheetBehavior.this.f163610j.get()) == null || !view2.canScrollVertically(-1)) && ViewPagerBottomSheetBehavior.this.f163609i != null && ViewPagerBottomSheetBehavior.this.f163609i.get() == view) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final int mo3031a(View view, int i, int i2) {
            int i3;
            int i4 = ViewPagerBottomSheetBehavior.this.f163602b;
            if (ViewPagerBottomSheetBehavior.this.f163604d) {
                i3 = ViewPagerBottomSheetBehavior.this.f163608h;
            } else {
                i3 = ViewPagerBottomSheetBehavior.this.f163603c;
            }
            return C0622a.m2312a(i, i4, i3);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3035a(View view, float f, float f2) {
            int i;
            int i2 = 3;
            if (f2 < 0.0f) {
                i = ViewPagerBottomSheetBehavior.this.f163602b;
            } else if (!ViewPagerBottomSheetBehavior.this.f163604d || !ViewPagerBottomSheetBehavior.this.mo115291a(view, f2)) {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - ViewPagerBottomSheetBehavior.this.f163602b) < Math.abs(top - ViewPagerBottomSheetBehavior.this.f163603c)) {
                        i = ViewPagerBottomSheetBehavior.this.f163602b;
                    } else {
                        i = ViewPagerBottomSheetBehavior.this.f163603c;
                    }
                } else {
                    i = ViewPagerBottomSheetBehavior.this.f163603c;
                }
                i2 = 4;
            } else {
                i = ViewPagerBottomSheetBehavior.this.f163608h;
                i2 = 5;
            }
            if (ViewPagerBottomSheetBehavior.this.f163607g.mo3020a(view.getLeft(), i)) {
                ViewPagerBottomSheetBehavior.this.mo115293b(2);
                C0792v.m2750a(view, new RunnableC72910b(view, i2));
                return;
            }
            ViewPagerBottomSheetBehavior.this.mo115293b(i2);
        }

        @Override // androidx.customview.p040a.C0827a.AbstractC0830a
        /* renamed from: a */
        public final void mo3037a(View view, int i, int i2, int i3, int i4) {
            ViewPagerBottomSheetBehavior.this.mo115292b();
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$a */
    public static abstract class AbstractC72909a {
        static {
            Covode.recordClassIndex(85609);
        }

        /* renamed from: a */
        public abstract void mo115299a(int i);
    }

    static {
        Covode.recordClassIndex(85604);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2528a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        if (!v.isShown()) {
            this.f163618r = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m128740c();
        }
        if (this.f163621u == null) {
            this.f163621u = VelocityTracker.obtain();
        }
        this.f163621u.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f163622v = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f163610j;
            if (!(weakReference == null || (view = weakReference.get()) == null || !coordinatorLayout.mo2473a(view, x, this.f163622v))) {
                this.f163613m = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f163614n = true;
            }
            this.f163618r = this.f163613m == -1 && !coordinatorLayout.mo2473a(v, x, this.f163622v);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f163614n = false;
            this.f163613m = -1;
            if (this.f163618r) {
                this.f163618r = false;
                return false;
            }
        }
        if (!this.f163618r && this.f163607g.mo3021a(motionEvent)) {
            return true;
        }
        View view2 = this.f163610j.get();
        return actionMasked == 2 && view2 != null && !this.f163618r && this.f163606f != 1 && !coordinatorLayout.mo2473a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.f163622v) - motionEvent.getY()) > ((float) this.f163607g.f3066b);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2530a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view == this.f163610j.get()) {
            return this.f163606f != 3 || super.mo2530a(coordinatorLayout, v, view, f, f2);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo115292b() {
        this.f163609i.get();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$SavedState */
    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior.SavedState.C729081 */

            static {
                Covode.recordClassIndex(85608);
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
        final int f163628a;

        static {
            Covode.recordClassIndex(85607);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f163628a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f163628a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f163628a);
        }
    }

    public ViewPagerBottomSheetBehavior() {
    }

    /* renamed from: c */
    private void m128740c() {
        this.f163613m = -1;
        VelocityTracker velocityTracker = this.f163621u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f163621u = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior$b */
    public class RunnableC72910b implements Runnable {

        /* renamed from: b */
        private final View f163630b;

        /* renamed from: c */
        private final int f163631c;

        static {
            Covode.recordClassIndex(85610);
        }

        public final void run() {
            if (ViewPagerBottomSheetBehavior.this.f163607g == null || !ViewPagerBottomSheetBehavior.this.f163607g.mo3027c()) {
                ViewPagerBottomSheetBehavior.this.mo115293b(this.f163631c);
            } else {
                C0792v.m2750a(this.f163630b, this);
            }
        }

        RunnableC72910b(View view, int i) {
            this.f163630b = view;
            this.f163631c = i;
        }
    }

    /* renamed from: a */
    public final void mo115290a(Dialog dialog) {
        this.f163611k = new WeakReference<>(dialog);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo115293b(int i) {
        AbstractC72909a aVar;
        if (this.f163606f != i) {
            this.f163606f = i;
            if (this.f163609i.get() != null && (aVar = this.f163612l) != null) {
                aVar.mo115299a(i);
            }
        }
    }

    /* renamed from: b */
    public static <V extends View> ViewPagerBottomSheetBehavior<V> m128739b(V v) {
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

    /* renamed from: c */
    private void m128741c(int i) {
        WeakReference<V> weakReference;
        V v;
        if (i == -1) {
            if (!this.f163617q) {
                this.f163617q = true;
            } else {
                return;
            }
        } else if (this.f163617q || this.f163616p != i) {
            this.f163617q = false;
            this.f163616p = Math.max(0, i);
            this.f163603c = this.f163608h - i;
        } else {
            return;
        }
        if (this.f163606f == 4 && (weakReference = this.f163609i) != null && (v = weakReference.get()) != null) {
            v.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo115289a(View view) {
        View a;
        if (C0792v.m2786t(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View focusedChild = ((ViewPager) view).getFocusedChild();
            if (!(focusedChild == null || (a = mo115289a(focusedChild)) == null)) {
                return a;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a2 = mo115289a(viewGroup.getChildAt(i));
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2523a(int i) {
        this.f163619s = 0;
        this.f163620t = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final Parcelable mo2513a(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo2513a(coordinatorLayout, (View) v), this.f163606f);
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k6, R.attr.k7, R.attr.k_, R.attr.ka});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            m128741c(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            m128741c(peekValue.data);
        }
        this.f163604d = obtainStyledAttributes.getBoolean(1, false);
        this.f163605e = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f163615o = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo115294b(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f163603c;
        } else if (i == 3) {
            i2 = this.f163602b;
        } else if (!this.f163604d || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i)));
        } else {
            i2 = this.f163608h;
        }
        if (this.f163607g.mo3022a(view, view.getLeft(), i2)) {
            mo115293b(2);
            C0792v.m2750a(view, new RunnableC72910b(view, i));
            return;
        }
        mo115293b(i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2516a(V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f163602b) {
            mo115293b(3);
            return;
        }
        WeakReference<View> weakReference = this.f163610j;
        if (weakReference != null && view == weakReference.get() && this.f163620t) {
            if (this.f163619s > 0) {
                i = this.f163602b;
            } else {
                if (this.f163604d) {
                    this.f163621u.computeCurrentVelocity(1000, this.f163615o);
                    if (mo115291a(v, this.f163621u.getYVelocity(this.f163613m))) {
                        i = this.f163608h;
                        i2 = 5;
                    }
                }
                if (this.f163619s == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f163602b) < Math.abs(top - this.f163603c)) {
                        i = this.f163602b;
                    } else {
                        i = this.f163603c;
                    }
                } else {
                    i = this.f163603c;
                }
                i2 = 4;
            }
            if (this.f163607g.mo3022a((View) v, v.getLeft(), i)) {
                mo115293b(2);
                C0792v.m2750a(v, new RunnableC72910b(v, i2));
            } else {
                mo115293b(i2);
            }
            this.f163620t = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo115291a(View view, float f) {
        if (this.f163605e) {
            return true;
        }
        if (view.getTop() >= this.f163603c && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f163603c)) / ((float) this.f163616p) > 0.5f) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2518a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo2518a(coordinatorLayout, v, savedState.f3089d);
        if (savedState.f163628a == 1 || savedState.f163628a == 2) {
            this.f163606f = 4;
        } else {
            this.f163606f = savedState.f163628a;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: b */
    public final boolean mo2532b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f163606f == 1 && actionMasked == 0) {
            return true;
        }
        C0827a aVar = this.f163607g;
        if (aVar != null) {
            aVar.mo3026b(motionEvent);
        }
        if (actionMasked == 0) {
            m128740c();
        }
        if (this.f163621u == null) {
            this.f163621u = VelocityTracker.obtain();
        }
        this.f163621u.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f163618r && Math.abs(((float) this.f163622v) - motionEvent.getY()) > ((float) this.f163607g.f3066b)) {
            this.f163607g.mo3018a(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        if (!this.f163618r) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2524a(CoordinatorLayout coordinatorLayout, V v, int i) {
        Dialog dialog;
        int i2;
        if (C0792v.m2781o(coordinatorLayout) && !C0792v.m2781o(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        try {
            coordinatorLayout.mo2469a(v, i);
            this.f163608h = coordinatorLayout.getHeight();
            if (this.f163617q) {
                if (this.f163601a == 0) {
                    this.f163601a = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.hj);
                }
                i2 = Math.max(this.f163601a, this.f163608h - ((coordinatorLayout.getWidth() * 9) / 16));
            } else {
                i2 = this.f163616p;
            }
            int max = Math.max(0, this.f163608h - v.getHeight());
            this.f163602b = max;
            int max2 = Math.max(this.f163608h - i2, max);
            this.f163603c = max2;
            int i3 = this.f163606f;
            if (i3 == 3) {
                C0792v.m2767d(v, this.f163602b);
            } else if (this.f163604d && i3 == 5) {
                C0792v.m2767d(v, this.f163608h);
            } else if (i3 == 4) {
                C0792v.m2767d(v, max2);
            } else if (i3 == 1 || i3 == 2) {
                C0792v.m2767d(v, top - v.getTop());
            }
            if (this.f163607g == null) {
                this.f163607g = C0827a.m2924a(coordinatorLayout, this.f163623w);
            }
            this.f163609i = new WeakReference<>(v);
            this.f163610j = new WeakReference<>(mo115289a(v));
            return true;
        } catch (Exception e) {
            if (!(this.f163611k == null || (dialog = this.f163611k.get()) == null || !dialog.isShowing())) {
                dialog.dismiss();
            }
            C51423a.m95788a("", e);
            return true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2521a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == this.f163610j.get()) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                int i4 = this.f163602b;
                if (i3 < i4) {
                    iArr[1] = top - i4;
                    C0792v.m2767d(v, -iArr[1]);
                    mo115293b(3);
                } else {
                    iArr[1] = i2;
                    C0792v.m2767d(v, -i2);
                    mo115293b(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.f163603c;
                if (i3 <= i5 || this.f163604d) {
                    iArr[1] = i2;
                    C0792v.m2767d(v, -i2);
                    mo115293b(1);
                } else {
                    iArr[1] = top - i5;
                    C0792v.m2767d(v, -iArr[1]);
                    mo115293b(4);
                }
            }
            v.getTop();
            mo115292b();
            this.f163619s = i2;
            this.f163620t = true;
        }
    }
}
