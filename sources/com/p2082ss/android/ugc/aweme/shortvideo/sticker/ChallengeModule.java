package com.p2082ss.android.ugc.aweme.shortvideo.sticker;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ChallengeModule */
public final class ChallengeModule {

    /* renamed from: a */
    public final ChallengeDetailApi f163430a = ((ChallengeDetailApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(ChallengeDetailApi.class));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ChallengeModule$ChallengeDetailApi */
    public interface ChallengeDetailApi {
        static {
            Covode.recordClassIndex(85520);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/challenge/detail/")
        AbstractFutureC27655q<ChallengeDetail> fetchChallengeDetail(@AbstractC89736t(mo144292a = "ch_id") String str, @AbstractC89736t(mo144292a = "hashtag_name") String str2, @AbstractC89736t(mo144292a = "query_type") int i, @AbstractC89736t(mo144292a = "click_reason") int i2);

        @AbstractC89722f(mo144276a = "/aweme/v1/commerce/challenge/detail/")
        AbstractFutureC27655q<ChallengeDetail> fetchCommerceChallengeDetail(@AbstractC89736t(mo144292a = "ch_id") String str, @AbstractC89736t(mo144292a = "hashtag_name") String str2, @AbstractC89736t(mo144292a = "query_type") int i, @AbstractC89736t(mo144292a = "click_reason") int i2);
    }

    static {
        Covode.recordClassIndex(85518);
    }
}
