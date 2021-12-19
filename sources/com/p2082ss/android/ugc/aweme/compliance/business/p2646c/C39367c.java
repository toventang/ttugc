package com.p2082ss.android.ugc.aweme.compliance.business.p2646c;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.Request;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61423c;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i;
import com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61436k;
import com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61437l;
import com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61438m;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.p3500j.C61403a;
import com.p2082ss.android.ugc.aweme.net.p3500j.C61404b;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.C90029ac;
import okhttp3.C90198s;
import okhttp3.C90200t;
import okhttp3.Request;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.c.c */
public final class C39367c implements AbstractC61434i, AbstractC61436k, AbstractC61437l, AbstractC61438m {

    /* renamed from: a */
    public static final String f92932a;

    /* renamed from: b */
    public static final Handler f92933b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public static final C39368a f92934c = new C39368a((byte) 0);

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: a */
    public final boolean mo68797a() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61437l
    /* renamed from: b */
    public final C61425e<Request, C22099u<?>> mo68798b(C61425e<Request, C22099u<?>> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61436k
    /* renamed from: d */
    public final C61425e<okhttp3.Request, C90029ac> mo68800d(C61425e<okhttp3.Request, C90029ac> eVar) {
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
    /* renamed from: f */
    public final C61425e<HttpURLConnection, InputStream> mo68802f(C61425e<HttpURLConnection, InputStream> eVar) {
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

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.c.c$a */
    public static final class C39368a {
        static {
            Covode.recordClassIndex(47052);
        }

        private C39368a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
            if (com.p2082ss.android.ugc.aweme.net.model.ScopeEnum.C61419a.m111186a(r0.intValue()) != false) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x007e, code lost:
            if (com.p2082ss.android.ugc.aweme.net.model.ScopeEnum.C61419a.m111186a(r0.intValue()) != false) goto L_0x0080;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p2082ss.android.ugc.aweme.net.p3500j.C61404b m80044a() {
            /*
            // Method dump skipped, instructions count: 142
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39367c.C39368a.m80044a():com.ss.android.ugc.aweme.net.j.b");
        }

        public /* synthetic */ C39368a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m80045a(C39366b bVar) {
            C89219l.m154721d(bVar, "");
            try {
                JSONObject jSONObject = new JSONObject();
                String str = bVar.f92925d;
                if (str == null) {
                    str = bVar.f92924c;
                }
                Uri parse = Uri.parse(str);
                C89219l.m154716b(parse, "");
                jSONObject.put("host", parse.getHost());
                jSONObject.put("path", parse.getPath());
                jSONObject.put("url", str);
                String str2 = bVar.f92923b;
                if (str2 != null && !C89361p.m154870a((CharSequence) str2)) {
                    jSONObject.put("net_type", bVar.f92923b);
                }
                if (!bVar.f92926e.isEmpty()) {
                    jSONObject.put("header_list", bVar.f92926e);
                }
                if (!bVar.f92927f.isEmpty()) {
                    jSONObject.put("header", bVar.f92927f);
                }
                if (!bVar.f92928g.isEmpty()) {
                    jSONObject.put("cookie_list", bVar.f92928g);
                }
                if (!bVar.f92929h.isEmpty()) {
                    jSONObject.put("cookie", bVar.f92929h);
                }
                if (!bVar.f92931j.isEmpty()) {
                    jSONObject.put("url_query", bVar.f92931j);
                }
                if (!bVar.f92930i.isEmpty()) {
                    jSONObject.put("url_query_list", bVar.f92930i);
                }
                C12290b.m22064a(EnumC61423c.HTTP_COOKIE_TOKEN_LOG.getLogType(), jSONObject);
            } catch (Exception unused) {
            }
        }

        /* renamed from: a */
        public static boolean m80046a(C61404b bVar, String str) {
            if (bVar != null && !TextUtils.isEmpty(str) && !C13603b.m24435a((Collection) bVar.f139405e)) {
                List<C61403a> list = bVar.f139405e;
                try {
                    Uri parse = Uri.parse(str);
                    C89219l.m154716b(parse, "");
                    String host = parse.getHost();
                    String path = parse.getPath();
                    if (!TextUtils.isEmpty(host)) {
                        if (list == null) {
                            C89219l.m154715b();
                        }
                        Iterator<C61403a> it = list.iterator();
                        if (it.hasNext()) {
                            C61403a next = it.next();
                            Set<String> set = next.f139399a;
                            Set<String> set2 = next.f139400b;
                            if (C13603b.m24435a((Collection) set)) {
                                if (!C13603b.m24435a((Collection) set2)) {
                                    if (!TextUtils.isEmpty(path)) {
                                        if (set2 == null) {
                                            C89219l.m154715b();
                                        }
                                        return C89070n.m154556a((Iterable) set2, (Object) path);
                                    }
                                }
                                return false;
                            }
                            if (set == null) {
                                C89219l.m154715b();
                            }
                            if (C89070n.m154556a((Iterable) set, (Object) host)) {
                                if (TextUtils.isEmpty(path) || C13603b.m24435a((Collection) set2)) {
                                    return true;
                                }
                                if (set2 == null) {
                                    C89219l.m154715b();
                                }
                                if (C89070n.m154556a((Iterable) set2, (Object) path)) {
                                    return true;
                                }
                            }
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    static {
        Covode.recordClassIndex(47051);
        String simpleName = C39367c.class.getSimpleName();
        C89219l.m154716b(simpleName, "");
        f92932a = simpleName;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61438m
    /* renamed from: n */
    public final C61425e<String, WebResourceResponse> mo68813n(C61425e<String, WebResourceResponse> eVar) {
        C89219l.m154721d(eVar, "");
        Q q = eVar.f139468a;
        if (q != null && C89361p.m154874b((String) q, "http://", false)) {
            C39366b bVar = new C39366b("5", q);
            m80027a(bVar);
            C39368a.m80045a(bVar);
        }
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: k */
    public final C61425e<HttpURLConnection, InputStream> mo68807k(C61425e<HttpURLConnection, InputStream> eVar) {
        URL url;
        String url2;
        String str;
        String str2;
        Set<String> set;
        C89219l.m154721d(eVar, "");
        Q q = eVar.f139468a;
        if (!(q == null || (url = q.getURL()) == null || (url2 = url.toString()) == null || !C89361p.m154874b(url2, "http://", false))) {
            JSONObject jSONObject = eVar.f139471d;
            if (jSONObject != null) {
                str = jSONObject.optString("key", "");
                str2 = jSONObject.optString("value", "");
            } else {
                str = "";
                str2 = str;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                C39366b bVar = new C39366b("3", url2);
                Set<String> set2 = bVar.f92926e;
                if (str == null) {
                    C89219l.m154715b();
                }
                set2.add(str);
                C61404b a = C39368a.m80044a();
                if (!(C39368a.m80046a(a, bVar.f92924c) || a == null || (set = a.f139404d) == null)) {
                    Locale locale = Locale.ROOT;
                    C89219l.m154716b(locale, "");
                    String lowerCase = str.toLowerCase(locale);
                    C89219l.m154716b(lowerCase, "");
                    if (set.contains(lowerCase)) {
                        eVar.mo99118a(EnumC61424d.DROP);
                        bVar.f92927f.add(str);
                        bVar.f92922a = true;
                    }
                }
                if (!bVar.f92922a && (C89219l.m154714a((Object) str, (Object) "Cookie") || C89219l.m154714a((Object) str, (Object) "X-SS-Cookie"))) {
                    String a2 = m80026a(str2, bVar);
                    if (jSONObject != null) {
                        jSONObject.put(str, a2);
                    }
                }
                C39368a.m80045a(bVar);
            }
        }
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: l */
    public final C61425e<HttpURLConnection, InputStream> mo68808l(C61425e<HttpURLConnection, InputStream> eVar) {
        URL url;
        String url2;
        String str;
        String str2;
        Set<String> set;
        C89219l.m154721d(eVar, "");
        Q q = eVar.f139468a;
        if (!(q == null || (url = q.getURL()) == null || (url2 = url.toString()) == null || !C89361p.m154874b(url2, "http://", false))) {
            JSONObject jSONObject = eVar.f139471d;
            if (jSONObject != null) {
                str = jSONObject.optString("key", "");
                str2 = jSONObject.optString("value", "");
            } else {
                str = "";
                str2 = str;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                C39366b bVar = new C39366b("3", url2);
                Set<String> set2 = bVar.f92926e;
                if (str == null) {
                    C89219l.m154715b();
                }
                set2.add(str);
                C61404b a = C39368a.m80044a();
                if (!(C39368a.m80046a(a, bVar.f92924c) || a == null || (set = a.f139404d) == null)) {
                    Locale locale = Locale.ROOT;
                    C89219l.m154716b(locale, "");
                    String lowerCase = str.toLowerCase(locale);
                    C89219l.m154716b(lowerCase, "");
                    if (set.contains(lowerCase)) {
                        eVar.mo99118a(EnumC61424d.DROP);
                        bVar.f92927f.add(str);
                        bVar.f92922a = true;
                    }
                }
                if (!bVar.f92922a && (C89219l.m154714a((Object) str, (Object) "Cookie") || C89219l.m154714a((Object) str, (Object) "X-SS-Cookie"))) {
                    String a2 = m80026a(str2, bVar);
                    if (jSONObject != null) {
                        jSONObject.put(str, a2);
                    }
                }
                C39368a.m80045a(bVar);
            }
        }
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: m */
    public final C61425e<URL, URLConnection> mo68809m(C61425e<URL, URLConnection> eVar) {
        String url;
        R r;
        HttpURLConnection httpURLConnection;
        C89219l.m154721d(eVar, "");
        Q q = eVar.f139468a;
        if (!(q == null || (url = q.toString()) == null || !C89361p.m154874b(url, "http://", false) || eVar.f139468a == null)) {
            C39366b bVar = new C39366b("3", url);
            m80027a(bVar);
            if (bVar.f92922a) {
                URL url2 = new URL(bVar.f92925d);
                C61425e<URL, URLConnection> m = C61439n.f139485e.mo68809m(new C61425e<>(url2, null, null, EnumC61424d.CONTINUE));
                if (m.f139473f == EnumC61424d.INTERCEPT && m.f139469b != null) {
                    r = m.f139469b;
                    if (r instanceof HttpsURLConnection) {
                        httpURLConnection = new C61417b(r);
                    } else {
                        if (r instanceof HttpURLConnection) {
                            httpURLConnection = new C61416a(r);
                        }
                        eVar.f139469b = r;
                        eVar.mo99118a(EnumC61424d.INTERCEPT);
                    }
                } else if (m.f139473f != EnumC61424d.EXCEPTION || m.f139472e == null) {
                    r = (R) url2.openConnection();
                    if (r instanceof HttpsURLConnection) {
                        httpURLConnection = new C61417b(r);
                    } else {
                        if (r instanceof HttpURLConnection) {
                            httpURLConnection = new C61416a(r);
                        }
                        eVar.f139469b = r;
                        eVar.mo99118a(EnumC61424d.INTERCEPT);
                    }
                } else {
                    throw m.f139472e;
                }
                r = (R) httpURLConnection;
                eVar.f139469b = r;
                eVar.mo99118a(EnumC61424d.INTERCEPT);
            }
            C39368a.m80045a(bVar);
        }
        return eVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: java.util.Set<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61438m
    /* renamed from: o */
    public final C61425e<WebResourceRequest, WebResourceResponse> mo68814o(C61425e<WebResourceRequest, WebResourceResponse> eVar) {
        Q q;
        Uri url;
        String uri;
        Set<String> set;
        C89219l.m154721d(eVar, "");
        if (!(Build.VERSION.SDK_INT < 21 || (q = eVar.f139468a) == null || (url = q.getUrl()) == null || (uri = url.toString()) == null || !C89361p.m154874b(uri, "http://", false))) {
            Map<String, String> requestHeaders = q.getRequestHeaders();
            C39366b bVar = new C39366b("5", uri);
            m80027a(bVar);
            if (requestHeaders != null) {
                bVar.f92926e.addAll(requestHeaders.keySet());
                C61404b a = C39368a.m80044a();
                if (a != null && (set = a.f139404d) != null && !set.isEmpty() && !C39368a.m80046a(a, bVar.f92924c)) {
                    Set<String> keySet = requestHeaders.keySet();
                    ArrayList arrayList = new ArrayList();
                    for (T t : keySet) {
                        T t2 = t;
                        C89219l.m154716b(t2, "");
                        Locale locale = Locale.ROOT;
                        C89219l.m154716b(locale, "");
                        Objects.requireNonNull(t2, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = t2.toLowerCase(locale);
                        C89219l.m154716b(lowerCase, "");
                        if (set.contains(lowerCase)) {
                            arrayList.add(t);
                        }
                    }
                    for (Object obj : arrayList) {
                        Set<String> set2 = bVar.f92926e;
                        C89219l.m154716b(obj, "");
                        set2.add(obj);
                        bVar.f92922a = true;
                    }
                }
                String str = requestHeaders.get("Cookie");
                if (str != null && !C89361p.m154870a((CharSequence) str)) {
                    m80026a(str, bVar);
                }
                String str2 = requestHeaders.get("X-SS-Cookie");
                if (str2 != null && !C89361p.m154870a((CharSequence) str2)) {
                    m80026a(str2, bVar);
                }
            }
        }
        return eVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: java.util.Set<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static void m80027a(C39366b bVar) {
        Set<String> set;
        C61404b a = C39368a.m80044a();
        if (a != null) {
            set = a.f139404d;
        } else {
            set = null;
        }
        if (!TextUtils.isEmpty(bVar.f92924c)) {
            Uri parse = Uri.parse(bVar.f92924c);
            C89219l.m154716b(parse, "");
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (!(queryParameterNames == null || queryParameterNames.isEmpty())) {
                bVar.f92930i.addAll(queryParameterNames);
                if (!(set == null || set.isEmpty() || C39368a.m80046a(a, bVar.f92924c))) {
                    Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                    ArrayList<String> arrayList = new ArrayList();
                    for (T t : queryParameterNames) {
                        T t2 = t;
                        C89219l.m154716b(t2, "");
                        Locale locale = Locale.ROOT;
                        C89219l.m154716b(locale, "");
                        Objects.requireNonNull(t2, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = t2.toLowerCase(locale);
                        C89219l.m154716b(lowerCase, "");
                        if (!set.contains(lowerCase)) {
                            arrayList.add(t);
                        }
                    }
                    for (String str : arrayList) {
                        clearQuery.appendQueryParameter(str, parse.getQueryParameter(str));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (T t3 : queryParameterNames) {
                        T t4 = t3;
                        C89219l.m154716b(t4, "");
                        Locale locale2 = Locale.ROOT;
                        C89219l.m154716b(locale2, "");
                        Objects.requireNonNull(t4, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase2 = t4.toLowerCase(locale2);
                        C89219l.m154716b(lowerCase2, "");
                        if (set.contains(lowerCase2)) {
                            arrayList2.add(t3);
                        }
                    }
                    ArrayList arrayList3 = arrayList2;
                    if (!arrayList3.isEmpty()) {
                        for (Object obj : arrayList3) {
                            Set<String> set2 = bVar.f92931j;
                            C89219l.m154716b(obj, "");
                            set2.add(obj);
                        }
                        bVar.f92922a = true;
                    }
                    bVar.f92925d = clearQuery.build().toString();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61436k
    /* renamed from: c */
    public final C61425e<okhttp3.Request, C90029ac> mo68799c(C61425e<okhttp3.Request, C90029ac> eVar) {
        C90200t url;
        String tVar;
        Set<String> a;
        C89219l.m154721d(eVar, "");
        Q q = eVar.f139468a;
        C90198s.C90199a aVar = null;
        if (!(q == null || (url = q.url()) == null || (tVar = url.toString()) == null || !C89361p.m154874b(tVar, "http://", false))) {
            C61404b a2 = C39368a.m80044a();
            Set<String> set = a2 != null ? a2.f139404d : null;
            C39366b bVar = new C39366b("4", tVar);
            m80027a(bVar);
            C90198s headers = q.headers();
            if (headers != null) {
                Set<String> set2 = bVar.f92926e;
                Set<String> a3 = headers.mo145029a();
                C89219l.m154716b(a3, "");
                set2.addAll(a3);
                aVar = headers.mo145033c();
                if (!C39368a.m80046a(a2, bVar.f92924c) && set != null && !set.isEmpty() && (a = headers.mo145029a()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : a) {
                        T t2 = t;
                        C89219l.m154716b(t2, "");
                        Locale locale = Locale.ROOT;
                        C89219l.m154716b(locale, "");
                        Objects.requireNonNull(t2, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = t2.toLowerCase(locale);
                        C89219l.m154716b(lowerCase, "");
                        if (set.contains(lowerCase)) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<String> arrayList2 = arrayList;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        for (String str : arrayList2) {
                            Set<String> set3 = bVar.f92927f;
                            C89219l.m154716b(str, "");
                            set3.add(str);
                            aVar.mo145041b(str);
                        }
                        bVar.f92922a = true;
                    }
                }
                String c = aVar.mo145043c("Cookie");
                if (c != null && !C89361p.m154870a((CharSequence) c)) {
                    aVar.mo145045d("Cookie", m80026a(c, bVar));
                }
                String c2 = aVar.mo145043c("X-SS-Cookie");
                if (c2 != null && !C89361p.m154870a((CharSequence) c2)) {
                    aVar.mo145045d("X-SS-Cookie", m80026a(c2, bVar));
                }
            }
            if (bVar.f92922a) {
                Request.C90016a newBuilder = q.newBuilder();
                String str2 = bVar.f92925d;
                if (str2 != null) {
                    tVar = str2;
                }
                newBuilder.mo144691a(tVar);
                if (aVar != null) {
                    newBuilder.mo144696a(aVar.mo145040a());
                }
                eVar.f139468a = (Q) newBuilder.mo144698a();
            }
            C39368a.m80045a(bVar);
        }
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61437l
    /* renamed from: a */
    public final C61425e<com.bytedance.retrofit2.client.Request, C22099u<?>> mo68796a(C61425e<com.bytedance.retrofit2.client.Request, C22099u<?>> eVar) {
        String url;
        C89219l.m154721d(eVar, "");
        Q q = eVar.f139468a;
        String str = null;
        if (!(q == null || (url = q.getUrl()) == null || !C89361p.m154874b(url, "http://", false))) {
            C61404b a = C39368a.m80044a();
            Set<String> set = a != null ? a.f139404d : null;
            C39366b bVar = new C39366b("2", url);
            m80027a(bVar);
            ArrayList headers = q.getHeaders();
            if (headers != null && !headers.isEmpty()) {
                Set<String> set2 = bVar.f92926e;
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) headers, 10));
                for (T t : headers) {
                    C89219l.m154716b(t, "");
                    arrayList.add(t.f52037a);
                }
                set2.addAll(arrayList);
                if (!C39368a.m80046a(a, bVar.f92924c)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (T t2 : headers) {
                        T t3 = t2;
                        if (set != null) {
                            C89219l.m154716b(t3, "");
                            String str2 = t3.f52037a;
                            C89219l.m154716b(str2, "");
                            Locale locale = Locale.ROOT;
                            C89219l.m154716b(locale, "");
                            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                            String lowerCase = str2.toLowerCase(locale);
                            C89219l.m154716b(lowerCase, "");
                            if (set.contains(lowerCase)) {
                            }
                        }
                        arrayList2.add(t2);
                    }
                    headers = arrayList2;
                    Set<C22027b> c = C89070n.m154568c((Iterable) headers, (Iterable) headers);
                    if (c != null && !c.isEmpty()) {
                        for (C22027b bVar2 : c) {
                            Set<String> set3 = bVar.f92927f;
                            C89219l.m154716b(bVar2, "");
                            String str3 = bVar2.f52037a;
                            C89219l.m154716b(str3, "");
                            set3.add(str3);
                        }
                        bVar.f92922a = true;
                    }
                }
                C89219l.m154716b(headers, "");
                Iterator<C22027b> it = headers.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C22027b next = it.next();
                    C89219l.m154716b(next, "");
                    if (!C89219l.m154714a((Object) next.f52037a, (Object) "Cookie")) {
                        i++;
                    } else if (i >= 0) {
                        C22027b bVar3 = headers.get(i);
                        String a2 = m80026a(bVar3 != null ? bVar3.f52038b : null, bVar);
                        C22027b bVar4 = headers.get(i);
                        C89219l.m154716b(bVar4, "");
                        headers.set(i, new C22027b(bVar4.f52037a, a2));
                    }
                }
                Iterator<C22027b> it2 = headers.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C22027b next2 = it2.next();
                    C89219l.m154716b(next2, "");
                    if (!C89219l.m154714a((Object) next2.f52037a, (Object) "X-SS-Cookie")) {
                        i2++;
                    } else if (i2 >= 0) {
                        C22027b bVar5 = headers.get(i2);
                        if (bVar5 != null) {
                            str = bVar5.f52038b;
                        }
                        String a3 = m80026a(str, bVar);
                        C22027b bVar6 = headers.get(i2);
                        C89219l.m154716b(bVar6, "");
                        headers.set(i2, new C22027b(bVar6.f52037a, a3));
                    }
                }
            }
            if (bVar.f92922a) {
                Request.C22024a newBuilder = q.newBuilder();
                String str4 = bVar.f92925d;
                if (str4 == null) {
                    str4 = bVar.f92924c;
                }
                newBuilder.mo35838a(str4);
                if (headers != null && !headers.isEmpty()) {
                    newBuilder.f52025c = headers;
                }
                eVar.f139468a = (Q) newBuilder.mo35840a();
            }
            C39368a.m80045a(bVar);
        }
        return eVar;
    }

    /* renamed from: a */
    private static String m80026a(String str, C39366b bVar) {
        Set<String> set;
        int i;
        boolean z;
        C61404b a = C39368a.m80044a();
        if (a != null) {
            set = a.f139404d;
        } else {
            set = null;
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                C89219l.m154715b();
            }
            int i2 = 0;
            Object[] array = new C89350l(";").split(str, 0).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i3 = 0;
            while (i3 < length) {
                String str2 = strArr[i3];
                Object[] array2 = new C89350l("=").split(str2, i2).toArray(new String[i2]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr2 = (String[]) array2;
                if (strArr2.length > 1) {
                    String str3 = strArr2[i2];
                    int length2 = str3.length() - 1;
                    int i4 = 0;
                    boolean z2 = false;
                    while (i4 <= length2) {
                        if (!z2) {
                            i = i4;
                        } else {
                            i = length2;
                        }
                        if (C89219l.m154703a(str3.charAt(i), 32) <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z2) {
                            if (!z) {
                                break;
                            }
                            length2--;
                        } else if (!z) {
                            z2 = true;
                        } else {
                            i4++;
                        }
                    }
                    String obj = str3.subSequence(i4, length2 + 1).toString();
                    bVar.f92928g.add(obj);
                    if (set != null) {
                        Locale locale = Locale.ROOT;
                        C89219l.m154716b(locale, "");
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = obj.toLowerCase(locale);
                        C89219l.m154716b(lowerCase, "");
                        if (set.contains(lowerCase) && !C39368a.m80046a(a, bVar.f92924c)) {
                            bVar.f92929h.add(obj);
                            bVar.f92922a = true;
                        }
                    }
                    sb.append(str2).append(";");
                } else {
                    sb.append(str2).append(";");
                }
                i3++;
                i2 = 0;
            }
            if (!C39368a.m80046a(a, bVar.f92924c)) {
                return sb.toString();
            }
        }
        return str;
    }
}
