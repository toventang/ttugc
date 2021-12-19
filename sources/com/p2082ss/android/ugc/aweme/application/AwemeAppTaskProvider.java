package com.p2082ss.android.ugc.aweme.application;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.aweme.storage.p108a.C2355a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.ttsetting.FetchTTSettingTask;
import com.bytedance.keva.Keva;
import com.p2082ss.android.legoapi.C29952a;
import com.p2082ss.android.legoapi.C29954b;
import com.p2082ss.android.legoapi.IAccountInitializerTaskApi;
import com.p2082ss.android.legoapi.abtest.C29953a;
import com.p2082ss.android.legoimpl.ExperienceKitInitTask;
import com.p2082ss.android.legoimpl.NewUserTask;
import com.p2082ss.android.legoimpl.ProcessMonitorTask;
import com.p2082ss.android.legoimpl.StoragePolicyTask;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.storageInit.StorageModuleInitTask;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.WsRegionTask;
import com.p2082ss.android.ugc.aweme.app.IInitAllService;
import com.p2082ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.p2082ss.android.ugc.aweme.app.application.task.CheckUpdateChangeDeviceIDTask;
import com.p2082ss.android.ugc.aweme.app.application.task.CommonParamsInitTask;
import com.p2082ss.android.ugc.aweme.benchmark.BenchmarkInitService;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.device.DeviceInfoReportTask;
import com.p2082ss.android.ugc.aweme.dynamicfeature.AabPluginServiceInitTask;
import com.p2082ss.android.ugc.aweme.dynamicfeature.AabPluginServiceStartTask;
import com.p2082ss.android.ugc.aweme.dynamicfeature.LivePluginInitTask;
import com.p2082ss.android.ugc.aweme.emoji.lego.EmojiCompatTask;
import com.p2082ss.android.ugc.aweme.experiment.C46691ah;
import com.p2082ss.android.ugc.aweme.experiment.C46720aw;
import com.p2082ss.android.ugc.aweme.experiment.C46728bc;
import com.p2082ss.android.ugc.aweme.experiment.C46807cw;
import com.p2082ss.android.ugc.aweme.experiment.C46857dw;
import com.p2082ss.android.ugc.aweme.experiment.C46893en;
import com.p2082ss.android.ugc.aweme.experiment.C46939fp;
import com.p2082ss.android.ugc.aweme.experiment.C47029j;
import com.p2082ss.android.ugc.aweme.feed.cache.C49301e;
import com.p2082ss.android.ugc.aweme.feed.cache.FeedCacheLoaderExtention$getInitTask$1;
import com.p2082ss.android.ugc.aweme.feed.cache.ForegroundFeedCacheTask;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.inflate.PreDrawableInflate;
import com.p2082ss.android.ugc.aweme.homepage.story.icon.X2CIconStory;
import com.p2082ss.android.ugc.aweme.hybridkit.C53395a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58258q;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58152b;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import com.p2082ss.android.ugc.aweme.lego.C58206e;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58232i;
import com.p2082ss.android.ugc.aweme.lego.C58235l;
import com.p2082ss.android.ugc.aweme.lego.C58243m;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.wrapper.InitServiceGroupTask;
import com.p2082ss.android.ugc.aweme.lego.wrapper.InitServiceTask;
import com.p2082ss.android.ugc.aweme.legoImp.RetrieveUserGrowthGuidance;
import com.p2082ss.android.ugc.aweme.legoImp.inflate.DmtStatusViewInflate;
import com.p2082ss.android.ugc.aweme.legoImp.service.AOTOptimizeService;
import com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.p2082ss.android.ugc.aweme.legoImp.task.ABCacheOptInitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.AdjustMusicVolume;
import com.p2082ss.android.ugc.aweme.legoImp.task.AlertDialogInitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.ApiUserInitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.AppFlyerLoadPropertiesTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.AppLinkDataTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.AppLogInitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.BPEATask;
import com.p2082ss.android.ugc.aweme.legoImp.task.BulletAssemblerInitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.BulletPreloadTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.C58420ae;
import com.p2082ss.android.ugc.aweme.legoImp.task.CheckNoticeTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.ClearDiskBundleTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.ContentProviderAsyncInitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.CovodeCollectTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.CpuBigCoreBindTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.DataUsageTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.DeeplinkPrefetchTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.EnterMusicGuideColdStartTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.FastEventBusConfigTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.FeedRequestParamPreloadTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.FetchUltimateComplianceSettingsTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.FixFocusedViewLeak;
import com.p2082ss.android.ugc.aweme.legoImp.task.FontTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.GetGoogleAIdTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.GsonPrewarmTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.InferenceEngineTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitCovodeTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitFramework;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitI18nMiniApp;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitLottieOptTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitMobShare;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitMusicManager;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitMusicServiceTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitPageMonitorTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitPowerPreloadTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitReportSignature;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitStorageManagerTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitTTNetTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitTaskManager;
import com.p2082ss.android.ugc.aweme.legoImp.task.InstancePreloadTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.JacocoTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.JatoBoostTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.JatoInitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.LegacyTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.LiveInjectContextTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.LivePrefetchLoadOptTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.LivePrefetchLoadOtherOptTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.MigrationTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.MobMainAppEndTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.MobMainAppStartTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.MonitorDigitalWellbeingStatusTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.MonitorDirectOnTimer;
import com.p2082ss.android.ugc.aweme.legoImp.task.NetworkRestrictionTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.ObserveDeviceRegister;
import com.p2082ss.android.ugc.aweme.legoImp.task.ObtainCpuInfoTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.PerformanceHelperTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.PoiInitTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.PowerPermissionsTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.PreComputeTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.PreloadEmojiTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.PreloadI18nManagerTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.PreloadKevaKeyTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.PreloadPrefsAndKevaTaskV1;
import com.p2082ss.android.ugc.aweme.legoImp.task.PreloadPrefsAndKevaTaskV2;
import com.p2082ss.android.ugc.aweme.legoImp.task.PreloadResCleanerTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.PreloadWireFieldNoEnumClassTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.ProfileEditorTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.RegisterMigrationTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.RegisterScreenBroadcastReceiverTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.ResetTTNetworkStateIndexTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.SetAppTrackTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.SetupMainServiceForJsb;
import com.p2082ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadForAllProcessTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.SkyEyeTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.SmartRouterProloadTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.SnapBoostPreloadTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.StorageTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.SyncAccountBannedDetailTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.SyncProtectionSettingTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.ThreadPoolInjectTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.UpdateLocale;
import com.p2082ss.android.ugc.aweme.legoImp.task.WatcherTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.WebSocketTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.WorkManagerDelayInit;
import com.p2082ss.android.ugc.aweme.legoImp.task.ZeroRatingTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit;
import com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask.HackActivityThreadH;
import com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask.InitAnywhereService;
import com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask.InitAwemeRuntime;
import com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask.InitDownloadComponentTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask.InitQuotaTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask.InitWebViewClientHookCallback;
import com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask.InitWeekEndRecorder;
import com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask.NetworkUtilsTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.allProcessTask.RejectedExecutionHandler;
import com.p2082ss.android.ugc.aweme.legoImp.task.api.PreloadFeedRequestTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.api.ReportColdBootTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.mainProcessTask.FeedCacheOptTask;
import com.p2082ss.android.ugc.aweme.legoImp.task.mainProcessTask.FrescoSoLoadSetter;
import com.p2082ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitLegoInflate;
import com.p2082ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitTurboTask;
import com.p2082ss.android.ugc.aweme.legoImpl.AccountInitializerTaskImpl;
import com.p2082ss.android.ugc.aweme.legoImpl.task.HybridABFrameworkInitTask;
import com.p2082ss.android.ugc.aweme.legoImpl.task.LobbyInitTask;
import com.p2082ss.android.ugc.aweme.legoImpl.task.SecShareSdkTask;
import com.p2082ss.android.ugc.aweme.main.experiment.C59083d;
import com.p2082ss.android.ugc.aweme.miniapp.abtest.MiniAppPluginInstallABTask;
import com.p2082ss.android.ugc.aweme.network.p3503a.C61471a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2383bc.p2384a.RunnableC34777a;
import com.p2082ss.android.ugc.aweme.p2383bc.p2384a.RunnableC34780c;
import com.p2082ss.android.ugc.aweme.p2383bc.p2384a.RunnableC34781d;
import com.p2082ss.android.ugc.aweme.p2383bc.p2384a.RunnableC34783e;
import com.p2082ss.android.ugc.aweme.p2383bc.p2384a.RunnableC34785g;
import com.p2082ss.android.ugc.aweme.p2383bc.p2384a.RunnableC34786h;
import com.p2082ss.android.ugc.aweme.p2383bc.p2384a.RunnableC34788i;
import com.p2082ss.android.ugc.aweme.p2390bi.RunnableC34836a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import com.p2082ss.android.ugc.aweme.p3682s.C67248d;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;
import com.p2082ss.android.ugc.aweme.push.downgrade.NotifyPushStatusTask;
import com.p2082ss.android.ugc.aweme.push.downgrade.RunnableC65716g;
import com.p2082ss.android.ugc.aweme.request_combine.task.FetchCombineSettingsTask;
import com.p2082ss.android.ugc.aweme.requesttask.idle.GeckoCustomRequest;
import com.p2082ss.android.ugc.aweme.requesttask.idle.GeckoGlobalInitTask;
import com.p2082ss.android.ugc.aweme.requesttask.idle.GeckoLocalRequest;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.settings.C68736d;
import com.p2082ss.android.ugc.aweme.story.StoryGetFeedTask;
import com.p2082ss.android.ugc.aweme.task.AppStartTask;
import com.p2082ss.android.ugc.aweme.task.ColdLoggerAttachBaseTask;
import com.p2082ss.android.ugc.aweme.upvote.UpvotePublishTask;
import com.p2082ss.android.ugc.aweme.utils.DeadSystemExceptionTask;
import com.p2082ss.android.ugc.aweme.utils.PreventServerSideCrashes;
import com.p2082ss.android.ugc.aweme.utils.WebViewPreInitTask;
import com.p2082ss.android.ugc.p4258d.p4259a.C81913a;
import com.p2082ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;

