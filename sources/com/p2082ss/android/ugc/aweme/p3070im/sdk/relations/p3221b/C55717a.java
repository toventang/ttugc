package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.sysoptimizer.RegexMatcherOptimizer;
import com.github.p1912a.p1913a.C25040a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46577a;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.a */
public final class C55717a {

    /* renamed from: a */
    private static C46577a f127091a = new C46577a();

    static {
        Covode.recordClassIndex(65503);
    }

    /* renamed from: a */
    public static boolean m101461a(char c) {
        if (Character.isUpperCase(c) || Character.isLowerCase(c)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m101463b(char c) {
        return Pattern.compile("[\\p{P}\\p{S}\\p{Z}]").matcher(String.valueOf(c)).matches();
    }

    /* renamed from: a */
    public static boolean m101462a(String str) {
        try {
            if (SettingsManager.m29616a().mo25400a("tt_dm_emoji_regex_fix", false)) {
                RegexMatcherOptimizer.fix(C17867d.m33078a());
            }
            Matcher matcher = Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)").matcher(str);
            if (!matcher.find() || str.indexOf(matcher.group()) != 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public static String m101465c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String trim = str.trim();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < trim.length(); i++) {
            sb.append(C25040a.m48012a(trim.charAt(i)));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m101464b(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            Matcher matcher = Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)").matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group());
            }
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                i += ((String) arrayList.get(i2)).length();
            }
            if (i != str.length()) {
                Matcher matcher2 = Pattern.compile("(\\[)([^\\[\\]]+)(])").matcher(str);
                while (matcher2.find()) {
                    String group = matcher2.group();
                    if (f127091a.mo79102a(C17873f.m33102j(), group) != null) {
                        arrayList.add(group);
                    }
                }
                int i3 = 0;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    i3 += ((String) arrayList.get(i4)).length();
                }
                if (i3 != str.length() || arrayList.size() > 3) {
                    return false;
                }
                return true;
            } else if (arrayList.size() <= 3) {
                return true;
            } else {
                return false;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static String m101460a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            if (str.contains(str4)) {
                return str4;
            }
            str4 = m101465c(str4).toLowerCase();
            StringBuilder sb = new StringBuilder();
            int indexOf = str3.indexOf(str4);
            int indexOf2 = str2.indexOf(str4);
            int i = 0;
            if (indexOf2 != -1) {
                int i2 = 0;
                int i3 = 0;
                while (i < str.length()) {
                    int length = C25040a.m48012a(str.charAt(i)).toLowerCase().length() + i3;
                    if (i3 >= indexOf2 && i3 < str4.length() + indexOf2) {
                        sb.append(str.charAt(i));
                    } else if (length <= indexOf2 || length > str4.length() + indexOf2) {
                        if (indexOf2 > i3 && indexOf2 < length) {
                            sb.append(str.charAt(i));
                        }
                        i++;
                        i3 = length;
                    } else {
                        sb.append(str.charAt(i));
                    }
                    i2++;
                    i++;
                    i3 = length;
                }
                i = i2;
            }
            if (indexOf != -1 && indexOf < str.length() && str4.length() > i) {
                return str.substring(indexOf, Math.min(str.length(), str4.length() + indexOf));
            }
            if (!TextUtils.isEmpty(sb.toString())) {
                return sb.toString();
            }
        }
        return str4;
    }
}
