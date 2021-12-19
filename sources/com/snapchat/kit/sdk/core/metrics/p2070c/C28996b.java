package com.snapchat.kit.sdk.core.metrics.p2070c;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.C29005d;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch;
import com.snapchat.kit.sdk.core.metrics.p2069b.C28991a;
import java.io.IOException;
import java.util.List;
import p4640l.AbstractC89716b;
import p4640l.AbstractC89743d;
import p4640l.C89781l;

/* renamed from: com.snapchat.kit.sdk.core.metrics.c.b */
public final class C28996b implements MetricPublisher<ServerEvent> {

    /* renamed from: a */
    private final SharedPreferences f68497a;

    /* renamed from: b */
    private final C29004i f68498b;

    /* renamed from: c */
    private final MetricsClient f68499c;

    /* renamed from: d */
    private final C28991a f68500d;

    static {
        Covode.recordClassIndex(35193);
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final List<C29005d<ServerEvent>> getPersistedEvents() {
        return this.f68500d.mo50363a(ServerEvent.ADAPTER, this.f68497a.getString("unsent_analytics_events", null));
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final void persistMetrics(List<C29005d<ServerEvent>> list) {
        this.f68497a.edit().putString("unsent_analytics_events", this.f68500d.mo50362a(list)).apply();
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final void publishMetrics(List<ServerEvent> list, final MetricPublisher.PublishCallback publishCallback) {
        this.f68499c.postAnalytics(new ServerEventBatch.Builder().server_events(list).max_sequence_id_on_instance(Long.valueOf(this.f68498b.f68517b)).build()).mo144268a(new AbstractC89743d<Void>() {
            /* class com.snapchat.kit.sdk.core.metrics.p2070c.C28996b.C289971 */

            static {
                Covode.recordClassIndex(35194);
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

    C28996b(SharedPreferences sharedPreferences, C29004i iVar, MetricsClient metricsClient, C28991a aVar) {
        this.f68497a = sharedPreferences;
        this.f68498b = iVar;
        this.f68499c = metricsClient;
        this.f68500d = aVar;
    }
}
