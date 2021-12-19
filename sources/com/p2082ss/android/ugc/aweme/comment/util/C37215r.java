package com.p2082ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46577a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.comment.util.r */
public final class C37215r {

    /* renamed from: a */
    private static final Pattern f87744a = Pattern.compile("(\\[)([^\\[\\]]+)(])");

    /* renamed from: b */
    private static final Pattern f87745b = Pattern.compile("<no_trans>(.+?)</no_trans>");

    /* renamed from: c */
    private static C46577a f87746c = new C46577a();

    static {
        Covode.recordClassIndex(44570);
    }

    /* renamed from: a */
    public static String m75207a(String str) {
        Matcher matcher = f87744a.matcher(str);
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (matcher.find()) {
            int start = matcher.start() + i;
            int end = matcher.end() + i;
            if (f87746c.mo79105a(matcher.group())) {
                sb.insert(start, "<no_trans>");
                sb.insert(end + 10, "</no_trans>");
                i += 21;
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m75208b(String str) {
        Matcher matcher = f87745b.matcher(str);
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        while (matcher.find()) {
            sb.replace(matcher.start() - i, matcher.end() - i, matcher.group(1));
            i += 21;
        }
        return sb.toString();
    }
}
