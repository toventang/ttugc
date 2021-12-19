package com.p2082ss.android.ugc.aweme.net.monitor;

import android.net.Uri;
import android.os.Build;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61423c;
import com.p2082ss.android.ugc.aweme.net.model.TypeEnum;
import com.p2082ss.android.ugc.aweme.net.model.UnexpectedConfig;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.utils.C80601m;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import okhttp3.C90029ac;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.net.monitor.q */
public final class C61446q implements AbstractC61433h, AbstractC61434i, AbstractC61436k, AbstractC61437l, AbstractC61438m {

    /* renamed from: a */
    public static final String f139492a;

    /* renamed from: b */
    public static final C61430e<String> f139493b = new C61430e<>(5);

    /* renamed from: c */
    public static final SimpleDateFormat f139494c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());

    /* renamed from: d */
    public static final C61447a f139495d = new C61447a((byte) 0);

    /* renamed from: e */
    private final List<UnexpectedConfig> f139496e;

    /* renamed from: f */
    private final List<UnexpectedConfig> f139497f;

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61437l
    /* renamed from: a */
    public final C61425e<Request, C22099u<?>> mo68796a(C61425e<Request, C22099u<?>> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: a */
    public final boolean mo68797a() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61436k
    /* renamed from: c */
    public final C61425e<okhttp3.Request, C90029ac> mo68799c(C61425e<okhttp3.Request, C90029ac> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: e */
    public final C61425e<HttpURLConnection, InputStream> mo68801e(C61425e<HttpURLConnection, InputStream> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: g */
    public final C61425e<HttpURLConnection, InputStream> mo68803g(C61425e<HttpURLConnection, InputStream> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: h */
    public final C61425e<HttpURLConnection, InputStream> mo68804h(C61425e<HttpURLConnection, InputStream> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: i */
    public final C61425e<HttpURLConnection, Integer> mo68805i(C61425e<HttpURLConnection, Integer> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: j */
    public final C61425e<HttpURLConnection, Integer> mo68806j(C61425e<HttpURLConnection, Integer> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: k */
    public final C61425e<HttpURLConnection, InputStream> mo68807k(C61425e<HttpURLConnection, InputStream> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: l */
    public final C61425e<HttpURLConnection, InputStream> mo68808l(C61425e<HttpURLConnection, InputStream> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: m */
    public final C61425e<URL, URLConnection> mo68809m(C61425e<URL, URLConnection> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61438m
    /* renamed from: o */
    public final C61425e<WebResourceRequest, WebResourceResponse> mo68814o(C61425e<WebResourceRequest, WebResourceResponse> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.net.monitor.q$a */
    public static final class C61447a {
        static {
            Covode.recordClassIndex(72102);
        }

        private C61447a() {
        }

        public /* synthetic */ C61447a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(72101);
        String simpleName = C61446q.class.getSimpleName();
        C89219l.m154716b(simpleName, "");
        f139492a = simpleName;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.net.monitor.q$b */
    public static final class RunnableC61448b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WebView f139498a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f139499b;

        static {
            Covode.recordClassIndex(72103);
        }

        RunnableC61448b(WebView webView, JSONObject jSONObject) {
            this.f139498a = webView;
            this.f139499b = jSONObject;
        }

        public final void run() {
            int i;
            String a;
            ArrayList arrayList = new ArrayList();
            WebBackForwardList copyBackForwardList = this.f139498a.copyBackForwardList();
            C89219l.m154716b(copyBackForwardList, "");
            if (copyBackForwardList.getSize() > 10) {
                i = copyBackForwardList.getSize() - 10;
            } else {
                i = 0;
            }
            int size = copyBackForwardList.getSize();
            while (i < size) {
                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
                C89219l.m154716b(itemAtIndex, "");
                String url = itemAtIndex.getUrl();
                C89219l.m154716b(url, "");
                arrayList.add(url);
                i++;
            }
            if (!arrayList.isEmpty() && (a = C89070n.m154551a(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 63)) != null && !C89361p.m154870a((CharSequence) a)) {
                this.f139499b.put("content", a);
            }
            C12290b.m22064a(EnumC61423c.UNEXPECTED_NETWORK_LOG.getLogType(), this.f139499b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61438m
    /* renamed from: n */
    public final C61425e<String, WebResourceResponse> mo68813n(C61425e<String, WebResourceResponse> eVar) {
        C89219l.m154721d(eVar, "");
        try {
            Uri parse = Uri.parse(URLDecoder.decode(eVar.f139468a, "UTF-8"));
            C89219l.m154716b(parse, "");
            m111278a(this, parse, "5", eVar.f139470c, 8);
        } catch (Exception e) {
            C61439n.C61440a.m111265a(eVar.f139468a, "UnexpectedNetworkMonitor.onShouldInterceptRequestUrl", e);
        }
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61436k
    /* renamed from: d */
    public final C61425e<okhttp3.Request, C90029ac> mo68800d(C61425e<okhttp3.Request, C90029ac> eVar) {
        C89219l.m154721d(eVar, "");
        R r = eVar.f139469b;
        if (r == null) {
            C89219l.m154715b();
        }
        String uri = r.f204105a.url().mo145047b().toString();
        C89219l.m154716b(uri, "");
        Uri parse = Uri.parse(uri);
        C89219l.m154716b(parse, "");
        m111278a(this, parse, "4", null, 12);
        if (!this.f139497f.isEmpty()) {
            m111277a((C61446q) parse, (Uri) "4", C61444o.m111272a((C90029ac) eVar.f139469b), (String) null);
        }
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a7  */
    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61437l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.net.model.C61425e<com.bytedance.retrofit2.client.Request, com.bytedance.retrofit2.C22099u<?>> mo68798b(com.p2082ss.android.ugc.aweme.net.model.C61425e<com.bytedance.retrofit2.client.Request, com.bytedance.retrofit2.C22099u<?>> r10) {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.net.monitor.C61446q.mo68798b(com.ss.android.ugc.aweme.net.model.e):com.ss.android.ugc.aweme.net.model.e");
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: f */
    public final C61425e<HttpURLConnection, InputStream> mo68802f(C61425e<HttpURLConnection, InputStream> eVar) {
        C89378p pVar;
        R r;
        MethodCollector.m26663i(9327);
        C89219l.m154721d(eVar, "");
        Q q = eVar.f139468a;
        if (q == null) {
            C89219l.m154715b();
        }
        Uri parse = Uri.parse(q.getURL().toString());
        C89219l.m154716b(parse, "");
        InputStream inputStream = null;
        m111278a(this, parse, "3", null, 12);
        Q q2 = eVar.f139468a;
        String contentType = q2 != null ? q2.getContentType() : null;
        if ((!this.f139497f.isEmpty()) && C61444o.m111273a(contentType)) {
            R r2 = eVar.f139469b;
            if (r2 == null) {
                pVar = null;
                r = null;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                for (int read = r2.read(bArr); read >= 0; read = r2.read(bArr)) {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                pVar = new C89378p(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                r = (R) pVar.getFirst();
            }
            eVar.f139469b = r;
            if (pVar != null) {
                inputStream = (InputStream) pVar.getSecond();
            }
            m111277a((C61446q) parse, (Uri) "3", C61444o.m111271a(contentType, inputStream), (String) null);
        }
        MethodCollector.m26664o(9327);
        return eVar;
    }

    public C61446q(List<UnexpectedConfig> list, List<UnexpectedConfig> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f139496e = list;
        this.f139497f = list2;
        ArrayList<UnexpectedConfig> arrayList = new ArrayList();
        for (T t : list) {
            if (TypeEnum.C61420a.m111187a(t.getType())) {
                arrayList.add(t);
            }
        }
        for (UnexpectedConfig unexpectedConfig : arrayList) {
            unexpectedConfig.setRegex(new C89350l(unexpectedConfig.getPattern()));
        }
        List<UnexpectedConfig> list3 = this.f139497f;
        ArrayList<UnexpectedConfig> arrayList2 = new ArrayList();
        for (T t2 : list3) {
            if (TypeEnum.C61420a.m111187a(t2.getType())) {
                arrayList2.add(t2);
            }
        }
        for (UnexpectedConfig unexpectedConfig2 : arrayList2) {
            unexpectedConfig2.setRegex(new C89350l(unexpectedConfig2.getPattern()));
        }
    }

    /* renamed from: a */
    private final void m111276a(Uri uri, String str, WebView webView, String str2) {
        boolean a;
        List<String> targets;
        String uri2 = uri.toString();
        C89219l.m154716b(uri2, "");
        List<UnexpectedConfig> list = this.f139496e;
        ArrayList<UnexpectedConfig> arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (t2.getTargets() == null || ((targets = t2.getTargets()) != null && targets.contains(str))) {
                arrayList.add(t);
            }
        }
        for (UnexpectedConfig unexpectedConfig : arrayList) {
            int type = unexpectedConfig.getType();
            if (type == TypeEnum.START_WITH.getType()) {
                a = C89361p.m154874b(uri2, unexpectedConfig.getPattern(), false);
            } else if (type == TypeEnum.CONTAINS.getType()) {
                a = C89361p.m154929e((CharSequence) uri2, (CharSequence) unexpectedConfig.getPattern());
            } else if (type == TypeEnum.REGEX_MATCHES.getType()) {
                C89350l regex = unexpectedConfig.getRegex();
                if (regex != null) {
                    a = regex.matches(uri2);
                }
            } else if (type == TypeEnum.REGEX_CONTAINS_MATCH_IN.getType()) {
                C89350l regex2 = unexpectedConfig.getRegex();
                if (regex2 != null) {
                    a = regex2.containsMatchIn(uri2);
                }
            } else if (type == TypeEnum.EQUAL.getType()) {
                a = C89219l.m154714a((Object) unexpectedConfig.getPattern(), (Object) uri2);
            }
            if (a) {
                m111275a(uri, unexpectedConfig, str, str2, webView, null, 32);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private final void m111277a(Uri uri, String str, String str2, String str3) {
        C89350l regex;
        boolean containsMatchIn;
        List<String> targets;
        if (!(str2 == null || C89361p.m154870a((CharSequence) str2))) {
            String path = uri.getPath();
            if (path == null || !C89361p.m154874b(path, "/tfe/api/request_combine/v", false)) {
                String path2 = uri.getPath();
                if (path2 != null && C89361p.m154874b(path2, "/aweme/v", false)) {
                    String path3 = uri.getPath();
                    if (path3 == null || !C89361p.m154876c(path3, "/settings/", false)) {
                        String path4 = uri.getPath();
                        if (path4 != null && C89361p.m154876c(path4, "/abtest/param/", false)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                List<UnexpectedConfig> list = this.f139497f;
                ArrayList<UnexpectedConfig> arrayList = new ArrayList();
                for (T t : list) {
                    T t2 = t;
                    if (t2.getTargets() == null || ((targets = t2.getTargets()) != null && targets.contains(str))) {
                        arrayList.add(t);
                    }
                }
                for (UnexpectedConfig unexpectedConfig : arrayList) {
                    int type = unexpectedConfig.getType();
                    if (type == TypeEnum.START_WITH.getType()) {
                        containsMatchIn = C89361p.m154874b(str2, unexpectedConfig.getPattern(), false);
                    } else if (type == TypeEnum.CONTAINS.getType()) {
                        containsMatchIn = C89361p.m154929e((CharSequence) str2, (CharSequence) unexpectedConfig.getPattern());
                    } else if (type == TypeEnum.REGEX_MATCHES.getType()) {
                        C89350l regex2 = unexpectedConfig.getRegex();
                        if (regex2 != null) {
                            containsMatchIn = regex2.matches(str2);
                        }
                    } else if (type == TypeEnum.REGEX_CONTAINS_MATCH_IN.getType() && (regex = unexpectedConfig.getRegex()) != null) {
                        containsMatchIn = regex.containsMatchIn(str2);
                    }
                    if (containsMatchIn) {
                        m111275a(uri, unexpectedConfig, str, str3, null, str2, 16);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m111278a(C61446q qVar, Uri uri, String str, WebView webView, int i) {
        if ((i & 4) != 0) {
            webView = null;
        }
        qVar.m111276a(uri, str, webView, (String) null);
    }

    /* renamed from: a */
    private static void m111274a(Uri uri, UnexpectedConfig unexpectedConfig, String str, String str2, WebView webView, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("host", uri.getHost());
        jSONObject.put("path", uri.getPath());
        jSONObject.put("url", uri.toString());
        jSONObject.put("configId", unexpectedConfig.getId());
        jSONObject.put("config", unexpectedConfig.toString());
        jSONObject.put("net_type", str);
        jSONObject.put("page", C80601m.m139744a());
        if (str2 != null && !C89361p.m154870a((CharSequence) str2)) {
            jSONObject.put("logid", str2);
        }
        if (str3 != null && !C89361p.m154870a((CharSequence) str3)) {
            jSONObject.put("response", str3);
        }
        if (webView == null) {
            if (C89219l.m154714a((Object) str, (Object) "2")) {
                jSONObject.put("content", C89070n.m154551a(f139493b, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62));
            }
            C12290b.m22064a(EnumC61423c.UNEXPECTED_NETWORK_LOG.getLogType(), jSONObject);
        } else if (Build.VERSION.SDK_INT != 23 || webView.isAttachedToWindow()) {
            webView.post(new RunnableC61448b(webView, jSONObject));
        } else {
            C12290b.m22064a(EnumC61423c.UNEXPECTED_NETWORK_LOG.getLogType(), jSONObject);
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m111275a(Uri uri, UnexpectedConfig unexpectedConfig, String str, String str2, WebView webView, String str3, int i) {
        String str4 = str2;
        WebView webView2 = webView;
        String str5 = null;
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            webView2 = null;
        }
        if ((i & 32) == 0) {
            str5 = str3;
        }
        m111274a(uri, unexpectedConfig, str, str4, webView2, str5);
    }
}
