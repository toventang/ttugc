package com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview;

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
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38615aa;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.c */
public final class C37979c {

    /* renamed from: s */
    private static float f89741s = 1.0f;

    /* renamed from: x */
    private static final Interpolator f89742x = new Interpolator() {
        /* class com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37979c.animationInterpolatorC379801 */

        static {
            Covode.recordClassIndex(45440);
        }

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    public int f89743a;

    /* renamed from: b */
    public int f89744b;

    /* renamed from: c */
    public int f89745c = -1;

    /* renamed from: d */
    float[] f89746d;

    /* renamed from: e */
    float[] f89747e;

    /* renamed from: f */
    float[] f89748f;

    /* renamed from: g */
    float[] f89749g;

    /* renamed from: h */
    int[] f89750h;

    /* renamed from: i */
    VelocityTracker f89751i;

    /* renamed from: j */
    public float f89752j;

    /* renamed from: k */
    public int f89753k;

    /* renamed from: l */
    public int f89754l;

    /* renamed from: m */
    OverScroller f89755m;

    /* renamed from: n */
    final AbstractC37982a f89756n;

    /* renamed from: o */
    public View f89757o;

    /* renamed from: p */
    boolean f89758p;

    /* renamed from: q */
    final ViewGroup f89759q;

    /* renamed from: r */
    final Runnable f89760r = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.C37979c.RunnableC379812 */

        static {
            Covode.recordClassIndex(45441);
        }

        public final void run() {
            C37979c.this.mo66221b(0);
        }
    };

    /* renamed from: t */
    private int[] f89761t;

    /* renamed from: u */
    private int[] f89762u;

    /* renamed from: v */
    private int f89763v;

    /* renamed from: w */
    private float f89764w;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.c$a */
    public static abstract class AbstractC37982a {
        static {
            Covode.recordClassIndex(45442);
        }

        /* renamed from: a */
        public int mo66051a() {
            return 0;
        }

        /* renamed from: a */
        public int mo66052a(View view) {
            return 0;
        }

        /* renamed from: a */
        public void mo66053a(int i) {
        }

        /* renamed from: a */
        public void mo66054a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public abstract boolean mo66055a(View view, int i);

        /* renamed from: b */
        public int mo66056b() {
            return 0;
        }

        /* renamed from: b */
        public void mo66057b(int i) {
        }

