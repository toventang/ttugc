package com.p2082ss.android.ugc.aweme.miniapp_api.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59306c;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59308d;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.C59314b;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.p3445b.C59315a;
import com.p2082ss.android.ugc.aweme.miniapp_api.p3442a.AbstractC59290c;
import com.p2082ss.android.ugc.aweme.miniapp_api.p3442a.AbstractC59293f;
import com.p2082ss.android.ugc.aweme.miniapp_api.p3443b.AbstractC59304a;
import com.p2082ss.android.ugc.aweme.miniapp_api.p3443b.AbstractC59305b;
import com.p4496tt.appbrandimpl.MiniAppDependServiceImpl;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.services.c */
public class C59320c implements IMiniAppService {

    /* renamed from: a */
    public static final String f135541a = C59320c.class.getSimpleName();

    /* renamed from: b */
    private IMiniAppService f135542b;

    /* renamed from: c */
    private boolean f135543c;

    /* renamed from: d */
    private Locale f135544d;

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public String addScene(String str, String str2) {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public boolean checkMiniAppEnable(Context context) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public String getJsSdkVersion(Application application) {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void getShareInfo(String str, AbstractC59305b bVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void handleActivityImageResult(int i, int i2, Intent intent) {
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void initMiniApp(AbstractC59304a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void initWebViewSuffix(ContextWrapper contextWrapper, String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public boolean isMinAppAvailable(Context context, String str) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void logExcitingVideoAd(Context context, String str, long j, String str2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void notifyFollowAwemeState(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void onRequestPermissionsResult(Activity activity, String[] strArr, int[] iArr) {
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public boolean openShortcut(Context context, Intent intent) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void preloadMiniApp(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void preloadMiniApp(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void remoteMobV3(String str, JSONObject jSONObject) {
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public String setLaunchModeHostTask(String str) {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void tryMoveMiniAppActivityToFront(String str) {
    }

    private C59320c() {
        this.f135543c = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public AbstractC59318a getMobClickCombinerIpcService() {
        return new C59325d();
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public AbstractC59319b getTTDownloaderIpcService() {
        return new C59326e();
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.services.c$a */
    public static class C59324a {

        /* renamed from: a */
        public static final C59320c f135560a = new C59320c((byte) 0);

        static {
            Covode.recordClassIndex(69705);
        }
    }

    static {
        Covode.recordClassIndex(69701);
    }

    /* renamed from: a */
    public final IMiniAppService mo96989a() {
        AbstractC59290c e = MiniAppDependServiceImpl.m151699l().mo96959e();
        try {
            if (this.f135543c) {
                AbstractC59293f c = MiniAppDependServiceImpl.m151699l().mo96957c();
                HashMap hashMap = new HashMap();
                hashMap.put("plugin_version", e.mo96863a());
                c.mo96864a("miniapp_launch_crash", new JSONObject(hashMap));
                this.f135543c = false;
            }
        } catch (Throwable unused) {
        }
        IMiniAppService b = mo96990b();
        if (b == null) {
            return this;
        }
        return b;
    }

    /* renamed from: b */
    public final synchronized IMiniAppService mo96990b() {
        MethodCollector.m26663i(12044);
        if (Build.VERSION.SDK_INT < 21) {
            MethodCollector.m26664o(12044);
            return null;
        }
        IMiniAppService iMiniAppService = this.f135542b;
        if (iMiniAppService != null) {
            MethodCollector.m26664o(12044);
            return iMiniAppService;
        }
        try {
            try {
                this.f135542b = (IMiniAppService) Class.forName("com.ss.android.ugc.aweme.miniapp.MiniAppService").getMethod("inst", new Class[0]).invoke(null, new Object[0]);
            } catch (IllegalAccessException e) {
                C51423a.m95788a("", e);
            } catch (NoSuchMethodException e2) {
                C51423a.m95788a("", e2);
            } catch (InvocationTargetException e3) {
                C51423a.m95788a("", e3);
            }
        } catch (Throwable unused) {
        }
        IMiniAppService iMiniAppService2 = this.f135542b;
        MethodCollector.m26664o(12044);
        return iMiniAppService2;
    }

    /* synthetic */ C59320c(byte b) {
        this();
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void notifyLocaleChange(Locale locale) {
        this.f135544d = locale;
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public boolean openMiniApp(final Context context, final String str, final C59315a aVar) {
        return C59306c.m109002a(C59308d.m109009d(str), new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c.RunnableC593211 */

            static {
                Covode.recordClassIndex(69702);
            }

            public final void run() {
                if (C59320c.this.mo96990b() != null) {
                    C59320c.this.mo96989a().openMiniApp(context, str, aVar);
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public boolean openMiniApp(final Context context, final C59314b bVar, final C59315a aVar) {
        return C59306c.m109002a(C59308d.m109009d(C59308d.m109005a(bVar)), new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c.RunnableC593222 */

            static {
                Covode.recordClassIndex(69703);
            }

            public final void run() {
                if (C59320c.this.mo96990b() != null && !(C59320c.this.mo96989a() instanceof C59320c)) {
                    C59320c.this.mo96989a().openMiniApp(context, bVar, aVar);
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void jumpToMiniApp(final Context context, final String str, final String str2, final boolean z, final String str3, final String str4) {
        C59306c.m109002a(z, new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c.RunnableC593233 */

            static {
                Covode.recordClassIndex(69704);
            }

            public final void run() {
                if (C59320c.this.mo96990b() != null && !(C59320c.this.mo96989a() instanceof C59320c)) {
                    C59320c.this.mo96989a().jumpToMiniApp(context, str, str2, z, str3, str4);
                }
            }
        });
    }
}
