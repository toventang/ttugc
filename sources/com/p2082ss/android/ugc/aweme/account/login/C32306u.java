package com.p2082ss.android.ugc.aweme.account.login;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22421p;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.account.login.u */
public final class C32306u {
    static {
        Covode.recordClassIndex(39071);
    }

    /* renamed from: a */
    public static void m66675a(boolean z) {
        C39162r.m79460a("tap_show_password", new C31376a().mo57397a("is_show", z ? 1 : 0).f75156a);
    }

    /* renamed from: a */
    public static void m66677a(boolean z, String str, String str2) {
        String str3;
        C31376a a = new C31376a().mo57397a("is_success", z ? 1 : 0);
        if (C36085cj.m73550d()) {
            str = "pop_up";
        }
        C31376a a2 = a.mo57399a("enter_method", str);
        if (C36085cj.m73550d()) {
            str3 = "existing";
        } else {
            str3 = "new";
        }
        C31376a a3 = a2.mo57399a("user_type", str3);
        if (!z && str2 != null) {
            a3.mo57399a("error_desc", str2);
        }
        C39162r.m79460a("create_password_next", a3.f75156a);
    }

    /* renamed from: a */
    public static void m66676a(boolean z, String str, C22291d<C22421p> dVar, String str2) {
        C31376a a = new C31376a().mo57397a("is_success", z ? 1 : 0);
        if (C36085cj.m73550d()) {
            str = "pop_up";
        }
        C31376a a2 = a.mo57399a("enter_method", str);
        if (dVar != null) {
            a2.mo57399a("request_id", dVar.f52712a);
            if (!z) {
                if (dVar.f52723j == null) {
                    a2.mo57399a("message", "obj null");
                } else if (((C22421p) dVar.f52723j).f53058c == null) {
                    a2.mo57399a("message", "info null");
                }
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            a2.mo57399a("error_desc", str2);
        }
        C39162r.m79460a("create_password_next", a2.f75156a);
    }

    /* renamed from: a */
    public static void m66678a(boolean z, String str, String str2, boolean z2) {
        C31376a a = new C31376a().mo57397a("is_success", z ? 1 : 0).mo57397a("suggest_flag", z2 ? 1 : 0).mo57399a("enter_method", str2);
        if (C36085cj.m73550d()) {
            str = "pop_up";
        }
        C39162r.m79460a("create_account_next", a.mo57399a("enter_from", str).f75156a);
    }
}
