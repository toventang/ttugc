package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: org.greenrobot.eventbus.o */
public final class C90261o {

    /* renamed from: d */
    private static final List<C90261o> f205027d = new ArrayList();

    /* renamed from: a */
    Object f205028a;

    /* renamed from: b */
    C90269v f205029b;

    /* renamed from: c */
    C90261o f205030c;

    static {
        Covode.recordClassIndex(106532);
    }

    /* renamed from: a */
    static void m157009a(C90261o oVar) {
        MethodCollector.m26663i(12423);
        oVar.f205028a = null;
        oVar.f205029b = null;
        oVar.f205030c = null;
        List<C90261o> list = f205027d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(oVar);
                }
            } finally {
                MethodCollector.m26664o(12423);
            }
        }
    }

    private C90261o(Object obj, C90269v vVar) {
        this.f205028a = obj;
        this.f205029b = vVar;
    }

    /* renamed from: a */
    static C90261o m157008a(C90269v vVar, Object obj) {
        MethodCollector.m26663i(12422);
        List<C90261o> list = f205027d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size > 0) {
                    C90261o remove = list.remove(size - 1);
                    remove.f205028a = obj;
                    remove.f205029b = vVar;
                    remove.f205030c = null;
                    return remove;
                }
                C90261o oVar = new C90261o(obj, vVar);
                MethodCollector.m26664o(12422);
                return oVar;
            } finally {
                MethodCollector.m26664o(12422);
            }
        }
    }
}
