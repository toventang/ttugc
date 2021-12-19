package com.p2082ss.videoarch.p4474a.p4475a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.a.a.a */
public final class C87118a extends Error {
    public int code;
    public Map info;
    public long timeStamp = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(102919);
    }

    /* renamed from: com_ss_videoarch_liveplayer_log_LiveError_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m150876xb02a59f2(String str, String str2) {
        return 0;
    }

    public final String getInfoJSON() {
        if (this.info == null) {
            this.info = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(this.info);
        try {
            jSONObject.put("timestamp", this.timeStamp);
            jSONObject.put("message", super.toString());
        } catch (JSONException e) {
            m150876xb02a59f2("Live Error", e.toString());
        }
        return jSONObject.toString();
    }

    public final String toString() {
        if (this.info == null) {
            this.info = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(this.info);
        try {
            jSONObject.put("message", super.toString());
            jSONObject.put("code", this.code);
            jSONObject.put("timestamp", this.timeStamp);
        } catch (JSONException e) {
            m150876xb02a59f2("Live Error", e.toString());
        }
        return jSONObject.toString();
    }

    public C87118a(int i, String str, Map<String, String> map) {
        super(str);
        this.code = i;
        this.info = map;
    }
}
