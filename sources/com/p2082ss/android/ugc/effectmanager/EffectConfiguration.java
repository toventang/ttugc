package com.p2082ss.android.ugc.effectmanager;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.effectmanager.common.TaskManager;
import com.p2082ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.p2082ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.p2082ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.p2082ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.p2082ss.android.ugc.effectmanager.common.utils.EPUtils;
import com.p2082ss.android.ugc.effectmanager.effect.bridge.EffectFetcher;
import com.p2082ss.android.ugc.effectmanager.effect.repository.newrepo.EffectDownloadManager;
import com.p2082ss.android.ugc.effectmanager.effect.task.task.DefaultEffectFetcher;
import com.p2082ss.android.ugc.effectmanager.knadapt.KNExecutorService;
import com.p2082ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.p2082ss.android.ugc.effectmanager.knadapt.KNLogger;
import com.p2082ss.android.ugc.effectmanager.knadapt.KNMonitorService;
import com.p2082ss.android.ugc.effectmanager.knadapt.KNNetworkClient;
import com.p2082ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.p2082ss.android.ugc.effectmanager.link.model.host.Host;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.algorithm.C86709e;
import com.p2082ss.ugc.effectplatform.p4440a.AbstractC86691a;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.AbstractC86700d;
import com.p2082ss.ugc.effectplatform.p4452i.AbstractC86801a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p4519d.p4520a.p4522b.p4524b.AbstractExecutorC87997b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.EffectConfiguration */
public class EffectConfiguration {
    private ExecutorService executor;
    private int filterType;
    private HashMap<String, String> iopInfo;
    private IJsonConverter jsonConverter;
    private ListenerManger listenerManger;
    private String mAccessKey;
    private String mApiAddress;
    private String mAppID;
    private String mAppLanguage;
    private String mAppVersion;
    private ICache mCache;
    private String mChannel;
    private Context mContext;
    private String mDeviceId;
    private String mDeviceType;
    private ArrayList<String> mDraftList;
    private C86687a mEffectConfig;
    private File mEffectDir;
    private EffectDownloadManager mEffectDownloadManager;
    private EffectFetcher mEffectFetcher;
    private EffectNetWorkerWrapper mEffectNetWorker;
    private String mGpuVersion;
    private List<Host> mHosts;
    private String mPlatform;
    private String mRegion;
    private int mRetryCount;
    private String mSdkVersion;
    private TaskManager mTaskManager;
    private IMonitorService monitorService;
    private int requestStrategy;
    private String testStatus;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.effectmanager.EffectConfiguration$1 */
    public static /* synthetic */ class C819231 {
        static {
            Covode.recordClassIndex(95365);
        }
    }

    static {
        Covode.recordClassIndex(95364);
    }

    public String getAccessKey() {
        return this.mAccessKey;
    }

    public String getApiAdress() {
        return this.mApiAddress;
    }

    public String getAppID() {
        return this.mAppID;
    }

