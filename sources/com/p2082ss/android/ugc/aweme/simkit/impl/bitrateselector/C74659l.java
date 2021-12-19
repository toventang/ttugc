package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e;
import com.p2082ss.android.ugc.aweme.simkit.model.p3913b.C74677b;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.l */
public final class C74659l implements AbstractC63032b {
    static {
        Covode.recordClassIndex(87482);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63033c
    /* renamed from: a */
    public final void mo101043a(int i, int i2, C63059e.C63060a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b
    /* renamed from: b */
    public final boolean mo101045b(int i, int i2, C63059e eVar) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63032b
    /* renamed from: a */
    public final boolean mo101044a(int i, int i2, C63059e eVar) {
        if (!(eVar == null || eVar.f143241f || eVar.f143243h == null || !C84191b.m144775b() || eVar.f143243h.size() <= 0)) {
            eVar.f143243h.size();
            ArrayList arrayList = new ArrayList();
            List<C63059e.C63060a> list = eVar.f143243h;
            C89219l.m154709a((Object) list, "");
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C63059e.C63060a aVar = eVar.f143243h.get(i3);
                if (C74677b.m131141a(aVar.f143254c, aVar.f143253b) <= 540) {
                    C89219l.m154709a((Object) aVar, "");
                    arrayList.add(aVar);
                }
            }
            if (arrayList.size() != 0) {
                eVar.f143243h = arrayList;
            }
            eVar.f143243h.size();
        }
        return false;
    }
}
