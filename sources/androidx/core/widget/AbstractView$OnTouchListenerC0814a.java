package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.widget.a */
public abstract class AbstractView$OnTouchListenerC0814a implements View.OnTouchListener {

    /* renamed from: r */
    private static final int f3015r = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    final C0815a f3016a;

    /* renamed from: b */
    final View f3017b;

    /* renamed from: c */
    boolean f3018c;

    /* renamed from: d */
    boolean f3019d;

    /* renamed from: e */
    boolean f3020e;

    /* renamed from: f */
    public boolean f3021f;

    /* renamed from: g */
    public boolean f3022g;

    /* renamed from: h */
    private final Interpolator f3023h = new AccelerateInterpolator();

    /* renamed from: i */
    private Runnable f3024i;

    /* renamed from: j */
    private float[] f3025j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f3026k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l */
    private int f3027l;

    /* renamed from: m */
    private int f3028m;

    /* renamed from: n */
    private float[] f3029n = {0.0f, 0.0f};

    /* renamed from: o */
    private float[] f3030o = {0.0f, 0.0f};

    /* renamed from: p */
    private float[] f3031p = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: q */
    private boolean f3032q;

    /* renamed from: a */
    static float m2873a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    static int m2876a(int i, int i2) {
        if (i > i2) {
            return i2;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: a */
    public abstract void mo3000a(int i);

    /* renamed from: b */
    public abstract boolean mo3002b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.a$a */
    public static class C0815a {

        /* renamed from: a */
        public int f3033a;

        /* renamed from: b */
        public int f3034b;

        /* renamed from: c */
        float f3035c;

        /* renamed from: d */
        float f3036d;

        /* renamed from: e */
        long f3037e = Long.MIN_VALUE;

        /* renamed from: f */
        long f3038f;

        /* renamed from: g */
        public int f3039g;

        /* renamed from: h */
        public int f3040h;

        /* renamed from: i */
        long f3041i = -1;

        /* renamed from: j */
        float f3042j;

        /* renamed from: k */
        int f3043k;

        static {
            Covode.recordClassIndex(898);
        }

        C0815a() {
        }

        /* renamed from: b */
        public final int mo3006b() {
            float f = this.f3035c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: c */
        public final int mo3007c() {
            float f = this.f3036d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: a */
        public final void mo3005a() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3043k = AbstractView$OnTouchListenerC0814a.m2876a((int) (currentAnimationTimeMillis - this.f3037e), this.f3034b);
            this.f3042j = mo3004a(currentAnimationTimeMillis);
            this.f3041i = currentAnimationTimeMillis;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final float mo3004a(long j) {
            long j2 = this.f3037e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f3041i;
            if (j3 < 0 || j < j3) {
                return AbstractView$OnTouchListenerC0814a.m2873a(((float) (j - j2)) / ((float) this.f3033a), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f3042j;
            return (1.0f - f) + (f * AbstractView$OnTouchListenerC0814a.m2873a(((float) (j - j3)) / ((float) this.f3043k), 0.0f, 1.0f));
        }
    }

    static {
        Covode.recordClassIndex(897);
    }

    /* renamed from: b */
    private void m2877b() {
        if (this.f3018c) {
            this.f3020e = false;
        } else {
            this.f3016a.mo3005a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.a$b */
    public class RunnableC0816b implements Runnable {
        static {
            Covode.recordClassIndex(899);
        }

        public final void run() {
            if (AbstractView$OnTouchListenerC0814a.this.f3020e) {
                if (AbstractView$OnTouchListenerC0814a.this.f3018c) {
                    AbstractView$OnTouchListenerC0814a.this.f3018c = false;
                    C0815a aVar = AbstractView$OnTouchListenerC0814a.this.f3016a;
                    aVar.f3037e = AnimationUtils.currentAnimationTimeMillis();
                    aVar.f3041i = -1;
                    aVar.f3038f = aVar.f3037e;
                    aVar.f3042j = 0.5f;
                    aVar.f3039g = 0;
                    aVar.f3040h = 0;
                }
                C0815a aVar2 = AbstractView$OnTouchListenerC0814a.this.f3016a;
                if ((aVar2.f3041i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= aVar2.f3041i + ((long) aVar2.f3043k)) && AbstractView$OnTouchListenerC0814a.this.mo3001a()) {
                    if (AbstractView$OnTouchListenerC0814a.this.f3019d) {
                        AbstractView$OnTouchListenerC0814a.this.f3019d = false;
                        AbstractView$OnTouchListenerC0814a aVar3 = AbstractView$OnTouchListenerC0814a.this;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        aVar3.f3017b.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar2.f3038f != 0) {
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        float a = aVar2.mo3004a(currentAnimationTimeMillis);
                        aVar2.f3038f = currentAnimationTimeMillis;
                        float f = ((float) (currentAnimationTimeMillis - aVar2.f3038f)) * ((-4.0f * a * a) + (a * 4.0f));
                        aVar2.f3039g = (int) (aVar2.f3035c * f);
                        aVar2.f3040h = (int) (f * aVar2.f3036d);
                        AbstractView$OnTouchListenerC0814a.this.mo3000a(aVar2.f3040h);
                        C0792v.m2750a(AbstractView$OnTouchListenerC0814a.this.f3017b, this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                AbstractView$OnTouchListenerC0814a.this.f3020e = false;
            }
        }

        RunnableC0816b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo3001a() {
        C0815a aVar = this.f3016a;
        int c = aVar.mo3007c();
        aVar.mo3006b();
        if (c == 0 || !mo3002b(c)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final AbstractView$OnTouchListenerC0814a mo2999a(boolean z) {
        if (this.f3021f && !z) {
            m2877b();
        }
        this.f3021f = z;
        return this;
    }

    public AbstractView$OnTouchListenerC0814a(View view) {
        C0815a aVar = new C0815a();
        this.f3016a = aVar;
        this.f3017b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((displayMetrics.density * 1575.0f) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        float[] fArr = this.f3031p;
        float f = ((float) i) / 1000.0f;
        fArr[0] = f;
        fArr[1] = f;
        float[] fArr2 = this.f3030o;
        float f2 = ((float) i2) / 1000.0f;
        fArr2[0] = f2;
        fArr2[1] = f2;
        this.f3027l = 1;
        float[] fArr3 = this.f3026k;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f3025j;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f3029n;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f3028m = f3015r;
        aVar.f3033a = 500;
        aVar.f3034b = 500;
    }

    /* renamed from: a */
    private float m2872a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f3027l;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (!this.f3020e || i != 1) {
                    return 0.0f;
                }
                return 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r1 != 3) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractView$OnTouchListenerC0814a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private float m2874a(float f, float f2, float f3, float f4) {
        float interpolation;
        float a = m2873a(f * f2, 0.0f, f3);
        float a2 = m2872a(f2 - f4, a) - m2872a(f4, a);
        if (a2 < 0.0f) {
            interpolation = -this.f3023h.getInterpolation(-a2);
        } else if (a2 <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f3023h.getInterpolation(a2);
        }
        return m2873a(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: a */
    private float m2875a(int i, float f, float f2, float f3) {
        float a = m2874a(this.f3025j[i], f2, this.f3026k[i], f);
        if (a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f3029n[i];
        float f5 = this.f3030o[i];
        float f6 = this.f3031p[i];
        float f7 = f4 * f3;
        if (a > 0.0f) {
            return m2873a(a * f7, f5, f6);
        }
        return -m2873a((-a) * f7, f5, f6);
    }
}
