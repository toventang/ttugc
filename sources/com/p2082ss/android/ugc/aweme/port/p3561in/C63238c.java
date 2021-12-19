package com.p2082ss.android.ugc.aweme.port.p3561in;

import android.app.Application;
import android.os.Build;
import android.util.Log;
import com.bef.effectsdk.BuildConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.google.p1998c.p1999a.C27245k;
import com.p2082ss.android.ugc.aweme.effect.C46299b;
import com.p2082ss.android.ugc.aweme.effectplatform.C46414e;
import com.p2082ss.android.ugc.aweme.effectplatform.C46417h;
import com.p2082ss.android.ugc.aweme.effectplatform.C46439w;
import com.p2082ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p2082ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.internal.C63282i;
import com.p2082ss.android.ugc.aweme.port.internal.C63298n;
import com.p2082ss.android.ugc.aweme.port.internal.C63299o;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63250k;
import com.p2082ss.android.ugc.aweme.property.C65329a;
import com.p2082ss.android.ugc.aweme.property.C65460eo;
import com.p2082ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p2082ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.FetchModelType;
import com.p2082ss.android.ugc.effectmanager.ModelEventListener;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.common.logger.ILogger;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.model.ModelInfo;
import com.p2082ss.android.vesdk.C85515j;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.port.in.c */
public final class C63238c {

    /* renamed from: A */
    public static AbstractC63211ba f143563A = f143566D.mo73303B();

    /* renamed from: B */
    public static AbstractC63188an f143564B = f143565C.mo73271Q();

    /* renamed from: C */
    public static AbstractC63263u f143565C;

    /* renamed from: D */
    public static AbstractC63177aj f143566D;

    /* renamed from: E */
    public static AbstractC63214bc f143567E = f143565C.mo73258D();

    /* renamed from: F */
    public static AbstractC63227bk f143568F = f143565C.mo73260F();

    /* renamed from: G */
    public static AbstractC63197av f143569G = f143566D.mo73322r();

    /* renamed from: H */
    public static AbstractC63212bb f143570H = f143566D.mo73329y();

    /* renamed from: I */
    public static C65460eo f143571I = f143565C.mo73289q();

    /* renamed from: J */
    public static C65329a f143572J = new C65329a();

    /* renamed from: K */
    private static final Object f143573K = new Object();

    /* renamed from: a */
    public static Application f143574a;

    /* renamed from: b */
    public static C27910f f143575b;

    /* renamed from: c */
    public static AbstractC63167ab f143576c = f143566D.mo73310f();

    /* renamed from: d */
    public static AbstractC63178ak f143577d = f143566D.mo73312h();

    /* renamed from: e */
    public static AbstractC63219bf f143578e = f143566D.mo73325u();

    /* renamed from: f */
    public static AbstractC63172af f143579f = ((AbstractC63172af) C27245k.m54229a(f143566D.mo73320p()));

    /* renamed from: g */
    public static AbstractC63201ay f143580g = f143566D.mo73302A();

    /* renamed from: h */
    public static AbstractC63154aa f143581h = f143566D.mo73306b();

    /* renamed from: i */
    public static AbstractC63255n f143582i = f143566D.mo73309e();

    /* renamed from: j */
    public static IHashTagService f143583j = f143566D.mo73321q();

    /* renamed from: k */
    public static AbstractC63220bg f143584k = f143566D.mo73326v();

    /* renamed from: l */
    public static AbstractC63175ai f143585l = f143566D.mo73330z();

    /* renamed from: m */
    public static AbstractC63202az f143586m = f143566D.mo73323s();

    /* renamed from: n */
    public static AbstractC63229bm f143587n = new C63299o();

    /* renamed from: o */
    public static IVideoConfigService f143588o = new C63298n();

    /* renamed from: p */
    public static IVideoConfigService f143589p = new C63282i();

    /* renamed from: q */
    public static AbstractC63224bi f143590q = f143566D.mo73327w();

