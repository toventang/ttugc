package com.bytedance.ies.xbridge.p1322j.p1324b;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.common.utility.p907b.C13590c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p983b.C14621d;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.EnumC18805o;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import com.bytedance.ies.xbridge.base.runtime.p1293b.C18429c;
import com.bytedance.ies.xbridge.base.runtime.p1293b.EnumC18434f;
import com.bytedance.ies.xbridge.base.runtime.p1295d.AbstractC18439a;
import com.bytedance.ies.xbridge.base.runtime.p1295d.AbstractC18440b;
import com.bytedance.ies.xbridge.base.runtime.p1295d.C18442d;
import com.bytedance.ies.xbridge.base.runtime.p1295d.C18446f;
import com.bytedance.ies.xbridge.base.runtime.p1295d.C18448g;
import com.bytedance.ies.xbridge.p1322j.p1323a.AbstractC18634b;
import com.bytedance.ies.xbridge.p1322j.p1325c.C18655b;
import com.bytedance.ies.xbridge.p1322j.p1325c.C18657c;
import com.bytedance.ies.xbridge.p1349o.C18809c;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.bytedance.ies.xbridge.j.b.b */
public final class C18640b extends AbstractC18634b {

    /* renamed from: a */
    public static String f44388a = C18640b.class.getSimpleName();

    /* renamed from: b */
    public static final C18641a f44389b = new C18641a((byte) 0);

    /* renamed from: com.bytedance.ies.xbridge.j.b.b$b */
    public enum EnumC18642b {
        GET("get"),
        POST(UGCMonitor.TYPE_POST),
        PUT("put"),
        DELETE("delete"),
        UNSUPPORTED("unsupported");
        
        public static final C18643a Companion = new C18643a((byte) 0);

        /* renamed from: b */
        private final String f44391b;

        /* renamed from: com.bytedance.ies.xbridge.j.b.b$b$a */
        public static final class C18643a {
            static {
                Covode.recordClassIndex(21337);
            }

            private C18643a() {
            }

            public /* synthetic */ C18643a(byte b) {
                this();
            }

            /* renamed from: a */
            public static EnumC18642b m34627a(String str) {
                if (str == null) {
                    return EnumC18642b.UNSUPPORTED;
                }
                try {
                    Locale locale = Locale.ROOT;
                    C89219l.m154709a((Object) locale, "");
                    String upperCase = str.toUpperCase(locale);
                    C89219l.m154709a((Object) upperCase, "");
                    return EnumC18642b.valueOf(upperCase);
                } catch (Exception unused) {
                    return EnumC18642b.UNSUPPORTED;
                }
            }
        }

        public final String getMethod() {
            return this.f44391b;
        }

        static {
            Covode.recordClassIndex(21336);
        }

