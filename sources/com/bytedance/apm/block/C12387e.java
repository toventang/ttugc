package com.bytedance.apm.block;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.apm.block.e */
public final class C12387e {

    /* renamed from: a */
    private static List<AbstractC12386d> f29894a = new ArrayList(2);

    static {
        Covode.recordClassIndex(14193);
    }

    /* renamed from: a */
    public static synchronized void m22254a(AbstractC12386d dVar) {
        synchronized (C12387e.class) {
            f29894a.add(dVar);
        }
    }

    /* renamed from: a */
    public static synchronized void m22255a(boolean z, long j, boolean z2) {
        synchronized (C12387e.class) {
            for (AbstractC12386d dVar : f29894a) {
                if (dVar != null) {
                    dVar.mo20168a(z, j, z2);
                }
            }
        }
    }
}
