package com.airbnb.epoxy;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.epoxy.am */
public final class C1923am {

    /* renamed from: b */
    private static final Map<Class, Integer> f5771b = new HashMap();

    /* renamed from: a */
    AbstractC1956s<?> f5772a;

    C1923am() {
    }

    static {
        Covode.recordClassIndex(2114);
    }

    /* renamed from: a */
    static int m6126a(AbstractC1956s<?> sVar) {
        int a = sVar.mo5783a();
        if (a != 0) {
            return a;
        }
        Class<?> cls = sVar.getClass();
        Map<Class, Integer> map = f5771b;
        Integer num = map.get(cls);
        if (num == null) {
            num = Integer.valueOf((-map.size()) - 1);
            map.put(cls, num);
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC1956s<?> mo5702a(AbstractC1931d dVar, int i) {
        AbstractC1956s<?> sVar = this.f5772a;
        if (sVar != null && m6126a(sVar) == i) {
            return this.f5772a;
        }
        dVar.mo5720a(new IllegalStateException("Last model did not match expected view type"));
        for (AbstractC1956s<?> sVar2 : dVar.mo5715a()) {
            if (m6126a(sVar2) == i) {
                return sVar2;
            }
        }
        C1977x xVar = new C1977x();
        if (i == xVar.mo5783a()) {
            return xVar;
        }
        throw new IllegalStateException("Could not find model for view type: ".concat(String.valueOf(i)));
    }
}
