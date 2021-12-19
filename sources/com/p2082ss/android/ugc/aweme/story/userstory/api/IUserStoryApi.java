package com.p2082ss.android.ugc.aweme.story.userstory.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.p2082ss.android.ugc.aweme.story.model.C77387j;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.story.userstory.api.IUserStoryApi */
public interface IUserStoryApi {
    static {
        Covode.recordClassIndex(90738);
    }

    @AbstractC22000h(mo35789a = "/tiktok/v1/story/get_user_stories")
    AbstractC88979t<C77387j> getUserStories(@AbstractC22018z(mo35807a = "author_ids") String str);

    @AbstractC22000h(mo35789a = "/tiktok/v1/story/get_user_story")
    AbstractC88979t<UserStoryResponse> getUserStory(@AbstractC22018z(mo35807a = "author_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "load_before") boolean z, @AbstractC22018z(mo35807a = "count") int i);
}
