package com.p2082ss.android.medialib.log;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.medialib.log.IMonitor */
public interface IMonitor {
    static {
        Covode.recordClassIndex(36474);
    }

    void monitorLog(String str, JSONObject jSONObject);
}
