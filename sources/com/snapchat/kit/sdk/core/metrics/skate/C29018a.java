package com.snapchat.kit.sdk.core.metrics.skate;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.snap.kit.sdk.model.MetricSampleRate;
import com.snapchat.kit.sdk.core.config.C28965f;
import com.snapchat.kit.sdk.core.metrics.C29005d;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventData;
import com.snapchat.kit.sdk.core.metrics.model.SkateEvent;
import com.snapchat.kit.sdk.core.metrics.p2069b.C28991a;
import com.snapchat.kit.sdk.core.metrics.p2070c.C29004i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p4640l.AbstractC89716b;
import p4640l.AbstractC89743d;
import p4640l.C89781l;

/* renamed from: com.snapchat.kit.sdk.core.metrics.skate.a */
public final class C29018a implements MetricPublisher<SkateEvent> {

    /* renamed from: a */
    final C28965f f68546a;

    /* renamed from: b */
    private final SharedPreferences f68547b;

    /* renamed from: c */
    private final C29004i f68548c;

    /* renamed from: d */
    private final SkateClient f68549d;

    /* renamed from: e */
    private final C28991a f68550e;

    static {
        Covode.recordClassIndex(35345);
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final List<C29005d<SkateEvent>> getPersistedEvents() {
        try {
            return this.f68550e.mo50363a(SkateEvent.ADAPTER, this.f68547b.getString("com.snapchat.kit.sdk.core.metrics.skate.unsentSkateEvents", null));
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final void persistMetrics(List<C29005d<SkateEvent>> list) {
        this.f68547b.edit().putString("com.snapchat.kit.sdk.core.metrics.skate.unsentSkateEvents", this.f68550e.mo50362a(list)).apply();
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final void publishMetrics(List<SkateEvent> list, final MetricPublisher.PublishCallback publishCallback) {
        ArrayList arrayList = new ArrayList();
        for (SkateEvent skateEvent : list) {
            arrayList.add(new ServerEvent.Builder().event_data(new ServerEventData.Builder().skate_event(skateEvent).build()).build());
        }
        this.f68549d.postSkateEvents(new ServerEventBatch.Builder().server_events(arrayList).max_sequence_id_on_instance(Long.valueOf(this.f68548c.f68517b)).build()).mo144268a(new AbstractC89743d<MetricSampleRate>() {
            /* class com.snapchat.kit.sdk.core.metrics.skate.C29018a.C290191 */

            static {
                Covode.recordClassIndex(35346);
            }

            @Override // p4640l.AbstractC89743d
            /* renamed from: a */
            public final void mo34286a(AbstractC89716b<MetricSampleRate> bVar, Throwable th) {
                if (th instanceof IOException) {
                    publishCallback.onNetworkError();
                } else {
                    publishCallback.onServerError(new Error(th));
                }
            }

            @Override // p4640l.AbstractC89743d
            /* renamed from: a */
            public final void mo34287a(AbstractC89716b<MetricSampleRate> bVar, C89781l<MetricSampleRate> lVar) {
                try {
                    if (lVar.f203560a.mo144720a()) {
                        T t = lVar.f203561b;
                        if (!(t == null || t.rate == null)) {
                            C28965f fVar = C29018a.this.f68546a;
                            double doubleValue = t.rate.doubleValue();
                            if (C28965f.m57978b(doubleValue)) {
                                fVar.f68434a.edit().putFloat("com.snapchat.kit.sdk.core.config.skateSampleRate", (float) doubleValue).apply();
                            }
                        }
                        publishCallback.onSuccess();
                        return;
                    }
                    publishCallback.onServerError(new Error(lVar.f203562c.string()));
                } catch (IOException | NullPointerException unused) {
                    publishCallback.onServerError(new Error("response unsuccessful"));
                }
            }
        });
    }

    C29018a(C28965f fVar, SharedPreferences sharedPreferences, C29004i iVar, SkateClient skateClient, C28991a aVar) {
        this.f68546a = fVar;
        this.f68547b = sharedPreferences;
        this.f68548c = iVar;
        this.f68549d = skateClient;
        this.f68550e = aVar;
    }
}
