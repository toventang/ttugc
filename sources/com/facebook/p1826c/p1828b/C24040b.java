package com.facebook.p1826c.p1828b;

import com.bytedance.covode.number.Covode;
import com.facebook.p1826c.p1828b.AbstractC24045d;

/* renamed from: com.facebook.c.b.b */
public final class C24040b implements AbstractC24055h {
    static {
        Covode.recordClassIndex(28166);
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24055h
    /* renamed from: a */
    public final AbstractC24054g mo39570a() {
        return new AbstractC24054g() {
            /* class com.facebook.p1826c.p1828b.C24040b.C240411 */

            static {
                Covode.recordClassIndex(28167);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(AbstractC24045d.AbstractC24046a aVar, AbstractC24045d.AbstractC24046a aVar2) {
                long b = aVar.mo39564b();
                long b2 = aVar2.mo39564b();
                if (b < b2) {
                    return -1;
                }
                if (b2 == b) {
                    return 0;
                }
                return 1;
            }
        };
    }
}
