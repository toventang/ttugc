package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.b */
public final class C39745b {

    /* renamed from: a */
    public static final C39745b f93595a = new C39745b();

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.b$a */
    public static final class C39746a {

        /* renamed from: a */
        public static final C39746a f93596a = new C39746a();

        private C39746a() {
        }

        static {
            Covode.recordClassIndex(47475);
        }

        /* renamed from: a */
        public static void m80626a(int i) {
            String str;
            C33744d a = new C33744d().mo59983a("enter_from", "download_permission");
            if (i == 0) {
                str = "on";
            } else {
                str = "off";
            }
            C39162r.m79460a("change_download_permission", a.mo59983a("to_status", str).mo59980a("is_private", C39631a.m80486b() ? 1 : 0).f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.b$b */
    public static final class C39747b {

        /* renamed from: a */
        public static final C39747b f93597a = new C39747b();

        private C39747b() {
        }

        static {
            Covode.recordClassIndex(47476);
        }

        /* renamed from: a */
        public static void m80627a(int i) {
            String str;
            if (i == 0) {
                str = "Everyone";
            } else if (i == 1) {
                str = "Friends";
            } else if (i != 3) {
                str = null;
            } else {
                str = "Only_me";
            }
            C39162r.m79460a("change_duet_permission", new C33744d().mo59983a("enter_from", "duet_permission").mo59983a("to_status", str).mo59980a("is_private", C39631a.m80486b() ? 1 : 0).f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.b$c */
    public static final class C39748c {

        /* renamed from: a */
        public static final C39748c f93598a = new C39748c();

        /* renamed from: a */
        public static String m80628a(int i) {
            return i != 1 ? i != 3 ? i != 4 ? i != 5 ? "" : "no_one" : "friends" : "following" : "everyone";
        }

        private C39748c() {
        }

        static {
            Covode.recordClassIndex(47477);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.b$d */
    public static final class C39749d {

        /* renamed from: a */
        public static final C39749d f93599a = new C39749d();

        private C39749d() {
        }

        static {
            Covode.recordClassIndex(47478);
        }

        /* renamed from: a */
        public static void m80629a(int i) {
            String str;
            if (i == 0) {
                str = "Everyone";
            } else if (i == 1) {
                str = "Friends";
            } else if (i != 3) {
                str = null;
            } else {
                str = "Only_me";
            }
            C39162r.m79460a("change_stitch_permission", new C33744d().mo59983a("enter_from", "stitch_permission").mo59983a("to_status", str).mo59980a("is_private", C39631a.m80486b() ? 1 : 0).f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.b$e */
    public static final class C39750e {

        /* renamed from: a */
        public static final C39750e f93600a = new C39750e();

        private C39750e() {
        }

        static {
            Covode.recordClassIndex(47479);
        }

        /* renamed from: a */
        public static void m80630a(String str) {
            C89219l.m154721d(str, "");
            C39162r.m79460a("account_auth_platform_click", new C33744d().mo59983a("account_type", str).f79943a);
        }

        /* renamed from: a */
        public static void m80631a(String str, boolean z) {
            String str2;
            C89219l.m154721d(str, "");
            C33744d a = new C33744d().mo59983a("account_type", str);
            if (z) {
                str2 = "ok";
            } else {
                str2 = "cancel";
            }
            C39162r.m79460a("account_auth_pop_up_confirm", a.mo59983a("result", str2).f79943a);
        }
    }

    private C39745b() {
    }

    static {
        Covode.recordClassIndex(47474);
    }
}
