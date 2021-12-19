package com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3210c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1210a.C17418c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.c.a */
public final class C55641a {
    static {
        Covode.recordClassIndex(65423);
    }

    /* renamed from: a */
    public static final C17418c m101385a(User user) {
        C89219l.m154721d(user, "");
        C17418c cVar = new C17418c();
        cVar.f41775a = user.getUid();
        cVar.f41776b = user.getSecUid();
        return cVar;
    }
}
