package com.p2082ss.android.ugc.aweme.social.widget.p3918a;

import android.content.Context;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.friends.C51487e;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.aweme.social.ext.C74729a;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.a.a */
public final class C74744a {
    static {
        Covode.recordClassIndex(87587);
    }

    /* renamed from: a */
    public static final int m131225a(User user) {
        C89219l.m154721d(user, "");
        if (user.getFollowStatus() > 0) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public static final void m131226a(TuxTextView tuxTextView, User user) {
        C89219l.m154721d(tuxTextView, "");
        C89219l.m154721d(user, "");
        tuxTextView.setText(user.getNickname());
        C80581io.m139704a(tuxTextView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), tuxTextView);
    }

    /* renamed from: a */
    public static final void m131227a(SmartAvatarImageView smartAvatarImageView, UrlModel urlModel) {
        C89219l.m154721d(smartAvatarImageView, "");
        C89219l.m154721d(urlModel, "");
        C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
        a.f49092E = smartAvatarImageView;
        a.mo34179a("SocialCard").mo34186c();
    }

    /* renamed from: a */
    public static final void m131230a(User user, TuxTextView tuxTextView, MutualRelationView mutualRelationView) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(tuxTextView, "");
        C89219l.m154721d(mutualRelationView, "");
        if (user.getMutualStruct() != null) {
            tuxTextView.setVisibility(8);
            mutualRelationView.setVisibility(0);
            mutualRelationView.setTextColor(C0643b.m2378c(tuxTextView.getContext(), R.color.c5));
            mutualRelationView.mo125023a(user.getMutualStruct(), C51487e.m95907d());
            return;
        }
        mutualRelationView.setVisibility(8);
        tuxTextView.setVisibility(0);
        C74729a.m131190a(tuxTextView, user, null, null, 6);
    }

    /* renamed from: a */
    private static void m131228a(User user, Context context, String str, String str2, String str3, String str4) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        SmartRouter.buildRoute(context, "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", str).withParam("enter_method", str4).withParam("enter_from_request_id", user.getRequestId()).withParam("extra_previous_page_position", "card_head").withParam("need_track_compare_recommend_reason", 1).withParam("previous_recommend_reason", user.getRecommendReason()).withParam("recommend_from_type", "card").withParam("recommend_enter_profile_params", new C66623g(str, str3, C59256u.EnumC59259c.CARD, user.getRecType(), C66623g.C66624a.m118386a(user), user.getUid(), null, null, user.getRequestId(), str2, user.getFriendTypeStr(), user.getSocialInfo())).open();
    }

    /* renamed from: a */
    public static /* synthetic */ void m131229a(User user, Context context, String str, String str2, String str3, String str4, int i) {
        String str5 = str2;
        String str6 = str3;
        String str7 = "";
        if ((i & 4) != 0) {
            str5 = str7;
        }
        if ((i & 8) != 0) {
            str6 = str7;
        }
        if ((i & 16) == 0) {
            str7 = str4;
        }
        m131228a(user, context, str, str5, str6, str7);
    }
}
