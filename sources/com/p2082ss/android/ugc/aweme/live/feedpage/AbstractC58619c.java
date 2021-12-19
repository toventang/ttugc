package com.p2082ss.android.ugc.aweme.live.feedpage;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.live.feedpage.c */
public interface AbstractC58619c {
    static {
        Covode.recordClassIndex(68919);
    }

    /* renamed from: a */
    void mo96083a(long j);

    /* renamed from: a */
    void mo96084a(User user, AbstractC88433f<Map<Long, Long>> fVar, String str);

    /* renamed from: a */
    void mo96085a(User user, List<User> list, AbstractC88433f<Long> fVar, String str);

    /* renamed from: a */
    void mo96086a(List<Aweme> list);

    /* renamed from: b */
    void mo96087b(List<FollowFeed> list);
}
