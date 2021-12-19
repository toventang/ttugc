package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.base.model.user.h */
public final class C3002h implements AbstractC2724b<User.C2991a> {
    static {
        Covode.recordClassIndex(3464);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ User.C2991a mo7304a(C2730f fVar) {
        return m8312b(fVar);
    }

    /* renamed from: b */
    public static User.C2991a m8312b(C2730f fVar) {
        User.C2991a aVar = new User.C2991a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f8810a = C2977f.m8301b(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f8811b = fVar.mo7314f();
            }
        }
    }
}
