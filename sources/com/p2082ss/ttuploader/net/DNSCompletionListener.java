package com.p2082ss.ttuploader.net;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.net.DNSCompletionListener */
public interface DNSCompletionListener {
    static {
        Covode.recordClassIndex(101501);
    }

    void onCancelled();

    void onCompletion(JSONObject jSONObject, Error error);

    void onRetry(Error error);
}
