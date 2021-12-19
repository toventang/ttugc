package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50323k;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.y */
public final class C50476y {
    static {
        Covode.recordClassIndex(59612);
    }

    /* renamed from: a */
    public static final void m94635a(Aweme aweme, C50323k.EnumC50324a aVar, C50323k.EnumC50325b bVar) {
        User user;
        String str;
        String str2;
        String str3;
        AwemeRelationRecommendModel relationRecommendInfo;
        String friendTypeStr;
        AwemeRelationRecommendModel relationRecommendInfo2;
        String str4 = "";
        C89219l.m154721d(aVar, str4);
        if (bVar != null) {
            new C59256u();
            if (aweme != null) {
                user = aweme.getAuthor();
            } else {
                user = null;
            }
            C33744d a = new C33744d().mo59983a("enter_from", "homepage_hot").mo59983a("follow_type", C59256u.m108931b(user).getType());
            if (aweme == null || (relationRecommendInfo2 = aweme.getRelationRecommendInfo()) == null || (str = relationRecommendInfo2.getRecType()) == null) {
                str = str4;
            }
            C33744d a2 = a.mo59983a("rec_type", str);
            if (aweme == null || (str2 = aweme.getAuthorUid()) == null) {
                str2 = str4;
            }
            C33744d a3 = a2.mo59983a("to_user_id", str2);
            if (aweme == null || (str3 = aweme.getRequestId()) == null) {
                str3 = str4;
            }
            C33744d a4 = a3.mo59983a("req_id", str3).mo59983a("action_type", aVar.getType()).mo59983a("scene_type", C59256u.EnumC59259c.ITEM.getType()).mo59983a("expand_reason", bVar.getType());
            if (!(aweme == null || (relationRecommendInfo = aweme.getRelationRecommendInfo()) == null || (friendTypeStr = relationRecommendInfo.getFriendTypeStr()) == null)) {
                str4 = friendTypeStr;
            }
            C39162r.m79460a("expand_follow_button", a4.mo59983a("relation_type", str4).f79943a);
        }
    }
}
