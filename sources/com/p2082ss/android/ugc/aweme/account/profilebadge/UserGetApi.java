package com.p2082ss.android.ugc.aweme.account.profilebadge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.p2082ss.android.p2123b.C29736b;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.profilebadge.UserGetApi */
public interface UserGetApi {

    /* renamed from: a */
    public static final C32935a f78363a = C32935a.f78364a;

    static {
        Covode.recordClassIndex(39724);
    }

    @AbstractC22000h(mo35789a = "/aweme/v1/user/profile/self/")
    AbstractC88979t<UserGetResponse> getSelf();

    /* renamed from: com.ss.android.ugc.aweme.account.profilebadge.UserGetApi$a */
    public static final class C32935a {

        /* renamed from: a */
        static final /* synthetic */ C32935a f78364a = new C32935a();

        private C32935a() {
        }

        static {
            Covode.recordClassIndex(39725);
        }

        /* renamed from: a */
        public static UserGetApi m67573a() {
            Object a = RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(UserGetApi.class);
            C89219l.m154716b(a, "");
            return (UserGetApi) a;
        }
    }
}
