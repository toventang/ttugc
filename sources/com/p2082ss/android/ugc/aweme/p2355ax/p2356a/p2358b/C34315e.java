package com.p2082ss.android.ugc.aweme.p2355ax.p2356a.p2358b;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89376n;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ax.a.b.e */
public final class C34315e {

    /* renamed from: a */
    public static final C34315e f81162a = new C34315e();

    /* renamed from: b */
    private static final List<C34312b> f81163b;

    /* renamed from: c */
    private static final List<C34312b> f81164c;

    /* renamed from: d */
    private static final List<C34312b> f81165d;

    /* renamed from: e */
    private static final C34318h f81166e;

    /* renamed from: f */
    private static final C34318h f81167f;

    /* renamed from: g */
    private static final C34318h f81168g;

    private C34315e() {
    }

    static {
        Covode.recordClassIndex(41259);
        List<C34312b> c = C89070n.m154524c(new C34312b("PageStartTime", "StartLoadTime", "rn_load_interval"), new C34312b("StartLoadTime", "FirstDrawTime", "first_draw_interval"), new C34312b("FirstDrawTime", "FirstScreenTime", "first_screen_interval"), new C34312b("FirstDrawTime", "PageFinishTime", "page_finish_interval"));
        f81163b = c;
        List<C34312b> c2 = C89070n.m154524c(new C34312b("redirectStart", "redirectEnd", "redirect_interval"), new C34312b("fetchStart", "domainLookupStart", "app_cache_interval"), new C34312b("domainLookupStart", "domainLookupEnd", "dns_interval"), new C34312b("connectStart", "connectEnd", "tcp_interval"), new C34312b("requestStart", "responseStart", "request_interval"), new C34312b("responseStart", "responseEnd", "response_interval"), new C34312b("domLoading", "domInteractive", "dom_load_interval"), new C34312b("domContentLoadedEventStart", "domContentLoadedEventEnd", "dom_content_loaded_interval"), new C34312b("domContentLoadedEventEnd", "domComplete", "dom_complete_interval"));
        f81164c = c2;
        List<C34312b> c3 = C89070n.m154524c(new C34312b("redirectStart", "redirectEnd", "redirect_interval"), new C34312b("fetchStart", "domainLookupStart", "app_cache_interval"), new C34312b("domainLookupStart", "domainLookupEnd", "dns_interval"), new C34312b("connectStart", "connectEnd", "tcp_interval"), new C34312b("requestStart", "responseStart", "request_interval"), new C34312b("responseStart", "responseEnd", "response_interval"));
        f81165d = c3;
        f81166e = new C34318h(c);
        f81167f = new C34318h(c2);
        f81168g = new C34318h(c3);
    }

    /* renamed from: a */
    public static C34318h m70194a(EnumC34313c cVar) {
        int i = C34316f.f81169a[cVar.ordinal()];
        if (i == 1) {
            return f81166e;
        }
        if (i == 2) {
            return f81167f;
        }
        if (i == 3) {
            return f81168g;
        }
        throw new C89376n();
    }

    /* renamed from: a */
    public static JSONObject m70195a(JSONObject jSONObject, EnumC34313c cVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(cVar, "");
        C34318h a = m70194a(cVar);
        if (a == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        C89219l.m154716b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            Long valueOf = Long.valueOf(jSONObject.optLong(next));
            if (!(valueOf.longValue() == 0 || valueOf == null)) {
                valueOf.longValue();
                C89219l.m154716b(next, "");
                C34314d a2 = a.mo60763a(next, jSONObject);
                if (a2 != null) {
                    jSONObject2.put(a2.f81160a, a2.f81161b);
                }
            }
        }
        return jSONObject2;
    }
}
