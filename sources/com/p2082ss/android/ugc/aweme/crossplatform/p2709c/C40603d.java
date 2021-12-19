package com.p2082ss.android.ugc.aweme.crossplatform.p2709c;

import android.net.Uri;
import com.bytedance.android.monitor.p703a.AbstractC11900b;
import com.bytedance.android.monitor.p703a.AbstractC11902c;
import com.bytedance.android.monitor.p703a.AbstractC11903d;
import com.bytedance.android.monitor.p709g.AbstractC11933c;
import com.bytedance.android.monitor.p709g.C11934d;
import com.bytedance.android.monitor.p709g.C11935e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40712p;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34299ab;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34346s;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34358z;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34300ac;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34325h;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.c.d */
public final class C40603d {

    /* renamed from: h */
    public static final AbstractC89244h f95019h = C89250i.m154773a((AbstractC89171a) C40605b.f95031a);

    /* renamed from: i */
    public static final C40604a f95020i = new C40604a((byte) 0);

    /* renamed from: a */
    public Thread.UncaughtExceptionHandler f95021a;

    /* renamed from: b */
    public final List<String> f95022b;

    /* renamed from: c */
    public String f95023c;

    /* renamed from: d */
    public final Map<String, C34337k> f95024d;

    /* renamed from: e */
    public final C89350l f95025e;

    /* renamed from: f */
    public final AbstractC34358z f95026f;

    /* renamed from: g */
    public final AbstractC34299ab f95027g;

    /* renamed from: j */
    private final Thread.UncaughtExceptionHandler f95028j;

    /* renamed from: k */
    private final ConcurrentHashMap<String, Long> f95029k;

    /* renamed from: l */
    private final AbstractC89244h f95030l;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.d$a */
    public static final class C40604a {
        static {
            Covode.recordClassIndex(48444);
        }

        /* renamed from: a */
        public static C40603d m81964a() {
            return (C40603d) C40603d.f95019h.getValue();
        }

        private C40604a() {
        }

        public /* synthetic */ C40604a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.d$d */
    public static final class C40607d implements AbstractC34358z {
        static {
            Covode.recordClassIndex(48447);
        }

        C40607d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34358z
        /* renamed from: a */
        public final void mo60806a(String str, JSONObject jSONObject) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(jSONObject, "");
            C34611o.m70671b("service_monitor", str, jSONObject);
        }