        private EnumC18642b(String str) {
            this.f44391b = str;
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.j.b.b$a */
    public static final class C18641a {
        static {
            Covode.recordClassIndex(21335);
        }

        private C18641a() {
        }

        public /* synthetic */ C18641a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.j.b.b$c */
    static final class RunnableC18644c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C18640b f44392a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18754n f44393b;

        /* renamed from: c */
        final /* synthetic */ C18655b f44394c;

        /* renamed from: d */
        final /* synthetic */ AbstractC18754n f44395d;

        /* renamed from: e */
        final /* synthetic */ EnumC18483e f44396e;

        /* renamed from: f */
        final /* synthetic */ AbstractC18634b.AbstractC18635a f44397f;

        /* renamed from: g */
        final /* synthetic */ EnumC18642b f44398g;

        /* renamed from: h */
        final /* synthetic */ Object f44399h;

        /* renamed from: i */
        final /* synthetic */ String f44400i;

        static {
            Covode.recordClassIndex(21338);
        }

        RunnableC18644c(C18640b bVar, AbstractC18754n nVar, C18655b bVar2, AbstractC18754n nVar2, EnumC18483e eVar, AbstractC18634b.AbstractC18635a aVar, EnumC18642b bVar3, Object obj, String str) {
            this.f44392a = bVar;
            this.f44393b = nVar;
            this.f44394c = bVar2;
            this.f44395d = nVar2;
            this.f44396e = eVar;
            this.f44397f = aVar;
            this.f44398g = bVar3;
            this.f44399h = obj;
            this.f44400i = str;
        }

        /* renamed from: com.bytedance.ies.xbridge.j.b.b$c$b */
        public static final class C18646b implements AbstractC18440b {

            /* renamed from: a */
            final /* synthetic */ RunnableC18644c f44404a;

            static {
                Covode.recordClassIndex(21340);
            }

            /* renamed from: com.bytedance.ies.xbridge.j.b.b$c$b$a */
            static final class RunnableC18647a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C18646b f44405a;

                static {
                    Covode.recordClassIndex(21341);
                }

                RunnableC18647a(C18646b bVar) {
                    this.f44405a = bVar;
                }

                public final void run() {
                    this.f44405a.f44404a.f44397f.mo29693a(0, "connection failed", null);
                }
            }

            /* renamed from: com.bytedance.ies.xbridge.j.b.b$c$b$b */
            static final class RunnableC18648b implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C18646b f44406a;

                /* renamed from: b */
                final /* synthetic */ String f44407b;

                static {
                    Covode.recordClassIndex(21342);
                }

                RunnableC18648b(C18646b bVar, String str) {
                    this.f44406a = bVar;
                    this.f44407b = str;
                }

                public final void run() {
                    AbstractC18634b.AbstractC18635a aVar = this.f44406a.f44404a.f44397f;
                    String str = this.f44407b;
                    if (str == null) {
                        str = "body is null";
                    }
                    aVar.mo29693a(0, str, null);
                }
            }

            /* renamed from: com.bytedance.ies.xbridge.j.b.b$c$b$d */
            static final class RunnableC18650d implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C18646b f44412a;

                /* renamed from: b */
                final /* synthetic */ Exception f44413b;

                static {
                    Covode.recordClassIndex(21344);
                }

                RunnableC18650d(C18646b bVar, Exception exc) {
                    this.f44412a = bVar;
                    this.f44413b = exc;
                }

                public final void run() {
                    AbstractC18634b.AbstractC18635a aVar = this.f44412a.f44404a.f44397f;
                    String message = this.f44413b.getMessage();
                    if (message == null) {
                        message = "get data from stream exception";
                    }
                    aVar.mo29693a(0, message, null);
                }
            }

            /* renamed from: com.bytedance.ies.xbridge.j.b.b$c$b$c */
            static final class RunnableC18649c implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C18646b f44408a;

                /* renamed from: b */
                final /* synthetic */ int f44409b;

                /* renamed from: c */
                final /* synthetic */ LinkedHashMap f44410c;

                /* renamed from: d */
                final /* synthetic */ String f44411d;

                static {
                    Covode.recordClassIndex(21343);
                }

                RunnableC18649c(C18646b bVar, int i, LinkedHashMap linkedHashMap, String str) {
                    this.f44408a = bVar;
                    this.f44409b = i;
                    this.f44410c = linkedHashMap;
                    this.f44411d = str;
                }

