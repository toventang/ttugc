package com.bytedance.router.arg;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

public final class RouteArgInjector {
    public static final RouteArgInjector INSTANCE = new RouteArgInjector();
    private static final ConcurrentHashMap<WeakReference<AbstractC1204m>, List<AbstractC89171a<C89391z>>> map = new ConcurrentHashMap<>();

    private RouteArgInjector() {
    }

    static {
        Covode.recordClassIndex(25873);
    }

    public final void inject(AbstractC1204m mVar) {
        C89219l.m154719c(mVar, "");
        ConcurrentHashMap<WeakReference<AbstractC1204m>, List<AbstractC89171a<C89391z>>> concurrentHashMap = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<WeakReference<AbstractC1204m>, List<AbstractC89171a<C89391z>>> entry : concurrentHashMap.entrySet()) {
            if (entry.getKey().get() == mVar) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            for (AbstractC89171a aVar : (Iterable) entry2.getValue()) {
                aVar.invoke();
            }
        }
    }

    public final void register(AbstractC1204m mVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(aVar, "");
        if (mVar != null) {
            ConcurrentHashMap<WeakReference<AbstractC1204m>, List<AbstractC89171a<C89391z>>> concurrentHashMap = map;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<WeakReference<AbstractC1204m>, List<AbstractC89171a<C89391z>>> entry : concurrentHashMap.entrySet()) {
                if (entry.getKey().get() == mVar) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.isEmpty()) {
                ConcurrentHashMap<WeakReference<AbstractC1204m>, List<AbstractC89171a<C89391z>>> concurrentHashMap2 = map;
                WeakReference<AbstractC1204m> weakReference = new WeakReference<>(mVar);
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar);
                concurrentHashMap2.put(weakReference, arrayList);
                mVar.getLifecycle().mo4012a(new RouteArgInjector$register$$inlined$let$lambda$1(mVar, aVar));
                return;
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                List list = (List) entry2.getValue();
                if (list != null) {
                    list.add(aVar);
                }
            }
        }
    }
}
