package com.p2082ss.android.socialbase.downloader.model;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30341ae;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30420l;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.p2179b.C30292f;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30287a;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30288b;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30293g;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30295i;
import com.p2082ss.android.socialbase.downloader.p2181d.C30325a;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.model.DownloadInfo */
public class DownloadInfo implements Parcelable {
    public static final Parcelable.Creator<DownloadInfo> CREATOR = new Parcelable.Creator<DownloadInfo>() {
        /* class com.p2082ss.android.socialbase.downloader.model.DownloadInfo.C305841 */

        static {
            Covode.recordClassIndex(37114);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DownloadInfo[] newArray(int i) {
            return new DownloadInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DownloadInfo createFromParcel(Parcel parcel) {
            return new DownloadInfo(parcel);
        }
    };
    private boolean addListenerToSameTask;
    private boolean addTTNetCommonParam;
    private AtomicLong allConnectTime;
    private int appVersionCode;
    private EnumC30287a asyncHandleStatus;
    private boolean autoResumed;
    private int backUpUrlRetryCount;
    private boolean backUpUrlUsed;
    private List<String> backUpUrls;
    private String backUpUrlsStr;
    private int bindValueCount;
    private EnumC30288b byteInvalidRetryStatus;
    private int chunkCount;
    private boolean chunkDowngradeRetryUsed;
    private int curBackUpUrlIndex;
    private AtomicLong curBytes;
    private int curRetryTime;
    private JSONObject dbJsonData;
    private String dbJsonDataString;
    private boolean deleteCacheIfCheckFailed;
    private boolean distinctDirectory;
    private long downloadTime;
    private String eTag;
    private EnumC30293g enqueueType;
    private StringBuffer errorBytesLog;
    private boolean expiredRedownload;
    private String extra;
    private List<HttpHeader> extraHeaders;
    private int[] extraMonitorStatus;
    private BaseException failedException;
    private String filePackageName;
    private List<String> forbiddenBackupUrls;
    private boolean force;
    private boolean forceIgnoreRecommendSize;
    private boolean headConnectionAvailable;
    private String headConnectionException;
    private int httpStatusCode;
    private String httpStatusMessage;
    private boolean httpsToHttpRetryUsed;
    private String iconUrl;

    /* renamed from: id */
    private int f72934id;
    private boolean ignoreDataVerify;
    private Boolean isAutoInstallWithoutNotification;
    private boolean isFirstDownload;
    private boolean isFirstSuccess;
    private boolean isForbiddenRetryed;
    private volatile boolean isSaveTempFile;
    private AtomicLong lastNotifyProgressTime;
    private boolean mDownloadFromReserveWifi;
    private int maxBytes;
    private int maxProgressCount;
    private String md5;
    private String mimeType;
    private int minProgressTimeMsInterval;
    private String monitorScene;
    private String name;
    private boolean needChunkDowngradeRetry;
    private boolean needDefaultHttpServiceBackUp;
    private boolean needHttpsToHttpRetry;
    private boolean needIndependentProcess;
    private boolean needPostProgress;
    private boolean needRetryDelay;
    private boolean needReuseChunkRunnable;
    private boolean needReuseFirstConnection;
    private boolean needSDKMonitor;
    private String networkQuality;
    private int notificationVisibility;
    private boolean onlyWifi;
    private boolean openLimitSpeed;
    private String[] outIp;
    private int[] outSize;
    private SoftReference<PackageInfo> packageInfoRef;
    private String packageName;
    private long realDownloadTime;
    private long realStartDownloadTime;
    private int retryCount;
    private EnumC30295i retryDelayStatus;
    private String retryDelayTimeArray;
    private int retryScheduleMinutes;
    private String savePath;
    private boolean showNotification;
    private boolean showNotificationForAutoResumed;
    private boolean showNotificationForNetworkResumed;
    private JSONObject spData;
    private long startDownloadTime;
    private AtomicInteger status;
    private int statusAtDbInit;
    private boolean successByCache;
    private boolean supportPartial;
    private String taskId;
    private ConcurrentHashMap<String, Object> tempCacheData;
    private volatile List<AbstractC30341ae> tempFileSaveCompleteCallbacks;
    private String tempPath;
    private long throttleNetSpeed;
    private String title;
    private long totalBytes;
    private long ttnetProtectTimeout;
    private String url;

    public int describeContents() {
        return 0;
    }

    public boolean isNeedRetryDelay() {
        return false;
    }

    public void setDeleteCacheIfCheckFailed() {
        this.deleteCacheIfCheckFailed = true;
    }

    public void setForbiddenRetryed() {
        this.isForbiddenRetryed = true;
    }

    public int getAppVersionCode() {
        return this.appVersionCode;
    }

    public EnumC30287a getAsyncHandleStatus() {
        return this.asyncHandleStatus;
    }

    public int getBackUpUrlRetryCount() {
        return this.backUpUrlRetryCount;
    }

    public List<String> getBackUpUrls() {
        return this.backUpUrls;
    }

    public int getBindValueCount() {
        return this.bindValueCount;
    }

    public EnumC30288b getByteInvalidRetryStatus() {
        return this.byteInvalidRetryStatus;
    }

    public int getChunkCount() {
        return this.chunkCount;
    }

    public int getCurBackUpUrlIndex() {
        return this.curBackUpUrlIndex;
    }

    public int getCurRetryTime() {
        return this.curRetryTime;
    }

    public long getDownloadTime() {
        return this.downloadTime;
    }

    public EnumC30293g getEnqueueType() {
        return this.enqueueType;
    }

    public String getExtra() {
        return this.extra;
    }

    public List<HttpHeader> getExtraHeaders() {
        return this.extraHeaders;
    }

    public int[] getExtraMonitorStatus() {
        return this.extraMonitorStatus;
    }

    public BaseException getFailedException() {
        return this.failedException;
    }

    public String getFilePackageName() {
        return this.filePackageName;
    }

    public List<String> getForbiddenBackupUrls() {
        return this.forbiddenBackupUrls;
    }

    public String getHeadConnectionException() {
        return this.headConnectionException;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public String getHttpStatusMessage() {
        return this.httpStatusMessage;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public boolean getIsFirstDownload() {
        return this.isFirstDownload;
    }

    public int getMaxBytes() {
        return this.maxBytes;
    }

    public int getMaxProgressCount() {
        return this.maxProgressCount;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getMonitorScene() {
        return this.monitorScene;
    }

    public String getName() {
        return this.name;
    }

    public String getNetworkQuality() {
        return this.networkQuality;
    }

    public int getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public boolean getOpenLimitSpeed() {
        return this.openLimitSpeed;
    }

    public String[] getOutIp() {
        return this.outIp;
    }

    public int[] getOutSize() {
        return this.outSize;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public EnumC30295i getRetryDelayStatus() {
        return this.retryDelayStatus;
    }

    public String getRetryDelayTimeArray() {
        return this.retryDelayTimeArray;
    }

    public String getSavePath() {
        return this.savePath;
    }

    public int getStatusAtDbInit() {
        return this.statusAtDbInit;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public long getThrottleNetSpeed() {
        return this.throttleNetSpeed;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public long getTtnetProtectTimeout() {
        return this.ttnetProtectTimeout;
    }

    public String getUrl() {
        return this.url;
    }

    public String geteTag() {
        return this.eTag;
    }

    public boolean isAddListenerToSameTask() {
        return this.addListenerToSameTask;
    }

    public boolean isAddTTNetCommonParam() {
        return this.addTTNetCommonParam;
    }

    public boolean isAutoResumed() {
        return this.autoResumed;
    }

    public boolean isBackUpUrlUsed() {
        return this.backUpUrlUsed;
    }

    public boolean isChunkDowngradeRetryUsed() {
        return this.chunkDowngradeRetryUsed;
    }

    public boolean isDeleteCacheIfCheckFailed() {
        return this.deleteCacheIfCheckFailed;
    }

    public boolean isDownloadFromReserveWifi() {
        return this.mDownloadFromReserveWifi;
    }

    public boolean isFirstSuccess() {
        return this.isFirstSuccess;
    }

    public boolean isForbiddenRetryed() {
        return this.isForbiddenRetryed;
    }

    public boolean isForce() {
        return this.force;
    }

    public boolean isForceIgnoreRecommendSize() {
        return this.forceIgnoreRecommendSize;
    }

    public boolean isHeadConnectionAvailable() {
        return this.headConnectionAvailable;
    }

    public boolean isHttpsToHttpRetryUsed() {
        return this.httpsToHttpRetryUsed;
    }

    public boolean isIgnoreDataVerify() {
        return this.ignoreDataVerify;
    }

    public boolean isNeedChunkDowngradeRetry() {
        return this.needChunkDowngradeRetry;
    }

    public boolean isNeedDefaultHttpServiceBackUp() {
        return this.needDefaultHttpServiceBackUp;
    }

    public boolean isNeedHttpsToHttpRetry() {
        return this.needHttpsToHttpRetry;
    }

    public boolean isNeedIndependentProcess() {
        return this.needIndependentProcess;
    }

    public boolean isNeedPostProgress() {
        return this.needPostProgress;
    }

    public boolean isNeedReuseChunkRunnable() {
        return this.needReuseChunkRunnable;
    }

    public boolean isNeedReuseFirstConnection() {
        return this.needReuseFirstConnection;
    }

    public boolean isNeedSDKMonitor() {
        return this.needSDKMonitor;
    }

    public boolean isOnlyWifi() {
        return this.onlyWifi;
    }

    public boolean isSaveTempFile() {
        return this.isSaveTempFile;
    }

    public boolean isShowNotification() {
        return this.showNotification;
    }

    public boolean isShowNotificationForAutoResumed() {
        return this.showNotificationForAutoResumed;
    }

    public boolean isShowNotificationForNetworkResumed() {
        return this.showNotificationForNetworkResumed;
    }

    public boolean isSuccessByCache() {
        return this.successByCache;
    }

    public boolean isSupportPartial() {
        return this.supportPartial;
    }

    /* renamed from: com.ss.android.socialbase.downloader.model.DownloadInfo$a */
    public static class C30585a {

        /* renamed from: A */
        public String f72935A;

        /* renamed from: B */
        public String f72936B;

        /* renamed from: C */
        public long f72937C;

        /* renamed from: D */
        public boolean f72938D;

        /* renamed from: E */
        public String f72939E;

        /* renamed from: F */
        public boolean f72940F;

        /* renamed from: G */
        public boolean f72941G;

        /* renamed from: H */
        public EnumC30293g f72942H = EnumC30293g.ENQUEUE_NONE;

        /* renamed from: I */
        public boolean f72943I;

        /* renamed from: J */
        public boolean f72944J;

        /* renamed from: K */
        public boolean f72945K;

        /* renamed from: L */
        public String f72946L;

        /* renamed from: M */
        public long f72947M;

        /* renamed from: N */
        public boolean f72948N;

        /* renamed from: O */
        public boolean f72949O;

        /* renamed from: P */
        public JSONObject f72950P;

        /* renamed from: Q */
        public boolean f72951Q = true;

        /* renamed from: R */
        public String f72952R;

        /* renamed from: S */
        public int[] f72953S;

        /* renamed from: T */
        public int f72954T;

        /* renamed from: U */
        public boolean f72955U;

        /* renamed from: V */
        public boolean f72956V;

        /* renamed from: W */
        public long f72957W;

        /* renamed from: X */
        public boolean f72958X;

        /* renamed from: Y */
        public boolean f72959Y;

        /* renamed from: Z */
        public String f72960Z;

        /* renamed from: a */
        public String f72961a;

        /* renamed from: b */
        public String f72962b;

        /* renamed from: c */
        public String f72963c;

        /* renamed from: d */
        public String f72964d;

        /* renamed from: e */
        public String f72965e;

        /* renamed from: f */
        public boolean f72966f;

        /* renamed from: g */
        public String f72967g;

        /* renamed from: h */
        public List<HttpHeader> f72968h;

        /* renamed from: i */
        public int f72969i;

        /* renamed from: j */
        public String[] f72970j;

        /* renamed from: k */
        public int[] f72971k;

        /* renamed from: l */
        public int f72972l;

        /* renamed from: m */
        public int f72973m;

        /* renamed from: n */
        public boolean f72974n;

        /* renamed from: o */
        public boolean f72975o = true;

        /* renamed from: p */
        public int f72976p;

        /* renamed from: q */
        public int f72977q;

        /* renamed from: r */
        public List<String> f72978r;

        /* renamed from: s */
        public boolean f72979s;

        /* renamed from: t */
        public boolean f72980t = true;

        /* renamed from: u */
        public String f72981u;

        /* renamed from: v */
        public boolean f72982v;

        /* renamed from: w */
        public boolean f72983w;

        /* renamed from: x */
        public boolean f72984x;

        /* renamed from: y */
        public boolean f72985y = true;

        /* renamed from: z */
        public boolean f72986z;

        static {
            Covode.recordClassIndex(37115);
        }

        /* renamed from: a */
        public final DownloadInfo mo54673a() {
            return new DownloadInfo(this);
        }
    }

    public ConcurrentHashMap<String, Object> getTempCacheData() {
        ensureTempCacheData();
        return this.tempCacheData;
    }

    public boolean isChunked() {
        return C30535g.m62560a(this.totalBytes);
    }

    public boolean isDownloaded() {
        return C30535g.m62583b(this);
    }

    public void resetRealStartDownloadTime() {
        this.realStartDownloadTime = 0;
    }

    static {
        Covode.recordClassIndex(37113);
    }

    private int getReserveWifiStatus() {
        ensureSpData();
        try {
            return this.spData.optInt("pause_reserve_on_wifi", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    public boolean cacheExpierd() {
        if (!isDownloaded()) {
            return true;
        }
        return C30535g.m62595c(this);
    }

    public void generateTaskId() {
        this.taskId = UUID.randomUUID().toString();
    }

    public String getCacheControl() {
        ensureSpData();
        try {
            return this.spData.optString("cache-control", null);
        } catch (Exception unused) {
            return null;
        }
    }

    public long getCacheExpiredTime() {
        ensureSpData();
        try {
            return this.spData.optLong("cache-control/expired_time", -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    public long getCurBytes() {
        AtomicLong atomicLong = this.curBytes;
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0;
    }

    public long getDownloadPrepareTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_key_download_prepare_time");
    }

    public String getDownloadSettingString() {
        ensureDBJsonData();
        return this.dbJsonData.optString("download_setting");
    }

    public int getExecutorGroup() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("executor_group", 2);
    }

    public long getExpectFileLength() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_key_expect_file_length");
    }

    public int getFailedResumeCount() {
        ensureSpData();
        return this.spData.optInt("failed_resume_count", 0);
    }

    public long getFirstSpeedTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_key_first_speed_time");
    }

    public int getId() {
        if (this.f72934id == 0) {
            this.f72934id = C30399c.m61680a(this);
        }
        return this.f72934id;
    }

    public long getLastDownloadTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_last_start_download_time", 0);
    }

    public long getLastFailedResumeTime() {
        ensureSpData();
        return this.spData.optLong("last_failed_resume_time", 0);
    }

    public String getLastModified() {
        ensureSpData();
        try {
            return this.spData.optString("last-modified", null);
        } catch (Exception unused) {
            return null;
        }
    }

    public long getLastUninstallResumeTime() {
        ensureSpData();
        return this.spData.optLong("last_unins_resume_time", 0);
    }

    public int getLinkMode() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("link_mode");
    }

    public int getMinProgressTimeMsInterval() {
        int i = this.minProgressTimeMsInterval;
        if (i < 1000) {
            return 1000;
        }
        return i;
    }

    public PackageInfo getPackageInfo() {
        SoftReference<PackageInfo> softReference = this.packageInfoRef;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public int getPausedResumeCount() {
        ensureSpData();
        return this.spData.optInt("paused_resume_count", 0);
    }

    public int getPreconnectLevel() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("dbjson_key_preconnect_level", 0);
    }

    public long getRealDownloadTime() {
        return TimeUnit.NANOSECONDS.toMillis(this.realDownloadTime);
    }

    public int getRealStatus() {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        return 0;
    }

    public int getRetryScheduleCount() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("retry_schedule_count", 0);
    }

    public int getStatus() {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger == null) {
            return 0;
        }
        int i = atomicInteger.get();
        if (i == -5) {
            return -2;
        }
        return i;
    }

    public int getTTMd5CheckStatus() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("ttmd5_check_status", -1);
    }

    public String getTargetFilePath() {
        return C30535g.m62543a(this.savePath, this.name);
    }

    public String getTaskKey() {
        ensureDBJsonData();
        return this.dbJsonData.optString("task_key");
    }

    public String getTitle() {
        if (TextUtils.isEmpty(this.title)) {
            return this.name;
        }
        return this.title;
    }

    public int getUninstallResumeCount() {
        ensureSpData();
        return this.spData.optInt("unins_resume_count", 0);
    }

    public boolean hasPauseReservedOnWifi() {
        if ((getReserveWifiStatus() & 1) > 0) {
            return true;
        }
        return false;
    }

    public boolean isBreakpointAvailable() {
        if (!isFileDataValid()) {
            return false;
        }
        return isChunkBreakpointAvailable();
    }

    public boolean isDownloadOverStatus() {
        int status2 = getStatus();
        if (status2 >= 0 || status2 == -2 || status2 == -5) {
            return false;
        }
        return true;
    }

    public boolean isDownloadingStatus() {
        return C30292f.m61285a(getStatus());
    }

    public boolean isNewTask() {
        if (getStatus() == 0) {
            return true;
        }
        return false;
    }

    public boolean isPauseReserveOnWifi() {
        if ((getReserveWifiStatus() & 2) > 0) {
            return true;
        }
        return false;
    }

    public boolean isSavePathRedirected() {
        ensureDBJsonData();
        return this.dbJsonData.optBoolean("is_save_path_redirected", false);
    }

    public boolean isWaitingWifiStatus() {
        BaseException baseException = this.failedException;
        if (baseException == null || baseException.getErrorCode() != 1013) {
            return false;
        }
        return true;
    }

    public void setLastNotifyProgressTime() {
        this.lastNotifyProgressTime.set(SystemClock.uptimeMillis());
    }

    public void startPauseReserveOnWifi() {
        ensureSpData();
        try {
            this.spData.put("pause_reserve_on_wifi", 3);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public void stopPauseReserveOnWifi() {
        ensureSpData();
        try {
            this.spData.put("pause_reserve_on_wifi", 1);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public void updateRealStartDownloadTime() {
        if (this.realStartDownloadTime == 0) {
            this.realStartDownloadTime = System.nanoTime();
        }
    }

    public boolean canNotifyProgress() {
        long j = this.lastNotifyProgressTime.get();
        if (j == 0 || SystemClock.uptimeMillis() - j > 20) {
            return true;
        }
        return false;
    }

    public boolean canReStartAsyncTask() {
        if (getStatus() == -3 || this.asyncHandleStatus != EnumC30287a.ASYNC_HANDLE_WAITING) {
            return false;
        }
        return true;
    }

    public boolean canReplaceHttpForRetry() {
        if (TextUtils.isEmpty(this.url) || !this.url.startsWith("https") || !this.needHttpsToHttpRetry || this.httpsToHttpRetryUsed) {
            return false;
        }
        return true;
    }

    public boolean canShowNotification() {
        if (!this.autoResumed) {
            if (!this.showNotification) {
                return false;
            }
            return true;
        } else if (this.showNotificationForAutoResumed || this.showNotificationForNetworkResumed) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canStartRetryDelayTask() {
        if (!isNeedRetryDelay() || getStatus() == -3 || this.retryDelayStatus != EnumC30295i.DELAY_RETRY_WAITING) {
            return false;
        }
        return true;
    }

    public int checkMd5Status() {
        return C30535g.m62534a(new C30325a(getSavePath(), getName()), this.md5);
    }

    public boolean checkMd5Valid() {
        String savePath2 = getSavePath();
        String name2 = getName();
        return C30535g.m62558a(C30535g.m62534a(new C30325a(savePath2, name2), this.md5));
    }

    public long getAllConnectTime() {
        ensureDBJsonData();
        if (this.allConnectTime == null) {
            this.allConnectTime = new AtomicLong(this.dbJsonData.optLong("dbjson_key_all_connect_time"));
        }
        return this.allConnectTime.get();
    }

    public int getCurRetryTimeInTotal() {
        int i = this.curRetryTime;
        if (!this.backUpUrlUsed) {
            return i;
        }
        int i2 = i + this.retryCount;
        int i3 = this.curBackUpUrlIndex;
        if (i3 > 0) {
            return i2 + (i3 * this.backUpUrlRetryCount);
        }
        return i2;
    }

    public String getErrorBytesLog() {
        StringBuffer stringBuffer = this.errorBytesLog;
        if (stringBuffer == null || stringBuffer.length() == 0) {
            return "";
        }
        return this.errorBytesLog.toString();
    }

    public String getTempName() {
        String str = this.name;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C1764a.m5928a("%s.tp", new Object[]{str});
    }

    public String getTempPath() {
        String str = this.savePath;
        String str2 = this.tempPath;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            return !TextUtils.isEmpty(str2) ? str2 : str;
        }
        return null;
    }

    public int getTotalRetryCount() {
        int i = this.retryCount;
        List<String> list = this.backUpUrls;
        if (list == null || list.isEmpty()) {
            return i;
        }
        return i + (this.backUpUrlRetryCount * this.backUpUrls.size());
    }

    public boolean hasNextBackupUrl() {
        int i;
        List<String> list = this.backUpUrls;
        if (list == null || list.size() <= 0) {
            return false;
        }
        if (!this.backUpUrlUsed || ((i = this.curBackUpUrlIndex) >= 0 && i < this.backUpUrls.size() - 1)) {
            return true;
        }
        return false;
    }

    public boolean isAutoInstall() {
        ensureDBJsonData();
        if (this.dbJsonData.optInt("auto_install", 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean isDownloadWithWifiValid() {
        if (!isOnlyWifi() || C30535g.m62561a(C30399c.m61674B())) {
            return true;
        }
        return false;
    }

    public boolean isEntityInvalid() {
        if (TextUtils.isEmpty(this.url) || TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.savePath)) {
            return true;
        }
        return false;
    }

    public boolean isPauseReserveWithWifiValid() {
        if (!this.mDownloadFromReserveWifi) {
            return true;
        }
        if (!isPauseReserveOnWifi() || !C30535g.m62561a(C30399c.m61674B())) {
            return false;
        }
        return true;
    }

    public boolean isRwConcurrent() {
        ensureDBJsonData();
        if (this.dbJsonData.optInt("rw_concurrent", 0) == 1) {
            return true;
        }
        return false;
    }

    public void reset() {
        setCurBytes(0, true);
        this.totalBytes = 0;
        this.chunkCount = 1;
        this.downloadTime = 0;
        this.realStartDownloadTime = 0;
        this.realDownloadTime = 0;
    }

    public boolean statusInPause() {
        if (getRealStatus() == -2 || getRealStatus() == -5) {
            return true;
        }
        return false;
    }

    public void updateDownloadTime() {
        if (this.startDownloadTime != 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.startDownloadTime;
            if (this.downloadTime < 0) {
                this.downloadTime = 0;
            }
            if (uptimeMillis > 0) {
                this.downloadTime = uptimeMillis;
            }
        }
    }

    public void updateStartDownloadTime() {
        this.startDownloadTime = SystemClock.uptimeMillis();
        safePutToDBJsonData("dbjson_last_start_download_time", Long.valueOf(System.currentTimeMillis()));
    }

    public DownloadInfo() {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = EnumC30295i.DELAY_RETRY_NONE;
        this.asyncHandleStatus = EnumC30287a.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = EnumC30288b.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnumC30293g.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0);
        this.isAutoInstallWithoutNotification = null;
    }

    private void ensureSpData() {
        if (this.spData == null) {
            Context B = C30399c.m61674B();
            if (B != null) {
                String string = C34822d.m71158a(B, "sp_download_info", 0).getString(Long.toString((long) getId()), "");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        this.spData = new JSONObject(string);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (this.spData == null) {
                this.spData = new JSONObject();
            }
        }
    }

    private void ensureTempCacheData() {
        MethodCollector.m26663i(6214);
        if (this.tempCacheData == null) {
            synchronized (this) {
                try {
                    if (this.tempCacheData == null) {
                        this.tempCacheData = new ConcurrentHashMap<>();
                    }
                } finally {
                    MethodCollector.m26664o(6214);
                }
            }
            return;
        }
        MethodCollector.m26664o(6214);
    }

    private String getDBJsonDataString() {
        String jSONObject;
        MethodCollector.m26663i(12266);
        String str = this.dbJsonDataString;
        if (str != null) {
            MethodCollector.m26664o(12266);
            return str;
        }
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            try {
                jSONObject = this.dbJsonData.toString();
                this.dbJsonDataString = jSONObject;
            } finally {
                MethodCollector.m26664o(12266);
            }
        }
        return jSONObject;
    }

    private void putMonitorSetting() {
        safePutToDBJsonData("need_sdk_monitor", Boolean.valueOf(this.needSDKMonitor));
        safePutToDBJsonData("monitor_scene", this.monitorScene);
        try {
            JSONArray jSONArray = new JSONArray();
            int[] iArr = this.extraMonitorStatus;
            if (iArr != null && iArr.length > 0) {
                int i = 0;
                while (true) {
                    int[] iArr2 = this.extraMonitorStatus;
                    if (i >= iArr2.length) {
                        break;
                    }
                    jSONArray.put(iArr2[i]);
                    i++;
                }
            }
            safePutToDBJsonData("extra_monitor_status", jSONArray);
        } catch (Throwable unused) {
        }
    }

    public boolean canSkipStatusHandler() {
        int status2 = getStatus();
        if (status2 == 7 || this.retryDelayStatus == EnumC30295i.DELAY_RETRY_WAITING || status2 == 8 || this.asyncHandleStatus == EnumC30287a.ASYNC_HANDLE_WAITING || this.asyncHandleStatus == EnumC30287a.ASYNC_HANDLE_RESTART || this.byteInvalidRetryStatus == EnumC30288b.BYTE_INVALID_RETRY_STATUS_RESTART) {
            return true;
        }
        return false;
    }

    public void changeSkipStatus() {
        int status2 = getStatus();
        if (status2 == 7 || this.retryDelayStatus == EnumC30295i.DELAY_RETRY_WAITING) {
            setRetryDelayStatus(EnumC30295i.DELAY_RETRY_DOWNLOADING);
        }
        if (status2 == 8 || this.asyncHandleStatus == EnumC30287a.ASYNC_HANDLE_WAITING || this.asyncHandleStatus == EnumC30287a.ASYNC_HANDLE_RESTART) {
            setAsyncHandleStatus(EnumC30287a.ASYNC_HANDLE_DOWNLOADING);
        }
        if (this.byteInvalidRetryStatus == EnumC30288b.BYTE_INVALID_RETRY_STATUS_RESTART) {
            setByteInvalidRetryStatus(EnumC30288b.BYTE_INVALID_RETRY_STATUS_DOWNLOADING);
        }
    }

    public void clearSpData() {
        Context B = C30399c.m61674B();
        if (B != null) {
            try {
                C34822d.m71158a(B, "sp_download_info", 0).edit().remove(Integer.toString(getId())).apply();
            } catch (Throwable unused) {
            }
        }
    }

    public void erase() {
        setCurBytes(0, true);
        this.totalBytes = 0;
        this.chunkCount = 1;
        this.downloadTime = 0;
        this.realStartDownloadTime = 0;
        this.realDownloadTime = 0;
        this.curRetryTime = 0;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.backUpUrlUsed = false;
        this.httpsToHttpRetryUsed = false;
        this.eTag = null;
        this.failedException = null;
        this.tempCacheData = null;
        this.packageInfoRef = null;
    }

    public String getBackUpUrl() {
        List<String> list;
        int i;
        if (this.backUpUrlUsed && (list = this.backUpUrls) != null && list.size() > 0 && (i = this.curBackUpUrlIndex) >= 0 && i < this.backUpUrls.size()) {
            String str = this.backUpUrls.get(this.curBackUpUrlIndex);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public int getDownloadProcess() {
        if (this.totalBytes <= 0) {
            return 0;
        }
        if (getCurBytes() > this.totalBytes) {
            return 100;
        }
        return (int) ((getCurBytes() * 100) / this.totalBytes);
    }

    public double getDownloadSpeed() {
        double curBytes2 = (double) getCurBytes();
        Double.isNaN(curBytes2);
        double d = curBytes2 / 1048576.0d;
        double realDownloadTime2 = (double) getRealDownloadTime();
        Double.isNaN(realDownloadTime2);
        double d2 = realDownloadTime2 / 1000.0d;
        if (d <= 0.0d || d2 <= 0.0d) {
            return -1.0d;
        }
        return d / d2;
    }

    public String getTempFilePath() {
        String a;
        String str = this.savePath;
        String str2 = this.tempPath;
        String str3 = this.name;
        if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            a = C30535g.m62543a(str2, str3);
        } else {
            a = C30535g.m62543a(str, str3);
        }
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return C1764a.m5928a("%s.tp", new Object[]{a});
    }

    public boolean isAutoInstallWithoutNotification() {
        if (this.isAutoInstallWithoutNotification == null) {
            if (!TextUtils.isEmpty(this.extra)) {
                try {
                    this.isAutoInstallWithoutNotification = Boolean.valueOf(new JSONObject(this.extra).optBoolean("auto_install_without_notification", false));
                } catch (JSONException unused) {
                }
            }
            this.isAutoInstallWithoutNotification = false;
        }
        return this.isAutoInstallWithoutNotification.booleanValue();
    }

    public boolean isCanResumeFromBreakPointStatus() {
        int status2 = getStatus();
        if (status2 == 4 || status2 == 3 || status2 == -1 || status2 == 5 || status2 == 8 || ((status2 == 1 || status2 == 2) && getCurBytes() > 0)) {
            return true;
        }
        return false;
    }

    public boolean isExpiredRedownload() {
        if (C30472a.f72639a.mo54258a("force_close_download_cache_check", 0) != 1) {
            return this.expiredRedownload;
        }
        C30434a.m62029d("DownloaderLogger", "isExpiredRedownload force to false, reason(global setting) id=" + getId() + " name=" + getName());
        return false;
    }

    public boolean isFileDataExists() {
        if (isEntityInvalid()) {
            return false;
        }
        File file = new File(getTempPath(), getTempName());
        boolean exists = file.exists();
        boolean isDirectory = file.isDirectory();
        if (!exists || isDirectory) {
            return false;
        }
        return true;
    }

    public boolean isFirstDownload() {
        if (this.isFirstDownload && !TextUtils.isEmpty(getTempPath()) && !TextUtils.isEmpty(getTempName()) && !new File(getTempPath(), getTempName()).exists()) {
            return true;
        }
        return false;
    }

    public boolean trySwitchToNextBackupUrl() {
        if (this.backUpUrlUsed) {
            this.curBackUpUrlIndex++;
        }
        List<String> list = this.backUpUrls;
        if (!(list == null || list.size() == 0 || this.curBackUpUrlIndex < 0)) {
            while (this.curBackUpUrlIndex < this.backUpUrls.size()) {
                if (!TextUtils.isEmpty(this.backUpUrls.get(this.curBackUpUrlIndex))) {
                    this.backUpUrlUsed = true;
                    return true;
                }
                this.curBackUpUrlIndex++;
            }
        }
        return false;
    }

    public void updateSpData() {
        Context B;
        if (this.spData != null && (B = C30399c.m61674B()) != null) {
            C34822d.m71158a(B, "sp_download_info", 0).edit().putString(Integer.toString(getId()), this.spData.toString()).apply();
        }
    }

    private void ensureDBJsonData() {
        MethodCollector.m26663i(12399);
        if (this.dbJsonData == null) {
            synchronized (this) {
                try {
                    if (this.dbJsonData == null) {
                        try {
                            if (!TextUtils.isEmpty(this.dbJsonDataString)) {
                                this.dbJsonData = new JSONObject(this.dbJsonDataString);
                                this.dbJsonDataString = null;
                            } else {
                                this.dbJsonData = new JSONObject();
                            }
                        } catch (Throwable unused) {
                            this.dbJsonData = new JSONObject();
                        }
                    }
                } finally {
                    MethodCollector.m26664o(12399);
                }
            }
            return;
        }
        MethodCollector.m26664o(12399);
    }

    private String getBackUpUrlsStr() {
        List<String> list;
        if (this.backUpUrlsStr == null && (list = this.backUpUrls) != null && !list.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.backUpUrls) {
                    if (!TextUtils.isEmpty(str)) {
                        jSONArray.put(str);
                    }
                }
                this.backUpUrlsStr = jSONArray.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.backUpUrlsStr == null) {
            this.backUpUrlsStr = "";
        }
        return this.backUpUrlsStr;
    }

    private void parseMonitorSetting() {
        ensureDBJsonData();
        this.needSDKMonitor = this.dbJsonData.optBoolean("need_sdk_monitor", false);
        this.monitorScene = this.dbJsonData.optString("monitor_scene", "");
        JSONArray optJSONArray = this.dbJsonData.optJSONArray("extra_monitor_status");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.extraMonitorStatus = new int[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.extraMonitorStatus[i] = optJSONArray.optInt(i);
            }
        }
    }

    public String getConnectionUrl() {
        List<String> list;
        int i;
        List<String> list2;
        String str = this.url;
        if (getStatus() == 8 && (list2 = this.forbiddenBackupUrls) != null && !list2.isEmpty() && !this.backUpUrlUsed) {
            return this.forbiddenBackupUrls.get(0);
        }
        if (this.backUpUrlUsed && (list = this.backUpUrls) != null && list.size() > 0 && (i = this.curBackUpUrlIndex) >= 0 && i < this.backUpUrls.size()) {
            String str2 = this.backUpUrls.get(this.curBackUpUrlIndex);
            return !TextUtils.isEmpty(str2) ? str2 : str;
        } else if (TextUtils.isEmpty(this.url) || !this.url.startsWith("https") || !this.needHttpsToHttpRetry || !this.httpsToHttpRetryUsed) {
            return str;
        } else {
            return this.url.replaceFirst("https", "http");
        }
    }

    public boolean isChunkBreakpointAvailable() {
        AbstractC30420l q;
        if (this.chunkCount > 1 && (q = C30399c.m61733q()) != null) {
            List<DownloadChunk> c = q.mo53785c(getId());
            if (c == null || c.size() != this.chunkCount) {
                return false;
            }
            long j = 0;
            for (DownloadChunk downloadChunk : c) {
                if (downloadChunk != null) {
                    j += downloadChunk.mo54412j();
                }
            }
            if (j != getCurBytes()) {
                setCurBytes(j);
            }
        }
        return true;
    }

    public String toString() {
        return "DownloadInfo{id=" + this.f72934id + ", name='" + this.name + '\'' + ", title='" + this.title + '\'' + ", url='" + this.url + '\'' + ", savePath='" + this.savePath + '\'' + '}';
    }

    public boolean isFileDataValid() {
        if (isEntityInvalid()) {
            return false;
        }
        File file = new File(getTempPath(), getTempName());
        boolean exists = file.exists();
        boolean isDirectory = file.isDirectory();
        if (exists && !isDirectory) {
            long length = file.length();
            long curBytes2 = getCurBytes();
            if (C30472a.f72639a.mo54262a("fix_file_data_valid", false)) {
                if (curBytes2 > 0) {
                    long j = this.totalBytes;
                    if (j > 0 && this.chunkCount > 0 && length >= curBytes2 && length <= j) {
                        return true;
                    }
                }
                C30434a.m62029d("DownloadInfo", "isFileDataValid: cur = " + curBytes2 + ",totalBytes =" + this.totalBytes + ",fileLength=" + length);
                return false;
            }
            if (length > 0 && curBytes2 > 0) {
                long j2 = this.totalBytes;
                if (j2 > 0 && this.chunkCount > 0 && length >= curBytes2 && length <= j2 && curBytes2 < j2) {
                    return true;
                }
            }
            C30434a.m62029d("DownloadInfo", "isFileDataValid: cur = " + curBytes2 + ",totalBytes =" + this.totalBytes + ",fileLength=" + length);
        }
        return false;
    }

    public ContentValues toContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(this.f72934id));
        contentValues.put("url", this.url);
        contentValues.put("savePath", this.savePath);
        contentValues.put("tempPath", this.tempPath);
        contentValues.put(StringSet.name, this.name);
        contentValues.put("chunkCount", Integer.valueOf(this.chunkCount));
        contentValues.put("status", Integer.valueOf(getStatus()));
        contentValues.put("curBytes", Long.valueOf(getCurBytes()));
        contentValues.put("totalBytes", Long.valueOf(this.totalBytes));
        contentValues.put("eTag", this.eTag);
        contentValues.put("onlyWifi", Integer.valueOf(this.onlyWifi ? 1 : 0));
        contentValues.put("force", Integer.valueOf(this.force ? 1 : 0));
        contentValues.put("retryCount", Integer.valueOf(this.retryCount));
        contentValues.put("extra", this.extra);
        contentValues.put("mimeType", this.mimeType);
        contentValues.put("title", this.title);
        contentValues.put("notificationEnable", Integer.valueOf(this.showNotification ? 1 : 0));
        contentValues.put("notificationVisibility", Integer.valueOf(this.notificationVisibility));
        contentValues.put("isFirstDownload", Integer.valueOf(this.isFirstDownload ? 1 : 0));
        contentValues.put("isFirstSuccess", Integer.valueOf(this.isFirstSuccess ? 1 : 0));
        contentValues.put("needHttpsToHttpRetry", Integer.valueOf(this.needHttpsToHttpRetry ? 1 : 0));
        contentValues.put("downloadTime", Long.valueOf(this.downloadTime));
        contentValues.put("packageName", this.packageName);
        contentValues.put("md5", this.md5);
        contentValues.put("retryDelay", Integer.valueOf(this.needRetryDelay ? 1 : 0));
        contentValues.put("curRetryTime", Integer.valueOf(this.curRetryTime));
        contentValues.put("retryDelayStatus", Integer.valueOf(this.retryDelayStatus.ordinal()));
        contentValues.put("defaultHttpServiceBackUp", Integer.valueOf(this.needDefaultHttpServiceBackUp ? 1 : 0));
        contentValues.put("chunkRunnableReuse", Integer.valueOf(this.needReuseChunkRunnable ? 1 : 0));
        contentValues.put("retryDelayTimeArray", this.retryDelayTimeArray);
        contentValues.put("chunkDowngradeRetry", Integer.valueOf(this.needChunkDowngradeRetry ? 1 : 0));
        contentValues.put("backUpUrlsStr", getBackUpUrlsStr());
        contentValues.put("backUpUrlRetryCount", Integer.valueOf(this.backUpUrlRetryCount));
        contentValues.put("realDownloadTime", Long.valueOf(this.realDownloadTime));
        contentValues.put("retryScheduleMinutes", Integer.valueOf(this.retryScheduleMinutes));
        contentValues.put("independentProcess", Integer.valueOf(this.needIndependentProcess ? 1 : 0));
        contentValues.put("auxiliaryJsonobjectString", getDBJsonDataString());
        contentValues.put("iconUrl", this.iconUrl);
        contentValues.put("appVersionCode", Integer.valueOf(this.appVersionCode));
        contentValues.put("taskId", this.taskId);
        return contentValues;
    }

    public void setAddListenerToSameTask(boolean z) {
        this.addListenerToSameTask = z;
    }

    public void setAppVersionCode(int i) {
        this.appVersionCode = i;
    }

    public void setAsyncHandleStatus(EnumC30287a aVar) {
        this.asyncHandleStatus = aVar;
    }

    public void setAutoResumed(boolean z) {
        this.autoResumed = z;
    }

    public void setByteInvalidRetryStatus(EnumC30288b bVar) {
        this.byteInvalidRetryStatus = bVar;
    }

    public void setChunkCount(int i) {
        this.chunkCount = i;
    }

    public void setChunkDowngradeRetryUsed(boolean z) {
        this.chunkDowngradeRetryUsed = z;
    }

    public void setDownloadFromReserveWifi(boolean z) {
        this.mDownloadFromReserveWifi = z;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFailedException(BaseException baseException) {
        this.failedException = baseException;
    }

    public void setFilePackageName(String str) {
        this.filePackageName = str;
    }

    public void setFirstDownload(boolean z) {
        this.isFirstDownload = z;
    }

    public void setFirstSuccess(boolean z) {
        this.isFirstSuccess = z;
    }

    public void setForceIgnoreRecommendSize(boolean z) {
        this.forceIgnoreRecommendSize = z;
    }

    public void setHeadConnectionException(String str) {
        this.headConnectionException = str;
    }

    public void setHttpStatusCode(int i) {
        this.httpStatusCode = i;
    }

    public void setHttpStatusMessage(String str) {
        this.httpStatusMessage = str;
    }

    public void setHttpsToHttpRetryUsed(boolean z) {
        this.httpsToHttpRetryUsed = z;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setId(int i) {
        this.f72934id = i;
    }

    public void setIsSaveTempFile(boolean z) {
        this.isSaveTempFile = z;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNetworkQuality(String str) {
        this.networkQuality = str;
    }

    public void setNotificationVisibility(int i) {
        this.notificationVisibility = i;
    }

    public void setOnlyWifi(boolean z) {
        this.onlyWifi = z;
    }

    public void setOpenLimitSpeed(boolean z) {
        this.openLimitSpeed = z;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setRetryDelayStatus(EnumC30295i iVar) {
        this.retryDelayStatus = iVar;
    }

    public void setSavePath(String str) {
        this.savePath = str;
    }

    public void setShowNotification(boolean z) {
        this.showNotification = z;
    }

    public void setShowNotificationForAutoResumed(boolean z) {
        this.showNotificationForAutoResumed = z;
    }

    public void setShowNotificationForNetworkResumed(boolean z) {
        this.showNotificationForNetworkResumed = z;
    }

    public void setStatusAtDbInit(int i) {
        this.statusAtDbInit = i;
    }

    public void setSuccessByCache(boolean z) {
        this.successByCache = z;
    }

    public void setSupportPartial(boolean z) {
        this.supportPartial = z;
    }

    public void setThrottleNetSpeed(long j) {
        this.throttleNetSpeed = j;
    }

    public void setTotalBytes(long j) {
        this.totalBytes = j;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void seteTag(String str) {
        this.eTag = str;
    }

    public void increaseCurBytes(long j) {
        this.curBytes.addAndGet(j);
    }

    public void setPackageInfo(PackageInfo packageInfo) {
        this.packageInfoRef = new SoftReference<>(packageInfo);
    }

    private JSONObject convertStrToJson(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return new JSONObject(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void copyTaskIdFromCacheData(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            this.taskId = downloadInfo.getTaskId();
        }
    }

    public int getAntiHijackErrorCode(int i) {
        ensureDBJsonData();
        return this.dbJsonData.optInt("anti_hijack_error_code", i);
    }

    public int getDBJsonInt(String str) {
        ensureDBJsonData();
        return this.dbJsonData.optInt(str);
    }

    public String getDBJsonString(String str) {
        ensureDBJsonData();
        return this.dbJsonData.optString(str);
    }

    public int getSpIntVal(String str) {
        ensureSpData();
        return this.spData.optInt(str, 0);
    }

    public long getSpLongVal(String str) {
        ensureSpData();
        return this.spData.optLong(str, 0);
    }

    public String getSpStringVal(String str) {
        ensureSpData();
        return this.spData.optString(str, null);
    }

    public void setAntiHijackErrorCode(int i) {
        safePutToDBJsonData("anti_hijack_error_code", Integer.valueOf(i));
    }

    public void setCacheControl(String str) {
        ensureSpData();
        try {
            this.spData.put("cache-control", str);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public void setCacheExpiredTime(long j) {
        ensureSpData();
        try {
            this.spData.put("cache-control/expired_time", j);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public void setCurBytes(long j) {
        AtomicLong atomicLong = this.curBytes;
        if (atomicLong != null) {
            atomicLong.set(j);
        } else {
            this.curBytes = new AtomicLong(j);
        }
    }

    public void setDownloadTime(long j) {
        if (j >= 0) {
            this.downloadTime = j;
        }
    }

    public void setFailedResumeCount(int i) {
        ensureSpData();
        try {
            this.spData.put("failed_resume_count", i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setFirstSpeedTime(long j) {
        safePutToDBJsonData("dbjson_key_first_speed_time", Long.valueOf(j));
    }

    public void setIsRwConcurrent(boolean z) {
        safePutToDBJsonData("rw_concurrent", Integer.valueOf(z ? 1 : 0));
    }

    public void setLastFailedResumeTime(long j) {
        ensureSpData();
        try {
            this.spData.put("last_failed_resume_time", j);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setLastModified(String str) {
        ensureSpData();
        try {
            this.spData.put("last-modified", str);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public void setLastUninstallResumeTime(long j) {
        ensureSpData();
        try {
            this.spData.put("last_unins_resume_time", j);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setLinkMode(int i) {
        safePutToDBJsonData("link_mode", Integer.valueOf(i));
    }

    public void setPausedResumeCount(int i) {
        ensureSpData();
        try {
            this.spData.put("paused_resume_count", i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setPreconnectLevel(int i) {
        ensureDBJsonData();
        safePutToDBJsonData("dbjson_key_preconnect_level", Integer.valueOf(i));
    }

    public void setRetryScheduleCount(int i) {
        safePutToDBJsonData("retry_schedule_count", Integer.valueOf(i));
    }

    public void setSavePathRedirected(boolean z) {
        safePutToDBJsonData("is_save_path_redirected", Boolean.valueOf(z));
    }

    public void setStatus(int i) {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger != null) {
            atomicInteger.set(i);
        } else {
            this.status = new AtomicInteger(i);
        }
    }

    public void setTTMd5CheckStatus(int i) {
        safePutToDBJsonData("ttmd5_check_status", Integer.valueOf(i));
    }

    public void setUninstallResumeCount(int i) {
        ensureSpData();
        try {
            this.spData.put("unins_resume_count", i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void convertEnqueueType(int i) {
        if (i == EnumC30293g.ENQUEUE_HEAD.ordinal()) {
            this.enqueueType = EnumC30293g.ENQUEUE_HEAD;
        } else if (i == EnumC30293g.ENQUEUE_TAIL.ordinal()) {
            this.enqueueType = EnumC30293g.ENQUEUE_TAIL;
        } else {
            this.enqueueType = EnumC30293g.ENQUEUE_NONE;
        }
    }

    public long getMinByteIntervalForPostToMainThread(long j) {
        int i = this.maxProgressCount;
        if (i <= 0) {
            i = 100;
        }
        long j2 = j / ((long) (i + 1));
        if (j2 <= 0) {
            return 1048576;
        }
        return j2;
    }

    public void increaseAllConnectTime(long j) {
        if (j > 0) {
            getAllConnectTime();
            safePutToDBJsonData("dbjson_key_all_connect_time", Long.valueOf(this.allConnectTime.addAndGet(j)));
        }
    }

    public void increaseDownloadPrepareTime(long j) {
        if (j > 0) {
            safePutToDBJsonData("dbjson_key_download_prepare_time", Long.valueOf(getDownloadPrepareTime() + j));
        }
    }

    public void resetDataForEtagEndure(String str) {
        setCurBytes(0, true);
        setTotalBytes(0);
        seteTag(str);
        setChunkCount(1);
        this.downloadTime = 0;
        this.realStartDownloadTime = 0;
        this.realDownloadTime = 0;
    }

    public void updateCurRetryTime(int i) {
        int i2;
        if (this.backUpUrlUsed) {
            i2 = this.backUpUrlRetryCount;
        } else {
            i2 = this.retryCount;
        }
        int i3 = i2 - i;
        this.curRetryTime = i3;
        if (i3 < 0) {
            this.curRetryTime = 0;
        }
    }

    private void convertRetryDelayStatus(int i) {
        if (i == EnumC30295i.DELAY_RETRY_WAITING.ordinal()) {
            this.retryDelayStatus = EnumC30295i.DELAY_RETRY_WAITING;
        } else if (i == EnumC30295i.DELAY_RETRY_DOWNLOADING.ordinal()) {
            this.retryDelayStatus = EnumC30295i.DELAY_RETRY_DOWNLOADING;
        } else if (i == EnumC30295i.DELAY_RETRY_DOWNLOADED.ordinal()) {
            this.retryDelayStatus = EnumC30295i.DELAY_RETRY_DOWNLOADED;
        } else {
            this.retryDelayStatus = EnumC30295i.DELAY_RETRY_NONE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    private void refreshBackupUrls(boolean z) {
        List<String> list = this.forbiddenBackupUrls;
        if (list != null && list.size() > z) {
            List<String> list2 = this.backUpUrls;
            if (list2 == null) {
                this.backUpUrls = new ArrayList();
            } else {
                list2.clear();
            }
            this.backUpUrlUsed = false;
            this.curBackUpUrlIndex = 0;
            int i = z;
            while (i < this.forbiddenBackupUrls.size()) {
                this.backUpUrls.add(this.forbiddenBackupUrls.get(i == 1 ? 1 : 0));
                i++;
            }
        }
    }

    private void setBackUpUrlsStr(String str) {
        if (!TextUtils.isEmpty(str) && getStatus() != -3) {
            this.backUpUrlsStr = str;
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String optString = jSONArray.optString(i);
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList.add(optString);
                        }
                    }
                    this.backUpUrls = arrayList;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean equalsTask(DownloadInfo downloadInfo) {
        String str;
        String str2;
        if (downloadInfo == null || (str = this.url) == null || !str.equals(downloadInfo.getUrl()) || (str2 = this.savePath) == null || !str2.equals(downloadInfo.getSavePath())) {
            return false;
        }
        return true;
    }

    public void updateRealDownloadTime(boolean z) {
        long nanoTime = System.nanoTime();
        long j = this.realStartDownloadTime;
        if (j > 0) {
            long j2 = nanoTime - j;
            if (z) {
                this.realStartDownloadTime = nanoTime;
            } else {
                this.realStartDownloadTime = 0;
            }
            if (j2 > 0) {
                this.realDownloadTime += j2;
            }
        } else if (z) {
            this.realStartDownloadTime = nanoTime;
        }
    }

    protected DownloadInfo(Parcel parcel) {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = EnumC30295i.DELAY_RETRY_NONE;
        this.asyncHandleStatus = EnumC30287a.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = EnumC30288b.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnumC30293g.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0);
        this.isAutoInstallWithoutNotification = null;
        readFromParcel(parcel);
    }

    private void mergeAuxiliaryJSONObject(JSONObject jSONObject) {
        MethodCollector.m26663i(12522);
        if (jSONObject == null) {
            MethodCollector.m26664o(12522);
            return;
        }
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = jSONObject.opt(next);
                    if (!this.dbJsonData.has(next) && opt != null) {
                        this.dbJsonData.put(next, opt);
                    }
                }
            } catch (Exception unused) {
            }
            try {
                this.dbJsonDataString = null;
            } catch (Throwable th) {
                MethodCollector.m26664o(12522);
                throw th;
            }
        }
        parseMonitorSetting();
        MethodCollector.m26664o(12522);
    }

    public synchronized void registerTempFileSaveCallback(AbstractC30341ae aeVar) {
        MethodCollector.m26663i(12525);
        if (aeVar == null) {
            MethodCollector.m26664o(12525);
            return;
        }
        try {
            C30434a.m62027b("DownloadInfo", "registerTempFileSaveCallback");
            if (this.tempFileSaveCompleteCallbacks == null) {
                this.tempFileSaveCompleteCallbacks = new ArrayList();
            }
            if (!this.tempFileSaveCompleteCallbacks.contains(aeVar)) {
                this.tempFileSaveCompleteCallbacks.add(aeVar);
            }
            MethodCollector.m26664o(12525);
        } catch (Throwable th) {
            aeVar.mo53872a(new BaseException(1038, C30535g.m62576b(th, "registerTempFileSaveCallback")));
            MethodCollector.m26664o(12525);
        }
    }

    private DownloadInfo(C30585a aVar) {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = EnumC30295i.DELAY_RETRY_NONE;
        this.asyncHandleStatus = EnumC30287a.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = EnumC30288b.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnumC30293g.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0);
        this.isAutoInstallWithoutNotification = null;
        if (aVar != null) {
            this.name = aVar.f72961a;
            this.title = aVar.f72962b;
            this.url = aVar.f72963c;
            String str = aVar.f72964d;
            if (TextUtils.isEmpty(str)) {
                try {
                    str = C30535g.m62540a(Downloader.getInstance(C30399c.m61674B()).getGlobalSaveDir(), true);
                } catch (Throwable unused) {
                }
            }
            this.savePath = str;
            String str2 = aVar.f72965e;
            this.tempPath = str2;
            if (TextUtils.isEmpty(str2) && !C30535g.m62605e(str)) {
                this.tempPath = C30535g.m62540a(Downloader.getInstance(C30399c.m61674B()).getGlobalSaveTempDir(), false);
            }
            if (!aVar.f72959Y) {
                C30434a.m62030e("DownloadInfo", "The distinct directory option is not set, which may cause 1005 problems and file downloads being covered");
            } else if (C30399c.m61733q().mo53777b(getId()) == null) {
                this.savePath = C30535g.m62591c(this.savePath, this.url);
                this.tempPath = C30535g.m62591c(this.tempPath, this.url);
            }
            this.status = new AtomicInteger(0);
            this.curBytes = new AtomicLong(0);
            this.extra = aVar.f72967g;
            this.onlyWifi = aVar.f72966f;
            this.extraHeaders = aVar.f72968h;
            this.maxBytes = aVar.f72969i;
            this.retryCount = aVar.f72972l;
            this.backUpUrlRetryCount = aVar.f72973m;
            this.force = aVar.f72974n;
            this.outIp = aVar.f72970j;
            this.outSize = aVar.f72971k;
            this.needPostProgress = aVar.f72975o;
            this.maxProgressCount = aVar.f72976p;
            this.minProgressTimeMsInterval = aVar.f72977q;
            this.backUpUrls = aVar.f72978r;
            this.showNotification = aVar.f72979s;
            this.mimeType = aVar.f72981u;
            this.needHttpsToHttpRetry = aVar.f72982v;
            this.needRetryDelay = aVar.f72938D;
            this.retryDelayTimeArray = aVar.f72939E;
            this.autoResumed = aVar.f72983w;
            this.showNotificationForAutoResumed = aVar.f72984x;
            this.needDefaultHttpServiceBackUp = aVar.f72985y;
            this.needReuseChunkRunnable = aVar.f72986z;
            this.packageName = aVar.f72935A;
            this.md5 = aVar.f72936B;
            this.needReuseFirstConnection = aVar.f72940F;
            this.needIndependentProcess = aVar.f72941G;
            this.enqueueType = aVar.f72942H;
            this.headConnectionAvailable = aVar.f72943I;
            this.ignoreDataVerify = aVar.f72944J;
            this.addListenerToSameTask = aVar.f72949O;
            this.needChunkDowngradeRetry = aVar.f72945K;
            this.iconUrl = aVar.f72946L;
            this.throttleNetSpeed = aVar.f72947M;
            this.openLimitSpeed = aVar.f72948N;
            JSONObject jSONObject = aVar.f72950P;
            if (jSONObject != null) {
                safePutToDBJsonData("download_setting", jSONObject.toString());
            }
            safePutToDBJsonData("dbjson_key_expect_file_length", Long.valueOf(aVar.f72937C));
            safePutToDBJsonData("executor_group", Integer.valueOf(aVar.f72954T));
            safePutToDBJsonData("auto_install", Integer.valueOf(aVar.f72980t ? 1 : 0));
            this.needSDKMonitor = aVar.f72951Q;
            this.monitorScene = aVar.f72952R;
            this.extraMonitorStatus = aVar.f72953S;
            this.expiredRedownload = aVar.f72955U;
            this.deleteCacheIfCheckFailed = aVar.f72956V;
            this.ttnetProtectTimeout = aVar.f72957W;
            this.addTTNetCommonParam = aVar.f72958X;
            this.distinctDirectory = aVar.f72959Y;
            if (this.expiredRedownload && this.retryCount <= 0) {
                this.retryCount = 1;
            }
            safePutToDBJsonData("task_key", aVar.f72960Z);
            putMonitorSetting();
        }
    }

    public DownloadInfo(Cursor cursor) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11 = true;
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = EnumC30295i.DELAY_RETRY_NONE;
        this.asyncHandleStatus = EnumC30287a.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = EnumC30288b.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnumC30293g.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0);
        this.isAutoInstallWithoutNotification = null;
        if (cursor != null) {
            try {
                int columnIndex = cursor.getColumnIndex("_id");
                if (columnIndex != -1) {
                    this.f72934id = cursor.getInt(columnIndex);
                }
                int columnIndex2 = cursor.getColumnIndex(StringSet.name);
                if (columnIndex2 != -1) {
                    this.name = cursor.getString(columnIndex2);
                }
                int columnIndex3 = cursor.getColumnIndex("title");
                if (columnIndex3 != -1) {
                    this.title = cursor.getString(columnIndex3);
                }
                int columnIndex4 = cursor.getColumnIndex("url");
                if (columnIndex4 != -1) {
                    this.url = cursor.getString(columnIndex4);
                }
                int columnIndex5 = cursor.getColumnIndex("savePath");
                if (columnIndex5 != -1) {
                    this.savePath = cursor.getString(columnIndex5);
                }
                int columnIndex6 = cursor.getColumnIndex("tempPath");
                if (columnIndex6 != -1) {
                    this.tempPath = cursor.getString(columnIndex6);
                }
                int columnIndex7 = cursor.getColumnIndex("chunkCount");
                if (columnIndex7 != -1) {
                    this.chunkCount = cursor.getInt(columnIndex7);
                }
                int columnIndex8 = cursor.getColumnIndex("status");
                if (columnIndex8 != -1) {
                    this.status = new AtomicInteger(cursor.getInt(columnIndex8));
                } else {
                    this.status = new AtomicInteger(0);
                }
                int columnIndex9 = cursor.getColumnIndex("curBytes");
                if (columnIndex9 != -1) {
                    this.curBytes = new AtomicLong(cursor.getLong(columnIndex9));
                } else {
                    this.curBytes = new AtomicLong(0);
                }
                int columnIndex10 = cursor.getColumnIndex("totalBytes");
                if (columnIndex10 != -1) {
                    this.totalBytes = cursor.getLong(columnIndex10);
                }
                int columnIndex11 = cursor.getColumnIndex("eTag");
                if (columnIndex11 != -1) {
                    this.eTag = cursor.getString(columnIndex11);
                }
                int columnIndex12 = cursor.getColumnIndex("onlyWifi");
                if (columnIndex12 != -1) {
                    if (cursor.getInt(columnIndex12) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.onlyWifi = z10;
                }
                int columnIndex13 = cursor.getColumnIndex("force");
                if (columnIndex13 != -1) {
                    if (cursor.getInt(columnIndex13) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    this.force = z9;
                }
                int columnIndex14 = cursor.getColumnIndex("retryCount");
                if (columnIndex14 != -1) {
                    this.retryCount = cursor.getInt(columnIndex14);
                }
                int columnIndex15 = cursor.getColumnIndex("extra");
                if (columnIndex15 != -1) {
                    this.extra = cursor.getString(columnIndex15);
                }
                int columnIndex16 = cursor.getColumnIndex("mimeType");
                if (columnIndex16 != -1) {
                    this.mimeType = cursor.getString(columnIndex16);
                }
                int columnIndex17 = cursor.getColumnIndex("notificationEnable");
                if (columnIndex17 != -1) {
                    if (cursor.getInt(columnIndex17) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    this.showNotification = z8;
                }
                int columnIndex18 = cursor.getColumnIndex("notificationVisibility");
                if (columnIndex18 != -1) {
                    this.notificationVisibility = cursor.getInt(columnIndex18);
                }
                int columnIndex19 = cursor.getColumnIndex("isFirstDownload");
                if (columnIndex19 != -1) {
                    if (cursor.getInt(columnIndex19) == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    this.isFirstDownload = z7;
                }
                int columnIndex20 = cursor.getColumnIndex("isFirstSuccess");
                if (columnIndex20 != -1) {
                    if (cursor.getInt(columnIndex20) == 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    this.isFirstSuccess = z6;
                }
                int columnIndex21 = cursor.getColumnIndex("needHttpsToHttpRetry");
                if (columnIndex21 != -1) {
                    if (cursor.getInt(columnIndex21) == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    this.needHttpsToHttpRetry = z5;
                }
                int columnIndex22 = cursor.getColumnIndex("downloadTime");
                if (columnIndex22 != -1) {
                    this.downloadTime = cursor.getLong(columnIndex22);
                }
                int columnIndex23 = cursor.getColumnIndex("packageName");
                if (columnIndex23 != -1) {
                    this.packageName = cursor.getString(columnIndex23);
                }
                int columnIndex24 = cursor.getColumnIndex("md5");
                if (columnIndex24 != -1) {
                    this.md5 = cursor.getString(columnIndex24);
                }
                int columnIndex25 = cursor.getColumnIndex("retryDelay");
                if (columnIndex25 != -1) {
                    if (cursor.getInt(columnIndex25) == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.needRetryDelay = z4;
                }
                int columnIndex26 = cursor.getColumnIndex("curRetryTime");
                if (columnIndex26 != -1) {
                    this.curRetryTime = cursor.getInt(columnIndex26);
                }
                int columnIndex27 = cursor.getColumnIndex("retryDelayStatus");
                if (columnIndex27 != -1) {
                    int i = cursor.getInt(columnIndex27);
                    if (i == EnumC30295i.DELAY_RETRY_WAITING.ordinal()) {
                        this.retryDelayStatus = EnumC30295i.DELAY_RETRY_WAITING;
                    } else if (i == EnumC30295i.DELAY_RETRY_DOWNLOADING.ordinal()) {
                        this.retryDelayStatus = EnumC30295i.DELAY_RETRY_DOWNLOADING;
                    } else if (i == EnumC30295i.DELAY_RETRY_DOWNLOADED.ordinal()) {
                        this.retryDelayStatus = EnumC30295i.DELAY_RETRY_DOWNLOADED;
                    } else {
                        this.retryDelayStatus = EnumC30295i.DELAY_RETRY_NONE;
                    }
                }
                int columnIndex28 = cursor.getColumnIndex("defaultHttpServiceBackUp");
                if (columnIndex28 != -1) {
                    if (cursor.getInt(columnIndex28) == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.needDefaultHttpServiceBackUp = z3;
                }
                int columnIndex29 = cursor.getColumnIndex("chunkRunnableReuse");
                if (columnIndex29 != -1) {
                    if (cursor.getInt(columnIndex29) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.needReuseChunkRunnable = z2;
                }
                int columnIndex30 = cursor.getColumnIndex("retryDelayTimeArray");
                if (columnIndex30 != -1) {
                    this.retryDelayTimeArray = cursor.getString(columnIndex30);
                }
                int columnIndex31 = cursor.getColumnIndex("chunkDowngradeRetry");
                if (columnIndex31 != -1) {
                    if (cursor.getInt(columnIndex31) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.needChunkDowngradeRetry = z;
                }
                int columnIndex32 = cursor.getColumnIndex("backUpUrlsStr");
                if (columnIndex32 != -1) {
                    setBackUpUrlsStr(cursor.getString(columnIndex32));
                }
                int columnIndex33 = cursor.getColumnIndex("backUpUrlRetryCount");
                if (columnIndex33 != -1) {
                    this.backUpUrlRetryCount = cursor.getInt(columnIndex33);
                }
                int columnIndex34 = cursor.getColumnIndex("realDownloadTime");
                if (columnIndex34 != -1) {
                    this.realDownloadTime = cursor.getLong(columnIndex34);
                }
                int columnIndex35 = cursor.getColumnIndex("retryScheduleMinutes");
                if (columnIndex35 != -1) {
                    this.retryScheduleMinutes = cursor.getInt(columnIndex35);
                }
                int columnIndex36 = cursor.getColumnIndex("independentProcess");
                if (columnIndex36 != -1) {
                    this.needIndependentProcess = cursor.getInt(columnIndex36) != 1 ? false : z11;
                }
                int columnIndex37 = cursor.getColumnIndex("auxiliaryJsonobjectString");
                if (columnIndex37 != -1) {
                    this.dbJsonDataString = cursor.getString(columnIndex37);
                }
                int columnIndex38 = cursor.getColumnIndex("iconUrl");
                if (columnIndex38 != -1) {
                    this.iconUrl = cursor.getString(columnIndex38);
                }
                int columnIndex39 = cursor.getColumnIndex("appVersionCode");
                if (columnIndex39 != -1) {
                    this.appVersionCode = cursor.getInt(columnIndex39);
                }
                int columnIndex40 = cursor.getColumnIndex("taskId");
                if (columnIndex40 != -1) {
                    this.taskId = cursor.getString(columnIndex40);
                }
                parseMonitorSetting();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void bindValue(SQLiteStatement sQLiteStatement) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        if (sQLiteStatement != null) {
            this.bindValueCount = 0;
            sQLiteStatement.clearBindings();
            int i = this.bindValueCount + 1;
            this.bindValueCount = i;
            sQLiteStatement.bindLong(i, (long) this.f72934id);
            int i2 = this.bindValueCount + 1;
            this.bindValueCount = i2;
            String str = this.url;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            sQLiteStatement.bindString(i2, str);
            int i3 = this.bindValueCount + 1;
            this.bindValueCount = i3;
            String str3 = this.savePath;
            if (str3 == null) {
                str3 = str2;
            }
            sQLiteStatement.bindString(i3, str3);
            int i4 = this.bindValueCount + 1;
            this.bindValueCount = i4;
            String str4 = this.tempPath;
            if (str4 == null) {
                str4 = str2;
            }
            sQLiteStatement.bindString(i4, str4);
            int i5 = this.bindValueCount + 1;
            this.bindValueCount = i5;
            String str5 = this.name;
            if (str5 == null) {
                str5 = str2;
            }
            sQLiteStatement.bindString(i5, str5);
            int i6 = this.bindValueCount + 1;
            this.bindValueCount = i6;
            sQLiteStatement.bindLong(i6, (long) this.chunkCount);
            int i7 = this.bindValueCount + 1;
            this.bindValueCount = i7;
            sQLiteStatement.bindLong(i7, (long) getStatus());
            int i8 = this.bindValueCount + 1;
            this.bindValueCount = i8;
            sQLiteStatement.bindLong(i8, getCurBytes());
            int i9 = this.bindValueCount + 1;
            this.bindValueCount = i9;
            sQLiteStatement.bindLong(i9, this.totalBytes);
            int i10 = this.bindValueCount + 1;
            this.bindValueCount = i10;
            String str6 = this.eTag;
            if (str6 == null) {
                str6 = str2;
            }
            sQLiteStatement.bindString(i10, str6);
            int i11 = this.bindValueCount + 1;
            this.bindValueCount = i11;
            long j11 = 1;
            if (this.onlyWifi) {
                j = 1;
            } else {
                j = 0;
            }
            sQLiteStatement.bindLong(i11, j);
            int i12 = this.bindValueCount + 1;
            this.bindValueCount = i12;
            if (this.force) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            sQLiteStatement.bindLong(i12, j2);
            int i13 = this.bindValueCount + 1;
            this.bindValueCount = i13;
            sQLiteStatement.bindLong(i13, (long) this.retryCount);
            int i14 = this.bindValueCount + 1;
            this.bindValueCount = i14;
            String str7 = this.extra;
            if (str7 == null) {
                str7 = str2;
            }
            sQLiteStatement.bindString(i14, str7);
            int i15 = this.bindValueCount + 1;
            this.bindValueCount = i15;
            String str8 = this.mimeType;
            if (str8 == null) {
                str8 = str2;
            }
            sQLiteStatement.bindString(i15, str8);
            int i16 = this.bindValueCount + 1;
            this.bindValueCount = i16;
            String str9 = this.title;
            if (str9 == null) {
                str9 = str2;
            }
            sQLiteStatement.bindString(i16, str9);
            int i17 = this.bindValueCount + 1;
            this.bindValueCount = i17;
            if (this.showNotification) {
                j3 = 1;
            } else {
                j3 = 0;
            }
            sQLiteStatement.bindLong(i17, j3);
            int i18 = this.bindValueCount + 1;
            this.bindValueCount = i18;
            sQLiteStatement.bindLong(i18, (long) this.notificationVisibility);
            int i19 = this.bindValueCount + 1;
            this.bindValueCount = i19;
            if (this.isFirstDownload) {
                j4 = 1;
            } else {
                j4 = 0;
            }
            sQLiteStatement.bindLong(i19, j4);
            int i20 = this.bindValueCount + 1;
            this.bindValueCount = i20;
            if (this.isFirstSuccess) {
                j5 = 1;
            } else {
                j5 = 0;
            }
            sQLiteStatement.bindLong(i20, j5);
            int i21 = this.bindValueCount + 1;
            this.bindValueCount = i21;
            if (this.needHttpsToHttpRetry) {
                j6 = 1;
            } else {
                j6 = 0;
            }
            sQLiteStatement.bindLong(i21, j6);
            int i22 = this.bindValueCount + 1;
            this.bindValueCount = i22;
            sQLiteStatement.bindLong(i22, this.downloadTime);
            int i23 = this.bindValueCount + 1;
            this.bindValueCount = i23;
            String str10 = this.packageName;
            if (str10 == null) {
                str10 = str2;
            }
            sQLiteStatement.bindString(i23, str10);
            int i24 = this.bindValueCount + 1;
            this.bindValueCount = i24;
            String str11 = this.md5;
            if (str11 == null) {
                str11 = str2;
            }
            sQLiteStatement.bindString(i24, str11);
            int i25 = this.bindValueCount + 1;
            this.bindValueCount = i25;
            if (this.needRetryDelay) {
                j7 = 1;
            } else {
                j7 = 0;
            }
            sQLiteStatement.bindLong(i25, j7);
            int i26 = this.bindValueCount + 1;
            this.bindValueCount = i26;
            sQLiteStatement.bindLong(i26, (long) this.curRetryTime);
            int i27 = this.bindValueCount + 1;
            this.bindValueCount = i27;
            sQLiteStatement.bindLong(i27, (long) this.retryDelayStatus.ordinal());
            int i28 = this.bindValueCount + 1;
            this.bindValueCount = i28;
            if (this.needDefaultHttpServiceBackUp) {
                j8 = 1;
            } else {
                j8 = 0;
            }
            sQLiteStatement.bindLong(i28, j8);
            int i29 = this.bindValueCount + 1;
            this.bindValueCount = i29;
            if (this.needReuseChunkRunnable) {
                j9 = 1;
            } else {
                j9 = 0;
            }
            sQLiteStatement.bindLong(i29, j9);
            int i30 = this.bindValueCount + 1;
            this.bindValueCount = i30;
            String str12 = this.retryDelayTimeArray;
            if (str12 == null) {
                str12 = str2;
            }
            sQLiteStatement.bindString(i30, str12);
            int i31 = this.bindValueCount + 1;
            this.bindValueCount = i31;
            if (this.needChunkDowngradeRetry) {
                j10 = 1;
            } else {
                j10 = 0;
            }
            sQLiteStatement.bindLong(i31, j10);
            int i32 = this.bindValueCount + 1;
            this.bindValueCount = i32;
            sQLiteStatement.bindString(i32, getBackUpUrlsStr());
            int i33 = this.bindValueCount + 1;
            this.bindValueCount = i33;
            sQLiteStatement.bindLong(i33, (long) this.backUpUrlRetryCount);
            int i34 = this.bindValueCount + 1;
            this.bindValueCount = i34;
            sQLiteStatement.bindLong(i34, this.realDownloadTime);
            int i35 = this.bindValueCount + 1;
            this.bindValueCount = i35;
            sQLiteStatement.bindLong(i35, (long) this.retryScheduleMinutes);
            int i36 = this.bindValueCount + 1;
            this.bindValueCount = i36;
            if (!this.needIndependentProcess) {
                j11 = 0;
            }
            sQLiteStatement.bindLong(i36, j11);
            int i37 = this.bindValueCount + 1;
            this.bindValueCount = i37;
            sQLiteStatement.bindString(i37, getDBJsonDataString());
            int i38 = this.bindValueCount + 1;
            this.bindValueCount = i38;
            String str13 = this.iconUrl;
            if (str13 == null) {
                str13 = str2;
            }
            sQLiteStatement.bindString(i38, str13);
            int i39 = this.bindValueCount + 1;
            this.bindValueCount = i39;
            sQLiteStatement.bindLong(i39, (long) this.appVersionCode);
            int i40 = this.bindValueCount + 1;
            this.bindValueCount = i40;
            String str14 = this.taskId;
            if (str14 != null) {
                str2 = str14;
            }
            sQLiteStatement.bindString(i40, str2);
        }
    }

    public void readFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        this.f72934id = parcel.readInt();
        this.name = parcel.readString();
        this.title = parcel.readString();
        this.url = parcel.readString();
        this.savePath = parcel.readString();
        this.tempPath = parcel.readString();
        boolean z26 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.onlyWifi = z;
        this.extra = parcel.readString();
        this.extraHeaders = parcel.createTypedArrayList(HttpHeader.CREATOR);
        this.maxBytes = parcel.readInt();
        this.outIp = parcel.createStringArray();
        this.outSize = parcel.createIntArray();
        this.retryCount = parcel.readInt();
        this.backUpUrlRetryCount = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.force = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.needPostProgress = z3;
        this.maxProgressCount = parcel.readInt();
        this.minProgressTimeMsInterval = parcel.readInt();
        this.backUpUrls = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.showNotification = z4;
        this.mimeType = parcel.readString();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.needHttpsToHttpRetry = z5;
        this.packageName = parcel.readString();
        this.md5 = parcel.readString();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.needRetryDelay = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.needDefaultHttpServiceBackUp = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.needReuseChunkRunnable = z8;
        this.retryDelayTimeArray = parcel.readString();
        this.eTag = parcel.readString();
        this.curRetryTime = parcel.readInt();
        convertRetryDelayStatus(parcel.readInt());
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.needReuseFirstConnection = z9;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.forceIgnoreRecommendSize = z10;
        this.networkQuality = parcel.readString();
        this.curBackUpUrlIndex = parcel.readInt();
        this.notificationVisibility = parcel.readInt();
        this.chunkCount = parcel.readInt();
        setCurBytes(parcel.readLong());
        this.totalBytes = parcel.readLong();
        setStatus(parcel.readInt());
        this.downloadTime = parcel.readLong();
        this.realDownloadTime = parcel.readLong();
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.backUpUrlUsed = z11;
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.httpsToHttpRetryUsed = z12;
        try {
            StringBuffer stringBuffer = this.errorBytesLog;
            if (stringBuffer == null) {
                this.errorBytesLog = new StringBuffer(parcel.readString());
            } else {
                stringBuffer.delete(0, stringBuffer.length()).append(parcel.readString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.autoResumed = z13;
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.showNotificationForAutoResumed = z14;
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.showNotificationForNetworkResumed = z15;
        this.forbiddenBackupUrls = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.needIndependentProcess = z16;
        convertEnqueueType(parcel.readInt());
        if (parcel.readByte() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.headConnectionAvailable = z17;
        this.httpStatusCode = parcel.readInt();
        this.httpStatusMessage = parcel.readString();
        if (parcel.readByte() != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.isSaveTempFile = z18;
        if (parcel.readByte() != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        this.isForbiddenRetryed = z19;
        if (parcel.readByte() != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        this.addListenerToSameTask = z20;
        if (parcel.readByte() != 0) {
            z21 = true;
        } else {
            z21 = false;
        }
        this.needChunkDowngradeRetry = z21;
        if (parcel.readByte() != 0) {
            z22 = true;
        } else {
            z22 = false;
        }
        this.chunkDowngradeRetryUsed = z22;
        this.failedException = (BaseException) parcel.readParcelable(BaseException.class.getClassLoader());
        this.retryScheduleMinutes = parcel.readInt();
        this.dbJsonDataString = parcel.readString();
        if (parcel.readByte() != 0) {
            z23 = true;
        } else {
            z23 = false;
        }
        this.supportPartial = z23;
        this.iconUrl = parcel.readString();
        this.appVersionCode = parcel.readInt();
        this.taskId = parcel.readString();
        if (parcel.readByte() != 0) {
            z24 = true;
        } else {
            z24 = false;
        }
        this.expiredRedownload = z24;
        if (parcel.readByte() != 0) {
            z25 = true;
        } else {
            z25 = false;
        }
        this.deleteCacheIfCheckFailed = z25;
        if (parcel.readByte() == 0) {
            z26 = false;
        }
        this.successByCache = z26;
        parseMonitorSetting();
    }

    public void setForbiddenBackupUrls(List<String> list, boolean z) {
        this.forbiddenBackupUrls = list;
        refreshBackupUrls(z);
    }

    public void safePutToDBJsonData(String str, Object obj) {
        MethodCollector.m26663i(12276);
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            try {
                this.dbJsonData.put(str, obj);
            } catch (Exception unused) {
            }
            try {
                this.dbJsonDataString = null;
            } finally {
                MethodCollector.m26664o(12276);
            }
        }
    }

    public void setCurBytes(long j, boolean z) {
        if (z) {
            setCurBytes(j);
        } else if (j > getCurBytes()) {
            setCurBytes(j);
        }
    }

    public void setSpValue(String str, String str2) {
        ensureSpData();
        try {
            this.spData.put(str, str2);
            updateSpData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void copyFromCacheData(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo != null) {
            setChunkCount(downloadInfo.getChunkCount());
            setTotalBytes(downloadInfo.getTotalBytes());
            setCurBytes(downloadInfo.getCurBytes(), true);
            this.realDownloadTime = downloadInfo.realDownloadTime;
            if (downloadInfo.canSkipStatusHandler() || canSkipStatusHandler()) {
                this.curRetryTime = downloadInfo.getCurRetryTime();
            } else {
                this.curRetryTime = 0;
                this.isForbiddenRetryed = false;
                this.backUpUrlUsed = false;
                this.curBackUpUrlIndex = 0;
                this.httpsToHttpRetryUsed = false;
            }
            seteTag(downloadInfo.geteTag());
            if (z) {
                setStatus(downloadInfo.getStatus());
            }
            this.isFirstDownload = downloadInfo.getIsFirstDownload();
            this.isFirstSuccess = downloadInfo.isFirstSuccess();
            this.retryDelayStatus = downloadInfo.getRetryDelayStatus();
            mergeAuxiliaryJSONObject(downloadInfo.dbJsonData);
        }
    }

    public synchronized void handleTempSaveCallback(boolean z, BaseException baseException) {
        MethodCollector.m26663i(12630);
        this.isSaveTempFile = false;
        if (this.tempFileSaveCompleteCallbacks == null) {
            MethodCollector.m26664o(12630);
            return;
        }
        C30434a.m62027b("DownloadInfo", "handleTempSaveCallback isSuccess " + z + " callback size:" + this.tempFileSaveCompleteCallbacks.size());
        for (AbstractC30341ae aeVar : this.tempFileSaveCompleteCallbacks) {
            if (aeVar != null) {
                if (z) {
                    aeVar.mo53871a();
                } else {
                    aeVar.mo53872a(baseException);
                }
            }
        }
        MethodCollector.m26664o(12630);
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.f72934id);
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.savePath);
        parcel.writeString(this.tempPath);
        parcel.writeByte(this.onlyWifi ? (byte) 1 : 0);
        parcel.writeString(this.extra);
        parcel.writeTypedList(this.extraHeaders);
        parcel.writeInt(this.maxBytes);
        parcel.writeStringArray(this.outIp);
        parcel.writeIntArray(this.outSize);
        parcel.writeInt(this.retryCount);
        parcel.writeInt(this.backUpUrlRetryCount);
        parcel.writeByte(this.force ? (byte) 1 : 0);
        parcel.writeByte(this.needPostProgress ? (byte) 1 : 0);
        parcel.writeInt(this.maxProgressCount);
        parcel.writeInt(this.minProgressTimeMsInterval);
        parcel.writeStringList(this.backUpUrls);
        parcel.writeByte(this.showNotification ? (byte) 1 : 0);
        parcel.writeString(this.mimeType);
        parcel.writeByte(this.needHttpsToHttpRetry ? (byte) 1 : 0);
        parcel.writeString(this.packageName);
        parcel.writeString(this.md5);
        parcel.writeByte(this.needRetryDelay ? (byte) 1 : 0);
        parcel.writeByte(this.needDefaultHttpServiceBackUp ? (byte) 1 : 0);
        parcel.writeByte(this.needReuseChunkRunnable ? (byte) 1 : 0);
        parcel.writeString(this.retryDelayTimeArray);
        parcel.writeString(this.eTag);
        parcel.writeInt(this.curRetryTime);
        parcel.writeInt(this.retryDelayStatus.ordinal());
        parcel.writeByte(this.needReuseFirstConnection ? (byte) 1 : 0);
        parcel.writeByte(this.forceIgnoreRecommendSize ? (byte) 1 : 0);
        parcel.writeString(this.networkQuality);
        parcel.writeInt(this.curBackUpUrlIndex);
        parcel.writeInt(this.notificationVisibility);
        parcel.writeInt(this.chunkCount);
        parcel.writeLong(getCurBytes());
        parcel.writeLong(this.totalBytes);
        parcel.writeInt(getRealStatus());
        parcel.writeLong(this.downloadTime);
        parcel.writeLong(this.realDownloadTime);
        parcel.writeByte(this.backUpUrlUsed ? (byte) 1 : 0);
        parcel.writeByte(this.httpsToHttpRetryUsed ? (byte) 1 : 0);
        StringBuffer stringBuffer = this.errorBytesLog;
        if (stringBuffer != null) {
            str = stringBuffer.toString();
        } else {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeByte(this.autoResumed ? (byte) 1 : 0);
        parcel.writeByte(this.showNotificationForAutoResumed ? (byte) 1 : 0);
        parcel.writeByte(this.showNotificationForNetworkResumed ? (byte) 1 : 0);
        parcel.writeStringList(this.forbiddenBackupUrls);
        parcel.writeByte(this.needIndependentProcess ? (byte) 1 : 0);
        parcel.writeInt(this.enqueueType.ordinal());
        parcel.writeByte(this.headConnectionAvailable ? (byte) 1 : 0);
        parcel.writeInt(this.httpStatusCode);
        parcel.writeString(this.httpStatusMessage);
        parcel.writeByte(this.isSaveTempFile ? (byte) 1 : 0);
        parcel.writeByte(this.isForbiddenRetryed ? (byte) 1 : 0);
        parcel.writeByte(this.addListenerToSameTask ? (byte) 1 : 0);
        parcel.writeByte(this.needChunkDowngradeRetry ? (byte) 1 : 0);
        parcel.writeByte(this.chunkDowngradeRetryUsed ? (byte) 1 : 0);
        parcel.writeParcelable(this.failedException, i);
        parcel.writeInt(this.retryScheduleMinutes);
        parcel.writeString(getDBJsonDataString());
        parcel.writeByte(this.supportPartial ? (byte) 1 : 0);
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.appVersionCode);
        parcel.writeString(this.taskId);
        parcel.writeByte(this.expiredRedownload ? (byte) 1 : 0);
        parcel.writeByte(this.deleteCacheIfCheckFailed ? (byte) 1 : 0);
        parcel.writeByte(this.successByCache ? (byte) 1 : 0);
    }

    public void addErrorBytesLog(long j, int i, String str) {
        try {
            if (C30434a.m62025a()) {
                if (this.errorBytesLog == null) {
                    this.errorBytesLog = new StringBuffer();
                }
                if (this.errorBytesLog.length() != 0) {
                    this.errorBytesLog.append(",");
                }
                this.errorBytesLog.append("[type:").append(i).append(",bytes:").append(j).append(",method:").append(str).append("]");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