        /* renamed from: a */
        private static void m81965a(JSONObject jSONObject, String str, Object obj) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception unused) {
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34358z
        /* renamed from: a */
        public final void mo60804a(Exception exc, String str, Map<String, String> map) {
            C89219l.m154721d(exc, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(map, "");
            C13468b.m24212a(exc, str, map);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34358z
        /* renamed from: a */
        public final void mo60805a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
            JSONObject jSONObject3;
            int i;
            if (jSONObject2 == null) {
                jSONObject3 = null;
            } else if (z) {
                jSONObject3 = jSONObject2;
            } else {
                jSONObject3 = new JSONObject();
                m81965a(jSONObject2, "tag", "ttlive_sdk");
                m81965a(jSONObject3, "aid", String.valueOf(C17867d.f42590n));
                m81965a(jSONObject3, "extra", jSONObject2);
            }
            C40602c.m81954a(jSONObject2);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            C33830n.m70666a(str, i, jSONObject, jSONObject3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.d$b */
    static final class C40605b extends AbstractC89220m implements AbstractC89171a<C40603d> {

        /* renamed from: a */
        public static final C40605b f95031a = new C40605b();

        static {
            Covode.recordClassIndex(48445);
        }

        C40605b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C40603d invoke() {
            return new C40603d((byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.d$e */
    public static final class C40608e implements AbstractC34299ab {

        /* renamed from: a */
        final /* synthetic */ C40603d f95033a;

        /* renamed from: b */
        private String f95034b = "";

        /* renamed from: c */
        private String f95035c = "";

        /* renamed from: d */
        private String f95036d = "";

        /* renamed from: e */
        private Boolean f95037e;

        static {
            Covode.recordClassIndex(48448);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34299ab
        /* renamed from: c */
        public final boolean mo60737c() {
            return C16048b.m29633a().mo25421a(true, "webview_monitor_enable", false);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34299ab
        /* renamed from: d */
        public final List<String> mo60738d() {
            List<String> a = AbstractC40712p.C40713a.m82128a();
            C89219l.m154716b(a, "");
            return a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34299ab
        /* renamed from: a */
        public final String mo60735a() {
            if (this.f95036d.length() == 0) {
                C89219l.m154716b("SystemWebView", "");
                this.f95036d = "SystemWebView";
            }
            return this.f95036d;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34299ab
        /* renamed from: b */
        public final boolean mo60736b() {
            if (this.f95037e == null) {
                this.f95037e = false;
            }
            Boolean bool = this.f95037e;
            Objects.requireNonNull(bool, "null cannot be cast to non-null type kotlin.Boolean");
            return bool.booleanValue();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
            if (r0 != null) goto L_0x0025;
         */
        @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34299ab
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo60739e() {
            /*
                r1 = this;
                java.lang.String r0 = r1.f95034b
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x000e
                r0 = 1
            L_0x0009:
                if (r0 == 0) goto L_0x0010
                java.lang.String r0 = r1.f95034b
                return r0
            L_0x000e:
                r0 = 0
                goto L_0x0009
            L_0x0010:
                com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig r0 = com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40603d.m81955a()
                if (r0 == 0) goto L_0x0021
                java.lang.String r0 = r0.getSlardarSdkConfig()     // Catch:{ a -> 0x001b }
                goto L_0x001f
            L_0x001b:
                java.lang.String r0 = m81969f()
            L_0x001f:
                if (r0 != 0) goto L_0x0025
            L_0x0021:
                java.lang.String r0 = m81969f()
            L_0x0025:
                r1.f95034b = r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40603d.C40608e.mo60739e():java.lang.String");
        }

        /* renamed from: f */
        private static String m81969f() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("webview_is_need_monitor", true);
            jSONObject.put("webview_classes", new JSONArray());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("bid", "ies");
            jSONObject.put("commonReportConfig", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("interval", 8000L);
            jSONObject3.put("FPSMonitor", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("interval", 8000L);
            jSONObject3.put("MemoryMonitor", jSONObject5);
            jSONObject.put("apmReportConfig", jSONObject3);
            JSONObject jSONObject6 = new JSONObject();
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("interval", 10L);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("DOMContentLoaded");
            jSONObject7.put("checkPoint", jSONArray);
            jSONObject6.put("PerformanceMonitor", jSONObject7);
            jSONObject.put("performanceReportConfig", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("ignore", new JSONArray());
            jSONObject8.put("StaticErrorMonitor", jSONObject9);
            jSONObject.put("errorMsgReportConfig", jSONObject8);
            JSONObject jSONObject10 = new JSONObject();
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("slowSession", 8000L);
            jSONObject11.put("sampleRate", 0.1d);
            jSONObject10.put("StaticPerformanceMonitor", jSONObject11);
            jSONObject.put("resourceTimingReportConfig", jSONObject10);
            String jSONObject12 = jSONObject.toString();
            C89219l.m154716b(jSONObject12, "");
            return jSONObject12;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40608e(C40603d dVar) {
            this.f95033a = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.d$c */
    static final class C40606c extends AbstractC89220m implements AbstractC89171a<List<String>> {

        /* renamed from: a */
        final /* synthetic */ C40603d f95032a;

        static {
            Covode.recordClassIndex(48446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40606c(C40603d dVar) {
            super(0);
            this.f95032a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<String> invoke() {
            List<String> perfMonitorRegexList;
            HybridMonitorConfig a = C40603d.m81955a();
            if (a == null || (perfMonitorRegexList = a.getPerfMonitorRegexList()) == null) {
                return new ArrayList();
            }
            return perfMonitorRegexList;
        }
    }

    static {
        Covode.recordClassIndex(48443);
    }

    /* renamed from: a */
    public static HybridMonitorConfig m81955a() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            return iESSettingsProxy.getHybridMonitorConfig();
        } catch (C16041a e) {
            e.printStackTrace();
            return null;
        }
    }

    private C40603d() {
        C40609f fVar = new C40609f(this);
        this.f95028j = fVar;
        this.f95021a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(fVar);
        this.f95022b = new ArrayList();
        this.f95024d = new LinkedHashMap();
        this.f95029k = new ConcurrentHashMap<>();
        this.f95025e = new C89350l("Chrome/(\\d+.\\d+.\\d+.\\d+)");
        this.f95030l = C89250i.m154774a(EnumC89331m.NONE, new C40606c(this));
        this.f95026f = new C40607d();
        this.f95027g = new C40608e(this);
    }

    public /* synthetic */ C40603d(byte b) {
        this();
    }

    /* renamed from: b */
    public final boolean mo69761b(String str) {
        C89219l.m154721d(str, "");
        if (!this.f95024d.containsKey(str)) {
            return false;
        }
        C34337k remove = this.f95024d.remove(str);
        if (remove != null) {
            remove.mo60719b();
        }
        this.f95022b.remove(str);
        return true;
    }

    /* renamed from: a */
    private boolean m81960a(Uri uri) {
        C89219l.m154721d(uri, "");
        try {
            if (!uri.getBooleanQueryParameter("monitor_enabled", false)) {
                String uri2 = uri.toString();
                C89219l.m154716b(uri2, "");
                for (String str : (List) this.f95030l.getValue()) {
                    if (new C89350l(str).containsMatchIn(uri2)) {
                    }
                }
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final C34337k mo69759a(boolean z) {
        C34337k kVar = new C34337k(this.f95026f, this.f95027g);
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        kVar.mo60718a(uuid, z);
        this.f95024d.put(kVar.bF_(), kVar);
        this.f95022b.add(kVar.bF_());
        return kVar;
    }

    /* renamed from: a */
    public final boolean mo69760a(String str) {
        C89219l.m154721d(str, "");
        try {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            return m81960a(parse);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.d$f */
    static final class C40609f implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ C40603d f95038a;

        static {
            Covode.recordClassIndex(48449);
        }

        C40609f(C40603d dVar) {
            this.f95038a = dVar;
        }

        public final void uncaughtException(Thread thread, Throwable th) {
            C89219l.m154721d(thread, "");
            C89219l.m154721d(th, "");
            th.getCause();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f95038a.f95021a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m81959a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = jSONObject2;
        JSONObject jSONObject4 = jSONObject;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C34300ac.f81134a.getValue();
        String valueOf = String.valueOf(C17867d.f42590n);
        AbstractC34358z zVar = this.f95026f;
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        jSONObject4.put("trigger", str2);
        C89219l.m154721d(valueOf, "");
        C89219l.m154721d(zVar, "");
        C89219l.m154721d(str, "");
        try {
            AbstractC11902c b = C11934d.m21048b();
            AbstractC11900b.C11901a aVar = new AbstractC11900b.C11901a();
            AbstractC11903d b2 = C11935e.m21050b();
            b2.mo19111a("mt");
            aVar.f28458b = b2;
            C34325h hVar = C34325h.f81177c;
            ((AbstractC11933c) hVar).f28550a = valueOf;
            hVar.f81179b = zVar;
            aVar.f28457a = hVar;
            b.mo19109a(aVar);
            AbstractC11902c b3 = C11934d.m21048b();
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            b3.mo19110a("", str, jSONObject4, jSONObject3, new JSONObject());
        } catch (Exception e) {
            e.printStackTrace();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("stateless", "true");
            linkedHashMap.put("eventName", str);
            zVar.mo60804a(e, "hybrid report failed", linkedHashMap);
        }
    }

    /* renamed from: a */
    public static void m81957a(AbstractC34346s sVar, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (sVar != null) {
            sVar.mo60779a(str, str2, jSONObject, jSONObject2, jSONObject3);
        }
    }
}
