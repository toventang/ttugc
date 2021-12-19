package com.p2082ss.android.ugc.aweme.utils.permission;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC33485al;
import com.p2082ss.android.ugc.aweme.app.C33748g;

/* renamed from: com.ss.android.ugc.aweme.utils.permission.c */
public class C80618c implements AbstractC33485al {

    /* renamed from: a */
    private static volatile C80618c f180265a;

    /* renamed from: b */
    private boolean f180266b = true;

    static {
        Covode.recordClassIndex(93892);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: b */
    public final void mo59569b() {
    }

    private C80618c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: a */
    public final void mo59568a() {
        C33748g.m69093a();
    }

    /* renamed from: c */
    public static C80618c m139773c() {
        MethodCollector.m26663i(6765);
        if (f180265a == null) {
            synchronized (C80618c.class) {
                try {
                    if (f180265a == null) {
                        f180265a = new C80618c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6765);
                    throw th;
                }
            }
        }
        C80618c cVar = f180265a;
        MethodCollector.m26664o(6765);
        return cVar;
    }
}
