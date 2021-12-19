package com.p2082ss.android.ugc.aweme.story.p4019b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.b.i */
public final class C76599i {
    static {
        Covode.recordClassIndex(89584);
    }

    /* renamed from: a */
    public static final String m134188a(C49812b bVar) {
        C89219l.m154721d(bVar, "");
        if (C89070n.m154522b("STORY_ENTRANCE_AVATAR", "STORY_ENTRANCE_MINE", "STORY_ENTRANCE_OTHER", "STORY_ENTRANCE_SIDE_BAR").contains(bVar.getFrom())) {
            return "head";
        }
        if (C89219l.m154714a((Object) bVar.getFrom(), (Object) "STORY_ENTRANCE_PREVIEW")) {
            return "";
        }
        if (C89219l.m154714a((Object) "homepage_follow", (Object) bVar.getEventType()) || C89219l.m154714a((Object) "homepage_hot", (Object) bVar.getEventType())) {
            return "feed";
        }
        return "video_cover";
    }
}
