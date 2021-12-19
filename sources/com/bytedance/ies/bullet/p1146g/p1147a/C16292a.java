package com.bytedance.ies.bullet.p1146g.p1147a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.C14894c;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.g.a.a */
public final class C16292a {

    /* renamed from: a */
    final HashMap<String, Map<String, C14894c>> f39133a = new HashMap<>();

    static {
        Covode.recordClassIndex(18585);
    }

    /* renamed from: a */
    public final C14894c mo25878a(String str, String str2) {
        boolean z;
        MethodCollector.m26663i(11875);
        C89219l.m154719c(str2, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        C14894c cVar = null;
        if (z) {
            MethodCollector.m26664o(11875);
            return null;
        }
        synchronized (this.f39133a) {
            try {
                Map<String, C14894c> map = this.f39133a.get(str2);
                if (map != null) {
                    cVar = map.get(str);
                }
            } finally {
                MethodCollector.m26664o(11875);
            }
        }
        return cVar;
    }
}
