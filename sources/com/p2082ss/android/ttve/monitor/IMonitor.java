package com.p2082ss.android.ttve.monitor;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.IMonitor */
public interface IMonitor {
    static {
        Covode.recordClassIndex(37249);
    }

    void monitorLog(String str, JSONObject jSONObject);
}
