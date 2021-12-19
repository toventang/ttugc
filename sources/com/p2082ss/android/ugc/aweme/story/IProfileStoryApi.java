package com.p2082ss.android.ugc.aweme.story;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.story.model.C77381d;
import com.p2082ss.android.ugc.aweme.story.model.C77384g;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.story.IProfileStoryApi */
public interface IProfileStoryApi {
    static {
        Covode.recordClassIndex(89390);
    }

    @AbstractC22000h(mo35789a = "/tiktok/story/archive/detail/v1")
    AbstractC88979t<C77381d> getStoryArchDetail();

    @AbstractC22000h(mo35789a = "/tiktok/story/view/info/v1")
    AbstractC88979t<C77384g> getStoryViewInfo(@AbstractC22018z(mo35807a = "sec_author_id") String str, @AbstractC22018z(mo35807a = "author_id") String str2);
}
