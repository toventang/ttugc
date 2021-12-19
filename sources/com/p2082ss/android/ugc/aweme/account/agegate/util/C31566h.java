package com.p2082ss.android.ugc.aweme.account.agegate.util;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.util.h */
public final class C31566h {

    /* renamed from: a */
    public static String f75502a;

    /* renamed from: b */
    public static String f75503b;

    /* renamed from: c */
    public static boolean f75504c;

    /* renamed from: d */
    public static final HashMap<String, Integer> f75505d = new HashMap<>();

    /* renamed from: e */
    public static final C31566h f75506e = new C31566h();

    private C31566h() {
    }

    /* renamed from: a */
    public static void m65848a() {
        f75502a = null;
        f75503b = null;
    }

    static {
        Covode.recordClassIndex(38285);
    }

    /* renamed from: b */
    public static Map<String, String> m65850b() {
        HashMap hashMap = new HashMap();
        String str = f75502a;
        if (str != null) {
            hashMap.put("birthday", str);
        }
        String str2 = f75503b;
        if (str2 != null) {
            hashMap.put("screen_name", str2);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static int m65847a(String str) {
        C89219l.m154721d(str, "");
        Integer num = f75505d.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* renamed from: a */
    public static void m65849a(String str, int i) {
        C89219l.m154721d(str, "");
        f75505d.put(str, Integer.valueOf(i));
    }
}
