package com.p2082ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.share.gif.c */
final /* synthetic */ class RunnableC68937c implements Runnable {

    /* renamed from: a */
    private final C68935b f154227a;

    /* renamed from: b */
    private final Activity f154228b;

    static {
        Covode.recordClassIndex(81247);
    }

    RunnableC68937c(C68935b bVar, Activity activity) {
        this.f154227a = bVar;
        this.f154228b = activity;
    }

    public final void run() {
        C68935b bVar = this.f154227a;
        Activity activity = this.f154228b;
        if (bVar.f154220b != null) {
            bVar.f154220b.dismiss();
        }
        new C79459a(activity).mo123050a(R.string.cxm).mo123053a();
        if (bVar.f154219a != null) {
            bVar.f154219a.f155234h.setValue(false);
        }
    }
}
