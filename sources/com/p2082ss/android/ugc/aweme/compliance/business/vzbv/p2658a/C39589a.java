package com.p2082ss.android.ugc.aweme.compliance.business.vzbv.p2658a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.vzbv.a.a */
public final class C39589a {
    static {
        Covode.recordClassIndex(47300);
    }

    /* renamed from: a */
    public static void m80371a(String str) {
        C39162r.m79460a(str, new C33744d().mo59983a("confirm_content", "go_private").mo59983a("cancel_content", "skip").mo59983a("button_design", "left_right").f79943a);
    }

    /* renamed from: a */
    public static void m80372a(String str, boolean z) {
        String str2;
        if (TextUtils.equals(str, "privacy_account_setting_show")) {
            str2 = "account_privacy_show";
        } else {
            str2 = "account_privacy_confirm";
        }
        C39162r.m79460a(str2, new C33744d().mo59980a("is_register", !z ? 1 : 0).f79943a);
    }

    /* renamed from: b */
    public static void m80373b(String str, boolean z) {
        String str2;
        if (TextUtils.equals(str, "privacy_account_setting_show")) {
            str2 = "force_account_privacy_show";
        } else {
            str2 = "force_account_privacy_confirm";
        }
        C39162r.m79460a(str2, new C33744d().mo59980a("is_register", !z ? 1 : 0).f79943a);
    }
}
