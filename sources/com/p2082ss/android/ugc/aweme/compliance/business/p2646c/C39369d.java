package com.p2082ss.android.ugc.aweme.compliance.business.p2646c;

import android.os.SystemClock;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39244e;
import com.p2082ss.android.ugc.aweme.compliance.business.p2651d.C39404a;
import com.p2082ss.android.ugc.aweme.compliance.business.p2651d.C39406b;
import com.p2082ss.android.ugc.aweme.net.model.C61421a;
import com.p2082ss.android.ugc.aweme.net.model.C61422b;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61423c;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61426a;
import com.p2082ss.android.ugc.aweme.net.p3500j.C61409g;
import com.p2082ss.android.ugc.aweme.net.p3500j.C61410h;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import com.p2082ss.android.ugc.aweme.utils.C80399eo;
import com.p2082ss.android.ugc.aweme.utils.C80506gn;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.regex.Pattern;
import okhttp3.AbstractC90025ab;
import okhttp3.AbstractC90031ad;
import okhttp3.C90029ac;
import okhttp3.C90200t;
import okhttp3.C90204w;
import okhttp3.EnumC90211z;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89361p;
import p4632k.C89420f;
import p4632k.C89436q;
import p4632k.C89438s;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.c.d */
public final class C39369d extends AbstractC61426a {

    /* renamed from: a */
    public static final Charset f92935a;

    /* renamed from: b */
    public static final C39370a f92936b = new C39370a((byte) 0);

    /* renamed from: c */
    private final Random f92937c = new Random();

    /* renamed from: d */
    private final BlockingQueue<Long> f92938d;

    /* renamed from: e */
    private final Map<String, String> f92939e;

    /* renamed from: f */
    private final C39406b f92940f;

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.c.d$a */
    public static final class C39370a {
        static {
            Covode.recordClassIndex(47054);
        }

        private C39370a() {
        }

        public /* synthetic */ C39370a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static boolean m80055a(C90204w wVar) {
        String str = wVar.f204877a;
        return !TextUtils.equals(str, "application") && !TextUtils.equals(str, "text");
    }

