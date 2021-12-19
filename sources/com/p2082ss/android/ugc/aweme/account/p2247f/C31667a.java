package com.p2082ss.android.ugc.aweme.account.p2247f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.account.login.model.C31966a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.account.f.a */
public final class C31667a {

    /* renamed from: a */
    public static List<WeakReference<AbstractC31668a>> f75741a = new LinkedList();

    /* renamed from: b */
    private static C31966a f75742b;

    /* renamed from: c */
    private static List<AbstractC31669b> f75743c = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.ugc.aweme.account.f.a$a */
    public interface AbstractC31668a {
        static {
            Covode.recordClassIndex(38401);
        }

        /* renamed from: a */
        void mo57660a(C31966a aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.f.a$b */
    public interface AbstractC31669b {
        static {
            Covode.recordClassIndex(38402);
        }

        /* renamed from: a */
        void mo57661a(int i);
    }

    static {
        Covode.recordClassIndex(38400);
    }

    /* renamed from: a */
    public static void m65984a(AbstractC31669b bVar) {
        f75743c.add(bVar);
    }

    /* renamed from: b */
    public static void m65986b(AbstractC31669b bVar) {
        f75743c.remove(bVar);
    }

    /* renamed from: a */
    public static void m65983a(int i) {
        for (AbstractC31669b bVar : f75743c) {
            bVar.mo57661a(i);
        }
    }

    /* renamed from: a */
    public static void m65985a(C31966a aVar) {
        MethodCollector.m26663i(10702);
        synchronized (C31667a.class) {
            try {
                f75742b = aVar;
                Iterator<WeakReference<AbstractC31668a>> it = f75741a.iterator();
                while (it.hasNext()) {
                    WeakReference<AbstractC31668a> next = it.next();
                    if (next.get() == null) {
                        it.remove();
                    } else {
                        next.get().mo57660a(aVar);
                    }
                }
            } finally {
                MethodCollector.m26664o(10702);
            }
        }
    }
}
