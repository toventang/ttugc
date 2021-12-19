package com.bytedance.lobby.p1492a;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;

/* renamed from: com.bytedance.lobby.a.a */
public final class C20880a {

    /* renamed from: a */
    private static volatile C20880a f49365a;

    /* renamed from: b */
    private Map<String, AbstractC20881b> f49366b = new C0484a();

    static {
        Covode.recordClassIndex(24467);
    }

    private C20880a() {
    }

    /* renamed from: a */
    public static C20880a m39236a() {
        MethodCollector.m26663i(6076);
        if (f49365a == null) {
            synchronized (C20880a.class) {
                try {
                    if (f49365a == null) {
                        f49365a = new C20880a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6076);
                    throw th;
                }
            }
        }
        C20880a aVar = f49365a;
        MethodCollector.m26664o(6076);
        return aVar;
    }

    /* renamed from: a */
    public final synchronized void mo34313a(AbstractC20881b bVar) {
        MethodCollector.m26663i(6077);
        this.f49366b.put(bVar.mo34362e().f49402b, bVar);
        MethodCollector.m26664o(6077);
    }
}
