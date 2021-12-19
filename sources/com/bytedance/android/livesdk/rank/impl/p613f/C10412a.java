package com.bytedance.android.livesdk.rank.impl.p613f;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.rank.api.model.C10348b;
import com.bytedance.android.livesdk.rank.api.model.C10354h;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.f.a */
public final class C10412a {
    static {
        Covode.recordClassIndex(11986);
    }

    /* renamed from: a */
    public static final C10348b m18927a(C10354h hVar) {
        String str = "";
        C89219l.m154721d(hVar, str);
        User user = hVar.f25015a;
        C89219l.m154716b(user, str);
        int i = hVar.f25017c;
        long j = hVar.f25016b;
        int i2 = hVar.f25023i;
        String str2 = hVar.f25018d;
        if (str2 != null) {
            str = str2;
        }
        return new C10348b(user, i, j, i2, str);
    }
}
