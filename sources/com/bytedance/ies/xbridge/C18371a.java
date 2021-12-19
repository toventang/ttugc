package com.bytedance.ies.xbridge;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.a */
public final class C18371a {

    /* renamed from: a */
    public static final C18371a f43949a = new C18371a();

    /* renamed from: b */
    private static final Map<Class<AbstractC18469d>, AbstractC18469d> f43950b = new LinkedHashMap();

    /* renamed from: c */
    private static final Map<String, C18539g> f43951c = new LinkedHashMap();

    private C18371a() {
    }

    static {
        Covode.recordClassIndex(21043);
    }

    /* renamed from: a */
    public static <T extends AbstractC18469d> T m34204a(Class<T> cls) {
        C89219l.m154719c(cls, "");
        Map<Class<AbstractC18469d>, AbstractC18469d> map = f43950b;
        T t = (T) map.get(cls);
        if (t != null) {
            return t;
        }
        try {
            T newInstance = cls.newInstance();
            C89219l.m154709a((Object) newInstance, "");
            map.put(cls, newInstance);
            return newInstance;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Map<String, Class<? extends AbstractC18400b>> m34206a(EnumC18483e eVar, String str) {
        C18539g gVar;
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(str, "");
        Map<String, C18539g> map = f43951c;
        if (map.get(str) == null || (gVar = map.get(str)) == null) {
            return null;
        }
        C89219l.m154719c(eVar, "");
        if (eVar == EnumC18483e.NONE) {
            return null;
        }
        return gVar.f44204b.get(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r0v9. Raw type applied. Possible types: java.util.Map<com.bytedance.ies.xbridge.e, java.util.Map<java.lang.String, java.lang.Class<? extends com.bytedance.ies.xbridge.b>>>, java.util.Map */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map, java.lang.Object] */
    /* renamed from: a */
    private static void m34207a(Class<? extends AbstractC18400b> cls, EnumC18483e eVar, String str) {
        List a;
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(str, "");
        if (cls != null) {
            Map<String, C18539g> map = f43951c;
            if (map.get(str) == null) {
                map.put(str, new C18539g());
            }
            C18539g gVar = map.get(str);
            if (gVar != null) {
                C89219l.m154719c(cls, "");
                C89219l.m154719c(eVar, "");
                if (eVar == EnumC18483e.ALL) {
                    a = C89070n.m154522b(EnumC18483e.ALL, EnumC18483e.WEB, EnumC18483e.LYNX, EnumC18483e.RN);
                } else {
                    a = C89070n.m154516a(eVar);
                }
                for (Object obj : a) {
                    Map<String, Class<? extends AbstractC18400b>> map2 = gVar.f44204b.get(obj);
                    if (map2 == null) {
                        map2 = new LinkedHashMap<>();
                    }
                    C89219l.m154719c(cls, "");
                    String str2 = C18556h.f44236a.get(cls);
                    if (str2 == null) {
                        C18556h.f44236a.put(cls, ((AbstractC18400b) cls.newInstance()).mo7341b());
                        str2 = C18556h.f44236a.get(cls);
                        if (str2 == null) {
                            C89219l.m154707a();
                        }
                    }
                    map2.put(str2, cls);
                    gVar.f44204b.put(obj, map2);
                }
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m34208a(Class cls, EnumC18483e eVar, String str, int i) {
        if ((i & 2) != 0) {
            eVar = EnumC18483e.ALL;
        }
        if ((i & 4) != 0) {
            str = "DEFAULT";
        }
        m34207a(cls, eVar, str);
    }
}
