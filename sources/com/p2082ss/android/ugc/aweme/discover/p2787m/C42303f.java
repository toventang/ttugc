package com.p2082ss.android.ugc.aweme.discover.p2787m;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.discover.m.f */
public final class C42303f {

    /* renamed from: a */
    public static final C42303f f98543a = new C42303f();

    private C42303f() {
    }

    static {
        Covode.recordClassIndex(50246);
    }

    /* renamed from: a */
    public static boolean m84663a(User user) {
        if (user == null || !user.isEnableDirectMessage()) {
            return true;
        }
        return false;
    }
}
