package com.p2082ss.android.ugc.aweme.p2355ax.p2356a;

import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.android.monitor.webview.AbstractC12009a;
import com.bytedance.android.monitor.webview.AbstractC12021c;
import com.bytedance.android.monitor.webview.C12036f;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.p2357a.C34294a;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.p2357a.C34297b;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.p2358b.C34310a;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.p2358b.C34314d;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.p2358b.C34315e;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.p2358b.C34318h;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.p2358b.EnumC34313c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ax.a.j */
public final class C34330j extends AbstractC34303ad implements AbstractC34340m {

    /* renamed from: g */
    private final List<String> f81185g = new ArrayList();

    /* renamed from: h */
    private final AbstractC89244h f81186h = C89250i.m154774a(EnumC89331m.NONE, new C34332b(this));

    /* renamed from: i */
    private final AbstractC89244h f81187i = C89250i.m154774a(EnumC89331m.NONE, new C34331a(this));

    /* renamed from: j */
    private final AbstractC89244h f81188j = C89250i.m154774a(EnumC89331m.NONE, new C34333c(this));

    /* renamed from: k */
    private final AbstractC89244h f81189k = C89250i.m154774a(EnumC89331m.NONE, new C34336d(this));

    /* renamed from: l */
    private boolean f81190l;

    /* renamed from: m */
    private List<String> f81191m = C89086z.INSTANCE;

    /* renamed from: n */
    private final List<AbstractC12009a> f81192n = new ArrayList();

    /* renamed from: o */
    private boolean f81193o = true;

    /* renamed from: p */
    private long f81194p;

    /* renamed from: q */
    private long f81195q;

    /* renamed from: r */
    private final Map<Uri, Long> f81196r = new LinkedHashMap();

    static {
        Covode.recordClassIndex(41274);
    }

    /* renamed from: s */
    private final C34294a m70207s() {
        return (C34294a) this.f81187i.getValue();
    }

    /* renamed from: t */
    private AbstractC12021c m70208t() {
        return (AbstractC12021c) this.f81189k.getValue();
    }

    /* renamed from: c */
    public final WebView mo60784c() {
        return (WebView) this.f81186h.getValue();
    }

