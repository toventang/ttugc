package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.m */
public final class C41731m<VH extends RecyclerView.ViewHolder> extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public int f97353a = 1;

    /* renamed from: b */
    public final RecyclerView.AbstractC1350a<VH> f97354b;

    /* renamed from: c */
    final AbstractC41741p f97355c;

    /* renamed from: d */
    final AbstractC41736e f97356d;

    /* renamed from: e */
    RecyclerView f97357e;

    /* renamed from: f */
    C41735d f97358f;

    /* renamed from: g */
    RecyclerView.AbstractC1371n f97359g;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.m$e */
    public interface AbstractC41736e {
        static {
            Covode.recordClassIndex(49649);
        }
    }

    static {
        Covode.recordClassIndex(49644);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m83696a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.m$b */
    static class C41733b implements AbstractC41741p {
        static {
            Covode.recordClassIndex(49646);
        }

        private C41733b() {
        }

        /* synthetic */ C41733b(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41741p
        /* renamed from: a */
        public final AbstractC41740o mo70918a(ViewGroup viewGroup) {
            return new C41734c(new C41737n(viewGroup.getContext()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.m$d */
    static class C41735d extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        RecyclerView f97362e;

        /* renamed from: f */
        GridLayoutManager f97363f;

        /* renamed from: g */
        GridLayoutManager.AbstractC1337c f97364g;

        static {
            Covode.recordClassIndex(49648);
        }

        C41735d() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            if (i < this.f97362e.getAdapter().getItemCount() - 1) {
                return this.f97364g.mo4342a(i);
            }
            return this.f97363f.f4316b;
        }
    }

    /* renamed from: a */
    private void m83698a() {
        notifyItemChanged(getItemCount() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f97354b.getItemCount() + 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.m$a */
    static class C41732a extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        AbstractC41736e f97360a;

        static {
            Covode.recordClassIndex(49645);
        }

        C41732a(AbstractC41736e eVar) {
            this.f97360a = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            super.mo4753a(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            super.mo4754a(recyclerView, i, i2);
            recyclerView.canScrollVertically(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.m$c */
    static class C41734c extends AbstractC41740o {

        /* renamed from: a */
        C41737n f97361a;

        static {
            Covode.recordClassIndex(49647);
        }

        C41734c(View view) {
            super(view);
            this.f97361a = (C41737n) view;
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41740o
        /* renamed from: a */
        public final void mo70919a(int i) {
            this.f97361a.setState(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void setHasStableIds(boolean z) {
        this.f97354b.setHasStableIds(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.RecyclerView$ViewHolder */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC41740o) {
            return super.onFailedToRecycleView(viewHolder);
        }
        return this.f97354b.onFailedToRecycleView(viewHolder);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.RecyclerView$ViewHolder */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC41740o) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            this.f97354b.onViewAttachedToWindow(viewHolder);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.RecyclerView$ViewHolder */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC41740o) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f97354b.onViewDetachedFromWindow(viewHolder);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.RecyclerView$ViewHolder */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC41740o) {
            super.onViewRecycled(viewHolder);
        } else {
            this.f97354b.onViewRecycled(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void registerAdapterDataObserver(RecyclerView.AbstractC1353c cVar) {
        super.registerAdapterDataObserver(cVar);
        this.f97354b.registerAdapterDataObserver(cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void unregisterAdapterDataObserver(RecyclerView.AbstractC1353c cVar) {
        super.unregisterAdapterDataObserver(cVar);
        this.f97354b.unregisterAdapterDataObserver(cVar);
    }

    /* renamed from: a */
    public static <VH extends RecyclerView.ViewHolder> C41731m<VH> m83697a(RecyclerView.AbstractC1350a<VH> aVar) {
        Objects.requireNonNull(aVar);
        if (!(aVar instanceof C41731m)) {
            return new C41731m<>(aVar, new C41733b((byte) 0));
        }
        throw new IllegalArgumentException("LoadMoreAdapter can't wrap itself.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        if (i < this.f97354b.getItemCount()) {
            return this.f97354b.getItemId(i);
        }
        return super.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (i < this.f97354b.getItemCount()) {
            return this.f97354b.getItemViewType(i);
        }
        return 65298;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f97354b.onDetachedFromRecyclerView(recyclerView);
        if (this.f97358f != null) {
            this.f97358f = null;
        }
        RecyclerView.AbstractC1371n nVar = this.f97359g;
        if (nVar != null) {
            this.f97357e.mo4418b(nVar);
        }
        this.f97357e = null;
        super.onDetachedFromRecyclerView(recyclerView);
    }

    /* renamed from: a */
    public final void mo70917a(int i) {
        if (i != 0 && i != 1 && i != 3 && i != 2) {
            throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
        } else if (this.f97353a != i) {
            this.f97353a = i;
            m83698a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f97357e = recyclerView;
        if (this.f97358f == null && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C41735d dVar = new C41735d();
            this.f97358f = dVar;
            dVar.f97362e = recyclerView;
            dVar.f97363f = (GridLayoutManager) recyclerView.getLayoutManager();
            dVar.f97364g = dVar.f97363f.f4321g;
            dVar.f97363f.mo4320a(dVar);
        }
        if (this.f97359g == null && this.f97356d != null) {
            this.f97359g = new C41732a(this.f97356d);
        }
        RecyclerView.AbstractC1371n nVar = this.f97359g;
        if (nVar != null) {
            this.f97357e.mo4405a(nVar);
        }
        this.f97354b.onAttachedToRecyclerView(recyclerView);
    }

    private C41731m(RecyclerView.AbstractC1350a<VH> aVar, AbstractC41741p pVar) {
        this.f97354b = aVar;
        this.f97355c = pVar;
        this.f97356d = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i < this.f97354b.getItemCount()) {
            this.f97354b.onBindViewHolder(viewHolder, i);
        } else {
            ((AbstractC41740o) viewHolder).mo70919a(this.f97353a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.RecyclerView$ViewHolder */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (i < this.f97354b.getItemCount()) {
            this.f97354b.onBindViewHolder(viewHolder, i, list);
        } else {
            super.onBindViewHolder(viewHolder, i, list);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m83696a(C41731m mVar, ViewGroup viewGroup, int i) {
        VH vh;
        boolean a;
        MethodCollector.m26663i(11579);
        if (i == 65298) {
            vh = mVar.f97355c.mo70918a(viewGroup);
        } else {
            vh = mVar.f97354b.onCreateViewHolder(viewGroup, i);
        }
        try {
            if (vh.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(vh.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) vh.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(vh.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = vh.getClass().getName();
        MethodCollector.m26664o(11579);
        return vh;
    }
}
