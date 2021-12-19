package com.p2082ss.android.ugc.aweme.user;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.C43200dr;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.profile.UserResponse;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.user.d */
public final class C80057d {

    /* renamed from: a */
    public static final String f179395a = "https://api.tiktokv.com/aweme/v1/commit/user/";

    /* renamed from: b */
    public static final String f179396b = "https://api.tiktokv.com/passport/login_name/update/";

    static {
        Covode.recordClassIndex(93288);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00dd, code lost:
        if (r4 != null) goto L_0x0048;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.ugc.aweme.profile.UserResponse m138791a(java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
        // Method dump skipped, instructions count: 233
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.user.C80057d.m138791a(java.util.Map):com.ss.android.ugc.aweme.profile.UserResponse");
    }

    /* renamed from: a */
    public static User m138792a(String str, boolean z) {
        String str2;
        C29844g gVar = new C29844g(str);
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        gVar.mo52130a("is_after_login", str2);
        return ((UserResponse) C43200dr.f100694b.mo58679a().mo46670a(C43200dr.f100694b.mo58683a(gVar.toString()), UserResponse.class)).getUser();
    }

    /* renamed from: a */
    private static void m138793a(User user, User user2, Set<String> set) {
        if (!(user == null || TextUtils.isEmpty(user.getUid()))) {
            Field[] declaredFields = User.class.getDeclaredFields();
            for (Field field : declaredFields) {
                AbstractC27891c cVar = (AbstractC27891c) field.getAnnotation(AbstractC27891c.class);
                if (cVar != null && !set.contains(cVar.mo46611a())) {
                    try {
                        field.setAccessible(true);
                        field.set(user2, field.get(user));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m138794a(User user, Map<String, String> map, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!map.containsKey("login_name")) {
                return false;
            }
            if (TextUtils.equals(jSONObject.optString("message").toLowerCase(), "success")) {
                map.put("unique_id", map.get("login_name"));
                map.remove("login_name");
                user.setUniqueId(jSONObject.getJSONObject("data").getString("login_name"));
                user.setHandleModified(new Date().getTime() / 1000);
                return true;
            } else if (!TextUtils.equals(jSONObject.optString("message").toLowerCase(), "error")) {
                return false;
            } else {
                throw new C34485a(jSONObject.getJSONObject("data").optInt("error_code")).setErrorMsg(jSONObject.getJSONObject("data").optString("description"));
            }
        } catch (JSONException unused) {
            return false;
        }
    }
}
