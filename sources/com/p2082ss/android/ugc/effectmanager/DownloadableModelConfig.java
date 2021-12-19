package com.p2082ss.android.ugc.effectmanager;

import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.p2082ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.p2082ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.common.utils.Preconditions;
import com.p2082ss.android.ugc.effectmanager.knadapt.KNExecutor;
import com.p2082ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.p2082ss.android.ugc.effectmanager.knadapt.KNMonitorService;
import com.p2082ss.android.ugc.effectmanager.knadapt.KNNetworkClient;
import com.p2082ss.android.ugc.effectmanager.knadapt.ModelConverterExtKt;
import com.p2082ss.android.ugc.effectmanager.knadapt.ModelListenerAdaptKt;
import com.p2082ss.android.ugc.effectmanager.link.model.host.Host;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.algorithm.EnumC86835b;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.C86695b;
import com.p2082ss.ugc.effectplatform.p4440a.p4443c.AbstractC86700d;
import com.p2082ss.ugc.effectplatform.p4452i.AbstractC86801a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import p4519d.p4520a.p4522b.p4524b.AbstractExecutorC87997b;
import p4519d.p4520a.p4532e.AbstractC88059a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.DownloadableModelConfig */
public final class DownloadableModelConfig {
    private final String mAccessKey;
    private final String mAppId;
    private final AssetManager mAssetManager;
    private final Context mContext;
    private final String mDeviceType;
    private final EffectConfiguration mEffectConfiguration;
    private final IEffectNetWorker mEffectNetWorker;
    private final ModelEventListener mEventListener;
    private final Pattern mExclusionPattern;
    private final Executor mExecutor;
    private final FetchModelType mFetchModelType;
    private final List<Host> mHosts;
    private final IJsonConverter mJsonConverter;
    private C86687a mKNEffectConfig;
    private final ModelFileEnv mModelFileEnv;
    private final IMonitorService mMonitorService;
    private final String mSdkVersion;
    private final String mWorkspace;

    static {
        Covode.recordClassIndex(95348);
    }

    public final String getAccessKey() {
        return this.mAccessKey;
    }

    public final String getAppId() {
        return this.mAppId;
    }

