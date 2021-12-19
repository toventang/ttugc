package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.n.an */
public interface AbstractC24547an {
    static {
        Covode.recordClassIndex(28691);
    }

    void onProducerEvent(String str, String str2, String str3);

    void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map);

    void onProducerFinishWithFailure(String str, String str2, Throwable th, Map<String, String> map);

    void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map);

    void onProducerStart(String str, String str2);

    void onUltimateProducerReached(String str, String str2, boolean z);

    boolean requiresExtraMap(String str);
}
