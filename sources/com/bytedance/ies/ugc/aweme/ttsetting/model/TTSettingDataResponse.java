package com.bytedance.ies.ugc.aweme.ttsetting.model;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

public final class TTSettingDataResponse {
    private TTSettingData ttSettingData;
    private JSONObject ttSettingDataJSONObject;

    static {
        Covode.recordClassIndex(20827);
    }

    public final TTSettingData getTtSettingData() {
        return this.ttSettingData;
    }

    public final JSONObject getTtSettingDataJSONObject() {
        return this.ttSettingDataJSONObject;
    }

    public final void setTtSettingData(TTSettingData tTSettingData) {
        this.ttSettingData = tTSettingData;
    }

    public final void setTtSettingDataJSONObject(JSONObject jSONObject) {
        this.ttSettingDataJSONObject = jSONObject;
    }

    public TTSettingDataResponse(TTSettingData tTSettingData, JSONObject jSONObject) {
        C89219l.m154719c(tTSettingData, "");
        C89219l.m154719c(jSONObject, "");
        this.ttSettingData = tTSettingData;
        this.ttSettingDataJSONObject = jSONObject;
    }
}
