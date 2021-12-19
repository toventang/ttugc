package com.p2082ss.android.ugc.aweme.discover.p2766b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2395bk.C34883a;

/* renamed from: com.ss.android.ugc.aweme.discover.b.a */
public final class C41857a {

    /* renamed from: a */
    public static int f97656a;

    /* renamed from: b */
    public static final C41857a f97657b = new C41857a();

    /* renamed from: c */
    private static int f97658c;

    private C41857a() {
    }

    /* renamed from: a */
    public static boolean m83848a() {
        if (f97656a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m83849b() {
        if (((Number) C41888i.f97730a.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }

    static {
        int i;
        Covode.recordClassIndex(49783);
        if (C41886h.m83907a() == 5) {
            i = 1;
        } else {
            i = 0;
        }
        f97658c = i;
        f97656a = i;
        C34883a aVar = C34883a.f82329a;
        f97656a = aVar.f82330b.getInt("key_search_auto_play_sound", f97658c);
    }
}
