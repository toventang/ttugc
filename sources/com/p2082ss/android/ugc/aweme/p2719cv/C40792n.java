package com.p2082ss.android.ugc.aweme.p2719cv;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.cv.n */
public final class C40792n {

    /* renamed from: a */
    private final Map<String, WeakReference<ExecutorService>> f95513a = new HashMap();

    /* renamed from: b */
    private Map<EnumC40793o, AtomicInteger> f95514b = new HashMap();

    static {
        Covode.recordClassIndex(48644);
    }

    C40792n() {
    }

    public final String toString() {
        MethodCollector.m26663i(5038);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, WeakReference<ExecutorService>> entry : this.f95513a.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue().get() != null) {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) entry.getValue().get();
                sb.append("pool=").append(key).append(", core.size=").append(threadPoolExecutor.getCorePoolSize()).append(", pool.size=").append(threadPoolExecutor.getPoolSize()).append(", largest.pool.size=").append(threadPoolExecutor.getLargestPoolSize()).append(", queue.size=").append(threadPoolExecutor.getQueue().size()).append(", task.count=").append(threadPoolExecutor.getTaskCount()).append(", task.completed.count=").append(threadPoolExecutor.getCompletedTaskCount()).append("\n");
            }
        }
        String sb2 = sb.toString();
        MethodCollector.m26664o(5038);
        return sb2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70030a(EnumC40793o oVar, ExecutorService executorService, boolean z) {
        if (z) {
            this.f95513a.put(oVar.name(), new WeakReference<>(executorService));
            return;
        }
        if (this.f95514b.get(oVar) == null) {
            this.f95514b.put(oVar, new AtomicInteger(0));
        }
        this.f95513a.put(oVar.name() + "_" + this.f95514b.get(oVar).incrementAndGet(), new WeakReference<>(executorService));
    }
}
