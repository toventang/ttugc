package com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p030b.C0622a;
import androidx.core.p037h.C0792v;
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.C34621a;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37979c;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38615aa;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior */
public class AdPopUpWebBottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0557b<V> {

    /* renamed from: A */
    private VelocityTracker f89566A;

    /* renamed from: B */
    private int f89567B;

    /* renamed from: C */
    private boolean f89568C;

    /* renamed from: D */
    private final C37979c.AbstractC37982a f89569D = new C37979c.AbstractC37982a() {
        /* class com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.C379262 */

        static {
            Covode.recordClassIndex(45379);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37979c.AbstractC37982a
        /* renamed from: a */
        public final int mo66051a() {
            int i;
            int i2;
            if (AdPopUpWebBottomSheetBehavior.this.f89573d) {
                i = AdPopUpWebBottomSheetBehavior.this.f89577h;
                i2 = AdPopUpWebBottomSheetBehavior.this.f89571b;
            } else {
                i = AdPopUpWebBottomSheetBehavior.this.f89572c;
                i2 = AdPopUpWebBottomSheetBehavior.this.f89571b;
            }
            return i - i2;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37979c.AbstractC37982a
        /* renamed from: b */
        public final int mo66056b() {
            int i;
            int i2;
            if (AdPopUpWebBottomSheetBehavior.this.f89573d) {
                i = AdPopUpWebBottomSheetBehavior.this.f89577h;
                i2 = AdPopUpWebBottomSheetBehavior.this.f89571b;
            } else {
                i = AdPopUpWebBottomSheetBehavior.this.f89572c;
                i2 = AdPopUpWebBottomSheetBehavior.this.f89571b;
            }
            return i - i2;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37979c.AbstractC37982a
        /* renamed from: a */
        public final int mo66052a(View view) {
            return view.getLeft();
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37979c.AbstractC37982a
        /* renamed from: a */
        public final void mo66053a(int i) {
            AdPopUpWebBottomSheetBehavior.this.mo66049e(i);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37979c.AbstractC37982a
        /* renamed from: b */
        public final void mo66057b(int i) {
            if (i == 1) {
                AdPopUpWebBottomSheetBehavior.this.mo66048d(1);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37979c.AbstractC37982a
        /* renamed from: c */
        public final int mo66058c(int i) {
            int i2;
            int i3 = AdPopUpWebBottomSheetBehavior.this.f89571b;
            if (AdPopUpWebBottomSheetBehavior.this.f89573d) {
                i2 = AdPopUpWebBottomSheetBehavior.this.f89577h;
            } else {
                i2 = AdPopUpWebBottomSheetBehavior.this.f89572c;
            }
            return C0622a.m2312a(i, i3, i2);
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37979c.AbstractC37982a
        /* renamed from: a */
        public final boolean mo66055a(View view, int i) {
            View view2;
            if (AdPopUpWebBottomSheetBehavior.this.f89575f == 1 || AdPopUpWebBottomSheetBehavior.this.f89582m) {
                return false;
            }
            if ((AdPopUpWebBottomSheetBehavior.this.f89575f != 3 || AdPopUpWebBottomSheetBehavior.this.f89581l != i || (view2 = AdPopUpWebBottomSheetBehavior.this.f89579j.get()) == null || !view2.canScrollVertically(-1)) && AdPopUpWebBottomSheetBehavior.this.f89578i != null && AdPopUpWebBottomSheetBehavior.this.f89578i.get() == view) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0117, code lost:
            if ((java.lang.Math.abs(((float) r9.getTop()) + (r11 * 0.1f)) / ((float) r2)) <= 0.5f) goto L_0x0138;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x014b  */
        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37979c.AbstractC37982a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo66054a(android.view.View r9, float r10, float r11) {
            /*
            // Method dump skipped, instructions count: 339
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.C379262.mo66054a(android.view.View, float, float):void");
        }
    };

    /* renamed from: a */
    public int f89570a;

    /* renamed from: b */
    int f89571b;

    /* renamed from: c */
    int f89572c;

    /* renamed from: d */
    public boolean f89573d;

    /* renamed from: e */
    public boolean f89574e;

    /* renamed from: f */
    public int f89575f = 4;

    /* renamed from: g */
    public C37979c f89576g;

    /* renamed from: h */
    int f89577h;

    /* renamed from: i */
    WeakReference<V> f89578i;

    /* renamed from: j */
    WeakReference<View> f89579j;

    /* renamed from: k */
    public AbstractC37928a f89580k;

    /* renamed from: l */
    int f89581l;

    /* renamed from: m */
    boolean f89582m;

    /* renamed from: n */
    public boolean f89583n;

    /* renamed from: o */
    public boolean f89584o = true;

    /* renamed from: p */
    int f89585p;

    /* renamed from: q */
    int f89586q;

    /* renamed from: r */
    float f89587r = 0.2683658f;

    /* renamed from: s */
    public WebView f89588s;

    /* renamed from: t */
    public boolean f89589t;

    /* renamed from: u */
    private float f89590u;

    /* renamed from: v */
    private int f89591v;

    /* renamed from: w */
    private boolean f89592w;

    /* renamed from: x */
    private boolean f89593x;

    /* renamed from: y */
    private int f89594y;

    /* renamed from: z */
    private boolean f89595z;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior$a */
    public static abstract class AbstractC37928a {
        static {
            Covode.recordClassIndex(45382);
        }

        /* renamed from: a */
        public abstract void mo66062a(View view, float f);

        /* renamed from: a */
        public abstract void mo66063a(View view, int i);
    }

    static {
        Covode.recordClassIndex(45377);
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
        this.f89577h = coordinatorLayout.getHeight();
        if (this.f89592w) {
            if (this.f89570a == 0) {
                this.f89570a = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.hj);
            }
            i2 = Math.max(this.f89570a, this.f89577h - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i2 = this.f89591v;
        }
        int max = Math.max(0, this.f89577h - v.getHeight());
        this.f89571b = max;
        int max2 = Math.max(this.f89577h - i2, max);
        this.f89572c = max2;
        int i3 = this.f89571b;
        this.f89585p = i3;
        int i4 = this.f89577h;
        int i5 = (int) (((float) i4) * this.f89587r);
        this.f89586q = i5;
        int i6 = this.f89575f;
        if (i6 == 3) {
            C0792v.m2767d(v, i3);
        } else if (this.f89573d && i6 == 5) {
            C0792v.m2767d(v, i4);
        } else if (i6 == 4) {
            C0792v.m2767d(v, max2);
        } else if (i6 == 1 || i6 == 2) {
            C0792v.m2767d(v, top - v.getTop());
        } else if (i6 == 6) {
            C0792v.m2767d(v, i5);
        }
        if (this.f89576g == null) {
            this.f89576g = new C37979c(coordinatorLayout.getContext(), coordinatorLayout, this.f89569D);
        }
        this.f89578i = new WeakReference<>(v);
        this.f89579j = new WeakReference<>(m76857a(v));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0143, code lost:
        if (r13 != r14) goto L_0x0112;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2528a(androidx.coordinatorlayout.widget.CoordinatorLayout r21, V r22, android.view.MotionEvent r23) {
        /*
        // Method dump skipped, instructions count: 525
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.mo2528a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2530a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view == this.f89579j.get()) {
            return this.f89575f != 3 || super.mo2530a(coordinatorLayout, v, view, f, f2);
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior$SavedState */
    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.SavedState.C379271 */

            static {
                Covode.recordClassIndex(45381);
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
        final int f89600a;

        static {
            Covode.recordClassIndex(45380);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f89600a = i;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f89600a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f89600a);
        }
    }

    /* renamed from: c */
    private void m76861c() {
        this.f89581l = -1;
        VelocityTracker velocityTracker = this.f89566A;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f89566A = null;
        }
    }

    /* renamed from: b */
    public final int mo66044b() {
        if (this.f89592w) {
            return -1;
        }
        return this.f89591v;
    }

    public AdPopUpWebBottomSheetBehavior() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior$b */
    public class RunnableC37929b implements Runnable {

        /* renamed from: b */
        private final View f89602b;

        /* renamed from: c */
        private final int f89603c;

        static {
            Covode.recordClassIndex(45383);
        }

        public final void run() {
            if (AdPopUpWebBottomSheetBehavior.this.f89576g != null) {
                C37979c cVar = AdPopUpWebBottomSheetBehavior.this.f89576g;
                if (cVar.f89743a == 2) {
                    boolean computeScrollOffset = cVar.f89755m.computeScrollOffset();
                    int currX = cVar.f89755m.getCurrX();
                    int currY = cVar.f89755m.getCurrY();
                    int left = currX - cVar.f89757o.getLeft();
                    int top = currY - cVar.f89757o.getTop();
                    if (left != 0) {
                        C0792v.m2769e(cVar.f89757o, left);
                    }
                    if (top != 0) {
                        C0792v.m2767d(cVar.f89757o, top);
                    }
                    if (!(left == 0 && top == 0)) {
                        cVar.f89756n.mo66053a(currY);
                    }
                    if (computeScrollOffset) {
                        if (currX == cVar.f89755m.getFinalX() && currY == cVar.f89755m.getFinalY()) {
                            cVar.f89755m.abortAnimation();
                        }
                    }
                    cVar.f89759q.post(cVar.f89760r);
                }
                if (cVar.f89743a == 2) {
                    C0792v.m2750a(this.f89602b, this);
                    return;
                }
            }
            AdPopUpWebBottomSheetBehavior.this.mo66048d(this.f89603c);
        }

        RunnableC37929b(View view, int i) {
            this.f89602b = view;
            this.f89603c = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo66048d(int i) {
        AbstractC37928a aVar;
        if (this.f89575f != i) {
            this.f89575f = i;
            V v = this.f89578i.get();
            if (v != null && (aVar = this.f89580k) != null) {
                aVar.mo66063a((View) v, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo66049e(int i) {
        AbstractC37928a aVar;
        V v = this.f89578i.get();
        if (v != null && (aVar = this.f89580k) != null) {
            int i2 = this.f89572c;
            if (i > i2) {
                aVar.mo66062a(v, ((float) (i2 - i)) / ((float) (this.f89577h - i2)));
            } else {
                aVar.mo66062a(v, ((float) (i2 - i)) / ((float) (i2 - this.f89571b)));
            }
        }
    }

    /* renamed from: a */
    private View m76857a(View view) {
        while (view != null) {
            if (this.f89568C) {
                return this.f89579j.get();
            }
            if (C0792v.m2786t(view)) {
                return view;
            }
            if (view instanceof ViewPager) {
                view = C34621a.m70700a((ViewPager) view);
            } else {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (viewGroup.getVisibility() == 0) {
                        int childCount = viewGroup.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View a = m76857a(viewGroup.getChildAt(i));
                            if (a != null) {
                                return a;
                            }
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo66047c(final int i) {
        if (i != this.f89575f) {
            WeakReference<V> weakReference = this.f89578i;
            if (weakReference != null) {
                final V v = weakReference.get();
                if (v != null) {
                    ViewParent parent = v.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !C0792v.m2791y(v)) {
                        mo66046b((View) v, i);
                    } else {
                        v.post(new Runnable() {
                            /* class com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.RunnableC379251 */

                            static {
                                Covode.recordClassIndex(45378);
                            }

                            public final void run() {
                                AdPopUpWebBottomSheetBehavior.this.mo66046b(v, i);
                            }
                        });
                    }
                }
            } else if (i == 4 || i == 3 || i == 6 || (this.f89573d && i == 5)) {
                this.f89575f = i;
            }
        }
    }

    /* renamed from: b */
    public final void mo66045b(int i) {
        WeakReference<V> weakReference;
        V v;
        if (i == -1) {
            if (!this.f89592w) {
                this.f89592w = true;
            } else {
                return;
            }
        } else if (this.f89592w || this.f89591v != i) {
            this.f89592w = false;
            this.f89591v = Math.max(0, i);
            this.f89572c = this.f89577h - i;
        } else {
            return;
        }
        if (this.f89575f == 4 && (weakReference = this.f89578i) != null && (v = weakReference.get()) != null) {
            v.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2523a(int i) {
        this.f89594y = 0;
        this.f89595z = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final Parcelable mo2513a(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo2513a(coordinatorLayout, (View) v), this.f89575f);
    }

    /* renamed from: a */
    private boolean m76858a(View view, float f) {
        if ((((float) view.getTop()) + (f * 0.1f)) / ((float) this.f89577h) > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m76859b(View view, float f) {
        if (this.f89574e) {
            return m76858a(view, f);
        }
        if (view.getTop() >= this.f89572c && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f89572c)) / ((float) this.f89591v) > 0.5f) {
            return true;
        }
        return false;
    }

    public AdPopUpWebBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k6, R.attr.k7, R.attr.k_, R.attr.ka});
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            mo66045b(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            mo66045b(peekValue.data);
        }
        this.f89573d = obtainStyledAttributes.getBoolean(1, false);
        this.f89574e = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f89590u = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (mo66043a(r6, r2, r5.f89566A.getXVelocity(r5.f89581l)) == false) goto L_0x007e;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2516a(V r6, android.view.View r7) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.mo2516a(android.view.View, android.view.View):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo66046b(View view, int i) {
        int i2;
        boolean z = this.f89583n;
        if (i == 4) {
            i2 = this.f89572c;
            z = false;
        } else if (i == 3) {
            i2 = this.f89571b;
        } else if (this.f89573d && i == 5) {
            i2 = this.f89577h;
        } else if (i == 6) {
            i2 = this.f89586q;
        } else {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i)));
        }
        if (this.f89576g.mo66218a(view, view.getLeft(), i2, z)) {
            mo66048d(2);
            C0792v.m2750a(view, new RunnableC37929b(view, i));
            return;
        }
        mo66048d(i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2518a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo2518a(coordinatorLayout, v, savedState.f3089d);
        if (savedState.f89600a == 1 || savedState.f89600a == 2) {
            this.f89575f = 4;
        } else {
            this.f89575f = savedState.f89600a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (((r3 - ((float) r6.f89572c)) / ((float) r6.f89591v)) > 0.5f) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (((r2 - ((float) r6.f89572c)) / ((float) r6.f89591v)) > 0.5f) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        r5 = false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m76860b(android.view.View r7, float r8, float r9) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.m76860b(android.view.View, float, float):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e2, code lost:
        if (r11.f89745c == -1) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e4, code lost:
        r11.mo66219b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0220 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a9 A[RETURN] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2532b(androidx.coordinatorlayout.widget.CoordinatorLayout r16, V r17, android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 545
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.mo2532b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo66043a(View view, float f, float f2) {
        if (C38615aa.f91245c) {
            return m76860b(view, f, f2);
        }
        return m76859b(view, f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2521a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == this.f89579j.get()) {
            int top = v.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                int i4 = this.f89571b;
                if (i3 < i4) {
                    iArr[1] = top - i4;
                    C0792v.m2767d(v, -iArr[1]);
                    mo66048d(3);
                } else {
                    iArr[1] = i2;
                    C0792v.m2767d(v, -i2);
                    mo66048d(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.f89572c;
                if (i3 <= i5 || this.f89573d) {
                    iArr[1] = i2;
                    C0792v.m2767d(v, -i2);
                    mo66048d(1);
                } else {
                    iArr[1] = top - i5;
                    C0792v.m2767d(v, -iArr[1]);
                    mo66048d(4);
                }
            }
            mo66049e(v.getTop());
            this.f89594y = i2;
            this.f89595z = true;
        }
    }
}
