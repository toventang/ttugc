package com.bytedance.push.p1596g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1734ug.p1735a.AbstractC23452j;
import com.bytedance.p1734ug.p1735a.C23457o;
import com.bytedance.p1734ug.p1735a.C23459q;
import com.bytedance.push.C21798f;
import com.p2082ss.android.message.C30061a;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.g.a */
class C21823a {

    /* renamed from: a */
    private static volatile AbstractC23452j f51717a;

    static {
        Covode.recordClassIndex(25475);
    }

    C21823a() {
    }

    /* renamed from: a */
    private static AbstractC23452j m40877a() {
        MethodCollector.m26663i(4712);
        if (f51717a == null) {
            synchronized (C21823a.class) {
                try {
                    if (f51717a == null) {
                        C23457o oVar = new C23457o();
                        oVar.f55614a = C30061a.f71748a;
                        oVar.f55617d = C21798f.f51646a.mo35453j().mo35477a();
                        oVar.f55615b = "push";
                        oVar.f55616c = "3.2.3-alpha.16-tiktok";
                        oVar.f55618e = 1;
                        f51717a = C23459q.m44149a(oVar.mo38218a());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4712);
                    throw th;
                }
            }
        }
        AbstractC23452j jVar = f51717a;
        MethodCollector.m26664o(4712);
        return jVar;
    }

    /* renamed from: a */
    static void m40878a(String str, int i, String str2, JSONObject jSONObject) {
        m40877a().mo38217a(str, i, str2, jSONObject);
    }
}
