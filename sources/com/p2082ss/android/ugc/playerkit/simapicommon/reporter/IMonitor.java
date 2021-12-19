package com.p2082ss.android.ugc.playerkit.simapicommon.reporter;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor */
public interface IMonitor {
    static {
        Covode.recordClassIndex(98153);
    }

    void ensureNotReachHere(Throwable th);

    void ensureNotReachHere(Throwable th, String str);

    void monitorCommonLog(String str, String str2, JSONObject jSONObject);

    void monitorCommonLog(String str, JSONObject jSONObject);

    void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    void monitorStatusRate(String str, int i, JSONObject jSONObject);
}
