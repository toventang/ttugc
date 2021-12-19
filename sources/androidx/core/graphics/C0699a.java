package androidx.core.graphics;

import android.graphics.Color;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.graphics.a */
public final class C0699a {

    /* renamed from: a */
    private static final ThreadLocal<double[]> f2757a = new ThreadLocal<>();

    /* renamed from: a */
    private static float m2459a(float f, float f2) {
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > f2 ? f2 : f;
    }

    static {
        Covode.recordClassIndex(778);
    }

    /* renamed from: a */
    private static double m2458a(int i) {
        double pow;
        double pow2;
        double pow3;
        ThreadLocal<double[]> threadLocal = f2757a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d = (double) red;
            Double.isNaN(d);
            double d2 = d / 255.0d;
            if (d2 < 0.04045d) {
                pow = d2 / 12.92d;
            } else {
                pow = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            }
            double d3 = (double) green;
            Double.isNaN(d3);
            double d4 = d3 / 255.0d;
            if (d4 < 0.04045d) {
                pow2 = d4 / 12.92d;
            } else {
                pow2 = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            }
            double d5 = (double) blue;
            Double.isNaN(d5);
            double d6 = d5 / 255.0d;
            if (d6 < 0.04045d) {
                pow3 = d6 / 12.92d;
            } else {
                pow3 = Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return dArr[1] / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    /* renamed from: c */
    private static int m2466c(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: b */
    public static int m2464b(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    /* renamed from: a */
    public static int m2460a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int c = m2466c(alpha2, alpha);
        return Color.argb(c, m2462a(Color.red(i), alpha2, Color.red(i2), alpha, c), m2462a(Color.green(i), alpha2, Color.green(i2), alpha, c), m2462a(Color.blue(i), alpha2, Color.blue(i2), alpha, c));
    }

    /* renamed from: d */
    private static double m2467d(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = m2460a(i, i2);
            }
            double a = m2458a(i) + 0.05d;
            double a2 = m2458a(i2) + 0.05d;
            return Math.max(a, a2) / Math.min(a, a2);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    /* renamed from: b */
    public static int m2465b(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    public static int m2461a(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = (double) f;
            if (m2467d(m2464b(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            int i5 = 0;
            do {
                int i6 = (i5 + i3) / 2;
                if (m2467d(m2464b(i, i6), i2) < d) {
                    i5 = i6;
                } else {
                    i3 = i6;
                }
                i4++;
                if (i4 > 10) {
                    break;
                }
            } while (i3 - i5 > 1);
            return i3;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    /* renamed from: a */
    public static void m2463a(int i, int i2, int i3, float[] fArr) {
        float f;
        float abs;
        float f2 = ((float) i) / 255.0f;
        float f3 = ((float) i2) / 255.0f;
        float f4 = ((float) i3) / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f2) {
                f = ((f3 - f4) / f5) % 6.0f;
            } else if (max == f3) {
                f = ((f4 - f2) / f5) + 2.0f;
            } else {
                f = 4.0f + ((f2 - f3) / f5);
            }
            abs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = m2459a(f7, 360.0f);
        fArr[1] = m2459a(abs, 1.0f);
        fArr[2] = m2459a(f6, 1.0f);
    }

    /* renamed from: a */
    private static int m2462a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }
}
