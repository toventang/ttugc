package com.p2082ss.android.ugc.aweme.account;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.account.e */
public final class C31633e {

    /* renamed from: a */
    public static final C31633e f75669a = new C31633e();

    private C31633e() {
    }

    static {
        Covode.recordClassIndex(38362);
    }

    /* renamed from: a */
    public static final String m65943a() {
        try {
            Object a = SettingsManager.m29616a().mo25396a("delete_account_entrance_urls", C31666f.class);
            if (!(a instanceof C31666f)) {
                a = null;
            }
            C31666f fVar = (C31666f) a;
            if (fVar == null) {
                return "";
            }
            String ftc = fVar.getFtc();
            if (ftc == null) {
                return "";
            }
            return ftc;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static final String m65944b() {
        try {
            Object a = SettingsManager.m29616a().mo25396a("delete_account_entrance_urls", C31666f.class);
            if (!(a instanceof C31666f)) {
                a = null;
            }
            C31666f fVar = (C31666f) a;
            if (fVar == null) {
                return "";
            }
            String normal = fVar.getNormal();
            if (normal == null) {
                return "";
            }
            return normal;
        } catch (Throwable unused) {
            return "";
        }
    }
}
