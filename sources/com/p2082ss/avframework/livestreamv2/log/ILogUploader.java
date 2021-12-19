package com.p2082ss.avframework.livestreamv2.log;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.log.ILogUploader */
public interface ILogUploader {
    static {
        Covode.recordClassIndex(100566);
    }

    void uploadLog(JSONObject jSONObject);
}
