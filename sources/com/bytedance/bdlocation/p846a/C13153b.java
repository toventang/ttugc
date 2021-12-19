package com.bytedance.bdlocation.p846a;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.lifecycle.C1216w;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.C13182f;
import com.bytedance.bdlocation.p847b.AbstractC13159a;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bdlocation.p850e.AbstractC13168a;
import com.bytedance.bdlocation.service.C13190a;
import com.bytedance.bdlocation.utils.ActivityLifecycleUtils;
import com.bytedance.bdlocation.utils.C13229b;
import com.bytedance.bdlocation.utils.C13230c;
import com.bytedance.bdlocation.utils.C13232d;
import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.bytedance.bdlocation.a.b */
public final class C13153b {

    /* renamed from: A */
    private static SparseArray<List<Object>> f32039A = new SparseArray<>();

    /* renamed from: B */
    private static final Object f32040B = new Object();

    /* renamed from: C */
    private static final List<Object> f32041C = new ArrayList();

    /* renamed from: a */
    public static int f32042a = 1;

    /* renamed from: b */
    public static int f32043b;

    /* renamed from: c */
    public static boolean f32044c;

    /* renamed from: d */
    public static boolean f32045d;

    /* renamed from: e */
    public static boolean f32046e = true;

    /* renamed from: f */
    public static boolean f32047f = true;

    /* renamed from: g */
    public static boolean f32048g = true;

    /* renamed from: h */
    public static long f32049h = 3600;

    /* renamed from: i */
    public static long f32050i = 86400;

    /* renamed from: j */
    public static int f32051j = 7;

    /* renamed from: k */
    public static boolean f32052k = true;

    /* renamed from: l */
    public static int f32053l = 30000;

    /* renamed from: m */
    public static long f32054m = 604800000;

    /* renamed from: n */
    public static boolean f32055n = true;

    /* renamed from: o */
    public static long f32056o = -1;

    /* renamed from: p */
    public static int f32057p = 2;

    /* renamed from: q */
    public static boolean f32058q = true;

    /* renamed from: r */
    public static boolean f32059r = true;

    /* renamed from: s */
    public static Locale f32060s;

    /* renamed from: t */
    public static String f32061t;

    /* renamed from: u */
    public static String f32062u = "";

    /* renamed from: v */
    public static Context f32063v;

    /* renamed from: w */
    public static BDLocation f32064w;

    /* renamed from: x */
    public static C13230c f32065x;

    /* renamed from: y */
    public static AbstractC13168a f32066y;

    /* renamed from: z */
    public static AbstractC13159a f32067z;

    /* renamed from: b */
    public static boolean m23674b() {
        if (f32063v != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m23676d() {
        if (f32043b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m23670a() {
        if (f32063v == null) {
            throw new RuntimeException("Must be called after BDLocation initialization!");
        }
    }

    /* renamed from: e */
    public static int m23677e() {
        if (C13182f.m23712b()) {
            return f32042a;
        }
        return 1;
    }

    /* renamed from: c */
    public static void m23675c() {
        MethodCollector.m26663i(2079);
        List<Object> list = f32041C;
        if (list.isEmpty()) {
            MethodCollector.m26664o(2079);
            return;
        }
        synchronized (f32040B) {
            try {
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } finally {
                MethodCollector.m26664o(2079);
            }
        }
    }

    static {
        Covode.recordClassIndex(15100);
    }

    /* renamed from: a */
    public static void m23671a(int i) {
        while (i < 6) {
            List<Object> list = f32039A.get(i);
            if (list != null) {
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            i++;
        }
    }

    /* renamed from: a */
    public static void m23673a(String str) {
        if (!TextUtils.isEmpty(str) && !str.contains("https")) {
            if (!f32045d) {
                C13162b.m23691e("BDLocation", "The current location result is not encrypted by HTTPS, and the use of clear text information violates the compliance requirements. Please modify it to HTTPS");
            } else {
                throw new IllegalArgumentException("The current location result is not encrypted by HTTPS, and the use of clear text information violates the compliance requirements. Please modify it to HTTPS");
            }
        }
        f32062u = str;
    }

    /* renamed from: a */
    public static void m23672a(Application application, AbstractC13343d dVar) {
        C13229b.m23789a(dVar, "init");
        SystemClock.elapsedRealtime();
        if (f32063v != null) {
            return;
        }
        if (!TextUtils.isEmpty(f32062u)) {
            C13162b.m23689c("BDLocation", "start location init");
            try {
                Context applicationContext = application.getApplicationContext();
                if (C58003a.f132201c) {
                    if (applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                }
                f32063v = applicationContext;
                if (f32065x == null) {
                    C13232d dVar2 = new C13232d();
                    ActivityLifecycleUtils.m23781a(dVar2);
                    C1216w.f4006i.getLifecycle().mo4012a(new ActivityLifecycleUtils());
                    C13230c cVar = f32065x;
                    C13230c.AbstractC13231a aVar = null;
                    if (cVar != null) {
                        C13230c.AbstractC13231a aVar2 = cVar.f32338a;
                        f32065x.f32338a = null;
                        aVar = aVar2;
                    }
                    f32065x = dVar2;
                    if (aVar != null) {
                        dVar2.f32338a = aVar;
                    }
                }
                C13190a.m23731a();
                f32043b = C13190a.m23731a().f32206a.mo21281a("RestrictedMode");
                f32044c = C13190a.m23731a().f32206a.f32185a.getBoolean("IsStrictRestrictedMode", false);
            } catch (Exception e) {
                C13162b.m23689c("BDLocation", "init error:" + e.getMessage());
            }
        } else {
            throw new IllegalStateException("The base url must be configured before initialization of SDK");
        }
    }
}
