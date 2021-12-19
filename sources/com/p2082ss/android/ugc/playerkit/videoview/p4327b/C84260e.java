package com.p2082ss.android.ugc.playerkit.videoview.p4327b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l;
import com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62970h;
import com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62976i;
import com.p2082ss.android.ugc.playerkit.model.C84199c;

/* renamed from: com.ss.android.ugc.playerkit.videoview.b.e */
public final class C84260e implements AbstractC84256a {
    static {
        Covode.recordClassIndex(98175);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4327b.AbstractC84256a
    /* renamed from: a */
    public final AbstractC63051l mo129279a() {
        if (C84199c.f187979a.isMultiPlayer()) {
            return new C62970h(new C62976i(C84199c.f187979a.getPlayerType()));
        }
        return C84259d.f188438a.mo129280a(C84199c.f187979a.getPlayerType());
    }
}
