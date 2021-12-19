package com.bytedance.ies.xbridge.base.runtime.p1295d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18687l;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.p1293b.AbstractC18428b;
import com.bytedance.ies.xbridge.base.runtime.p1293b.C18429c;
import com.bytedance.ies.xbridge.base.runtime.p1293b.C18430d;
import com.bytedance.ies.xbridge.base.runtime.p1294c.C18437a;
import com.bytedance.ies.xbridge.p1349o.C18809c;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.base.runtime.d.d */
public final class C18442d {

    /* renamed from: a */
    public static final C18442d f44061a = new C18442d();

    /* renamed from: b */
    private static String f44062b = C18442d.class.getSimpleName();

    private C18442d() {
    }

    static {
        Covode.recordClassIndex(21116);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xbridge.base.runtime.d.d$a */
    public static final class RunnableC18443a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC18439a f44063a;

        /* renamed from: b */
        final /* synthetic */ Integer f44064b;

        /* renamed from: c */
        final /* synthetic */ Throwable f44065c;

        /* renamed from: d */
        final /* synthetic */ String f44066d;

        static {
            Covode.recordClassIndex(21117);
        }

        RunnableC18443a(AbstractC18439a aVar, Integer num, Throwable th, String str) {
            this.f44063a = aVar;
            this.f44064b = num;
            this.f44065c = th;
            this.f44066d = str;
        }

        public final void run() {
            try {
                AbstractC18439a aVar = this.f44063a;
                Integer num = this.f44064b;
                Throwable th = this.f44065c;
                if (th == null) {
                    th = new Throwable(this.f44066d);
                }
                aVar.mo29472a(num, th);
                C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th2) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xbridge.base.runtime.d.d$b */
    public static final class RunnableC18444b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f44067a;

        /* renamed from: b */
        final /* synthetic */ LinkedHashMap f44068b;

        /* renamed from: c */
        final /* synthetic */ AbstractC18439a f44069c;

        /* renamed from: d */
        final /* synthetic */ Integer f44070d;

        static {
            Covode.recordClassIndex(21118);
        }

        RunnableC18444b(String str, LinkedHashMap linkedHashMap, AbstractC18439a aVar, Integer num) {
            this.f44067a = str;
            this.f44068b = linkedHashMap;
            this.f44069c = aVar;
            this.f44070d = num;
        }

        public final void run() {
            C89391z zVar;
            JSONObject jSONObject;
            String str;
            try {
                jSONObject = new JSONObject(this.f44067a);
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
                return;
            }
            this.f44069c.mo29473a(jSONObject, this.f44068b, this.f44070d);
            zVar = C89391z.f203057a;
            C89379q.m157068constructorimpl(zVar);
        }
    }

    /* renamed from: a */
    public static LinkedHashMap<String, String> m34305a(AbstractC18754n nVar) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (nVar != null) {
            AbstractC18687l a = nVar.mo29756a();
            while (a.mo29723a()) {
                String b = a.mo29724b();
                String str = C18586i.m34539a(nVar, b, "");
                if (str.length() > 0 && str != null) {
                    linkedHashMap.put(b, str);
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static void m34306a(AbstractC18428b bVar, AbstractC18439a aVar) {
        if (bVar == null) {
            m34310a((Integer) -408, "connection failed", (Throwable) null, aVar);
            return;
        }
        String a = bVar.mo29459a();
        if (a == null || a.length() <= 0) {
            if (!m34310a(bVar.mo29461c(), bVar.mo29462d(), bVar.mo29463e(), aVar)) {
                m34307a((String) null, bVar.mo29460b(), bVar.mo29461c(), aVar);
            }
        } else if (!m34310a(bVar.mo29461c(), bVar.mo29462d(), bVar.mo29463e(), aVar)) {
            m34307a(a, bVar.mo29460b(), bVar.mo29461c(), aVar);
        }
    }

    /* renamed from: a */
    public static String m34304a(String str, AbstractC18754n nVar, EnumC18483e eVar) {
        String str2 = "";
        C89219l.m154719c(str, str2);
        C89219l.m154719c(eVar, str2);
        C18430d dVar = new C18430d(str);
        if (nVar != null) {
            AbstractC18687l a = nVar.mo29756a();
            while (a.mo29723a()) {
                String b = a.mo29724b();
                AbstractC18659k i = nVar.mo29766i(b);
                switch (C18445e.f44072b[i.mo29707a().ordinal()]) {
                    case 1:
                        dVar.mo29468a(b, String.valueOf(i.mo29710d()));
                        break;
                    case 2:
                        dVar.mo29468a(b, String.valueOf(i.mo29709c()));
                        break;
                    case 3:
                        dVar.mo29468a(b, i.mo29711e());
                        break;
                    case 4:
                        dVar.mo29468a(b, String.valueOf(i.mo29708b()));
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        AbstractC18754n g = i.mo29713g();
                        if (g == null) {
                            C89219l.m154707a();
                        }
                        String jSONObject = C18809c.m34905a(g).toString();
                        C89219l.m154709a((Object) jSONObject, str2);
                        dVar.mo29468a(b, jSONObject);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        AbstractC18700m f = i.mo29712f();
                        if (f == null) {
                            C89219l.m154707a();
                        }
                        String jSONArray = C18809c.m34904a(f).toString();
                        C89219l.m154709a((Object) jSONArray, str2);
                        dVar.mo29468a(b, jSONArray);
                        break;
                }
            }
        }
        if (eVar == EnumC18483e.WEB) {
            str2 = "h5";
        } else if (eVar == EnumC18483e.LYNX) {
            str2 = "lynx";
        }
        dVar.mo29468a("request_tag_from", str2);
        dVar.mo29469a();
        return dVar.mo29469a();
    }

    /* renamed from: a */
    private static void m34307a(String str, LinkedHashMap<String, String> linkedHashMap, Integer num, AbstractC18439a aVar) {
        C18437a.m34297a().post(new RunnableC18444b(str, linkedHashMap, aVar, num));
    }

    /* renamed from: a */
    private static boolean m34310a(Integer num, String str, Throwable th, AbstractC18439a aVar) {
        if (th == null && TextUtils.isEmpty(str)) {
            return false;
        }
        if ((str == null || str.length() <= 0) && (th == null || (str = th.getMessage()) == null)) {
            str = "";
        }
        C18437a.m34297a().post(new RunnableC18443a(aVar, num, th, str));
        return true;
    }

    /* renamed from: a */
    public static void m34308a(String str, Map<String, String> map, String str2, JSONObject jSONObject, AbstractC18439a aVar, IHostNetworkDepend iHostNetworkDepend) {
        AbstractC18428b bVar;
        C89219l.m154719c(str, "");
        C89219l.m154719c(map, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(jSONObject, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(iHostNetworkDepend, "");
        try {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.putAll(map);
            if (C89219l.m154714a((Object) str2, (Object) "application/json")) {
                C18429c a = new C18429c(str).mo29466a(linkedHashMap).mo29465a(str2);
                a.f44040b = true;
                String jSONObject2 = jSONObject.toString();
                C89219l.m154709a((Object) jSONObject2, "");
                Charset forName = Charset.forName("UTF-8");
                C89219l.m154709a((Object) forName, "");
                if (jSONObject2 != null) {
                    byte[] bytes = jSONObject2.getBytes(forName);
                    C89219l.m154709a((Object) bytes, "");
                    a.f44042d = bytes;
                    bVar = a.mo29464a(iHostNetworkDepend);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next, "");
                    C89219l.m154709a((Object) next, "");
                    C89219l.m154709a((Object) optString, "");
                    linkedHashMap2.put(next, optString);
                }
                C18429c a2 = new C18429c(str).mo29466a(linkedHashMap).mo29467a((Map<String, String>) linkedHashMap2);
                a2.f44040b = true;
                bVar = a2.mo29464a(iHostNetworkDepend);
            }
            m34306a(bVar, aVar);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m34309a(String str, Map<String, String> map, String str2, byte[] bArr, AbstractC18439a aVar, IHostNetworkDepend iHostNetworkDepend) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(map, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(bArr, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(iHostNetworkDepend, "");
        try {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.putAll(map);
            C18429c a = new C18429c(str).mo29466a(linkedHashMap).mo29465a(str2);
            a.f44040b = true;
            a.f44042d = bArr;
            m34306a(a.mo29464a(iHostNetworkDepend), aVar);
        } catch (Throwable unused) {
        }
    }
}
