package com.p2082ss.android.ugc.aweme.p3452ml.p3454ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.setting.model.MLModel;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartPreloadProfileV2Experiment */
public interface SmartPreloadProfileV2Experiment {

    /* renamed from: a */
    public static final PreloadProfileMLModel f136619a = null;

    static {
        Covode.recordClassIndex(70420);
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartPreloadProfileV2Experiment$a */
    public static class C59985a {

        /* renamed from: a */
        public static boolean f136620a;

        /* renamed from: b */
        public static PreloadProfileMLModel f136621b;

        /* renamed from: c */
        public static int f136622c;

        /* renamed from: d */
        public static float f136623d = 0.5f;

        /* renamed from: e */
        public static float f136624e = 0.5f;

        static {
            Covode.recordClassIndex(70422);
        }

        /* renamed from: b */
        public static boolean m109507b() {
            if (m109506a() == null) {
                return false;
            }
            if (m109506a().groupId == 5 || f136622c == 6) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public static boolean m109508c() {
            if (m109506a() == null || m109506a().groupId <= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public static PreloadProfileMLModel m109506a() {
            if (!f136620a) {
                PreloadProfileMLModel preloadProfileMLModel = (PreloadProfileMLModel) C16048b.m29633a().mo25416a(false, "smart_feed_preload_profile_ml", PreloadProfileMLModel.class, SmartPreloadProfileV2Experiment.f136619a);
                f136621b = preloadProfileMLModel;
                if (preloadProfileMLModel != null) {
                    f136622c = preloadProfileMLModel.groupId;
                    f136623d = f136621b.clientAIThreshold;
                    f136624e = f136621b.recommendThreshold;
                }
                f136620a = true;
            }
            return f136621b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartPreloadProfileV2Experiment$PreloadProfileMLModel */
    public static class PreloadProfileMLModel extends MLModel {
        @AbstractC27891c(mo46611a = "client_ai_threshold")
        public float clientAIThreshold = 0.5f;
        @AbstractC27891c(mo46611a = "group_id")
        public int groupId;
        @AbstractC27891c(mo46611a = "recommend_threshold")
        public float recommendThreshold = 0.5f;

        static {
            Covode.recordClassIndex(70421);
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.model.MLModel
        public String toString() {
            return "PreloadProfileMLModel{groupId=" + this.groupId + ", clientAIThreshold=" + this.clientAIThreshold + ", recommendThreshold=" + this.recommendThreshold + ", scene='" + this.scene + '\'' + ", packageUrl='" + this.packageUrl + '\'' + ", type=" + this.type + ", params=" + Arrays.toString(this.params) + '}';
        }
    }
}
