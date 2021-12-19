package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.y */
public final class C41424y {

    /* renamed from: a */
    public static final C41425a f96627a = new C41425a((byte) 0);

    static {
        Covode.recordClassIndex(49319);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.y$a */
    public static final class C41425a {
        static {
            Covode.recordClassIndex(49320);
        }

        private C41425a() {
        }

        /* renamed from: a */
        static boolean m83330a() {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                return true;
            }
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            User curUser = g2.getCurUser();
            C89219l.m154716b(curUser, "");
            if (curUser.getCommerceUserLevel() <= 0) {
                return true;
            }
            return false;
        }

        public /* synthetic */ C41425a(byte b) {
            this();
        }

        /* renamed from: a */
        public static Object m83329a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }
    }
}
