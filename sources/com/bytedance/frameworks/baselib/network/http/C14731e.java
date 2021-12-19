package com.bytedance.frameworks.baselib.network.http;

import android.os.Looper;
import android.webkit.CookieManager;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p984c.C14626a;
import com.bytedance.retrofit2.C22096s;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.frameworks.baselib.network.http.e */
public class C14731e {

    /* renamed from: a */
    public static AbstractC14738g f35912a;

    /* renamed from: b */
    public static AbstractC14736e f35913b;

    /* renamed from: c */
    public static AbstractC14741j f35914c;

    /* renamed from: d */
    public static String f35915d;

    /* renamed from: e */
    public static AbstractC14737f f35916e;

    /* renamed from: f */
    public static AbstractC14733b f35917f;

    /* renamed from: g */
    public static AbstractC14740i f35918g;

    /* renamed from: h */
    public static AbstractC14734c f35919h;

    /* renamed from: i */
    public static AbstractC14739h f35920i;

    /* renamed from: j */
    public static AbstractC14735d f35921j;

    /* renamed from: k */
    public static AbstractC14732a f35922k;

    /* renamed from: l */
    public static volatile boolean f35923l = false;

    /* renamed from: m */
    private static volatile AtomicBoolean f35924m = new AtomicBoolean(false);

    /* renamed from: n */
    private static final Object f35925n = new Object();

    /* renamed from: o */
    private static CountDownLatch f35926o = new CountDownLatch(1);

    /* renamed from: p */
    private static volatile int f35927p = -1;

    /* renamed from: q */
    private static volatile AbstractC14742k f35928q;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$a */
    public interface AbstractC14732a {
        static {
            Covode.recordClassIndex(16829);
        }

        /* renamed from: a */
        Map<String, String> mo23729a(String str, Map<String, List<String>> map);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$b */
    public interface AbstractC14733b<T extends C14612a> {
        static {
            Covode.recordClassIndex(16830);
        }

        /* renamed from: a */
        String mo23730a(String str);

        /* renamed from: b */
        String mo23731b(String str);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$c */
    public interface AbstractC14734c<T extends C14617b> {
        static {
            Covode.recordClassIndex(16831);
        }

        /* renamed from: a */
        String mo23732a(String str);

        /* renamed from: a */
        void mo23733a(String str, String str2, boolean z);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$d */
    public interface AbstractC14735d {
        static {
            Covode.recordClassIndex(16832);
        }

        /* renamed from: a */
        Map<String, List<String>> mo23734a();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$e */
    public interface AbstractC14736e {
        static {
            Covode.recordClassIndex(16833);
        }

        /* renamed from: b */
        boolean mo23735b(String str);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$f */
    public interface AbstractC14737f {
        static {
            Covode.recordClassIndex(16834);
        }

        /* renamed from: a */
        String mo23736a();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$g */
    public interface AbstractC14738g {
        static {
            Covode.recordClassIndex(16835);
        }

        /* renamed from: c */
        boolean mo23737c(String str);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$h */
    public interface AbstractC14739h {
        static {
            Covode.recordClassIndex(16836);
        }

        /* renamed from: a */
        List<String> mo23738a(CookieManager cookieManager, C14626a aVar, URI uri);

        /* renamed from: d */
        List<String> mo23739d(String str);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$i */
    public interface AbstractC14740i<T extends C14612a> {
        static {
            Covode.recordClassIndex(16837);
        }

        /* renamed from: a */
        void mo23740a(long j, long j2, String str, String str2, T t);

        /* renamed from: a */
        void mo23741a(long j, long j2, String str, String str2, T t, Throwable th);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$j */
    public interface AbstractC14741j {
        static {
            Covode.recordClassIndex(16838);
        }

        /* renamed from: a */
        InputStream mo23742a(InputStream inputStream, Map<String, List<String>> map, C22096s sVar);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$k */
    public interface AbstractC14742k {
        static {
            Covode.recordClassIndex(16839);
        }

        /* renamed from: a */
        boolean mo21481a(Map<String, List<String>> map);
    }

