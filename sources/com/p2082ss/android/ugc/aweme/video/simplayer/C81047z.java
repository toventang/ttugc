package com.p2082ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.video.simplayer.z */
public final /* synthetic */ class C81047z implements AbstractC84179d {

    /* renamed from: a */
    private final C84241i f181166a;

    static {
        Covode.recordClassIndex(94366);
    }

    C81047z(C84241i iVar) {
        this.f181166a = iVar;
    }

    @Override // com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d
    /* renamed from: a */
    public final Object mo124484a() {
        return Boolean.valueOf(C80716a.C80717a.f180462a.mo123864a().isCache(this.f181166a));
    }
}
