package com.p2082ss.ttvideoengine.p4421n.p4423b;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.ttvideoengine.n.b.g */
public final class C86585g implements Serializable, Comparable<C86585g> {
    private static final long serialVersionUID = 7003130400674500845L;

    /* renamed from: a */
    public final double f195090a;

    /* renamed from: b */
    public final double f195091b;

    /* renamed from: c */
    public final double f195092c;

    static {
        Covode.recordClassIndex(101813);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f195090a);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f195091b);
        int i2 = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f195092c);
        return (i2 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
    }

    public final String toString() {
        return "Shift{mRate=" + this.f195090a + ", mDownThreshold=" + this.f195091b + ", mUpThreshold=" + this.f195092c + '}';
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C86585g gVar) {
        return Double.compare(this.f195090a, gVar.f195090a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86585g)) {
            return false;
        }
        C86585g gVar = (C86585g) obj;
        if (Double.compare(gVar.f195090a, this.f195090a) == 0 && Double.compare(gVar.f195091b, this.f195091b) == 0 && Double.compare(gVar.f195092c, this.f195092c) == 0) {
            return true;
        }
        return false;
    }

    public C86585g(double d, double d2, double d3) {
        this.f195090a = d;
        this.f195091b = d2;
        this.f195092c = d3;
    }
}
