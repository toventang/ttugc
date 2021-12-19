package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.d */
public final class C55726d {
    static {
        Covode.recordClassIndex(65512);
    }

    /* renamed from: a */
    public static SpannableString m101479a(int i, String str, String str2, int i2) {
        if (str2.contains(".")) {
            str2 = str2.replace(".", "\\.");
        }
        SpannableString spannableString = new SpannableString(str);
        try {
            Matcher matcher = Pattern.compile(str2).matcher(spannableString);
            if (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                if (start >= i2) {
                    spannableString.setSpan(new ForegroundColorSpan(i), start, end, 33);
                }
            }
            return spannableString;
        } catch (PatternSyntaxException e) {
            e.printStackTrace();
            return spannableString;
        }
    }
}
