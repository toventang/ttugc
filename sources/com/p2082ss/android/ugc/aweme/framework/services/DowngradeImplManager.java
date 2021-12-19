package com.p2082ss.android.ugc.aweme.framework.services;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.DeepLinkDowngradeService;
import com.p2082ss.android.ugc.aweme.inferenceengine.IInferenceEngineServiceDefault;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedDowngrade;
import com.p2082ss.android.ugc.aweme.p3452ml.api.MLCommonServiceDefault;
import com.p2082ss.android.ugc.aweme.p3452ml.api.MLDataCenterServiceDefault;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartDataTrackerServiceDefault;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartFeedAdUIServiceDefault;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartFeedLoadMoreServiceDefault;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartFeedPreloadServiceDefault;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartPreloadCommentV2ServiceDefault;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartPreloadProfileV2ServiceDefault;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartClassifyServiceDefault;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartCommonPreloadServiceDefault;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartDataCenterApiServiceDefault;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartMLSceneServiceDefault;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartPlaytimePredictServiceDefault;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartRegressCalculateServiceDefault;
import com.p2082ss.android.ugc.aweme.poi_api.service.PoiServiceEmptyImpl;
import com.p2082ss.android.ugc.aweme.poi_map.service.PoiMapServiceEmptylmpl;
import com.p2082ss.android.ugc.aweme.preinstall.PreInstallFakeService;
import com.p2082ss.android.ugc.aweme.preinstall.brand.TranssonicFakeService;
import com.p2082ss.android.ugc.aweme.profile.ProfileDowngradeService;
import com.p2082ss.android.ugc.aweme.qrcode.QRCodeDowngradeService;
import com.p2082ss.android.ugc.aweme.service.downgrade.DefaultEtDebugServiceImpl;
import com.p2082ss.android.ugc.aweme.service.downgrade.DefaultFeedDebugServiceImpl;
import com.p2082ss.android.ugc.aweme.service.downgrade.DefaultFrameCheckServiceImpl;
import com.p2082ss.android.ugc.aweme.service.downgrade.DefaultLocalTestImpl;
import com.p2082ss.android.ugc.aweme.service.downgrade.DefaultMatrixPluginServiceImpl;
import com.p2082ss.android.ugc.aweme.service.downgrade.DefaultOfflineFeedbackServiceImpl;
import com.p2082ss.android.ugc.aweme.service.downgrade.DefaultOnBoardManager;
import com.p2082ss.android.ugc.aweme.service.downgrade.DefaultRegionMockServiceImpl;
import com.p2082ss.android.ugc.aweme.service.downgrade.DefaultSecuidLarkServiceImpl;
import com.p2082ss.android.ugc.aweme.service.downgrade.DefaultSparrowServiceImpl;
import com.p2082ss.android.ugc.aweme.service.downgrade.OfflineGroupchatServiceEmptyImpl;
import com.p2082ss.android.ugc.aweme.story.StoryServiceDowngradeImpl;
import com.p2082ss.android.ugc.aweme.upvote.service.UpvoteServiceDowngradeImpl;
import com.p2082ss.android.ugc.aweme.utils.gecko.GeckoGlobalInitServiceDefault;
import com.p2082ss.android.ugc.aweme.utils.gecko.GeckoLocalServiceDefault;
import com.p2082ss.android.ugc.customactivityoncrash_base.DefaultCustomActivityOnCrashService;
import com.p2082ss.android.ugc.tiktok.deeplink.DeeplinkPrefetchDefault;
import com.p2082ss.android.ugc.tiktok.location_api.service.LocationServiceEmptyImpl;
import com.p2082ss.android.ugc.tiktok.seclink.ISecLinkServiceDefault;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.framework.services.DowngradeImplManager */
public class DowngradeImplManager {
    final Map<String, String> componentsMap = new ConcurrentHashMap();
    final Set<String> downgradeComponents = Collections.synchronizedSet(new HashSet());
    private Map<String, ServiceProvider> downgradeImplMap = new ConcurrentHashMap();
    private Map<String, Object> staticDowngradeImplCache = new ConcurrentHashMap();
    final Set<String> staticDowngradeNotExistSet = Collections.synchronizedSet(new HashSet());

    static {
        Covode.recordClassIndex(60657);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.framework.services.DowngradeImplManager$SingleInstanceHolder */
    public static class SingleInstanceHolder {
        public static final DowngradeImplManager INSTANCE = new DowngradeImplManager();

        private SingleInstanceHolder() {
        }

        static {
            Covode.recordClassIndex(60659);
        }
    }

    public static DowngradeImplManager getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }

    private <T> T getStaticDowngradeImpl(Class<T> cls) {
        return (T) Partition4.getStaticDowngradeImpl(this, cls);
    }

    public void downgradeComponent(String str) {
        if (!TextUtils.isEmpty(str) && !this.downgradeComponents.contains(str)) {
            this.downgradeComponents.add(str);
        }
    }

