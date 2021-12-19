package com.p2082ss.android.deviceregister;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.AbstractC29742a;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.deviceregister.p2134a.AbstractC29867b;
import com.p2082ss.android.deviceregister.p2134a.AbstractC29868c;
import com.p2082ss.android.deviceregister.p2134a.C29866a;
import com.p2082ss.android.deviceregister.p2134a.C29869d;
import com.p2082ss.android.deviceregister.p2135b.AbstractC29885d;
import com.p2082ss.android.deviceregister.p2135b.C29871a;
import com.p2082ss.android.deviceregister.p2135b.C29881b;
import com.p2082ss.android.deviceregister.p2135b.C29884c;
import com.p2082ss.android.deviceregister.p2135b.p2136a.AbstractC29873a;
import com.p2082ss.android.deviceregister.p2138c.C29890a;
import com.p2082ss.android.deviceregister.p2138c.C29891b;
import com.p2082ss.android.ugc.aweme.lancet.C58002a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58004b;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.DeviceRegisterManager */
public class DeviceRegisterManager {
    private static volatile String sAppVersionMinor = "";
    private static volatile boolean sChildMode = false;
    private static Context sContext;
    private static String sDeviceRequestId;
    private static volatile boolean sInitGuard;
    private static boolean sInitWithActivity;
    private static volatile DeviceRegisterManager sInstance;
    private static boolean sIsLocalTest;
    private static final Object sLock = new Object();
    private final C29884c mRegisterService;

    /* renamed from: com.ss.android.deviceregister.DeviceRegisterManager$a */
    public interface AbstractC29864a {
        static {
            Covode.recordClassIndex(36274);
        }

        /* renamed from: a */
        void mo29064a(String str, String str2);

        /* renamed from: a */
        void mo29065a(boolean z);

        /* renamed from: a */
        void mo29066a(boolean z, boolean z2);
    }

    public static String getDeviceId() {
        return m60171x9a8d03d3();
    }

    public static String getInstallId() {
        return m60175xe87afe8f();
    }

    public static void getSSIDs(Map map) {
        m60172x86ed71f6(map);
    }

    public static void init(Context context, boolean z) {
        m60176xac6b5d3f(context, z);
    }

    public static void setUseGoogleAdId(boolean z) {
    }

    public static String getAppVersionMinor() {
        return sAppVersionMinor;
    }

    public static boolean hasInit() {
        return sInitGuard;
    }

    public static boolean isChildMode() {
        return sChildMode;
    }

    public static boolean isLocalTest() {
        return sIsLocalTest;
    }

    public static void onPause() {
        AbstractC29885d.f71296p = System.currentTimeMillis();
    }

    public static void onResume() {
        AbstractC29885d.f71296p = System.currentTimeMillis();
    }

    private void tryUpdateDeviceId() {
        C29884c cVar = this.mRegisterService;
        if (cVar != null) {
            cVar.mo52178d();
        }
    }

    public static String DeviceRegisterManager__getInstallId$___twin___() {
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (deviceRegisterManager == null) {
            return "";
        }
        String str = deviceRegisterManager.mRegisterService.f71310t;
        Logger.debug();
        return str;
    }

    static {
        Covode.recordClassIndex(36273);
    }

    public static String DeviceRegisterManager__getDeviceId$___twin___() {
        String str;
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (deviceRegisterManager != null) {
            str = deviceRegisterManager.mRegisterService.mo52173a();
        } else {
            str = "";
        }
        Logger.debug();
        return str;
    }

    /* renamed from: com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_AppLogLancet_getDeviceId */
    public static String m60171x9a8d03d3() {
        Context a;
        if (C58002a.f132198c || (a = C17867d.m33078a()) == null) {
            return DeviceRegisterManager__getDeviceId$___twin___();
        }
        return C34822d.m71158a(a, C29866a.f71244a, 0).getString("device_id", "");
    }

    /* renamed from: com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId */
    public static String m60175xe87afe8f() {
        Context a;
        if (C58004b.f132202a || (a = C17867d.m33078a()) == null) {
            return DeviceRegisterManager__getInstallId$___twin___();
        }
        return C34822d.m71158a(a, C29866a.f71244a, 0).getString("install_id", "");
    }

