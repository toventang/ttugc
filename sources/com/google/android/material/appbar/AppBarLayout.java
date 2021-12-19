package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p030b.C0622a;
import androidx.core.p036g.C0691d;
import androidx.core.p037h.AbstractC0780j;
import androidx.core.p037h.AbstractC0788r;
import androidx.core.p037h.C0753ad;
import androidx.core.p037h.C0792v;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.internal.C26685k;
import com.google.android.material.p1951a.C26555a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@CoordinatorLayout.AbstractC0558c(mo2534a = Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: a */
    private int f62677a = -1;

    /* renamed from: b */
    public boolean f62678b;

    /* renamed from: c */
    int f62679c;

    /* renamed from: d */
    C0753ad f62680d;

    /* renamed from: e */
    List<AbstractC26569a> f62681e;

    /* renamed from: f */
    public boolean f62682f;

    /* renamed from: g */
    private int f62683g = -1;

    /* renamed from: h */
    private int f62684h = -1;

    /* renamed from: i */
    private boolean f62685i;

    /* renamed from: j */
    private boolean f62686j;

    /* renamed from: k */
    private boolean f62687k;

    /* renamed from: l */
    private int[] f62688l;

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public interface AbstractC26569a<T extends AppBarLayout> {
        static {
            Covode.recordClassIndex(32005);
        }

        /* renamed from: a */
        void mo15197a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface AbstractC26571c extends AbstractC26569a<AppBarLayout> {
        static {
            Covode.recordClassIndex(32007);
        }
    }

    static {
        Covode.recordClassIndex(31996);
    }

    public float getTargetElevation() {
        return 0.0f;
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        static {
            Covode.recordClassIndex(32003);
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.C26579c
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ int mo43755c() {
            return super.mo43755c();
        }

        @Override // com.google.android.material.appbar.C26579c
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ boolean mo43754b(int i) {
            return super.mo43754b(i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo43743a(BaseBehavior.AbstractC26568a aVar) {
            super.mo43743a(aVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Parcelable mo43741a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo2513a(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo43742a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo2518a(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo43744a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.mo2524a(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo31001a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo2519a(coordinatorLayout, appBarLayout, view, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo43745a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo2525a(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo31004a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.mo2531a(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo31003a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo2522a(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo31002a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            super.mo2520a(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5);
        }
    }

    public static class ScrollingViewBehavior extends AbstractC26578b {
        static {
            Covode.recordClassIndex(32004);
        }

        public ScrollingViewBehavior() {
        }

        @Override // com.google.android.material.appbar.C26579c
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ int mo43755c() {
            return super.mo43755c();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC26578b
        /* renamed from: a */
        public final /* synthetic */ View mo43757a(List list) {
            return m52644b(list);
        }

        @Override // com.google.android.material.appbar.C26579c
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ boolean mo43754b(int i) {
            return super.mo43754b(i);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC26578b
        /* renamed from: b */
        public final int mo43758b(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo43758b(view);
        }

        /* renamed from: b */
        private static AppBarLayout m52644b(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC26578b
        /* renamed from: a */
        public final float mo43756a(View view) {
            int i;
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.AbstractC0557b bVar = ((CoordinatorLayout.C0560e) appBarLayout.getLayoutParams()).f2416a;
                if (bVar instanceof BaseBehavior) {
                    i = ((BaseBehavior) bVar).mo43746b();
                } else {
                    i = 0;
                }
                if ((downNestedPreScrollRange == 0 || totalScrollRange + i > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) i) / ((float) i2)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k9});
            this.f62747d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
        /* renamed from: a */
        public final boolean mo2529a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // com.google.android.material.appbar.C26579c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo2524a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo2524a(coordinatorLayout, view, i);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
        /* renamed from: b */
        public boolean mo2533b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z;
            CoordinatorLayout.AbstractC0557b bVar = ((CoordinatorLayout.C0560e) view2.getLayoutParams()).f2416a;
            if (bVar instanceof BaseBehavior) {
                C0792v.m2767d(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bVar).f62690a) + ((AbstractC26578b) this).f62746c) - mo43820c(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f62682f) {
                    if (view.getScrollY() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    appBarLayout.mo43719a(z);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
        /* renamed from: a */
        public final boolean mo2527a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout b = m52644b(coordinatorLayout.mo2475b(view));
            if (b != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f62744a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    b.mo43718a(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.AbstractC26578b, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo2525a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo2525a(coordinatorLayout, view, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f62679c;
    }

    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC26576a<T> {

        /* renamed from: a */
        public int f62690a;

        /* renamed from: c */
        private int f62691c;

        /* renamed from: d */
        private ValueAnimator f62692d;

        /* renamed from: e */
        private int f62693e = -1;

        /* renamed from: f */
        private boolean f62694f;

        /* renamed from: g */
        private float f62695g;

        /* renamed from: h */
        private WeakReference<View> f62696h;

        /* renamed from: i */
        private AbstractC26568a f62697i;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public static abstract class AbstractC26568a<T extends AppBarLayout> {
            static {
                Covode.recordClassIndex(32002);
            }

            /* renamed from: a */
            public abstract boolean mo31005a(T t);
        }

        static {
            Covode.recordClassIndex(31998);
        }

        /* renamed from: a */
        private static boolean m52604a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: a */
        public boolean mo2531a(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            boolean z = true;
            if ((i & 2) == 0 || (!t.f62682f && (t.getTotalScrollRange() == 0 || coordinatorLayout.getHeight() - view.getHeight() > t.getHeight()))) {
                z = false;
            } else {
                ValueAnimator valueAnimator = this.f62692d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.f62696h = null;
            this.f62691c = i2;
            return z;
        }

        /* renamed from: a */
        public void mo2522a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -t.getTotalScrollRange();
                    i5 = t.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                if (i4 != i5) {
                    iArr[1] = mo43817b(coordinatorLayout, t, i2, i4, i5);
                    m52602a(i2, t, view, i3);
                }
            }
        }

        /* renamed from: a */
        public void mo2520a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                mo43817b(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
                m52602a(i4, t, view, i5);
            }
            if (t.f62682f) {
                t.mo43719a(view.getScrollY() > 0);
            }
        }

        /* renamed from: a */
        public void mo2519a(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f62691c == 0 || i == 1) {
                mo43748b(coordinatorLayout, (AppBarLayout) t);
            }
            this.f62696h = new WeakReference<>(view);
        }

        /* renamed from: a */
        public boolean mo2525a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C0560e) t.getLayoutParams()).height != -2) {
                return super.mo2525a(coordinatorLayout, (View) t, i, i2, i3, i4);
            }
            coordinatorLayout.mo2470a(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean mo2524a(CoordinatorLayout coordinatorLayout, T t, int i) {
            int round;
            boolean a = super.mo2524a(coordinatorLayout, (View) t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.f62693e;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                int i3 = -childAt.getBottom();
                if (this.f62694f) {
                    round = C0792v.m2775i(childAt) + t.getTopInset();
                } else {
                    round = Math.round(((float) childAt.getHeight()) * this.f62695g);
                }
                mo43816b(coordinatorLayout, (View) t, i3 + round);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m52607b(coordinatorLayout, (AppBarLayout) t, i4);
                    } else {
                        mo43816b(coordinatorLayout, (View) t, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m52607b(coordinatorLayout, (AppBarLayout) t, 0);
                    } else {
                        mo43816b(coordinatorLayout, (View) t, 0);
                    }
                }
            }
            t.f62679c = 0;
            this.f62693e = -1;
            mo43754b(C0622a.m2312a(mo43755c(), -t.getTotalScrollRange(), 0));
            m52603a(coordinatorLayout, (AppBarLayout) t, mo43755c(), 0, true);
            t.mo43716a(mo43755c());
            return a;
        }

        /* renamed from: a */
        public void mo2518a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo2518a(coordinatorLayout, (View) t, savedState.f3089d);
                this.f62693e = savedState.f62701a;
                this.f62695g = savedState.f62702b;
                this.f62694f = savedState.f62703e;
                return;
            }
            super.mo2518a(coordinatorLayout, (View) t, parcelable);
            this.f62693e = -1;
        }

        public BaseBehavior() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC26576a
        /* renamed from: b */
        public final int mo43746b() {
            return mo43755c() + this.f62690a;
        }

        /* access modifiers changed from: protected */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
                /* class com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.C265671 */

                static {
                    Covode.recordClassIndex(32001);
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
            int f62701a;

            /* renamed from: b */
            float f62702b;

            /* renamed from: e */
            boolean f62703e;

            static {
                Covode.recordClassIndex(32000);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z;
                this.f62701a = parcel.readInt();
                this.f62702b = parcel.readFloat();
                if (parcel.readByte() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f62703e = z;
            }

            @Override // androidx.customview.view.AbsSavedState
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f62701a);
                parcel.writeFloat(this.f62702b);
                parcel.writeByte(this.f62703e ? (byte) 1 : 0);
            }
        }

        /* renamed from: a */
        public void mo43743a(AbstractC26568a aVar) {
            this.f62697i = aVar;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC26576a
        /* renamed from: a */
        public final /* synthetic */ int mo43739a(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC26576a
        /* renamed from: b */
        public final /* synthetic */ int mo43747b(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        /* renamed from: a */
        private static View m52601a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt instanceof AbstractC0780j) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC26576a
        /* renamed from: c */
        public final /* synthetic */ boolean mo43749c(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbstractC26568a aVar = this.f62697i;
            if (aVar != 0) {
                return aVar.mo31005a(appBarLayout);
            }
            WeakReference<View> weakReference = this.f62696h;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            if (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        private static int m52600a(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C26570b bVar = (C26570b) childAt.getLayoutParams();
                if (m52604a(bVar.f62704a, 32)) {
                    top -= bVar.topMargin;
                    bottom += bVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: b */
        private static View m52605b(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: c */
        private static boolean m52608c(CoordinatorLayout coordinatorLayout, T t) {
            List<View> c = coordinatorLayout.mo2478c(t);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.AbstractC0557b bVar = ((CoordinatorLayout.C0560e) c.get(i).getLayoutParams()).f2416a;
                if (bVar instanceof ScrollingViewBehavior) {
                    if (((AbstractC26578b) bVar).f62747d != 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void mo43748b(CoordinatorLayout coordinatorLayout, T t) {
            int b = mo43746b();
            int a = m52600a((AppBarLayout) t, b);
            if (a >= 0) {
                View childAt = t.getChildAt(a);
                C26570b bVar = (C26570b) childAt.getLayoutParams();
                int i = bVar.f62704a;
                if ((i & 17) == 17) {
                    int i2 = -childAt.getTop();
                    int i3 = -childAt.getBottom();
                    if (a == t.getChildCount() - 1) {
                        i3 += t.getTopInset();
                    }
                    if (m52604a(i, 2)) {
                        i3 += C0792v.m2775i(childAt);
                    } else if (m52604a(i, 5)) {
                        int i4 = C0792v.m2775i(childAt) + i3;
                        if (b < i4) {
                            i2 = i4;
                        } else {
                            i3 = i4;
                        }
                    }
                    if (m52604a(i, 32)) {
                        i2 += bVar.topMargin;
                        i3 -= bVar.bottomMargin;
                    }
                    if (b < (i3 + i2) / 2) {
                        i2 = i3;
                    }
                    m52607b(coordinatorLayout, (AppBarLayout) t, C0622a.m2312a(i2, -t.getTotalScrollRange(), 0));
                }
            }
        }

        /* renamed from: a */
        public Parcelable mo2513a(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable a = super.mo2513a(coordinatorLayout, (View) t);
            int c = mo43755c();
            int childCount = t.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + c;
                if (childAt.getTop() + c <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(a);
                    savedState.f62701a = i;
                    if (bottom == C0792v.m2775i(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    savedState.f62703e = z;
                    savedState.f62702b = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return a;
        }

        /* renamed from: b */
        private void m52607b(final CoordinatorLayout coordinatorLayout, final T t, int i) {
            int height;
            int abs = Math.abs(mo43746b() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            int b = mo43746b();
            if (b == i) {
                ValueAnimator valueAnimator = this.f62692d;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f62692d.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f62692d;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f62692d = valueAnimator3;
                valueAnimator3.setInterpolator(C26555a.f62659e);
                this.f62692d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.google.android.material.appbar.AppBarLayout.BaseBehavior.C265661 */

                    static {
                        Covode.recordClassIndex(31999);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseBehavior.this.mo43816b(coordinatorLayout, (View) t, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.f62692d.setDuration((long) Math.min(height, 600));
            this.f62692d.setIntValues(b, i);
            this.f62692d.start();
        }

        /* renamed from: a */
        private void m52602a(int i, T t, View view, int i2) {
            if (i2 == 1) {
                int b = mo43746b();
                if (i < 0) {
                    if (b != 0) {
                        return;
                    }
                } else if (i <= 0 || b != (-t.getDownNestedScrollRange())) {
                    return;
                }
                C0792v.m2787u(view);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void m52603a(androidx.coordinatorlayout.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
            // Method dump skipped, instructions count: 105
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m52603a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC26576a
        /* renamed from: a */
        public final /* synthetic */ int mo43740a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int b = mo43746b();
            if (i2 == 0 || b < i2 || b > i3) {
                this.f62690a = 0;
                return 0;
            }
            int a = C0622a.m2312a(i, i2, i3);
            if (b == a) {
                return 0;
            }
            if (appBarLayout.f62678b) {
                int abs = Math.abs(a);
                int childCount = appBarLayout.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt = appBarLayout.getChildAt(i7);
                    C26570b bVar = (C26570b) childAt.getLayoutParams();
                    Interpolator interpolator = bVar.f62705b;
                    if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                        i7++;
                    } else if (interpolator != null) {
                        int i8 = bVar.f62704a;
                        if ((i8 & 1) != 0) {
                            i6 = childAt.getHeight() + bVar.topMargin + bVar.bottomMargin + 0;
                            if ((i8 & 2) != 0) {
                                i6 -= C0792v.m2775i(childAt);
                            }
                        } else {
                            i6 = 0;
                        }
                        if (C0792v.m2781o(childAt)) {
                            i6 -= appBarLayout.getTopInset();
                        }
                        if (i6 > 0) {
                            float f = (float) i6;
                            i4 = Integer.signum(a) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                        }
                    }
                }
            }
            i4 = a;
            boolean b2 = mo43754b(i4);
            int i9 = b - a;
            this.f62690a = a - i4;
            if (!b2 && appBarLayout.f62678b) {
                coordinatorLayout.mo2468a(appBarLayout);
            }
            appBarLayout.mo43716a(mo43755c());
            if (a < b) {
                i5 = -1;
            } else {
                i5 = 1;
            }
            m52603a(coordinatorLayout, appBarLayout, a, i5, false);
            return i9;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43715a() {
        this.f62677a = -1;
        this.f62683g = -1;
        this.f62684h = -1;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public static class C26570b extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f62704a = 1;

        /* renamed from: b */
        public Interpolator f62705b;

        static {
            Covode.recordClassIndex(32006);
        }

        public C26570b() {
            super(-1, -2);
        }

        public C26570b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C26570b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C26570b(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C26570b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            MethodCollector.m26663i(11278);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a1l, R.attr.a1m});
            this.f62704a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f62705b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
            MethodCollector.m26664o(11278);
        }
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        C0753ad adVar = this.f62680d;
        if (adVar != null) {
            return adVar.mo2867b();
        }
        return 0;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int childCount;
        int topInset = getTopInset();
        int i = C0792v.m2775i(this);
        if (i == 0 && ((childCount = getChildCount()) <= 0 || (i = C0792v.m2775i(getChildAt(childCount - 1))) == 0)) {
            return getHeight() / 3;
        }
        return (i * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int topInset;
        int i = this.f62683g;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C26570b bVar = (C26570b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = bVar.f62704a;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                int i4 = i2 + bVar.topMargin + bVar.bottomMargin;
                if ((i3 & 8) != 0) {
                    i2 = i4 + C0792v.m2775i(childAt);
                } else {
                    if ((i3 & 2) != 0) {
                        topInset = C0792v.m2775i(childAt);
                    } else {
                        topInset = getTopInset();
                    }
                    i2 = i4 + (measuredHeight - topInset);
                }
            }
        }
        int max = Math.max(0, i2);
        this.f62683g = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.f62684h;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C26570b bVar = (C26570b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin;
            int i4 = bVar.f62704a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C0792v.m2775i(childAt) + getTopInset();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f62684h = max;
        return max;
    }

    public final int getTotalScrollRange() {
        int i = this.f62677a;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C26570b bVar = (C26570b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = bVar.f62704a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + bVar.topMargin + bVar.bottomMargin;
            if ((i4 & 2) != 0) {
                i3 -= C0792v.m2775i(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3 - getTopInset());
        this.f62677a = max;
        return max;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C26570b;
    }

    public void setLiftOnScroll(boolean z) {
        this.f62682f = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C26570b generateLayoutParams(AttributeSet attributeSet) {
        return new C26570b(getContext(), attributeSet);
    }

    public void setExpanded(boolean z) {
        mo43718a(z, C0792v.m2788v(this), true);
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C26581e.m52691a(this, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43716a(int i) {
        List<AbstractC26569a> list = this.f62681e;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC26569a aVar = this.f62681e.get(i2);
                if (aVar != null) {
                    aVar.mo15197a(this, i);
                }
            }
        }
    }

    /* renamed from: a */
    private static C26570b m52593a(ViewGroup.LayoutParams layoutParams) {
        int i = Build.VERSION.SDK_INT;
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C26570b((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C26570b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C26570b(layoutParams);
    }

    /* renamed from: a */
    public final void mo43717a(AbstractC26569a aVar) {
        if (this.f62681e == null) {
            this.f62681e = new ArrayList();
        }
        if (aVar != null && !this.f62681e.contains(aVar)) {
            this.f62681e.add(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.f62688l == null) {
            this.f62688l = new int[4];
        }
        int[] iArr = this.f62688l;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f62686j;
        if (z) {
            i2 = R.attr.afg;
        } else {
            i2 = -2130970173;
        }
        iArr[0] = i2;
        if (!z || !this.f62687k) {
            i3 = -2130970174;
        } else {
            i3 = R.attr.afh;
        }
        iArr[1] = i3;
        if (z) {
            i4 = R.attr.aff;
        } else {
            i4 = -2130970172;
        }
        iArr[2] = i4;
        if (!z || !this.f62687k) {
            i5 = -2130970171;
        } else {
            i5 = R.attr.afe;
        }
        iArr[3] = i5;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo43719a(boolean z) {
        if (this.f62687k == z) {
            return false;
        }
        this.f62687k = z;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(12581);
        super.onMeasure(i, i2);
        mo43715a();
        MethodCollector.m26664o(12581);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(12580);
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
            try {
                Context context2 = getContext();
                TypedArray a = C26685k.m52976a(context2, attributeSet, C26581e.f62756a, 0, R.style.qu, new int[0]);
                try {
                    if (a.hasValue(0)) {
                        setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, a.getResourceId(0, 0)));
                    }
                    a.recycle();
                } catch (Throwable th) {
                    a.recycle();
                    MethodCollector.m26664o(12580);
                    throw th;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        TypedArray a2 = C26685k.m52976a(context, attributeSet, new int[]{16842964, 16843919, 16844096, R.attr.sf, R.attr.ta, R.attr.a2c}, 0, R.style.qu, new int[0]);
        C0792v.m2746a(this, a2.getDrawable(0));
        if (a2.hasValue(4)) {
            mo43718a(a2.getBoolean(4, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && a2.hasValue(3)) {
            C26581e.m52691a(this, (float) a2.getDimensionPixelSize(3, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (a2.hasValue(2)) {
                setKeyboardNavigationCluster(a2.getBoolean(2, false));
            }
            if (a2.hasValue(1)) {
                setTouchscreenBlocksFocus(a2.getBoolean(1, false));
            }
        }
        this.f62682f = a2.getBoolean(5, false);
        a2.recycle();
        C0792v.m2748a(this, new AbstractC0788r() {
            /* class com.google.android.material.appbar.AppBarLayout.C265651 */

            static {
                Covode.recordClassIndex(31997);
            }

            @Override // androidx.core.p037h.AbstractC0788r
            /* renamed from: a */
            public final C0753ad mo553a(View view, C0753ad adVar) {
                C0753ad adVar2;
                AppBarLayout appBarLayout = AppBarLayout.this;
                if (C0792v.m2781o(appBarLayout)) {
                    adVar2 = adVar;
                } else {
                    adVar2 = null;
                }
                if (!C0691d.m2448a(appBarLayout.f62680d, adVar2)) {
                    appBarLayout.f62680d = adVar2;
                    appBarLayout.mo43715a();
                }
                return adVar;
            }
        });
        MethodCollector.m26664o(12580);
    }

    /* renamed from: a */
    public final void mo43718a(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.f62679c = i4 | i3;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(10653);
        super.onLayout(z, i, i2, i3, i4);
        mo43715a();
        boolean z2 = false;
        this.f62678b = false;
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            } else if (((C26570b) getChildAt(i5).getLayoutParams()).f62705b != null) {
                this.f62678b = true;
                break;
            } else {
                i5++;
            }
        }
        if (!this.f62685i) {
            if (!this.f62682f) {
                int childCount2 = getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount2) {
                        break;
                    }
                    C26570b bVar = (C26570b) getChildAt(i6).getLayoutParams();
                    if ((bVar.f62704a & 1) == 1 && (bVar.f62704a & 10) != 0) {
                        break;
                    }
                    i6++;
                }
            }
            z2 = true;
            if (this.f62686j != z2) {
                this.f62686j = z2;
                refreshDrawableState();
            }
        }
        MethodCollector.m26664o(10653);
    }
}
