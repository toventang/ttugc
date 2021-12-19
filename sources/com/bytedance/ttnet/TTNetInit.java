package com.bytedance.ttnet;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.frameworks.baselib.network.http.cronet.C14646b;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14657f;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14658g;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14664k;
import com.bytedance.frameworks.baselib.network.http.p984c.C14636f;
import com.bytedance.frameworks.baselib.network.http.p984c.C14638g;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14722o;
import com.bytedance.frameworks.baselib.network.http.p994f.AbstractC14748a;
import com.bytedance.frameworks.baselib.network.http.p994f.C14749b;
import com.bytedance.frameworks.baselib.network.http.p995g.C14751a;
import com.bytedance.frameworks.baselib.network.http.p995g.C14756f;
import com.bytedance.frameworks.baselib.network.http.p995g.C14757g;
import com.bytedance.keva.Keva;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.p1700a.C22898a;
import com.bytedance.ttnet.p1701b.C22931b;
import com.bytedance.ttnet.p1704e.C22949a;
import com.bytedance.ttnet.p1704e.C22950b;
import com.bytedance.ttnet.p1704e.C22951c;
import com.bytedance.ttnet.p1705f.C22954c;
import com.p2082ss.android.ugc.aweme.lancet.C58040s;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.net.CookieHandler;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UnknownFormatConversionException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class TTNetInit {
    private static volatile EnumC22896a env = EnumC22896a.RELEASE;
    private static volatile boolean sApiHttpInterceptEnabled = false;
    private static volatile String sClientIPString = "";
    private static volatile boolean sCookieLogReportEnabled = false;
    private static long sCookieManagerInitStartTime = 0;
    public static ICronetAppProvider sCronetProvider;
    private static volatile int sDelayTime = 10;
    public static Map<String, String> sGetDomainRegionMap;
    private static AbstractC22938d sITTNetDepend;
    private static volatile CountDownLatch sLatchInitCompleted = new CountDownLatch(1);
    private static volatile boolean sListenAppStateIndependently = false;
    private static volatile boolean sMainThreadInitCookieEnabled = true;
    private static volatile boolean sNotifiedColdStartFinsish = false;

    /* renamed from: com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m43144x81de544d(String str, String str2) {
        return 0;
    }

    public static void doCommand(Context context, String str) {
    }

    public static void onActivityResume(Activity activity) {
        m43145xb7d46869(activity);
    }

    public static void setALogFuncAddr(long j) {
    }

    public static void setEnableURLDispatcher(boolean z) {
    }

    public static void setFirstRequestWaitTime(long j) {
    }

    public static void setHttpDnsForTesting(boolean z, boolean z2, boolean z3) {
    }

    public static void tryInitCookieManager(Context context, boolean z, boolean z2) {
        m43146x4f144cdb(context, z, z2);
    }

    public static boolean urlDispatchEnabled() {
        return true;
    }

    public static boolean apiHttpInterceptEnabled() {
        return sApiHttpInterceptEnabled;
    }

    public static boolean cookieLogReportEnabled() {
        return sCookieLogReportEnabled;
    }

    public static String getClientIpString() {
        return sClientIPString;
    }

    public static ICronetAppProvider getCronetProvider() {
        return sCronetProvider;
    }

    public static EnumC22896a getEnv() {
        return env;
    }

    public static boolean getListenAppStateIndependently() {
        return sListenAppStateIndependently;
    }

    public static long getALogFuncAddr() {
        return TTALog.getALogFuncAddr();
    }

    public static boolean isPrivateApiAccessEnabled() {
        getTTNetDepend();
        return true;
    }

    public static void useCustomizedCookieStoreName() {
        C14636f.f35445a = "ttnetCookieStore";
    }

    public static void getInitCompletedLatch() {
        try {
            sLatchInitCompleted.await(5, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static AbstractC22938d getTTNetDepend() {
        AbstractC22938d dVar = sITTNetDepend;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("sITTNetDepend is null");
    }

    public static void notifyColdStartFinish() {
        if (sITTNetDepend != null && !sNotifiedColdStartFinsish) {
            sNotifiedColdStartFinsish = true;
        }
    }

    public static void preInitCronetKernel() {
        C14646b.m26772a().f35478b = C14646b.EnumC14647a.PRE_INIT;
        getCronetHttpClient();
    }

    private static void countDownInitCompletedLatch() {
        try {
            if (sLatchInitCompleted.getCount() > 0) {
                sLatchInitCompleted.countDown();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void injectOkhttp3HttpDnsDepend() {
        C14722o.m26957a(sITTNetDepend.mo37267e(), sITTNetDepend.mo37268f().get("httpdns"));
    }

    /* renamed from: com.bytedance.ttnet.TTNetInit$a */
    public enum EnumC22896a {
        DEBUG,
        RELEASE;

        static {
            Covode.recordClassIndex(26804);
        }
    }

    static {
        Covode.recordClassIndex(26796);
        TTALog.init();
    }

    public static void forceInitCronetKernel() {
        C14646b.m26772a().f35478b = C14646b.EnumC14647a.FORCE_INIT;
        C14659h.m26802a(getTTNetDepend().mo37259a()).mo23627a(false, C22898a.m43150a(getTTNetDepend().mo37259a()).mo23629c(), true);
    }

    private static C14659h getCronetHttpClient() {
        if (!C22932c.m43218a()) {
            return null;
        }
        C14659h a = C14659h.m26802a(getTTNetDepend().mo37259a());
        a.mo23627a(true, C22898a.m43150a(getTTNetDepend().mo37259a()).mo23629c(), false);
        return a;
    }

    public static int getEffectiveConnectionType() {
        try {
            C14659h.m26802a(getTTNetDepend().mo37259a());
            C14659h.m26810a();
            return ((Integer) Reflect.m24529on(C14659h.f35584c).call("getEffectiveConnectionType").get()).intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static Map<String, C14657f> getGroupRttEstimates() {
        C14659h.m26802a(getTTNetDepend().mo37259a());
        C14659h.m26810a();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((Map) Reflect.m24529on(C14659h.f35584c).call("getGroupRTTEstimates").get()).entrySet()) {
            if (((int[]) entry.getValue()).length == 2) {
                C14657f fVar = new C14657f();
                fVar.f35574a = ((int[]) entry.getValue())[0];
                fVar.f35575b = ((int[]) entry.getValue())[1];
                fVar.f35576c = -1;
                hashMap.put(entry.getKey(), fVar);
            } else {
                throw new UnknownFormatConversionException("getGroupRttEstimates returns wrong format");
            }
        }
        return hashMap;
    }

    public static C14657f getNetworkQuality() {
        C14659h.m26802a(getTTNetDepend().mo37259a());
        C14659h.m26810a();
        int[] iArr = (int[]) Reflect.m24529on(C14659h.f35584c).call("getNetworkQuality").get();
        if (iArr.length == 3) {
            C14657f fVar = new C14657f();
            fVar.f35574a = iArr[0];
            fVar.f35575b = iArr[1];
            fVar.f35576c = iArr[2];
            return fVar;
        }
        throw new UnknownFormatConversionException("getNetworkQuality returns wrong format");
    }

    public static void enableApiHttpIntercept(boolean z) {
        sApiHttpInterceptEnabled = z;
    }

    public static void enableCookieLogReport(boolean z) {
        sCookieLogReportEnabled = z;
    }

    public static void setBypassOfflineCheck(boolean z) {
        C14659h.f35585d = z;
    }

    public static void setDelayTime(int i) {
        sDelayTime = i;
    }

    public static void setEnv(EnumC22896a aVar) {
        env = aVar;
    }

    public static void setListenAppStateIndependently(boolean z) {
        sListenAppStateIndependently = z;
    }

    public static void setMainThreadInitCookieEnabled(boolean z) {
        sMainThreadInitCookieEnabled = z;
    }

    public static void onClientIPChanged(String str) {
        if (str != null) {
            sClientIPString = str;
        }
    }

    public static void setProcessFlag(int i) {
        C14756f.f35969a.set(i);
    }

    public static void trigerGetDomain(Context context) {
        triggerGetDomain(context, false);
    }

    public static void TTNetInit__onActivityResume$___twin___(final Activity activity) {
        if (activity != null) {
            new RunnableC13596e() {
                /* class com.bytedance.ttnet.TTNetInit.C228957 */

                static {
                    Covode.recordClassIndex(26803);
                }

                @Override // com.bytedance.common.utility.p907b.RunnableC13596e
                public final void run() {
                    C22898a.m43150a(activity).mo37241i();
                }
            }.mo21860a();
        }
    }

    public static void setGetDomainRegionMap(Map<String, String> map) {
        if (map != null) {
            sGetDomainRegionMap = map;
            return;
        }
        throw new IllegalArgumentException("getDomainRegionMap is null");
    }

    public static C14664k ttUrlDispatch(String str) {
        try {
            new URL(str).toURI();
            C14659h.m26802a(getTTNetDepend().mo37259a());
            return C14659h.m26803a(str);
        } catch (Exception e) {
            throw e;
        }
    }

    public static void clearClientOpaqueData(Context context) {
        C14659h.m26802a(context);
        try {
            if (C14659h.f35584c == null) {
                return;
            }
            if (C14659h.f35583b != null) {
                Reflect.m24529on(C14659h.f35584c).call("clearClientOpaqueData", new Class[]{Context.class}, C14659h.f35583b);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_TTNetInitLancet_onActivityResume */
    public static void m43145xb7d46869(Activity activity) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            m43144x81de544d("TTNetInitLancet", "onActivityResume1");
            C40780g.m82241a().execute(new C58040s.RunnableC58041a(activity));
            return;
        }
        m43144x81de544d("TTNetInitLancet", "onActivityResume2");
        TTNetInit__onActivityResume$___twin___(activity);
    }

    public static List<InetAddress> dnsLookup(String str) {
        C14659h.m26802a(getTTNetDepend().mo37259a());
        if (C14659h.f35584c != null) {
            return (List) Reflect.m24529on(C14659h.f35584c).call("dnsLookup", new Class[]{String.class}, str).get();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static String getGetDomainConfigByRegion(String str) {
        Map<String, String> map = sGetDomainRegionMap;
        if (map == null || map.isEmpty() || sCronetProvider == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = sGetDomainRegionMap.get(str.toLowerCase());
        if (TextUtils.isEmpty(str2)) {
            return sCronetProvider.getGetDomainDefaultJSON();
        }
        return str2;
    }

    public static void getMappingRequestState(String str) {
        try {
            C14659h.m26802a(getTTNetDepend().mo37259a());
            C14659h.m26810a();
            Reflect.m24529on(C14659h.f35584c).call("getMappingRequestState", new Class[]{String.class}, str).get();
        } catch (Throwable unused) {
        }
    }

    public static C14658g getPacketLossRateMetrics(int i) {
        C14659h.m26802a(getTTNetDepend().mo37259a());
        C14659h.m26810a();
        return (C14658g) Reflect.m24529on(C14659h.f35584c).call("getPacketLossRateMetrics", new Class[]{Integer.TYPE}, Integer.valueOf(i)).get();
    }

    public static void preconnectUrl(String str) {
        try {
            new URL(str).toURI();
            C14659h.m26802a(getTTNetDepend().mo37259a());
            if (C14659h.f35584c != null) {
                Reflect.m24529on(C14659h.f35584c).call("preconnectUrl", new Class[]{String.class}, str).get();
                return;
            }
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        } catch (Exception e) {
            throw e;
        }
    }

    public static void setHostResolverRulesForTesting(String str) {
        if (getCronetHttpClient() != null) {
            C14659h.m26810a();
            Reflect.m24529on(C14659h.f35584c).call("setHostResolverRules", new Class[]{String.class}, str);
        }
    }

    public static void setProxy(String str) {
        C14659h.m26802a(getTTNetDepend().mo37259a());
        C14659h.m26810a();
        Reflect.m24529on(C14659h.f35584c).call("setProxy", new Class[]{String.class}, str).get();
    }

    public static void trySetDefaultUserAgent(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    char[] charArray = str.toCharArray();
                    int length = charArray.length;
                    boolean z = false;
                    for (int i = 0; i < length; i++) {
                        if (charArray[i] < ' ' || charArray[i] > '~') {
                            charArray[i] = '?';
                            z = true;
                        }
                    }
                    if (z) {
                        str = new String(charArray);
                    }
                }
            } catch (Exception unused) {
            }
        }
        C14731e.f35915d = str;
    }

    public static void setCookieHandler(final Context context) {
        CookieManager instance;
        try {
            CookieHandler cookieHandler = CookieHandler.getDefault();
            if (cookieHandler != null && (cookieHandler instanceof C14638g)) {
                C14731e.m26984a();
            } else if (sCookieManagerInitStartTime <= 0) {
                C14731e.m26984a();
            } else {
                try {
                    instance = CookieManager.getInstance();
                } catch (Throwable th) {
                    sDelayTime = 0;
                    CookieInitFailedReport(context, th.getMessage());
                }
                int i = sDelayTime;
                getTTNetDepend();
                CookieHandler.setDefault(new C14638g(context, i, instance, new C14638g.AbstractC14640a() {
                    /* class com.bytedance.ttnet.TTNetInit.C228935 */

                    static {
                        Covode.recordClassIndex(26801);
                    }

                    @Override // com.bytedance.frameworks.baselib.network.http.p984c.C14638g.AbstractC14640a
                    /* renamed from: a */
                    public final void mo23520a() {
                        if (TTNetInit.cookieLogReportEnabled()) {
                            TTNetInit.getTTNetDepend();
                        }
                    }
                }));
                C14731e.m26984a();
            }
        } catch (Throwable th2) {
            CookieInitFailedReport(context, th2.getMessage());
        }
    }

    public static void setCronetDepend(ICronetAppProvider iCronetAppProvider) {
        if (iCronetAppProvider != null) {
            sCronetProvider = iCronetAppProvider;
            String carrierRegion = iCronetAppProvider.getCarrierRegion();
            String sysRegion = iCronetAppProvider.getSysRegion();
            String region = iCronetAppProvider.getRegion();
            if (TextUtils.isEmpty(carrierRegion)) {
                if (!TextUtils.isEmpty(sysRegion)) {
                    carrierRegion = sysRegion;
                } else {
                    carrierRegion = region;
                }
            }
            C14749b.m27031a().mo23764a(carrierRegion, iCronetAppProvider.getStoreIdcRuleJSON(), getTTNetDepend().mo37259a(), new AbstractC14748a(iCronetAppProvider) {
                /* class com.bytedance.ttnet.p1705f.C22954c.C229551 */

                /* renamed from: a */
                final /* synthetic */ ICronetAppProvider f54301a;

                static {
                    Covode.recordClassIndex(26868);
                }

                {
                    this.f54301a = r1;
                }

                @Override // com.bytedance.frameworks.baselib.network.http.p994f.AbstractC14748a
                /* renamed from: a */
                public final void mo23759a(String str, String str2) {
                    this.f54301a.sendAppMonitorEvent(str, str2);
                }

                @Override // com.bytedance.frameworks.baselib.network.http.p994f.AbstractC14748a
                /* renamed from: a */
                public final void mo23760a(String str, String str2, String str3) {
                    C22931b.m43215a().mo37252a(str, str2, str3);
                }

                @Override // com.bytedance.frameworks.baselib.network.http.p994f.AbstractC14748a
                /* renamed from: a */
                public final void mo23761a(JSONObject jSONObject, String str, String str2, boolean z) {
                    boolean z2;
                    C22954c a = C22954c.m43256a();
                    if (jSONObject == null || a.f54287b == null) {
                        z2 = false;
                    } else {
                        a.f54287b.f54280c = "";
                        z2 = a.f54287b.mo37281a(jSONObject, EnumC22957a.TTSERVER, str, str2, System.currentTimeMillis());
                    }
                    if (z && !z2) {
                        a.mo37283a(true, EnumC22957a.TTREGION);
                    }
                }
            });
            if (!TextUtils.isEmpty(carrierRegion)) {
                C22954c.f54285a = getGetDomainConfigByRegion(carrierRegion);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("cronetDepend is null");
    }

    public static void setTTNetDepend(AbstractC22938d dVar) {
        sITTNetDepend = dVar;
        Map<String, String> f = getTTNetDepend().mo37268f();
        if (TextUtils.isEmpty(f.get("httpdns")) || TextUtils.isEmpty(f.get("netlog")) || TextUtils.isEmpty(f.get("boe"))) {
            sITTNetDepend = null;
            throw new IllegalArgumentException("You must set HttpDns, NetLog and BOE service domain, please refer to TTNet access documents.");
        }
        C14751a.f35951a = f.get("boe");
        injectOkhttp3HttpDnsDepend();
    }

    public static void monitorLogSend(String str, JSONObject jSONObject) {
        AbstractC22938d dVar = sITTNetDepend;
        if (dVar != null) {
            dVar.mo37263a(str, jSONObject);
        }
    }

    private static void CookieInitFailedReport(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", "failed");
            jSONObject.put("exception", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        getTTNetDepend();
    }

    public static void removeClientOpaqueData(Context context, String str) {
        C14659h.m26802a(context);
        try {
            if (C14659h.f35584c == null) {
                return;
            }
            if (C14659h.f35583b != null) {
                Reflect.m24529on(C14659h.f35584c).call("removeClientOpaqueData", new Class[]{Context.class, String.class}, C14659h.f35583b, str);
            }
        } catch (Throwable unused) {
        }
    }

    public static void triggerGetDomain(Context context, boolean z) {
        C14659h.m26802a(context);
        try {
            if (C14659h.f35584c == null) {
                return;
            }
            if (C14659h.f35583b != null) {
                Reflect.m24529on(C14659h.f35584c).call("triggerGetDomain", new Class[]{Context.class, Boolean.TYPE}, C14659h.f35583b, Boolean.valueOf(z));
            }
        } catch (Throwable unused) {
        }
    }

    public static C22951c TTDnsResolve(String str, int i) {
        C22949a a = C22949a.m43251a();
        C22950b bVar = new C22950b(str, i);
        a.f54255a.put(bVar.f54258c, bVar);
        C14659h.m26802a(getTTNetDepend().mo37259a());
        String str2 = bVar.f54256a;
        int i2 = bVar.f54257b;
        String str3 = bVar.f54258c;
        if (C14659h.f35584c != null) {
            Reflect.m24529on(C14659h.f35584c).call("ttDnsResolve", new Class[]{String[].class, Integer.TYPE, String.class}, str2, Integer.valueOf(i2), str3).get();
            bVar.f54259d.await();
            a.f54255a.remove(bVar.f54258c);
            return bVar.f54260e;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* renamed from: com_bytedance_ttnet_TTNetInit_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_tryInitCookieManager */
    public static void m43146x4f144cdb(Context context, boolean z, boolean z2) {
        C58945a.C58947b.f134185a.mo96425a("feed_network_init_cookie_duration", false);
        TTNetInit__tryInitCookieManager$___twin___(context, z, z2);
    }

    public static boolean tryStartTTNetDetect(String[] strArr, int i, int i2) {
        if (strArr != null && strArr.length > 0 && i > 0 && i <= 180 && i2 >= 0) {
            try {
                C14659h.m26802a(getTTNetDepend().mo37259a());
                if (C14659h.f35584c != null) {
                    Reflect.m24529on(C14659h.f35584c).call("tryStartNetDetect", new Class[]{String[].class, Integer.TYPE, Integer.TYPE}, strArr, Integer.valueOf(i), Integer.valueOf(i2)).get();
                    return true;
                }
                throw new UnsupportedOperationException("CronetEngine has not been initialized.");
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static void TTNetInit__tryInitCookieManager$___twin___(final Context context, final boolean z, final boolean z2) {
        try {
            sCookieManagerInitStartTime = System.currentTimeMillis();
            if (z) {
                CookieSyncManager.createInstance(context);
                CookieManager.getInstance().setAcceptCookie(true);
                setCookieHandler(context);
                Logger.debug();
            } else {
                C14731e.m26984a();
            }
        } catch (Throwable th) {
            if (C14756f.m27056a(context) && Thread.currentThread() != Looper.getMainLooper().getThread()) {
                if (sMainThreadInitCookieEnabled) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        /* class com.bytedance.ttnet.TTNetInit.RunnableC228946 */

                        static {
                            Covode.recordClassIndex(26802);
                        }

                        public final void run() {
                            TTNetInit.tryInitCookieManager(context, z, z2);
                        }
                    });
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error", th.getMessage());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                AbstractC22938d dVar = sITTNetDepend;
                if (dVar != null) {
                    dVar.mo37263a("async_init_cookie_manager_fail", jSONObject);
                }
                CookieInitFailedReport(context, th.getMessage());
            }
        }
        ClientKeyManager a = ClientKeyManager.m43224a();
        ClientKeyManager.f54213g = z2;
        try {
            ClientKeyManager.f54211a = Keva.getRepo("ttnet_client_key_config", 1);
        } catch (Throwable unused) {
        }
        if (ClientKeyManager.f54211a != null) {
            String string = ClientKeyManager.f54211a.getString("client_key_config", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    a.mo37256a(new JSONObject(string));
                } catch (Throwable unused2) {
                }
            }
            if (ClientKeyManager.f54212b) {
                String string2 = ClientKeyManager.f54211a.getString("session_id", "");
                long j = ClientKeyManager.f54211a.getLong("session_time", 0);
                a.f54219e = ClientKeyManager.f54211a.getString("session_url", "");
                a.f54217c = ClientKeyManager.f54211a.getString("client_key", "");
                a.f54220f = ClientKeyManager.f54211a.getString("kms_version", "");
                ClientKeyManager.f54214h = ClientKeyManager.m43226a(a.f54217c, a.f54220f);
                if (!string2.isEmpty() && !a.f54219e.isEmpty()) {
                    String[] split = string2.split(";");
                    if (split != null && split.length > 0) {
                        a.f54218d = split[0].trim();
                    }
                    if (!TextUtils.isEmpty(a.f54218d)) {
                        String a2 = ClientKeyManager.m43225a(split, j, string2);
                        if (!TextUtils.isEmpty(a2)) {
                            string2 = a2;
                        }
                        CookieHandler cookieHandler = CookieHandler.getDefault();
                        if (cookieHandler != null) {
                            try {
                                URI a3 = C14757g.m27060a(a.f54219e);
                                if (a3 != null) {
                                    Map<String, List<String>> map = cookieHandler.get(a3, null);
                                    if (map != null && !map.isEmpty() && map.containsKey("Cookie")) {
                                        String obj = map.get("Cookie").toString();
                                        if (TextUtils.isEmpty(obj)) {
                                            ClientKeyManager.m43227a(string2, cookieHandler, a3);
                                            a.mo37255a("empty");
                                        } else if (!obj.contains(a.f54218d)) {
                                            ClientKeyManager.m43227a(string2, cookieHandler, a3);
                                            a.mo37255a(obj);
                                        }
                                    }
                                }
                            } catch (Throwable unused3) {
                            }
                        }
                    }
                }
            }
        }
    }

    public static void addClientOpaqueData(Context context, String[] strArr, byte[] bArr, byte[] bArr2) {
        C14659h.m26802a(context);
        try {
            if (C14659h.f35584c == null) {
                return;
            }
            if (C14659h.f35583b != null) {
                Reflect.m24529on(C14659h.f35584c).call("addClientOpaqueData", new Class[]{Context.class, String[].class, byte[].class, byte[].class}, C14659h.f35583b, strArr, bArr, bArr2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void enableTTBizHttpDns(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        if (!z || (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3))) {
            try {
                if (getCronetHttpClient() == null) {
                    return;
                }
                if (C14659h.f35584c != null) {
                    Reflect.m24529on(C14659h.f35584c).call("enableTTBizHttpDns", new Class[]{Boolean.TYPE, String.class, String.class, String.class, Boolean.TYPE, String.class}, Boolean.valueOf(z), str, str2, str3, Boolean.valueOf(z2), str4).get();
                    return;
                }
                throw new UnsupportedOperationException("CronetEngine has not been initialized.");
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d1, code lost:
        if (r3 == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d3, code lost:
        r1 = com.bytedance.frameworks.baselib.network.http.p995g.C14756f.m27058c(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d7, code lost:
        if (r1 == null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00df, code lost:
        if (r1.contains(":miniapp") == false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fb, code lost:
        if (r7 != false) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void tryInitTTNet(final android.content.Context r8, android.app.Application r9, com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14733b<com.bytedance.ttnet.p1703d.C22940b> r10, com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14740i<com.bytedance.ttnet.p1703d.C22940b> r11, com.bytedance.frameworks.baselib.network.http.C14731e.AbstractC14737f r12, final boolean r13, boolean... r14) {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.TTNetInit.tryInitTTNet(android.content.Context, android.app.Application, com.bytedance.frameworks.baselib.network.http.e$b, com.bytedance.frameworks.baselib.network.http.e$i, com.bytedance.frameworks.baselib.network.http.e$f, boolean, boolean[]):void");
    }
}
