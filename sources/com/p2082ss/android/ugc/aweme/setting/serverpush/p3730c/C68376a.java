package com.p2082ss.android.ugc.aweme.setting.serverpush.p3730c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79705a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.c.a */
public final class C68376a {

    /* renamed from: a */
    public static final C68376a f153026a = new C68376a();

    private C68376a() {
    }

    static {
        Covode.recordClassIndex(80604);
    }

    /* renamed from: a */
    public static boolean m120654a() {
        if (!C79705a.m138533a() || C80580in.m139687c()) {
            return false;
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m120655b() {
        if (C79705a.m138534b()) {
            String b = C34722h.m70923b(R.string.f6r);
            C89219l.m154716b(b, "");
            return b;
        } else if (!C79705a.m138535c()) {
            return "";
        } else {
            String b2 = C34722h.m70923b(R.string.fb3);
            C89219l.m154716b(b2, "");
            return b2;
        }
    }
}
