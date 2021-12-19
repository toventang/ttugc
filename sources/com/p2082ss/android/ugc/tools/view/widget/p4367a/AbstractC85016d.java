package com.p2082ss.android.ugc.tools.view.widget.p4367a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.tools.view.widget.p4367a.C85010a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.widget.a.d */
public abstract class AbstractC85016d extends AbstractC85017e {

    /* renamed from: a */
    private boolean f190192a;

    /* renamed from: b */
    public final RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> f190193b;

    /* renamed from: c */
    private final boolean f190194c = true;

    static {
        Covode.recordClassIndex(99037);
    }

    /* renamed from: a */
    public abstract void mo129943a(RecyclerView.ViewHolder viewHolder);

    /* renamed from: b */
    public abstract RecyclerView.ViewHolder mo129944b(ViewGroup viewGroup);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m146152a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        int itemCount = this.f190193b.getItemCount();
        if ((!this.f190194c || itemCount != 0) && this.f190192a) {
            return itemCount + 1;
        }
        return itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        if (i != this.f190193b.getItemCount() || !this.f190192a) {
            return this.f190193b.getItemViewType(i);
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85017e
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        boolean z;
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        View view = viewHolder.itemView;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.C1385b)) {
            StaggeredGridLayoutManager.C1385b bVar = (StaggeredGridLayoutManager.C1385b) layoutParams;
            if (getItemViewType(viewHolder.getLayoutPosition()) == Integer.MIN_VALUE) {
                z = true;
            } else {
                z = false;
            }
            bVar.f4602b = z;
        }
    }

    public AbstractC85016d(RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar, boolean z) {
        C89219l.m154721d(aVar, "");
        this.f190193b = aVar;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(this, "");
        aVar.registerAdapterDataObserver(new C85010a.C85011a(this));
        this.f190192a = true;
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85017e
    /* renamed from: a */
    public final int mo129939a(int i, GridLayoutManager gridLayoutManager) {
        C89219l.m154721d(gridLayoutManager, "");
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            return gridLayoutManager.f4316b;
        }
        RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar = this.f190193b;
        if (aVar instanceof AbstractC85017e) {
            return ((AbstractC85017e) aVar).mo129939a(i, gridLayoutManager);
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            mo129943a(viewHolder);
        } else {
            this.f190193b.onBindViewHolder(viewHolder, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list, "");
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            onBindViewHolder(viewHolder, i);
        } else {
            this.f190193b.onBindViewHolder(viewHolder, i, list);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m146152a(AbstractC85016d dVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        C89219l.m154721d(viewGroup, "");
        if (Integer.MIN_VALUE == i) {
            viewHolder = dVar.mo129944b(viewGroup);
        } else {
            viewHolder = dVar.f190193b.onCreateViewHolder(viewGroup, i);
            C89219l.m154716b(viewHolder, "");
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        return viewHolder;
    }
}
