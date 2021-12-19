package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.android.live.core.p223g.AbstractC3968a;
import com.bytedance.android.livesdk.feed.AbstractC8593h;
import com.bytedance.android.livesdk.feed.AbstractC8643m;
import com.bytedance.android.livesdk.feed.dislike.C8527a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p523a.AbstractC8491o;
import com.bytedance.android.livesdk.feed.p533i.C8620p;
import com.bytedance.android.livesdk.p643ui.AbstractC10937b;
import com.bytedance.android.livesdkapi.p691g.AbstractC11767g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.g */
final /* synthetic */ class C8550g implements AbstractC3968a {

    /* renamed from: a */
    private final C8527a f21133a;

    /* renamed from: b */
    private final AbstractC8593h f21134b;

    /* renamed from: c */
    private final AbstractC8643m f21135c;

    /* renamed from: d */
    private final AbstractC11767g f21136d;

    static {
        Covode.recordClassIndex(9405);
    }

    C8550g(C8527a aVar, AbstractC8593h hVar, AbstractC8643m mVar, AbstractC11767g gVar) {
        this.f21133a = aVar;
        this.f21134b = hVar;
        this.f21135c = mVar;
        this.f21136d = gVar;
    }

    @Override // com.bytedance.android.live.core.p223g.AbstractC3968a
    /* renamed from: a */
    public final AbstractC10937b mo9317a(ViewGroup viewGroup, Object[] objArr) {
        AbstractC8593h hVar = this.f21134b;
        AbstractC8643m mVar = this.f21135c;
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b9t, viewGroup, false);
        C88960c cVar = null;
        FeedDataKey a2 = (objArr.length <= 0 || !(objArr[0] instanceof AbstractC8491o)) ? null : ((AbstractC8491o) objArr[0]).mo14810a();
        C88960c cVar2 = (objArr.length <= 2 || !(objArr[2] instanceof C88960c)) ? null : (C88960c) objArr[2];
        if (objArr.length > 3 && (objArr[3] instanceof C88960c)) {
            cVar = (C88960c) objArr[3];
        }
        return new C8620p(a, hVar, a2, mVar, cVar2, cVar);
    }
}
