package com.p2082ss.android.ugc.aweme.story.p4054h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.h.c */
public final class C77277c {
    static {
        Covode.recordClassIndex(90294);
    }

    /* renamed from: a */
    public static final List<Aweme> m135094a(List<Aweme> list, String str, User user, List<AwemeHybridLabelModel> list2) {
        AwemeStatistics statistics;
        long j;
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            Aweme a = C77271a.f173355a.mo60677a((Aweme) t);
            C89219l.m154716b(a, "");
            list.set(i, a);
            arrayList.add(list.get(i));
            i = i2;
        }
        ArrayList<Aweme> arrayList2 = arrayList;
        for (Aweme aweme : arrayList2) {
            if (C76660b.m134245e() && (statistics = aweme.getStatistics()) != null) {
                Story story = aweme.getStory();
                if (story != null) {
                    j = story.getTotalComments();
                } else {
                    j = 0;
                }
                statistics.setCommentCount(j);
            }
            if (user != null) {
                aweme.setAuthor(user);
            }
            if (str != null) {
                aweme.setRequestId(str);
            }
            aweme.setUserStory(null);
            if (list2 != null) {
                aweme.setHybridLabels(list2);
            }
        }
        return arrayList2;
    }
}
