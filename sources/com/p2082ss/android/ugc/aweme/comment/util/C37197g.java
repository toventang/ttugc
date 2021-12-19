package com.p2082ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38255s;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38681bh;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.comment.util.g */
public final class C37197g {
    static {
        Covode.recordClassIndex(44552);
    }

    /* renamed from: a */
    private static boolean m75171a() {
        if (C16048b.m29633a().mo25421a(true, "enable_link_ad_migration", true)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C38255s m75170a(Aweme aweme) {
        C38214ac a = C38681bh.m78486a(aweme);
        if (a != null) {
            if (a.linkType == 0) {
                if (!m75171a()) {
                    return null;
                }
                C38255s sVar = new C38255s();
                sVar.setAid(aweme.getAid());
                sVar.setAvatarIcon(a.avatarIcon);
                sVar.setButtonText(a.buttonText);
                sVar.setCommentTime(aweme.getCreateTime());
                sVar.setCommentInfo(a.title);
                sVar.setTitle(a.title);
                sVar.setCommentNickName(aweme.getAuthor().getNickname());
                sVar.setUser(aweme.getAuthor());
                sVar.setCommentType(10);
                return sVar;
            } else if (a.linkType != 1 || !C37699a.m76259ae(aweme)) {
                return null;
            } else {
                C38255s sVar2 = new C38255s();
                sVar2.setCommentTime(aweme.getCreateTime());
                sVar2.setCommentType(12);
                return sVar2;
            }
        }
        return null;
    }
}
