package com.p2082ss.android.common.applog;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.common.utility.C13582a;
import com.bytedance.common.utility.C13585b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.C29734b;
import com.p2082ss.android.common.AbstractC29742a;
import com.p2082ss.android.common.applog.C29770b;
import com.p2082ss.android.common.applog.p2128a.AbstractC29766a;
import com.p2082ss.android.common.applog.p2128a.C29768c;
import com.p2082ss.android.common.p2127a.C29743a;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.common.p2132c.C29822b;
import com.p2082ss.android.deviceregister.AbstractC29900f;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.deviceregister.p2134a.AbstractC29868c;
import com.p2082ss.android.deviceregister.p2134a.C29866a;
import com.p2082ss.android.deviceregister.p2134a.C29869d;
import com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.C29879c;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58002a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.legoImp.task.InitModules;
import com.p2082ss.android.ugc.aweme.net.model.C61421a;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.service.middleware.applog.AbstractC28934a;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.AppLog */
public class AppLog {
    public static final String[] BASE_HEADER_KEYS = {"appkey", "openudid", "sdk_version", "package", "channel", "display_name", "app_version", "version_code", "timezone", "access", "os", "os_version", "os_api", "device_model", "device_brand", "device_manufacturer", "language", "resolution", "display_density", "density_dpi", "carrier", "mcc_mnc", "clientudid", "install_id", "device_id", "sig_hash", "aid", "push_sdk", "rom", "release_build", "update_version_code", "manifest_version_code", "app_version_minor", "cpu_abi", "app_track", "not_request_sender", "rom_version", "region", "tz_name", "tz_offset", "sim_region", "custom", "google_aid", "app_language", "app_region", "ab_sdk_version", "user_unique_id"};
    private static volatile boolean mCollectFreeSpace;
    private static volatile AbstractC29760f mFreeSpaceCollector;
    private static boolean mHasHandledCache;
    private static volatile long mLastGetAppConfigTime;
    public static int mLaunchFrom;
    private static String sAbSDKVersion;
    private static volatile boolean sAdjustTerminate;
    private static boolean sAliyunPushInclude = true;
    private static boolean sAnonymous;
    private static AbstractC29742a sAppContext;
    static int sAppCount = 0;
    private static volatile boolean sChildMode;
    private static volatile C29768c sChildModeWhiteEventFilter;
    private static WeakReference<AbstractC29759e> sConfigUpdateListener = null;
    private static final Bundle sCustomBundle = new Bundle();
    static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    private static volatile AbstractC29766a sEventFilter;
    private static volatile int sEventFilterEnable = 0;
    private static long sFetchActiveTime = 0;
    private static Handler sHandler = new Handler(Looper.getMainLooper());
    public static volatile boolean sHasLoadDid = false;
    private static boolean sHasManualInvokeActiveUser = false;
    private static volatile JSONObject sHeaderCopy = null;
    private static boolean sHwPushInclude = true;
    private static volatile AbstractC28934a sIHeaderCustomTimelyCallback;
    private static volatile boolean sInitGuard;
    private static boolean sInitWithActivity = false;
    private static volatile AppLog sInstance;
    private static final ThreadLocal<Boolean> sIsConfigThread = new ThreadLocal<>();
    private static boolean sIsNotRequestSender = false;
    static String sLastCreateActivityName;
    static String sLastCreateActivityNameAndTime;
    static String sLastResumeActivityName;
    static String sLastResumeActivityNameAndTime;
    private static final Object sLock = new Object();
    private static final Object sLogConfigLock = new Object();
    static AbstractC29761g sLogEncryptCfg;
    private static boolean sMiPushInclude = true;
    private static boolean sMyPushInclude = true;
    private static boolean sMzPushInclude = true;
    public static volatile boolean sPendingActiveUser = false;
    static String sRomInfo = null;
    static final List<AbstractC29762h> sSessionHookList = new ArrayList(2);
    static String sSessionKey = "";
    private static volatile long sStartLogReaperDelay;
    static volatile boolean sStopped = false;
    static volatile AbstractC29764j sTraceCallback;
    static AtomicLong sUserId = new AtomicLong();
    private static String sUserUniqueId;
    private static C29810v urlConfig;
    C29758d mActivityRecord;
    private long mActivityTime = 0;
    private volatile boolean mAllowOldImageSample = false;
    private String mAllowPushListJsonStr = "";
    private final HashSet<Integer> mAllowPushSet = new HashSet<>();
    private long mBatchEventInterval = 60000;
    private final ConcurrentHashMap<String, String> mBlockV1 = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, String> mBlockV3 = new ConcurrentHashMap<>();
    public final Context mContext;
    private final ConcurrentHashMap<String, String> mEventTimely = new ConcurrentHashMap<>();
    private boolean mForbidReportPhoneDetailInfo;
    private final AtomicLong mGlobalEventIndexMatrix = new AtomicLong();
    private final AtomicLong mGlobalEventIndexMatrixV1 = new AtomicLong();
    private boolean mHasSetup = false;
    private boolean mHasTryResendConfig = false;
    public boolean mHasUpdateConfig;
    private final JSONObject mHeader;
    private long mHeartbeatTime = System.currentTimeMillis();
    private int mHttpMonitorPort = 0;
    private AtomicInteger mImageFailureCount = new AtomicInteger();
    private AtomicInteger mImageSuccessCount = new AtomicInteger();
    volatile boolean mInitOk;
    private int mLastConfigVersion;
    private volatile boolean mLoadingOnlineConfig = false;
    final LinkedList<AbstractC29798l> mLogQueue = new LinkedList<>();
    volatile C29801o mLogReaper = null;
    private volatile long mLogSettingInterval = 21600000;
    private final C13582a mNetWorkMonitor;
    final LinkedList<C29755a> mQueue = new LinkedList<>();
    private Random mRandom = new Random();
    private LinkedList<C29763i> mSamples = new LinkedList<>();
    private int mSendLaunchTimely = 1;
    private C29802p mSession;
    public long mSessionInterval = 30000;
    private boolean mSetupOk = false;
    private volatile long mStartWaitSendTimely;
    private final AtomicBoolean mStopFlag = new AtomicBoolean();
    public JSONObject mTimeSync = null;
    private volatile long mTryUpdateConfigTime = 0;
    private volatile long mUpdateConfigTime = 0;
    private int mVersionCode = 1;

    /* renamed from: com.ss.android.common.applog.AppLog$e */
    public interface AbstractC29759e {
        static {
            Covode.recordClassIndex(36161);
        }

        /* renamed from: a */
        void mo29084a();

        /* renamed from: b */
        void mo29085b();
    }

    /* renamed from: com.ss.android.common.applog.AppLog$f */
    public interface AbstractC29760f {
        static {
            Covode.recordClassIndex(36162);
        }

        /* renamed from: a */
        JSONObject mo52025a();
    }

    /* renamed from: com.ss.android.common.applog.AppLog$g */
    public interface AbstractC29761g {
        static {
            Covode.recordClassIndex(36163);
        }

        /* renamed from: a */
        boolean mo29082a();

        /* renamed from: b */
        boolean mo29083b();
    }

    /* renamed from: com.ss.android.common.applog.AppLog$h */
    public interface AbstractC29762h {
        static {
            Covode.recordClassIndex(36164);
        }

        /* renamed from: a */
        void mo29089a(long j);

        /* renamed from: a */
        void mo29090a(long j, String str, JSONObject jSONObject);

