package com.bytedance.ies.powerpreload.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.C17807d;
import com.bytedance.ies.powerpreload.p1242a.C17778a;
import com.bytedance.ies.powerpreload.p1243b.AbstractC17789d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpreload.task.g */
public final class C17834g {

    /* renamed from: a */
    private final AbstractC89244h f42544a = C89250i.m154773a((AbstractC89171a) C17836b.f42546a);

    static {
        Covode.recordClassIndex(20399);
    }

    /* renamed from: a */
    private final HashMap<C17807d, Set<C17838h>> m33020a() {
        return (HashMap) this.f42544a.getValue();
    }

    /* renamed from: com.bytedance.ies.powerpreload.task.g$b */
    static final class C17836b extends AbstractC89220m implements AbstractC89171a<HashMap<C17807d, Set<C17838h>>> {

        /* renamed from: a */
        public static final C17836b f42546a = new C17836b();

        static {
            Covode.recordClassIndex(20401);
        }

        C17836b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<C17807d, Set<C17838h>> invoke() {
            return new HashMap();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.powerpreload.task.g$c */
    public static final class RunnableC17837c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractRunnableC17828f f42547a;

        static {
            Covode.recordClassIndex(20402);
        }

        RunnableC17837c(AbstractRunnableC17828f fVar) {
            this.f42547a = fVar;
        }

        public final void run() {
            try {
                this.f42547a.run();
            } catch (Exception e) {
                C17778a.m32984a(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.powerpreload.task.g$a */
    public static final class C17835a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractRunnableC17828f f42545a;

        static {
            Covode.recordClassIndex(20400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17835a(AbstractRunnableC17828f fVar) {
            super(0);
            this.f42545a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return "addTask >>> task is same, new task:" + this.f42545a;
        }
    }

    /* renamed from: a */
    public final Set<C17838h> mo28296a(C17807d dVar) {
        C89219l.m154719c(dVar, "");
        return m33020a().get(dVar);
    }

    /* renamed from: a */
    public final C17807d mo28295a(String str) {
        C89219l.m154719c(str, "");
        Set<C17807d> keySet = m33020a().keySet();
        C89219l.m154709a((Object) keySet, "");
        for (T t : keySet) {
            if (C89219l.m154714a((Object) str, (Object) t.f42497f)) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final C17807d mo28298b(String str) {
        C89219l.m154719c(str, "");
        Set<C17807d> keySet = m33020a().keySet();
        C89219l.m154709a((Object) keySet, "");
        for (T t : keySet) {
            if (C89219l.m154714a((Object) str, (Object) t.f42498g)) {
                return t;
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo28297a(C17807d dVar, AbstractC17789d dVar2, AbstractRunnableC17828f<?> fVar, String str) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(dVar2, "");
        C89219l.m154719c(fVar, "");
        if (m33020a().containsKey(dVar)) {
            Set<C17838h> set = m33020a().get(dVar);
            T t = null;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.mo28301a(dVar2.getClass(), str)) {
                        t = next;
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    C17835a aVar = new C17835a(fVar);
                    C89219l.m154719c(aVar, "");
                    if (C17778a.m32985b()) {
                        aVar.invoke();
                    }
                    t2.mo28300a(fVar);
                } else if (set != null) {
                    C17838h hVar = new C17838h(dVar2.getClass(), str);
                    hVar.mo28300a(fVar);
                    set.add(hVar);
                }
            }
        } else {
            HashMap<C17807d, Set<C17838h>> a = m33020a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            new C17838h(dVar2.getClass(), str).mo28300a(fVar);
            a.put(dVar, linkedHashSet);
        }
        C17778a.m32983a().f42454d.invoke().execute(new RunnableC17837c(fVar));
    }
}
