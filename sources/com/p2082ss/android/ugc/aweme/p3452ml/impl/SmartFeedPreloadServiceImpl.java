package com.p2082ss.android.ugc.aweme.p3452ml.impl;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedPreloadService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartFeedPreloadService;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.AbstractC60091e;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.C60095h;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.C60100k;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.FeatureFeedTypeConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.FeaturePlayTypeConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.InputFeaturesConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.MlSdkConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartClassifySceneConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartPlaytimePredictService;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartSdkConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59978d;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.AbstractC59989d;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.AbstractC59990e;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OnePlaytimePredictConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OnePlaytimePredictRealConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OneSmartDataTrackConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartPreloadExperiment;
import com.p2082ss.android.ugc.aweme.p3452ml.p3455b.C60017d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.ml.impl.SmartFeedPreloadServiceImpl */
public final class SmartFeedPreloadServiceImpl extends SmartFeedPreloadService {

    /* renamed from: a */
    public boolean f136855a;

    /* renamed from: b */
    SmartPreloadExperiment.SmartPreloadModel f136856b;

    /* renamed from: c */
    public String f136857c = "";

    /* renamed from: d */
    public float f136858d = -1.0f;

    /* renamed from: e */
    private List<? extends PreloadStrategyConfig> f136859e;

    /* renamed from: f */
    private int f136860f;

    /* renamed from: g */
    private LruCache<String, Boolean> f136861g = new LruCache<>(8);

    /* renamed from: h */
    private boolean f136862h;

    /* renamed from: i */
    private boolean f136863i;

