package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bn */
public final class C73998bn {
    static {
        Covode.recordClassIndex(86748);
    }

    /* renamed from: a */
    public static final String m130142a(User user) {
        String str;
        String str2;
        if (user == null) {
            return "";
        }
        String uniqueId = user.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            str = user.getShortId();
        } else {
            str = user.getUniqueId();
        }
        if (str != null && str.length() != 0) {
            return str;
        }
        if (TextUtils.isEmpty(user.getRemarkName())) {
            str2 = user.getNickname();
            if (str2 == null) {
                return "";
            }
        } else {
            str2 = user.getRemarkName();
            if (str2 == null) {
                return "";
            }
        }
        return str2;
    }
}
