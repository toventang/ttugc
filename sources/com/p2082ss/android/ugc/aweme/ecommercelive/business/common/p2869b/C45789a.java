package com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45780a;
import java.util.HashMap;
import java.util.Map;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.b.a */
public final class C45789a {

    /* renamed from: a */
    public static final C45789a f106684a = new C45789a();

    private C45789a() {
    }

    static {
        Covode.recordClassIndex(54307);
    }

    /* renamed from: a */
    public static Map<String, String> m88387a(Map<String, String> map) {
        HashMap hashMap;
        Throwable th;
        C89391z zVar = null;
        HashMap hashMap2 = null;
        if (map != null) {
            try {
                String str = map.get("log_extra");
                if (str != null) {
                    hashMap = new HashMap();
                    String str2 = map.get("ad_id");
                    if (str2 == null) {
                        str2 = "";
                    }
                    hashMap.put("ad_id", str2);
                    String str3 = map.get("value");
                    if (str3 == null) {
                        str3 = "";
                    }
                    hashMap.put("creative_id", str3);
                    hashMap.put("tag", "live_ad");
                    String b = new C27910f().mo46674b((C45780a) new C27910f().mo46670a(str, C45780a.class));
                    C89219l.m154716b(b, "");
                    hashMap.put("ad_extra", b);
                    try {
                        zVar = C89391z.f203057a;
                        C89379q.m157068constructorimpl(zVar);
                        return hashMap;
                    } catch (Throwable th2) {
                        th = th2;
                        hashMap2 = hashMap;
                        C89379q.m157068constructorimpl(C89382r.m154941a(th));
                        return hashMap2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
                return hashMap2;
            }
        }
        hashMap = null;
        C89379q.m157068constructorimpl(zVar);
        return hashMap;
    }
}
