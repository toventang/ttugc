package com.ttnet.org.chromium.base;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PiiElider {

    /* renamed from: a */
    private static final Pattern f198290a;

    /* renamed from: b */
    private static final Pattern f198291b;

    /* renamed from: c */
    private static final Pattern f198292c = Pattern.compile("\\sat\\sorg\\.chromium\\.[^ ]+.");

    /* renamed from: d */
    private static final Pattern f198293d;

    /* renamed from: e */
    private static final Pattern f198294e = Pattern.compile("([0-9a-fA-F]{2}[-:]+){5}[0-9a-fA-F]{2}");

    /* renamed from: f */
    private static final Pattern f198295f = Pattern.compile("\\[\\w*:CONSOLE.*\\].*");

    /* renamed from: g */
    private static final String[] f198296g = {"org.chromium.", "com.google."};

    /* renamed from: h */
    private static final String[] f198297h = {"android.accessibilityservice", "android.accounts", "android.animation", "android.annotation", "android.app", "android.appwidget", "android.bluetooth", "android.content", "android.database", "android.databinding", "android.drm", "android.gesture", "android.graphics", "android.hardware", "android.inputmethodservice", "android.location", "android.media", "android.mtp", "android.net", "android.nfc", "android.opengl", "android.os", "android.preference", "android.print", "android.printservice", "android.provider", "android.renderscript", "android.sax", "android.security", "android.service", "android.speech", "android.support", "android.system", "android.telecom", "android.telephony", "android.test", "android.text", "android.transition", "android.util", "android.view", "android.webkit", "android.widget", "com.android.", "dalvik.", "java.", "javax.", "org.apache.", "org.json.", "org.w3c.dom.", "org.xml.", "org.xmlpull."};

    static {
        Covode.recordClassIndex(103356);
        Pattern compile = Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))");
        f198290a = compile;
        Pattern compile2 = Pattern.compile("(([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯]([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯\\-]{0,61}[a-zA-Z0-9 -퟿豈-﷏ﷰ-￯]){0,1}\\.)+[a-zA-Z -퟿豈-﷏ﷰ-￯]{2,63}|" + compile + ")");
        f198291b = compile2;
        f198293d = Pattern.compile("(?:\\b|^)((?:(http|https|Http|Https|rtsp|Rtsp):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:" + compile2 + ")(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9 -퟿豈-﷏ﷰ-￯\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?(?:\\b|$)");
    }

    /* renamed from: b */
    private static boolean m151743b(String str) {
        for (String str2 : f198296g) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m151744c(String str) {
        for (String str2 : f198297h) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String sanitizeStacktrace(String str) {
        String[] split = str.split("\\n");
        split[0] = m151742a(split[0]);
        for (int i = 1; i < split.length; i++) {
            if (split[i].startsWith("Caused by:")) {
                split[i] = m151742a(split[i]);
            }
        }
        return TextUtils.join("\n", split);
    }

    /* renamed from: a */
    private static String m151742a(String str) {
        if (f198292c.matcher(str).find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        Matcher matcher = f198293d.matcher(sb);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            i = matcher.end();
            String substring = sb.substring(start, i);
            if (!m151743b(substring) && !m151744c(substring)) {
                sb.replace(start, i, "HTTP://WEBADDRESS.ELIDED");
                i = start + 24;
                matcher = f198293d.matcher(sb);
            }
        }
        return sb.toString();
    }
}
