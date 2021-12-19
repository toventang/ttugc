package com.p2082ss.android.ugc.aweme.account.agegate.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.util.c */
public final class C31555c {

    /* renamed from: a */
    public static final C31555c f75486a = new C31555c();

    private C31555c() {
    }

    static {
        Covode.recordClassIndex(38274);
    }

    /* renamed from: a */
    public static void m65836a(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("age_gate_logout", new C31376a().mo57399a("action", str).f75156a);
    }

    /* renamed from: b */
    public static void m65837b(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("age_gate_download_videos", new C31376a().mo57399a("action", str).f75156a);
    }

    /* renamed from: c */
    public static void m65838c(String str) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("age_gate_confirm_not_download", new C31376a().mo57399a("action", str).f75156a);
    }
}
