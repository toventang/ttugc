package com.p2082ss.android.ugc.aweme.bullet.reactpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16455a;
import com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16456b;
import com.bytedance.ies.bullet.kit.p1156rn.core.BulletMethod;
import com.bytedance.ies.bullet.kit.p1156rn.p1158b.C16453a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.client.C22027b;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.sdk.webview.AbstractC30269m;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.bullet.BulletHostProxy;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.net.CommonApi;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.share.ShareH5Service;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80398en;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule */
public final class RNCommonModule implements AbstractC16456b {
    public static final C35286a Companion = new C35286a((byte) 0);
    private final CommonApi sApi = ((CommonApi) RetrofitFactory.m33635a().mo28816a(Api.f79771d).mo28858a(CommonApi.class));

    static {
        Covode.recordClassIndex(42451);
    }

    /* renamed from: com_ss_android_ugc_aweme_bullet_reactpackage_RNCommonModule_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m72226x17bcebba(String str, String str2, Throwable th) {
        return 0;
    }

    @Override // com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16456b
    public final String getName() {
        return "brn";
    }

    @Override // com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16456b
    public final boolean hasConstants() {
        return false;
    }

    @Override // com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16456b
    public final void initialize() {
    }

    @Override // com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16456b
    public final void onCatalystInstanceDestroy() {
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$a */
    public static final class C35286a {
        static {
            Covode.recordClassIndex(42452);
        }

        private C35286a() {
        }

        public /* synthetic */ C35286a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$d */
    static final class CallableC35289d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ RNCommonModule f83301a;

        /* renamed from: b */
        final /* synthetic */ String f83302b;

        /* renamed from: c */
        final /* synthetic */ Map f83303c;

        /* renamed from: d */
        final /* synthetic */ HashMap f83304d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89238e f83305e;

        /* renamed from: f */
        final /* synthetic */ List f83306f;

        static {
            Covode.recordClassIndex(42455);
        }

