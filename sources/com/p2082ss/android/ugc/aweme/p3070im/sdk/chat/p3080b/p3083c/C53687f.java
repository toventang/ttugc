package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.f */
public final class C53687f {

    /* renamed from: a */
    public static final C53687f f123193a = new C53687f();

    private C53687f() {
    }

    static {
        Covode.recordClassIndex(63267);
    }

    /* renamed from: a */
    public static final void m98955a(IMUser iMUser, String str, Integer num, String str2) {
        int i;
        C89219l.m154721d(str2, "");
        if (iMUser != null) {
            try {
                if (TextUtils.isEmpty(iMUser.getUid())) {
                    HashMap hashMap = new HashMap();
                    String iMUser2 = iMUser.toString();
                    C89219l.m154716b(iMUser2, "");
                    hashMap.put("user", iMUser2);
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -1;
                    }
                    hashMap.put("key_enter_from", Integer.valueOf(i));
                    if (str == null) {
                        str = "empty";
                    }
                    hashMap.put("conversation_id", str);
                    hashMap.put("error_msg", str2);
                    C55197c.m100920b("empty_user", hashMap);
                }
            } catch (Exception e) {
                C51423a.m95786a(e);
            }
        }
    }
}
