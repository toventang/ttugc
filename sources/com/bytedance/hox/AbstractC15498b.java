package com.bytedance.hox;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.p1106a.AbstractC15497d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hox.b */
public abstract class AbstractC15498b extends AbstractC15501d {

    /* renamed from: a */
    private boolean f37767a = true;

    /* renamed from: b */
    public boolean f37768b;

    /* renamed from: c */
    public AbstractC15501d f37769c;

    /* renamed from: d */
    public final List<AbstractC15501d> f37770d = new ArrayList();

    static {
        Covode.recordClassIndex(17757);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25226a(String str, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo25228b();

    /* renamed from: c */
    public final boolean mo25230c() {
        return mo25228b();
    }

    /* renamed from: b */
    private final void m28540b(Bundle bundle) {
        List<AbstractC15497d> list;
        if (!this.f37767a) {
            AbstractC15501d dVar = this.f37769c;
            if (dVar instanceof AbstractC15498b) {
                if (dVar != null) {
                    ((AbstractC15498b) dVar).m28540b(bundle);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            AbstractC15501d dVar2 = this.f37769c;
            if (dVar2 != null && (list = dVar2.f37773g) != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo25224b(bundle);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m28538a(Bundle bundle) {
        boolean z;
        List<AbstractC15497d> list;
        List<AbstractC15497d> list2;
        AbstractC15498b bVar = this;
        while (true) {
            AbstractC15501d dVar = bVar.f37769c;
            if (dVar == null || (list2 = dVar.f37773g) == null || list2.size() != 0) {
                z = false;
            } else {
                z = true;
            }
            bVar.f37768b = z;
            AbstractC15501d dVar2 = bVar.f37769c;
            if (!(dVar2 == null || (list = dVar2.f37773g) == null)) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo25223a(bundle);
                }
            }
            if (bVar.f37767a) {
                bVar.f37767a = false;
                return;
            }
            AbstractC15501d dVar3 = bVar.f37769c;
            if (!(dVar3 instanceof AbstractC15498b)) {
                return;
            }
            if (dVar3 != null) {
                bVar = (AbstractC15498b) dVar3;
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25225a(AbstractC15501d dVar) {
        C89219l.m154719c(dVar, "");
        if (!this.f37770d.contains(dVar)) {
            dVar.f37771e = this;
            m28539a(this.f37772f, dVar);
            this.f37770d.add(dVar);
            return;
        }
        throw new RuntimeException("addChild(), already has childNode " + dVar.mo25232d());
    }

    /* renamed from: b */
    public final void mo25227b(String str, Bundle bundle) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(bundle, "");
        mo25226a(str, bundle);
    }

    /* renamed from: c */
    public final void mo25229c(String str, Bundle bundle) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(bundle, "");
        m28541d(str, bundle);
    }

    /* renamed from: a */
    private final void m28537a(int i, Bundle bundle) {
        if (i < 0 || i >= this.f37770d.size()) {
            throw new RuntimeException("dispatchVisible(), out of childrenList size, index = " + i + ", childrenList size = " + this.f37770d.size());
        }
        m28540b(bundle);
        this.f37769c = this.f37770d.get(i);
        m28538a(bundle);
    }

    /* renamed from: d */
    private final void m28541d(String str, Bundle bundle) {
        int i = 0;
        for (T t : this.f37770d) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            if (C89219l.m154714a((Object) t.mo25232d(), (Object) str)) {
                m28537a(i, bundle);
            }
            i = i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.util.LinkedList<com.bytedance.hox.d> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.util.LinkedList<com.bytedance.hox.d> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final void m28539a(LinkedList<AbstractC15501d> linkedList, AbstractC15501d dVar) {
        if (dVar instanceof AbstractC15498b) {
            for (Object obj : C89070n.m154584g((Iterable) linkedList)) {
                dVar.f37772f.addFirst(obj);
            }
            Iterator<T> it = ((AbstractC15498b) dVar).f37770d.iterator();
            while (it.hasNext()) {
                m28539a(linkedList, it.next());
            }
            return;
        }
        for (Object obj2 : C89070n.m154584g((Iterable) linkedList)) {
            dVar.f37772f.addFirst(obj2);
        }
    }
}
