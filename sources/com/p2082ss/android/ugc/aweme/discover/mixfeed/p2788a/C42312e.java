package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2788a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.a.e */
public final class C42312e {
    static {
        Covode.recordClassIndex(50255);
    }

    /* renamed from: a */
    public static final String m84674a(User user) {
        MutualStruct mutualStruct = null;
        if (user != null) {
            String relationShip = user.getRelationShip();
            if (relationShip != null && relationShip.length() > 0) {
                return relationShip;
            }
            mutualStruct = user.getMutualStruct();
        }
        return m84673a(mutualStruct);
    }

    /* renamed from: a */
    private static String m84673a(MutualStruct mutualStruct) {
        Integer valueOf;
        if (mutualStruct == null || (valueOf = Integer.valueOf(mutualStruct.getMutualType())) == null) {
            return "";
        }
        if (valueOf.intValue() == 1) {
            return "Friends with";
        }
        if (valueOf.intValue() == 2) {
            return "Followed by";
        }
        if (valueOf.intValue() == 3) {
            return "Follows";
        }
        return "";
    }
}
