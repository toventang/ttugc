package com.bytedance.jedi.ext.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.AbstractC20427a;
import com.bytedance.jedi.arch.ext.list.p1464a.C20431b;
import com.bytedance.jedi.arch.ext.list.p1464a.C20435c;
import com.bytedance.jedi.arch.ext.list.p1464a.C20438e;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20629d;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e;
import com.bytedance.jedi.ext.adapter.p1467b.C20626b;
import com.bytedance.jedi.ext.adapter.p1467b.C20633f;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.a */
public abstract class AbstractC20553a<T, VH extends AbstractC20630e<T>, M extends C20633f<VH>> extends AbstractC20629d<VH, M> implements AbstractC20427a<T> {

    /* renamed from: a */
    public final C20438e f48651a;

    /* renamed from: b */
    private final C20431b<T> f48652b;

    static {
        Covode.recordClassIndex(24085);
    }

    @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
    /* renamed from: a */
    public C20431b<T> mo33761a() {
        return this.f48652b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return mo33761a().mo33766a();
    }

    @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
    /* renamed from: a */
    public final T mo33762a(int i) {
        return (T) AbstractC20427a.C20428a.m38638a((AbstractC20427a) this, i, false);
    }

    @Override // com.bytedance.jedi.ext.adapter.p1467b.AbstractC20629d
    /* renamed from: a */
    public final T mo33838a(int i, boolean z) {
        return (T) AbstractC20427a.C20428a.m38638a(this, i, z);
    }

    public AbstractC20553a(C20438e eVar, C20435c<T> cVar) {
        C89219l.m154719c(cVar, "");
        this.f48651a = eVar;
        this.f48652b = new C20431b<>(new C20626b(this), cVar, eVar);
    }

    @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
    /* renamed from: a */
    public final void mo33763a(List<? extends T> list, AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(list, "");
        AbstractC20427a.C20428a.m38639a(this, list, aVar);
    }
}
