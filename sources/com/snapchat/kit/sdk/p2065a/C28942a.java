package com.snapchat.kit.sdk.p2065a;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.snapchat.kit.sdk.core.metrics.C28979a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import dagger.AbstractC88075a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.snapchat.kit.sdk.a.a */
public final class C28942a {

    /* renamed from: a */
    private final AbstractC88075a<MetricQueue<OpMetric>> f68381a;

    /* renamed from: b */
    private final Map<EnumC28943a, Long> f68382b = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(35126);
    }

    /* renamed from: com.snapchat.kit.sdk.a.a$a */
    public enum EnumC28943a {
        REVOKE,
        REFRESH,
        GRANT,
        FIREBASE_TOKEN_GRANT;

        static {
            Covode.recordClassIndex(35127);
        }
    }

    public C28942a(AbstractC88075a<MetricQueue<OpMetric>> aVar) {
        this.f68381a = aVar;
    }

    /* renamed from: b */
    private static String m57963b(String str) {
        return C1764a.m5928a("%s:login:%s", new Object[]{"1.12.0".replace('.', '_'), str});
    }

    /* renamed from: a */
    public final synchronized void mo50270a(String str) {
        MethodCollector.m26663i(6497);
        this.f68381a.get().push(C28979a.m57990a(m57963b(str)));
        MethodCollector.m26664o(6497);
    }

    /* renamed from: a */
    public final synchronized void mo50268a(EnumC28943a aVar) {
        MethodCollector.m26663i(6520);
        this.f68381a.get().push(C28979a.m57990a(m57963b(aVar.toString().toLowerCase() + "TokenRequest")));
        this.f68382b.put(aVar, Long.valueOf(System.currentTimeMillis()));
        MethodCollector.m26664o(6520);
    }

    /* renamed from: a */
    public final synchronized void mo50269a(EnumC28943a aVar, boolean z) {
        MethodCollector.m26663i(6522);
        MetricQueue<OpMetric> metricQueue = this.f68381a.get();
        if (z) {
            Long remove = this.f68382b.remove(aVar);
            if (remove != null) {
                metricQueue.push(C28979a.m57991a(m57963b(aVar.toString().toLowerCase() + "TokenLatency"), System.currentTimeMillis() - remove.longValue()));
            }
            MethodCollector.m26664o(6522);
            return;
        }
        metricQueue.push(C28979a.m57990a(m57963b(aVar.toString().toLowerCase() + "TokenFailure")));
        MethodCollector.m26664o(6522);
    }
}
