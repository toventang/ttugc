package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.android.live.core.p223g.AbstractC3968a;
import com.bytedance.android.livesdk.feed.p523a.AbstractC8491o;
import com.bytedance.android.livesdk.feed.p533i.C8614m;
import com.bytedance.android.livesdk.p643ui.AbstractC10937b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.k */
final /* synthetic */ class C8554k implements AbstractC3968a {

    /* renamed from: a */
    static final AbstractC3968a f21140a = new C8554k();

    static {
        Covode.recordClassIndex(9409);
    }

    private C8554k() {
    }

    @Override // com.bytedance.android.live.core.p223g.AbstractC3968a
    /* renamed from: a */
    public final AbstractC10937b mo9317a(ViewGroup viewGroup, Object[] objArr) {
        return new C8614m(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b9w, viewGroup, false), (objArr.length <= 0 || !(objArr[0] instanceof AbstractC8491o)) ? null : ((AbstractC8491o) objArr[0]).mo14811b());
    }
}
