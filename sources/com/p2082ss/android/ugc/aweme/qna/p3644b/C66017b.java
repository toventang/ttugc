package com.p2082ss.android.ugc.aweme.qna.p3644b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.b.b */
public final class C66017b {
    static {
        Covode.recordClassIndex(77523);
    }

    /* renamed from: a */
    public static final boolean m117828a(String str) {
        C89219l.m154721d(str, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return TextUtils.equals(str, g.getCurUserId());
    }
}
