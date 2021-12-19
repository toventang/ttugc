package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.f */
public final class C75956f {
    static {
        Covode.recordClassIndex(88898);
    }

    /* renamed from: a */
    public static String m133180a(Context context) {
        Locale locale;
        if (context == null) {
            return "zh-CN";
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = context.getResources().getConfiguration().locale;
            }
            return locale.getLanguage() + "-" + locale.getCountry();
        } catch (Exception unused) {
            return "zh-CN";
        }
    }
}
