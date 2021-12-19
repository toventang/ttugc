package com.p2082ss.android.ugc.aweme.p3452ml.p3454ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.InputFeaturesConfig;
import com.p2082ss.android.ugc.aweme.setting.model.MLModel;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartPreloadExperiment */
public interface SmartPreloadExperiment {

    /* renamed from: a */
    public static final SmartPreloadModel f136609a = null;

    static {
        Covode.recordClassIndex(70417);
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartPreloadExperiment$a */
    public static class C59984a {

        /* renamed from: a */
        public static boolean f136610a;

        /* renamed from: b */
        public static SmartPreloadModel f136611b;

        /* renamed from: c */
        public static int f136612c = 5;

        /* renamed from: d */
        public static int f136613d;

        /* renamed from: e */
        public static int f136614e;

        /* renamed from: f */
        public static boolean f136615f;

        /* renamed from: g */
        public static boolean f136616g;

        /* renamed from: h */
        public static long f136617h;

        /* renamed from: i */
        public static int f136618i;

        static {
            Covode.recordClassIndex(70419);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartPreloadExperiment$SmartPreloadModel */
    public static class SmartPreloadModel extends MLModel {
        @AbstractC27891c(mo46611a = "embedding_range")
        public int embeddingRange;
        @AbstractC27891c(mo46611a = "features")
        public InputFeaturesConfig features;
        @AbstractC27891c(mo46611a = "not_repeat")
        public boolean notRepeat;
        @AbstractC27891c(mo46611a = "not_run_when_pause")
        public boolean notRunWhenPause;
        @AbstractC27891c(mo46611a = "real")
        public OnePlaytimePredictRealConfig realConfig;
        @AbstractC27891c(mo46611a = "run_delay")
        public int runDelay;
        @AbstractC27891c(mo46611a = "skip_count")
        public int skipCount;
        @AbstractC27891c(mo46611a = "track")
        public OneSmartDataTrackConfig track;

        static {
            Covode.recordClassIndex(70418);
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.model.MLModel
        public String toString() {
            return "SmartPreloadModel{embeddingRange=" + this.embeddingRange + ", skipCount=" + this.skipCount + ", notRunWhenPause=" + this.notRunWhenPause + ", notRepeat=" + this.notRepeat + ", runDelay=" + this.runDelay + ", scene='" + this.scene + '\'' + ", packageUrl='" + this.packageUrl + '\'' + ", type=" + this.type + ", params=" + Arrays.toString(this.params) + ", features=" + this.features + ", track=" + this.track + ", realConfig=" + this.realConfig + '}';
        }
    }
}
