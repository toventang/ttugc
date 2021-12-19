package com.p2082ss.android.ugc.aweme.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.utils.en */
public final class C80398en {
    static {
        Covode.recordClassIndex(93666);
    }

    /* renamed from: a */
    public static Locale m139370a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C17867d.m33078a().getResources().getConfiguration().getLocales().get(0);
        }
        return C17867d.m33078a().getResources().getConfiguration().locale;
    }

    /* renamed from: b */
    public static boolean m139371b() {
        if (TextUtils.equals(Locale.getDefault().getLanguage(), Locale.CHINESE.getLanguage()) || TextUtils.equals(Locale.getDefault().getLanguage(), Locale.ENGLISH.getLanguage())) {
            return true;
        }
        return false;
    }
}
