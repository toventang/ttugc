package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bc */
public final /* synthetic */ class RunnableC72168bc implements Runnable {

    /* renamed from: a */
    private final MvImageChooseAdapter.C72050e f161778a;

    /* renamed from: b */
    private final int f161779b = 4;

    static {
        Covode.recordClassIndex(84833);
    }

    RunnableC72168bc(MvImageChooseAdapter.C72050e eVar) {
        this.f161778a = eVar;
    }

    public final void run() {
        MvImageChooseAdapter.C72050e eVar = this.f161778a;
        eVar.f161481g.setVisibility(this.f161779b);
    }
}
