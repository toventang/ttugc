package com.bytedance.android.livesdk.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.model.bm */
public final class C9556bm implements AbstractC2724b<FansClubMember> {
    static {
        Covode.recordClassIndex(11095);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ FansClubMember mo7304a(C2730f fVar) {
        return m17867b(fVar);
    }

    /* renamed from: b */
    public static FansClubMember m17867b(C2730f fVar) {
        FansClubMember fansClubMember = new FansClubMember();
        fansClubMember.preferData = new HashMap();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return fansClubMember;
            } else if (b == 1) {
                fansClubMember.data = C9554bk.m17863b(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                long a2 = fVar.mo7307a();
                Integer num = null;
                FansClubData fansClubData = null;
                while (true) {
                    int b2 = fVar.mo7310b();
                    if (b2 == -1) {
                        break;
                    } else if (b2 == 1) {
                        num = Integer.valueOf(fVar.mo7313e());
                    } else if (b2 == 2) {
                        fansClubData = C9554bk.m17863b(fVar);
                    }
                }
                fVar.mo7309a(a2);
                if (num == null) {
                    throw new IllegalStateException("Map key must not be null!");
                } else if (fansClubData != null) {
                    fansClubMember.preferData.put(num, fansClubData);
                } else {
                    throw new IllegalStateException("Map value must not be null!");
                }
            }
        }
    }
}