    public boolean isServiceForceDowngrade(Class cls) {
        String str = this.componentsMap.get(cls.getName());
        if (!TextUtils.isEmpty(str)) {
            return this.downgradeComponents.contains(str);
        }
        return false;
    }

    public <T> T getDowngradeImpl(Class<T> cls) {
        String name = cls.getName();
        ServiceProvider serviceProvider = this.downgradeImplMap.get(name);
        if (serviceProvider != null) {
            return (T) serviceProvider.get();
        }
        T t = (T) this.staticDowngradeImplCache.get(name);
        return (t != null || this.staticDowngradeNotExistSet.contains(name)) ? t : (T) getStaticDowngradeImpl(cls);
    }

    private void addServiceComponent(String str, String str2) {
        this.componentsMap.put(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: putStaticDowngradeImplCache */
    public void invokeAccessputStaticDowngradeImplCache_(String str, Object obj) {
        this.staticDowngradeImplCache.put(str, obj);
    }

    public <T> void bindDowngradeImpl(Class<T> cls, ServiceProvider<T> serviceProvider) {
        this.downgradeImplMap.put(cls.getName(), serviceProvider);
    }

    /* renamed from: com.ss.android.ugc.aweme.framework.services.DowngradeImplManager$Partition4 */
    public class Partition4 {
        static {
            Covode.recordClassIndex(60658);
        }

        public static <T> T getStaticDowngradeImpl(DowngradeImplManager downgradeImplManager, Class<T> cls) {
            switch (cls.getName().hashCode()) {
                case -1746126115:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.service.IEtDebugService")) {
                        T t = (T) new DefaultEtDebugServiceImpl();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.service.IEtDebugService", t);
                        return t;
                    }
                    break;
                case -1727161271:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService")) {
                        T t2 = (T) new SmartFeedPreloadServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService", t2);
                        return t2;
                    }
                    break;
                case -1690323830:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.deeplink.IDeepLinkService")) {
                        T t3 = (T) new DeepLinkDowngradeService();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.deeplink.IDeepLinkService", t3);
                        return t3;
                    }
                    break;
                case -1667865087:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IMLCommonService")) {
                        T t4 = (T) new MLCommonServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.ml.api.IMLCommonService", t4);
                        return t4;
                    }
                    break;
                case -1633603100:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service")) {
                        T t5 = (T) new SmartPreloadCommentV2ServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service", t5);
                        return t5;
                    }
                    break;
                case -1429156681:
                    if (cls.getName().equals("com.ss.android.ugc.tiktok.location_api.service.ILocationService")) {
                        T t6 = (T) new LocationServiceEmptyImpl();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.tiktok.location_api.service.ILocationService", t6);
                        return t6;
                    }
                    break;
                case -1379566319:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService")) {
                        T t7 = (T) new SmartMLSceneServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService", t7);
                        return t7;
                    }
                    break;
                case -1303276871:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.service.IOfflineFeedbackService")) {
                        T t8 = (T) new DefaultOfflineFeedbackServiceImpl();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.service.IOfflineFeedbackService", t8);
                        return t8;
                    }
                    break;
                case -1289181594:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService")) {
                        T t9 = (T) new SmartPlaytimePredictServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService", t9);
                        return t9;
                    }
                    break;
                case -1263811427:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService")) {
                        T t10 = (T) new SmartFeedLoadMoreServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService", t10);
                        return t10;
                    }
                    break;
                case -978906707:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartRegressCalculateService")) {
                        T t11 = (T) new SmartRegressCalculateServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.ml.infra.ISmartRegressCalculateService", t11);
                        return t11;
                    }
                    break;
                case -857828971:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.service.IMatrixPluginService")) {
                        T t12 = (T) new DefaultMatrixPluginServiceImpl();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.service.IMatrixPluginService", t12);
                        return t12;
                    }
                    break;
                case -738010642:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.poi_api.service.IPoiService")) {
                        T t13 = (T) new PoiServiceEmptyImpl();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.poi_api.service.IPoiService", t13);
                        return t13;
                    }
                    break;
                case -688908617:
                    if (cls.getName().equals("com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService")) {
                        T t14 = (T) new DeeplinkPrefetchDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService", t14);
                        return t14;
                    }
                    break;
                case -659757515:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.service.IOfflineGroupchatService")) {
                        T t15 = (T) new OfflineGroupchatServiceEmptyImpl();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.service.IOfflineGroupchatService", t15);
                        return t15;
                    }
                    break;
                case -628620472:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService")) {
                        T t16 = (T) new SmartClassifyServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService", t16);
                        return t16;
                    }
                    break;
                case -607424883:
                    if (cls.getName().equals("com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService")) {
                        T t17 = (T) new DefaultCustomActivityOnCrashService();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService", t17);
                        return t17;
                    }
                    break;
                case -401510911:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService")) {
                        T t18 = (T) new SmartFeedAdUIServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService", t18);
                        return t18;
                    }
                    break;
                case -360388275:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IMLDataCenterService")) {
                        T t19 = (T) new MLDataCenterServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.ml.api.IMLDataCenterService", t19);
                        return t19;
                    }
                    break;
                case -317372455:
                    if (cls.getName().equals("com.ss.android.ugc.tiktok.seclink.ISecLinkService")) {
                        T t20 = (T) new ISecLinkServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.tiktok.seclink.ISecLinkService", t20);
                        return t20;
                    }
                    break;
                case -271762187:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.service.ISparrowService")) {
                        T t21 = (T) new DefaultSparrowServiceImpl();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.service.ISparrowService", t21);
                        return t21;
                    }
                    break;
                case -45175540:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService")) {
                        T t22 = (T) new IInferenceEngineServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService", t22);
                        return t22;
                    }
                    break;
                case 23658350:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFrameCheckService")) {
                        T t23 = (T) new DefaultFrameCheckServiceImpl();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.service.IFrameCheckService", t23);
                        return t23;
                    }
                    break;
                case 53902533:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.upvote.service.IUpvoteService")) {
                        T t24 = (T) new UpvoteServiceDowngradeImpl();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.upvote.service.IUpvoteService", t24);
                        return t24;
                    }
                    break;
                case 57780698:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service")) {
                        T t25 = (T) new SmartPreloadProfileV2ServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service", t25);
                        return t25;
                    }
                    break;
                case 197343978:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.mix.services.IMixFeedService")) {
                        return (T) new MixFeedDowngrade();
                    }
                    break;
                case 316475372:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.story.IStoryService")) {
                        T t26 = (T) new StoryServiceDowngradeImpl();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.story.IStoryService", t26);
                        return t26;
                    }
                    break;
                case 389028902:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.preinstall.IPreInstallService")) {
                        T t27 = (T) new PreInstallFakeService();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.preinstall.IPreInstallService", t27);
                        return t27;
                    }
                    break;
                case 389511774:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.poi_map.service.IPoiMapService")) {
                        T t28 = (T) new PoiMapServiceEmptylmpl();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.poi_map.service.IPoiMapService", t28);
                        return t28;
                    }
                    break;
                case 478472780:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFeedDebugService")) {
                        T t29 = (T) new DefaultFeedDebugServiceImpl();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.service.IFeedDebugService", t29);
                        return t29;
                    }
                    break;
                case 534010062:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.service.IOnBoardingService")) {
                        T t30 = (T) new DefaultOnBoardManager();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.service.IOnBoardingService", t30);
                        return t30;
                    }
                    break;
                case 913277804:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.profile.IProfileService")) {
                        T t31 = (T) new ProfileDowngradeService();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.profile.IProfileService", t31);
                        return t31;
                    }
                    break;
                case 1127805601:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.local_test.LocalTestApi")) {
                        T t32 = (T) new DefaultLocalTestImpl();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.local_test.LocalTestApi", t32);
                        return t32;
                    }
                    break;
                case 1205724034:
                    if (cls.getName().equals("com.bytedance.geckox.IGeckoGlobalInit")) {
                        T t33 = (T) new GeckoGlobalInitServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.bytedance.geckox.IGeckoGlobalInit", t33);
                        return t33;
                    }
                    break;
                case 1377752390:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService")) {
                        T t34 = (T) new SmartDataTrackerServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService", t34);
                        return t34;
                    }
                    break;
                case 1469964205:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService")) {
                        T t35 = (T) new GeckoLocalServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService", t35);
                        return t35;
                    }
                    break;
                case 1513354211:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService")) {
                        T t36 = (T) new SmartDataCenterApiServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService", t36);
                        return t36;
                    }
                    break;
                case 1529199585:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService")) {
                        T t37 = (T) new TranssonicFakeService();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService", t37);
                        return t37;
                    }
                    break;
                case 1532564235:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.service.IRegionMockService")) {
                        T t38 = (T) new DefaultRegionMockServiceImpl();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.service.IRegionMockService", t38);
                        return t38;
                    }
                    break;
                case 1661968864:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService")) {
                        T t39 = (T) new SmartCommonPreloadServiceDefault();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService", t39);
                        return t39;
                    }
                    break;
                case 1959495426:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.utils.ISecUidDependService")) {
                        T t40 = (T) new DefaultSecuidLarkServiceImpl();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.utils.ISecUidDependService", t40);
                        return t40;
                    }
                    break;
                case 2037829402:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.qrcode.IQRCodeService")) {
                        T t41 = (T) new QRCodeDowngradeService();
                        downgradeImplManager.invokeAccessputStaticDowngradeImplCache_("com.ss.android.ugc.aweme.qrcode.IQRCodeService", t41);
                        return t41;
                    }
                    break;
            }
            downgradeImplManager.staticDowngradeNotExistSet.add(cls.getName());
            return null;
        }
    }
}