        /* renamed from: c */
        public int mo66058c(int i) {
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo66214a(View view, int i) {
        if (view.getParent() == this.f89759q) {
            this.f89757o = view;
            this.f89745c = i;
            mo66221b(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the AdPopUpWebViewDragHelper's tracked parent view (" + this.f89759q + ")");
    }

    /* renamed from: a */
    public final boolean mo66217a(View view, int i, int i2) {
        this.f89757o = view;
        this.f89745c = -1;
        boolean a = mo66215a(i, i2, 0, 0);
        if (!a && this.f89743a == 0 && this.f89757o != null) {
            this.f89757o = null;
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo66218a(View view, int i, int i2, boolean z) {
        float f;
        if (z) {
            f = 0.8f;
        } else {
            f = 1.0f;
        }
        f89741s = f;
        return mo66217a(view, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo66215a(int i, int i2, int i3, int i4) {
        int left = this.f89757o.getLeft();
        int top = this.f89757o.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0 && !C38615aa.f91251i) {
            this.f89755m.abortAnimation();
            mo66221b(0);
            return false;
        }
        this.f89755m.startScroll(left, top, i5, i6, m76999b(i5, i6, i3, i4));
        mo66221b(2);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66213a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (mo66223c(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f89748f[pointerId] = x;
                this.f89749g[pointerId] = y;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo66216a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f89756n.mo66056b() > 0;
        boolean z2 = this.f89756n.mo66051a() > 0;
        if (!z) {
            return z2 && Math.abs(f2) > ((float) this.f89744b);
        }
        if (!z2) {
            return Math.abs(f) > ((float) this.f89744b);
        }
        int i = this.f89744b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66212a(int i, int i2, int i3) {
        int left = this.f89757o.getLeft();
        int top = this.f89757o.getTop();
        if (i2 != 0) {
            C0792v.m2769e(this.f89757o, this.f89756n.mo66052a(this.f89757o) - left);
        }
        if (i3 != 0) {
            i = this.f89756n.mo66058c(i);
            C0792v.m2767d(this.f89757o, i - top);
        }
        if (i2 != 0 || i3 != 0) {
            this.f89756n.mo66053a(i);
        }
    }

    static {
        Covode.recordClassIndex(45439);
    }

    /* renamed from: c */
    private void m77001c() {
        float[] fArr = this.f89746d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f89747e, 0.0f);
            Arrays.fill(this.f89748f, 0.0f);
            Arrays.fill(this.f89749g, 0.0f);
            Arrays.fill(this.f89750h, 0);
            Arrays.fill(this.f89761t, 0);
            Arrays.fill(this.f89762u, 0);
            this.f89763v = 0;
        }
    }

    /* renamed from: a */
    public final void mo66208a() {
        this.f89745c = -1;
        m77001c();
        VelocityTracker velocityTracker = this.f89751i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f89751i = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo66219b() {
        this.f89751i.computeCurrentVelocity(1000, this.f89764w);
        mo66209a(m76995a(this.f89751i.getXVelocity(this.f89745c), this.f89752j, this.f89764w), m76995a(this.f89751i.getYVelocity(this.f89745c), this.f89752j, this.f89764w));
    }

    /* renamed from: a */
    private static float m76994a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: e */
    private boolean m77003e(int i) {
        if (((1 << i) & this.f89763v) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo66221b(int i) {
        this.f89759q.removeCallbacks(this.f89760r);
        if (this.f89743a != i) {
            this.f89743a = i;
            this.f89756n.mo66057b(i);
            if (this.f89743a == 0) {
                this.f89757o = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo66223c(int i) {
        if (!m77003e(i)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m77002d(int i) {
        float[] fArr = this.f89746d;
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
                float[] fArr6 = this.f89747e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f89748f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f89749g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f89750h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f89761t;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f89762u;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f89746d = fArr2;
            this.f89747e = fArr3;
            this.f89748f = fArr4;
            this.f89749g = fArr5;
            this.f89750h = iArr;
            this.f89761t = iArr2;
            this.f89762u = iArr3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66211a(int i) {
        if (this.f89746d != null && m77003e(i)) {
            this.f89746d[i] = 0.0f;
            this.f89747e[i] = 0.0f;
            this.f89748f[i] = 0.0f;
            this.f89749g[i] = 0.0f;
            this.f89750h[i] = 0;
            this.f89761t[i] = 0;
            this.f89762u[i] = 0;
            this.f89763v = ((1 << i) ^ -1) & this.f89763v;
        }
    }

    /* renamed from: b */
    private int m76997b(int i, int i2) {
        int i3;
        if (i < this.f89759q.getLeft() + this.f89753k) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f89759q.getTop() + this.f89753k) {
            i3 |= 4;
        }
        if (i > this.f89759q.getRight() - this.f89753k) {
            i3 |= 2;
        }
        if (i2 > this.f89759q.getBottom() - this.f89753k) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: a */
    public final View mo66207a(int i, int i2) {
        for (int childCount = this.f89759q.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f89759q.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66209a(float f, float f2) {
        this.f89758p = true;
        this.f89756n.mo66054a(this.f89757o, f, f2);
        this.f89758p = false;
        if (this.f89743a == 1) {
            mo66221b(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo66222b(View view, int i) {
        if (view == this.f89757o && this.f89745c == i) {
            return true;
        }
        if (view == null || !this.f89756n.mo66055a(view, i)) {
            return false;
        }
        this.f89745c = i;
        mo66214a(view, i);
        return true;
    }

    /* renamed from: c */
    private static int m77000c(int i, int i2, int i3) {
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
    private static float m76995a(float f, float f2, float f3) {
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

    C37979c(Context context, ViewGroup viewGroup, AbstractC37982a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.f89759q = viewGroup;
            this.f89756n = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f89753k = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f89744b = viewConfiguration.getScaledTouchSlop();
            this.f89764w = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f89752j = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f89755m = new OverScroller(context, f89742x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: b */
    private int m76998b(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.f89759q.getWidth();
        float f = (float) (width / 2);
        float a = f + (m76994a(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(a / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66210a(float f, float f2, int i) {
        m77002d(i);
        float[] fArr = this.f89746d;
        this.f89748f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f89747e;
        this.f89749g[i] = f2;
        fArr2[i] = f2;
        this.f89750h[i] = m76997b((int) f, (int) f2);
        this.f89763v |= 1 << i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo66220b(float f, float f2, int i) {
        boolean a = m76996a(f, f2, i, 1);
        if (m76996a(f2, f, i, 4)) {
            a |= true;
        }
        if (m76996a(f, f2, i, 2)) {
            a |= true;
        }
        if (m76996a(f2, f, i, 8)) {
            a |= true;
        }
        if (a) {
            int[] iArr = this.f89761t;
            iArr[i] = iArr[i] | a;
        }
    }

    /* renamed from: a */
    private boolean m76996a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (!((this.f89750h[i] & i2) != i2 || (this.f89754l & i2) == 0 || (this.f89762u[i] & i2) == i2)) {
            int[] iArr = this.f89761t;
            if ((iArr[i] & i2) != i2) {
                int i3 = this.f89744b;
                if ((abs > ((float) i3) || abs2 > ((float) i3)) && (iArr[i] & i2) == 0 && abs > ((float) i3)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m76999b(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int c = m77000c(i3, (int) this.f89752j, (int) this.f89764w);
        int c2 = m77000c(i4, (int) this.f89752j, (int) this.f89764w);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(c);
        int abs4 = Math.abs(c2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (c != 0) {
            f = (float) abs3;
            f2 = (float) i5;
        } else {
            f = (float) abs;
            f2 = (float) i6;
        }
        float f5 = f / f2;
        if (c2 != 0) {
            f3 = (float) abs4;
            f4 = (float) i5;
        } else {
            f3 = (float) abs2;
            f4 = (float) i6;
        }
        float f6 = f3 / f4;
        return (int) (((((float) m76998b(i, c, this.f89756n.mo66056b())) * f5) + (((float) m76998b(i2, c2, this.f89756n.mo66051a())) * f6)) * f89741s);
    }
}
