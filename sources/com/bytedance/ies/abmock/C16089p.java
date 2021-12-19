package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.p1118c.C16059c;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.google.gson.C28022o;

/* renamed from: com.bytedance.ies.abmock.p */
public final class C16089p {
    static {
        Covode.recordClassIndex(18365);
    }

    /* renamed from: a */
    public static boolean m29891a(C28022o oVar) {
        C16059c.m29729a(oVar);
        try {
            SettingsManager.m29616a().getSettingsValueProvider().mo25509a("abmock_saved3", true);
        } catch (Throwable th) {
            C13468b.m24210a(th);
        }
        return true;
    }
}
