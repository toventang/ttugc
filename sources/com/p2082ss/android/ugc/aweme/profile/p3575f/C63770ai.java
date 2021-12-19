package com.p2082ss.android.ugc.aweme.profile.p3575f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38245n;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.f.ai */
public final class C63770ai extends C80580in {
    static {
        Covode.recordClassIndex(75098);
    }

    /* renamed from: a */
    public static void m115326a(JSONObject jSONObject) {
        long j;
        String str;
        String str2;
        User curUser = C31575b.m65865g().getCurUser();
        boolean z = false;
        if (curUser == null || !C31575b.m65865g().isLogin()) {
            j = -1;
            str = "";
            str2 = str;
        } else {
            j = Long.parseLong(C31575b.m65865g().getCurUserId());
            if (TextUtils.isEmpty(curUser.getUniqueId())) {
                str = curUser.getShortId();
            } else {
                str = curUser.getUniqueId();
            }
            str2 = curUser.getBindPhone();
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if (!(avatarMedium == null || avatarMedium.getUrlList() == null || avatarMedium.getUrlList().isEmpty())) {
                jSONObject.put("avatar_url", avatarMedium.getUrlList().get(0));
            }
            z = true;
        }
        jSONObject.put("is_login", z);
        jSONObject.put("success", z);
        jSONObject.put("user_id", String.valueOf(j));
        jSONObject.put("nickname", "");
        jSONObject.put("unique_id", str);
        jSONObject.put("bind_phone", str2);
        jSONObject.put("code", 1);
        Long b = C38245n.C38246a.m77605b(curUser);
        if (b != null) {
            jSONObject.put("decoration_id", b);
        }
    }
}
