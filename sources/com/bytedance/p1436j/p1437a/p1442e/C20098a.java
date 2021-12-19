package com.bytedance.p1436j.p1437a.p1442e;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.TemplateData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.j.a.e.a */
public final class C20098a {

    /* renamed from: b */
    public static final C20099a f47845b = new C20099a((byte) 0);

    /* renamed from: a */
    public TemplateData f47846a;

    static {
        Covode.recordClassIndex(23606);
    }

    /* renamed from: com.bytedance.j.a.e.a$a */
    public static final class C20099a {
        static {
            Covode.recordClassIndex(23607);
        }

        private C20099a() {
        }

        public /* synthetic */ C20099a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C20098a m38059a(String str) {
            C20098a aVar = new C20098a();
            TemplateData a = TemplateData.m56771a(str);
            C89219l.m154709a((Object) a, "");
            aVar.f47846a = a;
            return aVar;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0106 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.LinkedHashMap, java.util.Map] */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.util.LinkedHashMap, java.util.Map] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.util.LinkedHashMap, java.util.Map] */
        /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List, java.util.ArrayList] */
        /* renamed from: a */
        public static Object m38061a(Object obj) {
            Object obj2;
            if (obj == null) {
                return null;
            }
            new StringBuilder("dealing with ").append(obj).append('[').append(obj.getClass()).append(']');
            if (obj instanceof List) {
                obj2 = new ArrayList();
                for (Object obj3 : (Iterable) obj) {
                    obj2.add(m38061a(obj3));
                }
            } else if (obj instanceof Map) {
                obj2 = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() instanceof String) {
                        Object key = entry.getKey();
                        if (key != null) {
                            obj2.put(key, m38061a(entry.getValue()));
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    }
                }
            } else if (obj instanceof Bundle) {
                obj2 = new LinkedHashMap();
                Bundle bundle = (Bundle) obj;
                Set<String> keySet = bundle.keySet();
                C89219l.m154709a((Object) keySet, "");
                for (T t : keySet) {
                    C89219l.m154709a((Object) t, "");
                    obj2.put(t, m38061a(m38060a(bundle, t)));
                }
            } else if (obj instanceof JSONObject) {
                obj2 = new LinkedHashMap();
                JSONObject jSONObject = (JSONObject) obj;
                Iterator<String> keys = jSONObject.keys();
                C89219l.m154709a((Object) keys, "");
                while (keys.hasNext()) {
                    String next = keys.next();
                    C89219l.m154709a((Object) next, "");
                    obj2.put(next, m38061a(jSONObject.get(next)));
                }
            } else if (!(obj instanceof JSONArray)) {
                return obj;
            } else {
                obj2 = new ArrayList();
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    obj2.add(m38061a(jSONArray.get(i)));
                }
            }
            return obj2;
        }

        /* renamed from: a */
        private static Object m38060a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }
    }

    public C20098a() {
        TemplateData a = TemplateData.m56770a();
        C89219l.m154709a((Object) a, "");
        this.f47846a = a;
    }

    /* renamed from: a */
    public final void mo33444a(String str, Object obj) {
        C89219l.m154719c(str, "");
        this.f47846a.mo48812a(str, C20099a.m38061a(obj));
    }
}
