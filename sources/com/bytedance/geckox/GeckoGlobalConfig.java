package com.bytedance.geckox;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.p1024k.AbstractC14965c;
import com.bytedance.geckox.p1024k.C14963a;
import com.bytedance.geckox.statistic.AbstractC15017a;
import com.bytedance.geckox.utils.C15044a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Map;

public class GeckoGlobalConfig {
    private final Long mAppId;
    private final String mAppVersion;
    private final Context mContext;
    private String mDeviceId;
    private final ENVType mEnv;
    private final AbstractC14952h mGeckoServiceManager;
    private final String mHost;
    private final IMonitorConfig mMonitorConfig;
    private final AbstractC14965c mNetWork;
    private final String mRegion;
    private final IRequestTagHeaderProvider mRequestTagHeaderProvider;
    private final AbstractC15017a mStatisticMonitor;

    public interface IMonitorConfig {
        static {
            Covode.recordClassIndex(16976);
        }

        String getChannel();

        Map<String, String> getCommonParams();

        String getMonitorHost();

        String getPackageId();

        String getUpdateVersionCode();

        boolean isOversea();
    }

    public interface IRequestTagHeaderProvider {
        static {
            Covode.recordClassIndex(16977);
        }

        Pair<String, String> getRequestTagHeader(boolean z);
    }

    static {
        Covode.recordClassIndex(16972);
    }

    public enum ENVType {
        BOE(1),
        DEV(1),
        PROD(2);
        
        private int val;

        public final int getVal() {
            return this.val;
        }

        static {
            Covode.recordClassIndex(16975);
        }

        private ENVType(int i) {
            this.val = i;
        }
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public ENVType getEnv() {
        return this.mEnv;
    }

    public AbstractC14952h getGeckoServiceManager() {
        return this.mGeckoServiceManager;
    }

    public String getHost() {
        return this.mHost;
    }

    public IMonitorConfig getMonitorConfig() {
        return this.mMonitorConfig;
    }

    public AbstractC14965c getNetWork() {
        return this.mNetWork;
    }

    public String getRegion() {
        return this.mRegion;
    }

    public IRequestTagHeaderProvider getRequestTagHeaderProvider() {
        return this.mRequestTagHeaderProvider;
    }

    public AbstractC15017a getStatisticMonitor() {
        return this.mStatisticMonitor;
    }

    public static class Builder {
        public Long appId;
        public String appVersion;
        public String deviceId;
        public ENVType env;
        public AbstractC14952h geckoServiceManager;
        public String host;
        public Context mContext;
        public AbstractC14965c mNetWork;
        public AbstractC15017a mStatisticMonitor;
        public IMonitorConfig monitorConfig;
        public String region;
        public IRequestTagHeaderProvider requestTagHeaderProvider;

        static {
            Covode.recordClassIndex(16974);
        }

        public GeckoGlobalConfig build() {
            return new GeckoGlobalConfig(this);
        }

        public Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public Builder deviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public Builder env(ENVType eNVType) {
            this.env = eNVType;
            return this;
        }

        public Builder geckoServiceManager(AbstractC14952h hVar) {
            this.geckoServiceManager = hVar;
            return this;
        }

        public Builder host(String str) {
            this.host = str;
            return this;
        }

        public Builder monitorConfig(IMonitorConfig iMonitorConfig) {
            this.monitorConfig = iMonitorConfig;
            return this;
        }

        public Builder netStack(AbstractC14965c cVar) {
            this.mNetWork = cVar;
            return this;
        }

        public Builder region(String str) {
            this.region = str;
            return this;
        }

        public Builder requestTagHeaderProvider(IRequestTagHeaderProvider iRequestTagHeaderProvider) {
            this.requestTagHeaderProvider = iRequestTagHeaderProvider;
            return this;
        }

        public Builder statisticMonitor(AbstractC15017a aVar) {
            this.mStatisticMonitor = aVar;
            return this;
        }

        public Builder appId(long j) {
            this.appId = Long.valueOf(j);
            return this;
        }

        public Builder(Context context) {
            this.mContext = m27296xdbf4773(context);
        }

        /* renamed from: com_bytedance_geckox_GeckoGlobalConfig$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
        public static Context m27296xdbf4773(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                return C58003a.f132199a;
            }
            return applicationContext;
        }
    }

    public long getAppId() {
        return this.mAppId.longValue();
    }

    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    private GeckoGlobalConfig(Builder builder) {
        Context context = builder.mContext;
        this.mContext = context;
        if (context != null) {
            Long l = builder.appId;
            this.mAppId = l;
            if (TextUtils.isEmpty(builder.appVersion)) {
                this.mAppVersion = C15044a.m27704a(context);
            } else {
                this.mAppVersion = builder.appVersion;
            }
            this.mDeviceId = builder.deviceId;
            String str = builder.host;
            this.mHost = str;
            this.mRegion = builder.region;
            ENVType eNVType = builder.env;
            this.mEnv = eNVType;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("host is required");
            } else if (l == null) {
                throw new IllegalArgumentException("appId is required");
            } else if (TextUtils.isEmpty(this.mDeviceId)) {
                throw new IllegalArgumentException("deviceId is required");
            } else if (eNVType != null) {
                if (builder.mNetWork == null) {
                    this.mNetWork = new C14963a();
                } else {
                    this.mNetWork = builder.mNetWork;
                }
                this.mStatisticMonitor = builder.mStatisticMonitor;
                this.mRequestTagHeaderProvider = builder.requestTagHeaderProvider;
                this.mMonitorConfig = builder.monitorConfig;
                if (builder.geckoServiceManager == null) {
                    this.mGeckoServiceManager = new AbstractC14952h() {
                        /* class com.bytedance.geckox.GeckoGlobalConfig.C148701 */

                        static {
                            Covode.recordClassIndex(16973);
                        }
                    };
                } else {
                    this.mGeckoServiceManager = builder.geckoServiceManager;
                }
            } else {
                throw new IllegalArgumentException("env is required");
            }
        } else {
            throw new IllegalArgumentException("context is required");
        }
    }
}
