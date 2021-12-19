package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.snap.kit.sdk.model.SnapKitStorySnapViews;
import com.snapchat.kit.sdk.core.metrics.model.Metrics;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch;
import p4640l.AbstractC89716b;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89731o;

public interface MetricsClient {
    static {
        Covode.recordClassIndex(35175);
    }

    @AbstractC89731o(mo144285a = "/v1/sdk/metrics/business")
    AbstractC89716b<Void> postAnalytics(@AbstractC89717a ServerEventBatch serverEventBatch);

    @AbstractC89731o(mo144285a = "/v1/sdk/metrics/operational")
    AbstractC89716b<Void> postOperationalMetrics(@AbstractC89717a Metrics metrics);

    @AbstractC89731o(mo144285a = "/v1/stories/app/view")
    AbstractC89716b<Void> postViewEvents(@AbstractC89717a SnapKitStorySnapViews snapKitStorySnapViews);
}
