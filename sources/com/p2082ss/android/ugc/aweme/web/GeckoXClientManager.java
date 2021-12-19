package com.p2082ss.android.ugc.aweme.web;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.C14894c;
import com.p2082ss.android.ugc.C81908b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.web.GeckoXClientManager */
public final class GeckoXClientManager implements IGeckoXClientManager {

    /* renamed from: a */
    public final HashMap<String, C14894c> f182289a = new HashMap<>();

    /* renamed from: b */
    public final Map<String, C14894c> f182290b = new LinkedHashMap();

    static {
        Covode.recordClassIndex(94898);
    }

    /* renamed from: a */
    public static IGeckoXClientManager m141361a() {
        MethodCollector.m26663i(6631);
        Object a = C81908b.m141854a(IGeckoXClientManager.class, false);
        if (a != null) {
            IGeckoXClientManager iGeckoXClientManager = (IGeckoXClientManager) a;
            MethodCollector.m26664o(6631);
            return iGeckoXClientManager;
        }
        if (C81908b.f183360eD == null) {
            synchronized (IGeckoXClientManager.class) {
                try {
                    if (C81908b.f183360eD == null) {
                        C81908b.f183360eD = new GeckoXClientManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6631);
                    throw th;
                }
            }
        }
        GeckoXClientManager geckoXClientManager = (GeckoXClientManager) C81908b.f183360eD;
        MethodCollector.m26664o(6631);
        return geckoXClientManager;
    }

    @Override // com.p2082ss.android.ugc.aweme.web.IGeckoXClientManager
    /* renamed from: b */
    public final C14894c mo125244b(String str) {
        C14894c cVar;
        MethodCollector.m26663i(6479);
        C89219l.m154721d(str, "");
        synchronized (this.f182290b) {
            try {
                cVar = this.f182290b.get(str);
            } finally {
                MethodCollector.m26664o(6479);
            }
        }
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.web.IGeckoXClientManager
    /* renamed from: a */
    public final C14894c mo125242a(String str) {
        C14894c cVar;
        MethodCollector.m26663i(6188);
        if (str == null || str.length() == 0) {
            MethodCollector.m26664o(6188);
            return null;
        }
        synchronized (this.f182289a) {
            try {
                cVar = this.f182289a.get(str);
            } finally {
                MethodCollector.m26664o(6188);
            }
        }
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.web.IGeckoXClientManager
    /* renamed from: a */
    public final void mo125243a(String str, C14894c cVar) {
        MethodCollector.m26663i(6187);
        C89219l.m154721d(str, "");
        synchronized (this.f182289a) {
            try {
                this.f182289a.put(str, cVar);
            } finally {
                MethodCollector.m26664o(6187);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.web.IGeckoXClientManager
    /* renamed from: b */
    public final void mo125245b(String str, C14894c cVar) {
        MethodCollector.m26663i(6334);
        C89219l.m154721d(str, "");
        C89219l.m154721d(cVar, "");
        synchronized (this.f182290b) {
            try {
                this.f182290b.put(str, cVar);
            } finally {
                MethodCollector.m26664o(6334);
            }
        }
    }
}
