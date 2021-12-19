package com.bytedance.lynx.hybrid.resource.p1534h;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.p1528d.C21290a;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.lynx.hybrid.resource.h.a */
public final class C21324a {

    /* renamed from: a */
    public static final C21324a f50638a = new C21324a();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, Pattern> f50639b = new ConcurrentHashMap<>();

    private C21324a() {
    }

    static {
        Covode.recordClassIndex(24942);
    }

    /* renamed from: b */
    private static boolean m40064b(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m40063a(String str) {
        if (str.length() <= 0 || C89361p.m154885a((CharSequence) str, "/") != str.length() - 1) {
            return str;
        }
        String substring = str.substring(0, str.length() - 1);
        C89219l.m154709a((Object) substring, "");
        return substring;
    }

    /* renamed from: a */
    private static C21290a m40062a(String str, List<String> list) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            for (T t : list) {
                if (t.length() != 0) {
                    ConcurrentHashMap<String, Pattern> concurrentHashMap = f50639b;
                    Pattern pattern = concurrentHashMap.get(t);
                    if (pattern == null) {
                        pattern = Pattern.compile(((String) t) + "/(([^/]+)/([^?]*))");
                        C89219l.m154709a((Object) pattern, "");
                        concurrentHashMap.put(t, pattern);
                    }
                    Matcher matcher = pattern.matcher(str);
                    if (matcher.find() && matcher.groupCount() == 3) {
                        String group = matcher.group(2);
                        String group2 = matcher.group(3);
                        if (m40064b(group) && m40064b(group2)) {
                            if (group == null) {
                                C89219l.m154707a();
                            }
                            if (group2 == null) {
                                C89219l.m154707a();
                            }
                            return new C21290a(group, group2, true);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r1.length() > 0) goto L_0x0042;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.lynx.hybrid.resource.p1528d.C21290a m40061a(java.lang.String r7, com.bytedance.lynx.hybrid.resource.C21314g r8, com.bytedance.lynx.hybrid.resource.config.C21284j r9) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.resource.p1534h.C21324a.m40061a(java.lang.String, com.bytedance.lynx.hybrid.resource.g, com.bytedance.lynx.hybrid.resource.config.j):com.bytedance.lynx.hybrid.resource.d.a");
    }
}
