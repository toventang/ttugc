package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.WindowManager;
import com.C1764a;
import com.appsflyer.AFFacebookDeferredDeeplink;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.internal.ActivityCompat;
import com.appsflyer.internal.C2294aa;
import com.appsflyer.internal.C2295ab;
import com.appsflyer.internal.C2297ac;
import com.appsflyer.internal.C2299ae;
import com.appsflyer.internal.C2300af;
import com.appsflyer.internal.C2301ag;
import com.appsflyer.internal.C2305ah;
import com.appsflyer.internal.C2306ai;
import com.appsflyer.internal.C2323j;
import com.appsflyer.internal.C2329s;
import com.appsflyer.internal.C2332t;
import com.appsflyer.internal.C2339v;
import com.appsflyer.internal.C2341w;
import com.appsflyer.internal.C2345y;
import com.appsflyer.internal.C2346z;
import com.appsflyer.internal.RunnableC2298ad;
import com.appsflyer.internal.RunnableC2343x;
import com.appsflyer.internal.model.event.AdRevenue;
import com.appsflyer.internal.model.event.Attr;
import com.appsflyer.internal.model.event.BackgroundEvent;
import com.appsflyer.internal.model.event.BackgroundReferrerLaunch;
import com.appsflyer.internal.model.event.CachedEvent;
import com.appsflyer.internal.model.event.InAppEvent;
import com.appsflyer.internal.model.event.Launch;
import com.appsflyer.internal.model.event.Stats;
import com.appsflyer.internal.model.event.UninstallTokenEvent;
import com.appsflyer.internal.referrer.GoogleReferrer;
import com.appsflyer.internal.referrer.HuaweiReferrer;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.gms.common.GoogleApiAvailability;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerLibCore extends AppsFlyerLib {
    public static String FIRST_LAUNCHES_URL;
    public static String REFERRER_TRACKING_URL;
    public static String REGISTER_URL;
    public static AppsFlyerLibCore instance = new AppsFlyerLibCore();

    /* renamed from: ı */
    public static final String f6863 = "5.4";

    /* renamed from: Ɩ */
    private static final String f6864;

    /* renamed from: ǃ */
    public static AppsFlyerInAppPurchaseValidatorListener f6865 = null;

    /* renamed from: ɩ */
    public static final String f6866 = "44";

    /* renamed from: ɪ */
    private static AppsFlyerConversionListener f6867 = null;

    /* renamed from: ɹ */
    private static String f6868;

    /* renamed from: ɾ */
    private static String f6869;

    /* renamed from: І */
    private static String f6870 = new StringBuilder("https://%sadrevenue.%s/api/v").append("5.4").append("/android?buildnumber=5.4.1&app_id=").toString();

    /* renamed from: і */
    private static final String f6871;

    /* renamed from: ӏ */
    private static final List<String> f6872 = Arrays.asList("is_cache");
    protected Uri latestDeepLink;

    /* renamed from: ŀ */
    private long f6873 = -1;

    /* renamed from: ł */
    private ScheduledExecutorService f6874 = null;

    /* renamed from: ſ */
    private long f6875;

    /* renamed from: Ɨ */
    private String f6876;

    /* renamed from: ƚ */
    private Map<Long, String> f6877;

    /* renamed from: ǀ */
    private boolean f6878;

    /* renamed from: ȷ */
    private long f6879 = -1;

    /* renamed from: ɍ */
    private boolean f6880 = false;

    /* renamed from: ɔ */
    private boolean f6881 = false;

    /* renamed from: ɟ */
    private C2301ag f6882 = new C2301ag();

    /* renamed from: ɨ */
    private String f6883;

    /* renamed from: ɺ */
    private boolean f6884;

    /* renamed from: ɼ */
    private boolean f6885 = false;

    /* renamed from: ɿ */
    private long f6886 = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: ʅ */
    private long f6887;

    /* renamed from: ʟ */
    private GoogleReferrer f6888;

    /* renamed from: ͻ */
    private Map<String, Object> f6889;

    /* renamed from: Ι */
    public String f6890;

    /* renamed from: ι */
    public String f6891;

    /* renamed from: ϲ */
    private Map<String, Object> f6892;

    /* renamed from: ϳ */
    private Application f6893;

    /* renamed from: Ј */
    private boolean f6894 = false;

    /* renamed from: г */
    private boolean f6895 = false;

    /* renamed from: с */
    private boolean f6896 = false;

    /* renamed from: т */
    private HuaweiReferrer f6897;

    /* renamed from: х */
    private String f6898;

    /* renamed from: ґ */
    private String[] f6899;

    /* renamed from: Ӏ */
    long f6900;

    /* renamed from: com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m6947xba03987e(String str, String str2) {
        return 0;
    }

    private static Object com_appsflyer_AppsFlyerLibCore_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_appsflyer_AppsFlyerLibCore_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_appsflyer_AppsFlyerLibCore_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static AppsFlyerLibCore getInstance() {
        return instance;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public boolean isTrackingStopped() {
        return this.f6885;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ */
    public final void mo6356(Context context, Intent intent) {
        if (m6946xbe299e4a(intent, "appsflyer_preinstall") != null) {
            getInstance();
            String com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = m6946xbe299e4a(intent, "appsflyer_preinstall");
            try {
                if (new JSONObject(com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra).has("pid")) {
                    AppsFlyerProperties.getInstance().set("preInstallName", com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                } else {
                    AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                }
            } catch (JSONException e) {
                AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
            }
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance().setOnReceiveCalled();
        String com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = m6946xbe299e4a(intent, "referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2)));
        if (com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 != null) {
            SharedPreferences.Editor edit = getSharedPreferences(context).edit();
            edit.putString("referrer", com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2);
            edit.apply();
            AppsFlyerProperties.getInstance().setReferrer(com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2);
            if (AppsFlyerProperties.getInstance().isFirstLaunchCalled()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                AFEvent weakContext = new BackgroundReferrerLaunch().context(context).mo6254().weakContext();
                weakContext.f6813 = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2;
                weakContext.f6814 = intent;
                if (com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2.length() > 5 && m6996(weakContext, getSharedPreferences(context))) {
                    m6977(AFExecutor.getInstance().mo6258(), new RunnableC2287e(this, weakContext, (byte) 0), 5, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ */
    public final void mo6360(WeakReference<Context> weakReference) {
        if (weakReference.get() != null) {
            AFLogger.afInfoLog("app went to background");
            SharedPreferences sharedPreferences = getSharedPreferences(weakReference.get());
            AppsFlyerProperties.getInstance().saveProperties(sharedPreferences);
            long j = this.f6875 - this.f6887;
            HashMap hashMap = new HashMap();
            String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
            if (string == null) {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            }
            String string2 = AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
            if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
                hashMap.put("deviceTrackingDisabled", "true");
            }
            C2341w r9 = C2339v.m7150(weakReference.get().getContentResolver());
            if (r9 != null) {
                hashMap.put("amazon_aid", r9.f7110);
                hashMap.put("amazon_aid_limit", String.valueOf(r9.mo6490()));
            }
            String string3 = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string3 != null) {
                hashMap.put("advertiserId", string3);
            }
            hashMap.put("app_id", weakReference.get().getPackageName());
            hashMap.put("devkey", string);
            hashMap.put("uid", C2299ae.m7061(weakReference));
            hashMap.put("time_in_app", String.valueOf(j / 1000));
            hashMap.put("statType", "user_closed_app");
            hashMap.put("platform", "Android");
            hashMap.put("launch_counter", Integer.toString(getLaunchCounter(sharedPreferences, false)));
            hashMap.put("channel", getConfiguredChannel(weakReference.get()));
            if (string2 == null) {
                string2 = "";
            }
            hashMap.put("originalAppsflyerId", string2);
            if (this.f6881) {
                try {
                    AFLogger.afDebugLog("Running callStats task");
                    new Thread(new RunnableC2298ad((BackgroundEvent) new Stats().trackingStopped(isTrackingStopped()).params(hashMap).urlString(ServerConfigHandler.getUrl("https://%sstats.%s/stats")))).start();
                } catch (Throwable th) {
                    AFLogger.afErrorLog("Could not send callStats request", th);
                }
            } else {
                AFLogger.afDebugLog("Stats call is disabled, ignore ...");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ */
    public final void mo6357(AFEvent aFEvent) {
        Intent intent;
        String str;
        Context context = aFEvent.context();
        String str2 = "";
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            intent = activity.getIntent();
            Uri referrer = ActivityCompat.getReferrer(activity);
            if (referrer != null) {
                str = referrer.toString();
            }
            str = str2;
        } else {
            intent = null;
            str = str2;
        }
        if (AppsFlyerProperties.getInstance().getString("AppsFlyerKey") == null) {
            AFLogger.afWarnLog("[TrackEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        String referrer2 = AppsFlyerProperties.getInstance().getReferrer(context);
        if (referrer2 != null) {
            str2 = referrer2;
        }
        aFEvent.f6813 = str2;
        aFEvent.f6814 = intent;
        aFEvent.f6824 = str;
        m6957(aFEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:249:0x059f, code lost:
        r14 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05a3, code lost:
        r14 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05a7, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05a9, code lost:
        com.appsflyer.AFLogger.afDebugLog("use cached IMEI: ".concat(java.lang.String.valueOf(r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05bc, code lost:
        if (r1 != null) goto L_0x05c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05bf, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05c1, code lost:
        com.appsflyer.AFLogger.afDebugLog("use cached IMEI: ".concat(java.lang.String.valueOf(r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05ce, code lost:
        com.appsflyer.AFLogger.afWarnLog("WARNING: READ_PHONE_STATE is missing.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05d6, code lost:
        if (r0 != null) goto L_0x05db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0654, code lost:
        if (r1 != null) goto L_0x0658;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d2 A[Catch:{ Exception -> 0x02d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x05a9  */
    /* JADX WARNING: Removed duplicated region for block: B:257:? A[ExcHandler: InvocationTargetException (unused java.lang.reflect.InvocationTargetException), SYNTHETIC, Splitter:B:238:0x0572] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0609  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x065a  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x067e  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0680  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0686  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x06ba  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x06d8  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x078c  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0825  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x082e  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x085d A[SYNTHETIC, Splitter:B:379:0x085d] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x08a4  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x08c2  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0900  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0902  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0920  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x096a  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x096e  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0ad8  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0af0  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0b58  */
    /* renamed from: ɩ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Object> mo6358(com.appsflyer.AFEvent r32) {
        /*
        // Method dump skipped, instructions count: 2946
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.mo6358(com.appsflyer.AFEvent):java.util.Map");
    }

    /* renamed from: ı */
    public static boolean m6963(SharedPreferences sharedPreferences) {
        return Boolean.parseBoolean(sharedPreferences.getString("sentSuccessfully", null));
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ */
    public static void m6977(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!scheduledExecutorService.isShutdown() && !scheduledExecutorService.isTerminated()) {
                    scheduledExecutorService.schedule(runnable, j, timeUnit);
                    return;
                }
            } catch (RejectedExecutionException e) {
                AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog("scheduleJob failed with Exception", th);
                return;
            }
        }
        AFLogger.afWarnLog("scheduler is null, shut downed or terminated");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052 A[SYNTHETIC, Splitter:B:20:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057 A[Catch:{ all -> 0x005e }] */
    /* renamed from: ǃ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo6355(java.net.HttpURLConnection r9) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.mo6355(java.net.HttpURLConnection):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: Ӏ */
    private boolean m7013() {
        Map<String, Object> map = this.f6892;
        if (map == null || map.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getHostName() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host");
        if (string != null) {
            return string;
        }
        return "appsflyer.com";
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getHostPrefix() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host_prefix");
        if (string != null) {
            return string;
        }
        return "";
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setSharingFilterForAllPartners() {
        this.f6899 = new String[]{"all"};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.AppsFlyerLibCore$b */
    public static class RunnableC2285b implements Runnable {

        /* renamed from: ɩ */
        private static final List<String> f6919 = Arrays.asList("googleplay", "playstore", "googleplaystore");

        /* renamed from: ι */
        private static String f6920 = "https://%sgcdsdk.%s/install_data/v4.0/";

        /* renamed from: ı */
        private final String f6921;

        /* renamed from: Ɩ */
        private AppsFlyerLibCore f6922;

        /* renamed from: ǃ */
        private final Application f6923;

        /* renamed from: Ι */
        final ScheduledExecutorService f6924;

        /* renamed from: І */
        private final int f6925;

        /* renamed from: і */
        private final AtomicInteger f6926;

        static {
            Covode.recordClassIndex(2514);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00f9 A[Catch:{ all -> 0x027f }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0118 A[Catch:{ all -> 0x027f }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x016b A[Catch:{ all -> 0x027f }] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0289 A[Catch:{ all -> 0x02a7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x029e A[DONT_GENERATE] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 691
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.RunnableC2285b.run():void");
        }

        private RunnableC2285b(RunnableC2285b bVar) {
            this.f6924 = AFExecutor.getInstance().mo6258();
            this.f6926 = new AtomicInteger(0);
            this.f6922 = bVar.f6922;
            this.f6923 = bVar.f6923;
            this.f6921 = bVar.f6921;
            this.f6925 = bVar.f6925 + 1;
        }

        /* renamed from: com_appsflyer_AppsFlyerLibCore$b_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection */
        public static URLConnection m7028x56a04dea(URL url) {
            URLConnection aVar;
            URLConnection aVar2;
            C61425e<URL, URLConnection> m = C61439n.f139485e.mo68809m(new C61425e<>(url, null, null, EnumC61424d.CONTINUE));
            if (m.f139473f == EnumC61424d.INTERCEPT && m.f139469b != null) {
                R r = m.f139469b;
                if (r instanceof HttpsURLConnection) {
                    aVar2 = new C61417b(r);
                } else if (!(r instanceof HttpURLConnection)) {
                    return r;
                } else {
                    aVar2 = new C61416a(r);
                }
                return aVar2;
            } else if (m.f139473f != EnumC61424d.EXCEPTION || m.f139472e == null) {
                URLConnection openConnection = url.openConnection();
                if (openConnection instanceof HttpsURLConnection) {
                    aVar = new C61417b((HttpsURLConnection) openConnection);
                } else if (!(openConnection instanceof HttpURLConnection)) {
                    return openConnection;
                } else {
                    aVar = new C61416a((HttpURLConnection) openConnection);
                }
                return aVar;
            } else {
                throw m.f139472e;
            }
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        /* renamed from: Ι */
        private void m7029(java.lang.String r4, int r5) {
            /*
                r3 = this;
                java.lang.String r2 = "Calling onConversionFailure with:\n"
                r0 = 500(0x1f4, float:7.0E-43)
                if (r0 > r5) goto L_0x002f
                r0 = 600(0x258, float:8.41E-43)
                if (r5 >= r0) goto L_0x002f
                int r1 = r3.f6925
                r0 = 2
                if (r1 != r0) goto L_0x0022
                java.lang.String r0 = java.lang.String.valueOf(r4)
                java.lang.String r0 = r2.concat(r0)
                com.appsflyer.AFLogger.afDebugLog(r0)
                com.appsflyer.AppsFlyerConversionListener r0 = com.appsflyer.AppsFlyerLibCore.m6967()
                r0.onConversionDataFail(r4)
                return
            L_0x0022:
                com.appsflyer.AppsFlyerLibCore$b r2 = new com.appsflyer.AppsFlyerLibCore$b
                r2.<init>(r3)
                java.util.concurrent.ScheduledExecutorService r1 = r2.f6924
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                com.appsflyer.AppsFlyerLibCore.m6959(r1, r2, r0)
                return
            L_0x002f:
                java.lang.String r0 = java.lang.String.valueOf(r4)
                java.lang.String r0 = r2.concat(r0)
                com.appsflyer.AFLogger.afDebugLog(r0)
                com.appsflyer.AppsFlyerConversionListener r0 = com.appsflyer.AppsFlyerLibCore.m6967()
                r0.onConversionDataFail(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.RunnableC2285b.m7029(java.lang.String, int):void");
        }

        private RunnableC2285b(AppsFlyerLibCore appsFlyerLibCore, Application application, String str) {
            this.f6924 = AFExecutor.getInstance().mo6258();
            this.f6926 = new AtomicInteger(0);
            this.f6922 = appsFlyerLibCore;
            this.f6923 = application;
            this.f6921 = str;
            this.f6925 = 0;
        }

        /* synthetic */ RunnableC2285b(AppsFlyerLibCore appsFlyerLibCore, Application application, String str, byte b) {
            this(appsFlyerLibCore, application, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.AppsFlyerLibCore$e */
    public class RunnableC2287e implements Runnable {

        /* renamed from: ɩ */
        private AFEvent f6930;

        static {
            Covode.recordClassIndex(2516);
        }

        public final void run() {
            AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.this;
            AFEvent aFEvent = this.f6930;
            aFEvent.f6823 = aFEvent.f6812.get();
            appsFlyerLibCore.m6993((AppsFlyerLibCore) aFEvent);
        }

        private RunnableC2287e(AFEvent aFEvent) {
            this.f6930 = aFEvent;
        }

        /* synthetic */ RunnableC2287e(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent, byte b) {
            this(aFEvent);
        }
    }

    /* renamed from: ı */
    private static boolean m6961() {
        if (!m6986("waitForCustomerId") || AppsFlyerProperties.getInstance().getString("AppUserId") != null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: ɩ */
    private boolean m6985() {
        GoogleReferrer googleReferrer = this.f6888;
        if (googleReferrer == null || googleReferrer.oldMap.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: Ι */
    private boolean m6995() {
        Map<String, Object> map = this.f6889;
        if (map == null || map.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void unregisterConversionListener() {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "unregisterConversionListener", new String[0]);
        f6867 = null;
    }

    /* renamed from: com.appsflyer.AppsFlyerLibCore$10 */
    static /* synthetic */ class C227610 {

        /* renamed from: ι */
        static final /* synthetic */ int[] f6903;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 2505(0x9c9, float:3.51E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.appsflyer.AppsFlyerProperties$EmailsCryptType[] r0 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.appsflyer.AppsFlyerLibCore.C227610.f6903 = r2
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r0 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.SHA256     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.appsflyer.AppsFlyerLibCore.C227610.f6903     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r0 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.C227610.<clinit>():void");
        }
    }

    public AppsFlyerLibCore() {
        AFVersionDeclaration.init();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getSdkVersion() {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "getSdkVersion", new String[0]);
        return new StringBuilder("version: 5.4.1 (build ").append(f6866).append(")").toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.AppsFlyerLibCore$c */
    public class RunnableC2286c implements Runnable {

        /* renamed from: ι */
        private WeakReference<Context> f6928;

        static {
            Covode.recordClassIndex(2515);
        }

        public final void run() {
            MethodCollector.m26663i(1563);
            if (AppsFlyerLibCore.this.f6895) {
                MethodCollector.m26664o(1563);
                return;
            }
            AppsFlyerLibCore.this.f6900 = System.currentTimeMillis();
            if (this.f6928 == null) {
                MethodCollector.m26664o(1563);
                return;
            }
            AppsFlyerLibCore.this.f6895 = true;
            try {
                String r4 = AppsFlyerLibCore.m6968("AppsFlyerKey");
                synchronized (this.f6928) {
                    try {
                        C2294aa.m7047();
                        for (C2323j jVar : C2294aa.m7048(this.f6928.get())) {
                            AFLogger.afInfoLog(new StringBuilder("resending request: ").append(jVar.f7070).toString());
                            try {
                                long currentTimeMillis = System.currentTimeMillis();
                                long parseLong = Long.parseLong(jVar.f7071, 10);
                                AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.this;
                                AFEvent key = new CachedEvent().urlString(new StringBuilder().append(jVar.f7070).append("&isCachedRequest=true&timeincache=").append((currentTimeMillis - parseLong) / 1000).toString()).post(jVar.mo6466()).key(r4);
                                key.f6812 = this.f6928;
                                key.f6819 = jVar.f7071;
                                key.f6815 = false;
                                AppsFlyerLibCore.m6958(appsFlyerLibCore, key);
                            } catch (Exception e) {
                                AFLogger.afErrorLog("Failed to resend cached request", e);
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(1563);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                AFLogger.afErrorLog("failed to check cache. ", e2);
            } catch (Throwable th2) {
                AppsFlyerLibCore.this.f6895 = false;
                MethodCollector.m26664o(1563);
                throw th2;
            }
            AppsFlyerLibCore.this.f6895 = false;
            AppsFlyerLibCore.this.f6874.shutdown();
            AppsFlyerLibCore.this.f6874 = null;
            MethodCollector.m26664o(1563);
        }

        public RunnableC2286c(Context context) {
            this.f6928 = new WeakReference<>(context);
        }
    }

    static {
        Covode.recordClassIndex(2503);
        String obj = new StringBuilder().append("5.4").append("/androidevent?buildnumber=5.4.1&app_id=").toString();
        f6864 = obj;
        REGISTER_URL = new StringBuilder("https://%sregister.%s/api/v").append(obj).toString();
        String obj2 = new StringBuilder().append("5.4").append("/androidevent?app_id=").toString();
        f6871 = obj2;
        FIRST_LAUNCHES_URL = new StringBuilder("https://%sconversions.%s/api/v").append(obj2).toString();
        f6868 = new StringBuilder("https://%slaunches.%s/api/v").append(obj2).toString();
        f6869 = new StringBuilder("https://%sinapps.%s/api/v").append(obj2).toString();
        REFERRER_TRACKING_URL = new StringBuilder("https://%sattr.%s/api/v").append(obj2).toString();
    }

    /* renamed from: ι */
    private boolean m7006() {
        if (this.f6879 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f6879;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            long j = this.f6879;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format = simpleDateFormat.format(new Date(j));
            long j2 = this.f6873;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format2 = simpleDateFormat.format(new Date(j2));
            if (currentTimeMillis < this.f6886 && !isTrackingStopped()) {
                AFLogger.afInfoLog(C1764a.m5929a(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[]{format, format2, Long.valueOf(currentTimeMillis), Long.valueOf(this.f6886)}));
                return true;
            } else if (!isTrackingStopped()) {
                AFLogger.afInfoLog(C1764a.m5929a(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[]{format, format2, Long.valueOf(currentTimeMillis)}));
            }
        } else if (!isTrackingStopped()) {
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.AppsFlyerLibCore$a */
    public class RunnableC2284a implements Runnable {

        /* renamed from: ɩ */
        private final AFEvent f6917;

        static {
            Covode.recordClassIndex(2513);
        }

        /* renamed from: com_appsflyer_AppsFlyerLibCore$a_com_ss_android_ugc_aweme_lancet_LogLancet_i */
        public static int m7027xdc4d07b(String str, String str2) {
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:102:0x0231, code lost:
            r7.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0236, code lost:
            if (r7 == null) goto L_0x023b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
            r7.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x023b, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(214);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x023e, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x017b, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x017c, code lost:
            com.appsflyer.AFLogger.afErrorLog(r1.getMessage(), r1);
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(214);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0186, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0187, code lost:
            r3 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ad, code lost:
            r1.mkdir();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b2, code lost:
            r0 = r1.listFiles();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
            if (r0 == null) goto L_0x01c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01bd, code lost:
            m7027xdc4d07b("AppsFlyer_5.4.1", "reached cache limit, not caching request");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c5, code lost:
            m7027xdc4d07b("AppsFlyer_5.4.1", "caching request...");
            r6 = new java.io.File(com.appsflyer.internal.C2294aa.m7050(r2), java.lang.Long.toString(java.lang.System.currentTimeMillis()));
            r6.createNewFile();
            r2 = new java.io.OutputStreamWriter(new java.io.FileOutputStream(r6.getPath(), true));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
            r2.write("version=");
            r2.write(r5.f7072);
            r2.write(10);
            r2.write("url=");
            r2.write(r5.f7070);
            r2.write(10);
            r2.write("data=");
            r2.write(android.util.Base64.encodeToString(r5.mo6466(), 2));
            r2.write(10);
            r2.flush();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0224, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0225, code lost:
            r7 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0227, code lost:
            r7 = r2;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x0231  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x017b A[ExcHandler: all (r1v8 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:35:0x0110] */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01ad A[Catch:{ Exception -> 0x0228 }] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01b2 A[Catch:{ Exception -> 0x0228 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 586
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.RunnableC2284a.run():void");
        }

        private RunnableC2284a(AFEvent aFEvent) {
            this.f6917 = aFEvent.weakContext();
        }

        /* synthetic */ RunnableC2284a(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent, byte b) {
            this(aFEvent);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void enableFacebookDeferredApplinks(boolean z) {
        this.f6894 = z;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public AppsFlyerLib enableLocationCollection(boolean z) {
        this.f6880 = z;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setPluginDeepLinkData(Intent intent) {
        setDeepLinkData(intent);
    }

    /* renamed from: com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
    public static Bundle m6945x2d8003b8(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setPhoneNumber(String str) {
        this.f6898 = C2346z.m7160(str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void startTracking(Context context) {
        startTracking(context, null);
    }

    /* renamed from: com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m6948xfd752f51(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public static SharedPreferences getSharedPreferences(Context context) {
        return C34822d.m71158a(m6948xfd752f51(context), "appsflyer-data", 0);
    }

    /* renamed from: ǃ */
    static /* synthetic */ String m6968(String str) {
        return AppsFlyerProperties.getInstance().getString(str);
    }

    /* renamed from: і */
    private static boolean m7011(Context context) {
        if (!getSharedPreferences(context).contains("appsFlyerCount")) {
            return true;
        }
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void onPause(Context context) {
        if (Foreground.listener != null) {
            Foreground.listener.onBecameBackground(context);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        if (z) {
            logLevel = AFLogger.LogLevel.DEBUG;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setHostName(String str) {
        AppsFlyerProperties.getInstance().set("custom_host", str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setMinTimeBetweenSessions(int i) {
        this.f6886 = TimeUnit.SECONDS.toMillis((long) i);
    }

    /* renamed from: com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadScheduledExecutor */
    public static ScheduledExecutorService m6951x2f4f9ea2(ThreadFactory threadFactory) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = 1;
        a.f95509g = threadFactory;
        return (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: Ɩ */
    private static File m6964(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.trim().length() > 0) {
                return new File(str.trim());
            }
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ι */
    public static Map<String, Object> m7003(Context context) {
        String string = getSharedPreferences(context).getString("attributionId", null);
        if (string != null && string.length() > 0) {
            return m6955(string);
        }
        throw new C2345y();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getAttributionId(Context context) {
        try {
            return new C2297ac(context).mo6439();
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public boolean isPreInstalledApp(Context context) {
        try {
            if ((m6949xd88c3251(context.getPackageManager(), context.getPackageName(), 0).flags & 1) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setAndroidIdData(String str) {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "setAndroidIdData", str);
        this.f6891 = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setImeiData(String str) {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "setImeiData", str);
        this.f6890 = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setOaidData(String str) {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "setOaidData", str);
        this.f6883 = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setOneLinkCustomDomain(String... strArr) {
        AFLogger.afDebugLog(C1764a.m5928a("setOneLinkCustomDomain %s", new Object[]{Arrays.toString(strArr)}));
        AFDeepLinkManager.f6805 = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setResolveDeepLinkURLs(String... strArr) {
        AFLogger.afDebugLog(C1764a.m5928a("setResolveDeepLinkURLs %s", new Object[]{Arrays.toString(strArr)}));
        AFDeepLinkManager.f6806 = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setUserEmails(String... strArr) {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void waitForCustomerUserId(boolean z) {
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        AppsFlyerProperties.getInstance().set("waitForCustomerId", z);
    }

    /* access modifiers changed from: private */
    /* renamed from: ı */
    public static Map<String, Object> m6955(String str) {
        Object obj;
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!f6872.contains(next)) {
                    if (jSONObject.isNull(next)) {
                        obj = null;
                    } else {
                        obj = jSONObject.get(next);
                    }
                    hashMap.put(next, obj);
                }
            }
            return hashMap;
        } catch (JSONException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return null;
        }
    }

    /* renamed from: Ɩ */
    private static boolean m6965(Context context) {
        if (AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false) || AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false) || !m6988(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: ɩ */
    private static String m6979(Context context) {
        Intent intent;
        String str = null;
        if ((context instanceof Activity) && (intent = ((Activity) context).getIntent()) != null) {
            try {
                Bundle com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m6945x2d8003b8(intent);
                if (!(com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null || (str = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("af")) == null)) {
                    AFLogger.afInfoLog("Push Notification received af payload = ".concat(String.valueOf(str)));
                    com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.remove("af");
                    ((Activity) context).setIntent(intent.putExtras(com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras));
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        return str;
    }

    /* renamed from: ɹ */
    private static boolean m6988(Context context) {
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    /* renamed from: Ӏ */
    private static float m7012(Context context) {
        try {
            Intent com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver = m6950x6881477f(m6948xfd752f51(context), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver.getIntExtra("level", -1);
            int intExtra2 = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return 50.0f;
            }
            return (((float) intExtra) / ((float) intExtra2)) * 100.0f;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return 1.0f;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getAppsFlyerUID(Context context) {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "getAppsFlyerUID", new String[0]);
        return C2299ae.m7061(new WeakReference(context));
    }

    public String getConfiguredChannel(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("channel");
        if (string == null) {
            if (context == null) {
                return null;
            }
            string = m6980("CHANNEL", context.getPackageManager(), context.getPackageName());
            if (string == null) {
                return string;
            }
        }
        if (string.equals("")) {
            return null;
        }
        return string;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getOutOfStore(Context context) {
        String r0;
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        if (context != null && (r0 = m6980("AF_STORE", context.getPackageManager(), context.getPackageName())) != null) {
            return r0;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void reportTrackSession(Context context) {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "reportTrackSession", new String[0]);
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.f6994 = false;
        AFEvent context2 = new InAppEvent().context(context);
        context2.f6826 = null;
        context2.f6822 = null;
        mo6357(context2);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setAdditionalData(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            if (C2306ai.f6989 == null) {
                C2306ai.f6989 = new C2306ai();
            }
            C2306ai.f6989.mo6445("public_api_call", "setAdditionalData", hashMap.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(hashMap).toString());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setAppId(String str) {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "setAppId", str);
        AppsFlyerProperties.getInstance().set("appid", str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setCollectAndroidID(boolean z) {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "setCollectAndroidID", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("collectAndroidId", Boolean.toString(z));
        AppsFlyerProperties.getInstance().set("collectAndroidIdForceByUser", Boolean.toString(z));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setCollectIMEI(boolean z) {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "setCollectIMEI", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("collectIMEI", Boolean.toString(z));
        AppsFlyerProperties.getInstance().set("collectIMEIForceByUser", Boolean.toString(z));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setCollectOaid(boolean z) {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "setCollectOaid", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("collectOAID", Boolean.toString(z));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setConsumeAFDeepLinks(boolean z) {
        AppsFlyerProperties.getInstance().set("consumeAfDeepLink", z);
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "setConsumeAFDeepLinks: ".concat(String.valueOf(z)), new String[0]);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setCurrencyCode(String str) {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set("currencyCode", str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setCustomerUserId(String str) {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AppsFlyerProperties.getInstance().set("AppUserId", str);
    }

    /* access modifiers changed from: protected */
    public void setDeepLinkData(Intent intent) {
        if (intent != null) {
            try {
                if ("android.intent.action.VIEW".equals(intent.getAction())) {
                    this.latestDeepLink = intent.getData();
                    AFLogger.afDebugLog(new StringBuilder("Unity setDeepLinkData = ").append(this.latestDeepLink).toString());
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while setting deeplink data (unity). ", th);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setDeviceTrackingDisabled(boolean z) {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "setDeviceTrackingDisabled", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("deviceTrackingDisabled", z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setExtension(String str) {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "setExtension", str);
        AppsFlyerProperties.getInstance().set("sdkExtension", str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setIsUpdate(boolean z) {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("IS_UPDATE", z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setOutOfStore(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            return;
        }
        AFLogger.m6925("Cannot set setOutOfStore with null");
    }

    /* renamed from: com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection */
    public static URLConnection m6952x918ce728(URL url) {
        URLConnection aVar;
        URLConnection aVar2;
        C61425e<URL, URLConnection> m = C61439n.f139485e.mo68809m(new C61425e<>(url, null, null, EnumC61424d.CONTINUE));
        if (m.f139473f == EnumC61424d.INTERCEPT && m.f139469b != null) {
            R r = m.f139469b;
            if (r instanceof HttpsURLConnection) {
                aVar2 = new C61417b(r);
            } else if (!(r instanceof HttpURLConnection)) {
                return r;
            } else {
                aVar2 = new C61416a(r);
            }
            return aVar2;
        } else if (m.f139473f != EnumC61424d.EXCEPTION || m.f139472e == null) {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                aVar = new C61417b((HttpsURLConnection) openConnection);
            } else if (!(openConnection instanceof HttpURLConnection)) {
                return openConnection;
            } else {
                aVar = new C61416a((HttpURLConnection) openConnection);
            }
            return aVar;
        } else {
            throw m.f139472e;
        }
    }

    /* renamed from: ı */
    private void m6957(AFEvent aFEvent) {
        boolean z;
        aFEvent.mo6254();
        if (aFEvent.f6826 == null) {
            z = true;
        } else {
            z = false;
        }
        if (m6961()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        if (z) {
            if (!AppsFlyerProperties.getInstance().getBoolean("launchProtectEnabled", true)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            } else if (m7006()) {
                return;
            }
            this.f6879 = System.currentTimeMillis();
        }
        m6977(AFExecutor.getInstance().mo6258(), new RunnableC2287e(this, aFEvent.weakContext(), (byte) 0), 150, TimeUnit.MILLISECONDS);
    }

    /* renamed from: Ι */
    static /* synthetic */ void m6994(AppsFlyerLibCore appsFlyerLibCore) {
        AFEvent context = new Attr().context(appsFlyerLibCore.f6893);
        if (appsFlyerLibCore.m6985() && appsFlyerLibCore.m6996(context, getSharedPreferences(appsFlyerLibCore.f6893))) {
            appsFlyerLibCore.m6993(context);
        }
    }

    /* renamed from: І */
    private static boolean m7008(Context context) {
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) m6943x5597801d(context, "connectivity");
                    for (Network network : connectivityManager.getAllNetworks()) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                        if (networkCapabilities.hasTransport(4) && !networkCapabilities.hasCapability(15)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e);
                }
            } else {
                int i = Build.VERSION.SDK_INT;
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        NetworkInterface networkInterface = (NetworkInterface) it.next();
                        if (networkInterface.isUp()) {
                            arrayList.add(networkInterface.getName());
                        }
                    }
                    return arrayList.contains("tun0");
                } catch (Exception e2) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e2);
                }
            }
        }
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setAppInviteOneLink(String str) {
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString("oneLinkSlug"))) {
            AppsFlyerProperties.getInstance().remove("onelinkDomain");
            AppsFlyerProperties.getInstance().remove("onelinkVersion");
            AppsFlyerProperties.getInstance().remove("onelinkScheme");
        }
        AppsFlyerProperties.getInstance().set("oneLinkSlug", str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            z = true;
        } else {
            z = false;
        }
        if (C2306ai.f6989 == null) {
            C2306ai.f6989 = new C2306ai();
        }
        C2306ai.f6989.mo6445("public_api_call", "log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("shouldLog", z);
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setSharingFilter(String... strArr) {
        if (strArr != null && !Arrays.equals(this.f6899, new String[]{"all"})) {
            Pattern compile = Pattern.compile("[\\d\\w_]{1,45}");
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str == null || !compile.matcher(str).matches()) {
                    AFLogger.afWarnLog("Invalid partner name :".concat(String.valueOf(str)));
                } else {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f6899 = (String[]) arrayList.toArray(new String[0]);
            } else {
                this.f6899 = null;
            }
        }
    }

    /* renamed from: Ι */
    private static void m6992(Context context) {
        int i;
        MethodCollector.m26663i(2114);
        if (AndroidUtils.m6938()) {
            i = 23;
            AFLogger.afRDLog("OPPO device found");
        } else {
            i = 18;
        }
        if (Build.VERSION.SDK_INT < i || m6986("keyPropDisableAFKeystore")) {
            AFLogger.afRDLog(new StringBuilder("OS SDK is=").append(Build.VERSION.SDK_INT).append("; no KeyStore usage").toString());
            MethodCollector.m26664o(2114);
            return;
        }
        AFLogger.afRDLog(new StringBuilder("OS SDK is=").append(Build.VERSION.SDK_INT).append("; use KeyStore").toString());
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(context);
        if (!aFKeystoreWrapper.mo6265()) {
            aFKeystoreWrapper.f6840 = C2299ae.m7061(new WeakReference(context));
            aFKeystoreWrapper.f6838 = 0;
            aFKeystoreWrapper.mo6267(aFKeystoreWrapper.mo6266());
        } else {
            String r2 = aFKeystoreWrapper.mo6266();
            synchronized (aFKeystoreWrapper.f6836) {
                try {
                    aFKeystoreWrapper.f6838++;
                    AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(r2)));
                    try {
                        synchronized (aFKeystoreWrapper.f6836) {
                            try {
                                aFKeystoreWrapper.f6839.deleteEntry(r2);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (KeyStoreException e) {
                        AFLogger.afErrorLog(new StringBuilder("Exception ").append(e.getMessage()).append(" occurred").toString(), e);
                    }
                } finally {
                    MethodCollector.m26664o(2114);
                }
            }
            aFKeystoreWrapper.mo6267(aFKeystoreWrapper.mo6266());
        }
        AppsFlyerProperties.getInstance().set("KSAppsFlyerId", aFKeystoreWrapper.mo6264());
        AppsFlyerProperties.getInstance().set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.mo6268()));
        MethodCollector.m26664o(2114);
    }

    /* renamed from: ι */
    private static String m7002(String str) {
        String str2 = null;
        try {
            str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            return str2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return str2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void sendDeepLinkData(Activity activity) {
        if (activity == null) {
            if (C2306ai.f6989 == null) {
                C2306ai.f6989 = new C2306ai();
            }
            C2306ai.f6989.mo6445("public_api_call", "sendDeepLinkData", "activity_null");
        } else if (activity.getIntent() != null) {
            if (C2306ai.f6989 == null) {
                C2306ai.f6989 = new C2306ai();
            }
            C2306ai.f6989.mo6445("public_api_call", "sendDeepLinkData", activity.getLocalClassName(), new StringBuilder("activity_intent_").append(activity.getIntent().toString()).toString());
        } else {
            if (C2306ai.f6989 == null) {
                C2306ai.f6989 = new C2306ai();
            }
            C2306ai.f6989.mo6445("public_api_call", "sendDeepLinkData", activity.getLocalClassName(), "activity_intent_null");
        }
        try {
            startTracking(activity);
            AFLogger.afInfoLog(new StringBuilder("getDeepLinkData with activity ").append(activity.getIntent().getDataString()).toString());
        } catch (Exception e) {
            AFLogger.afInfoLog("getDeepLinkData Exception: ".concat(String.valueOf(e)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ */
    public static void m6984(Map<String, String> map) {
        if (f6867 != null) {
            try {
                AFLogger.afDebugLog(new StringBuilder("Calling onAppOpenAttribution with:\n").append(map.toString()).toString());
                f6867.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: Ι */
    private void m6993(AFEvent aFEvent) {
        boolean z;
        String str;
        ScheduledExecutorService r3;
        long j;
        Context context = aFEvent.context();
        String str2 = aFEvent.f6826;
        if (context == null) {
            AFLogger.afDebugLog("sendTrackingWithEvent - got null context. skipping event/launch.");
            return;
        }
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        AppsFlyerProperties.getInstance().saveProperties(sharedPreferences);
        if (!isTrackingStopped()) {
            AFLogger.afInfoLog(new StringBuilder("sendTrackingWithEvent from activity: ").append(context.getClass().getName()).toString());
        }
        boolean z2 = true;
        boolean z3 = false;
        if (str2 == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = aFEvent instanceof BackgroundReferrerLaunch;
        boolean z5 = aFEvent instanceof Attr;
        aFEvent.f6815 = z;
        Map<String, ?> r32 = mo6358(aFEvent);
        String str3 = (String) r32.get("appsflyerKey");
        if (str3 == null || str3.length() == 0) {
            AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
            return;
        }
        if (!isTrackingStopped()) {
            AFLogger.afInfoLog("AppsFlyerLib.sendTrackingWithEvent");
        }
        int launchCounter = getLaunchCounter(sharedPreferences, false);
        if (z5 || z4) {
            str = ServerConfigHandler.getUrl(REFERRER_TRACKING_URL);
        } else if (!z) {
            str = ServerConfigHandler.getUrl(f6869);
        } else if (launchCounter < 2) {
            str = ServerConfigHandler.getUrl(FIRST_LAUNCHES_URL);
        } else {
            str = ServerConfigHandler.getUrl(f6868);
        }
        String obj = new StringBuilder().append(new StringBuilder().append(str).append(context.getPackageName()).toString()).append("&buildnumber=5.4.1").toString();
        String configuredChannel = getConfiguredChannel(context);
        if (configuredChannel != null) {
            obj = new StringBuilder().append(obj).append("&channel=").append(configuredChannel).toString();
        }
        if (!AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false) && !AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false) && r32.get("advertiserId") != null) {
            try {
                if (TextUtils.isEmpty(this.f6891) && r32.remove("android_id") != null) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                if (TextUtils.isEmpty(this.f6890) && r32.remove("imei") != null) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                }
            } catch (Exception e) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
            }
        }
        AFEvent r0 = aFEvent.urlString(obj).params(r32).mo6254();
        r0.f6816 = launchCounter;
        RunnableC2284a aVar = new RunnableC2284a(this, r0, (byte) 0);
        if (z) {
            if (GoogleReferrer.allow(this, context) && !m6985()) {
                AFLogger.afDebugLog("Failed to get new referrer, wait ...");
                z3 = true;
            }
            HuaweiReferrer huaweiReferrer = this.f6897;
            if (huaweiReferrer != null && huaweiReferrer.valid()) {
                z3 = true;
            }
            if (this.f6894 && !m6995()) {
                AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                z3 = true;
            }
            if (!this.f6896 || m7013()) {
                z2 = z3;
            }
        } else {
            z2 = false;
        }
        if (AFDeepLinkManager.f6807) {
            AFLogger.afRDLog("ESP deeplink: execute launch on SerialExecutor");
            AFExecutor instance2 = AFExecutor.getInstance();
            if (instance2.f6830 == null) {
                instance2.f6830 = m6951x2f4f9ea2(instance2.f6829);
            }
            r3 = instance2.f6830;
        } else {
            r3 = AFExecutor.getInstance().mo6258();
        }
        if (z2) {
            j = 500;
        } else {
            j = 0;
        }
        m6977(r3, aVar, j, TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007c  */
    @Override // com.appsflyer.AppsFlyerLib
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendPushNotificationData(android.app.Activity r19) {
        /*
        // Method dump skipped, instructions count: 407
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.sendPushNotificationData(android.app.Activity):void");
    }

    /* renamed from: ı */
    private static void m6960(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2:
        while (true) {
            str = null;
            while (true) {
                if (keys2.hasNext()) {
                    if (str != null) {
                        break loop2;
                    }
                    String next = keys2.next();
                    try {
                        JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                        int i2 = 0;
                        while (i2 < jSONArray2.length()) {
                            if (jSONArray2.getLong(i2) == ((Number) arrayList.get(0)).longValue() || jSONArray2.getLong(i2) == ((Number) arrayList.get(1)).longValue()) {
                                break;
                            } else if (jSONArray2.getLong(i2) == ((Number) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                            } else {
                                i2++;
                                str = next;
                            }
                        }
                        continue;
                    } catch (JSONException unused2) {
                    }
                } else if (str == null) {
                    return;
                }
            }
        }
        jSONObject.remove(str);
    }

    /* renamed from: ɩ */
    private static boolean m6986(String str) {
        return AppsFlyerProperties.getInstance().getBoolean(str, false);
    }

    /* renamed from: ι */
    private void m7004(AFEvent aFEvent) {
        boolean z;
        Throwable th;
        String str;
        Throwable th2;
        MethodCollector.m26663i(3309);
        URL url = new URL(aFEvent.f6825);
        byte[] r11 = aFEvent.mo6256();
        String key = aFEvent.key();
        String str2 = aFEvent.f6819;
        boolean r17 = aFEvent.mo6255();
        Context context = aFEvent.context();
        AppsFlyerTrackingRequestListener appsFlyerTrackingRequestListener = aFEvent.f6817;
        if (!r17 || f6867 == null) {
            z = false;
        } else {
            z = true;
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) m6952x918ce728(url);
            try {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(r11.length));
                if (aFEvent.isEncrypt()) {
                    str = "application/octet-stream";
                } else {
                    str = "application/json";
                }
                httpURLConnection.setRequestProperty("Content-Type", str);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setDoOutput(true);
                try {
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    try {
                        dataOutputStream.write(r11);
                        dataOutputStream.close();
                        int responseCode = httpURLConnection.getResponseCode();
                        String r15 = mo6355(httpURLConnection);
                        if (C2306ai.f6989 == null) {
                            C2306ai.f6989 = new C2306ai();
                        }
                        C2306ai.f6989.mo6445("server_response", url.toString(), String.valueOf(responseCode), r15);
                        AFLogger.afInfoLog("response code: ".concat(String.valueOf(responseCode)));
                        SharedPreferences sharedPreferences = getSharedPreferences(context);
                        if (responseCode == 200) {
                            if (context != null && r17) {
                                this.f6873 = System.currentTimeMillis();
                            }
                            if (appsFlyerTrackingRequestListener != null) {
                                appsFlyerTrackingRequestListener.onTrackingRequestSuccess();
                            }
                            if (str2 != null) {
                                C2294aa.m7047();
                                C2294aa.m7049(str2, context);
                            } else {
                                SharedPreferences.Editor edit = getSharedPreferences(context).edit();
                                edit.putString("sentSuccessfully", "true");
                                edit.apply();
                                if (!this.f6895 && System.currentTimeMillis() - this.f6900 >= 15000 && this.f6874 == null) {
                                    this.f6874 = AFExecutor.getInstance().mo6258();
                                    m6977(this.f6874, new RunnableC2286c(context), 1, TimeUnit.SECONDS);
                                }
                            }
                            String string = AppsFlyerProperties.getInstance().getString("afUninstallToken");
                            if (string != null) {
                                AFLogger.afDebugLog("Uninstall Token exists: ".concat(String.valueOf(string)));
                                if (!sharedPreferences.getBoolean("sentRegisterRequestToAF", false)) {
                                    AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf(string)));
                                    C2300af.m7062(context, string);
                                }
                            }
                            if (this.latestDeepLink != null) {
                                this.latestDeepLink = null;
                            }
                            this.f6881 = ServerConfigHandler.m7039(r15).optBoolean("send_background", false);
                        } else if (appsFlyerTrackingRequestListener != null) {
                            appsFlyerTrackingRequestListener.onTrackingRequestFailure("Failure: ".concat(String.valueOf(responseCode)));
                        }
                        long j = sharedPreferences.getLong("appsflyerConversionDataCacheExpiration", 0);
                        if (j != 0 && System.currentTimeMillis() - j > 5184000000L) {
                            SharedPreferences.Editor edit2 = getSharedPreferences(context).edit();
                            edit2.putBoolean("sixtyDayConversionData", true);
                            edit2.apply();
                            SharedPreferences.Editor edit3 = getSharedPreferences(context).edit();
                            edit3.putString("attributionId", null);
                            edit3.apply();
                            m6982(context, "appsflyerConversionDataCacheExpiration", 0);
                        }
                        if (sharedPreferences.getString("attributionId", null) == null) {
                            if (key != null) {
                                if (z) {
                                    RunnableC2285b bVar = new RunnableC2285b(this, (Application) m6948xfd752f51(context), key, (byte) 0);
                                    m6977(bVar.f6924, bVar, 10, TimeUnit.MILLISECONDS);
                                }
                                httpURLConnection.disconnect();
                                MethodCollector.m26664o(3309);
                            }
                        } else if (key != null) {
                            if (z && sharedPreferences.getString("attributionId", null) != null && getLaunchCounter(sharedPreferences, false) > 1) {
                                try {
                                    Map<String, Object> r3 = m7003(context);
                                    if (r3 != null) {
                                        try {
                                            if (!r3.containsKey("is_first_launch")) {
                                                r3.put("is_first_launch", Boolean.FALSE);
                                            }
                                            AFLogger.afDebugLog(new StringBuilder("Calling onConversionDataSuccess with:\n").append(r3.toString()).toString());
                                            f6867.onConversionDataSuccess(r3);
                                        } catch (Throwable th3) {
                                            AFLogger.afErrorLog(th3.getLocalizedMessage(), th3);
                                        }
                                    }
                                } catch (C2345y e) {
                                    AFLogger.afErrorLog(e.getMessage(), e);
                                }
                            }
                            httpURLConnection.disconnect();
                            MethodCollector.m26664o(3309);
                        }
                        AFLogger.afWarnLog("AppsFlyer dev key is missing.");
                        httpURLConnection.disconnect();
                        MethodCollector.m26664o(3309);
                    } catch (Throwable th4) {
                        th2 = th4;
                        dataOutputStream.close();
                        MethodCollector.m26664o(3309);
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    if (appsFlyerTrackingRequestListener != null) {
                        appsFlyerTrackingRequestListener.onTrackingRequestFailure("No Connectivity");
                    }
                    MethodCollector.m26664o(3309);
                    throw th2;
                }
            } catch (Throwable th6) {
                th = th6;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                MethodCollector.m26664o(3309);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            MethodCollector.m26664o(3309);
            throw th;
        }
    }

    /* renamed from: ı */
    private boolean m6962(Context context) {
        try {
            Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
            final long currentTimeMillis = System.currentTimeMillis();
            this.f6892 = new ConcurrentHashMap();
            C22794 r3 = new C2332t.AbstractC2334d() {
                /* class com.appsflyer.AppsFlyerLibCore.C22794 */

                static {
                    Covode.recordClassIndex(2508);
                }

                @Override // com.appsflyer.internal.C2332t.AbstractC2334d
                /* renamed from: ǃ */
                public final void mo6365(String str, Exception exc) {
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    AppsFlyerLibCore.this.f6892.put("error", message);
                    AFLogger.afErrorLog(str, exc, true);
                }

                @Override // com.appsflyer.internal.C2332t.AbstractC2334d
                /* renamed from: ı */
                public final void mo6364(String str, String str2) {
                    AppsFlyerLibCore.this.f6892.put("signedData", str);
                    AppsFlyerLibCore.this.f6892.put("signature", str2);
                    AppsFlyerLibCore.this.f6892.put("ttr", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                }
            };
            try {
                Class<?> cls = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                Class<?> cls2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                Method method = cls.getMethod("checkLicense", Long.TYPE, Context.class, cls2);
                C2332t.C23333 r6 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0037: CONSTRUCTOR  (r6v1 'r6' com.appsflyer.internal.t$3) = (r3v0 'r3' com.appsflyer.AppsFlyerLibCore$4) call: com.appsflyer.internal.t.3.<init>(com.appsflyer.internal.t$d):void type: CONSTRUCTOR in method: com.appsflyer.AppsFlyerLibCore.ￄﾱ(android.content.Context):boolean, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.appsflyer.internal.t, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    */
                /*
                // Method dump skipped, instructions count: 140
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m6962(android.content.Context):boolean");
            }

            /* renamed from: ι */
            private static boolean m7007(File file) {
                if (file == null || !file.exists()) {
                    return true;
                }
                return false;
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void updateServerUninstallToken(Context context, String str) {
                C2300af.m7062(context, str);
            }

            /* renamed from: com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_get */
            public static Object m6944xdc074f5(Bundle bundle, String str) {
                try {
                    return bundle.get(str);
                } catch (Exception | OutOfMemoryError unused) {
                    return null;
                }
            }

            /* renamed from: com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra */
            public static String m6946xbe299e4a(Intent intent, String str) {
                try {
                    return intent.getStringExtra(str);
                } catch (Exception unused) {
                    return null;
                }
            }

            /* access modifiers changed from: protected */
            public void getConversionData(Context context, final ConversionDataListener conversionDataListener) {
                f6867 = new AppsFlyerConversionListener() {
                    /* class com.appsflyer.AppsFlyerLibCore.C22816 */

                    static {
                        Covode.recordClassIndex(2510);
                    }

                    @Override // com.appsflyer.AppsFlyerConversionListener
                    public final void onAppOpenAttribution(Map<String, String> map) {
                    }

                    @Override // com.appsflyer.AppsFlyerConversionListener
                    public final void onAttributionFailure(String str) {
                    }

                    @Override // com.appsflyer.AppsFlyerConversionListener
                    public final void onConversionDataFail(String str) {
                        AFLogger.afDebugLog("Calling onConversionFailure with:\n".concat(String.valueOf(str)));
                        ConversionDataListener.this.onConversionFailure(str);
                    }

                    @Override // com.appsflyer.AppsFlyerConversionListener
                    public final void onConversionDataSuccess(Map<String, Object> map) {
                        AFLogger.afDebugLog(new StringBuilder("Calling onConversionDataLoaded with:\n").append(map.toString()).toString());
                        ConversionDataListener.this.onConversionDataLoaded(map);
                    }
                };
            }

            public final int getLaunchCounter(SharedPreferences sharedPreferences, boolean z) {
                return m6989(sharedPreferences, "appsFlyerCount", z);
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void startTracking(Context context, String str) {
                startTracking(context, str, null);
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
                if (C2306ai.f6989 == null) {
                    C2306ai.f6989 = new C2306ai();
                }
                C2306ai.f6989.mo6445("public_api_call", "registerConversionListener", new String[0]);
                if (appsFlyerConversionListener != null) {
                    f6867 = appsFlyerConversionListener;
                }
            }

            /* renamed from: ǃ */
            private static String m6969(SimpleDateFormat simpleDateFormat, Context context) {
                String string = getSharedPreferences(context).getString("appsFlyerFirstInstall", null);
                if (string == null) {
                    if (m7011(context)) {
                        AFLogger.afDebugLog("AppsFlyer: first launch detected");
                        string = simpleDateFormat.format(new Date());
                    } else {
                        string = "";
                    }
                    SharedPreferences.Editor edit = getSharedPreferences(context).edit();
                    edit.putString("appsFlyerFirstInstall", string);
                    edit.apply();
                }
                AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(string)));
                return string;
            }

            /* access modifiers changed from: private */
            /* renamed from: ι */
            public static String m7000(Context context, String str) {
                SharedPreferences sharedPreferences = getSharedPreferences(context);
                if (sharedPreferences.contains("CACHED_CHANNEL")) {
                    return sharedPreferences.getString("CACHED_CHANNEL", null);
                }
                SharedPreferences.Editor edit = getSharedPreferences(context).edit();
                edit.putString("CACHED_CHANNEL", str);
                edit.apply();
                return str;
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
                if (C2306ai.f6989 == null) {
                    C2306ai.f6989 = new C2306ai();
                }
                C2306ai.f6989.mo6445("public_api_call", "registerValidatorListener", new String[0]);
                AFLogger.afDebugLog("registerValidatorListener called");
                if (appsFlyerInAppPurchaseValidatorListener == null) {
                    AFLogger.afDebugLog("registerValidatorListener null listener");
                } else {
                    f6865 = appsFlyerInAppPurchaseValidatorListener;
                }
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void setHost(String str, String str2) {
                if (str != null) {
                    AppsFlyerProperties.getInstance().set("custom_host_prefix", str);
                }
                if (str2 == null || str2.isEmpty()) {
                    AFLogger.afWarnLog("hostName cannot be null or empty");
                } else {
                    AppsFlyerProperties.getInstance().set("custom_host", str2);
                }
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void trackAppLaunch(Context context, String str) {
                if (GoogleReferrer.allow(this, context)) {
                    if (this.f6888 == null) {
                        this.f6888 = new GoogleReferrer();
                        AFLogger.afDebugLog("Connecting to Install Referrer Library...");
                        this.f6888.start(context, new Runnable() {
                            /* class com.appsflyer.AppsFlyerLibCore.RunnableC22839 */

                            static {
                                Covode.recordClassIndex(2512);
                            }

                            public final void run() {
                                try {
                                    AFLogger.afDebugLog("Install Referrer collected locally");
                                    AppsFlyerLibCore.m6994(AppsFlyerLibCore.this);
                                } catch (Throwable th) {
                                    AFLogger.afErrorLog(th.getMessage(), th);
                                }
                            }
                        });
                    } else {
                        AFLogger.afWarnLog("GoogleReferrer instance already created");
                    }
                }
                m6974(context, str, "", (Intent) null);
            }

            /* renamed from: com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
            public static Object m6943x5597801d(Context context, String str) {
                Object obj;
                MethodCollector.m26663i(2990);
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
                            MethodCollector.m26664o(2990);
                        }
                    }
                } else {
                    obj = context.getSystemService(str);
                }
                return obj;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[SYNTHETIC, Splitter:B:16:0x0031] */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
            /* renamed from: ι */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static java.lang.String m7001(java.io.File r4, java.lang.String r5) {
                /*
                // Method dump skipped, instructions count: 107
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m7001(java.io.File, java.lang.String):java.lang.String");
            }

            @Override // com.appsflyer.AppsFlyerLib
            public AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener) {
                String str2;
                if (C2306ai.f6989 == null) {
                    C2306ai.f6989 = new C2306ai();
                }
                C2306ai aiVar = C2306ai.f6989;
                String[] strArr = new String[2];
                strArr[0] = str;
                if (appsFlyerConversionListener == null) {
                    str2 = "null";
                } else {
                    str2 = "conversionDataListener";
                }
                strArr[1] = str2;
                aiVar.mo6445("public_api_call", "init", strArr);
                AFLogger.m6922(C1764a.m5928a("Initializing AppsFlyer SDK: (v%s.%s)", new Object[]{BuildConfig.VERSION_NAME, f6866}));
                this.f6884 = true;
                AppsFlyerProperties.getInstance().set("AppsFlyerKey", str);
                C2305ah.m7070(str);
                f6867 = appsFlyerConversionListener;
                return this;
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void performOnAppAttribution(Context context, URI uri) {
                if (uri == null || uri.toString().isEmpty()) {
                    AppsFlyerConversionListener appsFlyerConversionListener = f6867;
                    if (appsFlyerConversionListener != null) {
                        appsFlyerConversionListener.onAttributionFailure(new StringBuilder("Link is \"").append(uri).append("\"").toString());
                    }
                } else if (context == null) {
                    AppsFlyerConversionListener appsFlyerConversionListener2 = f6867;
                    if (appsFlyerConversionListener2 != null) {
                        appsFlyerConversionListener2.onAttributionFailure(new StringBuilder("Context is \"").append(context).append("\"").toString());
                    }
                } else {
                    AFDeepLinkManager.getInstance();
                    AFDeepLinkManager.m6897(context, new HashMap(), Uri.parse(uri.toString()));
                }
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void setCustomerIdAndTrack(String str, Context context) {
                Intent intent;
                if (context == null) {
                    return;
                }
                if (m6961()) {
                    setCustomerUserId(str);
                    AppsFlyerProperties.getInstance().set("waitForCustomerId", false);
                    AFLogger.afInfoLog(new StringBuilder("CustomerUserId set: ").append(str).append(" - Initializing AppsFlyer Tacking").toString(), true);
                    String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
                    String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
                    if (referrer == null) {
                        referrer = "";
                    }
                    if (context instanceof Activity) {
                        intent = ((Activity) context).getIntent();
                    } else {
                        intent = null;
                    }
                    m6974(context, string, referrer, intent);
                    if (AppsFlyerProperties.getInstance().getString("afUninstallToken") != null) {
                        mo6359(context, AppsFlyerProperties.getInstance().getString("afUninstallToken"));
                        return;
                    }
                    return;
                }
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void stopTracking(boolean z, Context context) {
                this.f6885 = z;
                C2294aa.m7047();
                try {
                    File r1 = C2294aa.m7050(context);
                    if (!r1.exists()) {
                        r1.mkdir();
                    } else {
                        File[] listFiles = r1.listFiles();
                        for (File file : listFiles) {
                            m6947xba03987e("AppsFlyer_5.4.1", new StringBuilder("Found cached request").append(file.getName()).toString());
                            C2294aa.m7049(C2294aa.m7046(file).f7071, context);
                        }
                    }
                } catch (Exception unused) {
                    m6947xba03987e("AppsFlyer_5.4.1", "Could not cache request");
                }
                if (this.f6885) {
                    SharedPreferences.Editor edit = getSharedPreferences(context).edit();
                    edit.putBoolean("is_stop_tracking_used", true);
                    edit.apply();
                }
            }

            /* renamed from: ı */
            static void m6956(Context context, String str) {
                JSONObject jSONObject;
                JSONArray jSONArray;
                AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String string = getSharedPreferences(context).getString("extraReferrers", null);
                    if (string == null) {
                        jSONObject = new JSONObject();
                        jSONArray = new JSONArray();
                    } else {
                        jSONObject = new JSONObject(string);
                        if (jSONObject.has(str)) {
                            jSONArray = new JSONArray((String) jSONObject.get(str));
                        } else {
                            jSONArray = new JSONArray();
                        }
                    }
                    if (((long) jSONArray.length()) < 5) {
                        jSONArray.put(currentTimeMillis);
                    }
                    if (((long) jSONObject.length()) >= 4) {
                        m6960(jSONObject);
                    }
                    jSONObject.put(str, jSONArray.toString());
                    String jSONObject2 = jSONObject.toString();
                    SharedPreferences.Editor edit = getSharedPreferences(context).edit();
                    edit.putString("extraReferrers", jSONObject2);
                    edit.apply();
                } catch (JSONException unused) {
                } catch (Throwable th) {
                    AFLogger.afErrorLog(new StringBuilder("Couldn't save referrer - ").append(str).append(": ").toString(), th);
                }
            }

            /* renamed from: ɩ */
            private static void m6983(Context context, Map<String, ? super String> map) {
                C2329s.C2330a r2 = C2329s.m7141(context);
                map.put("network", r2.f7099);
                if (r2.f7101 != null) {
                    map.put("operator", r2.f7101);
                }
                if (r2.f7100 != null) {
                    map.put("carrier", r2.f7100);
                }
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
                ArrayList arrayList = new ArrayList(strArr.length + 1);
                arrayList.add(emailsCryptType.toString());
                arrayList.addAll(Arrays.asList(strArr));
                if (C2306ai.f6989 == null) {
                    C2306ai.f6989 = new C2306ai();
                }
                C2306ai.f6989.mo6445("public_api_call", "setUserEmails", (String[]) arrayList.toArray(new String[(strArr.length + 1)]));
                AppsFlyerProperties.getInstance().set("userEmailsCryptType", emailsCryptType.getValue());
                HashMap hashMap = new HashMap();
                String str = null;
                ArrayList arrayList2 = new ArrayList();
                for (String str2 : strArr) {
                    if (C227610.f6903[emailsCryptType.ordinal()] != 2) {
                        arrayList2.add(C2346z.m7160(str2));
                        str = "sha256_el_arr";
                    } else {
                        arrayList2.add(str2);
                        str = "plain_el_arr";
                    }
                }
                hashMap.put(str, arrayList2);
                AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
            }

            /* renamed from: ı */
            static /* synthetic */ void m6958(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent) {
                String jSONObject;
                AFLogger.afInfoLog(new StringBuilder("url: ").append(aFEvent.urlString()).toString());
                if (aFEvent.f6819 != null) {
                    jSONObject = Base64.encodeToString(aFEvent.mo6256(), 2);
                    AFLogger.afInfoLog("cached data: ".concat(String.valueOf(jSONObject)));
                } else {
                    jSONObject = new JSONObject(aFEvent.params()).toString();
                    C2305ah.m7071("data: ".concat(String.valueOf(jSONObject)));
                }
                if (C2306ai.f6989 == null) {
                    C2306ai.f6989 = new C2306ai();
                }
                C2306ai.f6989.mo6445("server_request", aFEvent.urlString(), jSONObject);
                try {
                    appsFlyerLibCore.m7004(aFEvent);
                } catch (IOException e) {
                    AFLogger.afErrorLog("Exception in sendRequestToServer. ", e);
                    if (AppsFlyerProperties.getInstance().getBoolean("useHttpFallback", false)) {
                        appsFlyerLibCore.m7004(aFEvent.urlString(aFEvent.urlString().replace("https:", "http:")));
                    } else {
                        AFLogger.afInfoLog(new StringBuilder("failed to send requeset to server. ").append(e.getLocalizedMessage()).toString());
                        throw e;
                    }
                }
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void sendAdRevenue(Context context, Map<String, Object> map) {
                AFEvent context2 = new AdRevenue().context(context);
                context2.f6822 = map;
                Context context3 = context2.context();
                String obj = new StringBuilder().append(ServerConfigHandler.getUrl(f6870)).append(context3.getPackageName()).toString();
                SharedPreferences sharedPreferences = getSharedPreferences(context3);
                int launchCounter = getLaunchCounter(sharedPreferences, false);
                int r2 = m6989(sharedPreferences, "appsFlyerAdRevenueCount", true);
                HashMap hashMap = new HashMap();
                hashMap.put("ad_network", context2.f6822);
                hashMap.put("adrevenue_counter", Integer.valueOf(r2));
                String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
                hashMap.put("af_key", string);
                hashMap.put("launch_counter", Integer.valueOf(launchCounter));
                hashMap.put("af_timestamp", Long.toString(new Date().getTime()));
                hashMap.put("uid", C2299ae.m7061(new WeakReference(context3)));
                String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
                hashMap.put("advertiserIdEnabled", AppsFlyerProperties.getInstance().getString("advertiserIdEnabled"));
                if (string2 != null) {
                    hashMap.put("advertiserId", string2);
                }
                hashMap.put("device", Build.DEVICE);
                m6975(context3, hashMap);
                try {
                    PackageInfo packageInfo = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0);
                    hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
                    long j = packageInfo.firstInstallTime;
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    hashMap.put("install_date", simpleDateFormat.format(new Date(j)));
                    String string3 = sharedPreferences.getString("appsFlyerFirstInstall", null);
                    if (string3 == null) {
                        string3 = m6969(simpleDateFormat, context3);
                    }
                    hashMap.put("first_launch_date", string3);
                } catch (Throwable th) {
                    AFLogger.afErrorLog("AdRevenue - Exception while collecting app version data ", th);
                }
                AFEvent r0 = context2.urlString(obj).params(hashMap).mo6254();
                r0.f6816 = launchCounter;
                m6977(AFExecutor.getInstance().mo6258(), new RunnableC2284a(this, r0.key(string), (byte) 0), 1, TimeUnit.MILLISECONDS);
            }

            /* renamed from: ǃ */
            private static void m6975(Context context, Map<String, Object> map) {
                String str;
                WindowManager windowManager = (WindowManager) m6943x5597801d(context, "window");
                if (windowManager != null) {
                    int rotation = windowManager.getDefaultDisplay().getRotation();
                    if (rotation == 0) {
                        str = "p";
                    } else if (rotation == 1) {
                        str = "l";
                    } else if (rotation == 2) {
                        str = "pr";
                    } else if (rotation != 3) {
                        str = "";
                    } else {
                        str = "lr";
                    }
                    map.put("sc_o", str);
                }
            }

            /* renamed from: Ι */
            private boolean m6996(AFEvent aFEvent, SharedPreferences sharedPreferences) {
                boolean z;
                int launchCounter = getLaunchCounter(sharedPreferences, false);
                if (launchCounter != 1 || (aFEvent instanceof Attr)) {
                    z = false;
                } else {
                    z = true;
                }
                if ((sharedPreferences.getBoolean("newGPReferrerSent", false) || launchCounter != 1) && !z) {
                    return false;
                }
                return true;
            }

            /* renamed from: ɩ */
            public final void mo6359(Context context, String str) {
                if (m6961()) {
                    AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
                    return;
                }
                HashMap hashMap = new HashMap();
                String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
                if (string == null) {
                    AFLogger.afWarnLog("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
                    return;
                }
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                    hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
                    hashMap.put("app_version_name", packageInfo.versionName);
                    hashMap.put("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
                    long j = packageInfo.firstInstallTime;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    hashMap.put("installDate", simpleDateFormat.format(new Date(j)));
                } catch (Throwable th) {
                    AFLogger.afErrorLog("Exception while collecting application version info.", th);
                }
                m6983(context, hashMap);
                String string2 = AppsFlyerProperties.getInstance().getString("AppUserId");
                if (string2 != null) {
                    hashMap.put("appUserId", string2);
                }
                try {
                    hashMap.put("model", Build.MODEL);
                    hashMap.put("brand", Build.BRAND);
                } catch (Throwable th2) {
                    AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
                }
                if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
                    hashMap.put("deviceTrackingDisabled", "true");
                }
                C2341w r6 = C2339v.m7150(context.getContentResolver());
                if (r6 != null) {
                    hashMap.put("amazon_aid", r6.f7110);
                    hashMap.put("amazon_aid_limit", String.valueOf(r6.mo6490()));
                }
                String string3 = AppsFlyerProperties.getInstance().getString("advertiserId");
                if (string3 != null) {
                    hashMap.put("advertiserId", string3);
                }
                hashMap.put("devkey", string);
                hashMap.put("uid", C2299ae.m7061(new WeakReference(context)));
                hashMap.put("af_gcm_token", str);
                hashMap.put("launch_counter", Integer.toString(getLaunchCounter(getSharedPreferences(context), false)));
                hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
                String configuredChannel = getConfiguredChannel(context);
                if (configuredChannel != null) {
                    hashMap.put("channel", configuredChannel);
                }
                try {
                    new Thread(new RunnableC2298ad((BackgroundEvent) new UninstallTokenEvent().trackingStopped(isTrackingStopped()).params(hashMap).context(context).urlString(new StringBuilder().append(ServerConfigHandler.getUrl(REGISTER_URL)).append(packageName).toString()))).start();
                } catch (Throwable th3) {
                    AFLogger.afErrorLog(th3.getMessage(), th3);
                }
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void trackEvent(Context context, String str, Map<String, Object> map) {
                trackEvent(context, str, map, null);
            }

            /* access modifiers changed from: private */
            /* renamed from: ɩ */
            public static void m6982(Context context, String str, long j) {
                SharedPreferences.Editor edit = getSharedPreferences(context).edit();
                edit.putLong(str, j);
                edit.apply();
            }

            /* renamed from: com_appsflyer_AppsFlyerLibCore_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver */
            public static Intent m6942x6619fc5b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
                try {
                    return context.registerReceiver(broadcastReceiver, intentFilter);
                } catch (Exception e) {
                    if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                        return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                    }
                    throw e;
                }
            }

            /* renamed from: com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo */
            public static ApplicationInfo m6949xd88c3251(PackageManager packageManager, String str, int i) {
                if (!TextUtils.equals(str, C17867d.m33078a().getPackageName()) || i != 128) {
                    return packageManager.getApplicationInfo(str, i);
                }
                if (C58014b.f132218a == null) {
                    C58014b.f132218a = packageManager.getApplicationInfo(str, i);
                }
                return C58014b.f132218a;
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
            /* renamed from: com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static android.content.Intent m6950x6881477f(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
                /*
                    android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
                    com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
                    android.content.Intent r0 = m6942x6619fc5b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m6950x6881477f(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
            }

            /* renamed from: Ι */
            private static int m6989(SharedPreferences sharedPreferences, String str, boolean z) {
                int i = sharedPreferences.getInt(str, 0);
                if (z) {
                    i++;
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putInt(str, i);
                    edit.apply();
                }
                if (C2306ai.f6989 == null) {
                    C2306ai.f6989 = new C2306ai();
                }
                if (C2306ai.f6989.mo6452()) {
                    if (C2306ai.f6989 == null) {
                        C2306ai.f6989 = new C2306ai();
                    }
                    C2306ai.f6989.mo6448(String.valueOf(i));
                }
                return i;
            }

            /* renamed from: ɩ */
            private static String m6980(String str, PackageManager packageManager, String str2) {
                Object com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
                try {
                    Bundle bundle = ((PackageItemInfo) m6949xd88c3251(packageManager, str2, 128)).metaData;
                    if (bundle == null || (com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_get = m6944xdc074f5(bundle, str)) == null) {
                        return null;
                    }
                    String obj = com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_IntentLancet_get.toString();
                    if (!obj.replaceAll("\\p{C}", "").equals(obj)) {
                        AFLogger.afWarnLog(new StringBuilder("Manifest meta-data ").append(str).append(": ").append(obj).append(" contains non-printing characters").toString());
                    }
                    return obj;
                } catch (Throwable th) {
                    AFLogger.afErrorLog(new StringBuilder("Could not find ").append(str).append(" value in the manifest").toString(), th);
                    return null;
                }
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void setPreinstallAttribution(String str, String str2, String str3) {
                AFLogger.afDebugLog("setPreinstallAttribution API called");
                JSONObject jSONObject = new JSONObject();
                if (str != null) {
                    try {
                        jSONObject.put("pid", str);
                    } catch (JSONException e) {
                        AFLogger.afErrorLog(e.getMessage(), e);
                    }
                }
                if (str2 != null) {
                    jSONObject.put("c", str2);
                }
                if (str3 != null) {
                    jSONObject.put("af_siteid", str3);
                }
                if (jSONObject.has("pid")) {
                    AppsFlyerProperties.getInstance().set("preInstallName", jSONObject.toString());
                    return;
                }
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void trackLocation(Context context, double d, double d2) {
                if (C2306ai.f6989 == null) {
                    C2306ai.f6989 = new C2306ai();
                }
                C2306ai.f6989.mo6445("public_api_call", "trackLocation", String.valueOf(d), String.valueOf(d2));
                HashMap hashMap = new HashMap();
                hashMap.put("af_long", Double.toString(d2));
                hashMap.put("af_lat", Double.toString(d));
                AFEvent context2 = new InAppEvent().context(context);
                context2.f6826 = "af_location_coordinates";
                context2.f6822 = hashMap;
                mo6357(context2);
            }

            /* renamed from: ǃ */
            static /* synthetic */ void m6973(Context context, String str, String str2) {
                SharedPreferences.Editor edit = getSharedPreferences(context).edit();
                edit.putString(str, str2);
                edit.apply();
            }

            /* access modifiers changed from: protected */
            public void handleDeepLinkCallback(Context context, Map<String, Object> map, Uri uri) {
                String substring;
                String obj = uri.toString();
                if (obj == null) {
                    obj = null;
                } else if (obj.matches("fb\\d*?://authorize.*") && obj.contains("access_token")) {
                    int indexOf = obj.indexOf(63);
                    if (indexOf == -1) {
                        substring = "";
                    } else {
                        substring = obj.substring(indexOf);
                    }
                    if (substring.length() != 0) {
                        ArrayList arrayList = new ArrayList();
                        if (substring.contains("&")) {
                            arrayList = new ArrayList(Arrays.asList(substring.split("&")));
                        } else {
                            arrayList.add(substring);
                        }
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (str.contains("access_token")) {
                                it.remove();
                            } else {
                                if (sb.length() != 0) {
                                    sb.append("&");
                                } else if (!str.startsWith("?")) {
                                    sb.append("?");
                                }
                                sb.append(str);
                            }
                        }
                        obj = obj.replace(substring, sb.toString());
                    }
                }
                if (!map.containsKey("af_deeplink")) {
                    map.put("af_deeplink", obj);
                }
                final HashMap hashMap = new HashMap();
                hashMap.put("link", uri.toString());
                final WeakReference weakReference = new WeakReference(context);
                C2295ab abVar = new C2295ab(uri, this);
                abVar.setConnProvider(new OneLinkHttpTask.HttpsUrlConnectionProvider());
                if (abVar.mo6438()) {
                    abVar.f6972 = new C2295ab.AbstractC2296b() {
                        /* class com.appsflyer.AppsFlyerLibCore.C22828 */

                        static {
                            Covode.recordClassIndex(2511);
                        }

                        /* renamed from: ı */
                        private void m7024(Map<String, String> map) {
                            if (weakReference.get() != null) {
                                AppsFlyerLibCore.m6973((Context) weakReference.get(), "deeplinkAttribution", new JSONObject(map).toString());
                            }
                        }

                        @Override // com.appsflyer.internal.C2295ab.AbstractC2296b
                        /* renamed from: ı */
                        public final void mo6367(String str) {
                            if (AppsFlyerLibCore.f6867 != null) {
                                m7024(hashMap);
                                AFLogger.afDebugLog("Calling onAttributionFailure with:\n".concat(String.valueOf(str)));
                                AppsFlyerLibCore.f6867.onAttributionFailure(str);
                            }
                        }

                        @Override // com.appsflyer.internal.C2295ab.AbstractC2296b
                        /* renamed from: ɩ */
                        public final void mo6368(Map<String, String> map) {
                            for (String str : map.keySet()) {
                                hashMap.put(str, map.get(str));
                            }
                            m7024(hashMap);
                            AppsFlyerLibCore.m6984(hashMap);
                        }
                    };
                    AFExecutor.getInstance().getThreadPoolExecutor().execute(abVar);
                    return;
                }
                m6984(AndroidUtils.m6940(context, hashMap, uri));
            }

            @Override // com.appsflyer.AppsFlyerLib
            public AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, final Context context) {
                if (context != null) {
                    this.f6893 = (Application) m6948xfd752f51(context);
                    if (GoogleReferrer.allow(this, context)) {
                        if (this.f6888 == null) {
                            this.f6888 = new GoogleReferrer();
                            AFLogger.afDebugLog("Connecting to Install Referrer Library...");
                            this.f6888.start(context, new Runnable() {
                                /* class com.appsflyer.AppsFlyerLibCore.RunnableC22783 */

                                static {
                                    Covode.recordClassIndex(2507);
                                }

                                public final void run() {
                                    try {
                                        AFLogger.afDebugLog("Install Referrer collected locally");
                                        AppsFlyerLibCore.m6994(AppsFlyerLibCore.this);
                                    } catch (Throwable th) {
                                        AFLogger.afErrorLog(th.getMessage(), th);
                                    }
                                }
                            });
                        } else {
                            AFLogger.afWarnLog("GoogleReferrer instance already created");
                        }
                    }
                    final SharedPreferences sharedPreferences = getSharedPreferences(context);
                    if (getLaunchCounter(sharedPreferences, false) < 2) {
                        HuaweiReferrer huaweiReferrer = new HuaweiReferrer(new Runnable() {
                            /* class com.appsflyer.AppsFlyerLibCore.RunnableC22805 */

                            static {
                                Covode.recordClassIndex(2509);
                            }

                            public final void run() {
                                if (AppsFlyerLibCore.this.getLaunchCounter(sharedPreferences, false) != 1) {
                                    return;
                                }
                                if (!GoogleReferrer.allow(AppsFlyerLibCore.this, context) || sharedPreferences.getBoolean("newGPReferrerSent", false)) {
                                    AppsFlyerLibCore.this.m6993((AppsFlyerLibCore) new Attr().context(context));
                                }
                            }
                        }, context);
                        this.f6897 = huaweiReferrer;
                        huaweiReferrer.start();
                    }
                    this.f6896 = m6962(context);
                } else {
                    AFLogger.afWarnLog("init :: context is null, Google Install Referrer will be not initialized!");
                }
                return init(str, appsFlyerConversionListener);
            }

            @Override // com.appsflyer.AppsFlyerLib
            public void startTracking(Context context, final String str, final AppsFlyerTrackingRequestListener appsFlyerTrackingRequestListener) {
                if (!this.f6884) {
                    AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'startTracking()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
                    if (str == null) {
                        return;
                    }
                }
                if (Foreground.listener == null) {
                    this.f6893 = (Application) m6948xfd752f51(context);
                    if (C2306ai.f6989 == null) {
                        C2306ai.f6989 = new C2306ai();
                    }
                    C2306ai.f6989.mo6445("public_api_call", "startTracking", str);
                    String str2 = f6866;
                    AFLogger.afInfoLog(C1764a.m5928a("Starting AppsFlyer Tracking: (v%s.%s)", new Object[]{BuildConfig.VERSION_NAME, str2}));
                    AFLogger.afInfoLog(new StringBuilder("Build Number: ").append(str2).toString());
                    AppsFlyerProperties.getInstance().loadProperties(m6948xfd752f51(this.f6893));
                    if (!TextUtils.isEmpty(str)) {
                        AppsFlyerProperties.getInstance().set("AppsFlyerKey", str);
                        C2305ah.m7070(str);
                    } else if (TextUtils.isEmpty(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"))) {
                        AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the startTracking API method (should be called on Activity's onCreate).");
                        return;
                    }
                    Context baseContext = this.f6893.getBaseContext();
                    try {
                        if ((baseContext.getPackageManager().getPackageInfo(baseContext.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                            if (baseContext.getResources().getIdentifier("appsflyer_backup_rules", "xml", baseContext.getPackageName()) != 0) {
                                AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                            } else {
                                AFLogger.m6925("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                            }
                        }
                    } catch (Exception e) {
                        AFLogger.afRDLog(new StringBuilder("checkBackupRules Exception: ").append(e.toString()).toString());
                    }
                    if (this.f6894) {
                        Context com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = m6948xfd752f51(this.f6893);
                        this.f6889 = new HashMap();
                        final long currentTimeMillis = System.currentTimeMillis();
                        C22751 r2 = new AFFacebookDeferredDeeplink.AppLinkFetchEvents() {
                            /* class com.appsflyer.AppsFlyerLibCore.C22751 */

                            static {
                                Covode.recordClassIndex(2504);
                            }

                            @Override // com.appsflyer.AFFacebookDeferredDeeplink.AppLinkFetchEvents
                            public final void onAppLinkFetchFailed(String str) {
                                AppsFlyerLibCore.this.f6889.put("error", str);
                            }

                            @Override // com.appsflyer.AFFacebookDeferredDeeplink.AppLinkFetchEvents
                            public final void onAppLinkFetchFinished(String str, String str2, String str3) {
                                if (str != null) {
                                    AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(String.valueOf(str)));
                                    AppsFlyerLibCore.this.f6889.put("link", str);
                                    if (str2 != null) {
                                        AppsFlyerLibCore.this.f6889.put("target_url", str2);
                                    }
                                    if (str3 != null) {
                                        HashMap hashMap = new HashMap();
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put("promo_code", str3);
                                        hashMap.put("deeplink_context", hashMap2);
                                        AppsFlyerLibCore.this.f6889.put("extras", hashMap);
                                    }
                                } else {
                                    AppsFlyerLibCore.this.f6889.put("link", "");
                                }
                                AppsFlyerLibCore.this.f6889.put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                            }
                        };
                        try {
                            Class.forName("com.facebook.m").getMethod("a", Context.class).invoke(null, com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext);
                            Class<?> cls = Class.forName("com.facebook.applinks.a");
                            Class<?> cls2 = Class.forName("com.facebook.applinks.a$a");
                            Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                            AFFacebookDeferredDeeplink.C22705 r10 = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0134: CONSTRUCTOR  (r10v0 'r10' com.appsflyer.AFFacebookDeferredDeeplink$5) = (r11v0 'cls' java.lang.Class<?>), (r2v1 'r2' com.appsflyer.AppsFlyerLibCore$1) call: com.appsflyer.AFFacebookDeferredDeeplink.5.<init>(java.lang.Class, com.appsflyer.AFFacebookDeferredDeeplink$AppLinkFetchEvents):void type: CONSTRUCTOR in method: com.appsflyer.AppsFlyerLibCore.startTracking(android.content.Context, java.lang.String, com.appsflyer.AppsFlyerTrackingRequestListener):void, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.appsflyer.AFFacebookDeferredDeeplink, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 31 more
                                */
                            /*
                            // Method dump skipped, instructions count: 413
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.startTracking(android.content.Context, java.lang.String, com.appsflyer.AppsFlyerTrackingRequestListener):void");
                        }

                        @Override // com.appsflyer.AppsFlyerLib
                        public void trackEvent(Context context, String str, Map<String, Object> map, AppsFlyerTrackingRequestListener appsFlyerTrackingRequestListener) {
                            HashMap hashMap;
                            Map map2;
                            AFEvent context2 = new InAppEvent().context(context);
                            context2.f6826 = str;
                            if (map == null) {
                                hashMap = null;
                            } else {
                                hashMap = new HashMap(map);
                            }
                            context2.f6822 = hashMap;
                            context2.f6817 = appsFlyerTrackingRequestListener;
                            if (C2306ai.f6989 == null) {
                                C2306ai.f6989 = new C2306ai();
                            }
                            C2306ai aiVar = C2306ai.f6989;
                            String[] strArr = new String[2];
                            strArr[0] = str;
                            if (context2.f6822 == null) {
                                map2 = new HashMap();
                            } else {
                                map2 = context2.f6822;
                            }
                            strArr[1] = new JSONObject(map2).toString();
                            aiVar.mo6445("public_api_call", "trackEvent", strArr);
                            if (str != null) {
                                AFSensorManager r7 = AFSensorManager.m6932(context);
                                long currentTimeMillis = System.currentTimeMillis();
                                if (r7.f6852 != 0) {
                                    r7.f6847++;
                                    if (r7.f6852 - currentTimeMillis < 500) {
                                        r7.f6846.removeCallbacks(r7.f6856);
                                        r7.f6846.post(r7.f6851);
                                    }
                                } else {
                                    r7.f6846.post(r7.f6855);
                                    r7.f6846.post(r7.f6851);
                                }
                                r7.f6852 = currentTimeMillis;
                            }
                            mo6357(context2);
                        }

                        /* renamed from: ǃ */
                        private void m6974(Context context, String str, String str2, Intent intent) {
                            AFEvent context2 = new Launch().context(context);
                            context2.f6826 = null;
                            AFEvent key = context2.key(str);
                            key.f6822 = null;
                            key.f6813 = str2;
                            key.f6814 = intent;
                            key.f6824 = null;
                            m6957(key);
                        }

                        @Override // com.appsflyer.AppsFlyerLib
                        public void validateAndTrackInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
                            String obj;
                            Intent intent;
                            if (C2306ai.f6989 == null) {
                                C2306ai.f6989 = new C2306ai();
                            }
                            C2306ai aiVar = C2306ai.f6989;
                            String[] strArr = new String[6];
                            strArr[0] = str;
                            strArr[1] = str2;
                            strArr[2] = str3;
                            strArr[3] = str4;
                            strArr[4] = str5;
                            if (map == null) {
                                obj = "";
                            } else {
                                obj = map.toString();
                            }
                            strArr[5] = obj;
                            aiVar.mo6445("public_api_call", "validateAndTrackInAppPurchase", strArr);
                            if (!isTrackingStopped()) {
                                AFLogger.afInfoLog(new StringBuilder("Validate in app called with parameters: ").append(str3).append(" ").append(str4).append(" ").append(str5).toString());
                            }
                            if (str == null || str4 == null || str2 == null || str5 == null || str3 == null) {
                                AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = f6865;
                                if (appsFlyerInAppPurchaseValidatorListener != null) {
                                    appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                                    return;
                                }
                                return;
                            }
                            Context com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = m6948xfd752f51(context);
                            String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
                            if (context instanceof Activity) {
                                intent = ((Activity) context).getIntent();
                            } else {
                                intent = null;
                            }
                            new Thread(new RunnableC2343x(com_appsflyer_AppsFlyerLibCore_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext, string, str, str2, str3, str4, str5, map, intent)).start();
                        }
                    }