    public static String getClientUDID() {
        String str;
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (deviceRegisterManager != null) {
            str = deviceRegisterManager.mRegisterService.mo52177c();
        } else {
            str = "";
        }
        Logger.debug();
        return str;
    }

    public static String getClientUDIDWithBackup() {
        Context context;
        if (sInstance != null || (context = sContext) == null) {
            return getClientUDID();
        }
        return C34822d.m71158a(context, C29866a.f71244a, 0).getString("clientudid", null);
    }

    public static String getDeviceIdWithBackup() {
        Context context;
        if (sInstance != null || (context = sContext) == null) {
            return getDeviceId();
        }
        return C34822d.m71158a(context, C29866a.f71244a, 0).getString("device_id", "");
    }

    public static String getInstallIdWithBackup() {
        Context context;
        if (sInstance != null || (context = sContext) == null) {
            return getInstallId();
        }
        return C34822d.m71158a(context, C29866a.f71244a, 0).getString("install_id", null);
    }

    public static String getOpenIdWithBackup() {
        Context context;
        if (sInstance != null || (context = sContext) == null) {
            return getOpenUdId();
        }
        return C34822d.m71158a(context, C29866a.f71244a, 0).getString("openudid", null);
    }

    public static String getOpenUdId() {
        String str;
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (deviceRegisterManager != null) {
            str = deviceRegisterManager.mRegisterService.mo52176b();
        } else {
            str = "";
        }
        Logger.debug();
        return str;
    }

    public static void updateDeviceInfo() {
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (deviceRegisterManager != null) {
            C29884c cVar = deviceRegisterManager.mRegisterService;
            if (cVar.f71312w != null) {
                cVar.f71312w.mo52181a();
            }
            Logger.debug();
        }
    }

    public void stop() {
        MethodCollector.m26663i(82);
        C29884c cVar = this.mRegisterService;
        synchronized (cVar.f71300e) {
            try {
                AbstractC29885d.f71297u = true;
                cVar.f71300e.notifyAll();
            } finally {
                MethodCollector.m26664o(82);
            }
        }
    }

