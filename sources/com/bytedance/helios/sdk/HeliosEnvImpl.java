package com.bytedance.helios.sdk;

import android.app.AppOpsManager;
import android.app.Application;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.Npth;
import com.bytedance.crash.runtime.ConfigManager;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.api.AbstractC15295a;
import com.bytedance.helios.api.config.AbstractC15331b;
import com.bytedance.helios.api.config.AbstractSettingsModel;
import com.bytedance.helios.api.config.AnchorInfoModel;
import com.bytedance.helios.api.config.ApiConfig;
import com.bytedance.helios.api.config.ApiSampleRateConfig;
import com.bytedance.helios.api.config.C15330a;
import com.bytedance.helios.api.config.CrpConfig;
import com.bytedance.helios.api.config.DefaultSampleRateConfig;
import com.bytedance.helios.api.config.FrequencyGroupModel;
import com.bytedance.helios.api.config.ResourceCheckModel;
import com.bytedance.helios.api.config.ResourceSampleRateConfig;
import com.bytedance.helios.api.config.RuleInfo;
import com.bytedance.helios.api.config.SampleRateConfig;
import com.bytedance.helios.api.p1088b.C15307e;
import com.bytedance.helios.api.p1088b.C15320o;
import com.bytedance.helios.api.p1088b.C15322p;
import com.bytedance.helios.api.p1088b.C15323q;
import com.bytedance.helios.api.p1090c.C15325a;
import com.bytedance.helios.api.p1090c.C15326b;
import com.bytedance.helios.api.p1091d.AbstractC15332a;
import com.bytedance.helios.p1085a.p1086a.C15290c;
import com.bytedance.helios.p1085a.p1086a.C15294g;
import com.bytedance.helios.p1085a.p1086a.HandlerThreadC15288a;
import com.bytedance.helios.sdk.p1092a.C15351b;
import com.bytedance.helios.sdk.p1095c.C15373a;
import com.bytedance.helios.sdk.p1095c.C15391f;
import com.bytedance.helios.sdk.p1098e.C15428a;
import com.bytedance.helios.sdk.p1098e.C15430c;
import com.bytedance.helios.sdk.p1099f.C15442b;
import com.bytedance.helios.sdk.p1099f.p1100a.AbstractC15438b;
import com.bytedance.helios.sdk.p1099f.p1100a.C15437a;
import com.bytedance.helios.sdk.p1099f.p1100a.C15439c;
import com.bytedance.helios.sdk.p1099f.p1100a.C15440d;
import com.bytedance.helios.sdk.p1099f.p1100a.C15441e;
import com.bytedance.helios.sdk.p1099f.p1104e.C15472a;
import com.bytedance.helios.sdk.p1105g.C15474a;
import com.bytedance.helios.sdk.p1105g.C15475b;
import com.bytedance.helios.sdk.utils.C15481c;
import com.bytedance.helios.sdk.utils.C15482d;
import com.bytedance.helios.sdk.utils.C15484f;
import com.bytedance.helios.sdk.utils.C15487h;
import com.bytedance.helios.sdk.utils.HandlerThreadC15486g;
import com.p2082ss.android.agilelogger.ALog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

public final class HeliosEnvImpl extends AbstractC15295a {
    public static final HeliosEnvImpl INSTANCE = new HeliosEnvImpl();
    private static final Map<String, AbstractC89171a<Object>> baseExpressionEnv = C89041ag.m154427b(C89387v.m154943a("$region", C15336a.f37412a), C89387v.m154943a("$channel", C15337b.f37413a), C89387v.m154943a("$version_code", C15338c.f37414a), C89387v.m154943a("$device_id", C15339d.f37415a), C89387v.m154943a("$os_version", C15340e.f37416a), C89387v.m154943a("$first_start", C15341f.f37417a));
    private static Map<String, AbstractC15438b> blockConditions = new LinkedHashMap();
    private static volatile C15330a envAppInfo;
    private static AbstractC15331b envProxy;
    private static volatile boolean envReady;
    private static AbstractSettingsModel envSettings = new C15393d();
    private static volatile boolean envSettingsReady;
    private static Map<String, AbstractC15438b> monitorConditions = new LinkedHashMap();

    private HeliosEnvImpl() {
    }

    public final Map<String, AbstractC89171a<Object>> getBaseExpressionEnv() {
        return baseExpressionEnv;
    }

    public final Map<String, AbstractC15438b> getBlockConditions() {
        return blockConditions;
    }

