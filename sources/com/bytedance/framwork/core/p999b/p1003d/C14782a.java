package com.bytedance.framwork.core.p999b.p1003d;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.framwork.core.b.d.a */
public final class C14782a {

    /* renamed from: c */
    public static long f36043c = 30000;

    /* renamed from: a */
    public C14789d f36044a;

    /* renamed from: b */
    public volatile boolean f36045b;

    /* renamed from: d */
    CopyOnWriteArraySet<AbstractC14785b> f36046d;

    /* renamed from: e */
    private final Runnable f36047e;

    /* renamed from: com.bytedance.framwork.core.b.d.a$a */
    public static final class C14784a {

        /* renamed from: a */
        public static final C14782a f36049a = new C14782a((byte) 0);

        static {
            Covode.recordClassIndex(16884);
        }
    }

    static {
        Covode.recordClassIndex(16882);
    }

    private C14782a() {
        this.f36045b = true;
        this.f36047e = new Runnable() {
            /* class com.bytedance.framwork.core.p999b.p1003d.C14782a.RunnableC147831 */

            static {
                Covode.recordClassIndex(16883);
            }

            public final void run() {
                try {
                    Iterator<AbstractC14785b> it = C14782a.this.f36046d.iterator();
                    while (it.hasNext()) {
                        it.next().mo23794a(System.currentTimeMillis());
                    }
                    if (C14782a.this.f36045b) {
                        C14782a.this.f36044a.mo23824a(this, C14782a.f36043c);
                    }
                } catch (OutOfMemoryError unused) {
                }
            }
        };
        this.f36046d = new CopyOnWriteArraySet<>();
        C14789d dVar = new C14789d("AsyncEventManager-Thread");
        this.f36044a = dVar;
        dVar.f36059a.start();
    }

    /* synthetic */ C14782a(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo23819a(Runnable runnable) {
        C14789d dVar = this.f36044a;
        dVar.mo23823a(dVar.mo23822a(runnable), 0);
    }

    /* renamed from: a */
    public final void mo23818a(AbstractC14785b bVar) {
        try {
            this.f36046d.add(bVar);
            if (this.f36045b) {
                this.f36044a.mo23825b(this.f36047e);
                this.f36044a.mo23824a(this.f36047e, f36043c);
            }
        } catch (Throwable unused) {
        }
    }
}
