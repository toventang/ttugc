package com.p2082ss.android.ugc.aweme.crossplatform.business;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22030d;
import com.bytedance.retrofit2.C22099u;
import com.google.gson.C27919i;
import com.google.gson.C28022o;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.bullet.business.C35126c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40628b;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
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

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness */
public final class PassBackWebInfoBusiness extends BusinessService.Business {

    /* renamed from: a */
    public AdLandingPageConfig f94941a;

    /* renamed from: b */
    public boolean f94942b = true;

    /* renamed from: c */
    public int f94943c;

    /* renamed from: d */
    public int f94944d;

    /* renamed from: e */
    public int f94945e = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    /* renamed from: f */
    public String f94946f = "https://ads.tiktok.com/inspect/aegis/client/page/";

    /* renamed from: g */
    public String f94947g;

    /* renamed from: h */
    final AbstractC89244h f94948h = C89250i.m154773a((AbstractC89171a) C40579i.f94964a);

    /* renamed from: m */
    public C40628b f94949m;

    /* renamed from: n */
    private final AbstractC89244h f94950n = C89250i.m154773a((AbstractC89171a) C40573c.f94955a);

    /* renamed from: o */
    private final AbstractC89244h f94951o = C89250i.m154773a((AbstractC89171a) C40572b.f94954a);

    /* renamed from: p */
    private final AbstractC89244h f94952p = C89250i.m154773a((AbstractC89171a) C40574d.f94956a);

    static {
        Covode.recordClassIndex(48404);
    }

    /* renamed from: a */
    public final Handler mo69722a() {
        return (Handler) this.f94950n.getValue();
    }

    /* renamed from: b */
    public final Map<String, String> mo69726b() {
        return (Map) this.f94951o.getValue();
    }