    static {
        Covode.recordClassIndex(70529);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedPreloadService
    public final String getPredictLabelResult() {
        return this.f136857c;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.impl.SmartFeedPreloadServiceImpl$b */
    static final class CallableC60061b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Throwable f136866a;

        static {
            Covode.recordClassIndex(70531);
        }

        CallableC60061b(Throwable th) {
            this.f136866a = th;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C13468b.m24210a(this.f136866a);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.impl.SmartFeedPreloadServiceImpl$a */
    static final class RunnableC60060a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SmartFeedPreloadServiceImpl f136864a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89237d f136865b;

        static {
            Covode.recordClassIndex(70530);
        }

        RunnableC60060a(SmartFeedPreloadServiceImpl smartFeedPreloadServiceImpl, C89233z.C89237d dVar) {
            this.f136864a = smartFeedPreloadServiceImpl;
            this.f136865b = dVar;
        }

        public final void run() {
            if (SmartFeedPreloadService.debug) {
                System.currentTimeMillis();
            }
            if (this.f136864a.f136856b != null) {
                SmartPlaytimePredictService.C60077b.f136899a.ensureEnvAvailable("playtime_ml");
            }
            if (SmartFeedPreloadService.debug) {
                System.currentTimeMillis();
                System.currentTimeMillis();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedPreloadService
    public final boolean enable() {
        if (this.f136856b == null || !SmartPlaytimePredictService.C60077b.f136899a.enable("playtime_ml")) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig>, java.util.List<com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig> */
    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedPreloadService
    public final List<PreloadStrategyConfig> getSmartPreloadStrategyExperimentValue() {
        if (this.f136859e == null) {
            try {
                PreloadStrategyConfig[] preloadStrategyConfigArr = AbstractC59989d.f136637b;
                if (preloadStrategyConfigArr != null) {
                    this.f136859e = C89064i.m154509j(preloadStrategyConfigArr);
                }
            } catch (Throwable unused) {
            }
            if (this.f136859e == null) {
                this.f136859e = C89086z.INSTANCE;
            }
        }
        List list = this.f136859e;
        if (list == null) {
            C89219l.m154715b();
        }
        return list;
    }

    /* renamed from: a */
    public static ISmartFeedPreloadService m109538a() {
        MethodCollector.m26663i(11311);
        Object a = C81908b.m141854a(ISmartFeedPreloadService.class, false);
        if (a != null) {
            ISmartFeedPreloadService iSmartFeedPreloadService = (ISmartFeedPreloadService) a;
            MethodCollector.m26664o(11311);
            return iSmartFeedPreloadService;
        }
        if (C81908b.f183255cE == null) {
            synchronized (ISmartFeedPreloadService.class) {
                try {
                    if (C81908b.f183255cE == null) {
                        C81908b.f183255cE = new SmartFeedPreloadServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11311);
                    throw th;
                }
            }
        }
        SmartFeedPreloadService smartFeedPreloadService = (SmartFeedPreloadService) C81908b.f183255cE;
        MethodCollector.m26664o(11311);
        return smartFeedPreloadService;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedPreloadService
    public final PreloadStrategyConfig getCurrentSmartPreloadStrategyConfig() {
        C60017d dVar;
        try {
            String predictLabelResult = getPredictLabelResult();
            if (TextUtils.isEmpty(predictLabelResult) || (dVar = AbstractC59990e.f136639b) == null || dVar.f136705c == null) {
                return null;
            }
            PreloadStrategyConfig[] preloadStrategyConfigArr = dVar.f136705c;
            C89219l.m154716b(preloadStrategyConfigArr, "");
            if (preloadStrategyConfigArr.length == 0) {
                return null;
            }
            PreloadStrategyConfig[] preloadStrategyConfigArr2 = dVar.f136705c;
            int i = dVar.f136703a;
            List<String> list = dVar.f136704b;
            if (list != null && list.size() > 0 && list.contains(predictLabelResult) && list.indexOf(predictLabelResult) < preloadStrategyConfigArr2.length) {
                i = list.indexOf(predictLabelResult);
            }
            PreloadStrategyConfig preloadStrategyConfig = preloadStrategyConfigArr2[i];
            boolean z = SmartFeedPreloadService.debug;
            return preloadStrategyConfig;
        } catch (Throwable th) {
            C1731i.m5640b(new CallableC60061b(th), C1731i.f5562a);
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedPreloadService
    public final void checkAndInit() {
        InputFeaturesConfig inputFeaturesConfig;
        OneSmartDataTrackConfig oneSmartDataTrackConfig;
        int i;
        MlSdkConfig mlSdkConfig;
        String str;
        boolean z;
        if (!this.f136863i) {
            this.f136863i = true;
            if (!SmartPreloadExperiment.C59984a.f136610a) {
                SmartPreloadExperiment.SmartPreloadModel smartPreloadModel = (SmartPreloadExperiment.SmartPreloadModel) C16048b.m29633a().mo25416a(true, "playtime_ml", SmartPreloadExperiment.SmartPreloadModel.class, SmartPreloadExperiment.f136609a);
                SmartPreloadExperiment.C59984a.f136611b = smartPreloadModel;
                if (smartPreloadModel != null) {
                    if (SmartPreloadExperiment.C59984a.f136611b.params != null && SmartPreloadExperiment.C59984a.f136611b.params.length > 0) {
                        SmartPreloadExperiment.C59984a.f136612c = SmartPreloadExperiment.C59984a.f136611b.params[0];
                    }
                    SmartPreloadExperiment.C59984a.f136613d = SmartPreloadExperiment.C59984a.f136611b.embeddingRange;
                    SmartPreloadExperiment.C59984a.f136614e = SmartPreloadExperiment.C59984a.f136611b.skipCount;
                    SmartPreloadExperiment.C59984a.f136615f = SmartPreloadExperiment.C59984a.f136611b.notRunWhenPause;
                    SmartPreloadExperiment.C59984a.f136616g = SmartPreloadExperiment.C59984a.f136611b.notRepeat;
                    SmartPreloadExperiment.C59984a.f136617h = (long) SmartPreloadExperiment.C59984a.f136611b.runDelay;
                    if (SmartPreloadExperiment.C59984a.f136611b.features == null) {
                        InputFeaturesConfig inputFeaturesConfig2 = new InputFeaturesConfig();
                        FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
                        featurePlayTypeConfig.setEnable(true);
                        featurePlayTypeConfig.setRange(SmartPreloadExperiment.C59984a.f136612c);
                        featurePlayTypeConfig.setPlayRangeType("playtime");
                        featurePlayTypeConfig.setFeedRangeType("");
                        inputFeaturesConfig2.setFTypePlay(featurePlayTypeConfig);
                        if (SmartPreloadExperiment.C59984a.f136618i != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        featurePlayTypeConfig.setRangeExcludeThis(z);
                        if (SmartPreloadExperiment.C59984a.f136613d > 0) {
                            FeatureFeedTypeConfig featureFeedTypeConfig = new FeatureFeedTypeConfig();
                            featureFeedTypeConfig.setEnable(true);
                            featureFeedTypeConfig.setRange(SmartPreloadExperiment.C59984a.f136613d);
                            featureFeedTypeConfig.setFeedRangeType("embeddings");
                        }
                        SmartPreloadExperiment.C59984a.f136611b.features = inputFeaturesConfig2;
                    }
                }
                SmartPreloadExperiment.C59984a.f136610a = true;
            }
            SmartPreloadExperiment.SmartPreloadModel smartPreloadModel2 = SmartPreloadExperiment.C59984a.f136611b;
            if (smartPreloadModel2 != null) {
                this.f136856b = smartPreloadModel2;
                OnePlaytimePredictConfig onePlaytimePredictConfig = new OnePlaytimePredictConfig();
                SmartClassifySceneConfig smartClassifySceneConfig = new SmartClassifySceneConfig();
                smartClassifySceneConfig.setScene("playtime_ml");
                SmartPreloadExperiment.SmartPreloadModel smartPreloadModel3 = this.f136856b;
                OnePlaytimePredictRealConfig onePlaytimePredictRealConfig = null;
                if (smartPreloadModel3 != null) {
                    inputFeaturesConfig = smartPreloadModel3.features;
                } else {
                    inputFeaturesConfig = null;
                }
                smartClassifySceneConfig.setFeatures(inputFeaturesConfig);
                smartClassifySceneConfig.setSdkConfig(new SmartSdkConfig());
                SmartSdkConfig sdkConfig = smartClassifySceneConfig.getSdkConfig();
                if (sdkConfig != null) {
                    sdkConfig.setMlSdkConfig(new MlSdkConfig());
                }
                SmartSdkConfig sdkConfig2 = smartClassifySceneConfig.getSdkConfig();
                if (!(sdkConfig2 == null || (mlSdkConfig = sdkConfig2.getMlSdkConfig()) == null)) {
                    SmartPreloadExperiment.SmartPreloadModel smartPreloadModel4 = this.f136856b;
                    if (smartPreloadModel4 != null) {
                        str = smartPreloadModel4.packageUrl;
                    } else {
                        str = null;
                    }
                    mlSdkConfig.setPackageUrl(str);
                }
                SmartPreloadExperiment.SmartPreloadModel smartPreloadModel5 = this.f136856b;
                if (smartPreloadModel5 != null) {
                    oneSmartDataTrackConfig = smartPreloadModel5.track;
                } else {
                    oneSmartDataTrackConfig = null;
                }
                smartClassifySceneConfig.setTrack(oneSmartDataTrackConfig);
                onePlaytimePredictConfig.setSceneConfig(smartClassifySceneConfig);
                SmartPreloadExperiment.SmartPreloadModel smartPreloadModel6 = this.f136856b;
                if (smartPreloadModel6 != null) {
                    i = smartPreloadModel6.runDelay;
                } else {
                    i = 0;
                }
                onePlaytimePredictConfig.setRunDelay(i);
                onePlaytimePredictConfig.setTrigger(0);
                SmartPreloadExperiment.SmartPreloadModel smartPreloadModel7 = this.f136856b;
                if (smartPreloadModel7 != null) {
                    onePlaytimePredictRealConfig = smartPreloadModel7.realConfig;
                }
                onePlaytimePredictConfig.setRealConfig(onePlaytimePredictRealConfig);
                SmartPlaytimePredictService.C60077b.f136899a.configOneNewService(onePlaytimePredictConfig);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedPreloadService
    public final void startSmartPreloadV2Judge(Aweme aweme) {
        if (aweme != null) {
            if (SmartFeedPreloadService.debug) {
                enable();
            }
            if (!enable()) {
                return;
            }
            if (SmartPreloadExperiment.C59984a.f136614e > 0 && this.f136860f < SmartPreloadExperiment.C59984a.f136614e) {
                int i = this.f136860f + 1;
                this.f136860f = i;
                if (i == SmartPreloadExperiment.C59984a.f136614e && !this.f136862h) {
                    this.f136862h = true;
                    C89233z.C89237d dVar = new C89233z.C89237d();
                    dVar.element = 0;
                    if (SmartFeedPreloadService.debug) {
                        dVar.element = System.currentTimeMillis();
                    }
                    C59978d.m109499a(new RunnableC60060a(this, dVar), SmartPreloadExperiment.C59984a.f136617h);
                }
            } else if (SmartPreloadExperiment.C59984a.f136617h <= 0 || !this.f136855a) {
                if (SmartPreloadExperiment.C59984a.f136616g) {
                    String aid = aweme.getAid();
                    if (this.f136861g.get(aid) == null) {
                        this.f136861g.put(aid, true);
                    } else {
                        return;
                    }
                }
                this.f136855a = true;
                C60095h hVar = new C60095h();
                hVar.f136928d = aweme;
                SmartPlaytimePredictService.C60077b.f136899a.predict("playtime_ml", hVar, null, new C60062c(this, aweme));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.impl.SmartFeedPreloadServiceImpl$c */
    public static final class C60062c implements AbstractC60091e {

        /* renamed from: a */
        final /* synthetic */ SmartFeedPreloadServiceImpl f136867a;

        /* renamed from: b */
        final /* synthetic */ Aweme f136868b;

        static {
            Covode.recordClassIndex(70532);
        }

        C60062c(SmartFeedPreloadServiceImpl smartFeedPreloadServiceImpl, Aweme aweme) {
            this.f136867a = smartFeedPreloadServiceImpl;
            this.f136868b = aweme;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.AbstractC60091e
        /* renamed from: a */
        public final void mo97502a(boolean z, C60100k kVar) {
            this.f136867a.f136855a = false;
            float f = -1.0f;
            String str = "";
            if (!z || kVar == null || kVar.f136965a == null) {
                this.f136867a.f136857c = str;
                this.f136867a.f136858d = -1.0f;
            } else {
                String str2 = kVar.f136965a;
                if (str2 != null) {
                    str = str2;
                }
                Float a = kVar.mo97635a();
                if (a != null) {
                    f = a.floatValue();
                }
                this.f136867a.f136857c = str;
                this.f136867a.f136858d = f;
            }
            if (SmartFeedPreloadService.debug) {
                this.f136868b.getAid();
                User author = this.f136868b.getAuthor();
                if (author != null) {
                    author.getNickname();
                }
            }
        }
    }
}
