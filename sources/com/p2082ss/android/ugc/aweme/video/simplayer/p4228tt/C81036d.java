package com.p2082ss.android.ugc.aweme.video.simplayer.p4228tt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63071d;
import com.p2082ss.android.ugc.aweme.player.sdk.p3554c.C63079g;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f;
import com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81026r;
import com.p2082ss.android.ugc.aweme.video.simplayer.C81014l;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.tt.d */
public final class C81036d extends AbstractC81026r {
    static {
        Covode.recordClassIndex(94355);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81026r
    /* renamed from: a */
    public final AbstractC81002f mo124479a() {
        C63071d iSimPlayerPlaySessionConfig = C80716a.C80717a.f180462a.mo123864a().getISimPlayerPlaySessionConfig(this.f181139a);
        C81014l.C81015a aVar = new C81014l.C81015a();
        aVar.f181093a.f181092a = this.f181141c;
        return new C81035c(new C63079g(iSimPlayerPlaySessionConfig), this.f181140b, aVar.f181093a);
    }
}
