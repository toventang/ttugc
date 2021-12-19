package com.bytedance.crash.util;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

/* renamed from: com.bytedance.crash.util.y */
public final class C14078y {

    /* renamed from: a */
    public static final CharSequence f34256a = "amigo";

    /* renamed from: b */
    public static final CharSequence f34257b = "funtouch";

    /* renamed from: c */
    private static final CharSequence f34258c = "sony";

    static {
        Covode.recordClassIndex(16145);
    }

    /* renamed from: a */
    public static boolean m25672a() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }
}
