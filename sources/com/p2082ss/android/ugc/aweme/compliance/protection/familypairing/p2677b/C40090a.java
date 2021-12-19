package com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.p2677b;

import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import java.nio.charset.Charset;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.familypairing.b.a */
public final class C40090a {
    static {
        Covode.recordClassIndex(47866);
    }

    /* renamed from: a */
    public static final String m81076a(String str) {
        boolean z;
        C89219l.m154721d(str, "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        if (TextUtils.isEmpty(curUserId)) {
            return "";
        }
        try {
            String b = C13607d.m24442b(curUserId + ':' + str);
            C89219l.m154716b(curUserId, "");
            Charset charset = C89338d.f202990a;
            if (curUserId != null) {
                byte[] bytes = curUserId.getBytes(charset);
                C89219l.m154716b(bytes, "");
                SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "HmacSHA256");
                Mac instance = Mac.getInstance("HmacSHA256");
                instance.init(secretKeySpec);
                C89219l.m154716b(b, "");
                Charset charset2 = C89338d.f202990a;
                if (b != null) {
                    byte[] bytes2 = b.getBytes(charset2);
                    C89219l.m154716b(bytes2, "");
                    String a = C13607d.m24439a(instance.doFinal(bytes2));
                    C89219l.m154716b(a, "");
                    return a;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            return "";
        }
    }
}
