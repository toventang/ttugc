package com.p2082ss.android.ugc.aweme.i18n.language.i18n;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.p1097d.C15401f;
import com.bytedance.ies.abmock.C16083j;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.C17179a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.C21176e;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.i18n.language.p3063a.C53446g;
import com.p2082ss.android.ugc.aweme.i18n.language.p3063a.C53449i;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.net.CommonApi;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80398en;
import com.p2082ss.android.ugc.aweme.utils.gecko.GeckoLocalServiceImpl;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.i18n.b */
public final class C53453b {

    /* renamed from: a */
    public static final String f122684a = (Api.f79771d + "/aweme/v1/device/update/");

    /* renamed from: b */
    public Map<String, AbstractC58069b> f122685b;

    /* renamed from: c */
    public CommonApi f122686c;

    /* renamed from: com.ss.android.ugc.aweme.i18n.language.i18n.b$a */
    public static class C53456a {

        /* renamed from: a */
        public static C53453b f122693a = new C53453b((byte) 0);

        static {
            Covode.recordClassIndex(63026);
        }
    }

    /* renamed from: a */
    public static String m98646a() {
        return Resources.getSystem().getConfiguration().locale.getCountry();
    }

    static {
        Covode.recordClassIndex(63023);
    }

    /* renamed from: b */
    public final AbstractC58069b mo90024b() {
        AbstractC58069b bVar = this.f122685b.get(C53438a.m98623b());
        if (bVar != null) {
            return bVar;
        }
        return this.f122685b.get("en");
    }

    private C53453b() {
        this.f122685b = new LinkedHashMap();
        if ("local_test".equals(C17867d.f42595s) || "lark_inhouse".equals(C17867d.f42595s)) {
            this.f122685b.put("sq", new C53452a("sq", "sq", "", "Translate To Key"));
        }
        this.f122685b.put("en", new C53452a("en", "en", "", "English"));
        this.f122685b.put(C15401f.f37600a, new C53452a(C15401f.f37600a, C15401f.f37600a, "", "العربية"));
        this.f122685b.put("de-DE", new C53452a("de-DE", "de", "DE", "Deutsch"));
        this.f122685b.put("es", new C53452a("es", "es", "", "Español"));
        this.f122685b.put("fi-FI", new C53452a("fi-FI", "fi", "FI", "Suomi (Suomi)"));
        this.f122685b.put("fr", new C53452a("fr", "fr", "", "Français"));
        this.f122685b.put("fr-CA", new C53452a("fr-CA", "fr", "CA", "Français (Canada)"));
        this.f122685b.put("id-ID", new C53452a("id-ID", "id", "ID", "Bahasa Indonesia (Indonesia)"));
        this.f122685b.put("ja-JP", new C53452a("ja-JP", "ja", "JP", "日本語（日本）"));
        this.f122685b.put("ko-KR", new C53452a("ko-KR", "ko", "KR", "한국어 (대한민국)"));
        this.f122685b.put("ms-MY", new C53452a("ms-MY", "ms", "MY", "Bahasa Melayu (Malaysia)"));
        this.f122685b.put("ru-RU", new C53452a("ru-RU", "ru", "RU", "Русский (Россия)"));
        this.f122685b.put("th-TH", new C53452a("th-TH", "th", "TH", "ไทย (ไทย)"));
        this.f122685b.put("tr-TR", new C53452a("tr-TR", "tr", "TR", "Türkçe (Türkiye)"));
        this.f122685b.put("vi-VN", new C53452a("vi-VN", "vi", "VN", "Tiếng Việt (Việt Nam)"));
        this.f122685b.put("zh-Hant-TW", new C53452a("zh-Hant-TW", "zh", "TW", "中文（繁體）", "zh-Hant"));
        this.f122685b.put("zh-Hans", new C53452a("zh-Hans", "zh", "", "中文（简体）", "zh-Hans"));
        this.f122685b.put("he-IL", new C53452a("he-IL", "he", "IL", "עברית (ישראל)"));
        this.f122685b.put("jv-ID", new C53452a("jv-ID", "jv", "ID", "Basa Jawa (Indonesia)"));
        this.f122685b.put("ceb-PH", new C53452a("ceb-PH", "ceb", "PH", "Cebuano (Pilipinas)"));
        this.f122685b.put("cs-CZ", new C53452a("cs-CZ", "cs", "CZ", "Čeština (Česká republika)"));
        this.f122685b.put("it-IT", new C53452a("it-IT", "it", "IT", "Italiano (Italia)"));
        this.f122685b.put("hu-HU", new C53452a("hu-HU", "hu", "HU", "Magyar (Magyarország)"));
        this.f122685b.put("nl-NL", new C53452a("nl-NL", "nl", "NL", "Nederlands (Nederland)"));
        this.f122685b.put("pl-PL", new C53452a("pl-PL", "pl", "PL", "Polski (Polska)"));
        this.f122685b.put("pt-BR", new C53452a("pt-BR", "pt", "BR", "Português (Brasil)"));
        this.f122685b.put("ro-RO", new C53452a("ro-RO", "ro", "RO", "Română (Romania)"));
        this.f122685b.put("sv-SE", new C53452a("sv-SE", "sv", "SE", "Svenska (Sverige)"));
        this.f122685b.put("fil-PH", new C53452a("fil-PH", "fil", "PH", "Filipino (Pilipinas)"));
        this.f122685b.put("el-GR", new C53452a("el-GR", "el", "GR", "Ελληνικά (Ελλάδα)"));
        this.f122685b.put("uk-UA", new C53452a("uk-UA", "uk", "UA", "Українська (Україна)"));
        this.f122685b.put("ur", new C53452a("ur", "ur", "", "اردو"));
        this.f122685b.put("hi-IN", new C53452a("hi-IN", "hi", "IN", "हिंदी"));
        this.f122685b.put("bn-IN", new C53452a("bn-IN", "bn", "IN", "বাঙ্গালি (ভারত)"));
        this.f122685b.put("my-MM", new C53452a("my-MM", "my", "MM", "မြန်မာ (မြန်မာ)"));
        this.f122685b.put("km-KH", new C53452a("km-KH", "km", "KH", "ខ្មែរ (កម្ពុជា)"));
    }

