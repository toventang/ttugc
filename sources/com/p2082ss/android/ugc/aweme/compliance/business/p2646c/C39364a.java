package com.p2082ss.android.ugc.aweme.compliance.business.p2646c;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39244e;
import com.p2082ss.android.ugc.aweme.compliance.api.model.InterfaceControlRule;
import com.p2082ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings;
import com.p2082ss.android.ugc.aweme.compliance.api.model.RuleConfig;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.compliance.common.enums.ConfigTypeEnum;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61423c;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i;
import com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61436k;
import com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61437l;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.AbstractC90031ad;
import okhttp3.C90029ac;
import okhttp3.C90198s;
import okhttp3.C90200t;
import okhttp3.C90204w;
import okhttp3.EnumC90211z;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4601a.C89047am;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.c.a */
public final class C39364a implements AbstractC61434i, AbstractC61436k, AbstractC61437l {

    /* renamed from: a */
    public static final Set<String> f92914a = C89047am.m154438a((Object[]) new String[]{"/tfe/api/request_combine/v1/", "/aweme/v1/compliance/settings/", "/tiktok/v1/kids/settings/"});

    /* renamed from: b */
    public static final Set<String> f92915b = C89047am.m154438a((Object[]) new String[]{"did", "deviceid", "device_id"});

    /* renamed from: c */
    public static final Set<String> f92916c = C89047am.m154438a((Object[]) new String[]{"iid", "installid", "install_id"});

    /* renamed from: d */
    public static final TypedByteArray f92917d;

    /* renamed from: e */
    public static final String f92918e;

    /* renamed from: f */
    public static final Object f92919f = new Object();

    /* renamed from: g */
    public static final List<JSONObject> f92920g = new ArrayList();

