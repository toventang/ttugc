package com.p2082ss.android.ugc.aweme.hybridkit;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask;
import com.p2082ss.android.ugc.aweme.hybridkit.task.HybridKitInitTask;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;

/* renamed from: com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl */
public final class HybridKitTaskImpl implements IHybridKitService {
    static {
        Covode.recordClassIndex(62959);
    }

    @Override // com.p2082ss.android.ugc.aweme.hybridkit.IHybridKitService
    /* renamed from: a */
    public final AbstractC58264w mo89989a() {
        return new HybridKitConfigTask();
    }

    @Override // com.p2082ss.android.ugc.aweme.hybridkit.IHybridKitService
    /* renamed from: b */
    public final AbstractC58264w mo89990b() {
        return new HybridKitInitTask();
    }

    /* renamed from: c */
    public static IHybridKitService m98506c() {
        MethodCollector.m26663i(1219);
        Object a = C81908b.m141854a(IHybridKitService.class, false);
        if (a != null) {
            IHybridKitService iHybridKitService = (IHybridKitService) a;
            MethodCollector.m26664o(1219);
            return iHybridKitService;
        }
        if (C81908b.f183243bt == null) {
            synchronized (IHybridKitService.class) {
                try {
                    if (C81908b.f183243bt == null) {
                        C81908b.f183243bt = new HybridKitTaskImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1219);
                    throw th;
                }
            }
        }
        HybridKitTaskImpl hybridKitTaskImpl = (HybridKitTaskImpl) C81908b.f183243bt;
        MethodCollector.m26664o(1219);
        return hybridKitTaskImpl;
    }
}
