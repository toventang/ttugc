package com.p2082ss.android.ugc.aweme.web;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.falconx.p976c.C14566a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.p2282ad.settings.C33384b;
import com.p2082ss.android.ugc.aweme.p2282ad.settings.C33388f;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import com.p2082ss.android.ugc.aweme.utils.gecko.C80480a;
import com.p2082ss.android.ugc.aweme.web.p4238b.AbstractC81535a;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.web.a */
public final class C81523a extends AbstractC81535a {

    /* renamed from: d */
    public static String f182291d;

    /* renamed from: e */
    public static long f182292e;

    /* renamed from: f */
    public static String f182293f;

    /* renamed from: g */
    public static final CopyOnWriteArrayList<C81524a.C81525a> f182294g = new CopyOnWriteArrayList<>();

    /* renamed from: h */
    public static final CopyOnWriteArrayList<C81524a.C81525a> f182295h = new CopyOnWriteArrayList<>();

    /* renamed from: i */
    public static int f182296i;

    /* renamed from: j */
    public static int f182297j;

    /* renamed from: k */
    public static boolean f182298k;

    /* renamed from: l */
    public static boolean f182299l;

    /* renamed from: m */
    public static int f182300m;

    /* renamed from: n */
    public static final C81524a f182301n = new C81524a((byte) 0);

    /* renamed from: a */
    public String f182302a;

    /* renamed from: b */
    public String f182303b;

    /* renamed from: c */
    public String f182304c;

    @Override // com.p2082ss.android.ugc.aweme.web.p4238b.AbstractC81535a
    /* renamed from: a */
    public final String mo66293a() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.web.p4238b.AbstractC81535a
    /* renamed from: b */
    public final InputStream mo66294b(String str) {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.web.a$a */
    public static final class C81524a {

        /* renamed from: com.ss.android.ugc.aweme.web.a$a$b */
        public static final class C81526b {

            /* renamed from: c */
            public static final C81527a f182310c = new C81527a((byte) 0);

            /* renamed from: a */
            public final String f182311a;

            /* renamed from: b */
            public final int f182312b;

            static {
                Covode.recordClassIndex(94904);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C81526b)) {
                    return false;
                }
                C81526b bVar = (C81526b) obj;
                return C89219l.m154714a(this.f182311a, bVar.f182311a) && this.f182312b == bVar.f182312b;
            }

            public final int hashCode() {
                String str = this.f182311a;
                return ((str != null ? str.hashCode() : 0) * 31) + this.f182312b;
            }

            public final String toString() {
                return "AdWebResStatus(url=" + this.f182311a + ", status=" + this.f182312b + ")";
            }

            /* renamed from: com.ss.android.ugc.aweme.web.a$a$b$a */
            public static final class C81527a {
                static {
                    Covode.recordClassIndex(94905);
                }

                private C81527a() {
                }

                public /* synthetic */ C81527a(byte b) {
                    this();
                }

                /* renamed from: a */
                public static List<C81526b> m141378a(String str) {
                    int i;
                    if (str == null || str.length() == 0) {
                        return C89086z.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : C89361p.m154921c(str, new String[]{"$$"})) {
                        String b = C89361p.m154911b(str2, '.');
                        Integer e = C89361p.m154863e(C89361p.m154939j(str2));
                        if (e != null) {
                            i = e.intValue();
                        } else {
                            i = 0;
                        }
                        arrayList.add(new C81526b(b, i));
                    }
                    return arrayList;
                }
            }

            public C81526b(String str, int i) {
                C89219l.m154721d(str, "");
                this.f182311a = str;
                this.f182312b = i;
            }
        }

        static {
            Covode.recordClassIndex(94902);
        }

        private C81524a() {
        }

        /* renamed from: a */
        public static void m141376a() {
            C81523a.f182291d = null;
            C81523a.f182292e = 0;
            C81523a.f182293f = null;
            C81523a.f182294g.clear();
            C81523a.f182295h.clear();
            C81523a.f182296i = 0;
            C81523a.f182297j = 0;
            C81523a.f182300m = 0;
            C81523a.f182298k = false;
        }

        /* renamed from: com.ss.android.ugc.aweme.web.a$a$a */
        public static final class C81525a {

