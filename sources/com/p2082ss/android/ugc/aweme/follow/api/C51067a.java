package com.p2082ss.android.ugc.aweme.follow.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.follow.api.a */
public final class C51067a {

    /* renamed from: a */
    public static IFollowFeedApiV1 f117794a;

    /* renamed from: b */
    public static final C51068a f117795b = new C51068a((byte) 0);

    /* renamed from: c */
    private static IRetrofitService f117796c;

    /* renamed from: com.ss.android.ugc.aweme.follow.api.a$a */
    public static final class C51068a {
        static {
            Covode.recordClassIndex(60256);
        }

        private C51068a() {
        }

        public /* synthetic */ C51068a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(60255);
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
        C89219l.m154716b(createIRetrofitServicebyMonsterPlugin, "");
        f117796c = createIRetrofitServicebyMonsterPlugin;
        Object create = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(C29736b.f70924e).create(IFollowFeedApiV1.class);
        C89219l.m154716b(create, "");
        f117794a = (IFollowFeedApiV1) create;
    }
}
