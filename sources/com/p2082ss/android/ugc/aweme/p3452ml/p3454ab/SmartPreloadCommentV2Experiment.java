package com.p2082ss.android.ugc.aweme.p3452ml.p3454ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.setting.model.MLModel;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartPreloadCommentV2Experiment */
public interface SmartPreloadCommentV2Experiment {

    /* renamed from: a */
    public static final PreloadCommentMLModel f136603a = null;

    static {
        Covode.recordClassIndex(70414);
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartPreloadCommentV2Experiment$a */
    public static class C59983a {

        /* renamed from: a */
        public static boolean f136604a;

        /* renamed from: b */
        public static PreloadCommentMLModel f136605b;

        /* renamed from: c */
        public static int f136606c;

        /* renamed from: d */
        public static float f136607d = 0.5f;

        /* renamed from: e */
        public static float f136608e = 0.5f;

        static {
            Covode.recordClassIndex(70416);
        }

        /* renamed from: b */
        public static boolean m109504b() {
            if (m109503a() == null) {
                return false;
            }
            if (m109503a().groupId == 5 || f136606c == 6) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public static boolean m109505c() {
            if (m109503a() == null || m109503a().groupId <= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public static PreloadCommentMLModel m109503a() {
            if (!f136604a) {
                PreloadCommentMLModel preloadCommentMLModel = (PreloadCommentMLModel) C16048b.m29633a().mo25416a(false, "smart_feed_preload_comment_ml", PreloadCommentMLModel.class, SmartPreloadCommentV2Experiment.f136603a);
                f136605b = preloadCommentMLModel;
                if (preloadCommentMLModel != null) {
                    f136606c = preloadCommentMLModel.groupId;
                    f136607d = f136605b.clientAIThreshold;
                    f136608e = f136605b.recommendThreshold;
                }
                f136604a = true;
            }
            return f136605b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartPreloadCommentV2Experiment$PreloadCommentMLModel */
    public static class PreloadCommentMLModel extends MLModel {
        @AbstractC27891c(mo46611a = "client_ai_threshold")
        public float clientAIThreshold = 0.5f;
        @AbstractC27891c(mo46611a = "group_id")
        public int groupId;
        @AbstractC27891c(mo46611a = "recommend_threshold")
        public float recommendThreshold = 0.5f;

        static {
            Covode.recordClassIndex(70415);
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.model.MLModel
        public String toString() {
            return "PreloadCommentMLModel{groupId=" + this.groupId + ", clientAIThreshold=" + this.clientAIThreshold + ", recommendThreshold=" + this.recommendThreshold + ", scene='" + this.scene + '\'' + ", packageUrl='" + this.packageUrl + '\'' + ", type=" + this.type + ", params=" + Arrays.toString(this.params) + '}';
        }
    }
}
