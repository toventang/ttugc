package com.bytedance.jedi.ext.adapter;

import androidx.recyclerview.widget.AbstractC1485u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC1350a;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.internal.C20657a;
import com.bytedance.jedi.ext.adapter.internal.C20658b;
import com.bytedance.jedi.ext.adapter.internal.C20668g;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20628c;
import java.util.List;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* JADX WARN: Incorrect field signature: TT; */
/* renamed from: com.bytedance.jedi.ext.adapter.d */
public final class C20641d<T extends RecyclerView.AbstractC1350a<?> & AbstractC20628c<?, ? extends C20654i<?>>> implements AbstractC1485u {

    /* renamed from: a */
    private final RecyclerView.AbstractC1350a f48808a;

    /* renamed from: b */
    private final AbstractC89172b<Integer, Integer> f48809b;

    static {
        Covode.recordClassIndex(24173);
    }

    /* renamed from: a */
    private final C20658b m38874a() {
        return ((C20654i) ((AbstractC20628c) this.f48808a).mo33883b()).f48837a.f48872b;
    }

    /* renamed from: b */
    private final C20668g m38875b() {
        return ((C20654i) ((AbstractC20628c) this.f48808a).mo33883b()).f48837a.f48873c;
    }

    /* renamed from: c */
    private final C20657a m38876c() {
        return ((AbstractC20628c) this.f48808a).mo33883b().f48798b;
    }

    public /* synthetic */ C20641d(RecyclerView.AbstractC1350a aVar) {
        this(aVar, C206421.f48810a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T extends androidx.recyclerview.widget.RecyclerView$a<?> & com.bytedance.jedi.ext.adapter.b.c<?, ? extends com.bytedance.jedi.ext.adapter.i<?>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    public C20641d(T t, AbstractC89172b<? super Integer, Integer> bVar) {
        C89219l.m154719c(t, "");
        C89219l.m154719c(bVar, "");
        this.f48808a = t;
        this.f48809b = bVar;
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: a */
    public final void mo3773a(int i, int i2) {
        if (i2 != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i + i3;
                m38874a().mo33915a(i4, false);
                m38875b().mo33921a(i4, null);
            }
            m38876c().mo33910a();
            int intValue = this.f48809b.invoke(Integer.valueOf(i)).intValue();
            this.f48808a.notifyItemRangeInserted(intValue, i2);
            m38876c().mo33911a(intValue);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: b */
    public final void mo3775b(int i, int i2) {
        JediViewHolderProxy remove;
        if (i2 != 0) {
            C20658b a = m38874a();
            if (i != 0 || i2 < a.f48855a.size()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (i < a.f48855a.size()) {
                        a.f48855a.remove(i);
                    }
                    C20668g b = m38875b();
                    if (i < b.f48876a.size() && (remove = b.f48876a.remove(i)) != null) {
                        b.f48877b.mo33919b(remove);
                    }
                }
                this.f48808a.notifyItemRangeRemoved(this.f48809b.invoke(Integer.valueOf(i)).intValue(), i2);
                return;
            }
            a.mo33914a();
            m38875b().mo33920a();
            this.f48808a.notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: c */
    public final void mo3776c(int i, int i2) {
        List<Boolean> list = m38874a().f48855a;
        if (i < list.size() && i2 < list.size()) {
            boolean booleanValue = list.get(i).booleanValue();
            list.set(i, list.get(i2));
            list.set(i2, Boolean.valueOf(booleanValue));
        }
        List<JediViewHolderProxy> list2 = m38875b().f48876a;
        if (i < list2.size() && i2 < list2.size()) {
            JediViewHolderProxy jediViewHolderProxy = list2.get(i);
            list2.set(i, list2.get(i2));
            list2.set(i2, jediViewHolderProxy);
        }
        this.f48808a.notifyItemMoved(this.f48809b.invoke(Integer.valueOf(i)).intValue(), this.f48809b.invoke(Integer.valueOf(i2)).intValue());
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: a */
    public final void mo3774a(int i, int i2, Object obj) {
        this.f48808a.notifyItemRangeChanged(this.f48809b.invoke(Integer.valueOf(i)).intValue(), i2, C89387v.m154943a(obj, C20643e.f48811a));
    }
}
