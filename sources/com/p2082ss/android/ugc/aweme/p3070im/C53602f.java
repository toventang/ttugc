package com.p2082ss.android.ugc.aweme.p3070im;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.f */
public final class C53602f {
    static {
        Covode.recordClassIndex(63180);
    }

    /* renamed from: a */
    public static void m98838a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_status", str);
        C39162r.m79460a("inner_push_setting", hashMap);
    }

    /* renamed from: b */
    public static void m98841b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_status", str);
        C39162r.m79460a("live_inner_push_setting", hashMap);
    }

    /* renamed from: a */
    public static void m98839a(String str, String str2) {
        C39162r.onEvent(MobClick.obtain().setEventName("unblock").setLabelName(str).setValue(str2));
    }

    /* renamed from: a */
    public static void m98840a(String str, String str2, String str3) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str3)) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("enter_from", str3);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            jSONObject = null;
        }
        C39162r.onEvent(MobClick.obtain().setEventName("block").setLabelName(str).setValue(str2).setJsonObject(jSONObject));
    }
}
