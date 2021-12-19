package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2282ad.p2291e.C33197a;
import com.p2082ss.android.ugc.aweme.p2282ad.utils.C33391a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.am */
public final class C38635am {

    /* renamed from: a */
    public static final C38635am f91295a = new C38635am();

    private C38635am() {
    }

    static {
        Covode.recordClassIndex(46176);
    }

    /* renamed from: a */
    public static final List<String> m78395a(String str) {
        C89219l.m154721d(str, "");
        if (TextUtils.equals(str, "splash") || TextUtils.equals(str, "topview")) {
            C33197a a = C33391a.m68473a();
            if (a != null) {
                return a.getSplashAdAutoJumpAllowList();
            }
            return null;
        }
        C33197a a2 = C33391a.m68473a();
        if (a2 != null) {
            return a2.getAutoJumpAllowList();
        }
        return null;
    }
}
