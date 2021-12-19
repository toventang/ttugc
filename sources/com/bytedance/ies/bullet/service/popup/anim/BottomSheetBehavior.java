package com.bytedance.ies.bullet.service.popup.anim;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p037h.AbstractC0780j;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.popup.p1183b.C16936d;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0557b<V> {

    /* renamed from: A */
    private int f40211A;

    /* renamed from: B */
    private int f40212B;

    /* renamed from: C */
    private final C16936d.AbstractC16938a f40213C = new C16936d.AbstractC16938a() {
        /* class com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.C169203 */

        static {
            Covode.recordClassIndex(19361);
        }

        @Override // com.bytedance.ies.bullet.service.popup.p1183b.C16936d.AbstractC16938a
        /* renamed from: a */
        public final int mo26739a() {
            int i;
            int i2;
            if (BottomSheetBehavior.this.f40217d) {
                i = BottomSheetBehavior.this.f40220g;
                i2 = BottomSheetBehavior.this.f40215b;
            } else {
                i = BottomSheetBehavior.this.f40216c;
                i2 = BottomSheetBehavior.this.f40215b;
            }
            return i - i2;
        }

        @Override // com.bytedance.ies.bullet.service.popup.p1183b.C16936d.AbstractC16938a
        /* renamed from: a */
        public final int mo26740a(View view) {
            return view.getLeft();
        }

        @Override // com.bytedance.ies.bullet.service.popup.p1183b.C16936d.AbstractC16938a
        /* renamed from: a */
        public final void mo26741a(int i) {
            BottomSheetBehavior.this.mo26733e(i);
        }

        @Override // com.bytedance.ies.bullet.service.popup.p1183b.C16936d.AbstractC16938a
        /* renamed from: b */
        public final void mo26745b(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.mo26732d(1);
            }
        }

        @Override // com.bytedance.ies.bullet.service.popup.p1183b.C16936d.AbstractC16938a
        /* renamed from: c */
        public final int mo26746c(int i) {
            int i2;
            int i3 = BottomSheetBehavior.this.f40215b;
            if (BottomSheetBehavior.this.f40217d) {
                i2 = BottomSheetBehavior.this.f40220g;
            } else {
                i2 = BottomSheetBehavior.this.f40216c;
            }
            if (i < i3) {
                return i3;
            }
            if (i > i2) {
                return i2;
            }
            return i;
        }

        @Override // com.bytedance.ies.bullet.service.popup.p1183b.C16936d.AbstractC16938a
        /* renamed from: a */
        public final boolean mo26744a(View view, MotionEvent motionEvent) {
            if (view.getHeight() <= BottomSheetBehavior.this.f40214a && !BottomSheetBehavior.this.f40219f.mo26774a(view, 1, 1, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.ies.bullet.service.popup.p1183b.C16936d.AbstractC16938a
        /* renamed from: a */
        public final boolean mo26743a(View view, int i) {
            View view2;
            if (BottomSheetBehavior.this.f40218e == 1 || BottomSheetBehavior.this.f40225l) {
                return false;
            }
            if ((BottomSheetBehavior.this.f40218e != 3 || BottomSheetBehavior.this.f40224k != i || (view2 = BottomSheetBehavior.this.f40222i.get()) == null || !view2.canScrollVertically(-1)) && BottomSheetBehavior.this.f40221h != null && BottomSheetBehavior.this.f40221h.get() == view) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
            if (r8.getTop() < r7.f40244a.f40214a) goto L_0x0015;
         */
        @Override // com.bytedance.ies.bullet.service.popup.p1183b.C16936d.AbstractC16938a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo26742a(android.view.View r8, float r9) {
            /*
            // Method dump skipped, instructions count: 222
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.C169203.mo26742a(android.view.View, float):void");
        }
    };

    /* renamed from: a */
    public int f40214a;

    /* renamed from: b */
    public int f40215b;

    /* renamed from: c */
    public int f40216c;

    /* renamed from: d */
    public boolean f40217d;

    /* renamed from: e */
    public int f40218e = 4;

    /* renamed from: f */
    public C16936d f40219f;

    /* renamed from: g */
    public int f40220g;

    /* renamed from: h */
    public WeakReference<V> f40221h;

    /* renamed from: i */
    public WeakReference<View> f40222i;

    /* renamed from: j */
    public AbstractC16922a f40223j;

    /* renamed from: k */
    public int f40224k;

    /* renamed from: l */
    public boolean f40225l;

    /* renamed from: m */
    public int f40226m;

    /* renamed from: n */
    public int f40227n;

    /* renamed from: o */
    public boolean f40228o;

    /* renamed from: p */
    public boolean f40229p;

    /* renamed from: q */
    public boolean f40230q;

    /* renamed from: r */
    public ValueAnimator f40231r;

    /* renamed from: s */
    public boolean f40232s;

    /* renamed from: t */
    private float f40233t;

    /* renamed from: u */
    private boolean f40234u;

    /* renamed from: v */
    private int f40235v;

    /* renamed from: w */
    private boolean f40236w;

    /* renamed from: x */
    private VelocityTracker f40237x;

    /* renamed from: y */
    private int f40238y;

    /* renamed from: z */
    private int f40239z;

    /* renamed from: com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior$a */
    public static abstract class AbstractC16922a {
        static {
            Covode.recordClassIndex(19364);
        }

        /* renamed from: a */
        public abstract void mo26695a(View view, float f);

        /* renamed from: a */
        public abstract void mo26696a(View view, int i);

        public abstract void onEvent(String str);
    }

    static {
        Covode.recordClassIndex(19358);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2524a(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (C0792v.m2781o(coordinatorLayout) && !C0792v.m2781o(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        coordinatorLayout.mo2469a(v, i);
        int height = coordinatorLayout.getHeight();
        this.f40220g = height;
        int max = Math.max(0, height - v.getHeight());
        this.f40215b = max;
        int max2 = Math.max(this.f40220g - this.f40214a, max);
        this.f40216c = max2;
        int i2 = this.f40218e;
        if (i2 == 3) {
            C0792v.m2767d(v, this.f40215b);
        } else if (this.f40217d && i2 == 5) {
            C0792v.m2767d(v, this.f40220g);
        } else if (i2 == 4) {
            C0792v.m2767d(v, max2);
        } else if (i2 == 1 || i2 == 2) {
            C0792v.m2767d(v, top - v.getTop());
        }
        if (this.f40219f == null) {
            this.f40219f = new C16936d(coordinatorLayout.getContext(), coordinatorLayout, this.f40213C);
        }
        this.f40221h = new WeakReference<>(v);
        this.f40222i = new WeakReference<>(m31161b(v));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r6 != 3) goto L_0x0034;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2528a(androidx.coordinatorlayout.widget.CoordinatorLayout r17, V r18, android.view.MotionEvent r19) {
        /*
        // Method dump skipped, instructions count: 569
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.mo2528a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2530a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view == this.f40222i.get()) {
            return this.f40218e != 3 || super.mo2530a(coordinatorLayout, v, view, f, f2);
        }
        return false;
    }

    protected static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.SavedState.C169211 */

            static {
                Covode.recordClassIndex(19363);
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
        final int f40245a;

        static {
            Covode.recordClassIndex(19362);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f40245a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f40245a = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f40245a);
        }
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: b */
    private void m31162b() {
        this.f40224k = -1;
        VelocityTracker velocityTracker = this.f40237x;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f40237x = null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior$b */
    class RunnableC16923b implements Runnable {

        /* renamed from: b */
        private final View f40247b;

        /* renamed from: c */
        private final int f40248c;

        static {
            Covode.recordClassIndex(19365);
        }

        public final void run() {
            if (BottomSheetBehavior.this.f40219f != null) {
                C16936d dVar = BottomSheetBehavior.this.f40219f;
                if (dVar.f40280a == 2) {
                    boolean computeScrollOffset = dVar.f40292m.computeScrollOffset();
                    int currX = dVar.f40292m.getCurrX();
                    int currY = dVar.f40292m.getCurrY();
                    int left = currX - dVar.f40294o.getLeft();
                    int top = currY - dVar.f40294o.getTop();
                    if (left != 0) {
                        C0792v.m2769e(dVar.f40294o, left);
                    }
                    if (top != 0) {
                        C0792v.m2767d(dVar.f40294o, top);
                    }
                    if (!(left == 0 && top == 0)) {
                        dVar.f40293n.mo26741a(currY);
                    }
                    if (computeScrollOffset) {
                        if (currX == dVar.f40292m.getFinalX() && currY == dVar.f40292m.getFinalY()) {
                            dVar.f40292m.abortAnimation();
                        }
                    }
                    dVar.f40296q.post(dVar.f40297r);
                }
                if (dVar.f40280a == 2) {
                    C0792v.m2750a(this.f40247b, this);
                    return;
                }
            }
            BottomSheetBehavior.this.mo26732d(this.f40248c);
            if (BottomSheetBehavior.this.f40223j != null && !BottomSheetBehavior.this.f40232s) {
                if (BottomSheetBehavior.this.f40214a == BottomSheetBehavior.this.f40227n) {
                    BottomSheetBehavior.this.f40223j.onEvent("enterFullScreen");
                } else {
                    BottomSheetBehavior.this.f40223j.onEvent("enterHalfScreen");
                }
                BottomSheetBehavior.this.f40232s = true;
            }
        }

        RunnableC16923b(View view, int i) {
            this.f40247b = view;
            this.f40248c = i;
        }
    }

    /* renamed from: b */
    public final void mo26730b(int i) {
        this.f40214a = Math.max(0, i);
        this.f40216c = this.f40220g - i;
    }

    /* renamed from: d */
    public final void mo26732d(int i) {
        AbstractC16922a aVar;
        if (this.f40218e != i) {
            this.f40218e = i;
            V v = this.f40221h.get();
            if (v != null && (aVar = this.f40223j) != null) {
                aVar.mo26696a((View) v, i);
            }
        }
    }

    /* renamed from: a */
    public static <V extends View> BottomSheetBehavior<V> m31159a(V v) {
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
    private View m31161b(View view) {
        if (view instanceof AbstractC0780j) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View b = m31161b(viewGroup.getChildAt(i));
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo26733e(int i) {
        AbstractC16922a aVar;
        V v = this.f40221h.get();
        if (v != null && (aVar = this.f40223j) != null) {
            int i2 = this.f40216c;
            if (i > i2) {
                aVar.mo26695a(v, ((float) (i2 - i)) / ((float) this.f40214a));
            } else {
                aVar.mo26695a(v, ((float) (i2 - i)) / ((float) (i2 - this.f40215b)));
            }
        }
    }

    /* renamed from: c */
    public final void mo26731c(int i) {
        int i2;
        WeakReference<V> weakReference = this.f40221h;
        if (weakReference != null) {
            V v = weakReference.get();
            if (v != null) {
                if (i == 4) {
                    i2 = this.f40216c;
                } else if (i == 3) {
                    i2 = this.f40215b;
                } else if (!this.f40217d || i != 5) {
                    throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i)));
                } else {
                    i2 = this.f40220g;
                }
                mo26732d(2);
                if (this.f40219f.mo26773a(v, v.getLeft(), i2)) {
                    C0792v.m2750a(v, new RunnableC16923b(v, i));
                }
            }
        } else if (i == 4 || i == 3 || (this.f40217d && i == 5)) {
            this.f40218e = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2523a(int i) {
        this.f40235v = 0;
        this.f40236w = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final Parcelable mo2513a(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo2513a(coordinatorLayout, (View) v), this.f40218e);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k6, R.attr.k7, R.attr.k_, R.attr.ka});
        mo26730b(obtainStyledAttributes.getDimensionPixelSize(2, 0));
        this.f40217d = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        this.f40233t = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2516a(V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f40215b) {
            mo26732d(3);
        } else if (view == this.f40222i.get() && this.f40236w) {
            if (this.f40235v > 0) {
                i = this.f40215b;
            } else {
                if (this.f40217d) {
                    this.f40237x.computeCurrentVelocity(1000, this.f40233t);
                    if (mo26729a(v, this.f40237x.getYVelocity(this.f40224k))) {
                        i = this.f40220g;
                        i2 = 5;
                    }
                }
                if (this.f40235v == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f40215b) < Math.abs(top - this.f40216c)) {
                        i = this.f40215b;
                    } else {
                        i = this.f40216c;
                    }
                } else {
                    i = this.f40216c;
                }
                i2 = 4;
            }
            if (this.f40219f.mo26773a(v, v.getLeft(), i)) {
                mo26732d(2);
                C0792v.m2750a(v, new RunnableC16923b(v, i2));
            } else {
                mo26732d(i2);
            }
            this.f40236w = false;
        }
    }

    /* renamed from: a */
    public final boolean mo26729a(View view, float f) {
        if (view.getTop() >= this.f40216c && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f40216c)) / ((float) this.f40214a) > 0.5f) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2518a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo2518a(coordinatorLayout, v, savedState.getSuperState());
        if (savedState.f40245a == 1 || savedState.f40245a == 2) {
            this.f40218e = 4;
        } else {
            this.f40218e = savedState.f40245a;
        }
    }

    /* renamed from: a */
    private void m31160a(final CoordinatorLayout coordinatorLayout, final int i, long j) {
        if (this.f40231r == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(coordinatorLayout.getHeight(), i);
            this.f40231r = ofInt;
            ofInt.setInterpolator(new animationInterpolatorC16924a());
            this.f40231r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.C169181 */

                static {
                    Covode.recordClassIndex(19359);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    coordinatorLayout.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    coordinatorLayout.requestLayout();
                }
            });
            this.f40231r.addListener(new Animator.AnimatorListener() {
                /* class com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.C169192 */

                static {
                    Covode.recordClassIndex(19360);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    BottomSheetBehavior.this.f40231r = null;
                    int i = i;
                    if (i == 0) {
                        BottomSheetBehavior.this.mo26732d(5);
                        BottomSheetBehavior.this.f40228o = false;
                    } else if (i == BottomSheetBehavior.this.f40214a) {
                        BottomSheetBehavior.this.mo26732d(4);
                        if (BottomSheetBehavior.this.f40223j != null && !BottomSheetBehavior.this.f40232s) {
                            if (BottomSheetBehavior.this.f40214a == BottomSheetBehavior.this.f40227n) {
                                BottomSheetBehavior.this.f40223j.onEvent("enterFullScreen");
                            } else {
                                BottomSheetBehavior.this.f40223j.onEvent("enterHalfScreen");
                            }
                            BottomSheetBehavior.this.f40232s = true;
                        }
                    } else {
                        if (i == BottomSheetBehavior.this.f40227n && !BottomSheetBehavior.this.f40230q) {
                            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                            bottomSheetBehavior.f40214a = bottomSheetBehavior.f40227n;
                        }
                        if (BottomSheetBehavior.this.f40223j != null && !BottomSheetBehavior.this.f40232s) {
                            BottomSheetBehavior.this.f40223j.onEvent("enterFullScreen");
                            BottomSheetBehavior.this.f40232s = true;
                        }
                    }
                }
            });
            this.f40231r.setDuration(j);
            this.f40231r.start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00be, code lost:
        if (r8.f40282c == -1) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c0, code lost:
        r8.mo26775b();
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2532b(androidx.coordinatorlayout.widget.CoordinatorLayout r13, V r14, android.view.MotionEvent r15) {
        /*
        // Method dump skipped, instructions count: 792
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.mo2532b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2521a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == this.f40222i.get()) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                int i4 = this.f40215b;
                if (i3 < i4) {
                    iArr[1] = top - i4;
                    C0792v.m2767d(v, -iArr[1]);
                    mo26732d(3);
                } else {
                    iArr[1] = i2;
                    C0792v.m2767d(v, -i2);
                    mo26732d(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.f40216c;
                if (i3 <= i5 || this.f40217d) {
                    iArr[1] = i2;
                    C0792v.m2767d(v, -i2);
                    mo26732d(1);
                } else {
                    iArr[1] = top - i5;
                    C0792v.m2767d(v, -iArr[1]);
                    mo26732d(4);
                }
            }
            mo26733e(v.getTop());
            this.f40235v = i2;
            this.f40236w = true;
        }
    }
}