    public static String getRequestId() {
        MethodCollector.m26663i(164);
        if (TextUtils.isEmpty(sDeviceRequestId)) {
            synchronized (sLock) {
                try {
                    if (TextUtils.isEmpty(sDeviceRequestId)) {
                        sDeviceRequestId = UUID.randomUUID().toString();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(164);
                    throw th;
                }
            }
        }
        String str = sDeviceRequestId;
        MethodCollector.m26664o(164);
        return str;
    }

    public static void tryWaitDeviceIdInit() {
        MethodCollector.m26663i(146);
        Context context = sContext;
        if (AbstractC29885d.f71299z.get() != null || !C13627m.m24498a(AbstractC29885d.m60234a(context))) {
            MethodCollector.m26664o(146);
            return;
        }
        synchronized (AbstractC29885d.f71289b) {
            try {
                if (!AbstractC29885d.f71293g) {
                    if (!C13627m.m24498a(AbstractC29885d.m60234a(context))) {
                        MethodCollector.m26664o(146);
                        return;
                    }
                    long j = 1500;
                    if (AbstractC29885d.f71294h) {
                        j = 4000;
                    }
                    try {
                        AbstractC29885d.f71289b.wait(j);
                    } catch (Exception unused) {
                    }
                    AbstractC29885d.f71293g = true;
                    MethodCollector.m26664o(146);
                }
            } finally {
                MethodCollector.m26664o(146);
            }
        }
    }

    public static void setAnonymous(boolean z) {
        C29866a.f71245b = z;
    }

    public static void setAntiCheatingSwitch(boolean z) {
        C29871a.f71274e = z;
    }

    public static void setAppId(int i) {
        C29869d.f71251e = i;
    }

    public static void setAppVersionMinor(String str) {
        sAppVersionMinor = str;
    }

    public static void setChannel(String str) {
        C29869d.f71247a = str;
    }

    public static void setChildModeBeforeInit(boolean z) {
        sChildMode = z;
    }

    public static void setCustomMonitor(AbstractC29867b bVar) {
        AbstractC29885d.f71288a = bVar;
    }

    public static void setCustomVersion(String str) {
        C29869d.f71250d = str;
    }

    public static void setInitWithActivity(boolean z) {
        sInitWithActivity = z;
    }

    public static void setLocalTest(boolean z) {
        sIsLocalTest = z;
    }

    public static void setPreInstallChannelCallback(AbstractC29901g gVar) {
        AbstractC29885d.f71291d = gVar;
    }

    public static void setSDKVersion(String str) {
        C29869d.f71253g = str;
    }

    public static String getSigHash(Context context) {
        return C29869d.m60192a(context);
    }

    public static boolean isNewUserMode(Context context) {
        return C29889c.m60253b(context);
    }

    public static void setAppContext(AbstractC29742a aVar) {
        C29869d.f71248b = aVar;
        C29803q.f71122b = aVar;
    }

    public static void setContext(Context context) {
        sContext = m60174x17f6ea6b(context);
    }

    public static void setILogDepend(AbstractC29868c cVar) {
        AbstractC29885d.f71290c = cVar;
        C29869d.f71258l = cVar;
    }

    public static void addOnDeviceConfigUpdateListener(AbstractC29864a aVar) {
        if (aVar != null) {
            AbstractC29885d.f71298y.add(new WeakReference<>(aVar));
        }
    }

    /* renamed from: com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext */
    public static Context m60174x17f6ea6b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public static boolean clearWhenSwitchChildMode(boolean z) {
        C29884c cVar;
        sChildMode = z;
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (!hasInit() || deviceRegisterManager == null || (cVar = deviceRegisterManager.mRegisterService) == null) {
            return false;
        }
        sDeviceRequestId = null;
        cVar.mo52175a(z);
        return true;
    }

    public static void setDeviceRegisterURL(String[] strArr) {
        if (strArr != null && strArr.length > 0 && !C13627m.m24498a(strArr[0])) {
            C29871a.f71270a = strArr;
        }
    }

    public static void setForbidReportPhoneDetailInfo(boolean z) {
        MethodCollector.m26663i(119);
        C29869d.f71259m = z;
        if (C29869d.f71254h != null) {
            synchronized (C29869d.f71256j) {
            }
            MethodCollector.m26664o(119);
            return;
        }
        MethodCollector.m26664o(119);
    }

    public static void addCustomerHeaser(Bundle bundle) {
        MethodCollector.m26663i(2039);
        if (bundle == null || bundle.size() <= 0) {
            MethodCollector.m26664o(2039);
        } else if (bundle.size() <= 0) {
            MethodCollector.m26664o(2039);
        } else {
            synchronized (AbstractC29885d.f71292f) {
                try {
                    AbstractC29885d.f71292f.putAll(bundle);
                } finally {
                    MethodCollector.m26664o(2039);
                }
            }
        }
    }

    public static void DeviceRegisterManager__getSSIDs$___twin___(Map<String, String> map) {
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (map != null) {
            if (deviceRegisterManager != null) {
                String openUdId = getOpenUdId();
                if (openUdId != null) {
                    map.put("openudid", openUdId);
                }
                String clientUDID = getClientUDID();
                if (clientUDID != null) {
                    map.put("clientudid", clientUDID);
                }
                String installId = getInstallId();
                if (installId != null) {
                    map.put("install_id", installId);
                }
                String deviceId = getDeviceId();
                if (deviceId != null) {
                    map.put("device_id", deviceId);
                    return;
                }
                return;
            }
        } else if (deviceRegisterManager != null) {
            return;
        }
        Context context = sContext;
        if (context != null) {
            SharedPreferences a = C34822d.m71158a(context, C29866a.f71244a, 0);
            String string = a.getString("device_id", "");
            if (!TextUtils.isEmpty(string)) {
                map.put("device_id", string);
            }
            String string2 = a.getString("install_id", "");
            if (!TextUtils.isEmpty(string2)) {
                map.put("install_id", string2);
            }
            String string3 = C34822d.m71158a(sContext, C29866a.m60187a(), 0).getString("openudid", null);
            if (!TextUtils.isEmpty(string3)) {
                map.put("openudid", string3);
            }
        }
    }

    /* renamed from: com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_AppLogLancet_getSSIDs */
    public static void m60172x86ed71f6(Map map) {
        Context a;
        if (!C58002a.f132198c && (a = C17867d.m33078a()) != null) {
            SharedPreferences a2 = C34822d.m71158a(a, C29866a.f71244a, 0);
            String string = a2.getString("device_id", "");
            if (!TextUtils.isEmpty(string)) {
                map.put("device_id", string);
            }
            String string2 = a2.getString("install_id", "");
            if (!TextUtils.isEmpty(string2)) {
                map.put("install_id", string2);
            }
            String string3 = C34822d.m71158a(a, C29866a.m60187a(), 0).getString("openudid", null);
            if (!TextUtils.isEmpty(string3)) {
                map.put("openudid", string3);
            }
        }
        DeviceRegisterManager__getSSIDs$___twin___(map);
    }

    private DeviceRegisterManager(boolean z) {
        sChildMode = z;
        Context context = sContext;
        C29899e eVar = new C29899e(context);
        if (eVar.f71339d) {
            C29866a.m60186a(context).edit().remove("google_aid").remove("gaid_limited").apply();
            AbstractC29873a a = C29889c.m60251a(context);
            C29869d.f71260n = a.mo52158c();
            a.mo52157b("openudid");
            a.mo52157b("clientudid");
            a.mo52157b("udid");
            a.mo52157b("udid_list");
            a.mo52157b("device_id");
            clearDidAndIid(context, "clearMigrationInfo");
        }
        eVar.f71337b.setComponentEnabledSetting(eVar.f71338c, 2, 1);
        eVar.f71336a.edit().putInt("component_state", 2).apply();
        C29884c cVar = new C29884c(sContext, z);
        this.mRegisterService = cVar;
        C29871a.f71273d = sInitWithActivity;
        C29869d.f71257k = cVar;
        cVar.f71306o = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences a2 = C29866a.m60186a(cVar.f71304m);
        cVar.f71302k = a2.getInt("last_config_version", 0);
        cVar.f71310t = a2.getString("install_id", "");
        boolean equals = TextUtils.equals(C29869d.m60197c(cVar.f71304m), a2.getString("dr_channel", null));
        if (cVar.f71302k == C29869d.m60189a() && equals) {
            long j = a2.getLong("last_config_time", 0);
            currentTimeMillis = j <= currentTimeMillis ? j : currentTimeMillis;
            boolean a3 = C29803q.m60035a(cVar.mo52173a());
            boolean a4 = C29803q.m60035a(cVar.f71310t);
            if (!a3 && !a4) {
                cVar.f71307q = currentTimeMillis;
            }
        }
        if (C29869d.m60195a(cVar.f71304m, cVar.f71306o, cVar.f71301j) || !Logger.debug()) {
            cVar.f71312w = new AbstractC29885d.C29887a();
            cVar.f71312w.start();
            Context context2 = sContext;
            C29881b.f71284a = true;
            RunnableC13596e.m24423a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00fc: INVOKE  
                  (wrap: com.ss.android.deviceregister.b.b$2 : 0x00f9: CONSTRUCTOR  (r0v21 com.ss.android.deviceregister.b.b$2) = (r1v7 'context2' android.content.Context) call: com.ss.android.deviceregister.b.b.2.<init>(android.content.Context):void type: CONSTRUCTOR)
                 type: STATIC call: com.bytedance.common.utility.b.e.a(java.lang.Runnable):void in method: com.ss.android.deviceregister.DeviceRegisterManager.<init>(boolean):void, file: classes.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00f9: CONSTRUCTOR  (r0v21 com.ss.android.deviceregister.b.b$2) = (r1v7 'context2' android.content.Context) call: com.ss.android.deviceregister.b.b.2.<init>(android.content.Context):void type: CONSTRUCTOR in method: com.ss.android.deviceregister.DeviceRegisterManager.<init>(boolean):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.deviceregister.b.b, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 266
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.deviceregister.DeviceRegisterManager.<init>(boolean):void");
        }

        /* renamed from: com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_AppLogLancet_init */
        public static void m60173xb6218644(Context context, boolean z) {
            DeviceRegisterManager__init$___twin___(context, z);
            C58002a.f132198c = true;
        }

        /* renamed from: com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_init */
        public static void m60176xac6b5d3f(Context context, boolean z) {
            m60173xb6218644(context, z);
            C58004b.f132202a = true;
        }

        public static void clearValue(Context context, String str) {
            AbstractC29873a a = C29889c.m60251a(context);
            if (a instanceof C29870b) {
                ((AbstractC29865a) a).mo52157b(str);
            }
            sInstance.tryUpdateDeviceId();
        }

        public static void setAccount(Context context, Account account) {
            if (C29889c.f71320a instanceof C29870b) {
                ((AbstractC29865a) C29889c.f71320a).mo52154a(account);
            } else {
                C29889c.f71321b = account;
            }
            C29891b.f71329a = account;
        }

        public static void saveAppTrack(Context context, String str) {
            DeviceRegisterManager deviceRegisterManager = sInstance;
            if (sInstance != null) {
                C29884c cVar = deviceRegisterManager.mRegisterService;
                if (!C13627m.m24498a(str)) {
                    try {
                        cVar.f71311v = str;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                try {
                    SharedPreferences.Editor edit = C29866a.m60186a(context).edit();
                    edit.putString("app_track", str);
                    edit.commit();
                } catch (Throwable unused) {
                }
            }
        }

        public static void DeviceRegisterManager__init$___twin___(Context context, boolean z) {
            MethodCollector.m26663i(1981);
            if (context != null) {
                sInitGuard = true;
                if (context instanceof Activity) {
                    sInitWithActivity = true;
                }
                sContext = m60174x17f6ea6b(context);
                if (sInstance == null) {
                    synchronized (DeviceRegisterManager.class) {
                        try {
                            if (sInstance == null) {
                                sInstance = new DeviceRegisterManager(z);
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(1981);
                            throw th;
                        }
                    }
                }
                Logger.debug();
                MethodCollector.m26664o(1981);
                return;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("context = null");
            MethodCollector.m26664o(1981);
            throw illegalArgumentException;
        }

        public static void clearDidAndIid(Context context, String str) {
            if (sInitGuard) {
                AbstractC29873a a = C29889c.m60251a(context);
                if (a instanceof C29870b) {
                    AbstractC29865a aVar = (AbstractC29865a) a;
                    if (!TextUtils.isEmpty(str)) {
                        AbstractC29865a.f71236d = null;
                        String concat = "clear_key_prefix".concat(String.valueOf(str));
                        SharedPreferences a2 = C29866a.m60186a(context);
                        if (!a2.getBoolean(concat, false)) {
                            SharedPreferences.Editor edit = a2.edit();
                            edit.putBoolean(concat, true);
                            if (a2.contains("device_id")) {
                                edit.remove("device_id");
                            }
                            if (a2.contains("install_id")) {
                                edit.remove("install_id");
                            }
                            edit.apply();
                            aVar.f71241c.mo52162b("device_id");
                            Logger.debug();
                        } else {
                            Logger.debug();
                        }
                        aVar.f71241c.mo52164b("", "");
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("please init first");
        }

        public static void setNewUserMode(Context context, boolean z) {
            String str;
            if (context != null && C29889c.m60252a()) {
                C29890a a = C29890a.m60254a(context);
                a.f71324a = z;
                if (a.mo52184a()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : a.f71326c.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("is_new_user_mode", a.f71324a);
                        jSONObject2.put("auto_mode", a.f71325b);
                        jSONObject2.put("debug_custom_param", jSONObject.toString());
                        str = jSONObject2.toString();
                    } catch (JSONException e) {
                        e.printStackTrace();
                        str = "";
                    }
                    Context context2 = a.f71327d.get();
                    String concat = "newUserModeUtil:".concat(String.valueOf(str));
                    try {
                        AccountManager accountManager = AccountManager.get(context2);
                        Account a2 = C29891b.m60257a(context2);
                        if (accountManager == null) {
                            return;
                        }
                        if (a2 != null) {
                            accountManager.setUserData(a2, "new_user_mode_account", concat);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        public static void resetDidWhenSwitchChildMode(boolean z, long j, AbstractC29900f fVar) {
            C29884c cVar;
            MethodCollector.m26663i(188);
            sChildMode = z;
            DeviceRegisterManager deviceRegisterManager = sInstance;
            if (!hasInit() || deviceRegisterManager == null || (cVar = deviceRegisterManager.mRegisterService) == null) {
                MethodCollector.m26664o(188);
                return;
            }
            synchronized (cVar) {
                try {
                    cVar.f71301j = z;
                    cVar.f71307q = 0;
                    cVar.f71309s = 0;
                    C29869d.f71254h = null;
                    JSONObject jSONObject = new JSONObject();
                    C29869d.m60195a(cVar.f71304m, jSONObject, cVar.f71301j);
                    cVar.f71306o = jSONObject;
                    cVar.f71313x = fVar;
                    cVar.mo52178d();
                } catch (Throwable th) {
                    MethodCollector.m26664o(188);
                    throw th;
                }
            }
            new Handler(Looper.getMainLooper()).postDelayed(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0047: INVOKE  
                  (wrap: android.os.Handler : 0x003f: CONSTRUCTOR  (r1v2 android.os.Handler) = 
                  (wrap: android.os.Looper : 0x003b: INVOKE  (r0v5 android.os.Looper) =  type: STATIC call: android.os.Looper.getMainLooper():android.os.Looper)
                 call: android.os.Handler.<init>(android.os.Looper):void type: CONSTRUCTOR)
                  (wrap: com.ss.android.deviceregister.b.d$1 : 0x0044: CONSTRUCTOR  (r0v6 com.ss.android.deviceregister.b.d$1) = (r3v0 'cVar' com.ss.android.deviceregister.b.c) call: com.ss.android.deviceregister.b.d.1.<init>(com.ss.android.deviceregister.b.d):void type: CONSTRUCTOR)
                  (r6v0 'j' long)
                 type: VIRTUAL call: android.os.Handler.postDelayed(java.lang.Runnable, long):boolean in method: com.ss.android.deviceregister.DeviceRegisterManager.resetDidWhenSwitchChildMode(boolean, long, com.ss.android.deviceregister.f):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0044: CONSTRUCTOR  (r0v6 com.ss.android.deviceregister.b.d$1) = (r3v0 'cVar' com.ss.android.deviceregister.b.c) call: com.ss.android.deviceregister.b.d.1.<init>(com.ss.android.deviceregister.b.d):void type: CONSTRUCTOR in method: com.ss.android.deviceregister.DeviceRegisterManager.resetDidWhenSwitchChildMode(boolean, long, com.ss.android.deviceregister.f):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 18 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.deviceregister.b.d, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 24 more
                */
            /*
                r4 = 188(0xbc, float:2.63E-43)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
                com.p2082ss.android.deviceregister.DeviceRegisterManager.sChildMode = r5
                com.ss.android.deviceregister.DeviceRegisterManager r1 = com.p2082ss.android.deviceregister.DeviceRegisterManager.sInstance
                boolean r0 = hasInit()
                if (r0 == 0) goto L_0x0015
                if (r1 == 0) goto L_0x0015
                com.ss.android.deviceregister.b.c r3 = r1.mRegisterService
                if (r3 != 0) goto L_0x0019
            L_0x0015:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
                return
            L_0x0019:
                monitor-enter(r3)
                r3.f71301j = r5     // Catch:{ all -> 0x004e }
                r0 = 0
                r3.f71307q = r0     // Catch:{ all -> 0x004e }
                r3.f71309s = r0     // Catch:{ all -> 0x004e }
                r0 = 0
                com.p2082ss.android.deviceregister.p2134a.C29869d.f71254h = r0     // Catch:{ all -> 0x004e }
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x004e }
                r2.<init>()     // Catch:{ all -> 0x004e }
                android.content.Context r1 = r3.f71304m     // Catch:{ all -> 0x004e }
                boolean r0 = r3.f71301j     // Catch:{ all -> 0x004e }
                com.p2082ss.android.deviceregister.p2134a.C29869d.m60195a(r1, r2, r0)     // Catch:{ all -> 0x004e }
                r3.f71306o = r2     // Catch:{ all -> 0x004e }
                r3.f71313x = r8     // Catch:{ all -> 0x004e }
                r3.mo52178d()     // Catch:{ all -> 0x004e }
                monitor-exit(r3)     // Catch:{ all -> 0x004e }
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
                com.ss.android.deviceregister.b.d$1 r0 = new com.ss.android.deviceregister.b.d$1
                r0.<init>()
                r1.postDelayed(r0, r6)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
                return
            L_0x004e:
                r0 = move-exception
                monitor-exit(r3)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.deviceregister.DeviceRegisterManager.resetDidWhenSwitchChildMode(boolean, long, com.ss.android.deviceregister.f):void");
        }
    }
