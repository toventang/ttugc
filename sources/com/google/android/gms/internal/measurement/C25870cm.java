package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.cm */
public final class C25870cm {
    static {
        Covode.recordClassIndex(31285);
    }

    /* renamed from: a */
    public static <T> AbstractC25871cn<T> m50075a(T t) {
        return new C25875cr(t);
    }

    /* renamed from: a */
    public static <T> AbstractC25871cn<T> m50074a(AbstractC25871cn<T> cnVar) {
        if ((cnVar instanceof C25872co) || (cnVar instanceof C25873cp)) {
            return cnVar;
        }
        if (cnVar instanceof Serializable) {
            return new C25873cp(cnVar);
        }
        return new C25872co(cnVar);
    }
}
