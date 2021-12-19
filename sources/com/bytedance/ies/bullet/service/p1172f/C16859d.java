package com.bytedance.ies.bullet.service.p1172f;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.C16630d;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.f.d */
public final class C16859d {

    /* renamed from: a */
    public static final C16859d f40072a = new C16859d();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, Pattern> f40073b = new ConcurrentHashMap<>();

    private C16859d() {
    }

    static {
        Covode.recordClassIndex(19299);
    }

    /* renamed from: a */
    private static boolean m31081a(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C16630d m31080a(String str, List<String> list) {
        C89219l.m154719c(list, "");
        C16630d dVar = new C16630d("", "");
        if (str == null || str.length() == 0) {
            return dVar;
        }
        Uri parse = Uri.parse(str);
        C89219l.m154709a((Object) parse, "");
        String path = parse.getPath();
        if (path == null || path.length() == 0) {
            return dVar;
        }
        try {
            for (T t : list) {
                if (t.length() != 0) {
                    ConcurrentHashMap<String, Pattern> concurrentHashMap = f40073b;
                    Pattern pattern = concurrentHashMap.get(t);
                    if (pattern == null) {
                        pattern = Pattern.compile(((String) t) + "/(([^/]+)/([^?]*))");
                        C89219l.m154709a((Object) pattern, "");
                        concurrentHashMap.put(t, pattern);
                    }
                    Matcher matcher = pattern.matcher(path);
                    if (matcher.find() && matcher.groupCount() == 3) {
                        String group = matcher.group(2);
                        String group2 = matcher.group(3);
                        if (m31081a(group) && m31081a(group2)) {
                            C89219l.m154709a((Object) group, "");
                            dVar.mo26390a(group);
                            C89219l.m154709a((Object) group2, "");
                            dVar.mo26392b(group2);
                            dVar.f39788c = true;
                            return dVar;
                        }
                    }
                    if (!dVar.f39788c) {
                        Matcher matcher2 = pattern.matcher(str);
                        if (matcher2.find() && matcher2.groupCount() == 3) {
                            String group3 = matcher2.group(2);
                            String group4 = matcher2.group(3);
                            if (m31081a(group3) && m31081a(group4)) {
                                C89219l.m154709a((Object) group3, "");
                                dVar.mo26390a(group3);
                                C89219l.m154709a((Object) group4, "");
                                dVar.mo26392b(group4);
                                dVar.f39788c = true;
                                return dVar;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return dVar;
    }
}
