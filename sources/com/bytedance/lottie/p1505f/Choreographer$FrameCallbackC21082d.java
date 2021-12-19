package com.bytedance.lottie.p1505f;

import android.view.Choreographer;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;

/* renamed from: com.bytedance.lottie.f.d */
public final class Choreographer$FrameCallbackC21082d extends AbstractC21079a implements Choreographer.FrameCallback {

    /* renamed from: a */
    public float f49950a = 1.0f;

    /* renamed from: b */
    public long f49951b;

    /* renamed from: c */
    public float f49952c;

    /* renamed from: d */
    public float f49953d = -2.14748365E9f;

    /* renamed from: e */
    public float f49954e = 2.14748365E9f;

    /* renamed from: f */
    public C21088g f49955f;

    /* renamed from: g */
    protected boolean f49956g;

    /* renamed from: h */
    private boolean f49957h;

    /* renamed from: i */
    private int f49958i;

    static {
        Covode.recordClassIndex(24698);
    }

    public final boolean isRunning() {
        return this.f49956g;
    }

    /* renamed from: l */
    private void m39690l() {
        this.f49950a = -this.f49950a;
    }

    public final void cancel() {
        mo34525b();
        mo34540c(true);
    }

    /* renamed from: g */
    public final void mo34546g() {
        mo34540c(true);
    }

    /* renamed from: e */
    public final void mo34544e() {
        this.f49955f = null;
        this.f49953d = -2.14748365E9f;
        this.f49954e = 2.14748365E9f;
    }

    public final Object getAnimatedValue() {
        return Float.valueOf(mo34542d());
    }

    public final long getDuration() {
        C21088g gVar = this.f49955f;
        if (gVar == null) {
            return 0;
        }
        return (long) gVar.mo34559a();
    }

    /* renamed from: i */
    public final boolean mo34551i() {
        if (this.f49950a < 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private void m39691m() {
        if (isRunning()) {
            mo34540c(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: d */
    public final float mo34542d() {
        C21088g gVar = this.f49955f;
        if (gVar == null) {
            return 0.0f;
        }
        return (this.f49952c - gVar.f49977i) / (this.f49955f.f49978j - this.f49955f.f49977i);
    }

    /* renamed from: j */
    public final float mo34553j() {
        C21088g gVar = this.f49955f;
        if (gVar == null) {
            return 0.0f;
        }
        float f = this.f49953d;
        if (f == -2.14748365E9f) {
            return gVar.f49977i;
        }
        return f;
    }

    /* renamed from: k */
    public final float mo34554k() {
        C21088g gVar = this.f49955f;
        if (gVar == null) {
            return 0.0f;
        }
        float f = this.f49954e;
        if (f == 2.14748365E9f) {
            return gVar.f49978j;
        }
        return f;
    }

    /* renamed from: f */
    public final void mo34545f() {
        float j;
        this.f49956g = true;
        mo34522a(mo34551i());
        if (mo34551i()) {
            j = mo34554k();
        } else {
            j = mo34553j();
        }
        mo34536a((int) j);
        this.f49951b = System.nanoTime();
        this.f49958i = 0;
        m39691m();
    }

    public final float getAnimatedFraction() {
        float j;
        float k;
        float j2;
        if (this.f49955f == null) {
            return 0.0f;
        }
        if (mo34551i()) {
            j = mo34554k() - this.f49952c;
            k = mo34554k();
            j2 = mo34553j();
        } else {
            j = this.f49952c - mo34553j();
            k = mo34554k();
            j2 = mo34553j();
        }
        return j / (k - j2);
    }

    /* renamed from: h */
    public final void mo34550h() {
        this.f49956g = true;
        m39691m();
        this.f49951b = System.nanoTime();
        if (mo34551i() && this.f49952c == mo34553j()) {
            this.f49952c = mo34554k();
        } else if (!mo34551i() && this.f49952c == mo34554k()) {
            this.f49952c = mo34553j();
        }
    }

    /* renamed from: b */
    public final void mo34538b(int i) {
        mo34537a(i, (int) this.f49954e);
    }

    /* renamed from: c */
    public final void mo34539c(int i) {
        mo34537a((int) this.f49953d, i);
    }

    /* renamed from: c */
    public final void mo34540c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f49956g = false;
        }
    }

    /* renamed from: a */
    public final void mo34536a(int i) {
        float f = (float) i;
        if (this.f49952c != f) {
            this.f49952c = C21084f.m39705a(f, mo34553j(), mo34554k());
            this.f49951b = System.nanoTime();
            mo34527c();
        }
    }

    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f49957h) {
            this.f49957h = false;
            m39690l();
        }
    }

    public final void doFrame(long j) {
        float abs;
        boolean z;
        float j2;
        m39691m();
        if (this.f49955f != null && isRunning()) {
            long nanoTime = System.nanoTime();
            long j3 = nanoTime - this.f49951b;
            C21088g gVar = this.f49955f;
            if (gVar == null) {
                abs = Float.MAX_VALUE;
            } else {
                abs = (1.0E9f / gVar.f49979k) / Math.abs(this.f49950a);
            }
            float f = ((float) j3) / abs;
            float f2 = this.f49952c;
            if (mo34551i()) {
                f = -f;
            }
            float f3 = f2 + f;
            this.f49952c = f3;
            float j4 = mo34553j();
            float k = mo34554k();
            if (f3 < j4 || f3 > k) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = !z;
            this.f49952c = C21084f.m39705a(this.f49952c, mo34553j(), mo34554k());
            this.f49951b = nanoTime;
            mo34527c();
            if (z2) {
                if (getRepeatCount() == -1 || this.f49958i < getRepeatCount()) {
                    mo34521a();
                    this.f49958i++;
                    if (getRepeatMode() == 2) {
                        this.f49957h = !this.f49957h;
                        m39690l();
                    } else {
                        if (mo34551i()) {
                            j2 = mo34554k();
                        } else {
                            j2 = mo34553j();
                        }
                        this.f49952c = j2;
                    }
                    this.f49951b = nanoTime;
                } else {
                    this.f49952c = mo34554k();
                    mo34540c(true);
                    mo34526b(mo34551i());
                }
            }
            if (this.f49955f != null) {
                float f4 = this.f49952c;
                float f5 = this.f49953d;
                if (f4 < f5 || f4 > this.f49954e) {
                    C1764a.m5928a("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(f5), Float.valueOf(this.f49954e), Float.valueOf(this.f49952c)});
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo34537a(int i, int i2) {
        float f;
        float f2;
        C21088g gVar = this.f49955f;
        if (gVar == null) {
            f = -3.4028235E38f;
        } else {
            f = gVar.f49977i;
        }
        C21088g gVar2 = this.f49955f;
        if (gVar2 == null) {
            f2 = Float.MAX_VALUE;
        } else {
            f2 = gVar2.f49978j;
        }
        float f3 = (float) i;
        this.f49953d = C21084f.m39705a(f3, f, f2);
        float f4 = (float) i2;
        this.f49954e = C21084f.m39705a(f4, f, f2);
        mo34536a((int) C21084f.m39705a(this.f49952c, f3, f4));
    }
}
