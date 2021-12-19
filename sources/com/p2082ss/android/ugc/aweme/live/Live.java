package com.p2082ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import com.C1764a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3867b;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.design.C4052a;
import com.bytedance.android.live.network.model.C5819a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.init.I18nInitTask;
import com.bytedance.android.livesdk.init.InternalServiceInitTask;
import com.bytedance.android.livesdk.init.MonitorInitTask;
import com.bytedance.android.livesdk.init.PipoInitTask;
import com.bytedance.android.livesdk.init.SDKServiceInitTask;
import com.bytedance.android.livesdk.init.TTLynxInitTask;
import com.bytedance.android.livesdk.init.TaskManagerInitTask;
import com.bytedance.android.livesdk.livesetting.C9321a;
import com.bytedance.android.livesdk.livesetting.C9324c;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveEnablePopupQueueSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveOptimizeThreadUsageSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveReplaceObjUnicodeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveUseEmojiCompatSetting;
import com.bytedance.android.livesdk.p425aa.p429d.C6543e;
import com.bytedance.android.livesdk.p446aj.C6762c;
import com.bytedance.android.livesdk.p667x.AbstractC11587a;
import com.bytedance.android.livesdk.p667x.C11588b;
import com.bytedance.android.livesdkapi.C11755f;
import com.bytedance.android.livesdkapi.C11776h;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.android.p145b.p146a.AbstractC2702b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.p1469l.C20688a;
import com.bytedance.p1469l.p1470a.p1471a.AbstractC20691a;
import com.bytedance.p1469l.p1470a.p1471a.AbstractC20692b;
import com.bytedance.p1469l.p1470a.p1471a.AbstractC20693c;
import com.bytedance.p1469l.p1470a.p1471a.AbstractC20694d;
import com.bytedance.p1469l.p1470a.p1471a.AbstractC20695e;
import com.bytedance.p1469l.p1470a.p1471a.AbstractC20696f;
import com.bytedance.p1469l.p1470a.p1471a.AbstractC20697g;
import com.bytedance.p1469l.p1470a.p1472b.AbstractC20698a;
import com.bytedance.p1469l.p1470a.p1472b.AbstractC20699b;
import com.bytedance.p1469l.p1473b.C20700a;
import com.bytedance.p1469l.p1473b.p1474a.C20703a;
import com.bytedance.p1469l.p1473b.p1474a.C20704b;
import com.bytedance.p1469l.p1473b.p1474a.C20705c;
import com.bytedance.p1469l.p1473b.p1474a.C20706d;
import com.bytedance.p1469l.p1473b.p1474a.C20707e;
import com.bytedance.p1469l.p1473b.p1474a.C20708f;
import com.bytedance.p1469l.p1473b.p1474a.C20709g;
import com.bytedance.p1469l.p1473b.p1475b.C20710a;
import com.bytedance.p1469l.p1473b.p1475b.C20711b;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.account.util.C33028a;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49498ad;
import com.p2082ss.android.ugc.aweme.feed.p2945f.C49540a;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.live.livehostimpl.C58655ad;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.LiveParams;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.ReshootConfig;
import com.p2082ss.android.ugc.aweme.story.C76657c;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.permission.C80620e;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.live.Live */
public class Live {
    private static volatile boolean sInitedLiveSDK;
    private static volatile boolean sInitedLiveSPI;

    static {
        Covode.recordClassIndex(68752);
    }

    static final /* synthetic */ void lambda$refreshLoginState$1$Live(Object obj) {
    }

    static final /* synthetic */ void lambda$refreshLoginState$2$Live(Throwable th) {
    }

    public static boolean openLiveRecord() {
        return openLiveRecordBySchema("");
    }

    public static String getLiveDomain() {
        if (C58071d.m104909c()) {
            return "webcast.tiktokv.com";
        }
        return "webcast-va.tiktokv.com";
    }

    public static boolean invalid() {
        if (getServiceInternal() == null) {
            return true;
        }
        return false;
    }

    private static boolean enableLaunchParasiticModules() {
        if (getService() != null) {
            return ((Boolean) getService().mo12981a("live_enable_launch_parasitic_modules", (Object) true)).booleanValue();
        }
        return true;
    }

    public static void initSPI() {
        MethodCollector.m26663i(3442);
        if (!sInitedLiveSPI) {
            synchronized (Live.class) {
                try {
                    if (!sInitedLiveSPI) {
                        initService();
                        C11755f.m20715a(new C58655ad());
                        sInitedLiveSPI = true;
                    }
                } finally {
                    MethodCollector.m26664o(3442);
                }
            }
            return;
        }
        MethodCollector.m26664o(3442);
    }

