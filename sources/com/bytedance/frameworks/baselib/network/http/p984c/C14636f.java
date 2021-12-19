package com.bytedance.frameworks.baselib.network.http.p984c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.frameworks.baselib.network.http.c.f */
public class C14636f implements AbstractC14631c {

    /* renamed from: a */
    public static String f35445a;

    /* renamed from: b */
    private static final String f35446b = C14636f.class.getSimpleName();

    /* renamed from: d */
    private static final Map<String, String> f35447d = new LinkedHashMap();

    /* renamed from: c */
    private final SharedPreferences f35448c;

    /* renamed from: e */
    private final Map<URI, Set<C14641h>> f35449e = new LinkedHashMap();

    static {
        Covode.recordClassIndex(16727);
    }

    /* renamed from: a */
    public final synchronized void mo23515a() {
        MethodCollector.m26663i(8638);
        Map<URI, Set<C14641h>> map = this.f35449e;
        if (map == null || map.isEmpty()) {
            MethodCollector.m26664o(8638);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<URI, Set<C14641h>> entry : this.f35449e.entrySet()) {
            if (entry != null) {
                URI key = entry.getKey();
                if (key.getScheme() != null && key.getScheme().equals("https")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            MethodCollector.m26664o(8638);
            return;
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (entry2 != null) {
                URI uri = (URI) entry2.getKey();
                Set<C14641h> set = (Set) entry2.getValue();
                try {
                    URI uri2 = new URI(uri.toString().replace("https:", "http:"));
                    Set<C14641h> set2 = this.f35449e.get(uri2);
                    if (set2 == null || set2.isEmpty()) {
                        this.f35449e.remove(uri);
                        this.f35449e.put(uri2, set);
                    } else {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (C14641h hVar : set2) {
                            boolean z = false;
                            for (C14641h hVar2 : set) {
                                if (hVar != null && hVar2 != null && hVar.getHttpCookie().equals(hVar2.getHttpCookie()) && hVar2.getWhenCreated().longValue() >= hVar.getWhenCreated().longValue()) {
                                    linkedHashSet.add(hVar2);
                                    z = true;
                                }
                            }
                            if (!z) {
                                linkedHashSet.add(hVar);
                            }
                        }
                        for (C14641h hVar3 : set) {
                            if (!linkedHashSet.contains(hVar3)) {
                                linkedHashSet.add(hVar3);
                            }
                        }
                        this.f35449e.remove(uri);
                        this.f35449e.put(uri2, linkedHashSet);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        try {
            Map<URI, Set<C14641h>> map2 = this.f35449e;
            if (map2 != null) {
                if (!map2.isEmpty()) {
                    SharedPreferences.Editor edit = this.f35448c.edit();
                    edit.clear();
                    for (Map.Entry<URI, Set<C14641h>> entry3 : this.f35449e.entrySet()) {
                        URI key2 = entry3.getKey();
                        for (C14641h hVar4 : entry3.getValue()) {
                            String str = key2.toString() + "|" + hVar4.getHttpCookie().f35432f;
                            String encode = hVar4.encode();
                            if (hVar4.getHttpCookie().f35431e > 0) {
                                edit.putString(str, encode);
                            } else {
                                f35447d.put(str, encode);
                            }
                        }
                    }
                    C13611a.m24460a(edit);
                    MethodCollector.m26664o(8638);
                    return;
                }
            }
            MethodCollector.m26664o(8638);
        } catch (Throwable unused2) {
            MethodCollector.m26664o(8638);
        }
    }

    public C14636f(Context context) {
        String str = f35445a;
        str = str == null ? "cookieStore" : str;
        int i = Build.VERSION.SDK_INT;
        SharedPreferences a = C34822d.m71158a(context, str, 4);
        this.f35448c = a;
        m26755a(a.getAll(), true);
        m26755a((Map<String, ?>) f35447d, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0015 A[SYNTHETIC] */
    @Override // com.bytedance.frameworks.baselib.network.http.p984c.AbstractC14631c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.bytedance.frameworks.baselib.network.http.p984c.C14633e> mo23505a(java.net.URI r11) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p984c.C14636f.mo23505a(java.net.URI):java.util.List");
    }

    /* renamed from: b */
    private static URI m26756b(URI uri, C14633e eVar) {
        String str;
        if (eVar.f35430d == null) {
            return uri;
        }
        String str2 = eVar.f35430d;
        if (str2.charAt(0) == '.') {
            str2 = str2.substring(1);
        }
        try {
            if (eVar.f35433g == null) {
                str = "/";
            } else {
                str = eVar.f35433g;
            }
            return new URI("http", str2, str, null);
        } catch (URISyntaxException unused) {
            return uri;
        }
    }

    /* renamed from: a */
    private void m26754a(URI uri, List<C14641h> list) {
        SharedPreferences.Editor edit = this.f35448c.edit();
        Iterator<C14641h> it = list.iterator();
        while (it.hasNext()) {
            String str = uri.toString() + "|" + it.next().getHttpCookie().f35432f;
            edit.remove(str);
            f35447d.remove(str);
        }
        edit.apply();
    }

    /* renamed from: a */
    private synchronized void m26755a(Map<String, ?> map, boolean z) {
        MethodCollector.m26663i(8486);
        if (map == null || map.isEmpty()) {
            MethodCollector.m26664o(8486);
            return;
        }
        try {
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                try {
                    URI uri = new URI(entry.getKey().split("\\|", 2)[0]);
                    C14641h decode = C14641h.decode((String) entry.getValue());
                    Set<C14641h> set = this.f35449e.get(uri);
                    if (set == null) {
                        set = new HashSet<>();
                        this.f35449e.put(uri, set);
                    }
                    if (decode != null) {
                        set.add(decode);
                    }
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
            if (z) {
                RunnableC13596e.m24423a(new Runnable() {
                    /* class com.bytedance.frameworks.baselib.network.http.p984c.C14636f.RunnableC146371 */

                    static {
                        Covode.recordClassIndex(16728);
                    }

                    public final void run() {
                        try {
                            C14636f.this.mo23515a();
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
            MethodCollector.m26664o(8486);
        } catch (Throwable unused) {
            MethodCollector.m26664o(8486);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.p984c.AbstractC14631c
    /* renamed from: a */
    public final synchronized void mo23506a(URI uri, C14633e eVar) {
        MethodCollector.m26663i(8793);
        URI b = m26756b(uri, eVar);
        Set<C14641h> set = this.f35449e.get(b);
        C14641h hVar = new C14641h(eVar);
        if (set == null) {
            set = new HashSet<>();
            this.f35449e.put(b, set);
        } else {
            set.remove(hVar);
        }
        set.add(hVar);
        String str = b.toString() + "|" + hVar.getHttpCookie().f35432f;
        String encode = hVar.encode();
        if (hVar.getHttpCookie().f35431e > 0) {
            SharedPreferences.Editor edit = this.f35448c.edit();
            edit.putString(str, encode);
            edit.apply();
            MethodCollector.m26664o(8793);
            return;
        }
        f35447d.put(str, encode);
        MethodCollector.m26664o(8793);
    }
}
