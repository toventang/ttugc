package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.p2082ss.android.ugc.aweme.feed.model.NewUserProgressModel;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.feed.api.UserGrowthDataApi */
public final class UserGrowthDataApi {

    /* renamed from: com.ss.android.ugc.aweme.feed.api.UserGrowthDataApi$NewUserProgressDataApi */
    public interface NewUserProgressDataApi {
        static {
            Covode.recordClassIndex(57098);
        }

        @AbstractC22000h(mo35789a = "/tiktok/v1/guidance/progressbar/")
        AbstractC88979t<NewUserProgressModel> getGuidanceProgressBarData();
    }

    static {
        Covode.recordClassIndex(57097);
    }
}
