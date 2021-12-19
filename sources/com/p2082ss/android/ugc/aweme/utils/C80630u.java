package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.utils.u */
public final class C80630u {
    static {
        Covode.recordClassIndex(93904);
    }

    /* renamed from: a */
    public static UrlModel m139797a(User user) {
        if (user == null) {
            return null;
        }
        if (user.getAvatarMedium() != null) {
            return user.getAvatarMedium();
        }
        if (user.getAvatarThumb() != null) {
            return user.getAvatarThumb();
        }
        if (user.getAvatarLarger() != null) {
            return user.getAvatarLarger();
        }
        return null;
    }
}
