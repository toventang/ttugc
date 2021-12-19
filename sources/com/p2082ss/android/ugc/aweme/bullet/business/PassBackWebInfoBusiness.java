package com.p2082ss.android.ugc.aweme.bullet.business;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22030d;
import com.bytedance.retrofit2.C22099u;
import com.google.gson.C27919i;
import com.google.gson.C28022o;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35196j;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.utils.C80408et;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness */
public final class PassBackWebInfoBusiness extends BulletBusinessService.Business {

    /* renamed from: a */
    public boolean f82871a = true;

    /* renamed from: b */
    public int f82872b;

    /* renamed from: c */
    public int f82873c;

    /* renamed from: d */
    public int f82874d = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    /* renamed from: e */
    public String f82875e = "https://ads.tiktok.com/inspect/aegis/client/page/";

    /* renamed from: f */
    public String f82876f;

    /* renamed from: g */
    private final AbstractC89244h f82877g = C89250i.m154773a((AbstractC89171a) C35113c.f82883a);

    /* renamed from: h */
    private final AbstractC89244h f82878h = C89250i.m154773a((AbstractC89171a) C35112b.f82882a);

    /* renamed from: i */
    private final AbstractC89244h f82879i = C89250i.m154773a((AbstractC89171a) C35114d.f82884a);

    /* renamed from: j */
    private final AbstractC89244h f82880j = C89250i.m154773a((AbstractC89171a) C35119i.f82893a);

    static {
        Covode.recordClassIndex(42259);
    }

    /* renamed from: d */
    private final Handler m71814d() {
        return (Handler) this.f82877g.getValue();
    }

    /* renamed from: e */
    private final Map<String, Map<String, String>> m71815e() {
        return (Map) this.f82879i.getValue();
    }

