package com.p2082ss.android.ugc.aweme.services.performance;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.services.performance.LagDataCallback */
public interface LagDataCallback {
    static {
        Covode.recordClassIndex(79919);
    }

    void onDataAvailable(JSONObject jSONObject);
}
