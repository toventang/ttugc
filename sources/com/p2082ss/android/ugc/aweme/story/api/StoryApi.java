package com.p2082ss.android.ugc.aweme.story.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.detail.p2748g.C41128a;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.p2082ss.android.ugc.aweme.story.archive.p4018a.C76461a;
import com.p2082ss.android.ugc.aweme.story.model.C77381d;
import com.p2082ss.android.ugc.aweme.story.model.C77387j;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.api.StoryApi */
public final class StoryApi implements IStoryApi {

    /* renamed from: a */
    public static final StoryApi f171712a = new StoryApi();

    /* renamed from: b */
    private final /* synthetic */ IStoryApi f171713b;

    @Override // com.p2082ss.android.ugc.aweme.story.api.IStoryApi
    @AbstractC22000h(mo35789a = "/tiktok/story/archive/detail/v1")
    public final AbstractC88979t<C77381d> getStoryArchDetail() {
        return this.f171713b.getStoryArchDetail();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.api.IStoryApi
    @AbstractC22000h(mo35789a = "/tiktok/story/archive/list/v1")
    public final AbstractC88979t<C76461a> getStoryArchList(@AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "count") long j2) {
        return this.f171713b.getStoryArchList(j, j2);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.api.IStoryApi
    @AbstractC22000h(mo35789a = "/tiktok/v1/story/get_user_stories")
    public final AbstractC88979t<C77387j> getUserStories(@AbstractC22018z(mo35807a = "author_ids") String str) {
        C89219l.m154721d(str, "");
        return this.f171713b.getUserStories(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.api.IStoryApi
    @AbstractC22000h(mo35789a = "/tiktok/v1/story/get_user_story")
    public final AbstractC88979t<UserStoryResponse> getUserStory(@AbstractC22018z(mo35807a = "author_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "load_before") boolean z, @AbstractC22018z(mo35807a = "count") int i) {
        C89219l.m154721d(str, "");
        return this.f171713b.getUserStory(str, j, z, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.api.IStoryApi
    @AbstractC22000h(mo35789a = "/aweme/v1/multi/aweme/detail/")
    public final AbstractC88979t<C41128a> queryBatchAwemeRx(@AbstractC22018z(mo35807a = "aweme_ids") String str, @AbstractC22018z(mo35807a = "origin_type") String str2, @AbstractC22018z(mo35807a = "push_params") String str3, @AbstractC22018z(mo35807a = "story_req_source") int i) {
        return this.f171713b.queryBatchAwemeRx(str, str2, str3, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.api.IStoryApi
    @AbstractC22012t(mo35799a = "/tiktok/story/view/report/v1")
    public final AbstractC88403ab<BaseResponse> reportStoryViewed(@AbstractC22018z(mo35807a = "story_id") String str) {
        C89219l.m154721d(str, "");
        return this.f171713b.reportStoryViewed(str);
    }

    static {
        Covode.recordClassIndex(89419);
    }

    private StoryApi() {
        Object a = RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(IStoryApi.class);
        C89219l.m154716b(a, "");
        this.f171713b = (IStoryApi) a;
    }
}
