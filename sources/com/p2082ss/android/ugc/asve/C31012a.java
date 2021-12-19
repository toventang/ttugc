package com.p2082ss.android.ugc.asve;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.context.AbstractC31036e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.a */
public final class C31012a {

    /* renamed from: a */
    public static final String f74335a = "AS";

    /* renamed from: b */
    public static Application f74336b;

    /* renamed from: c */
    public static final C31012a f74337c = new C31012a();

    /* renamed from: d */
    private static AbstractC31036e f74338d;

    private C31012a() {
    }

    /* renamed from: a */
    public static AbstractC31036e m63724a() {
        AbstractC31036e eVar = f74338d;
        if (eVar == null) {
            C89219l.m154710a("context");
        }
        return eVar;
    }

    /* renamed from: b */
    public static Application m63726b() {
        Application application = f74336b;
        if (application == null) {
            C89219l.m154710a("applicationContext");
        }
        return application;
    }

    static {
        Covode.recordClassIndex(37641);
    }

    /* renamed from: a */
    public static void m63725a(AbstractC31036e eVar) {
        C89219l.m154721d(eVar, "");
        f74338d = eVar;
        eVar.mo56191e().mkdirs();
        C31054e.f74392a.mo56237a();
    }
}
