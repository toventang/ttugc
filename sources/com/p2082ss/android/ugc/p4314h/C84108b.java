package com.p2082ss.android.ugc.p4314h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4314h.C84116g;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.h.b */
public final class C84108b implements C84116g.AbstractC84117a {

    /* renamed from: a */
    private double f187700a = -1.0d;

    static {
        Covode.recordClassIndex(98004);
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
        int i = 0;
        Arrays.sort(iVarArr, 0, queue.size());
        int size = queue.size();
        double d = 0.0d;
        for (int i2 = 0; i2 < size; i2++) {
            d += iVarArr[i2].f187722c;
        }
        double d2 = d / 2.0d;
        while (true) {
            if (i >= size) {
                break;
            }
            d2 -= iVarArr[i].f187722c;
            if (d2 <= 0.0d) {
                double d3 = iVarArr[i].f187721b;
                if (d3 >= 0.0d) {
                    this.f187700a = d3;
                    return d3;
                }
            } else {
                i++;
            }
        }
        throw new IllegalArgumentException();
    }
}
