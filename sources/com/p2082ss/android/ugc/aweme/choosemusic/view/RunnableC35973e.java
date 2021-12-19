package com.p2082ss.android.ugc.aweme.choosemusic.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.e */
public final /* synthetic */ class RunnableC35973e implements Runnable {

    /* renamed from: a */
    private final AbstractC35966c f84939a;

    static {
        Covode.recordClassIndex(43219);
    }

    RunnableC35973e(AbstractC35966c cVar) {
        this.f84939a = cVar;
    }

    public final void run() {
        AbstractC35966c cVar = this.f84939a;
        if (cVar.f84916j != null) {
            cVar.f84916j.requestFocus();
            KeyboardUtils.m70896b(cVar.f84916j);
        }
    }
}
