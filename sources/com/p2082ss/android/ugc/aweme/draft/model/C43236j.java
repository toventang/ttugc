package com.p2082ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.HashSet;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.j */
public final class C43236j<T> extends HashSet<T> {

    /* renamed from: a */
    private final AbstractC89172b<T, Boolean> f100956a;

    static {
        Covode.recordClassIndex(51438);
    }

    public C43236j() {
        this(null, 1, null);
    }

    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.f.a.b<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C43236j(AbstractC89172b<? super T, Boolean> bVar) {
        this.f100956a = bVar;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(T t) {
        AbstractC89172b<T, Boolean> bVar = this.f100956a;
        if (bVar == null || bVar.invoke(t).booleanValue()) {
            return super.add(t);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends T> collection) {
        C89219l.m154721d(collection, "");
        for (T t : collection) {
            add(t);
        }
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C43236j(AbstractC89172b bVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : bVar);
    }
}
