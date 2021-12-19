package com.facebook.p1814a.p1818c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.C24872m;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24768q;
import com.facebook.internal.C24770r;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23909c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.a.c.a */
public final class C23912a {

    /* renamed from: a */
    public static boolean f56618a;

    /* renamed from: b */
    private static final List<C23913a> f56619b = new ArrayList();

    /* renamed from: c */
    private static final Set<String> f56620c = new HashSet();

    static {
        Covode.recordClassIndex(28033);
    }

    /* renamed from: a */
    public static synchronized void m45216a() {
        synchronized (C23912a.class) {
            MethodCollector.m26663i(9037);
            if (C24677a.m47209a(C23912a.class)) {
                MethodCollector.m26664o(9037);
                return;
            }
            try {
                C24699ae.m47299a();
                C24768q a = C24770r.m47427a(C24872m.f59041a, false);
                if (a == null) {
                    try {
                        MethodCollector.m26664o(9037);
                    } catch (Throwable th) {
                        C24677a.m47208a(th, C23912a.class);
                        MethodCollector.m26664o(9037);
                    }
                } else {
                    String str = a.f58771s;
                    if (!str.isEmpty()) {
                        JSONObject jSONObject = new JSONObject(str);
                        f56619b.clear();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            if (jSONObject2 != null) {
                                if (jSONObject2.optBoolean("is_deprecated_event")) {
                                    f56620c.add(next);
                                } else {
                                    JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                    C23913a aVar = new C23913a(next, new ArrayList());
                                    if (optJSONArray != null) {
                                        aVar.f56622b = C24693ad.m47243a(optJSONArray);
                                    }
                                    f56619b.add(aVar);
                                }
                            }
                        }
                    }
                    MethodCollector.m26664o(9037);
                }
            } catch (Exception unused) {
                MethodCollector.m26664o(9037);
            }
        }
    }

    /* renamed from: a */
    public static void m45217a(List<C23909c> list) {
        if (!C24677a.m47209a(C23912a.class)) {
            try {
                if (f56618a) {
                    Iterator<C23909c> it = list.iterator();
                    while (it.hasNext()) {
                        if (f56620c.contains(it.next().getName())) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C23912a.class);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.a.c.a$a */
    public static class C23913a {

        /* renamed from: a */
        String f56621a;

        /* renamed from: b */
        List<String> f56622b;

        static {
            Covode.recordClassIndex(28034);
        }

        C23913a(String str, List<String> list) {
            this.f56621a = str;
            this.f56622b = list;
        }
    }

    /* renamed from: a */
    public static void m45218a(Map<String, String> map, String str) {
        if (!C24677a.m47209a(C23912a.class)) {
            try {
                if (f56618a) {
                    ArrayList<String> arrayList = new ArrayList(map.keySet());
                    for (C23913a aVar : new ArrayList(f56619b)) {
                        if (aVar.f56621a.equals(str)) {
                            for (String str2 : arrayList) {
                                if (aVar.f56622b.contains(str2)) {
                                    map.remove(str2);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C23912a.class);
            }
        }
    }
}
