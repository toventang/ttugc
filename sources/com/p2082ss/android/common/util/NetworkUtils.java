package com.p2082ss.android.common.util;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.CookieManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.p1121b.p1123b.C16106a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.common.p2130b.AbstractC29811a;
import com.p2082ss.android.common.p2130b.AbstractC29817b;
import com.p2082ss.android.common.p2130b.AbstractC29818c;
import com.p2082ss.android.common.p2130b.p2131a.C29812a;
import com.p2082ss.android.http.p2146a.AbstractC29926a;
import com.p2082ss.android.http.p2146a.AbstractC29930b;
import com.p2082ss.android.http.p2146a.AbstractC29938c;
import com.p2082ss.android.http.p2146a.p2147a.p2148a.C29928a;
import com.p2082ss.android.http.p2146a.p2149b.C29931a;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.http.p2146a.p2149b.C29935e;
import com.p2082ss.android.http.p2146a.p2151d.C29941a;
import com.p2082ss.android.ugc.aweme.app.api.C33639l;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lancet.p3387d.C58017a;
import com.p2082ss.android.ugc.aweme.legoImp.NetWorkInjectImpl;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;
import org.json.JSONObject;
import p078c.p080b.C1756d;
import p078c.p080b.C1757e;

/* renamed from: com.ss.android.common.util.NetworkUtils */
public class NetworkUtils {
    private static int isForceHttps = 1;
    private static volatile boolean mAllowKeepAlive = true;
    private static volatile long mLocalTime = -1;
    private static volatile long mServerTime = -1;
    private static AbstractC29830c sApiInterceptor;
    private static AbstractC29828a sApiLibSelector;
    private static AbstractC29831d sCommandListener;
    private static final Object sCookieLock = new Object();
    private static volatile boolean sCookieMgrInited = false;
    private static volatile boolean sHasRebuildSsl = false;
    private static AbstractC29834g sMonitorProcessHook;
    private static ArrayList<String> sNoHttpList = new ArrayList<>();
    private static volatile AbstractC29837j sServerTimeFromResponse;
    private static String sShareCookieHost;
    private static volatile int sUseDnsMapping = -1;
    private static String sUserAgent = null;

    /* renamed from: com.ss.android.common.util.NetworkUtils$a */
    public interface AbstractC29828a {
        static {
            Covode.recordClassIndex(36236);
        }
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$b */
    public interface AbstractC29829b {
        static {
            Covode.recordClassIndex(36237);
        }

        /* renamed from: a */
        String mo52111a(String str, boolean z);

        /* renamed from: a */
        void mo52112a();

        /* renamed from: a */
        void mo52113a(List<C29934d> list, boolean z);
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$c */
    public interface AbstractC29830c {
        static {
            Covode.recordClassIndex(36238);
        }

        /* renamed from: a */
        String mo52114a();

        /* renamed from: b */
        String mo52115b();

        /* renamed from: c */
        List<String> mo52116c();

        /* renamed from: d */
        List<String> mo52117d();
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$d */
    public interface AbstractC29831d {
        static {
            Covode.recordClassIndex(36239);
        }

        /* renamed from: a */
        String mo52118a();

        /* renamed from: a */
        void mo52119a(List<String> list);
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$f */
    public static class C29833f {

        /* renamed from: a */
        public String f71179a;

        static {
            Covode.recordClassIndex(36241);
        }
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$g */
    public interface AbstractC29834g {
        static {
            Covode.recordClassIndex(36242);
        }

        /* renamed from: a */
        void mo52120a(long j, long j2, String str, String str2, C29833f fVar);

        /* renamed from: a */
        void mo52121a(long j, long j2, String str, String str2, C29833f fVar, Throwable th);
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$i */
    public interface AbstractC29836i {
        static {
            Covode.recordClassIndex(36244);
        }

        /* renamed from: a */
        URI mo25648a();

        /* renamed from: b */
        void mo25649b();
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$j */
    public interface AbstractC29837j {
        static {
            Covode.recordClassIndex(36245);
        }

        /* renamed from: a */
        long mo52123a(String str);
    }

