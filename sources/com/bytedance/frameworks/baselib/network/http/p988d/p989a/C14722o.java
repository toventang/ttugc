package com.bytedance.frameworks.baselib.network.http.p988d.p989a;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.AbstractC14625c;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.frameworks.baselib.network.http.C14617b;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.AbstractC14686h;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.C14668a;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.C14682e;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.C14695e;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.C14703k;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.C14705l;
import com.bytedance.frameworks.baselib.network.http.p993e.C14743a;
import com.bytedance.frameworks.baselib.network.http.p993e.C14746d;
import com.bytedance.frameworks.baselib.network.http.p994f.C14749b;
import com.bytedance.frameworks.baselib.network.http.p995g.C14751a;
import com.bytedance.frameworks.baselib.network.http.p995g.C14757g;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.frameworks.baselib.network.p981c.C14609c;
import com.bytedance.retrofit2.AbstractC22059m;
import com.bytedance.retrofit2.C22096s;
import com.bytedance.retrofit2.client.AbstractC22029d;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.AbstractC90025ab;
import okhttp3.AbstractC90031ad;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90191p;
import okhttp3.C90022aa;
import okhttp3.C90029ac;
import okhttp3.C90198s;
import okhttp3.C90204w;
import okhttp3.C90208y;
import okhttp3.Request;
import okhttp3.internal.p4655c.C90094f;
import org.json.JSONException;
import org.json.JSONObject;
import p4632k.AbstractC89425g;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.o */
public class C14722o implements AbstractC14625c {

    /* renamed from: a */
    public static volatile boolean f35852a;

    /* renamed from: b */
    public static volatile int f35853b = -1;

    /* renamed from: c */
    public static volatile String f35854c = "";

    /* renamed from: d */
    public static volatile int f35855d = 0;

    /* renamed from: e */
    public static volatile String f35856e = null;

    /* renamed from: f */
    public static volatile String[] f35857f = null;

    /* renamed from: g */
    public static volatile String[] f35858g = null;

    /* renamed from: h */
    public static Context f35859h;

    /* renamed from: i */
    public static C14711g f35860i;

    /* renamed from: j */
    public static AbstractC14708e f35861j;

    /* renamed from: k */
    private static volatile C14722o f35862k;

    /* renamed from: l */
    private static final Object f35863l = new Object();

    /* renamed from: m */
    private static int f35864m = 0;

    /* renamed from: n */
    private static volatile String f35865n = "";

    /* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.o$a */
    public static class C14724a implements AbstractC22029d, AbstractC22059m {

        /* renamed from: n */
        static boolean f35867n;

        /* renamed from: a */
        C90208y f35868a;

        /* renamed from: b */
        C14612a f35869b = C14612a.m26716a();

        /* renamed from: c */
        long f35870c = 0;

        /* renamed from: d */
        AbstractC90031ad f35871d;

        /* renamed from: e */
        String f35872e;

        /* renamed from: f */
        Request f35873f;

        /* renamed from: g */
        okhttp3.Request f35874g;

        /* renamed from: h */
        C90029ac f35875h;

        /* renamed from: i */
        AbstractC90049e f35876i;

        /* renamed from: j */
        boolean f35877j;

        /* renamed from: k */
        C22096s f35878k;

        /* renamed from: l */
        volatile C14717k f35879l;

        /* renamed from: m */
        boolean f35880m;

        static {
            Covode.recordClassIndex(16821);
        }

        @Override // com.bytedance.retrofit2.client.AbstractC22029d
        /* renamed from: a */
        public final boolean mo11599a(long j) {
            return false;
        }

        @Override // com.bytedance.retrofit2.AbstractC22059m
        public final Object getRequestInfo() {
            return this.f35869b;
        }

        /* renamed from: d */
        private static boolean m26976d() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.bytedance.retrofit2.client.AbstractC22029d
        /* renamed from: b */
        public final void mo11600b() {
            AbstractC90049e eVar = this.f35876i;
            if (eVar != null) {
                eVar.mo144710c();
                if (this.f35873f.isResponseStreaming() && !this.f35880m) {
                    this.f35869b.f35365h = System.currentTimeMillis();
                    if (this.f35869b.f35359b == null || this.f35869b.f35359b.f35413p) {
                        long j = this.f35869b.f35365h;
                        long j2 = this.f35870c;
                        C14731e.m26985a(j - j2, j2, this.f35873f.getUrl(), this.f35872e, this.f35869b);
                    }
                }
                this.f35880m = true;
            }
        }

