package com.p2082ss.android.ugc.aweme.services;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.badge.IBadgeService;
import com.p2082ss.android.ugc.aweme.services.external.IAVDraftService;
import com.p2082ss.android.ugc.aweme.services.external.IAVScreenAdaptService;
import com.p2082ss.android.ugc.aweme.services.external.IAVTypeFaceService;
import com.p2082ss.android.ugc.aweme.services.external.IAbnormalExitLogService;
import com.p2082ss.android.ugc.aweme.services.external.IConfigService;
import com.p2082ss.android.ugc.aweme.services.external.IDonationService;
import com.p2082ss.android.ugc.aweme.services.external.IEnterFromService;
import com.p2082ss.android.ugc.aweme.services.external.IInfoService;
import com.p2082ss.android.ugc.aweme.services.external.IInitTaskService;
import com.p2082ss.android.ugc.aweme.services.external.ILargeTransactionService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.p2082ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.p2082ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.p2082ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.p2082ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.p2082ss.android.ugc.aweme.services.story.IStoryService;
import com.p2082ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.p2082ss.android.ugc.aweme.services.ttep.ITTEPAbilityService;
import com.p2082ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.services.video.IActivityNameService;

/* renamed from: com.ss.android.ugc.aweme.services.IExternalService */
public interface IExternalService {
    static {
        Covode.recordClassIndex(79624);
    }

    IAbilityService abilityService();

    IAbnormalExitLogService abnormalExitLogService();

    void asyncService(Context context, String str, ServiceLoadCallback serviceLoadCallback);

    void asyncService(String str, ServiceLoadCallback serviceLoadCallback);

    void asyncServiceForMainRecordService(Context context, String str, ServiceLoadCallback serviceLoadCallback);

    void asyncServiceWithActivity(Context context, String str, ServiceLoadCallback serviceLoadCallback);

    void asyncServiceWithOutPanel(String str, ServiceLoadCallback serviceLoadCallback);

    void attachApplication(Application application);

    IActivityNameService classnameService();

    IConfigService configService();

    IDonationService donationService();

    IAVDraftService draftService();

    IEnterFromService enterFromService();

    IExternalUploaderService externalUploaderService();

    IAVFilterService filterService();

    IAVMobService getAVMobService();

    IBadgeService getBadgeService();

    IInfoService infoService();

    void initASVE();

    IInitTaskService initService();

    ILargeTransactionService largeTransactionService();

    IOpenPhotoNextService openGotoNextService();

    ICreativePerformanceMonitorService performanceMonitorService();

    IAVPerformance provideAVPerformance();

    ICrashReportService provideErrorReporter();

    ITakeInSameOptimize provideTakeInSameOptimize();

    IAVPublishService publishService();

    IAVScreenAdaptService screenAdaptService();

    void setVideoIdParam(String str);

    IShoutOutsService shoutOutsService();

    ISpecialPlusService specialPlusService();

    IStoryService storyService();

    ISuperEntranceService superEntranceService();

    ITTEPAbilityService ttepAbilityService();

    IAVTypeFaceService typeFaceService();

    void updateVESDKDeviceId(String str);

    /* renamed from: com.ss.android.ugc.aweme.services.IExternalService$ServiceLoadCallback */
    public interface ServiceLoadCallback {
        static {
            Covode.recordClassIndex(79625);
        }

        void onDismiss();

        void onFailed();

        void onLoad(AsyncAVService asyncAVService, long j);

        void onOK();

        /* renamed from: com.ss.android.ugc.aweme.services.IExternalService$ServiceLoadCallback$DefaultImpls */
        public static final class DefaultImpls {
            static {
                Covode.recordClassIndex(79626);
            }

            public static void onDismiss(ServiceLoadCallback serviceLoadCallback) {
            }

            public static void onFailed(ServiceLoadCallback serviceLoadCallback) {
            }

            public static void onOK(ServiceLoadCallback serviceLoadCallback) {
                serviceLoadCallback.onFailed();
            }
        }
    }
}
