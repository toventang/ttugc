package com.p2082ss.android.ugc.aweme.settingsrequest.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16075f;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.SaveConfigType;
import com.bytedance.ies.abmock.datacenter.C16065e;
import com.bytedance.ies.abmock.datacenter.p1117b.C16054a;
import com.bytedance.ies.abmock.datacenter.p1117b.C16055b;
import com.bytedance.ies.abmock.datacenter.p1118c.C16057a;
import com.bytedance.ies.abmock.datacenter.p1118c.C16061d;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34725k;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58260s;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.legoImp.task.C58452y;
import com.p2082ss.android.ugc.aweme.setting.api.SettingApi;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89387v;
import p4600h.C89388w;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.api.g */
public final class C68776g implements AbstractC58259r {

    /* renamed from: a */
    public final C88411a f153831a = new C88411a();

    static {
        Covode.recordClassIndex(81053);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58260s.m105199a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "request_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: b */
    public final EnumC58147aa mo58051b() {
        return EnumC58147aa.P0;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: com.ss.android.ugc.aweme.settingsrequest.api.g$b */
    static final class C68778b<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C68778b f153833a = new C68778b();

        static {
            Covode.recordClassIndex(81055);
        }

        C68778b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            C68775f fVar = (C68775f) obj;
            C89219l.m154721d(fVar, "");
            return fVar.f153830b instanceof C28022o;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.settingsrequest.api.g$c */
    static final class C68779c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C68779c f153834a = new C68779c();

        static {
            Covode.recordClassIndex(81056);
        }

        C68779c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C68775f fVar = (C68775f) obj;
            C89219l.m154721d(fVar, "");
            String str = fVar.f153829a;
            AbstractC28019l lVar = fVar.f153830b;
            Objects.requireNonNull(lVar, "null cannot be cast to non-null type com.google.gson.JsonObject");
            return new C68774e(str, (C28022o) lVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.settingsrequest.api.g$a */
    static final class C68777a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C68777a f153832a = new C68777a();

        static {
            Covode.recordClassIndex(81054);
        }

        C68777a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            T t;
            String str;
            ISettingsRequestService i;
            C22099u uVar = (C22099u) obj;
            C89219l.m154721d(uVar, "");
            List<C22027b> list = uVar.f52261a.f52042d;
            C89219l.m154716b(list, "");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                T t2 = t;
                C89219l.m154716b(t2, "");
                String str2 = t2.f52037a;
                C89219l.m154716b(str2, "");
                Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                C89219l.m154716b(lowerCase, "");
                if (C89219l.m154714a((Object) lowerCase, (Object) "x-tt-logid")) {
                    break;
                }
            }
            T t3 = t;
            if (!(t3 == null || (str = t3.f52038b) == null || (i = SettingsRequestServiceImpl.m65417i()) == null)) {
                i.mo57282a(C89041ag.m154427b(C89387v.m154943a("commonLogId", str)));
            }
            C22028c cVar = uVar.f52261a;
            C89219l.m154716b(cVar, "");
            String str3 = cVar.f52039a;
            C89219l.m154716b(str3, "");
            T t4 = uVar.f52262b;
            C89219l.m154716b(t4, "");
            return new C68775f(str3, t4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.settingsrequest.api.g$e */
    static final class C68781e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C68781e f153836a = new C68781e();

        static {
            Covode.recordClassIndex(81058);
        }

        C68781e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C51423a.m95787a("FetchABTestCommonRequest failed, is_combine = false, throwable = ".concat(String.valueOf(th)));
            C39162r.m79460a("libra_api_status", new C33744d().mo59983a("status", "0").mo59983a("error", String.valueOf(th.getMessage())).mo59980a("count", 0).f79943a);
            C39162r.m79460a("config_fetch_success", new C33744d().mo59983a("status", "0").mo59983a("source", "1").f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.settingsrequest.api.g$d */
    static final class C68780d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C68780d f153835a = new C68780d();

        static {
            Covode.recordClassIndex(81057);
        }

        C68780d() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.util.List */
        /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: java.util.List */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String oVar;
            C28025r d;
            C28025r d2;
            AbstractC28019l c;
            AbstractC28019l c2;
            AbstractC28019l c3;
            AbstractC28019l c4;
            AbstractC28019l c5;
            C68774e eVar = (C68774e) obj;
            C28022o oVar2 = eVar.f153828b;
            String str = eVar.f153827a;
            C28022o f = oVar2.mo46807f("data");
            int i = 0;
            String str2 = "";
            if (f != null) {
                C89219l.m154719c(f, str2);
                C16054a.f38673c.clear();
                if (C16054a.f38672b.isEmpty()) {
                    C16054a.f38672b.add("uid_precise_exp_comment");
                    C16054a.f38672b.add("uid_precise_exp_share");
                    C16054a.f38672b.add("verify_proaccount_precise_exp");
                }
                Iterator<Map.Entry<String, ConfigItem>> it = C16075f.f38716b.entrySet().iterator();
                while (true) {
                    boolean z = true;
                    int i2 = 1;
                    if (it.hasNext()) {
                        Map.Entry<String, ConfigItem> next = it.next();
                        String key = next.getKey();
                        SaveConfigType.ConfigType configType = next.getValue().type;
                        if (configType != null) {
                            switch (C16055b.f38675a[configType.ordinal()]) {
                                case 1:
                                    C89219l.m154709a((Object) key, str2);
                                    try {
                                        C16054a.m29671a(f, key);
                                        C28022o f2 = f.mo46807f(key);
                                        if (f2 == null || (d = f2.mo46804d("val")) == null) {
                                            C16057a.f38676a.mo25462c(key);
                                        } else if (d.f65806a instanceof Number) {
                                            C16057a aVar = C16057a.f38676a;
                                            if (d.mo46694g() == 0) {
                                                z = false;
                                            }
                                            aVar.mo25460b(key, z);
                                            continue;
                                        } else {
                                            C16057a.f38676a.mo25460b(key, d.mo46695h());
                                        }
                                    } catch (Throwable th) {
                                        C13468b.m24209a("PreciseExposureManager " + th + "  , key: " + key);
                                    }
                                    break;
                                case 2:
                                    C89219l.m154709a((Object) key, str2);
                                    try {
                                        C16054a.m29671a(f, key);
                                        C28022o f3 = f.mo46807f(key);
                                        if (f3 == null || (d2 = f3.mo46804d("val")) == null) {
                                            C16057a.f38676a.mo25462c(key);
                                        } else if (d2.f65806a instanceof Boolean) {
                                            C16057a aVar2 = C16057a.f38676a;
                                            if (!d2.mo46695h()) {
                                                i2 = 0;
                                            }
                                            aVar2.mo25457b(key, i2);
                                            continue;
                                        } else {
                                            C16057a.f38676a.mo25457b(key, d2.mo46694g());
                                        }
                                    } catch (Throwable th2) {
                                        C13468b.m24209a("PreciseExposureManager " + th2 + "  , key: " + key);
                                    }
                                    break;
                                case 3:
                                    C89219l.m154709a((Object) key, str2);
                                    try {
                                        C16054a.m29671a(f, key);
                                        C28022o f4 = f.mo46807f(key);
                                        if (f4 == null || (c = f4.mo46803c("val")) == null) {
                                            C16057a.f38676a.mo25462c(key);
                                        } else {
                                            C16057a.f38676a.mo25458b(key, c.mo46693f());
                                            continue;
                                        }
                                    } catch (Throwable th3) {
                                        C13468b.m24209a("PreciseExposureManager " + th3 + "  , key: " + key);
                                    }
                                    break;
                                case 4:
                                    C89219l.m154709a((Object) key, str2);
                                    try {
                                        C16054a.m29671a(f, key);
                                        C28022o f5 = f.mo46807f(key);
                                        if (f5 == null || (c2 = f5.mo46803c("val")) == null) {
                                            C16057a.f38676a.mo25462c(key);
                                        } else {
                                            C16057a.f38676a.mo25455b(key, c2.mo46690d());
                                            continue;
                                        }
                                    } catch (Throwable th4) {
                                        C13468b.m24209a("PreciseExposureManager " + th4 + "  , key: " + key);
                                    }
                                    break;
                                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                                    C89219l.m154709a((Object) key, str2);
                                    try {
                                        C16054a.m29671a(f, key);
                                        C28022o f6 = f.mo46807f(key);
                                        if (f6 == null || (c3 = f6.mo46803c("val")) == null) {
                                            C16057a.f38676a.mo25462c(key);
                                        } else {
                                            C16057a.f38676a.mo25456b(key, c3.mo46691e());
                                            continue;
                                        }
                                    } catch (Throwable th5) {
                                        C13468b.m24209a("PreciseExposureManager " + th5 + "  , key: " + key);
                                    }
                                    break;
                                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                    C89219l.m154709a((Object) key, str2);
                                    try {
                                        C16054a.m29671a(f, key);
                                        C28022o f7 = f.mo46807f(key);
                                        if (f7 != null && (c4 = f7.mo46803c("val")) != null) {
                                            C16057a.f38676a.mo25459b(key, c4.mo46689c());
                                            continue;
                                        } else if (f.mo46802b(key)) {
                                            C16057a.f38676a.mo25459b(key, (String) null);
                                        } else {
                                            C16057a.f38676a.mo25462c(key);
                                        }
                                    } catch (Throwable th6) {
                                        C13468b.m24209a("PreciseExposureManager " + th6 + "  , key: " + key);
                                    }
                                    break;
                                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                                    C89219l.m154709a((Object) key, str2);
                                    try {
                                        C16054a.m29671a(f, key);
                                        C28022o f8 = f.mo46807f(key);
                                        if (f8 != null && (c5 = f8.mo46803c("val")) != null) {
                                            C16057a aVar3 = C16057a.f38676a;
                                            C89219l.m154709a((Object) aVar3, str2);
                                            C16057a.f38676a.mo25452a(key, (String[]) aVar3.mo25449a().mo46667a(c5, (Class) String[].class));
                                            continue;
                                        } else if (f.mo46802b(key)) {
                                            C16057a.f38676a.mo25452a(key, (String[]) null);
                                        } else {
                                            C16057a.f38676a.mo25462c(key);
                                        }
                                    } catch (Throwable th7) {
                                        C13468b.m24209a("PreciseExposureManager " + th7 + "  , key: " + key);
                                    }
                                    break;
                                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                                    C89219l.m154709a((Object) key, str2);
                                    C16054a.m29673b(f, key);
                                    continue;
                            }
                        }
                        C89219l.m154709a((Object) key, str2);
                        C16054a.m29673b(f, key);
                    } else {
                        String[] stringArray = C16054a.f38671a.getStringArray("__exposed_vids", new String[0]);
                        C89219l.m154709a((Object) stringArray, str2);
                        List j = C89064i.m154509j(stringArray);
                        Iterator it2 = j.iterator();
                        boolean z2 = false;
                        while (it2.hasNext()) {
                            if (!C16054a.f38673c.containsKey(it2.next())) {
                                it2.remove();
                                z2 = true;
                            }
                        }
                        String a = C16054a.m29670a();
                        String[] stringArray2 = C16054a.f38671a.getStringArray("{__exposed_vids_for_current_user}_{" + a + '}', new String[0]);
                        C89219l.m154709a((Object) stringArray2, str2);
                        List j2 = C89064i.m154509j(stringArray2);
                        Iterator it3 = j2.iterator();
                        while (it3.hasNext()) {
                            if (!C16054a.f38673c.containsKey(it3.next())) {
                                it3.remove();
                                z2 = true;
                            }
                        }
                        if (z2) {
                            Keva keva = C16054a.f38671a;
                            Object[] array = j.toArray(new String[0]);
                            if (array != null) {
                                keva.storeStringArray("__exposed_vids", (String[]) array);
                                Keva keva2 = C16054a.f38671a;
                                String str3 = "{__exposed_vids_for_current_user}_{" + a + '}';
                                Object[] array2 = j2.toArray(new String[0]);
                                if (array2 != null) {
                                    keva2.storeStringArray(str3, (String[]) array2);
                                    C16054a.m29672b();
                                } else {
                                    throw new C89388w("null cannot be cast to non-null type");
                                }
                            } else {
                                throw new C89388w("null cannot be cast to non-null type");
                            }
                        }
                        C16054a.m29672b();
                        C16061d.m29739a(f);
                        C16065e.m29769a().mo25495b();
                        SettingsRequestServiceImpl.m65417i().mo57281a(str);
                    }
                }
            }
            C33744d a2 = new C33744d().mo59983a("status", "1");
            if (!(f == null || (oVar = f.toString()) == null)) {
                str2 = oVar;
            }
            C33744d a3 = a2.mo59983a("result", str2);
            if (f != null) {
                i = f.f65804a.size();
            }
            C39162r.m79460a("libra_api_status", a3.mo59980a("count", i).f79943a);
            C39162r.m79460a("config_fetch_success", new C33744d().mo59983a("status", "1").mo59983a("source", "1").f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: a */
    public final void mo58050a(Context context, boolean z) {
        C89219l.m154721d(context, "");
        String serverDeviceId = AppLog.getServerDeviceId();
        int a = C34725k.m70937a(C17867d.m33078a());
        String a2 = C58452y.m107035a();
        C16054a.m29672b();
        this.f153831a.mo142945a(((SettingApi) RetrofitFactory.m33635a().mo28816a("https://libra-sg.tiktokv.com").mo28858a(SettingApi.class)).queryABTestCommon("1180", serverDeviceId, C17867d.m33087h(), 1, a2, a).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88925a.m154180b(C88946a.f201991c)).mo143248c(C68777a.f153832a).mo143238a(C68778b.f153833a).mo143248c(C68779c.f153834a).mo143231a(C68780d.f153835a, C68781e.f153836a));
    }
}
