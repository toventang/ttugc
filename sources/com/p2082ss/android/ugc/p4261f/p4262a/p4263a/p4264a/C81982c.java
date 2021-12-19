package com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.f.a.a.a.c */
public class C81982c implements Serializable, Comparable<C81982c> {
    private static final long serialVersionUID = 7003130400674500845L;
    public final double mDownThreshold;
    public final double mRate;
    public final double mUpThreshold;

    static {
        Covode.recordClassIndex(95797);
    }

    public double getMedianThreshold() {
        return (this.mDownThreshold + this.mUpThreshold) / 2.0d;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.mRate);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.mDownThreshold);
        int i2 = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.mUpThreshold);
        return (i2 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
    }

    public String toString() {
        return "Shift{mRate=" + this.mRate + ", mDownThreshold=" + this.mDownThreshold + ", mUpThreshold=" + this.mUpThreshold + '}';
    }

    public int compareTo(C81982c cVar) {
        return Double.compare(this.mRate, cVar.mRate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81982c)) {
            return false;
        }
        C81982c cVar = (C81982c) obj;
        if (Double.compare(cVar.mRate, this.mRate) == 0 && Double.compare(cVar.mDownThreshold, this.mDownThreshold) == 0 && Double.compare(cVar.mUpThreshold, this.mUpThreshold) == 0) {
            return true;
        }
        return false;
    }

    public C81982c(double d, double d2, double d3) {
        this.mRate = d;
        this.mDownThreshold = d2;
        this.mUpThreshold = d3;
    }
}
