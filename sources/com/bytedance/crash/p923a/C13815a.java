package com.bytedance.crash.p923a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.C13928k;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.entity.C13870g;
import com.bytedance.crash.p932j.C13905e;
import com.bytedance.crash.runtime.C14022p;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.crash.a.a */
public class C13815a {

    /* renamed from: e */
    private static volatile C13815a f33581e;

    /* renamed from: a */
    public volatile String f33582a;

    /* renamed from: b */
    public volatile AbstractC13817c f33583b;

    /* renamed from: c */
    public volatile AbstractC13818d f33584c;

    /* renamed from: d */
    public volatile boolean f33585d;

    static {
        Covode.recordClassIndex(15872);
    }

    private C13815a() {
    }

    /* renamed from: b */
    public final boolean mo22257b() {
        if (this.f33582a != null || (C13928k.f33933c != null && C13928k.f33933c.mo22368a())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C13815a m24932a() {
        MethodCollector.m26663i(779);
        if (f33581e == null) {
            synchronized (C13815a.class) {
                try {
                    if (f33581e == null) {
                        f33581e = new C13815a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(779);
                    throw th;
                }
            }
        }
        C13815a aVar = f33581e;
        MethodCollector.m26664o(779);
        return aVar;
    }

    /* renamed from: c */
    public final void mo22258c() {
        if (C13928k.f33931a != null) {
            C13933m.f33942g.isDebugMode();
            try {
                if (C13928k.f33931a != null) {
                    C13928k.f33931a.run();
                }
            } catch (Throwable unused) {
            }
        } else if (this.f33583b != null) {
            try {
                this.f33583b.mo22260a();
            } catch (Throwable th) {
                C13849d.m25014a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: a */
    public static String m24933a(List<String> list, String str) {
        String str2;
        new StringBuilder("upload alog ").append(str).append(": ").append(list);
        C13933m.f33942g.isDebugMode();
        try {
            C13870g gVar = new C13870g();
            Map<String, Object> a = C13933m.m25221a().mo22518a();
            if (a != null) {
                gVar.f33782f = String.valueOf(a.get("aid"));
            }
            gVar.f33781e = C13933m.m25226b().mo22549a();
            gVar.f33783g = str;
            gVar.f33784h = list;
            if (TextUtils.isEmpty(gVar.f33782f)) {
                str2 = "no_aid";
            } else if (TextUtils.isEmpty(gVar.f33781e)) {
                str2 = "no_did";
            } else if (TextUtils.isEmpty(gVar.f33783g)) {
                str2 = "no_process";
            } else if (gVar.f33784h == null || gVar.f33784h.size() == 0) {
                str2 = "no_files";
            } else {
                str2 = "normal";
            }
            if (!str2.equals("normal")) {
                return str2;
            }
            C13905e.m25158a();
            return C13905e.m25159a(gVar.f33782f, gVar.f33781e, gVar.f33783g, gVar.f33784h) ? "unknown" : "unknown";
        } catch (Throwable th) {
            C13849d.m25014a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    public final List<String> mo22256a(long j, String str) {
        boolean z;
        AbstractC13818d dVar;
        if (C13928k.f33932b != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C13933m.f33942g.isDebugMode();
            try {
                if (C13928k.f33932b == null) {
                    return null;
                }
                return C13928k.f33932b.mo22367a(j, str);
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(this.f33582a) || !new File(this.f33582a).exists()) {
            return null;
        }
        String str2 = this.f33582a;
        if (this.f33584c instanceof C13816b) {
            dVar = new C13816b(str);
        } else {
            dVar = this.f33584c;
        }
        return m24934a(str2, j, str, dVar);
    }

    /* renamed from: a */
    private static List<String> m24934a(String str, long j, String str2, AbstractC13818d dVar) {
        if (TextUtils.isEmpty(str) || !new File(str).exists() || dVar == null) {
            return null;
        }
        List<String> a = dVar.mo22259a(str, j);
        if (!a.isEmpty() && str2 != null) {
            for (String str3 : a) {
                C13933m.f33942g.isDebugMode();
                C14022p.m25428a("collectAlog", str3);
            }
        }
        return a;
    }
}
