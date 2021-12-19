package com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3381d;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.d.b */
public final class C57958b {

    /* renamed from: a */
    public static final C57958b f132129a = new C57958b();

    private C57958b() {
    }

    static {
        Covode.recordClassIndex(67982);
    }

    /* renamed from: a */
    public static String m104738a() {
        String b = m104742b("key_current_locale", "");
        if (TextUtils.isEmpty(b)) {
            return "en";
        }
        return b;
    }

    /* renamed from: a */
    private static SharedPreferences m104737a(Context context) {
        SharedPreferences a = C34822d.m71158a(context, "key_language_sp_key", 0);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: b */
    private static String m104742b(String str, String str2) {
        String string = m104737a(C17867d.m33078a()).getString(str, str2);
        if (string == null) {
            return "";
        }
        return string;
    }

    /* renamed from: a */
    public static void m104741a(String str, String str2) {
        m104737a(C17867d.m33078a()).edit().putString(str, str2).apply();
    }

    /* renamed from: a */
    public static void m104740a(Context context, String str, String str2) {
        if (context == null) {
            C89219l.m154715b();
        }
        m104737a(context).edit().putString(str, str2).apply();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Locale m104739a(java.lang.String r13, java.lang.String r14, android.content.Context r15) {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3381d.C57958b.m104739a(java.lang.String, java.lang.String, android.content.Context):java.util.Locale");
    }
}
