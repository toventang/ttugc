package com.p2082ss.android.ugc.aweme.friends.p3014d;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80408et;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.d.a */
public final class C51486a {

    /* renamed from: a */
    public static final C51486a f118671a = new C51486a();

    private C51486a() {
    }

    static {
        Covode.recordClassIndex(60751);
    }

    /* renamed from: a */
    private static Keva m95901a() {
        StringBuilder sb = new StringBuilder();
        User b = C80580in.m139683b();
        C89219l.m154716b(b, "");
        return Keva.getRepo(sb.append(b.getUid()).append("_friends_state_repo").toString());
    }

    /* renamed from: a */
    public static final void m95902a(String str) {
        C89219l.m154721d(str, "");
        m95901a().storeLong(C80408et.m139388a(str), System.currentTimeMillis());
    }

    /* renamed from: b */
    public static final boolean m95903b(String str) {
        boolean z;
        C89219l.m154721d(str, "");
        String a = C80408et.m139388a(str);
        long j = m95901a().getLong(a, -1);
        if (j == -1) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis > 86400000 || currentTimeMillis < 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = true ^ z;
        if (z2) {
            m95901a().erase(a);
        }
        return z2;
    }
}
