package com.p2082ss.android.ugc.aweme.profile.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.api.AddVideoApi */
public final class AddVideoApi implements IAddVideoApi {

    /* renamed from: a */
    public static final AddVideoApi f143995a = new AddVideoApi();

    /* renamed from: b */
    private final /* synthetic */ IAddVideoApi f143996b;

    @Override // com.p2082ss.android.ugc.aweme.profile.api.IAddVideoApi
    @AbstractC22000h(mo35789a = "/aweme/v1/aweme/post/")
    public final AbstractC88979t<FeedItemList> getMyPublishVideos(@AbstractC22018z(mo35807a = "source") int i, @AbstractC22018z(mo35807a = "user_avatar_shrink") String str, @AbstractC22018z(mo35807a = "video_cover_shrink") String str2, @AbstractC22018z(mo35807a = "filter_private") int i2, @AbstractC22018z(mo35807a = "max_cursor") long j, @AbstractC22018z(mo35807a = "sec_user_id") String str3, @AbstractC22018z(mo35807a = "count") int i3) {
        return this.f143996b.getMyPublishVideos(i, str, str2, i2, j, str3, i3);
    }

    static {
        Covode.recordClassIndex(74719);
    }

    private AddVideoApi() {
        Object a = RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(IAddVideoApi.class);
        C89219l.m154716b(a, "");
        this.f143996b = (IAddVideoApi) a;
    }
}
