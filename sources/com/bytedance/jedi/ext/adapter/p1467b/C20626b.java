package com.bytedance.jedi.ext.adapter.p1467b;

import androidx.recyclerview.widget.AbstractC1485u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC1350a;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.internal.C20657a;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20628c;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* JADX WARN: Incorrect field signature: TT; */
/* renamed from: com.bytedance.jedi.ext.adapter.b.b */
public final class C20626b<T extends RecyclerView.AbstractC1350a<?> & AbstractC20628c<?, ? extends C20633f<?>>> implements AbstractC1485u {

    /* renamed from: a */
    private final RecyclerView.AbstractC1350a f48788a;

    /* renamed from: b */
    private final AbstractC89172b<Integer, Integer> f48789b;

    static {
        Covode.recordClassIndex(24158);
    }

    /* renamed from: a */
    private final C20657a m38848a() {
        return ((AbstractC20628c) this.f48788a).mo33883b().f48798b;
    }

    public /* synthetic */ C20626b(RecyclerView.AbstractC1350a aVar) {
        this(aVar, C206271.f48790a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T extends androidx.recyclerview.widget.RecyclerView$a<?> & com.bytedance.jedi.ext.adapter.b.c<?, ? extends com.bytedance.jedi.ext.adapter.b.f<?>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    private C20626b(T t, AbstractC89172b<? super Integer, Integer> bVar) {
        C89219l.m154719c(t, "");
        C89219l.m154719c(bVar, "");
        this.f48788a = t;
        this.f48789b = bVar;
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: b */
    public final void mo3775b(int i, int i2) {
        if (i2 != 0) {
            this.f48788a.notifyItemRangeRemoved(this.f48789b.invoke(Integer.valueOf(i)).intValue(), i2);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: a */
    public final void mo3773a(int i, int i2) {
        if (i2 != 0) {
            m38848a().mo33910a();
            int intValue = this.f48789b.invoke(Integer.valueOf(i)).intValue();
            this.f48788a.notifyItemRangeInserted(intValue, i2);
            m38848a().mo33911a(intValue);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: c */
    public final void mo3776c(int i, int i2) {
        this.f48788a.notifyItemMoved(this.f48789b.invoke(Integer.valueOf(i)).intValue(), this.f48789b.invoke(Integer.valueOf(i2)).intValue());
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: a */
    public final void mo3774a(int i, int i2, Object obj) {
        this.f48788a.notifyItemRangeChanged(this.f48789b.invoke(Integer.valueOf(i)).intValue(), i2, obj);
    }
}
