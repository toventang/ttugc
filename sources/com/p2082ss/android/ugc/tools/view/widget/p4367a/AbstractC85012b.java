package com.p2082ss.android.ugc.tools.view.widget.p4367a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.tools.view.widget.a.b */
public abstract class AbstractC85012b<T> extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: b */
    public final List<T> f190187b = new ArrayList();

    static {
        Covode.recordClassIndex(99033);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f190187b.size();
    }

    /* renamed from: a */
    public final List<T> mo129934a() {
        return C89070n.m154585g((Collection) this.f190187b);
    }

    /* renamed from: a */
    public final T mo129933a(int i) {
        return this.f190187b.get(i);
    }

    /* renamed from: b */
    public final void mo129937b(List<? extends T> list) {
        this.f190187b.clear();
        if (list != null) {
            this.f190187b.addAll(list);
        }
    }

    /* renamed from: a */
    public final void mo129936a(List<? extends T> list) {
        mo129937b(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo129935a(T t, int i) {
        if (t != null) {
            this.f190187b.set(i, t);
            notifyItemChanged(i);
        }
    }
}
