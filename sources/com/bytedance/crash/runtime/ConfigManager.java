package com.bytedance.crash.runtime;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AbstractC13852e;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.entity.C13868e;
import com.bytedance.crash.p932j.C13888a;
import com.bytedance.crash.runtime.p934b.C13996a;
import com.bytedance.crash.runtime.p934b.C13997b;
import com.bytedance.crash.runtime.p934b.C13999c;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14059k;
import com.bytedance.crash.util.C14073u;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

public class ConfigManager {
    private static boolean sApmExists = true;
    private static IConfigManager sConfigManager;
    private String mAlogUploadUrl = "";
    private volatile long mAnrCheckInterval = 500;
    private String mApmConfigUrl = "";
    private String mAsanReportUploadUrl = "";
    private boolean mBlockMonitorEnable;
    private long mBlockMonitorInterval = 1000;
    private String mCoreDumpUrl = "";
    private AbstractC13852e mEncryptImpl = new AbstractC13852e() {
        /* class com.bytedance.crash.runtime.ConfigManager.C139751 */

        static {
            Covode.recordClassIndex(16040);
        }

        @Override // com.bytedance.crash.AbstractC13852e
        /* renamed from: a */
        public final byte[] mo22303a(byte[] bArr) {
            return EncryptorUtil.m27092a(bArr, bArr.length);
        }
    };
    private boolean mEnsureEnable = true;
    private boolean mEnsureWithLogcat;
    private final String mEventUploadUrl = "";
    private String mExceptionUploadUrl = "";
    private boolean mIsDebugMode;
    private String mJavaCrashUploadUrl = "";
    private long mLaunchCrashInterval = 8000;
    private String mLaunchCrashUploadUrl = "";
    private int mLogcatDumpCount = 512;
    private int mLogcatLevel = 1;
    private final boolean mNativeCrashMiniDump = true;
    private String mNativeCrashUploadUrl = "";
    private String mNativeMemUrl = "";
    private ThreadPoolExecutor mThreadPoolExecutor;
    private String mUploadCheckCoreDumpUrl = "";
    private boolean reportErrorEnable = true;

    public boolean isNativeCrashMiniDump() {
        return true;
    }

    public long getBlockInterval() {
        return this.mBlockMonitorInterval;
    }

    public long getDefaultAnrCheckInterval() {
        return this.mAnrCheckInterval;
    }

    public AbstractC13852e getEncryptImpl() {
        return this.mEncryptImpl;
    }

    public Set<String> getFilterThreadSet() {
        return C14059k.f34237a;
    }

    public long getLaunchCrashInterval() {
        return this.mLaunchCrashInterval;
    }

    public int getLogcatDumpCount() {
        return this.mLogcatDumpCount;
    }

    public int getLogcatLevel() {
        return this.mLogcatLevel;
    }

    public ThreadPoolExecutor getThreadPoolExecutor() {
        return this.mThreadPoolExecutor;
    }

    public boolean isApmExists() {
        return C13888a.f33817e;
    }

    public boolean isBlockMonitorEnable() {
        return this.mBlockMonitorEnable;
    }

    public boolean isEnsureWithLogcat() {
        return this.mEnsureWithLogcat;
    }

    public boolean isReportErrorEnable() {
        return this.reportErrorEnable;
    }

    static {
        Covode.recordClassIndex(16039);
    }

    public String getUploadCheckCoreDumpUrl() {
        return C13977a.f34061a;
    }

    public boolean isDebugMode() {
        if (this.mIsDebugMode || C13868e.f33763b) {
            return true;
        }
        return false;
    }

    public IConfigManager getApmConfigManager() {
        if (sApmExists && sConfigManager == null) {
            try {
                sConfigManager = (IConfigManager) C21520c.m40424a(IConfigManager.class);
            } catch (Throwable unused) {
                sApmExists = false;
            }
        }
        if (sApmExists) {
            return sConfigManager;
        }
        return null;
    }

    public String getAsanReportUploadUrl() {
        return C13977a.f34061a + "/monitor/collect/c/native_bin_crash";
    }

    public String getCoreDumpUrl() {
        return C13977a.f34061a + "/monitor/collect/c/core_dump_collect";
    }

    public String getEventUploadUrl() {
        return C13977a.f34061a + "/monitor/collect/";
    }

    public String getNativeMemUrl() {
        return C13977a.f34061a + "/monitor/collect/c/rapheal_file_collect";
    }

    public boolean isEnsureEnable() {
        if ((!C13994b.m25335b() || !C13996a.m25356c(C14004d.m25375a(C13933m.m25221a()))) && !this.mEnsureEnable) {
            return false;
        }
        return true;
    }

