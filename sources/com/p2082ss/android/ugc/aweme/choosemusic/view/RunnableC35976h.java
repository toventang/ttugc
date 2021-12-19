package com.p2082ss.android.ugc.aweme.choosemusic.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.h */
final /* synthetic */ class RunnableC35976h implements Runnable {

    /* renamed from: a */
    private final AbstractC35966c f84946a;

    static {
        Covode.recordClassIndex(43222);
    }

    RunnableC35976h(AbstractC35966c cVar) {
        this.f84946a = cVar;
    }

    public final void run() {
        AbstractC35966c cVar = this.f84946a;
        if (cVar.f84916j != null) {
            cVar.f84916j.requestFocus();
            KeyboardUtils.m70896b(cVar.f84916j);
        }
    }
}
