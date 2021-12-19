package com.p2082ss.android.ugc.aweme.p3452ml.impl;

import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedLoadMoreService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartFeedLoadMoreService;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.AbstractC60091e;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.C60095h;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.C60100k;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.FeaturePlayTypeConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.InputFeaturesConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.MlSdkConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartClassifySceneConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartPlaytimePredictService;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartSdkConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.C59988c;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.FeedLoadMorePlan;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OnePlaytimePredictConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OnePlaytimePredictRealConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OneSmartDataTrackConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartFeedLoadMoreExperiment;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartFeedLoadMoreStrategyConfig;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.ml.impl.SmartFeedLoadMoreServiceImpl */
public final class SmartFeedLoadMoreServiceImpl extends SmartFeedLoadMoreService {

    /* renamed from: a */
    public boolean f136842a;

    /* renamed from: b */
    public LruCache<String, ISmartFeedLoadMoreService.C59995b> f136843b = new LruCache<>(4);

    /* renamed from: c */
    public boolean f136844c;

    /* renamed from: d */
    SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel f136845d;

    /* renamed from: e */
    private final int f136846e = 3;

    /* renamed from: f */
    private boolean f136847f;

    /* renamed from: g */
    private int f136848g;

    /* renamed from: h */
    private boolean f136849h;

    static {
        Covode.recordClassIndex(70526);
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.impl.SmartFeedLoadMoreServiceImpl$a */
    static final class RunnableC60058a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SmartFeedLoadMoreServiceImpl f136850a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89237d f136851b;

        static {
            Covode.recordClassIndex(70527);
        }

        RunnableC60058a(SmartFeedLoadMoreServiceImpl smartFeedLoadMoreServiceImpl, C89233z.C89237d dVar) {
            this.f136850a = smartFeedLoadMoreServiceImpl;
            this.f136851b = dVar;
        }

        public final void run() {
            if (SmartFeedLoadMoreService.debug) {
                System.currentTimeMillis();
            }
            if (this.f136850a.f136845d != null) {
                SmartPlaytimePredictService.C60077b.f136899a.ensureEnvAvailable("feed_load_more_ml");
            }
            if (SmartFeedLoadMoreService.debug) {
                System.currentTimeMillis();
                System.currentTimeMillis();
            }
        }
    }

