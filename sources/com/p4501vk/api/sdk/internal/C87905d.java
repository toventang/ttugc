package com.p4501vk.api.sdk.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.p4504c.C87852a;
import com.p4501vk.api.sdk.p4504c.C87854b;
import com.p4501vk.api.sdk.p4504c.C87856c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.internal.d */
public final class C87905d {

    /* renamed from: a */
    public static final C87905d f199650a = new C87905d();

    private C87905d() {
    }

    static {
        Covode.recordClassIndex(103916);
    }

    /* renamed from: a */
    public static C87852a m152917a(JSONArray jSONArray, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C89219l.m154709a((Object) jSONObject, "");
                C87852a a = m152918a(jSONObject, (String) null);
                if (!(a instanceof C87854b)) {
                    return a;
                }
                int code = ((C87854b) a).getCode();
                if (code == 1 || code == 14 || code == 17 || code == 4 || code == 5 || code == 6 || code == 9 || code == 10 || code == 24 || code == 25) {
                    return a;
                }
                arrayList.add(a);
            }
            return new C87854b(Integer.MIN_VALUE, str, false, "", null, arrayList, null, 64, null);
        } catch (JSONException e) {
            return new C87856c(e);
        }
    }

    /* renamed from: a */
    public static C87852a m152918a(JSONObject jSONObject, String str) {
        String str2 = str;
        String str3 = "";
        C89219l.m154719c(jSONObject, str3);
        try {
            int i = jSONObject.getInt("error_code");
            Bundle bundle = null;
            if (i == 5) {
                JSONObject optJSONObject = jSONObject.optJSONObject("ban_info");
                if (optJSONObject != null) {
                    bundle = new Bundle();
                    bundle.putString("user_ban_info", optJSONObject.toString());
                }
            } else if (i == 14) {
                bundle = new Bundle();
                bundle.putString("captcha_sid", jSONObject.getString("captcha_sid"));
                bundle.putString("captcha_img", jSONObject.getString("captcha_img"));
            } else if (i == 17) {
                bundle = new Bundle();
                bundle.putString("validation_url", jSONObject.getString("redirect_uri"));
            } else if (i == 24) {
                bundle = new Bundle();
                bundle.putString("confirmation_text", jSONObject.getString("confirmation_text"));
            } else if (i == 3609) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("extend_hash", jSONObject.optString("extend_hash", null));
                bundle = bundle2;
            }
            C89219l.m154719c(jSONObject, str3);
            if (str2 == null && (str2 = jSONObject.optString("method")) == null) {
                str2 = str3;
            }
            int i2 = jSONObject.getInt("error_code");
            String optString = jSONObject.optString("error_msg");
            if (optString == null) {
                optString = str3;
            }
            if (jSONObject.has("error_text")) {
                String optString2 = jSONObject.optString("error_text");
                if (optString2 != null) {
                    str3 = optString2;
                }
                return new C87854b(i2, str2, true, str3, bundle, null, optString, 32, null);
            }
            String optString3 = jSONObject.optString("error_msg");
            if (optString3 != null) {
                str3 = optString3;
            }
            return new C87854b(i2, str2, false, str3 + " | by [" + str2 + ']', bundle, null, str3, 32, null);
        } catch (Exception e) {
            return new C87856c(e);
        }
    }
}