    /* renamed from: a */
    private static boolean m80054a(AbstractC90025ab abVar) {
        Field[] declaredFields = abVar.getClass().getDeclaredFields();
        C89219l.m154716b(declaredFields, "");
        for (Field field : declaredFields) {
            C89219l.m154716b(field, "");
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            if (field.get(abVar) instanceof C89438s) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016f, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0170, code lost:
        r2 = 9648;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d7, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d8, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01da, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01db, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01d7 A[ExcHandler: IOException (e java.io.IOException), PHI: r8 
      PHI: (r8v11 long) = (r8v12 long), (r8v12 long), (r8v14 long), (r8v14 long) binds: [B:63:0x017f, B:64:?, B:52:0x016b, B:53:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:52:0x016b] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01da A[ExcHandler: URISyntaxException (e java.net.URISyntaxException), PHI: r8 
      PHI: (r8v10 long) = (r8v12 long), (r8v12 long), (r8v14 long), (r8v14 long) binds: [B:63:0x017f, B:64:?, B:52:0x016b, B:53:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:52:0x016b] */
    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61426a, com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61437l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.net.model.C61425e<com.bytedance.retrofit2.client.Request, com.bytedance.retrofit2.C22099u<?>> mo68796a(com.p2082ss.android.ugc.aweme.net.model.C61425e<com.bytedance.retrofit2.client.Request, com.bytedance.retrofit2.C22099u<?>> r25) {
        /*
        // Method dump skipped, instructions count: 531
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.p2646c.C39369d.mo68796a(com.ss.android.ugc.aweme.net.model.e):com.ss.android.ugc.aweme.net.model.e");
    }

    static {
        Covode.recordClassIndex(47053);
        Charset forName = Charset.forName("utf-8");
        C89219l.m154716b(forName, "");
        f92935a = forName;
    }

    /* renamed from: b */
    private static boolean m80056b() {
        C61409g a = C61410h.m111181a();
        if (!a.f139422a || !(!a.f139434m.isEmpty())) {
            return false;
        }
        return true;
    }

    public C39369d() {
        C61409g a = C61410h.m111181a();
        this.f92938d = new LinkedBlockingQueue(a.f139430i);
        this.f92940f = new C39406b(a.f139432k);
        this.f92939e = new ConcurrentHashMap(8);
    }

    /* renamed from: a */
    private static boolean m80051a(String str) {
        if (TextUtils.equals(str, "/service/2/app_log/") || TextUtils.equals(str, "/monitor/collect/batch/") || TextUtils.equals(str, "/monitor/collect/c/logcollect") || TextUtils.equals(str, "/monitor/collect/c/exception") || TextUtils.equals(str, "/monitor/collect/c/code_coverage")) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61426a, com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: e */
    public final C61425e<HttpURLConnection, InputStream> mo68801e(C61425e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        C89219l.m154721d(eVar, "");
        if (!C61410h.m111181a().f139422a) {
            return super.mo68801e(eVar);
        }
        Q q = eVar.f139468a;
        if (q == null || (url = q.getURL()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        if (m80056b()) {
            m80047a(eVar, (C61425e<HttpURLConnection, Integer>) null, new C39244e(false, str, null, null, null, null, null, 502));
        }
        return super.mo68801e(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61426a, com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: g */
    public final C61425e<HttpURLConnection, InputStream> mo68803g(C61425e<HttpURLConnection, InputStream> eVar) {
        String str;
        URL url;
        C89219l.m154721d(eVar, "");
        if (!C61410h.m111181a().f139422a) {
            return super.mo68803g(eVar);
        }
        Q q = eVar.f139468a;
        if (q == null || (url = q.getURL()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        if (m80056b()) {
            m80047a(eVar, (C61425e<HttpURLConnection, Integer>) null, new C39244e(false, str, null, null, null, null, null, 502));
        }
        return super.mo68803g(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61426a, com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61434i
    /* renamed from: i */
    public final C61425e<HttpURLConnection, Integer> mo68805i(C61425e<HttpURLConnection, Integer> eVar) {
        String str;
        URL url;
        C89219l.m154721d(eVar, "");
        if (!C61410h.m111181a().f139422a) {
            return super.mo68805i(eVar);
        }
        Q q = eVar.f139468a;
        if (q == null || (url = q.getURL()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        if (m80056b()) {
            m80047a((C61425e<HttpURLConnection, InputStream>) null, eVar, new C39244e(false, str, null, null, null, null, null, 502));
        }
        return super.mo68805i(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61426a, com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61431f
    /* renamed from: a_ */
    public final C61425e<C61421a, Boolean> mo68815a_(C61425e<C61421a, Boolean> eVar) {
        C61425e<C61421a, Boolean> eVar2;
        C89219l.m154721d(eVar, "");
        long uptimeMillis = SystemClock.uptimeMillis();
        Q q = eVar.f139468a;
        if (q == null) {
            return super.mo68815a_(eVar);
        }
        long incrementAndGet = C80506gn.f180104a.incrementAndGet();
        try {
            if (!m80050a(incrementAndGet, C61410h.m111181a().f139427f)) {
                eVar2 = super.mo68815a_(eVar);
            } else {
                StringBuilder append = new StringBuilder().append(q.f139458a).append('/').append(q.f139459b).append('/');
                String str = q.f139460c;
                if (str == null) {
                    str = "";
                }
                String sb = append.append(str).toString();
                C39244e eVar3 = new C39244e(false, sb, null, null, null, null, null, 502);
                String jSONObject = q.f139461d.toString();
                C89219l.m154716b(jSONObject, "");
                C39406b bVar = this.f92940f;
                Charset charset = f92935a;
                if (jSONObject != null) {
                    byte[] bytes = jSONObject.getBytes(charset);
                    C89219l.m154716b(bytes, "");
                    long b = bVar.mo68870b((long) bytes.length);
                    if (b <= 0) {
                        eVar2 = super.mo68815a_(eVar);
                    } else {
                        this.f92940f.mo68869a(b);
                        m80049a(jSONObject, C61410h.m111181a().f139434m, eVar3);
                        if (eVar3.f92687a) {
                            if (C61410h.m111181a().f139423b && C61410h.m111181a().f139433l.contains(sb)) {
                                eVar.mo99118a(EnumC61424d.INTERCEPT);
                            }
                            m80048a(sb, "6", eVar3, incrementAndGet, SystemClock.uptimeMillis() - uptimeMillis);
                        }
                        this.f92938d.remove(Long.valueOf(incrementAndGet));
                        return super.mo68815a_(eVar);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return eVar2;
        } finally {
            this.f92938d.remove(Long.valueOf(incrementAndGet));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61426a, com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61432g
    /* renamed from: b_ */
    public final C61425e<C61422b, Boolean> mo68816b_(C61425e<C61422b, Boolean> eVar) {
        C61425e<C61422b, Boolean> eVar2;
        C89219l.m154721d(eVar, "");
        long uptimeMillis = SystemClock.uptimeMillis();
        Q q = eVar.f139468a;
        if (q == null) {
            return super.mo68816b_(eVar);
        }
        long incrementAndGet = C80506gn.f180104a.incrementAndGet();
        String optString = q.f139464c.optString("log_type");
        if (TextUtils.isEmpty(optString)) {
            optString = q.f139464c.optString(StringSet.type);
        }
        String str = q.f139462a + '/' + optString;
        try {
            if (!m80050a(incrementAndGet, C61410h.m111181a().f139428g)) {
                eVar2 = super.mo68816b_(eVar);
            } else {
                C39244e eVar3 = new C39244e(false, str, null, null, null, null, null, 502);
                EnumC61423c[] values = EnumC61423c.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        String jSONObject = q.f139464c.toString();
                        C89219l.m154716b(jSONObject, "");
                        C39406b bVar = this.f92940f;
                        Charset charset = f92935a;
                        if (jSONObject != null) {
                            byte[] bytes = jSONObject.getBytes(charset);
                            C89219l.m154716b(bytes, "");
                            long b = bVar.mo68870b((long) bytes.length);
                            if (b <= 0) {
                                eVar2 = super.mo68816b_(eVar);
                            } else {
                                this.f92940f.mo68869a(b);
                                m80049a(jSONObject, C61410h.m111181a().f139434m, eVar3);
                                if (eVar3.f92687a) {
                                    if (C61410h.m111181a().f139423b && C61410h.m111181a().f139433l.contains(str)) {
                                        eVar.mo99118a(EnumC61424d.INTERCEPT);
                                    }
                                    m80048a(str, "7", eVar3, incrementAndGet, SystemClock.uptimeMillis() - uptimeMillis);
                                }
                                this.f92938d.remove(Long.valueOf(incrementAndGet));
                                return super.mo68816b_(eVar);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else if (C89219l.m154714a((Object) optString, (Object) values[i].getLogType())) {
                        eVar2 = super.mo68816b_(eVar);
                        break;
                    } else {
                        i++;
                    }
                }
            }
            return eVar2;
        } finally {
            this.f92938d.remove(Long.valueOf(incrementAndGet));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61426a, com.p2082ss.android.ugc.aweme.net.monitor.AbstractC61436k
    /* renamed from: c */
    public final C61425e<Request, C90029ac> mo68799c(C61425e<Request, C90029ac> eVar) {
        String str;
        long j;
        Throwable th;
        IOException e;
        String tVar;
        C90200t url;
        C39369d dVar = this;
        MethodCollector.m26663i(9794);
        C89219l.m154721d(eVar, "");
        if (!C61410h.m111181a().f139422a) {
            C61425e<Request, C90029ac> c = super.mo68799c(eVar);
            MethodCollector.m26664o(9794);
            return c;
        }
        Q q = eVar.f139468a;
        if (q == null || (url = q.url()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        if (m80056b()) {
            C39244e eVar2 = new C39244e(false, str, null, null, null, null, null, 502);
            long uptimeMillis = SystemClock.uptimeMillis();
            long incrementAndGet = C80506gn.f180104a.incrementAndGet();
            try {
                Q q2 = eVar.f139468a;
                if (q2 != null) {
                    C90200t url2 = q2.url();
                    String str2 = url2.f204858a + "://" + url2.f204861d + url2.mo145055f();
                    String f = url2.mo145055f();
                    C89219l.m154716b(f, "");
                    if (!m80051a(f)) {
                        C61409g a = C61410h.m111181a();
                        AbstractC90025ab body = q2.body();
                        if (body != null) {
                            C89219l.m154716b(body, "");
                            if (dVar.m80050a(incrementAndGet, a.f139425d)) {
                                C90204w contentType = body.contentType();
                                if (contentType != null) {
                                    C89219l.m154716b(contentType, "");
                                    if (!m80055a(contentType)) {
                                        Charset a2 = contentType.mo145074a(f92935a);
                                        if (a2 != null) {
                                            C89219l.m154716b(a2, "");
                                            if (!m80054a(body)) {
                                                if (!C89219l.m154714a((Object) "x-www-form-urlencoded", (Object) contentType.f204878b)) {
                                                    C39404a aVar = new C39404a(C89436q.m155163a(new ByteArrayOutputStream()), dVar.f92940f);
                                                    body.writeTo(aVar);
                                                    C89420f fVar = aVar.f93006a;
                                                    C89219l.m154716b(fVar, "");
                                                    if (m80053a(fVar)) {
                                                        dVar.m80049a(aVar.f93006a.mo143799a(a2), C61410h.m111181a().f139434m, eVar2);
                                                    } else {
                                                        aVar.f93006a.mo143854v();
                                                    }
                                                } else if (body.contentLength() != -1) {
                                                    try {
                                                        if (!dVar.f92940f.mo68871c(body.contentLength())) {
                                                            C89420f fVar2 = new C89420f();
                                                            body.writeTo(fVar2);
                                                            dVar.f92940f.mo68869a(fVar2.f203091b);
                                                            if (m80053a(fVar2)) {
                                                                dVar.m80049a(fVar2.mo143799a(a2), C61410h.m111181a().f139434m, eVar2);
                                                            } else {
                                                                fVar2.mo143854v();
                                                            }
                                                        }
                                                    } catch (IOException e2) {
                                                        e = e2;
                                                        j = incrementAndGet;
                                                        try {
                                                            e.printStackTrace();
                                                            C80399eo.m139373a(e, "error occur.");
                                                            dVar.f92938d.remove(Long.valueOf(j));
                                                            C61425e<Request, C90029ac> c2 = super.mo68799c(eVar);
                                                            MethodCollector.m26664o(9794);
                                                            return c2;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            dVar.f92938d.remove(Long.valueOf(j));
                                                            MethodCollector.m26664o(9794);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        j = incrementAndGet;
                                                        dVar.f92938d.remove(Long.valueOf(j));
                                                        MethodCollector.m26664o(9794);
                                                        throw th;
                                                    }
                                                }
                                                if (eVar2.f92687a) {
                                                    try {
                                                        if (a.f139423b && a.f139433l.contains(str2)) {
                                                            eVar.mo99118a(EnumC61424d.INTERCEPT);
                                                            C90029ac.C90030a aVar2 = new C90029ac.C90030a();
                                                            aVar2.f204120c = 1001;
                                                            aVar2.f204119b = EnumC90211z.HTTP_2;
                                                            aVar2.f204121d = "";
                                                            aVar2.f204118a = eVar.f139468a;
                                                            aVar2.f204124g = AbstractC90031ad.create(C90204w.m156843b("application/json; charset=utf-8"), "{\"status_code\": 1001}");
                                                            eVar.f139469b = (R) aVar2.mo144729a();
                                                        }
                                                        tVar = url2.toString();
                                                        j = incrementAndGet;
                                                    } catch (IOException e3) {
                                                        e = e3;
                                                        dVar = dVar;
                                                        j = incrementAndGet;
                                                        e.printStackTrace();
                                                        C80399eo.m139373a(e, "error occur.");
                                                        dVar.f92938d.remove(Long.valueOf(j));
                                                        C61425e<Request, C90029ac> c22 = super.mo68799c(eVar);
                                                        MethodCollector.m26664o(9794);
                                                        return c22;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        dVar = dVar;
                                                        j = incrementAndGet;
                                                        dVar.f92938d.remove(Long.valueOf(j));
                                                        MethodCollector.m26664o(9794);
                                                        throw th;
                                                    }
                                                    try {
                                                        m80048a(tVar, "4", eVar2, incrementAndGet, SystemClock.uptimeMillis() - uptimeMillis);
                                                    } catch (IOException e4) {
                                                        e = e4;
                                                        dVar = dVar;
                                                        e.printStackTrace();
                                                        C80399eo.m139373a(e, "error occur.");
                                                        dVar.f92938d.remove(Long.valueOf(j));
                                                        C61425e<Request, C90029ac> c222 = super.mo68799c(eVar);
                                                        MethodCollector.m26664o(9794);
                                                        return c222;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        dVar = dVar;
                                                        dVar.f92938d.remove(Long.valueOf(j));
                                                        MethodCollector.m26664o(9794);
                                                        throw th;
                                                    }
                                                } else {
                                                    j = incrementAndGet;
                                                }
                                                C80399eo.m139372a("handleOkHttp id: " + j + ", api: " + str2 + ", cost: " + (SystemClock.uptimeMillis() - uptimeMillis) + "ms, method: " + q2.method() + ", type: " + contentType + ", size: " + body.contentLength() + "-byte");
                                                dVar = dVar;
                                                dVar.f92938d.remove(Long.valueOf(j));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                dVar.f92938d.remove(Long.valueOf(incrementAndGet));
            } catch (IOException e5) {
                e = e5;
                j = incrementAndGet;
                e.printStackTrace();
                C80399eo.m139373a(e, "error occur.");
                dVar.f92938d.remove(Long.valueOf(j));
                C61425e<Request, C90029ac> c2222 = super.mo68799c(eVar);
                MethodCollector.m26664o(9794);
                return c2222;
            } catch (Throwable th6) {
                th = th6;
                j = incrementAndGet;
                dVar.f92938d.remove(Long.valueOf(j));
                MethodCollector.m26664o(9794);
                throw th;
            }
        }
        C61425e<Request, C90029ac> c22222 = super.mo68799c(eVar);
        MethodCollector.m26664o(9794);
        return c22222;
    }

    /* renamed from: a */
    private static boolean m80053a(C89420f fVar) {
        long j;
        try {
            C89420f fVar2 = new C89420f();
            if (fVar.f203091b < 64) {
                j = fVar.f203091b;
            } else {
                j = 64;
            }
            fVar.mo143803a(fVar2, 0, j);
            int i = 0;
            while (!fVar2.mo143815e()) {
                int t = fVar2.mo143851t();
                if (!Character.isISOControl(t) || Character.isWhitespace(t)) {
                    i++;
                    if (i >= 16) {
                        break;
                    }
                } else {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m80050a(long j, int i) {
        if (((long) this.f92937c.nextInt(10001)) > ((long) i)) {
            return false;
        }
        return this.f92938d.offer(Long.valueOf(j));
    }

    /* renamed from: a */
    private final void m80049a(String str, Set<String> set, C39244e eVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Locale locale = Locale.getDefault();
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        C89219l.m154716b(lowerCase, "");
        Iterator<String> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Objects.requireNonNull(next, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = next.toLowerCase();
            C89219l.m154716b(lowerCase2, "");
            if (m80052a(lowerCase, lowerCase2, linkedHashSet2)) {
                linkedHashSet.add(next);
                break;
            }
        }
        if (!linkedHashSet.isEmpty()) {
            eVar.f92687a = true;
            C89219l.m154721d(linkedHashSet2, "");
            eVar.f92693g = linkedHashSet2;
            C89219l.m154721d(linkedHashSet, "");
            eVar.f92695i = linkedHashSet;
        }
    }

    /* renamed from: a */
    private final boolean m80052a(String str, String str2, Set<String> set) {
        int a;
        int length;
        if (C89361p.m154908a((CharSequence) str, (CharSequence) str2, false)) {
            int i = C61410h.m111181a().f139429h;
            int i2 = 0;
            do {
                a = C89361p.m154888a((CharSequence) str, str2, i2, false, 4);
                int i3 = a - i;
                if (i3 < 0) {
                    i3 = 0;
                }
                if (str2.length() + a + i > str.length()) {
                    length = str.length();
                } else {
                    length = str2.length() + a + i;
                }
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring = str.substring(i3, length);
                C89219l.m154716b(substring, "");
                String str3 = this.f92939e.get(str2);
                if (str3 == null || C89361p.m154870a((CharSequence) str3)) {
                    String str4 = C61410h.m111181a().f139431j;
                    if (TextUtils.isEmpty(str4)) {
                        str4 = "^(.*)([^a-z0-9]+)([^\\/])%s([^a-z0-9]+)(.*)$";
                    }
                    Map<String, String> map = this.f92939e;
                    String a2 = C1764a.m5928a(str4, Arrays.copyOf(new Object[]{str2}, 1));
                    C89219l.m154716b(a2, "");
                    map.put(str2, a2);
                }
                if (Pattern.compile(this.f92939e.get(str2)).matcher(substring).find()) {
                    set.add(substring);
                    return true;
                }
                i2 = str2.length() + a;
            } while (a != -1);
        }
        return false;
    }

    /* renamed from: a */
    private final void m80047a(C61425e<HttpURLConnection, InputStream> eVar, C61425e<HttpURLConnection, Integer> eVar2, C39244e eVar3) {
        Q q;
        long incrementAndGet;
        boolean z;
        MethodCollector.m26663i(9645);
        long uptimeMillis = SystemClock.uptimeMillis();
        if (eVar != null) {
            q = eVar.f139468a;
        } else if (eVar2 != null) {
            q = eVar2.f139468a;
        } else {
            q = null;
        }
        if (q instanceof C61417b) {
            incrementAndGet = q.f139454d;
        } else if (q instanceof C61416a) {
            incrementAndGet = q.f139449d;
        } else {
            incrementAndGet = C80506gn.f180104a.incrementAndGet();
        }
        if (q == null) {
            MethodCollector.m26664o(9645);
            return;
        }
        URL url = q.getURL();
        StringBuilder sb = new StringBuilder();
        C89219l.m154716b(url, "");
        String sb2 = sb.append(url.getProtocol()).append("://").append(url.getHost()).append(url.getPath()).toString();
        String path = url.getPath();
        C89219l.m154716b(path, "");
        if (m80051a(path)) {
            MethodCollector.m26664o(9645);
        } else if (!q.getDoOutput()) {
            MethodCollector.m26664o(9645);
        } else {
            try {
                if (q instanceof C61417b) {
                    z = q.mo99029a();
                } else {
                    if (q instanceof C61416a) {
                        z = q.mo98984a();
                    }
                    this.f92938d.remove(Long.valueOf(incrementAndGet));
                    MethodCollector.m26664o(9645);
                }
                if (!z) {
                    if (!m80050a(incrementAndGet, C61410h.m111181a().f139426e)) {
                        this.f92938d.remove(Long.valueOf(incrementAndGet));
                        MethodCollector.m26664o(9645);
                        return;
                    }
                    String requestProperty = q.getRequestProperty("Content-Type");
                    C90204w b = C90204w.m156843b(requestProperty);
                    if (b == null) {
                        this.f92938d.remove(Long.valueOf(incrementAndGet));
                        MethodCollector.m26664o(9645);
                        return;
                    }
                    C89219l.m154716b(b, "");
                    if (m80055a(b)) {
                        this.f92938d.remove(Long.valueOf(incrementAndGet));
                        MethodCollector.m26664o(9645);
                        return;
                    }
                    Charset a = b.mo145074a(f92935a);
                    if (a == null) {
                        this.f92938d.remove(Long.valueOf(incrementAndGet));
                        MethodCollector.m26664o(9645);
                        return;
                    }
                    C89219l.m154716b(a, "");
                    OutputStream outputStream = q.getOutputStream();
                    C89219l.m154716b(outputStream, "");
                    C89420f a2 = C89436q.m155159a(C89436q.m155163a(outputStream)).mo68846a();
                    long b2 = this.f92940f.mo68870b(a2.f203091b);
                    if (b2 > 0) {
                        this.f92940f.mo68869a(b2);
                        if (m80053a(a2)) {
                            m80049a(a2.mo143799a(a), C61410h.m111181a().f139434m, eVar3);
                        }
                        if (eVar3.f92687a) {
                            if (C61410h.m111181a().f139423b && C61410h.m111181a().f139433l.contains(sb2)) {
                                if (eVar != null) {
                                    eVar.mo99118a(EnumC61424d.INTERCEPT);
                                    byte[] bytes = "{\"status_code\": 1001}".getBytes(C89338d.f202990a);
                                    C89219l.m154716b(bytes, "");
                                    eVar.f139469b = (R) new ByteArrayInputStream(bytes);
                                } else if (eVar2 != null) {
                                    eVar2.mo99118a(EnumC61424d.INTERCEPT);
                                    eVar2.f139469b = (R) 1001;
                                }
                                if (q instanceof C61416a) {
                                    Q q2 = q;
                                    q2.f139447b = 1001;
                                    q2.f139448c = "{\"status_code\": 1001}";
                                } else if (q instanceof C61417b) {
                                    Q q3 = q;
                                    q3.f139452b = 1001;
                                    q3.f139453c = "{\"status_code\": 1001}";
                                }
                            }
                            m80048a(q.getURL().toString(), "3", eVar3, incrementAndGet, SystemClock.uptimeMillis() - uptimeMillis);
                        }
                        C80399eo.m139372a("handleURLConnection id: " + incrementAndGet + ", url: " + sb2 + " cost: " + (SystemClock.uptimeMillis() - uptimeMillis) + "ms, method: " + q.getRequestMethod() + ", type: " + requestProperty);
                        this.f92938d.remove(Long.valueOf(incrementAndGet));
                        MethodCollector.m26664o(9645);
                        return;
                    }
                    return;
                }
                this.f92938d.remove(Long.valueOf(incrementAndGet));
                MethodCollector.m26664o(9645);
            } finally {
                this.f92938d.remove(Long.valueOf(incrementAndGet));
                MethodCollector.m26664o(9645);
            }
        }
    }

    /* renamed from: a */
    private static void m80048a(String str, String str2, C39244e eVar, long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        String str3 = eVar.f92690d;
        if ((str3 != null && !C89361p.m154870a((CharSequence) str3)) || (str != null && !C89361p.m154870a((CharSequence) str))) {
            String str4 = eVar.f92690d;
            if (str4 != null) {
                str = str4;
            }
            eVar.f92690d = str;
            jSONObject.put("url", eVar.f92690d);
        }
        Set<String> set = eVar.f92693g;
        if (set != null && !set.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = eVar.f92693g.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("payload_segment", jSONArray);
        }
        Set<String> set2 = eVar.f92695i;
        if (set2 != null && !set2.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<T> it2 = eVar.f92695i.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next());
            }
            jSONObject.put("config_rules", jSONArray2);
        }
        jSONObject.put("net_type", str2);
        jSONObject.put("cost", j2);
        C12290b.m22064a(EnumC61423c.COMPLIANCE_PAYLOAD_MONITOR_LOG.getLogType(), jSONObject);
        C80399eo.m139372a("reportMonitor id: " + j + ", netType: " + str2 + ", data: " + jSONObject);
    }
}
