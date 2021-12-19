package com.p2082ss.android.ugc.aweme.story;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.story.model.C77381d;
import com.p2082ss.android.ugc.aweme.story.model.C77384g;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.ProfileStoryApi */
public final class ProfileStoryApi implements IProfileStoryApi {

    /* renamed from: a */
    public static final ProfileStoryApi f171678a = new ProfileStoryApi();

    /* renamed from: b */
    private final /* synthetic */ IProfileStoryApi f171679b;

    @Override // com.p2082ss.android.ugc.aweme.story.IProfileStoryApi
    @AbstractC22000h(mo35789a = "/tiktok/story/archive/detail/v1")
    public final AbstractC88979t<C77381d> getStoryArchDetail() {
        return this.f171679b.getStoryArchDetail();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IProfileStoryApi
    @AbstractC22000h(mo35789a = "/tiktok/story/view/info/v1")
    public final AbstractC88979t<C77384g> getStoryViewInfo(@AbstractC22018z(mo35807a = "sec_author_id") String str, @AbstractC22018z(mo35807a = "author_id") String str2) {
        return this.f171679b.getStoryViewInfo(str, str2);
    }

    static {
        Covode.recordClassIndex(89392);
    }

    private ProfileStoryApi() {
        Object a = RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(IProfileStoryApi.class);
        C89219l.m154716b(a, "");
        this.f171679b = (IProfileStoryApi) a;
    }
}
