package p4593g.p4594a.p4595a.p4596a.p4597a;

import com.bytedance.covode.number.Covode;

/* renamed from: g.a.a.a.a.a */
public final class C88987a implements AbstractC88988b {
    static {
        Covode.recordClassIndex(105029);
    }

    @Override // p4593g.p4594a.p4595a.p4596a.p4597a.AbstractC88988b
    /* renamed from: a */
    public final double mo143305a(double d, double d2, double d3) {
        double d4 = (d / d3) - 1.0d;
        return (d2 * ((d4 * d4 * d4) + 1.0d)) + 0.0d;
    }

    @Override // p4593g.p4594a.p4595a.p4596a.p4597a.AbstractC88988b
    /* renamed from: b */
    public final double mo143306b(double d, double d2, double d3) {
        double d4;
        double d5 = d / (d3 / 2.0d);
        if (d5 < 1.0d) {
            d4 = (d2 / 2.0d) * d5 * d5 * d5;
        } else {
            double d6 = d5 - 2.0d;
            d4 = (d2 / 2.0d) * ((d6 * d6 * d6) + 2.0d);
        }
        return d4 + 0.0d;
    }
}
