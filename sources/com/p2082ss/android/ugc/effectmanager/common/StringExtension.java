package com.p2082ss.android.ugc.effectmanager.common;

import com.bytedance.covode.number.Covode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.effectmanager.common.StringExtension */
public final class StringExtension {
    static {
        Covode.recordClassIndex(95433);
    }

    private StringExtension() {
    }

    static int lastIndexOfRegex(String str, String str2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int i = -1;
        while (matcher.find()) {
            i = matcher.start();
        }
        return i;
    }

    static int lastIndexOfRegex(String str, String str2, int i) {
        return lastIndexOfRegex(str.substring(0, i), str2);
    }
}