    /* synthetic */ C53453b(byte b) {
        this();
    }

    /* renamed from: a */
    public static String m98647a(Locale locale) {
        if (TextUtils.equals("zh", locale.getLanguage()) && TextUtils.equals("", locale.getCountry())) {
            return "zh-Hans";
        }
        if (locale.equals(Locale.TRADITIONAL_CHINESE)) {
            return "zh-Hant";
        }
        if (locale.equals(Locale.CHINESE) || locale.equals(Locale.SIMPLIFIED_CHINESE)) {
            return "zh-Hans";
        }
        if ("iw".equals(locale.getLanguage())) {
            return "he";
        }
        if ("in".equals(locale.getLanguage())) {
            return "id";
        }
        return locale.getLanguage();
    }

    /* renamed from: a */
    public final void mo90023a(String str, String str2, Context context) {
        C534541 r2 = new AbstractC53459d(context, str2, str) {
            /* class com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53453b.C534541 */

            /* renamed from: a */
            WeakReference<Context> f122687a;

            /* renamed from: b */
            final /* synthetic */ Context f122688b;

            /* renamed from: c */
            final /* synthetic */ String f122689c;

            /* renamed from: d */
            final /* synthetic */ String f122690d;

            static {
                Covode.recordClassIndex(63024);
            }

            @Override // com.p2082ss.android.ugc.aweme.i18n.language.i18n.AbstractC53459d
            /* renamed from: a */
            public final void mo90025a() {
                C53438a.m98622a("pref_language_key", this.f122689c);
                C53438a.m98622a("key_current_locale", this.f122690d);
                Context context = this.f122687a.get();
                if (context != null) {
                    if (context instanceof Activity) {
                        ((Activity) context).finish();
                    }
                    C53446g.C53447a.f122670a.f122663a = false;
                    C53449i.m98635a(2);
                    if (C17867d.f42588l == 5) {
                        SmartRouter.buildRoute(context, "aweme://main").addFlags(268468224).open();
                    } else {
                        Intent intent = new Intent();
                        intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
                        intent.setFlags(268468224);
                        C84349a.m145093a(intent, context);
                        context.startActivity(intent);
                    }
                    C80937s.m140453b().mo124078c();
                    Keva.getRepo("TTSettingData").erase("last_get_setting_time");
                    if (C16083j.m29874a().mo25538c()) {
                        SettingManagerServiceImpl.m121205b().mo108578a(2);
                    } else {
                        SettingManagerServiceImpl.m121205b().mo108579a(this.f122688b);
                    }
                    SettingManagerServiceImpl.m121205b().mo108577a();
                    C17179a.m31714a();
                    C34608n.m70658a().mo61083a(null, new Callable() {
                        /* class com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53453b.CallableC534552 */

                        static {
                            Covode.recordClassIndex(63025);
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            if (C53453b.this.f122686c == null) {
                                C53453b.this.f122686c = (CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(CommonApi.class);
                            }
                            Api.m68817a(C53453b.this.f122686c.doGet(C53453b.f122684a).execute().f52262b, C53453b.f122684a);
                            return null;
                        }
                    }, 0);
                    BusinessComponentServiceUtils.getLiveAllService().mo120928b();
                    IAccountUserService g = C31575b.m65865g();
                    if (g.isLogin()) {
                        g.updateLanguage(null, SettingServiceImpl.m120782v().mo108872h(), 0);
                    }
                    C59320c.C59324a.f135560a.mo96989a().notifyLocaleChange(C53438a.m98619a((String) null, (String) null, context));
                    IMService.createIIMServicebyMonsterPlugin(false).switchLocale();
                    GeckoLocalServiceImpl.m139504b().mo90016a();
                    C21176e.C21177a.m39874a("appLanguage", SettingServiceImpl.m120782v().mo108872h());
                    C21176e.C21177a.m39874a("language", C80398en.m139370a().toString());
                    C21176e.C21177a.m39874a("appLocale", C53438a.m98623b());
                }
            }

            {
                this.f122688b = r3;
                this.f122689c = r4;
                this.f122690d = r5;
                this.f122687a = new WeakReference<>(r3);
            }
        };
        if (context == null) {
            context = C17867d.m33078a();
        }
        C53457c.m98653a(context, C53438a.m98619a(str, str2, context), true, r2);
    }
}
