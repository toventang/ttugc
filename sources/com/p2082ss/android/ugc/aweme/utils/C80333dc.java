package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.C14894c;
import com.bytedance.geckox.C14905e;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.p1022i.AbstractC14958b;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.statistic.AbstractC15017a;
import com.bytedance.geckox.utils.C15052e;
import com.bytedance.geckox.utils.C15064m;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.utils.gecko.C80487c;
import com.p2082ss.android.ugc.aweme.web.C81542d;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import com.p2082ss.android.ugc.aweme.web.GeckoXClientManager;
import com.p2082ss.android.ugc.aweme.web.IGeckoXClientManager;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.dc */
public class C80333dc {

    /* renamed from: a */
    public static boolean f179864a;

    /* renamed from: b */
    private static Context f179865b;

    /* renamed from: c */
    private static AbstractC15017a f179866c = new AbstractC15017a() {
        /* class com.p2082ss.android.ugc.aweme.utils.C80333dc.C803352 */

        static {
            Covode.recordClassIndex(93603);
        }

        @Override // com.bytedance.geckox.statistic.AbstractC15017a
        /* renamed from: a */
        public final void mo24302a(String str, JSONObject jSONObject) {
            if (!TextUtils.isEmpty(str) && jSONObject != null) {
                C80361dw.m139334a(jSONObject);
                C29819a.m60077a(str, jSONObject);
            }
        }
    };

    /* renamed from: d */
    private static GeckoGlobalConfig.IMonitorConfig f179867d = new GeckoGlobalConfig.IMonitorConfig() {
        /* class com.p2082ss.android.ugc.aweme.utils.C80333dc.C803363 */

        static {
            Covode.recordClassIndex(93604);
        }

        @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
        public final String getMonitorHost() {
            return "https://mon.isnssdk.com";
        }

        @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
        public final String getPackageId() {
            return null;
        }

        @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
        public final boolean isOversea() {
            return true;
        }

        @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
        public final String getChannel() {
            return C17867d.f42595s;
        }

        @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
        public final String getUpdateVersionCode() {
            return String.valueOf(C17867d.m33083d());
        }

        @Override // com.bytedance.geckox.GeckoGlobalConfig.IMonitorConfig
        public final Map<String, String> getCommonParams() {
            HashMap hashMap = new HashMap();
            C29803q.m60037b(hashMap, true);
            hashMap.remove("mac_address");
            hashMap.remove("uuid");
            hashMap.remove("openudid");
            hashMap.remove("aliyun_uuid");
            hashMap.remove("oaid");
            return hashMap;
        }
    };

    /* renamed from: a */
    public static Set<String> m139273a() {
        return C80487c.C80488a.m139510a().f180080c.mo123763a();
    }

    /* renamed from: h */
    public static boolean m139287h() {
        return TextUtils.equals(C17867d.f42595s, "local_test");
    }

    /* renamed from: l */
    private static Context m139291l() {
        if (f179865b == null) {
            f179865b = C17867d.m33078a();
        }
        return f179865b;
    }

    /* renamed from: b */
    public static C14894c m139275b() {
        String c = C81631k.f182525a.mo125297c();
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        return m139279c(c);
    }

