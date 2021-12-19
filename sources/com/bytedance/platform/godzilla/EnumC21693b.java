package com.bytedance.platform.godzilla;

import android.app.Activity;
import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1574a.AbstractC21687e;
import com.bytedance.platform.godzilla.p1574a.AbstractC21692h;
import com.bytedance.platform.godzilla.p1574a.C21684b;
import com.bytedance.platform.godzilla.p1574a.C21689g;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.bytedance.platform.godzilla.b */
public enum EnumC21693b {
    INSTANCE;
    

    /* renamed from: a */
    private static HashMap<Integer, WeakReference<Activity>> f51465a = new HashMap<>();

    /* renamed from: b */
    private C21684b f51467b;

    static {
        Covode.recordClassIndex(25334);
    }

    public final void destroy() {
        MethodCollector.m26663i(7350);
        C21684b bVar = this.f51467b;
        if (bVar != null) {
            synchronized (bVar.f51460c) {
                try {
                    bVar.f51460c.clear();
                } finally {
                    MethodCollector.m26664o(7350);
                }
            }
            return;
        }
        MethodCollector.m26664o(7350);
    }

    public final void removeUncaughtExceptionConsumer(AbstractC21692h hVar) {
        "remove consumer:".concat(String.valueOf(hVar));
        C21689g.m40635a(C21689g.EnumC21691a.INFO);
        this.f51467b.mo35341b(hVar);
    }

    public final void addUncaughtExceptionConsumer(AbstractC21692h hVar) {
        if (this.f51467b == null) {
            C21684b bVar = new C21684b();
            this.f51467b = bVar;
            if (!bVar.f51458a) {
                bVar.f51459b = Thread.getDefaultUncaughtExceptionHandler();
                if (bVar.f51459b != bVar) {
                    Thread.setDefaultUncaughtExceptionHandler(bVar);
                } else {
                    bVar.f51459b = null;
                }
                bVar.f51458a = true;
            }
        }
        C21689g.m40635a(C21689g.EnumC21691a.INFO);
        "add consumer:".concat(String.valueOf(hVar));
        C21689g.m40635a(C21689g.EnumC21691a.INFO);
        this.f51467b.mo35340a(hVar);
    }

    public final void init(Application application, AbstractC21687e eVar, C21689g.EnumC21691a aVar) {
        if (eVar != null) {
            C21689g.f51463c = eVar;
        }
        if (aVar != null) {
            C21689g.f51461a = aVar;
            if (aVar == C21689g.EnumC21691a.DEBUG) {
                C21689g.f51462b = true;
            }
        }
    }
}
