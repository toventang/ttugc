package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ai */
public final class C73948ai {
    static {
        Covode.recordClassIndex(86698);
    }

    /* renamed from: a */
    public static String m130039a() {
        String str;
        try {
            if (Build.VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0 || TextUtils.isEmpty(Build.SUPPORTED_ABIS[0])) {
                str = Build.CPU_ABI;
            } else {
                str = Build.SUPPORTED_ABIS[0];
            }
            if (TextUtils.isEmpty(str)) {
                return "unknown";
            }
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("x86")) {
                return "x86";
            }
            if (lowerCase.startsWith("arm64")) {
                return "arm64";
            }
            if (lowerCase.startsWith("armeabi")) {
                return "armeabi";
            }
            return "unknown";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
