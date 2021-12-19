package com.p2082ss.android.ugc.aweme.notification.redpoint;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notification.api.C61860a;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.notification.redpoint.MultiUserNoticeApi */
public final class MultiUserNoticeApi {

    /* renamed from: a */
    static final MultiUserNoticeRetrofitApi f141222a = ((MultiUserNoticeRetrofitApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C61860a.f140443e).create(MultiUserNoticeRetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.notification.redpoint.MultiUserNoticeApi$MultiUserNoticeRetrofitApi */
    public interface MultiUserNoticeRetrofitApi {
        static {
            Covode.recordClassIndex(72977);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/notice/multi_user/count/")
        C1731i<C62220e> getMultiUserNoticeCount(@AbstractC89736t(mo144292a = "user_ids") String str);
    }

    static {
        Covode.recordClassIndex(72976);
    }
}
