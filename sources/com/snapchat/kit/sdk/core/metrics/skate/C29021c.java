package com.snapchat.kit.sdk.core.metrics.skate;

import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.C29073m;
import com.snapchat.kit.sdk.core.config.C28965f;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.SkateEvent;
import com.snapchat.kit.sdk.core.metrics.model.SnapKitInitType;
import com.snapchat.kit.sdk.p2066b.C28950c;
import java.util.TimeZone;

/* renamed from: com.snapchat.kit.sdk.core.metrics.skate.c */
public final class C29021c {

    /* renamed from: a */
    public final C28965f f68558a;

    /* renamed from: b */
    public final C29023d f68559b;

    /* renamed from: c */
    final MetricQueue<SkateEvent> f68560c;

    /* renamed from: d */
    public final C28950c f68561d;

    /* renamed from: e */
    final C29073m f68562e;

    /* renamed from: f */
    final SnapKitInitType f68563f;

    /* renamed from: g */
    final KitPluginType f68564g;

    /* renamed from: h */
    final boolean f68565h;

    static {
        Covode.recordClassIndex(35348);
    }

    public C29021c(C28965f fVar, C29023d dVar, MetricQueue<SkateEvent> metricQueue, C29073m mVar, SnapKitInitType snapKitInitType, KitPluginType kitPluginType, boolean z) {
        this(fVar, dVar, metricQueue, mVar, new C28950c(TimeZone.getTimeZone("GMT-8")), snapKitInitType, kitPluginType, z);
    }

    private C29021c(C28965f fVar, C29023d dVar, MetricQueue<SkateEvent> metricQueue, C29073m mVar, C28950c cVar, SnapKitInitType snapKitInitType, KitPluginType kitPluginType, boolean z) {
        this.f68558a = fVar;
        this.f68559b = dVar;
        this.f68560c = metricQueue;
        this.f68562e = mVar;
        this.f68561d = cVar;
        this.f68563f = snapKitInitType;
        this.f68564g = kitPluginType;
        this.f68565h = z;
    }
}
