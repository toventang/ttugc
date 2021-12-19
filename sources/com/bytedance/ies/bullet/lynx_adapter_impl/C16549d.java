package com.bytedance.ies.bullet.lynx_adapter_impl;

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

/* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.d */
public final class C16549d {

    /* renamed from: b */
    public static final C16550a f39672b = new C16550a((byte) 0);

    /* renamed from: a */
    public TemplateData f39673a;

    static {
        Covode.recordClassIndex(18985);
    }

    /* renamed from: com.bytedance.ies.bullet.lynx_adapter_impl.d$a */
    public static final class C16550a {
        static {
            Covode.recordClassIndex(18986);
        }

        private C16550a() {
        }

        public /* synthetic */ C16550a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C16549d m30727a(String str) {
            C16549d dVar = new C16549d();
            TemplateData a = TemplateData.m56771a(str);
            C89219l.m154709a((Object) a, "");
            dVar.f39673a = a;
            return dVar;
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
        public static Object m30729a(Object obj) {
            Object obj2;
            if (obj == null) {
                return null;
            }
            new StringBuilder("dealing with ").append(obj).append('[').append(obj.getClass()).append(']');
            if (obj instanceof List) {
                obj2 = new ArrayList();
                for (Object obj3 : (Iterable) obj) {
                    obj2.add(m30729a(obj3));
                }
            } else if (obj instanceof Map) {
                obj2 = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() instanceof String) {
                        Object key = entry.getKey();
                        if (key != null) {
                            obj2.put(key, m30729a(entry.getValue()));
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
                    obj2.put(t, m30729a(m30728a(bundle, t)));
                }
            } else if (obj instanceof JSONObject) {
                obj2 = new LinkedHashMap();
                JSONObject jSONObject = (JSONObject) obj;
                Iterator<String> keys = jSONObject.keys();
                C89219l.m154709a((Object) keys, "");
                while (keys.hasNext()) {
                    String next = keys.next();
                    C89219l.m154709a((Object) next, "");
                    obj2.put(next, m30729a(jSONObject.get(next)));
                }
            } else if (!(obj instanceof JSONArray)) {
                return obj;
            } else {
                obj2 = new ArrayList();
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    obj2.add(m30729a(jSONArray.get(i)));
                }
            }
            return obj2;
        }

        /* renamed from: a */
        private static Object m30728a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }
    }

    public C16549d() {
        TemplateData a = TemplateData.m56770a();
        C89219l.m154709a((Object) a, "");
        this.f39673a = a;
    }
}