        /* renamed from: c */
        private void m26975c() {
            Map<String, List<String>> d = this.f35875h.f204110f.mo145034d();
            if (d.containsKey("bdturing-verify")) {
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean a = C14731e.m26990a(this.f35875h.f204107c, d);
                this.f35869b.f35354H = SystemClock.uptimeMillis() - uptimeMillis;
                if (a) {
                    this.f35869b.f35353G = true;
                    AbstractC90049e eVar = this.f35876i;
                    if (eVar != null) {
                        eVar.mo144710c();
                    }
                    C14722o.m26962a(this.f35875h.f204111g);
                    this.f35869b.f35355I = true;
                    okhttp3.Request a2 = this.f35874g.newBuilder().mo144700b("x-tt-bdturing-retry", "1").mo144698a();
                    this.f35874g = a2;
                    C90022aa a3 = C90022aa.m156235a(this.f35868a, a2, false);
                    this.f35876i = a3;
                    this.f35869b.f35348B = C14722o.m26953a(a3.mo144707a().headers());
                    this.f35875h = C14722o.m26955a(this.f35868a, this.f35876i);
                } else if (!d.containsKey("bdturing-verify")) {
                    this.f35869b.f35353G = true;
                    f35867n = true;
                }
                C14612a aVar = this.f35869b;
                aVar.f35383z = C14722o.m26956a(this.f35874g, aVar);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:54:0x0143 A[Catch:{ Exception -> 0x018f, all -> 0x018c }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0197 A[Catch:{ all -> 0x01f3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01a2 A[Catch:{ all -> 0x01f3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01e0 A[Catch:{ all -> 0x01f3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x01e3 A[Catch:{ all -> 0x01f3 }] */
        @Override // com.bytedance.retrofit2.client.AbstractC22029d
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.retrofit2.client.C22028c mo11598a() {
            /*
            // Method dump skipped, instructions count: 559
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14722o.C14724a.mo11598a():com.bytedance.retrofit2.client.c");
        }

        /* renamed from: a */
        private static List<C22027b> m26973a(C90198s sVar) {
            int length = sVar.f204855a.length / 2;
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                String a = sVar.mo145027a(i);
                if (a == null || !a.equalsIgnoreCase("bdturing-verify") || !f35867n) {
                    arrayList.add(new C22027b(sVar.mo145027a(i), sVar.mo145031b(i)));
                }
            }
            return arrayList;
        }

        public C14724a(Request request) {
            AbstractC90191p pVar;
            String method;
            String md5Stub;
            AbstractC90025ab abVar = null;
            this.f35871d = null;
            this.f35872e = null;
            this.f35877j = false;
            this.f35878k = null;
            this.f35879l = null;
            this.f35880m = false;
            this.f35868a = C14722o.f35860i.mo23715a();
            if (!C14731e.m26991a(request.getExtraInfo())) {
                C14731e.m26992b();
            }
            this.f35873f = request;
            String url = request.getUrl();
            C22096s metrics = request.getMetrics();
            this.f35878k = metrics;
            if (metrics != null) {
                this.f35869b.f35360c = metrics.f52180g;
                this.f35869b.f35361d = this.f35878k.f52181h;
            }
            this.f35879l = new C14717k();
            this.f35879l.f35806O = url;
            long currentTimeMillis = System.currentTimeMillis();
            this.f35870c = currentTimeMillis;
            this.f35869b.f35362e = currentTimeMillis;
            this.f35869b.f35379v = 1;
            if (this.f35873f.isResponseStreaming()) {
                this.f35869b.f35347A = true;
            } else {
                this.f35869b.f35347A = false;
            }
            try {
                C90208y.C90210a b = this.f35868a.mo145086b();
                b.mo145088a(15000, TimeUnit.MILLISECONDS);
                b.mo145098b(15000, TimeUnit.MILLISECONDS);
                b.mo145102c(15000, TimeUnit.MILLISECONDS);
                if (request.getExtraInfo() instanceof C14617b) {
                    this.f35869b.f35359b = (T) ((C14617b) request.getExtraInfo());
                    T t = this.f35869b.f35359b;
                    if (t.f35400c > 0 || t.f35401d > 0 || t.f35402e > 0) {
                        if (t.f35400c > 0) {
                            b.mo145088a(t.f35400c, TimeUnit.MILLISECONDS);
                        }
                        if (t.f35402e > 0) {
                            b.mo145102c(t.f35402e, TimeUnit.MILLISECONDS);
                        }
                        if (t.f35401d > 0) {
                            b.mo145098b(t.f35401d, TimeUnit.MILLISECONDS);
                        }
                    }
                    this.f35877j = t.f35408k;
                    if (!t.f35412o) {
                        b.f204952v = false;
                    }
                }
                if (this.f35868a.f204911i != null) {
                    pVar = this.f35868a.f204911i.create(this.f35876i);
                } else {
                    pVar = null;
                }
                b.mo145095a(new C14716j(pVar, this.f35879l));
                this.f35868a = b.mo145103d();
                String method2 = request.getMethod();
                if (!C14703k.m26921a().mo23710c()) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    C14695e a = C14703k.m26921a().mo23706a(new C14705l(url, method2));
                    long currentTimeMillis3 = System.currentTimeMillis();
                    if (a != null) {
                        m26974a(this.f35879l, this.f35873f.getMethod(), a.f35716a, currentTimeMillis3 - currentTimeMillis2);
                        this.f35879l.f35809R = a.f35718c;
                        this.f35879l.f35808Q = false;
                        if (!url.equals(a.f35716a)) {
                            if (a.f35716a.isEmpty() && !a.f35717b.isEmpty()) {
                                throw new Exception("ERR_TTNET_TRAFFIC_CONTROL_DROP, -555");
                            } else if (C14759i.m27072b(a.f35716a)) {
                                url = a.f35716a;
                            }
                        }
                    }
                } else {
                    long currentTimeMillis4 = System.currentTimeMillis();
                    String a2 = C14703k.m26921a().mo23707a(url);
                    long currentTimeMillis5 = System.currentTimeMillis();
                    if (!url.equals(a2) && C14759i.m27072b(a2)) {
                        m26974a(this.f35879l, this.f35873f.getMethod(), a2, currentTimeMillis5 - currentTimeMillis4);
                        this.f35879l.f35808Q = true;
                        this.f35879l.f35810S = C14703k.m26921a().f35746e.size();
                        url = a2;
                    }
                }
                String a3 = C14751a.m27041a(C14722o.f35859h, url, this.f35873f.getHeaders());
                URI a4 = C14757g.m27060a(a3);
                if (a4 != null && !TextUtils.isEmpty(a4.getHost())) {
                    this.f35879l.f35813V = a4.getHost();
                    C14715i a5 = C14715i.m26941a();
                    String host = a4.getHost();
                    C14717k kVar = this.f35879l;
                    if (kVar != null) {
                        if (a5.f35787a.containsKey(host)) {
                            a5.f35787a.get(host).add(kVar);
                        } else {
                            CopyOnWriteArrayList<C14717k> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                            copyOnWriteArrayList.add(kVar);
                            a5.f35787a.put(host, copyOnWriteArrayList);
                        }
                    }
                }
                Request.C90016a a6 = new Request.C90016a().mo144691a(a3);
                if (!C90094f.m156450c(this.f35873f.getMethod())) {
                    method = this.f35873f.getMethod();
                } else {
                    method = this.f35873f.getMethod();
                    final TypedOutput body = this.f35873f.getBody();
                    AbstractC90025ab requestBody = this.f35873f.getRequestBody();
                    if (requestBody == null) {
                        if (body == null) {
                            abVar = AbstractC90025ab.create((C90204w) null, "body=null");
                        } else {
                            final C90204w b2 = C90204w.m156843b(body.mimeType());
                            requestBody = new AbstractC90025ab() {
                                /* class com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14722o.C14724a.C147251 */

                                static {
                                    Covode.recordClassIndex(16822);
                                }

                                @Override // okhttp3.AbstractC90025ab
                                public final C90204w contentType() {
                                    return b2;
                                }

                                @Override // okhttp3.AbstractC90025ab
                                public final long contentLength() {
                                    return body.length();
                                }

                                @Override // okhttp3.AbstractC90025ab
                                public final void writeTo(AbstractC89425g gVar) {
                                    body.writeTo(gVar.mo68859d());
                                }
                            };
                        }
                    }
                    abVar = requestBody;
                }
                Request.C90016a a7 = a6.mo144693a(method, abVar);
                List<C22027b> headers = this.f35873f.getHeaders();
                if (!(this.f35873f.getBody() == null || (md5Stub = this.f35873f.getBody().md5Stub()) == null)) {
                    a7.mo144700b("X-SS-STUB", md5Stub);
                }
                okhttp3.Request a8 = C14722o.m26954a(a7, headers);
                this.f35874g = a8;
                this.f35876i = C90022aa.m156235a(this.f35868a, a8, false);
                C14612a aVar = this.f35869b;
                aVar.f35383z = C14722o.m26956a(this.f35874g, aVar);
            } catch (Exception e) {
                C14722o.m26961a(this.f35874g, url, this.f35870c, this.f35869b, this.f35872e, e, this.f35876i, this.f35875h, this.f35878k, this.f35879l);
                if (e instanceof IOException) {
                    throw e;
                }
                throw new IOException(e.getMessage(), e.getCause());
            }
        }

        /* renamed from: a */
        private static void m26974a(C14717k kVar, String str, String str2, long j) {
            C14720m mVar = new C14720m();
            mVar.f35842a = 307;
            mVar.f35845d = true;
            mVar.f35843b = str;
            mVar.f35844c = str2;
            kVar.f35801J.add(mVar);
            kVar.f35800I++;
            kVar.f35831r = j;
            kVar.f35807P = true;
        }
    }

    /* renamed from: a */
    private static void m26960a(String str, C14612a aVar) {
        if (!C13627m.m24498a(str) && aVar != null) {
            try {
                Logger.debug();
                aVar.f35358a = str;
                if (aVar.f35359b != null) {
                    aVar.f35359b.f35398a = str;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m26964a(C14612a aVar) {
        return (aVar == null || aVar.f35359b == null || !aVar.f35359b.f35407j) ? false : true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x016c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m26965a(java.lang.String r23, int r24, okhttp3.C90029ac r25, long r26, com.bytedance.frameworks.baselib.network.http.C14612a r28, java.lang.String r29, com.bytedance.retrofit2.C22096s r30, com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14717k r31) {
        /*
        // Method dump skipped, instructions count: 544
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14722o.m26965a(java.lang.String, int, okhttp3.ac, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, com.bytedance.retrofit2.s, com.bytedance.frameworks.baselib.network.http.d.a.k):byte[]");
    }

    /* renamed from: a */
    private static void m26958a(C14612a aVar, C22096s sVar, C14717k kVar) {
        if (aVar != null && sVar != null) {
            sVar.f52174a = aVar.f35380w;
            sVar.f52175b = aVar.f35381x;
            sVar.f52194u = SystemClock.uptimeMillis();
            sVar.f52184k = System.currentTimeMillis();
            sVar.f52171N = "4.0.71.7-tiktok";
            try {
                aVar.f35383z.put("retrofit", sVar.mo35895a());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (kVar != null) {
                kVar.mo23718a(aVar, f35859h);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m26963a(boolean z, Map<String, List<String>> map, int i, InputStream inputStream, String str, C22096s sVar) {
        if (inputStream != null) {
            int[] iArr = new int[1];
            try {
                iArr[0] = 0;
                byte[] a = C14746d.m27024a(z, map, i, inputStream, iArr, sVar);
                C14746d.m27026b(inputStream);
                int i2 = iArr[0];
                byte[] bArr = new byte[i2];
                if (a != null && iArr[0] > 0) {
                    System.arraycopy(a, 0, bArr, 0, iArr[0]);
                }
                if (i2 > 0 && !C13627m.m24498a(str) && Logger.debug()) {
                    try {
                        C14743a aVar = new C14743a(str);
                        if ("text".equalsIgnoreCase(aVar.getPrimaryType()) || "application/json".equalsIgnoreCase(aVar.getBaseType())) {
                            C13627m.m24498a(aVar.getParameter("charset"));
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th) {
                C14746d.m27026b(inputStream);
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r14 == null) goto L_0x0041;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m26961a(okhttp3.Request r10, java.lang.String r11, long r12, com.bytedance.frameworks.baselib.network.http.C14612a r14, java.lang.String r15, java.lang.Exception r16, okhttp3.AbstractC90049e r17, okhttp3.C90029ac r18, com.bytedance.retrofit2.C22096s r19, com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14717k r20) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14722o.m26961a(okhttp3.Request, java.lang.String, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, java.lang.Exception, okhttp3.e, okhttp3.ac, com.bytedance.retrofit2.s, com.bytedance.frameworks.baselib.network.http.d.a.k):void");
    }

    @Override // com.bytedance.retrofit2.client.AbstractC22025a
    /* renamed from: a */
    public final AbstractC22029d mo11597a(com.bytedance.retrofit2.client.Request request) {
        try {
            C14749b a = C14749b.m27031a();
            if (a.f35947i && !a.f35948j) {
                if (!TextUtils.isEmpty(request.getHost())) {
                    Iterator<String> it = a.f35945g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (C14759i.m27069a(request.getHost(), it.next())) {
                            ArrayList arrayList = new ArrayList();
                            if (request.getHeaders() != null) {
                                arrayList.addAll(request.getHeaders());
                            }
                            if (!TextUtils.isEmpty(a.f35940b)) {
                                arrayList.add(new C22027b("x-tt-store-idc", a.f35940b));
                            }
                            if (TextUtils.isEmpty(a.f35939a)) {
                                arrayList.add(new C22027b("x-tt-local-region", "unknown"));
                            } else if (C14749b.m27033a(a.f35943e)) {
                                arrayList.add(new C22027b("x-tt-store-region", a.f35939a));
                                arrayList.add(new C22027b("x-tt-store-region-src", a.f35943e));
                            } else if (a.f35943e.equals("local")) {
                                arrayList.add(new C22027b("x-tt-local-region", a.f35944f));
                            }
                            Request.C22024a newBuilder = request.newBuilder();
                            a.mo23763a(request, newBuilder, arrayList);
                            newBuilder.f52025c = arrayList;
                            com.bytedance.retrofit2.client.Request a2 = newBuilder.mo35840a();
                            if (a2 != null) {
                                request = a2;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        com.bytedance.retrofit2.client.Request a3 = C14609c.m26706a().mo23494a(request);
        if (request.getMetrics() != null) {
            request.getMetrics().f52169L = SystemClock.uptimeMillis() - uptimeMillis;
        }
        if (a3 != null) {
            request = a3;
        }
        return new C14724a(request);
    }

    /* renamed from: a */
    public static void m26957a(int i, String str) {
        f35855d = i;
        f35856e = str;
        f35858g = null;
        f35857f = null;
    }

    static {
        Covode.recordClassIndex(16819);
    }

    /* renamed from: a */
    public static void m26959a(AbstractC14708e eVar) {
        f35861j = eVar;
    }

    /* renamed from: a */
    public static void m26962a(AbstractC90031ad adVar) {
        if (adVar != null) {
            C14746d.m27026b(adVar);
        }
    }

    /* renamed from: a */
    private static String m26950a(Exception exc) {
        if (exc == null) {
            return "";
        }
        try {
            String[] split = exc.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                Logger.debug();
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: a */
    public static C14722o m26949a(Context context) {
        MethodCollector.m26663i(8907);
        if (f35862k == null) {
            synchronized (C14722o.class) {
                try {
                    if (f35862k == null) {
                        f35862k = new C14722o(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8907);
                    throw th;
                }
            }
        }
        C14722o oVar = f35862k;
        MethodCollector.m26664o(8907);
        return oVar;
    }

    /* renamed from: b */
    private static int m26966b(Context context) {
        int i;
        MethodCollector.m26663i(9064);
        synchronized (f35863l) {
            try {
                if (f35864m == 0) {
                    try {
                        f35864m = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                i = f35864m;
            } finally {
                MethodCollector.m26664o(9064);
            }
        }
        return i;
    }

    /* renamed from: a */
    private static String m26951a(C90029ac acVar) {
        List<String> b;
        if (acVar == null) {
            return "";
        }
        try {
            C90198s sVar = acVar.f204110f;
            if (sVar == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            for (String str : sVar.mo145029a()) {
                if (!C13627m.m24498a(str) && (b = sVar.mo145032b(str)) != null && !b.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    int i = 0;
                    for (String str2 : b) {
                        if (!C13627m.m24498a(str2)) {
                            if (i == 0) {
                                sb.append(str2);
                            } else {
                                sb.append("; ").append(str2);
                            }
                            i++;
                        }
                    }
                    jSONObject.put(str, sb.toString());
                }
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    private C14722o(Context context) {
        Application application;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        f35859h = applicationContext;
        f35860i = new C14711g();
        C14703k.m26921a();
        C14703k.m26922a(f35859h);
        C14682e a = C14682e.m26869a();
        C147231 r1 = new AbstractC14686h() {
            /* class com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14722o.C147231 */

            static {
                Covode.recordClassIndex(16820);
            }

            @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.AbstractC14686h
            /* renamed from: a */
            public final Context mo23687a() {
                return C14722o.f35859h;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.AbstractC14686h
            /* renamed from: b */
            public final String[] mo23688b() {
                return C14722o.f35857f;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.AbstractC14686h
            /* renamed from: d */
            public final String mo23690d() {
                return C14722o.f35856e;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.AbstractC14686h
            /* renamed from: e */
            public final String[] mo23691e() {
                return C14722o.f35858g;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.AbstractC14686h
            /* renamed from: c */
            public final String mo23689c() {
                return String.valueOf(C14722o.f35855d);
            }
        };
        if (a.f35659k) {
            return;
        }
        if (r1.mo23687a() == null || TextUtils.isEmpty(r1.mo23690d()) || r1.mo23689c() == null) {
            a.f35658j = null;
            throw new IllegalArgumentException("you must set correct httpdns depend");
        }
        a.f35658j = r1;
        if (TextUtils.isEmpty(a.f35651c)) {
            a.f35651c = r1.mo23690d();
        }
        a.f35659k = true;
        C14682e.m26876b();
        C14709f fVar = a.f35657i;
        Context a2 = r1.mo23687a();
        if (a2 != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            C14709f.m26933a(a2, fVar.f35780b, intentFilter);
        }
        if ((a2 instanceof Application) && (application = (Application) a2) != null) {
            fVar.f35779a.f35623b = fVar;
            application.registerActivityLifecycleCallbacks(fVar.f35779a);
        }
        if (a.f35653e.size() <= 0) {
            if (a.f35658j.mo23688b() != null && a.f35658j.mo23688b().length > 0 && a.f35658j.mo23688b().length <= 10) {
                a.f35653e.addAll(Arrays.asList(a.f35658j.mo23688b()));
            }
            Message obtain = Message.obtain();
            obtain.what = 5;
            obtain.obj = a;
            C14682e.f35646m.sendMessage(obtain);
        }
        a.mo23682a(C14668a.EnumC14669a.PRELOAD_BATCH);
        Message obtain2 = Message.obtain();
        obtain2.what = 5;
        obtain2.obj = a;
        C14682e.f35646m.sendMessage(obtain2);
    }

    /* renamed from: a */
    public static String m26953a(C90198s sVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, List<String>> entry : sVar.mo145034d().entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null && value.size() > 0) {
                    for (String str : value) {
                        jSONObject.put(key, str);
                    }
                }
            }
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static C90029ac m26955a(C90208y yVar, AbstractC90049e eVar) {
        if (yVar == null || eVar == null) {
            return null;
        }
        return eVar.mo144709b();
    }

    /* renamed from: a */
    public static String m26952a(C90029ac acVar, C14612a aVar) {
        if (acVar == null) {
            return null;
        }
        m26960a(acVar.mo144718a("x-net-info.remoteaddr", null), aVar);
        if (!(aVar == null || aVar.f35359b == null)) {
            aVar.f35359b.f35399b = acVar.f204107c;
        }
        return acVar.mo144718a("X-TT-LOGID", null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r5 == false) goto L_0x0044;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.Request m26954a(okhttp3.Request.C90016a r6, java.util.List<com.bytedance.retrofit2.client.C22027b> r7) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14722o.m26954a(okhttp3.Request$a, java.util.List):okhttp3.Request");
    }

    /* renamed from: a */
    public static JSONObject m26956a(okhttp3.Request request, C14612a aVar) {
        JSONObject jSONObject = new JSONObject();
        if (request == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("hc", "SsOkHttp3Client");
            jSONObject.put("hcv", "tt-ok/3.10.0.2");
            jSONObject.put("ua", request.header("User-Agent"));
            if (aVar.f35353G) {
                jSONObject.put("turing_callback", aVar.f35354H);
            }
            if (aVar.f35355I) {
                jSONObject.put("turing_retry", "1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
