package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.CounterMetric;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.TimerMetric;
import com.snapchat.kit.sdk.core.metrics.model.Timestamp;
import java.util.concurrent.TimeUnit;

/* renamed from: com.snapchat.kit.sdk.core.metrics.a */
public final class C28979a {

    /* renamed from: a */
    private static final long f68459a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b */
    private static final int f68460b = ((int) TimeUnit.MILLISECONDS.toNanos(1));

    static {
        Covode.recordClassIndex(35176);
    }

    /* renamed from: a */
    private static Timestamp m57992a() {
        long currentTimeMillis = System.currentTimeMillis();
        Timestamp.Builder builder = new Timestamp.Builder();
        long j = f68459a;
        return builder.seconds(Long.valueOf(currentTimeMillis / j)).nanos(Integer.valueOf(((int) (currentTimeMillis % j)) * f68460b)).build();
    }

    /* renamed from: a */
    public static OpMetric m57990a(String str) {
        return new OpMetric.Builder().counter_metric(new CounterMetric.Builder().name(str).count(1L).timestamp(m57992a()).build()).build();
    }

    /* renamed from: a */
    public static OpMetric m57991a(String str, long j) {
        return new OpMetric.Builder().timer_metric(new TimerMetric.Builder().name(str).latency_millis(Long.valueOf(j)).timestamp(m57992a()).build()).build();
    }
}