            /* renamed from: a */
            public final String f182305a;

            /* renamed from: b */
            public final String f182306b;

            /* renamed from: c */
            public final String f182307c;

            /* renamed from: d */
            public int f182308d;

            /* renamed from: e */
            public final int f182309e;

            static {
                Covode.recordClassIndex(94903);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C81525a)) {
                    return false;
                }
                C81525a aVar = (C81525a) obj;
                return C89219l.m154714a(this.f182305a, aVar.f182305a) && C89219l.m154714a(this.f182306b, aVar.f182306b) && C89219l.m154714a(this.f182307c, aVar.f182307c) && this.f182308d == aVar.f182308d && this.f182309e == aVar.f182309e;
            }

            public final int hashCode() {
                String str = this.f182305a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f182306b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f182307c;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return ((((hashCode2 + i) * 31) + this.f182308d) * 31) + this.f182309e;
            }

            public final String toString() {
                String jSONObject = new JSONObject().putOpt("url", this.f182305a).putOpt(StringSet.type, this.f182306b).putOpt("size", this.f182307c).putOpt("status", Integer.valueOf(this.f182308d)).putOpt("first_page", Integer.valueOf(this.f182309e)).toString();
                C89219l.m154716b(jSONObject, "");
                return jSONObject;
            }

            public C81525a(String str, String str2, String str3, int i, int i2) {
                C89219l.m154721d(str3, "");
                this.f182305a = str;
                this.f182306b = str2;
                this.f182307c = str3;
                this.f182308d = i;
                this.f182309e = i2;
            }
        }

        /* renamed from: b */
        public static void m141377b() {
            String g;
            String b;
            IAdLandPagePreloadService f;
            JSONObject b2;
            JSONObject optJSONObject;
            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.m68380f();
            if (!(f2 == null || (g = f2.mo59391g("feed")) == null || (b = C80333dc.m139277b(g, C81523a.f182291d)) == null || (f = AdLandPagePreloadServiceImpl.m68380f()) == null || (b2 = f.mo59383b(b)) == null)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<C81526b> a = C81526b.C81527a.m141378a(C81523a.f182293f);
                ArrayList arrayList = new ArrayList();
                for (T t : a) {
                    T t2 = t;
                    String a2 = C80480a.m139506a(t2.f182311a);
                    if (b2.has(a2)) {
                        String str = t2.f182311a;
                        C89219l.m154716b(a2, "");
                        linkedHashMap.put(str, a2);
                    } else {
                        String a3 = m141375a(t2.f182311a);
                        if (b2.has(a3)) {
                            linkedHashMap.put(a3, a3);
                        }
                    }
                    arrayList.add(t);
                }
                ArrayList<C81526b> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                for (C81526b bVar : arrayList2) {
                    arrayList3.add(C89387v.m154943a(bVar.f182311a, bVar));
                }
                Map d = C89041ag.m154431d(C89041ag.m154417a(arrayList3));
                for (T t3 : C81523a.f182294g) {
                    C81526b bVar2 = (C81526b) C89206ad.m154686h(d).remove(t3.f182305a);
                    if (bVar2 != null) {
                        t3.f182308d = bVar2.f182312b;
                    }
                }
                for (Map.Entry entry : d.entrySet()) {
                    String str2 = (String) linkedHashMap.get(entry.getKey());
                    if (!(str2 == null || (optJSONObject = b2.optJSONObject(str2)) == null)) {
                        String optString = optJSONObject.optString("fileSize");
                        CopyOnWriteArrayList<C81525a> copyOnWriteArrayList = C81523a.f182294g;
                        String a4 = C14566a.m26647a(m141375a((String) entry.getKey()));
                        C89219l.m154716b(optString, "");
                        copyOnWriteArrayList.add(new C81525a((String) entry.getKey(), a4, optString, ((C81526b) entry.getValue()).f182312b, 1));
                    }
                }
            }
        }

        public /* synthetic */ C81524a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m141375a(String str) {
            int a;
            if (TextUtils.isEmpty(str) || (a = C89361p.m154882a((CharSequence) str, '?', 0, false, 6)) == -1) {
                return str;
            }
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring = str.substring(0, a);
            C89219l.m154716b(substring, "");
            return substring;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.a$b */
    static final class C81528b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81523a f182313a;

        /* renamed from: b */
        final /* synthetic */ String f182314b;

        static {
            Covode.recordClassIndex(94906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81528b(C81523a aVar, String str) {
            super(0);
            this.f182313a = aVar;
            this.f182314b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo125254a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo125254a() {
            if (C33384b.m68468a() && this.f182314b != null && C81523a.f182299l && !C81523a.f182298k) {
                String str = this.f182314b;
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                if (!C89361p.m154874b(C89361p.m154910b((CharSequence) str).toString(), "http://", false)) {
                    String str2 = this.f182314b;
                    Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
                    if (!C89361p.m154874b(C89361p.m154910b((CharSequence) str2).toString(), "https://", false)) {
                        return;
                    }
                }
                if (C81523a.m141370d(this.f182314b)) {
                    if (C81523a.f182295h.size() > 10000) {
                        C81523a.f182295h.clear();
                        C81523a.f182297j = 0;
                    }
                    int i = C81523a.f182297j + 1;
                    C81523a.f182297j = i;
                    if (i <= C33388f.m68471a().f79341a) {
                        CopyOnWriteArrayList<C81524a.C81525a> copyOnWriteArrayList = C81523a.f182295h;
                        String str3 = this.f182314b;
                        copyOnWriteArrayList.add(new C81524a.C81525a(str3, this.f182313a.mo66295c(C81524a.m141375a(str3)), "0", 0, AdWebStatBusiness.m81872a()));
                    }
                    C81523a.f182291d = this.f182313a.f182303b;
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(94901);
    }

    /* renamed from: d */
    public static boolean m141370d(String str) {
        if (!C89361p.m154908a((CharSequence) C81524a.m141375a(str), (CharSequence) ".", false)) {
            return false;
        }
        int a = C89361p.m154885a((CharSequence) str, ".");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(a);
        C89219l.m154716b(substring, "");
        if (C89361p.m154929e((CharSequence) substring, (CharSequence) "/")) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.web.p4238b.AbstractC81535a
    /* renamed from: c */
    public final String mo66295c(String str) {
        if (str != null && (C89361p.m154876c(str, ".shtml", false) || C89361p.m154876c(str, ".do", false))) {
            return "text/html";
        }
        String c = super.mo66295c(str);
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.web.p4238b.AbstractC81535a, com.p2082ss.android.sdk.webview.C30262h.AbstractC30264a
    /* renamed from: a */
    public final WebResourceResponse mo53719a(String str) {
        String str2;
        WebResourceResponse webResourceResponse;
        JSONObject b;
        boolean z;
        MethodCollector.m26663i(6386);
        C81528b bVar = new C81528b(this, str);
        String str3 = this.f182303b;
        WebResourceResponse webResourceResponse2 = null;
        String str4 = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            bVar.mo125254a();
            MethodCollector.m26664o(6386);
            return null;
        }
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (f != null) {
            eVar.element = (T) f.mo59391g(this.f182304c);
            str2 = C80333dc.m139277b(eVar.element, str3);
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            bVar.mo125254a();
            MethodCollector.m26664o(6386);
            return null;
        }
        C81529c cVar = new C81529c(this, str, str2, eVar, str3);
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.m68380f();
        boolean z2 = true;
        if (!(f2 == null || (b = f2.mo59383b(str2)) == null)) {
            String a = C80480a.m139506a(str);
            if (!b.has(a)) {
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String a2 = C81524a.m141375a(str);
                    if (a2.length() != str.length()) {
                        a = C80480a.m139506a(a2);
                    }
                }
            }
            JSONObject optJSONObject = b.optJSONObject(a);
            if (optJSONObject != null) {
                System.currentTimeMillis();
                File file = new File(str2, optJSONObject.optString("fileName"));
                if (file.exists()) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("respHeader");
                    if (optJSONObject2 != null) {
                        str4 = optJSONObject2.optString("content-type");
                    }
                    webResourceResponse2 = m141394a(str4, "", new FileInputStream(file));
                }
                if (webResourceResponse2 != null) {
                    cVar.mo125255a(webResourceResponse2.getMimeType(), String.valueOf(file.length()));
                } else {
                    bVar.mo125254a();
                }
                MethodCollector.m26664o(6386);
                return webResourceResponse2;
            }
        }
        System.currentTimeMillis();
        if (str != null) {
            String a3 = C81524a.m141375a(str);
            String c = mo66295c(a3);
            if (AdLandPagePreloadServiceImpl.m68380f() == null) {
                z2 = false;
            }
            if (!TextUtils.isEmpty(c) || !z2) {
                try {
                    File file2 = new File(str2, C80480a.m139506a(a3));
                    if (file2.exists()) {
                        webResourceResponse = m141394a(c, "", new FileInputStream(file2));
                    } else {
                        webResourceResponse = null;
                    }
                    if (webResourceResponse != null) {
                        cVar.mo125255a(webResourceResponse.getMimeType(), String.valueOf(file2.length()));
                    } else {
                        bVar.mo125254a();
                    }
                    MethodCollector.m26664o(6386);
                    return webResourceResponse;
                } catch (Throwable unused) {
                    bVar.mo125254a();
                    MethodCollector.m26664o(6386);
                    return null;
                }
            } else {
                bVar.mo125254a();
                MethodCollector.m26664o(6386);
                return null;
            }
        } else {
            bVar.mo125254a();
            MethodCollector.m26664o(6386);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.a$c */
    static final class C81529c extends AbstractC89220m implements AbstractC89183m<String, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81523a f182315a;

        /* renamed from: b */
        final /* synthetic */ String f182316b;

        /* renamed from: c */
        final /* synthetic */ String f182317c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f182318d;

        /* renamed from: e */
        final /* synthetic */ String f182319e;

        static {
            Covode.recordClassIndex(94907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81529c(C81523a aVar, String str, String str2, C89233z.C89238e eVar, String str3) {
            super(2);
            this.f182315a = aVar;
            this.f182316b = str;
            this.f182317c = str2;
            this.f182318d = eVar;
            this.f182319e = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, String str2) {
            mo125255a(str, str2);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo125255a(String str, String str2) {
            String str3 = str;
            C89219l.m154721d(str2, "");
            if (C33384b.m68468a() && this.f182316b != null && C81523a.f182299l && !C81523a.f182298k) {
                String str4 = this.f182316b;
                Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.CharSequence");
                int i = 0;
                if (!C89361p.m154874b(C89361p.m154910b((CharSequence) str4).toString(), "http://", false)) {
                    String str5 = this.f182316b;
                    Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.CharSequence");
                    if (!C89361p.m154874b(C89361p.m154910b((CharSequence) str5).toString(), "https://", false)) {
                        return;
                    }
                }
                if (C81523a.m141370d(this.f182316b)) {
                    if (str3 == null) {
                        str3 = this.f182315a.mo66295c(C81524a.m141375a(this.f182316b));
                    }
                    if (C81523a.f182294g.size() > 10000) {
                        C81523a.f182294g.clear();
                        C81523a.f182296i = 0;
                    }
                    C81523a.f182296i++;
                    C81523a.f182294g.add(new C81524a.C81525a(this.f182316b, str3, str2, 1, AdWebStatBusiness.m81872a()));
                    C81523a.f182291d = this.f182315a.f182303b;
                    if (C81523a.f182300m == 0) {
                        String str6 = this.f182317c;
                        if (str6 == null) {
                            C89219l.m154715b();
                        }
                        if (new File(str6).exists() && new File(this.f182317c).isDirectory()) {
                            File[] listFiles = new File(this.f182317c).listFiles();
                            if (listFiles != null) {
                                i = listFiles.length;
                            }
                            C81523a.f182300m = i;
                        }
                    }
                    T t = this.f182318d.element;
                    if (t != null && C81523a.f182292e == 0) {
                        Long b = C80333dc.m139276b("offlineX", t, this.f182319e);
                        C89219l.m154716b(b, "");
                        C81523a.f182292e = b.longValue();
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81523a(String str, String str2, String str3) {
        super(true);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        this.f182302a = str;
        this.f182303b = str2;
        this.f182304c = str3;
    }
}
