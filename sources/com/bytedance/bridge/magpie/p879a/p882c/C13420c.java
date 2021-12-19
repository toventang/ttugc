package com.bytedance.bridge.magpie.p879a.p882c;

import com.bytedance.bridge.magpie.p879a.AbstractC13408b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;

/* renamed from: com.bytedance.bridge.magpie.a.c.c */
public final class C13420c extends AbstractC13418a {

    /* renamed from: a */
    public static final C13421a f32719a = new C13421a((byte) 0);

    static {
        Covode.recordClassIndex(15420);
    }

    /* renamed from: com.bytedance.bridge.magpie.a.c.c$a */
    public static final class C13421a {
        static {
            Covode.recordClassIndex(15421);
        }

        private C13421a() {
        }

        public /* synthetic */ C13421a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.bridge.magpie.p879a.p882c.AbstractC13418a
    /* renamed from: b */
    public final JSONObject mo21645b() {
        String str;
        AbstractC13408b a = mo21643a();
        if (a != null) {
            str = a.mo21632a().mo21622a("com.bytedance.bridge.magpie.permission.permission_config_response");
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
