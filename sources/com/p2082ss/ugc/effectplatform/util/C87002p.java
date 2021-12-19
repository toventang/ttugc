package com.p2082ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.util.p */
public final class C87002p {

    /* renamed from: a */
    public static final C87002p f196171a = new C87002p();

    private C87002p() {
    }

    static {
        Covode.recordClassIndex(102768);
    }

    /* renamed from: a */
    public static String m150693a(Map<String, String> map, String str) {
        C89219l.m154719c(map, "");
        C89219l.m154719c(str, "");
        StringBuilder sb = new StringBuilder(str);
        if (!map.isEmpty()) {
            sb.append("?");
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!C87007u.m150697a(key) && !C87007u.m150697a(value)) {
                    if (i == 0) {
                        sb.append(key).append("=").append(value);
                    } else {
                        sb.append("&").append(key).append("=").append(value);
                    }
                }
                i++;
            }
        }
        String sb2 = sb.toString();
        C89219l.m154709a((Object) sb2, "");
        return sb2;
    }
}
