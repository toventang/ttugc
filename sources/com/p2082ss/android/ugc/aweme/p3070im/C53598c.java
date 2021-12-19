package com.p2082ss.android.ugc.aweme.p3070im;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.im.c */
public class C53598c {
    static {
        Covode.recordClassIndex(63176);
    }

    /* renamed from: a */
    public static IMUser m98833a(User user) {
        if (user == null) {
            return null;
        }
        return IMUser.fromUser(user);
    }
}
