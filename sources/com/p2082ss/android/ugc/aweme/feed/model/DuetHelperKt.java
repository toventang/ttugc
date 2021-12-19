package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.DuetHelperKt */
public final class DuetHelperKt {
    static {
        Covode.recordClassIndex(58674);
    }

    private static final boolean checkDuetSetting(Aweme aweme) {
        if (aweme.author == null) {
            return false;
        }
        User user = aweme.author;
        C89219l.m154716b(user, "");
        int duetSetting = user.getDuetSetting();
        if (duetSetting == 0) {
            return true;
        }
        if (duetSetting != 1) {
            return false;
        }
        User user2 = aweme.author;
        C89219l.m154716b(user2, "");
        if (user2.getFollowStatus() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean canAddDuet(Aweme aweme, boolean z) {
        int i;
        C89219l.m154721d(aweme, "");
        InteractPermission interactPermission = aweme.interactPermission;
        if (interactPermission != null) {
            i = interactPermission.getDuet();
            if (i == 4) {
                return false;
            }
        } else {
            i = 0;
        }
        if ((z || (i != 2 && !aweme.isPrivate())) && aweme.canDuetVideoType() && !aweme.isWithPromotionalMusic() && aweme.duetSetting != 2) {
            return true;
        }
        return false;
    }

    public static final boolean setGrayForDuet(Aweme aweme, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        C89219l.m154721d(aweme, "");
        boolean checkDuetSetting = checkDuetSetting(aweme);
        InteractPermission interactPermission = aweme.interactPermission;
        if (interactPermission != null) {
            i = interactPermission.getDuet();
        } else {
            i = 0;
        }
        if (z2 && i != 3 && (z || (checkDuetSetting && i != 1))) {
            User user = aweme.author;
            C89219l.m154716b(user, "");
            if ((!user.isSecret() || z) && !z3 && !z4) {
                return false;
            }
        }
        return true;
    }
}
