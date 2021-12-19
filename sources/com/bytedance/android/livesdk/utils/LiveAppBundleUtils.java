package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1606r.p1607a.C21950a;
import com.bytedance.p1606r.p1607a.C21961c;
import com.bytedance.p1606r.p1607a.C21963d;
import com.bytedance.p1606r.p1607a.p1608a.AbstractC21958a;
import com.bytedance.p1606r.p1607a.p1608a.AbstractC21959b;
import com.google.android.play.core.p1966e.C27017b;
import com.google.android.play.core.p1966e.C27031d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveAppBundleUtils {
    private static final AbstractC21958a iAABMonitor = C11289x.f27001a;
    private static final AbstractC21958a iCoverageMonitor = C11288w.f27000a;
    private static final AbstractC21958a iSOMonitor = C11290y.f27002a;
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private static final Set<String> sLoadedSoSet = new CopyOnWriteArraySet();
    private static final Set<EnumC11229b> sLoggedInstalledSet = new CopyOnWriteArraySet();
    private static final Set<EnumC11229b> sLoggedTotalSet = new CopyOnWriteArraySet();

    static {
        Covode.recordClassIndex(12825);
        Context applicationContext = GlobalContext.getApplicationContext();
        if (applicationContext != null) {
            tryLoadAppBundlePluginFromColdStart(applicationContext, EnumC11229b.LINK_MIC);
            tryLoadAppBundlePluginFromColdStart(applicationContext, EnumC11229b.QUIC);
            tryLoadAppBundlePluginFromColdStart(applicationContext, EnumC11229b.RTS);
            tryLoadAppBundlePluginFromColdStart(applicationContext, EnumC11229b.CMAF);
        }
    }

    static final /* synthetic */ void lambda$null$6$LiveAppBundleUtils(AbstractC21959b bVar) {
        if (bVar != null) {
            bVar.mo10645a();
        }
    }

    /* renamed from: com_bytedance_android_livesdk_utils_LiveAppBundleUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m19843xd5316707(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public static boolean isPluginAvailable(EnumC11229b bVar) {
        if (bVar.gateClosed()) {
            return true;
        }
        return isAppBundlePluginLoaded(bVar);
    }

    /* access modifiers changed from: private */
    public static void monitorStartLoad(String str) {
        iSOMonitor.mo18050a(getBaseExtra(str, "so_start_load"));
    }

    private static boolean isAppBundlePluginLoaded(EnumC11229b bVar) {
        String[] strArr = bVar.soNames;
        for (String str : strArr) {
            if (!(TextUtils.isEmpty(str) || sLoadedSoSet.contains(str))) {
                return false;
            }
        }
        return true;
    }

    public static void logInstalledIfNeed(EnumC11229b bVar) {
        Set<EnumC11229b> set = sLoggedInstalledSet;
        if (!set.contains(bVar)) {
            set.add(bVar);
            iCoverageMonitor.mo18050a(getCoverageBaseExtra("coverage_installed", bVar));
        }
    }

    private static void logTotalIfNeed(EnumC11229b bVar) {
        Set<EnumC11229b> set = sLoggedTotalSet;
        if (!set.contains(bVar)) {
            set.add(bVar);
            iCoverageMonitor.mo18050a(getCoverageBaseExtra("coverage_total", bVar));
        }
    }

    public static void ensurePluginAvailable(Context context, EnumC11229b bVar) {
        ensurePluginAvailable(context, bVar, null);
    }

    private static void tryLoadAppBundlePluginFromColdStart(Context context, EnumC11229b bVar) {
        tryLoadAppBundlePlugin(context, bVar, null, false);
    }

    private static JSONObject getBaseExtra(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", str2);
            jSONObject.put("so_name", str);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static boolean checkPluginInstalled(Context context, EnumC11229b bVar) {
        C21961c makeInstallRequest = makeInstallRequest(context, bVar, null);
        if (makeInstallRequest.f51964a == null || makeInstallRequest.f51964a.isEmpty()) {
            return true;
        }
        return C21963d.f51972a.mo35706b(context).containsAll(makeInstallRequest.f51964a);
    }

    private static JSONObject getCoverageBaseExtra(String str, EnumC11229b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", str);
            jSONObject.put("plugin_names", TextUtils.join(",", bVar.appBundles));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    public static void monitorLoadSuccess(String str, long j) {
        JSONObject baseExtra = getBaseExtra(str, "so_load_success");
        try {
            baseExtra.put("duration", j);
        } catch (JSONException unused) {
        }
        iSOMonitor.mo18050a(baseExtra);
    }

    private static C21961c makeInstallRequest(Context context, final EnumC11229b bVar, final AbstractC21959b bVar2) {
        C21961c.C21962a aVar = new C21961c.C21962a(Arrays.asList(bVar.appBundles));
        aVar.f51970b = iAABMonitor;
        final Context com_bytedance_android_livesdk_utils_LiveAppBundleUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = m19843xd5316707(context);
        aVar.f51969a = new AbstractC21959b() {
            /* class com.bytedance.android.livesdk.utils.LiveAppBundleUtils.C111981 */

            static {
                Covode.recordClassIndex(12826);
            }

            @Override // com.bytedance.p1606r.p1607a.p1608a.AbstractC21959b
            /* renamed from: b */
            public final void mo10646b() {
                AbstractC21959b bVar = bVar2;
                if (bVar != null) {
                    bVar.mo10646b();
                }
            }

            @Override // com.bytedance.p1606r.p1607a.p1608a.AbstractC21959b
            /* renamed from: a */
            public final void mo10645a() {
                LiveAppBundleUtils.tryLoadAppBundlePlugin(com_bytedance_android_livesdk_utils_LiveAppBundleUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext, bVar, bVar2, true);
                LiveAppBundleUtils.logInstalledIfNeed(bVar);
            }
        };
        return aVar.mo35713a();
    }

    private static void monitorLoadFailed(String str, long j, String str2) {
        JSONObject baseExtra = getBaseExtra(str, "so_load_failed");
        try {
            baseExtra.put("duration", j);
            baseExtra.put("error_msg", str2);
        } catch (JSONException unused) {
        }
        iSOMonitor.mo18050a(baseExtra);
    }

    public static void ensurePluginAvailable(Context context, EnumC11229b bVar, AbstractC21959b bVar2) {
        logTotalIfNeed(bVar);
        if (isPluginAvailable(bVar)) {
            logInstalledIfNeed(bVar);
            if (bVar2 != null) {
                bVar2.mo10645a();
            }
        } else if (!checkPluginInstalled(context, bVar)) {
            startInstallPlugin(context, bVar, bVar2);
        } else {
            logInstalledIfNeed(bVar);
            tryLoadAppBundlePlugin(context, bVar, bVar2, true);
        }
    }

    private static void startInstallPlugin(Context context, EnumC11229b bVar, AbstractC21959b bVar2) {
        C21961c makeInstallRequest = makeInstallRequest(context, bVar, bVar2);
        C21950a aVar = C21963d.f51972a;
        if (aVar.f51943a == null) {
            aVar.f51943a = C27031d.m53717a(C21950a.m41286a(context));
        }
        if (aVar.f51947e == null) {
            aVar.f51947e = C34822d.m71158a(context, "aab_success_times", 0);
        }
        List<String> list = makeInstallRequest.f51964a;
        if (list == null || list.isEmpty()) {
            C21950a.m41289a(makeInstallRequest.f51965b);
            return;
        }
        list.removeAll(aVar.mo35706b(context));
        if (list.isEmpty()) {
            C21950a.m41289a(makeInstallRequest.f51965b);
        } else {
            aVar.mo35705a(makeInstallRequest, false);
        }
    }

    public static void tryLoadAppBundlePlugin(Context context, EnumC11229b bVar, AbstractC21959b bVar2, boolean z) {
        C40780g.m82248e().submit(new RunnableC11283r(bVar, z, m19843xd5316707(context), bVar2));
    }

    static final /* synthetic */ void lambda$tryLoadAppBundlePlugin$7$LiveAppBundleUtils(EnumC11229b bVar, boolean z, Context context, AbstractC21959b bVar2) {
        String[] strArr = bVar.soNames;
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                Set<String> set = sLoadedSoSet;
                if (!set.contains(str)) {
                    if (z) {
                        mainHandler.post(new RunnableC11284s(str));
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    try {
                        C27017b.m53684a(context, str);
                        if (z) {
                            mainHandler.post(new RunnableC11285t(str, uptimeMillis));
                        }
                        set.add(str);
                    } catch (Throwable th) {
                        mainHandler.post(new RunnableC11286u(z, str, uptimeMillis, th, bVar2));
                        return;
                    }
                }
            }
        }
        mainHandler.post(new RunnableC11287v(bVar2));
    }

    static final /* synthetic */ void lambda$null$5$LiveAppBundleUtils(boolean z, String str, long j, Throwable th, AbstractC21959b bVar) {
        if (z) {
            monitorLoadFailed(str, SystemClock.uptimeMillis() - j, th.toString());
        }
        if (bVar != null) {
            bVar.mo10646b();
        }
    }
}
