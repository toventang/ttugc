package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import java.math.BigDecimal;
import java.util.LinkedList;

/* renamed from: com.ss.android.vesdk.b */
public final class C85380b {

    /* renamed from: a */
    public LinkedList<Double> f191119a = new LinkedList<>();

    /* renamed from: b */
    double f191120b = -1.0d;

    /* renamed from: c */
    double f191121c = -1.0d;

    /* renamed from: d */
    double f191122d = -1.0d;

    /* renamed from: e */
    long f191123e = 0;

    /* renamed from: f */
    volatile boolean f191124f = true;

    static {
        Covode.recordClassIndex(99492);
    }

    /* renamed from: a */
    public final double mo130843a() {
        if (this.f191119a.size() <= 0) {
            return -1.0d;
        }
        if (this.f191121c < 0.0d || this.f191122d < 0.0d) {
            m146887d();
        }
        return this.f191122d;
    }

    /* renamed from: b */
    public final double mo130844b() {
        if (this.f191119a.size() <= 0) {
            return -1.0d;
        }
        if (this.f191121c < 0.0d || this.f191122d < 0.0d) {
            m146887d();
        }
        return this.f191121c;
    }

    /* renamed from: c */
    public final double mo130845c() {
        if (this.f191119a.size() <= 0) {
            return -1.0d;
        }
        return m146886a(mo130843a() / mo130844b());
    }

    /* renamed from: d */
    private void m146887d() {
        this.f191124f = false;
        LinkedList linkedList = new LinkedList(this.f191119a);
        double d = 0.0d;
        double d2 = 0.0d;
        for (int i = 0; i < linkedList.size(); i++) {
            d2 += ((Double) linkedList.get(i)).doubleValue();
        }
        double size = (double) linkedList.size();
        Double.isNaN(size);
        this.f191121c = m146886a(d2 / size);
        for (int i2 = 0; i2 < linkedList.size(); i2++) {
            d += Math.pow(((Double) linkedList.get(i2)).doubleValue() - this.f191121c, 2.0d);
        }
        double size2 = (double) linkedList.size();
        Double.isNaN(size2);
        this.f191122d = m146886a(Math.sqrt(d / size2));
        this.f191124f = true;
    }

    /* renamed from: a */
    private static double m146886a(double d) {
        return new BigDecimal(d).setScale(4, 5).doubleValue();
    }
}
