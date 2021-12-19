package com.bytedance.frameworks.baselib.network.http.p984c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p984c.C14633e;
import java.net.CookieManager;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.frameworks.baselib.network.http.c.a */
public final class C14626a extends CookieManager {

    /* renamed from: a */
    private AbstractC14631c f35416a;

    /* renamed from: b */
    private AbstractC14627b f35417b;

    static {
        Covode.recordClassIndex(16717);
    }

    public C14626a() {
        this(null, null);
    }

    /* renamed from: a */
    private static List<C14633e> m26726a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && (key.equalsIgnoreCase("Set-cookie") || key.equalsIgnoreCase("Set-cookie2"))) {
                for (String str : entry.getValue()) {
                    try {
                        for (C14633e eVar : new C14633e.C14635a(str).mo23514a()) {
                            arrayList.add(eVar);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Map<String, List<String>> m26727a(List<C14633e> list) {
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (C14633e eVar : list) {
            i = Math.min(i, eVar.f35438l);
        }
        if (i == 1) {
            sb.append("$Version=\"1\"; ");
        }
        sb.append(list.get(0).toString());
        for (int i2 = 1; i2 < list.size(); i2++) {
            sb.append("; ").append(list.get(i2).toString());
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(sb.toString()));
    }

    public C14626a(AbstractC14631c cVar, AbstractC14627b bVar) {
        this.f35416a = cVar == null ? new C14632d() : cVar;
        this.f35417b = bVar == null ? AbstractC14627b.f35420c : bVar;
    }

    @Override // java.net.CookieHandler, java.net.CookieManager
    public final Map<String, List<String>> get(URI uri, Map<String, List<String>> map) {
        if (uri == null || map == null) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (C14633e eVar : this.f35416a.mo23505a(uri)) {
            if (C14633e.m26738a(eVar, uri) && ((!eVar.f35435i || "https".equalsIgnoreCase(uri.getScheme())) && C14633e.m26742b(eVar, uri))) {
                arrayList.add(eVar);
            }
        }
        return m26727a(arrayList);
    }

    @Override // java.net.CookieHandler, java.net.CookieManager
    public final void put(URI uri, Map<String, List<String>> map) {
        String substring;
        if (uri == null || map == null) {
            throw new IllegalArgumentException();
        }
        for (C14633e eVar : m26726a(map)) {
            if (eVar.f35430d == null) {
                eVar.mo23507a(uri.getHost());
            }
            if (eVar.f35433g == null) {
                String path = uri.getPath();
                if (path == null) {
                    substring = "/";
                } else {
                    substring = path.substring(0, path.lastIndexOf(47) + 1);
                }
                eVar.f35433g = substring;
            } else if (!C14633e.m26738a(eVar, uri)) {
            }
            if ("".equals(eVar.f35434h)) {
                eVar.f35434h = Integer.toString(C14641h.getEffectivePort(uri.getScheme(), uri.getPort()));
            } else if (eVar.f35434h != null && !C14633e.m26742b(eVar, uri)) {
            }
            if (this.f35417b.mo23504a(uri, eVar)) {
                this.f35416a.mo23506a(uri, eVar);
            }
        }
    }
}
