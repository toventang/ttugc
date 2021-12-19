package com.bytedance.apm;

import com.bytedance.apm.config.C12424e;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.apm.f */
public final class C12450f {

    /* renamed from: a */
    private static List<AbstractC12446e> f30245a = new ArrayList(2);

    static {
        Covode.recordClassIndex(14260);
    }

    /* renamed from: a */
    public static synchronized void m22415a(AbstractC12446e eVar) {
        synchronized (C12450f.class) {
            f30245a.add(eVar);
        }
    }

    /* renamed from: a */
    public static synchronized void m22414a(C12424e eVar) {
        synchronized (C12450f.class) {
            for (AbstractC12446e eVar2 : f30245a) {
                if (eVar2 != null) {
                    eVar2.mo20164a(eVar);
                }
            }
        }
    }
}
