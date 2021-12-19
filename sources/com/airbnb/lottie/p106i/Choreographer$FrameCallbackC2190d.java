package com.airbnb.lottie.p106i;

import android.view.Choreographer;
import com.C1764a;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.C2199j;
import com.airbnb.lottie.p104g.C2142b;
import com.airbnb.lottie.p104g.C2143c;
import com.airbnb.lottie.p104g.C2144d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.i.d */
public final class Choreographer$FrameCallbackC2190d extends AbstractC2187a implements Choreographer.FrameCallback {

    /* renamed from: a */
    public float f6537a = 1.0f;

    /* renamed from: b */
    public float f6538b;

    /* renamed from: c */
    protected boolean f6539c;

    /* renamed from: d */
    private boolean f6540d;

    /* renamed from: e */
    private long f6541e;

    /* renamed from: f */
    private int f6542f;

    /* renamed from: g */
    private float f6543g = -2.14748365E9f;

    /* renamed from: h */
    private float f6544h = 2.14748365E9f;

    /* renamed from: i */
    private C2044e f6545i;

    /* renamed from: j */
    private C2143c f6546j;

    static {
        Covode.recordClassIndex(2385);
    }

    public final boolean isRunning() {
        return this.f6539c;
    }

    /* renamed from: l */
    private void m6769l() {
        this.f6537a = -this.f6537a;
    }

    public final void cancel() {
        mo6083b();
        mo6099c(true);
    }

    /* renamed from: g */
    public final void mo6105g() {
        mo6099c(true);
    }

    /* renamed from: e */
    public final void mo6103e() {
        this.f6545i = null;
        this.f6543g = -2.14748365E9f;
        this.f6544h = 2.14748365E9f;
    }

    public final Object getAnimatedValue() {
        return Float.valueOf(mo6101d());
    }

    public final long getDuration() {
        C2044e eVar = this.f6545i;
        if (eVar == null) {
            return 0;
        }
        return (long) eVar.mo5941a();
    }

