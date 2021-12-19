package com.p2082ss.android.ugc.aweme.story.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.story.api.b */
public interface AbstractC76444b {
    static {
        Covode.recordClassIndex(89421);
    }

    /* renamed from: a */
    Aweme mo120170a();

    /* renamed from: a */
    Aweme mo120171a(String str);

    /* renamed from: a */
    AbstractC88979t<Aweme> mo120172a(String str, boolean z);

    /* renamed from: a */
    AbstractC88979t<List<Aweme>> mo120173a(List<String> list);

    /* renamed from: a */
    void mo120174a(Aweme aweme, boolean z, String str);

    /* renamed from: a */
    void mo120175a(FollowStatus followStatus);
}
