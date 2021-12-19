package com.p2082ss.android.ugc.aweme.player.sdk;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.a */
public final class C62960a {

    /* renamed from: a */
    public static boolean f142907a;

    /* renamed from: b */
    public static AbstractC62961a f142908b;

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.a$a */
    public interface AbstractC62961a {
        static {
            Covode.recordClassIndex(73798);
        }

        /* renamed from: a */
        void mo100941a(String str, String str2);

        /* renamed from: a */
        void mo100942a(Throwable th, String str);
    }

    static {
        Covode.recordClassIndex(73797);
    }

    /* renamed from: a */
    public static void m113384a(String str) {
        AbstractC62961a aVar = f142908b;
        if (aVar != null) {
            aVar.mo100941a("PlayerLog", str);
        }
    }

    /* renamed from: b */
    private static void m113388b(String str) {
        AbstractC62961a aVar = f142908b;
        if (aVar != null) {
            aVar.mo100941a("PlayerLog", str);
        }
    }

    /* renamed from: a */
    public static void m113387a(Throwable th, String str) {
        AbstractC62961a aVar = f142908b;
        if (aVar != null) {
            aVar.mo100942a(th, str);
        }
    }

    /* renamed from: a */
    public static void m113385a(String str, String str2) {
        if (f142907a) {
            m113384a(str + ", " + str2);
        }
    }

    /* renamed from: b */
    public static void m113389b(String str, String str2) {
        if (f142907a) {
            m113388b(str + ", " + str2);
        }
    }

    /* renamed from: a */
    public static void m113386a(String str, Throwable th) {
        while (f142907a) {
            if (th != null) {
                str = "PlayerLog" + ", " + str;
            } else {
                m113388b("PlayerLog" + ", " + str);
                return;
            }
        }
    }
}
