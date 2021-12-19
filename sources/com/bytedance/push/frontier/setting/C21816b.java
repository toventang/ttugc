package com.bytedance.push.frontier.setting;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.frontier.setting.b */
public class C21816b {
    static {
        Covode.recordClassIndex(25468);
    }

    /* renamed from: a */
    public static C21815a m40865a(String str) {
        C21815a aVar = new C21815a();
        try {
            aVar = C21815a.m40862a(new JSONObject(str));
            return aVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return aVar;
        }
    }
}
