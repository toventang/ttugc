package com.bytedance.webx.p1769i.p1772b;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.p1769i.C23629a;
import com.bytedance.webx.p1769i.p1774d.C23642b;
import com.bytedance.webx.p1769i.p1775e.C23651a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.webx.i.b.a */
public class C23638a {

    /* renamed from: a */
    public static long f55929a;

    /* renamed from: c */
    private static C23638a f55930c;

    /* renamed from: b */
    public SharedPreferences f55931b;

    /* renamed from: d */
    private Map<String, C23639a> f55932d = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(27737);
    }

    private C23638a() {
        SharedPreferences a = C34822d.m71158a(C23629a.f55912a, "sec_config", 0);
        this.f55931b = a;
        f55929a = a.getLong("valid_time", 900000);
    }

    /* renamed from: a */
    public static C23638a m44697a() {
        MethodCollector.m26663i(7550);
        if (f55930c == null) {
            synchronized (C23638a.class) {
                try {
                    if (f55930c == null) {
                        f55930c = new C23638a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7550);
                    throw th;
                }
            }
        }
        C23638a aVar = f55930c;
        MethodCollector.m26664o(7550);
        return aVar;
    }

    /* renamed from: com.bytedance.webx.i.b.a$a */
    public static class C23639a {

        /* renamed from: a */
        public long f55933a = System.currentTimeMillis();

        /* renamed from: b */
        public C23642b f55934b;

        static {
            Covode.recordClassIndex(27738);
        }

        C23639a(C23642b bVar) {
            this.f55934b = bVar;
        }
    }

    /* renamed from: c */
    private void m44698c(String str) {
        this.f55932d.remove(str);
        this.f55932d.remove(str + "/");
    }

    /* renamed from: d */
    private boolean m44699d(String str) {
        C23639a aVar = this.f55932d.get(str);
        if (aVar == null) {
            return false;
        }
        if (System.currentTimeMillis() - aVar.f55933a <= f55929a) {
            return true;
        }
        C23651a.m44724b("UrlSecLinkCache");
        m44698c(str);
        return false;
    }

    /* renamed from: a */
    public final boolean mo39059a(String str) {
        boolean z;
        boolean d = m44699d(str);
        if (str.length() > 0) {
            z = m44699d(str.substring(0, str.length() - 1));
        } else {
            z = false;
        }
        boolean d2 = m44699d(str + "/");
        if (d || z || d2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C23642b mo39060b(String str) {
        C23639a aVar;
        C23639a aVar2;
        if (!mo39059a(str)) {
            return null;
        }
        C23639a aVar3 = this.f55932d.get(str);
        if (aVar3 != null) {
            return aVar3.f55934b;
        }
        if (str.length() > 0 && (aVar2 = this.f55932d.get(str.substring(0, str.length() - 1))) != null) {
            return aVar2.f55934b;
        }
        if (str.length() <= 0 || (aVar = this.f55932d.get(str + "/")) == null) {
            return null;
        }
        return aVar.f55934b;
    }

    /* renamed from: a */
    public final void mo39058a(String str, C23642b bVar) {
        this.f55932d.put(str, new C23639a(bVar));
    }
}
