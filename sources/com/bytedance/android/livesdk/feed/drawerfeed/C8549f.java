package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.android.live.core.p223g.AbstractC3968a;
import com.bytedance.android.livesdk.feed.AbstractC8593h;
import com.bytedance.android.livesdk.feed.AbstractC8643m;
import com.bytedance.android.livesdk.feed.dislike.C8527a;
import com.bytedance.android.livesdk.feed.drawerfeed.p528a.C8543j;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p523a.AbstractC8491o;
import com.bytedance.android.livesdk.p643ui.AbstractC10937b;
import com.bytedance.android.livesdkapi.p691g.AbstractC11767g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.f */
final /* synthetic */ class C8549f implements AbstractC3968a {

    /* renamed from: a */
    private final C8527a f21129a;

    /* renamed from: b */
    private final AbstractC8593h f21130b;

    /* renamed from: c */
    private final AbstractC8643m f21131c;

    /* renamed from: d */
    private final AbstractC11767g f21132d;

    static {
        Covode.recordClassIndex(9404);
    }

    C8549f(C8527a aVar, AbstractC8593h hVar, AbstractC8643m mVar, AbstractC11767g gVar) {
        this.f21129a = aVar;
        this.f21130b = hVar;
        this.f21131c = mVar;
        this.f21132d = gVar;
    }

    @Override // com.bytedance.android.live.core.p223g.AbstractC3968a
    /* renamed from: a */
    public final AbstractC10937b mo9317a(ViewGroup viewGroup, Object[] objArr) {
        C8527a aVar = this.f21129a;
        AbstractC8593h hVar = this.f21130b;
        AbstractC8643m mVar = this.f21131c;
        AbstractC11767g gVar = this.f21132d;
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b9p, viewGroup, false);
        C88960c cVar = null;
        FeedDataKey a2 = (objArr.length <= 0 || !(objArr[0] instanceof AbstractC8491o)) ? null : ((AbstractC8491o) objArr[0]).mo14810a();
        C88960c cVar2 = (objArr.length <= 1 || !(objArr[1] instanceof C88960c)) ? null : (C88960c) objArr[1];
        C88960c cVar3 = (objArr.length <= 2 || !(objArr[2] instanceof C88960c)) ? null : (C88960c) objArr[2];
        C88960c cVar4 = (objArr.length <= 3 || !(objArr[3] instanceof C88960c)) ? null : (C88960c) objArr[3];
        if (objArr.length > 4 && (objArr[4] instanceof C88960c)) {
            cVar = (C88960c) objArr[4];
        }
        return new C8543j(a, aVar, hVar, a2, mVar, gVar, cVar2, cVar, cVar3, cVar4, viewGroup);
    }
}
