package com.p2082ss.android.ugc.aweme.p3452ml.p3456c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartPreloadCommentV2Service;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.FeaturePlayTypeConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.InputFeaturesConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartDataCenterApiService;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartPreloadCommentV2Experiment;
import com.p2082ss.android.ugc.aweme.p3452ml.p3455b.C60014a;
import com.p2082ss.android.ugc.aweme.setting.model.MLModel;

/* renamed from: com.ss.android.ugc.aweme.ml.c.a */
public final class C60018a {

    /* renamed from: a */
    public C60020b f136706a;

    /* renamed from: b */
    public MLModel f136707b;

    static {
        Covode.recordClassIndex(70481);
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.c.a$a */
    public static class C60019a {

        /* renamed from: a */
        public static final C60018a f136708a = new C60018a();

        static {
            Covode.recordClassIndex(70482);
        }
    }

    public C60018a() {
        int i;
        SmartPreloadCommentV2Experiment.PreloadCommentMLModel a = SmartPreloadCommentV2Experiment.C59983a.m109503a();
        this.f136707b = a;
        if (a != null) {
            this.f136706a = new C60020b(new C60014a(this.f136707b));
            InputFeaturesConfig inputFeaturesConfig = new InputFeaturesConfig();
            FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
            featurePlayTypeConfig.setEnable(true);
            if (this.f136707b.params == null || this.f136707b.params.length <= 0) {
                i = 5;
            } else {
                i = this.f136707b.params[0];
            }
            featurePlayTypeConfig.setRange(i);
            featurePlayTypeConfig.setPlayRangeType("playtime");
            featurePlayTypeConfig.setFeedRangeType("");
            inputFeaturesConfig.setFTypePlay(featurePlayTypeConfig);
            SmartDataCenterApiService.instance().addSceneModelConfig(inputFeaturesConfig);
        }
        SmartPreloadCommentV2Service.getDebug();
    }
}
