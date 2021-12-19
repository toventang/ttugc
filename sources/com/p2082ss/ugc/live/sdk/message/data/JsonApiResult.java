package com.p2082ss.ugc.live.sdk.message.data;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ugc.live.sdk.message.data.JsonApiResult */
public class JsonApiResult {
    public JSONArray data;
    public long delayTimeBeforeDispatch;
    public JSONObject extra;

    static {
        Covode.recordClassIndex(102854);
    }
}
