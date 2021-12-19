package com.p2082ss.android.ugc.aweme.i18n.language;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53453b;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53457c;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.a */
public final class C53438a {
    static {
        Covode.recordClassIndex(63007);
    }

    /* renamed from: a */
    public static Locale m98618a() {
        return m98619a((String) null, (String) null, C17867d.m33078a());
    }

    /* renamed from: b */
    public static String m98623b() {
        String b = m98626b("key_current_locale", "");
        if (TextUtils.isEmpty(b)) {
            return "en";
        }
        return b;
    }

    /* renamed from: b */
    public static String m98624b(Context context) {
        return SettingServiceImpl.m120782v().mo108857a(context).mo90021e();
    }

    /* renamed from: a */
    public static void m98620a(Context context) {
        if (context == null) {
            context = C17867d.m33078a();
        }
        C53457c.m98653a(context, m98619a((String) null, (String) null, context), false, null);
    }

    /* renamed from: a */
    public static void m98622a(String str, String str2) {
        C34822d.m71158a(C17867d.m33078a(), "key_language_sp_key", 0).edit().putString(str, str2).apply();
    }

    /* renamed from: b */
    public static String m98626b(String str, String str2) {
        return C34822d.m71158a(C17867d.m33078a(), "key_language_sp_key", 0).getString(str, str2);
    }

    /* renamed from: a */
    public static void m98621a(Context context, String str, String str2) {
        C34822d.m71158a(context, "key_language_sp_key", 0).edit().putString(str, str2).apply();
    }

    /* renamed from: b */
    public static String m98625b(Context context, String str, String str2) {
        return C34822d.m71158a(context, "key_language_sp_key", 0).getString(str, str2);
    }

    /* renamed from: a */
    public static Locale m98619a(String str, String str2, Context context) {
        boolean z;
        Locale locale = Locale.getDefault();
        String str3 = "";
        if (str2 == null) {
            if (context == null) {
                str2 = str3;
            } else {
                str2 = m98625b(context, "pref_language_key", str3);
            }
        }
        if (str == null) {
            String b = m98626b("key_current_locale", str3);
            str = "zh-Hant-TW";
            if (TextUtils.isEmpty(b)) {
                String country = locale.getCountry();
                String language = locale.getLanguage();
                if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, language)) {
                    str3 = country;
                    str2 = language;
                } else if (TextUtils.equals(str2, "zh-Hant") || TextUtils.equals(str2, "zh")) {
                    m98622a("key_current_locale", str);
                } else if (TextUtils.equals(str2, "in")) {
                    m98622a("key_current_locale", "id-ID");
                    str = "id-ID";
                } else if (TextUtils.equals(str2, "iw")) {
                    m98622a("key_current_locale", "he-IL");
                    str = "he-IL";
                }
                if (!locale.equals(Locale.SIMPLIFIED_CHINESE)) {
                    if (TextUtils.equals("in", str2)) {
                        m98622a("key_current_locale", "id-ID");
                        str = "id-ID";
                    } else if (TextUtils.equals("iw", str2)) {
                        m98622a("key_current_locale", "he-IL");
                        str = "he-IL";
                    } else {
                        for (AbstractC58069b bVar : C53453b.C53456a.f122693a.f122685b.values()) {
                            if (!TextUtils.isEmpty(bVar.mo90019c().getCountry())) {
                                String language2 = locale.getLanguage();
                                if (TextUtils.equals("zh-Hans", language2) || (TextUtils.equals("zh", language2) && TextUtils.equals(locale.getCountry(), "CN"))) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    if (TextUtils.equals("zh-Hant", str2) || TextUtils.equals("zh", str2) || TextUtils.equals("zh_TW", str2)) {
                                        m98622a("key_current_locale", str);
                                        break;
                                    } else if (TextUtils.equals(str2, bVar.mo90019c().getLanguage()) && TextUtils.equals(str3, bVar.mo90019c().getCountry())) {
                                        m98622a("key_current_locale", str2 + "-" + str3);
                                        str = str2 + "-" + str3;
                                        break;
                                    } else if (TextUtils.equals(str2, bVar.mo90019c().getLanguage())) {
                                        m98622a("key_current_locale", bVar.mo90017a());
                                        str = bVar.mo90017a();
                                        break;
                                    }
                                } else {
                                    m98622a("key_current_locale", "zh-Hans");
                                    str = "zh-Hans";
                                    break;
                                }
                            } else if (TextUtils.equals(str2, bVar.mo90019c().getLanguage())) {
                                m98622a("key_current_locale", str2);
                                str = str2;
                                break;
                            }
                        }
                        m98622a("key_current_locale", "en");
                    }
                }
                str = "en";
            } else {
                str = b;
            }
        }
        try {
            Locale a = SettingServiceImpl.m120782v().mo108861a(str);
            if (a != null) {
                return a;
            }
            return locale;
        } catch (Throwable unused) {
        }
    }
}
