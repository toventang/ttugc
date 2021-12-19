package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: com.ss.android.vesdk.be */
public class C85391be {

    /* renamed from: a */
    public String[] f191148a;

    /* renamed from: b */
    public int[] f191149b;

    /* renamed from: c */
    public String[] f191150c = null;

    /* renamed from: d */
    public String[] f191151d = null;

    /* renamed from: e */
    public int[] f191152e;

    /* renamed from: f */
    public int[] f191153f;

    /* renamed from: g */
    public int[] f191154g;

    /* renamed from: h */
    public int[] f191155h;

    /* renamed from: i */
    public double[] f191156i;

    /* renamed from: j */
    public boolean[] f191157j;

    /* renamed from: k */
    public ROTATE_DEGREE[] f191158k;

    /* renamed from: l */
    private int[] f191159l;

    static {
        Covode.recordClassIndex(99503);
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        try {
            String[] strArr = this.f191148a;
            if (strArr == null) {
                i = 0;
            } else {
                i = strArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                int[] iArr = this.f191149b;
                if (iArr != null && iArr.length > i2) {
                    sb.append(" videoFileIndex: ").append(this.f191149b[i2]);
                }
                String[] strArr2 = this.f191148a;
                if (strArr2 != null && strArr2.length > i2) {
                    sb.append(" videoFilePath: ").append(this.f191148a[i2]);
                }
                int[] iArr2 = this.f191152e;
                if (iArr2 != null && iArr2.length > i2) {
                    sb.append(" vTrimIn: ").append(this.f191152e[i2]);
                }
                int[] iArr3 = this.f191153f;
                if (iArr3 != null && iArr3.length > i2) {
                    sb.append(" vTrimOut: ").append(this.f191153f[i2]);
                }
                int[] iArr4 = this.f191154g;
                if (iArr4 != null && iArr4.length > i2) {
                    sb.append(" aTrimIn: ").append(this.f191154g[i2]);
                }
                int[] iArr5 = this.f191155h;
                if (iArr5 != null && iArr5.length > i2) {
                    sb.append(" aTrimOut: ").append(this.f191155h[i2]);
                }
                double[] dArr = this.f191156i;
                if (dArr != null && dArr.length > i2) {
                    sb.append(" speed: ").append(this.f191156i[i2]);
                }
                boolean[] zArr = this.f191157j;
                if (zArr != null && zArr.length > i2) {
                    sb.append(" enable: ").append(this.f191157j[i2]);
                }
                ROTATE_DEGREE[] rotate_degreeArr = this.f191158k;
                if (rotate_degreeArr != null && rotate_degreeArr.length > i2) {
                    sb.append(" rotate: ").append(this.f191158k[i2]);
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return "Exception";
        }
    }

    public C85391be(String[] strArr) {
        int length = strArr.length;
        this.f191148a = (String[]) strArr.clone();
        int[] iArr = new int[length];
        this.f191152e = iArr;
        Arrays.fill(iArr, 0);
        int[] iArr2 = new int[length];
        this.f191153f = iArr2;
        Arrays.fill(iArr2, -1);
        int[] iArr3 = new int[length];
        this.f191154g = iArr3;
        Arrays.fill(iArr3, 0);
        int[] iArr4 = new int[length];
        this.f191155h = iArr4;
        Arrays.fill(iArr4, -1);
        double[] dArr = new double[length];
        this.f191156i = dArr;
        Arrays.fill(dArr, 1.0d);
        this.f191149b = new int[length];
        this.f191159l = new int[length];
        boolean[] zArr = new boolean[length];
        this.f191157j = zArr;
        Arrays.fill(zArr, true);
        ROTATE_DEGREE[] rotate_degreeArr = new ROTATE_DEGREE[length];
        this.f191158k = rotate_degreeArr;
        Arrays.fill(rotate_degreeArr, ROTATE_DEGREE.ROTATE_NONE);
        for (int i = 0; i < length; i++) {
            this.f191149b[i] = i;
            this.f191159l[i] = i;
        }
    }
}
