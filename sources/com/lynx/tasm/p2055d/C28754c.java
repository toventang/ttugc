package com.lynx.tasm.p2055d;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.shadow.text.C28573r;
import com.lynx.tasm.core.C28745a;
import com.lynx.tasm.p2055d.C28751a;
import com.lynx.tasm.p2056e.C28770c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.lynx.tasm.d.c */
public class C28754c {

    /* renamed from: a */
    List<C28753b> f67807a = new ArrayList();

    /* renamed from: b */
    private Map<String, C28766d> f67808b = new HashMap();

    static {
        Covode.recordClassIndex(34853);
    }

    /* renamed from: com.lynx.tasm.d.c$a */
    public static class C28765a {

        /* renamed from: a */
        public static final C28754c f67843a = new C28754c();

        static {
            Covode.recordClassIndex(34864);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C28766d mo49874a(C28751a aVar) {
        MethodCollector.m26663i(1591);
        Iterator<Pair<C28751a.EnumC28752a, String>> it = aVar.f67802b.iterator();
        if (it.hasNext()) {
            Pair<C28751a.EnumC28752a, String> next = it.next();
            C28766d dVar = this.f67808b.get(((C28751a.EnumC28752a) next.first).name() + ((String) next.second));
            MethodCollector.m26664o(1591);
            return dVar;
        }
        MethodCollector.m26664o(1591);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo49876a(C28751a aVar, C28766d dVar) {
        MethodCollector.m26663i(1550);
        for (Pair<C28751a.EnumC28752a, String> pair : aVar.f67802b) {
            this.f67808b.put(((C28751a.EnumC28752a) pair.first).name() + ((String) pair.second), dVar);
        }
        MethodCollector.m26664o(1550);
    }

    /* renamed from: a */
    public final Typeface mo49873a(final AbstractC28520j jVar, final String str, final int i, final C28573r.AbstractC28575b bVar) {
        final C28751a b = jVar.mo49042b(str);
        if (b == null) {
            return null;
        }
        final C28766d dVar = b.f67803c;
        final Handler handler = new Handler(Looper.myLooper());
        if (dVar != null) {
            if (bVar != null) {
                handler.post(new Runnable() {
                    /* class com.lynx.tasm.p2055d.C28754c.RunnableC287551 */

                    static {
                        Covode.recordClassIndex(34854);
                    }

                    public final void run() {
                        LLog.m56860b("Lynx", "load font success " + str + i);
                        if (Build.VERSION.SDK_INT >= 28) {
                            C28573r.AbstractC28575b bVar = bVar;
                            dVar.mo49887a(i);
                            bVar.mo49157a();
                        } else if (Looper.getMainLooper() == Looper.myLooper()) {
                            dVar.mo49887a(i);
                            bVar.mo49157a();
                        } else {
                            new Handler(Looper.getMainLooper()).post(new Runnable() {
                                /* class com.lynx.tasm.p2055d.C28754c.RunnableC287551.RunnableC287561 */

                                static {
                                    Covode.recordClassIndex(34855);
                                }

                                public final void run() {
                                    final Typeface a = dVar.mo49887a(i);
                                    handler.post(new Runnable() {
                                        /* class com.lynx.tasm.p2055d.C28754c.RunnableC287551.RunnableC287561.RunnableC287571 */

                                        static {
                                            Covode.recordClassIndex(34856);
                                        }

                                        public final void run() {
                                            bVar.mo49157a();
                                        }
                                    });
                                }
                            });
                        }
                    }
                });
            }
            if (Build.VERSION.SDK_INT >= 28) {
                return dVar.mo49887a(i);
            }
            return dVar.mo49887a(0);
        }
        C28745a.m57564a().execute(new Runnable() {
            /* class com.lynx.tasm.p2055d.C28754c.RunnableC287582 */

            static {
                Covode.recordClassIndex(34857);
            }

            public final void run() {
                MethodCollector.m26663i(4127);
                C28754c cVar = C28754c.this;
                AbstractC28520j jVar = jVar;
                C28751a aVar = b;
                int i = i;
                C28573r.AbstractC28575b bVar = bVar;
                Handler handler = handler;
                synchronized (cVar) {
                    try {
                        C28766d a = cVar.mo49874a(aVar);
                        if (a != null) {
                            aVar.f67803c = a;
                            cVar.mo49876a(aVar, a);
                            if (Build.VERSION.SDK_INT >= 28) {
                                Typeface a2 = a.mo49887a(i);
                                if (bVar != null) {
                                    handler.post(new Runnable(bVar, a2, i) {
                                        /* class com.lynx.tasm.p2055d.C28754c.RunnableC287593 */

                                        /* renamed from: a */
                                        final /* synthetic */ C28573r.AbstractC28575b f67824a;

                                        /* renamed from: b */
                                        final /* synthetic */ Typeface f67825b;

                                        /* renamed from: c */
                                        final /* synthetic */ int f67826c;

                                        static {
                                            Covode.recordClassIndex(34858);
                                        }

                                        public final void run() {
                                            LLog.m56856a(4, "Lynx", "load font success");
                                            this.f67824a.mo49157a();
                                        }

                                        {
                                            this.f67824a = r2;
                                            this.f67825b = r3;
                                            this.f67826c = r4;
                                        }
                                    });
                                } else {
                                    return;
                                }
                            } else if (bVar == null) {
                                MethodCollector.m26664o(4127);
                                return;
                            } else {
                                new Handler(Looper.getMainLooper()).post(new Runnable(a, i, handler, bVar) {
                                    /* class com.lynx.tasm.p2055d.C28754c.RunnableC287604 */

                                    /* renamed from: a */
                                    final /* synthetic */ C28766d f67828a;

                                    /* renamed from: b */
                                    final /* synthetic */ int f67829b;

                                    /* renamed from: c */
                                    final /* synthetic */ Handler f67830c;

                                    /* renamed from: d */
                                    final /* synthetic */ C28573r.AbstractC28575b f67831d;

                                    static {
                                        Covode.recordClassIndex(34859);
                                    }

                                    public final void run() {
                                        final Typeface a = this.f67828a.mo49887a(this.f67829b);
                                        this.f67830c.post(new Runnable() {
                                            /* class com.lynx.tasm.p2055d.C28754c.RunnableC287604.RunnableC287611 */

                                            static {
                                                Covode.recordClassIndex(34860);
                                            }

                                            public final void run() {
                                                LLog.m56856a(4, "Lynx", "load font success");
                                                RunnableC287604.this.f67831d.mo49157a();
                                            }
                                        });
                                    }

                                    {
                                        this.f67828a = r2;
                                        this.f67829b = r3;
                                        this.f67830c = r4;
                                        this.f67831d = r5;
                                    }
                                });
                            }
                            MethodCollector.m26664o(4127);
                            return;
                        }
                        for (C28753b bVar2 : cVar.f67807a) {
                            if (bVar2.mo49872b(aVar)) {
                                bVar2.mo49871a(aVar);
                                bVar2.mo49870a(new Pair<>(bVar, Integer.valueOf(i)));
                                MethodCollector.m26664o(4127);
                                return;
                            }
                        }
                        C28753b bVar3 = new C28753b();
                        bVar3.mo49870a(new Pair<>(bVar, Integer.valueOf(i)));
                        bVar3.mo49871a(aVar);
                        cVar.f67807a.add(bVar3);
                        cVar.mo49875a(jVar, bVar3, aVar.f67802b.iterator(), handler);
                        MethodCollector.m26664o(4127);
                    } finally {
                        MethodCollector.m26664o(4127);
                    }
                }
            }
        });
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo49875a(AbstractC28520j jVar, final C28753b bVar, Iterator<Pair<C28751a.EnumC28752a, String>> it, final Handler handler) {
        MethodCollector.m26663i(1577);
        while (it.hasNext()) {
            Pair<C28751a.EnumC28752a, String> next = it.next();
            Typeface b = C28770c.f67848a.mo49890b(jVar, (C28751a.EnumC28752a) next.first, (String) next.second);
            if (b != null) {
                final C28766d dVar = new C28766d(b);
                synchronized (this) {
                    try {
                        for (C28751a aVar : bVar.f67806b) {
                            aVar.f67803c = dVar;
                            mo49876a(aVar, dVar);
                        }
                        this.f67807a.remove(bVar);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(1577);
                        throw th;
                    }
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    for (Pair<C28573r.AbstractC28575b, Integer> pair : bVar.f67805a) {
                        dVar.mo49887a(((Integer) pair.second).intValue());
                    }
                }
                handler.post(new Runnable() {
                    /* class com.lynx.tasm.p2055d.C28754c.RunnableC287625 */

                    static {
                        Covode.recordClassIndex(34861);
                    }

                    public final void run() {
                        Iterator<Pair<C28573r.AbstractC28575b, Integer>> it = bVar.f67805a.iterator();
                        while (it.hasNext()) {
                            final Pair<C28573r.AbstractC28575b, Integer> next = it.next();
                            it.remove();
                            if (next.first != null) {
                                if (Build.VERSION.SDK_INT >= 28) {
                                    LLog.m56856a(4, "Lynx", "load font success");
                                    dVar.mo49887a(((Integer) next.second).intValue());
                                    ((Integer) next.second).intValue();
                                    ((C28573r.AbstractC28575b) next.first).mo49157a();
                                } else {
                                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                                        /* class com.lynx.tasm.p2055d.C28754c.RunnableC287625.RunnableC287631 */

                                        static {
                                            Covode.recordClassIndex(34862);
                                        }

                                        public final void run() {
                                            final Typeface a = dVar.mo49887a(((Integer) next.second).intValue());
                                            handler.post(new Runnable() {
                                                /* class com.lynx.tasm.p2055d.C28754c.RunnableC287625.RunnableC287631.RunnableC287641 */

                                                static {
                                                    Covode.recordClassIndex(34863);
                                                }

                                                public final void run() {
                                                    LLog.m56856a(4, "Lynx", "load font success");
                                                    ((Integer) next.second).intValue();
                                                    ((C28573r.AbstractC28575b) next.first).mo49157a();
                                                }
                                            });
                                        }
                                    });
                                }
                            }
                        }
                    }
                });
                MethodCollector.m26664o(1577);
                return;
            }
        }
        MethodCollector.m26664o(1577);
    }
}
