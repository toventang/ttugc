package com.p2082ss.android.ugc.aweme.p3452ml.impl;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.p2082ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIPlayTime;
import com.p2082ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIStrategyConfig;
import com.p2082ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;
import com.p2082ss.android.ugc.aweme.feed.model.commercialize.PlanConfig;
import com.p2082ss.android.ugc.aweme.feed.model.commercialize.UrlPackage;
import com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedAdUIService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartFeedAdUIService;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.AbstractC60091e;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.C60095h;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.C60100k;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.FeaturePlayTypeConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.InputFeaturesConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.MlSdkConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartClassifySceneConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartPlaytimePredictService;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartSdkConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59977c;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.C59978d;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.C59987b;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.CommerceSmartUIModelV2;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OnePlaytimePredictConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OnePlaytimePredictRealConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OneSmartDataTrackConfig;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.ml.impl.SmartFeedAdUIServiceImpl */
public final class SmartFeedAdUIServiceImpl extends SmartFeedAdUIService {

    /* renamed from: a */
    public boolean f136830a;

    /* renamed from: b */
    CommerceSmartUIModelV2 f136831b;

    /* renamed from: c */
    public String f136832c = "";

    /* renamed from: d */
    public float f136833d = -1.0f;

    /* renamed from: e */
    private boolean f136834e;

    /* renamed from: f */
    private boolean f136835f;

