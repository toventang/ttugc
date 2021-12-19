package com.bytedance.frameworks.baselib.network.http.p984c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.p907b.C13590c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49498ad;
import com.p2082ss.android.ugc.aweme.feed.p2945f.C49540a;
import com.p2082ss.android.ugc.aweme.lancet.C58023f;
import com.p2082ss.android.ugc.aweme.lancet.p3385b.C58007a;
import java.net.CookieManager;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.c.g */
public final class C14638g extends CookieManager {

    /* renamed from: a */
    public static boolean f35451a;

    /* renamed from: g */
    private static boolean f35452g;

    /* renamed from: b */
    public volatile C14626a f35453b;

    /* renamed from: c */
    private final android.webkit.CookieManager f35454c;

    /* renamed from: d */
    private Pattern f35455d = Pattern.compile("(?<=Domain=)([^;]*)", 2);

    /* renamed from: e */
    private final AbstractC14640a f35456e;

    /* renamed from: f */
    private ArrayList<String> f35457f;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.c.g$a */
    public interface AbstractC14640a {
        static {
            Covode.recordClassIndex(16731);
        }

        /* renamed from: a */
        void mo23520a();
    }

    static {
        Covode.recordClassIndex(16729);
    }

    @Override // java.net.CookieHandler, java.net.CookieManager
    public final Map get(URI uri, Map map) {
        return m26761a(this, uri, map);
    }

