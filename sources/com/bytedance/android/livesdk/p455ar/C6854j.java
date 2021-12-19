package com.bytedance.android.livesdk.p455ar;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p995g.C14757g;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.ar.j */
public final class C6854j {

    /* renamed from: a */
    public static final C6854j f17188a = new C6854j();

    private C6854j() {
    }

    static {
        Covode.recordClassIndex(7592);
    }

    /* renamed from: a */
    public static final Map<String, String> m14659a(String str) {
        C89219l.m154721d(str, "");
        URI b = C14757g.m27061b(str);
        CookieHandler cookieHandler = CookieHandler.getDefault();
        try {
            HashMap hashMap = new HashMap();
            Map<String, List<String>> map = null;
            if (cookieHandler != null) {
                try {
                    map = cookieHandler.get(b, hashMap);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (map != null && (!map.isEmpty())) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    List<String> value = entry.getValue();
                    StringBuilder sb = new StringBuilder();
                    if ((C89361p.m154872a("X-SS-Cookie", key, true) || C89361p.m154872a("Cookie", key, true) || C89361p.m154872a("Cookie2", key, true)) && (!value.isEmpty())) {
                        int i = 0;
                        for (String str2 : value) {
                            if (i > 0) {
                                sb.append("; ");
                            }
                            sb.append(str2);
                            i++;
                        }
                        return C89041ag.m154428c(C89387v.m154943a(key, sb.toString()));
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return new HashMap();
    }
}
