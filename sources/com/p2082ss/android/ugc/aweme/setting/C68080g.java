package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.g */
public final class C68080g {

    /* renamed from: a */
    public static final String f152474a = "";

    /* renamed from: b */
    public static final C68080g f152475b = new C68080g();

    private C68080g() {
    }

    static {
        Covode.recordClassIndex(80276);
    }

    /* renamed from: a */
    public static final String m120377a() {
        String str;
        try {
            str = SettingsManager.m29616a().mo25398a("creator_fund_setting_entry_schema", "");
            C89219l.m154716b(str, "");
        } catch (Throwable th) {
            C51423a.m95787a("creator_fund_investigate action = creator_fund_setting_entry_schema_error, throwable = " + th.getMessage());
            str = f152474a;
        }
        C51423a.m95787a("creator_fund_investigate action = creator_fund_setting_entry_schema, content = ".concat(String.valueOf(str)));
        return str;
    }
}
