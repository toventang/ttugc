package com.p2082ss.android.ugc.aweme.lancet;

import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.experiment.C46851ds;

/* renamed from: com.ss.android.ugc.aweme.lancet.j */
public final class C58029j {

    /* renamed from: a */
    public static String f132249a = "";

    /* renamed from: b */
    public static String f132250b = "";

    /* renamed from: c */
    public static C13624l.EnumC13625a f132251c = C13624l.EnumC13625a.UNKNOWN;

    /* renamed from: d */
    public static C13624l.EnumC13625a f132252d = C13624l.EnumC13625a.UNKNOWN;

    /* renamed from: e */
    public static boolean f132253e;

    /* renamed from: f */
    public static String f132254f = "";

    /* renamed from: g */
    public static NetworkUtils.EnumC29835h f132255g = NetworkUtils.EnumC29835h.NONE;

    /* renamed from: h */
    public static boolean f132256h;

    /* renamed from: i */
    public static long f132257i = -1;

    /* renamed from: j */
    public static int f132258j = -1;

    /* renamed from: k */
    public static int f132259k = -1;

    /* renamed from: l */
    public static int f132260l = -1;

    /* renamed from: a */
    public static boolean m104845a() {
        if (f132260l < 0) {
            f132260l = C46851ds.f109159c;
        }
        if (f132260l == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m104846b() {
        if (f132258j < 0) {
            f132258j = C46851ds.f109157a;
        }
        if (f132258j == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(68064);
    }

    /* renamed from: c */
    public static boolean m104847c() {
        if (f132259k < 0) {
            f132259k = C46851ds.f109158b;
        }
        if (f132259k <= 0 || System.currentTimeMillis() - f132257i <= ((long) f132259k)) {
            return false;
        }
        f132257i = System.currentTimeMillis();
        return true;
    }
}
