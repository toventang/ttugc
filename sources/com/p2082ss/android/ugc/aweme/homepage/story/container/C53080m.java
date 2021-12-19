package com.p2082ss.android.ugc.aweme.homepage.story.container;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.container.m */
public class C53080m {

    /* renamed from: x */
    private static final Interpolator f122053x = new Interpolator() {
        /* class com.p2082ss.android.ugc.aweme.homepage.story.container.C53080m.animationInterpolatorC530811 */

        static {
            Covode.recordClassIndex(62626);
        }

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    public int f122054a;

    /* renamed from: b */
    public int f122055b;

    /* renamed from: c */
    public int f122056c = -1;

    /* renamed from: d */
    float[] f122057d;

    /* renamed from: e */
    float[] f122058e;

    /* renamed from: f */
    float[] f122059f;

    /* renamed from: g */
    float[] f122060g;

    /* renamed from: h */
    int[] f122061h;

    /* renamed from: i */
    VelocityTracker f122062i;

    /* renamed from: j */
    public float f122063j;

    /* renamed from: k */
    public int f122064k;

    /* renamed from: l */
    public final int f122065l;

    /* renamed from: m */
    public int f122066m;

    /* renamed from: n */
    final AbstractC53083a f122067n;

    /* renamed from: o */
    public View f122068o;

    /* renamed from: p */
    boolean f122069p;

    /* renamed from: q */
    private int[] f122070q;

    /* renamed from: r */
    private int[] f122071r;

    /* renamed from: s */
    private int[] f122072s;

    /* renamed from: t */
    private int f122073t;

    /* renamed from: u */
    private float f122074u;

    /* renamed from: v */
    private OverScroller f122075v;

    /* renamed from: w */
    private final ViewGroup f122076w;

    /* renamed from: y */
    private final Runnable f122077y = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.homepage.story.container.C53080m.RunnableC530822 */

        static {
            Covode.recordClassIndex(62627);
        }

        public final void run() {
            C53080m.this.mo89610c(0);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.m$a */
    public static abstract class AbstractC53083a {
        static {
            Covode.recordClassIndex(62628);
        }

        /* renamed from: a */
        public void mo89548a(int i) {
        }

        /* renamed from: a */
        public void mo89549a(View view, float f) {
        }

        /* renamed from: a */
        public void mo89550a(View view, int i) {
        }

        /* renamed from: a */
        public boolean mo89551a(float f, float f2, float f3, float f4, int i, View view) {
            return false;
        }

        /* renamed from: a */
        public abstract boolean mo89552a(View view);

        /* renamed from: b */
        public int mo89553b(View view, int i) {
            return 0;
        }

        /* renamed from: b */
        public void mo89554b(View view) {
        }

        /* renamed from: c */
        public int mo89555c(View view) {
            return 0;
        }

        /* renamed from: d */
        public int mo89556d(View view) {
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo89601a(View view, int i) {
        if (view.getParent() == this.f122076w) {
            this.f122068o = view;
            this.f122056c = i;
            this.f122067n.mo89554b(view);
            mo89610c(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f122076w + ")");
    }

    /* renamed from: a */
    public final boolean mo89604a(View view, int i, int i2) {
        this.f122068o = view;
        this.f122056c = -1;
        boolean a = mo89602a(i, i2, 0, 0);
        if (!a && this.f122054a == 0 && this.f122068o != null) {
            this.f122068o = null;
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo89602a(int i, int i2, int i3, int i4) {
        int left = this.f122068o.getLeft();
        int top = this.f122068o.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f122075v.abortAnimation();
            mo89610c(0);
            return false;
        }
        this.f122075v.startScroll(left, top, i5, i6, m98090a(this.f122068o, i5, i6, i3, i4));
        mo89610c(2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo89599a(int i) {
        if (this.f122057d != null && mo89607b(i)) {
            this.f122057d[i] = 0.0f;
            this.f122058e[i] = 0.0f;
            this.f122059f[i] = 0.0f;
            this.f122060g[i] = 0.0f;
            this.f122061h[i] = 0;
            this.f122070q[i] = 0;
            this.f122071r[i] = 0;
            this.f122072s[i] = 0;
            this.f122073t = ((1 << i) ^ -1) & this.f122073t;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo89598a(float f, float f2, int i) {
        m98097e(i);
        float[] fArr = this.f122057d;
        this.f122059f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f122058e;
        this.f122060g[i] = f2;
        fArr2[i] = f2;
        this.f122061h[i] = m98093b((int) f, (int) f2);
        this.f122073t |= 1 << i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo89600a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (mo89611d(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f122059f[pointerId] = x;
                this.f122060g[pointerId] = y;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo89597a(float f, float f2, float f3, float f4, int i, View view) {
        float abs = Math.abs(f3);
        Math.abs(f4);
        if (m98095c(abs, abs, i) && abs > ((float) this.f122055b) && this.f122067n.mo89551a(f, f2, f3, f4, i, view)) {
            int[] iArr = this.f122071r;
            iArr[i] = iArr[i] | 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo89603a(View view, float f) {
        return view != null && this.f122067n.mo89555c(view) > 0 && Math.abs(f) > ((float) this.f122055b);
    }

    static {
        Covode.recordClassIndex(62625);
    }

    /* renamed from: d */
    private void m98096d() {
        float[] fArr = this.f122057d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f122058e, 0.0f);
            Arrays.fill(this.f122059f, 0.0f);
            Arrays.fill(this.f122060g, 0.0f);
            Arrays.fill(this.f122061h, 0);
            Arrays.fill(this.f122070q, 0);
            Arrays.fill(this.f122071r, 0);
            Arrays.fill(this.f122072s, 0);
            this.f122073t = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo89609c() {
        this.f122062i.computeCurrentVelocity(1000, this.f122074u);
        float a = m98088a(this.f122062i.getXVelocity(this.f122056c), this.f122063j, this.f122074u);
        m98088a(this.f122062i.getYVelocity(this.f122056c), this.f122063j, this.f122074u);
        mo89596a(a);
    }

    /* renamed from: b */
    public final boolean mo89606b() {
        if (this.f122054a == 2) {
            boolean computeScrollOffset = this.f122075v.computeScrollOffset();
            int currX = this.f122075v.getCurrX();
            int currY = this.f122075v.getCurrY();
            int left = currX - this.f122068o.getLeft();
            int top = currY - this.f122068o.getTop();
            if (left != 0) {
                C0792v.m2769e(this.f122068o, left);
            }
            if (top != 0) {
                C0792v.m2767d(this.f122068o, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f122067n.mo89550a(this.f122068o, currX);
            }
            if (computeScrollOffset) {
                if (currX == this.f122075v.getFinalX() && currY == this.f122075v.getFinalY()) {
                    this.f122075v.abortAnimation();
                }
            }
            this.f122076w.post(this.f122077y);
        }
        if (this.f122054a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo89595a() {
        this.f122056c = -1;
        m98096d();
        VelocityTracker velocityTracker = this.f122062i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f122062i = null;
        }
    }

    /* renamed from: b */
    private static float m98092b(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo89611d(int i) {
        if (!mo89607b(i)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m98097e(int i) {
        float[] fArr = this.f122057d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            int[] iArr4 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f122058e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f122059f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f122060g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr5 = this.f122061h;
                System.arraycopy(iArr5, 0, iArr, 0, iArr5.length);
                int[] iArr6 = this.f122070q;
                System.arraycopy(iArr6, 0, iArr2, 0, iArr6.length);
                int[] iArr7 = this.f122071r;
                System.arraycopy(iArr7, 0, iArr3, 0, iArr7.length);
                int[] iArr8 = this.f122072s;
                System.arraycopy(iArr8, 0, iArr4, 0, iArr8.length);
            }
            this.f122057d = fArr2;
            this.f122058e = fArr3;
            this.f122059f = fArr4;
            this.f122060g = fArr5;
            this.f122061h = iArr;
            this.f122070q = iArr2;
            this.f122071r = iArr3;
            this.f122072s = iArr4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo89610c(int i) {
        this.f122076w.removeCallbacks(this.f122077y);
        if (this.f122054a != i) {
            this.f122054a = i;
            this.f122067n.mo89548a(i);
            if (this.f122054a == 0) {
                this.f122068o = null;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo89607b(int i) {
        if (((1 << i) & this.f122073t) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo89596a(float f) {
        this.f122069p = true;
        this.f122067n.mo89549a(this.f122068o, f);
        this.f122069p = false;
        if (this.f122054a == 1) {
            mo89610c(0);
        }
    }

    /* renamed from: b */
    private int m98093b(int i, int i2) {
        int i3;
        if (i < this.f122076w.getLeft() + this.f122064k) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f122076w.getTop() + this.f122064k) {
            i3 |= 4;
        }
        if (i > this.f122076w.getRight() - this.f122064k) {
            i3 |= 2;
        }
        if (i2 > this.f122076w.getBottom() - this.f122064k) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: a */
    public final View mo89594a(int i, int i2) {
        for (int childCount = this.f122076w.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f122076w.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo89608b(View view, int i) {
        if (view == this.f122068o && this.f122056c == i) {
            return true;
        }
        if (view == null) {
            return false;
        }
        this.f122067n.mo89552a(view);
        return false;
    }

    /* renamed from: a */
    private static float m98088a(float f, float f2, float f3) {
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
    private static int m98094b(int i, int i2, int i3) {
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

    /* renamed from: c */
    private boolean m98095c(float f, float f2, int i) {
        int[] iArr = this.f122071r;
        if ((iArr[i] & 1) != 1) {
            int i2 = this.f122055b;
            if ((f > ((float) i2) || f2 > ((float) i2)) && (iArr[i] & 1) == 0) {
                return true;
            }
        }
        return false;
    }

    C53080m(Context context, ViewGroup viewGroup, AbstractC53083a aVar) {
        if (aVar != null) {
            this.f122076w = viewGroup;
            this.f122067n = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f122065l = i;
            this.f122064k = i;
            this.f122055b = viewConfiguration.getScaledTouchSlop();
            this.f122074u = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f122063j = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f122075v = new OverScroller(context, f122053x);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    /* renamed from: a */
    private int m98089a(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.f122076w.getWidth();
        float f = (float) (width / 2);
        float b = f + (m98092b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(b / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo89605b(float f, float f2, int i) {
        boolean a = m98091a(f, f2, i, 1);
        if (m98091a(f2, f, i, 4)) {
            a |= true;
        }
        if (m98091a(f, f2, i, 2)) {
            a |= true;
        }
        if (m98091a(f2, f, i, 8)) {
            a |= true;
        }
        if (a) {
            int[] iArr = this.f122070q;
            iArr[i] = iArr[i] | a;
        }
    }

    /* renamed from: a */
    private boolean m98091a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (!((this.f122061h[i] & i2) != i2 || (this.f122066m & i2) == 0 || (this.f122072s[i] & i2) == i2)) {
            int[] iArr = this.f122070q;
            if ((iArr[i] & i2) != i2) {
                int i3 = this.f122055b;
                if ((abs > ((float) i3) || abs2 > ((float) i3)) && (iArr[i] & i2) == 0 && abs > ((float) i3)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private int m98090a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int b = m98094b(i3, (int) this.f122063j, (int) this.f122074u);
        int b2 = m98094b(i4, (int) this.f122063j, (int) this.f122074u);
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
        return (int) ((((float) m98089a(i, b, this.f122067n.mo89555c(view))) * f5) + (((float) m98089a(i2, b2, 0)) * f6));
    }
}
