package com.p2082ss.android.ugc.aweme.feed.p2963q;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.p2082ss.android.ugc.aweme.player.p3548a.C62900d;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.q.az */
public final class C49864az {
    static {
        Covode.recordClassIndex(58971);
    }

    /* renamed from: a */
    public static final void m93575a(C62900d.C62902a aVar, Aweme aweme, Aweme aweme2) {
        int i;
        long j;
        Integer currentIndex;
        C89219l.m154721d(aVar, "");
        if (aweme != null && aweme2 != null && C76706a.m134277c(aweme) && C76706a.m134278d(aweme2)) {
            aVar.mo100894b("story");
            aVar.mo100897c(C76706a.m134276b(aweme2));
            UserStory userStory = aweme.getUserStory();
            int i2 = 0;
            if (userStory != null) {
                i = (int) userStory.getCurrentPosition();
            } else {
                i = 0;
            }
            aVar.mo100905i(i);
            UserStory userStory2 = aweme.getUserStory();
            if (!(userStory2 == null || (currentIndex = UserStoryKt.currentIndex(userStory2)) == null)) {
                i2 = currentIndex.intValue();
            }
            aVar.mo100906j(i2);
            UserStory userStory3 = aweme.getUserStory();
            if (userStory3 != null) {
                j = userStory3.getTotalCount();
            } else {
                j = 0;
            }
            aVar.mo100907k((int) j);
        }
    }
}