    /* renamed from: r */
    public static AbstractC63199ax f143591r = f143566D.mo73314j();

    /* renamed from: s */
    public static AbstractC63186am f143592s = f143566D.mo73313i();

    /* renamed from: t */
    public static AbstractC63169ac f143593t = f143566D.mo73311g();

    /* renamed from: u */
    public static AbstractC63269z f143594u = f143565C.mo73255A();

    /* renamed from: v */
    public static AbstractC63215bd f143595v = f143566D.mo73324t();

    /* renamed from: w */
    public static AbstractC63196au f143596w = f143565C.mo73257C();

    /* renamed from: x */
    public static AbstractC63262t f143597x = f143566D.mo73318n();

    /* renamed from: y */
    public static AbstractC63171ae f143598y = f143566D.mo73319o();

    /* renamed from: z */
    public static AbstractC63266w f143599z = f143566D.mo73305a();

    /* renamed from: a */
    public static boolean m114591a() {
        return C63250k.C63252a.f143622a.mo101731a(C63241d.f143601a);
    }

    /* renamed from: b */
    public static String m114592b() {
        StringBuilder sb = new StringBuilder();
        C63250k.C63252a.f143622a.mo101731a(new C63242e(sb));
        return sb.toString();
    }

    /* renamed from: c */
    public static synchronized AbstractC50709q m114593c() {
        AbstractC50709q f;
        synchronized (C63238c.class) {
            MethodCollector.m26663i(10209);
            f = C63244g.m114602a().mo73290r().mo86006d().mo86071f();
            MethodCollector.m26664o(10209);
        }
        return f;
    }

    /* renamed from: e */
    public static void m114595e() {
        m114594d();
        C63236br.m114584a(f143574a, C63254m.f143624a, f143575b, f143571I).mo101715a();
    }

