package com.bytedance.p802b.p841k.p842a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.b.k.a.a */
public final class C13114a<T> {

    /* renamed from: a */
    public ConcurrentLinkedQueue<T> f31956a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    public AbstractC13115a<T> f31957b;

    /* renamed from: c */
    private final int f31958c;

    /* renamed from: com.bytedance.b.k.a.a$a */
    public interface AbstractC13115a<T> {
        static {
            Covode.recordClassIndex(14951);
        }

        /* renamed from: a */
        void mo20765a(T t);
    }

    static {
        Covode.recordClassIndex(14950);
    }

    public C13114a(int i) {
        this.f31958c = i;
    }

    /* renamed from: a */
    public final void mo20942a(T t) {
        this.f31956a.add(t);
        if (this.f31956a.size() > this.f31958c) {
            T poll = this.f31956a.poll();
            AbstractC13115a<T> aVar = this.f31957b;
            if (aVar != null) {
                aVar.mo20765a(poll);
            }
        }
    }
}
