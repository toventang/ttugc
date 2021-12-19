package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bl */
public final class C73996bl {
    static {
        Covode.recordClassIndex(86746);
    }

    /* renamed from: a */
    public static String m130140a(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        if (strArr == null) {
            return sb.toString();
        }
        for (int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i]);
            if (i != strArr.length - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static SpannableString m130139a(SpannableString spannableString, int i, int i2, int i3) {
        int max = Math.max(0, i);
        if (!TextUtils.isEmpty(spannableString) && max <= i2 && max < spannableString.length() && i2 <= spannableString.length()) {
            spannableString.setSpan(new ForegroundColorSpan(i3), max, i2, 17);
        }
        return spannableString;
    }
}
