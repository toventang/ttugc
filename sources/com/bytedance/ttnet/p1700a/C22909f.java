package com.bytedance.ttnet.p1700a;

import android.webkit.CookieManager;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h;
import com.bytedance.frameworks.baselib.network.http.p984c.C14626a;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14722o;
import com.bytedance.frameworks.baselib.network.p981c.C14609c;
import com.bytedance.frameworks.p977a.p978a.C14578a;
import com.bytedance.ttnet.C22932c;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ttnet.a.f */
public class C22909f implements C14578a.AbstractC14579a, C14659h.AbstractC14660a, C14659h.AbstractC14661b, C14731e.AbstractC14739h, C22932c.AbstractC22934b {

    /* renamed from: g */
    private static volatile C22909f f54114g;

    /* renamed from: a */
    private String f54115a;

    /* renamed from: b */
    private int f54116b;

    /* renamed from: c */
    private int f54117c;

    /* renamed from: d */
    private int f54118d;

    /* renamed from: e */
    private int f54119e;

    /* renamed from: f */
    private int f54120f;

    static {
        Covode.recordClassIndex(26817);
    }

    private C22909f() {
        mo37245h();
    }

    @Override // com.bytedance.frameworks.p977a.p978a.C14578a.AbstractC14579a
    /* renamed from: d */
    public final boolean mo23458d() {
        if (this.f54116b > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.frameworks.p977a.p978a.C14578a.AbstractC14579a
    /* renamed from: e */
    public final boolean mo23459e() {
        if (this.f54117c > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.frameworks.p977a.p978a.C14578a.AbstractC14579a
    /* renamed from: f */
    public final boolean mo23460f() {
        if (this.f54118d > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h.AbstractC14661b
    /* renamed from: c */
    public final boolean mo23629c() {
        if (!C22898a.f54059l && this.f54119e > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h.AbstractC14660a
    /* renamed from: b */
    public final boolean mo23628b() {
        if (!C22898a.f54058k && TTNetInit.getTTNetDepend().mo37258a(TTNetInit.getTTNetDepend().mo37259a(), "chromium_boot_failures", 0) > 5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C22909f m43182a() {
        MethodCollector.m26663i(4440);
        if (f54114g == null) {
            synchronized (C22909f.class) {
                try {
                    if (f54114g == null) {
                        f54114g = new C22909f();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4440);
                    throw th;
                }
            }
        }
        C22909f fVar = f54114g;
        MethodCollector.m26664o(4440);
        return fVar;
    }

    @Override // com.bytedance.ttnet.C22932c.AbstractC22934b
    /* renamed from: g */
    public final boolean mo37239g() {
        if (C22898a.f54059l) {
            C14722o.f35853b = 0;
            return false;
        } else if (C22898a.f54060m) {
            C14722o.f35853b = 8;
            return false;
        } else if (C22898a.f54058k || this.f54120f <= 5) {
            TTNetInit.getTTNetDepend();
            return true;
        } else {
            C14722o.f35853b = 3;
            return false;
        }
    }

    /* renamed from: h */
    public final void mo37245h() {
        this.f54115a = TTNetInit.getTTNetDepend().mo37260a(TTNetInit.getTTNetDepend().mo37259a(), "share_cookie_host_list", "");
        TTNetInit.getTTNetDepend().mo37262a(this.f54115a);
        boolean z = false;
        this.f54116b = TTNetInit.getTTNetDepend().mo37258a(TTNetInit.getTTNetDepend().mo37259a(), "add_ss_queries_open", 0);
        int a = TTNetInit.getTTNetDepend().mo37258a(TTNetInit.getTTNetDepend().mo37259a(), "add_ss_queries_header_open", 0);
        this.f54117c = a;
        if (this.f54116b > 0 || a > 0) {
            SsInterceptor.f54304a = true;
        }
        this.f54118d = TTNetInit.getTTNetDepend().mo37258a(TTNetInit.getTTNetDepend().mo37259a(), "add_ss_queries_plaintext_open", 1);
        this.f54119e = TTNetInit.getTTNetDepend().mo37258a(TTNetInit.getTTNetDepend().mo37259a(), "http_dns_enabled", 0);
        this.f54120f = TTNetInit.getTTNetDepend().mo37258a(TTNetInit.getTTNetDepend().mo37259a(), "chromium_boot_failures", 0);
        int a2 = TTNetInit.getTTNetDepend().mo37258a(TTNetInit.getTTNetDepend().mo37259a(), "query_filter_enabled", Integer.MIN_VALUE);
        String a3 = TTNetInit.getTTNetDepend().mo37260a(TTNetInit.getTTNetDepend().mo37259a(), "query_filter_actions", "");
        C14609c.m26706a().mo23496b(TTNetInit.getTTNetDepend().mo37260a(TTNetInit.getTTNetDepend().mo37259a(), "L0_params", ""));
        if (a2 != Integer.MIN_VALUE) {
            C14609c a4 = C14609c.m26706a();
            if (a2 > 0) {
                z = true;
            }
            a4.f35337a = z;
            C14609c.m26706a().mo23495a(a3);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14739h
    /* renamed from: d */
    public final List<String> mo23739d(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = this.f54115a.split(",");
        for (String str2 : split) {
            if (!C13627m.m24498a(str2)) {
                arrayList.add(str2);
            }
        }
        String d = TTNetInit.getTTNetDepend().mo37266d();
        if (!C13627m.m24498a(d) && !m43183a(d, arrayList)) {
            arrayList.add(d);
        }
        if (m43183a(str, arrayList)) {
            return arrayList;
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m43183a(String str, List<String> list) {
        if (!C13627m.m24498a(str) && !C13617h.m24465a(list)) {
            for (String str2 : list) {
                if (str.endsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14739h
    /* renamed from: a */
    public final List<String> mo23738a(CookieManager cookieManager, C14626a aVar, URI uri) {
        String str;
        if (uri == null) {
            return null;
        }
        if (cookieManager == null && aVar == null) {
            return null;
        }
        try {
            str = uri.getHost();
        } catch (Exception unused) {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        String[] split = this.f54115a.split(",");
        for (String str2 : split) {
            if (!C13627m.m24498a(str2)) {
                arrayList.add(str2);
            }
        }
        if (C13627m.m24498a(str) || !m43183a(str, arrayList)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (cookieManager != null) {
            String cookie = cookieManager.getCookie(TTNetInit.getTTNetDepend().mo37266d());
            if (!C13627m.m24498a(cookie)) {
                arrayList2.add(cookie);
            }
        }
        if (!C13617h.m24465a(arrayList2) || aVar == null) {
            return arrayList2;
        }
        try {
            Map<String, List<String>> map = aVar.get(URI.create(uri.getScheme() + "://" + TTNetInit.getTTNetDepend().mo37266d()), new LinkedHashMap());
            if (map == null || map.isEmpty()) {
                return arrayList2;
            }
            return map.get("Cookie");
        } catch (Throwable unused2) {
            return arrayList2;
        }
    }
}