    public final C15330a getEnvAppInfo() {
        return envAppInfo;
    }

    public final Map<String, AbstractC15438b> getMonitorConditions() {
        return monitorConditions;
    }

    /* renamed from: com.bytedance.helios.sdk.HeliosEnvImpl$e */
    static final class C15340e extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C15340e f37416a = new C15340e();

        static {
            Covode.recordClassIndex(17590);
        }

        C15340e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public final boolean getAlogEnabled() {
        return envSettings.getAlogEnabled();
    }

    public final List<AnchorInfoModel> getAnchorConfigList() {
        return envSettings.getAnchorConfigList();
    }

    public final ApiConfig getApiConfig() {
        return envSettings.getApiConfig();
    }

    public final long getApiTimeOutDuration() {
        return envSettings.getApiTimeOutDuration();
    }

    public final boolean getAppOpsIgnoreKnownApi() {
        return envSettings.getAppOpsIgnoreKnownApi();
    }

    public final long getBackgroundFreezeDuration() {
        return envSettings.getBackgroundFreezeDuration();
    }

    public final CrpConfig getCrpConfig() {
        return envSettings.getCrpConfig();
    }

    public final List<FrequencyGroupModel> getFrequencyGroupModels() {
        return envSettings.getFrequencyGroupModels();
    }

    public final List<String> getInterestedAppOps() {
        return envSettings.getInterestedAppOps();
    }

    public final List<ResourceCheckModel> getResourceCheckSettings() {
        return envSettings.getResourceCheckList();
    }

    public final List<RuleInfo> getRuleInfoList() {
        return envSettings.getRuleInfoList();
    }

    public final SampleRateConfig getSampleRateConfig() {
        return envSettings.getSampleRateConfig();
    }

    /* renamed from: com.bytedance.helios.sdk.HeliosEnvImpl$b */
    static final class C15337b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C15337b f37413a = new C15337b();

        static {
            Covode.recordClassIndex(17587);
        }