        /* renamed from: b */
        void mo29091b(long j, String str, JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.common.applog.AppLog$j */
    public interface AbstractC29764j {
        static {
            Covode.recordClassIndex(36166);
        }

        /* renamed from: a */
        void mo52026a(String str, String str2, String str3);

        /* renamed from: a */
        void mo52027a(List<Long> list);

        void onEventExpired(List<Long> list);
    }

    static boolean getEventV3Switch() {
        return true;
    }

    public static String getInstallId() {
        return m59930xb779551();
    }

    public static void getSSIDs(Map map) {
        m59938xd4e306bc(map);
    }

    public static String getServerDeviceId() {
        return m59931xe2c9b619();
    }

    public static String getUserId() {
        return m59939xccb7d482();
    }

    private void notifyOnEvent(C29794h hVar) {
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        m59932xd251656a(context, str, str2, str3, j, j2, z, jSONObject);
    }

    public static void recordMiscLog(Context context, String str, JSONObject jSONObject) {
        m59933x3ca5bb56(context, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public void onEvent(String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        m59941xb3a627c8(this, str, str2, str3, j, j2, z, jSONObject);
    }

    /* renamed from: com.ss.android.common.applog.AppLog$d */
    public static class C29758d {

        /* renamed from: a */
        public int f70974a;

        /* renamed from: b */
        public String f70975b;

        static {
            Covode.recordClassIndex(36160);
        }

        public C29758d() {
        }

        public C29758d(String str, int i) {
            this.f70975b = str;
            this.f70974a = i;
        }
    }

    public static String getAbSDKVersion() {
        return sAbSDKVersion;
    }

    static boolean getAdjustTerminate() {
        return sAdjustTerminate;
    }

    public static int getAppId() {
        return C29869d.f71251e;
    }

    public static JSONObject getHeaderCopy() {
        return sHeaderCopy;
    }

    public static AbstractC28934a getIHeaderCustomTimelyCallback() {
        return sIHeaderCustomTimelyCallback;
    }

    public static String getSessionKey() {
        return sSessionKey;
    }

    public static String getUserUniqueId() {
        return sUserUniqueId;
    }

    public static void tryWaitDeviceInit() {
        DeviceRegisterManager.tryWaitDeviceIdInit();
    }

    static String ACTIVE_USER_URL() {
        return urlConfig.f71141d;
    }

    static String APPLOG_CONFIG_URL() {
        return urlConfig.f71139b;
    }

    static String APPLOG_CONFIG_URL_FALLBACK() {
        return urlConfig.f71144g;
    }

    static String[] APPLOG_TIMELY_URL() {
        return urlConfig.f71140c;
    }

    static String[] APPLOG_URL() {
        return urlConfig.f71138a;
    }

    public static void addAppCount() {
        sAppCount++;
    }

    /* renamed from: com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId */
    public static String m59939xccb7d482() {
        InitModules.m105851l();
        return AppLog__getUserId$___twin___();
    }

    public static String getAppVersionMinor() {
        return DeviceRegisterManager.getAppVersionMinor();
    }

    public static String AppLog__getInstallId$___twin___() {
        if (sInstance != null) {
            return DeviceRegisterManager.getInstallId();
        }
        return null;
    }

    public static String AppLog__getServerDeviceId$___twin___() {
        if (sInstance != null) {
            return DeviceRegisterManager.getDeviceId();
        }
        return null;
    }

    public static String AppLog__getUserId$___twin___() {
        return String.valueOf(sUserId.get());
    }

    private long doGetLastActivteTime() {
        if (this.mActivityRecord != null) {
            return System.currentTimeMillis();
        }
        return this.mActivityTime;
    }

    public static long genEventIndex() {
        if (sInstance != null) {
            return sInstance.mGlobalEventIndexMatrix.getAndIncrement();
        }
        return -1;
    }

    public static String genSession() {
        return UUID.randomUUID().toString();
    }

    public static String getClientId() {
        if (sInstance != null) {
            return DeviceRegisterManager.getClientUDID();
        }
        return null;
    }

    public static int getHttpMonitorPort() {
        AppLog appLog = sInstance;
        if (appLog != null) {
            return appLog.mHttpMonitorPort;
        }
        return 0;
    }

    public static long getLastActiveTime() {
        AppLog appLog = sInstance;
        if (appLog != null) {
            return appLog.doGetLastActivteTime();
        }
        return 0;
    }

    static boolean getLogEncryptSwitch() {
        AbstractC29761g gVar = sLogEncryptCfg;
        if (gVar != null) {
            return gVar.mo29083b();
        }
        return true;
    }

    static boolean getLogRecoverySwitch() {
        AbstractC29761g gVar = sLogEncryptCfg;
        if (gVar != null) {
            return gVar.mo29082a();
        }
        return true;
    }

    private void loadGlobalEventIndex() {
        this.mGlobalEventIndexMatrix.set(0);
        this.mGlobalEventIndexMatrixV1.set(0);
    }

    private void notifyConfigUpdate() {
        AbstractC29759e eVar;
        WeakReference<AbstractC29759e> weakReference = sConfigUpdateListener;
        if (weakReference != null && (eVar = weakReference.get()) != null) {
            try {
                eVar.mo29085b();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_AppLogLancet_getInstallId */
    public static String m59930xb779551() {
        Context a;
        if (C58002a.f132198c || (a = C17867d.m33078a()) == null) {
            return AppLog__getInstallId$___twin___();
        }
        return C34822d.m71158a(a, C29866a.f71244a, 0).getString("install_id", "");
    }

    /* renamed from: com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_AppLogLancet_getServerDeviceId */
    public static String m59931xe2c9b619() {
        Context a;
        if (C58002a.f132198c || (a = C17867d.m33078a()) == null) {
            return AppLog__getServerDeviceId$___twin___();
        }
        return C34822d.m71158a(a, C29866a.f71244a, 0).getString("device_id", "");
    }

    public static String getCurrentSessionId() {
        if (sInstance == null || sInstance.mSession == null) {
            return null;
        }
        return sInstance.mSession.f71111b;
    }

    static void resetEventIndex() {
        if (sInstance != null) {
            sInstance.mGlobalEventIndexMatrix.set(0);
            sInstance.mGlobalEventIndexMatrixV1.set(0);
        }
    }

    /* access modifiers changed from: package-private */
    public void checkSessionEnd() {
        C29802p pVar = this.mSession;
        if (pVar != null && !pVar.f71118i) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.mSession.f71120k && currentTimeMillis - this.mSession.f71117h >= this.mSessionInterval) {
                C29802p pVar2 = this.mSession;
                onSessionEnd();
                this.mSession = null;
                C29800n nVar = new C29800n();
                nVar.f71088a = pVar2;
                enqueue(nVar);
            }
        }
    }

    public synchronized void ensureHeaderCopy() {
        MethodCollector.m26663i(13905);
        try {
            sHeaderCopy = new JSONObject(this.mHeader, C29785c.f71033a);
            MethodCollector.m26664o(13905);
        } catch (JSONException e) {
            e.printStackTrace();
            MethodCollector.m26664o(13905);
        }
    }

    /* access modifiers changed from: package-private */
    public void sendHeartbeat() {
        MethodCollector.m26663i(12379);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.mHeartbeatTime > 60000) {
            this.mHeartbeatTime = currentTimeMillis;
            synchronized (this.mLogQueue) {
                try {
                    this.mLogQueue.notify();
                } finally {
                    MethodCollector.m26664o(12379);
                }
            }
            return;
        }
        MethodCollector.m26664o(12379);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.common.applog.AppLog$2 */
    public static /* synthetic */ class C297472 {

        /* renamed from: a */
        static final /* synthetic */ int[] f70934a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x008a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00a2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00ae */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00ba */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 211
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.AppLog.C297472.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.common.applog.AppLog$c */
    class C29757c extends Thread implements DeviceRegisterManager.AbstractC29864a {

        /* renamed from: b */
        private boolean f70973b;

        static {
            Covode.recordClassIndex(36159);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
            if (r6.f70972a.mQueue.isEmpty() == false) goto L_0x005b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
            if (r3 == null) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
            r6.f70972a.processItem(r3);
            r6.f70973b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
            if (r6.f70973b == false) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
            r6.f70973b = false;
            r6.f70972a.checkSessionEnd();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 145
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.AppLog.C29757c.run():void");
        }

        public C29757c() {
            super("ActionReaper");
        }

        @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
        /* renamed from: a */
        public final void mo29065a(boolean z) {
            AppLog.sHasLoadDid = true;
            if (AppLog.sPendingActiveUser) {
                AppLog.activeUserInvokeInternal(AppLog.this.mContext);
            }
        }

        @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
        /* renamed from: a */
        public final void mo29066a(boolean z, boolean z2) {
            if (AppLog.this.mHasUpdateConfig) {
                AppLog.this.mHasUpdateConfig = false;
            } else if (z) {
                AppLog.this.tryUpdateConfig(false, true, z2);
            }
        }

        @Override // com.p2082ss.android.deviceregister.DeviceRegisterManager.AbstractC29864a
        /* renamed from: a */
        public final void mo29064a(String str, String str2) {
            C29755a aVar = new C29755a(EnumC29756b.DEVICE_ID_UPDATE);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("device_id", str);
                jSONObject.put("install_id", str2);
                aVar.f70949b = jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
            }
            AppLog.this.enqueue(aVar);
            AppLog.this.mHasUpdateConfig = true;
        }
    }

    static {
        Covode.recordClassIndex(36146);
    }

    /* access modifiers changed from: package-private */
    public void loadSSIDs() {
        MethodCollector.m26663i(7775);
        try {
            AbstractC29742a aVar = sAppContext;
            if (aVar != null) {
                this.mVersionCode = aVar.mo29081i();
            }
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences a = C34822d.m71158a(this.mContext, C29866a.f71244a, 0);
            int i = a.getInt("app_log_last_config_version", 0);
            this.mLastConfigVersion = i;
            if (i == this.mVersionCode) {
                long j = a.getLong("app_log_last_config_time", 0);
                if (j <= currentTimeMillis) {
                    currentTimeMillis = j;
                }
                this.mUpdateConfigTime = currentTimeMillis;
            }
            try {
                String string = a.getString("allow_push_list", null);
                this.mAllowPushListJsonStr = string;
                if (string != null) {
                    synchronized (sLock) {
                        try {
                            parseIntSet(this.mAllowPushSet, new JSONArray(string));
                        } catch (Throwable th) {
                            MethodCollector.m26664o(7775);
                            throw th;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            this.mAllowOldImageSample = a.getBoolean("allow_old_image_sample", false);
            try {
                String string2 = a.getString("real_time_events", null);
                if (!C13627m.m24498a(string2)) {
                    JSONArray jSONArray = new JSONArray(string2);
                    if (jSONArray.length() > 0) {
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            String string3 = jSONArray.getString(i2);
                            if (!C13627m.m24498a(string3)) {
                                this.mEventTimely.put(string3, "timely");
                            }
                        }
                    }
                }
                MethodCollector.m26664o(7775);
            } catch (Throwable unused2) {
                MethodCollector.m26664o(7775);
            }
        } catch (Exception unused3) {
            MethodCollector.m26664o(7775);
        }
    }

    /* access modifiers changed from: package-private */
    public void onSessionEnd() {
        C29802p pVar = this.mSession;
        if (pVar != null) {
            C29786d a = C29786d.m59984a(this.mContext);
            int i = 0;
            int andSet = this.mImageSuccessCount.getAndSet(0);
            int andSet2 = this.mImageFailureCount.getAndSet(0);
            if (pVar.f71110a > 0) {
                if (andSet > 0 || andSet2 > 0) {
                    C29794h hVar = new C29794h();
                    hVar.f71065b = "image";
                    hVar.f71066c = "stats";
                    hVar.f71068e = (long) andSet;
                    hVar.f71069f = (long) andSet2;
                    hVar.f71071h = pVar.f71117h;
                    hVar.f71072i = pVar.f71110a;
                    a.mo52053a(hVar);
                }
                if (!this.mAllowOldImageSample) {
                    this.mSamples.clear();
                }
                Iterator<C29763i> it = this.mSamples.iterator();
                while (it.hasNext()) {
                    C29763i next = it.next();
                    C29794h hVar2 = new C29794h();
                    hVar2.f71065b = "image";
                    hVar2.f71066c = "sample";
                    hVar2.f71067d = next.f70976a;
                    hVar2.f71068e = (long) next.f70977b;
                    hVar2.f71069f = next.f70978c;
                    hVar2.f71071h = next.f70979d;
                    hVar2.f71072i = pVar.f71110a;
                    a.mo52053a(hVar2);
                    i++;
                    if (i >= 5) {
                        break;
                    }
                }
            }
            this.mSamples.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.common.applog.AppLog$b */
    public enum EnumC29756b {
        PAGE_START(0),
        PAGE_END(1),
        EVENT(2),
        IMAGE_SAMPLE(3),
        CONFIG_UPDATE(4),
        API_SAMPLE(5),
        UA_UPDATE(6),
        SAVE_ANR_TAG(7),
        SAVE_DNS_REPORT(8),
        SAVE_MISC_LOG(9),
        DEVICE_ID_UPDATE(10),
        CUSTOMER_HEADER_UPDATE(11),
        UPDATE_GOOGLE_AID(12),
        UPDATE_APP_LANGUAGE_REGION(13),
        CLEAR_WHEN_SWITCH_CHILD_MODE(14),
        RESET_WHEN_SWITCH_CHILD_MODE(15),
        DELAY_START_LOG_REAPER(16);
        

        /* renamed from: r */
        final int f70971r;

        static {
            Covode.recordClassIndex(36158);
        }

        private EnumC29756b(int i) {
            this.f70971r = i;
        }
    }

    public boolean setupLogReaper() {
        MethodCollector.m26663i(9290);
        try {
            Context context = this.mContext;
            boolean z = this.mForbidReportPhoneDetailInfo;
            C297549 r3 = new AbstractC29868c() {
                /* class com.p2082ss.android.common.applog.AppLog.C297549 */

                static {
                    Covode.recordClassIndex(36156);
                }

                @Override // com.p2082ss.android.deviceregister.p2134a.AbstractC29868c
                /* renamed from: a */
                public final void mo52023a(String str, JSONObject jSONObject) {
                    C29819a.m60077a(str, jSONObject);
                }
            };
            boolean z2 = sAnonymous;
            boolean z3 = sInitWithActivity;
            boolean z4 = sChildMode;
            DeviceRegisterManager.setForbidReportPhoneDetailInfo(z);
            DeviceRegisterManager.setILogDepend(r3);
            DeviceRegisterManager.setAnonymous(z2);
            DeviceRegisterManager.setInitWithActivity(z3);
            DeviceRegisterManager.init(context, z4);
        } catch (Exception e) {
            try {
                e.printStackTrace();
                if (Logger.debug()) {
                    MethodCollector.m26664o(9290);
                    throw e;
                }
            } catch (Exception unused) {
                MethodCollector.m26664o(9290);
                return false;
            }
        }
        this.mInitOk = initHeader(this.mHeader, this.mContext);
        C29802p b = C29786d.m59984a(this.mContext).mo52062b(0);
        this.mSession = b;
        loadStats(b);
        notifyConfigUpdate();
        if (this.mSession != null) {
            C29797k kVar = new C29797k();
            kVar.f71086a = this.mSession.f71110a;
            enqueue(kVar);
        }
        try {
            Bundle bundle = new Bundle();
            Bundle bundle2 = sCustomBundle;
            synchronized (bundle2) {
                try {
                    bundle.putAll(bundle2);
                } catch (Throwable th) {
                    MethodCollector.m26664o(9290);
                    throw th;
                }
            }
            if (bundle.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, m59936x1e1b0e3e(bundle, str));
                }
                this.mHeader.put("custom", jSONObject);
            }
        } catch (Throwable unused2) {
        }
        this.mLogReaper = new C29801o(this.mContext, new JSONObject(this.mHeader, C29785c.f71033a), this.mLogQueue, this.mStopFlag, sSessionHookList, this.mSession, this.mBlockV1, this.mBlockV3);
        this.mLogReaper.mo52075a(this.mBatchEventInterval);
        this.mLogReaper.f71092a = this.mSendLaunchTimely;
        if (sStartLogReaperDelay > 0) {
            HandlerThreadC29808t.m60042a().mo52083b(new Runnable() {
                /* class com.p2082ss.android.common.applog.AppLog.RunnableC2974610 */

                static {
                    Covode.recordClassIndex(36148);
                }

                public final void run() {
                    AppLog.this.enqueue(new C29755a(EnumC29756b.DELAY_START_LOG_REAPER));
                }
            }, sStartLogReaperDelay);
        } else {
            this.mLogReaper.start();
        }
        if (sEventFilterEnable > 0) {
            if (this.mLastConfigVersion == this.mVersionCode) {
                sEventFilter = AbstractC29766a.m59961a(this.mContext);
            } else {
                this.mUpdateConfigTime = 0;
                sEventFilter = AbstractC29766a.m59962a(this.mContext, (JSONObject) null);
            }
        }
        MethodCollector.m26664o(9290);
        return true;
    }

    public static void registerHeaderCustomCallback(AbstractC28934a aVar) {
        sIHeaderCustomTimelyCallback = aVar;
    }

    public static void registerLogRequestCallback(AbstractC29764j jVar) {
        sTraceCallback = jVar;
    }

    public static void setAbSDKVersion(String str) {
        sAbSDKVersion = str;
    }

    public static void setAliYunHanlder(AbstractC29793g gVar) {
        C29803q.f71125e = gVar;
    }

    public static void setAppId(int i) {
        DeviceRegisterManager.setAppId(i);
    }

    private static void setDeviceRegisterURL(String[] strArr) {
        DeviceRegisterManager.setDeviceRegisterURL(strArr);
    }

    public static void setIsNotRequestSender(boolean z) {
        sIsNotRequestSender = z;
    }

    public static void setLogEncryptConfig(AbstractC29761g gVar) {
        sLogEncryptCfg = gVar;
    }

    public static void setReleaseBuild(String str) {
        C29869d.f71252f = str;
    }

    public static void setSessionKey(String str) {
        sSessionKey = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.common.applog.AppLog$a */
    public static class C29755a {

        /* renamed from: a */
        public final EnumC29756b f70948a;

        /* renamed from: b */
        public Object f70949b;

        /* renamed from: c */
        public long f70950c;

        /* renamed from: d */
        public String f70951d;

        /* renamed from: e */
        public CountDownLatch f70952e;

        static {
            Covode.recordClassIndex(36157);
        }

        public C29755a(EnumC29756b bVar) {
            this.f70948a = bVar;
        }
    }

    /* renamed from: com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getSSIDs */
    public static void m59938xd4e306bc(Map map) {
        InitModules.m105851l();
        AppLog__getSSIDs$___twin___(map);
    }

    private void handleConfigUpdate(JSONObject jSONObject) {
        WeakReference<AbstractC29759e> weakReference = sConfigUpdateListener;
        if (weakReference != null) {
            weakReference.get();
        }
    }

    public static boolean isBadDeviceId(String str) {
        return C29803q.m60035a(str);
    }

    private void saveAppTrack(String str) {
        DeviceRegisterManager.saveAppTrack(this.mContext, str);
    }

    public static void setAppContext(AbstractC29742a aVar) {
        sAppContext = aVar;
        DeviceRegisterManager.setAppContext(aVar);
    }

    public static void setChildModeBeforeInit(boolean z) {
        sChildMode = z;
        DeviceRegisterManager.setChildModeBeforeInit(z);
    }

    public static void activeUser(Context context) {
        sHasManualInvokeActiveUser = true;
        activeUserInvokeInternal(m59937x1d84dfa8(context));
    }

    public static void clearWhenSwitchChildMode(boolean z) {
        clearOrResetWhenSwitchChildMode(z, EnumC29756b.CLEAR_WHEN_SWITCH_CHILD_MODE, 0, null);
    }

    /* renamed from: com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable */
    public static boolean m59934x7ac04bdb(Context context) {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m59937x1d84dfa8(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    static String formatDate(long j) {
        return sDateFormat.format(new Date(j));
    }

    private void notifyRemoteConfigUpdate(boolean z) {
        AbstractC29759e eVar;
        WeakReference<AbstractC29759e> weakReference = sConfigUpdateListener;
        if (weakReference != null && (eVar = weakReference.get()) != null) {
            try {
                eVar.mo29084a();
            } catch (Exception unused) {
            }
        }
    }

    public static void setChannel(String str) {
        if (!sInitGuard) {
            DeviceRegisterManager.setChannel(str);
            return;
        }
        throw new IllegalStateException("please call before init");
    }

    public static void setConfigUpdateListener(AbstractC29759e eVar) {
        if (eVar == null) {
            sConfigUpdateListener = null;
        } else {
            sConfigUpdateListener = new WeakReference<>(eVar);
        }
    }

    public static void setStartLogReaperDelay(long j) {
        if (j > 0) {
            sStartLogReaperDelay = j;
        }
    }

    public static void setUseGoogleAdId(boolean z) {
        if (!sInitGuard) {
            DeviceRegisterManager.setUseGoogleAdId(z);
            return;
        }
        throw new IllegalStateException("please call before init");
    }

    public static void setUserId(long j) {
        sUserId.set(j);
        AppLog appLog = sInstance;
        if (appLog != null) {
            appLog.notifyConfigUpdate();
        }
    }

    static void tryReportEventDiscard(final int i) {
        runOnUIThread(new Runnable() {
            /* class com.p2082ss.android.common.applog.AppLog.RunnableC297451 */

            static {
                Covode.recordClassIndex(36147);
            }

            public final void run() {
            }
        });
    }

    static void tryReportLogExpired(final List<Long> list) {
        if (!C13603b.m24435a((Collection) list)) {
            runOnUIThread(new Runnable() {
                /* class com.p2082ss.android.common.applog.AppLog.RunnableC297494 */

                static {
                    Covode.recordClassIndex(36151);
                }

                public final void run() {
                    AbstractC29764j jVar = AppLog.sTraceCallback;
                    if (jVar != null) {
                        jVar.onEventExpired(list);
                    }
                }
            });
        }
    }

    static void tryReportTerminateLost(final List<String> list) {
        if (!C13603b.m24435a((Collection) list)) {
            runOnUIThread(new Runnable() {
                /* class com.p2082ss.android.common.applog.AppLog.RunnableC297505 */

                static {
                    Covode.recordClassIndex(36152);
                }

                public final void run() {
                    AbstractC29764j jVar = AppLog.sTraceCallback;
                    if (jVar != null) {
                        for (String str : list) {
                            jVar.mo52026a("terminate", str, "");
                        }
                    }
                }
            });
        }
    }

    private static void appendParamsToEvent(JSONObject jSONObject) {
        if (jSONObject != null && !jSONObject.has("ab_sdk_version") && !TextUtils.isEmpty(sAbSDKVersion)) {
            try {
                jSONObject.put("ab_sdk_version", sAbSDKVersion);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_isNetworkAvailable */
    public static boolean m59935xd61d0f33(Context context) {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable = m59934x7ac04bdb(context);
        C58029j.f132253e = com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable;
        return com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable;
    }

    private void initDataFromSp(Context context) {
        loadSSIDs();
        loadGlobalEventIndex();
        boolean z = false;
        if (C34822d.m71158a(this.mContext, C29866a.f71244a, 0).getInt("forbid_report_phone_detail_info", 0) > 0) {
            z = true;
        }
        this.mForbidReportPhoneDetailInfo = z;
    }

    public static void onPause(Context context) {
        if (context instanceof Activity) {
            onPause(context, context.getClass().getName(), context.hashCode());
        }
    }

    public static void onResume(Context context) {
        if (context instanceof Activity) {
            onResume(context, context.getClass().getName(), context.hashCode());
        }
        if (!sHasManualInvokeActiveUser) {
            activeUserInvokeInternal(m59937x1d84dfa8(context));
        }
    }

    private static void runOnUIThread(Runnable runnable) {
        if (runnable != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                sHandler.post(runnable);
            }
        }
    }

    static void tryPutEventIndex(JSONObject jSONObject) {
        if (sInstance != null) {
            try {
                jSONObject.put("tea_event_index", sInstance.mGlobalEventIndexMatrix.getAndIncrement());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateAppLanguageAndRegion(JSONObject jSONObject) {
        String optString = jSONObject.optString("app_language", null);
        String optString2 = jSONObject.optString("app_region", null);
        if (updateAppLanguage(optString) || updateAppRegion(optString2)) {
            DeviceRegisterManager.updateDeviceInfo();
        }
    }

    /* access modifiers changed from: package-private */
    public void addCustomerHeader(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putAll(bundle);
            C29755a aVar = new C29755a(EnumC29756b.CUSTOMER_HEADER_UPDATE);
            aVar.f70949b = bundle2;
            enqueue(aVar);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void doSaveDnsReportTime(long j) {
        SharedPreferences.Editor edit = C34822d.m71158a(this.mContext, C29866a.f71244a, 0).edit();
        edit.putLong("dns_report_time", j);
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    public void handleImageSample(C29763i iVar) {
        if (this.mSamples.size() >= 5) {
            this.mSamples.removeFirst();
        }
        this.mSamples.add(iVar);
    }

    /* access modifiers changed from: package-private */
    public void onActivityResume(C29758d dVar) {
        if (this.mInitOk && dVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.mActivityTime = currentTimeMillis;
            this.mActivityRecord = dVar;
            Logger.debug();
            C29755a aVar = new C29755a(EnumC29756b.PAGE_START);
            aVar.f70950c = currentTimeMillis;
            enqueue(aVar);
        }
    }

    public static void AppLog__getSSIDs$___twin___(Map<String, String> map) {
        AppLog appLog;
        MethodCollector.m26663i(6788);
        synchronized (sLock) {
            try {
                if (!sStopped) {
                    appLog = sInstance;
                } else {
                    appLog = null;
                }
            } finally {
                MethodCollector.m26664o(6788);
            }
        }
        if (appLog == null) {
            MethodCollector.m26664o(6788);
            return;
        }
        DeviceRegisterManager.getSSIDs(map);
        String valueOf = String.valueOf(sUserId.get());
        if (valueOf != null) {
            map.put("user_id", valueOf);
        }
    }

    public static void addSessionHook(AbstractC29762h hVar) {
        MethodCollector.m26663i(9211);
        if (hVar == null) {
            MethodCollector.m26664o(9211);
            return;
        }
        List<AbstractC29762h> list = sSessionHookList;
        synchronized (list) {
            try {
                if (!list.contains(hVar)) {
                    list.add(hVar);
                    MethodCollector.m26664o(9211);
                }
            } finally {
                MethodCollector.m26664o(9211);
            }
        }
    }

    private void notifySessionStart(long j) {
        MethodCollector.m26663i(13606);
        List<AbstractC29762h> list = sSessionHookList;
        if (list == null) {
            MethodCollector.m26664o(13606);
            return;
        }
        synchronized (list) {
            try {
                for (AbstractC29762h hVar : list) {
                    hVar.mo29089a(j);
                }
            } finally {
                MethodCollector.m26664o(13606);
            }
        }
    }

    public static void onActivityCreate(Context context) {
        if (context instanceof Activity) {
            sLastCreateActivityName = context.getClass().getName();
            sLastCreateActivityNameAndTime = sLastCreateActivityName + "(" + String.valueOf(System.currentTimeMillis()) + ")";
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setAppTrack(org.json.JSONObject r5) {
        /*
            r4 = 6648(0x19f8, float:9.316E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            com.ss.android.common.applog.AppLog r3 = com.p2082ss.android.common.applog.AppLog.sInstance
            if (r3 == 0) goto L_0x002e
            java.lang.Object r2 = com.p2082ss.android.common.applog.AppLog.sLock
            monitor-enter(r2)
            if (r5 != 0) goto L_0x0013
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0013:
            org.json.JSONObject r1 = r3.mHeader     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x001c
            java.lang.String r0 = "app_track"
            r1.put(r0, r5)     // Catch:{ all -> 0x0023 }
        L_0x001c:
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0023 }
            r3.saveAppTrack(r0)     // Catch:{ all -> 0x0023 }
        L_0x0023:
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        L_0x0028:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        L_0x002e:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.AppLog.setAppTrack(org.json.JSONObject):void");
    }

    public static void setCustomerHeader(Bundle bundle) {
        MethodCollector.m26663i(6790);
        if (bundle != null) {
            try {
                if (bundle.size() > 0) {
                    AppLog appLog = sInstance;
                    if (appLog != null) {
                        appLog.addCustomerHeader(bundle);
                    } else {
                        Bundle bundle2 = sCustomBundle;
                        synchronized (bundle2) {
                            try {
                                bundle2.putAll(bundle);
                            } catch (Throwable th) {
                                MethodCollector.m26664o(6790);
                                throw th;
                            }
                        }
                    }
                    DeviceRegisterManager.addCustomerHeaser(bundle);
                    MethodCollector.m26664o(6790);
                    return;
                }
            } catch (Throwable unused) {
                MethodCollector.m26664o(6790);
                return;
            }
        }
        MethodCollector.m26664o(6790);
    }

    public static void setGoogleAId(String str) {
        if (!C13627m.m24498a(str)) {
            if (!C13627m.m24498a(str) && !str.equals(C29734b.f70907a)) {
                C29734b.f70907a = str;
            }
            AppLog appLog = sInstance;
            if (appLog != null) {
                C29755a aVar = new C29755a(EnumC29756b.UPDATE_GOOGLE_AID);
                aVar.f70949b = str;
                appLog.enqueue(aVar);
            }
        }
    }

    public static void setWhiteEventFilterForChildMode(List<String> list) {
        C29768c cVar;
        if (list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                cVar = new C29768c(hashSet);
                sChildModeWhiteEventFilter = cVar;
            }
        }
        cVar = null;
        sChildModeWhiteEventFilter = cVar;
    }

    /* access modifiers changed from: package-private */
    public void enqueue(C29755a aVar) {
        MethodCollector.m26663i(12259);
        if (aVar == null) {
            MethodCollector.m26664o(12259);
            return;
        }
        synchronized (this.mQueue) {
            try {
                if (!sStopped) {
                    if (this.mQueue.size() >= 2000) {
                        this.mQueue.poll();
                    }
                    this.mQueue.add(aVar);
                    this.mQueue.notify();
                    MethodCollector.m26664o(12259);
                }
            } finally {
                MethodCollector.m26664o(12259);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void updateUserAgentString(String str) {
        Context context = this.mContext;
        if (!C13627m.m24498a(str) && !str.equals(C29869d.f71255i)) {
            C29869d.f71255i = str;
            SharedPreferences.Editor edit = C29866a.m60186a(context).edit();
            edit.putString("user_agent", str);
            edit.commit();
        }
    }

    public static void activeUserInvokeInternal(Context context) {
        MethodCollector.m26663i(9292);
        if (!sHasLoadDid) {
            synchronized (AppLog.class) {
                try {
                    if (!sHasLoadDid) {
                        sPendingActiveUser = true;
                        return;
                    }
                } finally {
                    MethodCollector.m26664o(9292);
                }
            }
        }
        sPendingActiveUser = false;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sFetchActiveTime < 900000 || !m59935xd61d0f33(context)) {
            MethodCollector.m26664o(9292);
            return;
        }
        sFetchActiveTime = currentTimeMillis;
        new C29743a.C29744a(context, ACTIVE_USER_URL(), sChildMode).start();
        MethodCollector.m26664o(9292);
    }

    private void doClearWhenSwitchChildMode(boolean z) {
        boolean z2;
        DeviceRegisterManager.clearWhenSwitchChildMode(z);
        if (z) {
            this.mHeader.remove("openudid");
            this.mHeader.remove("google_aid");
            this.mHeader.remove("device_id");
            this.mHeader.remove("install_id");
        }
        updateHeader(this.mContext, z);
        C29786d.m59984a(this.mContext).mo52063b();
        C29802p pVar = this.mSession;
        if (pVar != null) {
            z2 = pVar.f71118i;
        } else {
            z2 = true;
        }
        this.mSession = null;
        tryExtendSession(System.currentTimeMillis(), z2);
    }

    public static AppLog getInstance(Context context) {
        MethodCollector.m26663i(12121);
        if (sInitGuard || !Logger.debug()) {
            synchronized (sLock) {
                try {
                    if (sStopped) {
                        return null;
                    }
                    if (sInstance == null) {
                        sInstance = new AppLog(context);
                        Logger.debug();
                    }
                    AppLog appLog = sInstance;
                    MethodCollector.m26664o(12121);
                    return appLog;
                } finally {
                    MethodCollector.m26664o(12121);
                }
            }
        } else {
            RuntimeException runtimeException = new RuntimeException("please call after init");
            MethodCollector.m26664o(12121);
            throw runtimeException;
        }
    }

    private boolean updateAppLanguage(String str) {
        if (C13627m.m24498a(str)) {
            return false;
        }
        try {
            if (!str.equals(this.mHeader.optString("app_language", null))) {
                this.mHeader.put("app_language", str);
                if (this.mLogReaper != null) {
                    this.mLogReaper.mo52076a(new JSONObject(this.mHeader, C29785c.f71033a));
                }
                C34822d.m71158a(this.mContext, C29866a.f71244a, 0).edit().putString("app_language", str).commit();
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private boolean updateAppRegion(String str) {
        if (C13627m.m24498a(str)) {
            return false;
        }
        try {
            if (!str.equals(this.mHeader.optString("app_region", null))) {
                this.mHeader.put("app_region", str);
                if (this.mLogReaper != null) {
                    this.mLogReaper.mo52076a(new JSONObject(this.mHeader, C29785c.f71033a));
                }
                C34822d.m71158a(this.mContext, C29866a.f71244a, 0).edit().putString("app_region", str).commit();
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private void updateCustomerHeader(Bundle bundle) {
        if (bundle != null && bundle.size() > 0 && this.mLogReaper != null) {
            try {
                JSONObject optJSONObject = this.mHeader.optJSONObject("custom");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                for (String str : bundle.keySet()) {
                    optJSONObject.put(str, m59936x1e1b0e3e(bundle, str));
                }
                this.mHeader.put("custom", optJSONObject);
                if (this.mLogReaper != null) {
                    this.mLogReaper.mo52076a(new JSONObject(this.mHeader, C29785c.f71033a));
                }
                ensureHeaderCopy();
            } catch (Throwable unused) {
            }
        }
    }

    private void updateDid(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean isBadDeviceId = isBadDeviceId(this.mHeader.optString("device_id", null));
            String optString = jSONObject.optString("device_id", null);
            String optString2 = jSONObject.optString("install_id", null);
            if (!C13627m.m24498a(optString)) {
                try {
                    this.mHeader.put("device_id", optString);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (!C13627m.m24498a(optString2)) {
                try {
                    this.mHeader.put("install_id", optString2);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            if (this.mLogReaper != null) {
                try {
                    this.mLogReaper.mo52076a(new JSONObject(this.mHeader, C29785c.f71033a));
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
            ensureHeaderCopy();
            tryUpdateConfig(true, true, isBadDeviceId);
        }
    }

    private void updateGoogleAID(String str) {
        if (!C13627m.m24498a(str) && this.mLogReaper != null) {
            try {
                if (!str.equals(this.mHeader.optString("google_aid", null))) {
                    if (!sChildMode) {
                        this.mHeader.put("google_aid", str);
                        if (this.mLogReaper != null) {
                            this.mLogReaper.mo52076a(new JSONObject(this.mHeader, C29785c.f71033a));
                        }
                    }
                    C34822d.m71158a(this.mContext, C29866a.f71244a, 0).edit().putString("google_aid", str).commit();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void enqueue(AbstractC29798l lVar) {
        MethodCollector.m26663i(12260);
        if (lVar == null) {
            MethodCollector.m26664o(12260);
            return;
        }
        this.mHeartbeatTime = System.currentTimeMillis();
        synchronized (this.mLogQueue) {
            try {
                if (this.mLogQueue.size() >= 2000) {
                    this.mLogQueue.poll();
                }
                this.mLogQueue.add(lVar);
                this.mLogQueue.notify();
            } finally {
                MethodCollector.m26664o(12260);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void handleEvent(C29794h hVar) {
        notifyOnEvent(hVar);
        boolean z = true;
        tryExtendSession(hVar.f71071h, true);
        if (this.mSession == null) {
            tryReportEventDiscard(4);
            return;
        }
        if ("event_v3".equalsIgnoreCase(hVar.f71065b)) {
            hVar.f71076m = this.mGlobalEventIndexMatrix.getAndIncrement();
        } else {
            hVar.f71076m = this.mGlobalEventIndexMatrixV1.getAndIncrement();
        }
        hVar.f71072i = this.mSession.f71110a;
        if (!handleEventTimely(hVar)) {
            long a = C29786d.m59984a(this.mContext).mo52053a(hVar);
            if (a > 0) {
                hVar.f71064a = a;
                sendHeartbeat();
            }
            if (a <= 0) {
                z = false;
            }
            tryReportEventInsertResult(z, hVar.f71076m);
        }
    }

    /* access modifiers changed from: package-private */
    public void onActivityPause(C29758d dVar) {
        if (this.mInitOk && dVar != null) {
            String str = dVar.f70975b;
            long currentTimeMillis = System.currentTimeMillis();
            C29758d dVar2 = this.mActivityRecord;
            if (dVar2 == null || dVar2.f70974a != dVar.f70974a) {
                this.mActivityTime = currentTimeMillis - 1010;
            }
            this.mActivityRecord = null;
            int i = (int) ((currentTimeMillis - this.mActivityTime) / 1000);
            if (i <= 0) {
                i = 1;
            }
            this.mActivityTime = currentTimeMillis;
            Logger.debug();
            C29796j jVar = new C29796j();
            jVar.f71083a = str;
            jVar.f71084b = i;
            C29755a aVar = new C29755a(EnumC29756b.PAGE_END);
            aVar.f70949b = jVar;
            aVar.f70950c = currentTimeMillis;
            enqueue(aVar);
        }
    }

    private AppLog(Context context) {
        DeviceRegisterManager.setSDKVersion("2.5.6.3");
        Context com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = m59937x1d84dfa8(context);
        this.mContext = com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext;
        DeviceRegisterManager.setContext(com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext);
        this.mHeader = new JSONObject();
        initDataFromSp(context);
        this.mInitOk = true;
        new C29757c().start();
        this.mNetWorkMonitor = new C13582a(com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext);
    }

    private boolean handleEventTimely(final C29794h hVar) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (hVar != null && !hVar.f71075l) {
                if (currentTimeMillis - this.mStartWaitSendTimely >= 900000) {
                    if ("event_v3".equalsIgnoreCase(hVar.f71065b) && (concurrentHashMap = this.mEventTimely) != null && concurrentHashMap.size() > 0 && !C13627m.m24498a(hVar.f71066c) && this.mEventTimely.containsKey(hVar.f71066c) && !C13627m.m24498a(hVar.f71073j)) {
                        JSONObject jSONObject = new JSONObject(hVar.f71073j);
                        if (jSONObject.optInt("_event_v3", 0) == 1) {
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = new JSONObject();
                            if (jSONObject.has("nt")) {
                                jSONObject3.put("nt", jSONObject.optInt("nt"));
                            }
                            if (hVar.f71070g > 0) {
                                jSONObject3.put("user_id", hVar.f71070g);
                            }
                            jSONObject.remove("nt");
                            jSONObject.remove("_event_v3");
                            jSONObject3.put("event", hVar.f71066c);
                            jSONObject3.put("params", jSONObject);
                            jSONObject3.put("session_id", hVar.f71072i);
                            jSONObject3.put("datetime", formatDate(hVar.f71071h));
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject3);
                            jSONObject2.put("event_v3", jSONArray);
                            JSONObject jSONObject4 = this.mTimeSync;
                            if (jSONObject4 != null) {
                                jSONObject2.put("time_sync", jSONObject4);
                            }
                            jSONObject2.put("magic_tag", "ss_app_log");
                            jSONObject2.put("header", this.mHeader);
                            jSONObject2.put("_gen_time", System.currentTimeMillis());
                            final String jSONObject5 = jSONObject2.toString();
                            new RunnableC13596e() {
                                /* class com.p2082ss.android.common.applog.AppLog.C297527 */

                                static {
                                    Covode.recordClassIndex(36154);
                                }

                                @Override // com.bytedance.common.utility.p907b.RunnableC13596e
                                public final void run() {
                                    super.run();
                                    try {
                                        if (!AppLog.this.sendTimelyEvent(jSONObject5)) {
                                            C29794h hVar = new C29794h();
                                            hVar.f71065b = hVar.f71065b;
                                            hVar.f71066c = hVar.f71066c;
                                            hVar.f71067d = hVar.f71067d;
                                            hVar.f71068e = hVar.f71068e;
                                            hVar.f71069f = hVar.f71069f;
                                            hVar.f71075l = true;
                                            hVar.f71070g = hVar.f71070g;
                                            hVar.f71073j = hVar.f71073j;
                                            hVar.f71074k = hVar.f71074k;
                                            hVar.f71071h = hVar.f71071h;
                                            C29755a aVar = new C29755a(EnumC29756b.EVENT);
                                            aVar.f70949b = hVar;
                                            AppLog.this.enqueue(aVar);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }.mo21860a();
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7 A[Catch:{ Exception -> 0x00e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    void loadStats(com.p2082ss.android.common.applog.C29802p r13) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.AppLog.loadStats(com.ss.android.common.applog.p):void");
    }

    public boolean sendTimelyEvent(String str) {
        int responseCode;
        String str2;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            if (!(APPLOG_TIMELY_URL() == null || APPLOG_TIMELY_URL().length == 0)) {
                for (String str3 : APPLOG_TIMELY_URL()) {
                    String a = C29803q.m60030a(str3, true);
                    byte[] bArr = (byte[]) bytes.clone();
                    if (this.mContext != null && getLogEncryptSwitch()) {
                        try {
                            str2 = C29803q.m60031a(a, bArr, this.mContext, false, null);
                        } catch (RuntimeException unused) {
                        }
                        if (str2 == null && str2.length() != 0) {
                            JSONObject jSONObject = new JSONObject(str2);
                            if (!"ss_app_log".equals(jSONObject.optString("magic_tag")) || !"success".equals(jSONObject.optString("message"))) {
                                return false;
                            }
                            return true;
                        }
                    }
                    str2 = AbstractC13621j.f33100a.mo21876a(a, bytes, true, "application/octet-stream;tt-data=b");
                    if (str2 == null) {
                    }
                }
            }
        } catch (Throwable th) {
            if ((th instanceof C13585b) && (responseCode = th.getResponseCode()) >= 500 && responseCode < 600) {
                this.mStartWaitSendTimely = System.currentTimeMillis();
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void processItem(C29755a aVar) {
        long j;
        if (this.mInitOk && !sStopped) {
            while (C29822b.f71163a) {
                C29822b.m60079a();
            }
            String str = "";
            boolean z = true;
            boolean z2 = false;
            switch (C297472.f70934a[aVar.f70948a.ordinal()]) {
                case 1:
                    tryExtendSession(aVar.f70950c, false);
                    long j2 = aVar.f70950c;
                    C29802p pVar = this.mSession;
                    if (pVar != null) {
                        str = pVar.f71111b;
                    }
                    HandlerThreadC29808t.m60042a().mo52080a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0121: INVOKE  
                          (wrap: com.ss.android.common.applog.t : 0x0118: INVOKE  (r1v2 com.ss.android.common.applog.t) =  type: STATIC call: com.ss.android.common.applog.t.a():com.ss.android.common.applog.t)
                          (wrap: com.ss.android.common.applog.b.c$2 : 0x011e: CONSTRUCTOR  (r0v22 com.ss.android.common.applog.b.c$2) = 
                          (wrap: com.ss.android.common.applog.b.c : 0x0114: INVOKE  (r2v7 com.ss.android.common.applog.b.c) = 
                          (wrap: android.content.Context : 0x0112: IGET  (r0v21 android.content.Context) = (r9v0 'this' com.ss.android.common.applog.AppLog A[IMMUTABLE_TYPE, THIS]) com.ss.android.common.applog.AppLog.mContext android.content.Context)
                         type: STATIC call: com.ss.android.common.applog.b.c.a(android.content.Context):com.ss.android.common.applog.b.c)
                          (r3v1 'j2' long)
                          (r5v4 'str' java.lang.String)
                         call: com.ss.android.common.applog.b.c.2.<init>(com.ss.android.common.applog.b.c, long, java.lang.String):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.ss.android.common.applog.t.a(java.lang.Runnable):void in method: com.ss.android.common.applog.AppLog.processItem(com.ss.android.common.applog.AppLog$a):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:274)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x011e: CONSTRUCTOR  (r0v22 com.ss.android.common.applog.b.c$2) = 
                          (wrap: com.ss.android.common.applog.b.c : 0x0114: INVOKE  (r2v7 com.ss.android.common.applog.b.c) = 
                          (wrap: android.content.Context : 0x0112: IGET  (r0v21 android.content.Context) = (r9v0 'this' com.ss.android.common.applog.AppLog A[IMMUTABLE_TYPE, THIS]) com.ss.android.common.applog.AppLog.mContext android.content.Context)
                         type: STATIC call: com.ss.android.common.applog.b.c.a(android.content.Context):com.ss.android.common.applog.b.c)
                          (r3v1 'j2' long)
                          (r5v4 'str' java.lang.String)
                         call: com.ss.android.common.applog.b.c.2.<init>(com.ss.android.common.applog.b.c, long, java.lang.String):void type: CONSTRUCTOR in method: com.ss.android.common.applog.AppLog.processItem(com.ss.android.common.applog.AppLog$a):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 24 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.common.applog.b.c, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 30 more
                        */
                    /*
                    // Method dump skipped, instructions count: 418
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.AppLog.processItem(com.ss.android.common.applog.AppLog$a):void");
                }

                public static void appendCommonParams(StringBuilder sb, boolean z) {
                    C29803q.m60033a(sb, z);
                }

                public static String addCommonParams(String str, boolean z) {
                    return C29803q.m60030a(str, z);
                }

                /* renamed from: com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_IntentLancet_get */
                public static Object m59936x1e1b0e3e(Bundle bundle, String str) {
                    try {
                        return bundle.get(str);
                    } catch (Exception | OutOfMemoryError unused) {
                        return null;
                    }
                }

                /* access modifiers changed from: package-private */
                public void tryUpdateConfig(boolean z, boolean z2) {
                    tryUpdateConfig(z, false, z2);
                }

                public static void onEvent(Context context, String str) {
                    onEvent(context, "event_v1", str, null, 0, 0, false, null);
                }

                static void tryReportEventInsertResult(final boolean z, final long j) {
                    runOnUIThread(new Runnable() {
                        /* class com.p2082ss.android.common.applog.AppLog.RunnableC297483 */

                        static {
                            Covode.recordClassIndex(36150);
                        }

                        public final void run() {
                        }
                    });
                }

                static void tryReportLogRequest(final boolean z, final List<Long> list) {
                    runOnUIThread(new Runnable() {
                        /* class com.p2082ss.android.common.applog.AppLog.RunnableC297516 */

                        static {
                            Covode.recordClassIndex(36153);
                        }

                        public final void run() {
                            AbstractC29764j jVar = AppLog.sTraceCallback;
                            if (jVar != null) {
                                jVar.mo52027a(list);
                            }
                        }
                    });
                }

                private void updateHeader(Context context, boolean z) {
                    C29869d.m60195a(context, this.mHeader, z);
                    if (this.mLogReaper != null) {
                        try {
                            this.mLogReaper.mo52076a(new JSONObject(this.mHeader, C29785c.f71033a));
                        } catch (JSONException unused) {
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                public void parseIntSet(HashSet<Integer> hashSet, JSONArray jSONArray) {
                    if (!(hashSet == null || jSONArray == null)) {
                        hashSet.clear();
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            int i2 = jSONArray.getInt(i);
                            if (i2 > 0) {
                                hashSet.add(Integer.valueOf(i2));
                            }
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                public void doRecordMiscLog(String str, JSONObject jSONObject) {
                    long j;
                    try {
                        C29802p pVar = this.mSession;
                        if (pVar != null) {
                            j = pVar.f71110a;
                        } else {
                            j = 0;
                        }
                        if (this.mInitOk && j > 0 && !C13627m.m24498a(str) && jSONObject != null) {
                            C29786d.m59984a(this.mContext).mo52052a(j, str, jSONObject.toString());
                        }
                    } catch (Exception unused) {
                    }
                }

                /* access modifiers changed from: package-private */
                public boolean updateConfig(String str, boolean z) {
                    MethodCollector.m26663i(7915);
                    sIsConfigThread.set(Boolean.TRUE);
                    boolean doUpdateConfig = doUpdateConfig(str, z);
                    Object obj = sLogConfigLock;
                    synchronized (obj) {
                        try {
                            this.mLoadingOnlineConfig = false;
                            try {
                                obj.notifyAll();
                            } catch (Exception unused) {
                            }
                        } finally {
                            MethodCollector.m26664o(7915);
                        }
                    }
                    sIsConfigThread.remove();
                    if (!doUpdateConfig) {
                        notifyRemoteConfigUpdate(false);
                    }
                    return doUpdateConfig;
                }

                private boolean initHeader(JSONObject jSONObject, Context context) {
                    try {
                        JSONArray jSONArray = new JSONArray();
                        if (sMiPushInclude) {
                            jSONArray.put(1);
                        }
                        if (sMyPushInclude) {
                            jSONArray.put(2);
                        }
                        if (sHwPushInclude) {
                            jSONArray.put(7);
                        }
                        if (sMzPushInclude) {
                            jSONArray.put(8);
                        }
                        if (sAliyunPushInclude) {
                            jSONArray.put(9);
                        }
                        jSONObject.put("push_sdk", jSONArray);
                        String userUniqueId = getUserUniqueId();
                        if (!TextUtils.isEmpty(userUniqueId)) {
                            jSONObject.put("user_unique_id", userUniqueId);
                        }
                    } catch (Exception unused) {
                    }
                    return C29869d.m60195a(context, jSONObject, sChildMode);
                }

                /* access modifiers changed from: package-private */
                public void handlePageEnd(C29796j jVar, long j) {
                    C29802p pVar = this.mSession;
                    if (pVar != null && !pVar.f71118i) {
                        this.mSession.f71120k = false;
                        this.mSession.f71117h = j;
                        jVar.f71085c = this.mSession.f71110a;
                        C29786d.m59984a(this.mContext).mo52054a(jVar, j);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            int i = this.mImageSuccessCount.get();
                            int i2 = this.mImageFailureCount.get();
                            jSONObject.put("session_id", this.mSession.f71111b);
                            jSONObject.put("cnt_success", i);
                            jSONObject.put("cnt_failure", i2);
                            JSONArray jSONArray = new JSONArray();
                            Iterator<C29763i> it = this.mSamples.iterator();
                            while (it.hasNext()) {
                                C29763i next = it.next();
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("url", next.f70976a);
                                jSONObject2.put("networktype", next.f70977b);
                                jSONObject2.put("time", next.f70978c);
                                jSONObject2.put("timestamp", next.f70979d);
                                jSONArray.put(jSONObject2);
                            }
                            if (jSONArray.length() > 0) {
                                jSONObject.put("samples", jSONArray);
                            }
                            SharedPreferences.Editor edit = C34822d.m71158a(this.mContext, C29866a.f71244a, 0).edit();
                            edit.putString("stats_value", jSONObject.toString());
                            edit.commit();
                        } catch (Exception unused) {
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                public void tryExtendSession(long j, boolean z) {
                    C29786d a = C29786d.m59984a(this.mContext);
                    C29802p pVar = this.mSession;
                    if (pVar != null && (pVar.f71120k || j - this.mSession.f71117h < this.mSessionInterval)) {
                        if (this.mSession.f71118i) {
                            if (z) {
                                return;
                            }
                        } else if (!z) {
                            this.mSession.f71120k = true;
                            this.mSession.f71117h = j;
                            return;
                        } else {
                            return;
                        }
                    }
                    onSessionEnd();
                    C29802p pVar2 = this.mSession;
                    C29802p pVar3 = new C29802p();
                    pVar3.f71111b = genSession();
                    pVar3.f71112c = j;
                    resetEventIndex();
                    pVar3.f71113d = this.mGlobalEventIndexMatrix.getAndIncrement();
                    pVar3.f71117h = pVar3.f71112c;
                    pVar3.f71114e = 0;
                    pVar3.f71115f = C29869d.f71249c;
                    pVar3.f71116g = C29869d.m60189a();
                    pVar3.f71118i = z;
                    if (!z) {
                        pVar3.f71120k = true;
                    }
                    long a2 = a.mo52055a(pVar3);
                    if (a2 > 0) {
                        pVar3.f71110a = a2;
                        this.mSession = pVar3;
                        notifySessionStart(a2);
                    } else {
                        this.mSession = null;
                    }
                    if (pVar2 != null || this.mSession != null) {
                        C29800n nVar = new C29800n();
                        nVar.f71088a = pVar2;
                        if (mLaunchFrom <= 0) {
                            mLaunchFrom = 6;
                        }
                        C29802p pVar4 = this.mSession;
                        if (pVar4 != null && !pVar4.f71118i) {
                            nVar.f71089b = this.mSession;
                        }
                        enqueue(nVar);
                    }
                }

                /* access modifiers changed from: package-private */
                public boolean doUpdateConfig(String str, boolean z) {
                    boolean z2;
                    int responseCode;
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (sEventFilterEnable > 0) {
                            jSONObject.put("event_filter", sEventFilterEnable);
                        }
                        String[] strArr = null;
                        if (getLogEncryptSwitch() && (strArr = C29879c.m60225a()) != null) {
                            jSONObject.put("key", strArr[0]);
                            jSONObject.put("iv", strArr[1]);
                        }
                        byte[] bytes = jSONObject.toString().getBytes("UTF-8");
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - mLastGetAppConfigTime < 600000) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        mLastGetAppConfigTime = currentTimeMillis;
                        int i = 0;
                        boolean z3 = false;
                        while (true) {
                            byte[] bArr = (byte[]) bytes.clone();
                            String APPLOG_CONFIG_URL = APPLOG_CONFIG_URL();
                            if (z3) {
                                APPLOG_CONFIG_URL = APPLOG_CONFIG_URL_FALLBACK();
                            }
                            String a = C29803q.m60030a(APPLOG_CONFIG_URL, true);
                            try {
                                String str2 = "application/octet-stream;tt-data=b";
                                if (this.mContext == null || !getLogEncryptSwitch()) {
                                    if (z2) {
                                        a = a + "&config_retry=b";
                                    }
                                    str2 = AbstractC13621j.f33100a.mo21876a(a, bytes, true, str2);
                                } else {
                                    try {
                                        str2 = C29803q.m60031a(a, bArr, this.mContext, z2, strArr);
                                    } catch (RuntimeException unused) {
                                        if (z2) {
                                            a = a + "&config_retry=b";
                                        }
                                        str2 = AbstractC13621j.f33100a.mo21876a(a, bytes, true, str2);
                                    }
                                }
                                if (str2 != null && str2.length() != 0) {
                                    JSONObject jSONObject2 = new JSONObject(str2);
                                    if (!"ss_app_log".equals(jSONObject2.optString("magic_tag"))) {
                                        return false;
                                    }
                                    C29755a aVar = new C29755a(EnumC29756b.CONFIG_UPDATE);
                                    aVar.f70949b = jSONObject2;
                                    aVar.f70951d = String.valueOf(z);
                                    enqueue(aVar);
                                    return true;
                                }
                            } catch (Throwable th) {
                                if ((th instanceof C13585b) && (responseCode = th.getResponseCode()) >= 500 && responseCode < 600) {
                                    this.mUpdateConfigTime = System.currentTimeMillis();
                                    this.mLastConfigVersion = this.mVersionCode;
                                    SharedPreferences.Editor edit = C34822d.m71158a(this.mContext, C29866a.f71244a, 0).edit();
                                    edit.putLong("app_log_last_config_time", this.mUpdateConfigTime);
                                    edit.putInt("app_log_last_config_version", this.mLastConfigVersion);
                                    edit.commit();
                                    throw th;
                                } else if (i <= 0) {
                                    i++;
                                    z3 = true;
                                    if (i >= 2) {
                                        break;
                                    }
                                } else {
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                    return false;
                }

                /* access modifiers changed from: package-private */
                /* JADX WARNING: Removed duplicated region for block: B:42:0x00ad  */
                /* JADX WARNING: Removed duplicated region for block: B:53:0x00d9  */
                /* JADX WARNING: Removed duplicated region for block: B:56:0x00e6  */
                /* JADX WARNING: Removed duplicated region for block: B:67:0x010a  */
                /* JADX WARNING: Removed duplicated region for block: B:70:0x010f  */
                /* JADX WARNING: Removed duplicated region for block: B:73:0x0116  */
                /* JADX WARNING: Removed duplicated region for block: B:76:0x0133  */
                /* JADX WARNING: Removed duplicated region for block: B:81:0x0147  */
                /* JADX WARNING: Removed duplicated region for block: B:83:0x0165  */
                /* JADX WARNING: Removed duplicated region for block: B:85:0x016c  */
                /* JADX WARNING: Removed duplicated region for block: B:87:0x0175  */
                /* JADX WARNING: Removed duplicated region for block: B:89:0x017e  */
                /* JADX WARNING: Removed duplicated region for block: B:92:0x0194  */
                /* JADX WARNING: Removed duplicated region for block: B:93:0x0197  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void handleConfigUpdate(org.json.JSONObject r18, boolean r19) {
                    /*
                    // Method dump skipped, instructions count: 504
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.AppLog.handleConfigUpdate(org.json.JSONObject, boolean):void");
                }

                /* renamed from: com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_AppLogLancet_recordMiscLog */
                public static void m59933x3ca5bb56(Context context, String str, JSONObject jSONObject) {
                    if (!C80580in.m139687c()) {
                        AppLog__recordMiscLog$___twin___(context, str, jSONObject);
                    }
                }

                private void doResetWhenSwitchChildMode(boolean z, long j, AbstractC29900f fVar) {
                    new C29743a.C29744a(this.mContext, ACTIVE_USER_URL(), z).start();
                    DeviceRegisterManager.resetDidWhenSwitchChildMode(z, j, fVar);
                    updateHeader(this.mContext, z);
                }

                public static void onEvent(Context context, String str, String str2) {
                    onEvent(context, "event_v1", str, str2, 0, 0, false, null);
                }

                private static boolean optBoolean(JSONObject jSONObject, String str, boolean z) {
                    if (jSONObject == null || jSONObject.isNull(str)) {
                        return z;
                    }
                    int optInt = jSONObject.optInt(str, -1);
                    if (optInt > 0) {
                        return true;
                    }
                    if (optInt == 0) {
                        return false;
                    }
                    return jSONObject.optBoolean(str, z);
                }

                public static void init(Context context, boolean z, C29810v vVar) {
                    if (vVar != null) {
                        urlConfig = vVar;
                        setDeviceRegisterURL(vVar.f71142e);
                        sInitGuard = true;
                        if (context instanceof Activity) {
                            sInitWithActivity = true;
                        }
                        getInstance(context);
                        if (!mHasHandledCache) {
                            mHasHandledCache = true;
                            
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: INVOKE  
                                  (wrap: com.ss.android.common.applog.b$1 : 0x0021: CONSTRUCTOR  (r0v5 com.ss.android.common.applog.b$1) = 
                                  (wrap: com.ss.android.common.applog.b : 0x001b: INVOKE  (r1v1 com.ss.android.common.applog.b) =  type: STATIC call: com.ss.android.common.applog.b.a():com.ss.android.common.applog.b)
                                 call: com.ss.android.common.applog.b.1.<init>(com.ss.android.common.applog.b):void type: CONSTRUCTOR)
                                 type: VIRTUAL call: com.bytedance.common.utility.b.e.a():void in method: com.ss.android.common.applog.AppLog.init(android.content.Context, boolean, com.ss.android.common.applog.v):void, file: classes.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0021: CONSTRUCTOR  (r0v5 com.ss.android.common.applog.b$1) = 
                                  (wrap: com.ss.android.common.applog.b : 0x001b: INVOKE  (r1v1 com.ss.android.common.applog.b) =  type: STATIC call: com.ss.android.common.applog.b.a():com.ss.android.common.applog.b)
                                 call: com.ss.android.common.applog.b.1.<init>(com.ss.android.common.applog.b):void type: CONSTRUCTOR in method: com.ss.android.common.applog.AppLog.init(android.content.Context, boolean, com.ss.android.common.applog.v):void, file: classes.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 26 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.common.applog.b, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 32 more
                                */
                            /*
                                if (r5 == 0) goto L_0x0033
                                com.p2082ss.android.common.applog.AppLog.urlConfig = r5
                                java.lang.String[] r0 = r5.f71142e
                                setDeviceRegisterURL(r0)
                                r2 = 1
                                com.p2082ss.android.common.applog.AppLog.sInitGuard = r2
                                boolean r0 = r3 instanceof android.app.Activity
                                if (r0 == 0) goto L_0x0012
                                com.p2082ss.android.common.applog.AppLog.sInitWithActivity = r2
                            L_0x0012:
                                getInstance(r3)
                                boolean r0 = com.p2082ss.android.common.applog.AppLog.mHasHandledCache
                                if (r0 != 0) goto L_0x0027
                                com.p2082ss.android.common.applog.AppLog.mHasHandledCache = r2
                                com.ss.android.common.applog.b r1 = com.p2082ss.android.common.applog.C29770b.m59970a()
                                com.ss.android.common.applog.b$1 r0 = new com.ss.android.common.applog.b$1
                                r0.<init>()
                                r0.mo21860a()
                            L_0x0027:
                                r0 = r4 ^ 1
                                com.p2082ss.android.common.applog.AppLog.sHasManualInvokeActiveUser = r0
                                com.p2082ss.android.common.applog.AppLog.mLaunchFrom = r2
                                com.p2082ss.android.common.applog.ApplogServiceImpl.isServicePrepared = r2
                                com.p2082ss.android.common.applog.ApplogServiceImpl.handleCachedData()
                                return
                            L_0x0033:
                                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                                java.lang.String r0 = "urlConfig must not be null"
                                r1.<init>(r0)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.AppLog.init(android.content.Context, boolean, com.ss.android.common.applog.v):void");
                        }

                        public static void onPause(Context context, String str, int i) {
                            if (!TextUtils.isEmpty(str)) {
                                C29758d dVar = new C29758d(str, i);
                                AppLog instance = getInstance(context);
                                if (instance != null) {
                                    instance.onActivityPause(dVar);
                                }
                                DeviceRegisterManager.onPause();
                            }
                        }

                        public static void AppLog__recordMiscLog$___twin___(Context context, String str, JSONObject jSONObject) {
                            AppLog appLog;
                            if (!sStopped && !C13627m.m24498a(str) && jSONObject != null && jSONObject.length() > 0 && (appLog = sInstance) != null) {
                                try {
                                    if (RunnableC29791f.m60009a().f71059b) {
                                        jSONObject.put("log_type", str);
                                        JSONArray jSONArray = new JSONArray();
                                        jSONArray.put(jSONObject);
                                        RunnableC29791f.m60009a().mo52073a("log_data", jSONArray);
                                    }
                                } catch (Exception unused) {
                                }
                                C29755a aVar = new C29755a(EnumC29756b.SAVE_MISC_LOG);
                                aVar.f70951d = str;
                                aVar.f70949b = jSONObject;
                                appLog.enqueue(aVar);
                            }
                        }

                        public static void onResume(Context context, String str, int i) {
                            if (!TextUtils.isEmpty(str)) {
                                sLastResumeActivityName = str;
                                sLastResumeActivityNameAndTime = sLastResumeActivityName + "(" + String.valueOf(System.currentTimeMillis()) + ")";
                                C29758d dVar = new C29758d(str, i);
                                AppLog instance = getInstance(context);
                                if (instance != null) {
                                    instance.onActivityResume(dVar);
                                }
                                DeviceRegisterManager.onResume();
                            }
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
                            if (r11 != false) goto L_0x004c;
                         */
                        /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
                        /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
                        /* JADX WARNING: Removed duplicated region for block: B:39:0x0081 A[Catch:{ Exception -> 0x00e1 }, RETURN] */
                        /* JADX WARNING: Removed duplicated region for block: B:40:0x0082 A[Catch:{ Exception -> 0x00e1 }] */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void tryUpdateConfig(boolean r15, boolean r16, final boolean r17) {
                            /*
                            // Method dump skipped, instructions count: 226
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.AppLog.tryUpdateConfig(boolean, boolean, boolean):void");
                        }

                        public static void resetDidWhenSwitchChildMode(Context context, boolean z, long j, AbstractC29900f fVar) {
                            clearOrResetWhenSwitchChildMode(z, EnumC29756b.RESET_WHEN_SWITCH_CHILD_MODE, j, fVar);
                        }

                        /* access modifiers changed from: package-private */
                        /* renamed from: com.ss.android.common.applog.AppLog$i */
                        public static class C29763i {

                            /* renamed from: a */
                            public final String f70976a;

                            /* renamed from: b */
                            public final int f70977b;

                            /* renamed from: c */
                            public final long f70978c;

                            /* renamed from: d */
                            public final long f70979d;

                            static {
                                Covode.recordClassIndex(36165);
                            }

                            public C29763i(String str, int i, long j, long j2) {
                                this.f70976a = str;
                                this.f70977b = i;
                                this.f70978c = j;
                                this.f70979d = j2;
                            }
                        }

                        private static void clearOrResetWhenSwitchChildMode(boolean z, EnumC29756b bVar, long j, AbstractC29900f fVar) {
                            long j2;
                            sChildMode = z;
                            AppLog appLog = sInstance;
                            if (appLog != null) {
                                CountDownLatch countDownLatch = new CountDownLatch(1);
                                C29755a aVar = new C29755a(bVar);
                                if (z) {
                                    j2 = 1;
                                } else {
                                    j2 = 0;
                                }
                                aVar.f70950c = j2;
                                aVar.f70949b = new Pair(fVar, Long.valueOf(j));
                                aVar.f70952e = countDownLatch;
                                appLog.enqueue(aVar);
                                try {
                                    countDownLatch.await();
                                } catch (InterruptedException unused) {
                                }
                            }
                        }

                        public static void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
                            onEvent(context, str, str2, str3, j, j2, false, jSONObject);
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e8, code lost:
                            if (r9 != null) goto L_0x00ea;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:86:0x0145, code lost:
                            if (r0 != null) goto L_0x014c;
                         */
                        /* JADX WARNING: Removed duplicated region for block: B:103:0x01a1 A[Catch:{ JSONException -> 0x0200 }] */
                        /* JADX WARNING: Removed duplicated region for block: B:114:0x01d8 A[Catch:{ JSONException -> 0x0200 }] */
                        /* JADX WARNING: Removed duplicated region for block: B:117:0x01e7 A[Catch:{ JSONException -> 0x0200 }] */
                        /* JADX WARNING: Removed duplicated region for block: B:91:0x0154  */
                        /* JADX WARNING: Removed duplicated region for block: B:92:0x015c  */
                        /* JADX WARNING: Removed duplicated region for block: B:96:0x0167 A[Catch:{ JSONException -> 0x0200 }] */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void AppLog__onEvent$___twin___(java.lang.String r27, java.lang.String r28, java.lang.String r29, long r30, long r32, boolean r34, org.json.JSONObject r35) {
                            /*
                            // Method dump skipped, instructions count: 545
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.AppLog.AppLog__onEvent$___twin___(java.lang.String, java.lang.String, java.lang.String, long, long, boolean, org.json.JSONObject):void");
                        }

                        /* renamed from: com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_onEvent */
                        public static void m59940xfcf5e4c1(AppLog appLog, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
                            InitModules.m105851l();
                            appLog.AppLog__onEvent$___twin___(str, str2, str3, j, j2, z, jSONObject);
                        }

                        /* renamed from: com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_AppLogLancet_onEvent */
                        public static void m59932xd251656a(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
                            if (!"event_v1".equalsIgnoreCase(str) || str2 == null || !C58002a.f132196a.contains(str2)) {
                                if ("event_v3".equalsIgnoreCase(str) && jSONObject != null && jSONObject.has("_staging_flag")) {
                                    jSONObject.remove("_staging_flag");
                                }
                                AppLog__onEvent$___twin___(context, str, str2, str3, j, j2, z, jSONObject);
                            }
                        }

                        /* renamed from: com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent */
                        public static void m59941xb3a627c8(AppLog appLog, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
                            if (jSONObject == null) {
                                m59940xfcf5e4c1(appLog, str, str2, str3, j, j2, z, jSONObject);
                                return;
                            }
                            C61425e<C61421a, Boolean> eVar = new C61425e<>();
                            eVar.f139468a = (Q) new C61421a(str, str2, str3, jSONObject);
                            C61439n.f139485e.mo68815a_(eVar);
                            if (eVar.f139473f != EnumC61424d.INTERCEPT) {
                                m59940xfcf5e4c1(appLog, str, str2, str3, j, j2, z, jSONObject);
                            }
                        }

                        public static void AppLog__onEvent$___twin___(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
                            MethodCollector.m26663i(9362);
                            appendParamsToEvent(jSONObject);
                            AppLog appLog = sInstance;
                            if (appLog == null) {
                                C29770b a = C29770b.m59970a();
                                synchronized (a.f70985a) {
                                    try {
                                        if (a.f70985a.size() > 200) {
                                            a.f70985a.poll();
                                            tryReportEventDiscard(1);
                                        }
                                        a.f70985a.add(new C29770b.C29772a(str, str2, str3, j, j2, z, jSONObject));
                                    } finally {
                                        MethodCollector.m26664o(9362);
                                    }
                                }
                            } else if (C13627m.m24498a(str) || C13627m.m24498a(str2)) {
                                tryReportEventDiscard(0);
                                MethodCollector.m26664o(9362);
                            } else {
                                appLog.onEvent(str, str2, str3, j, j2, z, jSONObject);
                                MethodCollector.m26664o(9362);
                            }
                        }
                    }