    /* renamed from: a */
    public static boolean m26991a(Object obj) {
        return obj != null && (obj instanceof C14617b) && ((C14617b) obj).f35414q;
    }

    static {
        Covode.recordClassIndex(16828);
    }

    /* renamed from: a */
    public static void m26984a() {
        if (!f35924m.get()) {
            f35924m.getAndSet(true);
            CountDownLatch countDownLatch = f35926o;
            if (countDownLatch != null && countDownLatch.getCount() > 0) {
                f35926o.countDown();
            }
        }
        C58945a.C58947b.f134185a.mo96429b("feed_network_init_cookie_duration", false);
    }

    /* renamed from: b */
    public static CookieManager m26992b() {
        MethodCollector.m26663i(8800);
        synchronized (f35925n) {
            try {
                if (!f35924m.get()) {
                    try {
                        CountDownLatch countDownLatch = f35926o;
                        if (countDownLatch != null) {
                            countDownLatch.await(5000, TimeUnit.MILLISECONDS);
                            if (f35926o.getCount() == 1) {
                                f35926o.countDown();
                            }
                        }
                    } catch (Exception unused) {
                    }
                    f35924m.getAndSet(true);
                }
            } finally {
                MethodCollector.m26664o(8800);
            }
        }
        CookieManager cookieManager = null;
        try {
            cookieManager = CookieManager.getInstance();
            if (!cookieManager.acceptCookie()) {
                cookieManager.setAcceptCookie(true);
            }
        } catch (Throwable unused2) {
        }
        return cookieManager;
    }

    /* renamed from: a */
    public static String m26982a(String str) {
        AbstractC14734c cVar;
        if (!C13627m.m24498a(str) && (cVar = f35919h) != null) {
            return cVar.mo23732a(str);
        }
        return str;
    }

    /* renamed from: b */
    public static String m26993b(String str) {
        AbstractC14733b bVar = f35917f;
        if (bVar != null) {
            return bVar.mo23730a(str);
        }
        return str;
    }

    /* renamed from: a */
    public static synchronized void m26987a(AbstractC14742k kVar) {
        synchronized (C14731e.class) {
            MethodCollector.m26663i(8802);
            f35928q = kVar;
            MethodCollector.m26664o(8802);
        }
    }

    /* renamed from: a */
    public static void m26989a(String str, Throwable th) {
        C13627m.m24498a(str);
    }

    /* renamed from: a */
    public static Map<String, String> m26983a(String str, Map<String, List<String>> map) {
        AbstractC14732a aVar = f35922k;
        if (aVar != null) {
            return aVar.mo23729a(str, map);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m26990a(int i, Map<String, List<String>> map) {
        if (i != 200 || Looper.getMainLooper() == Looper.myLooper() || f35928q == null) {
            return false;
        }
        boolean a = f35928q.mo21481a(map);
        map.remove("bdturing-verify");
        return a;
    }

    /* renamed from: a */
    public static void m26988a(String str, String str2, boolean z) {
        AbstractC14734c cVar;
        if (!C13627m.m24498a(str) && !C13627m.m24498a(str2) && (cVar = f35919h) != null) {
            cVar.mo23733a(str, str2, z);
        }
    }

    /* renamed from: a */
    public static void m26985a(long j, long j2, String str, String str2, C14612a aVar) {
        AbstractC14740i iVar = f35918g;
        if (!C13627m.m24498a(str) && j > 0 && iVar != null) {
            if (!aVar.f35347A || !aVar.f35356J.get()) {
                if (aVar.f35347A) {
                    aVar.f35356J.set(true);
                }
                iVar.mo23740a(j, j2, str, str2, aVar);
            }
        }
    }

    /* renamed from: a */
    public static void m26986a(long j, long j2, String str, String str2, C14612a aVar, Throwable th) {
        AbstractC14740i iVar;
        if (!C13627m.m24498a(str) && th != null && (iVar = f35918g) != null) {
            if (aVar.f35347A) {
                aVar.f35356J.set(true);
            }
            iVar.mo23741a(j, j2, str, str2, aVar, th);
        }
    }
}
