package com.bytedance.bdlocation.p846a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.bdlocation.a.d */
public class C13155d {

    /* renamed from: a */
    public String f32075a;

    /* renamed from: b */
    public double f32076b;

    /* renamed from: c */
    public double f32077c;

    /* renamed from: d */
    public String f32078d;

    static {
        Covode.recordClassIndex(15102);
    }

    public C13155d() {
        this("Android");
    }

    public int hashCode() {
        return Double.valueOf((this.f32077c + this.f32076b) * 1000000.0d).intValue();
    }

    public String toString() {
        return "BDPoint{provider='" + this.f32075a + '\'' + ", longitude=" + this.f32076b + ", latitude=" + this.f32077c + ", coordinateSystem=" + this.f32078d + '}';
    }

    private C13155d(String str) {
        this.f32075a = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13155d)) {
            return false;
        }
        C13155d dVar = (C13155d) obj;
        if (this.f32077c == dVar.f32077c && this.f32076b == dVar.f32076b) {
            return true;
        }
        return false;
    }

    public C13155d(double d, double d2, String str) {
        if (d2 > 180.0d) {
            d2 = 180.0d;
        } else if (d2 < -180.0d) {
            d2 = -180.0d;
        }
        if (d > 90.0d) {
            d = 90.0d;
        } else if (d < -90.0d) {
            d = -90.0d;
        }
        this.f32076b = d2;
        this.f32077c = d;
        this.f32075a = str;
    }
}
