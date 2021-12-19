package com.p2082ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.story.StoryKt */
public final class StoryKt {
    static {
        Covode.recordClassIndex(58829);
    }

    public static final Story copyStory(Story story) {
        if (story != null) {
            return Story.copy$default(story, 0, false, 0, false, 0, false, false, false, false, 511, null);
        }
        return null;
    }

    public static final boolean isExpired(Story story) {
        C89219l.m154721d(story, "");
        if (story.getExpiredAt() < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }
}
