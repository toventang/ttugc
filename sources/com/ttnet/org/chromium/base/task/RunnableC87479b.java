package com.ttnet.org.chromium.base.task;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ttnet.org.chromium.base.task.b */
final /* synthetic */ class RunnableC87479b implements Runnable {

    /* renamed from: a */
    private final AbstractC87475a f198432a;

    /* renamed from: b */
    private final Object f198433b;

    static {
        Covode.recordClassIndex(103425);
    }

    RunnableC87479b(AbstractC87475a aVar, Object obj) {
        this.f198432a = aVar;
        this.f198433b = obj;
    }

    public final void run() {
        AbstractC87475a aVar = this.f198432a;
        aVar.f198426d.get();
        aVar.f198425c = 2;
    }
}
