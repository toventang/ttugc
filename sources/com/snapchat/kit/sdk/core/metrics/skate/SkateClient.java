package com.snapchat.kit.sdk.core.metrics.skate;

import com.bytedance.covode.number.Covode;
import com.snap.kit.sdk.model.MetricSampleRate;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch;
import p4640l.AbstractC89716b;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89731o;

public interface SkateClient {
    static {
        Covode.recordClassIndex(35344);
    }

    @AbstractC89731o(mo144285a = "/v1/sdk/metrics/skate")
    AbstractC89716b<MetricSampleRate> postSkateEvents(@AbstractC89717a ServerEventBatch serverEventBatch);
}
