package com.p2082ss.android.ugc.playerkit.simapicommon.reporter;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent */
public interface IEvent {
    static {
        Covode.recordClassIndex(98152);
    }

    void onEvent(String str, JSONObject jSONObject);
}