    /* renamed from: com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m60103xe023ce31(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_v */
    public static int m60104xe023ce43(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m60105xe023ce44(String str, String str2) {
        return 0;
    }

    /* renamed from: com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_network_NetworkUtilsLancet_filterUrl */
    public static String m60107xd1910db6(String str) {
        return str;
    }

    /* renamed from: com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_ssretrofitchain_ServerTimeLancet_handleTimeStampFromResponse */
    public static void m60109x4a642665(String str) {
    }

    public static String filterUrl(String str) {
        return m60107xd1910db6(str);
    }

    public static int getServerTime() {
        return m60108x56d30332();
    }

    public static void handleTimeStampFromResponse(String str) {
        m60109x4a642665(str);
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$h */
    public enum EnumC29835h {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        

        /* renamed from: a */
        final int f71181a;

        public final int getValue() {
            return this.f71181a;
        }

        static {
            Covode.recordClassIndex(36243);
        }

        private EnumC29835h(int i) {
            this.f71181a = i;
        }
    }

    public static boolean getAllowKeepAlive() {
        return mAllowKeepAlive;
    }

    public static AbstractC29830c getApiRequestInterceptor() {
        return sApiInterceptor;
    }

    public static AbstractC29831d getCommandListener() {
        return sCommandListener;
    }

    public static boolean getHasRebuildSsl() {
        return sHasRebuildSsl;
    }

    public static int getIsForceHttps() {
        return isForceHttps;
    }

    public static String getShareCookieHost() {
        return sShareCookieHost;
    }

    public static String executeGet(int i, String str) {
        return executeGet(0, i, str, true, true);
    }

    public static String executeGet(int i, String str, int i2, int i3) {
        return executeGet(0, i, str, true, true, (List<AbstractC29926a>) null, (C29935e) null, true);
    }

    public static String executeGet(int i, String str, boolean z) {
        return executeGet(0, i, str, z, true);
    }

    public static String executeGet(int i, String str, boolean z, boolean z2) {
        return executeGet(0, i, str, z, z2, (List<AbstractC29926a>) null, (C29935e) null, true);
    }

    public static String executeGet(int i, String str, boolean z, boolean z2, List<AbstractC29926a> list, C29935e eVar, boolean z3) {
        return executeGet(0, i, str, z, z2, list, eVar, z3);
    }

    public static String executeGet(int i, String str, List<C29934d> list) {
        return executeGet(0, i, str, true, true, list);
    }

    public static String executeGet(int i, String str, int i2, int i3, List<C29934d> list) {
        return executeGet(0, i, str, true, true, null, null, true, list);
    }

    public static String executeGet(int i, String str, boolean z, List<C29934d> list) {
        return executeGet(0, i, str, z, true, list);
    }

    public static String executeGet(int i, String str, boolean z, boolean z2, List<C29934d> list) {
        return executeGet(0, i, str, z, z2, null, null, true, list);
    }

    public static String executeGet(int i, String str, boolean z, boolean z2, List<AbstractC29926a> list, C29935e eVar, boolean z3, List<C29934d> list2) {
        return executeGet(0, i, str, z, z2, list, eVar, z3, list2);
    }

    public static String executeGet(int i, int i2, String str, boolean z, boolean z2, List<AbstractC29926a> list, C29935e eVar, boolean z3, List<C29934d> list2) {
        try {
            return executeGetRetry(i, i2, addGetRetryCountParam(filterUrl(str), "no_retry"), z, list, eVar, z3, list2, z2);
        } catch (Exception e) {
            if (TextUtils.isEmpty(str) || !str.startsWith("https") || (!(e instanceof SSLException) && !(e instanceof GeneralSecurityException))) {
                return executeGetRetry(i, i2, addGetRetryCountParam(filterUrl(str), "first_retry"), z, list, eVar, z3, list2, z2);
            }
            if (!isHitNoHttpList(str)) {
                return executeGetRetry(i, i2, addGetRetryCountParam(str, "retry_http"), z, list, eVar, z3, list2, z2);
            }
            return executeGetRetry(i, i2, addGetRetryCountParam(filterUrl(str), "first_retry"), z, list, eVar, z3, list2, z2);
        }
    }

    public static String executePost(int i, String str, List<C29934d> list, AbstractC29818c[] cVarArr) {
        return executePost(0, i, str, list, cVarArr);
    }

    public static String executePost(String str, JSONObject jSONObject, String str2, List<AbstractC29926a> list) {
        byte[] bytes;
        if (str2 == null || !str2.startsWith("application/json")) {
            ArrayList arrayList = new ArrayList();
            jsonObjectToBasicNameValuePairs(arrayList, jSONObject, "");
            return executePost(0, 0, str, arrayList, (AbstractC29818c[]) null, list);
        }
        if (jSONObject == null) {
            bytes = null;
        } else {
            bytes = jSONObject.toString().getBytes("UTF-8");
        }
        return executePost(-1, str, bytes, EnumC29832e.GZIP, str2, list);
    }

    public static String executePost(int i, String str, byte[] bArr, EnumC29832e eVar, String str2) {
        return executePost(i, str, bArr, eVar, str2, (List<AbstractC29926a>) null);
    }

    public static String executePost(int i, String str, byte[] bArr, EnumC29832e eVar, String str2, List<AbstractC29926a> list) {
        if (str == null) {
            return null;
        }
        return execute(UGCMonitor.TYPE_POST, i, addCommonParams(str, true), bArr, eVar, str2, list);
    }

    public static boolean getUseDnsMapping() {
        if (sUseDnsMapping > 0) {
            return true;
        }
        return false;
    }

    public static String getUserAgent() {
        tryInitUserAgent();
        return sUserAgent;
    }

    public static AbstractC29829b getApiProcessHook() {
        return NetWorkInjectImpl.m105238d().mo52099b();
    }

    public static Context getAppContext() {
        return NetWorkInjectImpl.m105238d().mo52098a();
    }

    /* renamed from: com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_ssretrofitchain_ServerTimeLancet_getServerTime */
    public static int m60108x56d30332() {
        long currentTimeMillis = System.currentTimeMillis();
        if (C33639l.f79832a > 0) {
            currentTimeMillis = (C33639l.f79832a + currentTimeMillis) - C33639l.f79833b;
        }
        return (int) (currentTimeMillis / 1000);
    }

    /* renamed from: com.ss.android.common.util.NetworkUtils$e */
    public enum EnumC29832e {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        

        /* renamed from: a */
        final int f71178a;

        static {
            Covode.recordClassIndex(36240);
        }

        private EnumC29832e(int i) {
            this.f71178a = i;
        }
    }

    static {
        Covode.recordClassIndex(36234);
    }

    public static int NetworkUtils__getServerTime$___twin___() {
        long currentTimeMillis = System.currentTimeMillis();
        if (mServerTime > 0) {
            currentTimeMillis = (mServerTime + System.currentTimeMillis()) - mLocalTime;
        }
        m60103xe023ce31("NetworkUtils", "getServerTime = ".concat(String.valueOf(currentTimeMillis)));
        return (int) (currentTimeMillis / 1000);
    }

    public static CookieManager tryNecessaryInit() {
        MethodCollector.m26663i(11999);
        synchronized (sCookieLock) {
            try {
                if (!sCookieMgrInited) {
                    try {
                        Thread.sleep(1500);
                    } catch (Exception unused) {
                    }
                    sCookieMgrInited = true;
                }
            } finally {
                MethodCollector.m26664o(11999);
            }
        }
        NetWorkInjectImpl.m105238d().mo52099b().mo52112a();
        CookieManager instance = CookieManager.getInstance();
        if (!instance.acceptCookie()) {
            instance.setAcceptCookie(true);
        }
        return instance;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.common.util.NetworkUtils$1 */
    public static /* synthetic */ class C298271 {

        /* renamed from: a */
        static final /* synthetic */ int[] f71176a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 36235(0x8d8b, float:5.0776E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.common.util.NetworkUtils$h[] r0 = com.p2082ss.android.common.util.NetworkUtils.EnumC29835h.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.common.util.NetworkUtils.C298271.f71176a = r2
                com.ss.android.common.util.NetworkUtils$h r0 = com.p2082ss.android.common.util.NetworkUtils.EnumC29835h.WIFI     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.common.util.NetworkUtils.C298271.f71176a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.common.util.NetworkUtils$h r0 = com.p2082ss.android.common.util.NetworkUtils.EnumC29835h.MOBILE_2G     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.common.util.NetworkUtils.C298271.f71176a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.common.util.NetworkUtils$h r0 = com.p2082ss.android.common.util.NetworkUtils.EnumC29835h.MOBILE_3G     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.common.util.NetworkUtils.C298271.f71176a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.common.util.NetworkUtils$h r0 = com.p2082ss.android.common.util.NetworkUtils.EnumC29835h.MOBILE_4G     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.p2082ss.android.common.util.NetworkUtils.C298271.f71176a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.android.common.util.NetworkUtils$h r0 = com.p2082ss.android.common.util.NetworkUtils.EnumC29835h.MOBILE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.util.NetworkUtils.C298271.<clinit>():void");
        }
    }

    public static synchronized void tryInitUserAgent() {
        synchronized (NetworkUtils.class) {
            MethodCollector.m26663i(12140);
            if (sUserAgent != null) {
                MethodCollector.m26664o(12140);
                return;
            }
            String c = NetWorkInjectImpl.m105238d().mo52100c();
            if (c != null) {
                try {
                    char[] charArray = c.toCharArray();
                    int length = charArray.length;
                    boolean z = false;
                    for (int i = 0; i < length; i++) {
                        if (charArray[i] < ' ' || charArray[i] > '~') {
                            charArray[i] = '?';
                            z = true;
                        }
                    }
                    if (z) {
                        c = new String(charArray);
                    }
                } catch (Exception unused) {
                }
            }
            sUserAgent = c;
            MethodCollector.m26664o(12140);
        }
    }

    public static void setAllowKeepAlive(boolean z) {
        mAllowKeepAlive = z;
    }

    public static void setApiLibrarySelector(AbstractC29828a aVar) {
        sApiLibSelector = aVar;
    }

    public static void setApiRequestInterceptor(AbstractC29830c cVar) {
        sApiInterceptor = cVar;
    }

    public static void setCommandListener(AbstractC29831d dVar) {
        sCommandListener = dVar;
    }

    public static void setHasRebuildSsl(boolean z) {
        sHasRebuildSsl = z;
    }

    public static void setIsForceHttps(int i) {
        isForceHttps = i;
    }

    public static void setMonitorProcessHook(AbstractC29834g gVar) {
        sMonitorProcessHook = gVar;
    }

    public static void setNoHttpList(ArrayList<String> arrayList) {
        sNoHttpList = arrayList;
    }

    public static void setServerTimeFromResponse(AbstractC29837j jVar) {
        sServerTimeFromResponse = jVar;
    }

    public static void setShareCookieHost(String str) {
        sShareCookieHost = str;
    }

    public static void setUseDnsMapping(int i) {
        sUseDnsMapping = i;
    }

    public static void safeClose(Closeable closeable) {
        safeClose(closeable, null);
    }

    public static String NetworkUtils__filterUrl$___twin___(String str) {
        AbstractC29830c cVar;
        if (!TextUtils.isEmpty(str) && (cVar = sApiInterceptor) != null) {
            return cVar.mo52114a();
        }
        return str;
    }

    /* renamed from: com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m60106xce8abf09(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo */
    public static NetworkInfo m60111x122ebd01(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    public static String getNetworkAccessType(Context context) {
        return getNetworkAccessType(m60102x8fa7bd3(context));
    }

    public static String getNetworkOperatorCode(Context context) {
        try {
            return ((TelephonyManager) m60101x477271d5(context, "phone")).getNetworkOperator();
        } catch (Exception unused) {
            return "unkown";
        }
    }

    public static List<String> getShareCookieHostList(String str) {
        AbstractC29830c cVar = sApiInterceptor;
        if (cVar != null) {
            return cVar.mo52117d();
        }
        return null;
    }

    public static void setTimeout(URLConnection uRLConnection) {
        if (uRLConnection != null) {
            uRLConnection.setConnectTimeout(15000);
            uRLConnection.setReadTimeout(15000);
        }
    }

    /* renamed from: com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1 */
    public static EnumC29835h m60102x8fa7bd3(Context context) {
        if (C58029j.f132255g != EnumC29835h.NONE && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132255g;
        }
        EnumC29835h networkType = getNetworkType(context);
        C58029j.f132255g = networkType;
        return networkType;
    }

    public static String getEtag(C29935e eVar) {
        AbstractC29926a b;
        if (eVar == null || (b = eVar.mo52262b("ETag")) == null) {
            return null;
        }
        return b.mo52241b();
    }

    public static String getLastModified(C29935e eVar) {
        AbstractC29926a b;
        if (eVar == null || (b = eVar.mo52262b("Last-Modified")) == null) {
            return null;
        }
        return b.mo52241b();
    }

    public static boolean isMobile(Context context) {
        EnumC29835h com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1 = m60102x8fa7bd3(context);
        if (EnumC29835h.MOBILE_2G == com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1 || EnumC29835h.MOBILE_3G == com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1 || EnumC29835h.MOBILE_4G == com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1 || EnumC29835h.MOBILE == com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1) {
            return true;
        }
        return false;
    }

    public static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo = m60111x122ebd01((ConnectivityManager) m60101x477271d5(context, "connectivity"));
            if (com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo == null || !com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    public static boolean isWifi(Context context) {
        try {
            NetworkInfo com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo = m60111x122ebd01((ConnectivityManager) m60101x477271d5(context, "connectivity"));
            if (com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo != null) {
                if (com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.isAvailable()) {
                    if (1 == com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.getType()) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void setUserAgent(HttpParams httpParams) {
        tryInitUserAgent();
        String str = sUserAgent;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (httpParams != null) {
            httpParams.setParameter("http.useragent", str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static boolean testIsSSBinary(String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf("application/octet-stream")) >= 0 && str.indexOf("ssmix=", indexOf + 24) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_telephony_TelephonyManagerLancet_getNetworkType */
    public static int m60110x4a04ef6b(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT < 29) {
            return telephonyManager.getNetworkType();
        }
        if (!C58017a.f132225a.getAndSet(true)) {
            C58017a.m104840a().mo95542a();
        }
        int i = C58017a.m104840a().f132229b.get();
        if (C58017a.f132227c || i != -1) {
            return i;
        }
        return 0;
    }

    public static String getNetworkAccessType(EnumC29835h hVar) {
        try {
            int i = C298271.f71176a[hVar.ordinal()];
            if (i == 1) {
                return "wifi";
            }
            if (i == 2) {
                return "2g";
            }
            if (i == 3) {
                return "3g";
            }
            if (i == 4) {
                return "4g";
            }
            if (i != 5) {
                return "";
            }
            return "mobile";
        } catch (Exception unused) {
            return "";
        }
    }

    private static boolean isHitNoHttpList(String str) {
        ArrayList<String> arrayList;
        if (isForceHttps == 1) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && (arrayList = sNoHttpList) != null && !arrayList.isEmpty()) {
            Iterator<String> it = sNoHttpList.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Pair<String, String> parseContentType(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        AbstractC29930b[] c = new C29931a("Content-Type", str).mo52242c();
        if (c.length == 0) {
            return null;
        }
        int i = 0;
        AbstractC29930b bVar = c[0];
        String a = bVar.mo52244a();
        AbstractC29938c[] c2 = bVar.mo52246c();
        if (c2 != null) {
            int length = c2.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                AbstractC29938c cVar = c2[i];
                if ("charset".equalsIgnoreCase(cVar.mo52254a())) {
                    str2 = cVar.mo52255b();
                    break;
                }
                i++;
            }
        }
        return new Pair<>(a, str2);
    }

    public static void NetworkUtils__handleTimeStampFromResponse$___twin___(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (sServerTimeFromResponse != null) {
                long a = sServerTimeFromResponse.mo52123a(str);
                if (a > 0) {
                    mServerTime = a;
                    mLocalTime = System.currentTimeMillis();
                    return;
                }
                return;
            }
            try {
                long optLong = ((JSONObject) new JSONObject(str).get("extra")).optLong("now", -1);
                m60103xe023ce31("NetworkUtils", "now = ".concat(String.valueOf(optLong)));
                if (optLong >= 0) {
                    mServerTime = optLong;
                    mLocalTime = System.currentTimeMillis();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m60112x7216c59c(File file) {
        MethodCollector.m26663i(12937);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(12937);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(12937);
        return delete;
    }

    public static long extractMaxAge(C29935e eVar) {
        AbstractC29926a b;
        if (eVar == null || (b = eVar.mo52262b("Cache-Control")) == null) {
            return -1;
        }
        try {
            AbstractC29930b[] c = b.mo52242c();
            if (c != null) {
                for (AbstractC29930b bVar : c) {
                    if ("max-age".equals(bVar.mo52244a())) {
                        String b2 = bVar.mo52245b();
                        if (b2 != null) {
                            return Long.parseLong(b2);
                        }
                        return -1;
                    }
                }
            }
        } catch (Exception e) {
            m60105xe023ce44("NetworkUtils", "extract max-age exception: ".concat(String.valueOf(e)));
        }
        return -1;
    }

    public static EnumC29835h getNetworkType(Context context) {
        try {
            NetworkInfo com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo = m60111x122ebd01((ConnectivityManager) m60101x477271d5(context, "connectivity"));
            if (com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo == null || !com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.isAvailable()) {
                return EnumC29835h.NONE;
            }
            int type = com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.getType();
            if (1 == type) {
                return EnumC29835h.WIFI;
            }
            if (type != 0) {
                return EnumC29835h.MOBILE;
            }
            switch (m60110x4a04ef6b((TelephonyManager) m60101x477271d5(context, "phone"))) {
                case 1:
                case 2:
                case 4:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    return EnumC29835h.MOBILE_2G;
                case 3:
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                case ABRConfig.ABR_SELECT_SCENE:
                case 15:
                    return EnumC29835h.MOBILE_3G;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    return EnumC29835h.MOBILE_4G;
                default:
                    return EnumC29835h.MOBILE;
            }
        } catch (Throwable unused) {
            return EnumC29835h.MOBILE;
        }
    }

    public static String addCommonParams(String str, boolean z) {
        return NetWorkInjectImpl.m105238d().mo52099b().mo52111a(str, z);
    }

    public static List<String> getShareCookie(CookieManager cookieManager, String str) {
        AbstractC29830c cVar = sApiInterceptor;
        if (cVar != null) {
            return cVar.mo52116c();
        }
        return null;
    }

    private static void putCommonParams(List<C29934d> list, boolean z) {
        NetWorkInjectImpl.m105238d().mo52099b().mo52113a(list, z);
    }

    private static String addGetRetryCountParam(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        C29844g gVar = new C29844g(str);
        gVar.mo52130a("retry_type", str2);
        return gVar.toString();
    }

    private static List<C29934d> addPostRetryCountParam(List<C29934d> list, String str) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(new C29934d("retry_type", str));
        return list;
    }

    public static byte[] downloadFile(int i, String str) {
        AbstractC29811a aVar = C16106a.f38794a;
        if (aVar != null) {
            return aVar.mo25647a(i, str);
        }
        return null;
    }

    private static String joinCommonParams(String str, List<C29934d> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(C29928a.m60310a(list, "UTF-8"));
        return sb.toString();
    }

    private static void safeClose(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                if (str != null) {
                    m60103xe023ce31("NetworkUtils", str + " " + e);
                }
            }
        }
    }

    /* renamed from: com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m60101x477271d5(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12404);
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
                    MethodCollector.m26664o(12404);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static String tryDnsMapping(String str, String[] strArr) {
        EnumC29835h com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1;
        AbstractC29830c cVar;
        if (sUseDnsMapping <= 0 || strArr == null || strArr.length <= 0 || ((str != null && str.startsWith("https://")) || NetWorkInjectImpl.m105238d().mo52098a() == null || (com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1 = m60102x8fa7bd3(m60106xce8abf09(NetWorkInjectImpl.m105238d().mo52098a()))) == null)) {
            return str;
        }
        int i = C298271.f71176a[com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkType_1.ordinal()];
        int i2 = 4;
        if (i == 1) {
            i2 = 1;
        } else if (i != 2) {
            if (i == 3 || i == 4) {
                i2 = 2;
            } else if (i != 5) {
                i2 = 0;
            }
        }
        if (!((sUseDnsMapping & i2) == 0 || (cVar = sApiInterceptor) == null)) {
            String b = cVar.mo52115b();
            if (!TextUtils.isEmpty(b)) {
                return b;
            }
            strArr[0] = null;
            return str;
        }
        return str;
    }

    public static String executeGet(int i, int i2, String str) {
        return executeGet(i, i2, str, true, true);
    }

    public static void handleApiOk(String str, long j, C29833f fVar) {
        NetWorkInjectImpl.m105238d();
        TextUtils.isEmpty(str);
    }

    public static void addCacheValidationHeaders(List<AbstractC29926a> list, String str, String str2) {
        if (list != null) {
            if (!TextUtils.isEmpty(str)) {
                list.add(new C29931a("If-None-Match", str));
            }
            if (!TextUtils.isEmpty(str2)) {
                list.add(new C29931a("If-Modified-Since", str2));
            }
        }
    }

    private static String decodeSSBinary(byte[] bArr, int i, String str) {
        if (bArr == null || i <= 0) {
            return null;
        }
        byte[] bArr2 = {-99, -114, Byte.MAX_VALUE, 90};
        int i2 = 0;
        do {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2 % 4]);
            i2++;
        } while (i2 < i);
        return new String(bArr, 0, i, str);
    }

    private static byte[] getBytes(InputStream inputStream, long j, String str) {
        MethodCollector.m26663i(13026);
        if (j <= 2147483647L) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read < 0) {
                    break;
                }
                i2 += read;
            }
            if (i2 >= i) {
                inputStream.close();
                MethodCollector.m26664o(13026);
                return bArr;
            }
            IOException iOException = new IOException("Could not completely read file ".concat(String.valueOf(str)));
            MethodCollector.m26664o(13026);
            throw iOException;
        }
        IOException iOException2 = new IOException("File is too large: ".concat(String.valueOf(str)));
        MethodCollector.m26664o(13026);
        throw iOException2;
    }

    private static void jsonObjectToBasicNameValuePairs(List<C29934d> list, JSONObject jSONObject, String str) {
        String obj;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String str2 = TextUtils.isEmpty(str) ? next : str + "[" + next + "]";
                Object obj2 = jSONObject.get(next);
                if (obj2 instanceof JSONObject) {
                    jsonObjectToBasicNameValuePairs(list, (JSONObject) obj2, str2);
                } else if (obj2 instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj2;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        jsonObjectToBasicNameValuePairs(list, jSONArray.getJSONObject(i), str2);
                    }
                } else {
                    if (obj2 == null) {
                        obj = "";
                    } else {
                        obj = obj2.toString();
                    }
                    list.add(new C29934d(str2, obj));
                }
            }
        }
    }

    public static byte[] stream2ByteArray(int i, InputStream inputStream, long j) {
        int i2;
        long j2 = j;
        MethodCollector.m26663i(12753);
        if (inputStream == null) {
            MethodCollector.m26664o(12753);
            return null;
        } else if (j2 > 2147483647L) {
            try {
                m60105xe023ce44("NetworkUtils", "HTTP entity too large to be buffered in memory");
                return null;
            } finally {
                inputStream.close();
                MethodCollector.m26664o(12753);
            }
        } else {
            if (j2 < 0) {
                j2 = 4096;
            } else if (j2 > ((long) i)) {
                m60105xe023ce44("NetworkUtils", "entity length exceed given maxLength: " + i + " " + j2);
                inputStream.close();
                MethodCollector.m26664o(12753);
                return null;
            }
            C29941a aVar = new C29941a((int) j2);
            byte[] bArr = new byte[4096];
            int i3 = 0;
            do {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byte[] bArr2 = new byte[aVar.f71426b];
                    if (aVar.f71426b > 0) {
                        System.arraycopy(aVar.f71425a, 0, bArr2, 0, aVar.f71426b);
                    }
                    inputStream.close();
                    MethodCollector.m26664o(12753);
                    return bArr2;
                } else if (read < 0 || (i2 = read + 0) < 0 || i2 > 4096) {
                    IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
                    MethodCollector.m26664o(12753);
                    throw indexOutOfBoundsException;
                } else {
                    if (read != 0) {
                        int i4 = aVar.f71426b + read;
                        if (i4 > aVar.f71425a.length) {
                            byte[] bArr3 = new byte[Math.max(aVar.f71425a.length << 1, i4)];
                            System.arraycopy(aVar.f71425a, 0, bArr3, 0, aVar.f71426b);
                            aVar.f71425a = bArr3;
                        }
                        System.arraycopy(bArr, 0, aVar.f71425a, aVar.f71426b, read);
                        aVar.f71426b = i4;
                    }
                    i3 += read;
                }
            } while (i3 <= i);
            m60105xe023ce44("NetworkUtils", "entity length did exceed given maxLength");
            inputStream.close();
            MethodCollector.m26664o(12753);
            return null;
        }
    }

    public static String executePost(int i, String str, C29812a aVar) {
        return executePost(0, i, str, aVar, (AbstractC29818c[]) null);
    }

    public static String executePost(int i, String str, List<C29934d> list) {
        return executePost(0, i, str, list, (AbstractC29818c[]) null);
    }

    public static String executePost(int i, int i2, String str, C29812a aVar) {
        return executePost(i, i2, str, aVar, (AbstractC29818c[]) null);
    }

    public static String executePost(int i, int i2, String str, List<C29934d> list) {
        return executePost(i, i2, str, list, (AbstractC29818c[]) null);
    }

    public static void handleApiError(String str, Throwable th, long j, C29833f fVar) {
        if (!TextUtils.isEmpty(str) && th != null) {
            NetWorkInjectImpl.m105238d();
        }
    }

    public static String executeGet(int i, int i2, String str, List<C29934d> list) {
        return executeGet(i, i2, str, true, true, list);
    }

    public static String executePut(String str, JSONObject jSONObject, String str2, List<AbstractC29926a> list) {
        byte[] bytes;
        if (str2 == null || !str2.startsWith("application/json")) {
            ArrayList arrayList = new ArrayList();
            jsonObjectToBasicNameValuePairs(arrayList, jSONObject, "");
            return executePut(0, 0, str, arrayList, (AbstractC29818c[]) null, list);
        }
        if (jSONObject == null) {
            bytes = null;
        } else {
            bytes = jSONObject.toString().getBytes("UTF-8");
        }
        return executePut(-1, str, bytes, EnumC29832e.GZIP, str2, list);
    }

    public static String executeGet(int i, int i2, String str, boolean z) {
        return executeGet(i, i2, str, z, true);
    }

    public static String postFile(int i, String str, String str2, String str3) {
        C29812a aVar = new C29812a();
        if (str3.startsWith("content://")) {
            Uri parse = Uri.parse(str3);
            InputStream a = C1756d.m5891a(NetWorkInjectImpl.m105238d().mo52098a(), parse);
            long a2 = C1757e.m5900a(NetWorkInjectImpl.m105238d().mo52098a(), parse);
            String path = parse.getPath();
            aVar.mo52092a(str2, getBytes(a, a2, path), path);
        } else {
            aVar.mo52090a(str2, new File(str3));
        }
        return executePost(0, i, str, aVar);
    }

    public static String executePost(int i, String str, C29812a aVar, AbstractC29818c[] cVarArr) {
        return executePost(0, i, str, aVar, cVarArr);
    }

    public static String executeGet(int i, int i2, String str, int i3, int i4) {
        return executeGet(i, i2, str, true, true, (List<AbstractC29926a>) null, (C29935e) null, true);
    }

    public static String executePostFile(int i, int i2, String str, C29812a aVar, List<C29934d> list) {
        return executePostFile(i, i2, str, aVar, null, list);
    }

    public static String executePostRetry(int i, int i2, String str, List<C29934d> list, AbstractC29818c[] cVarArr) {
        return executePostRetry(i, i2, str, list, cVarArr, null);
    }

    public static String executeDelete(int i, int i2, String str, List<AbstractC29926a> list, List<C29934d> list2) {
        if (str == null) {
            return null;
        }
        String addCommonParams = addCommonParams(str, true);
        AbstractC29817b bVar = C16106a.f38795b;
        if (bVar != null) {
            addCommonParams = bVar.mo52095a();
        }
        AbstractC29811a aVar = C16106a.f38794a;
        if (aVar != null) {
            return aVar.mo52087a(i, i2, addCommonParams, list);
        }
        return null;
    }

    public static String executePost(int i, int i2, String str, List<C29934d> list, AbstractC29818c[] cVarArr) {
        return executePost(i, i2, str, list, cVarArr, (List<AbstractC29926a>) null);
    }

    public static void monitorApiSample(long j, long j2, String str, String str2, C29833f fVar) {
        AbstractC29834g gVar = sMonitorProcessHook;
        if (!TextUtils.isEmpty(str) && j > 0 && gVar != null) {
            gVar.mo52120a(j, j2, str, str2, fVar);
        }
    }

    public static String executePost(int i, int i2, String str, C29812a aVar, AbstractC29818c[] cVarArr) {
        String filterUrl = filterUrl(str);
        try {
            return executePostRetry(i, i2, filterUrl, aVar, cVarArr, addPostRetryCountParam(null, "no_retry"), true);
        } catch (Exception e) {
            if (TextUtils.isEmpty(filterUrl) || !filterUrl.startsWith("https") || (!(e instanceof SSLException) && !(e instanceof GeneralSecurityException))) {
                return executePostRetry(i, i2, filterUrl(filterUrl), aVar, cVarArr, addPostRetryCountParam(null, "first_retry"), false);
            }
            return executePostRetry(i, i2, filterUrl, aVar, cVarArr, addPostRetryCountParam(null, "retry_http"), false);
        }
    }

    public static String executeGet(int i, int i2, String str, boolean z, List<C29934d> list) {
        return executeGet(i, i2, str, z, true, list);
    }

    public static String postFile(int i, String str, String str2, String str3, List<C29934d> list) {
        C29812a aVar = new C29812a();
        if (str3.startsWith("content://")) {
            Uri parse = Uri.parse(str3);
            InputStream a = C1756d.m5891a(NetWorkInjectImpl.m105238d().mo52098a(), parse);
            long a2 = C1757e.m5900a(NetWorkInjectImpl.m105238d().mo52098a(), parse);
            String path = parse.getPath();
            aVar.mo52092a(str2, getBytes(a, a2, path), path);
        } else {
            aVar.mo52090a(str2, new File(str3));
        }
        return executePostFile(0, i, str, aVar, list);
    }

    public static String response2String(boolean z, boolean z2, int i, InputStream inputStream, String str) {
        MethodCollector.m26663i(13180);
        if (i <= 0) {
            i = 5242880;
        }
        if (i < 1048576) {
            i = 1048576;
        }
        if (inputStream == null) {
            MethodCollector.m26664o(13180);
            return null;
        }
        if (str == null) {
            str = "UTF-8";
        }
        if (z) {
            try {
                inputStream = new GZIPInputStream(inputStream);
            } catch (Throwable th) {
                safeClose(inputStream);
                MethodCollector.m26664o(13180);
                throw th;
            }
        }
        byte[] bArr = new byte[8192];
        int i2 = 0;
        do {
            try {
                if (i2 + 4096 > bArr.length) {
                    byte[] bArr2 = new byte[(bArr.length * 2)];
                    System.arraycopy(bArr, 0, bArr2, 0, i2);
                    bArr = bArr2;
                }
                int read = inputStream.read(bArr, i2, 4096);
                if (read > 0) {
                    i2 += read;
                } else if (i2 <= 0) {
                    safeClose(inputStream);
                    MethodCollector.m26664o(13180);
                    return null;
                } else if (z2) {
                    String decodeSSBinary = decodeSSBinary(bArr, i2, str);
                    safeClose(inputStream);
                    MethodCollector.m26664o(13180);
                    return decodeSSBinary;
                } else {
                    String str2 = new String(bArr, 0, i2, str);
                    safeClose(inputStream);
                    MethodCollector.m26664o(13180);
                    return str2;
                }
            } catch (EOFException e) {
                if (!z || i2 <= 0) {
                    MethodCollector.m26664o(13180);
                    throw e;
                }
                m60105xe023ce44("NetworkUtils", "ungzip got exception ".concat(String.valueOf(e)));
            } catch (IOException e2) {
                String message = e2.getMessage();
                if (!z || i2 <= 0 || (!"CRC mismatch".equals(message) && !"Size mismatch".equals(message))) {
                    MethodCollector.m26664o(13180);
                    throw e2;
                }
                m60105xe023ce44("NetworkUtils", "ungzip got exception ".concat(String.valueOf(e2)));
            }
        } while (i2 <= i);
        m60105xe023ce44("NetworkUtils", "entity length did exceed given maxLength");
        safeClose(inputStream);
        MethodCollector.m26664o(13180);
        return null;
    }

    public static String executeGet(int i, int i2, String str, boolean z, boolean z2) {
        return executeGet(i, i2, str, z, z2, (List<AbstractC29926a>) null, (C29935e) null, true);
    }

    public static String executePostRetry(int i, int i2, String str, List<C29934d> list, AbstractC29818c[] cVarArr, List<AbstractC29926a> list2) {
        return executetRetry(UGCMonitor.TYPE_POST, i, i2, str, list, cVarArr, list2);
    }

    public static String executePut(int i, int i2, String str, List<C29934d> list, AbstractC29818c[] cVarArr, List<AbstractC29926a> list2) {
        return execute("put", i, i2, str, list, cVarArr, list2);
    }

    public static String executePutRetry(int i, int i2, String str, List<C29934d> list, AbstractC29818c[] cVarArr, List<AbstractC29926a> list2) {
        return executetRetry("put", i, i2, str, list, cVarArr, list2);
    }

    public static String executePut(int i, String str, byte[] bArr, EnumC29832e eVar, String str2, List<AbstractC29926a> list) {
        if (str == null) {
            return null;
        }
        return execute("put", i, addCommonParams(str, true), bArr, eVar, str2, list);
    }

    public static String executeGet(int i, int i2, String str, int i3, int i4, List<C29934d> list) {
        return executeGet(i, i2, str, true, true, null, null, true, list);
    }

    public static void monitorApiError(long j, long j2, String str, String str2, C29833f fVar, Throwable th) {
        AbstractC29834g gVar;
        if (!TextUtils.isEmpty(str) && th != null && (gVar = sMonitorProcessHook) != null) {
            gVar.mo52121a(j, j2, str, str2, fVar, th);
        }
    }

    public static String executePost(int i, int i2, String str, List<C29934d> list, AbstractC29818c[] cVarArr, List<AbstractC29926a> list2) {
        return execute(UGCMonitor.TYPE_POST, i, i2, str, list, cVarArr, list2);
    }

    public static String executePostFile(int i, int i2, String str, C29812a aVar, AbstractC29818c[] cVarArr, List<C29934d> list) {
        String filterUrl = filterUrl(str);
        try {
            return executePostFileRetry(i, i2, filterUrl, aVar, cVarArr, addPostRetryCountParam(list, "no_retry"), true);
        } catch (Exception e) {
            m60103xe023ce31("EvilsoulM", "retry................");
            if (TextUtils.isEmpty(filterUrl) || !filterUrl.startsWith("https") || (!(e instanceof SSLException) && !(e instanceof GeneralSecurityException))) {
                return executePostFileRetry(i, i2, filterUrl(filterUrl), aVar, cVarArr, addPostRetryCountParam(list, "first_retry"), false);
            }
            return executePostFileRetry(i, i2, filterUrl, aVar, cVarArr, addPostRetryCountParam(list, "retry_http"), false);
        }
    }

    public static String executePost(int i, int i2, String str, byte[] bArr, EnumC29832e eVar, String str2) {
        String str3;
        MethodCollector.m26663i(13030);
        String filterUrl = filterUrl(str);
        if (filterUrl == null) {
            MethodCollector.m26664o(13030);
            return null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (EnumC29832e.GZIP == eVar) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                str3 = "gzip";
            } catch (Throwable th) {
                gZIPOutputStream.close();
                MethodCollector.m26664o(13030);
                throw th;
            }
        } else if (EnumC29832e.DEFLATER != eVar || length <= 128) {
            str3 = null;
        } else {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr2 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr2, 0, deflater.deflate(bArr2));
            }
            deflater.end();
            bArr = byteArrayOutputStream2.toByteArray();
            str3 = "deflate";
        }
        AbstractC29811a aVar = C16106a.f38794a;
        if (aVar != null) {
            String a = aVar.mo25642a(i, i2, filterUrl, bArr, str3, str2);
            MethodCollector.m26664o(13030);
            return a;
        }
        MethodCollector.m26664o(13030);
        return null;
    }

    public static String postFile(int i, String str, String str2, String str3, Map<String, String> map, AbstractC29818c[] cVarArr) {
        C29812a aVar = new C29812a();
        if (str3.startsWith("content://")) {
            Uri parse = Uri.parse(str3);
            InputStream a = C1756d.m5891a(NetWorkInjectImpl.m105238d().mo52098a(), parse);
            long a2 = C1757e.m5900a(NetWorkInjectImpl.m105238d().mo52098a(), parse);
            String path = parse.getPath();
            aVar.mo52092a(str2, getBytes(a, a2, path), path);
        } else {
            aVar.mo52090a(str2, new File(str3));
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                aVar.mo52091a(entry.getKey(), entry.getValue());
            }
        }
        return executePost(0, i, str, aVar, cVarArr);
    }

    public static String executeGet(int i, int i2, String str, boolean z, boolean z2, List<C29934d> list) {
        return executeGet(i, i2, str, z, z2, null, null, true, list);
    }

    public static String executePostRetry(int i, int i2, String str, C29812a aVar, AbstractC29818c[] cVarArr, List<C29934d> list, boolean z) {
        String filterUrl = filterUrl(str);
        if (filterUrl == null) {
            return null;
        }
        putCommonParams(list, true);
        String joinCommonParams = joinCommonParams(filterUrl, list);
        AbstractC29811a aVar2 = C16106a.f38794a;
        if (aVar2 != null) {
            return aVar2.mo25639a(i, i2, joinCommonParams, list, aVar, cVarArr);
        }
        return null;
    }

    public static String executePostFileRetry(int i, int i2, String str, C29812a aVar, AbstractC29818c[] cVarArr, List<C29934d> list, boolean z) {
        String filterUrl = filterUrl(str);
        if (filterUrl == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        putCommonParams(arrayList, true);
        String joinCommonParams = joinCommonParams(filterUrl, arrayList);
        list.addAll(arrayList);
        AbstractC29811a aVar2 = C16106a.f38794a;
        if (aVar2 != null) {
            return aVar2.mo25639a(i, i2, joinCommonParams, list, aVar, cVarArr);
        }
        return null;
    }

    public static String postData(int i, String str, String str2, byte[] bArr, String str3, Map<String, String> map, AbstractC29818c[] cVarArr) {
        C29812a aVar = new C29812a();
        aVar.mo52092a(str2, bArr, str3);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                aVar.mo52091a(entry.getKey(), entry.getValue());
            }
        }
        return executePost(0, i, str, aVar, cVarArr);
    }

    public static String uploadFile(int i, String str, String str2, String str3, AbstractC29840c cVar, long j, AbstractC29818c[] cVarArr) {
        String filterUrl = filterUrl(str);
        if (filterUrl != null && !TextUtils.isEmpty(str3)) {
            File file = new File(str3);
            C29812a aVar = new C29812a();
            aVar.mo52090a(str2, file);
            ArrayList arrayList = new ArrayList();
            putCommonParams(arrayList, true);
            String joinCommonParams = joinCommonParams(filterUrl, arrayList);
            AbstractC29811a aVar2 = C16106a.f38794a;
            if (aVar2 != null) {
                return aVar2.mo25644a(i, joinCommonParams, aVar, cVar, j, cVarArr);
            }
        }
        return null;
    }

    private static String execute(String str, int i, int i2, String str2, List<C29934d> list, AbstractC29818c[] cVarArr, List<AbstractC29926a> list2) {
        String filterUrl = filterUrl(str2);
        try {
            return executetRetry(str, i, i2, filterUrl, addPostRetryCountParam(list, "no_retry"), cVarArr, list2);
        } catch (Exception unused) {
            if (TextUtils.isEmpty(filterUrl) || !filterUrl.startsWith("https")) {
                return executetRetry(str, i, i2, filterUrl(filterUrl), addPostRetryCountParam(list, "first_retry"), cVarArr, list2);
            }
            if (!isHitNoHttpList(filterUrl)) {
                return executetRetry(str, i, i2, filterUrl, addPostRetryCountParam(list, "retry_http"), cVarArr, list2);
            }
            return executetRetry(str, i, i2, filterUrl(filterUrl), addPostRetryCountParam(list, "first_retry"), cVarArr, list2);
        }
    }

    public static String execute(String str, int i, String str2, byte[] bArr, EnumC29832e eVar, String str3, List<AbstractC29926a> list) {
        String str4;
        MethodCollector.m26663i(13024);
        if ("get".equals(str)) {
            RuntimeException runtimeException = new RuntimeException("this method does not support [get]");
            MethodCollector.m26664o(13024);
            throw runtimeException;
        } else if (!"delete".equals(str)) {
            String filterUrl = filterUrl(str2);
            if (filterUrl == null || TextUtils.isEmpty(str)) {
                MethodCollector.m26664o(13024);
                return null;
            }
            if (bArr == null) {
                bArr = new byte[0];
            }
            int length = bArr.length;
            if (EnumC29832e.GZIP == eVar) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.close();
                    bArr = byteArrayOutputStream.toByteArray();
                    str4 = "gzip";
                } catch (Throwable th) {
                    gZIPOutputStream.close();
                    MethodCollector.m26664o(13024);
                    throw th;
                }
            } else if (EnumC29832e.DEFLATER != eVar || length <= 128) {
                str4 = null;
            } else {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
                Deflater deflater = new Deflater();
                deflater.setInput(bArr);
                deflater.finish();
                byte[] bArr2 = new byte[8192];
                while (!deflater.finished()) {
                    byteArrayOutputStream2.write(bArr2, 0, deflater.deflate(bArr2));
                }
                deflater.end();
                bArr = byteArrayOutputStream2.toByteArray();
                str4 = "deflate";
            }
            AbstractC29811a aVar = C16106a.f38794a;
            if (aVar == null) {
                MethodCollector.m26664o(13024);
                return null;
            } else if ("put".equals(str)) {
                String b = aVar.mo52089b(0, i, filterUrl, bArr, str4, str3, list);
                MethodCollector.m26664o(13024);
                return b;
            } else {
                String a = aVar.mo25643a(0, i, filterUrl, bArr, str4, str3, list);
                MethodCollector.m26664o(13024);
                return a;
            }
        } else {
            RuntimeException runtimeException2 = new RuntimeException("This method does not support [delete]");
            MethodCollector.m26664o(13024);
            throw runtimeException2;
        }
    }

    private static String executetRetry(String str, int i, int i2, String str2, List<C29934d> list, AbstractC29818c[] cVarArr, List<AbstractC29926a> list2) {
        if (str2 == null || TextUtils.isEmpty(str)) {
            return null;
        }
        if ("get".equals(str)) {
            throw new RuntimeException("executetRetry does not support [get]");
        } else if (!"delete".equals(str)) {
            ArrayList arrayList = new ArrayList();
            putCommonParams(arrayList, true);
            String joinCommonParams = joinCommonParams(str2, arrayList);
            list.addAll(arrayList);
            try {
                m60104xe023ce43("NetworkUtils", "POST " + new String[1][0] + " " + joinCommonParams + " " + Arrays.toString(list.toArray()));
            } catch (Exception unused) {
            }
            AbstractC29817b bVar = C16106a.f38795b;
            if (bVar != null) {
                joinCommonParams = bVar.mo52095a();
            }
            AbstractC29811a aVar = C16106a.f38794a;
            if (aVar == null) {
                return null;
            }
            if ("put".equals(str)) {
                return aVar.mo52088b(i, i2, joinCommonParams, list, true, cVarArr, list2);
            }
            return aVar.mo25641a(i, i2, joinCommonParams, list, true, cVarArr, list2);
        } else {
            throw new RuntimeException("executetRetry does not support [delete]");
        }
    }

    public static String executeGet(int i, int i2, String str, boolean z, boolean z2, List<AbstractC29926a> list, C29935e eVar, boolean z3) {
        return executeGet(i, i2, str, z, z2, list, eVar, z3, null);
    }

    public static String executeGetRetry(int i, int i2, String str, boolean z, List<AbstractC29926a> list, C29935e eVar, boolean z2, List<C29934d> list2, boolean z3) {
        String str2 = str;
        boolean z4 = z;
        if (str2 == null) {
            return null;
        }
        if (z3) {
            str2 = addCommonParams(str2, true);
        }
        if (!mAllowKeepAlive) {
            z4 = false;
        }
        m60104xe023ce43("NetworkUtils", "GET " + z4 + " " + str2);
        AbstractC29817b bVar = C16106a.f38795b;
        if (bVar != null) {
            str2 = bVar.mo52095a();
        }
        AbstractC29811a aVar = C16106a.f38794a;
        if (aVar != null) {
            return aVar.mo25640a(i, i2, str2, list, z4, true, eVar, z2);
        }
        return null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x0058 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.File] */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0118, code lost:
        if (r12 <= 0) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r4.seek(0);
        r0 = new java.io.FileOutputStream(new java.io.File(r14, r22));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r2 = r4.read(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0130, code lost:
        if (r2 == -1) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0132, code lost:
        r0.write(r3, 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0137, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x013b, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x013c, code lost:
        r11 = null;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        m60112x7216c59c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0144, code lost:
        safeClose(null, "close instream exception ");
        safeClose(null, "close outstream exception ");
        safeClose(null, "close random file exception ");
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12755);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0154, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0155, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0156, code lost:
        r0 = null;
        r11 = null;
        r4 = null;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015a, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x015b, code lost:
        r0 = null;
        r11 = null;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0173, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0174, code lost:
        r11 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01a6 A[SYNTHETIC, Splitter:B:115:0x01a6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean stream2File(java.io.InputStream r15, long r16, com.p2082ss.android.common.util.NetworkUtils.AbstractC29836i r18, int r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.p2082ss.android.common.util.AbstractC29839b<java.lang.String> r23, java.lang.String r24, com.p2082ss.android.common.util.C29842e r25) {
        /*
        // Method dump skipped, instructions count: 444
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.util.NetworkUtils.stream2File(java.io.InputStream, long, com.ss.android.common.util.NetworkUtils$i, int, java.lang.String, java.lang.String, java.lang.String, com.ss.android.common.util.b, java.lang.String, com.ss.android.common.util.e):boolean");
    }

    public static boolean downloadFile(int i, String str, String str2, String str3, String str4, AbstractC29839b<String> bVar, String str5, C29842e eVar, List<C29934d> list, String[] strArr, int[] iArr) {
        AbstractC29811a aVar = C16106a.f38794a;
        if (aVar != null) {
            return aVar.mo25645a(i, str, str2, str3, str4, bVar, str5, eVar, list, strArr, iArr);
        }
        return false;
    }

    public static boolean downloadVideo(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, AbstractC29839b<String> bVar, String str2, C29842e eVar, List<C29934d> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) {
        AbstractC29811a aVar = C16106a.f38794a;
        if (aVar != null) {
            return aVar.mo25646a(i, str, stringBuffer, stringBuffer2, stringBuffer3, bVar, str2, eVar, list, strArr, iArr, redirectHandler);
        }
        return false;
    }
}
