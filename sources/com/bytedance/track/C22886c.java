package com.bytedance.track;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.AbstractC21732b;
import com.bytedance.provider.AbstractC21735d;
import com.bytedance.provider.C21740f;
import com.bytedance.provider.impl.C21752c;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.track.c */
public final class C22886c {

    /* renamed from: a */
    public static final C22886c f54032a = new C22886c();

    /* renamed from: b */
    private static final ReentrantLock f54033b = new ReentrantLock();

    /* renamed from: c */
    private static C22881a f54034c;

    /* renamed from: d */
    private static final ConcurrentHashMap<Integer, C22881a> f54035d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static final ConcurrentHashMap<C22881a, CopyOnWriteArrayList<AbstractC22883b<?>>> f54036e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final ConcurrentHashMap<AbstractC22883b<?>, AbstractC21732b<?>> f54037f = new ConcurrentHashMap<>();

    private C22886c() {
    }

    /* renamed from: com.bytedance.track.c$a */
    static final class C22887a extends C22881a {

        /* renamed from: e */
        public static final C22887a f54038e = new C22887a();

        private C22887a() {
            super(C21752c.f51535b);
        }

        static {
            Covode.recordClassIndex(26792);
        }
    }

    static {
        Covode.recordClassIndex(26791);
    }

    /* renamed from: a */
    public static C22881a m43139a(AbstractC1204m mVar) {
        C89219l.m154719c(mVar, "");
        ReentrantLock reentrantLock = f54033b;
        reentrantLock.lock();
        try {
            int hashCode = mVar.hashCode();
            ConcurrentHashMap<Integer, C22881a> concurrentHashMap = f54035d;
            C22881a aVar = concurrentHashMap.get(Integer.valueOf(hashCode));
            if (aVar == null) {
                aVar = new C22881a();
                concurrentHashMap.put(Integer.valueOf(hashCode), aVar);
                C22881a aVar2 = f54034c;
                if (aVar2 == null) {
                    aVar2 = C22887a.f54038e;
                }
                AbstractC21735d dVar = aVar.f54030c;
                AbstractC21735d dVar2 = aVar2.f54030c;
                AbstractC21735d.C21736a aVar3 = new AbstractC21735d.C21736a();
                C89219l.m154719c(dVar, "");
                C89219l.m154719c(dVar2, "");
                C89219l.m154719c(aVar3, "");
                dVar.mo35380a().mo35383a(dVar2, aVar3);
                aVar2.f54029b = aVar;
                aVar.f54028a = aVar2;
                f54034c = aVar;
                mVar.getLifecycle().mo4012a(new TrackerChain$attachBTM$1$1(aVar, hashCode));
            }
            return aVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public static <T extends AbstractC22883b<T>> T m43140a(String str, Class<T> cls) {
        T t;
        C89219l.m154719c(cls, "");
        C22881a aVar = f54034c;
        if (aVar == null) {
            aVar = C22887a.f54038e;
        }
        AbstractC21735d dVar = aVar.f54030c;
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(cls, "");
        AbstractC21732b<?> a = dVar.mo35380a().mo35381a(str, cls);
        if (a == null || (t = (T) ((AbstractC22883b) a.mo35378a())) == null) {
            return null;
        }
        ConcurrentHashMap<C22881a, CopyOnWriteArrayList<AbstractC22883b<?>>> concurrentHashMap = f54036e;
        CopyOnWriteArrayList<AbstractC22883b<?>> copyOnWriteArrayList = concurrentHashMap.get(aVar);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            concurrentHashMap.put(aVar, copyOnWriteArrayList);
        }
        C89219l.m154709a((Object) copyOnWriteArrayList, "");
        copyOnWriteArrayList.add(t);
        f54037f.put(t, a);
        return t;
    }

    /* renamed from: a */
    public static C89391z m43141a(C22881a aVar, int i) {
        C89391z zVar;
        ReentrantLock reentrantLock = f54033b;
        reentrantLock.lock();
        try {
            C22881a aVar2 = aVar.f54028a;
            if (aVar2 == null) {
                aVar2 = C22887a.f54038e;
            }
            C22881a aVar3 = aVar.f54029b;
            aVar2.f54029b = aVar3;
            if (aVar3 != null) {
                aVar3.f54028a = aVar2;
            }
            C21740f.m40709a(aVar.f54030c);
            if (C89219l.m154714a(aVar, f54034c)) {
                f54034c = aVar2;
            }
            f54035d.remove(Integer.valueOf(i));
            CopyOnWriteArrayList<AbstractC22883b<?>> remove = f54036e.remove(aVar);
            if (remove != null) {
                Iterator<T> it = remove.iterator();
                while (it.hasNext()) {
                    f54037f.remove(it.next());
                }
                zVar = C89391z.f203057a;
            } else {
                zVar = null;
            }
            return zVar;
        } finally {
            reentrantLock.unlock();
        }
    }
}