    /* renamed from: b */
    private boolean m109536b() {
        if (this.f136845d == null || !SmartPlaytimePredictService.C60077b.f136899a.enable("feed_load_more_ml")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static ISmartFeedLoadMoreService m109535a() {
        MethodCollector.m26663i(11466);
        Object a = C81908b.m141854a(ISmartFeedLoadMoreService.class, false);
        if (a != null) {
            ISmartFeedLoadMoreService iSmartFeedLoadMoreService = (ISmartFeedLoadMoreService) a;
            MethodCollector.m26664o(11466);
            return iSmartFeedLoadMoreService;
        }
        if (C81908b.f183254cD == null) {
            synchronized (ISmartFeedLoadMoreService.class) {
                try {
                    if (C81908b.f183254cD == null) {
                        C81908b.f183254cD = new SmartFeedLoadMoreServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11466);
                    throw th;
                }
            }
        }
        SmartFeedLoadMoreService smartFeedLoadMoreService = (SmartFeedLoadMoreService) C81908b.f183254cD;
        MethodCollector.m26664o(11466);
        return smartFeedLoadMoreService;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedLoadMoreService
    public final void checkAndInit() {
        InputFeaturesConfig inputFeaturesConfig;
        OneSmartDataTrackConfig oneSmartDataTrackConfig;
        MlSdkConfig mlSdkConfig;
        String str;
        if (!this.f136849h) {
            this.f136849h = true;
            int i = 0;
            if (!SmartFeedLoadMoreExperiment.C59982a.f136596a) {
                SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel feedLoadMoreMLModel = (SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel) C16048b.m29633a().mo25416a(true, "feed_load_more_ml", SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel.class, SmartFeedLoadMoreExperiment.f136595a);
                SmartFeedLoadMoreExperiment.C59982a.f136597b = feedLoadMoreMLModel;
                if (feedLoadMoreMLModel != null) {
                    if (SmartFeedLoadMoreExperiment.C59982a.f136597b.params != null && SmartFeedLoadMoreExperiment.C59982a.f136597b.params.length > 0) {
                        SmartFeedLoadMoreExperiment.C59982a.f136598c = SmartFeedLoadMoreExperiment.C59982a.f136597b.params[0];
                    }
                    SmartFeedLoadMoreExperiment.C59982a.f136599d = SmartFeedLoadMoreExperiment.C59982a.f136597b.countWhenExecute;
                    SmartFeedLoadMoreExperiment.C59982a.f136600e = (long) SmartFeedLoadMoreExperiment.C59982a.f136597b.runDelay;
                    SmartFeedLoadMoreExperiment.C59982a.f136601f = SmartFeedLoadMoreExperiment.C59982a.f136597b.loadModelBefore;
                    SmartFeedLoadMoreExperiment.C59982a.f136602g = SmartFeedLoadMoreExperiment.C59982a.f136597b.skipCount;
                    if (SmartFeedLoadMoreExperiment.C59982a.f136597b.features == null) {
                        InputFeaturesConfig inputFeaturesConfig2 = new InputFeaturesConfig();
                        FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
                        featurePlayTypeConfig.setEnable(true);
                        featurePlayTypeConfig.setRange(SmartFeedLoadMoreExperiment.C59982a.f136598c);
                        featurePlayTypeConfig.setPlayRangeType("playtime");
                        featurePlayTypeConfig.setFeedRangeType("");
                        inputFeaturesConfig2.setFTypePlay(featurePlayTypeConfig);
                        featurePlayTypeConfig.setRangeExcludeThis(true);
                        SmartFeedLoadMoreExperiment.C59982a.f136597b.features = inputFeaturesConfig2;
                    }
                }
                SmartFeedLoadMoreExperiment.C59982a.f136596a = true;
            }
            SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel feedLoadMoreMLModel2 = SmartFeedLoadMoreExperiment.C59982a.f136597b;
            if (feedLoadMoreMLModel2 != null) {
                this.f136845d = feedLoadMoreMLModel2;
                OnePlaytimePredictConfig onePlaytimePredictConfig = new OnePlaytimePredictConfig();
                SmartClassifySceneConfig smartClassifySceneConfig = new SmartClassifySceneConfig();
                smartClassifySceneConfig.setScene("feed_load_more_ml");
                SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel feedLoadMoreMLModel3 = this.f136845d;
                OnePlaytimePredictRealConfig onePlaytimePredictRealConfig = null;
                if (feedLoadMoreMLModel3 != null) {
                    inputFeaturesConfig = feedLoadMoreMLModel3.features;
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
                    SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel feedLoadMoreMLModel4 = this.f136845d;
                    if (feedLoadMoreMLModel4 != null) {
                        str = feedLoadMoreMLModel4.packageUrl;
                    } else {
                        str = null;
                    }
                    mlSdkConfig.setPackageUrl(str);
                }
                SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel feedLoadMoreMLModel5 = this.f136845d;
                if (feedLoadMoreMLModel5 != null) {
                    oneSmartDataTrackConfig = feedLoadMoreMLModel5.track;
                } else {
                    oneSmartDataTrackConfig = null;
                }
                smartClassifySceneConfig.setTrack(oneSmartDataTrackConfig);
                onePlaytimePredictConfig.setSceneConfig(smartClassifySceneConfig);
                SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel feedLoadMoreMLModel6 = this.f136845d;
                if (feedLoadMoreMLModel6 != null) {
                    onePlaytimePredictRealConfig = feedLoadMoreMLModel6.realConfig;
                }
                onePlaytimePredictConfig.setRealConfig(onePlaytimePredictRealConfig);
                onePlaytimePredictConfig.setTrigger(0);
                SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel feedLoadMoreMLModel7 = this.f136845d;
                if (feedLoadMoreMLModel7 != null) {
                    i = feedLoadMoreMLModel7.runDelay;
                }
                onePlaytimePredictConfig.setRunDelay(i);
                SmartPlaytimePredictService.C60077b.f136899a.configOneNewService(onePlaytimePredictConfig);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedLoadMoreService
    public final boolean isSmartFeedLoadMoreScene(String str) {
        return C89219l.m154714a((Object) "homepage_hot", (Object) str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedLoadMoreService
    public final void startSmartFeedLoadMoreJudge(Aweme aweme, ISmartFeedLoadMoreService.AbstractC59994a aVar) {
        C89219l.m154721d(aVar, "");
        if (aweme != null) {
            if (SmartFeedLoadMoreService.debug) {
                m109536b();
                aweme.getAid();
            }
            if (m109536b()) {
                this.f136842a = true;
                this.f136844c = false;
                C60095h hVar = new C60095h();
                hVar.f136928d = aweme;
                SmartPlaytimePredictService.C60077b.f136899a.predict("feed_load_more_ml", hVar, null, new C60059b(this, aweme, aVar));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.impl.SmartFeedLoadMoreServiceImpl$b */
    public static final class C60059b implements AbstractC60091e {

        /* renamed from: a */
        final /* synthetic */ SmartFeedLoadMoreServiceImpl f136852a;

        /* renamed from: b */
        final /* synthetic */ Aweme f136853b;

        /* renamed from: c */
        final /* synthetic */ ISmartFeedLoadMoreService.AbstractC59994a f136854c;

        static {
            Covode.recordClassIndex(70528);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.AbstractC60091e
        /* renamed from: a */
        public final void mo97502a(boolean z, C60100k kVar) {
            float f;
            FeedLoadMorePlan feedLoadMorePlan;
            this.f136852a.f136842a = false;
            if (!z || kVar == null || kVar.f136965a == null) {
                this.f136852a.f136844c = true;
                return;
            }
            if (SmartFeedLoadMoreService.debug) {
                System.currentTimeMillis();
            }
            String str = kVar.f136965a;
            if (str == null) {
                str = "";
            }
            Float a = kVar.mo97635a();
            if (a != null) {
                f = a.floatValue();
            } else {
                f = -1.0f;
            }
            ISmartFeedLoadMoreService.C59995b bVar = this.f136852a.f136843b.get(this.f136853b.getAid());
            if (bVar != null) {
                bVar.f136650a = f;
                bVar.f136651b = str;
            }
            C89219l.m154721d(str, "");
            if (!C59988c.f136634c) {
                C59988c.f136633b = (SmartFeedLoadMoreStrategyConfig) C16048b.m29633a().mo25416a(true, "feed_load_more_strategy", SmartFeedLoadMoreStrategyConfig.class, C59988c.f136632a);
                C59988c.f136634c = true;
            }
            SmartFeedLoadMoreStrategyConfig smartFeedLoadMoreStrategyConfig = C59988c.f136633b;
            if (smartFeedLoadMoreStrategyConfig != null) {
                feedLoadMorePlan = smartFeedLoadMoreStrategyConfig.getPlan(str);
            } else {
                feedLoadMorePlan = null;
            }
            ISmartFeedLoadMoreService.AbstractC59994a aVar = this.f136854c;
            if (!(aVar == null || feedLoadMorePlan == null)) {
                aVar.mo84943a(feedLoadMorePlan.getPreload(), feedLoadMorePlan.getDelay());
            }
            if (SmartFeedLoadMoreService.debug) {
                System.currentTimeMillis();
                this.f136853b.getAid();
                User author = this.f136853b.getAuthor();
                if (author != null) {
                    author.getNickname();
                }
            }
        }

        C60059b(SmartFeedLoadMoreServiceImpl smartFeedLoadMoreServiceImpl, Aweme aweme, ISmartFeedLoadMoreService.AbstractC59994a aVar) {
            this.f136852a = smartFeedLoadMoreServiceImpl;
            this.f136853b = aweme;
            this.f136854c = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedLoadMoreService
    public final void addVideoPlayEndReportData(JSONObject jSONObject, Aweme aweme, Integer num) {
        C89219l.m154721d(jSONObject, "");
        if (aweme != null && num != null && m109536b() && num.intValue() == 0) {
            ISmartFeedLoadMoreService.C59995b bVar = this.f136843b.get(aweme.getAid());
            if (bVar != null) {
                if (bVar.f136650a >= 0.0f) {
                    jSONObject.put("lp_predict", Float.valueOf(bVar.f136650a));
                }
                if (bVar.f136651b != null) {
                    jSONObject.put("lp_predictL", bVar.f136651b);
                }
                if (bVar.f136652c >= 0) {
                    jSONObject.put("left_videos_cnt", bVar.f136652c);
                }
            }
            if (SmartFeedLoadMoreService.debug) {
                aweme.getAid();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r0.f136650a >= 0.0f) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008e, code lost:
        if (r7 > r5.f136846e) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartFeedLoadMoreService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean needCheckLoadMore(int r6, int r7, com.p2082ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3452ml.impl.SmartFeedLoadMoreServiceImpl.needCheckLoadMore(int, int, com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }
}