    /* renamed from: d */
    public static void m114594d() {
        MethodCollector.m26663i(10366);
        synchronized (f143573K) {
            try {
                if (!DownloadableModelSupport.isInitialized()) {
                    EffectConfiguration build = EffectPlatformFactory.m89604a().createEffectConfigurationBuilder(new EffectPlatformBuilder().setContext(f143574a)).build();
                    final C46299b bVar = new C46299b();
                    DownloadableModelConfig.Builder eventListener = new DownloadableModelConfig.Builder().setAssetManager(f143574a.getAssets()).setJsonConverter(C46417h.m89587a()).setMonitorService(new C46414e()).setAppId(EffectPlatform.m89510a()).setAccessKey("142710f02c3a11e8b42429f14557854a").setDeviceType(Build.MODEL).setHosts(EffectPlatformFactory.m89604a().getDownloadableModelHosts()).setSdkVersion(BuildConfig.VERSION_NAME).setWorkspace(new File(f143574a.getFilesDir(), "effectmodel").getPath()).setEffectNetWorker(new C46439w()).setEffectConfiguration(build).setExecutor(C40780g.m82241a()).setEventListener(new ModelEventListener() {
                        /* class com.p2082ss.android.ugc.aweme.port.p3561in.C63238c.C632391 */

                        static {
                            Covode.recordClassIndex(74512);
                        }

                        @Override // com.p2082ss.android.ugc.effectmanager.ModelEventListener
                        public final void onModelDownloadStart(Effect effect, ModelInfo modelInfo) {
                            bVar.startDownloadEffectModelAlog(effect, modelInfo, BuildConfig.VERSION_NAME);
                        }

                        @Override // com.p2082ss.android.ugc.effectmanager.ModelEventListener
                        public final void onModelNotFound(Effect effect, Exception exc) {
                            C73991bj.m130131b("onModelNotFound" + Log.getStackTraceString(exc));
                            C40982q.m82520a("model_not_found_rate", 1, new C69840ar().mo110189a("errorDesc", Log.getStackTraceString(exc)).mo110187a("zip_model", (Integer) 0).mo110191a());
                        }

                        @Override // com.p2082ss.android.ugc.effectmanager.ModelEventListener
                        public final void onModelDownloadError(Effect effect, ModelInfo modelInfo, Exception exc) {
                            C73991bj.m130131b("onModelDownloadError " + effect.getName() + " requirements " + modelInfo.getName());
                            C40982q.m82520a("service_model_download_error_rate", 1, new C69840ar().mo110189a("errorDesc", Log.getStackTraceString(exc)).mo110187a("zip_model", (Integer) 0).mo110191a());
                            bVar.endDownloadEffectModelAlog(effect, modelInfo, -1, -1, exc, BuildConfig.VERSION_NAME);
                        }

                        @Override // com.p2082ss.android.ugc.effectmanager.ModelEventListener
                        public final void onModelDownloadSuccess(Effect effect, ModelInfo modelInfo, long j) {
                            C73991bj.m130128a("onModelDownloadSuccess " + effect.getName() + " requirements " + modelInfo.getName());
                            C40982q.m82520a("model_download_time", 0, new C69840ar().mo110188a("duration", Long.valueOf(j)).mo110191a());
                            C40982q.m82520a("service_model_download_error_rate", 0, new C69840ar().mo110187a("zipModel", (Integer) 0).mo110191a());
                            bVar.endDownloadEffectModelAlog(effect, modelInfo, j, 0, null, BuildConfig.VERSION_NAME);
                        }

                        @Override // com.p2082ss.android.ugc.effectmanager.ModelEventListener
                        public final void onFetchModelList(boolean z, String str, long j, String str2) {
                            bVar.reportModelListAlog(z, str, j, str2);
                        }
                    });
                    C63244g.m114602a();
                    DownloadableModelConfig build2 = eventListener.setModelFileEnv(DownloadableModelConfig.ModelFileEnv.ONLINE).setModelType(FetchModelType.fromValue(0)).build();
                    EPLog.setLogger(new ILogger() {
                        /* class com.p2082ss.android.ugc.aweme.port.p3561in.C63238c.C632402 */

                        static {
                            Covode.recordClassIndex(74513);
                        }

                        @Override // com.p2082ss.android.ugc.effectmanager.common.logger.ILogger
                        /* renamed from: d */
                        public final void mo101723d(String str) {
                            C73991bj.m130128a("effect_platform::".concat(String.valueOf(str)));
                        }

                        @Override // com.p2082ss.android.ugc.effectmanager.common.logger.ILogger
                        /* renamed from: i */
                        public final void mo101725i(String str) {
                            C73991bj.m130133d("effect_platform::".concat(String.valueOf(str)));
                        }

                        @Override // com.p2082ss.android.ugc.effectmanager.common.logger.ILogger
                        /* renamed from: w */
                        public final void mo101726w(String str) {
                            C73991bj.m130132c("effect_platform::".concat(String.valueOf(str)));
                        }

                        @Override // com.p2082ss.android.ugc.effectmanager.common.logger.ILogger
                        /* renamed from: e */
                        public final void mo101724e(String str, Throwable th) {
                            C73991bj.m130131b("effect_platform::" + str + ", cause::" + Log.getStackTraceString(th));
                        }
                    });
                    DownloadableModelSupport.initialize(build2);
                    DownloadableModelSupport.setLibraryLoader(C63243f.f143603a);
                }
            } finally {
                MethodCollector.m26664o(10366);
            }
        }
    }

    static {
        Covode.recordClassIndex(74511);
        Application application = C63247i.f143610a;
        AbstractC63263u a = C63244g.m114602a();
        AbstractC63177aj ajVar = C63253l.f143623a;
        f143574a = application;
        f143565C = a;
        f143566D = ajVar;
        f143575b = a.mo73261G();
        C63236br.m114584a(application, C63254m.f143624a, f143575b, f143571I);
    }

    /* renamed from: a */
    public static void m114590a(C85515j jVar) {
        m114594d();
        C63236br.m114584a(f143574a, C63254m.f143624a, f143575b, f143571I).mo101716a(jVar);
    }
}
