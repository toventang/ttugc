package com.p2082ss.android.ugc.aweme.profile.settings;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53457c;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.profile.settings.c */
public final class C63876c {

    /* renamed from: a */
    public static final String f144803a = "aweme://webview/?url=https%3A%2F%2Ftiktok.com%3Fhide_nav_bar%3D1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dbaca_fe%26bundle_name%3Dbaca_fe%26module_name%3Dpage_account_switch";

    /* renamed from: b */
    public static final C63876c f144804b = new C63876c();

    private C63876c() {
    }

    static {
        Covode.recordClassIndex(75302);
    }

    /* renamed from: a */
    private static String m115572a() {
        String str;
        try {
            str = SettingsManager.m29616a().mo25398a("account_switch_schema", "aweme://webview/?url=https%3A%2F%2Ftiktok.com%3Fhide_nav_bar%3D1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dbaca_fe%26bundle_name%3Dbaca_fe%26module_name%3Dpage_account_switch");
        } catch (Exception e) {
            e.printStackTrace();
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "aweme://webview/?url=https%3A%2F%2Ftiktok.com%3Fhide_nav_bar%3D1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dbaca_fe%26bundle_name%3Dbaca_fe%26module_name%3Dpage_account_switch";
        }
        if (str == null) {
            C89219l.m154715b();
        }
        return str;
    }

    /* renamed from: a */
    public static String m115573a(int i, String str) {
        String language;
        String str2 = "";
        C89219l.m154721d(str, str2);
        String a = C89361p.m154869a(C89361p.m154869a(m115572a(), "((page_action_type))", String.valueOf(i), false), "((enter_from))", str, false);
        Locale a2 = C53457c.m98651a(C17867d.m33078a());
        if (!(a2 == null || (language = a2.getLanguage()) == null)) {
            str2 = language;
        }
        return C89361p.m154869a(a, "((locale))", str2, false);
    }
}
