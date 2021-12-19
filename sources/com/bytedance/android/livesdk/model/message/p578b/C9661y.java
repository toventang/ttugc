package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.b.y */
public final class C9661y implements AbstractC2724b<C9645j> {
    static {
        Covode.recordClassIndex(11203);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9645j mo7304a(C2730f fVar) {
        return m17977b(fVar);
    }

    /* renamed from: b */
    public static C9645j m17977b(C2730f fVar) {
        C9645j jVar = new C9645j();
        jVar.f23500b = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return jVar;
            } else if (b == 1) {
                jVar.f23500b.add(C9662z.m17979b(fVar));
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                jVar.f23499a = (int) C2731g.m7902b(fVar);
            }
        }
    }
}
