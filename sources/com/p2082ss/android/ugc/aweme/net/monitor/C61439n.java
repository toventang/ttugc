package com.p2082ss.android.ugc.aweme.net.monitor;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.AbstractC16082i;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.p2082ss.android.ugc.aweme.net.model.C61421a;
import com.p2082ss.android.ugc.aweme.net.model.C61422b;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61423c;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.model.ScopeEnum;
import com.p2082ss.android.ugc.aweme.net.model.UnexpectedConfig;
import com.p2082ss.android.ugc.aweme.net.p3500j.C61408f;
import com.p2082ss.android.ugc.aweme.net.p3500j.C61410h;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import okhttp3.C90029ac;
import okhttp3.C90200t;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.net.monitor.n */
public final class C61439n implements AbstractC61431f, AbstractC61432g, AbstractC61433h, AbstractC61434i, AbstractC61436k, AbstractC61437l, AbstractC61438m {

    /* renamed from: a */
    public static final AbstractC89244h f139481a = C89250i.m154773a((AbstractC89171a) C61443b.f139490a);

    /* renamed from: b */
    public static final Object f139482b = new Object();

    /* renamed from: c */
    public static boolean f139483c;

    /* renamed from: d */
    public static final String f139484d;

    /* renamed from: e */
    public static final C61439n f139485e = new C61439n();

    /* renamed from: f */
    public static final CopyOnWriteArrayList<AbstractC61435j> f139486f = new CopyOnWriteArrayList<>();

    /* renamed from: g */
    public static final C61440a f139487g = new C61440a((byte) 0);

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: a */
    public final boolean mo68797a() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.net.monitor.n$a */
    public static final class C61440a {
        static {
            Covode.recordClassIndex(72095);
        }

        /* renamed from: b */
        private static boolean m111268b() {
            return ((Boolean) C61439n.f139481a.getValue()).booleanValue();
        }

        private C61440a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.net.monitor.n$a$a */
        static final class C61441a implements AbstractC16082i {

            /* renamed from: a */
            public static final C61441a f139488a = new C61441a();

            static {
                Covode.recordClassIndex(72096);
            }

            C61441a() {
            }

            @Override // com.bytedance.ies.abmock.AbstractC16082i
            /* renamed from: a */
            public final void mo25536a() {
                ExecutorService b = C40780g.m82245b();
                C89219l.m154716b(b, "");
                b.execute(RunnableC614421.f139489a);
            }
        }

        /* renamed from: a */
        public static boolean m111266a() {
            if (C61439n.f139483c) {
                return m111268b();
            }
            return Keva.getRepo("keva_repo_native_network_monitor", 1).getBoolean("keva_key_native_network_monitor", true);
        }

        public /* synthetic */ C61440a(byte b) {
            this();
        }

        /* renamed from: a */
        public static List<UnexpectedConfig> m111263a(UnexpectedConfig[] unexpectedConfigArr) {
            if (unexpectedConfigArr != null) {
                ArrayList arrayList = new ArrayList();
                for (UnexpectedConfig unexpectedConfig : unexpectedConfigArr) {
                    if (ScopeEnum.C61419a.m111186a(unexpectedConfig.getScope())) {
                        arrayList.add(unexpectedConfig);
                    }
                }
                List<UnexpectedConfig> j = C89070n.m154590j(arrayList);
                if (j != null) {
                    return j;
                }
            }
            return C89086z.INSTANCE;
        }

        /* renamed from: a */
        public static void m111264a(AbstractC61435j jVar) {
            MethodCollector.m26663i(11835);
            C89219l.m154721d(jVar, "");
            synchronized (C61439n.f139482b) {
                try {
                    String simpleName = jVar.getClass().getSimpleName();
                    C89219l.m154716b(simpleName, "");
                    C89219l.m154721d(simpleName, "");
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = C61439n.f139486f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (C89219l.m154714a((Object) t.getClass().getSimpleName(), (Object) simpleName)) {
                            arrayList.add(t);
                        }
                    }
                    C61439n.f139486f.removeAll(arrayList);
                    C61439n.f139486f.add(jVar);
                } finally {
                    MethodCollector.m26664o(11835);
                }
            }
        }

