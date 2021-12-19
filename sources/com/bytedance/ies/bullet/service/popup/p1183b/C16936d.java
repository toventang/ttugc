package com.bytedance.ies.bullet.service.popup.p1183b;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.popup.anim.animationInterpolatorC16924a;
import java.util.Arrays;

/* renamed from: com.bytedance.ies.bullet.service.popup.b.d */
public final class C16936d {

    /* renamed from: w */
    private static final Interpolator f40279w = new animationInterpolatorC16924a();

    /* renamed from: a */
    public int f40280a;

    /* renamed from: b */
    public int f40281b;

    /* renamed from: c */
    public int f40282c = -1;

    /* renamed from: d */
    public float[] f40283d;

    /* renamed from: e */
    public float[] f40284e;

    /* renamed from: f */
    public float[] f40285f;

    /* renamed from: g */
    public float[] f40286g;

    /* renamed from: h */
    public int[] f40287h;

    /* renamed from: i */
    public VelocityTracker f40288i;

    /* renamed from: j */
    public float f40289j;

    /* renamed from: k */
    public int f40290k;

    /* renamed from: l */
    public int f40291l;

    /* renamed from: m */
    public OverScroller f40292m;

    /* renamed from: n */
    public final AbstractC16938a f40293n;

    /* renamed from: o */
    public View f40294o;

    /* renamed from: p */
    public boolean f40295p;

    /* renamed from: q */
    public final ViewGroup f40296q;

    /* renamed from: r */
    public final Runnable f40297r = new Runnable() {
        /* class com.bytedance.ies.bullet.service.popup.p1183b.C16936d.RunnableC169371 */

        static {
            Covode.recordClassIndex(19379);
        }

        public final void run() {
            C16936d.this.mo26777b(0);
        }
    };

    /* renamed from: s */
    private int[] f40298s;

    /* renamed from: t */
    private int[] f40299t;

    /* renamed from: u */
    private int f40300u;

    /* renamed from: v */
    private float f40301v;

    /* renamed from: com.bytedance.ies.bullet.service.popup.b.d$a */
    public static abstract class AbstractC16938a {
        static {
            Covode.recordClassIndex(19380);
        }

        /* renamed from: a */
        public int mo26739a() {
            return 0;
        }

        /* renamed from: a */
        public int mo26740a(View view) {
            return 0;
        }

        /* renamed from: a */
        public void mo26741a(int i) {
        }

        /* renamed from: a */
        public void mo26742a(View view, float f) {
        }

        /* renamed from: a */
        public abstract boolean mo26743a(View view, int i);

        /* renamed from: a */
        public abstract boolean mo26744a(View view, MotionEvent motionEvent);

        /* renamed from: b */
        public void mo26745b(int i) {
        }