    /* renamed from: h */
    public static final C39365a f92921h = new C39365a((byte) 0);

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: a */
    public final boolean mo68797a() {
        return true;
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
    /* renamed from: f */
    public final C61425e<HttpURLConnection, InputStream> mo68802f(C61425e<HttpURLConnection, InputStream> eVar) {
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
    /* renamed from: j */
    public final C61425e<HttpURLConnection, Integer> mo68806j(C61425e<HttpURLConnection, Integer> eVar) {
        C89219l.m154721d(eVar, "");
        return eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.c.a$a */
    public static final class C39365a {
        static {
            Covode.recordClassIndex(47049);
        }

        private C39365a() {
        }

        public /* synthetic */ C39365a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61437l
    /* renamed from: a */
    public final C61425e<Request, C22099u<?>> mo68796a(C61425e<Request, C22099u<?>> eVar) {
        Q q;
        List<C22027b> list;
        C89219l.m154721d(eVar, "");
        Q q2 = eVar.f139468a;
        String url = q2 != null ? q2.getUrl() : null;
        C39244e a = m80006a(url);
        if (a.f92687a) {
            Q q3 = eVar.f139468a;
            if (q3 == null || (list = q3.getHeaders()) == null) {
                list = C89086z.INSTANCE;
            }
            C22028c cVar = new C22028c(url, 1001, "", list, f92917d);
            eVar.mo99118a(EnumC61424d.INTERCEPT);
            eVar.f139469b = (R) C22099u.m41527a(cVar.f52043e, cVar);
            m80009a(url, "2", 0, a);
        } else if (m80011b() && (q = eVar.f139468a) != null) {
            C39244e eVar2 = new C39244e(false, url, null, null, null, null, null, 502);
            m80005a(eVar2);
            HashMap hashMap = new HashMap();
            List<C22027b> headers = q.getHeaders();
            if (headers != null) {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) headers, 10));
                for (T t : headers) {
                    C89219l.m154716b(t, "");
                    String str = t.f52037a;
                    C89219l.m154716b(str, "");
                    Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                    String obj = C89361p.m154910b((CharSequence) str).toString();
                    String str2 = t.f52038b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    hashMap.put(obj, str2);
                    arrayList.add(C89391z.f203057a);
                }
            }
            HashMap<String, String> a2 = m80007a(eVar2, hashMap, 2);
            if (eVar2.f92687a) {
                ArrayList arrayList2 = new ArrayList(a2.size());
                for (Map.Entry<String, String> entry : a2.entrySet()) {
                    arrayList2.add(new C22027b(entry.getKey(), entry.getValue()));
                }
                List<C22027b> j = C89070n.m154590j(arrayList2);
                Request.C22024a newBuilder = q.newBuilder();
                newBuilder.mo35838a(eVar2.f92690d);
                newBuilder.f52025c = j;
                eVar.f139468a = (Q) newBuilder.mo35840a();
                m80009a(url, "2", 1, eVar2);
            }
        }
        return eVar;
    }

    /* renamed from: a */
    private final void m80009a(String str, String str2, int i, C39244e eVar) {
        MethodCollector.m26663i(10610);
        List<JSONObject> list = f92920g;
        if (!list.isEmpty()) {
            synchronized (f92919f) {
                try {
                    if (!list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            C12290b.m22064a(EnumC61423c.COMPLIANCE_NETWORK_MONITOR_LOG.getLogType(), (JSONObject) it.next());
                        }
                        f92920g.clear();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10610);
                    throw th;
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", "hit_rule");
        jSONObject.put("flag", eVar.f92687a);
        String str3 = eVar.f92690d;
        if ((str3 != null && !C89361p.m154870a((CharSequence) str3)) || (str != null && !C89361p.m154870a((CharSequence) str))) {
            String str4 = eVar.f92690d;
            if (str4 != null) {
                str = str4;
            }
            eVar.f92690d = str;
            m80005a(eVar);
            jSONObject.put("url", eVar.f92690d);
        }
        Set<String> set = eVar.f92691e;
        if (set != null && !set.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it2 = eVar.f92691e.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            jSONObject.put("header_keys", jSONArray);
        }
        Set<String> set2 = eVar.f92692f;
        if (set2 != null && !set2.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<T> it3 = eVar.f92692f.iterator();
            while (it3.hasNext()) {
                jSONArray2.put(it3.next());
            }
            jSONObject.put("query_keys", jSONArray2);
        }
        Set<String> set3 = eVar.f92695i;
        if (set3 != null && !set3.isEmpty()) {
            jSONObject.put("config", eVar.f92695i.toString());
        }
        jSONObject.put("action", i);
        jSONObject.put("net_type", str2);
        C12290b.m22064a(EnumC61423c.COMPLIANCE_NETWORK_MONITOR_LOG.getLogType(), jSONObject);
        MethodCollector.m26664o(10610);
    }

    static {
        Covode.recordClassIndex(47048);
        byte[] bytes = "{\"status_code\": 1001}".getBytes(C89338d.f202990a);
        C89219l.m154716b(bytes, "");
        f92917d = new TypedByteArray("application/json; charset=utf-8", bytes, new String[0]);
        String simpleName = C39364a.class.getSimpleName();
        C89219l.m154716b(simpleName, "");
        f92918e = simpleName;
    }

    /* renamed from: b */
    private static boolean m80011b() {
        List<InterfaceControlRule> rules;
        InterfaceControlSettings a = C39608b.m80408a();
        ArrayList arrayList = null;
        if (!(a == null || (rules = a.getRules()) == null)) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : rules) {
                List<RuleConfig> ruleThens = t.getRuleThens();
                if (ruleThens != null) {
                    Iterator<T> it = ruleThens.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (C89070n.m154556a((Iterable) ConfigTypeEnum.C39630a.m80474b(), (Object) next.getType())) {
                            if (next != null) {
                                arrayList2.add(t);
                            }
                        }
                    }
                }
            }
            arrayList = arrayList2;
        }
        if (C80580in.m139687c() || (arrayList != null && !arrayList.isEmpty())) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: i */
    public final C61425e<HttpURLConnection, Integer> mo68805i(C61425e<HttpURLConnection, Integer> eVar) {
        String str;
        URL url;
        C89219l.m154721d(eVar, "");
        Q q = eVar.f139468a;
        if (q == null || (url = q.getURL()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        C39244e a = m80006a(str);
        if (a.f92687a) {
            eVar.mo99118a(EnumC61424d.INTERCEPT);
            eVar.f139469b = (R) 1001;
            m80009a(str, "3", 0, a);
        }
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: e */
    public final C61425e<HttpURLConnection, InputStream> mo68801e(C61425e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        MethodCollector.m26663i(10115);
        C89219l.m154721d(eVar, "");
        Q q = eVar.f139468a;
        if (q == null || (url = q.getURL()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        C39244e a = m80006a(str);
        if (a.f92687a) {
            byte[] bytes = "{\"status_code\": 1001}".getBytes(C89338d.f202990a);
            C89219l.m154716b(bytes, "");
            eVar.mo99118a(EnumC61424d.INTERCEPT);
            eVar.f139469b = (R) new ByteArrayInputStream(bytes);
            m80009a(str, "3", 0, a);
        }
        MethodCollector.m26664o(10115);
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: g */
    public final C61425e<HttpURLConnection, InputStream> mo68803g(C61425e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        MethodCollector.m26663i(10282);
        C89219l.m154721d(eVar, "");
        Q q = eVar.f139468a;
        if (q == null || (url = q.getURL()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        C39244e a = m80006a(str);
        if (a.f92687a) {
            byte[] bytes = "{\"status_code\": 1001}".getBytes(C89338d.f202990a);
            C89219l.m154716b(bytes, "");
            eVar.mo99118a(EnumC61424d.INTERCEPT);
            eVar.f139469b = (R) new ByteArrayInputStream(bytes);
            m80009a(str, "3", 0, a);
        }
        MethodCollector.m26664o(10282);
        return eVar;
    }

    /* renamed from: a */
    private static C39244e m80005a(C39244e eVar) {
        if (!TextUtils.isEmpty(eVar.f92690d)) {
            Uri parse = Uri.parse(eVar.f92690d);
            C89219l.m154716b(parse, "");
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList(C89070n.m154526a(queryParameterNames, 10));
                for (T t : queryParameterNames) {
                    C89219l.m154716b(t, "");
                    Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.CharSequence");
                    String obj = C89361p.m154910b((CharSequence) t).toString();
                    String queryParameter = parse.getQueryParameter(t);
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    C89219l.m154716b(queryParameter, "");
                    hashMap.put(obj, queryParameter);
                    arrayList.add(C89391z.f203057a);
                }
                HashMap<String, String> a = m80007a(eVar, hashMap, 0);
                if (eVar.f92687a) {
                    Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                    for (Map.Entry<String, String> entry : a.entrySet()) {
                        clearQuery.appendQueryParameter(entry.getKey(), entry.getValue());
                    }
                    eVar.f92690d = clearQuery.build().toString();
                }
            }
        }
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: k */
    public final C61425e<HttpURLConnection, InputStream> mo68807k(C61425e<HttpURLConnection, InputStream> eVar) {
        String str;
        String str2;
        String str3;
        URL url;
        String str4 = "";
        C89219l.m154721d(eVar, str4);
        if (m80011b()) {
            JSONObject jSONObject = eVar.f139471d;
            if (jSONObject != null) {
                str = jSONObject.optString("key", str4);
                str2 = jSONObject.optString("value", str4);
            } else {
                str = str4;
                str2 = str;
            }
            if (str != null && !C89361p.m154870a((CharSequence) str)) {
                C39244e eVar2 = new C39244e(false, null, null, null, null, null, null, 510);
                HashMap hashMap = new HashMap();
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = C89361p.m154910b((CharSequence) str).toString();
                if (str2 != null) {
                    str4 = str2;
                }
                hashMap.put(obj, str4);
                HashMap<String, String> a = m80007a(eVar2, hashMap, 2);
                if (eVar2.f92687a) {
                    Q q = eVar.f139468a;
                    if (q == null || (url = q.getURL()) == null) {
                        str3 = null;
                    } else {
                        str3 = url.toString();
                    }
                    if (a == null || a.isEmpty()) {
                        eVar.mo99118a(EnumC61424d.DROP);
                    } else {
                        for (Map.Entry<String, String> entry : a.entrySet()) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (jSONObject != null) {
                                jSONObject.put(key, value);
                            }
                        }
                    }
                    m80009a(str3, "3", 1, eVar2);
                }
            }
        }
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: l */
    public final C61425e<HttpURLConnection, InputStream> mo68808l(C61425e<HttpURLConnection, InputStream> eVar) {
        String str;
        String str2;
        String str3;
        URL url;
        String str4 = "";
        C89219l.m154721d(eVar, str4);
        if (m80011b()) {
            JSONObject jSONObject = eVar.f139471d;
            if (jSONObject != null) {
                str = jSONObject.optString("key", str4);
                str2 = jSONObject.optString("value", str4);
            } else {
                str = str4;
                str2 = str;
            }
            if (str != null && !C89361p.m154870a((CharSequence) str)) {
                C39244e eVar2 = new C39244e(false, null, null, null, null, null, null, 510);
                HashMap hashMap = new HashMap();
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = C89361p.m154910b((CharSequence) str).toString();
                if (str2 != null) {
                    str4 = str2;
                }
                hashMap.put(obj, str4);
                HashMap<String, String> a = m80007a(eVar2, hashMap, 2);
                if (eVar2.f92687a) {
                    Q q = eVar.f139468a;
                    if (q == null || (url = q.getURL()) == null) {
                        str3 = null;
                    } else {
                        str3 = url.toString();
                    }
                    if (a == null || a.isEmpty()) {
                        eVar.mo99118a(EnumC61424d.DROP);
                    } else {
                        for (Map.Entry<String, String> entry : a.entrySet()) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (jSONObject != null) {
                                jSONObject.put(key, value);
                            }
                        }
                    }
                    m80009a(str3, "3", 1, eVar2);
                }
            }
        }
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: m */
    public final C61425e<URL, URLConnection> mo68809m(C61425e<URL, URLConnection> eVar) {
        String str;
        R r;
        HttpURLConnection httpURLConnection;
        C89219l.m154721d(eVar, "");
        Q q = eVar.f139468a;
        if (q != null) {
            str = q.toString();
        } else {
            str = null;
        }
        if (m80011b() && eVar.f139468a != null) {
            C39244e eVar2 = new C39244e(false, str, null, null, null, null, null, 502);
            m80005a(eVar2);
            if (eVar2.f92687a) {
                URL url = new URL(eVar2.f92690d);
                C61425e<URL, URLConnection> m = C61439n.f139485e.mo68809m(new C61425e<>(url, null, null, EnumC61424d.CONTINUE));
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
                        m80009a(str, "3", 1, eVar2);
                    }
                } else if (m.f139473f != EnumC61424d.EXCEPTION || m.f139472e == null) {
                    r = (R) url.openConnection();
                    if (r instanceof HttpsURLConnection) {
                        httpURLConnection = new C61417b(r);
                    } else {
                        if (r instanceof HttpURLConnection) {
                            httpURLConnection = new C61416a(r);
                        }
                        eVar.f139469b = r;
                        eVar.mo99118a(EnumC61424d.INTERCEPT);
                        m80009a(str, "3", 1, eVar2);
                    }
                } else {
                    throw m.f139472e;
                }
                r = (R) httpURLConnection;
                eVar.f139469b = r;
                eVar.mo99118a(EnumC61424d.INTERCEPT);
                m80009a(str, "3", 1, eVar2);
            }
        }
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61436k
    /* renamed from: c */
    public final C61425e<okhttp3.Request, C90029ac> mo68799c(C61425e<okhttp3.Request, C90029ac> eVar) {
        Q q;
        Set<String> a;
        C90200t url;
        C89219l.m154721d(eVar, "");
        Q q2 = eVar.f139468a;
        String str = null;
        if (!(q2 == null || (url = q2.url()) == null)) {
            str = url.toString();
        }
        C39244e a2 = m80006a(str);
        if (a2.f92687a) {
            C90029ac.C90030a aVar = new C90029ac.C90030a();
            aVar.f204120c = 1001;
            aVar.f204119b = EnumC90211z.HTTP_2;
            aVar.f204121d = "";
            Q q3 = eVar.f139468a;
            if (q3 == null) {
                C89219l.m154715b();
            }
            aVar.f204118a = q3;
            aVar.f204124g = AbstractC90031ad.create(C90204w.m156843b("application/json; charset=utf-8"), "{\"status_code\": 1001}");
            eVar.mo99118a(EnumC61424d.INTERCEPT);
            eVar.f139469b = (R) aVar.mo144729a();
            m80009a(str, "4", 0, a2);
        } else if (m80011b() && (q = eVar.f139468a) != null) {
            C90198s headers = q.headers();
            C39244e eVar2 = new C39244e(false, str, null, null, null, null, null, 502);
            m80005a(eVar2);
            HashMap hashMap = new HashMap();
            if (!(headers == null || (a = headers.mo145029a()) == null)) {
                ArrayList arrayList = new ArrayList(C89070n.m154526a(a, 10));
                for (T t : a) {
                    C89219l.m154716b(t, "");
                    Objects.requireNonNull(t, "null cannot be cast to non-null type kotlin.CharSequence");
                    String obj = C89361p.m154910b((CharSequence) t).toString();
                    String a3 = headers.mo145028a((String) t);
                    if (a3 == null) {
                        a3 = "";
                    }
                    C89219l.m154716b(a3, "");
                    hashMap.put(obj, a3);
                    arrayList.add(C89391z.f203057a);
                }
            }
            HashMap<String, String> a4 = m80007a(eVar2, hashMap, 2);
            if (eVar2.f92687a) {
                C90198s.C90199a aVar2 = new C90198s.C90199a();
                for (Map.Entry<String, String> entry : a4.entrySet()) {
                    aVar2.mo145039a(entry.getKey(), entry.getValue());
                }
                Request.C90016a newBuilder = q.newBuilder();
                String str2 = eVar2.f92690d;
                if (str2 == null) {
                    C89219l.m154715b();
                }
                newBuilder.mo144691a(str2);
                newBuilder.mo144696a(aVar2.mo145040a());
                eVar.f139468a = (Q) newBuilder.mo144698a();
                m80009a(str, "4", 1, eVar2);
            }
        }
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x017f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x00cc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b A[SYNTHETIC, Splitter:B:40:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0147  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p2082ss.android.ugc.aweme.compliance.api.model.C39244e m80006a(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 552
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39364a.m80006a(java.lang.String):com.ss.android.ugc.aweme.compliance.api.model.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        if (r1 != null) goto L_0x0037;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m80010a(java.lang.String r8, com.p2082ss.android.ugc.aweme.compliance.api.model.RuleWhen r9) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39364a.m80010a(java.lang.String, com.ss.android.ugc.aweme.compliance.api.model.RuleWhen):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.util.Set<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r1 == com.p2082ss.android.ugc.aweme.compliance.api.p2637a.EnumC39225b.NOT_LOGIN) goto L_0x001f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m80008a(com.p2082ss.android.ugc.aweme.compliance.api.model.C39244e r9, java.util.HashMap<java.lang.String, java.lang.String> r10, java.util.Set<java.lang.String> r11) {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39364a.m80008a(com.ss.android.ugc.aweme.compliance.api.model.e, java.util.HashMap, java.util.Set):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r16.isEmpty() == false) goto L_0x0075;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.HashMap<java.lang.String, java.lang.String> m80007a(com.p2082ss.android.ugc.aweme.compliance.api.model.C39244e r15, java.util.HashMap<java.lang.String, java.lang.String> r16, int r17) {
        /*
        // Method dump skipped, instructions count: 658
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39364a.m80007a(com.ss.android.ugc.aweme.compliance.api.model.e, java.util.HashMap, int):java.util.HashMap");
    }
}
