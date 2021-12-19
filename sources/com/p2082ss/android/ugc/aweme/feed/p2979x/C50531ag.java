package com.p2082ss.android.ugc.aweme.feed.p2979x;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50323k;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.x.ag */
public final class C50531ag {

    /* renamed from: a */
    public static HashMap<String, Boolean> f116795a = new HashMap<>();

    /* renamed from: b */
    public static HashMap<String, C50323k.EnumC50325b> f116796b = new HashMap<>();

    /* renamed from: c */
    public static final C50531ag f116797c = new C50531ag();

    /* renamed from: d */
    private static HashMap<String, Boolean> f116798d = new HashMap<>();

    private C50531ag() {
    }

    static {
        Covode.recordClassIndex(59678);
    }

    /* renamed from: b */
    public static C50323k.EnumC50325b m94721b(String str) {
        if (str == null) {
            return null;
        }
        return f116796b.get(str);
    }

    /* renamed from: c */
    public static void m94722c(String str) {
        if (str != null) {
            f116798d.put(str, true);
        }
    }

    /* renamed from: a */
    public static boolean m94720a(String str) {
        Boolean bool;
        if (str == null || (bool = f116795a.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: d */
    public static boolean m94723d(String str) {
        Boolean bool;
        if (str == null || (bool = f116798d.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
