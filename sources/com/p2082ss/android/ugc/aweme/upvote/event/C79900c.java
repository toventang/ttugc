package com.p2082ss.android.ugc.aweme.upvote.event;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.InteractPermission;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.upvote.service.C80034a;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.event.c */
public final class C79900c {
    static {
        Covode.recordClassIndex(93126);
    }

    /* renamed from: a */
    public static final C33744d m138665a(C33744d dVar, Aweme aweme, String str) {
        String str2;
        C89219l.m154721d(dVar, "");
        Integer num = null;
        if (aweme != null) {
            str2 = aweme.getAid();
            InteractPermission interactPermission = aweme.getInteractPermission();
            if (interactPermission != null) {
                num = Integer.valueOf(interactPermission.getUpvote());
            }
        } else {
            str2 = null;
        }
        m138666a(dVar, str2, num, str);
        return dVar;
    }

    /* renamed from: a */
    public static final <T extends AbstractC59233c<?>> T m138667a(T t, Aweme aweme, String str) {
        Integer num;
        String str2;
        C89219l.m154721d(t, "");
        if (!(aweme == null || aweme.getAid() == null)) {
            String aid = aweme.getAid();
            C89219l.m154716b(aid, "");
            InteractPermission interactPermission = aweme.getInteractPermission();
            if (interactPermission != null) {
                num = Integer.valueOf(interactPermission.getUpvote());
            } else {
                num = null;
            }
            if (!m138668a(aid, num, str)) {
                return t;
            }
            C80034a aVar = C80034a.f179347a;
            String aid2 = aweme.getAid();
            C89219l.m154716b(aid2, "");
            C79898a c = aVar.mo123485c(aid2);
            if (c == null) {
                return t;
            }
            String str3 = "1";
            if (c.f179142a) {
                str2 = str3;
            } else {
                str2 = "0";
            }
            AbstractC59233c a = t.mo96786a("is_recommend", str2).mo96785a("recommend_cnt", c.f179143b);
            if (!c.f179144c) {
                str3 = "0";
            }
            a.mo96786a("is_self", str3);
        }
        return t;
    }

    /* renamed from: a */
    public static final boolean m138668a(String str, Integer num, String str2) {
        if (C89064i.m154489a(new String[]{"homepage_hot", "notification_page"}, str2)) {
            num = C80034a.f179347a.mo123483b(str);
        }
        if (num == null || num.intValue() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final C33744d m138666a(C33744d dVar, String str, Integer num, String str2) {
        C79898a c;
        String str3;
        C89219l.m154721d(dVar, "");
        if (str == null || !m138668a(str, num, str2) || (c = C80034a.f179347a.mo123485c(str)) == null) {
            return dVar;
        }
        String str4 = "1";
        if (c.f179142a) {
            str3 = str4;
        } else {
            str3 = "0";
        }
        C33744d a = dVar.mo59983a("is_recommend", str3).mo59980a("recommend_cnt", c.f179143b);
        if (!c.f179144c) {
            str4 = "0";
        }
        a.mo59983a("is_self", str4);
        return dVar;
    }
}
