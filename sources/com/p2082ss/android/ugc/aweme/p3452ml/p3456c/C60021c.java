package com.p2082ss.android.ugc.aweme.p3452ml.p3456c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartPreloadProfileV2Service;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.FeaturePlayTypeConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.InputFeaturesConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartDataCenterApiService;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartPreloadProfileV2Experiment;
import com.p2082ss.android.ugc.aweme.p3452ml.p3455b.C60014a;
import com.p2082ss.android.ugc.aweme.setting.model.MLModel;

/* renamed from: com.ss.android.ugc.aweme.ml.c.c */
public final class C60021c {

    /* renamed from: a */
    public C60023d f136709a;

    /* renamed from: b */
    public MLModel f136710b;

    static {
        Covode.recordClassIndex(70484);
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.c.c$a */
    public static class C60022a {

        /* renamed from: a */
        public static final C60021c f136711a = new C60021c();

        static {
            Covode.recordClassIndex(70485);
        }
    }

    public C60021c() {
        int i;
        SmartPreloadProfileV2Experiment.PreloadProfileMLModel a = SmartPreloadProfileV2Experiment.C59985a.m109506a();
        this.f136710b = a;
        if (a != null) {
            this.f136709a = new C60023d(new C60014a(this.f136710b));
            InputFeaturesConfig inputFeaturesConfig = new InputFeaturesConfig();
            FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
            featurePlayTypeConfig.setEnable(true);
            if (this.f136710b.params == null || this.f136710b.params.length <= 0) {
                i = 5;
            } else {
                i = this.f136710b.params[0];
            }
            featurePlayTypeConfig.setRange(i);
            featurePlayTypeConfig.setPlayRangeType("playtime");
            featurePlayTypeConfig.setFeedRangeType("");
            inputFeaturesConfig.setFTypePlay(featurePlayTypeConfig);
            SmartDataCenterApiService.instance().addSceneModelConfig(inputFeaturesConfig);
        }
        SmartPreloadProfileV2Service.getDebug();
    }
}
