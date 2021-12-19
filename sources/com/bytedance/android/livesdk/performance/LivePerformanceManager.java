package com.bytedance.android.livesdk.performance;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGpuEnableSettings;
import com.bytedance.android.livesdk.livesetting.performance.LivePerformanceSettingSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveThorEnableSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePerformanceMonitorSetting;
import com.bytedance.android.livesdk.model.C9535as;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.p429d.AbstractC6539a;
import com.bytedance.android.livesdk.p425aa.p429d.AbstractC6540b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9084cw;
import com.bytedance.android.livesdk.performance.C10089d;
import com.bytedance.android.livesdk.performance.C10132o;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.AbstractC11795a;
import com.bytedance.android.livesdkapi.host.AbstractC11808h;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4601a.C89041ag;

public class LivePerformanceManager implements AbstractC6539a {
    private static volatile LivePerformanceManager instance;
    private long anchorId;
    private Map<String, String> extraParams;
    public AbstractC11795a fpsMonitorCallback = new AbstractC11795a() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.C100784 */

        static {
            Covode.recordClassIndex(11641);
        }

        @Override // com.bytedance.android.livesdkapi.host.AbstractC11795a
        /* renamed from: a */
        public final void mo16942a(double d, JSONObject jSONObject) {
            if (d > 0.0d && jSONObject != null) {
                C10093f fVar = LivePerformanceManager.this.mDegradeStrategyManager;
                if (C10093f.m18622a()) {
                    boolean a = fVar.f24522a.mo16959a(d);
                    if (fVar.f24523b.mo16959a(d)) {
                        C10093f.m18621a(2);
                        fVar.f24523b.mo16958a();
                        fVar.f24522a.mo16958a();
                    } else if (a) {
                        C10093f.m18621a(1);
                        fVar.f24522a.mo16958a();
                    }
                }
                LivePerformanceManager.this.reportFps(d, jSONObject);
            }
            LivePerformanceManager.this.isFPSMonitoring = false;
            LivePerformanceManager.this.updateLastMonitorTime();
        }
    };
    private Runnable fpsRunnable = new Runnable() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.RunnableC100795 */

        static {
            Covode.recordClassIndex(11642);
        }

        public final void run() {
            if (LivePerformanceManager.this.mPerformanceMonitor != null) {
                LivePerformanceManager.this.mPerformanceMonitor.mo18869a(LivePerformanceManager.this.fpsMonitorCallback);
            }
        }
    };
    private boolean isAnchor;
    public boolean isCollect;
    public volatile boolean isFPSMonitoring;
    public volatile boolean isPerformanceMonitoring;
    public boolean isReport;
    private boolean isTimerMonitoring;
    public String mBatteryInfo;
    public Runnable mCheckBatteryValue = new Runnable() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.RunnableC100839 */

        static {
            Covode.recordClassIndex(11646);
        }

        public final void run() {
            if (C10089d.C10091a.f24519a.f24506b) {
                LivePerformanceManager livePerformanceManager = LivePerformanceManager.this;
                livePerformanceManager.mEnterBatteryInfo = livePerformanceManager.getCurrentBatteryValue();
                return;
            }
            LivePerformanceManager.this.mMainHandler.postDelayed(LivePerformanceManager.this.mCheckBatteryValue, 1000);
        }
    };
    private int[] mCollectionDuration;
    public String mCpuInfo;
    private long mDefaultMinMonitorInterval = 8000;
    private long mDefaultMonitorDelay = 1000;
    private long mDefaultMonitorInterval = 15000;
    public C10093f mDegradeStrategyManager = new C10093f();
    public String mEnterBatteryInfo;
    public Map<String, String> mExtras;
    private long mFpsDefaultDuration = 3000;
    public long mLastCollectTimestamp;
    private long mLastMonitorTimestamp;
    public long mLastReportTimestamp;
    public Handler mMainHandler;
    public String mMemInfo;
    private C10132o mModulesManager = new C10132o();
    public AbstractC11808h mPerformanceMonitor;
    private float mPreviewFps = -1.0f;
    private int[] mReportDuration;
    private String mScene;
    private C9535as mSetting;
    private int mStartBatterLevel = -1;
    private long mStartMonitorTime;
    private double mStreamFps = -1.0d;
    public String mStreamInfo;
    private EnumC11728i mStreamType;
    public String mTemperature;
    private float mVideoCaptureFps = -1.0f;
    public Handler mWorkHandler;
    private HandlerThread mWorkThread;
    private Map<String, Double> nonLiveCpu;
    private Map<String, Long> nonLiveMem;
    private float nonLiveTemperature = -1.0f;
    public final C10125h performanceCache = new C10125h();
    private Runnable performanceCollectRunnable = new Runnable() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.RunnableC100762 */

        static {
            Covode.recordClassIndex(11639);
        }

        public final void run() {
            if (LivePerformanceManager.this.mPerformanceMonitor != null) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    Map<String, Double> a = LivePerformanceManager.this.mPerformanceMonitor.mo18867a();
                    LivePerformanceManager livePerformanceManager = LivePerformanceManager.this;
                    livePerformanceManager.mCpuInfo = livePerformanceManager.getCpuInfo(a, System.currentTimeMillis() - currentTimeMillis);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    Map<String, Long> b = LivePerformanceManager.this.mPerformanceMonitor.mo18870b();
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                    LivePerformanceManager livePerformanceManager2 = LivePerformanceManager.this;
                    livePerformanceManager2.mMemInfo = livePerformanceManager2.getMemInfo(b, currentTimeMillis3);
                    float f = C10089d.C10091a.f24519a.f24507c;
                    LivePerformanceManager.this.mDegradeStrategyManager.mo16957a(f);
                    LivePerformanceManager livePerformanceManager3 = LivePerformanceManager.this;
                    livePerformanceManager3.mTemperature = livePerformanceManager3.getTemperatureInfo(f);
                    LivePerformanceManager livePerformanceManager4 = LivePerformanceManager.this;
                    livePerformanceManager4.mStreamInfo = livePerformanceManager4.getStreamInfo();
                    LivePerformanceManager livePerformanceManager5 = LivePerformanceManager.this;
                    livePerformanceManager5.mBatteryInfo = livePerformanceManager5.getBatteryInfo();
                    LivePerformanceManager.this.performanceCache.mo16964a(a);
                    LivePerformanceManager.this.performanceCache.mo16965b(b);
                    LivePerformanceManager.this.mExtras = new HashMap(8);
                    if (LiveThorEnableSettings.INSTANCE.isEnable()) {
                        LivePerformanceManager.this.mExtras = ((AbstractC11808h) C6193a.m13435a(AbstractC11808h.class)).mo18868a(C3966y.m9669e());
                    }
                    LivePerformanceManager.this.mExtras.putAll(LivePerformanceManager.this.getGupInfo());
                } catch (Throwable th) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("error_msg", th.getMessage());
                    C3868c.m9489a("ttlive_live_performace_report_error", 1, 0, hashMap);
                }
            }
            LivePerformanceManager.this.isCollect = false;
            LivePerformanceManager.this.mLastCollectTimestamp = System.currentTimeMillis();
        }
    };
    private Runnable performanceReportRunnable = new Runnable() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.RunnableC100773 */

        static {
            Covode.recordClassIndex(11640);
        }

        public final void run() {
            try {
                LivePerformanceManager livePerformanceManager = LivePerformanceManager.this;
                livePerformanceManager.reportPerformance(livePerformanceManager.mCpuInfo, LivePerformanceManager.this.mMemInfo, LivePerformanceManager.this.mTemperature, LivePerformanceManager.this.mStreamInfo, LivePerformanceManager.this.mBatteryInfo, LivePerformanceManager.this.mExtras);
            } catch (Throwable th) {
                HashMap hashMap = new HashMap();
                hashMap.put("error_msg", th.getMessage());
                C3868c.m9489a("ttlive_live_performace_report_error", 1, 0, hashMap);
            }
            LivePerformanceManager.this.isReport = false;
            LivePerformanceManager.this.mLastReportTimestamp = System.currentTimeMillis();
        }
    };
    private Runnable performanceRunnable = new Runnable() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.RunnableC100751 */

        static {
            Covode.recordClassIndex(11638);
        }

        public final void run() {
            if (LivePerformanceManager.this.mPerformanceMonitor != null) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    Map<String, Double> a = LivePerformanceManager.this.mPerformanceMonitor.mo18867a();
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    long currentTimeMillis3 = System.currentTimeMillis();
                    Map<String, Long> b = LivePerformanceManager.this.mPerformanceMonitor.mo18870b();
                    long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                    float f = C10089d.C10091a.f24519a.f24507c;
                    LivePerformanceManager.this.mDegradeStrategyManager.mo16957a(f);
                    String streamInfo = LivePerformanceManager.this.getStreamInfo();
                    String batteryInfo = LivePerformanceManager.this.getBatteryInfo();
                    Map<String, String> hashMap = new HashMap<>(8);
                    if (LiveThorEnableSettings.INSTANCE.isEnable()) {
                        hashMap = ((AbstractC11808h) C6193a.m13435a(AbstractC11808h.class)).mo18868a(C3966y.m9669e());
                    }
                    hashMap.putAll(LivePerformanceManager.this.getGupInfo());
                    LivePerformanceManager livePerformanceManager = LivePerformanceManager.this;
                    livePerformanceManager.reportPerformance(livePerformanceManager.getCpuInfo(a, currentTimeMillis2), LivePerformanceManager.this.getMemInfo(b, currentTimeMillis4), LivePerformanceManager.this.getTemperatureInfo(f), streamInfo, batteryInfo, hashMap);
                    LivePerformanceManager.this.performanceCache.mo16964a(a);
                    LivePerformanceManager.this.performanceCache.mo16965b(b);
                } catch (Throwable th) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("error_msg", th.getMessage());
                    C3868c.m9489a("ttlive_live_performace_report_error", 1, 0, hashMap2);
                }
            }
            LivePerformanceManager.this.isPerformanceMonitoring = false;
            LivePerformanceManager.this.updateLastMonitorTime();
        }
    };
    private long roomId;
    public Runnable timerCollectMonitorRunnable = new Runnable() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.RunnableC100817 */

        static {
            Covode.recordClassIndex(11644);
        }

        public final void run() {
            LivePerformanceManager.this.monitorPerformance("resident", 3);
            long collectDuration = LivePerformanceManager.this.getCollectDuration();
            if (collectDuration > 0) {
                LivePerformanceManager.this.mWorkHandler.postDelayed(LivePerformanceManager.this.timerCollectMonitorRunnable, collectDuration);
            }
        }
    };
    public Runnable timerMonitorRunnable = new Runnable() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.RunnableC100806 */

        static {
            Covode.recordClassIndex(11643);
        }

        public final void run() {
            if (!LivePerformanceMonitorSetting.INSTANCE.isOpen()) {
                LivePerformanceManager.this.monitorPerformance("resident", 1);
                LivePerformanceManager.this.mWorkHandler.postDelayed(LivePerformanceManager.this.timerMonitorRunnable, LivePerformanceManager.this.getDuration(1));
                return;
            }
            LivePerformanceManager.this.mWorkHandler.post(LivePerformanceManager.this.timerCollectMonitorRunnable);
            LivePerformanceManager.this.mWorkHandler.post(LivePerformanceManager.this.timerReportMonitorRunnable);
        }
    };
    public Runnable timerReportMonitorRunnable = new Runnable() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.RunnableC100828 */

        static {
            Covode.recordClassIndex(11645);
        }

        public final void run() {
            LivePerformanceManager.this.monitorPerformance("resident", 4);
            long reportDuration = LivePerformanceManager.this.getReportDuration();
            if (reportDuration > 0) {
                LivePerformanceManager.this.mWorkHandler.postDelayed(LivePerformanceManager.this.timerReportMonitorRunnable, reportDuration);
            }
        }
    };

    static {
        Covode.recordClassIndex(11637);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    public void resetInitValue() {
        release();
    }

    private boolean isGupOpen() {
        return LiveGpuEnableSettings.INSTANCE.isEnable();
    }

    public void initStartValue() {
        initStartValue(0);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$check$3$LivePerformanceManager() {
        AbstractC11808h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            hVar.mo18872d();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$startTimerMonitor$0$LivePerformanceManager() {
        AbstractC11808h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            hVar.mo18873e();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$stopTimerMonitor$2$LivePerformanceManager() {
        AbstractC11808h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            hVar.mo18875g();
        }
    }

    public Map<String, Double> getCpuRates() {
        AbstractC11808h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            return hVar.mo18867a();
        }
        return new HashMap(1);
    }

    public Map<String, Long> getMemory() {
        AbstractC11808h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            return hVar.mo18870b();
        }
        return Collections.emptyMap();
    }

    public boolean hasInitValue() {
        if (this.nonLiveCpu == null || this.nonLiveMem == null) {
            return false;
        }
        return true;
    }

    public void updateLastMonitorTime() {
        if (!this.isPerformanceMonitoring && !this.isFPSMonitoring) {
            this.mLastMonitorTimestamp = System.currentTimeMillis();
        }
    }

    private boolean checkMinCollectInterval() {
        if (System.currentTimeMillis() - this.mLastCollectTimestamp > getDuration(2)) {
            return true;
        }
        return false;
    }

    private boolean checkMinInterval() {
        if (System.currentTimeMillis() - this.mLastMonitorTimestamp > getDuration(2)) {
            return true;
        }
        return false;
    }

    private boolean checkMinReportInterval() {
        if (System.currentTimeMillis() - this.mLastReportTimestamp > getDuration(2)) {
            return true;
        }
        return false;
    }

    public long getCollectDuration() {
        int value = LivePerformanceMonitorSetting.INSTANCE.getValue();
        if (this.mCollectionDuration == null) {
            initExpDuration();
        }
        int[] iArr = this.mCollectionDuration;
        if (iArr == null || value >= iArr.length) {
            return 0;
        }
        return (long) (iArr[value] * 1000);
    }

    public Map<String, Double> getCpuRateEnableCache() {
        Map<String, Double> map = this.performanceCache.f24563a;
        if (!map.isEmpty()) {
            return map;
        }
        AbstractC11808h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            return hVar.mo18867a();
        }
        return Collections.emptyMap();
    }

    public long getDalvikPss() {
        AbstractC11808h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            return hVar.mo18870b().get("mem_pss_dalvik").longValue();
        }
        return -1;
    }

    public Map<String, Long> getMemoryEnableCache() {
        Map<String, Long> map = this.performanceCache.f24564b;
        if (!map.isEmpty()) {
            return map;
        }
        AbstractC11808h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            return hVar.mo18870b();
        }
        return Collections.emptyMap();
    }

    public long getReportDuration() {
        int value = LivePerformanceMonitorSetting.INSTANCE.getValue();
        if (this.mReportDuration == null) {
            initExpDuration();
        }
        int[] iArr = this.mReportDuration;
        if (iArr == null || value >= iArr.length) {
            return 0;
        }
        return (long) (iArr[value] * 1000);
    }

    public void onEnterRoom() {
        if (check()) {
            if (C10089d.C10091a.f24519a.f24506b) {
                this.mEnterBatteryInfo = getCurrentBatteryValue();
            } else {
                this.mMainHandler.postDelayed(this.mCheckBatteryValue, 1000);
            }
        }
    }

    public void onExitRoom() {
        if (check()) {
            if (this.mEnterBatteryInfo != null) {
                reportBatteryInfo();
            }
            this.mEnterBatteryInfo = null;
        }
    }

    public static LivePerformanceManager getInstance() {
        MethodCollector.m26663i(11124);
        if (instance == null) {
            synchronized (LivePerformanceManager.class) {
                try {
                    if (instance == null) {
                        instance = new LivePerformanceManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11124);
                    throw th;
                }
            }
        }
        LivePerformanceManager livePerformanceManager = instance;
        MethodCollector.m26664o(11124);
        return livePerformanceManager;
    }

    private String getModuleInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (T t : this.mModulesManager.f24579a.values()) {
                jSONObject.put(t.f24580a, t.mo16972a());
            }
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    private void initExpDuration() {
        this.mCollectionDuration = new int[]{15, 10, 20, 30, 15, 15, 15};
        this.mReportDuration = new int[]{15, 15, 15, 15, 10, 20, 30};
    }

    private void monitorFps() {
        if (check() && !this.isFPSMonitoring) {
            this.isFPSMonitoring = true;
            this.mPerformanceMonitor.mo18871c();
            this.mMainHandler.removeCallbacks(this.fpsRunnable);
            this.mMainHandler.postDelayed(this.fpsRunnable, getDuration(4));
        }
    }

    public String getCurrentBatteryValue() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("battery_level", C10089d.C10091a.f24519a.f24508d);
            jSONObject.put("temperature", (double) C10089d.C10091a.f24519a.f24507c);
            jSONObject.put("voltage", C10089d.C10091a.f24519a.f24513i);
            jSONObject.put("battery_energy", C10084a.m18607b(C3966y.m9669e()));
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public Map<String, String> getGupInfo() {
        HashMap hashMap = new HashMap(2);
        if (isGupOpen() && this.mPerformanceMonitor != null) {
            long currentTimeMillis = System.currentTimeMillis();
            double f = this.mPerformanceMonitor.mo18874f();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (f > 0.0d) {
                hashMap.put("gpu_cost", String.valueOf(currentTimeMillis2));
                hashMap.put("gpu", String.valueOf(f));
            }
        }
        return hashMap;
    }

    public void init() {
        C9535as value = LivePerformanceSettingSetting.INSTANCE.getValue();
        this.mSetting = value;
        if (value.f23153a) {
            HandlerThread handlerThread = new HandlerThread("LivePerformanceManagerThread", 0);
            this.mWorkThread = handlerThread;
            handlerThread.start();
            this.mWorkHandler = new Handler(this.mWorkThread.getLooper());
            this.mMainHandler = new Handler(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initStartValue$1$LivePerformanceManager() {
        AbstractC11808h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            if (this.nonLiveCpu == null) {
                this.nonLiveCpu = hVar.mo18867a();
            }
            if (this.nonLiveMem == null) {
                this.nonLiveMem = this.mPerformanceMonitor.mo18870b();
            }
        }
        if (this.nonLiveTemperature <= 0.0f) {
            this.nonLiveTemperature = C10089d.C10091a.f24519a.f24507c;
        }
        if (this.mStartBatterLevel <= 0) {
            this.mStartBatterLevel = C10089d.C10091a.f24519a.f24508d;
            this.mStartMonitorTime = System.currentTimeMillis();
        }
    }

    public void release() {
        C10089d.C10091a.f24519a.mo16955b();
        Handler handler = this.mWorkHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.isPerformanceMonitoring = false;
        }
        Handler handler2 = this.mMainHandler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.isFPSMonitoring = false;
        }
        C10125h hVar = this.performanceCache;
        hVar.f24563a = C89041ag.m154415a();
        hVar.f24564b = C89041ag.m154415a();
        this.nonLiveCpu = null;
        this.nonLiveMem = null;
        this.nonLiveTemperature = -1.0f;
        this.mStartBatterLevel = -1;
        this.mStartMonitorTime = 0;
    }

    public void startTimerMonitor() {
        if (check() && !this.isTimerMonitoring) {
            this.isTimerMonitoring = true;
            if (isGupOpen()) {
                this.mWorkHandler.post(new RunnableC10126i(this));
            }
            this.mWorkHandler.removeCallbacks(this.timerMonitorRunnable);
            this.mWorkHandler.post(this.timerMonitorRunnable);
        }
    }

    public void stopTimerMonitor() {
        if (check() && this.isTimerMonitoring) {
            this.isTimerMonitoring = false;
            this.mWorkHandler.removeCallbacks(this.timerMonitorRunnable);
            if (isGupOpen()) {
                this.mWorkHandler.post(new RunnableC10128k(this));
            }
        }
    }

    private LivePerformanceManager() {
        init();
    }

    private boolean check() {
        if (!this.mSetting.f23153a) {
            return false;
        }
        if (this.mWorkHandler == null || this.mMainHandler == null || this.mWorkThread == null) {
            init();
        }
        if (this.mPerformanceMonitor == null) {
            this.mPerformanceMonitor = (AbstractC11808h) C6193a.m13435a(AbstractC11808h.class);
            if (isGupOpen()) {
                this.mWorkHandler.post(new RunnableC10129l(this));
            }
        }
        if (!C10089d.C10091a.f24519a.f24505a) {
            C10089d.C10091a.f24519a.mo16954a();
        }
        if (this.mWorkHandler == null || this.mMainHandler == null || this.mWorkThread == null || this.mPerformanceMonitor == null) {
            return false;
        }
        return true;
    }

    private void reportBatteryInfo() {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_info", this.mEnterBatteryInfo);
        hashMap.put("exit_info", getCurrentBatteryValue());
        hashMap.put("battery_scale", String.valueOf(C10089d.C10091a.f24519a.f24509e));
        String str3 = "1";
        if (C10089d.C10091a.f24519a.f24512h) {
            str = str3;
        } else {
            str = "0";
        }
        hashMap.put("present", str);
        hashMap.put("health", String.valueOf(C10089d.C10091a.f24519a.f24511g));
        if (C10089d.C10091a.f24519a.f24515k) {
            str2 = str3;
        } else {
            str2 = "0";
        }
        hashMap.put("has_charged", str2);
        if (!this.isAnchor) {
            str3 = "0";
        }
        hashMap.put("is_anchor", str3);
        JSONObject convertMapToJson = convertMapToJson(hashMap);
        C6501b.C6502a.m13948a("livesdk_room_info").mo12652a((Map<String, String>) hashMap).mo12655b();
        if (this.isAnchor) {
            C3868c.m9492a("ttlive_room_info_anchor_all", 0, convertMapToJson);
        } else {
            C3868c.m9492a("ttlive_room_info_audience_all", 0, convertMapToJson);
        }
    }

    public String getStreamInfo() {
        JSONObject e;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.isAnchor) {
                AbstractC6540b bVar = (AbstractC6540b) DataChannelGlobal.f42558d.mo28324b(C9084cw.class);
                if (!(bVar == null || (e = bVar.mo12680e()) == null)) {
                    jSONObject.put("preview_fps", e.optDouble("render_fps:", -1.0d));
                    jSONObject.put("real_fps", e.optDouble("push_client_fps:", -1.0d));
                    jSONObject.put("pull_cdn_ip", e.optString("cdn_ip:", ""));
                    jSONObject.put("pull_play_url", e.optString("url:", ""));
                    jSONObject.put("pull_download_speed", e.optLong("download_Speed:", -1));
                }
            } else {
                jSONObject.put("preview_fps", (double) this.mPreviewFps);
                jSONObject.put("in_cap_fps", (double) this.mVideoCaptureFps);
                jSONObject.put("real_fps", this.mStreamFps);
            }
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public String getBatteryInfo() {
        float f;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("battery_level", C10089d.C10091a.f24519a.f24508d);
            jSONObject.put("temperature", (double) C10089d.C10091a.f24519a.f24507c);
            jSONObject.put("voltage", C10089d.C10091a.f24519a.f24513i);
            jSONObject.put("battery_scale", C10089d.C10091a.f24519a.f24509e);
            jSONObject.put("health", C10089d.C10091a.f24519a.f24511g);
            jSONObject.put("present", C10089d.C10091a.f24519a.f24512h);
            jSONObject.put("charge_status", C10089d.C10091a.f24519a.f24510f);
            Context e = C3966y.m9669e();
            float f2 = -1.0f;
            if (!C10084a.m18608c(e)) {
                f = -1.0f;
            } else {
                f = ((float) C10084a.m18605a(e).getLongProperty(2)) / 1000.0f;
            }
            jSONObject.put("battery_current", (double) f);
            Context e2 = C3966y.m9669e();
            if (C10084a.m18608c(e2)) {
                f2 = ((float) C10084a.m18605a(e2).getLongProperty(3)) / 1000.0f;
            }
            jSONObject.put("battery_average", (double) f2);
            jSONObject.put("battery_energy", C10084a.m18607b(C3966y.m9669e()));
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public void reportBatteryDrainage() {
        String str;
        if (this.mSetting.f23153a) {
            int i = C10089d.C10091a.f24519a.f24508d;
            int i2 = this.mStartBatterLevel;
            int i3 = i2 - i;
            if (i2 > 0 && i > 0 && i3 >= 0 && i3 < 100) {
                long currentTimeMillis = System.currentTimeMillis() - this.mStartMonitorTime;
                if (currentTimeMillis >= 10000) {
                    double d = (double) (i3 * 1000 * 100);
                    Double.isNaN(d);
                    double d2 = (double) currentTimeMillis;
                    Double.isNaN(d2);
                    double d3 = (d * 1.0d) / d2;
                    HashMap hashMap = new HashMap();
                    hashMap.put("room_type", getRoomType(this.mStreamType));
                    if (this.isAnchor) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    hashMap.put("is_anchor", str);
                    hashMap.put("non_live_powder", new StringBuilder().append(this.mStartBatterLevel).toString());
                    hashMap.put("live_powder", String.valueOf(i));
                    hashMap.put("live_duration", String.valueOf(currentTimeMillis));
                    C6501b.C6502a.m13948a("livesdk_performance_monitor_battery_drainage").mo12652a((Map<String, String>) hashMap).mo12648a("battery_drainage_rate", Double.valueOf(d3)).mo12639a().mo12655b();
                }
            }
        }
    }

    public void setExtraParams(Map<String, String> map) {
        this.extraParams = map;
    }

    public void setIsAnchor(boolean z) {
        this.isAnchor = z;
    }

    public void setPreviewFps(float f) {
        this.mPreviewFps = f;
    }

    public void setStreamFps(double d) {
        this.mStreamFps = d;
    }

    public void setStreamType(EnumC11728i iVar) {
        this.mStreamType = iVar;
    }

    public void setVideoCaptureFps(float f) {
        this.mVideoCaptureFps = f;
    }

    public void onModuleStop(String str) {
        C10132o oVar = this.mModulesManager;
        if (!TextUtils.isEmpty(str)) {
            oVar.f24579a.remove(str);
        }
    }

    public String getRoomType(EnumC11728i iVar) {
        if (iVar == EnumC11728i.OFFICIAL_ACTIVITY) {
            return "official";
        }
        if (iVar == EnumC11728i.SCREEN_RECORD) {
            return "game";
        }
        if (iVar == EnumC11728i.AUDIO) {
            return DataType.AUDIO;
        }
        if (iVar == EnumC11728i.THIRD_PARTY) {
            return "third_party";
        }
        return "video";
    }

    public String getTemperatureInfo(float f) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", (double) f);
            float f2 = this.nonLiveTemperature;
            if (f2 > 0.0f) {
                jSONObject.put("non_live_value", (double) f2);
            }
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public void initStartValue(long j) {
        if (check()) {
            this.mWorkHandler.postDelayed(new RunnableC10127j(this), j);
        }
    }

    public void monitorPerformance(String str) {
        if (!LivePerformanceMonitorSetting.INSTANCE.isOpen()) {
            monitorPerformance(str, 1);
        } else {
            monitorPerformance(str, 2);
        }
    }

    private JSONObject convertMapToJson(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    public long getDuration(int i) {
        if (this.mSetting == null) {
            this.mSetting = LivePerformanceSettingSetting.INSTANCE.getValue();
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return 0;
                    }
                    if (this.mSetting.f23157e > 0) {
                        return this.mSetting.f23157e;
                    }
                    return this.mFpsDefaultDuration;
                } else if (this.mSetting.f23156d > 0) {
                    return this.mSetting.f23156d;
                } else {
                    return this.mDefaultMonitorDelay;
                }
            } else if (this.mSetting.f23155c > 0) {
                return this.mSetting.f23155c;
            } else {
                return this.mDefaultMinMonitorInterval;
            }
        } else if (this.mSetting.f23154b > 0) {
            return this.mSetting.f23154b;
        } else {
            return this.mDefaultMonitorInterval;
        }
    }

    public void reportPreviewFeedFirstFps(Double d) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.anchorId));
        hashMap.put("room_type", getRoomType(this.mStreamType));
        if (this.isAnchor) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("is_anchor", str);
        hashMap.put("scene", "preview");
        hashMap.put("avg_fps", String.valueOf(d));
        hashMap.put("room_id", String.valueOf(this.roomId));
        C6501b.C6502a.m13948a("livesdk_performance_monitor_fps").mo12652a((Map<String, String>) hashMap).mo12655b();
    }

    private void addExtraParams(Map<String, String> map) {
        String str;
        String str2;
        Room room;
        if (map != null) {
            map.putAll(C6501b.C6502a.m13948a("").mo12659d());
            if (!map.containsKey("room_id") && (room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class)) != null) {
                map.put("room_id", String.valueOf(room.getId()));
            }
            if (!map.containsKey("anchor_id")) {
                AbstractC2994b a = C11115u.m19743a().mo17915b().mo13147a();
                if (a instanceof User) {
                    map.put("anchor_id", ((User) a).getIdStr());
                }
            }
            map.put("scene", this.mScene);
            map.put("room_type", getRoomType(this.mStreamType));
            String str3 = "1";
            if (this.isAnchor) {
                str = str3;
            } else {
                str = "0";
            }
            map.put("is_anchor", str);
            map.put("modules", getModuleInfo());
            if (C10089d.C10091a.f24519a.f24515k) {
                str2 = str3;
            } else {
                str2 = "0";
            }
            map.put("is_charging", str2);
            if (!((IHostApp) C6193a.m13435a(IHostApp.class)).isAppForeground()) {
                str3 = "0";
            }
            map.put("is_foreground", str3);
        }
    }

    public void setExtraParams(long j, long j2) {
        this.roomId = j;
        this.anchorId = j2;
    }

    public void onModuleStart(String str, Map<String, String> map) {
        C10132o oVar = this.mModulesManager;
        if (!TextUtils.isEmpty(str)) {
            oVar.f24579a.put(str, new C10132o.C10133a(str, map));
        }
    }

    public void reportFps(double d, JSONObject jSONObject) {
        Handler handler;
        if ((d > 0.0d || jSONObject != null) && (handler = this.mMainHandler) != null) {
            handler.post(new RunnableC10131n(this, d, jSONObject));
        }
    }

    public String getCpuInfo(Map<String, Double> map, long j) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    jSONObject.put("cpu_speed", map.get("cpu_speed"));
                    Map<String, Double> map2 = this.nonLiveCpu;
                    if (map2 != null) {
                        jSONObject.put("non_live_cpu_speed", map2.get("cpu_speed"));
                    }
                } else {
                    jSONObject.put("cpu_rate", map.get("cpu_rate"));
                    if (this.nonLiveCpu != null) {
                        jSONObject.put("non_live_cpu_rate", map.get("cpu_rate"));
                    }
                }
            } catch (Exception unused) {
            }
        }
        jSONObject.put("cost", j);
        return jSONObject.toString();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$reportFps$5$LivePerformanceManager(double d, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        addExtraParams(hashMap);
        hashMap.put("avg_fps", String.valueOf(d));
        if (jSONObject != null) {
            hashMap.put("frame_drop_info", jSONObject.toString());
        }
        C6501b.C6502a.m13948a("livesdk_performance_monitor_fps").mo12652a((Map<String, String>) hashMap).mo12655b();
        if (this.isAnchor) {
            Map<String, String> map = this.extraParams;
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.putAll(C6501b.C6502a.m13948a("").mo12659d());
            hashMap.put("device_score", String.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
            C3868c.m9492a("ttlive_broadcast_performance_all", 0, convertMapToJson(hashMap));
        }
    }

    public String getMemInfo(Map<String, Long> map, long j) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                jSONObject.put("java_total", map.get("mem_java_total"));
                jSONObject.put("java_free", map.get("mem_java_free"));
                jSONObject.put("java_used", map.get("mem_java_used"));
                jSONObject.put("pss_dalvik", map.get("mem_pss_dalvik"));
                jSONObject.put("pss_native", map.get("mem_pss_native"));
                jSONObject.put("pss_total", map.get("mem_pss_total"));
                jSONObject.put("graphics", map.get("mem_graphics"));
                jSONObject.put("vmsize", map.get("mem_vmsize"));
            } catch (Exception unused) {
            }
        }
        Map<String, Long> map2 = this.nonLiveMem;
        if (map2 != null) {
            jSONObject.put("non_live_java_total", map2.get("mem_java_total"));
            jSONObject.put("non_live_java_free", this.nonLiveMem.get("mem_java_free"));
            jSONObject.put("non_live_java_used", this.nonLiveMem.get("mem_java_used"));
            jSONObject.put("non_live_pss_dalvik", this.nonLiveMem.get("mem_pss_dalvik"));
            jSONObject.put("non_live_pss_native", this.nonLiveMem.get("mem_pss_native"));
            jSONObject.put("non_live_pss_total", this.nonLiveMem.get("mem_pss_total"));
            jSONObject.put("non_live_graphics", this.nonLiveMem.get("mem_graphics"));
            jSONObject.put("non_live_vmsize", this.nonLiveMem.get("mem_vmsize"));
        }
        jSONObject.put("cost", j);
        return jSONObject.toString();
    }

    public void monitorPerformance(String str, int i) {
        if (check() && !this.isFPSMonitoring) {
            this.mScene = str;
            if (i == 1) {
                if (!this.isPerformanceMonitoring && checkMinInterval()) {
                    this.isPerformanceMonitoring = true;
                    this.mWorkHandler.removeCallbacks(this.performanceRunnable);
                    this.mWorkHandler.postDelayed(this.performanceRunnable, getDuration(3));
                } else {
                    return;
                }
            } else if (i == 2) {
                if (!this.isCollect && !this.isReport && checkMinCollectInterval() && checkMinReportInterval()) {
                    this.isCollect = true;
                    this.isReport = true;
                    this.mWorkHandler.removeCallbacks(this.performanceCollectRunnable);
                    this.mWorkHandler.postDelayed(this.performanceCollectRunnable, getDuration(3));
                    this.mWorkHandler.removeCallbacks(this.performanceReportRunnable);
                    this.mWorkHandler.postDelayed(this.performanceReportRunnable, getDuration(3));
                } else {
                    return;
                }
            } else if (i == 3) {
                if (!this.isCollect && checkMinCollectInterval()) {
                    this.isCollect = true;
                    this.mWorkHandler.removeCallbacks(this.performanceCollectRunnable);
                    this.mWorkHandler.postDelayed(this.performanceCollectRunnable, getDuration(3));
                    return;
                }
                return;
            } else if (i == 4) {
                if (!this.isReport && checkMinReportInterval()) {
                    this.isReport = true;
                    this.mWorkHandler.removeCallbacks(this.performanceReportRunnable);
                    this.mWorkHandler.postDelayed(this.performanceReportRunnable, getDuration(3));
                } else {
                    return;
                }
            }
            monitorFps();
            if (!"resident".equals(str) && this.isTimerMonitoring) {
                this.mWorkHandler.removeCallbacks(this.timerMonitorRunnable);
                this.mWorkHandler.postDelayed(this.timerMonitorRunnable, getDuration(1));
            }
        }
    }

    public void reportPerformance(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Handler handler = this.mMainHandler;
        if (handler != null) {
            handler.post(new RunnableC10130m(this, map, str, str2, str3, str4, str5));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$reportPerformance$4$LivePerformanceManager(Map map, String str, String str2, String str3, String str4, String str5) {
        HashMap hashMap = new HashMap();
        addExtraParams(hashMap);
        hashMap.putAll(map);
        hashMap.put("cpu", str);
        hashMap.put("pss", str2);
        hashMap.put("thermal", str3);
        hashMap.put("stream", str4);
        hashMap.put("battery", str5);
        C6501b.C6502a.m13948a("livesdk_performance_monitor_base").mo12652a((Map<String, String>) hashMap).mo12655b();
        if (this.isAnchor) {
            Map<String, String> map2 = this.extraParams;
            if (map2 != null) {
                hashMap.putAll(map2);
            }
            hashMap.putAll(C6501b.C6502a.m13948a("").mo12659d());
            hashMap.put("device_score", String.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
            C3868c.m9492a("ttlive_broadcast_performance_all", 0, convertMapToJson(hashMap));
        }
    }
}