        CallableC35289d(RNCommonModule rNCommonModule, String str, Map map, HashMap hashMap, C89233z.C89238e eVar, List list) {
            this.f83301a = rNCommonModule;
            this.f83302b = str;
            this.f83303c = map;
            this.f83304d = hashMap;
            this.f83305e = eVar;
            this.f83306f = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f83301a.callInBackground(this.f83302b, this.f83303c, this.f83304d, this.f83305e.element, this.f83306f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$g */
    static final class RunnableC35292g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f83312a;

        static {
            Covode.recordClassIndex(42458);
        }

        RunnableC35292g(String str) {
            this.f83312a = str;
        }

        public final void run() {
            if (this.f83312a != null) {
                new C79459a(C17873f.m33102j()).mo123052a(this.f83312a).mo123053a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$b */
    static final class RunnableC35287b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f83295a;

        /* renamed from: b */
        final /* synthetic */ AbstractC16455a f83296b;

        static {
            Covode.recordClassIndex(42453);
        }

        RunnableC35287b(String str, AbstractC16455a aVar) {
            this.f83295a = str;
            this.f83296b = aVar;
        }

        public final void run() {
            Activity a = C34963b.m71411a().mo61848a(this.f83295a);
            if (a == null) {
                AbstractC16455a aVar = this.f83296b;
                if (aVar != null) {
                    aVar.mo26098a("illegal state to finish page.", null);
                    return;
                }
                return;
            }
            a.finish();
            AbstractC16455a aVar2 = this.f83296b;
            if (aVar2 != null) {
                aVar2.mo26098a(null, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$f */
    static final class RunnableC35291f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RNCommonModule f83309a;

        /* renamed from: b */
        final /* synthetic */ Map f83310b;

        /* renamed from: c */
        final /* synthetic */ AbstractC16455a f83311c;

        static {
            Covode.recordClassIndex(42457);
        }

        RunnableC35291f(RNCommonModule rNCommonModule, Map map, AbstractC16455a aVar) {
            this.f83309a = rNCommonModule;
            this.f83310b = map;
            this.f83311c = aVar;
        }

        public final void run() {
            boolean z;
            int i;
            try {
                z = ShareH5Service.C68827a.m121397a().mo109382a(new WeakReference<>(C17873f.m33102j()), new JSONObject(this.f83310b));
            } catch (Exception e) {
                e.printStackTrace();
                z = false;
            }
            RNCommonModule rNCommonModule = this.f83309a;
            AbstractC16455a aVar = this.f83311c;
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            RNCommonModule.reportCallback$default(rNCommonModule, aVar, Integer.valueOf(i), null, null, 12, null);
        }
    }

    @Override // com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16456b
    public final Map<String, Object> getConstants() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appName", C17867d.m33081b());
        linkedHashMap.put("appVersion", C17867d.m33085f());
        String locale = C80398en.m139370a().toString();
        C89219l.m154716b(locale, "");
        linkedHashMap.put("language", locale);
        linkedHashMap.put("app_language", SettingServiceImpl.m120782v().mo108872h());
        String g = C58071d.m104913g();
        C89219l.m154716b(g, "");
        linkedHashMap.put("region", g);
        linkedHashMap.put("channel", C17867d.f42595s);
        linkedHashMap.put("isFullScreen", Boolean.valueOf(C33403c.C33406b.f79409a.f79388q));
        AbstractC30269m a = BulletHostProxy.m71370b().mo61834a();
        if (a != null) {
            String a2 = a.mo53730a();
            C89219l.m154716b(a2, "");
            linkedHashMap.put("assetSource", a2);
        }
        return linkedHashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$c */
    static final class RunnableC35288c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RNCommonModule f83297a;

        /* renamed from: b */
        final /* synthetic */ String f83298b;

        /* renamed from: c */
        final /* synthetic */ String f83299c;

        /* renamed from: d */
        final /* synthetic */ AbstractC16455a f83300d;

        static {
            Covode.recordClassIndex(42454);
        }

        RunnableC35288c(RNCommonModule rNCommonModule, String str, String str2, AbstractC16455a aVar) {
            this.f83297a = rNCommonModule;
            this.f83298b = str;
            this.f83299c = str2;
            this.f83300d = aVar;
        }

        public final void run() {
            boolean z;
            Activity a = C34963b.m71411a().mo61848a(this.f83298b);
            String str = this.f83299c;
            int i = 1;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || a == null) {
                RNCommonModule.reportCallback$default(this.f83297a, this.f83300d, -1, "schema is not legal", null, 8, null);
            } else if (C89361p.m154874b(this.f83299c, "aweme://live/", false)) {
                Uri parse = Uri.parse(this.f83299c);
                String queryParameter = parse.getQueryParameter("room_id");
                String queryParameter2 = parse.getQueryParameter("user_id");
                if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter2)) {
                    BulletHostProxy.m71370b().mo61837a(a, C89361p.m154869a(this.f83299c, "aweme", "sslocal", false));
                    RNCommonModule.reportCallback$default(this.f83297a, this.f83300d, 1, null, null, 12, null);
                    return;
                }
                RNCommonModule.reportCallback$default(this.f83297a, this.f83300d, -1, null, null, 12, null);
            } else {
                boolean a2 = C36125t.m73596a(C36125t.m73591a(), a, C35301c.m72249b(this.f83299c));
                RNCommonModule rNCommonModule = this.f83297a;
                AbstractC16455a aVar = this.f83300d;
                if (!a2) {
                    i = -1;
                }
                RNCommonModule.reportCallback$default(rNCommonModule, aVar, Integer.valueOf(i), null, null, 12, null);
            }
        }
    }

    private final Map<String, Object> getAppInfo() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appName", C17867d.m33081b());
        linkedHashMap.put("aid", Integer.valueOf(C17867d.f42590n));
        linkedHashMap.put("appVersion", C17867d.m33085f());
        linkedHashMap.put("versionCode", Integer.valueOf((int) C17867d.m33084e()));
        String com_ss_android_ugc_aweme_bullet_reactpackage_RNCommonModule_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkAccessType_1 = m72225xcb9adc9f(C17867d.m33078a());
        C89219l.m154716b(com_ss_android_ugc_aweme_bullet_reactpackage_RNCommonModule_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkAccessType_1, "");
        linkedHashMap.put("netType", com_ss_android_ugc_aweme_bullet_reactpackage_RNCommonModule_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkAccessType_1);
        String serverDeviceId = AppLog.getServerDeviceId();
        C89219l.m154716b(serverDeviceId, "");
        linkedHashMap.put("device_id", serverDeviceId);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        C89219l.m154716b(curUserId, "");
        linkedHashMap.put("user_id", curUserId);
        linkedHashMap.put("channel", C17867d.f42595s);
        C59320c cVar = C59320c.C59324a.f135560a;
        C89219l.m154716b(cVar, "");
        linkedHashMap.put("ironManSupported", Boolean.valueOf(cVar.mo96989a().checkMiniAppEnable(C17867d.m33078a())));
        return linkedHashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$e */
    static final class C35290e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ RNCommonModule f83307a;

        /* renamed from: b */
        final /* synthetic */ AbstractC16455a f83308b;

        static {
            Covode.recordClassIndex(42456);
        }

        C35290e(RNCommonModule rNCommonModule, AbstractC16455a aVar) {
            this.f83307a = rNCommonModule;
            this.f83308b = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            RNCommonModule rNCommonModule = this.f83307a;
            C89219l.m154716b(iVar, "");
            rNCommonModule.continueWith(iVar, this.f83308b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_bullet_reactpackage_RNCommonModule_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_getNetworkAccessType_1 */
    public static String m72225xcb9adc9f(Context context) {
        if (!TextUtils.isEmpty(C58029j.f132254f) && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132254f;
        }
        String networkAccessType = NetworkUtils.getNetworkAccessType(context);
        C58029j.f132254f = networkAccessType;
        return networkAccessType;
    }

    @BulletMethod
    public final void showToast(String str) {
        new Handler(Looper.getMainLooper()).post(new RunnableC35292g(str));
    }

    @BulletMethod
    public final void getAppInfo(AbstractC16455a aVar) {
        if (aVar != null) {
            try {
                aVar.mo26098a(null, getAppInfo());
            } catch (Exception e) {
                e.printStackTrace();
                aVar.mo26098a(e.getMessage(), null);
            }
        }
    }

    @BulletMethod
    public final void getUserInfo(AbstractC16455a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                User curUser = g2.getCurUser();
                jSONObject.put("login", true);
                C89219l.m154716b(curUser, "");
                jSONObject.put("openid", curUser.getUid());
                jSONObject.put("bindPhone", curUser.getBindPhone());
                if (aVar != null) {
                    aVar.mo26098a(null, jSONObject.toString());
                    return;
                }
                return;
            }
            jSONObject.put("login", false);
            if (aVar != null) {
                aVar.mo26098a(null, jSONObject.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (aVar != null) {
                aVar.mo26098a("service get error", null);
            }
        }
    }

    @BulletMethod
    public final void close(String str, AbstractC16455a aVar) {
        if (str != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC35287b(str, aVar));
        }
    }

    @BulletMethod
    public final void share(Map<String, ? extends Object> map, AbstractC16455a aVar) {
        if (map != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC35291f(this, map, aVar));
        }
    }

    @BulletMethod
    public final void logEventV3(String str, Map<String, ? extends Object> map) {
        if (str != null && map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
            if (C17873f.m33102j() != null) {
                try {
                    C39162r.m79460a(str, linkedHashMap);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ee, code lost:
        if (r4.optInt("statusCode") != 0) goto L_0x00f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void continueWith(p077b.C1731i<androidx.core.p036g.C0692e<java.lang.String, com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34308b>> r12, com.bytedance.ies.bullet.kit.p1156rn.core.AbstractC16455a r13) {
        /*
        // Method dump skipped, instructions count: 253
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule.continueWith(b.i, com.bytedance.ies.bullet.kit.rn.core.a):void");
    }

    @BulletMethod
    public final void openSchema(String str, String str2, AbstractC16455a aVar) {
        if (str != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC35288c(this, str, str2, aVar));
        }
    }

    @BulletMethod
    public final void request(String str, Map<String, ? extends Object> map, AbstractC16455a aVar) {
        if (!(str == null || str.length() == 0 || map == null || map.get("method") == null)) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = null;
            Object obj = map.get("header");
            if (!(obj instanceof HashMap)) {
                obj = null;
            }
            HashMap hashMap2 = (HashMap) obj;
            if (hashMap2 != null) {
                for (Map.Entry entry : hashMap2.entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        T t = (T) C16453a.m30538a(value);
                        if (t.length() > 0 && t != null) {
                            arrayList.add(new C22027b((String) entry.getKey(), t));
                            if (C89361p.m154872a("content-type", (String) entry.getKey(), true)) {
                                eVar.element = t;
                            }
                        }
                    }
                }
            }
            Object obj2 = map.get("params");
            if (!(obj2 instanceof HashMap)) {
                obj2 = null;
            }
            HashMap hashMap3 = (HashMap) obj2;
            if (hashMap3 != null) {
                for (Map.Entry entry2 : hashMap3.entrySet()) {
                    Object value2 = entry2.getValue();
                    if (value2 != null) {
                        String a = C16453a.m30538a(value2);
                        if (a.length() > 0 && a != null) {
                            hashMap.put(entry2.getKey(), a);
                        }
                    }
                }
            }
            C1731i.m5640b(new CallableC35289d(this, str, map, hashMap, eVar, arrayList), C1731i.f5562a).mo5534a(new C35290e(this, aVar), C1731i.f5564c, null);
        }
    }

    private final C89391z reportCallback(AbstractC16455a aVar, Integer num, String str, Map<String, ? extends Object> map) {
        if (aVar == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", num);
        linkedHashMap.put("message", str);
        linkedHashMap.put("data", map);
        aVar.mo26098a(linkedHashMap);
        return C89391z.f203057a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.core.p036g.C0692e<java.lang.String, com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34308b> callInBackground(java.lang.String r13, java.util.Map<java.lang.String, ? extends java.lang.Object> r14, java.util.HashMap<java.lang.String, java.lang.Object> r15, java.lang.String r16, java.util.List<com.bytedance.retrofit2.client.C22027b> r17) {
        /*
        // Method dump skipped, instructions count: 472
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule.callInBackground(java.lang.String, java.util.Map, java.util.HashMap, java.lang.String, java.util.List):androidx.core.g.e");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ C89391z reportCallback$default(RNCommonModule rNCommonModule, AbstractC16455a aVar, Integer num, String str, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        return rNCommonModule.reportCallback(aVar, num, str, map);
    }
}
