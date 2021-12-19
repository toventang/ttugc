package com.bytedance.p802b.p830h;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p841k.C13134j;
import com.bytedance.p802b.p841k.p843b.C13118b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.bytedance.b.h.a */
public final class C13092a {

    /* renamed from: a */
    public static List<AbstractC13095c> f31927a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public static LinkedBlockingQueue<AbstractC13094b> f31928b = new LinkedBlockingQueue<>();

    /* renamed from: c */
    private static volatile boolean f31929c = false;

    static {
        Covode.recordClassIndex(14928);
    }

    /* renamed from: a */
    private static synchronized void m23543a() {
        synchronized (C13092a.class) {
            if (!f31929c) {
                f31929c = true;
                new Thread(new Runnable() {
                    /* class com.bytedance.p802b.p830h.C13092a.RunnableC130931 */

                    static {
                        Covode.recordClassIndex(14929);
                    }

                    public final void run() {
                        while (true) {
                            C13134j.m23621a("APM-Consumers");
                            try {
                                AbstractC13094b take = C13092a.f31928b.take();
                                for (AbstractC13095c cVar : C13092a.f31927a) {
                                    C13134j.m23621a("APM-Handler");
                                    try {
                                        if (take.mo20771b()) {
                                            cVar.mo20826a(take);
                                        }
                                    } catch (Throwable th) {
                                        C13118b.m23587a("APM-Monitor", "monitorableHandler " + cVar + " handle monitorable " + take + "failed.", th);
                                    }
                                    C13134j.m23620a();
                                }
                            } catch (Throwable th2) {
                                C13118b.m23587a("APM", "Oh, Damn it!!!", th2);
                            }
                            C13134j.m23620a();
                        }
                    }
                }, "APM-Monitor").start();
            }
        }
    }

    /* renamed from: a */
    public static void m23544a(AbstractC13094b bVar) {
        if (bVar != null) {
            f31928b.offer(bVar);
            if (!f31929c) {
                m23543a();
            }
        }
    }
}
