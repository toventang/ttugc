package com.p2082ss.android.ugc.aweme.service;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.follow.presenter.FollowFeed;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.service.IFollowFeedService */
public interface IFollowFeedService {
    static {
        Covode.recordClassIndex(79522);
    }

    /* renamed from: a */
    AbstractC35329by mo86498a(Context context);

    /* renamed from: a */
    String mo86499a(ActivityC0945e eVar);

    /* renamed from: a */
    List<Aweme> mo86500a(List<? extends FollowFeed> list);

    /* renamed from: a */
    void mo86501a();

    /* renamed from: a */
    void mo86502a(ActivityC0945e eVar, float f);

    /* renamed from: b */
    float mo86503b(ActivityC0945e eVar);

    /* renamed from: b */
    Fragment mo86504b();
}
