package com.p2082ss.android.ugc.aweme.p2725d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2725d.AbstractC40913e;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.d.f */
public final class RunnableC40915f implements Runnable {

    /* renamed from: a */
    private WeakReference<AbstractC40913e.C40914a> f95728a;

    /* renamed from: b */
    private WeakReference<ConcurrentHashMap<Integer, LinkedList<View>>> f95729b;

    static {
        Covode.recordClassIndex(48767);
    }

    public final void run() {
        MethodCollector.m26663i(12502);
        WeakReference<AbstractC40913e.C40914a> weakReference = this.f95728a;
        ConcurrentHashMap<Integer, LinkedList<View>> concurrentHashMap = null;
        AbstractC40913e.C40914a aVar = weakReference != null ? weakReference.get() : null;
        WeakReference<ConcurrentHashMap<Integer, LinkedList<View>>> weakReference2 = this.f95729b;
        if (weakReference2 != null) {
            concurrentHashMap = weakReference2.get();
        }
        if (!(aVar == null || concurrentHashMap == null)) {
            for (C89378p<Integer, Integer> pVar : aVar.f95726a) {
                Integer first = pVar.getFirst();
                int intValue = pVar.getSecond().intValue();
                int intValue2 = first.intValue();
                LinkedList<View> linkedList = concurrentHashMap.get(Integer.valueOf(intValue2));
                if (linkedList != null) {
                    if (linkedList.size() > intValue) {
                        synchronized (linkedList) {
                            int i = 0;
                            while (true) {
                                if (i >= intValue) {
                                    break;
                                }
                                try {
                                    if (linkedList.poll() == null) {
                                        break;
                                    }
                                    i++;
                                } catch (Throwable th) {
                                    MethodCollector.m26664o(12502);
                                    throw th;
                                }
                            }
                        }
                    } else {
                        concurrentHashMap.remove(Integer.valueOf(intValue2));
                    }
                }
            }
        }
        MethodCollector.m26664o(12502);
    }

    public RunnableC40915f(AbstractC40913e.C40914a aVar, ConcurrentHashMap<Integer, LinkedList<View>> concurrentHashMap) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(concurrentHashMap, "");
        this.f95728a = new WeakReference<>(aVar);
        this.f95729b = new WeakReference<>(concurrentHashMap);
    }
}
