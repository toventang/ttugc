package com.facebook.p1814a.p1823h;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.p1894a.p1896b.C24677a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.h.a */
public final class C23977a {

    /* renamed from: a */
    public static boolean f56757a;

    /* renamed from: b */
    public static final List<C23978a> f56758b = new ArrayList();

    /* renamed from: c */
    public static final Set<String> f56759c = new CopyOnWriteArraySet();

    /* renamed from: d */
    private static final String f56760d = C23977a.class.getCanonicalName();

    static {
        Covode.recordClassIndex(28098);
    }

    /* renamed from: a */
    public static String m45337a(String str) {
        if (C24677a.m47209a(C23977a.class)) {
            return null;
        }
        try {
            if (!f56757a || !m45340b(str)) {
                return str;
            }
            return "_removed_";
        } catch (Throwable th) {
            C24677a.m47208a(th, C23977a.class);
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m45340b(String str) {
        if (C24677a.m47209a(C23977a.class)) {
            return false;
        }
        try {
            return f56759c.contains(str);
        } catch (Throwable th) {
            C24677a.m47208a(th, C23977a.class);
            return false;
        }
    }

    /* renamed from: com.facebook.a.h.a$a */
    public static class C23978a {

        /* renamed from: a */
        public String f56761a;

        /* renamed from: b */
        public Map<String, String> f56762b;

        static {
            Covode.recordClassIndex(28099);
        }

        public C23978a(String str, Map<String, String> map) {
            this.f56761a = str;
            this.f56762b = map;
        }
    }

    /* renamed from: a */
    private static String m45338a(String str, String str2) {
        if (C24677a.m47209a(C23977a.class)) {
            return null;
        }
        try {
            for (C23978a aVar : new ArrayList(f56758b)) {
                if (aVar != null && str.equals(aVar.f56761a)) {
                    for (String str3 : aVar.f56762b.keySet()) {
                        if (str2.equals(str3)) {
                            return aVar.f56762b.get(str3);
                        }
                    }
                    continue;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            C24677a.m47208a(th, C23977a.class);
        }
        return null;
    }

    /* renamed from: a */
    public static void m45339a(Map<String, String> map, String str) {
        if (!C24677a.m47209a(C23977a.class)) {
            try {
                if (f56757a) {
                    HashMap hashMap = new HashMap();
                    for (String str2 : new ArrayList(map.keySet())) {
                        String a = m45338a(str, str2);
                        if (a != null) {
                            hashMap.put(str2, a);
                            map.remove(str2);
                        }
                    }
                    if (hashMap.size() > 0) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry entry : hashMap.entrySet()) {
                                jSONObject.put((String) entry.getKey(), entry.getValue());
                            }
                            map.put("_restrictedParams", jSONObject.toString());
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C23977a.class);
            }
        }
    }
}
