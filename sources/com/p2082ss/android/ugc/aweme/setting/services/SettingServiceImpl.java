package com.p2082ss.android.ugc.aweme.setting.services;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.AbstractC0952i;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.p1097d.C15401f;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1552n.C21513a;
import com.bytedance.p1552n.C21517b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.common.util.C29841d;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33859w;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.utils.C34725k;
import com.p2082ss.android.ugc.aweme.browserecord.C34928a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.p2082ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService;
import com.p2082ss.android.ugc.aweme.experiment.C46839dm;
import com.p2082ss.android.ugc.aweme.feedback.C50567b;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53453b;
import com.p2082ss.android.ugc.aweme.i18n.p3062a.C53436c;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63768ag;
import com.p2082ss.android.ugc.aweme.services.IMainService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.C68020bf;
import com.p2082ss.android.ugc.aweme.setting.p3719g.C68081a;
import com.p2082ss.android.ugc.aweme.setting.p3726n.C68192a;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.I18nSettingNewVersionActivity;
import com.p2082ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage;
import com.p2082ss.android.ugc.aweme.setting.page.privacy.C68311a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68359g;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68368j;
import com.p2082ss.android.ugc.aweme.utils.C80382ei;
import com.p2082ss.android.ugc.aweme.utils.C80542hp;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.android.ugc.trill.p4377f.C85086b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.setting.services.SettingServiceImpl */
public final class SettingServiceImpl extends BaseSettingServiceImpl {
    static {
        Covode.recordClassIndex(80669);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: d */
    public final boolean mo108868d() {
        return C80542hp.C80543a.m139626i();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: e */
    public final boolean mo108869e() {
        return I18nSettingNewVersionActivity.m120907B();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: s */
    public final boolean mo108883s() {
        return C63768ag.m115321a();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: t */
    public final C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> mo108884t() {
        return new C68359g();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: u */
    public final C39088c<AbstractC39085b<C68348f>, AbstractC68351c> mo108885u() {
        return new C68368j();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: j */
    public final Map<String, AbstractC58069b> mo108874j() {
        C53453b bVar = C53453b.C53456a.f122693a;
        C89219l.m154716b(bVar, "");
        Map<String, AbstractC58069b> map = bVar.f122685b;
        C89219l.m154716b(map, "");
        return map;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: l */
    public final String mo108876l() {
        C89219l.m154716b(C53453b.C53456a.f122693a, "");
        return C53453b.m98646a();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: f */
    public final boolean mo108870f() {
        if (((Number) C46839dm.f109121a.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: g */
    public final boolean mo108871g() {
        if (C68192a.m120443a().getBoolean("has_show_disk_manager_guide", false) || DiskManagerPage.C68272a.m120561c() < DiskManagerPage.C68272a.m120559a()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: h */
    public final String mo108872h() {
        C89219l.m154716b(C53453b.C53456a.f122693a, "");
        String a = C53453b.m98647a(C53438a.m98618a());
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: i */
    public final List<AbstractC58069b> mo108873i() {
        C53453b bVar = C53453b.C53456a.f122693a;
        C89219l.m154716b(bVar, "");
        return new ArrayList(bVar.f122685b.values());
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: k */
    public final String mo108875k() {
        C89219l.m154716b(C53453b.C53456a.f122693a, "");
        String a = C53453b.m98647a(Locale.getDefault());
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: n */
    public final String mo108878n() {
        C89219l.m154716b(C53453b.C53456a.f122693a, "");
        return C53438a.m98626b("key_current_region", C53438a.m98618a().getCountry());
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: p */
    public final boolean mo108880p() {
        C53453b bVar = C53453b.C53456a.f122693a;
        C89219l.m154716b(bVar, "");
        C17867d.m33078a();
        return TextUtils.equals(bVar.mo90024b().mo90019c().getCountry(), "KR");
    }

    /* renamed from: v */
    public static ISettingService m120782v() {
        MethodCollector.m26663i(5328);
        Object a = C81908b.m141854a(ISettingService.class, false);
        if (a != null) {
            ISettingService iSettingService = (ISettingService) a;
            MethodCollector.m26664o(5328);
            return iSettingService;
        }
        if (C81908b.f183318dO == null) {
            synchronized (ISettingService.class) {
                try {
                    if (C81908b.f183318dO == null) {
                        C81908b.f183318dO = new SettingServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5328);
                    throw th;
                }
            }
        }
        BaseSettingServiceImpl baseSettingServiceImpl = (BaseSettingServiceImpl) C81908b.f183318dO;
        MethodCollector.m26664o(5328);
        return baseSettingServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final List<AbstractC68342a> mo108860a() {
        return C89070n.m154522b(new C33859w(), C68311a.f152895a, C68081a.f152477b, C34928a.f82400a);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: b */
    public final boolean mo108865b() {
        if (!C80542hp.C80543a.m139621d() || !C80542hp.C80543a.m139620c() || !C80542hp.C80543a.m139618a()) {
            return false;
        }
        if (C80542hp.C80543a.m139619b()) {
            return true;
        }
        User curUser = C31575b.m65865g().getCurUser();
        if (curUser != null && curUser.getAccountType() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: c */
    public final boolean mo108867c() {
        if (!C80542hp.C80543a.m139625h()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            if (curUser.getProAccountUpdateNotificationStatus() != 1 || !C80542hp.C80543a.m139626i()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: m */
    public final String mo108877m() {
        C89219l.m154716b(C53453b.C53456a.f122693a, "");
        if (!TextUtils.isEmpty(C53438a.m98626b("key_current_region", C53453b.m98646a()))) {
            return C53438a.m98626b("key_current_region", C53453b.m98646a());
        }
        return C53453b.m98646a();
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: o */
    public final boolean mo108879o() {
        C89219l.m154716b(C53453b.C53456a.f122693a, "");
        String b = C53436c.f122650a.mo90004b();
        if (TextUtils.isEmpty(b) || !b.startsWith("510")) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: q */
    public final Locale mo108881q() {
        C89219l.m154716b(C53453b.C53456a.f122693a, "");
        C53453b bVar = C53453b.C53456a.f122693a;
        C17867d.m33078a();
        Locale locale = new Locale(bVar.mo90024b().mo90018b(), C58071d.m104913g());
        C89219l.m154716b(locale, "");
        return locale;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: r */
    public final void mo108882r() {
        String accountRegion;
        MethodCollector.m26663i(5319);
        if (C68433g.f153191a) {
            MethodCollector.m26664o(5319);
            return;
        }
        synchronized (this) {
            try {
                if (!C68433g.f153191a) {
                    C68426a aVar = new C68426a(this);
                    if (C29803q.f71124d == null) {
                        C29803q.f71124d = aVar;
                    }
                    C29803q.m60032a("mcc_mnc", C34725k.m70938a());
                    C29803q.m60032a("app_type", "normal");
                    TimeZone timeZone = TimeZone.getDefault();
                    C89219l.m154716b(timeZone, "");
                    C29803q.m60032a("timezone_name", timeZone.getID());
                    SharePrefCache inst = SharePrefCache.inst();
                    C89219l.m154716b(inst, "");
                    C33594aj<String> userCurrentRegion = inst.getUserCurrentRegion();
                    C89219l.m154716b(userCurrentRegion, "");
                    C29803q.m60032a("current_region", userCurrentRegion.mo59941c());
                    SharePrefCache inst2 = SharePrefCache.inst();
                    C89219l.m154716b(inst2, "");
                    C33594aj<String> userResidence = inst2.getUserResidence();
                    C89219l.m154716b(userResidence, "");
                    C29803q.m60032a("residence", userResidence.mo59941c());
                    C29803q.m60032a("carrier_region_v2", C85086b.f190371a.mo130029b());
                    C29803q.m60032a("sys_region", mo108876l());
                    C29803q.m60032a("language", mo108875k());
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    User curUser = g.getCurUser();
                    if (!(curUser == null || (accountRegion = curUser.getAccountRegion()) == null || accountRegion.length() == 0)) {
                        C29803q.m60032a("account_region", accountRegion);
                    }
                    C68433g.f153191a = true;
                    MethodCollector.m26664o(5319);
                }
            } finally {
                MethodCollector.m26664o(5319);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.services.SettingServiceImpl$a */
    static final class C68426a implements C29803q.AbstractC29805b {

        /* renamed from: a */
        final /* synthetic */ SettingServiceImpl f153183a;

        static {
            Covode.recordClassIndex(80670);
        }

        C68426a(SettingServiceImpl settingServiceImpl) {
            this.f153183a = settingServiceImpl;
        }

        @Override // com.p2082ss.android.common.applog.C29803q.AbstractC29805b
        /* renamed from: a */
        public final HashMap<String, String> mo52078a() {
            String str;
            String str2;
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("app_language", this.f153183a.mo108872h());
            if (!C80580in.m139687c()) {
                IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
                C89219l.m154716b(createIMainServicebyMonsterPlugin, "");
                hashMap.put("uoo", String.valueOf(createIMainServicebyMonsterPlugin.isLimitAdTrackingEnabled() ? 1 : 0));
            }
            hashMap.put("build_number", C17867d.m33088i());
            hashMap.put("locale", C53438a.m98623b());
            TimeZone timeZone = TimeZone.getDefault();
            C89219l.m154716b(timeZone, "");
            hashMap.put("timezone_offset", String.valueOf(timeZone.getRawOffset() / 1000));
            hashMap.put("carrier_region", C58071d.m104914h());
            hashMap.put("region", this.f153183a.mo108877m());
            hashMap.put("op_region", C58071d.m104907a());
            if (Build.VERSION.SDK_INT < 21) {
                str = Build.CPU_ABI;
            } else {
                String[] strArr = Build.SUPPORTED_ABIS;
                C89219l.m154716b(strArr, "");
                if (strArr.length == 0) {
                    str = null;
                } else {
                    str = strArr[0];
                }
            }
            hashMap.put("host_abi", str);
            hashMap.put("ts", String.valueOf(NetworkUtils.getServerTime()));
            if (TextUtils.equals(C17867d.f42597u, "lark_inhouse")) {
                hashMap.put("fake_region", C58071d.m104914h());
            }
            Context a = C17867d.m33078a();
            if (a == null) {
                str2 = "";
            } else if (Build.VERSION.SDK_INT < 24) {
                if (TextUtils.isEmpty(C58029j.f132250b) || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132250b = C13624l.m24489e(a);
                }
                str2 = C58029j.f132250b;
            } else {
                if (C29841d.f71184a == null) {
                    C29841d.f71184a = new C21517b(a);
                }
                String d = C29841d.f71184a.f51088d.mo35116d();
                if ("WIFI".equals(d)) {
                    if (C13624l.m24484a(C29841d.f71184a.f51088d.mo35114b())) {
                        str2 = "wifi5g";
                    } else {
                        str2 = "wifi";
                    }
                } else if ("MOBILE".equals(d)) {
                    C21513a aVar = C29841d.f71184a.f51088d;
                    if (Build.VERSION.SDK_INT < 24 || (!aVar.f51069h && !"NR".equals(aVar.f51064c))) {
                        switch (C29841d.f71184a.f51088d.f51062a) {
                            case 1:
                                str2 = "gprs";
                                break;
                            case 2:
                                str2 = "edge";
                                break;
                            case 3:
                                str2 = "umts";
                                break;
                            case 4:
                                str2 = "cdma";
                                break;
                            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                                str2 = "evdo_0";
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                str2 = "evdo_a";
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                                str2 = "1xrtt";
                                break;
                            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                                str2 = "hsdpa";
                                break;
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                                str2 = "hsupa";
                                break;
                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                                str2 = "hspa";
                                break;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                                str2 = "iden";
                                break;
                            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                str2 = "evdo_b";
                                break;
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                                str2 = "lte";
                                break;
                            case ABRConfig.ABR_SELECT_SCENE:
                                str2 = "ehrpd";
                                break;
                            case 15:
                                str2 = "hspap";
                                break;
                            case 16:
                                str2 = "gsm";
                                break;
                            case 17:
                                str2 = "td_scdma";
                                break;
                            case LiveRechargeAgeThresholdSetting.DEFAULT:
                            default:
                                str2 = C29841d.f71184a.f51088d.mo35115c();
                                break;
                            case 19:
                                str2 = "lte_ca";
                                break;
                            case C84224v.f188239U:
                                str2 = "nr";
                                break;
                        }
                    } else {
                        str2 = "5g";
                    }
                } else {
                    str2 = "unknown";
                }
            }
            hashMap.put("ac2", str2);
            IContentLanguageService f = ContentLanguageServiceImpl.m81266f();
            C89219l.m154716b(f, "");
            hashMap.put("content_language", f.mo69379e());
            return hashMap;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final String mo108859a(Locale locale) {
        return C53453b.m98647a(locale);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final AbstractC58069b mo108857a(Context context) {
        C89219l.m154721d(context, "");
        AbstractC58069b b = C53453b.C53456a.f122693a.mo90024b();
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: b */
    public final boolean mo108866b(Context context) {
        String str = "";
        C89219l.m154721d(context, str);
        if (context != null) {
            str = C53438a.m98625b(context, "pref_language_key", str);
        }
        if (TextUtils.isEmpty(str)) {
            str = Locale.getDefault().getLanguage();
        }
        return C15401f.f37600a.equals(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final Locale mo108861a(String str) {
        C89219l.m154721d(str, "");
        AbstractC58069b bVar = C53453b.C53456a.f122693a.f122685b.get(str);
        if (bVar != null) {
            return bVar.mo90019c();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final void mo108862a(Activity activity) {
        C89219l.m154721d(activity, "");
        C68020bf.m120317a(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final BaseResponse mo108856a(String str, int i) {
        BaseResponse a = PushSettingsApiManager.m120625a(str, i);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final String mo108858a(String str, Map<String, String> map) {
        int i;
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        HashMap hashMap = new HashMap();
        String queryParameter = Uri.parse(str).getQueryParameter("url");
        if (queryParameter == null) {
            queryParameter = "";
        }
        C89219l.m154716b(queryParameter, "");
        int a = C89361p.m154882a((CharSequence) queryParameter, '?', 0, false, 6);
        if (a > 0 && queryParameter.length() > (i = a + 1)) {
            Objects.requireNonNull(queryParameter, "null cannot be cast to non-null type java.lang.String");
            String substring = queryParameter.substring(i);
            C89219l.m154716b(substring, "");
            C50567b.m94798a(substring, hashMap);
        }
        hashMap.putAll(map);
        String b = C50567b.m94800b(queryParameter, hashMap);
        String encode = URLEncoder.encode(queryParameter);
        C89219l.m154716b(encode, "");
        String encode2 = URLEncoder.encode(b);
        C89219l.m154716b(encode2, "");
        return C89361p.m154869a(str, encode, encode2, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final void mo108864a(boolean z, AbstractC0952i iVar) {
        C89219l.m154721d(iVar, "");
        if (C16048b.m29633a().mo25412a(true, "link_privacy_guide_dialog_enable", 0) == 1) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                String curUserId = g2.getCurUserId();
                C89219l.m154716b(curUserId, "");
                C80382ei eiVar = new C80382ei(curUserId, z, iVar);
                if (!eiVar.mo123717a().getBoolean(eiVar.f179913a, false)) {
                    eiVar.mo123718b().getLinkPrivacyPopupStatus().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C80382ei.C80388f(eiVar), C80382ei.C80389g.f179923a);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.services.ISettingService
    /* renamed from: a */
    public final void mo108863a(String str, String str2, Context context) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(context, "");
        C53453b.C53456a.f122693a.mo90023a(str, str2, context);
    }
}
