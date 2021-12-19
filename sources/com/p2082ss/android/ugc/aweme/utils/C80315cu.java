package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.cu */
public final class C80315cu {
    static {
        Covode.recordClassIndex(93583);
    }

    /* renamed from: a */
    public static final List<Aweme> m139237a(List<? extends FollowFeed> list) {
        Aweme aweme;
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            if (t != null) {
                aweme = t.getAweme();
            } else {
                aweme = null;
            }
            arrayList.add(aweme);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final List<FollowFeed> m139238b(List<? extends FollowFeed> list) {
        Aweme aweme;
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (t2 != null) {
                aweme = t2.getAweme();
            } else {
                aweme = null;
            }
            if (!C76706a.m134281g(aweme)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
