package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.p037h.AbstractC0782l;
import androidx.core.p037h.AbstractC0786p;
import androidx.core.p037h.AbstractC0790t;
import androidx.core.p037h.C0726a;
import androidx.core.p037h.C0783m;
import androidx.core.p037h.C0787q;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.p038a.C0733d;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements AbstractC0782l, AbstractC0786p, AbstractC0790t {

    /* renamed from: w */
    private static final C0812a f2986w = new C0812a();

    /* renamed from: x */
    private static final int[] f2987x = {16843130};

    /* renamed from: A */
    private float f2988A;

    /* renamed from: B */
    private AbstractC0813b f2989B;

    /* renamed from: a */
    public OverScroller f2990a;

    /* renamed from: b */
    public boolean f2991b;

    /* renamed from: c */
    public boolean f2992c;

    /* renamed from: d */
    private long f2993d;

    /* renamed from: e */
    private final Rect f2994e;

    /* renamed from: f */
    private EdgeEffect f2995f;

    /* renamed from: g */
    private EdgeEffect f2996g;

    /* renamed from: h */
    private int f2997h;

    /* renamed from: i */
    private boolean f2998i;

    /* renamed from: j */
    private boolean f2999j;

    /* renamed from: k */
    private View f3000k;

    /* renamed from: l */
    private boolean f3001l;

    /* renamed from: m */
    private VelocityTracker f3002m;

    /* renamed from: n */
    private int f3003n;

    /* renamed from: o */
    private int f3004o;

    /* renamed from: p */
    private int f3005p;

    /* renamed from: q */
    private int f3006q;

    /* renamed from: r */
    private final int[] f3007r;

    /* renamed from: s */
    private final int[] f3008s;

    /* renamed from: t */
    private int f3009t;

    /* renamed from: u */
    private int f3010u;

    /* renamed from: v */
    private SavedState f3011v;

    /* renamed from: y */
    private final C0787q f3012y;

    /* renamed from: z */
    private final C0783m f3013z;

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface AbstractC0813b {
        static {
            Covode.recordClassIndex(896);
        }

        /* renamed from: a */
        void mo381a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: b */
    private static int m2845b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: a */
    public final boolean mo2474a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0812a extends C0726a {
        static {
            Covode.recordClassIndex(895);
        }

        C0812a() {
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final void mo2808a(View view, C0733d dVar) {
            int scrollRange;
            super.mo2808a(view, dVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            dVar.mo2834a((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                dVar.mo2844d(true);
                if (nestedScrollView.getScrollY() > 0) {
                    dVar.mo2833a(C0733d.C0734a.f2864n);
                    dVar.mo2833a(C0733d.C0734a.f2875y);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    dVar.mo2833a(C0733d.C0734a.f2863m);
                    dVar.mo2833a(C0733d.C0734a.f2840A);
                }
            }
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: d */
        public final void mo2813d(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.mo2813d(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            int scrollX = nestedScrollView.getScrollX();
            int i = Build.VERSION.SDK_INT;
            accessibilityEvent.setMaxScrollX(scrollX);
            int scrollRange = nestedScrollView.getScrollRange();
            int i2 = Build.VERSION.SDK_INT;
            accessibilityEvent.setMaxScrollY(scrollRange);
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final boolean mo2809a(View view, int i, Bundle bundle) {
            if (super.mo2809a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo2945a(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo2945a(0, min, true);
            return true;
        }
    }

    @Override // androidx.core.p037h.AbstractC0781k
    /* renamed from: a */
    public final void mo2900a(int i) {
        this.f3013z.mo2910b(i);
    }

    /* renamed from: a */
    private boolean m2841a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f3013z.mo2909a(i, i2, iArr, iArr2, i3);
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: a */
    public final void mo2471a(View view, int i, int i2, int i3, int i4, int i5) {
        m2833a(i4, i5, (int[]) null);
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: a */
    public final void mo2472a(View view, int i, int i2, int[] iArr, int i3) {
        m2841a(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: a */
    public final boolean mo2946a(KeyEvent keyEvent) {
        this.f2994e.setEmpty();
        int i = 130;
        if (!mo30035a()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                    return false;
                }
                return true;
            }
            return false;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    m2852d(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return m2856f(130);
                } else {
                    return m2854e(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return m2856f(33);
            } else {
                return m2854e(33);
            }
        }
    }

    /* renamed from: a */
    private boolean mo30036a(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i5 = i2 + 0;
        int i6 = i3 + i;
        int i7 = i4 + 0;
        if (i5 <= 0 && i5 >= 0) {
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i6 > i7) {
            i6 = i7;
        } else if (i6 < 0) {
            i6 = 0;
        } else {
            z2 = false;
            onOverScrolled(i5, i6, z, z2);
            return !z || z2;
        }
        z2 = true;
        if (!mo30041c(1)) {
            this.f2990a.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i5, i6, z, z2);
        if (!z) {
        }
    }

    /* renamed from: a */
    private boolean m2842a(View view) {
        return !m2843a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m2843a(View view, int i, int i2) {
        view.getDrawingRect(this.f2994e);
        offsetDescendantRectToMyCoords(view, this.f2994e);
        return this.f2994e.bottom + i >= getScrollY() && this.f2994e.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    public final void mo2945a(int i, int i2, boolean z) {
        m2847b(i - getScrollX(), i2 - getScrollY(), z);
    }

    /* renamed from: a */
    private static boolean m2844a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m2844a((View) parent, view2)) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int getNestedScrollAxes() {
        return this.f3012y.mo2913a();
    }

    public boolean hasNestedScrollingParent() {
        return mo30041c(0);
    }

    @Override // androidx.core.p037h.AbstractC0780j
    public boolean isNestedScrollingEnabled() {
        return this.f3013z.f2940a;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2999j = false;
    }

    public void requestLayout() {
        this.f2998i = true;
        super.requestLayout();
    }

    @Override // androidx.core.p037h.AbstractC0780j
    public void stopNestedScroll() {
        mo2900a(0);
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class androidx.core.widget.NestedScrollView.SavedState.C08111 */

            static {
                Covode.recordClassIndex(894);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        public int f3014a;

        static {
            Covode.recordClassIndex(893);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3014a + "}";
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f3014a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3014a);
        }
    }

    /* renamed from: c */
    private void m2849c() {
        VelocityTracker velocityTracker = this.f3002m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3002m = null;
        }
    }

    /* renamed from: d */
    private void m2851d() {
        this.f2990a.abortAnimation();
        mo2900a(1);
    }

    @Override // androidx.core.p037h.AbstractC0790t
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3014a = getScrollY();
        return savedState;
    }

    static {
        Covode.recordClassIndex(892);
    }

    /* renamed from: b */
    private void mo30039b() {
        if (this.f3002m == null) {
            this.f3002m = VelocityTracker.obtain();
        }
    }

    /* renamed from: e */
    private void m2853e() {
        this.f3001l = false;
        m2849c();
        mo2900a(0);
        EdgeEffect edgeEffect = this.f2995f;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f2996g.onRelease();
        }
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* renamed from: f */
    private void m2855f() {
        if (getOverScrollMode() == 2) {
            this.f2995f = null;
            this.f2996g = null;
        } else if (this.f2995f == null) {
            Context context = getContext();
            this.f2995f = new EdgeEffect(context);
            this.f2996g = new EdgeEffect(context);
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2988A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2988A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2988A;
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public void computeScroll() {
        if (!this.f2990a.isFinished()) {
            this.f2990a.computeScrollOffset();
            int currY = this.f2990a.getCurrY();
            int i = currY - this.f3010u;
            this.f3010u = currY;
            int[] iArr = this.f3008s;
            iArr[1] = 0;
            m2841a(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f3008s[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo30036a(i2, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f3008s;
                iArr2[1] = 0;
                m2834a(scrollY2, i3, this.f3007r, 1, iArr2);
                int i4 = i3 - this.f3008s[1];
                if (i4 != 0) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                        m2855f();
                        if (i4 < 0) {
                            if (this.f2995f.isFinished()) {
                                this.f2995f.onAbsorb((int) this.f2990a.getCurrVelocity());
                            }
                        } else if (this.f2996g.isFinished()) {
                            this.f2996g.onAbsorb((int) this.f2990a.getCurrVelocity());
                        }
                    }
                    m2851d();
                }
            }
            if (!this.f2990a.isFinished()) {
                C0792v.m2764c(this);
            } else {
                mo2900a(1);
            }
        }
    }

    /* renamed from: a */
    private boolean mo30035a() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    public void setOnScrollChangeListener(AbstractC0813b bVar) {
        this.f2989B = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2992c = z;
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private boolean mo30041c(int i) {
        return this.f3013z.mo2905a(i);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onStopNestedScroll(View view) {
        mo2476b(view, 0);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f3013z.mo2902a(z);
    }

    public boolean startNestedScroll(int i) {
        return m2838a(i, 0);
    }

    /* renamed from: g */
    private void m2857g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f2992c) {
            m2847b(0, i, false);
        } else {
            scrollBy(0, i);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || mo2946a(keyEvent)) {
            return true;
        }
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m2849c();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2991b) {
            this.f2991b = z;
            requestLayout();
        }
    }

    /* renamed from: a */
    private void m2836a(boolean z) {
        if (z) {
            m2838a(2, 1);
        } else {
            mo2900a(1);
        }
        this.f3010u = getScrollY();
        C0792v.m2764c(this);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3011v = savedState;
        requestLayout();
    }

    /* renamed from: b */
    private void m2848b(View view) {
        view.getDrawingRect(this.f2994e);
        offsetDescendantRectToMyCoords(view, this.f2994e);
        int a = m2831a(this.f2994e);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: a */
    private int m2831a(Rect rect) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i4 - verticalFadingEdgeLength;
        } else {
            i = i4;
        }
        if (rect.bottom > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i;
            }
            return Math.min(i3 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || rect.bottom >= i) {
            return 0;
        } else {
            if (rect.height() > height) {
                i2 = 0 - (i - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            return Math.max(i2, -getScrollY());
        }
    }

    /* renamed from: d */
    private boolean m2852d(int i) {
        boolean z;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        if (z) {
            this.f2994e.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.f2994e.top + height > bottom) {
                    this.f2994e.top = bottom - height;
                }
            }
        } else {
            this.f2994e.top = getScrollY() - height;
            if (this.f2994e.top < 0) {
                this.f2994e.top = 0;
            }
        }
        Rect rect = this.f2994e;
        rect.bottom = rect.top + height;
        return m2839a(i, this.f2994e.top, this.f2994e.bottom);
    }

    /* renamed from: e */
    private boolean m2854e(int i) {
        boolean z;
        int childCount;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        this.f2994e.top = 0;
        this.f2994e.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2994e.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect = this.f2994e;
            rect.top = rect.bottom - height;
        }
        return m2839a(i, this.f2994e.top, this.f2994e.bottom);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f3001l) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean m2856f(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m2843a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33) {
                if (getScrollY() < maxScrollAmount) {
                    maxScrollAmount = getScrollY();
                }
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2857g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f2994e);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2994e);
            m2857g(m2831a(this.f2994e));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m2842a(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* renamed from: b */
    public void mo2951b(int i) {
        if (getChildCount() > 0) {
            this.f2990a.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m2836a(true);
        }
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f2995f != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f2995f.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f2995f.setSize(width, height);
                if (this.f2995f.draw(canvas)) {
                    C0792v.m2764c(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f2996g.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f2996g.setSize(width2, height2);
                if (this.f2996g.draw(canvas)) {
                    C0792v.m2764c(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction();
        if (action == 2 && this.f3001l) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f3006q;
                    if (!(i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) == -1)) {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y - this.f2997h) > this.f3003n && (2 & getNestedScrollAxes()) == 0) {
                            this.f3001l = true;
                            this.f2997h = y;
                            mo30039b();
                            this.f3002m.addMovement(motionEvent);
                            this.f3009t = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        mo30037a(motionEvent);
                    }
                }
            }
            this.f3001l = false;
            this.f3006q = -1;
            m2849c();
            if (this.f2990a.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C0792v.m2764c(this);
            }
            mo2900a(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.f2997h = y2;
                    this.f3006q = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.f3002m;
                    if (velocityTracker == null) {
                        this.f3002m = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.f3002m.addMovement(motionEvent);
                    this.f2990a.computeScrollOffset();
                    this.f3001l = !this.f2990a.isFinished();
                    m2838a(2, 0);
                }
            }
            this.f3001l = false;
            m2849c();
        }
        return this.f3001l;
    }

    /* renamed from: a */
    private void mo30037a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3006q) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f2997h = (int) motionEvent.getY(i);
            this.f3006q = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3002m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z;
        mo30039b();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3009t = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.f3009t);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f3002m;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f3005p);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f3006q);
                if (Math.abs(yVelocity) >= this.f3004o) {
                    int i = -yVelocity;
                    float f = (float) i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        mo2951b(i);
                    }
                } else if (this.f2990a.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0792v.m2764c(this);
                }
                this.f3006q = -1;
                m2853e();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f3006q);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.f2997h - y;
                    if (!this.f3001l && Math.abs(i2) > this.f3003n) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f3001l = true;
                        i2 = i2 > 0 ? i2 - this.f3003n : i2 + this.f3003n;
                    }
                    if (this.f3001l) {
                        if (m2841a(0, i2, this.f3008s, this.f3007r, 0)) {
                            i2 -= this.f3008s[1];
                            this.f3009t += this.f3007r[1];
                        }
                        this.f2997h = y - this.f3007r[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (mo30036a(i2, 0, getScrollY(), scrollRange) && !mo30041c(0)) {
                            this.f3002m.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.f3008s;
                        iArr[1] = 0;
                        m2834a(scrollY2, i2 - scrollY2, this.f3007r, 0, iArr);
                        int i3 = this.f2997h;
                        int[] iArr2 = this.f3007r;
                        this.f2997h = i3 - iArr2[1];
                        this.f3009t += iArr2[1];
                        if (z) {
                            int i4 = i2 - this.f3008s[1];
                            m2855f();
                            int i5 = scrollY + i4;
                            if (i5 < 0) {
                                C0819d.m2889a(this.f2995f, ((float) i4) / ((float) getHeight()), motionEvent.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.f2996g.isFinished()) {
                                    this.f2996g.onRelease();
                                }
                            } else if (i5 > scrollRange) {
                                C0819d.m2889a(this.f2996g, ((float) i4) / ((float) getHeight()), 1.0f - (motionEvent.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.f2995f.isFinished()) {
                                    this.f2995f.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f2995f;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f2996g.isFinished())) {
                                C0792v.m2764c(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f3001l && getChildCount() > 0 && this.f2990a.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0792v.m2764c(this);
                }
                this.f3006q = -1;
                m2853e();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2997h = (int) motionEvent.getY(actionIndex);
                this.f3006q = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                mo30037a(motionEvent);
                this.f2997h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f3006q));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.f2990a.isFinished();
            this.f3001l = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f2990a.isFinished()) {
                m2851d();
            }
            this.f2997h = (int) motionEvent.getY();
            this.f3006q = motionEvent.getPointerId(0);
            m2838a(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f3002m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: a */
    private boolean m2838a(int i, int i2) {
        return this.f3013z.mo2906a(i, i2);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3013z.mo2903a(f, f2);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2998i) {
            m2848b(view2);
        } else {
            this.f3000k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect != null && !m2842a(findNextFocusFromRect)) {
            return findNextFocusFromRect.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2991b && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int b = m2845b(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int b2 = m2845b(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: b */
    public final void mo2476b(View view, int i) {
        this.f3012y.mo2914a(i);
        mo2900a(i);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3013z.mo2904a(f, f2, z);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo2477b(view, view2, i, 0);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo2474a(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* renamed from: a */
    private void m2833a(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3013z.mo2901a(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a = m2831a(rect);
        if (a == 0) {
            return false;
        }
        if (z) {
            scrollBy(0, a);
            return true;
        }
        m2847b(0, a, false);
        return true;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.f2994e = new Rect();
        this.f2998i = true;
        this.f2999j = false;
        this.f3000k = null;
        this.f3001l = false;
        this.f2992c = true;
        this.f3006q = -1;
        this.f3007r = new int[2];
        this.f3008s = new int[2];
        this.f2990a = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3003n = viewConfiguration.getScaledTouchSlop();
        this.f3004o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3005p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2987x, 0, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3012y = new C0787q();
        this.f3013z = new C0783m(this);
        setNestedScrollingEnabled(true);
        C0792v.m2747a(this, f2986w);
    }

    /* renamed from: b */
    private void m2847b(int i, int i2, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2993d > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f2990a;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
                m2836a(z);
            } else {
                if (!this.f2990a.isFinished()) {
                    m2851d();
                }
                scrollBy(i, i2);
            }
            this.f2993d = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: a */
    private View m2832a(boolean z, int i, int i2) {
        boolean z2;
        boolean z3;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                if (i >= top || bottom >= i2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (view == null) {
                    view = view2;
                    z4 = z2;
                } else {
                    if (!z ? bottom <= view.getBottom() : top >= view.getTop()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z4) {
                        if (z2) {
                            if (!z3) {
                            }
                        }
                    } else if (z2) {
                        view = view2;
                        z4 = true;
                    } else if (!z3) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private boolean m2839a(int i, int i2, int i3) {
        boolean z;
        int i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        View a = m2832a(z, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i5) {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            m2857g(i4);
            z2 = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z2;
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m2841a(i, i2, iArr, iArr2, 0);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo2951b((int) f2);
        return true;
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo2472a(view, i, i2, iArr, 0);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        AbstractC0813b bVar = this.f2989B;
        if (bVar != null) {
            bVar.mo381a(this, i, i2, i3, i4);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m2843a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f2994e);
            offsetDescendantRectToMyCoords(findFocus, this.f2994e);
            m2857g(m2831a(this.f2994e));
        }
    }

    @Override // androidx.core.p037h.AbstractC0785o
    /* renamed from: b */
    public final void mo2477b(View view, View view2, int i, int i2) {
        this.f3012y.mo2915a(i, i2);
        m2838a(2, i2);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m2833a(i4, 0, (int[]) null);
    }

    /* renamed from: a */
    private void m2834a(int i, int i2, int[] iArr, int i3, int[] iArr2) {
        this.f3013z.mo2901a(0, i, 0, i2, iArr, i3, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f3013z.mo2907a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f2998i = false;
        View view = this.f3000k;
        if (view != null && m2844a(view, this)) {
            m2848b(this.f3000k);
        }
        this.f3000k = null;
        if (!this.f2999j) {
            if (this.f3011v != null) {
                scrollTo(getScrollX(), this.f3011v.f3014a);
                this.f3011v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int b = m2845b(scrollY, paddingTop, i5);
            if (b != scrollY) {
                scrollTo(getScrollX(), b);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2999j = true;
    }

    @Override // androidx.core.p037h.AbstractC0786p
    /* renamed from: a */
    public final void mo2912a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m2833a(i4, i5, iArr);
    }
}
