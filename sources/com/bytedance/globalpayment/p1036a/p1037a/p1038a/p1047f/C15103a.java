package com.bytedance.globalpayment.p1036a.p1037a.p1038a.p1047f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.p1036a.p1037a.p1038a.C15074a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;

/* renamed from: com.bytedance.globalpayment.a.a.a.f.a */
public final class C15103a {
    static {
        Covode.recordClassIndex(17271);
    }

    /* renamed from: a */
    public static String m27768a(String str, String... strArr) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String a = C15074a.m27751a().mo24347c().mo24355a(C15253a.m28071a().mo24709i().mo24718g(), str);
        C15253a.m28071a().mo24706f();
        if (a == null || !a.contains("{the_field}") || strArr.length <= 0) {
            return a;
        }
        return a.replace("{the_field}", C15074a.m27751a().mo24347c().mo24355a(C15253a.m28071a().mo24709i().mo24718g(), strArr[0]));
    }
}
