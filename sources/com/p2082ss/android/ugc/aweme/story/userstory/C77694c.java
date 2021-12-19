package com.p2082ss.android.ugc.aweme.story.userstory;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.userstory.c */
public final class C77694c {
    static {
        Covode.recordClassIndex(90741);
    }

    /* renamed from: a */
    public static final void m135715a(Aweme aweme, String str) {
        boolean z;
        int currentPosition;
        AwemeStatistics statistics;
        long j;
        List<Aweme> stories;
        Aweme aweme2;
        List<Aweme> stories2;
        Aweme aweme3;
        UserStory userStory;
        C89219l.m154721d(aweme, "");
        UserStory userStory2 = aweme.getUserStory();
        if (userStory2 == null || userStory2.getFakeAwemeShell() || (userStory = aweme.getUserStory()) == null || userStory.getFakeSelfStoryCollection()) {
            z = false;
        } else {
            z = true;
        }
        if (aweme.getAid() == null) {
            aweme.setAid("");
        }
        Aweme aweme4 = null;
        if (aweme.getAuthor() == null) {
            UserStory userStory3 = aweme.getUserStory();
            aweme.setAuthor((userStory3 == null || (stories2 = userStory3.getStories()) == null || (aweme3 = (Aweme) C89070n.m154583g((List) stories2)) == null) ? null : aweme3.getAuthor());
        }
        if (aweme.getHybridLabels() == null) {
            UserStory userStory4 = aweme.getUserStory();
            aweme.setHybridLabels((userStory4 == null || (stories = userStory4.getStories()) == null || (aweme2 = (Aweme) C89070n.m154583g((List) stories)) == null) ? null : aweme2.getHybridLabels());
        }
        UserStory userStory5 = aweme.getUserStory();
        if (userStory5 != null) {
            List<Aweme> stories3 = userStory5.getStories();
            User author = aweme.getAuthor();
            List<AwemeHybridLabelModel> hybridLabels = aweme.getHybridLabels();
            C89219l.m154721d(stories3, "");
            ArrayList<Aweme> arrayList = new ArrayList(C89070n.m154526a((Iterable) stories3, 10));
            int i = 0;
            for (T t : stories3) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                Aweme a = C77692a.f174254a.mo60677a((Aweme) t);
                C89219l.m154716b(a, "");
                stories3.set(i, a);
                arrayList.add(stories3.get(i));
                i = i2;
            }
            for (Aweme aweme5 : arrayList) {
                if (C76660b.m134245e() && (statistics = aweme5.getStatistics()) != null) {
                    Story story = aweme5.getStory();
                    if (story != null) {
                        j = story.getTotalComments();
                    } else {
                        j = 0;
                    }
                    statistics.setCommentCount(j);
                }
                if (author != null) {
                    aweme5.setAuthor(author);
                }
                if (str != null) {
                    aweme5.setRequestId(str);
                }
                aweme5.setUserStory(null);
                if (hybridLabels != null) {
                    aweme5.setHybridLabels(hybridLabels);
                }
            }
            Integer currentIndex = UserStoryKt.currentIndex(userStory5);
            if (currentIndex != null) {
                currentPosition = currentIndex.intValue();
            } else {
                currentPosition = (int) userStory5.getCurrentPosition();
            }
            Integer valueOf = Integer.valueOf(currentPosition);
            if (userStory5.getStories().size() > 0 && (aweme4 = UserStoryKt.currentStory(userStory5)) == null) {
                aweme4 = userStory5.getStories().get(0);
            }
            userStory5.setCurrentInfo(new UserStoryCurrentInfo(valueOf, aweme4));
            if (z) {
                userStory5.setOriginTotalCount(userStory5.getTotalCount());
            }
        }
        if (str != null) {
            aweme.setRequestId(str);
        }
    }
}
