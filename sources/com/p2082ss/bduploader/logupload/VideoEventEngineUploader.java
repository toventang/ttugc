package com.p2082ss.bduploader.logupload;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.bduploader.logupload.VideoEventEngineUploader */
public interface VideoEventEngineUploader {
    static {
        Covode.recordClassIndex(100814);
    }

    void onEventV3(String str, JSONObject jSONObject);
}
