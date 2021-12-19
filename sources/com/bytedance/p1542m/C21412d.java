package com.bytedance.p1542m;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1542m.p1544b.AbstractC21410b;
import com.bytedance.p1542m.p1544b.C21409a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.m.d */
public class C21412d {

    /* renamed from: c */
    private static volatile C21412d f50801c;

    /* renamed from: a */
    public final List<AbstractC21410b> f50802a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final Map<String, C21409a> f50803b = new HashMap();

    /* renamed from: d */
    private Handler f50804d = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(25032);
    }

    private C21412d() {
    }

    /* renamed from: a */
    public static C21412d m40193a() {
        MethodCollector.m26663i(9655);
        if (f50801c == null) {
            synchronized (C21412d.class) {
                try {
                    if (f50801c == null) {
                        f50801c = new C21412d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9655);
                    throw th;
                }
            }
        }
        C21412d dVar = f50801c;
        MethodCollector.m26664o(9655);
        return dVar;
    }

    /* renamed from: a */
    public final void mo35015a(C21409a aVar) {
        MethodCollector.m26663i(9801);
        if (aVar == null || aVar.f50788a == null) {
            MethodCollector.m26664o(9801);
            return;
        }
        synchronized (this.f50803b) {
            try {
                final C21409a aVar2 = this.f50803b.get(aVar.f50788a);
                if (aVar2 != null) {
                    aVar2.f50790c = aVar.f50790c;
                    aVar2.f50789b = aVar.f50789b;
                    aVar2.f50794g = aVar.f50794g;
                    aVar2.f50796i = aVar.f50796i;
                    aVar2.f50795h = aVar.f50795h;
                    aVar2.f50792e = aVar.f50792e;
                    aVar2.f50791d = aVar.f50791d;
                    this.f50804d.post(new Runnable() {
                        /* class com.bytedance.p1542m.C21412d.RunnableC214131 */

                        static {
                            Covode.recordClassIndex(25033);
                        }

                        public final void run() {
                            for (AbstractC21410b bVar : C21412d.this.f50802a) {
                                bVar.mo35014a(aVar2);
                            }
                        }
                    });
                }
            } finally {
                MethodCollector.m26664o(9801);
            }
        }
    }
}
