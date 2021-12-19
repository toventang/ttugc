package com.lynx.tasm.behavior;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.WeakHashMap;

/* renamed from: com.lynx.tasm.behavior.h */
public class C28517h {

    /* renamed from: b */
    private static volatile C28517h f67055b;

    /* renamed from: a */
    public WeakHashMap<AbstractC28520j, C28512g> f67056a = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(34515);
    }

    private C28517h() {
    }

    /* renamed from: a */
    public static C28517h m56984a() {
        MethodCollector.m26663i(1498);
        if (f67055b == null) {
            synchronized (C28517h.class) {
                try {
                    if (f67055b == null) {
                        f67055b = new C28517h();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1498);
                    throw th;
                }
            }
        }
        C28517h hVar = f67055b;
        MethodCollector.m26664o(1498);
        return hVar;
    }

    /* renamed from: a */
    public final void mo49025a(AbstractC28520j jVar) {
        C28512g gVar = this.f67056a.get(jVar);
        if (gVar != null) {
            gVar.mo49019c();
        }
        this.f67056a.remove(jVar);
    }
}
