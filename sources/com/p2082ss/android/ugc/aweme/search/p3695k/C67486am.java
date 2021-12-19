package com.p2082ss.android.ugc.aweme.search.p3695k;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.k.am */
public final class C67486am {

    /* renamed from: a */
    public static final ConcurrentLinkedDeque<C89378p<Integer, AbstractC67567q>> f151181a = new ConcurrentLinkedDeque<>();

    /* renamed from: b */
    public static final C67486am f151182b = new C67486am();

    private C67486am() {
    }

    static {
        Covode.recordClassIndex(79123);
    }

    /* renamed from: a */
    public static AbstractC67567q m119564a() {
        C89378p<Integer, AbstractC67567q> peekFirst = f151181a.peekFirst();
        if (peekFirst == null || peekFirst.getSecond() == null) {
            return null;
        }
        return peekFirst.getSecond();
    }

    /* renamed from: a */
    public static AbstractC67567q m119565a(int i) {
        ConcurrentLinkedDeque<C89378p<Integer, AbstractC67567q>> concurrentLinkedDeque = f151181a;
        ArrayList arrayList = new ArrayList();
        for (T t : concurrentLinkedDeque) {
            T t2 = t;
            if (!(t2 == null || i != ((Number) t2.getFirst()).intValue() || t2.getSecond() == null)) {
                arrayList.add(t);
            }
        }
        C89378p pVar = (C89378p) C89070n.m154583g((List) arrayList);
        if (pVar != null) {
            return (AbstractC67567q) pVar.getSecond();
        }
        return null;
    }

    /* renamed from: a */
    public static void m119566a(int i, AbstractC67567q qVar) {
        C89219l.m154721d(qVar, "");
        ConcurrentLinkedDeque<C89378p<Integer, AbstractC67567q>> concurrentLinkedDeque = f151181a;
        C89378p<Integer, AbstractC67567q> peekFirst = concurrentLinkedDeque.peekFirst();
        if (!(peekFirst == null || i != peekFirst.getFirst().intValue() || peekFirst.getSecond() == null)) {
            concurrentLinkedDeque.removeFirst();
        }
        concurrentLinkedDeque.addFirst(new C89378p<>(Integer.valueOf(i), qVar));
    }
}
