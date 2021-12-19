package com.p2082ss.videoarch.p4474a.p4478d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.videoarch.p4474a.AbstractC87127c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.ss.videoarch.a.d.c */
public final class C87143c {

    /* renamed from: a */
    public final AbstractC87127c f196944a;

    /* renamed from: b */
    private final ExecutorService f196945b;

    /* renamed from: c */
    private Future f196946c;

    static {
        Covode.recordClassIndex(102944);
    }

    /* renamed from: a */
    public final void mo140953a() {
        Future future = this.f196946c;
        if (future != null && !future.isDone()) {
            this.f196946c.cancel(true);
            this.f196946c = null;
        }
    }

    public C87143c(ExecutorService executorService, AbstractC87127c cVar) {
        this.f196945b = executorService;
        this.f196944a = cVar;
    }
}
