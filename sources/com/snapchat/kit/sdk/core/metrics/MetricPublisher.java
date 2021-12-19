package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import java.util.List;

public interface MetricPublisher<T> {

    public interface PublishCallback {
        static {
            Covode.recordClassIndex(35173);
        }

        void onNetworkError();

        void onServerError(Error error);

        void onSuccess();
    }

    static {
        Covode.recordClassIndex(35172);
    }

    List<C29005d<T>> getPersistedEvents();

    void persistMetrics(List<C29005d<T>> list);

    void publishMetrics(List<T> list, PublishCallback publishCallback);
}