    /* renamed from: i */
    public final boolean mo6110i() {
        if (this.f6537a < 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private void m6770m() {
        if (isRunning()) {
            mo6099c(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: d */
    public final float mo6101d() {
        C2044e eVar = this.f6545i;
        if (eVar == null) {
            return 0.0f;
        }
        return (this.f6538b - eVar.f6145i) / (this.f6545i.f6146j - this.f6545i.f6145i);
    }

    /* renamed from: j */
    public final float mo6112j() {
        C2044e eVar = this.f6545i;
        if (eVar == null) {
            return 0.0f;
        }
        float f = this.f6543g;
        if (f == -2.14748365E9f) {
            return eVar.f6145i;
        }
        return f;
    }

    /* renamed from: k */
    public final float mo6113k() {
        C2044e eVar = this.f6545i;
        if (eVar == null) {
            return 0.0f;
        }
        float f = this.f6544h;
        if (f == 2.14748365E9f) {
            return eVar.f6146j;
        }
        return f;
    }

    /* renamed from: f */
    public final void mo6104f() {
        float j;
        this.f6539c = true;
        mo6080a(mo6110i());
        if (mo6110i()) {
            j = mo6113k();
        } else {
            j = mo6112j();
        }
        mo6094a((int) j);
        if (C2144d.C2145a.f6479a) {
            this.f6541e = 0;
        } else {
            this.f6541e = System.nanoTime();
        }
        this.f6542f = 0;
        m6770m();
    }

    public final float getAnimatedFraction() {
        float j;
        float k;
        float j2;
        if (this.f6545i == null) {
            return 0.0f;
        }
        if (mo6110i()) {
            j = mo6113k() - this.f6538b;
            k = mo6113k();
            j2 = mo6112j();
        } else {
            j = this.f6538b - mo6112j();
            k = mo6113k();
            j2 = mo6112j();
        }
        return j / (k - j2);
    }

    /* renamed from: h */
    public final void mo6109h() {
        this.f6539c = true;
        m6770m();
        if (C2144d.C2145a.f6479a) {
            this.f6541e = 0;
        } else {
            this.f6541e = System.nanoTime();
        }
        if (mo6110i() && this.f6538b == mo6112j()) {
            this.f6538b = mo6113k();
        } else if (!mo6110i() && this.f6538b == mo6113k()) {
            this.f6538b = mo6112j();
        }
    }

    /* renamed from: b */
    public final void mo6097b(int i) {
        mo6095a(i, (int) this.f6544h);
    }

    /* renamed from: c */
    public final void mo6098c(int i) {
        mo6095a((int) this.f6543g, i);
    }

    /* renamed from: c */
    public final void mo6099c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f6539c = false;
        }
    }

    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f6540d) {
            this.f6540d = false;
            m6769l();
        }
    }

    /* renamed from: a */
    public final void mo6094a(int i) {
        float f = (float) i;
        if (this.f6538b != f) {
            this.f6538b = C2192f.m6785a(f, mo6112j(), mo6113k());
            if (C2144d.C2145a.f6479a) {
                this.f6541e = 0;
            } else {
                this.f6541e = System.nanoTime();
            }
            mo6085c();
        }
    }

    /* renamed from: a */
    public final void mo6096a(C2044e eVar) {
        boolean z;
        if (this.f6545i == null) {
            z = true;
        } else {
            z = false;
        }
        this.f6545i = eVar;
        if (z) {
            mo6095a((int) Math.max(this.f6543g, eVar.f6145i), (int) Math.min(this.f6544h, eVar.f6146j));
        } else {
            mo6095a((int) eVar.f6145i, (int) eVar.f6146j);
        }
        mo6094a((int) this.f6538b);
        if (!C2144d.C2145a.f6479a) {
            this.f6541e = System.nanoTime();
        }
    }

    public final void doFrame(long j) {
        long j2;
        long j3;
        float abs;
        boolean z;
        float j4;
        float k;
        m6770m();
        if (this.f6545i != null && isRunning()) {
            if (C2144d.C2145a.f6479a) {
                long j5 = this.f6541e;
                if (j5 == 0) {
                    j3 = 0;
                } else {
                    j3 = j - j5;
                }
                if (C2144d.C2145a.f6481c) {
                    if (this.f6546j == null) {
                        this.f6546j = new C2143c();
                    }
                    C2143c cVar = this.f6546j;
                    if (cVar != null) {
                        float f = this.f6545i.f6147k;
                        if (cVar.f6471a != f) {
                            cVar.f6471a = f;
                            if (f >= 24.0f) {
                                if (!C2144d.C2149e.f6504a) {
                                    cVar.f6473c = 16000000;
                                }
                            } else if (C2144d.C2149e.f6504a) {
                                cVar.f6473c = 48000000;
                            }
                            cVar.f6473c = 32000000;
                        }
                        if (cVar.f6472b <= 0 || j - cVar.f6472b >= cVar.f6473c) {
                            cVar.f6472b = j;
                        } else {
                            return;
                        }
                    }
                }
                j2 = j;
            } else {
                j2 = System.nanoTime();
                j3 = j2 - this.f6541e;
            }
            C2044e eVar = this.f6545i;
            if (eVar == null) {
                abs = Float.MAX_VALUE;
            } else {
                abs = (1.0E9f / eVar.f6147k) / Math.abs(this.f6537a);
            }
            float f2 = ((float) j3) / abs;
            float f3 = this.f6538b;
            if (mo6110i()) {
                f2 = -f2;
            }
            float f4 = f3 + f2;
            this.f6538b = f4;
            float j6 = mo6112j();
            float k2 = mo6113k();
            if (f4 < j6 || f4 > k2) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = !z;
            this.f6538b = C2192f.m6785a(this.f6538b, mo6112j(), mo6113k());
            this.f6541e = j2;
            if (C2142b.f6470c) {
                C2142b.f6469b = j;
            }
            C2142b.m6676b(null);
            mo6085c();
            if (z2) {
                if (getRepeatCount() == -1 || this.f6542f < getRepeatCount()) {
                    mo6079a();
                    this.f6542f++;
                    if (getRepeatMode() == 2) {
                        this.f6540d = !this.f6540d;
                        m6769l();
                    } else {
                        if (mo6110i()) {
                            j4 = mo6113k();
                        } else {
                            j4 = mo6112j();
                        }
                        this.f6538b = j4;
                    }
                    this.f6541e = j2;
                } else {
                    if (C2144d.C2145a.f6479a) {
                        if (this.f6537a < 0.0f) {
                            k = mo6112j();
                        } else {
                            k = mo6113k();
                        }
                        this.f6538b = k;
                    } else {
                        this.f6538b = mo6113k();
                    }
                    mo6099c(true);
                    mo6084b(mo6110i());
                }
            }
            if (this.f6545i != null) {
                float f5 = this.f6538b;
                if (f5 < this.f6543g || f5 > this.f6544h) {
                    C2199j.C2200a.m6800a().mo6120a(new IllegalStateException(C1764a.m5928a("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f6543g), Float.valueOf(this.f6544h), Float.valueOf(this.f6538b)})));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6095a(int i, int i2) {
        float f;
        float f2;
        C2044e eVar = this.f6545i;
        if (eVar == null) {
            f = -3.4028235E38f;
        } else {
            f = eVar.f6145i;
        }
        C2044e eVar2 = this.f6545i;
        if (eVar2 == null) {
            f2 = Float.MAX_VALUE;
        } else {
            f2 = eVar2.f6146j;
        }
        float f3 = (float) i;
        this.f6543g = C2192f.m6785a(f3, f, f2);
        float f4 = (float) i2;
        this.f6544h = C2192f.m6785a(f4, f, f2);
        mo6094a((int) C2192f.m6785a(this.f6538b, f3, f4));
    }
}
