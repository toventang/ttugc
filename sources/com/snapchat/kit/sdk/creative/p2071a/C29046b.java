package com.snapchat.kit.sdk.creative.p2071a;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.snapchat.kit.sdk.core.metrics.C28979a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;

/* renamed from: com.snapchat.kit.sdk.creative.a.b */
public final class C29046b {

    /* renamed from: a */
    private static final String f68616a = "1.12.0".replace('.', '_');

    /* renamed from: b */
    private final MetricQueue<OpMetric> f68617b;

    static {
        Covode.recordClassIndex(35392);
    }

    public C29046b(MetricQueue<OpMetric> metricQueue) {
        this.f68617b = metricQueue;
    }

    /* renamed from: b */
    private static String m58032b(String str) {
        return C1764a.m5928a("%s:creative:%s", new Object[]{f68616a, str});
    }

    /* renamed from: a */
    public final synchronized void mo50719a(String str) {
        MethodCollector.m26663i(4224);
        this.f68617b.push(C28979a.m57990a(m58032b(str)));
        MethodCollector.m26664o(4224);
    }

    /* renamed from: a */
    public final synchronized void mo50720a(String str, long j) {
        MethodCollector.m26663i(4234);
        this.f68617b.push(C28979a.m57991a(m58032b(str), j));
        MethodCollector.m26664o(4234);
    }
}
