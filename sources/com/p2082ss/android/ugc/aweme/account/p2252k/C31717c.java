package com.p2082ss.android.ugc.aweme.account.p2252k;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.k.c */
public final class C31717c {
    static {
        Covode.recordClassIndex(38451);
    }

    /* renamed from: a */
    public static String m66045a(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("log_pb");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return string;
    }

    /* renamed from: a */
    public static JSONObject m66046a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (TextUtils.equals("log_pb", str)) {
                        jSONObject.put(str, new JSONObject(map.get(str)));
                    } else {
                        jSONObject.put(str, map.get(str));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject;
    }
}
