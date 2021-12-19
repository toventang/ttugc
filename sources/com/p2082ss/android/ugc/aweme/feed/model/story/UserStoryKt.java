package com.p2082ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.story.UserStoryKt */
public final class UserStoryKt {
    static {
        Covode.recordClassIndex(58843);
    }

    public static final Integer currentIndex(UserStory userStory) {
        C89219l.m154721d(userStory, "");
        UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
        if (currentInfo != null) {
            return currentInfo.getCurrentIndex();
        }
        return null;
    }

    public static final Aweme currentStory(UserStory userStory) {
        C89219l.m154721d(userStory, "");
        UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
        if (currentInfo != null) {
            return currentInfo.getCurrentStory();
        }
        return null;
    }

    public static final UserStory copyAll(UserStory userStory) {
        C89219l.m154721d(userStory, "");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(userStory.getStories());
        UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
        UserStoryCurrentInfo userStoryCurrentInfo = null;
        if (currentInfo != null) {
            userStoryCurrentInfo = UserStoryCurrentInfo.copy$default(currentInfo, null, null, 3, null);
        }
        return UserStory.copy$default(userStory, arrayList, 0, 0, false, 0, 0, false, false, 0, 0, userStoryCurrentInfo, false, false, false, 15358, null);
    }

    public static final UserStory copyUserStory(UserStory userStory) {
        if (userStory == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(userStory.getStories());
        return UserStory.copy$default(userStory, arrayList, 0, 0, false, 0, 0, false, false, 0, 0, null, false, false, false, 16382, null);
    }

    public static final UserStory update(UserStory userStory, UserStory userStory2) {
        C89219l.m154721d(userStory, "");
        if (userStory2 == null) {
            return userStory;
        }
        List<Aweme> stories = userStory.getStories();
        stories.clear();
        stories.addAll(userStory2.getStories());
        userStory.setTotalCount(userStory2.getTotalCount());
        userStory.setCurrentPosition(userStory2.getCurrentPosition());
        userStory.setAllViewed(userStory2.getAllViewed());
        userStory.setMinCursor(userStory2.getMinCursor());
        userStory.setMaxCursor(userStory2.getMaxCursor());
        userStory.setHasMoreAfter(userStory2.getHasMoreBefore());
        userStory.setHasMoreBefore(userStory2.getHasMoreBefore());
        userStory.setLastStoryCreatedAt(userStory2.getLastStoryCreatedAt());
        UserStoryCurrentInfo currentInfo = userStory2.getCurrentInfo();
        UserStoryCurrentInfo userStoryCurrentInfo = null;
        if (currentInfo != null) {
            userStoryCurrentInfo = UserStoryCurrentInfo.copy$default(currentInfo, null, null, 3, null);
        }
        userStory.setCurrentInfo(userStoryCurrentInfo);
        return userStory;
    }
}