    static {
        Covode.recordClassIndex(70521);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedAdUIService
    public final CommerceSmartUIModel getSmartAdUIExperimentValue() {
        return C59987b.f136630b;
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.impl.SmartFeedAdUIServiceImpl$b */
    static final class CallableC60055b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Throwable f136838a;

        static {
            Covode.recordClassIndex(70523);
        }

        CallableC60055b(Throwable th) {
            this.f136838a = th;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C13468b.m24210a(this.f136838a);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.impl.SmartFeedAdUIServiceImpl$c */
    public static final class C60056c implements AbstractC60091e {

        /* renamed from: a */
        final /* synthetic */ SmartFeedAdUIServiceImpl f136839a;

        /* renamed from: b */
        final /* synthetic */ Aweme f136840b;

        static {
            Covode.recordClassIndex(70524);
        }

        /* renamed from: com.ss.android.ugc.aweme.ml.impl.SmartFeedAdUIServiceImpl$c$a */
        static final class CallableC60057a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C60056c f136841a;

            static {
                Covode.recordClassIndex(70525);
            }

            CallableC60057a(C60056c cVar) {
                this.f136841a = cVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                String str = this.f136841a.f136839a.f136832c;
                C89219l.m154721d("use_last_predict_label", "");
                C89219l.m154721d(str, "");
                C59977c.f136573b.put("use_last_predict_label", str);
                C59977c.f136572a.storeString("use_last_predict_label", str);
                return C89391z.f203057a;
            }
        }

        C60056c(SmartFeedAdUIServiceImpl smartFeedAdUIServiceImpl, Aweme aweme) {
            this.f136839a = smartFeedAdUIServiceImpl;
            this.f136840b = aweme;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.AbstractC60091e
        /* renamed from: a */
        public final void mo97502a(boolean z, C60100k kVar) {
            this.f136839a.f136830a = false;
            float f = -1.0f;
            String str = "";
            if (!z || kVar == null || kVar.f136965a == null) {
                this.f136839a.f136832c = str;
                this.f136839a.f136833d = -1.0f;
            } else {
                String str2 = kVar.f136965a;
                if (str2 != null) {
                    str = str2;
                }
                Float a = kVar.mo97635a();
                if (a != null) {
                    f = a.floatValue();
                }
                this.f136839a.f136832c = str;
                this.f136839a.f136833d = f;
                C1731i.m5640b(new CallableC60057a(this), C1731i.f5562a);
            }
            if (SmartFeedAdUIService.debug) {
                this.f136840b.getAid();
                User author = this.f136840b.getAuthor();
                if (author != null) {
                    author.getNickname();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.impl.SmartFeedAdUIServiceImpl$a */
    static final class RunnableC60054a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SmartFeedAdUIServiceImpl f136836a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89237d f136837b;

        static {
            Covode.recordClassIndex(70522);
        }

        RunnableC60054a(SmartFeedAdUIServiceImpl smartFeedAdUIServiceImpl, C89233z.C89237d dVar) {
            this.f136836a = smartFeedAdUIServiceImpl;
            this.f136837b = dVar;
        }

        public final void run() {
            if (SmartFeedAdUIService.debug) {
                System.currentTimeMillis();
            }
            if (this.f136836a.f136831b != null) {
                SmartPlaytimePredictService.C60077b.f136899a.ensureEnvAvailable("commerce_ml_ui_model");
            }
            if (SmartFeedAdUIService.debug) {
                System.currentTimeMillis();
                System.currentTimeMillis();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedAdUIService
    public final boolean enable() {
        if (this.f136831b == null || !SmartPlaytimePredictService.C60077b.f136899a.enable("commerce_ml_ui_model")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static ISmartFeedAdUIService m109533a() {
        MethodCollector.m26663i(11470);
        Object a = C81908b.m141854a(ISmartFeedAdUIService.class, false);
        if (a != null) {
            ISmartFeedAdUIService iSmartFeedAdUIService = (ISmartFeedAdUIService) a;
            MethodCollector.m26664o(11470);
            return iSmartFeedAdUIService;
        }
        if (C81908b.f183253cC == null) {
            synchronized (ISmartFeedAdUIService.class) {
                try {
                    if (C81908b.f183253cC == null) {
                        C81908b.f183253cC = new SmartFeedAdUIServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11470);
                    throw th;
                }
            }
        }
        SmartFeedAdUIService smartFeedAdUIService = (SmartFeedAdUIService) C81908b.f183253cC;
        MethodCollector.m26664o(11470);
        return smartFeedAdUIService;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedAdUIService
    public final String getPredictLabelResult() {
        if (this.f136831b == null || !TextUtils.isEmpty(this.f136832c)) {
            return this.f136832c;
        }
        C89219l.m154721d("use_last_predict_label", "");
        C89219l.m154721d("use_last_predict_label", "");
        C89219l.m154721d("", "");
        Object obj = C59977c.f136573b.get("use_last_predict_label");
        if (obj != null) {
            return (String) obj;
        }
        String string = C59977c.f136572a.getString("use_last_predict_label", "");
        if (!TextUtils.equals(string, "")) {
            ConcurrentHashMap<String, Object> concurrentHashMap = C59977c.f136573b;
            C89219l.m154716b(string, "");
            concurrentHashMap.put("use_last_predict_label", string);
        }
        C89219l.m154716b(string, "");
        return string;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedAdUIService
    public final void checkAndInit() {
        InputFeaturesConfig inputFeaturesConfig;
        CommerceSmartUIPlayTime playTime;
        List<Integer> params;
        int intValue;
        OneSmartDataTrackConfig oneSmartDataTrackConfig;
        MlSdkConfig mlSdkConfig;
        String str;
        CommerceSmartUIPlayTime playTime2;
        UrlPackage packageUrl;
        InputFeaturesConfig inputFeaturesConfig2;
        if (!this.f136835f) {
            this.f136835f = true;
            CommerceSmartUIModelV2 commerceSmartUIModelV2 = C59987b.f136630b;
            if (commerceSmartUIModelV2 != null) {
                this.f136831b = commerceSmartUIModelV2;
                OnePlaytimePredictConfig onePlaytimePredictConfig = new OnePlaytimePredictConfig();
                SmartClassifySceneConfig smartClassifySceneConfig = new SmartClassifySceneConfig();
                smartClassifySceneConfig.setScene("commerce_ml_ui_model");
                CommerceSmartUIModelV2 commerceSmartUIModelV22 = this.f136831b;
                OnePlaytimePredictRealConfig onePlaytimePredictRealConfig = null;
                if (commerceSmartUIModelV22 != null) {
                    inputFeaturesConfig = commerceSmartUIModelV22.getFeatures();
                } else {
                    inputFeaturesConfig = null;
                }
                if (inputFeaturesConfig != null) {
                    CommerceSmartUIModelV2 commerceSmartUIModelV23 = this.f136831b;
                    if (commerceSmartUIModelV23 != null) {
                        inputFeaturesConfig2 = commerceSmartUIModelV23.getFeatures();
                    } else {
                        inputFeaturesConfig2 = null;
                    }
                    smartClassifySceneConfig.setFeatures(inputFeaturesConfig2);
                } else {
                    CommerceSmartUIModelV2 commerceSmartUIModelV24 = this.f136831b;
                    if (commerceSmartUIModelV24 != null && (playTime = commerceSmartUIModelV24.getPlayTime()) != null && (params = playTime.getParams()) != null && (!params.isEmpty()) && (intValue = params.get(0).intValue()) > 0) {
                        InputFeaturesConfig inputFeaturesConfig3 = new InputFeaturesConfig();
                        FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
                        featurePlayTypeConfig.setEnable(true);
                        featurePlayTypeConfig.setRange(intValue);
                        featurePlayTypeConfig.setPlayRangeType("playtime");
                        featurePlayTypeConfig.setFeedRangeType("");
                        inputFeaturesConfig3.setFTypePlay(featurePlayTypeConfig);
                        smartClassifySceneConfig.setFeatures(inputFeaturesConfig3);
                    } else {
                        return;
                    }
                }
                smartClassifySceneConfig.setSdkConfig(new SmartSdkConfig());
                SmartSdkConfig sdkConfig = smartClassifySceneConfig.getSdkConfig();
                if (sdkConfig != null) {
                    sdkConfig.setMlSdkConfig(new MlSdkConfig());
                }
                SmartSdkConfig sdkConfig2 = smartClassifySceneConfig.getSdkConfig();
                if (!(sdkConfig2 == null || (mlSdkConfig = sdkConfig2.getMlSdkConfig()) == null)) {
                    CommerceSmartUIModelV2 commerceSmartUIModelV25 = this.f136831b;
                    if (commerceSmartUIModelV25 == null || (playTime2 = commerceSmartUIModelV25.getPlayTime()) == null || (packageUrl = playTime2.getPackageUrl()) == null) {
                        str = null;
                    } else {
                        str = packageUrl.getAndroidUrl();
                    }
                    mlSdkConfig.setPackageUrl(str);
                }
                CommerceSmartUIModelV2 commerceSmartUIModelV26 = this.f136831b;
                if (commerceSmartUIModelV26 != null) {
                    oneSmartDataTrackConfig = commerceSmartUIModelV26.getTrack();
                } else {
                    oneSmartDataTrackConfig = null;
                }
                smartClassifySceneConfig.setTrack(oneSmartDataTrackConfig);
                onePlaytimePredictConfig.setSceneConfig(smartClassifySceneConfig);
                CommerceSmartUIModelV2 commerceSmartUIModelV27 = this.f136831b;
                if (commerceSmartUIModelV27 != null) {
                    onePlaytimePredictRealConfig = commerceSmartUIModelV27.getRealConfig();
                }
                onePlaytimePredictConfig.setRealConfig(onePlaytimePredictRealConfig);
                onePlaytimePredictConfig.setTrigger(0);
                SmartPlaytimePredictService.C60077b.f136899a.configOneNewService(onePlaytimePredictConfig);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedAdUIService
    public final CommerceSmartUITasks getPredictTaskIndex() {
        CommerceSmartUIModel smartAdUIExperimentValue;
        CommerceSmartUIStrategyConfig uiStrategy;
        PlanConfig[] plans;
        Integer num;
        PlanConfig planConfig;
        List<CommerceSmartUITasks> task;
        List<String> lableIndexMapping;
        try {
            String predictLabelResult = getPredictLabelResult();
            if (predictLabelResult == null || TextUtils.isEmpty(predictLabelResult) || (smartAdUIExperimentValue = getSmartAdUIExperimentValue()) == null || (uiStrategy = smartAdUIExperimentValue.getUiStrategy()) == null || (plans = uiStrategy.getPlans()) == null) {
                return null;
            }
            if (plans.length == 0) {
                return null;
            }
            CommerceSmartUIStrategyConfig uiStrategy2 = smartAdUIExperimentValue.getUiStrategy();
            if (uiStrategy2 != null) {
                num = Integer.valueOf(uiStrategy2.getDefaultIndex());
            } else {
                num = null;
            }
            CommerceSmartUIStrategyConfig uiStrategy3 = smartAdUIExperimentValue.getUiStrategy();
            if (uiStrategy3 != null && (lableIndexMapping = uiStrategy3.getLableIndexMapping()) != null && (true ^ lableIndexMapping.isEmpty()) && C89070n.m154556a((Iterable) lableIndexMapping, (Object) predictLabelResult) && C89070n.m154546a((List) lableIndexMapping, (Object) predictLabelResult) < plans.length) {
                num = Integer.valueOf(C89070n.m154546a((List) lableIndexMapping, (Object) predictLabelResult));
            }
            if (num == null || (planConfig = plans[num.intValue()]) == null || (task = planConfig.getTask()) == null) {
                return null;
            }
            return task.get(0);
        } catch (Throwable th) {
            C1731i.m5640b(new CallableC60055b(th), C1731i.f5562a);
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedAdUIService
    public final void startSmartAdUIJudge(Aweme aweme) {
        if (aweme != null) {
            if (SmartFeedAdUIService.debug) {
                enable();
                aweme.getAid();
            }
            if (enable()) {
                if (!this.f136834e) {
                    this.f136834e = true;
                    C89233z.C89237d dVar = new C89233z.C89237d();
                    dVar.element = 0;
                    if (SmartFeedAdUIService.debug) {
                        dVar.element = System.currentTimeMillis();
                    }
                    C59978d.m109498a(new RunnableC60054a(this, dVar));
                }
                this.f136830a = true;
                C60095h hVar = new C60095h();
                hVar.f136928d = aweme;
                SmartPlaytimePredictService.C60077b.f136899a.predict("commerce_ml_ui_model", hVar, null, new C60056c(this, aweme));
            }
        }
    }
}
