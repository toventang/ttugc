package com.bytedance.android.livesdk.rank.impl.ranks;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.rank.impl.api.model.C10368e;
import com.bytedance.android.livesdk.rank.impl.api.model.C10369f;
import com.bytedance.android.livesdk.rank.impl.api.model.EnumC10370g;
import com.bytedance.android.livesdk.rank.impl.p611d.C10387b;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.i */
public final /* synthetic */ class C10549i implements AbstractC88433f {

    /* renamed from: a */
    private final C10546f f25369a;

    static {
        Covode.recordClassIndex(12124);
    }

    C10549i(C10546f fVar) {
        this.f25369a = fVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C10546f fVar = this.f25369a;
        C5832d dVar = (C5832d) obj;
        if (dVar == null || dVar.data == null || ((C10369f) dVar.data).f25056a == null || ((C10369f) dVar.data).f25056a.isEmpty()) {
            fVar.mo17373a(-1, (String) null, (String) null, "score_display_config_empty");
            return;
        }
        Iterator<C10368e> it = ((C10369f) dVar.data).f25056a.iterator();
        while (it.hasNext()) {
            C10368e next = it.next();
            if (next.f25053a == EnumC10370g.HOURLY_RANK_ENTRANCE.getValue()) {
                C10387b.m18895a().f25071a = next;
            } else if (next.f25053a == EnumC10370g.HOURLY_RANK_LIST.getValue()) {
                C10387b.m18895a().f25072b = next;
            } else if (next.f25053a == EnumC10370g.HOURLY_RANK_BOTTOM.getValue()) {
                C10387b.m18895a().f25073c = next;
            }
        }
    }
}
