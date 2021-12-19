package com.p2082ss.android.ugc.aweme.feed.helper;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.e */
public final class C49619e {
    static {
        Covode.recordClassIndex(58466);
    }

    /* renamed from: a */
    public static String m93060a(int i, String str, boolean z) {
        if (TextUtils.equals(str, "following_window")) {
            return "following_window";
        }
        if (i == 0) {
            return "homepage_hot";
        }
        if (i == 1) {
            return "homepage_follow";
        }
        if (i == 2) {
            return "homepage_fresh";
        }
        String str2 = "personal_homepage";
        if (!(i == 1000 || i == 1001)) {
            str2 = "others_homepage";
            if (!(i == 2000 || i == 2001)) {
                if (i == 3002) {
                    return "challenge";
                }
                if (i == 3003) {
                    return "challenge_fresh";
                }
                if (i != 4000) {
                    if (i == 4001) {
                        return "single_Msong_fresh";
                    }
                    if (i == 9000) {
                        return "discovery";
                    }
                    if (i == 9001) {
                        return "playlist";
                    }
                    if (TextUtils.equals(str, "upload")) {
                        return "release";
                    }
                    return str;
                } else if (z) {
                    return "single_song";
                } else {
                    return "single_song_hot";
                }
            }
        }
        return str2;
    }

    /* renamed from: a */
    public static JSONObject m93061a(JSONObject jSONObject, String str, String str2, Aweme aweme) {
        if (str != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                if (!"update_tips".equals(str2)) {
                    jSONObject.put("enter_from", str2);
                }
                if ("like_banner".equals(str)) {
                    jSONObject.put("previous_page", str);
                } else {
                    jSONObject.put("enter_method", str);
                }
                if (aweme.getAwemeType() == 2) {
                    jSONObject.put("is_photo", 1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return jSONObject;
        }
        throw new IllegalArgumentException();
    }
}
