package com.p2082ss.android.ugc.aweme.p3452ml.p3454ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.InputFeaturesConfig;
import com.p2082ss.android.ugc.aweme.setting.model.MLModel;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartFeedLoadMoreExperiment */
public interface SmartFeedLoadMoreExperiment {

    /* renamed from: a */
    public static final FeedLoadMoreMLModel f136595a = null;

    static {
        Covode.recordClassIndex(70408);
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartFeedLoadMoreExperiment$a */
    public static class C59982a {

        /* renamed from: a */
        public static boolean f136596a;

        /* renamed from: b */
        public static FeedLoadMoreMLModel f136597b;

        /* renamed from: c */
        public static int f136598c = 10;

        /* renamed from: d */
        public static int f136599d;

        /* renamed from: e */
        public static long f136600e;

        /* renamed from: f */
        public static boolean f136601f;

        /* renamed from: g */
        public static int f136602g;

        static {
            Covode.recordClassIndex(70410);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel */
    public static class FeedLoadMoreMLModel extends MLModel {
        @AbstractC27891c(mo46611a = "count_when_execute")
        public int countWhenExecute;
        @AbstractC27891c(mo46611a = "features")
        public InputFeaturesConfig features;
        @AbstractC27891c(mo46611a = "load_model_before")
        public boolean loadModelBefore;
        @AbstractC27891c(mo46611a = "real")
        public OnePlaytimePredictRealConfig realConfig;
        @AbstractC27891c(mo46611a = "run_delay")
        public int runDelay = 16;
        @AbstractC27891c(mo46611a = "skip_count")
        public int skipCount;
        @AbstractC27891c(mo46611a = "track")
        public OneSmartDataTrackConfig track;

        static {
            Covode.recordClassIndex(70409);
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.model.MLModel
        public String toString() {
            return "{countWhenExecute=" + this.countWhenExecute + ", runDelay=" + this.runDelay + ", loadModelBefore=" + this.loadModelBefore + ", skipCount=" + this.skipCount + ", scene='" + this.scene + '\'' + ", packageUrl='" + this.packageUrl + '\'' + ", type=" + this.type + ", params=" + Arrays.toString(this.params) + ", features=" + this.features + ", track=" + this.track + ", realConfig=" + this.realConfig + '}';
        }
    }
}
