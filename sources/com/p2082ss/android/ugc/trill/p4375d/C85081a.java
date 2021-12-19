package com.p2082ss.android.ugc.trill.p4375d;

import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.android.gms.p1930a.p1931a.C25248a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58013a;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.trill.d.a */
public class C85081a {

    /* renamed from: a */
    public static final String f190363a = C85081a.class.getSimpleName();

    /* renamed from: b */
    private static String f190364b;

    /* renamed from: c */
    private static String f190365c;

    /* renamed from: d */
    private static boolean f190366d = false;

    /* renamed from: e */
    private static SharedPreferences f190367e = C34822d.m71158a(C17867d.m33078a(), "gaid_sp_name", 0);

    /* renamed from: a */
    public static void m146286a() {
        if (!m146291f()) {
            m146292g();
        }
    }

    /* renamed from: f */
    private static boolean m146291f() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(99104);
    }

    /* renamed from: b */
    public static String m146287b() {
        if (f190364b == null) {
            if (m146291f()) {
                return f190367e.getString("key_gaid", "");
            }
            m146292g();
        }
        return f190364b;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m146292g() {
        if (!f190366d) {
            try {
                m146293h();
                AppLog.setGoogleAId(f190364b);
                f190366d = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public static String m146288c() {
        String str = f190364b;
        if (str != null) {
            return str;
        }
        if (C58195d.m105112e()) {
            C1731i.m5640b(CallableC85082b.f190368a, C40780g.m82241a());
        } else {
            C1731i.m5640b(CallableC85083c.f190369a, C1731i.f5562a);
        }
        return f190367e.getString("key_gaid", "");
    }

    /* renamed from: h */
    private static void m146293h() {
        SharedPreferences.Editor edit = f190367e.edit();
        try {
            C25248a.C25249a a = C25248a.m48579a(C17867d.m33078a());
            if (a != null && !TextUtils.isEmpty(a.f59857a)) {
                edit.putString("key_gaid", a.f59857a);
                f190364b = a.f59857a;
            }
        } catch (Exception unused) {
        }
        String str = null;
        try {
            str = m146285a(C17867d.m33078a().getContentResolver(), "android_id");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!TextUtils.isEmpty(str)) {
            edit.putString("key_android_id", str);
            f190365c = str;
        }
        edit.commit();
    }

    /* renamed from: a */
    private static String m146285a(ContentResolver contentResolver, String str) {
        if (!TextUtils.equals(str, "android_id")) {
            return Settings.System.getString(contentResolver, str);
        }
        if (TextUtils.isEmpty(C58013a.f132217a)) {
            C58013a.f132217a = Settings.System.getString(contentResolver, str);
        }
        return C58013a.f132217a;
    }
}
