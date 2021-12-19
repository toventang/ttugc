package com.p2082ss.android.ugc.aweme.discover.alading;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.a */
public final class C41805a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private RecyclerView.AbstractC1350a f97517a;

    /* renamed from: b */
    private RecyclerView.AbstractC1353c f97518b;

    static {
        Covode.recordClassIndex(49721);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m83760a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        RecyclerView.AbstractC1350a aVar = this.f97517a;
        if (aVar != null) {
            return aVar.getItemCount();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return this.f97517a.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.AbstractC1350a aVar = this.f97517a;
        if (aVar != null) {
            aVar.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        RecyclerView.AbstractC1350a aVar = this.f97517a;
        if (aVar != null) {
            aVar.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.AbstractC1350a aVar = this.f97517a;
        if (aVar != null) {
            return aVar.onFailedToRecycleView(viewHolder);
        }
        return super.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        RecyclerView.AbstractC1350a aVar = this.f97517a;
        if (aVar != null) {
            aVar.onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        RecyclerView.AbstractC1350a aVar = this.f97517a;
        if (aVar != null) {
            aVar.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        RecyclerView.AbstractC1350a aVar = this.f97517a;
        if (aVar != null) {
            aVar.onViewRecycled(viewHolder);
        }
    }

    /* renamed from: a */
    public final void mo70964a(RecyclerView.AbstractC1350a aVar) {
        RecyclerView.AbstractC1350a aVar2 = this.f97517a;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                try {
                    aVar2.unregisterAdapterDataObserver(this.f97518b);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.f97517a = aVar;
            C41826c cVar = new C41826c(this);
            this.f97518b = cVar;
            aVar.registerAdapterDataObserver(cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.f97517a.onBindViewHolder(viewHolder, i);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m83760a(C41805a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(8359);
        RecyclerView.ViewHolder onCreateViewHolder = aVar.f97517a.onCreateViewHolder(viewGroup, i);
        try {
            if (onCreateViewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(onCreateViewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) onCreateViewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(onCreateViewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = onCreateViewHolder.getClass().getName();
        MethodCollector.m26664o(8359);
        return onCreateViewHolder;
    }
}
