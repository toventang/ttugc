package com.p2082ss.android.ugc.aweme.homepage.story;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.homepage.story.p3053b.C53029a;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.HomepageStoryApi */
public final class HomepageStoryApi implements IHomepageStoryApi {

    /* renamed from: a */
    public static final HomepageStoryApi f121858a = new HomepageStoryApi();

    /* renamed from: c */
    private final /* synthetic */ IHomepageStoryApi f121859c;

    @Override // com.p2082ss.android.ugc.aweme.homepage.story.IHomepageStoryApi
    @AbstractC22000h(mo35789a = "/tiktok/v1/story/get_feed")
    public final AbstractC88979t<C53029a> getFeed(@AbstractC22018z(mo35807a = "refresh") boolean z) {
        return this.f121859c.getFeed(z);
    }

    static {
        Covode.recordClassIndex(62532);
    }

    private HomepageStoryApi() {
        Object a = RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(IHomepageStoryApi.class);
        C89219l.m154716b(a, "");
        this.f121859c = (IHomepageStoryApi) a;
    }
}
