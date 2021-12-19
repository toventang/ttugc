package com.facebook.net;

import android.net.Uri;
import com.bytedance.common.utility.C13624l;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ttnet.p1700a.C22905c;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.net.e */
public final class C24902e {

    /* renamed from: a */
    private static volatile C24902e f59109a;

    /* renamed from: b */
    private static final Object f59110b = new Object();

    /* renamed from: c */
    private final ConcurrentHashMap<String, Long> f59111c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private final ConcurrentHashMap<String, C24903a> f59112d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private final ConcurrentHashMap<String, C24904b> f59113e = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(29095);
    }

    /* renamed from: c */
    private static boolean m47737c() {
        if (C22905c.f54101a == null || C22905c.f54101a.f54104b != 1) {
            return false;
        }
        return true;
    }

    private C24902e() {
    }

    /* renamed from: d */
    private static int m47738d() {
        if (C22905c.f54101a == null || C22905c.f54101a.f54106d <= 0) {
            return 5;
        }
        return C22905c.f54101a.f54106d;
    }

    /* renamed from: e */
    private static int m47739e() {
        if (C22905c.f54101a == null || C22905c.f54101a.f54107e <= 0) {
            return 50;
        }
        return C22905c.f54101a.f54107e;
    }

    /* renamed from: a */
    public static C24902e m47734a() {
        MethodCollector.m26663i(7934);
        if (f59109a == null) {
            synchronized (f59110b) {
                try {
                    if (f59109a == null) {
                        f59109a = new C24902e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7934);
                    throw th;
                }
            }
        }
        C24902e eVar = f59109a;
        MethodCollector.m26664o(7934);
        return eVar;
    }

    /* renamed from: b */
    private static boolean m47736b() {
        int i;
        if (C22905c.f54101a != null) {
            i = C22905c.f54101a.mo37244b().getValue();
        } else {
            i = 0;
        }
        if (i == C13624l.EnumC13625a.WIFI.getValue() || i == C13624l.EnumC13625a.MOBILE_4G.getValue() || i == C13624l.EnumC13625a.MOBILE_3G.getValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.net.e$a */
    public class C24903a {

        /* renamed from: a */
        int f59114a;

        /* renamed from: b */
        int f59115b = 1;

        /* renamed from: c */
        boolean f59116c = false;

        /* renamed from: d */
        long f59117d = 0;

        /* renamed from: e */
        int f59118e;

        static {
            Covode.recordClassIndex(29096);
        }

        public C24903a(int i, int i2) {
            this.f59114a = i;
            this.f59118e = i2;
        }
    }

    /* renamed from: a */
    private void m47735a(boolean z, long j, boolean z2) {
        int i;
        long j2;
        try {
            if ((C22905c.f54101a != null && C22905c.f54101a.f54104b == 2) || !z2) {
                return;
            }
            if (this.f59113e.containsKey("p.pstap.com")) {
                C24904b bVar = this.f59113e.get("p.pstap.com");
                if (!z || j <= 0) {
                    bVar.f59121b++;
                } else {
                    bVar.f59120a++;
                    bVar.f59122c += j;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bVar.f59123d > 300000) {
                    if (bVar.f59120a > 0) {
                        j2 = bVar.f59122c / ((long) bVar.f59120a);
                    } else {
                        j2 = 0;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", bVar.f59121b);
                    jSONObject.put("success", bVar.f59120a);
                    jSONObject.put("average_duration", j2);
                    if (m47737c()) {
                        jSONObject.put("has_opt", 1);
                    }
                    bVar.f59121b = 0;
                    bVar.f59120a = 0;
                    bVar.f59122c = 0;
                    bVar.f59123d = currentTimeMillis;
                    return;
                }
                return;
            }
            if (z) {
                i = 0;
            } else {
                i = 1;
            }
            this.f59113e.put("p.pstap.com", new C24904b(z ? 1 : 0, i, j));
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.net.e$b */
    public class C24904b {

        /* renamed from: a */
        int f59120a;

        /* renamed from: b */
        int f59121b;

        /* renamed from: c */
        long f59122c;

        /* renamed from: d */
        long f59123d = System.currentTimeMillis();

        static {
            Covode.recordClassIndex(29097);
        }

        public C24904b(int i, int i2, long j) {
            this.f59120a = i;
            this.f59121b = i2;
            this.f59122c = j;
        }
    }

    /* renamed from: a */
    public final void mo40783a(String str, boolean z, long j, boolean z2) {
        if (!C13627m.m24498a(str) && m47736b()) {
            m47735a(z, j, z2);
            if (m47737c()) {
                try {
                    String host = Uri.parse(str).getHost();
                    int i = 1;
                    if (this.f59112d.containsKey(host)) {
                        C24903a aVar = this.f59112d.get(host);
                        if (aVar == null) {
                            return;
                        }
                        if (!aVar.f59116c) {
                            if (!z) {
                                aVar.f59114a++;
                            }
                            aVar.f59115b++;
                            if (aVar.f59114a >= m47738d() && (aVar.f59114a * 100) / aVar.f59115b >= 10) {
                                aVar.f59116c = true;
                                aVar.f59115b = 0;
                                aVar.f59114a = 0;
                                this.f59111c.put(host, Long.valueOf(System.currentTimeMillis()));
                            } else if (aVar.f59115b > aVar.f59118e) {
                                aVar.f59115b = 0;
                                aVar.f59114a = 0;
                                aVar.f59116c = false;
                            }
                        }
                    } else {
                        if (z) {
                            i = 0;
                        }
                        this.f59112d.put(host, new C24903a(i, m47739e()));
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}
