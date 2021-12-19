package com.snapchat.kit.sdk.core.metrics.p2068a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.C29005d;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.model.Metrics;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.p2069b.C28991a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p4640l.AbstractC89716b;
import p4640l.AbstractC89743d;
import p4640l.C89781l;

/* renamed from: com.snapchat.kit.sdk.core.metrics.a.a */
public final class C28980a implements MetricPublisher<OpMetric> {

    /* renamed from: a */
    private final SharedPreferences f68461a;

    /* renamed from: b */
    private final MetricsClient f68462b;

    /* renamed from: c */
    private final C28991a f68463c;

    static {
        Covode.recordClassIndex(35177);
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final List<C29005d<OpMetric>> getPersistedEvents() {
        return this.f68463c.mo50363a(OpMetric.ADAPTER, this.f68461a.getString("unsent_operational_metrics", null));
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final void persistMetrics(List<C29005d<OpMetric>> list) {
        this.f68461a.edit().putString("unsent_operational_metrics", this.f68463c.mo50362a(list)).apply();
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final void publishMetrics(List<OpMetric> list, final MetricPublisher.PublishCallback publishCallback) {
        MetricsClient metricsClient = this.f68462b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (OpMetric opMetric : list) {
            if (opMetric.counter_metric != null) {
                arrayList.add(opMetric.counter_metric);
            } else if (opMetric.timer_metric != null) {
                arrayList2.add(opMetric.timer_metric);
            } else if (opMetric.level_metric != null) {
                arrayList3.add(opMetric.level_metric);
            }
        }
        metricsClient.postOperationalMetrics(new Metrics.Builder().counters(arrayList).timers(arrayList2).levels(arrayList3).build()).mo144268a(new AbstractC89743d<Void>() {
            /* class com.snapchat.kit.sdk.core.metrics.p2068a.C28980a.C289811 */

            static {
                Covode.recordClassIndex(35178);
            }

            @Override // p4640l.AbstractC89743d
            /* renamed from: a */
            public final void mo34286a(AbstractC89716b<Void> bVar, Throwable th) {
                if (th instanceof IOException) {
                    publishCallback.onNetworkError();
                } else {
                    publishCallback.onServerError(new Error(th));
                }
            }

            @Override // p4640l.AbstractC89743d
            /* renamed from: a */
            public final void mo34287a(AbstractC89716b<Void> bVar, C89781l<Void> lVar) {
                if (lVar.f203560a.mo144720a()) {
                    publishCallback.onSuccess();
                    return;
                }
                try {
                    publishCallback.onServerError(new Error(lVar.f203562c.string()));
                } catch (IOException | NullPointerException unused) {
                    publishCallback.onServerError(new Error("response unsuccessful"));
                }
            }
        });
    }

    C28980a(SharedPreferences sharedPreferences, MetricsClient metricsClient, C28991a aVar) {
        this.f68461a = sharedPreferences;
        this.f68462b = metricsClient;
        this.f68463c = aVar;
    }
}
