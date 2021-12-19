package com.p2082ss.android.ugc.aweme.publish.p3612b.p3613a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2006h.p2007a.AbstractC27620b;
import com.google.p1998c.p2006h.p2007a.C27639g;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.publish.b.a.a */
public class C65512a<V> extends AbstractC27620b<V> {

    /* renamed from: a */
    public final AtomicInteger f147742a = new AtomicInteger();

    /* renamed from: b */
    private String f147743b;

    /* renamed from: c */
    private boolean f147744c;

    /* renamed from: i */
    private final LinkedHashMap<Runnable, Executor> f147745i = new LinkedHashMap<>();

    static {
        Covode.recordClassIndex(77000);
    }

    public C65512a() {
    }

    public C65512a(String str) {
        this.f147743b = str;
        this.f147744c = !TextUtils.isEmpty(str);
    }

    /* renamed from: a */
    public final void mo104628a(int i) {
        MethodCollector.m26663i(9152);
        if (this.f147744c) {
            C84911q.m145928d(this.f147743b + " ProgressiveFuture.setProgress:" + i);
        }
        this.f147742a.getAndSet(i);
        C27639g gVar = new C27639g();
        synchronized (this) {
            try {
                for (Map.Entry<Runnable, Executor> entry : this.f147745i.entrySet()) {
                    Runnable key = entry.getKey();
                    Executor value = entry.getValue();
                    C27245k.m54230a(key, "Runnable was null.");
                    C27245k.m54230a(value, "Executor was null.");
                    synchronized (gVar) {
                        try {
                            if (!gVar.f65039b) {
                                gVar.f65038a = new C27639g.C27640a(key, value, gVar.f65038a);
                            } else {
                                C27639g.m55283a(key, value);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } finally {
                MethodCollector.m26664o(9152);
            }
        }
        gVar.mo46255a();
        MethodCollector.m26664o(9152);
    }

    /* renamed from: b */
    public final synchronized void mo104629b(Runnable runnable, Executor executor) {
        MethodCollector.m26663i(8999);
        this.f147745i.put(runnable, executor);
        if (this.f147742a.get() > 0) {
            executor.execute(runnable);
        }
        MethodCollector.m26664o(8999);
    }
}
