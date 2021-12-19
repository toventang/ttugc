package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.f */
final /* synthetic */ class RunnableC54544f implements Runnable {

    /* renamed from: a */
    private final C54542d f125016a;

    static {
        Covode.recordClassIndex(64255);
    }

    RunnableC54544f(C54542d dVar) {
        this.f125016a = dVar;
    }

    public final void run() {
        C54542d dVar = this.f125016a;
        if (dVar.f125005a != null) {
            for (Map.Entry<String, Object> entry : dVar.f125005a.entrySet()) {
                entry.getValue();
            }
        }
    }
}
