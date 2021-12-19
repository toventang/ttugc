package com.p2082ss.android.ugc.p4314h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4314h.C84116g;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.h.a */
public final class C84107a implements C84116g.AbstractC84117a {

    /* renamed from: a */
    private double f187699a = -1.0d;

    static {
        Covode.recordClassIndex(98003);
    }

    @Override // com.p2082ss.android.ugc.p4314h.C84116g.AbstractC84117a
    /* renamed from: b */
    public final double mo118415b(Queue<C84119i> queue, C84119i[] iVarArr) {
        return mo118414a(queue, iVarArr);
    }

    @Override // com.p2082ss.android.ugc.p4314h.C84116g.AbstractC84117a
    /* renamed from: a */
    public final double mo118414a(Queue<C84119i> queue, C84119i[] iVarArr) {
        if (queue.size() <= 0) {
            return -1.0d;
        }
        queue.toArray(iVarArr);
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < queue.size(); i2++) {
            double d = (double) i;
            double d2 = iVarArr[i2].f187722c;
            Double.isNaN(d);
            i = (int) (d + d2);
            j += iVarArr[i2].f187723d;
        }
        double d3 = (double) i;
        Double.isNaN(d3);
        double d4 = (double) j;
        Double.isNaN(d4);
        double d5 = (d3 * 8.0d) / (d4 / 1000.0d);
        if (d5 >= 0.0d) {
            this.f187699a = d5;
            return d5;
        }
        throw new IllegalArgumentException();
    }
}
