package com.bytedance.jedi.ext.adapter.p1465a.p1466a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.jedi.ext.adapter.a.a.f */
public abstract class AbstractC20573f implements AbstractC20582m {

    /* renamed from: a */
    public View f48705a;

    /* renamed from: b */
    public AbstractC89172b<? super ViewGroup, ? extends RecyclerView.ViewHolder> f48706b;

    /* renamed from: c */
    private boolean f48707c;

    /* renamed from: d */
    private RecyclerView.ViewHolder f48708d;

    static {
        Covode.recordClassIndex(24105);
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo33856b() {
        return this.f48708d;
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: d */
    public final void mo33858d() {
        AbstractC20582m.C20583a.m38804a(this);
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: a */
    public final boolean mo33855a() {
        return this.f48707c;
    }

    /* renamed from: c */
    public int mo33857c() {
        if (mo33864g()) {
            return 1;
        }
        return 0;
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: a */
    public final void mo33854a(boolean z) {
        this.f48707c = z;
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: a */
    public final void mo33853a(RecyclerView.ViewHolder viewHolder) {
        View view;
        this.f48708d = viewHolder;
        if (viewHolder != null) {
            view = viewHolder.itemView;
        } else {
            view = null;
        }
        this.f48705a = view;
    }
}
