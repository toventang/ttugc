package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.utils.dq */
public final class C80355dq {

    /* renamed from: a */
    public static final C80355dq f179887a = new C80355dq();

    private C80355dq() {
    }

    static {
        Covode.recordClassIndex(93623);
    }

    /* renamed from: a */
    public static void m139320a(String str) {
        C33743c cVar = new C33743c();
        if (str == null) {
            cVar.mo59976a("referrer", "referrer is null");
        } else if (str.hashCode() == 0 && str.equals("")) {
            cVar.mo59976a("referrer", "empty referrer");
        } else {
            Map<String, String> b = m139321b(str);
            cVar.mo59976a("referrer", str);
            cVar.mo59976a("key_set", C89070n.m154587h(b.keySet()).toString());
            for (Map.Entry<String, String> entry : b.entrySet()) {
                cVar.mo59976a(entry.getKey(), entry.getValue());
            }
        }
        C39162r.m79461a("google_install_referrer", cVar.mo59977a());
    }

    /* renamed from: b */
    private static Map<String, String> m139321b(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : C89361p.m154921c(str, new String[]{"&"})) {
            if (C89361p.m154929e((CharSequence) str2, (CharSequence) "=")) {
                List c = C89361p.m154921c(str2, new String[]{"="});
                if (c.size() > 1) {
                    hashMap.put(c.get(0), c.get(1));
                }
            }
        }
        return hashMap;
    }
}