    /* renamed from: f */
    public static void m139285f() {
        try {
            C15052e.m27712a(new File(m139271a(C17867d.m33078a()), "offline"));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: i */
    public static int m139288i() {
        try {
            return C16048b.m29633a().mo25411a("gecko_bytediff_exp_tt_android", ClientExpManager.gecko_bytediff_exp_tt_android());
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: k */
    public static void m139290k() {
        C14930f a = C14930f.m27473a();
        String deviceId = DeviceRegisterManager.getDeviceId();
        a.mo24038i();
        if (!TextUtils.isEmpty(deviceId) && a.f36478d != null) {
            a.f36478d.setDeviceId(deviceId);
        }
    }

    static {
        Covode.recordClassIndex(93601);
        C14957a.f36541b.add(new AbstractC14958b() {
            /* class com.p2082ss.android.ugc.aweme.utils.C80333dc.C803341 */

            static {
                Covode.recordClassIndex(93602);
            }

            @Override // com.bytedance.geckox.p1022i.AbstractC14958b
            /* renamed from: a */
            public final void mo24078a(Object... objArr) {
                if (C80333dc.m139287h()) {
                    C80342dg.m139300a().mo46674b(objArr);
                }
            }
        });
        C14957a.f36540a = true;
    }

    /* renamed from: c */
    public static synchronized void m139280c() {
        synchronized (C80333dc.class) {
            MethodCollector.m26663i(5467);
            C14894c c = m139279c(C81631k.f182525a.mo125297c());
            if (c != null) {
                c.mo23999a(CheckRequestBodyModel.GroupType.NORMAL.getValue(), (Map<String, List<CheckRequestBodyModel.TargetChannel>>) null, new C81542d());
            }
            MethodCollector.m26664o(5467);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r2 != null) goto L_0x002a;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m139283d() {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.utils.dc> r5 = com.p2082ss.android.ugc.aweme.utils.C80333dc.class
            monitor-enter(r5)
            r4 = 5469(0x155d, float:7.664E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)     // Catch:{ all -> 0x003d }
            com.ss.android.ugc.aweme.web.k r0 = com.p2082ss.android.ugc.aweme.web.C81631k.f182525a     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r0.mo125297c()     // Catch:{ all -> 0x003d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x003d }
            r3 = 0
            if (r0 != 0) goto L_0x0038
            com.ss.android.ugc.aweme.web.IGeckoXClientManager r0 = com.p2082ss.android.ugc.aweme.web.GeckoXClientManager.m141361a()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0038
            com.bytedance.geckox.c r2 = r0.mo125244b(r1)     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x002a
            com.bytedance.geckox.c r2 = m139282d(r1)     // Catch:{ all -> 0x003d }
            r0.mo125245b(r1, r2)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0038
        L_0x002a:
            com.bytedance.geckox.model.CheckRequestBodyModel$GroupType r0 = com.bytedance.geckox.model.CheckRequestBodyModel.GroupType.HIGHPRIORITY     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r0.getValue()     // Catch:{ all -> 0x003d }
            com.ss.android.ugc.aweme.web.d r0 = new com.ss.android.ugc.aweme.web.d     // Catch:{ all -> 0x003d }
            r0.<init>()     // Catch:{ all -> 0x003d }
            r2.mo23999a(r1, r3, r0)     // Catch:{ all -> 0x003d }
        L_0x0038:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)     // Catch:{ all -> 0x003d }
            monitor-exit(r5)
            return
        L_0x003d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.C80333dc.m139283d():void");
    }

    /* renamed from: e */
    public static void m139284e() {
        C14894c b = m139275b();
        if (b != null) {
            String b2 = C53438a.m98623b();
            if (!TextUtils.isEmpty(b2)) {
                b.mo23998a(b2.toLowerCase(Locale.ROOT), (Map<String, List<CheckRequestBodyModel.TargetChannel>>) null, new OptionCheckUpdateParams().setListener(new C81542d()));
            }
        }
    }

    /* renamed from: g */
    public static String m139286g() {
        String str;
        Keva repo = Keva.getRepo("hybrid_debug_settings");
        if (((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe()) {
            str = "boe";
        } else {
            str = "local_test";
        }
        return repo.getString("gecko_deployment", str);
    }

    /* renamed from: j */
    public static GeckoGlobalConfig m139289j() {
        GeckoGlobalConfig.ENVType eNVType;
        boolean equals = "online".equals(m139286g());
        if (!m139287h() || equals) {
            eNVType = GeckoGlobalConfig.ENVType.PROD;
        } else if (!((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe() || !"boe".equals(m139286g())) {
            eNVType = GeckoGlobalConfig.ENVType.DEV;
        } else {
            eNVType = GeckoGlobalConfig.ENVType.BOE;
        }
        String deviceId = DeviceRegisterManager.getDeviceId();
        Context a = C17867d.m33078a();
        GeckoGlobalConfig.Builder region = new GeckoGlobalConfig.Builder(a).netStack(new GeckoXNetImpl(a)).statisticMonitor(f179866c).host("gecko-sg.tiktokv.com").appVersion(C17867d.m33085f()).appId((long) C17867d.f42590n).region(C58071d.m104913g());
        if (TextUtils.isEmpty(deviceId)) {
            deviceId = "0";
        }
        return region.deviceId(deviceId).env(eNVType).monitorConfig(f179867d).build();
    }

    /* renamed from: b */
    public static boolean m139278b(String str) {
        return m139274a(C81631k.f182525a.mo125297c(), str);
    }

    /* renamed from: a */
    private static File m139271a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: c */
    private static C14894c m139279c(String str) {
        IGeckoXClientManager a = GeckoXClientManager.m141361a();
        if (a == null) {
            return null;
        }
        C14894c a2 = a.mo125242a(str);
        if (a2 != null) {
            return a2;
        }
        C14894c d = m139282d(str);
        a.mo125243a(str, d);
        return d;
    }

    /* renamed from: d */
    private static C14894c m139282d(String str) {
        String serverDeviceId = AppLog.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId)) {
            return null;
        }
        File b = C81631k.m141476b();
        try {
            C14905e.C14906a aVar = new C14905e.C14906a(m139291l());
            aVar.f36429k = "gecko-sg.tiktokv.com";
            C14905e.C14906a a = aVar.mo24005a((long) C17867d.f42590n);
            a.f36427i = C17867d.m33085f();
            a.f36419a = new GeckoXNetImpl(m139291l());
            a.f36424f = f179866c;
            C14905e.C14906a b2 = a.mo24012a(str).mo24014b(str);
            b2.f36431m = C58071d.m104913g();
            b2.f36428j = serverDeviceId;
            b2.f36430l = b;
            return C14894c.m27397a(b2.mo24015b());
        } catch (Exception e) {
            Log.getStackTraceString(e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e1 A[Catch:{ Exception -> 0x00f5 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.geckox.C14894c m139270a(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.C80333dc.m139270a(java.lang.String):com.bytedance.geckox.c");
    }

    /* renamed from: a */
    public static boolean m139274a(String str, String str2) {
        return m139281c("offlineX", str, str2);
    }

    /* renamed from: b */
    public static String m139277b(String str, String str2) {
        return m139272a("offlineX", str, str2);
    }

    /* renamed from: b */
    public static Long m139276b(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (TextUtils.isEmpty(str)) {
                str = "gecko_offline_res_x";
            }
            try {
                File file = new File(m139271a(m139291l()), str + File.separator + str2);
                if (!file.exists()) {
                    return null;
                }
                File file2 = new File(file.getAbsolutePath(), str3);
                if (!file2.exists()) {
                    return null;
                }
                Long a = C15064m.m27738a(file2);
                String.valueOf(a);
                return a;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private static boolean m139281c(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || m139276b(str, str2, str3) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m139272a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            if (TextUtils.isEmpty(str)) {
                str = "gecko_offline_res_x";
            }
            if (str3.indexOf("/") == 0) {
                str3 = str3.substring(1);
            }
            if (str3.lastIndexOf("/") == str3.length() - 1) {
                str3 = str3.substring(0, str3.lastIndexOf("/"));
            }
            try {
                File file = new File(m139271a(m139291l()), str + File.separator + str2);
                if (!file.exists()) {
                    return null;
                }
                String absolutePath = file.getAbsolutePath();
                File file2 = new File(absolutePath, str3);
                if (!file2.exists()) {
                    return null;
                }
                Long a = C15064m.m27738a(file2);
                if (a == null) {
                    return null;
                }
                return absolutePath + File.separator + str3 + File.separator + a + File.separator + "res";
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
