package com.p2082ss.android.ugc.aweme.following.repository;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51103b;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51104c;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.following.repository.FollowRelationApi */
public interface FollowRelationApi {

    /* renamed from: a */
    public static final C51109a f117937a = C51109a.f117938a;

    static {
        Covode.recordClassIndex(60306);
    }

    @AbstractC89722f(mo144276a = "aweme/v1/connected/relation/list")
    AbstractC88979t<Object> queryConnectedList(@AbstractC89736t(mo144292a = "user_id") String str, @AbstractC89736t(mo144292a = "sec_user_id") String str2, @AbstractC89736t(mo144292a = "cursor") Integer num, @AbstractC89736t(mo144292a = "count") Integer num2);

    @AbstractC89722f(mo144276a = "/aweme/v1/user/follower/list/")
    AbstractC88979t<C51103b> queryFollowerList(@AbstractC89736t(mo144292a = "user_id") String str, @AbstractC89736t(mo144292a = "sec_user_id") String str2, @AbstractC89736t(mo144292a = "max_time") long j, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "offset") int i2, @AbstractC89736t(mo144292a = "source_type") int i3, @AbstractC89736t(mo144292a = "address_book_access") int i4);

    @AbstractC89722f(mo144276a = "/aweme/v1/user/following/list/")
    AbstractC88979t<C51104c> queryFollowingList(@AbstractC89736t(mo144292a = "user_id") String str, @AbstractC89736t(mo144292a = "sec_user_id") String str2, @AbstractC89736t(mo144292a = "max_time") long j, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "offset") int i2, @AbstractC89736t(mo144292a = "source_type") int i3, @AbstractC89736t(mo144292a = "address_book_access") int i4);

    /* renamed from: com.ss.android.ugc.aweme.following.repository.FollowRelationApi$a */
    public static final class C51109a {

        /* renamed from: a */
        static final /* synthetic */ C51109a f117938a = new C51109a();

        private C51109a() {
        }

        static {
            Covode.recordClassIndex(60307);
        }

        /* renamed from: a */
        public static FollowRelationApi m95539a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(FollowRelationApi.class);
            C89219l.m154716b(create, "");
            return (FollowRelationApi) create;
        }
    }
}
