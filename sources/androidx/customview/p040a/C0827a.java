package androidx.customview.p040a;

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

/* renamed from: androidx.customview.a.a */
public class C0827a {

    /* renamed from: v */
    private static final Interpolator f3064v = new Interpolator() {
        /* class androidx.customview.p040a.C0827a.animationInterpolatorC08281 */

        static {
            Covode.recordClassIndex(911);
        }

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    public int f3065a;

    /* renamed from: b */
    public int f3066b;

    /* renamed from: c */
    public int f3067c = -1;

    /* renamed from: d */
    public float[] f3068d;

    /* renamed from: e */
    public float[] f3069e;

    /* renamed from: f */
    public float[] f3070f;

    /* renamed from: g */
    public float[] f3071g;

    /* renamed from: h */
    public float f3072h;

    /* renamed from: i */
    public int f3073i;

    /* renamed from: j */
    public int f3074j;

    /* renamed from: k */
    public View f3075k;

    /* renamed from: l */
    private int[] f3076l;

    /* renamed from: m */
    private int[] f3077m;

    /* renamed from: n */
    private int[] f3078n;

    /* renamed from: o */
    private int f3079o;

    /* renamed from: p */
    private VelocityTracker f3080p;

    /* renamed from: q */
    private float f3081q;

    /* renamed from: r */
    private OverScroller f3082r;

    /* renamed from: s */
    private final AbstractC0830a f3083s;

    /* renamed from: t */
    private boolean f3084t;

    /* renamed from: u */
    private final ViewGroup f3085u;

    /* renamed from: w */
    private final Runnable f3086w = new Runnable() {
        /* class androidx.customview.p040a.C0827a.RunnableC08292 */

        static {
            Covode.recordClassIndex(912);
        }

        public final void run() {
            C0827a.this.mo3025b(0);
        }
    };

    /* renamed from: androidx.customview.a.a$a */
    public static abstract class AbstractC0830a {
        static {
            Covode.recordClassIndex(913);
        }

        /* renamed from: a */
        public int mo3030a(View view) {
            return 0;
        }

        /* renamed from: a */
        public int mo3031a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: a */
        public void mo3032a() {
        }

        /* renamed from: a */
        public void mo3033a(int i) {
        }

        /* renamed from: a */
        public void mo3034a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo3035a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public void mo3036a(View view, int i) {
        }

        /* renamed from: a */
        public void mo3037a(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: b */
        public int mo3038b() {
            return 0;
        }

        /* renamed from: b */
        public abstract boolean mo3039b(View view, int i);

        /* renamed from: c */
        public int mo3040c(View view, int i) {
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo3018a(View view, int i) {
        if (view.getParent() == this.f3085u) {
            this.f3075k = view;
            this.f3067c = i;
            this.f3083s.mo3036a(view, i);
            mo3025b(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f3085u + ")");
    }

    /* renamed from: a */
    public final void mo3017a() {
        this.f3067c = -1;
        float[] fArr = this.f3068d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3069e, 0.0f);
            Arrays.fill(this.f3070f, 0.0f);
            Arrays.fill(this.f3071g, 0.0f);
            Arrays.fill(this.f3076l, 0);
            Arrays.fill(this.f3077m, 0);
            Arrays.fill(this.f3078n, 0);
            this.f3079o = 0;
        }
        VelocityTracker velocityTracker = this.f3080p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3080p = null;
        }
    }

    /* renamed from: a */
    public final boolean mo3022a(View view, int i, int i2) {
        this.f3075k = view;
        this.f3067c = -1;
        boolean a = m2928a(i, i2, 0, 0);
        if (!a && this.f3065a == 0 && this.f3075k != null) {
            this.f3075k = null;
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo3020a(int i, int i2) {
        if (this.f3084t) {
            return m2928a(i, i2, (int) this.f3080p.getXVelocity(this.f3067c), (int) this.f3080p.getYVelocity(this.f3067c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: a */
    private boolean m2928a(int i, int i2, int i3, int i4) {
        int left = this.f3075k.getLeft();
        int top = this.f3075k.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f3082r.abortAnimation();
            mo3025b(0);
            return false;
        }
        this.f3082r.startScroll(left, top, i5, i6, m2922a(this.f3075k, i5, i6, i3, i4));
        mo3025b(2);
        return true;
    }

    /* renamed from: a */
    public final boolean mo3019a(int i) {
        return ((1 << i) & this.f3079o) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d6, code lost:
        if (r3 != r6) goto L_0x00de;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3021a(android.view.MotionEvent r17) {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.p040a.C0827a.mo3021a(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private boolean m2927a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (!((this.f3076l[i] & i2) != i2 || (this.f3074j & i2) == 0 || (this.f3078n[i] & i2) == i2)) {
            int[] iArr = this.f3077m;
            if ((iArr[i] & i2) != i2) {
                int i3 = this.f3066b;
                if ((abs > ((float) i3) || abs2 > ((float) i3)) && (iArr[i] & i2) == 0 && abs > ((float) i3)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m2929a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f3083s.mo3030a(view) > 0;
        boolean z2 = this.f3083s.mo3038b() > 0;
        if (!z) {
            return z2 && Math.abs(f2) > ((float) this.f3066b);
        }
        if (!z2) {
            return Math.abs(f) > ((float) this.f3066b);
        }
        int i = this.f3066b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    static {
        Covode.recordClassIndex(910);
    }

    /* renamed from: d */
    private void m2935d() {
        this.f3080p.computeCurrentVelocity(1000, this.f3081q);
        m2925a(m2920a(this.f3080p.getXVelocity(this.f3067c), this.f3072h, this.f3081q), m2920a(this.f3080p.getYVelocity(this.f3067c), this.f3072h, this.f3081q));
    }

    /* renamed from: b */
    public final void mo3024b() {
        mo3017a();
        if (this.f3065a == 2) {
            int currX = this.f3082r.getCurrX();
            int currY = this.f3082r.getCurrY();
            this.f3082r.abortAnimation();
            int currX2 = this.f3082r.getCurrX();
            int currY2 = this.f3082r.getCurrY();
            this.f3083s.mo3037a(this.f3075k, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        mo3025b(0);
    }

    /* renamed from: c */
    public final boolean mo3027c() {
        if (this.f3065a == 2) {
            boolean computeScrollOffset = this.f3082r.computeScrollOffset();
            int currX = this.f3082r.getCurrX();
            int currY = this.f3082r.getCurrY();
            int left = currX - this.f3075k.getLeft();
            int top = currY - this.f3075k.getTop();
            if (left != 0) {
                C0792v.m2769e(this.f3075k, left);
            }
            if (top != 0) {
                C0792v.m2767d(this.f3075k, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f3083s.mo3037a(this.f3075k, currX, currY, left, top);
            }
            if (computeScrollOffset) {
                if (currX == this.f3082r.getFinalX() && currY == this.f3082r.getFinalY()) {
                    this.f3082r.abortAnimation();
                }
            }
            this.f3085u.post(this.f3086w);
        }
        if (this.f3065a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static float m2919a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: d */
    private boolean m2936d(int i) {
        if (!mo3019a(i)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m2933c(int i) {
        if (this.f3068d != null && mo3019a(i)) {
            this.f3068d[i] = 0.0f;
            this.f3069e[i] = 0.0f;
            this.f3070f[i] = 0.0f;
            this.f3071g[i] = 0.0f;
            this.f3076l[i] = 0;
            this.f3077m[i] = 0;
            this.f3078n[i] = 0;
            this.f3079o = ((1 << i) ^ -1) & this.f3079o;
        }
    }

    /* renamed from: c */
    private void m2934c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m2936d(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f3070f[pointerId] = x;
                this.f3071g[pointerId] = y;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3025b(int i) {
        this.f3085u.removeCallbacks(this.f3086w);
        if (this.f3065a != i) {
            this.f3065a = i;
            this.f3083s.mo3033a(i);
            if (this.f3065a == 0) {
                this.f3075k = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015e, code lost:
        if (r10.f3067c == -1) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0160, code lost:
        m2935d();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3026b(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 441
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.p040a.C0827a.mo3026b(android.view.MotionEvent):void");
    }

    /* renamed from: b */
    private boolean m2932b(View view, int i) {
        if (view == this.f3075k && this.f3067c == i) {
            return true;
        }
        if (view == null || !this.f3083s.mo3039b(view, i)) {
            return false;
        }
        this.f3067c = i;
        mo3018a(view, i);
        return true;
    }

    /* renamed from: b */
    public final View mo3023b(int i, int i2) {
        for (int childCount = this.f3085u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f3085u.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C0827a m2924a(ViewGroup viewGroup, AbstractC0830a aVar) {
        return new C0827a(viewGroup.getContext(), viewGroup, aVar);
    }

    /* renamed from: a */
    private void m2925a(float f, float f2) {
        this.f3084t = true;
        this.f3083s.mo3035a(this.f3075k, f, f2);
        this.f3084t = false;
        if (this.f3065a == 1) {
            mo3025b(0);
        }
    }

    /* renamed from: b */
    private static int m2930b(int i, int i2, int i3) {
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
    private static float m2920a(float f, float f2, float f3) {
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

    /* renamed from: a */
    public static C0827a m2923a(ViewGroup viewGroup, float f, AbstractC0830a aVar) {
        C0827a a = m2924a(viewGroup, aVar);
        a.f3066b = (int) (((float) a.f3066b) * (1.0f / f));
        return a;
    }

    /* renamed from: b */
    private void m2931b(float f, float f2, int i) {
        boolean a = m2927a(f, f2, i, 1);
        if (m2927a(f2, f, i, 4)) {
            a |= true;
        }
        if (m2927a(f, f2, i, 2)) {
            boolean z = a ? 1 : 0;
            char c = a ? 1 : 0;
            a = z | true;
        }
        if (m2927a(f2, f, i, 8)) {
            boolean z2 = a ? 1 : 0;
            char c2 = a ? 1 : 0;
            a = z2 | true;
        }
        if (a) {
            int[] iArr = this.f3077m;
            int i2 = iArr[i];
            int i3 = a ? 1 : 0;
            char c3 = a ? 1 : 0;
            iArr[i] = i2 | i3;
            AbstractC0830a aVar = this.f3083s;
            int i4 = a ? 1 : 0;
            int i5 = a ? 1 : 0;
            int i6 = a ? 1 : 0;
            int i7 = a ? 1 : 0;
            aVar.mo3034a(i4, i);
        }
    }

    private C0827a(Context context, ViewGroup viewGroup, AbstractC0830a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.f3085u = viewGroup;
            this.f3083s = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f3073i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f3066b = viewConfiguration.getScaledTouchSlop();
            this.f3081q = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f3072h = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f3082r = new OverScroller(context, f3064v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    private int m2921a(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.f3085u.getWidth();
        float f = (float) (width / 2);
        float a = f + (m2919a(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(a / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* renamed from: a */
    private void m2926a(float f, float f2, int i) {
        float[] fArr = this.f3068d;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3069e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3070f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3071g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3076l;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3077m;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3078n;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3068d = fArr2;
            this.f3069e = fArr3;
            this.f3070f = fArr4;
            this.f3071g = fArr5;
            this.f3076l = iArr;
            this.f3077m = iArr2;
            this.f3078n = iArr3;
        }
        float[] fArr9 = this.f3068d;
        this.f3070f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f3069e;
        this.f3071g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f3076l;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.f3085u.getLeft() + this.f3073i) {
            i2 = 1;
        }
        if (i5 < this.f3085u.getTop() + this.f3073i) {
            i2 |= 4;
        }
        if (i4 > this.f3085u.getRight() - this.f3073i) {
            i2 |= 2;
        }
        if (i5 > this.f3085u.getBottom() - this.f3073i) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.f3079o |= 1 << i;
    }

    /* renamed from: a */
    private int m2922a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int b = m2930b(i3, (int) this.f3072h, (int) this.f3081q);
        int b2 = m2930b(i4, (int) this.f3072h, (int) this.f3081q);
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
        return (int) ((((float) m2921a(i, b, this.f3083s.mo3030a(view))) * f5) + (((float) m2921a(i2, b2, this.f3083s.mo3038b())) * f6));
    }
}
