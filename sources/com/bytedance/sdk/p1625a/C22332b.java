package com.bytedance.sdk.p1625a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1734ug.p1735a.AbstractC23452j;
import com.bytedance.p1734ug.p1735a.C23457o;
import com.bytedance.p1734ug.p1735a.C23459q;
import com.p2082ss.android.account.C29351f;

/* renamed from: com.bytedance.sdk.a.b */
public class C22332b {

    /* renamed from: c */
    private static volatile C22332b f52770c;

    /* renamed from: a */
    public AbstractC23452j f52771a;

    /* renamed from: b */
    public boolean f52772b;

    static {
        Covode.recordClassIndex(26148);
    }

    private C22332b() {
        if (this.f52771a == null) {
            C23457o oVar = new C23457o();
            oVar.f55614a = C29351f.m58781a().mo52210b();
            oVar.f55617d = false;
            oVar.f55615b = "account";
            oVar.f55616c = "0.1.9";
            oVar.f55618e = 0;
            this.f52771a = C23459q.m44149a(oVar.mo38218a());
        }
    }

    /* renamed from: a */
    public static C22332b m42039a() {
        MethodCollector.m26663i(3340);
        if (f52770c == null) {
            synchronized (C22332b.class) {
                try {
                    if (f52770c == null) {
                        f52770c = new C22332b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3340);
                    throw th;
                }
            }
        }
        C22332b bVar = f52770c;
        MethodCollector.m26664o(3340);
        return bVar;
    }

    /* renamed from: a */
    public final void mo36672a(boolean z, String str) {
        AbstractC23452j jVar = this.f52771a;
        if (jVar != null && this.f52772b) {
            int i = 0;
            if (!z) {
                i = 301;
            }
            jVar.mo38216a("1003", i, str);
        }
    }

    /* renamed from: b */
    public final void mo36673b(boolean z, String str) {
        AbstractC23452j jVar = this.f52771a;
        if (jVar != null && this.f52772b) {
            int i = 0;
            if (!z) {
                i = 401;
            }
            jVar.mo38216a("1004", i, str);
        }
    }
}
