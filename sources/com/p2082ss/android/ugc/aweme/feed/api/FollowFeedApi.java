package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FollowFeedApi */
public interface FollowFeedApi {

    /* renamed from: a */
    public static final C48326a f111996a = C48326a.f111997a;

    static {
        Covode.recordClassIndex(57090);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/following/interest/feed/")
    AbstractC88979t<C48336j> getFollowingInterestFeed(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "following_uid") String str, @AbstractC89736t(mo144292a = "refresh_type") int i3, @AbstractC89736t(mo144292a = "sky_light_type") int i4, @AbstractC89736t(mo144292a = "is_blue_user") boolean z);

    @AbstractC89722f(mo144276a = "/aweme/v1/following/interest/users/")
    AbstractC88979t<C48338l> getInterestUsers(@AbstractC89736t(mo144292a = "following_list_type") int i, @AbstractC89736t(mo144292a = "last_display_time") long j, @AbstractC89736t(mo144292a = "sky_light_type") int i2);

    /* renamed from: com.ss.android.ugc.aweme.feed.api.FollowFeedApi$a */
    public static final class C48326a {

        /* renamed from: a */
        static final /* synthetic */ C48326a f111997a = new C48326a();

        private C48326a() {
        }

        static {
            Covode.recordClassIndex(57091);
        }

        /* renamed from: a */
        public static FollowFeedApi m91784a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C29736b.f70924e).create(FollowFeedApi.class);
            C89219l.m154716b(create, "");
            return (FollowFeedApi) create;
        }
    }
}
