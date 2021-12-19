package com.p2082ss.android.ugc.aweme.story.userstory.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStoryResponse;
import com.p2082ss.android.ugc.aweme.story.model.C77387j;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.userstory.api.UserStoryApi */
public final class UserStoryApi implements IUserStoryApi {

    /* renamed from: a */
    public static final UserStoryApi f174256a = new UserStoryApi();

    /* renamed from: b */
    private final /* synthetic */ IUserStoryApi f174257b;

    @Override // com.p2082ss.android.ugc.aweme.story.userstory.api.IUserStoryApi
    @AbstractC22000h(mo35789a = "/tiktok/v1/story/get_user_stories")
    public final AbstractC88979t<C77387j> getUserStories(@AbstractC22018z(mo35807a = "author_ids") String str) {
        C89219l.m154721d(str, "");
        return this.f174257b.getUserStories(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.userstory.api.IUserStoryApi
    @AbstractC22000h(mo35789a = "/tiktok/v1/story/get_user_story")
    public final AbstractC88979t<UserStoryResponse> getUserStory(@AbstractC22018z(mo35807a = "author_id") String str, @AbstractC22018z(mo35807a = "cursor") long j, @AbstractC22018z(mo35807a = "load_before") boolean z, @AbstractC22018z(mo35807a = "count") int i) {
        C89219l.m154721d(str, "");
        return this.f174257b.getUserStory(str, j, z, i);
    }

    static {
        Covode.recordClassIndex(90739);
    }

    private UserStoryApi() {
        Object a = RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(IUserStoryApi.class);
        C89219l.m154716b(a, "");
        this.f174257b = (IUserStoryApi) a;
    }
}
