package com.p2082ss.android.ugc.aweme.account.login.trusted;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.account.login.trusted.g */
public final class C32104g {

    /* renamed from: a */
    public static final C32104g f76600a = new C32104g();

    private C32104g() {
    }

    static {
        Covode.recordClassIndex(38863);
    }

    /* renamed from: a */
    public static final boolean m66487a() {
        try {
            if (C16048b.m29633a().mo25412a(true, "trusted_env_login_on_new_install", 0) != 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static final boolean m66488b() {
        try {
            if (C16048b.m29633a().mo25412a(true, "trusted_env_login_on_new_install", 0) == 2) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }
}
