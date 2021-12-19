package com.bytedance.lynx.hybrid.resource.p1531g.p1533b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.C14894c;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.g.b.a */
public final class C21318a {

    /* renamed from: a */
    final HashMap<String, Map<String, C14894c>> f50627a = new HashMap<>();

    static {
        Covode.recordClassIndex(24936);
    }

    /* renamed from: a */
    public final C14894c mo34926a(String str, String str2) {
        boolean z;
        MethodCollector.m26663i(3789);
        C89219l.m154719c(str2, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        C14894c cVar = null;
        if (z) {
            MethodCollector.m26664o(3789);
            return null;
        }
        synchronized (this.f50627a) {
            try {
                Map<String, C14894c> map = this.f50627a.get(str2);
                if (map != null) {
                    cVar = map.get(str);
                }
            } finally {
                MethodCollector.m26664o(3789);
            }
        }
        return cVar;
    }
}
