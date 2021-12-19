package com.bytedance.ies.bullet.p1129c.p1132c.p1133a;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.a.a */
public final class C16158a {

    /* renamed from: a */
    public static final C16158a f38911a = new C16158a();

    /* renamed from: b */
    private static final Map<Class<?>, Map<Class<?>, AbstractC89183m<Object, Class<?>, Object>>> f38912b = new LinkedHashMap();

    /* renamed from: c */
    private static final Map<String, AbstractC89172b<Object, JSONObject>> f38913c;

    /* renamed from: com.bytedance.ies.bullet.c.c.a.a$a */
    public enum EnumC16159a {
        REPLACE,
        IGNORE;

        static {
            Covode.recordClassIndex(18452);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.a.a$b */
    public static final class C16160b implements AbstractC89172b<Object, JSONObject> {
        static {
            Covode.recordClassIndex(18453);
        }

        C16160b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JSONObject invoke(Object obj) {
            C89219l.m154719c(obj, "");
            if (obj instanceof JSONObject) {
                return obj;
            }
            return null;
        }
    }

    private C16158a() {
    }

    static {
        Covode.recordClassIndex(18451);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("WEB", new C16160b());
        f38913c = linkedHashMap;
    }

    /* renamed from: a */
    public static final AbstractC89183m<Object, Class<?>, Object> m30009a(Class<?> cls, Class<?> cls2) {
        C89219l.m154719c(cls, "");
        C89219l.m154719c(cls2, "");
        Map<Class<?>, AbstractC89183m<Object, Class<?>, Object>> map = f38912b.get(cls);
        if (map != null) {
            return map.get(cls2);
        }
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m30010a(String str, AbstractC89172b bVar) {
        EnumC16159a aVar = EnumC16159a.IGNORE;
        C89219l.m154719c(str, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
        int i = C16161b.f38916b[aVar.ordinal()];
        if (i == 1) {
            Map<String, AbstractC89172b<Object, JSONObject>> map = f38913c;
            if (!map.containsKey(str)) {
                map.put(str, bVar);
            }
        } else if (i == 2) {
            f38913c.put(str, bVar);
        }
    }
}
