package com.p2082ss.android.ugc.aweme.p4173ug.dynamicresource;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.dynamicresource.b */
public final class C79603b {

    /* renamed from: a */
    static final Map<String, IDynamicResourceConfig> f178613a = new LinkedHashMap();

    /* renamed from: b */
    public static final C79603b f178614b = new C79603b();

    private C79603b() {
    }

    static {
        Covode.recordClassIndex(92815);
        for (IDynamicResourceConfig iDynamicResourceConfig : ServiceManager.get().getServices(IDynamicResourceConfig.class)) {
            Map<String, IDynamicResourceConfig> map = f178613a;
            String a = iDynamicResourceConfig.mo96305a();
            C89219l.m154716b(iDynamicResourceConfig, "");
            map.put(a, iDynamicResourceConfig);
        }
    }
}