    public final AssetManager getAssetManager() {
        return this.mAssetManager;
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final String getDeviceType() {
        return this.mDeviceType;
    }

    public final EffectConfiguration getEffectConfiguration() {
        return this.mEffectConfiguration;
    }

    public final IEffectNetWorker getEffectNetWorker() {
        return this.mEffectNetWorker;
    }

    public final ModelEventListener getEventListener() {
        return this.mEventListener;
    }

    public final Pattern getExclusionPattern() {
        return this.mExclusionPattern;
    }

    public final Executor getExecutor() {
        return this.mExecutor;
    }

    public final List<Host> getHosts() {
        return this.mHosts;
    }

    public final IJsonConverter getJsonConverter() {
        return this.mJsonConverter;
    }

    public final C86687a getKNEffectConfig() {
        return this.mKNEffectConfig;
    }

    public final ModelFileEnv getModelFileEnv() {
        return this.mModelFileEnv;
    }

    public final FetchModelType getModelType() {
        return this.mFetchModelType;
    }

    public final IMonitorService getMonitorService() {
        return this.mMonitorService;
    }

    public final String getSdkVersion() {
        return this.mSdkVersion;
    }

    public final String getWorkspace() {
        return this.mWorkspace;
    }

    /* renamed from: com.ss.android.ugc.effectmanager.DownloadableModelConfig$Builder */
    public static final class Builder {
        String mAccessKey;
        String mAppId;
        AssetManager mAssetManager;
        String mBid;
        Context mContext;
        String mDeviceType;
        EffectConfiguration mEffectConfiguration;
        IEffectNetWorker mEffectNetWorker;
        ModelEventListener mEventListener;
        Pattern mExclusionPattern;
        Executor mExecutor;
        FetchModelType mFetchModelType;
        List<Host> mHosts = new ArrayList();
        IJsonConverter mJsonConverter;
        private C86687a.C86688a mKNEffectConfigBuilder = new C86687a.C86688a();
        ModelFileEnv mModelFileEnv;
        IMonitorService mMonitorService;
        String mSdkVersion;
        String mWorkspace;

        static {
            Covode.recordClassIndex(95350);
        }

        public final DownloadableModelConfig build() {
            return new DownloadableModelConfig(this);
        }

        public final C86687a buildKNConfig() {
            return this.mKNEffectConfigBuilder.mo139921a();
        }

        public final Builder setAssetManager(AssetManager assetManager) {
            this.mAssetManager = assetManager;
            return this;
        }

        public final Builder setBid(String str) {
            this.mBid = str;
            return this;
        }

        public final Builder setAccessKey(String str) {
            this.mAccessKey = str;
            this.mKNEffectConfigBuilder.mo139920a(str);
            return this;
        }

        public final Builder setAppId(String str) {
            this.mAppId = str;
            this.mKNEffectConfigBuilder.f195483f = str;
            return this;
        }

        public final Builder setDeviceType(String str) {
            this.mDeviceType = str;
            this.mKNEffectConfigBuilder.mo139927g(str);
            return this;
        }

        public final Builder setModelApiMaxTryCount(int i) {
            this.mKNEffectConfigBuilder.f195493p = i;
            return this;
        }

        public final Builder setSdkVersion(String str) {
            this.mSdkVersion = str;
            this.mKNEffectConfigBuilder.mo139922b(str);
            return this;
        }

        public final Builder setWorkspace(String str) {
            this.mWorkspace = str;
            this.mKNEffectConfigBuilder.f195491n = str;
            return this;
        }

        /* renamed from: com_ss_android_ugc_effectmanager_DownloadableModelConfig$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
        public static Context m141881x7bd1398a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                return C58003a.f132199a;
            }
            return applicationContext;
        }

        public final Builder setContext(Context context) {
            Context com_ss_android_ugc_effectmanager_DownloadableModelConfig$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = m141881x7bd1398a(context);
            this.mContext = com_ss_android_ugc_effectmanager_DownloadableModelConfig$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext;
            this.mKNEffectConfigBuilder.mo139919a(com_ss_android_ugc_effectmanager_DownloadableModelConfig$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext);
            return this;
        }

        public final Builder setEffectNetWorker(IEffectNetWorker iEffectNetWorker) {
            this.mEffectNetWorker = iEffectNetWorker;
            this.mKNEffectConfigBuilder.mo139916a((AbstractC86700d) new KNNetworkClient(iEffectNetWorker));
            return this;
        }

        public final Builder setEventListener(ModelEventListener modelEventListener) {
            this.mEventListener = modelEventListener;
            this.mKNEffectConfigBuilder.f195475E = ModelListenerAdaptKt.toKNListener(modelEventListener);
            return this;
        }

        public final Builder setExecutor(Executor executor) {
            this.mExecutor = executor;
            this.mKNEffectConfigBuilder.mo139918a((AbstractExecutorC87997b) new KNExecutor(executor));
            return this;
        }

        public final Builder setModelFileEnv(ModelFileEnv modelFileEnv) {
            this.mModelFileEnv = modelFileEnv;
            C86687a.C86688a aVar = this.mKNEffectConfigBuilder;
            C86687a.EnumC86690c kNModel = ModelConverterExtKt.toKNModel(modelFileEnv);
            C89219l.m154719c(kNModel, "");
            aVar.f195474D = kNModel;
            return this;
        }

        public final Builder setModelType(FetchModelType fetchModelType) {
            this.mFetchModelType = fetchModelType;
            C86687a.C86688a aVar = this.mKNEffectConfigBuilder;
            EnumC86835b kNFetchModelType = ModelConverterExtKt.toKNFetchModelType(fetchModelType);
            C89219l.m154719c(kNFetchModelType, "");
            aVar.f195472B = kNFetchModelType;
            return this;
        }

        public final Builder setMonitorService(IMonitorService iMonitorService) {
            this.mMonitorService = iMonitorService;
            this.mKNEffectConfigBuilder.mo139917a((AbstractC86801a) new KNMonitorService(iMonitorService));
            return this;
        }

        public final Builder setExclusionPattern(String str) {
            if (str == null) {
                this.mExclusionPattern = null;
            } else {
                this.mExclusionPattern = Pattern.compile(str);
                C86687a.C86688a aVar = this.mKNEffectConfigBuilder;
                C89219l.m154719c(str, "");
                aVar.f195473C = str;
            }
            return this;
        }

        public final Builder setHosts(List<Host> list) {
            this.mHosts.addAll(list);
            if (!list.isEmpty()) {
                this.mKNEffectConfigBuilder.mo139930j(list.get(0).getItemName());
            }
            return this;
        }

        public final Builder setJsonConverter(IJsonConverter iJsonConverter) {
            this.mJsonConverter = iJsonConverter;
            this.mKNEffectConfigBuilder.mo139915a(new C86695b(new KNJsonConverter(iJsonConverter)));
            return this;
        }

        public final Builder setEffectConfiguration(EffectConfiguration effectConfiguration) {
            this.mEffectConfiguration = effectConfiguration;
            if (effectConfiguration.getContext() != null && this.mContext == null) {
                setContext(effectConfiguration.getContext());
            }
            if (effectConfiguration.getAppVersion() != null) {
                this.mKNEffectConfigBuilder.mo139923c(effectConfiguration.getAppVersion());
            }
            if (effectConfiguration.getChannel() != null) {
                this.mKNEffectConfigBuilder.mo139925e(effectConfiguration.getChannel());
            }
            if (effectConfiguration.getDeviceId() != null) {
                this.mKNEffectConfigBuilder.mo139924d(effectConfiguration.getDeviceId());
            }
            if (effectConfiguration.getPlatform() != null) {
                this.mKNEffectConfigBuilder.mo139926f(effectConfiguration.getPlatform());
            }
            if (effectConfiguration.getRegion() != null) {
                this.mKNEffectConfigBuilder.mo139928h(effectConfiguration.getRegion());
            }
            if (effectConfiguration.getAppLanguage() != null) {
                this.mKNEffectConfigBuilder.mo139929i(effectConfiguration.getAppLanguage());
            }
            if (effectConfiguration.getGpuVersion() != null) {
                this.mKNEffectConfigBuilder.f195499v = effectConfiguration.getGpuVersion();
            }
            if (effectConfiguration.getTestStatus() != null) {
                this.mKNEffectConfigBuilder.f195498u = effectConfiguration.getTestStatus();
            }
            this.mKNEffectConfigBuilder.mo139914a(effectConfiguration.getFilterType());
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.DownloadableModelConfig$ModelFileEnv */
    public enum ModelFileEnv {
        TEST,
        ONLINE;

        static {
            Covode.recordClassIndex(95351);
        }
    }

    private DownloadableModelConfig(Builder builder) {
        ModelFileEnv modelFileEnv;
        FetchModelType fetchModelType;
        this.mAssetManager = (AssetManager) Preconditions.checkNotNull(builder.mAssetManager);
        this.mWorkspace = (String) Preconditions.checkNotNull(builder.mWorkspace);
        this.mEffectNetWorker = (IEffectNetWorker) Preconditions.checkNotNull(builder.mEffectNetWorker);
        this.mHosts = Collections.unmodifiableList(builder.mHosts);
        this.mJsonConverter = (IJsonConverter) Preconditions.checkNotNull(builder.mJsonConverter);
        this.mExecutor = (Executor) Preconditions.checkNotNull(builder.mExecutor);
        this.mDeviceType = (String) Preconditions.checkNotNull(builder.mDeviceType);
        this.mSdkVersion = (String) Preconditions.checkNotNull(builder.mSdkVersion);
        this.mAppId = (String) Preconditions.checkNotNull(builder.mAppId);
        this.mAccessKey = (String) Preconditions.checkNotNull(builder.mAccessKey);
        this.mMonitorService = builder.mMonitorService;
        this.mExclusionPattern = builder.mExclusionPattern;
        this.mEventListener = builder.mEventListener;
        if (builder.mModelFileEnv == null) {
            modelFileEnv = ModelFileEnv.ONLINE;
        } else {
            modelFileEnv = builder.mModelFileEnv;
        }
        this.mModelFileEnv = modelFileEnv;
        if (builder.mFetchModelType == null) {
            fetchModelType = FetchModelType.ORIGIN;
        } else {
            fetchModelType = builder.mFetchModelType;
        }
        this.mFetchModelType = fetchModelType;
        this.mEffectConfiguration = builder.mEffectConfiguration;
        this.mContext = builder.mContext;
        C86687a buildKNConfig = builder.buildKNConfig();
        this.mKNEffectConfig = buildKNConfig;
        if (buildKNConfig != null) {
            C86687a.m150174a(new AbstractC88059a() {
                /* class com.p2082ss.android.ugc.effectmanager.DownloadableModelConfig.C819171 */

                static {
                    Covode.recordClassIndex(95349);
                }

                public void setEnabled(boolean z) {
                }

                @Override // p4519d.p4520a.p4532e.AbstractC88059a
                public boolean getEnabled() {
                    return EPLog.INSTANCE.getSEnableLog();
                }

                @Override // p4519d.p4520a.p4532e.AbstractC88059a
                public void logDebug(String str, String str2) {
                    EPLog.m141898d(str, str2);
                }

                @Override // p4519d.p4520a.p4532e.AbstractC88059a
                public void logError(String str, String str2) {
                    EPLog.m141899e(str, str2);
                }

                @Override // p4519d.p4520a.p4532e.AbstractC88059a
                public void logError(String str, String str2, Throwable th) {
                    EPLog.m141900e(str, str2, th);
                }
            });
        }
    }
}