    private static void launchParasiticModules() {
        try {
            for (ILiveParasiticModuleLaunchService iLiveParasiticModuleLaunchService : ServiceManager.get().getServices(ILiveParasiticModuleLaunchService.class)) {
                iLiveParasiticModuleLaunchService.mo66420a();
            }
        } catch (Throwable th) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_msg", th.getMessage());
            C3868c.m9491a("ttlive_live_launch_parasitic_modules", 1, hashMap);
        }
    }

    public static void refreshLoginState() {
        AbstractC88398aa c;
        AbstractC88979t a = AbstractC88979t.m154294a(C58729r.f133658a);
        if (LiveOptimizeThreadUsageSetting.INSTANCE.getValue()) {
            c = C88946a.m154209a(C40780g.m82241a());
        } else {
            c = C88925a.m154182c(C88946a.f201993e);
        }
        a.mo143278b(c).mo143254a(C58731s.f133662a, C58783t.f133790a);
    }

    public static void switchLocale() {
        AbstractC11846d service;
        Locale a;
        Context a2 = C17867d.m33078a();
        if (a2 != null && (service = getService()) != null && (a = C53438a.m98619a((String) null, (String) null, a2)) != null && !TextUtils.isEmpty(a.getLanguage())) {
            service.mo13002a(a);
        }
    }

    public static AbstractC11846d getService() {
        if (!C29843f.m60129a(C17867d.m33078a())) {
            C3854a.m9453a(6, "Live", "cannot use LiveService in non-main process");
            HashMap hashMap = new HashMap(2);
            hashMap.put("error_msg", Log.getStackTraceString(new Throwable("")));
            C20700a.C20701a.f48888a.mo34111a("ttlive_init_non_main_process_error", 1, hashMap);
            return null;
        }
        AbstractC11846d serviceInternal = getServiceInternal();
        if (serviceInternal == null) {
            C3854a.m9453a(6, "Live", "Live getService is null");
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("error_msg", Log.getStackTraceString(new Throwable("")));
            C20700a.C20701a.f48888a.mo34111a("ttlive_live_get_service_null_error", 1, hashMap2);
        }
        return serviceInternal;
    }

    private static void initService() {
        C20688a.m13436a(AbstractC58634g.class, new C58497ag());
        C20688a.m13436a(AbstractC20699b.class, new C20711b());
        C20688a.m13436a(AbstractC20698a.class, new C20710a());
        C20688a.m13436a(AbstractC20697g.class, new C20709g());
        C20688a.m13436a(AbstractC20696f.class, new C20708f());
        C20688a.m13436a(AbstractC20695e.class, new C20707e());
        C20688a.m13436a(AbstractC20694d.class, new C20706d());
        C20688a.m13436a(AbstractC20693c.class, new C20705c());
        C20688a.m13436a(AbstractC20692b.class, new C20704b());
        C20688a.m13436a(AbstractC20691a.class, new C20703a());
    }

    /* access modifiers changed from: private */
    public static void syncShareCookieToTarget() {
        String cookie;
        try {
            String a = C1764a.m5928a("https://%s/", new Object[]{getLiveDomain()});
            if (!C33028a.m67665a() || a.toLowerCase(Locale.ROOT).startsWith("https")) {
                String cookie2 = CookieManager.getInstance().getCookie(NetworkUtils.getShareCookieHost());
                CookieManager.getInstance().setAcceptCookie(true);
                if (!TextUtils.isEmpty(cookie2)) {
                    for (String str : cookie2.split("; ")) {
                        CookieManager.getInstance().setCookie(a, str);
                        if (C29843f.m60129a(C17879g.m33104a()) && C49498ad.m92737a() && (cookie = CookieManager.getInstance().getCookie(C49540a.m92781a())) != null && !TextUtils.equals(cookie, C49540a.m92784b())) {
                            C49540a.m92783a(C49540a.m92781a(), cookie);
                        }
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cookie url must be https");
        } catch (Exception unused) {
        }
    }

    private static AbstractC11846d getServiceInternal() {
        MethodCollector.m26663i(3419);
        if (!sInitedLiveSDK) {
            synchronized (Live.class) {
                try {
                    if (sInitedLiveSDK) {
                        return C11755f.m20713a();
                    }
                    C3867b.m9480a("init_live_all_duration");
                    C3867b.m9480a("init_live_host_service");
                    initSPI();
                    C58655ad adVar = new C58655ad();
                    C3867b.m9483b("init_live_host_service");
                    C3867b.m9480a("init_live_service");
                    C3867b.m9480a("init_live_sdk_service");
                    if (!C11755f.f28118a) {
                        synchronized (C11755f.class) {
                            try {
                                if (!C11755f.f28118a) {
                                    C11755f.m20715a(adVar);
                                    C3867b.m9480a("init_live_setting_init");
                                    SettingsManager.INSTANCE.init(((IHostContext) C6193a.m13435a(IHostContext.class)).isLocalTest(), new C9324c(), new C9321a());
                                    C3867b.m9483b("init_live_setting_init");
                                    C11755f.m20716a("com.bytedance.android.live.base.model.proto.ProtocolBuffersCollector", "init");
                                    C11588b.C11589a.f27740a.mo18392a(1, new I18nInitTask());
                                    C11588b.C11589a.f27740a.mo18392a(2, new InternalServiceInitTask());
                                    C11588b.C11589a.f27740a.mo18392a(3, new MonitorInitTask());
                                    C11588b.C11589a.f27740a.mo18392a(9, new PipoInitTask());
                                    C11588b.C11589a.f27740a.mo18392a(8, new TTLynxInitTask());
                                    C11588b.C11589a.f27740a.mo18392a(4, new TaskManagerInitTask());
                                    C11588b.C11589a.f27740a.mo18392a(0, new SDKServiceInitTask());
                                    C5819a.f14675a = C11776h.f28130a;
                                    C6762c.f16799a = LiveEnablePopupQueueSettings.INSTANCE.getValue();
                                    C3867b.m9483b("init_live_sdk_service");
                                    C3867b.m9480a("init_live_feed_service");
                                    ((AbstractC2702b) C6193a.m13435a(AbstractC2702b.class)).init();
                                    C3867b.m9483b("init_live_feed_service");
                                    C3867b.m9483b("init_live_service");
                                    C3867b.m9480a("init_live_launch_task");
                                    C11588b bVar = C11588b.C11589a.f27740a;
                                    if (bVar.f27737e == null) {
                                        int size = bVar.f27734b.size();
                                        int[] iArr = new int[2];
                                        iArr[1] = bVar.f27734b.size();
                                        iArr[0] = size;
                                        bVar.f27736d = (int[][]) Array.newInstance(int.class, iArr);
                                        int[] iArr2 = new int[bVar.f27734b.size()];
                                        for (Map.Entry<Integer, Integer> entry : bVar.f27734b.entrySet()) {
                                            List<Integer> preTasks = bVar.f27733a.get(entry.getKey()).getPreTasks();
                                            if (preTasks != null) {
                                                for (Integer num : preTasks) {
                                                    if (num != entry.getKey()) {
                                                        bVar.f27736d[bVar.f27734b.get(num).intValue()][bVar.f27734b.get(entry.getKey()).intValue()] = 1;
                                                    }
                                                }
                                            }
                                        }
                                        Stack stack = new Stack();
                                        int size2 = bVar.f27734b.size();
                                        for (int i = 0; i < size2; i++) {
                                            iArr2[i] = 0;
                                        }
                                        for (int i2 = 0; i2 < size2; i2++) {
                                            if (iArr2[i2] == 0 && !bVar.mo18393a(i2, iArr2, stack)) {
                                                RuntimeException runtimeException = new RuntimeException(bVar.f27733a.get(Integer.valueOf(i2)).getClass().getCanonicalName() + " is circular dependence, please review task dependence");
                                                MethodCollector.m26664o(3419);
                                                throw runtimeException;
                                            }
                                        }
                                        int i3 = -1;
                                        AbstractC11587a aVar = null;
                                        while (!stack.empty()) {
                                            int intValue = bVar.f27735c.get(stack.pop()).intValue();
                                            if (bVar.f27733a.containsKey(Integer.valueOf(i3))) {
                                                bVar.f27733a.get(Integer.valueOf(i3)).mNextTask = bVar.f27733a.get(Integer.valueOf(intValue));
                                            } else {
                                                aVar = bVar.f27733a.get(Integer.valueOf(intValue));
                                            }
                                            i3 = intValue;
                                        }
                                        bVar.f27737e = aVar;
                                    }
                                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                        bVar.mo18391a();
                                    } else if (bVar.f27738f == null) {
                                        bVar.mo18394b();
                                    }
                                    C6543e.m13986a();
                                    C3867b.m9480a("init_live_feed_init");
                                    ((AbstractC2702b) C6193a.m13435a(AbstractC2702b.class)).delayInit();
                                    C3867b.m9483b("init_live_feed_init");
                                    C3867b.m9483b("init_live_launch_task");
                                    C4052a.C4053a.f11190a.f11187a = LiveUseEmojiCompatSetting.INSTANCE.getValue();
                                    C4052a.C4053a.f11190a.f11188b = LiveReplaceObjUnicodeSetting.INSTANCE.getValue();
                                    C11755f.f28118a = true;
                                }
                            } catch (Throwable th) {
                                MethodCollector.m26664o(3419);
                                throw th;
                            }
                        }
                    }
                    C3867b.m9480a("init_live_refresh_login_state");
                    refreshLoginState();
                    C3867b.m9483b("init_live_refresh_login_state");
                    C3867b.m9483b("init_live_all_duration");
                    HashMap hashMap = new HashMap(C3867b.f10690a);
                    C3867b.f10690a.clear();
                    JSONObject jSONObject = new JSONObject();
                    for (String str : C3867b.f10691b) {
                        String a = C3867b.m9479a(str, true);
                        String a2 = C3867b.m9479a(str, false);
                        long a3 = C3867b.m9478a(hashMap, a);
                        long a4 = C3867b.m9478a(hashMap, a2);
                        if (!(a3 == 0 || a4 == 0)) {
                            C3867b.m9482a(jSONObject, str, Long.valueOf(a4 - a3));
                        }
                    }
                    C3867b.m9482a(jSONObject, "device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
                    C3868c.m9497b("ttlive_live_init_time_all", 0, jSONObject);
                    sInitedLiveSDK = true;
                    if (enableLaunchParasiticModules()) {
                        launchParasiticModules();
                    }
                } finally {
                    MethodCollector.m26664o(3419);
                }
            }
        }
        AbstractC11846d a5 = C11755f.m20713a();
        MethodCollector.m26664o(3419);
        return a5;
    }

    private static boolean isPrivateAccount(User user) {
        if (user == null || !user.isSecret()) {
            return false;
        }
        return true;
    }

    private static boolean hasFollowed(User user) {
        if (user == null) {
            return false;
        }
        if (user.getFollowStatus() == 1 || user.getFollowStatus() == 2) {
            return true;
        }
        return false;
    }

    public static boolean showLive(User user) {
        if (user == null || !user.isLive() || !C76657c.m134240a()) {
            return false;
        }
        if (isPrivateAccount(user)) {
            return hasFollowed(user);
        }
        return true;
    }

    public static boolean openLiveRecordBySchema(final String str) {
        final Activity j = C17873f.m33102j();
        if (j == null) {
            return false;
        }
        if (C80580in.m139687c()) {
            C33830n.m69192a("ttlive_minor_mode_live", "", (JSONObject) null);
        }
        if (C80620e.m139778a(j) == 0 && C80620e.m139780b(j) == 0 && C80620e.m139781c(j) == 0) {
            jumpToLive(j, str);
            return true;
        }
        C35444b.m72473a(j, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new C35444b.AbstractC35447b() {
            /* class com.p2082ss.android.ugc.aweme.live.Live.C584701 */

            static {
                Covode.recordClassIndex(68753);
            }

            @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
            /* renamed from: a */
            public final void mo53515a(String[] strArr, int[] iArr) {
                for (int i : iArr) {
                    if (i != 0) {
                        return;
                    }
                }
                Live.jumpToLive(j, str);
            }
        });
        return true;
    }

    public static void jumpToLive(final Activity activity, String str) {
        final RecordConfig.Builder reshootConfig = new RecordConfig.Builder().shootWay("direct_shoot").translationType(3).defaultTab(2).enterFrom(Uri.parse(str).getQueryParameter("enter_from")).liveParams(new LiveParams(Uri.parse(str).getQueryParameter("source_params"), false)).reshootConfig(new ReshootConfig(true, true));
        AVExternalServiceImpl.m113114a().asyncService("Live", new SimpleServiceLoadCallback() {
            /* class com.p2082ss.android.ugc.aweme.live.Live.C584712 */

            static {
                Covode.recordClassIndex(68754);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                asyncAVService.uiService().recordService().startRecord(activity, reshootConfig.build());
            }
        });
    }
}
