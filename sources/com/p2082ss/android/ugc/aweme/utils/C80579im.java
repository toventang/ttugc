package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.utils.im */
public final class C80579im {
    static {
        Covode.recordClassIndex(93852);
    }

    /* renamed from: a */
    public static UrlModel m139675a(User user) {
        UrlModel avatarVideoUri;
        if (user != null && (avatarVideoUri = user.getAvatarVideoUri()) != null && C34717d.m70910b(avatarVideoUri.getUrlList()) && !TextUtils.isEmpty(avatarVideoUri.getUrlList().get(0))) {
            return avatarVideoUri;
        }
        return null;
    }
}