        C15337b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String str;
            C15330a envAppInfo = HeliosEnvImpl.INSTANCE.getEnvAppInfo();
            if (envAppInfo == null || (str = envAppInfo.f37409d) == null) {
                return "";
            }
            return str;
        }
    }

    private final void initSettingsAsync() {
        HandlerThreadC15288a.m28195b().post(RunnableC15345j.f37422a);
    }

    public final Application getApplication() {
        C15330a aVar = envAppInfo;
        if (aVar != null) {
            return aVar.f37408c;
        }
        return null;
    }

    public final String getDeviceId() {
        AbstractC15331b bVar = envProxy;
        if (bVar != null) {
            return bVar.mo25054b();
        }
        return null;
    }

    /* renamed from: com.bytedance.helios.sdk.HeliosEnvImpl$a */
    static final class C15336a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C15336a f37412a = new C15336a();

        static {
            Covode.recordClassIndex(17586);
        }

        C15336a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a;
            HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.INSTANCE;
            AbstractC15331b bVar = HeliosEnvImpl.envProxy;
            if (bVar == null || (a = bVar.mo25053a()) == null) {
                return "";
            }
            return a;
        }
    }

    /* renamed from: com.bytedance.helios.sdk.HeliosEnvImpl$c */
    static final class C15338c extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C15338c f37414a = new C15338c();

        static {
            Covode.recordClassIndex(17588);
        }

        C15338c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            long j;
            C15330a envAppInfo = HeliosEnvImpl.INSTANCE.getEnvAppInfo();
            if (envAppInfo != null) {
                j = envAppInfo.f37407b;
            } else {
                j = 0;
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: com.bytedance.helios.sdk.HeliosEnvImpl$d */
    static final class C15339d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C15339d f37415a = new C15339d();

        static {
            Covode.recordClassIndex(17589);
        }

        C15339d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String b;
            HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.INSTANCE;
            AbstractC15331b bVar = HeliosEnvImpl.envProxy;
            if (bVar == null || (b = bVar.mo25054b()) == null) {
                return "";
            }
            return b;
        }
    }

    /* renamed from: com.bytedance.helios.sdk.HeliosEnvImpl$f */
    static final class C15341f extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C15341f f37417a = new C15341f();

        static {
            Covode.recordClassIndex(17591);
        }

        C15341f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            C15330a envAppInfo = HeliosEnvImpl.INSTANCE.getEnvAppInfo();
            if (envAppInfo != null) {
                z = envAppInfo.f37410e;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.helios.sdk.HeliosEnvImpl$i */
    static final class RunnableC15344i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC15331b f37420a;

        /* renamed from: b */
        final /* synthetic */ C15330a f37421b;

        static {
            Covode.recordClassIndex(17594);
        }

        RunnableC15344i(AbstractC15331b bVar, C15330a aVar) {
            this.f37420a = bVar;
            this.f37421b = aVar;
        }

        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            C15434f.m28386a().mo25167a(this.f37421b.f37408c);
            C15391f.m28292a("LifecycleMonitor.initialize", currentTimeMillis, true);
        }
    }

    @Override // com.bytedance.helios.api.AbstractC15295a
    public final boolean isEnabled() {
        if (envSettingsReady && envSettings.getEnabled()) {
            return true;
        }
        C15330a aVar = envAppInfo;
        if (aVar == null || !aVar.f37410e) {
            return false;
        }
        return true;
    }

    public final boolean isOffLineEnv() {
        if (isTestEnv()) {
            return true;
        }
        C15330a aVar = envAppInfo;
        if (aVar == null || !aVar.f37406a) {
            return false;
        }
        return true;
    }

    public final boolean isTestEnv() {
        String str;
        List<String> testEnvChannels = envSettings.getTestEnvChannels();
        C15330a aVar = envAppInfo;
        if (aVar != null) {
            str = aVar.f37409d;
        } else {
            str = null;
        }
        return C89070n.m154556a((Iterable) testEnvChannels, (Object) str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.helios.sdk.HeliosEnvImpl$h */
    public static final class RunnableC15343h implements Runnable {

        /* renamed from: a */
        public static final RunnableC15343h f37419a = new RunnableC15343h();

        static {
            Covode.recordClassIndex(17593);
        }

        RunnableC15343h() {
        }

        public final void run() {
            if (HeliosEnvImpl.INSTANCE.isOffLineEnv()) {
                ALog.setDebug(true);
                ConfigManager configManager = Npth.getConfigManager();
                C89219l.m154709a((Object) configManager, "");
                configManager.setDebugMode(true);
            }
            C15484f.m28491a("Helios-Common-Env", String.valueOf(HeliosEnvImpl.INSTANCE.getEnvAppInfo()), (String) null, 12);
            HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.INSTANCE;
            C15484f.m28491a("Helios-Common-Env", HeliosEnvImpl.envSettings.toString(), (String) null, 12);
        }
    }

    public final synchronized void checkAllCommonEnvReady() {
        MethodCollector.m26663i(8021);
        if (!envReady && envSettingsReady) {
            envReady = true;
            C15484f.m28491a("Helios-Common-Env", "checkAllCommonEnvReady", (String) null, 12);
            HandlerThreadC15486g.m28499b().post(RunnableC15342g.f37418a);
            HandlerThreadC15288a.m28195b().postDelayed(RunnableC15343h.f37419a, 10000);
        }
        MethodCollector.m26664o(8021);
    }

    public final String getUserRegion() {
        String str;
        AbstractC15331b bVar = envProxy;
        if (bVar != null) {
            str = bVar.mo25053a();
        } else {
            str = null;
        }
        if (envProxy != null) {
            C15484f.m28491a("Helios-Common-Env", "userRegion=".concat(String.valueOf(str)), (String) null, 12);
        }
        return str;
    }

    public final void tryStartNativeAudioMonitor() {
        if (isEnabled() && getApplication() != null) {
            Application application = getApplication();
            if (application == null) {
                C89219l.m154707a();
            }
            if (C15487h.m28504a(application)) {
                AbstractC15332a a = AbstractC15332a.C15333a.m28234a();
                if (a != null) {
                    a.startMonitor();
                }
                C15484f.m28491a("HeliosEnv", "tryEnableNativeAudioMonitor: ".concat(String.valueOf(a)), (String) null, 12);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.helios.sdk.HeliosEnvImpl$j */
    public static final class RunnableC15345j implements Runnable {

        /* renamed from: a */
        public static final RunnableC15345j f37422a = new RunnableC15345j();

        static {
            Covode.recordClassIndex(17595);
        }

        RunnableC15345j() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
            if (p4600h.p4601a.C89070n.m154556a((java.lang.Iterable) r1, (java.lang.Object) r0) != false) goto L_0x0030;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                com.bytedance.helios.sdk.HeliosEnvImpl r0 = com.bytedance.helios.sdk.HeliosEnvImpl.INSTANCE
                com.bytedance.helios.api.config.b r0 = com.bytedance.helios.sdk.HeliosEnvImpl.access$getEnvProxy$p(r0)
                if (r0 == 0) goto L_0x000e
                com.bytedance.helios.api.config.AbstractSettingsModel r3 = r0.mo25055c()
                if (r3 != 0) goto L_0x000f
            L_0x000e:
                return
            L_0x000f:
                com.bytedance.helios.sdk.HeliosEnvImpl r0 = com.bytedance.helios.sdk.HeliosEnvImpl.INSTANCE
                com.bytedance.helios.api.config.a r0 = r0.getEnvAppInfo()
                r2 = 1
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.f37406a
                if (r0 == r2) goto L_0x0030
            L_0x001c:
                java.util.List r1 = r3.getTestEnvChannels()
                com.bytedance.helios.sdk.HeliosEnvImpl r0 = com.bytedance.helios.sdk.HeliosEnvImpl.INSTANCE
                com.bytedance.helios.api.config.a r0 = r0.getEnvAppInfo()
                if (r0 == 0) goto L_0x004f
                java.lang.String r0 = r0.f37409d
            L_0x002a:
                boolean r0 = p4600h.p4601a.C89070n.m154556a(r1, r0)
                if (r0 == 0) goto L_0x003f
            L_0x0030:
                com.p2082ss.android.agilelogger.ALog.setDebug(r2)
                com.bytedance.crash.runtime.ConfigManager r1 = com.bytedance.crash.Npth.getConfigManager()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r1, r0)
                r1.setDebugMode(r2)
            L_0x003f:
                com.bytedance.helios.sdk.HeliosEnvImpl r0 = com.bytedance.helios.sdk.HeliosEnvImpl.INSTANCE
                com.bytedance.helios.sdk.HeliosEnvImpl.access$setEnvSettings$p(r0, r3)
                com.bytedance.helios.sdk.HeliosEnvImpl r0 = com.bytedance.helios.sdk.HeliosEnvImpl.INSTANCE
                com.bytedance.helios.sdk.HeliosEnvImpl.access$setEnvSettingsReady$p(r0, r2)
                com.bytedance.helios.sdk.HeliosEnvImpl r0 = com.bytedance.helios.sdk.HeliosEnvImpl.INSTANCE
                r0.checkAllCommonEnvReady()
                goto L_0x000e
            L_0x004f:
                r0 = 0
                goto L_0x002a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.HeliosEnvImpl.RunnableC15345j.run():void");
        }
    }

    static {
        Covode.recordClassIndex(17585);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.helios.sdk.HeliosEnvImpl$g */
    public static final class RunnableC15342g implements Runnable {

        /* renamed from: a */
        public static final RunnableC15342g f37418a = new RunnableC15342g();

        static {
            Covode.recordClassIndex(17592);
        }

        RunnableC15342g() {
        }

        public final void run() {
            int i;
            String str;
            Application application;
            C15351b a;
            long currentTimeMillis = System.currentTimeMillis();
            SampleRateConfig sampleRateConfig = HeliosEnvImpl.INSTANCE.getSampleRateConfig();
            C89219l.m154719c(sampleRateConfig, "");
            String deviceId = HeliosEnvImpl.INSTANCE.getDeviceId();
            if (deviceId == null || C89361p.m154870a((CharSequence) deviceId) || C89219l.m154714a((Object) deviceId, (Object) "0") || C89219l.m154714a((Object) deviceId, (Object) "-1")) {
                deviceId = C15482d.m28485a("random_device_id");
                if (C89361p.m154870a((CharSequence) deviceId)) {
                    deviceId = UUID.randomUUID().toString();
                    C89219l.m154709a((Object) deviceId, "");
                    C15482d.m28488b("random_device_id", deviceId);
                }
            }
            String sb = new StringBuilder().append(C15475b.f37715a.get(1)).append('-').append(C15475b.f37715a.get(2)).append('-').append(C15475b.f37715a.get(5)).toString();
            String a2 = C15482d.m28486a("sample_rate_date", "");
            long abs = Math.abs(C15474a.m28468a(C15474a.m28469a(deviceId)));
            C15484f.m28491a("Helios-Common-Env", "generateSampleRateResults deviceId=" + deviceId + " hashCode=" + abs + " date=" + sb + " originalDate=" + a2, (String) null, 12);
            C15484f.m28491a("Helios-Common-Env", "generateSampleRateResults\n" + C15481c.m28482a(sampleRateConfig), (String) null, 12);
            DefaultSampleRateConfig defaultLowPriorityConfig = sampleRateConfig.getDefaultLowPriorityConfig();
            C15475b.f37716b = new C15322p(C15475b.m28471a(abs, sampleRateConfig.getAppOpsConfig()), C15475b.m28471a(abs, sampleRateConfig.getAutoStartConfig()), C15475b.m28471a(abs, sampleRateConfig.getExceptionConfig()), new C15307e(C15475b.m28471a(abs, defaultLowPriorityConfig.getMonitorNormal()), C15475b.m28471a(abs, defaultLowPriorityConfig.getMonitorError()), C15475b.m28471a(abs, defaultLowPriorityConfig.getInterceptError())));
            List<ResourceSampleRateConfig> resourceMediumPriorityConfigs = sampleRateConfig.getResourceMediumPriorityConfigs();
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) resourceMediumPriorityConfigs, 10));
            for (T t : resourceMediumPriorityConfigs) {
                C15475b.f37717c.put(t.getResourceId(), new C15307e(C15475b.m28471a(abs, t.getMonitorNormal()), C15475b.m28471a(abs, t.getMonitorError()), C15475b.m28471a(abs, t.getInterceptError())));
                arrayList.add(C89391z.f203057a);
            }
            List<ApiSampleRateConfig> apiHighPriorityConfigs = sampleRateConfig.getApiHighPriorityConfigs();
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) apiHighPriorityConfigs, 10));
            for (T t2 : apiHighPriorityConfigs) {
                C15307e eVar = new C15307e(C15475b.m28471a(abs, t2.getMonitorNormal()), C15475b.m28471a(abs, t2.getMonitorError()), C15475b.m28471a(abs, t2.getInterceptError()));
                Iterator<T> it = t2.getApiIds().iterator();
                while (it.hasNext()) {
                    C15475b.f37718d.put(Integer.valueOf(it.next().intValue()), eVar);
                }
                arrayList2.add(C89391z.f203057a);
            }
            if (!sampleRateConfig.getEnableMonitor() || !(!C89219l.m154714a((Object) sb, (Object) a2))) {
                i = 12;
                str = null;
            } else {
                C15482d.m28488b("sample_rate_date", sb);
                C15322p pVar = C15475b.f37716b;
                if (pVar == null) {
                    C89219l.m154707a();
                }
                i = 12;
                str = null;
                C15323q qVar = new C15323q(sb, deviceId, abs, pVar, C15475b.f37717c, C15475b.f37718d);
                C89219l.m154719c(qVar, "");
                C15320o.f37386f.obtainMessage(1002, qVar).sendToTarget();
            }
            C15484f.m28491a("Helios-Common-Env", "generateSampleRateResults\n" + C15475b.f37716b + '\n' + C15475b.f37717c + '\n' + C15475b.f37718d, str, i);
            C15391f.m28292a("SamplerManager.generateSampleRateResults", currentTimeMillis, true);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t3 : HeliosEnvImpl.INSTANCE.getRuleInfoList()) {
                linkedHashMap.put("$" + t3.getName(), new C15441e(t3.getName()));
            }
            for (Map.Entry<String, RuleInfo> entry : C15472a.f37709c.entrySet()) {
                linkedHashMap.put("$" + entry.getKey(), new C15441e(entry.getKey()));
            }
            linkedHashMap.put("$background", new C15437a());
            linkedHashMap.put("$frequency", new C15439c(false));
            linkedHashMap.put("$parameter", new C15440d(true));
            HeliosEnvImpl.INSTANCE.setBlockConditions(linkedHashMap);
            HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.INSTANCE;
            Map<String, AbstractC15438b> d = C89041ag.m154431d(linkedHashMap);
            d.put("$frequency", new C15439c(true));
            d.put("$parameter", new C15440d(false));
            heliosEnvImpl.setMonitorConditions(d);
            HeliosEnvImpl heliosEnvImpl2 = HeliosEnvImpl.INSTANCE;
            List<RuleInfo> ruleInfoList = HeliosEnvImpl.envSettings.getRuleInfoList();
            ArrayList<RuleInfo> arrayList3 = new ArrayList();
            for (T t4 : ruleInfoList) {
                if (C89219l.m154714a((Object) t4.getRegisterType(), (Object) "auto")) {
                    arrayList3.add(t4);
                }
            }
            for (RuleInfo ruleInfo : arrayList3) {
                C15442b.m28401a(ruleInfo);
            }
            HeliosEnvImpl heliosEnvImpl3 = HeliosEnvImpl.INSTANCE;
            boolean alogEnabled = HeliosEnvImpl.envSettings.getAlogEnabled();
            HeliosEnvImpl heliosEnvImpl4 = HeliosEnvImpl.INSTANCE;
            long alogDuration = HeliosEnvImpl.envSettings.getAlogDuration();
            C15373a.f37501b = alogEnabled;
            C15373a.f37502c = alogDuration;
            long j = C15373a.m28277a().getLong("alog_last_request_start_time", 0);
            long j2 = C15373a.m28277a().getLong("alog_last_request_end_time", 0);
            if (1 <= j && j2 > j) {
                C15373a.m28278a(j, j2, 0);
            }
            C15330a envAppInfo = HeliosEnvImpl.INSTANCE.getEnvAppInfo();
            if (!(envAppInfo == null || (application = envAppInfo.f37408c) == null || Build.VERSION.SDK_INT < 30 || (a = C15351b.C15352a.m28249a(application)) == null)) {
                try {
                    AppOpsManager appOpsManager = a.f37447a;
                    if (appOpsManager != null) {
                        appOpsManager.setOnOpNotedCallback(HandlerThreadC15486g.m28500c(), a.f37448b);
                    }
                } catch (Exception e) {
                    C15320o.m28230a(new C15326b(null, e, "label_app_ops_listen", null, 9));
                }
            }
            HeliosEnvImpl.INSTANCE.tryStartNativeAudioMonitor();
            HeliosEnvImpl heliosEnvImpl5 = HeliosEnvImpl.INSTANCE;
            AbstractC15331b unused = HeliosEnvImpl.envProxy;
        }
    }

    public final void setEnvAppInfo(C15330a aVar) {
        envAppInfo = aVar;
    }

    public final void setBlockConditions(Map<String, AbstractC15438b> map) {
        C89219l.m154719c(map, "");
        blockConditions = map;
    }

    public final void setMonitorConditions(Map<String, AbstractC15438b> map) {
        C89219l.m154719c(map, "");
        monitorConditions = map;
    }

    @Override // com.bytedance.helios.api.AbstractC15295a
    public final void ruleChangeNotify(RuleInfo ruleInfo) {
        C89219l.m154719c(ruleInfo, "");
        C15442b.m28401a(ruleInfo);
    }

    @Override // com.bytedance.helios.api.AbstractC15295a
    public final void recordRegionEvent(Map<String, Object> map) {
        C89219l.m154719c(map, "");
        C89219l.m154719c(map, "");
        Object obj = map.get("event_time_stamp");
        if (!(obj instanceof Long)) {
            obj = null;
        }
        Long l = (Long) obj;
        if (l != null) {
            map.put("event_date_time", C15294g.m28203a(l.longValue()));
            map.put("event_time_stamp", String.valueOf(l.longValue()));
        }
        C15484f.m28491a("RegionEvent", map.toString(), (String) null, 12);
        C15428a<Map<String, Object>> aVar = C15430c.f37669a;
        if (aVar != null) {
            aVar.offer(map);
        }
    }

    @Override // com.bytedance.helios.api.AbstractC15295a
    public final void ruleChangeNotify(String str, boolean z) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str, "");
        Iterator<T> it = C15442b.f37690a.iterator();
        while (it.hasNext()) {
            it.next().mo25181a(str, z);
        }
    }

    @Override // com.bytedance.helios.api.AbstractC15295a
    public final void init(AbstractC15331b bVar, C15330a aVar) {
        MethodCollector.m26663i(8018);
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
        synchronized (this) {
            try {
                if (!envReady) {
                    long currentTimeMillis = System.currentTimeMillis();
                    envProxy = bVar;
                    envAppInfo = aVar;
                    INSTANCE.initSettingsAsync();
                    HandlerThreadC15486g a = HandlerThreadC15486g.m28498a();
                    C89219l.m154709a((Object) a, "");
                    a.setUncaughtExceptionHandler(C15325a.f37401a);
                    HandlerThreadC15288a a2 = HandlerThreadC15288a.m28194a();
                    C89219l.m154709a((Object) a2, "");
                    a2.setUncaughtExceptionHandler(C15325a.f37401a);
                    C15290c.m28197a().post(new RunnableC15344i(bVar, aVar));
                    C15391f.m28292a("HeliosEnv.init", currentTimeMillis, true);
                    MethodCollector.m26664o(8018);
                }
            } finally {
                MethodCollector.m26664o(8018);
            }
        }
    }
}
