package com.p2082ss.videoarch.strategy;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.p2082ss.videoarch.strategy.inferenceEngine.networkStrategy.NetworkProber;
import com.p2082ss.videoarch.strategy.inferenceEngine.p4486a.C87215a;
import com.p2082ss.videoarch.strategy.inferenceEngine.p4487b.C87226a;
import com.p2082ss.videoarch.strategy.inferenceEngine.p4487b.p4488a.C87228a;
import com.p2082ss.videoarch.strategy.p4482a.p4483a.C87197a;
import com.p2082ss.videoarch.strategy.p4484b.C87203c;
import com.p2082ss.videoarch.strategy.p4484b.C87207e;
import com.p2082ss.videoarch.strategy.p4484b.p4485a.C87201a;
import com.p2082ss.videoarch.strategy.utils.C87229a;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.strategy.LiveStrategyManager */
public class LiveStrategyManager extends NativeObject {
    public static C87215a mDnsOptimizer;
    private static List<String> mLibraryList;
    public static C87197a mLiveIOEngine;
    private static boolean mLoadSoSuccess;
    public static C87226a mStaticConfigStrategy;
    private static volatile LiveStrategyManager sInstance;
    private final long DEFAULT_START_UP_DELAY;
    private final int DEFAULT_TIME_OUT = 5000;
    private AbstractC87196a mAppInfoBundle;
    private Context mContext;
    public int mCount;
    public long mDelayTime;
    public int mEnableDnsOptimizer = -1;
    private int mEnableDomainType = 2;
    private int mEnableHttpDns = -1;
    public int mEnableIPV6Probe = -1;
    private int mEnableLiveIO = -1;
    private int mEnableOpenPreconnect = -1;
    public int mEnablePerformanceOptimization = -1;
    private int mEnableStaticConfigDecison = -1;
    private int mEnableUseIpv6 = -1;
    private AbstractC87199b mEngine = null;
    public Handler mHandler = new Handler(Looper.getMainLooper()) {
        /* class com.p2082ss.videoarch.strategy.LiveStrategyManager.HandlerC871864 */

        static {
            Covode.recordClassIndex(102988);
        }

        public final void handleMessage(Message message) {
            if (message != null && message.what == 1024) {
                if (LiveStrategyManager.this.mEnableDnsOptimizer != 1 || LiveStrategyManager.mDnsOptimizer == null) {
                    C87203c.m151234a().f197460c.mo141073a(null);
                } else {
                    LiveStrategyManager.mDnsOptimizer.mo141086a(LiveStrategyManager.this.mOnParseDnsCompletionListener, (String) null);
                }
            }
        }
    };
    private boolean mIsRunning;
    public long mLastSessionTime;
    private long mLocalDnsTimeOut = 1;
    private C87215a.AbstractC87221c mOnDoPreconnectListener = new C87215a.AbstractC87221c() {
        /* class com.p2082ss.videoarch.strategy.LiveStrategyManager.C871842 */

        static {
            Covode.recordClassIndex(102986);
        }

        @Override // com.p2082ss.videoarch.strategy.inferenceEngine.p4486a.C87215a.AbstractC87221c
        /* renamed from: a */
        public final void mo141049a(String str, String str2) {
            JSONObject jSONObject;
            C87197a.C87198a aVar;
            if (!(LiveStrategyManager.mLiveIOEngine == null || !LiveStrategyManager.this.mStartLiveIOPreconnect || LiveStrategyManager.mLiveIOEngine == null)) {
                C87197a aVar2 = LiveStrategyManager.mLiveIOEngine;
                if (!(aVar2.f197432a.isEmpty() || aVar2.f197435d.isEmpty() || !aVar2.f197432a.contains(str))) {
                    if (!(aVar2.f197437f == null || !aVar2.f197437f.containsKey(str2) || (aVar = aVar2.f197437f.get(str2)) == null)) {
                        long j = aVar.f197442b;
                        if (j > 0 && System.currentTimeMillis() - j < aVar2.f197438g) {
                            return;
                        }
                    }
                    for (String str3 : aVar2.f197435d.keySet()) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            int intValue = aVar2.f197435d.get(str3).intValue();
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("given_ips", str2);
                            jSONObject3.put("host", str);
                            jSONObject3.put("port", intValue);
                            jSONObject3.put("suggest_protocol", str3);
                            jSONObject2.put("url_info", jSONObject3.toString());
                            if (aVar2.f197436e.containsKey(str3) && (jSONObject = aVar2.f197436e.get(str3)) != null) {
                                jSONObject2.put("preconn_params", jSONObject.toString());
                            }
                            if (aVar2.f197433b != null) {
                                String.valueOf(jSONObject2.toString());
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    };
    public C87215a.AbstractC87222d mOnParseDnsCompletionListener = new C87215a.AbstractC87222d() {
        /* class com.p2082ss.videoarch.strategy.LiveStrategyManager.C871821 */

        static {
            Covode.recordClassIndex(102984);
        }

        @Override // com.p2082ss.videoarch.strategy.inferenceEngine.p4486a.C87215a.AbstractC87222d
        /* renamed from: a */
        public final void mo141047a(final String str) {
            if (LiveStrategyManager.this.mEnablePerformanceOptimization == 1) {
                LiveStrategyManager.this.mHandler.post(new Runnable() {
                    /* class com.p2082ss.videoarch.strategy.LiveStrategyManager.C871821.RunnableC871831 */

                    static {
                        Covode.recordClassIndex(102985);
                    }

                    public final void run() {
                        C87203c.m151234a().f197460c.mo141074a(str, LiveStrategyManager.this.mHandler);
                    }
                });
            } else {
                C87203c.m151234a().f197460c.mo141073a(str);
            }
        }
    };
    private C87215a.AbstractC87223e mOnParseIPV6AddressListener = new C87215a.AbstractC87223e() {
        /* class com.p2082ss.videoarch.strategy.LiveStrategyManager.C871853 */

        static {
            Covode.recordClassIndex(102987);
        }

        @Override // com.p2082ss.videoarch.strategy.inferenceEngine.p4486a.C87215a.AbstractC87223e
        /* renamed from: a */
        public final int mo141050a(String str) {
            int i;
            MethodCollector.m26663i(11768);
            if (LiveStrategyManager.this.mEnableIPV6Probe != 1 || TextUtils.isEmpty(str)) {
                i = -1;
            } else {
                NetworkProber a = NetworkProber.m151266a();
                i = a.nativeNetworkReachableProbe(str, "tcp", 80);
                a.f197575a = i;
            }
            MethodCollector.m26664o(11768);
            return i;
        }
    };
    private Boolean mRetryFlag = false;
    private int mSendHttpDnsByLocalDnsTimeout = -1;
    private C87207e.AbstractC87212a mSettingsListener;
    public boolean mStartLiveIOPreconnect = false;
    public long mStartUpDelay;
    private Boolean mStaticConfigInitFlag = false;
    private C87201a mStaticConfigSettings = null;
    public long mTTLMs = 300000;
    private ThreadPoolExecutor mThreadPool;
    private final BroadcastReceiver networkReceiver = new BroadcastReceiver() {
        /* class com.p2082ss.videoarch.strategy.LiveStrategyManager.C871875 */

        static {
            Covode.recordClassIndex(102989);
        }

        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                return;
            }
            if (LiveStrategyManager.isNetworkAvailable(context)) {
                if (LiveStrategyManager.mDnsOptimizer != null) {
                    LiveStrategyManager.this.mHandler.removeMessages(1024);
                    LiveStrategyManager.this.mHandler.post(new Runnable() {
                        /* class com.p2082ss.videoarch.strategy.LiveStrategyManager.C871875.RunnableC871892 */

                        static {
                            Covode.recordClassIndex(102991);
                        }

                        public final void run() {
                            LiveStrategyManager.mDnsOptimizer.mo141084a();
                            LiveStrategyManager.mDnsOptimizer.f197521v = false;
                            LiveStrategyManager.mDnsOptimizer.f197523x = -1;
                            LiveStrategyManager.mDnsOptimizer.mo141086a(LiveStrategyManager.this.mOnParseDnsCompletionListener, (String) null);
                        }
                    });
                }
                if (LiveStrategyManager.mLiveIOEngine != null) {
                    C87197a aVar = LiveStrategyManager.mLiveIOEngine;
                    if (aVar.f197437f != null && !aVar.f197437f.isEmpty()) {
                        aVar.f197437f.clear();
                    }
                }
            } else if (LiveStrategyManager.mDnsOptimizer != null) {
                LiveStrategyManager.this.mHandler.removeMessages(1024);
                LiveStrategyManager.this.mHandler.post(new Runnable() {
                    /* class com.p2082ss.videoarch.strategy.LiveStrategyManager.C871875.RunnableC871881 */

                    static {
                        Covode.recordClassIndex(102990);
                    }

                    public final void run() {
                        LiveStrategyManager.mDnsOptimizer.mo141084a();
                    }
                });
            }
        }
    };

    /* renamed from: com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m151214x44d64a05(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m151215x44d64a06(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m151216x44d64a18(String str, String str2) {
        return 0;
    }

    private native void nativeCreate();

    private native String nativeGetConfigAndStrategyBundle(int i, String str);

    private native double nativeGetDoubleConfigAndStrategyByKey(int i, double d, String str);

    private native float nativeGetFloatConfigAndStrategyByKey(int i, float f, String str);

    private native int nativeGetIntConfigAndStrategyByKey(int i, int i2, String str);

    private native Object nativeGetJObjectConfigAndStrategyByKey(int i, JSONObject jSONObject, String str);

    private native long nativeGetLongConfigAndStrategyByKey(int i, long j, String str);

    private native String nativeGetStringConfigAndStrategyByKey(int i, String str, String str2);

    private native void nativeSetStreamInfo(String str);

    private native void nativeStart();

    private native void nativeStop();

    private native void nativeStopSession(JSONObject jSONObject);

    public <T> T getInfo(String str, T t) {
        return null;
    }

    public void createHandleForChildThread() {
        this.mHandler = new Handler(Looper.myLooper()) {
            /* class com.p2082ss.videoarch.strategy.LiveStrategyManager.HandlerC871928 */

            static {
                Covode.recordClassIndex(102994);
            }

            public final void handleMessage(Message message) {
                C87228a aVar;
                if (message != null && message.what == 1024) {
                    if (LiveStrategyManager.this.mEnablePerformanceOptimization == 1) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!(LiveStrategyManager.mStaticConfigStrategy == null || LiveStrategyManager.mStaticConfigStrategy.f197567l == null || (aVar = LiveStrategyManager.mStaticConfigStrategy.f197568m.get(LiveStrategyManager.mStaticConfigStrategy.f197567l)) == null)) {
                            LiveStrategyManager.this.mLastSessionTime = aVar.f197573d;
                        }
                        if ((currentTimeMillis - LiveStrategyManager.this.mLastSessionTime) - (LiveStrategyManager.this.mTTLMs + LiveStrategyManager.this.mDelayTime) > 0) {
                            LiveStrategyManager.this.mCount++;
                        } else {
                            LiveStrategyManager liveStrategyManager = LiveStrategyManager.this;
                            int i = liveStrategyManager.mCount - 1;
                            liveStrategyManager.mCount = i;
                            liveStrategyManager.mCount = Math.max(i, 0);
                        }
                        LiveStrategyManager liveStrategyManager2 = LiveStrategyManager.this;
                        liveStrategyManager2.mDelayTime = (long) (Math.min(liveStrategyManager2.mCount * LiveStrategyManager.this.mCount, 10) * 60 * 1000);
                        LiveStrategyManager.this.mHandler.postDelayed(new Runnable() {
                            /* class com.p2082ss.videoarch.strategy.LiveStrategyManager.HandlerC871928.RunnableC871931 */

                            static {
                                Covode.recordClassIndex(102995);
                            }

                            public final void run() {
                                if (LiveStrategyManager.this.mEnableDnsOptimizer != 1 || LiveStrategyManager.mDnsOptimizer == null) {
                                    C87203c.m151234a().f197460c.mo141074a(null, LiveStrategyManager.this.mHandler);
                                } else {
                                    LiveStrategyManager.mDnsOptimizer.mo141086a(LiveStrategyManager.this.mOnParseDnsCompletionListener, (String) null);
                                }
                            }
                        }, LiveStrategyManager.this.mDelayTime);
                    } else if (LiveStrategyManager.this.mEnableDnsOptimizer != 1 || LiveStrategyManager.mDnsOptimizer == null) {
                        C87203c.m151234a().f197460c.mo141073a(null);
                    } else {
                        LiveStrategyManager.mDnsOptimizer.mo141086a(LiveStrategyManager.this.mOnParseDnsCompletionListener, (String) null);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.videoarch.strategy.LiveStrategyManager$a */
    public static class ThreadFactoryC87195a implements ThreadFactory {

        /* renamed from: a */
        private final ThreadGroup f197429a;

        /* renamed from: b */
        private final AtomicInteger f197430b;

        /* renamed from: c */
        private final String f197431c;

        static {
            Covode.recordClassIndex(102997);
        }

        private ThreadFactoryC87195a() {
            ThreadGroup threadGroup;
            this.f197430b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f197429a = threadGroup;
            this.f197431c = "live-stream-strategy-";
        }

        /* synthetic */ ThreadFactoryC87195a(byte b) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.m26663i(9865);
            Thread thread = new Thread(this.f197429a, runnable, this.f197431c + this.f197430b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            MethodCollector.m26664o(9865);
            return thread;
        }
    }

    static {
        Covode.recordClassIndex(102983);
        List asList = Arrays.asList("livestrategy");
        ArrayList arrayList = new ArrayList();
        mLibraryList = arrayList;
        arrayList.addAll(asList);
        for (String str : mLibraryList) {
            mLoadSoSuccess = loadLibrary(str);
        }
    }

    public static LiveStrategyManager inst() {
        MethodCollector.m26663i(10528);
        if (sInstance == null) {
            synchronized (LiveStrategyManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new LiveStrategyManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10528);
                    throw th;
                }
            }
        }
        LiveStrategyManager liveStrategyManager = sInstance;
        MethodCollector.m26664o(10528);
        return liveStrategyManager;
    }

    public void stop() {
        MethodCollector.m26663i(10973);
        this.mIsRunning = false;
        this.mStaticConfigInitFlag = false;
        this.mHandler.removeMessages(1024);
        this.mContext.unregisterReceiver(this.networkReceiver);
        if (mDnsOptimizer != null) {
            this.mHandler.post(new Runnable() {
                /* class com.p2082ss.videoarch.strategy.LiveStrategyManager.RunnableC871949 */

                static {
                    Covode.recordClassIndex(102996);
                }

                public final void run() {
                    C87215a aVar = LiveStrategyManager.mDnsOptimizer;
                    if (aVar.f197507h) {
                        aVar.f197506f.clear();
                        C87215a.f197494e.clear();
                        aVar.f197507h = false;
                    }
                }
            });
        }
        if (this.mSettingsListener != null) {
            C87207e eVar = C87203c.m151234a().f197460c;
            eVar.f197470a.remove(this.mSettingsListener);
            this.mSettingsListener = null;
        }
        if (mLoadSoSuccess) {
            nativeStop();
        }
        MethodCollector.m26664o(10973);
    }

    private void updateStaticConfigStrategy() {
        JSONObject optJSONObject;
        C87201a aVar = this.mStaticConfigSettings;
        if (aVar != null) {
            JSONObject b = aVar.mo141070b("2");
            C87226a aVar2 = mStaticConfigStrategy;
            if (!(b == null || !b.has("AutoStartPlayBufferParam") || (optJSONObject = b.optJSONObject("AutoStartPlayBufferParam")) == null)) {
                aVar2.f197561f = optJSONObject.optInt("MinStartPlayBuffer");
                aVar2.f197562g = optJSONObject.optInt("MaxStartPlayBuffer");
                aVar2.f197563h = optJSONObject.optDouble("AttenuationCoefficient");
                aVar2.f197564i = optJSONObject.optInt("AttenuationTimeOffset");
            }
            double d = 0.0d;
            double d2 = 0.0d;
            for (int i = 0; i < aVar2.f197565j.length; i++) {
                d2 += Math.cbrt((double) (8 - aVar2.f197565j[i]));
            }
            int i2 = aVar2.f197562g - aVar2.f197561f;
            int i3 = aVar2.f197561f;
            int i4 = 1;
            while (i4 < aVar2.f197565j.length) {
                d += Math.cbrt((double) (8 - aVar2.f197565j[i4]));
                double d3 = (double) aVar2.f197561f;
                double d4 = (double) i2;
                Double.isNaN(d4);
                Double.isNaN(d3);
                int i5 = (int) (d3 + ((d / d2) * d4));
                aVar2.f197566k.put(Integer.valueOf(aVar2.f197565j[i4 - 1]), new Pair(Integer.valueOf(i3), Integer.valueOf(i5)));
                i4++;
                i3 = i5;
            }
            if (i4 == aVar2.f197565j.length) {
                aVar2.f197566k.put(Integer.valueOf(aVar2.f197565j[i4 - 1]), new Pair(Integer.valueOf(i3), Integer.valueOf(aVar2.f197562g)));
            }
            this.mStaticConfigInitFlag = true;
        }
    }

    public void initBySettingsBuddle() {
        AbstractC87196a aVar = this.mAppInfoBundle;
        if (aVar != null) {
            this.mEnableDnsOptimizer = ((Integer) aVar.mo16647a("live_stream_open_optimizer_enable", 0)).intValue();
            this.mEnableUseIpv6 = ((Integer) this.mAppInfoBundle.mo16647a("live_stream_strategy_enable_ipv6", 0)).intValue();
            this.mEnableHttpDns = ((Integer) this.mAppInfoBundle.mo16647a("live_stream_strategy_enable_httpdns", 0)).intValue();
            this.mSendHttpDnsByLocalDnsTimeout = ((Integer) this.mAppInfoBundle.mo16647a("live_stream_strategy_send_httpdns_by_localdns_timeout", 0)).intValue();
            this.mEnableDomainType = ((Integer) this.mAppInfoBundle.mo16647a("live_stream_strategy_enable_domain_type", 2)).intValue();
            this.mLocalDnsTimeOut = ((Long) this.mAppInfoBundle.mo16647a("live_stream_strategy_localdns_timeout", 5000L)).longValue();
            this.mEnableStaticConfigDecison = ((Integer) this.mAppInfoBundle.mo16647a("live_stream_strategy_enable_flv_strategy", 0)).intValue();
            this.mEnablePerformanceOptimization = ((Integer) this.mAppInfoBundle.mo16647a("live_stream_strategy_enable_performance_optimization", 0)).intValue();
            this.mStartUpDelay = ((Long) this.mAppInfoBundle.mo16647a("live_stream_strategy_start_up_delay", 0L)).longValue();
            this.mEnableOpenPreconnect = ((Integer) this.mAppInfoBundle.mo16647a("live_stream_strategy_enable_open_preonnect", 1)).intValue();
            this.mEnableLiveIO = ((Integer) this.mAppInfoBundle.mo16647a("live_sdk_enable_liveio", 1)).intValue();
            this.mEnableIPV6Probe = ((Integer) this.mAppInfoBundle.mo16647a("live_stream_strategy_enable_ipv6_probe", 0)).intValue();
        }
    }

    public void start() {
        MethodCollector.m26663i(10830);
        if (this.mIsRunning) {
            m151216x44d64a18("LiveStrategyManager", "livestrategy is already running");
            MethodCollector.m26664o(10830);
            return;
        }
        this.mIsRunning = true;
        m151216x44d64a18("LiveStrategyManager", "start livestrategy");
        m151217xf066dd73(this.mContext, this.networkReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        initBySettingsBuddle();
        if (this.mEnableDnsOptimizer == 1) {
            m151216x44d64a18("LiveStrategyManager", "enable dns optimizer");
            C87215a aVar = new C87215a(this.mOnParseDnsCompletionListener);
            mDnsOptimizer = aVar;
            aVar.f197513n = this.mEnableHttpDns;
            mDnsOptimizer.f197515p = this.mSendHttpDnsByLocalDnsTimeout;
            mDnsOptimizer.f197512m = this.mEnableUseIpv6;
            mDnsOptimizer.f197516q = this.mEnableDomainType;
            mDnsOptimizer.f197517r = this.mLocalDnsTimeOut;
            mDnsOptimizer.f197520u = this.mEnableOpenPreconnect;
            mDnsOptimizer.f197518s = this.mEnablePerformanceOptimization;
            if (this.mEnableOpenPreconnect == 1 && this.mEnableLiveIO == 1) {
                mDnsOptimizer.f197503b = this.mOnDoPreconnectListener;
                C87197a aVar2 = new C87197a(this.mEngine);
                mLiveIOEngine = aVar2;
                aVar2.f197434c = this.mAppInfoBundle;
                mLiveIOEngine.mo141065a(m151212x9b9c8098(this.mContext).getAbsolutePath() + "/pullstream.scfg");
            }
            mDnsOptimizer.f197514o = this.mEnableIPV6Probe;
            if (this.mEnableUseIpv6 == 1 && this.mEnableIPV6Probe == 1) {
                mDnsOptimizer.f197522w = this.mOnParseIPV6AddressListener;
            }
        }
        mStaticConfigStrategy = new C87226a();
        m151216x44d64a18("LiveStrategyManager", "enable static config strategy");
        if (this.mEnablePerformanceOptimization == 1) {
            this.mThreadPool.execute(new Runnable() {
                /* class com.p2082ss.videoarch.strategy.LiveStrategyManager.RunnableC871917 */

                static {
                    Covode.recordClassIndex(102993);
                }

                public final void run() {
                    MethodCollector.m26663i(9863);
                    Looper.prepare();
                    LiveStrategyManager.this.createHandleForChildThread();
                    LiveStrategyManager.mDnsOptimizer.f197505d = LiveStrategyManager.this.mHandler;
                    if (LiveStrategyManager.this.mStartUpDelay != 0) {
                        try {
                            Thread.sleep(LiveStrategyManager.this.mStartUpDelay);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    C87203c.m151234a().f197460c.mo141074a(null, LiveStrategyManager.this.mHandler);
                    Looper.loop();
                    MethodCollector.m26664o(9863);
                }
            });
        } else {
            C87203c.m151234a().f197460c.mo141073a(null);
        }
        if (mLoadSoSuccess) {
            nativeStart();
        }
        MethodCollector.m26664o(10830);
    }

    public void setAppInfoBundle(AbstractC87196a aVar) {
        this.mAppInfoBundle = aVar;
    }

    /* renamed from: com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo */
    public static NetworkInfo m151218xc62dd4d5(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir */
    public static File m151212x9b9c8098(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) m151213x2617a7a9(context, "connectivity");
            if (connectivityManager == null || (com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo = m151218xc62dd4d5(connectivityManager)) == null || !com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void setIFunctionCalledByStrategyEngine(AbstractC87199b bVar) {
        m151214x44d64a05("LiveStrategyManager", "setIFunctionCalledByStrategyEngine, engine: ".concat(String.valueOf(bVar)));
        this.mEngine = bVar;
        if (mLiveIOEngine != null) {
            m151216x44d64a18("LiveStrategyManager", "set liveio engine");
            mLiveIOEngine.f197433b = bVar;
        }
    }

    private static boolean loadLibrary(String str) {
        try {
            C87229a.AbstractC87230a aVar = C87229a.f197580a;
            if (!TextUtils.isEmpty(str)) {
                if (aVar == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    Librarian.m38962a(str);
                    C58032m.m104852a(uptimeMillis, str);
                }
                m151214x44d64a05("LiveStrategyManager", "load library: " + str + ".so success");
                return true;
            }
            throw new Exception("Invalid library name.");
        } catch (Throwable th) {
            m151215x44d64a06("LiveStrategyManager", "load library: " + str + ".so fail! " + th.getMessage());
            return false;
        }
    }

    public void init(Context context) {
        MethodCollector.m26663i(10690);
        this.mContext = context;
        if (mLoadSoSuccess) {
            nativeCreate();
        }
        if (this.mSettingsListener == null) {
            this.mSettingsListener = new C87207e.AbstractC87212a() {
                /* class com.p2082ss.videoarch.strategy.LiveStrategyManager.C871906 */

                static {
                    Covode.recordClassIndex(102992);
                }

                @Override // com.p2082ss.videoarch.strategy.p4484b.C87207e.AbstractC87212a
                /* renamed from: a */
                public final void mo141055a(C87201a aVar, String str) {
                    if (str == null) {
                        LiveStrategyManager.this.updateGlobalSettings(aVar);
                    } else if (LiveStrategyManager.this.mEnableDnsOptimizer == 1 && LiveStrategyManager.mDnsOptimizer != null) {
                        LiveStrategyManager.mDnsOptimizer.mo141085a(aVar, str);
                    }
                }
            };
            C87207e eVar = C87203c.m151234a().f197460c;
            eVar.f197470a.add(this.mSettingsListener);
        }
        ThreadPoolExecutor threadPoolExecutor = C87203c.m151234a().f197461d;
        if (threadPoolExecutor == null) {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC87195a((byte) 0));
            this.mThreadPool = threadPoolExecutor2;
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            MethodCollector.m26664o(10690);
            return;
        }
        this.mThreadPool = threadPoolExecutor;
        MethodCollector.m26664o(10690);
    }

    public void stopSession(JSONObject jSONObject) {
        MethodCollector.m26663i(11119);
        C87226a aVar = mStaticConfigStrategy;
        if (aVar != null) {
            C87228a aVar2 = new C87228a();
            if (jSONObject != null) {
                aVar2.f197570a = jSONObject.optString("sessionId");
                aVar2.f197571b = jSONObject.optInt("stallTotalCount");
                aVar2.f197572c = jSONObject.optInt("retryTotalCount");
                aVar2.f197573d = System.currentTimeMillis();
                aVar.f197567l = jSONObject.optString("sessionId");
                aVar.f197568m.put(aVar.f197567l, aVar2);
            }
        }
        if (mLoadSoSuccess) {
            nativeStopSession(jSONObject);
        }
        MethodCollector.m26664o(11119);
    }

    public void updateGlobalSettings(C87201a aVar) {
        C87215a aVar2;
        this.mStaticConfigSettings = aVar;
        if (this.mEnableStaticConfigDecison == 1 && mStaticConfigStrategy != null && !this.mStaticConfigInitFlag.booleanValue()) {
            updateStaticConfigStrategy();
        }
        long j = 300000;
        if (((long) (aVar.f197449c * 1000)) >= 300000) {
            j = (long) (aVar.f197449c * 1000);
        }
        this.mTTLMs = j;
        if (this.mEnableDnsOptimizer == 1 && (aVar2 = mDnsOptimizer) != null) {
            aVar2.mo141085a(this.mStaticConfigSettings, (String) null);
        }
        this.mHandler.removeMessages(1024);
        this.mHandler.sendEmptyMessageDelayed(1024, this.mTTLMs);
    }

    public <T> T getAppInfoForKey(String str, T t) {
        AbstractC87196a aVar = this.mAppInfoBundle;
        return (aVar == null || str == null) ? t : (T) aVar.mo16647a(str, t);
    }

    public long getInt64Value(String str, long j) {
        return ((Long) getAppInfoForKey(str, Long.valueOf(j))).longValue();
    }

    public String getConfigAndStrategyBundle(int i, String str) {
        String str2;
        JSONObject b;
        if (!this.mIsRunning) {
            return null;
        }
        if (i == 0) {
            str2 = "2";
            C87201a aVar = this.mStaticConfigSettings;
            return b.toString();
        } else if (i == 1) {
            str2 = "1";
            C87201a aVar2 = this.mStaticConfigSettings;
            if (!(aVar2 == null || (b = aVar2.mo141070b(str2)) == null)) {
                return b.toString();
            }
        }
        return null;
    }

    public float getFloatValue(int i, float f) {
        String str;
        if (i != 12) {
            str = null;
        } else {
            str = "attenuation_coefficient";
        }
        return ((Float) getAppInfoForKey(str, Float.valueOf(f))).floatValue();
    }

    public int getIntValue(int i, int i2) {
        String str;
        switch (i) {
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                str = "min_start_play_buffer";
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                str = "max_start_play_buffer";
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                str = "attenuation_time_offset";
                break;
            default:
                str = null;
                break;
        }
        return ((Integer) getAppInfoForKey(str, Integer.valueOf(i2))).intValue();
    }

    /* renamed from: com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m151213x2617a7a9(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10688);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(10688);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public void setStreamInfo(String str, String str2, String str3) {
        MethodCollector.m26663i(10981);
        if (mLoadSoSuccess) {
            nativeSetStreamInfo(str3);
        }
        MethodCollector.m26664o(10981);
    }

    /* renamed from: com_ss_videoarch_strategy_LiveStrategyManager_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver */
    public static Intent m151211xb3aa4d4f(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m151217xf066dd73(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m151211xb3aa4d4f(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.strategy.LiveStrategyManager.m151217xf066dd73(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public void notifyInfo(int i, int i2, String str) {
        C87197a aVar;
        if (i == 2 && i2 == 0 && (aVar = mLiveIOEngine) != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String str2 = "";
                if (jSONObject.has("ip")) {
                    str2 = jSONObject.optString("ip");
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                }
                if (aVar.f197437f != null) {
                    aVar.f197437f.size();
                    if (aVar.f197437f.size() >= aVar.f197439h) {
                        aVar.mo141064a();
                    }
                    aVar.f197437f.put(str2, new C87197a.C87198a(jSONObject, System.currentTimeMillis()));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public <T> T getConfigAndStrategyByKeyStr(int i, String str, T t, String str2) {
        String str3;
        C87201a aVar;
        T t2;
        if (!this.mIsRunning) {
            return t;
        }
        if (i == 0) {
            str3 = "2";
            aVar = this.mStaticConfigSettings;
            if (aVar != null) {
                return t;
            }
        } else if (i == 1) {
            str3 = "1";
            aVar = this.mStaticConfigSettings;
            if (aVar != null || (t2 = (T) aVar.mo141067a(str3, str)) == null) {
                return t;
            }
            return JSONObject.class.equals(t2.getClass()) ? (T) t2.toString() : t2;
        }
        return t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T getConfigAndStrategyByKeyInt(int r7, int r8, T r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.videoarch.strategy.LiveStrategyManager.getConfigAndStrategyByKeyInt(int, int, java.lang.Object, java.lang.String):java.lang.Object");
    }
}
