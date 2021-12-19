package com.p2082ss.android.ugc.aweme.story.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.detail.p2748g.C41128a;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.p2082ss.android.ugc.aweme.story.archive.p4018a.C76461a;
import com.p2082ss.android.ugc.aweme.story.model.C77381d;
import com.p2082ss.android.ugc.aweme.story.model.C77387j;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.story.api.IStoryApi */
public interface IStoryApi {
    static {
        Covode.recordClassIndex(89412);
    }

    @AbstractC22000h(mo35789a = "/tiktok/story/archive/detail/v1")
    AbstractC88979t<C77381d> getStoryArchDetail();

    @AbstractC22000h(mo35789a = "/tiktok/story/archive/list/v1")
    AbstractC88979t<C76461a> getStoryArchList(@AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") long j2);

    @AbstractC22000h(mo35789a = "/tiktok/v1/story/get_user_stories")
    AbstractC88979t<C77387j> getUserStories(@AbstractC22018z(mo35807a = "author_ids") String str);

    @AbstractC22000h(mo35789a = "/tiktok/v1/story/get_user_story")
    AbstractC88979t<UserStoryResponse> getUserStory(@AbstractC22018z(mo35807a = "author_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "load_before") boolean z, @AbstractC22018z(mo35807a = "count") int i);

    @AbstractC22000h(mo35789a = "/aweme/v1/multi/aweme/detail/")
    AbstractC88979t<C41128a> queryBatchAwemeRx(@AbstractC22018z(mo35807a = "aweme_ids") String str, @AbstractC22018z(mo35807a = "origin_type") String str2, @AbstractC22018z(mo35807a = "push_params") String str3, @AbstractC22018z(mo35807a = "story_req_source") int i);

    @AbstractC22012t(mo35799a = "/tiktok/story/view/report/v1")
    AbstractC88403ab<BaseResponse> reportStoryViewed(@AbstractC22018z(mo35807a = "story_id") String str);
}
