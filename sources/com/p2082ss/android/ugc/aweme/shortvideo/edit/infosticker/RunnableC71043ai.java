package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.C71056i;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ai */
final /* synthetic */ class RunnableC71043ai implements Runnable {

    /* renamed from: a */
    private final C71056i.C710604 f159048a;

    /* renamed from: b */
    private final boolean f159049b = true;

    static {
        Covode.recordClassIndex(83541);
    }

    RunnableC71043ai(C71056i.C710604 r2) {
        this.f159048a = r2;
    }

    public final void run() {
        C71056i.C710604 r3 = this.f159048a;
        boolean z = this.f159049b;
        C71056i.this.f159108O.mo112116b();
        C71056i.this.mo112248a(true);
        C71056i.this.mo112260j();
        C71056i.this.f159122d.invalidate();
        if (z) {
            new C79459a(C71056i.this.f159131m.getContext()).mo123050a(R.string.boc).mo123053a();
        }
    }
}
