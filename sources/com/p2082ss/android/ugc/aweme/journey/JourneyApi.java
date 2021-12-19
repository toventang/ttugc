package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.journey.JourneyApi */
public interface JourneyApi {

    /* renamed from: com.ss.android.ugc.aweme.journey.JourneyApi$a */
    public static final class C56816a {
        static {
            Covode.recordClassIndex(66699);
        }
    }

    static {
        Covode.recordClassIndex(66698);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/config/list/")
    AbstractC88979t<C56868o> getJourney(@AbstractC89736t(mo144292a = "recommend_group") Integer num, @AbstractC89736t(mo144292a = "type") String str, @AbstractC89736t(mo144292a = "gender_selection_ab") String str2);

    @AbstractC89731o(mo144285a = "tiktok/v1/gender/selection/")
    @AbstractC89721e
    AbstractC88979t<BaseResponse> uploadGender(@AbstractC89719c(mo144273a = "gender_selection") int i);

    @AbstractC89731o(mo144285a = "aweme/v1/user/interest/select/")
    @AbstractC89721e
    AbstractC88979t<BaseResponse> uploadInterest(@AbstractC89719c(mo144273a = "selectedInterestList") String str, @AbstractC89719c(mo144273a = "type") String str2);
}
