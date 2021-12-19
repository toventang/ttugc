package com.p2082ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.model.LogPbBean */
public class LogPbBean implements Serializable {
    @AbstractC27891c(mo46611a = "impr_id")
    public String imprId;

    static {
        Covode.recordClassIndex(58722);
    }

    public String getImprId() {
        return this.imprId;
    }

    public String toJsonString() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(this.imprId)) {
                str = "";
            } else {
                str = this.imprId;
            }
            jSONObject.put("impr_id", str);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public void setImprId(String str) {
        this.imprId = str;
    }
}
