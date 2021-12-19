package com.p2082ss.ttuploader.net;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttuploader.net.TTVNetClient */
public abstract class TTVNetClient {

    /* renamed from: com.ss.ttuploader.net.TTVNetClient$CompletionListener */
    public interface CompletionListener {
        static {
            Covode.recordClassIndex(101524);
        }

        void onCompletion(JSONObject jSONObject, Error error);
    }

    static {
        Covode.recordClassIndex(101523);
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
