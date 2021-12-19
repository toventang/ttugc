package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.android.live.core.p223g.AbstractC3968a;
import com.bytedance.android.livesdk.feed.AbstractC8654p;
import com.bytedance.android.livesdk.feed.drawerfeed.p528a.C8534a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p523a.AbstractC8491o;
import com.bytedance.android.livesdk.p643ui.AbstractC10937b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.h */
final /* synthetic */ class C8551h implements AbstractC3968a {

    /* renamed from: a */
    private final AbstractC8654p f21137a;

    static {
        Covode.recordClassIndex(9406);
    }

    C8551h(AbstractC8654p pVar) {
        this.f21137a = pVar;
    }

    @Override // com.bytedance.android.live.core.p223g.AbstractC3968a
    /* renamed from: a */
    public final AbstractC10937b mo9317a(ViewGroup viewGroup, Object[] objArr) {
        FeedDataKey feedDataKey;
        AbstractC8654p pVar = this.f21137a;
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bdr, viewGroup, false);
        C88960c cVar = null;
        if (objArr.length <= 0 || !(objArr[0] instanceof AbstractC8491o)) {
            feedDataKey = null;
        } else {
            AbstractC8491o oVar = (AbstractC8491o) objArr[0];
            feedDataKey = oVar.mo14810a();
            oVar.mo14811b();
        }
        C88960c cVar2 = (objArr.length <= 2 || !(objArr[2] instanceof C88960c)) ? null : (C88960c) objArr[2];
        C88960c cVar3 = (objArr.length <= 3 || !(objArr[3] instanceof C88960c)) ? null : (C88960c) objArr[3];
        if (objArr.length > 4 && (objArr[4] instanceof C88960c)) {
            cVar = (C88960c) objArr[4];
        }
        return new C8534a(a, feedDataKey, cVar2, cVar3, cVar, pVar, viewGroup);
    }
}
