package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AggregationSdk */
public class AggregationSdk implements Serializable {
    @AbstractC27891c(mo46611a = "common_data")
    private Object commonData;

    static {
        Covode.recordClassIndex(58599);
    }

    public JSONObject getCommonData() {
        try {
            return new JSONObject(new C27910f().mo46674b(this.commonData));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
