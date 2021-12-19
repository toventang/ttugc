package com.p2082ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.er */
public final class C71814er {

    /* renamed from: a */
    public static final C71814er f160953a = new C71814er();

    private C71814er() {
    }

    static {
        Covode.recordClassIndex(84359);
    }

    /* renamed from: a */
    public static final String m126787a(User user) {
        String uniqueId;
        C89219l.m154721d(user, "");
        if (TextUtils.isEmpty(user.getUniqueId())) {
            uniqueId = user.getShortId();
        } else {
            uniqueId = user.getUniqueId();
        }
        C89219l.m154716b(uniqueId, "");
        return uniqueId;
    }
}
