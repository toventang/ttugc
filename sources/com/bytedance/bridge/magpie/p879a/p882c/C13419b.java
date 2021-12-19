package com.bytedance.bridge.magpie.p879a.p882c;

import com.bytedance.bridge.magpie.p879a.AbstractC13408b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;

/* renamed from: com.bytedance.bridge.magpie.a.c.b */
public final class C13419b extends AbstractC13418a {
    static {
        Covode.recordClassIndex(15419);
    }

    @Override // com.bytedance.bridge.magpie.p879a.p882c.AbstractC13418a
    /* renamed from: b */
    public final JSONObject mo21645b() {
        String str;
        AbstractC13408b a = mo21643a();
        if (a != null) {
            str = a.mo21635b();
        } else {
            str = null;
        }
        if (str != null) {
            try {
                return new JSONObject(str);
            } catch (Throwable th) {
                C89379q.m157067boximpl(C89379q.m157068constructorimpl(C89382r.m154941a(th)));
            }
        }
        return null;
    }
}