    /* renamed from: a */
    public final Map<String, String> mo61950a() {
        return (Map) this.f82878h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$j */
    public static final class C35120j implements AbstractC22030d<String> {
        static {
            Covode.recordClassIndex(42269);
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(AbstractC21983b<String> bVar, C22099u<String> uVar) {
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<String> bVar, Throwable th) {
        }

        C35120j() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$a */
    public static final class CallableC35111a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f82881a;

        static {
            Covode.recordClassIndex(42260);
        }

        CallableC35111a(PassBackWebInfoBusiness passBackWebInfoBusiness) {
            this.f82881a = passBackWebInfoBusiness;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f82881a.mo61956b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$c */
    static final class C35113c extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C35113c f82883a = new C35113c();

        static {
            Covode.recordClassIndex(42262);
        }

        C35113c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$d */
    static final class C35114d extends AbstractC89220m implements AbstractC89171a<ConcurrentHashMap<String, Map<String, ? extends String>>> {

        /* renamed from: a */
        public static final C35114d f82884a = new C35114d();

        static {
            Covode.recordClassIndex(42263);
        }

        C35114d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConcurrentHashMap<String, Map<String, ? extends String>> invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$e */
    public static final class RunnableC35115e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f82885a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f82886b;

        static {
            Covode.recordClassIndex(42264);
        }

        RunnableC35115e(PassBackWebInfoBusiness passBackWebInfoBusiness, WeakReference weakReference) {
            this.f82885a = passBackWebInfoBusiness;
            this.f82886b = weakReference;
        }

        public final void run() {
            this.f82885a.mo61955a(this.f82886b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$f */
    public static final class RunnableC35116f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f82887a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f82888b;

        static {
            Covode.recordClassIndex(42265);
        }

        RunnableC35116f(PassBackWebInfoBusiness passBackWebInfoBusiness, WeakReference weakReference) {
            this.f82887a = passBackWebInfoBusiness;
            this.f82888b = weakReference;
        }

        public final void run() {
            this.f82887a.mo61955a(this.f82888b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$b */
    static final class C35112b extends AbstractC89220m implements AbstractC89171a<Map<String, String>> {

        /* renamed from: a */
        public static final C35112b f82882a = new C35112b();

        static {
            Covode.recordClassIndex(42261);
        }

        C35112b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, String> invoke() {
            return Collections.synchronizedMap(new LinkedHashMap());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$i */
    static final class C35119i extends AbstractC89220m implements AbstractC89171a<PassBackApi> {

        /* renamed from: a */
        public static final C35119i f82893a = new C35119i();

        static {
            Covode.recordClassIndex(42268);
        }

        C35119i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PassBackApi invoke() {
            return RetrofitFactory.m33635a().mo28817b("https://ads.tiktok.com").mo28823a().mo28832d().mo28858a(PassBackApi.class);
        }
    }

    /* renamed from: f */
    private final void m71816f() {
        C16721b bVar = this.f82870k.f82900a;
        if (!(bVar instanceof C35196j)) {
            bVar = null;
        }
        C35196j jVar = (C35196j) bVar;
        if (jVar instanceof C35196j) {
            C1731i.m5640b(new CallableC35118h(this, jVar), C1731i.f5562a);
        }
    }

    /* renamed from: c */
    public final void mo61957c() {
        if (m71817g()) {
            C1731i.m5640b(new CallableC35111a(this), C1731i.f5562a);
        }
        m71814d().removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$h */
    public static final class CallableC35118h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f82891a;

        /* renamed from: b */
        final /* synthetic */ C35196j f82892b;

        static {
            Covode.recordClassIndex(42267);
        }

        CallableC35118h(PassBackWebInfoBusiness passBackWebInfoBusiness, C35196j jVar) {
            this.f82891a = passBackWebInfoBusiness;
            this.f82892b = jVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Long g;
            JSONObject jSONObject = new JSONObject();
            long j = 0;
            try {
                String b = this.f82892b.f83100ao.mo26550b();
                if (!(b == null || (g = C89361p.m154865g(b)) == null)) {
                    j = g.longValue();
                }
            } catch (Exception unused) {
            }
            try {
                jSONObject.put("cid", j);
                JSONArray jSONArray = new JSONArray();
                Set<String> keySet = this.f82891a.mo61950a().keySet();
                if (keySet != null) {
                    Iterator<T> it = keySet.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(PassBackWebInfoBusiness.m71812b(it.next()));
                    }
                }
                jSONObject.put("url_array", jSONArray);
            } catch (Exception unused2) {
            }
            C34611o.m70668a("aweme_ad_pass_back_web_info_url_empty", jSONObject);
            return C89391z.f203057a;
        }
    }

    /* renamed from: g */
    private final boolean m71817g() {
        String str;
        C16721b bVar = this.f82870k.f82900a;
        if (!(bVar instanceof C35196j)) {
            bVar = null;
        }
        C35196j jVar = (C35196j) bVar;
        if (!(jVar instanceof C35196j) || (!C89219l.m154714a(jVar.f83091af.mo26550b(), (Object) true))) {
            return false;
        }
        if (this.f82871a && m71809a(C17867d.m33078a()) != NetworkUtils.EnumC29835h.WIFI) {
            return false;
        }
        if ((this.f82873c > 0 && C35126c.f82917a.get() >= this.f82873c) || (str = this.f82876f) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo61956b() {
        Long g;
        C16721b bVar = this.f82870k.f82900a;
        if (!(bVar instanceof C35196j)) {
            bVar = null;
        }
        C35196j jVar = (C35196j) bVar;
        if ((jVar instanceof C35196j) && !mo61950a().isEmpty()) {
            C28022o oVar = new C28022o();
            C27919i iVar = new C27919i();
            for (Map.Entry<String, String> entry : mo61950a().entrySet()) {
                C28022o oVar2 = new C28022o();
                String b = m71812b(entry.getKey());
                oVar2.mo46801a("url", b);
                oVar2.mo46801a("html", m71812b(entry.getValue()));
                Map<String, String> map = m71815e().get(C80408et.m139388a(b));
                if (map != null && !map.isEmpty()) {
                    C28022o oVar3 = new C28022o();
                    for (Map.Entry<String, String> entry2 : map.entrySet()) {
                        String key = entry2.getKey();
                        String value = entry2.getValue();
                        if ((!C89219l.m154714a((Object) key, (Object) "x-Tt-Token")) && (!C89219l.m154714a((Object) key, (Object) "Cookie")) && (!C89219l.m154714a((Object) key, (Object) "x-common-params-v2"))) {
                            oVar3.mo46801a(key, value);
                        }
                    }
                    oVar2.mo46797a("headers", oVar3);
                }
                iVar.mo46686a(oVar2);
            }
            oVar.mo46797a("pages", iVar);
            oVar.mo46800a("ad_id", (Number) jVar.f83076Y.mo26550b());
            long j = 0;
            try {
                String b2 = jVar.f83100ao.mo26550b();
                if (!(b2 == null || (g = C89361p.m154865g(b2)) == null)) {
                    j = g.longValue();
                }
            } catch (Exception unused) {
            }
            oVar.mo46800a("cid", Long.valueOf(j));
            oVar.mo46801a("log_extra", jVar.f83097al.mo26550b());
            oVar.mo46800a("timestamp", Long.valueOf(new Date().getTime()));
            NetworkUtils.EnumC29835h a = m71809a(C17867d.m33078a());
            C89219l.m154716b(a, "");
            oVar.mo46800a("network_type", Integer.valueOf(a.getValue()));
            String a2 = C35126c.m71866a(oVar, this.f82876f);
            if (!TextUtils.isEmpty(a2)) {
                C28022o oVar4 = new C28022o();
                oVar4.mo46801a("content", a2);
                ((PassBackApi) this.f82880j.getValue()).executePost(this.f82875e, oVar4).enqueue(new C35120j());
                mo61950a().clear();
                m71815e().clear();
                C35126c.f82917a.addAndGet(1);
            }
        }
    }

    /* renamed from: a */
    public static String m71810a(String str) {
        String encode = URLEncoder.encode(str, "UTF-8");
        C89219l.m154716b(encode, "");
        return encode;
    }

    /* renamed from: b */
    public static String m71812b(String str) {
        String decode = URLDecoder.decode(str, "UTF-8");
        C89219l.m154716b(decode, "");
        return decode;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness$g */
    public static final class C35117g<T> implements ValueCallback {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f82889a;

        /* renamed from: b */
        final /* synthetic */ String f82890b;

        static {
            Covode.recordClassIndex(42266);
        }

        C35117g(PassBackWebInfoBusiness passBackWebInfoBusiness, String str) {
            this.f82889a = passBackWebInfoBusiness;
            this.f82890b = str;
        }

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(Object obj) {
            String str = (String) obj;
            PassBackWebInfoBusiness passBackWebInfoBusiness = this.f82889a;
            String str2 = this.f82890b;
            if (str2 == null) {
                C89219l.m154715b();
            }
            passBackWebInfoBusiness.mo61953a(PassBackWebInfoBusiness.m71810a(str2), str);
        }
    }

    /* renamed from: a */
    private static NetworkUtils.EnumC29835h m71809a(Context context) {
        if (C58029j.f132255g != NetworkUtils.EnumC29835h.NONE && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132255g;
        }
        NetworkUtils.EnumC29835h networkType = NetworkUtils.getNetworkType(context);
        C58029j.f132255g = networkType;
        return networkType;
    }

    /* renamed from: c */
    private static String m71813c(String str) {
        return "javascript:window.location.href='bytedance://adPageHtmlContent?html=' + encodeURIComponent(document.documentElement.outerHTML) + '&url=" + m71810a(str) + "'";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PassBackWebInfoBusiness(C35123a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: a */
    public final void mo61951a(Uri uri) {
        if (m71817g() && uri != null) {
            String queryParameter = uri.getQueryParameter("url");
            String queryParameter2 = uri.getQueryParameter("html");
            if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                if (queryParameter == null) {
                    C89219l.m154715b();
                }
                if (queryParameter2 == null) {
                    C89219l.m154715b();
                }
                mo61953a(queryParameter, queryParameter2);
            }
        }
    }

    /* renamed from: a */
    public final void mo61955a(WeakReference<WebView> weakReference) {
        WebView webView = weakReference.get();
        if (webView != null) {
            C89219l.m154716b(webView, "");
            String url = webView.getUrl();
            if (url == null) {
                url = "";
            }
            C89219l.m154716b(url, "");
            if (TextUtils.isEmpty(url)) {
                m71816f();
                return;
            }
            int i = Build.VERSION.SDK_INT;
            webView.evaluateJavascript("encodeURIComponent(document.documentElement.outerHTML)", new C35117g(this, url));
        }
    }

    /* renamed from: a */
    private static void m71811a(WebView webView, String str) {
        MethodCollector.m26663i(8253);
        String a = C84357h.f188595a.mo129370a(webView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        webView.loadUrl(str);
        MethodCollector.m26664o(8253);
    }

    /* renamed from: a */
    public final void mo61952a(WebView webView, boolean z) {
        String url;
        if (m71817g() && mo61950a().size() < this.f82872b && webView != null && (url = webView.getUrl()) != null && !C89361p.m154870a((CharSequence) url) && !C89219l.m154714a((Object) "about:blank", (Object) webView.getUrl())) {
            WeakReference<WebView> weakReference = new WeakReference<>(webView);
            if (z) {
                m71814d().postDelayed(new RunnableC35115e(this, weakReference), (long) this.f82874d);
                m71814d().postDelayed(new RunnableC35116f(this, weakReference), 200);
                return;
            }
            mo61955a(weakReference);
        }
    }

    /* renamed from: a */
    public final void mo61953a(String str, String str2) {
        if (str2 != null) {
            mo61950a().put(str, C89361p.m154919c(str2, (CharSequence) "\""));
        }
    }

    /* renamed from: a */
    public final void mo61954a(String str, Map<String, String> map) {
        String str2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        if (m71817g() && mo61950a().size() < this.f82872b && !C89361p.m154870a((CharSequence) str) && !C89219l.m154714a((Object) "about:blank", (Object) str) && !C89361p.m154876c(str, ".js", false) && !C89361p.m154876c(str, ".css", false) && (str2 = map.get("Accept")) != null && C89361p.m154908a((CharSequence) str2, (CharSequence) "html", false)) {
            Map<String, Map<String, String>> e = m71815e();
            String a = C80408et.m139388a(str);
            C89219l.m154716b(a, "");
            e.put(a, map);
        }
    }
}
