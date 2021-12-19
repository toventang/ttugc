package com.bytedance.lynx.hybrid.resource.p1530f;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.p1526b.C21235a;
import com.bytedance.lynx.hybrid.resource.p1526b.C21238b;
import com.bytedance.lynx.hybrid.resource.p1526b.C21249e;
import com.bytedance.lynx.hybrid.resource.p1526b.C21264g;
import com.bytedance.lynx.hybrid.resource.p1528d.EnumC21292c;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.f.a */
public final class C21308a {

    /* renamed from: a */
    public static final C21308a f50581a = new C21308a();

    /* renamed from: b */
    private static final Map<Class<? extends IHybridResourceLoader>, EnumC21292c> f50582b;

    private C21308a() {
    }

    static {
        Covode.recordClassIndex(24926);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f50582b = linkedHashMap;
        linkedHashMap.put(C21249e.class, EnumC21292c.DEFAULT);
        linkedHashMap.put(C21264g.class, EnumC21292c.DEFAULT);
        linkedHashMap.put(C21235a.class, EnumC21292c.DEFAULT);
        linkedHashMap.put(C21238b.class, EnumC21292c.DEFAULT);
    }

    /* renamed from: a */
    public static EnumC21292c m40021a(Class<? extends IHybridResourceLoader> cls) {
        C89219l.m154719c(cls, "");
        Map<Class<? extends IHybridResourceLoader>, EnumC21292c> map = f50582b;
        if (map.containsKey(cls)) {
            return map.get(cls);
        }
        return EnumC21292c.DEFAULT;
    }

    /* renamed from: a */
    public static void m40022a(Class<? extends IHybridResourceLoader> cls, EnumC21292c cVar) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(cVar, "");
        f50582b.put(cls, cVar);
    }
}
