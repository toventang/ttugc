package com.p2082ss.mediakit.net;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.mediakit.net.DNSCompletionListener */
public interface DNSCompletionListener {
    static {
        Covode.recordClassIndex(101243);
    }

    void onCancelled();

    void onCompletion(JSONObject jSONObject, Error error);

    void onRetry(Error error);
}
