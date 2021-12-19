package com.bytedance.android.monitorV2.lynx.p743c.p746c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxView;
import java.util.Map;
import java.util.WeakHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.lynx.c.c.e */
public final class C12176e {

    /* renamed from: a */
    private final Map<LynxView, String> f29307a = new WeakHashMap();

    static {
        Covode.recordClassIndex(13905);
    }

    /* renamed from: a */
    public final synchronized String mo19540a(LynxView lynxView) {
        String str;
        MethodCollector.m26663i(5844);
        C89219l.m154719c(lynxView, "");
        str = this.f29307a.get(lynxView);
        MethodCollector.m26664o(5844);
        return str;
    }

    /* renamed from: a */
    public final synchronized void mo19541a(LynxView lynxView, String str) {
        MethodCollector.m26663i(5846);
        C89219l.m154719c(lynxView, "");
        C89219l.m154719c(str, "");
        if (str.length() != 0) {
            this.f29307a.put(lynxView, str);
        }
        MethodCollector.m26664o(5846);
    }
}
