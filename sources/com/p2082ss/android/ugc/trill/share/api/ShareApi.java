package com.p2082ss.android.ugc.trill.share.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.Map;

/* renamed from: com.ss.android.ugc.trill.share.api.ShareApi */
public final class ShareApi {

    /* renamed from: a */
    static final ShareService f190515a = ((ShareService) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(ShareService.class));

    /* renamed from: com.ss.android.ugc.trill.share.api.ShareApi$ShareService */
    public interface ShareService {
        static {
            Covode.recordClassIndex(99199);
        }

        @AbstractC22000h(mo35789a = "/aweme/v1/thrid/platform/share/")
        AbstractC21983b<AutoShare> autoShare(@AbstractC21987aa Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(99198);
    }
}
