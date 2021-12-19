package com.p2082ss.android.ugc.aweme.base.utils;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import com.p2082ss.android.ugc.trill.R;
import java.lang.Character;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.utils.b */
public final class C34715b {

    /* renamed from: a */
    public static final String f82005a = "&";

    static {
        Covode.recordClassIndex(41707);
    }

    /* renamed from: a */
    private static boolean m70906a(char c) {
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        if (of == Character.UnicodeBlock.BASIC_LATIN || of == Character.UnicodeBlock.LATIN_1_SUPPLEMENT || of == Character.UnicodeBlock.LATIN_EXTENDED_A || of == Character.UnicodeBlock.LATIN_EXTENDED_B || of == Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m70907b(String str, int i) {
        if (i >= str.length()) {
            return false;
        }
        char charAt = str.charAt(i);
        if (Character.isDigit(charAt)) {
            return true;
        }
        if (!Character.isLowerCase(charAt) || !m70906a(charAt)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m70903a(String str, int i) {
        int charAt;
        char charAt2 = str.charAt(i);
        if (55296 <= charAt2 && charAt2 <= 56319) {
            int i2 = i + 1;
            if (i2 >= str.length() || 118784 > (charAt = ((charAt2 - 55296) * 1024) + (str.charAt(i2) - 56320) + 65536) || charAt > 128895) {
                return -1;
            }
            return 2;
        } else if (8448 <= charAt2 && charAt2 <= 10239) {
            return 1;
        } else {
            if (11013 <= charAt2 && charAt2 <= 11015) {
                return 1;
            }
            if (10548 <= charAt2 && charAt2 <= 10549) {
                return 1;
            }
            if ((12951 <= charAt2 && charAt2 <= 12953) || charAt2 == 169 || charAt2 == 174 || charAt2 == 12349 || charAt2 == 12336 || charAt2 == 11093 || charAt2 == 11036 || charAt2 == 11035 || charAt2 == 11088) {
                return 1;
            }
            int i3 = i + 1;
            if (i3 >= str.length() || str.charAt(i3) != 8419) {
                return -1;
            }
            return 2;
        }
    }

    /* renamed from: a */
    public static SpannableString m70904a(Context context, String str, List<Position> list) {
        if (str == null) {
            str = "";
        }
        if (context == null || TextUtils.isEmpty(str) || C13603b.m24435a((Collection) list)) {
            return new SpannableString(str);
        }
        SpannableString spannableString = new SpannableString(str);
        for (Position position : list) {
            if (position != null) {
                int end = position.getEnd() + 1 + 0;
                int c = C0643b.m2378c(context, R.color.nf);
                int max = Math.max(0, position.getBegin() + 0);
                if (!TextUtils.isEmpty(spannableString) && max <= end && max < spannableString.length() && end <= spannableString.length()) {
                    spannableString.setSpan(new ForegroundColorSpan(c), max, end, 17);
                }
            }
        }
        return spannableString;
    }

    /* renamed from: a */
    public static String m70905a(String str, int i, String str2) {
        int i2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (i <= 0) {
            return "";
        }
        if (str.length() <= i) {
            return str;
        }
        int i3 = -1;
        float f = 0.0f;
        do {
            float f2 = 1.0f;
            i2 = i3 + 1;
            if (i2 >= str.length()) {
                break;
            }
            int i4 = 2;
            if (m70903a(str, i2) != 2) {
                if (m70907b(str, i2)) {
                    f2 = 0.5f;
                }
                i4 = 1;
            }
            i3 += i4;
            if (i3 >= str.length()) {
                break;
            }
            f += f2;
        } while (f <= ((float) i) + 0.01f);
        if (i2 >= str.length()) {
            return str;
        }
        return str.substring(0, i2) + str2;
    }
}
