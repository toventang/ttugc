package com.squareup.p2075a.p2076a.p2078b;

import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.AbstractC29209b;
import com.squareup.p2075a.C29235p;
import com.squareup.p2075a.C29246v;
import com.squareup.p2075a.C29249x;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.squareup.a.a.b.k */
public final class C29176k {

    /* renamed from: a */
    static final String f69091a = "OkHttp";

    /* renamed from: b */
    public static final String f69092b = ("OkHttp" + "-Sent-Millis");

    /* renamed from: c */
    public static final String f69093c = ("OkHttp" + "-Received-Millis");

    /* renamed from: d */
    public static final String f69094d = ("OkHttp" + "-Selected-Protocol");

    /* renamed from: e */
    public static final String f69095e = ("OkHttp" + "-Response-Source");

    /* renamed from: f */
    private static final Comparator<String> f69096f = new Comparator<String>() {
        /* class com.squareup.p2075a.p2076a.p2078b.C29176k.C291771 */

        static {
            Covode.recordClassIndex(35526);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
        }
    };

    static {
        Covode.recordClassIndex(35525);
    }

    /* renamed from: a */
    public static long m58320a(C29235p pVar) {
        return m58325b(pVar.mo50978a("Content-Length"));
    }

    /* renamed from: b */
    private static long m58325b(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static Map<String, List<String>> m58326b(C29235p pVar) {
        TreeMap treeMap = new TreeMap(f69096f);
        int length = pVar.f69280a.length / 2;
        for (int i = 0; i < length; i++) {
            String a = pVar.mo50977a(i);
            String b = pVar.mo50979b(i);
            ArrayList arrayList = new ArrayList();
            Collection collection = (Collection) treeMap.get(a);
            if (collection != null) {
                arrayList.addAll(collection);
            }
            arrayList.add(b);
            treeMap.put(a, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    /* renamed from: c */
    public static Set<String> m58327c(C29235p pVar) {
        Set<String> emptySet = Collections.emptySet();
        int length = pVar.f69280a.length / 2;
        for (int i = 0; i < length; i++) {
            if ("Vary".equalsIgnoreCase(pVar.mo50977a(i))) {
                String b = pVar.mo50979b(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                String[] split = b.split(",");
                for (String str : split) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }

    /* renamed from: a */
    static boolean m58324a(String str) {
        if ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C29235p m58321a(C29235p pVar, C29235p pVar2) {
        Set<String> c = m58327c(pVar2);
        if (c.isEmpty()) {
            return new C29235p.C29236a().mo50985a();
        }
        C29235p.C29236a aVar = new C29235p.C29236a();
        int length = pVar.f69280a.length / 2;
        for (int i = 0; i < length; i++) {
            String a = pVar.mo50977a(i);
            if (c.contains(a)) {
                aVar.mo50984a(a, pVar.mo50979b(i));
            }
        }
        return aVar.mo50985a();
    }

    /* renamed from: a */
    public static void m58323a(C29246v.C29247a aVar, Map<String, List<String>> map) {
        String sb;
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) && !entry.getValue().isEmpty()) {
                List<String> value = entry.getValue();
                if (value.size() == 1) {
                    sb = value.get(0);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    int size = value.size();
                    for (int i = 0; i < size; i++) {
                        if (i > 0) {
                            sb2.append("; ");
                        }
                        sb2.append(value.get(i));
                    }
                    sb = sb2.toString();
                }
                aVar.mo51027b(key, sb);
            }
        }
    }

    /* renamed from: a */
    public static C29246v m58322a(AbstractC29209b bVar, C29249x xVar, Proxy proxy) {
        if (xVar.f69352c == 407) {
            return bVar.mo50855b(proxy, xVar);
        }
        return bVar.mo50854a(proxy, xVar);
    }
}
