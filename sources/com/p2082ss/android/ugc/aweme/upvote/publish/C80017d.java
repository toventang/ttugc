package com.p2082ss.android.ugc.aweme.upvote.publish;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.publish.d */
public final class C80017d {

    /* renamed from: a */
    public static final C80017d f179337a = new C80017d();

    private C80017d() {
    }

    static {
        Covode.recordClassIndex(93244);
    }

    /* renamed from: a */
    public static void m138710a(String str, String str2, UpvotePublishMobParam upvotePublishMobParam) {
        String str3;
        String str4;
        String str5;
        String str6;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89378p[] pVarArr = new C89378p[6];
        String str7 = null;
        if (upvotePublishMobParam != null) {
            str3 = upvotePublishMobParam.f179137a;
        } else {
            str3 = null;
        }
        pVarArr[0] = C89387v.m154943a("enter_from", str3);
        if (upvotePublishMobParam != null) {
            str4 = upvotePublishMobParam.f179139c;
        } else {
            str4 = null;
        }
        pVarArr[1] = C89387v.m154943a("group_id", str4);
        if (upvotePublishMobParam != null) {
            str5 = upvotePublishMobParam.f179140d;
        } else {
            str5 = null;
        }
        pVarArr[2] = C89387v.m154943a("author_id", str5);
        if (upvotePublishMobParam != null) {
            str7 = upvotePublishMobParam.f179141e;
        }
        pVarArr[3] = C89387v.m154943a("follow_status", str7);
        pVarArr[4] = C89387v.m154943a("recommendation_id", str);
        pVarArr[5] = C89387v.m154943a("enter_method", "button");
        Map b = C89041ag.m154427b(pVarArr);
        C17867d.m33078a();
        int c = C46579b.m89902c(str2);
        if (c == 0) {
            str6 = "text";
        } else if (c != 1) {
            str6 = "text_emoji";
        } else {
            str6 = "emoji";
        }
        b.put("message_type", str6);
        C39162r.m79460a("add_recommendation_finish_success", b);
    }
}
