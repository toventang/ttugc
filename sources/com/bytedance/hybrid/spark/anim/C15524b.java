package com.bytedance.hybrid.spark.anim;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: com.bytedance.hybrid.spark.anim.b */
public final class C15524b {

    /* renamed from: w */
    private static final Interpolator f37851w = new Interpolator() {
        /* class com.bytedance.hybrid.spark.anim.C15524b.animationInterpolatorC155251 */

        static {
            Covode.recordClassIndex(17787);
        }

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    public int f37852a;

    /* renamed from: b */
    public int f37853b;

    /* renamed from: c */
    public int f37854c = -1;

    /* renamed from: d */
    float[] f37855d;

    /* renamed from: e */
    float[] f37856e;

    /* renamed from: f */
    float[] f37857f;

    /* renamed from: g */
    float[] f37858g;

    /* renamed from: h */
    int[] f37859h;

    /* renamed from: i */
    VelocityTracker f37860i;

    /* renamed from: j */
    public float f37861j;

    /* renamed from: k */
    public int f37862k;

    /* renamed from: l */
    public int f37863l;

    /* renamed from: m */
    OverScroller f37864m;

    /* renamed from: n */
    final AbstractC15527a f37865n;

    /* renamed from: o */
    public View f37866o;

    /* renamed from: p */
    final ViewGroup f37867p;

    /* renamed from: q */
    final Runnable f37868q = new Runnable() {
        /* class com.bytedance.hybrid.spark.anim.C15524b.RunnableC155262 */

        static {
            Covode.recordClassIndex(17788);
        }

        public final void run() {
            C15524b.this.mo25308b(0);
        }
    };

    /* renamed from: r */
    private int[] f37869r;

    /* renamed from: s */
    private int[] f37870s;

    /* renamed from: t */
    private int f37871t;

    /* renamed from: u */
    private float f37872u;

    /* renamed from: v */
    private boolean f37873v;

    /* renamed from: com.bytedance.hybrid.spark.anim.b$a */
    public static abstract class AbstractC15527a {
        static {
            Covode.recordClassIndex(17789);
        }

        /* renamed from: a */
        public int mo25280a() {
            return 0;
        }

        /* renamed from: a */
        public int mo25281a(View view) {
            return 0;
        }

        /* renamed from: a */
        public void mo25282a(int i) {
        }

        /* renamed from: a */
        public void mo25283a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public abstract boolean mo25284a(View view, int i);

        /* renamed from: a */
        public abstract boolean mo25285a(View view, MotionEvent motionEvent);

        /* renamed from: b */
        public void mo25286b(int i) {
        }

        /* renamed from: c */
        public int mo25287c(int i) {
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo25300a(View view, int i) {
        if (view.getParent() == this.f37867p) {
            this.f37866o = view;
            this.f37854c = i;
            mo25308b(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f37867p + ")");
    }

    /* renamed from: a */
    public final boolean mo25303a(View view, int i, int i2) {
        this.f37866o = view;
        this.f37854c = -1;
        boolean a = m28625a(i, i2, 0, 0);
        if (!a && this.f37852a == 0 && this.f37866o != null) {
            this.f37866o = null;
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo25301a(int i, int i2) {
        if (this.f37873v) {
            return m28625a(i, i2, (int) this.f37860i.getXVelocity(this.f37854c), (int) this.f37860i.getYVelocity(this.f37854c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25298a(int i) {
        if (this.f37855d != null && m28631e(i)) {
            this.f37855d[i] = 0.0f;
            this.f37856e[i] = 0.0f;
            this.f37857f[i] = 0.0f;
            this.f37858g[i] = 0.0f;
            this.f37859h[i] = 0;
            this.f37869r[i] = 0;
            this.f37870s[i] = 0;
            this.f37871t = ((1 << i) ^ -1) & this.f37871t;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25299a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (mo25310c(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f37857f[pointerId] = x;
                this.f37858g[pointerId] = y;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo25304a(View view, int i, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && mo25304a(childAt, i, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (view.canScrollHorizontally(-i) || view.canScrollVertically(-i2)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo25302a(View view, float f) {
        return view != null && this.f37865n.mo25280a() > 0 && Math.abs(f) > ((float) this.f37853b);
    }

    static {
        Covode.recordClassIndex(17786);
    }

    /* renamed from: c */
    private void m28629c() {
        float[] fArr = this.f37855d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f37856e, 0.0f);
            Arrays.fill(this.f37857f, 0.0f);
            Arrays.fill(this.f37858g, 0.0f);
            Arrays.fill(this.f37859h, 0);
            Arrays.fill(this.f37869r, 0);
            Arrays.fill(this.f37870s, 0);
            this.f37871t = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo25306b() {
        this.f37860i.computeCurrentVelocity(1000, this.f37872u);
        mo25296a(m28622a(this.f37860i.getXVelocity(this.f37854c), this.f37861j, this.f37872u), m28622a(this.f37860i.getYVelocity(this.f37854c), this.f37861j, this.f37872u));
    }

    /* renamed from: a */
    public final void mo25295a() {
        this.f37854c = -1;
        m28629c();
        VelocityTracker velocityTracker = this.f37860i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f37860i = null;
        }
    }

    /* renamed from: a */
    private static float m28621a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: e */
    private boolean m28631e(int i) {
        if (((1 << i) & this.f37871t) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo25310c(int i) {
        if (!m28631e(i)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo25308b(int i) {
        this.f37867p.removeCallbacks(this.f37868q);
        if (this.f37852a != i) {
            this.f37852a = i;
            this.f37865n.mo25286b(i);
            if (this.f37852a == 0) {
                this.f37866o = null;
            }
        }
    }

    /* renamed from: d */
    private void m28630d(int i) {
        float[] fArr = this.f37855d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f37856e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f37857f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f37858g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f37859h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f37869r;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f37870s;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f37855d = fArr2;
            this.f37856e = fArr3;
            this.f37857f = fArr4;
            this.f37858g = fArr5;
            this.f37859h = iArr;
            this.f37869r = iArr2;
            this.f37870s = iArr3;
        }
    }

    /* renamed from: c */
    private int m28628c(int i, int i2) {
        int i3;
        if (i < this.f37867p.getLeft() + this.f37862k) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f37867p.getTop() + this.f37862k) {
            i3 |= 4;
        }
        if (i > this.f37867p.getRight() - this.f37862k) {
            i3 |= 2;
        }
        if (i2 > this.f37867p.getBottom() - this.f37862k) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: b */
    public final View mo25305b(int i, int i2) {
        for (int childCount = this.f37867p.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f37867p.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25296a(float f, float f2) {
        this.f37873v = true;
        this.f37865n.mo25283a(this.f37866o, f, f2);
        this.f37873v = false;
        if (this.f37852a == 1) {
            mo25308b(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo25309b(View view, int i) {
        if (view == this.f37866o && this.f37854c == i) {
            return true;
        }
        if (view == null || !this.f37865n.mo25284a(view, i)) {
            return false;
        }
        this.f37854c = i;
        mo25300a(view, i);
        return true;
    }

    /* renamed from: b */
    private static int m28626b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i > 0) {
            return i3;
        }
        return -i3;
    }

    /* renamed from: a */
    private static float m28622a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f > 0.0f) {
            return f3;
        }
        return -f3;
    }

    C15524b(Context context, ViewGroup viewGroup, AbstractC15527a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.f37867p = viewGroup;
            this.f37865n = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f37862k = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f37853b = viewConfiguration.getScaledTouchSlop();
            this.f37872u = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f37861j = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f37864m = new OverScroller(context, f37851w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    private int m28623a(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.f37867p.getWidth();
        float f = (float) (width / 2);
        float a = f + (m28621a(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(a / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo25307b(float f, float f2, int i) {
        boolean a = m28624a(f, f2, i, 1);
        if (m28624a(f2, f, i, 4)) {
            a |= true;
        }
        if (m28624a(f, f2, i, 2)) {
            a |= true;
        }
        if (m28624a(f2, f, i, 8)) {
            a |= true;
        }
        if (a) {
            int[] iArr = this.f37869r;
            iArr[i] = iArr[i] | a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25297a(float f, float f2, int i) {
        m28630d(i);
        float[] fArr = this.f37855d;
        this.f37857f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f37856e;
        this.f37858g[i] = f2;
        fArr2[i] = f2;
        this.f37859h[i] = m28628c((int) f, (int) f2);
        this.f37871t |= 1 << i;
    }

    /* renamed from: a */
    private boolean m28624a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (!((this.f37859h[i] & i2) != i2 || (this.f37863l & i2) == 0 || (this.f37870s[i] & i2) == i2)) {
            int[] iArr = this.f37869r;
            if ((iArr[i] & i2) != i2) {
                int i3 = this.f37853b;
                if ((abs > ((float) i3) || abs2 > ((float) i3)) && (iArr[i] & i2) == 0 && abs > ((float) i3)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m28627b(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int b = m28626b(i3, (int) this.f37861j, (int) this.f37872u);
        int b2 = m28626b(i4, (int) this.f37861j, (int) this.f37872u);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (b != 0) {
            f = (float) abs3;
            f2 = (float) i5;
        } else {
            f = (float) abs;
            f2 = (float) i6;
        }
        float f5 = f / f2;
        if (b2 != 0) {
            f3 = (float) abs4;
            f4 = (float) i5;
        } else {
            f3 = (float) abs2;
            f4 = (float) i6;
        }
        float f6 = f3 / f4;
        return (int) ((((float) m28623a(i, b, 0)) * f5) + (((float) m28623a(i2, b2, this.f37865n.mo25280a())) * f6));
    }

    /* renamed from: a */
    private boolean m28625a(int i, int i2, int i3, int i4) {
        int left = this.f37866o.getLeft();
        int top = this.f37866o.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f37864m.abortAnimation();
            mo25308b(0);
            return false;
        }
        this.f37864m.startScroll(left, top, i5, i6, m28627b(i5, i6, i3, i4));
        mo25308b(2);
        return true;
    }
}