    /* renamed from: a */
    private boolean m26767a(URI uri, String str) {
        if (uri != null && !C13627m.m24498a(str)) {
            try {
                String lowerCase = uri.getHost().toLowerCase();
                String str2 = "";
                Matcher matcher = this.f35455d.matcher(str);
                if (matcher.find()) {
                    str2 = matcher.group().toLowerCase();
                }
                if (TextUtils.isEmpty(str2) || !lowerCase.endsWith(str2)) {
                    return false;
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static List<String> m26760a(Map<String, List<String>> map, String str) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return map.get(str.toLowerCase());
        }
        return list;
    }

    /* renamed from: a */
    private Map<String, List<String>> m26762a(URI uri, Map<String, List<String>> map) {
        String str;
        Map<String, List<String>> map2;
        Map<String, List<String>> a;
        android.webkit.CookieManager cookieManager = null;
        try {
            str = uri.toString();
            if (map != null) {
                try {
                    List<String> a2 = m26760a(map, "X-SS-No-Cookie");
                    if (a2 != null) {
                        for (String str2 : a2) {
                            if (str2 != null && Boolean.parseBoolean(str2)) {
                                Logger.debug();
                                return Collections.emptyMap();
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            C14731e.AbstractC14735d dVar = C14731e.f35921j;
            if (dVar != null && (a = dVar.mo23734a()) != null && !a.isEmpty() && (a.containsKey("Cookie") || a.containsKey("X-SS-Cookie"))) {
                return a;
            }
        } catch (Throwable unused2) {
            str = null;
        }
        if (uri == null || this.f35454c == null) {
            return Collections.emptyMap();
        }
        try {
            C14731e.AbstractC14739h hVar = C14731e.f35920i;
            if (hVar != null) {
                if (!f35452g) {
                    cookieManager = this.f35454c;
                }
                List<String> a3 = hVar.mo23738a(cookieManager, this.f35453b, uri);
                if (!C13617h.m24465a(a3)) {
                    return m26763a(a3, map);
                }
            }
        } catch (Throwable unused3) {
        }
        if (!f35452g) {
            try {
                String cookie = this.f35454c.getCookie(str);
                if (cookie != null && cookie.length() > 0) {
                    Logger.debug();
                    return m26763a(Collections.singletonList(cookie), map);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f35453b == null) {
            return Collections.emptyMap();
        }
        try {
            C14626a aVar = this.f35453b;
            if (map == null) {
                map2 = new LinkedHashMap<>();
            } else {
                map2 = map;
            }
            Map<String, List<String>> map3 = aVar.get(uri, map2);
            if (map3 != null && !map3.isEmpty()) {
                return m26763a(map3.get("Cookie"), map);
            }
        } catch (Throwable unused4) {
        }
        return Collections.emptyMap();
    }

    /* renamed from: a */
    private static Map<String, List<String>> m26763a(List<String> list, Map<String, List<String>> map) {
        Map<String, List<String>> emptyMap = Collections.emptyMap();
        if (f35451a) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null) {
                List<String> a = m26760a(map, "Cookie");
                if (a == null || a.isEmpty()) {
                    linkedHashMap.put("Cookie", list);
                }
            } else {
                linkedHashMap.put("Cookie", list);
            }
            if (map != null) {
                List<String> a2 = m26760a(map, "X-SS-Cookie");
                if (a2 != null && !a2.isEmpty()) {
                    return linkedHashMap;
                }
                linkedHashMap.put("X-SS-Cookie", list);
                return linkedHashMap;
            }
            linkedHashMap.put("X-SS-Cookie", list);
            return linkedHashMap;
        } else if (map == null) {
            return Collections.singletonMap("Cookie", list);
        } else {
            List<String> a3 = m26760a(map, "Cookie");
            if (a3 == null || a3.isEmpty()) {
                return Collections.singletonMap("Cookie", list);
            }
            return emptyMap;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0228, code lost:
        if (r4 < com.p2082ss.android.ugc.aweme.lancet.C58022e.f132235a.length) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x022a, code lost:
        com.p2082ss.android.ugc.aweme.lancet.p3385b.C58007a.m104834b();
        com.p2082ss.android.ugc.aweme.lancet.p3385b.C58007a.f132206a = !com.p2082ss.android.ugc.aweme.lancet.p3385b.C58007a.f132206a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0237, code lost:
        if (com.p2082ss.android.ugc.aweme.lancet.p3385b.C58007a.m104834b() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        android.webkit.CookieManager.getInstance().flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        if (r21 == null) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0067, code lost:
        if (r21.size() <= 0) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        r7 = (java.util.List) r21.get("Set-Cookie");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        if (r7 == null) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0071, code lost:
        r6 = com.p2082ss.android.ugc.aweme.lancet.C58022e.f132235a;
        r5 = r6.length;
        r4 = 0;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        if (r3 >= r5) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        r2 = r6[r3];
        r1 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0082, code lost:
        if (r1.hasNext() == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008e, code lost:
        if (((java.lang.String) r1.next()).startsWith(r2) == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0090, code lost:
        com.p2082ss.android.ugc.aweme.lancet.p3385b.C58007a.m104834b();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0095, code lost:
        r3 = r3 + 1;
     */
    @Override // java.net.CookieHandler, java.net.CookieManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void put(java.net.URI r20, java.util.Map r21) {
        /*
        // Method dump skipped, instructions count: 577
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p984c.C14638g.put(java.net.URI, java.util.Map):void");
    }

    /* renamed from: a */
    private void m26765a(String str, boolean z) {
        if (z) {
            android.webkit.CookieManager.getInstance().flush();
            return;
        }
        ArrayList<String> arrayList = this.f35457f;
        if (arrayList != null && !arrayList.isEmpty() && Build.VERSION.SDK_INT >= 21) {
            Iterator<String> it = this.f35457f.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next())) {
                    android.webkit.CookieManager.getInstance().flush();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m26766a(JSONObject jSONObject, String str, boolean z) {
        if (this.f35456e != null && z) {
            try {
                jSONObject.put("return", str);
            } catch (JSONException unused) {
            }
            this.f35456e.mo23520a();
        }
    }

    /* renamed from: a */
    private static Map m26761a(C14638g gVar, URI uri, Map map) {
        List list;
        boolean z = C58007a.f132206a;
        Map<String, List<String>> a = gVar.m26762a(uri, map);
        if (z) {
            try {
                HashMap hashMap = new HashMap(a);
                if (map == null || TextUtils.isEmpty("Cookie")) {
                    list = null;
                } else {
                    list = (List) map.get("Cookie");
                    if (list == null || list.isEmpty()) {
                        list = (List) map.get("Cookie".toLowerCase());
                    }
                }
                if (list != null && list.size() > 0) {
                    hashMap.put("Cookie", list);
                }
                C58007a.m104832a(uri, hashMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return C58023f.m104844a(uri, a);
    }

    /* renamed from: a */
    private static void m26764a(android.webkit.CookieManager cookieManager, String str, String str2) {
        String cookie;
        cookieManager.setCookie(str, str2);
        if (C29843f.m60129a(C17879g.m33104a()) && C49498ad.m92737a() && (cookie = android.webkit.CookieManager.getInstance().getCookie(C49540a.m92781a())) != null && !TextUtils.equals(cookie, C49540a.m92784b())) {
            C49540a.m92783a(C49540a.m92781a(), cookie);
        }
    }

    public C14638g(final Context context, int i, android.webkit.CookieManager cookieManager, AbstractC14640a aVar) {
        if (i > 0) {
            C13590c.f33037c.schedule(new Runnable() {
                /* class com.bytedance.frameworks.baselib.network.http.p984c.C14638g.RunnableC146391 */

                static {
                    Covode.recordClassIndex(16730);
                }

                public final void run() {
                    C14638g.this.f35453b = new C14626a(new C14636f(context), AbstractC14627b.f35418a);
                }
            }, (long) i, TimeUnit.SECONDS);
        } else {
            this.f35453b = new C14626a(new C14636f(context), AbstractC14627b.f35418a);
        }
        this.f35454c = cookieManager;
        this.f35457f = null;
        this.f35456e = aVar;
        try {
            new JSONObject().put("init", "success");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        AbstractC14640a aVar2 = this.f35456e;
        if (aVar2 != null) {
            aVar2.mo23520a();
        }
    }
}
