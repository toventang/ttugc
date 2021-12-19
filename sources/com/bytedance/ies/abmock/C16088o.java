package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.p1118c.C16059c;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.google.gson.C28022o;

/* renamed from: com.bytedance.ies.abmock.o */
public final class C16088o {
    static {
        Covode.recordClassIndex(18364);
    }

    /* renamed from: a */
    private static void m29889a() {
        try {
            C16048b.m29633a().f38663a.mo25436b("abmock_saved2", true);
        } catch (Throwable th) {
            C13468b.m24210a(th);
        }
    }

    /* renamed from: a */
    public static boolean m29890a(C28022o oVar) {
        C16059c.m29729a(oVar);
        m29889a();
        return true;
    }
}
