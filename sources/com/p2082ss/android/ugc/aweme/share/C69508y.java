package com.p2082ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeBubbleBusiness;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeBubbleInfo;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50526ab;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.y */
public final class C69508y {

    /* renamed from: a */
    public static boolean f155283a;

    /* renamed from: b */
    public static boolean f155284b;

    /* renamed from: c */
    public static final C69508y f155285c = new C69508y();

    private C69508y() {
    }

    static {
        Covode.recordClassIndex(81849);
    }

    /* renamed from: a */
    private static boolean m122720a() {
        StringBuilder sb = new StringBuilder("promote_guide_shown_history_");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        long a = C34597d.m70636c().mo61049a(sb.append(g.getCurUserId()).toString());
        if (a != 0 && System.currentTimeMillis() - a <= 86400000) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final void m122723c(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        C39162r.m79460a("Promote_bubble_click", m122722b(aweme).f79943a);
    }

    /* renamed from: a */
    public static final boolean m122721a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        f155283a = false;
        f155284b = false;
        if (!m122724d(aweme)) {
            return false;
        }
        AwemeBubbleInfo bubbleInfo = aweme.getBubbleInfo();
        if ((bubbleInfo == null || bubbleInfo.getType() != 3) && m122720a()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static C33744d m122722b(Aweme aweme) {
        C33744d a = new C33744d().mo59983a("author_id", aweme.getAuthorUid()).mo59983a("group_id", aweme.getAid()).mo59983a("enter_from", "personal_homepage").mo59980a("is_self", C80580in.m139681a(aweme.getAuthorUid()) ? 1 : 0);
        try {
            String logExtra = aweme.getBubbleInfo().getLogExtra();
            if (logExtra != null) {
                Map<String, Object> a2 = C50526ab.m94713a(new JSONObject(logExtra));
                C89219l.m154716b(a2, "");
                for (Map.Entry<String, Object> entry : a2.entrySet()) {
                    a.mo59982a(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: d */
    private static boolean m122724d(Aweme aweme) {
        AwemeBubbleInfo bubbleInfo;
        AwemeBubbleInfo bubbleInfo2;
        String text;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin() || !C80580in.m139681a(aweme.getAuthorUid()) || aweme.getHasPromoteEntry() != 1 || (bubbleInfo = aweme.getBubbleInfo()) == null || bubbleInfo.getBiz() != AwemeBubbleBusiness.PROMOTE.getValue() || (bubbleInfo2 = aweme.getBubbleInfo()) == null || (text = bubbleInfo2.getText()) == null || text.length() == 0) {
            return false;
        }
        return true;
    }
}
