package com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3381d;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.p1097d.C15401f;
import com.bytedance.ies.dmt.p1194ui.common.rebranding.C17179a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.kids.common.p3328a.C57345a;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57354e;
import com.p2082ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.p2082ss.android.ugc.aweme.kids.setting.items.language.api.LanguageApi;
import com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3379b.AbstractC57948a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3380c.C57949a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3380c.C57952c;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.d.a */
public final class C57953a {

    /* renamed from: c */
    public static final C57954a f132118c = new C57954a((byte) 0);

    /* renamed from: a */
    public Map<String, AbstractC58069b> f132119a;

    /* renamed from: b */
    public final LanguageApi f132120b;

    static {
        Covode.recordClassIndex(67977);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.d.a$a */
    public static final class C57954a {
        static {
            Covode.recordClassIndex(67978);
        }

        private C57954a() {
        }

        public /* synthetic */ C57954a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.d.a$b */
    public static final class C57955b {

        /* renamed from: a */
        public static final C57953a f132121a = new C57953a((byte) 0);

        /* renamed from: b */
        public static final C57955b f132122b = new C57955b();

        private C57955b() {
        }

        static {
            Covode.recordClassIndex(67979);
        }
    }

    /* renamed from: c */
    public static String m104733c() {
        return m104732a(C57958b.m104739a((String) null, (String) null, C17867d.m33078a()));
    }

    /* renamed from: b */
    public final List<AbstractC58069b> mo95296b() {
        return new ArrayList(this.f132119a.values());
    }

    /* renamed from: a */
    public final AbstractC58069b mo95295a() {
        AbstractC58069b bVar = this.f132119a.get(C57958b.m104738a());
        if (bVar == null) {
            return this.f132119a.get("en");
        }
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.d.a$c */
    public static final class C57956c implements AbstractC57948a {

        /* renamed from: a */
        public WeakReference<Context> f132123a;

        /* renamed from: b */
        final /* synthetic */ C57953a f132124b;

        /* renamed from: c */
        final /* synthetic */ String f132125c;

        /* renamed from: d */
        final /* synthetic */ String f132126d;

        /* renamed from: e */
        final /* synthetic */ Context f132127e;

        static {
            Covode.recordClassIndex(67980);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3379b.AbstractC57948a
        /* renamed from: a */
        public final void mo95294a() {
            C57958b.m104741a("pref_language_key", this.f132125c);
            C57958b.m104741a("key_current_locale", this.f132126d);
            Context context = this.f132123a.get();
            if (context != null) {
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
                SmartRouter.buildRoute(context, "//kids/main").addFlags(268468224).open();
                Keva.getRepo("TTSettingData").erase("last_get_setting_time");
                C17179a.m31714a();
                if (KidsAccountServiceImpl.m104406h().mo94317a()) {
                    String c = C57953a.m104733c();
                    long currentTimeMillis = System.currentTimeMillis();
                    LanguageApi languageApi = this.f132124b.f132120b;
                    if (c == null) {
                        C89219l.m154715b();
                    }
                    languageApi.editLanguageConfig(c).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C57957a(currentTimeMillis));
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.d.a$c$a */
        public static final class C57957a implements AbstractC88986z<C57952c> {

            /* renamed from: a */
            final /* synthetic */ long f132128a;

            static {
                Covode.recordClassIndex(67981);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onComplete() {
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onSubscribe(AbstractC88412b bVar) {
                C89219l.m154721d(bVar, "");
            }

            C57957a(long j) {
                this.f132128a = j;
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onError(Throwable th) {
                C89219l.m154721d(th, "");
                C57354e.m103957a("kids_api_language_edit", -1, -1, this.f132128a);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88986z
            public final /* synthetic */ void onNext(C57952c cVar) {
                C89219l.m154721d(cVar, "");
                C57354e.m103957a("kids_api_language_edit", -1, 0, this.f132128a);
            }
        }

        public C57956c(C57953a aVar, String str, String str2, Context context) {
            this.f132124b = aVar;
            this.f132125c = str;
            this.f132126d = str2;
            this.f132127e = context;
            this.f132123a = new WeakReference<>(context);
        }
    }

    private C57953a() {
        Object a = RetrofitFactory.m33635a().mo28817b(C57345a.f130717a).mo28832d().mo28858a(LanguageApi.class);
        C89219l.m154716b(a, "");
        this.f132120b = (LanguageApi) a;
        this.f132119a = new LinkedHashMap();
        if (C89219l.m154714a((Object) "local_test", (Object) C17867d.f42595s) || C89219l.m154714a((Object) "lark_inhouse", (Object) C17867d.f42595s)) {
            this.f132119a.put("sq", new C57949a("sq", "sq", "", "Translate To Key"));
        }
        this.f132119a.put("en", new C57949a("en", "en", "", "English"));
        this.f132119a.put(C15401f.f37600a, new C57949a(C15401f.f37600a, C15401f.f37600a, "", "العربية"));
        this.f132119a.put("de-DE", new C57949a("de-DE", "de", "DE", "Deutsch"));
        this.f132119a.put("es", new C57949a("es", "es", "", "Español"));
        this.f132119a.put("fi-FI", new C57949a("fi-FI", "fi", "FI", "Suomi (Suomi)"));
        this.f132119a.put("fr", new C57949a("fr", "fr", "", "Français"));
        this.f132119a.put("fr-CA", new C57949a("fr-CA", "fr", "CA", "Français (Canada)"));
        this.f132119a.put("id-ID", new C57949a("id-ID", "id", "ID", "Bahasa Indonesia (Indonesia)"));
        this.f132119a.put("ja-JP", new C57949a("ja-JP", "ja", "JP", "日本語（日本）"));
        this.f132119a.put("ko-KR", new C57949a("ko-KR", "ko", "KR", "한국어 (대한민국)"));
        this.f132119a.put("ms-MY", new C57949a("ms-MY", "ms", "MY", "Bahasa Melayu (Malaysia)"));
        this.f132119a.put("ru-RU", new C57949a("ru-RU", "ru", "RU", "Русский (Россия)"));
        this.f132119a.put("th-TH", new C57949a("th-TH", "th", "TH", "ไทย (ไทย)"));
        this.f132119a.put("tr-TR", new C57949a("tr-TR", "tr", "TR", "Türkçe (Türkiye)"));
        this.f132119a.put("vi-VN", new C57949a("vi-VN", "vi", "VN", "Tiếng Việt (Việt Nam)"));
        this.f132119a.put("zh-Hant-TW", new C57949a("zh-Hant-TW", "zh", "TW", "中文（繁體）", "zh-Hant"));
        this.f132119a.put("zh-Hans", new C57949a("zh-Hans", "zh", "", "中文（简体）", "zh-Hans"));
        this.f132119a.put("he-IL", new C57949a("he-IL", "he", "IL", "עברית (ישראל)"));
        this.f132119a.put("jv-MY", new C57949a("jv-ID", "jv", "ID", "Basa Jawa (Indonesia)"));
        this.f132119a.put("ceb-PH", new C57949a("ceb-PH", "ceb", "PH", "Cebuano (Pilipinas)"));
        this.f132119a.put("cs-CZ", new C57949a("cs-CZ", "cs", "CZ", "Čeština (Česká republika)"));
        this.f132119a.put("it-IT", new C57949a("it-IT", "it", "IT", "Italiano (Italia)"));
        this.f132119a.put("hu-HU", new C57949a("hu-HU", "hu", "HU", "Magyar (Magyarország)"));
        this.f132119a.put("nl-NL", new C57949a("nl-NL", "nl", "NL", "Nederlands (Nederland)"));
        this.f132119a.put("pl-PL", new C57949a("pl-PL", "pl", "PL", "Polski (Polska)"));
        this.f132119a.put("pt-BR", new C57949a("pt-BR", "pt", "BR", "Português (Brasil)"));
        this.f132119a.put("ro-RO", new C57949a("ro-RO", "ro", "RO", "Română (Romania)"));
        this.f132119a.put("sv-SE", new C57949a("sv-SE", "sv", "SE", "Svenska (Sverige)"));
        this.f132119a.put("fil-PH", new C57949a("fil-PH", "fil", "PH", "Filipino (Pilipinas)"));
        this.f132119a.put("el-GR", new C57949a("el-GR", "el", "GR", "Ελληνικά (Ελλάδα)"));
        this.f132119a.put("uk-UA", new C57949a("uk-UA", "uk", "UA", "Українська (Україна)"));
        this.f132119a.put("ur", new C57949a("ur", "ur", "", "اردو"));
        this.f132119a.put("hi-IN", new C57949a("hi-IN", "hi", "IN", "हिंदी"));
        this.f132119a.put("bn-IN", new C57949a("bn-IN", "bn", "IN", "বাঙ্গালি (ভারত)"));
        this.f132119a.put("my-MM", new C57949a("my-MM", "my", "MM", "မြန်မာ (မြန်မာ)"));
        this.f132119a.put("km-KH", new C57949a("km-KH", "km", "KH", "ខ្មែរ (កម្ពុជា)"));
    }

    public /* synthetic */ C57953a(byte b) {
        this();
    }

    /* renamed from: a */
    private static String m104732a(Locale locale) {
        C89219l.m154721d(locale, "");
        if (TextUtils.equals("zh", locale.getLanguage()) && TextUtils.equals("", locale.getCountry())) {
            return "zh-Hans";
        }
        Locale locale2 = Locale.TRADITIONAL_CHINESE;
        C89219l.m154716b(locale2, "");
        if (C57959c.m104746a(locale, locale2)) {
            return "zh-Hant";
        }
        Locale locale3 = Locale.CHINESE;
        C89219l.m154716b(locale3, "");
        if (!C57959c.m104746a(locale, locale3)) {
            Locale locale4 = Locale.SIMPLIFIED_CHINESE;
            C89219l.m154716b(locale4, "");
            if (!C57959c.m104746a(locale, locale4)) {
                if (C89219l.m154714a((Object) "iw", (Object) locale.getLanguage())) {
                    return "he";
                }
                if (C89219l.m154714a((Object) "in", (Object) locale.getLanguage())) {
                    return "id";
                }
                String language = locale.getLanguage();
                C89219l.m154716b(language, "");
                return language;
            }
        }
        return "zh-Hans";
    }
}
