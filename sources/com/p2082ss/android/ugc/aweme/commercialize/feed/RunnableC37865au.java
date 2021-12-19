package com.p2082ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commercialize.feed.C37899g;
import com.p2082ss.android.ugc.aweme.commercialize.link.p2574a.C38036a;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.au */
public final /* synthetic */ class RunnableC37865au implements Runnable {

    /* renamed from: a */
    private final C37899g.C379052 f89365a;

    static {
        Covode.recordClassIndex(45317);
    }

    RunnableC37865au(C37899g.C379052 r1) {
        this.f89365a = r1;
    }

    public final void run() {
        C37899g.C379052 r3 = this.f89365a;
        if (r3.f89535a > 0) {
            C38036a.C38037a a = r3.mo66021e().mo66313a("display_1s");
            int i = 0;
            if (!C37899g.this.mo66008G() && !C37899g.this.mo66007C() && C34729o.m70960b(C37899g.this.f89424N)) {
                i = 100;
            }
            C38189j.m77473a(C37899g.this.f89467ae, a.mo66309a(i).mo66315a());
        }
    }
}
