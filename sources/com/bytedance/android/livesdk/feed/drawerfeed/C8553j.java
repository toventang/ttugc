package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.android.live.core.p223g.AbstractC3968a;
import com.bytedance.android.livesdk.feed.p533i.C8599ab;
import com.bytedance.android.livesdk.p643ui.AbstractC10937b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.j */
final /* synthetic */ class C8553j implements AbstractC3968a {

    /* renamed from: a */
    static final AbstractC3968a f21139a = new C8553j();

    static {
        Covode.recordClassIndex(9408);
    }

    private C8553j() {
    }

    @Override // com.bytedance.android.live.core.p223g.AbstractC3968a
    /* renamed from: a */
    public final AbstractC10937b mo9317a(ViewGroup viewGroup, Object[] objArr) {
        return new C8599ab(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bdv, viewGroup, false));
    }
}
