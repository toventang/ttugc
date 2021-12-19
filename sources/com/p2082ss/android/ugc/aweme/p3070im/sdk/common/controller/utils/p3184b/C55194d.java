package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.d */
public final class C55194d {
    static {
        Covode.recordClassIndex(64939);
    }

    /* renamed from: a */
    public static final String m100908a(String str) {
        C89219l.m154721d(str, "");
        int length = str.length();
        char[] charArray = str.toCharArray();
        C89219l.m154716b(charArray, "");
        int i = 0;
        while (i < length) {
            char c = charArray[i];
            if (C89219l.m154703a(c, 32) > 0 && c != 160 && c != 12288) {
                break;
            }
            i++;
        }
        while (i < length) {
            char c2 = charArray[length - 1];
            if (C89219l.m154703a(c2, 32) > 0 && c2 != 160 && c2 != 12288) {
                break;
            }
            length--;
        }
        if (i <= 0 && length >= str.length()) {
            return str;
        }
        String substring = str.substring(i, length);
        C89219l.m154716b(substring, "");
        return substring;
    }
}
