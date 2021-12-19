package com.bytedance.nita.p1556d;

import com.bytedance.covode.number.Covode;
import com.bytedance.nita.api.EnumC21528e;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.nita.d.e */
public final class C21552e {

    /* renamed from: a */
    public static final ConcurrentHashMap<EnumC21528e, AbstractC21551d> f51146a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final C21552e f51147b = new C21552e();

    private C21552e() {
    }

    static {
        AbstractC21551d bVar;
        Covode.recordClassIndex(25193);
        EnumC21528e[] values = EnumC21528e.values();
        for (EnumC21528e eVar : values) {
            ConcurrentHashMap<EnumC21528e, AbstractC21551d> concurrentHashMap = f51146a;
            int i = C21553f.f51148a[eVar.ordinal()];
            if (i == 1) {
                bVar = new C21544b();
            } else if (i != 2) {
                bVar = new C21544b();
            } else {
                bVar = new C21546c();
            }
            concurrentHashMap.put(eVar, bVar);
        }
    }
}
