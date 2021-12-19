package com.p2082ss.android.ugc.aweme.shortcut;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortcut.d */
public final class C69711d {

    /* renamed from: a */
    static final Keva f155618a;

    /* renamed from: b */
    static long f155619b;

    /* renamed from: c */
    public static final C69711d f155620c = new C69711d();

    /* renamed from: d */
    private static long f155621d;

    /* renamed from: e */
    private static boolean f155622e;

    private C69711d() {
    }

    /* renamed from: a */
    public static long m123120a() {
        return f155618a.getLong("key_withdrawal_num", 0);
    }

    static {
        Covode.recordClassIndex(82089);
        Keva repo = Keva.getRepo("shortcut_keva");
        C89219l.m154716b(repo, "");
        f155618a = repo;
    }

    /* renamed from: a */
    public static void m123121a(long j) {
        f155621d = j;
        f155618a.storeLong("key_withdrawal_num", j);
    }

    /* renamed from: a */
    public static void m123122a(boolean z) {
        f155622e = z;
        f155618a.storeBoolean("key_last_login_state", z);
    }
}
