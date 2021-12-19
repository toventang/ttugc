package com.p2082ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.ugc.live.sdk.message.interfaces.IMonitor */
public interface IMonitor {
    static {
        Covode.recordClassIndex(102868);
    }

    void monitor(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void monitorLatency(String str, long j, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);
}