    public String getAppLanguage() {
        return this.mAppLanguage;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public ICache getCache() {
        return this.mCache;
    }

    public String getChannel() {
        return this.mChannel;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public String getDeviceType() {
        return this.mDeviceType;
    }

    public ArrayList<String> getDraftList() {
        return this.mDraftList;
    }

    public C86687a getEffectConfig() {
        return this.mEffectConfig;
    }

    public File getEffectDir() {
        return this.mEffectDir;
    }

    public EffectDownloadManager getEffectDownloadManager() {
        return this.mEffectDownloadManager;
    }

    public EffectFetcher getEffectFetcher() {
        return this.mEffectFetcher;
    }

    public EffectNetWorkerWrapper getEffectNetWorker() {
        return this.mEffectNetWorker;
    }

    public ExecutorService getExecutor() {
        return this.executor;
    }

    public int getFilterType() {
        return this.filterType;
    }

    public String getGpuVersion() {
        return this.mGpuVersion;
    }

    public List<Host> getHosts() {
        return this.mHosts;
    }

    public HashMap<String, String> getIopInfo() {
        return this.iopInfo;
    }

    public IJsonConverter getJsonConverter() {
        return this.jsonConverter;
    }

    public ListenerManger getListenerManger() {
        return this.listenerManger;
    }

    public IMonitorService getMonitorService() {
        return this.monitorService;
    }

    public String getPlatform() {
        return this.mPlatform;
    }

    public String getRegion() {
        return this.mRegion;
    }

    public int getRequestStrategy() {
        return this.requestStrategy;
    }

    public int getRetryCount() {
        return this.mRetryCount;
    }

    public String getSdkVersion() {
        return this.mSdkVersion;
    }

    public TaskManager getTaskManager() {
        return this.mTaskManager;
    }

    public String getTestStatus() {
        return this.testStatus;
    }

    /* renamed from: com.ss.android.ugc.effectmanager.EffectConfiguration$Builder */
    public static final class Builder {
        private static boolean hasAddedVersionTagInLog;
        public String accessKey;
        public String appID;
        public String appLanguage;
        public String appVersion;
        public ICache cache;
        public String channel;
        public Context context;
        public String deviceId;
        public String deviceType;
        public ArrayList<String> draftList;
        public File effectDir;
        public EffectFetcher effectFetcher;
        public IEffectNetWorker effectNetWorker;
        public int filterType;
        public String gpuVersion;
        public List<Host> hosts;
        public HashMap<String, String> iopInfo = new HashMap<>();
        public IJsonConverter jsonConverter;
        public ExecutorService mExecutor;
        private C86687a.C86688a mKNEffectConfigBuilder;
        public IMonitorService monitorService;
        public String platform;
        public String region;
        public int requestStrategy;
        public int retryCount = 3;
        public String sdkVersion;
        public String testStatus;

        static {
            Covode.recordClassIndex(95366);
        }

        public final Builder sysLanguage(String str) {
            return this;
        }

        public final EffectConfiguration build() {
            return new EffectConfiguration(this, null);
        }

        public final C86687a buildKNEffectConfig() {
            return this.mKNEffectConfigBuilder.mo139921a();
        }

        public Builder() {
            if (!hasAddedVersionTagInLog) {
                if (UseKNPlatform.enableKNPlatform) {
                    EPLog.addSDKTagString("760.0.0.148-alpha.2-mt");
                } else {
                    EPLog.addSDKTagString(EPUtils.getPlatformSDKVersion());
                }
                hasAddedVersionTagInLog = true;
            }
            this.mKNEffectConfigBuilder = new C86687a.C86688a();
        }

        public final Builder cache(ICache iCache) {
            this.cache = iCache;
            return this;
        }

        public final Builder accessKey(String str) {
            this.accessKey = str;
            this.mKNEffectConfigBuilder.mo139920a(str);
            return this;
        }

        public final Builder appID(String str) {
            this.appID = str;
            this.mKNEffectConfigBuilder.f195483f = str;
            return this;
        }

        public final Builder appLanguage(String str) {
            this.appLanguage = str;
            this.mKNEffectConfigBuilder.mo139929i(str);
            return this;
        }

        public final Builder appVersion(String str) {
            this.appVersion = str;
            this.mKNEffectConfigBuilder.mo139923c(str);
            return this;
        }

        public final Builder channel(String str) {
            this.channel = str;
            this.mKNEffectConfigBuilder.mo139925e(str);
            return this;
        }

        public final Builder deviceId(String str) {
            this.deviceId = str;
            this.mKNEffectConfigBuilder.mo139924d(str);
            return this;
        }

        public final Builder deviceType(String str) {
            this.deviceType = str;
            this.mKNEffectConfigBuilder.mo139927g(str);
            return this;
        }

        public final Builder filterType(int i) {
            this.filterType = i;
            this.mKNEffectConfigBuilder.mo139914a(i);
            return this;
        }

        public final Builder gpuInfo(String str) {
            this.gpuVersion = str;
            this.mKNEffectConfigBuilder.f195499v = str;
            return this;
        }

        public final Builder knEffectFetcher(AbstractC86691a aVar) {
            this.mKNEffectConfigBuilder.f195496s = aVar;
            return this;
        }

        public final Builder platform(String str) {
            this.platform = str;
            this.mKNEffectConfigBuilder.mo139926f(str);
            return this;
        }

        public final Builder region(String str) {
            this.region = str;
            this.mKNEffectConfigBuilder.mo139928h(str);
            return this;
        }

        public final Builder requestStrategy(int i) {
            this.requestStrategy = i;
            this.mKNEffectConfigBuilder.f195501x = i;
            return this;
        }

        public final Builder retryCount(int i) {
            this.retryCount = i;
            this.mKNEffectConfigBuilder.f195492o = i;
            return this;
        }

        public final Builder sdkVersion(String str) {
            this.sdkVersion = str;
            this.mKNEffectConfigBuilder.mo139922b(str);
            return this;
        }

        public final Builder testStatus(String str) {
            this.testStatus = str;
            this.mKNEffectConfigBuilder.f195498u = str;
            return this;
        }

        /* renamed from: com_ss_android_ugc_effectmanager_EffectConfiguration$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
        public static Context m141884xe49029e6(Context context2) {
            Context applicationContext = context2.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                return C58003a.f132199a;
            }
            return applicationContext;
        }

        public final Builder context(Context context2) {
            Context com_ss_android_ugc_effectmanager_EffectConfiguration$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = m141884xe49029e6(context2);
            this.context = com_ss_android_ugc_effectmanager_EffectConfiguration$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext;
            this.mKNEffectConfigBuilder.mo139919a(com_ss_android_ugc_effectmanager_EffectConfiguration$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext);
            return this;
        }

        public final Builder draftList(ArrayList<String> arrayList) {
            this.draftList = arrayList;
            C86687a.C86688a aVar = this.mKNEffectConfigBuilder;
            C89219l.m154719c(arrayList, "");
            aVar.f195503z = arrayList;
            return this;
        }

        public final Builder effectMaxCacheSize(long j) {
            C86687a.C86688a aVar = this.mKNEffectConfigBuilder;
            if (j > 0) {
                aVar.f195477G = j;
            }
            return this;
        }

        public final Builder effectNetWorker(IEffectNetWorker iEffectNetWorker) {
            this.effectNetWorker = iEffectNetWorker;
            this.mKNEffectConfigBuilder.mo139916a((AbstractC86700d) new KNNetworkClient(iEffectNetWorker));
            return this;
        }

        public final Builder executor(ExecutorService executorService) {
            this.mExecutor = executorService;
            this.mKNEffectConfigBuilder.mo139918a((AbstractExecutorC87997b) new KNExecutorService(executorService));
            return this;
        }

        public final Builder monitorService(IMonitorService iMonitorService) {
            this.monitorService = iMonitorService;
            this.mKNEffectConfigBuilder.mo139917a((AbstractC86801a) new KNMonitorService(iMonitorService));
            return this;
        }

        public final Builder JsonConverter(IJsonConverter iJsonConverter) {
            this.jsonConverter = iJsonConverter;
            this.mKNEffectConfigBuilder.mo139915a(new C86695b(new KNJsonConverter(iJsonConverter)));
            return this;
        }

        public final Builder effectDir(File file) {
            this.effectDir = file;
            if (file == null) {
                return this;
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            this.mKNEffectConfigBuilder.f195490m = file.getAbsolutePath();
            return this;
        }

        public final Builder hosts(List<Host> list) {
            this.hosts = list;
            if (!list.isEmpty()) {
                this.mKNEffectConfigBuilder.mo139930j(list.get(0).getItemName());
            }
            return this;
        }

        public final Builder effectFetcher(EffectFetcher effectFetcher2) {
            this.effectFetcher = effectFetcher2;
            if (effectFetcher2 != null && "DownloadableModelSupportEffectFetcher".equals(effectFetcher2.getClass().getSimpleName()) && C86709e.C86710a.m150209b()) {
                this.mKNEffectConfigBuilder.f195496s = C86709e.C86710a.m150208a().mo139950b();
            }
            return this;
        }

        public final Builder iop(String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str)) {
                this.iopInfo.put("lx", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                this.iopInfo.put("ly", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                this.iopInfo.put("cy_code", str3);
            }
            C86687a.C86688a aVar = this.mKNEffectConfigBuilder;
            if (str != null && (!C89219l.m154714a((Object) str, (Object) ""))) {
                aVar.f195500w.put("lx", str);
            }
            if (str2 != null && (!C89219l.m154714a((Object) str2, (Object) ""))) {
                aVar.f195500w.put("ly", str2);
            }
            if (str3 != null && (!C89219l.m154714a((Object) str3, (Object) ""))) {
                aVar.f195500w.put("cy_code", str3);
            }
            return this;
        }
    }

    public void setCache(ICache iCache) {
        this.mCache = iCache;
    }

    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    public void setDraftList(ArrayList<String> arrayList) {
        this.mDraftList = arrayList;
    }

    public void setEffectDir(File file) {
        this.mEffectDir = file;
    }

    public void setEffectFetcher(EffectFetcher effectFetcher) {
        this.mEffectFetcher = effectFetcher;
    }

    public void setTaskManager(TaskManager taskManager) {
        this.mTaskManager = taskManager;
    }

    public void setEffectNetWorker(IEffectNetWorker iEffectNetWorker) {
        this.mEffectNetWorker.setIEffectNetWorker(iEffectNetWorker);
    }

    /* renamed from: com_ss_android_ugc_effectmanager_EffectConfiguration_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir */
    public static File m141883x1349370a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    private EffectConfiguration(Builder builder) {
        String str;
        String str2;
        EffectFetcher effectFetcher;
        String str3 = "online";
        this.mChannel = str3;
        this.iopInfo = new HashMap<>();
        this.mRetryCount = 1;
        this.mApiAddress = "/effect/api";
        this.mAccessKey = builder.accessKey;
        this.mSdkVersion = builder.sdkVersion;
        this.mAppVersion = builder.appVersion;
        this.mDeviceId = builder.deviceId;
        this.mChannel = builder.channel != null ? builder.channel : str3;
        if (builder.platform == null) {
            str = "android";
        } else {
            str = builder.platform;
        }
        this.mPlatform = str;
        this.mDeviceType = builder.deviceType;
        this.mContext = builder.context;
        if (builder.effectDir != null || this.mContext == null) {
            this.mEffectDir = builder.effectDir;
        } else {
            this.mEffectDir = new File(m141883x1349370a(this.mContext), "effect");
        }
        this.mEffectDir = builder.effectDir;
        this.mEffectNetWorker = new EffectNetWorkerWrapper(builder.effectNetWorker, builder.context);
        this.mRegion = builder.region;
        this.mCache = builder.cache;
        this.mRetryCount = builder.retryCount;
        this.jsonConverter = builder.jsonConverter;
        if (builder.appID == null) {
            str2 = "0";
        } else {
            str2 = builder.appID;
        }
        this.mAppID = str2;
        this.mAppLanguage = builder.appLanguage;
        this.iopInfo = builder.iopInfo;
        this.monitorService = builder.monitorService;
        this.executor = builder.mExecutor;
        if (builder.effectFetcher == null) {
            effectFetcher = new DefaultEffectFetcher(this.mEffectNetWorker, this.monitorService, this.mAppID, this.mAccessKey);
        } else {
            effectFetcher = builder.effectFetcher;
        }
        this.mEffectFetcher = effectFetcher;
        this.testStatus = builder.testStatus;
        this.listenerManger = new ListenerManger();
        this.mEffectDownloadManager = EffectDownloadManager.INSTANCE;
        this.mDraftList = builder.draftList;
        this.mGpuVersion = builder.gpuVersion;
        this.requestStrategy = builder.requestStrategy;
        this.mHosts = builder.hosts;
        this.filterType = builder.filterType;
        this.mEffectConfig = builder.buildKNEffectConfig();
        C86687a.m150174a(KNLogger.INSTANCE);
    }

    /* synthetic */ EffectConfiguration(Builder builder, C819231 r2) {
        this(builder);
    }
}
