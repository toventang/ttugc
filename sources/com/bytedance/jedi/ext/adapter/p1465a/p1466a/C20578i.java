package com.bytedance.jedi.ext.adapter.p1465a.p1466a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.a.a.i */
public final class C20578i extends AbstractC20573f {

    /* renamed from: c */
    public int f48720c = 16187392;

    static {
        Covode.recordClassIndex(24110);
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: e */
    public final int mo33862e() {
        return this.f48720c;
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: g */
    public final boolean mo33864g() {
        if (this.f48706b != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: a */
    public final void mo33860a(int i) {
        this.f48720c = i;
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo33859a(ViewGroup viewGroup) {
        C89219l.m154719c(viewGroup, "");
        AbstractC89172b<? super ViewGroup, ? extends RecyclerView.ViewHolder> bVar = this.f48706b;
        if (bVar == null) {
            C89219l.m154707a();
        }
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) bVar.invoke(viewGroup);
        mo33853a(viewHolder);
        return viewHolder;
    }
}
