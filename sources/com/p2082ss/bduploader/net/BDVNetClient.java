package com.p2082ss.bduploader.net;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.bduploader.net.BDVNetClient */
public abstract class BDVNetClient {

    /* renamed from: com.ss.bduploader.net.BDVNetClient$CompletionListener */
    public interface CompletionListener {
        static {
            Covode.recordClassIndex(100826);
        }

        void onCompletion(JSONObject jSONObject, Error error);
    }

    static {
        Covode.recordClassIndex(100825);
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
