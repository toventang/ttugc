package androidx.p043e.p044a;

import androidx.p043e.p044a.AbstractC0855b;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.e.a.e */
public final class C0876e {

    /* renamed from: a */
    double f3170a;

    /* renamed from: b */
    double f3171b;

    /* renamed from: c */
    double f3172c;

    /* renamed from: d */
    double f3173d;

    /* renamed from: e */
    double f3174e;

    /* renamed from: f */
    private boolean f3175f;

    /* renamed from: g */
    private double f3176g;

    /* renamed from: h */
    private double f3177h;

    /* renamed from: i */
    private double f3178i;

    /* renamed from: j */
    private final AbstractC0855b.C0870a f3179j;

    static {
        Covode.recordClassIndex(962);
    }

    public C0876e() {
        this.f3170a = Math.sqrt(1500.0d);
        this.f3171b = 0.5d;
        this.f3175f = false;
        this.f3174e = Double.MAX_VALUE;
        this.f3179j = new AbstractC0855b.C0870a();
    }

    /* renamed from: a */
    private void m3047a() {
        if (!this.f3175f) {
            if (this.f3174e != Double.MAX_VALUE) {
                double d = this.f3171b;
                if (d > 1.0d) {
                    double d2 = this.f3170a;
                    this.f3176g = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                    double d3 = this.f3171b;
                    double d4 = this.f3170a;
                    this.f3177h = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
                } else if (d >= 0.0d && d < 1.0d) {
                    this.f3178i = this.f3170a * Math.sqrt(1.0d - (d * d));
                }
                this.f3175f = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    /* renamed from: c */
    public final C0876e mo3161c(float f) {
        this.f3174e = (double) f;
        return this;
    }

    /* renamed from: a */
    public final C0876e mo3159a(float f) {
        if (f > 0.0f) {
            this.f3170a = Math.sqrt((double) f);
            this.f3175f = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* renamed from: b */
    public final C0876e mo3160b(float f) {
        if (f >= 0.0f) {
            this.f3171b = (double) f;
            this.f3175f = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public C0876e(byte b) {
        this.f3170a = Math.sqrt(1500.0d);
        this.f3171b = 0.5d;
        this.f3175f = false;
        this.f3174e = Double.MAX_VALUE;
        this.f3179j = new AbstractC0855b.C0870a();
        this.f3174e = 0.0d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC0855b.C0870a mo3158a(double d, double d2, long j) {
        double pow;
        double cos;
        m3047a();
        double d3 = (double) j;
        Double.isNaN(d3);
        double d4 = d3 / 1000.0d;
        double d5 = d - this.f3174e;
        double d6 = this.f3171b;
        if (d6 > 1.0d) {
            double d7 = this.f3177h;
            double d8 = this.f3176g;
            double d9 = d5 - (((d7 * d5) - d2) / (d7 - d8));
            double d10 = ((d5 * d7) - d2) / (d7 - d8);
            pow = (Math.pow(2.718281828459045d, d7 * d4) * d9) + (Math.pow(2.718281828459045d, this.f3176g * d4) * d10);
            double d11 = this.f3177h;
            double pow2 = d9 * d11 * Math.pow(2.718281828459045d, d11 * d4);
            double d12 = this.f3176g;
            cos = pow2 + (d10 * d12 * Math.pow(2.718281828459045d, d12 * d4));
        } else if (d6 == 1.0d) {
            double d13 = this.f3170a;
            double d14 = d2 + (d13 * d5);
            double d15 = d5 + (d14 * d4);
            pow = Math.pow(2.718281828459045d, (-d13) * d4) * d15;
            double d16 = this.f3170a;
            cos = (d14 * Math.pow(2.718281828459045d, (-d16) * d4)) + (d15 * Math.pow(2.718281828459045d, (-this.f3170a) * d4) * (-d16));
        } else {
            double d17 = this.f3170a;
            double d18 = (1.0d / this.f3178i) * ((d6 * d17 * d5) + d2);
            pow = Math.pow(2.718281828459045d, (-d6) * d17 * d4) * ((Math.cos(this.f3178i * d4) * d5) + (Math.sin(this.f3178i * d4) * d18));
            double d19 = this.f3170a;
            double d20 = this.f3171b;
            double d21 = (-d19) * pow * d20;
            double pow3 = Math.pow(2.718281828459045d, (-d20) * d19 * d4);
            double d22 = this.f3178i;
            double sin = (-d22) * d5 * Math.sin(d22 * d4);
            double d23 = this.f3178i;
            cos = d21 + (pow3 * (sin + (d18 * d23 * Math.cos(d23 * d4))));
        }
        this.f3179j.f3164a = (float) (pow + this.f3174e);
        this.f3179j.f3165b = (float) cos;
        return this.f3179j;
    }
}
