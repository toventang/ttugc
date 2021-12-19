package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.scheduler.AbstractC67290d;
import com.p2082ss.android.ugc.aweme.scheduler.C67295g;
import com.p2082ss.android.ugc.aweme.scheduler.C67296h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.fa */
public final /* synthetic */ class C73664fa implements AbstractC67290d {

    /* renamed from: a */
    private final Bundle f165498a;

    static {
        Covode.recordClassIndex(86402);
    }

    C73664fa(Bundle bundle) {
        this.f165498a = bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.scheduler.AbstractC67290d
    /* renamed from: a */
    public final void mo106126a() {
        Bundle bundle = this.f165498a;
        if (C67296h.m119246f() == 0) {
            C67295g.m119228a("PublishParallel previous task is finished, start pre publish task");
            C67296h.m119242c(bundle);
            C67296h.f150798f = null;
        }
    }
}
