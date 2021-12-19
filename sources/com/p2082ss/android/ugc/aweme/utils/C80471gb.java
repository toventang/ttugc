package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.utils.gb */
public final class C80471gb {

    /* renamed from: a */
    public static String f180047a = "⁦";

    /* renamed from: b */
    public static String f180048b = "⁧";

    /* renamed from: c */
    public static String f180049c = "⁨";

    /* renamed from: d */
    public static String f180050d = "⁩";

    /* renamed from: e */
    public static String f180051e = "‬";

    /* renamed from: f */
    public static String f180052f = "‎";

    /* renamed from: g */
    public static String f180053g = "‏";

    /* renamed from: a */
    public static boolean m139482a() {
        int i = Build.VERSION.SDK_INT;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(93739);
    }

    /* renamed from: a */
    public static String m139481a(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return f180049c + str + f180050d;
    }

    /* renamed from: a */
    public static boolean m139483a(Context context) {
        if (context != null) {
            int i = Build.VERSION.SDK_INT;
            if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                return true;
            }
        }
        return false;
    }
}