        /* renamed from: a */
        public static boolean m111267a(HttpURLConnection httpURLConnection) {
            if (httpURLConnection instanceof C61416a) {
                return ((C61416a) httpURLConnection).f139446a;
            }
            if (httpURLConnection instanceof C61417b) {
                return ((C61417b) httpURLConnection).f139451a;
            }
            if (httpURLConnection == null) {
                return false;
            }
            String simpleName = httpURLConnection.getClass().getSimpleName();
            C89219l.m154716b(simpleName, "");
            return C89361p.m154908a((CharSequence) simpleName, (CharSequence) "Cronet", false);
        }

        /* renamed from: a */
        public static void m111265a(String str, String str2, Exception exc) {
            C89219l.m154721d(str2, "");
            C89219l.m154721d(exc, "");
            try {
                JSONObject jSONObject = new JSONObject();
                if (str != null && !C89361p.m154870a((CharSequence) str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put("exception_name", exc.getClass().getSimpleName());
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                jSONObject.put("exception_message", message);
                jSONObject.put("monitor_method", str2);
                C12290b.m22064a(EnumC61423c.NATIVE_NETWORK_MONITOR_EXCEPTION_LOG.getLogType(), jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.monitor.n$b */
    static final class C61443b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C61443b f139490a = new C61443b();

        static {
            Covode.recordClassIndex(72098);
        }

        C61443b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("keva_repo_native_network_monitor", 1).getBoolean("keva_key_native_network_monitor", true));
        }
    }

    static {
        Covode.recordClassIndex(72094);
        String simpleName = C61439n.class.getSimpleName();
        C89219l.m154716b(simpleName, "");
        f139484d = simpleName;
        SettingsManager.m29616a().mo25399a(C61440a.C61441a.f139488a);
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61437l
    /* renamed from: a */
    public final C61425e<Request, C22099u<?>> mo68796a(C61425e<Request, C22099u<?>> eVar) {
        String str;
        C89219l.m154721d(eVar, "");
        try {
            Q q = eVar.f139468a;
            if (q != null) {
                q.getUrl();
            }
            if (C61440a.m111266a() && C61408f.m111180a().f139412a) {
                if (C61408f.m111180a().f139413b) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList<AbstractC61437l> arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61437l) {
                            arrayList.add(t);
                        }
                    }
                    for (AbstractC61437l lVar : arrayList) {
                        eVar = lVar.mo68796a(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            Q q2 = eVar.f139468a;
            if (q2 != null) {
                str = q2.getUrl();
            } else {
                str = null;
            }
            C61440a.m111265a(str, "onBeforeTTNet", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61437l
    /* renamed from: b */
    public final C61425e<Request, C22099u<?>> mo68798b(C61425e<Request, C22099u<?>> eVar) {
        String str;
        C89219l.m154721d(eVar, "");
        try {
            Q q = eVar.f139468a;
            if (q != null) {
                q.getUrl();
            }
            if (C61440a.m111266a() && C61408f.m111180a().f139412a) {
                if (C61408f.m111180a().f139413b) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList<AbstractC61437l> arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61437l) {
                            arrayList.add(t);
                        }
                    }
                    for (AbstractC61437l lVar : arrayList) {
                        eVar = lVar.mo68798b(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            Q q2 = eVar.f139468a;
            if (q2 != null) {
                str = q2.getUrl();
            } else {
                str = null;
            }
            C61440a.m111265a(str, "onAfterTTNet", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61436k
    /* renamed from: c */
    public final C61425e<okhttp3.Request, C90029ac> mo68799c(C61425e<okhttp3.Request, C90029ac> eVar) {
        String str;
        C90200t url;
        C89219l.m154721d(eVar, "");
        try {
            Q q = eVar.f139468a;
            if (q != null) {
                q.url();
            }
            if (C61440a.m111266a() && C61408f.m111180a().f139412a) {
                if (C61408f.m111180a().f139414c) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList<AbstractC61436k> arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61436k) {
                            arrayList.add(t);
                        }
                    }
                    for (AbstractC61436k kVar : arrayList) {
                        eVar = kVar.mo68799c(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            Q q2 = eVar.f139468a;
            if (q2 == null || (url = q2.url()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            C61440a.m111265a(str, "onBeforeOkHttp", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61438m
    /* renamed from: n */
    public final C61425e<String, WebResourceResponse> mo68813n(C61425e<String, WebResourceResponse> eVar) {
        C89219l.m154721d(eVar, "");
        try {
            if (C61440a.m111266a() && C61408f.m111180a().f139412a) {
                if (C61408f.m111180a().f139417f) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList<AbstractC61438m> arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61438m) {
                            arrayList.add(t);
                        }
                    }
                    for (AbstractC61438m mVar : arrayList) {
                        eVar = mVar.mo68813n(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            C61440a.m111265a(eVar.f139468a, "onShouldInterceptRequestUrl", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61438m
    /* renamed from: o */
    public final C61425e<WebResourceRequest, WebResourceResponse> mo68814o(C61425e<WebResourceRequest, WebResourceResponse> eVar) {
        String str;
        Uri url;
        C89219l.m154721d(eVar, "");
        try {
            Q q = eVar.f139468a;
            if (q != null) {
                q.getUrl();
            }
            if (C61440a.m111266a() && C61408f.m111180a().f139412a) {
                if (C61408f.m111180a().f139417f) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList<AbstractC61438m> arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61438m) {
                            arrayList.add(t);
                        }
                    }
                    for (AbstractC61438m mVar : arrayList) {
                        eVar = mVar.mo68814o(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            Q q2 = eVar.f139468a;
            if (q2 == null || (url = q2.getUrl()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            C61440a.m111265a(str, "onShouldInterceptRequest", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61431f
    /* renamed from: a_ */
    public final C61425e<C61421a, Boolean> mo68815a_(C61425e<C61421a, Boolean> eVar) {
        C89219l.m154721d(eVar, "");
        try {
            if (C61440a.m111266a() && C61408f.m111180a().f139412a) {
                if (C61410h.m111181a().f139422a) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList<AbstractC61431f> arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61431f) {
                            arrayList.add(t);
                        }
                    }
                    for (AbstractC61431f fVar : arrayList) {
                        eVar = fVar.mo68815a_(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            Q q = eVar.f139468a;
            String str = null;
            StringBuilder append = sb.append(q != null ? q.f139458a : null).append('/');
            Q q2 = eVar.f139468a;
            StringBuilder append2 = append.append(q2 != null ? q2.f139459b : null).append('/');
            Q q3 = eVar.f139468a;
            if (q3 != null) {
                str = q3.f139459b;
            }
            C61440a.m111265a(append2.append(str).toString(), "onAppLog", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61432g
    /* renamed from: b_ */
    public final C61425e<C61422b, Boolean> mo68816b_(C61425e<C61422b, Boolean> eVar) {
        C89219l.m154721d(eVar, "");
        try {
            if (C61440a.m111266a() && C61408f.m111180a().f139412a) {
                if (C61410h.m111181a().f139422a) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList<AbstractC61432g> arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61432g) {
                            arrayList.add(t);
                        }
                    }
                    for (AbstractC61432g gVar : arrayList) {
                        eVar = gVar.mo68816b_(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            Q q = eVar.f139468a;
            String str = null;
            StringBuilder append = sb.append(q != null ? q.f139462a : null).append('/');
            Q q2 = eVar.f139468a;
            if (q2 != null) {
                str = q2.f139463b;
            }
            C61440a.m111265a(append.append(str).toString(), "onCommonLog", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61436k
    /* renamed from: d */
    public final C61425e<okhttp3.Request, C90029ac> mo68800d(C61425e<okhttp3.Request, C90029ac> eVar) {
        C89219l.m154721d(eVar, "");
        try {
            R r = eVar.f139469b;
            if (r == null) {
                C89219l.m154715b();
            }
            r.f204105a.url();
            if (C61440a.m111266a() && C61408f.m111180a().f139412a) {
                if (C61408f.m111180a().f139414c) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList<AbstractC61436k> arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61436k) {
                            arrayList.add(t);
                        }
                    }
                    for (AbstractC61436k kVar : arrayList) {
                        eVar = kVar.mo68800d(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            R r2 = eVar.f139469b;
            if (r2 == null) {
                C89219l.m154715b();
            }
            C61440a.m111265a(r2.f204105a.url().toString(), "onAfterOkHttp", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: e */
    public final C61425e<HttpURLConnection, InputStream> mo68801e(C61425e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        C89219l.m154721d(eVar, "");
        try {
            Q q = eVar.f139468a;
            if (q != null) {
                q.getURL();
            }
            if (C61440a.m111266a() && C61408f.m111180a().f139412a && C61408f.m111180a().f139415d) {
                if (eVar.f139468a != null) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61434i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<AbstractC61434i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((AbstractC61434i) obj).mo68797a() || !C61440a.m111267a((HttpURLConnection) eVar.f139468a)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (AbstractC61434i iVar : arrayList2) {
                        eVar = iVar.mo68801e(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            Q q2 = eVar.f139468a;
            if (q2 == null || (url = q2.getURL()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            C61440a.m111265a(str, "onBeforeInputStream", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: f */
    public final C61425e<HttpURLConnection, InputStream> mo68802f(C61425e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        C89219l.m154721d(eVar, "");
        try {
            Q q = eVar.f139468a;
            if (q != null) {
                q.getURL();
            }
            if (C61440a.m111266a() && C61408f.m111180a().f139412a && C61408f.m111180a().f139415d) {
                if (eVar.f139468a != null) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61434i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<AbstractC61434i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((AbstractC61434i) obj).mo68797a() || !C61440a.m111267a((HttpURLConnection) eVar.f139468a)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (AbstractC61434i iVar : arrayList2) {
                        eVar = iVar.mo68802f(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            Q q2 = eVar.f139468a;
            if (q2 == null || (url = q2.getURL()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            C61440a.m111265a(str, "onAfterInputStream", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: g */
    public final C61425e<HttpURLConnection, InputStream> mo68803g(C61425e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        C89219l.m154721d(eVar, "");
        try {
            Q q = eVar.f139468a;
            if (q != null) {
                q.getURL();
            }
            if (C61440a.m111266a() && C61408f.m111180a().f139412a && C61408f.m111180a().f139415d) {
                if (eVar.f139468a != null) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61434i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<AbstractC61434i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((AbstractC61434i) obj).mo68797a() || !C61440a.m111267a((HttpURLConnection) eVar.f139468a)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (AbstractC61434i iVar : arrayList2) {
                        eVar = iVar.mo68803g(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            Q q2 = eVar.f139468a;
            if (q2 == null || (url = q2.getURL()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            C61440a.m111265a(str, "onBeforeErrorStream", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: h */
    public final C61425e<HttpURLConnection, InputStream> mo68804h(C61425e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        C89219l.m154721d(eVar, "");
        try {
            Q q = eVar.f139468a;
            if (q != null) {
                q.getURL();
            }
            if (C61440a.m111266a() && C61408f.m111180a().f139412a && C61408f.m111180a().f139415d) {
                if (eVar.f139468a != null) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61434i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<AbstractC61434i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((AbstractC61434i) obj).mo68797a() || !C61440a.m111267a((HttpURLConnection) eVar.f139468a)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (AbstractC61434i iVar : arrayList2) {
                        eVar = iVar.mo68804h(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            Q q2 = eVar.f139468a;
            if (q2 == null || (url = q2.getURL()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            C61440a.m111265a(str, "onAfterErrorStream", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: i */
    public final C61425e<HttpURLConnection, Integer> mo68805i(C61425e<HttpURLConnection, Integer> eVar) {
        String str;
        URL url;
        C89219l.m154721d(eVar, "");
        try {
            Q q = eVar.f139468a;
            if (q != null) {
                q.getURL();
            }
            if (C61440a.m111266a() && C61408f.m111180a().f139412a && C61408f.m111180a().f139415d) {
                if (eVar.f139468a != null) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61434i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<AbstractC61434i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((AbstractC61434i) obj).mo68797a() || !C61440a.m111267a((HttpURLConnection) eVar.f139468a)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (AbstractC61434i iVar : arrayList2) {
                        eVar = iVar.mo68805i(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            Q q2 = eVar.f139468a;
            if (q2 == null || (url = q2.getURL()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            C61440a.m111265a(str, "onBeforeResponseCode", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: j */
    public final C61425e<HttpURLConnection, Integer> mo68806j(C61425e<HttpURLConnection, Integer> eVar) {
        String str;
        URL url;
        C89219l.m154721d(eVar, "");
        try {
            Q q = eVar.f139468a;
            if (q != null) {
                q.getURL();
            }
            if (C61440a.m111266a() && C61408f.m111180a().f139412a && C61408f.m111180a().f139415d) {
                if (eVar.f139468a != null) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61434i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<AbstractC61434i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((AbstractC61434i) obj).mo68797a() || !C61440a.m111267a((HttpURLConnection) eVar.f139468a)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (AbstractC61434i iVar : arrayList2) {
                        eVar = iVar.mo68806j(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            Q q2 = eVar.f139468a;
            if (q2 == null || (url = q2.getURL()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            C61440a.m111265a(str, "onAfterResponseCode", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: k */
    public final C61425e<HttpURLConnection, InputStream> mo68807k(C61425e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        C89219l.m154721d(eVar, "");
        try {
            Q q = eVar.f139468a;
            if (q != null) {
                q.getURL();
            }
            if (C61440a.m111266a() && C61408f.m111180a().f139412a && C61408f.m111180a().f139415d) {
                if (eVar.f139468a != null) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61434i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<AbstractC61434i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((AbstractC61434i) obj).mo68797a() || !C61440a.m111267a((HttpURLConnection) eVar.f139468a)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (AbstractC61434i iVar : arrayList2) {
                        eVar = iVar.mo68807k(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f != EnumC61424d.DROP) {
                                if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                                }
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            Q q2 = eVar.f139468a;
            if (q2 == null || (url = q2.getURL()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            C61440a.m111265a(str, "onSetRequestProperty", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: l */
    public final C61425e<HttpURLConnection, InputStream> mo68808l(C61425e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        C89219l.m154721d(eVar, "");
        try {
            Q q = eVar.f139468a;
            if (q != null) {
                q.getURL();
            }
            if (C61440a.m111266a() && C61408f.m111180a().f139412a && C61408f.m111180a().f139415d) {
                if (eVar.f139468a != null) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61434i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<AbstractC61434i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((AbstractC61434i) obj).mo68797a() || !C61440a.m111267a((HttpURLConnection) eVar.f139468a)) {
                            arrayList2.add(obj);
                        }
                    }
                    for (AbstractC61434i iVar : arrayList2) {
                        eVar = iVar.mo68808l(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f != EnumC61424d.DROP) {
                                if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                                }
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            Q q2 = eVar.f139468a;
            if (q2 == null || (url = q2.getURL()) == null) {
                str = null;
            } else {
                str = url.toString();
            }
            C61440a.m111265a(str, "onAddRequestProperty", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: m */
    public final C61425e<URL, URLConnection> mo68809m(C61425e<URL, URLConnection> eVar) {
        String str;
        C89219l.m154721d(eVar, "");
        try {
            if (C61440a.m111266a() && C61408f.m111180a().f139412a && C61408f.m111180a().f139415d) {
                if (eVar.f139468a != null) {
                    CopyOnWriteArrayList<AbstractC61435j> copyOnWriteArrayList = f139486f;
                    ArrayList arrayList = new ArrayList();
                    for (T t : copyOnWriteArrayList) {
                        if (t instanceof AbstractC61434i) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<AbstractC61434i> arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((AbstractC61434i) obj).mo68797a()) {
                            arrayList2.add(obj);
                        }
                    }
                    for (AbstractC61434i iVar : arrayList2) {
                        eVar = iVar.mo68809m(eVar);
                        if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                            if (eVar.f139473f == EnumC61424d.EXCEPTION) {
                            }
                        }
                    }
                    return eVar;
                }
            }
            return eVar;
        } catch (Exception e) {
            Q q = eVar.f139468a;
            if (q != null) {
                str = q.toString();
            } else {
                str = null;
            }
            C61440a.m111265a(str, "onOpenConnection", e);
        }
    }
}
