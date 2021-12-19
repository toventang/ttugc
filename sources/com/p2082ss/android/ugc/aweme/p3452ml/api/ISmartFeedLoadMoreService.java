package com.p2082ss.android.ugc.aweme.p3452ml.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService */
public interface ISmartFeedLoadMoreService {

    /* renamed from: com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService$a */
    public interface AbstractC59994a {
        static {
            Covode.recordClassIndex(70437);
        }

        /* renamed from: a */
        void mo84943a(boolean z, int i);
    }

    static {
        Covode.recordClassIndex(70436);
    }

    void addVideoPlayEndReportData(JSONObject jSONObject, Aweme aweme, Integer num);

    void checkAndInit();

    boolean isSmartFeedLoadMoreScene(String str);

    boolean needCheckLoadMore(int i, int i2, Aweme aweme);

    void startSmartFeedLoadMoreJudge(Aweme aweme, AbstractC59994a aVar);

    /* renamed from: com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService$b */
    public static class C59995b {

        /* renamed from: a */
        public float f136650a = -1.0f;

        /* renamed from: b */
        public String f136651b;

        /* renamed from: c */
        public int f136652c = -1;

        static {
            Covode.recordClassIndex(70438);
        }

        public final String toString() {
            return "QualityData(lpPredict=" + this.f136650a + ", lpPredictL=" + this.f136651b + ", leftVideosCnt=" + this.f136652c + ')';
        }
    }
}
