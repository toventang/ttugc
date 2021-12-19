package com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.antiaddiction.api.TiktokRelieveAwemeApi */
public final class TiktokRelieveAwemeApi {

    /* renamed from: a */
    public static final RealApi f94073a;

    /* renamed from: b */
    public static final TiktokRelieveAwemeApi f94074b = new TiktokRelieveAwemeApi();

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.antiaddiction.api.TiktokRelieveAwemeApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(47816);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/addiction/aweme/")
        AbstractC88979t<TiktokRelieveAweme> getTiktokRelieveAweme(@AbstractC89736t(mo144292a = "type") int i);
    }

    private TiktokRelieveAwemeApi() {
    }

    static {
        Covode.recordClassIndex(47815);
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(RealApi.class);
        C89219l.m154716b(create, "");
        f94073a = (RealApi) create;
    }
}
