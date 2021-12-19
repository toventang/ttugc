package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.live.base.model.user.i */
public final class C3003i implements AbstractC2724b<User.C2992b> {
    static {
        Covode.recordClassIndex(3465);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ User.C2992b mo7304a(C2730f fVar) {
        return m8314b(fVar);
    }

    /* renamed from: b */
    public static User.C2992b m8314b(C2730f fVar) {
        User.C2992b bVar = new User.C2992b();
        bVar.f8812a = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                bVar.f8812a.add(Long.valueOf(C2731g.m7902b(fVar)));
            }
        }
    }
}
