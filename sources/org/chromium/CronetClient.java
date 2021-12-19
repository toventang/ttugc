package org.chromium;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.C14646b;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14658g;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import com.ttnet.org.chromium.base.C87463k;
import com.ttnet.org.chromium.net.AbstractC87529ab;
import com.ttnet.org.chromium.net.AbstractC87536c;
import com.ttnet.org.chromium.net.AbstractC87543g;
import com.ttnet.org.chromium.net.AbstractC87655t;
import com.ttnet.org.chromium.net.impl.C87595f;
import com.ttnet.org.chromium.net.impl.CronetUrlRequest;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class CronetClient implements ICronetClient {
    private static ICronetClient.ICronetBootFailureChecker sCronetBootFailureChecker;
    private static volatile AbstractC87536c sCronetEngine;
    private static volatile int sNetworkThreadPriority = 20;
    private static volatile AbstractC87655t.AbstractC87656a sRequestFinishedInfoListener;

    /* renamed from: org_chromium_CronetClient_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m156896xb6068e8b(String str, String str2) {
        return 0;
    }

    /* renamed from: org_chromium_CronetClient_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m156897xb6068e9d(String str, String str2) {
        return 0;
    }

    public static void setHttpDnsForTesting(boolean z, boolean z2, boolean z3) {
    }

    public long getCostTime(long j, long j2) {
        if (j2 == -1 || j == -1 || j2 > j) {
            return -1;
        }
        return j - j2;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public String getCronetVersion() {
        return "TTNetVersion:a6246045 2021-11-26 QuicVersion:705d0b81 2021-08-12";
    }

    static {
        Covode.recordClassIndex(106481);
    }

    public static AbstractC87536c getCronetEngine() {
        Objects.requireNonNull(sCronetEngine, "Cronet engine is null.");
        return sCronetEngine;
    }

    private static long getALogFuncAddr() {
        return ((Long) Reflect.m24529on(Class.forName("com.bytedance.ttnet.TTALog").newInstance()).call("getALogFuncAddr").get()).longValue();
    }

    public static int getEffectiveConnectionType() {
        if (sCronetEngine instanceof AbstractC87543g) {
            return ((AbstractC87543g) sCronetEngine).mo141744a();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static Map<String, int[]> getGroupRTTEstimates() {
        if (sCronetEngine instanceof AbstractC87543g) {
            return ((AbstractC87543g) sCronetEngine).mo141769f();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    private static boolean getListenAppStateIndependently() {
        try {
            return ((Boolean) Reflect.m24529on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("getListenAppStateIndependently").get()).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static int[] getNetworkQuality() {
        if (sCronetEngine instanceof AbstractC87543g) {
            AbstractC87543g gVar = (AbstractC87543g) sCronetEngine;
            return new int[]{gVar.mo141764d(), gVar.mo141761c(), gVar.mo141766e()};
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    private static String getDomainConfigByRegion() {
        String a = C90228c.m156904a().mo145261a("getCarrierRegion");
        String a2 = C90228c.m156904a().mo145261a("getSysRegion");
        String a3 = C90228c.m156904a().mo145261a("getRegion");
        if (TextUtils.isEmpty(a)) {
            if (!TextUtils.isEmpty(a2)) {
                a = a2;
            } else {
                a = a3;
            }
        }
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            return (String) Reflect.m24529on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("getGetDomainConfigByRegion", new Class[]{String.class}, a).get();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void setNetworkThreadPriority(int i) {
        sNetworkThreadPriority = i;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public boolean isCronetHttpURLConnection(HttpURLConnection httpURLConnection) {
        return httpURLConnection instanceof CronetHttpURLConnection;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setCronetBootFailureChecker(ICronetClient.ICronetBootFailureChecker iCronetBootFailureChecker) {
        sCronetBootFailureChecker = iCronetBootFailureChecker;
    }

    private long getTime(Date date) {
        if (date == null) {
            return -1;
        }
        return date.getTime();
    }

    private long getValue(Long l) {
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    /* renamed from: org_chromium_CronetClient_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary */
    public static void m156895xa2e4bee9(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a(str, false, (Context) null);
        C58032m.m104852a(uptimeMillis, str);
    }

    public static List<InetAddress> dnsLookup(String str) {
        if (sCronetEngine instanceof AbstractC87543g) {
            return ((AbstractC87543g) sCronetEngine).mo141767e(str);
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void getMappingRequestState(final String str) {
        CronetUrlRequest cronetUrlRequest;
        try {
            if (!TextUtils.isEmpty(str) && (cronetUrlRequest = C87595f.f198926a.get(str)) != null) {
                cronetUrlRequest.mo141853a(new AbstractC87529ab.AbstractC87532c() {
                    /* class org.chromium.CronetClient.C902242 */

                    static {
                        Covode.recordClassIndex(106483);
                    }

                    @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87532c
                    public final void onStatus(int i) {
                        C90231e c = C90231e.m156926c();
                        String str = str;
                        if (c.f204970a) {
                            C90228c a = C90228c.m156904a();
                            if (C90229d.m156924a().loggerDebug()) {
                                C90229d.m156924a().loggerD("CronetAppProviderManager", "onMappingRequestStatus key = " + str + " status = " + i);
                            }
                            try {
                                if (a.f204965a != null) {
                                    C87463k.m151800a(a.f204965a).mo141524a("onMappingRequestStatus", new Class[]{String.class, Integer.TYPE}, str, Integer.valueOf(i));
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean notifySwitchToMultiNetwork(boolean z) {
        if (sCronetEngine instanceof AbstractC87543g) {
            ((AbstractC87543g) sCronetEngine).mo141759b(z);
            return true;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* renamed from: org_chromium_CronetClient_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir */
    public static File m156894x41f6e372(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    public static void preconnectUrl(String str) {
        if (sCronetEngine instanceof AbstractC87543g) {
            ((AbstractC87543g) sCronetEngine).mo141765d(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void reportNetDiagnosisUserLog(String str) {
        if (sCronetEngine instanceof AbstractC87543g) {
            ((AbstractC87543g) sCronetEngine).mo141772g(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setAlogFuncAddr(long j) {
        if (sCronetEngine instanceof AbstractC87543g) {
            ((AbstractC87543g) sCronetEngine).mo141745a(j);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setAppStartUpState(int i) {
        if (sCronetEngine instanceof AbstractC87543g) {
            ((AbstractC87543g) sCronetEngine).mo141768e(i);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setHostResolverRules(String str) {
        if (sCronetEngine instanceof AbstractC87543g) {
            ((AbstractC87543g) sCronetEngine).mo141770f(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setProxy(String str) {
        if (sCronetEngine instanceof AbstractC87543g) {
            ((AbstractC87543g) sCronetEngine).mo141758b(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void clearClientOpaqueData(Context context) {
        try {
            if (C90232f.m156944a(context)) {
                if (C90229d.m156924a().loggerDebug()) {
                    C90229d.m156924a().loggerD("CronetClient", "clearClientOpaqueData start");
                }
                if (sCronetEngine instanceof AbstractC87543g) {
                    ((AbstractC87543g) sCronetEngine).mo141757b();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static C14658g getPacketLossRateMetrics(int i) {
        if (sCronetEngine instanceof AbstractC87543g) {
            C14658g gVar = new C14658g();
            AbstractC87543g gVar2 = (AbstractC87543g) sCronetEngine;
            gVar.f35577a = i;
            gVar.f35578b = gVar2.mo141743a(i);
            gVar.f35579c = gVar2.mo141755b(i);
            gVar.f35580d = gVar2.mo141760c(i);
            gVar.f35581e = gVar2.mo141763d(i);
            return gVar;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    private void tryCreateRequestFinishedInfoListener(Executor executor) {
        MethodCollector.m26663i(6920);
        if (sRequestFinishedInfoListener == null) {
            synchronized (CronetClient.class) {
                try {
                    if (sRequestFinishedInfoListener == null) {
                        sRequestFinishedInfoListener = new AbstractC87655t.AbstractC87656a(executor) {
                            /* class org.chromium.CronetClient.C902253 */

                            static {
                                Covode.recordClassIndex(106484);
                            }

                            private long getTime(Date date) {
                                if (date == null) {
                                    return -1;
                                }
                                return date.getTime();
                            }

                            @Override // com.ttnet.org.chromium.net.AbstractC87655t.AbstractC87656a
                            public void onRequestFinished(AbstractC87655t tVar) {
                                AbstractC87655t.AbstractC87657b b;
                                if (tVar != null && (b = tVar.mo141997b()) != null) {
                                    String str = "";
                                    try {
                                        if (C90229d.m156924a().loggerDebug()) {
                                            try {
                                                if (tVar.mo141999d() != null) {
                                                    str = str + " http status = " + tVar.mo141999d().mo141710b();
                                                }
                                                str = str + " finishedReason = " + tVar.mo141998c();
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }
                                            C90229d.m156924a().loggerD("CronetClient", str + " url = " + tVar.mo141996a());
                                            C90229d.m156924a().loggerD("CronetClient", (((((((" dns_cost = " + CronetClient.this.getCostTime(getTime(b.mo141933c()), getTime(b.mo141932b())) + " ms ") + " connect_cost = " + CronetClient.this.getCostTime(getTime(b.mo141935e()), getTime(b.mo141934d())) + " ms ") + " ssl_cost = " + CronetClient.this.getCostTime(getTime(b.mo141937g()), getTime(b.mo141936f())) + " ms ") + " sending_cost = " + CronetClient.this.getCostTime(getTime(b.mo141939i()), getTime(b.mo141938h())) + " ms ") + " push_cost = " + CronetClient.this.getCostTime(getTime(b.mo141941k()), getTime(b.mo141940j())) + " ms ") + " response_cost = " + CronetClient.this.getCostTime(getTime(b.mo141943m()), getTime(b.mo141942l())) + " ms ") + " total_cost = " + b.mo141946p() + " ms ") + " remote_ip = " + b.mo141950t() + " : " + b.mo141951u());
                                            try {
                                                if (tVar.mo142000e() != null) {
                                                    C90229d.m156924a().loggerD("CronetClient", " exception = " + tVar.mo142000e().getMessage());
                                                }
                                            } catch (Exception e2) {
                                                e2.printStackTrace();
                                            }
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        };
                    }
                } finally {
                    MethodCollector.m26664o(6920);
                }
            }
            return;
        }
        MethodCollector.m26664o(6920);
    }

    public static String[] ttUrlDispatch(String str) {
        if (sCronetEngine instanceof AbstractC87543g) {
            Map<String, String> c = ((AbstractC87543g) sCronetEngine).mo141762c(str);
            return new String[]{c.get("final_url"), c.get("epoch"), c.get("etag")};
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String getProxyConfig(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.CronetClient.getProxyConfig(java.lang.String):java.lang.String");
    }

    public static void removeClientOpaqueData(Context context, String str) {
        try {
            if (C90232f.m156944a(context)) {
                if (C90229d.m156924a().loggerDebug()) {
                    C90229d.m156924a().loggerD("CronetClient", "removeClientOpaqueData start");
                }
                if (sCronetEngine instanceof AbstractC87543g) {
                    ((AbstractC87543g) sCronetEngine).mo141747a(str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void triggerGetDomain(Context context, boolean z) {
        try {
            if (C90232f.m156944a(context)) {
                if (C90229d.m156924a().loggerDebug()) {
                    C90229d.m156924a().loggerD("CronetClient", "triggerGetDomain start");
                }
                if (sCronetEngine instanceof AbstractC87543g) {
                    ((AbstractC87543g) sCronetEngine).mo141751a(z);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void getRequestMetrics(HttpURLConnection httpURLConnection, Map<String, Object> map) {
        String str;
        if (httpURLConnection != null && map != null && (httpURLConnection instanceof CronetHttpURLConnection)) {
            try {
                CronetHttpURLConnection cronetHttpURLConnection = (CronetHttpURLConnection) httpURLConnection;
                AbstractC87655t b = cronetHttpURLConnection.mo142043b();
                if (!(b == null || b.mo141997b() == null)) {
                    AbstractC87655t.AbstractC87657b b2 = b.mo141997b();
                    map.put("remote_ip", b2.mo141950t() + ":" + b2.mo141951u());
                    map.put("dns_time", Long.valueOf(getCostTime(getTime(b2.mo141933c()), getTime(b2.mo141932b()))));
                    map.put("connect_time", Long.valueOf(getCostTime(getTime(b2.mo141935e()), getTime(b2.mo141934d()))));
                    map.put("ssl_time", Long.valueOf(getCostTime(getTime(b2.mo141937g()), getTime(b2.mo141936f()))));
                    map.put("send_time", Long.valueOf(getCostTime(getTime(b2.mo141939i()), getTime(b2.mo141938h()))));
                    map.put("push_time", Long.valueOf(getCostTime(getTime(b2.mo141941k()), getTime(b2.mo141940j()))));
                    map.put("receive_time", Long.valueOf(getCostTime(getTime(b2.mo141943m()), getTime(b2.mo141942l()))));
                    map.put("socket_reused", Boolean.valueOf(b2.mo141944n()));
                    map.put("ttfb", Long.valueOf(getValue(b2.mo141945o())));
                    map.put("total_time", Long.valueOf(getValue(b2.mo141946p())));
                    map.put("send_byte_count", Long.valueOf(getValue(b2.mo141947q())));
                    map.put("received_byte_count", Long.valueOf(getValue(b2.mo141948r())));
                    map.put("retry_attempts", Long.valueOf(getValue(b2.mo141952v())));
                    map.put("request_headers", b2.mo141953w());
                    map.put("response_headers", b2.mo141954x());
                    map.put("request_start", Long.valueOf(getTime(b2.mo141931a())));
                    map.put("post_task_start", Long.valueOf(getTime(b2.mo141949s())));
                    map.put("wait_ctx", Long.valueOf(getCostTime(getTime(b2.mo141931a()), getTime(b2.mo141949s()))));
                }
                if (cronetHttpURLConnection.f199114l != null) {
                    str = cronetHttpURLConnection.f199114l;
                } else {
                    str = "";
                }
                map.put("request_log", str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void tryStartNetDetect(String[] strArr, int i, int i2) {
        if (sCronetEngine instanceof AbstractC87543g) {
            ((AbstractC87543g) sCronetEngine).mo141753a(strArr, i, i2);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void ttDnsResolve(String str, int i, String str2) {
        if (sCronetEngine instanceof AbstractC87543g) {
            ((AbstractC87543g) sCronetEngine).mo141748a(str, i, str2);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void addClientOpaqueData(Context context, String[] strArr, byte[] bArr, byte[] bArr2) {
        try {
            if (C90232f.m156944a(context)) {
                if (C90229d.m156924a().loggerDebug()) {
                    C90229d.m156924a().loggerD("CronetClient", "addClientOpaqueData start");
                }
                if (sCronetEngine instanceof AbstractC87543g) {
                    ((AbstractC87543g) sCronetEngine).mo141754a(strArr, bArr, bArr2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public HttpURLConnection openConnection(Context context, String str, boolean z, String str2, Executor executor) {
        try {
            if (sCronetEngine == null) {
                C14646b.m26772a().f35478b = C14646b.EnumC14647a.LAZY_INIT;
            }
            tryCreateCronetEngine(context, false, false, false, z, str2, executor, false);
            return (HttpURLConnection) sCronetEngine.mo141715a(new URL(str));
        } catch (Throwable th) {
            if (th instanceof MalformedURLException) {
                throw th;
            } else if (!(th instanceof UnsupportedOperationException) || th.getMessage() == null || !th.getMessage().contains("Unexpected protocol")) {
                throw new IOException(th);
            } else {
                throw new IOException("MalformedURLException", th);
            }
        }
    }

    public static void enableTTBizHttpDns(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        if (sCronetEngine instanceof AbstractC87543g) {
            ((AbstractC87543g) sCronetEngine).mo141752a(z, str, str2, str3, z2, str4);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void notifyTNCConfigUpdated(String str, String str2, String str3, String str4, String str5, String str6) {
        if (sCronetEngine instanceof AbstractC87543g) {
            ((AbstractC87543g) sCronetEngine).mo141749a(str, str2, str3, str4, str5, str6);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setCronetEngine(Context context, boolean z, boolean z2, boolean z3, boolean z4, String str, Executor executor, boolean z5) {
        tryCreateCronetEngine(context, z, z2, z3, z4, str, executor, z5);
    }

    public static void notifyStoreRegionUpdated(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (sCronetEngine instanceof AbstractC87543g) {
            ((AbstractC87543g) sCronetEngine).mo141750a(str, str2, str3, str4, str5, str6, str7, str8);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0276, code lost:
        if (r8 != false) goto L_0x0209;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x028a A[Catch:{ Exception -> 0x029d }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0244  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void tryCreateCronetEngine(android.content.Context r13, boolean r14, boolean r15, boolean r16, boolean r17, java.lang.String r18, java.util.concurrent.Executor r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 863
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.CronetClient.tryCreateCronetEngine(android.content.Context, boolean, boolean, boolean, boolean, java.lang.String, java.util.concurrent.Executor, boolean):void");
    }
}
