package com.p2082ss.bduploader.net;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.bduploader.net.DNSCompletionListener */
public interface DNSCompletionListener {
    static {
        Covode.recordClassIndex(100828);
    }

    void onCancelled();

    void onCompletion(JSONObject jSONObject, Error error);

    void onRetry(Error error);
}