                public final void run() {
                    AbstractC18634b.AbstractC18635a aVar = this.f44408a.f44404a.f44397f;
                    C18657c cVar = new C18657c();
                    cVar.f44432a = Integer.valueOf(this.f44409b);
                    cVar.f44433b = this.f44410c;
                    cVar.f44434c = this.f44411d;
                    cVar.f44436e = "base64";
                    aVar.mo29694a(cVar, "");
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C18646b(RunnableC18644c cVar) {
                this.f44404a = cVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:57:0x00cb A[Catch:{ IOException -> 0x00d7 }] */
            /* JADX WARNING: Removed duplicated region for block: B:59:0x00d0 A[Catch:{ IOException -> 0x00d7 }] */
            /* JADX WARNING: Removed duplicated region for block: B:64:0x00df  */
            /* JADX WARNING: Removed duplicated region for block: B:70:0x00e9 A[Catch:{ IOException -> 0x00f2 }] */
            /* JADX WARNING: Removed duplicated region for block: B:72:0x00ee A[Catch:{ IOException -> 0x00f2 }] */
            @Override // com.bytedance.ies.xbridge.base.runtime.p1295d.AbstractC18440b
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo29474a(com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18427a r11) {
                /*
                // Method dump skipped, instructions count: 250
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.p1322j.p1324b.C18640b.RunnableC18644c.C18646b.mo29474a(com.bytedance.ies.xbridge.base.runtime.b.a):void");
            }
        }

        public final void run() {
            String str;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            LinkedHashMap<String, String> a = C18442d.m34305a(this.f44393b);
            if (a.containsKey("content-type")) {
                str = a.get("content-type");
            } else if (a.containsKey("Content-Type")) {
                str = a.get("Content-Type");
            } else {
                str = null;
            }
            String a2 = C18442d.m34304a(this.f44394c.mo29705a(), this.f44395d, this.f44396e);
            C18645a aVar = new C18645a(this);
            C18646b bVar = new C18646b(this);
            String method = this.f44398g.getMethod();
            String str2 = "application/x-www-form-urlencoded";
            switch (method.hashCode()) {
                case -1335458389:
                    if (method.equals("delete")) {
                        IHostNetworkDepend a3 = this.f44392a.mo29696a();
                        C89219l.m154719c(a2, "");
                        C89219l.m154719c(a, "");
                        C89219l.m154719c(aVar, "");
                        C89219l.m154719c(a3, "");
                        C18429c a4 = new C18429c(a2).mo29466a(a);
                        a4.f44040b = true;
                        C89219l.m154719c(a3, "");
                        C18442d.m34306a(C18448g.m34311a(EnumC18434f.DELETE, a4, a3), aVar);
                        return;
                    }
                    return;
                case 102230:
                    if (method.equals("get")) {
                        IHostNetworkDepend a5 = this.f44392a.mo29696a();
                        C89219l.m154719c(a2, "");
                        C89219l.m154719c(a, "");
                        C89219l.m154719c(aVar, "");
                        C89219l.m154719c(a5, "");
                        C18429c a6 = new C18429c(a2).mo29466a(a);
                        a6.f44040b = true;
                        C89219l.m154719c(a5, "");
                        C18442d.m34306a(C18448g.m34311a(EnumC18434f.GET, a6, a5), aVar);
                        return;
                    }
                    return;
                case 111375:
                    if (method.equals("put")) {
                        Object obj = this.f44399h;
                        if (obj != null) {
                            jSONObject = C18809c.m34905a((AbstractC18754n) obj);
                        } else {
                            jSONObject = new JSONObject();
                        }
                        if (str == null) {
                            str = str2;
                        }
                        IHostNetworkDepend a7 = this.f44392a.mo29696a();
                        C89219l.m154719c(a2, "");
                        C89219l.m154719c(a, "");
                        C89219l.m154719c(str, "");
                        C89219l.m154719c(jSONObject, "");
                        C89219l.m154719c(aVar, "");
                        C89219l.m154719c(a7, "");
                        C18429c a8 = new C18429c(a2).mo29466a(a).mo29465a(str);
                        a8.f44040b = true;
                        String jSONObject3 = jSONObject.toString();
                        C89219l.m154709a((Object) jSONObject3, "");
                        Charset forName = Charset.forName("UTF-8");
                        C89219l.m154709a((Object) forName, "");
                        if (jSONObject3 != null) {
                            byte[] bytes = jSONObject3.getBytes(forName);
                            C89219l.m154709a((Object) bytes, "");
                            a8.f44042d = bytes;
                            C89219l.m154719c(a7, "");
                            C18442d.m34306a(C18448g.m34311a(EnumC18434f.PUT, a8, a7), aVar);
                            return;
                        }
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                    return;
                case 3446944:
                    if (method.equals(UGCMonitor.TYPE_POST)) {
                        if (str != null) {
                            str2 = str;
                        }
                        a.put("Content-Type", str2);
                        Object obj2 = this.f44399h;
                        if (!(obj2 instanceof String)) {
                            if (obj2 == null) {
                                jSONObject2 = new JSONObject();
                            } else if (obj2 instanceof AbstractC18700m) {
                                String jSONArray = C18809c.m34904a((AbstractC18700m) obj2).toString();
                                C89219l.m154709a((Object) jSONArray, "");
                                Charset charset = C89338d.f202990a;
                                if (jSONArray != null) {
                                    byte[] bytes2 = jSONArray.getBytes(charset);
                                    C89219l.m154709a((Object) bytes2, "");
                                    C18442d.m34309a(a2, a, str2, bytes2, aVar, this.f44392a.mo29696a());
                                    return;
                                }
                                throw new C89388w("null cannot be cast to non-null type");
                            } else {
                                jSONObject2 = C18809c.m34905a((AbstractC18754n) obj2);
                            }
                            C18442d.m34308a(a2, a, str2, jSONObject2, aVar, this.f44392a.mo29696a());
                            return;
                        } else if (C89219l.m154714a((Object) this.f44400i, (Object) "base64")) {
                            byte[] decode = Base64.decode((String) this.f44399h, 0);
                            C89219l.m154709a((Object) decode, "");
                            IHostNetworkDepend a9 = this.f44392a.mo29696a();
                            C89219l.m154719c(a2, "");
                            C89219l.m154719c(a, "");
                            C89219l.m154719c(str2, "");
                            C89219l.m154719c(decode, "");
                            C89219l.m154719c(bVar, "");
                            C89219l.m154719c(a9, "");
                            try {
                                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                                linkedHashMap.putAll(a);
                                C18429c a10 = new C18429c(a2).mo29466a(linkedHashMap).mo29465a(str2);
                                a10.f44040b = true;
                                a10.f44042d = decode;
                                C89219l.m154719c(a9, "");
                                bVar.mo29474a(C18448g.m34313b(EnumC18434f.POST, a10, a9));
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        } else {
                            String str3 = (String) this.f44399h;
                            Charset charset2 = C89338d.f202990a;
                            if (str3 != null) {
                                byte[] bytes3 = str3.getBytes(charset2);
                                C89219l.m154709a((Object) bytes3, "");
                                C18442d.m34309a(a2, a, str2, bytes3, aVar, this.f44392a.mo29696a());
                                return;
                            }
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }

        /* renamed from: com.bytedance.ies.xbridge.j.b.b$c$a */
        public static final class C18645a implements AbstractC18439a {

            /* renamed from: a */
            public final String f44401a;

            /* renamed from: b */
            public final String f44402b;

            /* renamed from: c */
            final /* synthetic */ RunnableC18644c f44403c;

            static {
                Covode.recordClassIndex(21339);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C18645a(RunnableC18644c cVar) {
                this.f44403c = cVar;
                this.f44401a = cVar.f44394c.mo29706b();
                this.f44402b = cVar.f44394c.mo29705a();
            }

            @Override // com.bytedance.ies.xbridge.base.runtime.p1295d.AbstractC18439a
            /* renamed from: a */
            public final void mo29472a(Integer num, Throwable th) {
                int i;
                int i2;
                int i3;
                C89219l.m154719c(th, "");
                if (th instanceof C14621d) {
                    i = -1001;
                } else {
                    i = 0;
                }
                C18640b bVar = this.f44403c.f44392a;
                String str = this.f44401a;
                String str2 = this.f44402b;
                if (num == null) {
                    i2 = -408;
                } else {
                    i2 = num;
                }
                bVar.mo29697b(str, str2, i2, i, th.toString(), this.f44403c.f44396e.name());
                AbstractC18634b.AbstractC18635a aVar = this.f44403c.f44397f;
                C18657c cVar = new C18657c();
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = -408;
                }
                cVar.f44432a = Integer.valueOf(i3);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (num == null) {
                    num = -408;
                }
                linkedHashMap.put("errCode", num);
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                linkedHashMap.put("message", message);
                linkedHashMap.put("prompts", "");
                cVar.f44434c = linkedHashMap;
                aVar.mo29693a(i, "", cVar);
            }

            @Override // com.bytedance.ies.xbridge.base.runtime.p1295d.AbstractC18439a
            /* renamed from: a */
            public final void mo29473a(JSONObject jSONObject, LinkedHashMap<String, String> linkedHashMap, Integer num) {
                int i;
                String str = "";
                C89219l.m154719c(jSONObject, str);
                C89219l.m154719c(linkedHashMap, str);
                AbstractC18634b.AbstractC18635a aVar = this.f44403c.f44397f;
                C18657c cVar = new C18657c();
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                cVar.f44432a = Integer.valueOf(i);
                cVar.f44433b = linkedHashMap;
                try {
                    String str2 = linkedHashMap.get("x-tt-logid");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator<String> keys = jSONObject.keys();
                    C89219l.m154709a((Object) keys, str);
                    while (keys.hasNext()) {
                        String next = keys.next();
                        C89219l.m154709a((Object) next, str);
                        Object obj = jSONObject.get(next);
                        C89219l.m154709a(obj, str);
                        linkedHashMap2.put(next, obj);
                    }
                    if (str2 != null) {
                        str = str2;
                    }
                    linkedHashMap2.put("_Header_RequestID", str);
                    cVar.f44434c = linkedHashMap2;
                } catch (Throwable unused) {
                }
                aVar.mo29694a(cVar, "");
            }

            @Override // com.bytedance.ies.xbridge.base.runtime.p1295d.AbstractC18439a
            /* renamed from: a */
            public final C89391z mo29471a(JSONObject jSONObject, LinkedHashMap<String, String> linkedHashMap, String str, Throwable th, Integer num) {
                int i;
                String str2 = "";
                C89219l.m154719c(jSONObject, str2);
                C89219l.m154719c(linkedHashMap, str2);
                C89219l.m154719c(str, str2);
                C89219l.m154719c(th, str2);
                this.f44403c.f44392a.mo29697b(this.f44401a, this.f44402b, num, 0, th.toString(), this.f44403c.f44396e.name());
                AbstractC18634b.AbstractC18635a aVar = this.f44403c.f44397f;
                String th2 = th.toString();
                C18657c cVar = new C18657c();
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                cVar.f44432a = Integer.valueOf(i);
                cVar.f44433b = linkedHashMap;
                try {
                    String str3 = linkedHashMap.get("x-tt-logid");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator<String> keys = jSONObject.keys();
                    C89219l.m154709a((Object) keys, str2);
                    while (keys.hasNext()) {
                        String next = keys.next();
                        C89219l.m154709a((Object) next, str2);
                        Object obj = jSONObject.get(next);
                        C89219l.m154709a(obj, str2);
                        linkedHashMap2.put(next, obj);
                    }
                    if (str3 != null) {
                        str2 = str3;
                    }
                    linkedHashMap2.put("_Header_RequestID", str2);
                    cVar.f44434c = linkedHashMap2;
                } catch (Throwable unused) {
                }
                cVar.f44435d = str;
                aVar.mo29693a(0, th2, cVar);
                return C89391z.f203057a;
            }
        }
    }

    static {
        Covode.recordClassIndex(21334);
    }

    /* renamed from: a */
    public final IHostNetworkDepend mo29696a() {
        IHostNetworkDepend iHostNetworkDepend;
        IHostNetworkDepend iHostNetworkDepend2;
        C18465b bVar = (C18465b) mo29616a(C18465b.class);
        if (bVar != null && (iHostNetworkDepend2 = bVar.f44106i) != null) {
            return iHostNetworkDepend2;
        }
        C18465b bVar2 = C18465b.f44096l;
        if (bVar2 == null || (iHostNetworkDepend = bVar2.f44106i) == null) {
            return new C18446f();
        }
        return iHostNetworkDepend;
    }

    /* renamed from: g */
    private final ExecutorService m34623g() {
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        ExecutorService normalThreadExecutor;
        C18465b bVar;
        C18465b bVar2 = (C18465b) mo29616a(C18465b.class);
        if (((bVar2 != null && (iHostThreadPoolExecutorDepend = bVar2.f44108k) != null) || ((bVar = C18465b.f44096l) != null && (iHostThreadPoolExecutorDepend = bVar.f44108k) != null)) && (normalThreadExecutor = iHostThreadPoolExecutorDepend.getNormalThreadExecutor()) != null) {
            return normalThreadExecutor;
        }
        ExecutorService a = C13590c.m24421a();
        C89219l.m154709a((Object) a, "");
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xbridge.j.b.b$d */
    public static final class RunnableC18651d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C18640b f44414a;

        /* renamed from: b */
        final /* synthetic */ String f44415b;

        /* renamed from: c */
        final /* synthetic */ String f44416c;

        /* renamed from: d */
        final /* synthetic */ Integer f44417d;

        /* renamed from: e */
        final /* synthetic */ int f44418e;

        /* renamed from: f */
        final /* synthetic */ String f44419f;

        /* renamed from: g */
        final /* synthetic */ String f44420g;

        static {
            Covode.recordClassIndex(21345);
        }

        RunnableC18651d(C18640b bVar, String str, String str2, Integer num, int i, String str3, String str4) {
            this.f44414a = bVar;
            this.f44415b = str;
            this.f44416c = str2;
            this.f44417d = num;
            this.f44418e = i;
            this.f44419f = str3;
            this.f44420g = str4;
        }

        public final void run() {
            int i;
            IHostLogDepend iHostLogDepend;
            C18465b bVar;
            try {
                C89378p[] pVarArr = new C89378p[6];
                pVarArr[0] = C89387v.m154943a("method", this.f44415b);
                pVarArr[1] = C89387v.m154943a("url", this.f44416c);
                Integer num = this.f44417d;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                pVarArr[2] = C89387v.m154943a("statusCode", Integer.valueOf(i));
                pVarArr[3] = C89387v.m154943a("requestErrorCode", Integer.valueOf(this.f44418e));
                pVarArr[4] = C89387v.m154943a("requestErrorMsg", this.f44419f);
                pVarArr[5] = C89387v.m154943a("platform", this.f44420g);
                Map<String, ? extends Object> b = C89041ag.m154427b(pVarArr);
                C18465b bVar2 = (C18465b) this.f44414a.mo29616a(C18465b.class);
                C89391z zVar = null;
                if (!((bVar2 == null || (iHostLogDepend = bVar2.f44099b) == null) && ((bVar = C18465b.f44096l) == null || (iHostLogDepend = bVar.f44099b) == null))) {
                    zVar = iHostLogDepend.reportJSBFetchError(this.f44414a.f44109d, b);
                }
                C89379q.m157068constructorimpl(zVar);
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
    }

    @Override // com.bytedance.ies.xbridge.p1322j.p1323a.AbstractC18634b
    /* renamed from: a */
    public final void mo29691a(C18655b bVar, AbstractC18634b.AbstractC18635a aVar, EnumC18483e eVar) {
        Object obj;
        EnumC18805o a;
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        EnumC18642b a2 = EnumC18642b.C18643a.m34627a(bVar.mo29706b());
        if (a2 == EnumC18642b.UNSUPPORTED) {
            mo29697b(bVar.mo29706b(), bVar.mo29705a(), 0, -3, "Illegal method " + bVar.mo29706b(), eVar.name());
            aVar.mo29693a(-3, "Illegal method " + bVar.mo29706b(), null);
            return;
        }
        AbstractC18754n nVar = bVar.f44430f;
        Object obj2 = bVar.f44427c;
        String str = bVar.f44428d;
        boolean z = obj2 instanceof AbstractC18659k;
        Object obj3 = null;
        if (!z) {
            obj = null;
        } else {
            obj = obj2;
        }
        AbstractC18659k kVar = (AbstractC18659k) obj;
        if (!(kVar == null || (a = kVar.mo29707a()) == null)) {
            int i = C18652c.f44421a[a.ordinal()];
            if (i == 1) {
                if (!z) {
                    obj2 = null;
                }
                AbstractC18659k kVar2 = (AbstractC18659k) obj2;
                if (kVar2 != null) {
                    obj3 = kVar2.mo29713g();
                }
            } else if (i == 2) {
                if (!z) {
                    obj2 = null;
                }
                AbstractC18659k kVar3 = (AbstractC18659k) obj2;
                if (kVar3 != null) {
                    obj3 = kVar3.mo29711e();
                }
            } else if (i == 3) {
                if (!z) {
                    obj2 = null;
                }
                AbstractC18659k kVar4 = (AbstractC18659k) obj2;
                if (kVar4 != null) {
                    obj3 = kVar4.mo29712f();
                }
            }
        }
        AbstractC18754n nVar2 = bVar.f44429e;
        if (TextUtils.isEmpty(bVar.mo29705a())) {
            mo29697b(bVar.mo29706b(), bVar.mo29705a(), 0, -3, "Illegal empty url", eVar.name());
            aVar.mo29693a(-3, "url is empty", null);
            return;
        }
        m34623g().execute(new RunnableC18644c(this, nVar, bVar, nVar2, eVar, aVar, a2, obj3, str));
    }

    /* renamed from: b */
    public final void mo29697b(String str, String str2, Integer num, int i, String str3, String str4) {
        m34623g().execute(new RunnableC18651d(this, str, str2, num, i, str3, str4));
    }
}
