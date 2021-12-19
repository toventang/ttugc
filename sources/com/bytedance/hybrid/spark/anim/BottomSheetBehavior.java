package com.bytedance.hybrid.spark.anim;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p030b.C0622a;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.anim.C15522a;
import com.bytedance.hybrid.spark.anim.C15524b;
import com.google.android.material.p1960i.C26650c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0557b<V> {

    /* renamed from: O */
    private static final int f37786O = R.style.qw;

    /* renamed from: A */
    int f37787A;

    /* renamed from: B */
    WeakReference<V> f37788B;

    /* renamed from: C */
    WeakReference<View> f37789C;

    /* renamed from: D */
    public final ArrayList<AbstractC15520a> f37790D = new ArrayList<>();

    /* renamed from: E */
    int f37791E;

    /* renamed from: F */
    boolean f37792F;

    /* renamed from: G */
    public C15522a f37793G;

    /* renamed from: H */
    private float f37794H;

    /* renamed from: I */
    private boolean f37795I;

    /* renamed from: J */
    private boolean f37796J;

    /* renamed from: K */
    private int f37797K;

    /* renamed from: L */
    private boolean f37798L;

    /* renamed from: M */
    private BottomSheetBehavior<V>.RunnableC15521b f37799M;

    /* renamed from: N */
    private ValueAnimator f37800N;

    /* renamed from: P */
    private boolean f37801P;

    /* renamed from: Q */
    private int f37802Q;

    /* renamed from: R */
    private boolean f37803R;

    /* renamed from: S */
    private VelocityTracker f37804S;

    /* renamed from: T */
    private int f37805T;

    /* renamed from: U */
    private Map<View, Integer> f37806U;

    /* renamed from: V */
    private final C15524b.AbstractC15527a f37807V = new C15524b.AbstractC15527a() {
        /* class com.bytedance.hybrid.spark.anim.BottomSheetBehavior.C155183 */

        static {
            Covode.recordClassIndex(17779);
        }

        @Override // com.bytedance.hybrid.spark.anim.C15524b.AbstractC15527a
        /* renamed from: a */
        public final int mo25280a() {
            if (BottomSheetBehavior.this.f37821n) {
                return BottomSheetBehavior.this.f37787A;
            }
            return BottomSheetBehavior.this.f37819l;
        }

        @Override // com.bytedance.hybrid.spark.anim.C15524b.AbstractC15527a
        /* renamed from: a */
        public final int mo25281a(View view) {
            return view.getLeft();
        }

        @Override // com.bytedance.hybrid.spark.anim.C15524b.AbstractC15527a
        /* renamed from: b */
        public final void mo25286b(int i) {
            if (i == 1 && BottomSheetBehavior.this.f37823p) {
                BottomSheetBehavior.this.mo25276d(1);
            }
        }

        @Override // com.bytedance.hybrid.spark.anim.C15524b.AbstractC15527a
        /* renamed from: a */
        public final void mo25282a(int i) {
            BottomSheetBehavior.this.mo25277e(i);
        }

        @Override // com.bytedance.hybrid.spark.anim.C15524b.AbstractC15527a
        /* renamed from: c */
        public final int mo25287c(int i) {
            int i2;
            int b = BottomSheetBehavior.this.mo25271b();
            if (BottomSheetBehavior.this.f37821n) {
                i2 = BottomSheetBehavior.this.f37787A;
            } else {
                i2 = BottomSheetBehavior.this.f37819l;
            }
            return C0622a.m2312a(i, b, i2);
        }

        @Override // com.bytedance.hybrid.spark.anim.C15524b.AbstractC15527a
        /* renamed from: a */
        public final boolean mo25285a(View view, MotionEvent motionEvent) {
            if (!BottomSheetBehavior.this.f37832y.mo25304a(view, 1, 1, (int) motionEvent.getX(), ((int) motionEvent.getY()) - (BottomSheetBehavior.this.f37787A - BottomSheetBehavior.this.f37824q))) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.hybrid.spark.anim.C15524b.AbstractC15527a
        /* renamed from: a */
        public final boolean mo25284a(View view, int i) {
            View view2;
            if (BottomSheetBehavior.this.f37831x == 1 || BottomSheetBehavior.this.f37792F) {
                return false;
            }
            if ((BottomSheetBehavior.this.f37831x != 3 || BottomSheetBehavior.this.f37791E != i || BottomSheetBehavior.this.f37789C == null || (view2 = BottomSheetBehavior.this.f37789C.get()) == null || !view2.canScrollVertically(-1)) && BottomSheetBehavior.this.f37788B != null && BottomSheetBehavior.this.f37788B.get() == view) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.hybrid.spark.anim.C15524b.AbstractC15527a
        /* renamed from: a */
        public final void mo25283a(View view, float f, float f2) {
            int i;
            int top = view.getTop();
            int i2 = 4;
            if (f2 >= 0.0f) {
                if (!BottomSheetBehavior.this.f37821n || !BottomSheetBehavior.this.mo25270a(view, f2)) {
                    if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                        if (BottomSheetBehavior.this.f37809b) {
                            if (BottomSheetBehavior.this.f37822o) {
                                i = BottomSheetBehavior.this.f37816i;
                            } else {
                                i = BottomSheetBehavior.this.f37819l;
                            }
                        } else if (BottomSheetBehavior.this.f37822o) {
                            i = BottomSheetBehavior.this.f37815h;
                        }
                        i2 = 3;
                    } else if (BottomSheetBehavior.this.f37809b) {
                        if (BottomSheetBehavior.this.f37830w == 3) {
                            if (BottomSheetBehavior.this.f37822o || Math.abs(top - BottomSheetBehavior.this.f37816i) < BottomSheetBehavior.this.f37827t) {
                                i = BottomSheetBehavior.this.f37816i;
                            }
                        } else if (BottomSheetBehavior.this.f37819l - top >= BottomSheetBehavior.this.f37826s) {
                            i = BottomSheetBehavior.this.f37816i;
                        } else {
                            i = BottomSheetBehavior.this.f37819l;
                        }
                        i2 = 3;
                    } else {
                        if (BottomSheetBehavior.this.f37830w == 3) {
                            if (BottomSheetBehavior.this.f37822o || Math.abs(top - BottomSheetBehavior.this.f37815h) < BottomSheetBehavior.this.f37827t) {
                                i = BottomSheetBehavior.this.f37815h;
                            }
                        } else if (BottomSheetBehavior.this.f37819l - top >= BottomSheetBehavior.this.f37826s) {
                            i = BottomSheetBehavior.this.f37815h;
                        } else {
                            i = BottomSheetBehavior.this.f37819l;
                        }
                        i2 = 3;
                    }
                } else if ((Math.abs(f) < Math.abs(f2) && f2 > 500.0f) || ((BottomSheetBehavior.this.f37830w == 3 && view.getTop() - BottomSheetBehavior.this.f37815h >= BottomSheetBehavior.this.f37829v) || (BottomSheetBehavior.this.f37830w == 4 && view.getTop() - BottomSheetBehavior.this.f37819l >= BottomSheetBehavior.this.f37828u))) {
                    i = BottomSheetBehavior.this.f37787A;
                    i2 = 5;
                } else if (BottomSheetBehavior.this.f37809b) {
                    if (BottomSheetBehavior.this.f37830w == 3) {
                        if (BottomSheetBehavior.this.f37822o || Math.abs(top - BottomSheetBehavior.this.f37816i) < BottomSheetBehavior.this.f37827t) {
                            i = BottomSheetBehavior.this.f37816i;
                        }
                    } else if (BottomSheetBehavior.this.f37819l - top >= BottomSheetBehavior.this.f37826s) {
                        i = BottomSheetBehavior.this.f37816i;
                    } else {
                        i = BottomSheetBehavior.this.f37819l;
                    }
                    i2 = 3;
                } else {
                    if (BottomSheetBehavior.this.f37830w == 3) {
                        if (BottomSheetBehavior.this.f37822o || Math.abs(top - BottomSheetBehavior.this.f37815h) < BottomSheetBehavior.this.f37827t) {
                            i = BottomSheetBehavior.this.f37815h;
                        }
                    } else if (BottomSheetBehavior.this.f37819l - top >= BottomSheetBehavior.this.f37826s) {
                        i = BottomSheetBehavior.this.f37815h;
                    } else {
                        i = BottomSheetBehavior.this.f37819l;
                    }
                    i2 = 3;
                }
                i = BottomSheetBehavior.this.f37819l;
            } else if (BottomSheetBehavior.this.f37809b) {
                if (top <= BottomSheetBehavior.this.f37819l || (BottomSheetBehavior.this.f37822o && BottomSheetBehavior.this.f37830w != 4)) {
                    i = BottomSheetBehavior.this.f37816i;
                    i2 = 3;
                } else {
                    i = BottomSheetBehavior.this.f37819l;
                }
            } else if (top <= BottomSheetBehavior.this.f37819l || (BottomSheetBehavior.this.f37822o && BottomSheetBehavior.this.f37830w != 4)) {
                i = BottomSheetBehavior.this.f37815h;
                i2 = 3;
            } else {
                i = BottomSheetBehavior.this.f37819l;
            }
            BottomSheetBehavior.this.mo25268a(view, i2, i, true);
        }
    };

    /* renamed from: a */
    public int f37808a;

    /* renamed from: b */
    public boolean f37809b = true;

    /* renamed from: c */
    public boolean f37810c;

    /* renamed from: d */
    public int f37811d;

    /* renamed from: e */
    public int f37812e;

    /* renamed from: f */
    public C26650c f37813f;

    /* renamed from: g */
    public boolean f37814g;

    /* renamed from: h */
    int f37815h;

    /* renamed from: i */
    int f37816i;

    /* renamed from: j */
    int f37817j;

    /* renamed from: k */
    public float f37818k = 0.5f;

    /* renamed from: l */
    int f37819l;

    /* renamed from: m */
    float f37820m = -1.0f;

    /* renamed from: n */
    public boolean f37821n;

    /* renamed from: o */
    public boolean f37822o;

    /* renamed from: p */
    public boolean f37823p = true;

    /* renamed from: q */
    int f37824q;

    /* renamed from: r */
    public int f37825r;

    /* renamed from: s */
    public int f37826s;

    /* renamed from: t */
    public int f37827t;

    /* renamed from: u */
    public int f37828u;

    /* renamed from: v */
    public int f37829v;

    /* renamed from: w */
    public int f37830w = 5;

    /* renamed from: x */
    public int f37831x = 4;

    /* renamed from: y */
    C15524b f37832y;

    /* renamed from: z */
    int f37833z;

    /* renamed from: com.bytedance.hybrid.spark.anim.BottomSheetBehavior$a */
    public static abstract class AbstractC15520a {
        static {
            Covode.recordClassIndex(17782);
        }

        /* renamed from: a */
        public abstract void mo25292a(View view);

        /* renamed from: a */
        public abstract void mo25293a(View view, int i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2524a(CoordinatorLayout coordinatorLayout, V v, int i) {
        C26650c cVar;
        if (C0792v.m2781o(coordinatorLayout) && !C0792v.m2781o(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f37788B == null) {
            this.f37812e = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.hj);
            this.f37788B = new WeakReference<>(v);
            if (this.f37796J && (cVar = this.f37813f) != null) {
                C0792v.m2746a(v, cVar);
            }
            C26650c cVar2 = this.f37813f;
            if (cVar2 != null) {
                boolean z = this.f37831x == 3;
                this.f37798L = z;
                cVar2.mo44108a(z ? 0.0f : 1.0f);
            }
            if (C0792v.m2766d(v) == 0) {
                C0792v.m2740a((View) v, 1);
            }
        }
        if (this.f37832y == null) {
            this.f37832y = new C15524b(coordinatorLayout.getContext(), coordinatorLayout, this.f37807V);
        }
        int top = v.getTop();
        coordinatorLayout.mo2469a(v, i);
        this.f37833z = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.f37787A = height;
        int i2 = this.f37825r;
        if (i2 > 0) {
            this.f37815h = height - i2;
        } else {
            this.f37815h = 0;
        }
        this.f37816i = Math.max(0, height - v.getHeight());
        m28586f();
        m28585e();
        int i3 = this.f37831x;
        if (i3 == 3) {
            C0792v.m2767d(v, mo25271b());
        } else if (i3 == 6) {
            C0792v.m2767d(v, this.f37817j);
        } else if (this.f37821n && i3 == 5) {
            C0792v.m2767d(v, this.f37787A);
        } else if (i3 == 4) {
            C0792v.m2767d(v, this.f37819l);
        } else if (i3 == 1 || i3 == 2) {
            C0792v.m2767d(v, top - v.getTop());
        }
        this.f37789C = new WeakReference<>(m28581a(v));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r1 != 3) goto L_0x003c;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2528a(androidx.coordinatorlayout.widget.CoordinatorLayout r17, V r18, android.view.MotionEvent r19) {
        /*
        // Method dump skipped, instructions count: 546
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.anim.BottomSheetBehavior.mo2528a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2531a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f37802Q = 0;
        this.f37803R = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final boolean mo2530a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f37789C;
        if (weakReference == null || view != weakReference.get() || (this.f37831x == 3 && !super.mo2530a(coordinatorLayout, v, view, f, f2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo25269a(boolean z) {
        if (this.f37809b != z) {
            this.f37809b = z;
            if (this.f37788B != null) {
                m28585e();
            }
            mo25276d((!this.f37809b || this.f37831x != 6) ? this.f37831x : 3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo25270a(View view, float f) {
        if (this.f37822o) {
            return true;
        }
        if ((this.f37830w == 3 && view.getTop() - this.f37815h >= this.f37829v) || (this.f37830w == 4 && view.getTop() - this.f37819l >= this.f37828u)) {
            return true;
        }
        if (view.getTop() < this.f37819l) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f37819l)) / ((float) m28584d()) > 0.5f) {
            return true;
        }
        return false;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.bytedance.hybrid.spark.anim.BottomSheetBehavior.SavedState.C155191 */

            static {
                Covode.recordClassIndex(17781);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        final int f37839a;

        /* renamed from: b */
        int f37840b;

        /* renamed from: c */
        int f37841c;

        /* renamed from: d */
        boolean f37842d;

        /* renamed from: e */
        boolean f37843e;

        /* renamed from: f */
        boolean f37844f;

        static {
            Covode.recordClassIndex(17780);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            boolean z;
            boolean z2;
            this.f37839a = parcel.readInt();
            this.f37840b = parcel.readInt();
            this.f37841c = parcel.readInt();
            boolean z3 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f37842d = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f37843e = z2;
            this.f37844f = parcel.readInt() == 1 ? true : z3;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f37839a = bottomSheetBehavior.f37831x;
            this.f37840b = bottomSheetBehavior.f37811d;
            this.f37841c = bottomSheetBehavior.f37825r;
            this.f37842d = bottomSheetBehavior.f37809b;
            this.f37843e = bottomSheetBehavior.f37821n;
            this.f37844f = bottomSheetBehavior.f37822o;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f37839a);
            parcel.writeInt(this.f37840b);
            parcel.writeInt(this.f37841c);
            parcel.writeInt(this.f37842d ? 1 : 0);
            parcel.writeInt(this.f37843e ? 1 : 0);
            parcel.writeInt(this.f37844f ? 1 : 0);
        }
    }

    static {
        Covode.recordClassIndex(17776);
    }

    /* renamed from: f */
    private void m28586f() {
        this.f37817j = (int) (((float) this.f37787A) * (1.0f - this.f37818k));
    }

    /* renamed from: g */
    private void m28588g() {
        this.f37791E = -1;
        VelocityTracker velocityTracker = this.f37804S;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f37804S = null;
        }
    }

    /* renamed from: b */
    public final int mo25271b() {
        if (this.f37809b) {
            return this.f37816i;
        }
        return this.f37815h;
    }

    /* renamed from: c */
    private void m28582c() {
        V v;
        if (this.f37788B != null) {
            m28585e();
            if (this.f37831x == 4 && (v = this.f37788B.get()) != null) {
                v.requestLayout();
            }
        }
    }

    /* renamed from: d */
    private int m28584d() {
        int i;
        if (this.f37795I) {
            return Math.max(this.f37812e, this.f37787A - ((this.f37833z * 9) / 16));
        }
        int i2 = this.f37811d;
        if (this.f37814g) {
            i = 0;
        } else {
            i = this.f37797K;
        }
        return i2 + i;
    }

    /* renamed from: e */
    private void m28585e() {
        int d = m28584d();
        if (this.f37809b) {
            this.f37819l = Math.max(this.f37787A - d, this.f37816i);
        } else {
            this.f37819l = this.f37787A - d;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2514a() {
        super.mo2514a();
        this.f37788B = null;
        this.f37832y = null;
    }

    public BottomSheetBehavior() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.hybrid.spark.anim.BottomSheetBehavior$b */
    public class RunnableC15521b implements Runnable {

        /* renamed from: a */
        public boolean f37845a;

        /* renamed from: b */
        int f37846b;

        /* renamed from: d */
        private final View f37848d;

        static {
            Covode.recordClassIndex(17783);
        }

        public final void run() {
            if (BottomSheetBehavior.this.f37832y != null) {
                C15524b bVar = BottomSheetBehavior.this.f37832y;
                if (bVar.f37852a == 2) {
                    boolean computeScrollOffset = bVar.f37864m.computeScrollOffset();
                    int currX = bVar.f37864m.getCurrX();
                    int currY = bVar.f37864m.getCurrY();
                    int left = currX - bVar.f37866o.getLeft();
                    int top = currY - bVar.f37866o.getTop();
                    if (left != 0) {
                        C0792v.m2769e(bVar.f37866o, left);
                    }
                    if (top != 0) {
                        C0792v.m2767d(bVar.f37866o, top);
                    }
                    if (!(left == 0 && top == 0)) {
                        bVar.f37865n.mo25282a(currY);
                    }
                    if (computeScrollOffset) {
                        if (currX == bVar.f37864m.getFinalX() && currY == bVar.f37864m.getFinalY()) {
                            bVar.f37864m.abortAnimation();
                        }
                    }
                    bVar.f37867p.post(bVar.f37868q);
                }
                if (bVar.f37852a == 2) {
                    C0792v.m2750a(this.f37848d, this);
                    this.f37845a = false;
                }
            }
            BottomSheetBehavior.this.mo25276d(this.f37846b);
            this.f37845a = false;
        }

        RunnableC15521b(View view, int i) {
            this.f37848d = view;
            this.f37846b = i;
        }
    }

    /* renamed from: b */
    public final void mo25272b(int i) {
        if (i == -1) {
            if (!this.f37795I) {
                this.f37795I = true;
            } else {
                return;
            }
        } else if (this.f37795I || this.f37811d != i) {
            this.f37795I = false;
            this.f37811d = Math.max(0, i);
        } else {
            return;
        }
        m28582c();
    }

    /* renamed from: a */
    private View m28581a(View view) {
        if (C0792v.m2786t(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View a = m28581a(viewGroup.getChildAt(i));
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: f */
    private void m28587f(final int i) {
        final V v = this.f37788B.get();
        if (v != null) {
            ViewParent parent = v.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C0792v.m2791y(v)) {
                mo25273b(v, i);
            } else {
                v.post(new Runnable() {
                    /* class com.bytedance.hybrid.spark.anim.BottomSheetBehavior.RunnableC155161 */

                    static {
                        Covode.recordClassIndex(17777);
                    }

                    public final void run() {
                        BottomSheetBehavior.this.mo25273b(v, i);
                    }
                });
            }
        }
    }

    /* renamed from: g */
    private void m28589g(int i) {
        boolean z;
        ValueAnimator valueAnimator;
        float f;
        if (i != 2) {
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            if (this.f37798L != z) {
                this.f37798L = z;
                if (this.f37813f != null && (valueAnimator = this.f37800N) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f37800N.reverse();
                        return;
                    }
                    if (z) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    this.f37800N.setFloatValues(1.0f - f, f);
                    this.f37800N.start();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo25275c(int i) {
        if (i != this.f37831x) {
            if (this.f37788B != null) {
                m28587f(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.f37821n && i == 5)) {
                this.f37831x = i;
            }
        }
    }

    /* renamed from: c */
    private void m28583c(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f37788B;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                int i = Build.VERSION.SDK_INT;
                if (z) {
                    if (this.f37806U == null) {
                        this.f37806U = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.f37788B.get()) {
                        if (z) {
                            int i3 = Build.VERSION.SDK_INT;
                            this.f37806U.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f37810c) {
                                C0792v.m2740a(childAt, 4);
                            }
                        } else if (this.f37810c && (map = this.f37806U) != null && map.containsKey(childAt)) {
                            C0792v.m2740a(childAt, this.f37806U.get(childAt).intValue());
                        }
                    }
                }
                if (!z) {
                    this.f37806U = null;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo25274b(boolean z) {
        if (this.f37821n != z) {
            this.f37821n = z;
            if (!z && this.f37831x == 5) {
                mo25275c(4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo25276d(int i) {
        V v;
        int i2 = this.f37831x;
        if (i2 != i) {
            this.f37830w = i2;
            this.f37831x = i;
            WeakReference<V> weakReference = this.f37788B;
            if (!(weakReference == null || (v = weakReference.get()) == null)) {
                if (i == 3) {
                    m28583c(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    m28583c(false);
                }
                m28589g(i);
                for (int i3 = 0; i3 < this.f37790D.size(); i3++) {
                    this.f37790D.get(i3).mo25293a(v, i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo25277e(int i) {
        V v = this.f37788B.get();
        C15522a aVar = this.f37793G;
        if (aVar != null && aVar.f37849a == C15522a.EnumC15523a.DONE) {
            v.getLayoutParams().height = this.f37787A - i;
            v.requestLayout();
        } else if (v == null) {
            return;
        }
        if (!this.f37790D.isEmpty()) {
            int i2 = this.f37819l;
            if (i <= i2 && i2 != mo25271b()) {
                mo25271b();
            }
            for (int i3 = 0; i3 < this.f37790D.size(); i3++) {
                this.f37790D.get(i3).mo25292a(v);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2517a(CoordinatorLayout.C0560e eVar) {
        super.mo2517a(eVar);
        this.f37788B = null;
        this.f37832y = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final Parcelable mo2513a(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo2513a(coordinatorLayout, (View) v), this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo25273b(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f37819l;
        } else if (i == 6) {
            int i3 = this.f37817j;
            if (!this.f37809b || i3 > (i2 = this.f37816i)) {
                i2 = i3;
            } else {
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo25271b();
        } else if (!this.f37821n || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: ".concat(String.valueOf(i)));
        } else {
            i2 = this.f37787A;
        }
        mo25268a(view, i, i2, false);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.k6, R.attr.k7, R.attr.k_, R.attr.ka});
        this.f37796J = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f37800N = ofFloat;
        ofFloat.setDuration(500L);
        this.f37800N.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.hybrid.spark.anim.BottomSheetBehavior.C155172 */

            static {
                Covode.recordClassIndex(17778);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.f37813f != null) {
                    BottomSheetBehavior.this.f37813f.mo44108a(floatValue);
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            this.f37820m = -1.0f;
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || peekValue.data != -1) {
            mo25272b(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            mo25272b(peekValue.data);
        }
        mo25274b(obtainStyledAttributes.getBoolean(1, false));
        this.f37814g = false;
        mo25269a(true);
        this.f37822o = false;
        this.f37823p = true;
        this.f37808a = 0;
        this.f37818k = 0.5f;
        if (this.f37788B != null) {
            m28586f();
        }
        this.f37815h = 0;
        obtainStyledAttributes.recycle();
        this.f37794H = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2518a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo2518a(coordinatorLayout, v, savedState.getSuperState());
        int i = this.f37808a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f37811d = savedState.f37840b;
            }
            int i2 = this.f37808a;
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f37809b = savedState.f37842d;
            }
            int i3 = this.f37808a;
            if (i3 == -1 || (i3 & 4) == 4) {
                this.f37821n = savedState.f37843e;
            }
            int i4 = this.f37808a;
            if (i4 == -1 || (i4 & 8) == 8) {
                this.f37822o = savedState.f37844f;
            }
        }
        if (savedState.f37839a == 1 || savedState.f37839a == 2) {
            this.f37831x = 4;
        } else {
            this.f37831x = savedState.f37839a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c1, code lost:
        if (r11.f37854c == -1) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c3, code lost:
        r11.mo25306b();
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2532b(androidx.coordinatorlayout.widget.CoordinatorLayout r16, V r17, android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 513
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.anim.BottomSheetBehavior.mo2532b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25268a(View view, int i, int i2, boolean z) {
        boolean a;
        if (z) {
            a = this.f37832y.mo25301a(view.getLeft(), i2);
        } else {
            a = this.f37832y.mo25303a(view, view.getLeft(), i2);
        }
        if (a) {
            mo25276d(2);
            m28589g(i);
            if (this.f37799M == null) {
                this.f37799M = new RunnableC15521b(view, i);
            }
            if (!this.f37799M.f37845a) {
                this.f37799M.f37846b = i;
                C0792v.m2750a(view, this.f37799M);
                this.f37799M.f37845a = true;
                return;
            }
            this.f37799M.f37846b = i;
            return;
        }
        mo25276d(i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2519a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        float yVelocity;
        int i3 = 3;
        if (v.getTop() == mo25271b()) {
            mo25276d(3);
            return;
        }
        WeakReference<View> weakReference = this.f37789C;
        if (weakReference != null && view == weakReference.get() && this.f37803R) {
            if (this.f37802Q <= 0) {
                if (this.f37821n) {
                    VelocityTracker velocityTracker = this.f37804S;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.f37794H);
                        yVelocity = this.f37804S.getYVelocity(this.f37791E);
                    }
                    if (mo25270a(v, yVelocity)) {
                        i2 = this.f37787A;
                        i3 = 5;
                    }
                }
                if (this.f37802Q == 0) {
                    int top = v.getTop();
                    if (this.f37809b) {
                        if (Math.abs(top - this.f37816i) < Math.abs(top - this.f37819l)) {
                            i2 = this.f37816i;
                        } else {
                            i2 = this.f37819l;
                        }
                    } else if (Math.abs(top - this.f37815h) < Math.abs(top - this.f37819l)) {
                        i2 = this.f37815h;
                    } else {
                        i2 = this.f37819l;
                    }
                } else {
                    i2 = this.f37819l;
                }
                i3 = 4;
            } else if (this.f37809b) {
                i2 = this.f37816i;
            } else {
                i2 = this.f37815h;
            }
            mo25268a((View) v, i3, i2, false);
            this.f37803R = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0557b
    /* renamed from: a */
    public final void mo2522a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f37789C;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (view == view2) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < mo25271b()) {
                        iArr[1] = top - mo25271b();
                        C0792v.m2767d(v, -iArr[1]);
                        mo25276d(3);
                    } else if (this.f37823p) {
                        iArr[1] = i2;
                        C0792v.m2767d(v, -i2);
                        mo25276d(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.f37819l;
                    if (i4 > i5 && !this.f37821n) {
                        iArr[1] = top - i5;
                        C0792v.m2767d(v, -iArr[1]);
                        mo25276d(4);
                    } else if (this.f37823p) {
                        iArr[1] = i2;
                        C0792v.m2767d(v, -i2);
                        mo25276d(1);
                    } else {
                        return;
                    }
                }
                mo25277e(v.getTop());
                this.f37802Q = i2;
                this.f37803R = true;
            }
        }
    }
}