/* renamed from: com.ss.android.ugc.aweme.application.AwemeAppTaskProvider */
public final class AwemeAppTaskProvider implements AbstractC33896a {

    /* renamed from: a */
    private IInitAllService f80177a = InitAllServiceImpl.m68762q();

    /* renamed from: b */
    private ISplashAdService f80178b = SplashAdServiceImpl.m33397i();

    static {
        Covode.recordClassIndex(40805);
    }

    /* renamed from: com.ss.android.ugc.aweme.application.AwemeAppTaskProvider$BootfinishTasksContainter */
    public static final class BootfinishTasksContainter implements AbstractC58264w {

        /* renamed from: a */
        public final AwemeAppTaskProvider f80179a;

        static {
            Covode.recordClassIndex(40806);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        public final int bQ_() {
            return 1048575;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: f */
        public final EnumC58150ad mo28606f() {
            return AbstractC58265x.m105221a(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: g */
        public final String mo28607g() {
            return "task_";
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: i */
        public final boolean mo28609i() {
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: j */
        public final List mo28610j() {
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
        /* renamed from: b */
        public final EnumC58151ae mo28601b() {
            return EnumC58151ae.BOOT_FINISH;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: k */
        public final EnumC58148ab mo28611k() {
            return EnumC58148ab.DEFAULT;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: h */
        public final String mo28608h() {
            return getClass().getSimpleName();
        }

        /* renamed from: com.ss.android.ugc.aweme.application.AwemeAppTaskProvider$BootfinishTasksContainter$a */
        static final class RunnableC33892a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BootfinishTasksContainter f80180a;

            static {
                Covode.recordClassIndex(40807);
            }

            RunnableC33892a(BootfinishTasksContainter bootfinishTasksContainter) {
                this.f80180a = bootfinishTasksContainter;
            }

            public final void run() {
                List<AbstractC58252n> f = this.f80180a.f80179a.mo60127f();
                C58221f.C58225d e = C58221f.m105153e();
                for (AbstractC58252n nVar : f) {
                    if (nVar == null) {
                        C89219l.m154715b();
                    }
                    e.mo95704a(nVar);
                }
                e.mo95706a();
            }
        }

        public BootfinishTasksContainter(AwemeAppTaskProvider awemeAppTaskProvider) {
            C89219l.m154721d(awemeAppTaskProvider, "");
            this.f80179a = awemeAppTaskProvider;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            C40780g.m82247d().schedule(new RunnableC33892a(this), 3, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.application.AwemeAppTaskProvider$a */
    public static final class C33893a extends AbstractC89220m implements AbstractC89171a<List<? extends AbstractC58252n>> {

        /* renamed from: a */
        public static final C33893a f80181a = new C33893a();

        static {
            Covode.recordClassIndex(40808);
        }

        C33893a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends AbstractC58252n> invoke() {
            AbstractC58264w[] wVarArr = new AbstractC58264w[1];
            AbstractC58264w initTask = AVExternalServiceImpl.m113114a().initService().initTask(1);
            if (initTask == null) {
                C89219l.m154715b();
            }
            wVarArr[0] = initTask;
            return C89070n.m154524c(wVarArr);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33896a
    /* renamed from: a */
    public final List<AbstractC58252n> mo60122a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AppStartTask());
        arrayList.add(new ColdLoggerAttachBaseTask());
        arrayList.add(new JatoInitTask());
        AbstractC58264w s = C58420ae.m106851s();
        C89219l.m154716b(s, "");
        arrayList.add(s);
        arrayList.add(new RejectedExecutionHandler());
        AbstractC58264w d = C58420ae.m106836d();
        C89219l.m154716b(d, "");
        arrayList.add(d);
        arrayList.add(new CpuBigCoreBindTask());
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33896a
    /* renamed from: e */
    public final List<AbstractC58252n> mo60126e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FetchCombineSettingsTask());
        arrayList.add(new ProcessMonitorTask());
        if (C16048b.m29633a().mo25421a(true, "fetch_feed_in_foreground", false)) {
            arrayList.add(new FeedCacheLoaderExtention$getInitTask$1());
        }
        if (!C58235l.m105174b() && Keva.getRepo("ab_repo_cold_boot").getBoolean("lego_boot_finish_commit_opt", C58232i.f132621a)) {
            arrayList.add(new BootfinishTasksContainter(this));
        } else if (((Boolean) C58235l.f132637k.getValue()).booleanValue()) {
            arrayList.add(new BootfinishTasksContainter(this));
        } else {
            arrayList.addAll(mo60127f());
        }
        if (C46939fp.m90232b()) {
            C65713d.f148065b = true;
            arrayList.add(new InitServiceTask(new RunnableC65716g(), 1));
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33896a
    /* renamed from: b */
    public final List<AbstractC58252n> mo60123b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FeedCacheOptTask());
        if (SettingsRequestServiceImpl.m65417i().mo57290h()) {
            AbstractC58264w a = C58420ae.m106833a();
            C89219l.m154716b(a, "");
            arrayList.add(a);
        }
        if (!C46939fp.m90232b()) {
            arrayList.add(new InitServiceTask(new RunnableC65716g(), 1048575));
        }
        if (!C58195d.m105111d()) {
            arrayList.add(new FrescoSoLoadSetter());
            arrayList.add(new InitServiceTask(new RunnableC34786h(), 1048575));
            arrayList.add(new PreloadWireFieldNoEnumClassTask());
        }
        arrayList.add(new PreloadI18nManagerTask());
        if (C67214a.m119157g()) {
            arrayList.add(new PreloadPrefsAndKevaTaskV1());
        } else if (((Boolean) C67214a.f150648b.getValue()).booleanValue()) {
            arrayList.add(new PreloadPrefsAndKevaTaskV2());
        } else {
            arrayList.add(new SharePreferencePreloadTask());
        }
        arrayList.add(C29953a.f71445a.mo52301d());
        if (C46728bc.m90110b()) {
            arrayList.add(new PreComputeTask());
        }
        if (!C67214a.m119157g()) {
            arrayList.add(new SharePreferencePreloadForAllProcessTask());
        }
        if (!C67214a.m119159i()) {
            AbstractC58264w n = C58420ae.m106846n();
            C89219l.m154716b(n, "");
            arrayList.add(n);
        }
        AbstractC58264w q = C58420ae.m106849q();
        C89219l.m154716b(q, "");
        arrayList.add(q);
        arrayList.add(new InstancePreloadTask());
        if (C46728bc.m90109a() == 1 || C46728bc.m90109a() == 3) {
            arrayList.add(new PreloadKevaKeyTask());
        }
        arrayList.add(new PreventServerSideCrashes());
        arrayList.add(new DeadSystemExceptionTask());
        arrayList.add(new FeedRequestParamPreloadTask());
        arrayList.add(new ObtainCpuInfoTask());
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33896a
    /* renamed from: c */
    public final List<AbstractC58252n> mo60124c() {
        AbstractC58264w d;
        AbstractC58264w e;
        int a;
        int i;
        ArrayList arrayList = new ArrayList();
        if (C61471a.m111324a()) {
            arrayList.add(new InitQuotaTask());
        }
        if (((Boolean) C46807cw.f109049a.getValue()).booleanValue()) {
            arrayList.add(new PreloadFeedRequestTask());
        }
        if (((Boolean) C67214a.f150649c.getValue()).booleanValue()) {
            arrayList.add(new WebViewPreInitTask());
        }
        if (C46857dw.m90170b()) {
            arrayList.add(new SkyEyeTask());
        }
        ArrayList arrayList2 = new ArrayList();
        if (!C58195d.m105109b() && TextUtils.equals(C17867d.f42595s, "googleplay")) {
            if (((Boolean) C67214a.f150650d.getValue()).booleanValue()) {
                Application a2 = C17879g.m33104a();
                C89219l.m154716b(a2, "");
                C89219l.m154721d(a2, "");
                Integer num = C68736d.f153760b;
                if (num != null) {
                    a = num.intValue();
                } else {
                    a = C68736d.m121169a(a2);
                }
                C68736d.f153760b = Integer.valueOf(a);
                int nextInt = AbstractC89255c.Default.nextInt(100000);
                Integer num2 = C68736d.f153760b;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = C68736d.f153759a;
                }
                if (nextInt < i) {
                    arrayList2.add(new InitCovodeTask(true));
                    arrayList2.add(new CovodeCollectTask());
                }
            }
            if (C67214a.m119161k()) {
                arrayList2.add(new InitCovodeTask(false));
            }
        } else if (C67214a.m119161k()) {
            arrayList2.add(new InitCovodeTask(false));
        }
        arrayList2.add(C29954b.f71447a.mo52294c());
        arrayList2.add(new NotifyPushStatusTask());
        arrayList2.add(new StoragePolicyTask());
        arrayList2.add(new ResetTTNetworkStateIndexTask());
        arrayList2.add(new InitStorageManagerTask());
        IInitAllService iInitAllService = this.f80177a;
        C89219l.m154716b(iInitAllService, "");
        AbstractC58264w f = iInitAllService.mo59715f();
        C89219l.m154716b(f, "");
        arrayList2.add(f);
        arrayList2.add(new ApiUserInitTask());
        if (!C58195d.m105111d()) {
            AbstractC58264w h = C58420ae.m106840h();
            C89219l.m154716b(h, "");
            arrayList2.add(h);
            arrayList2.add(new WatcherTask());
            arrayList2.add(new MonitorDirectOnTimer());
            arrayList2.add(new InitServiceTask(new RunnableC34781d(), 1048575));
            AbstractC58264w i2 = C58420ae.m106841i();
            C89219l.m154716b(i2, "");
            arrayList2.add(i2);
            IInitAllService iInitAllService2 = this.f80177a;
            C89219l.m154716b(iInitAllService2, "");
            AbstractC58264w p = iInitAllService2.mo59725p();
            C89219l.m154716b(p, "");
            arrayList2.add(p);
        }
        if (!C58195d.m105109b()) {
            arrayList2.add(C29952a.f71443a.mo52290h());
        }
        arrayList2.add(new NewUserTask());
        arrayList2.add(new ThreadPoolInjectTask());
        arrayList2.add(new AabPluginServiceInitTask());
        AbstractC58264w k = C58420ae.m106843k();
        C89219l.m154716b(k, "");
        arrayList2.add(k);
        arrayList.addAll(arrayList2);
        arrayList.add(new MigrationTask());
        if (!C46807cw.m90146c() && (!C49301e.m92383n() || !C46691ah.m90091b())) {
            arrayList.add(new InitTTNetTask());
        }
        arrayList.add(new GeckoCustomRequest());
        AbstractC58264w c = C58420ae.m106835c();
        C89219l.m154716b(c, "");
        arrayList.add(c);
        arrayList.add(new GeckoGlobalInitTask());
        AbstractC58264w g = C58420ae.m106839g();
        C89219l.m154716b(g, "");
        arrayList.add(g);
        if (!C67214a.m119153c()) {
            AbstractC58264w j = C58420ae.m106842j();
            C89219l.m154716b(j, "");
            arrayList.add(j);
        }
        arrayList.add(new FontTask());
        arrayList.add(new LivePrefetchLoadOptTask());
        if (C58152b.m105086d()) {
            arrayList.add(new LivePrefetchLoadOtherOptTask());
        }
        arrayList.add(C29952a.f71443a.mo52289g());
        arrayList.add(C29954b.f71447a.mo52293b());
        if (!C46857dw.m90170b()) {
            arrayList.add(new SkyEyeTask());
        }
        arrayList.add(new BPEATask());
        AbstractC58264w f2 = C58420ae.m106838f();
        C89219l.m154716b(f2, "");
        arrayList.add(f2);
        if (!C67214a.m119156f()) {
            arrayList.add(new AppFlyerLoadPropertiesTask());
        }
        if (!C67214a.m119152b()) {
            AbstractC58264w o = C58420ae.m106847o();
            C89219l.m154716b(o, "");
            arrayList.add(o);
            if (!C46893en.m90196a() && (e = this.f80178b.mo28719e()) != null) {
                arrayList.add(e);
            }
        }
        if (!C46893en.m90196a() && (d = this.f80178b.mo28718d()) != null) {
            arrayList.add(d);
        }
        if (!((Boolean) C58206e.f132544k.getValue()).booleanValue()) {
            AbstractC58264w b = C58420ae.m106834b();
            C89219l.m154716b(b, "");
            arrayList.add(b);
        }
        IInitAllService iInitAllService3 = this.f80177a;
        C89219l.m154716b(iInitAllService3, "");
        AbstractC58264w g2 = iInitAllService3.mo59716g();
        C89219l.m154716b(g2, "");
        arrayList.add(g2);
        AbstractC58264w preloadInstanceTask = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getPreloadInstanceTask();
        C89219l.m154716b(preloadInstanceTask, "");
        arrayList.add(preloadInstanceTask);
        arrayList.add(new EmojiCompatTask());
        arrayList.add(new GeckoLocalRequest());
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.lego.f */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.ss.android.ugc.aweme.lego.f */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: com.ss.android.ugc.aweme.lego.f */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: com.ss.android.ugc.aweme.lego.f */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: com.ss.android.ugc.aweme.lego.f */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33896a
    /* renamed from: d */
    public final List<AbstractC58252n> mo60125d() {
        ArrayList arrayList = new ArrayList();
        C81913a.f183424a = false;
        arrayList.add(new CommonParamsInitTask());
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).initLegoInflate();
        if (C46720aw.m90103b()) {
            C58221f.f132590n.mo95697a((Class<? extends AbstractC58258q>) C59083d.f134486a.mo37197a().getClass(), C59083d.f134486a.mo37197a());
            C58221f.f132590n.mo95697a((Class<? extends AbstractC58258q>) C59083d.f134486a.mo37198b().getClass(), C59083d.f134486a.mo37198b());
            C58221f.f132590n.mo95697a((Class<? extends AbstractC58258q>) C59083d.f134486a.mo37199c().getClass(), C59083d.f134486a.mo37199c());
        } else if (C46720aw.m90102a()) {
            C58221f.f132590n.mo95697a((Class<? extends AbstractC58258q>) C59083d.f134486a.mo37197a().getClass(), C59083d.f134486a.mo37197a());
            C58221f.f132590n.mo95697a((Class<? extends AbstractC58258q>) C59083d.f134486a.mo37198b().getClass(), C59083d.f134486a.mo37198b());
        }
        if (C67248d.m119175c()) {
            C58221f.f132590n.mo95697a(X2CIconStory.class, new X2CIconStory());
        }
        AbstractC58264w l = C58420ae.m106844l();
        C89219l.m154716b(l, "");
        arrayList.add(l);
        arrayList.add(new InitLegoInflate());
        AbstractC58258q f = SplashAdServiceImpl.m33397i().mo28720f();
        if (f != null) {
            arrayList.add(f);
        }
        arrayList.add(new PreDrawableInflate());
        if (C67248d.m119181i()) {
            arrayList.add(new DmtStatusViewInflate());
        }
        arrayList.add(new LegacyTask());
        AbstractC58264w r = C58420ae.m106850r();
        C89219l.m154716b(r, "");
        arrayList.add(r);
        arrayList.add(new AppLogInitTask());
        if (((Boolean) C46807cw.f109050b.getValue()).booleanValue()) {
            arrayList.add(new PreloadFeedRequestTask());
        }
        ArrayList arrayList2 = new ArrayList();
        if (!((Boolean) C58206e.f132545l.getValue()).booleanValue()) {
            arrayList2.add(new NetworkUtilsTask());
        }
        if (!C58195d.m105111d()) {
            arrayList2.add(new InitServiceTask(new RunnableC34780c(), 1048575));
            arrayList2.add(new InitServiceTask(new RunnableC34777a(), 1048575));
        }
        arrayList2.add(new SecShareSdkTask());
        arrayList2.add(new JsBridge2InitTask(EnumC58151ae.MAIN));
        arrayList2.add(new InitAwemeRuntime());
        arrayList2.add(new InferenceEngineTask());
        IInitAllService iInitAllService = this.f80177a;
        C89219l.m154716b(iInitAllService, "");
        AbstractC58264w m = iInitAllService.mo59722m();
        C89219l.m154716b(m, "");
        arrayList2.add(m);
        arrayList2.add(new UpdateLocale());
        arrayList2.add(new InitFramework());
        arrayList2.add(new AdjustMusicVolume());
        IAccountInitializerTaskApi f2 = AccountInitializerTaskImpl.m107036f();
        if (f2 == null) {
            C89219l.m154715b();
        }
        arrayList2.add(f2.mo52281d());
        if (!((Boolean) C58206e.f132546m.getValue()).booleanValue()) {
            arrayList2.add(new InitMusicManager());
        }
        if (!C58195d.m105111d()) {
            arrayList2.add(new ContentProviderAsyncInitTask());
            arrayList2.add(new InitReportSignature());
            arrayList2.add(new SetupMainServiceForJsb());
            arrayList2.add(new InitMobShare());
            arrayList2.add(new InitServiceTask(new RunnableC34788i(), 1048575));
        }
        arrayList2.add(new InitTaskManager());
        IAccountInitializerTaskApi f3 = AccountInitializerTaskImpl.m107036f();
        if (f3 == null) {
            C89219l.m154715b();
        }
        arrayList2.add(f3.mo52278a());
        arrayList2.add(new FixFocusedViewLeak());
        IInitAllService iInitAllService2 = this.f80177a;
        C89219l.m154716b(iInitAllService2, "");
        AbstractC58264w l2 = iInitAllService2.mo59721l();
        C89219l.m154716b(l2, "");
        arrayList2.add(l2);
        arrayList2.add(new ObserveDeviceRegister());
        arrayList2.add(new RetrieveUserGrowthGuidance());
        arrayList2.add(new HybridABFrameworkInitTask());
        arrayList2.add(new ABCacheOptInitTask());
        arrayList2.add(new LobbyInitTask());
        arrayList2.add(new AlertDialogInitTask());
        arrayList2.add(new RegisterScreenBroadcastReceiverTask());
        arrayList2.add(C29952a.f71443a.mo52284b());
        arrayList2.add(new CheckUpdateChangeDeviceIDTask());
        arrayList2.add(C53395a.f122604a.mo89989a());
        arrayList2.add(C53395a.f122604a.mo89990b());
        arrayList2.add(new BulletAssemblerInitTask());
        IAccountInitializerTaskApi f4 = AccountInitializerTaskImpl.m107036f();
        if (f4 == null) {
            C89219l.m154715b();
        }
        arrayList2.add(f4.mo52282e());
        arrayList2.add(new PerformanceHelperTask());
        arrayList2.add(new ZeroRatingTask());
        arrayList2.add(new InitI18nMiniApp());
        arrayList2.add(new InitAnywhereService());
        arrayList2.add(new InitServiceGroupTask(new Runnable[]{new RunnableC34785g()}));
        arrayList2.add(new InitWebViewClientHookCallback());
        arrayList2.add(new InitServiceGroupTask(new Runnable[]{new RunnableC34783e(), new RunnableC34836a()}));
        if (TextUtils.equals(C17867d.f42595s, "local_test")) {
            arrayList2.add(new InitWeekEndRecorder());
        }
        arrayList2.add(new FetchUltimateComplianceSettingsTask());
        arrayList2.add(new LiveInjectContextTask());
        arrayList.addAll(arrayList2);
        arrayList.add(new FastEventBusConfigTask());
        if (!C67214a.m119154d()) {
            AbstractC58264w e = C58420ae.m106837e();
            C89219l.m154716b(e, "");
            arrayList.add(e);
        }
        if (!C67214a.m119155e()) {
            AbstractC58264w m2 = C58420ae.m106845m();
            C89219l.m154716b(m2, "");
            arrayList.add(m2);
        }
        if (!C47029j.m90292b()) {
            AbstractC58264w p = C58420ae.m106848p();
            C89219l.m154716b(p, "");
            arrayList.add(p);
        }
        arrayList.add(new GetGoogleAIdTask());
        arrayList.add(new PreloadEmojiTask());
        if (((Boolean) C46807cw.f109051c.getValue()).booleanValue()) {
            arrayList.add(new PreloadFeedRequestTask());
        }
        arrayList.add(C29954b.f71447a.mo52296e());
        AbstractC58264w a = LocationServiceImpl.m145036c().mo129339a();
        if (a != null) {
            arrayList.add(a);
        }
        if (!C58195d.m105111d()) {
            arrayList.add(new PowerPermissionsTask());
        }
        arrayList.add(new ApmInit());
        arrayList.add(new InitLottieOptTask());
        arrayList.add(new ExperienceKitInitTask());
        arrayList.add(new DeeplinkPrefetchTask());
        if (!C58221f.m105150b()) {
            arrayList.add(new MainLooperOptService());
        }
        if (!C46807cw.m90146c() && C49301e.m92383n() && C46691ah.m90091b()) {
            arrayList.add(new InitTTNetTask());
        }
        arrayList.add(new InitPageMonitorTask());
        return arrayList;
    }

    /* renamed from: f */
    public final List<AbstractC58252n> mo60127f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BenchmarkInitService.m71138b().mo61660a());
        arrayList.add(new InitTurboTask());
        arrayList.add(new MobMainAppStartTask());
        arrayList.add(new MobMainAppEndTask());
        arrayList.add(new SetAppTrackTask());
        arrayList.add(new AabPluginServiceStartTask());
        arrayList.add(new LivePluginInitTask());
        arrayList.add(new MiniAppPluginInstallABTask());
        arrayList.add(new InitDownloadComponentTask());
        arrayList.add(new GsonPrewarmTask());
        arrayList.add(new SmartRouterProloadTask());
        arrayList.add(new JsBridge2InitTask(EnumC58151ae.BOOT_FINISH));
        arrayList.add(new RegisterMigrationTask());
        arrayList.add(new JatoBoostTask());
        arrayList.add(C29952a.f71443a.mo52285c());
        arrayList.add(C29954b.f71447a.mo52295d());
        IAccountInitializerTaskApi f = AccountInitializerTaskImpl.m107036f();
        if (f == null) {
            C89219l.m154715b();
        }
        arrayList.add(f.mo52279b());
        arrayList.add(new AOTOptimizeService());
        arrayList.add(new HackActivityThreadH());
        if (C58243m.m105180c()) {
            C58221f.m105145a(EnumC58148ab.SETTING, C33893a.f80181a);
        } else {
            AbstractC58264w initTask = AVExternalServiceImpl.m113114a().initService().initTask(1);
            if (initTask == null) {
                C89219l.m154715b();
            }
            arrayList.add(initTask);
        }
        arrayList.add(new WebSocketTask());
        arrayList.add(new AppLinkDataTask());
        arrayList.add(new DataUsageTask());
        arrayList.add(new StorageTask());
        IInitAllService iInitAllService = this.f80177a;
        C89219l.m154716b(iInitAllService, "");
        AbstractC58264w o = iInitAllService.mo59724o();
        C89219l.m154716b(o, "");
        arrayList.add(o);
        arrayList.add(new JacocoTask());
        arrayList.add(new ForegroundFeedCacheTask(EnumC58151ae.BOOT_FINISH));
        arrayList.add(new WorkManagerDelayInit());
        IInitAllService iInitAllService2 = this.f80177a;
        C89219l.m154716b(iInitAllService2, "");
        AbstractC58264w k = iInitAllService2.mo59720k();
        C89219l.m154716b(k, "");
        arrayList.add(k);
        if (TextUtils.equals(C17867d.f42595s, "local_test")) {
            arrayList.add(C29952a.f71443a.mo52286d());
        } else {
            arrayList.add(C29952a.f71443a.mo52283a());
        }
        if (Build.VERSION.SDK_INT < 28) {
            arrayList.add(new PreloadResCleanerTask());
        }
        arrayList.add(new CheckNoticeTask());
        arrayList.add(new EnterMusicGuideColdStartTask());
        arrayList.add(new MonitorDigitalWellbeingStatusTask());
        arrayList.add(new InitMusicServiceTask());
        String str = C29736b.f70924e;
        C89219l.m154716b(str, "");
        arrayList.add(new FetchTTSettingTask(str));
        arrayList.add(new SyncProtectionSettingTask());
        arrayList.add(new SyncAccountBannedDetailTask());
        arrayList.add(C29952a.f71443a.mo52291i());
        AbstractC58264w c = C39223a.m79605s().mo68681c();
        if (c == null) {
            C89219l.m154715b();
        }
        arrayList.add(c);
        arrayList.add(C29954b.f71447a.mo52297f());
        arrayList.add(new PoiInitTask());
        arrayList.add(new BulletPreloadTask());
        arrayList.add(new ClearDiskBundleTask());
        arrayList.add(new StoryGetFeedTask());
        arrayList.add(new DeviceInfoReportTask());
        arrayList.add(new ProfileEditorTask());
        arrayList.add(new SnapBoostPreloadTask());
        arrayList.add(new InitPowerPreloadTask());
        arrayList.add(new NetworkRestrictionTask());
        arrayList.add(C29952a.f71443a.mo52287e());
        arrayList.add(new ReportColdBootTask());
        arrayList.add(new WsRegionTask());
        if (C2355a.f7165a) {
            arrayList.add(new StorageModuleInitTask());
        }
        arrayList.add(new UpvotePublishTask());
        arrayList.add(UgCommonServiceImpl.m138290j().mo123103c().mo123149b());
        return arrayList;
    }
}
