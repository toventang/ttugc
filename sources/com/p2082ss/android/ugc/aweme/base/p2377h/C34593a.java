package com.p2082ss.android.ugc.aweme.base.p2377h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.base.h.a */
public final class C34593a {

    /* renamed from: a */
    public static final HashMap<String, Boolean> f81640a = new HashMap<>();

    /* renamed from: b */
    private static final HashMap<String, Integer> f81641b = new HashMap<>();

    /* renamed from: c */
    private static final HashMap<String, Long> f81642c = new HashMap<>();

    /* renamed from: d */
    private static final HashMap<String, String> f81643d = new HashMap<>();

    static {
        Covode.recordClassIndex(41555);
    }

    /* renamed from: c */
    private static boolean m70632c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m70628a(String str, String str2) {
        if (m70632c(str, str2)) {
            return false;
        }
        return f81640a.containsKey(m70630b(str, str2));
    }

    /* renamed from: b */
    public static String m70630b(String str, String str2) {
        return str + "-" + str2;
    }

    /* renamed from: a */
    public static boolean m70629a(String str, String str2, boolean z) {
        if (m70632c(str, str2)) {
            return z;
        }
        String b = m70630b(str, str2);
        HashMap<String, Boolean> hashMap = f81640a;
        if (hashMap.containsKey(b)) {
            return hashMap.get(b).booleanValue();
        }
        return C34822d.m71158a(C17867d.m33078a(), str, 0).getBoolean(str2, z);
    }

    /* renamed from: b */
    public static boolean m70631b(String str, String str2, boolean z) {
        if (m70632c(str, str2)) {
            return z;
        }
        String b = m70630b(str, str2);
        HashMap<String, Boolean> hashMap = f81640a;
        if (hashMap.containsKey(b)) {
            return hashMap.get(b).booleanValue();
        }
        boolean z2 = C34822d.m71158a(C17867d.m33078a(), str, 0).getBoolean(str2, z);
        hashMap.put(b, Boolean.valueOf(z2));
        return z2;
    }
}