    /* renamed from: d */
    public final AbstractC12021c.C12022a mo60785d() {
        return (AbstractC12021c.C12022a) this.f81188j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34293a, com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34345r
    /* renamed from: a */
    public final void mo60718a(String str, boolean z) {
        C89219l.m154721d(str, "");
        super.mo60718a(str, z);
        this.f81193o = true;
        this.f81194p = System.currentTimeMillis();
        C34294a s = m70207s();
        if (s != null && !C34294a.m70163a(mo60740a().mo60803b())) {
            s.mo60722a("detailClearWebViewData", s);
            s.mo60722a("detailEnableDomData", s);
        }
        C34294a s2 = m70207s();
        if (s2 != null) {
            String b = mo60740a().mo60803b();
            if (!C34294a.m70163a(b)) {
                s2.f81088c.f81113h = b;
                s2.f81088c.f81112g = s2.f81092g;
                s2.f81088c.f81114i = b;
                s2.f81088c.f81116k = SystemClock.uptimeMillis();
                s2.f81095j.removeCallbacks(s2.f81097l);
                s2.f81095j.postDelayed(s2.f81097l, 3000);
            }
        }
        m70208t().mo19245g(mo60784c(), mo60740a().mo60803b());
        C34350v a = mo60740a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "load_url");
        AbstractC34303ad.m70177a(this, "hybrid_app_monitor_load_url_event", a, jSONObject, null, 24);
        m70205a(mo60740a().f81207a, "load_url");
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34346s
    /* renamed from: a */
    public final void mo60775a(C34308b bVar, C34320c cVar) {
        C89219l.m154721d(bVar, "");
        C34351w q = mo60749q();
        JSONObject jSONObject = new JSONObject();
        C34322e.m70198a(jSONObject, bVar.getFormatData());
        if (cVar == null) {
            jSONObject.put("error_type", "success");
        } else {
            C34322e.m70198a(jSONObject, cVar.getFormatData());
        }
        AbstractC34303ad.m70177a(this, "hybrid_app_monitor_fetch_api_error", q, jSONObject, null, 24);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: a */
    public final void mo60776a(String str) {
        Uri parse;
        if (str != null && (parse = Uri.parse(str)) != null && !m70205a(parse, "should_intercept_request")) {
            m70206b(parse, "should_intercept_request");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: a */
    public final void mo60772a(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Uri url;
        C34294a s = m70207s();
        if (!(s == null || webResourceRequest == null || webResourceRequest.getUrl() == null)) {
            s.f81088c.f81130y = -2;
            s.f81088c.f81121p = webResourceRequest.isForMainFrame();
            s.f81088c.f81105B = webResourceRequest.getUrl().toString();
            s.f81088c.f81131z = Integer.valueOf(webResourceResponse != null ? webResourceResponse.getStatusCode() : 0);
            s.mo60727d();
        }
        C34350v a = mo60740a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_received_http_error");
        if (webResourceResponse != null) {
            jSONObject.put("received_status_code", String.valueOf(webResourceResponse.getStatusCode()));
        }
        if (!(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null)) {
            jSONObject.put("failing_url", url.toString());
        }
        AbstractC34303ad.m70177a(this, "hybrid_app_monitor_h5_received_error", a, jSONObject, null, 24);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34346s
    /* renamed from: a */
    public final void mo60779a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C34351w q = mo60749q();
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("trigger", str2);
        if (jSONObject != null) {
            C34322e.m70198a(jSONObject4, jSONObject);
        }
        mo60742a(str, q, jSONObject4, jSONObject2, jSONObject3);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: a */
    public final void mo60778a(String str, String str2, String str3, long j) {
        C34350v a = mo60740a();
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            jSONObject.put("download_url", str);
        }
        if (str2 != null) {
            jSONObject.put("content_disposition", str2);
        }
        if (str3 != null) {
            jSONObject.put("mime_type", str3);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("content_length", j);
        AbstractC34303ad.m70177a(this, "hybrid_app_monitor_h5_download", a, jSONObject, jSONObject2, 16);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34303ad
    /* renamed from: a */
    public final void mo60743a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
        int i;
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        Iterator<String> keys;
        JSONObject jSONObject3;
        C34314d a;
        super.mo60743a(str, num, jSONObject, jSONObject2);
        if (!C89219l.m154714a((Object) "ttmt_webview_timing_monitor_custom_service", (Object) str)) {
            if (jSONObject2 != null) {
                try {
                    String optString = jSONObject2.optString("navigation_id");
                    String optString2 = jSONObject2.optString("ev_type");
                    if (optString2 != null) {
                        Double d = null;
                        switch (optString2.hashCode()) {
                            case -1077756671:
                                if (optString2.equals("memory")) {
                                    C34351w q = mo60749q();
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("navigation_id", optString);
                                    AbstractC34303ad.m70177a(this, "hybrid_app_monitor_js_memory", q, jSONObject4, jSONObject2.optJSONObject("event"), 16);
                                    break;
                                }
                                break;
                            case -270976012:
                                if (!(!optString2.equals("performance_interval") || (optJSONObject2 = jSONObject2.optJSONObject("event")) == null || (optJSONObject3 = optJSONObject2.optJSONObject("navigation")) == null || (keys = optJSONObject3.keys()) == null)) {
                                    while (keys.hasNext()) {
                                        String next = keys.next();
                                        Double valueOf = Double.valueOf(optJSONObject3.optDouble(next, 0.0d));
                                        if (valueOf.doubleValue() > 0.0d && !this.f81185g.contains(next) && valueOf != null) {
                                            valueOf.doubleValue();
                                            List<String> list = this.f81185g;
                                            C89219l.m154716b(next, "");
                                            list.add(next);
                                            C34351w q2 = mo60749q();
                                            JSONObject jSONObject5 = new JSONObject();
                                            jSONObject5.put("trigger", next);
                                            jSONObject5.put("navigation_id", optString);
                                            EnumC34313c cVar = EnumC34313c.H5_TIMING;
                                            C89219l.m154721d(next, "");
                                            C89219l.m154721d(optJSONObject3, "");
                                            C89219l.m154721d(cVar, "");
                                            C34318h a2 = C34315e.m70194a(cVar);
                                            if (a2 == null || (a = a2.mo60763a(next, optJSONObject3)) == null) {
                                                jSONObject3 = null;
                                            } else {
                                                jSONObject3 = new JSONObject();
                                                jSONObject3.put(a.f81160a, a.f81161b);
                                            }
                                            AbstractC34303ad.m70177a(this, "hybrid_app_monitor_h5_timeline_event", q2, jSONObject5, jSONObject3, 16);
                                        }
                                    }
                                    break;
                                }
                                break;
                            case 101609:
                                if (optString2.equals("fps")) {
                                    JSONObject optJSONObject4 = jSONObject2.optJSONObject("event");
                                    if (optJSONObject4 != null) {
                                        d = Double.valueOf(optJSONObject4.optDouble("fps"));
                                    }
                                    C34351w q3 = mo60749q();
                                    JSONObject jSONObject6 = new JSONObject();
                                    jSONObject6.put("navigation_id", optString);
                                    JSONObject jSONObject7 = new JSONObject();
                                    jSONObject7.put("fps", d);
                                    AbstractC34303ad.m70177a(this, "hybrid_app_monitor_js_fps", q3, jSONObject6, jSONObject7, 16);
                                    break;
                                }
                                break;
                            case 1669986551:
                                if (optString2.equals("static_error")) {
                                    JSONObject optJSONObject5 = jSONObject2.optJSONObject("event");
                                    C34351w q4 = mo60749q();
                                    JSONObject jSONObject8 = new JSONObject();
                                    jSONObject8.put("navigation_id", optString);
                                    if (optJSONObject5 != null) {
                                        Uri parse = Uri.parse(optJSONObject5.optString("st_url"));
                                        C89219l.m154716b(parse, "");
                                        C34322e.m70198a(jSONObject8, new C34350v(parse, "resource_", null, 4).getFormatData());
                                    }
                                    AbstractC34303ad.m70177a(this, "hybrid_app_monitor_load_resource_error", q4, jSONObject8, null, 24);
                                    break;
                                }
                                break;
                            case 1837434847:
                                if (!(!optString2.equals("static_performance") || (optJSONObject = jSONObject2.optJSONObject("event")) == null || (optJSONArray = optJSONObject.optJSONArray("resources")) == null)) {
                                    int length = optJSONArray.length();
                                    for (int i2 = 0; i2 < length; i2++) {
                                        JSONObject optJSONObject6 = optJSONArray.optJSONObject(i2);
                                        if (optJSONObject6 != null) {
                                            String optString3 = optJSONObject6.optString(StringSet.name);
                                            C34351w q5 = mo60749q();
                                            JSONObject jSONObject9 = new JSONObject();
                                            jSONObject9.put("trigger", "on_load");
                                            jSONObject9.put("navigation_id", optString);
                                            Uri parse2 = Uri.parse(optString3);
                                            C89219l.m154716b(parse2, "");
                                            C34322e.m70198a(jSONObject9, new C34350v(parse2, "resource_", null, 4).getFormatData());
                                            AbstractC34303ad.m70177a(this, "hybrid_app_monitor_load_resource_event", q5, jSONObject9, C34315e.m70195a(optJSONObject6, EnumC34313c.H5_RESOURCE_TIMING), 16);
                                        }
                                    }
                                    break;
                                }
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                    e.printStackTrace();
                    return;
                }
            }
            for (T t : this.f81192n) {
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                t.mo13268a(str, i, jSONObject, jSONObject2);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34303ad
    /* renamed from: a */
    public final void mo60742a(String str, AbstractC34348t tVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(tVar, "");
        try {
            m70204a(tVar, str, jSONObject, jSONObject2, jSONObject3);
        } catch (Exception e) {
            mo60741a(e, tVar.mo60803b(), "h5");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: a */
    public final void mo60777a(String str, String str2) {
        C89219l.m154721d(str, "");
        if (str2 != null) {
            AbstractC12021c.C12022a d = mo60785d();
            C11950d.m21101a(d.f28794z, str, String.valueOf(str2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: f */
    public final void mo60787f() {
        C34294a s = m70207s();
        if (s != null) {
            s.f81088c.f81123r++;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: g */
    public final void mo60788g() {
        C34294a s = m70207s();
        if (s != null) {
            s.f81088c.f81127v++;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: h */
    public final void mo60789h() {
        C34294a s = m70207s();
        if (s != null) {
            s.f81088c.f81126u++;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: i */
    public final void mo60790i() {
        C34294a s = m70207s();
        if (s != null) {
            s.f81088c.f81124s++;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34346s
    /* renamed from: j */
    public final void mo60791j() {
        C34294a s = m70207s();
        if (s != null) {
            s.f81088c.f81110e = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ax.a.j$b */
    static final class C34332b extends AbstractC89220m implements AbstractC89171a<WebView> {

        /* renamed from: a */
        final /* synthetic */ C34330j f81198a;

        static {
            Covode.recordClassIndex(41276);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34332b(C34330j jVar) {
            super(0);
            this.f81198a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WebView invoke() {
            View view = (View) this.f81198a.f81138e.mo60766a(View.class);
            if (view == null || !(view instanceof WebView)) {
                return null;
            }
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.webkit.WebView");
            return (WebView) view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ax.a.j$d */
    static final class C34336d extends AbstractC89220m implements AbstractC89171a<AbstractC12021c> {

        /* renamed from: a */
        final /* synthetic */ C34330j f81201a;

        static {
            Covode.recordClassIndex(41280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34336d(C34330j jVar) {
            super(0);
            this.f81201a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC12021c invoke() {
            AbstractC12021c cVar = C12044i.f28862a;
            AbstractC12021c.C12022a d = this.f81201a.mo60785d();
            if (this.f81201a.mo60784c() != null) {
                cVar.mo19227a(d);
            }
            return cVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34293a, com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34345r
    /* renamed from: b */
    public final void mo60719b() {
        super.mo60719b();
        AbstractC12021c t = m70208t();
        t.mo19224a(t.mo19226t(mo60784c()));
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: e */
    public final void mo60786e() {
        C34294a s = m70207s();
        if (s != null && s.f81088c.f81119n == 0) {
            s.f81088c.f81119n = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ax.a.j$a */
    static final class C34331a extends AbstractC89220m implements AbstractC89171a<C34294a> {

        /* renamed from: a */
        final /* synthetic */ C34330j f81197a;

        static {
            Covode.recordClassIndex(41275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34331a(C34330j jVar) {
            super(0);
            this.f81197a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34294a invoke() {
            AbstractC34342o n = this.f81197a.mo60746n();
            List<String> list = null;
            if (n == null || !n.mo60799d()) {
                return null;
            }
            WebView c = this.f81197a.mo60784c();
            AbstractC34342o n2 = this.f81197a.mo60746n();
            if (n2 != null) {
                list = n2.mo60800e();
            }
            return new C34294a(c, list, this.f81197a.mo60747o(), this.f81197a.mo60746n());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ax.a.j$c */
    static final class C34333c extends AbstractC89220m implements AbstractC89171a<AbstractC12021c.C12022a> {

        /* renamed from: a */
        final /* synthetic */ C34330j f81199a;

        /* renamed from: com.ss.android.ugc.aweme.ax.a.j$c$b */
        public final /* synthetic */ class C34335b implements AbstractC12009a {

            /* renamed from: a */
            private final /* synthetic */ AbstractC89188r f81200a;

            static {
                Covode.recordClassIndex(41279);
            }

            public C34335b(AbstractC89188r rVar) {
                this.f81200a = rVar;
            }

            @Override // com.bytedance.android.monitor.webview.AbstractC12009a
            /* renamed from: a */
            public final /* synthetic */ void mo13268a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
                C89219l.m154716b(this.f81200a.mo8774a(str, Integer.valueOf(i), jSONObject, jSONObject2), "");
            }
        }

        static {
            Covode.recordClassIndex(41277);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34333c(C34330j jVar) {
            super(0);
            this.f81199a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC12021c.C12022a invoke() {
            String str;
            AbstractC12021c cVar = C12044i.f28862a;
            AbstractC12021c.C12022a d = cVar.mo19228d();
            d.f28775g = "HybridMonitor";
            d.f28793y = "mt";
            d.f28770b = C12036f.m21317a();
            d.f28774f = new String[]{cVar.mo19226t(this.f81199a.mo60784c())};
            d.f28784p = true;
            d.f28785q = true;
            d.f28779k = true;
            d.f28782n = true;
            d.f28781m = true;
            d.f28780l = true;
            d.f28783o = true;
            d.mo19254a(new C34335b(new C34334a(this.f81199a)));
            if (this.f81199a.f81083b) {
                d.f28786r = true;
                AbstractC34342o n = this.f81199a.mo60746n();
                if (n != null) {
                    str = n.mo60798c();
                } else {
                    str = null;
                }
                d.f28778j = str;
            }
            return d;
        }

        /* renamed from: com.ss.android.ugc.aweme.ax.a.j$c$a */
        static final /* synthetic */ class C34334a extends C89217j implements AbstractC89188r<String, Integer, JSONObject, JSONObject, C89391z> {
            static {
                Covode.recordClassIndex(41278);
            }

            C34334a(C34330j jVar) {
                super(4, jVar, C34330j.class, "monitorStatusAndDuration", "monitorStatusAndDuration(Ljava/lang/String;Ljava/lang/Integer;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89188r
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ C89391z mo8774a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
                ((AbstractC34303ad) this.receiver).mo60743a(str, num, jSONObject, jSONObject2);
                return C89391z.f203057a;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34346s
    /* renamed from: k */
    public final void mo60792k() {
        C34294a s = m70207s();
        if (s != null) {
            if (!C34294a.m70163a(s.f81088c.f81113h)) {
                s.f81096k = SystemClock.uptimeMillis();
                s.mo60722a("detailGetWebViewData", s);
                s.f81088c.f81111f = SystemClock.uptimeMillis();
                s.f81095j.removeCallbacks(s.f81097l);
                boolean z = false;
                if (!s.f81087b) {
                    s.mo60723a(false, true);
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                if (C34310a.m70193a(s.f81090e).f81153a == 1) {
                    z = true;
                }
                s.f81088c.f81106a = z;
                s.f81088c.f81107b = SystemClock.uptimeMillis() - uptimeMillis;
                s.mo60724a(s.f81088c);
                s.mo60721a();
                if (s.f81091f != null) {
                    s.f81091f.mo60797a("hybrid_ttwebview_monitor", s.mo60725b());
                }
            }
            AbstractC34303ad.m70177a(this, "hybrid_app_monitor_h5_blank_screen", mo60749q(), s.mo60721a(), s.mo60726c(), 16);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: a */
    public final void mo60781a(boolean z) {
        this.f81190l = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: a */
    public final void mo60780a(List<String> list) {
        C89219l.m154721d(list, "");
        this.f81191m = list;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: a */
    public final void mo60774a(AbstractC12009a aVar) {
        if (aVar != null && !this.f81192n.contains(aVar)) {
            this.f81192n.add(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: b */
    public final void mo60783b(String str) {
        Uri parse;
        if (str != null && (parse = Uri.parse(str)) != null && !m70205a(parse, "should_override_url_loading")) {
            m70206b(parse, "should_override_url_loading");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: b */
    public final void mo60782b(Uri uri) {
        Long remove;
        String str;
        C89219l.m154721d(uri, "");
        if ((C89219l.m154714a((Object) uri.getScheme(), (Object) "http") || C89219l.m154714a((Object) uri.getScheme(), (Object) "https")) && 1 != 0 && uri != null && (remove = this.f81196r.remove(uri)) != null) {
            long longValue = remove.longValue();
            C34294a s = m70207s();
            if (s != null) {
                String b = mo60749q().f81210b.mo60803b();
                if (s.f81088c.f81118m == 0 && !C34294a.m70163a(b)) {
                    s.f81088c.f81114i = b;
                    s.f81088c.f81118m = SystemClock.uptimeMillis();
                    s.mo60723a(true, false);
                }
                s.f81095j.removeCallbacks(s.f81097l);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f81193o) {
                longValue = this.f81194p;
                this.f81195q = currentTimeMillis;
            }
            C34350v a = mo60740a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger", "on_load");
            if (this.f81193o) {
                str = "first_screen";
            } else {
                str = "navigation";
            }
            jSONObject.put("is_first_screen", str);
            JSONObject jSONObject2 = new JSONObject();
            if (currentTimeMillis > 0 && longValue > 0) {
                jSONObject2.put("page_load_interval", currentTimeMillis - longValue);
            }
            long j = this.f81195q;
            if (j > 0 && this.f81194p > 0) {
                jSONObject2.put("first_screen_page_load_interval", j - this.f81194p);
            }
            jSONObject2.put("event_ts", currentTimeMillis);
            AbstractC34303ad.m70177a(this, "hybrid_app_monitor_load_url_event", a, jSONObject, jSONObject2, 16);
            this.f81193o = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: a */
    public final void mo60769a(Uri uri) {
        C89219l.m154721d(uri, "");
        if ((C89219l.m154714a((Object) uri.getScheme(), (Object) "http") || C89219l.m154714a((Object) uri.getScheme(), (Object) "https")) && 1 != 0 && uri != null) {
            C34351w q = mo60749q();
            C89219l.m154721d(uri, "");
            q.f81211c = uri;
            q.f81210b = new C34350v(q.f81211c, "page_", null, 4);
            C34294a s = m70207s();
            if (s != null) {
                s.f81088c.f81114i = mo60749q().f81210b.mo60803b();
                if (s.f81088c.f81117l == 0) {
                    s.f81088c.f81117l = SystemClock.uptimeMillis();
                }
            }
            m70208t().mo19243c(mo60784c(), mo60740a().mo60803b());
            long currentTimeMillis = System.currentTimeMillis();
            this.f81196r.put(uri, Long.valueOf(currentTimeMillis));
            if (!this.f81193o) {
                C34350v a = mo60740a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("trigger", "navigation_start");
                jSONObject.put("is_first_screen", "navigation");
                JSONObject jSONObject2 = new JSONObject();
                long j = this.f81195q;
                if (j > 0 && this.f81194p > 0) {
                    jSONObject2.put("first_screen_page_load_interval", j - this.f81194p);
                }
                jSONObject2.put("event_ts", currentTimeMillis);
                AbstractC34303ad.m70177a(this, "hybrid_app_monitor_load_url_event", a, jSONObject, jSONObject2, 16);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: a */
    public final void mo60770a(SslError sslError) {
        C34294a s = m70207s();
        if (!(s == null || sslError == null)) {
            s.f81088c.f81130y = -3;
            s.f81088c.f81131z = Integer.valueOf(sslError.getPrimaryError());
            s.f81088c.f81105B = sslError.getUrl();
            s.f81088c.f81104A = sslError.toString();
            s.mo60727d();
        }
        C34350v a = mo60740a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_received_ssl_error");
        if (sslError != null) {
            jSONObject.put("received_primary_error", String.valueOf(sslError.getPrimaryError()));
            jSONObject.put("failing_url", sslError.getUrl());
        }
        AbstractC34303ad.m70177a(this, "hybrid_app_monitor_h5_received_error", a, jSONObject, null, 24);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: a */
    public final void mo60773a(WebView webView, int i) {
        C34294a s = m70207s();
        if (s != null) {
            s.f81088c.f81115j = i;
        }
        m70208t().mo19237a(webView, i);
    }

    /* renamed from: a */
    private final boolean m70205a(Uri uri, String str) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        C89219l.m154716b(scheme, "");
        Locale locale = Locale.getDefault();
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = scheme.toLowerCase(locale);
        C89219l.m154716b(lowerCase, "");
        if (!C89219l.m154714a((Object) lowerCase, (Object) "file")) {
            return false;
        }
        C34351w q = mo60749q();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("resource_url", String.valueOf(uri));
        AbstractC34303ad.m70177a(this, "hybrid_app_monitor_file_schema_event", q, jSONObject, jSONObject2, 16);
        return true;
    }

    /* renamed from: b */
    private final boolean m70206b(Uri uri, String str) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            C89219l.m154716b(scheme, "");
            Locale locale = Locale.getDefault();
            C89219l.m154716b(locale, "");
            Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = scheme.toLowerCase(locale);
            C89219l.m154716b(lowerCase, "");
            if ((C89219l.m154714a((Object) lowerCase, (Object) "http") || C89219l.m154714a((Object) lowerCase, (Object) "https")) && 1 != 0) {
                C34350v vVar = new C34350v(uri, "resource_", null, 4);
                if (this.f81190l) {
                    if (!this.f81191m.isEmpty()) {
                        Iterator<String> it = this.f81191m.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            String host = uri.getHost();
                            if (host != null) {
                                C89219l.m154716b(host, "");
                                if (C89361p.m154929e((CharSequence) host, (CharSequence) next)) {
                                    break;
                                }
                            }
                        }
                    }
                    C34351w q = mo60749q();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("trigger", str);
                    C34322e.m70198a(jSONObject, vVar.getFormatData());
                    AbstractC34303ad.m70177a(this, "hybrid_app_monitor_resource_load_event", q, jSONObject, null, 24);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: a */
    public final void mo60768a(int i, String str) {
        C34294a s = m70207s();
        if (s != null && C34294a.m70164b(str)) {
            s.f81088c.f81130y = -1;
            s.f81088c.f81131z = Integer.valueOf(i);
            s.f81088c.f81105B = str;
            s.mo60727d();
        }
        C34350v a = mo60740a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_received_error");
        jSONObject.put("received_error_code", String.valueOf(i));
        if (str != null) {
            jSONObject.put("failing_url", str);
        }
        AbstractC34303ad.m70177a(this, "hybrid_app_monitor_h5_received_error", a, jSONObject, null, 24);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m
    /* renamed from: a */
    public final void mo60771a(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Uri url;
        Uri url2;
        int i;
        C34294a s = m70207s();
        if (!(s == null || webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null || !C34294a.m70164b(url2.toString()))) {
            s.f81088c.f81130y = -1;
            s.f81088c.f81121p = webResourceRequest.isForMainFrame();
            s.f81088c.f81105B = url2.toString();
            C34297b bVar = s.f81088c;
            if (webResourceError != null) {
                i = webResourceError.getErrorCode();
            } else {
                i = 0;
            }
            bVar.f81131z = Integer.valueOf(i);
            s.mo60727d();
        }
        C34350v a = mo60740a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "on_received_error");
        if (webResourceError != null) {
            jSONObject.put("received_error_code", String.valueOf(webResourceError.getErrorCode()));
            jSONObject.put("received_error_desc", webResourceError.getDescription());
        }
        if (!(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null)) {
            jSONObject.put("failing_url", url.toString());
        }
        AbstractC34303ad.m70177a(this, "hybrid_app_monitor_h5_received_error", a, jSONObject, null, 24);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34330j(Uri uri, C34324g gVar, Map<String, String> map) {
        super(uri, gVar, map);
        C89219l.m154721d(uri, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(map, "");
    }

    /* renamed from: a */
    private final void m70204a(AbstractC34348t tVar, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str2;
        AbstractC12021c t = m70208t();
        WebView c = mo60784c();
        String b = tVar.mo60803b();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put(StringSet.type, "h5");
        if (mo60748p() == null) {
            str2 = "origin";
        } else {
            str2 = "fallback";
        }
        jSONObject.put("is_fallback", str2);
        AbstractC34349u p = mo60748p();
        if (p != null) {
            String l = p.mo60744l();
            if (l != null) {
                jSONObject.put("fallback_reason", l);
            }
            String m = p.mo60745m();
            if (m != null) {
                jSONObject.put("fallback_message", m);
            }
        }
        C34322e.m70198a(jSONObject, tVar.getFormatData());
        C34350v r = mo60750r();
        if (r != null) {
            C34322e.m70198a(jSONObject, r.getFormatData());
        }
        String jSONObject4 = jSONObject.toString();
        JSONObject jSONObject5 = new JSONObject();
        if (jSONObject2 != null) {
            C34322e.m70198a(jSONObject5, jSONObject2);
        }
        String jSONObject6 = jSONObject5.toString();
        JSONObject jSONObject7 = new JSONObject();
        if (jSONObject3 != null) {
            C34322e.m70198a(jSONObject7, jSONObject3);
        }
        t.mo19231a(c, b, str, jSONObject4, jSONObject6, jSONObject7.toString());
        m70208t().mo19251a(mo60784c());
    }
}
