package com.bytedance.android.livesdk.model.message.p579c;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.c.q */
public final class C9715q implements AbstractC2724b<C9700d> {
    static {
        Covode.recordClassIndex(11257);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9700d mo7304a(C2730f fVar) {
        return m18008b(fVar);
    }

    /* renamed from: b */
    public static C9700d m18008b(C2730f fVar) {
        C9700d dVar = new C9700d();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return dVar;
            } else if (b == 1) {
                dVar.f23657a = fVar.mo7313e();
            } else if (b == 2) {
                dVar.f23658b = C9709k.m17996b(fVar);
            } else if (b != 11) {
                switch (b) {
                    case 21:
                        dVar.f23660d = C9714p.m18006b(fVar);
                        continue;
                    case 22:
                        dVar.f23661e = C9710l.m17998b(fVar);
                        continue;
                    case 23:
                        dVar.f23662f = C9711m.m18000b(fVar);
                        continue;
                    case 24:
                        dVar.f23663g = C9713o.m18004b(fVar);
                        continue;
                    case 25:
                        dVar.f23664h = C9712n.m18002b(fVar);
                        continue;
                    default:
                        C2731g.m7903c(fVar);
                        continue;
                }
            } else {
                dVar.f23659c = fVar.mo7312d();
            }
        }
    }
}
