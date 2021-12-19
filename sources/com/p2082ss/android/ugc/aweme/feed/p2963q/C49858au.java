package com.p2082ss.android.ugc.aweme.feed.p2963q;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2917f.p2918a.C47174a;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.feed.q.au */
final /* synthetic */ class C49858au implements AbstractC88433f {

    /* renamed from: a */
    private final C49857at f114938a;

    static {
        Covode.recordClassIndex(58965);
    }

    C49858au(C49857at atVar) {
        this.f114938a = atVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC49849am amVar = this.f114938a.f114935a.get();
        if (amVar != null) {
            AbstractC80747i aO = amVar.mo84707aO();
            if (aO.mo123892o()) {
                C51423a.m95791b(6, "PlayerManagerMonitor", "panel:" + amVar + ",player:" + aO + ". is playing! should not be like this!");
                C47174a.m90348a();
                C12290b.m22064a("aweme_player_monitor", new JSONObject());
            }
        }
    }
}
