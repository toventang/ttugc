package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.discover.p2787m.C42303f;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.b.e */
public final class C42320e {
    static {
        Covode.recordClassIndex(50263);
    }

    /* renamed from: a */
    public static final int m84686a(User user) {
        if (user == null || !C31575b.m65865g().isLogin()) {
            return -1;
        }
        int followStatus = user.getFollowStatus();
        if (followStatus != 0) {
            if (followStatus == 1) {
                return 1;
            }
            if (followStatus != 2) {
                if (followStatus != 4) {
                    return 0;
                }
                return 4;
            } else if (C42303f.m84663a(user)) {
                return 2;
            } else {
                return 3;
            }
        } else if (user.getFollowerStatus() == 1) {
            return 5;
        }
        return 0;
    }
}