    public String getAlogUploadUrl() {
        if (!TextUtils.isEmpty(this.mAlogUploadUrl)) {
            return this.mAlogUploadUrl;
        }
        return C13977a.f34061a + "/monitor/collect/c/logcollect";
    }

    public String getApmConfigUrl() {
        if (!TextUtils.isEmpty(this.mApmConfigUrl)) {
            return this.mApmConfigUrl;
        }
        return C13977a.f34061a + "/monitor/appmonitor/v3/settings";
    }

    public String getExceptionUploadUrl() {
        if (!TextUtils.isEmpty(this.mExceptionUploadUrl)) {
            return this.mExceptionUploadUrl;
        }
        return C13977a.f34061a + "/monitor/collect/c/exception";
    }

    public String getJavaCrashUploadUrl() {
        if (!TextUtils.isEmpty(this.mJavaCrashUploadUrl)) {
            return this.mJavaCrashUploadUrl;
        }
        return C13977a.f34061a + "/monitor/collect/c/crash";
    }

    public String getLaunchCrashUploadUrl() {
        if (!TextUtils.isEmpty(this.mLaunchCrashUploadUrl)) {
            return this.mLaunchCrashUploadUrl;
        }
        return C13977a.f34061a + "/monitor/collect/c/exception/dump_collection";
    }

    public String getNativeCrashUploadUrl() {
        if (!TextUtils.isEmpty(this.mNativeCrashUploadUrl)) {
            return this.mNativeCrashUploadUrl;
        }
        return C13977a.f34061a + "/monitor/collect/c/native_bin_crash";
    }

    public void setBlockMonitorEnable(boolean z) {
        this.mBlockMonitorEnable = z;
    }

    public void setBlockMonitorInterval(long j) {
        this.mBlockMonitorInterval = j;
    }

    public void setCurrentProcessName(String str) {
        C14044b.f34213a = str;
    }

    public void setDebugMode(boolean z) {
        this.mIsDebugMode = z;
    }

    public void setDefaultAnrCheckInterval(long j) {
        this.mAnrCheckInterval = j;
    }

    public void setEnsureEnable(boolean z) {
        this.mEnsureEnable = z;
    }

    public void setEnsureWithLogcat(boolean z) {
        this.mEnsureWithLogcat = z;
    }

    public void setReportErrorEnable(boolean z) {
        this.reportErrorEnable = z;
    }

    public void setThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor) {
        this.mThreadPoolExecutor = threadPoolExecutor;
    }

    public void setEncryptImpl(AbstractC13852e eVar) {
        if (eVar != null) {
            this.mEncryptImpl = eVar;
        }
    }

    public void setLogcatDumpCount(int i) {
        if (i > 0) {
            this.mLogcatDumpCount = i;
        }
    }

    public void setLogcatLevel(int i) {
        if (i >= 0 && i <= 4) {
            this.mLogcatLevel = i;
        }
    }

    public void setAlogUploadUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mAlogUploadUrl = str;
        }
    }

    public void setConfigGetUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mApmConfigUrl = str;
        }
    }

    public void setJavaCrashUploadUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mJavaCrashUploadUrl = str;
        }
    }

    public void setLaunchCrashInterval(long j) {
        if (j > 0) {
            this.mLaunchCrashInterval = j;
        }
    }

    public void setNativeCrashUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mNativeCrashUploadUrl = str;
        }
    }

    public boolean isCrashIgnored(final String str) {
        try {
            C139762 r1 = new C13997b() {
                /* class com.bytedance.crash.runtime.ConfigManager.C139762 */

                static {
                    Covode.recordClassIndex(16041);
                }

                @Override // com.bytedance.crash.runtime.p934b.C13997b
                /* renamed from: a */
                public final Object mo22489a(String str) {
                    if (str.equals("md5")) {
                        return str;
                    }
                    return super.mo22489a(str);
                }
            };
            if (C13999c.m25365a("java_crash_ignore", r1)) {
                return true;
            }
            if (C14073u.m25649b(C13933m.f33936a)) {
                return C13999c.m25365a("java_crash_ignore", r1);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setLaunchCrashUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mExceptionUploadUrl = str;
            int indexOf = str.indexOf("//");
            if (indexOf == -1) {
                this.mLaunchCrashUploadUrl = str.substring(0, str.indexOf("/") + 1) + "monitor/collect/c/exception/dump_collection";
            } else {
                this.mLaunchCrashUploadUrl = str.substring(0, str.indexOf("/", indexOf + 2) + 1) + "monitor/collect/c/exception/dump_collection";
            }
        }
    }
}
