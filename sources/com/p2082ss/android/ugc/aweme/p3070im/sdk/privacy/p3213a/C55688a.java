package com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3213a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.a.a */
public final class C55688a {

    /* renamed from: a */
    public static final C55688a f127034a = new C55688a();

    private C55688a() {
    }

    static {
        Covode.recordClassIndex(65471);
    }

    /* renamed from: a */
    public static String m101442a(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "everyone";
            }
            if (num.intValue() == 2) {
                return "friends";
            }
            if (num.intValue() == 3) {
                return "no_one";
            }
        }
        return "chat_set value ".concat(String.valueOf(num));
    }
}
