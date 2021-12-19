package com.p2082ss.mediakit.net;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.mediakit.net.AVMDLNetClient */
public abstract class AVMDLNetClient {

    /* renamed from: com.ss.mediakit.net.AVMDLNetClient$CompletionListener */
    public interface CompletionListener {
        static {
            Covode.recordClassIndex(101234);
        }

        void onCompletion(JSONObject jSONObject, Error error);
    }

    static {
        Covode.recordClassIndex(101233);
    }

    public void cancel() {
    }

    public void startTask(String str, CompletionListener completionListener) {
    }

    public void startTask(String str, Map<String, String> map, CompletionListener completionListener) {
    }

    public void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i, CompletionListener completionListener) {
    }
}