    /* renamed from: c */
    public final Map<String, Map<String, String>> mo69727c() {
        return (Map) this.f94952p.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$j */
    public static final class C40580j implements AbstractC22030d<String> {
        static {
            Covode.recordClassIndex(48414);
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6817a(AbstractC21983b<String> bVar, C22099u<String> uVar) {
        }

        @Override // com.bytedance.retrofit2.AbstractC22030d
        /* renamed from: a */
        public final void mo6818a(AbstractC21983b<String> bVar, Throwable th) {
        }

        C40580j() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$c */
    static final class C40573c extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C40573c f94955a = new C40573c();

        static {
            Covode.recordClassIndex(48407);
        }

        C40573c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$d */
    static final class C40574d extends AbstractC89220m implements AbstractC89171a<ConcurrentHashMap<String, Map<String, ? extends String>>> {

        /* renamed from: a */
        public static final C40574d f94956a = new C40574d();

        static {
            Covode.recordClassIndex(48408);
        }

        C40574d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConcurrentHashMap<String, Map<String, ? extends String>> invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$e */
    public static final class RunnableC40575e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f94957a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f94958b;

        static {
            Covode.recordClassIndex(48409);
        }

        RunnableC40575e(PassBackWebInfoBusiness passBackWebInfoBusiness, WeakReference weakReference) {
            this.f94957a = passBackWebInfoBusiness;
            this.f94958b = weakReference;
        }

        public final void run() {
            this.f94957a.mo69725a(this.f94958b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$f */
    public static final class RunnableC40576f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f94959a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f94960b;

        static {
            Covode.recordClassIndex(48410);
        }

        RunnableC40576f(PassBackWebInfoBusiness passBackWebInfoBusiness, WeakReference weakReference) {
            this.f94959a = passBackWebInfoBusiness;
            this.f94960b = weakReference;
        }

        public final void run() {
            this.f94959a.mo69725a(this.f94960b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$b */
    static final class C40572b extends AbstractC89220m implements AbstractC89171a<Map<String, String>> {

        /* renamed from: a */
        public static final C40572b f94954a = new C40572b();

        static {
            Covode.recordClassIndex(48406);
        }

        C40572b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, String> invoke() {
            return Collections.synchronizedMap(new LinkedHashMap());
        }
    }

    /* renamed from: e */
    private final void m81906e() {
        C1731i.m5640b(new CallableC40578h(this), C39162r.m79452a());
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$i */
    static final class C40579i extends AbstractC89220m implements AbstractC89171a<PassBackApi> {

        /* renamed from: a */
        public static final C40579i f94964a = new C40579i();

        static {
            Covode.recordClassIndex(48413);
        }

        C40579i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PassBackApi invoke() {
            return C18097a.m33699b("https://ads.tiktok.com").mo28823a().mo28832d().mo28858a(PassBackApi.class);
        }
    }

    /* renamed from: d */
    public final boolean mo69728d() {
        C40628b bVar;
        String str;
        if (this.f94941a == null || (bVar = this.f94949m) == null || !bVar.f95091E) {
            return false;
        }
        if (this.f94942b && m81901a(C17867d.m33078a()) != NetworkUtils.EnumC29835h.WIFI) {
            return false;
        }
        if ((this.f94944d > 0 && C35126c.f82917a.get() >= this.f94944d) || (str = this.f94947g) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$h */
    public static final class CallableC40578h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f94963a;

        static {
            Covode.recordClassIndex(48412);
        }

        CallableC40578h(PassBackWebInfoBusiness passBackWebInfoBusiness) {
            this.f94963a = passBackWebInfoBusiness;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            JSONObject jSONObject = new JSONObject();
            try {
                C40628b bVar = this.f94963a.f94949m;
                if (bVar != null) {
                    long j = 0;
                    try {
                        String str = bVar.f95118m;
                        if (str != null) {
                            j = Long.parseLong(str);
                        }
                    } catch (Exception unused) {
                    }
                    jSONObject.put("cid", j);
                }
                JSONArray jSONArray = new JSONArray();
                Set<String> keySet = this.f94963a.mo69726b().keySet();
                if (keySet != null) {
                    Iterator<T> it = keySet.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(PassBackWebInfoBusiness.m81904b(it.next()));
                    }
                }
                jSONObject.put("url_array", jSONArray);
            } catch (Exception unused2) {
            }
            C33830n.m70668a("aweme_ad_pass_back_web_info_url_empty", jSONObject);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$a */
    public static final class CallableC40571a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f94953a;

        static {
            Covode.recordClassIndex(48405);
        }

        public CallableC40571a(PassBackWebInfoBusiness passBackWebInfoBusiness) {
            this.f94953a = passBackWebInfoBusiness;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            PassBackWebInfoBusiness passBackWebInfoBusiness = this.f94953a;
            C40628b bVar = passBackWebInfoBusiness.f94949m;
            if (bVar != null && !passBackWebInfoBusiness.mo69726b().isEmpty()) {
                C28022o oVar = new C28022o();
                C27919i iVar = new C27919i();
                for (Map.Entry<String, String> entry : passBackWebInfoBusiness.mo69726b().entrySet()) {
                    C28022o oVar2 = new C28022o();
                    String b = PassBackWebInfoBusiness.m81904b(entry.getKey());
                    oVar2.mo46801a("url", b);
                    oVar2.mo46801a("html", PassBackWebInfoBusiness.m81904b(entry.getValue()));
                    Map<String, String> map = passBackWebInfoBusiness.mo69727c().get(C80408et.m139388a(b));
                    if (map == null || map.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
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
                oVar.mo46800a("ad_id", Long.valueOf(bVar.f95106a));
                long j = 0;
                try {
                    String str = bVar.f95118m;
                    if (str != null) {
                        j = Long.parseLong(str);
                    }
                } catch (Exception unused) {
                }
                oVar.mo46800a("cid", Long.valueOf(j));
                oVar.mo46801a("log_extra", bVar.f95114i);
                oVar.mo46800a("timestamp", Long.valueOf(new Date().getTime()));
                NetworkUtils.EnumC29835h a = PassBackWebInfoBusiness.m81901a(C17867d.m33078a());
                C89219l.m154716b(a, "");
                oVar.mo46800a("network_type", Integer.valueOf(a.getValue()));
                String a2 = C35126c.m71866a(oVar, passBackWebInfoBusiness.f94947g);
                if (!TextUtils.isEmpty(a2)) {
                    C28022o oVar4 = new C28022o();
                    oVar4.mo46801a("content", a2);
                    ((PassBackApi) passBackWebInfoBusiness.f94948h.getValue()).executePost(passBackWebInfoBusiness.f94946f, oVar4).enqueue(new C40580j());
                    passBackWebInfoBusiness.mo69726b().clear();
                    passBackWebInfoBusiness.mo69727c().clear();
                    C35126c.f82917a.addAndGet(1);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static String m81902a(String str) {
        String encode = URLEncoder.encode(str, "UTF-8");
        C89219l.m154716b(encode, "");
        return encode;
    }

    /* renamed from: b */
    public static String m81904b(String str) {
        String decode = URLDecoder.decode(str, "UTF-8");
        C89219l.m154716b(decode, "");
        return decode;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness$g */
    public static final class C40577g<T> implements ValueCallback {

        /* renamed from: a */
        final /* synthetic */ PassBackWebInfoBusiness f94961a;

        /* renamed from: b */
        final /* synthetic */ String f94962b;

        static {
            Covode.recordClassIndex(48411);
        }

        C40577g(PassBackWebInfoBusiness passBackWebInfoBusiness, String str) {
            this.f94961a = passBackWebInfoBusiness;
            this.f94962b = str;
        }

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(Object obj) {
            String str = (String) obj;
            PassBackWebInfoBusiness passBackWebInfoBusiness = this.f94961a;
            String str2 = this.f94962b;
            if (str2 == null) {
                C89219l.m154715b();
            }
            passBackWebInfoBusiness.mo69724a(PassBackWebInfoBusiness.m81902a(str2), str);
        }
    }

    /* renamed from: a */
    static NetworkUtils.EnumC29835h m81901a(Context context) {
        if (C58029j.f132255g != NetworkUtils.EnumC29835h.NONE && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132255g;
        }
        NetworkUtils.EnumC29835h networkType = NetworkUtils.getNetworkType(context);
        C58029j.f132255g = networkType;
        return networkType;
    }

    /* renamed from: c */
    private static String m81905c(String str) {
        return "javascript:window.location.href='bytedance://adPageHtmlContent?html=' + encodeURIComponent(document.documentElement.outerHTML) + '&url=" + m81902a(str) + "'";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PassBackWebInfoBusiness(C40589e eVar) {
        super(eVar);
        C89219l.m154721d(eVar, "");
    }

    /* renamed from: a */
    public final void mo69725a(WeakReference<WebView> weakReference) {
        WebView webView = weakReference.get();
        if (webView != null) {
            C89219l.m154716b(webView, "");
            String url = webView.getUrl();
            if (TextUtils.isEmpty(url)) {
                m81906e();
                return;
            }
            int i = Build.VERSION.SDK_INT;
            webView.evaluateJavascript("encodeURIComponent(document.documentElement.outerHTML)", new C40577g(this, url));
        }
    }

    /* renamed from: a */
    private static void m81903a(WebView webView, String str) {
        MethodCollector.m26663i(5337);
        String a = C84357h.f188595a.mo129370a(webView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        webView.loadUrl(str);
        MethodCollector.m26664o(5337);
    }

    /* renamed from: a */
    public final void mo69723a(WebView webView, boolean z) {
        String url;
        if (mo69728d() && mo69726b().size() < this.f94943c && webView != null && (url = webView.getUrl()) != null && !C89361p.m154870a((CharSequence) url) && !C89219l.m154714a((Object) "about:blank", (Object) webView.getUrl())) {
            WeakReference<WebView> weakReference = new WeakReference<>(webView);
            if (z) {
                mo69722a().postDelayed(new RunnableC40575e(this, weakReference), (long) this.f94945e);
                mo69722a().postDelayed(new RunnableC40576f(this, weakReference), 200);
                return;
            }
            mo69725a(weakReference);
        }
    }

    /* renamed from: a */
    public final void mo69724a(String str, String str2) {
        if (str2 != null) {
            mo69726b().put(str, C89361p.m154919c(str2, (CharSequence) "\""));
        }
    }
}
