package com.p2082ss.android.ugc.aweme.profile.p3575f;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.f.y */
public final class C63803y {

    /* renamed from: a */
    public static final C63803y f144625a = new C63803y();

    private C63803y() {
    }

    static {
        Covode.recordClassIndex(75131);
    }

    /* renamed from: a */
    public static void m115395a(int i, int i2, String str) {
        String str2;
        if (i2 == 1) {
            str2 = "personal_homepage";
        } else if (i2 != 2) {
            str2 = "edit_profile_page";
        } else {
            str2 = "modify_username_notify";
        }
        m115398b(i, str2, str);
    }

    /* renamed from: a */
    public static void m115396a(int i, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("modify_username_confirm", new C33744d().mo59983a("enter_from", str).mo59980a("status", i).mo59983a("click_method", str2).f79943a);
    }

    /* renamed from: b */
    public static void m115398b(int i, String str, String str2) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("save_username", new C33744d().mo59983a("enter_from", str).mo59980a("status", i).mo59983a("error_code", str2).f79943a);
    }

    /* renamed from: a */
    public static void m115397a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C39162r.m79460a(str, new C33744d().mo59983a(StringSet.type, str3).mo59983a("enter_method", str2).f79943a);
    }
}