        /* renamed from: c */
        public int mo26746c(int i) {
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo26770a(View view, int i) {
        if (view.getParent() == this.f40296q) {
            this.f40294o = view;
            this.f40282c = i;
            mo26777b(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f40296q + ")");
    }

    /* renamed from: a */
    public final boolean mo26773a(View view, int i, int i2) {
        this.f40294o = view;
        this.f40282c = -1;
        boolean a = mo26771a(i, i2, 0, 0);
        if (!a && this.f40280a == 0 && this.f40294o != null) {
            this.f40294o = null;
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo26771a(int i, int i2, int i3, int i4) {
        int left = this.f40294o.getLeft();
        int top = this.f40294o.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f40292m.abortAnimation();
            mo26777b(0);
            return false;
        }
        this.f40292m.startScroll(left, top, i5, i6, m31214b(i5, i6, i3, i4));
        mo26777b(2);
        return true;
    }

    /* renamed from: a */
    public final void mo26768a(int i) {
        if (this.f40283d != null && m31217e(i)) {
            this.f40283d[i] = 0.0f;
            this.f40284e[i] = 0.0f;
            this.f40285f[i] = 0.0f;
            this.f40286g[i] = 0.0f;
            this.f40287h[i] = 0;
            this.f40298s[i] = 0;
            this.f40299t[i] = 0;
            this.f40300u = ((1 << i) ^ -1) & this.f40300u;
        }
    }

    /* renamed from: a */
    public final void mo26769a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (mo26779c(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f40285f[pointerId] = x;
                this.f40286g[pointerId] = y;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo26774a(View view, int i, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && mo26774a(childAt, i, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (view.canScrollHorizontally(-i) || view.canScrollVertically(-i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo26772a(View view, float f) {
        return view != null && this.f40293n.mo26739a() > 0 && Math.abs(f) > ((float) this.f40281b);
    }

    static {
        Covode.recordClassIndex(19378);
    }

    /* renamed from: c */
    private void m31215c() {
        float[] fArr = this.f40283d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f40284e, 0.0f);
            Arrays.fill(this.f40285f, 0.0f);
            Arrays.fill(this.f40286g, 0.0f);
            Arrays.fill(this.f40287h, 0);
            Arrays.fill(this.f40298s, 0);
            Arrays.fill(this.f40299t, 0);
            this.f40300u = 0;
        }
    }

    /* renamed from: b */
    public final void mo26775b() {
        this.f40288i.computeCurrentVelocity(1000, this.f40301v);
        m31208a(this.f40288i.getXVelocity(this.f40282c), this.f40289j, this.f40301v);
        mo26766a(m31208a(this.f40288i.getYVelocity(this.f40282c), this.f40289j, this.f40301v));
    }

    /* renamed from: a */
    public final void mo26765a() {
        this.f40282c = -1;
        m31215c();
        VelocityTracker velocityTracker = this.f40288i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f40288i = null;
        }
    }

    /* renamed from: b */
    private static float m31211b(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: e */
    private boolean m31217e(int i) {
        if (((1 << i) & this.f40300u) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo26779c(int i) {
        if (!m31217e(i)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m31216d(int i) {
        float[] fArr = this.f40283d;
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
                float[] fArr6 = this.f40284e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f40285f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f40286g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f40287h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f40298s;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f40299t;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f40283d = fArr2;
            this.f40284e = fArr3;
            this.f40285f = fArr4;
            this.f40286g = fArr5;
            this.f40287h = iArr;
            this.f40298s = iArr2;
            this.f40299t = iArr3;
        }
    }

    /* renamed from: a */
    public final void mo26766a(float f) {
        this.f40295p = true;
        this.f40293n.mo26742a(this.f40294o, f);
        this.f40295p = false;
        if (this.f40280a == 1) {
            mo26777b(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo26777b(int i) {
        this.f40296q.removeCallbacks(this.f40297r);
        if (this.f40280a != i) {
            this.f40280a = i;
            this.f40293n.mo26745b(i);
            if (this.f40280a == 0) {
                this.f40294o = null;
            }
        }
    }

    /* renamed from: b */
    private int m31212b(int i, int i2) {
        int i3;
        if (i < this.f40296q.getLeft() + this.f40290k) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f40296q.getTop() + this.f40290k) {
            i3 |= 4;
        }
        if (i > this.f40296q.getRight() - this.f40290k) {
            i3 |= 2;
        }
        if (i2 > this.f40296q.getBottom() - this.f40290k) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: a */
    public final View mo26764a(int i, int i2) {
        for (int childCount = this.f40296q.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f40296q.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo26778b(View view, int i) {
        if (view == this.f40294o && this.f40282c == i) {
            return true;
        }
        if (view == null || !this.f40293n.mo26743a(view, i)) {
            return false;
        }
        this.f40282c = i;
        mo26770a(view, i);
        return true;
    }

    /* renamed from: a */
    private static float m31208a(float f, float f2, float f3) {
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

    /* renamed from: b */
    private static int m31213b(int i, int i2, int i3) {
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

    public C16936d(Context context, ViewGroup viewGroup, AbstractC16938a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.f40296q = viewGroup;
            this.f40293n = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f40290k = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f40281b = viewConfiguration.getScaledTouchSlop();
            this.f40301v = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f40289j = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f40292m = new OverScroller(context, f40279w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    private int m31209a(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.f40296q.getWidth();
        float f = (float) (width / 2);
        float b = f + (m31211b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(b / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 300);
    }

    /* renamed from: b */
    public final void mo26776b(float f, float f2, int i) {
        boolean a = m31210a(f, f2, i, 1);
        if (m31210a(f2, f, i, 4)) {
            a |= true;
        }
        if (m31210a(f, f2, i, 2)) {
            a |= true;
        }
        if (m31210a(f2, f, i, 8)) {
            a |= true;
        }
        if (a) {
            int[] iArr = this.f40298s;
            iArr[i] = iArr[i] | a;
        }
    }

    /* renamed from: a */
    public final void mo26767a(float f, float f2, int i) {
        m31216d(i);
        float[] fArr = this.f40283d;
        this.f40285f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f40284e;
        this.f40286g[i] = f2;
        fArr2[i] = f2;
        this.f40287h[i] = m31212b((int) f, (int) f2);
        this.f40300u |= 1 << i;
    }

    /* renamed from: a */
    private boolean m31210a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (!((this.f40287h[i] & i2) != i2 || (this.f40291l & i2) == 0 || (this.f40299t[i] & i2) == i2)) {
            int[] iArr = this.f40298s;
            if ((iArr[i] & i2) != i2) {
                int i3 = this.f40281b;
                if ((abs > ((float) i3) || abs2 > ((float) i3)) && (iArr[i] & i2) == 0 && abs > ((float) i3)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m31214b(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int b = m31213b(i3, (int) this.f40289j, (int) this.f40301v);
        int b2 = m31213b(i4, (int) this.f40289j, (int) this.f40301v);
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
        return (int) ((((float) m31209a(i, b, 0)) * f5) + (((float) m31209a(i2, b2, this.f40293n.mo26739a())) * f6));
    }
}
