package com.p2082ss.android.ugc.aweme.story.p4019b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.b.h */
public final class C76598h {

    /* renamed from: a */
    public static String f171916a = "system";

    /* renamed from: b */
    public static String f171917b = "auto";

    /* renamed from: c */
    public static final C76598h f171918c = new C76598h();

    private C76598h() {
    }

    static {
        Covode.recordClassIndex(89583);
    }

    /* renamed from: a */
    public static void m134181a(String str) {
        C89219l.m154721d(str, "");
        f171916a = str;
    }

    /* renamed from: b */
    public static void m134185b(String str) {
        C89219l.m154721d(str, "");
        f171917b = str;
    }

    /* renamed from: a */
    public static int m134176a(User user) {
        if (user == null) {
            return -1;
        }
        if (user.getFollowStatus() == 2) {
            return 2;
        }
        if (user.getFollowStatus() == 1) {
            return 1;
        }
        if (user.getFollowerStatus() == 1) {
            return 3;
        }
        return 0;
    }

    /* renamed from: c */
    public static void m134187c(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("publish_retry_show", new C33744d().mo59983a("creation_id", str).mo59980a("is_story", 1).f79943a);
    }

    /* renamed from: a */
    public static C33744d m134177a(C33744d dVar, Aweme aweme) {
        C89219l.m154721d(dVar, "");
        if (aweme == null) {
            return dVar;
        }
        if (C76706a.m134281g(aweme)) {
            dVar.mo59983a("story_type", "story");
            dVar.mo59983a("story_collection_id", C76706a.m134276b(aweme));
        } else {
            dVar.mo59983a("story_type", UGCMonitor.TYPE_POST);
        }
        dVar.mo59980a("follow_status", m134176a(aweme.getAuthor()));
        return dVar;
    }

    /* renamed from: a */
    public static <T extends AbstractC59233c<?>> T m134178a(T t, Aweme aweme) {
        C89219l.m154721d(t, "");
        if (aweme == null || !C76706a.m134281g(aweme)) {
            return t;
        }
        t.mo96786a("story_type", "story");
        t.mo96786a("story_collection_id", C76706a.m134276b(aweme));
        return t;
    }

    /* renamed from: a */
    public static void m134182a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C39162r.m79460a("publish_retry", new C33744d().mo59983a("creation_id", str).mo59983a("enter_from", str2).mo59983a("action_type", str3).mo59980a("is_story", 1).f79943a);
    }

    /* renamed from: b */
    private static void m134186b(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C39162r.m79460a("story_post_guide", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", str4).mo59983a("story_collection_id", (String) null).mo59983a(StringSet.type, str2).mo59983a("group_id", (String) null).mo59983a("action_type", str3).f79943a);
    }

    /* renamed from: a */
    public static void m134183a(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C39162r.m79460a("story_post_guide", new C33744d().mo59983a("enter_from", str).mo59983a(StringSet.type, str2).mo59983a("action_type", str4).mo59983a("enter_method", str3).f79943a);
    }

    /* renamed from: a */
    public static /* synthetic */ void m134184a(String str, String str2, String str3, String str4, int i) {
        if ((i & 32) != 0) {
            str4 = f171917b;
        }
        m134186b(str, str2, str3, str4);
    }

    /* renamed from: a */
    public static <T extends AbstractC59233c<?>> T m134180a(T t, Aweme aweme, Aweme aweme2, String str, Boolean bool, String str2) {
        int i;
        long j;
        Integer currentIndex;
        C89219l.m154721d(t, "");
        C89219l.m154721d(str, "");
        if (aweme == null || aweme2 == null || !C76706a.m134277c(aweme) || !C76706a.m134278d(aweme2)) {
            return t;
        }
        t.mo96786a("story_type", "story");
        UserStory userStory = aweme.getUserStory();
        int i2 = 0;
        if (userStory != null) {
            i = (int) userStory.getCurrentPosition();
        } else {
            i = 0;
        }
        t.mo96785a("story_start_num", i);
        UserStory userStory2 = aweme.getUserStory();
        if (!(userStory2 == null || (currentIndex = UserStoryKt.currentIndex(userStory2)) == null)) {
            i2 = currentIndex.intValue();
        }
        t.mo96785a("story_current_num", i2);
        t.mo96786a("story_collection_id", C76706a.m134276b(aweme2));
        UserStory userStory3 = aweme.getUserStory();
        if (userStory3 != null) {
            j = userStory3.getTotalCount();
        } else {
            j = 0;
        }
        t.mo96785a("item_cnt", (int) j);
        t.mo96786a("enter_method", f171917b);
        t.mo96786a("enter_position", str);
        if (C76660b.m134244d() && bool != null) {
            t.mo96785a("dm_entrance_show", bool.booleanValue() ? 1 : 0);
        }
        if (C80537hk.m139613a(str2)) {
            t.mo96786a("enter_play_method", str2);
        }
        return t;
    }
}
