package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52264i;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.ai */
final /* synthetic */ class RunnableC52240ai implements Runnable {

    /* renamed from: a */
    private final C52264i.C522684 f120353a;

    /* renamed from: b */
    private final boolean f120354b = true;

    static {
        Covode.recordClassIndex(61628);
    }

    RunnableC52240ai(C52264i.C522684 r2) {
        this.f120353a = r2;
    }

    public final void run() {
        C52264i.C522684 r3 = this.f120353a;
        boolean z = this.f120354b;
        C52264i.this.f120423N.mo87882a();
        C52264i.this.mo88016a(true);
        C52264i.this.mo88027h();
        C52264i.this.f120433d.invalidate();
        if (z) {
            new C79459a(C52264i.this.f120442m.getContext()).mo123050a(R.string.boc).mo123053a();
        }
    }
}
