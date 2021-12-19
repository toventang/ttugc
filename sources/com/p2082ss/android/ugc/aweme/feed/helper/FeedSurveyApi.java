package com.p2082ss.android.ugc.aweme.feed.helper;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88403ab;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.FeedSurveyApi */
public interface FeedSurveyApi {

    /* renamed from: a */
    public static final C49614a f114162a = C49614a.f114163a;

    static {
        Covode.recordClassIndex(58460);
    }

    @AbstractC89731o(mo144285a = "/aweme/v1/survey/set/")
    @AbstractC89721e
    AbstractC88403ab<BaseResponse> submitFeedSurvey(@AbstractC89719c(mo144273a = "item_id") String str, @AbstractC89719c(mo144273a = "source") int i, @AbstractC89719c(mo144273a = "operation") int i2, @AbstractC89719c(mo144273a = "feed_survey") String str2);

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.FeedSurveyApi$a */
    public static final class C49614a {

        /* renamed from: a */
        static final /* synthetic */ C49614a f114163a = new C49614a();

        private C49614a() {
        }

        static {
            Covode.recordClassIndex(58461);
        }
    }
}
