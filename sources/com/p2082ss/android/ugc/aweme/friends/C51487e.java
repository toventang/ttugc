package com.p2082ss.android.ugc.aweme.friends;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.friends.e */
public final class C51487e {

    /* renamed from: a */
    public static final C51487e f118672a = new C51487e();

    private C51487e() {
    }

    static {
        Covode.recordClassIndex(60752);
    }

    /* renamed from: a */
    public static int m95904a() {
        return C16048b.m29633a().mo25412a(true, "display_mutual_connections", 0);
    }

    /* renamed from: b */
    public static boolean m95905b() {
        int a = m95904a();
        if (a == 1 || a == 2 || a == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static String m95906c() {
        if (m95904a() != 2) {
            return "0";
        }
        return "1";
    }

    /* renamed from: d */
    public static int m95907d() {
        int a = m95904a();
        if (a != 1) {
            if (a == 2) {
                return 4;
            }
            if (a != 3) {
                return 0;
            }
        }
        return 2;
    }

    /* renamed from: e */
    public static int m95908e() {
        int a = m95904a();
        if (a != 1) {
            if (a == 2) {
                return 4;
            }
            if (a != 3) {
                return 0;
            }
        }
        return 1;
    }
}
