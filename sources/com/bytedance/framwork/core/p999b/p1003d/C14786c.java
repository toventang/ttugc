package com.bytedance.framwork.core.p999b.p1003d;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.framwork.core.b.d.c */
public final class C14786c {

    /* renamed from: c */
    public static long f36050c = 5000;

    /* renamed from: a */
    public C14789d f36051a;

    /* renamed from: b */
    public volatile boolean f36052b;

    /* renamed from: d */
    public final Runnable f36053d;

    /* renamed from: e */
    public CopyOnWriteArraySet<AbstractC14785b> f36054e;

    /* renamed from: com.bytedance.framwork.core.b.d.c$a */
    public static final class C14788a {

        /* renamed from: a */
        public static final C14786c f36056a = new C14786c((byte) 0);

        static {
            Covode.recordClassIndex(16888);
        }
    }

    static {
        Covode.recordClassIndex(16886);
    }

    private C14786c() {
        this.f36052b = true;
        this.f36053d = new Runnable() {
            /* class com.bytedance.framwork.core.p999b.p1003d.C14786c.RunnableC147871 */

            static {
                Covode.recordClassIndex(16887);
            }

            public final void run() {
                try {
                    Iterator<AbstractC14785b> it = C14786c.this.f36054e.iterator();
                    while (it.hasNext()) {
                        it.next().mo23794a(System.currentTimeMillis());
                    }
                    if (C14786c.this.f36052b) {
                        C14786c.this.f36051a.mo23824a(this, C14786c.f36050c);
                    }
                } catch (OutOfMemoryError unused) {
                }
            }
        };
        this.f36054e = new CopyOnWriteArraySet<>();
        C14789d dVar = new C14789d("LogSendManager-Thread");
        this.f36051a = dVar;
        dVar.f36059a.start();
    }

    /* synthetic */ C14786c(byte b) {
        this();
    }
}
