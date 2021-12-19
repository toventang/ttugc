package com.p2082ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.y */
public final /* synthetic */ class C81046y implements AbstractC84179d {

    /* renamed from: a */
    private final String f181164a;

    /* renamed from: b */
    private final AbstractC63057c f181165b;

    static {
        Covode.recordClassIndex(94365);
    }

    public C81046y(String str, AbstractC63057c cVar) {
        this.f181164a = str;
        this.f181165b = cVar;
    }

    @Override // com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d
    /* renamed from: a */
    public final Object mo124484a() {
        return C80716a.C80717a.f180462a.mo123864a().getProperResolution(this.f181164a, this.f181165b);
    }
}
