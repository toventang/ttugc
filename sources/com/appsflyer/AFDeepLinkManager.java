package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.p1097d.C15418q;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

public class AFDeepLinkManager {
    public static AFDeepLinkManager instance;
    public static Uri trampolineUri;

    /* renamed from: ı */
    public static String[] f6805;

    /* renamed from: ǃ */
    static String[] f6806;

    /* renamed from: ɩ */
    static volatile boolean f6807;

    /* renamed from: Ι */
    static final int f6808 = ((int) TimeUnit.SECONDS.toMillis(2));

    private AFDeepLinkManager() {
    }

    public static AFDeepLinkManager getInstance() {
        if (instance == null) {
            instance = new AFDeepLinkManager();
        }
        return instance;
    }

    static {
        Covode.recordClassIndex(2477);
    }

    /* renamed from: com_appsflyer_AFDeepLinkManager_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadScheduledExecutor */
    public static ScheduledExecutorService m6894x2dc95d74(ThreadFactory threadFactory) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = 1;
        a.f95509g = threadFactory;
        return (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
    }

    /* access modifiers changed from: protected */
    public void collectIntentsFromActivities(Intent intent) {
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null && intent.getData() != trampolineUri) {
            trampolineUri = intent.getData();
        }
    }

    /* renamed from: ǃ */
    private static boolean m6895(String str) {
        if (f6806 == null || str.contains("af_tranid=")) {
            return false;
        }
        AFLogger.afRDLog(new StringBuilder("Validate ESP URLs :").append(Arrays.asList(f6806)).toString());
        String[] strArr = f6806;
        for (String str2 : strArr) {
            if (str.contains("://".concat(String.valueOf(str2)))) {
                AFLogger.afRDLog("Deeplink matches ESP domain: ".concat(String.valueOf(str2)));
                return true;
            }
        }
        return false;
    }

    /* renamed from: Ι */
    static void m6897(final Context context, final Map<String, Object> map, final Uri uri) {
        if (m6895(uri.toString())) {
            f6807 = true;
            AFExecutor instance2 = AFExecutor.getInstance();
            if (instance2.f6830 == null) {
                instance2.f6830 = m6894x2dc95d74(instance2.f6829);
            }
            instance2.f6830.execute(new Runnable() {
                /* class com.appsflyer.AFDeepLinkManager.RunnableC22675 */

                static {
                    Covode.recordClassIndex(2478);
                }

                public final void run() {
                    long j;
                    MethodCollector.m26663i(2348);
                    HashMap hashMap = new HashMap();
                    long currentTimeMillis = System.currentTimeMillis();
                    Uri uri = null;
                    try {
                        AFLogger.afDebugLog(new StringBuilder("ESP deeplink resolving is started: ").append(uri.toString()).toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) m6898xae242589(new URL(uri.toString()));
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setReadTimeout(AFDeepLinkManager.f6808);
                        httpURLConnection.setConnectTimeout(AFDeepLinkManager.f6808);
                        httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                        httpURLConnection.connect();
                        AFLogger.afDebugLog("ESP deeplink resolving is finished");
                        hashMap.put("status", String.valueOf(httpURLConnection.getResponseCode()));
                        if (httpURLConnection.getResponseCode() >= 300 && httpURLConnection.getResponseCode() <= 305) {
                            uri = Uri.parse(httpURLConnection.getHeaderField(C15418q.f37640b));
                        }
                        j = System.currentTimeMillis() - currentTimeMillis;
                        httpURLConnection.disconnect();
                    } catch (Throwable th) {
                        hashMap.put("error", th.getLocalizedMessage());
                        hashMap.put("status", "-1");
                        j = System.currentTimeMillis() - currentTimeMillis;
                        AFLogger.afErrorLog(th.getMessage(), th);
                    }
                    hashMap.put("latency", Long.toString(j));
                    if (uri != null) {
                        hashMap.put("res", uri.toString());
                    } else {
                        hashMap.put("res", "");
                    }
                    synchronized (map) {
                        try {
                            map.put("af_deeplink_r", hashMap);
                            map.put("af_deeplink", uri.toString());
                        } catch (Throwable th2) {
                            MethodCollector.m26664o(2348);
                            throw th2;
                        }
                    }
                    AFDeepLinkManager.f6807 = false;
                    if (uri == null) {
                        uri = uri;
                    }
                    AppsFlyerLibCore.getInstance().handleDeepLinkCallback(context, map, uri);
                    MethodCollector.m26664o(2348);
                }

                /* renamed from: com_appsflyer_AFDeepLinkManager$5_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection */
                public static URLConnection m6898xae242589(URL url) {
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
            });
        } else {
            AppsFlyerLibCore.getInstance().handleDeepLinkCallback(context, map, uri);
        }
        trampolineUri = null;
    }

    /* renamed from: ɩ */
    static void m6896(Intent intent, Context context, Map<String, Object> map) {
        Uri data;
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction()) || (data = intent.getData()) == null) {
            if (trampolineUri != null) {
                AFLogger.afInfoLog(new StringBuilder("using trampoline Intent fallback with URI: ").append(trampolineUri).toString());
                m6897(context, map, trampolineUri);
            } else if (AppsFlyerLibCore.getInstance().latestDeepLink != null) {
                AFLogger.afInfoLog(new StringBuilder("using Unity/plugin Intent fallback with URI: ").append(AppsFlyerLibCore.getInstance().latestDeepLink.toString()).toString());
                m6897(context, map, AppsFlyerLibCore.getInstance().latestDeepLink);
            } else {
                AFLogger.afDebugLog("No deep link detected");
            }
        } else if (!intent.hasExtra("af_consumed")) {
            intent.putExtra("af_consumed", System.currentTimeMillis());
            m6897(context, map, data);
        } else {
            AFLogger.afInfoLog(new StringBuilder("skipping re-use of previously consumed deep link: ").append(data.toString()).append(" w/af_consumed").toString());
        }
    }
}
