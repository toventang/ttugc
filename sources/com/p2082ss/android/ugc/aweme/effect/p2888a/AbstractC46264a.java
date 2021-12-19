package com.p2082ss.android.ugc.aweme.effect.p2888a;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.EffectModel;
import com.p2082ss.android.ugc.aweme.effect.p2889b.C46300a;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.effect.a.a */
public abstract class AbstractC46264a<VH extends RecyclerView.ViewHolder> extends RecyclerView.AbstractC1350a<VH> {

    /* renamed from: a */
    private List<Integer> f107833a = new ArrayList();

    /* renamed from: b */
    private final RecyclerView f107834b;

    /* renamed from: c */
    public List<EffectModel> f107835c = new ArrayList();

    /* renamed from: d */
    private final C46300a f107836d;

    static {
        Covode.recordClassIndex(54841);
    }

    /* renamed from: a */
    private final void m89274a() {
        this.f107833a.clear();
        Iterator<T> it = this.f107835c.iterator();
        while (it.hasNext()) {
            this.f107833a.add(Integer.valueOf(mo120542a((EffectModel) it.next())));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo78738a(int i) {
        return this.f107833a.get(i).intValue();
    }

    /* renamed from: a */
    public final void mo78740a(List<? extends EffectModel> list) {
        if (list != null) {
            this.f107835c.clear();
            this.f107835c.addAll(list);
            m89274a();
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private final int mo120542a(EffectModel effectModel) {
        if (C84902i.m145892a(effectModel.resDir)) {
            return 16;
        }
        C46300a aVar = this.f107836d;
        if (aVar != null && aVar.mo78792a(effectModel)) {
            return 8;
        }
        C46300a aVar2 = this.f107836d;
        if (aVar2 == null || !aVar2.mo78794b(effectModel)) {
            return 2;
        }
        return 8;
    }

    public AbstractC46264a(RecyclerView recyclerView, C46300a aVar) {
        this.f107834b = recyclerView;
        this.f107836d = aVar;
    }

    /* renamed from: a */
    public final void mo78739a(int i, int i2) {
        if (this.f107833a.size() > i && this.f107833a.get(i).intValue() != i2) {
            this.f107833a.set(i, Integer.valueOf(i2));
            notifyItemChanged(i);
        }
    }
}
