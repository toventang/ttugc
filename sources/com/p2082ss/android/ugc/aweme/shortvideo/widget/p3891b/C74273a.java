package com.p2082ss.android.ugc.aweme.shortvideo.widget.p3891b;

import android.view.View;
import android.view.ViewGroup;
import androidx.p025c.C0498h;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.b.a */
public final class C74273a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public C0498h<View> f167015a;

    /* renamed from: b */
    public C0498h<View> f167016b;

    /* renamed from: c */
    private RecyclerView.AbstractC1350a f167017c;

    /* renamed from: d */
    private RecyclerView.AbstractC1353c f167018d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.b.a$a */
    public interface AbstractC74276a {
        static {
            Covode.recordClassIndex(87048);
        }

        /* renamed from: a */
        int mo116880a(GridLayoutManager gridLayoutManager, GridLayoutManager.AbstractC1337c cVar, int i);
    }

    static {
        Covode.recordClassIndex(87045);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m130678a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f167015a.mo2184b() + this.f167017c.getItemCount() + this.f167016b.mo2184b();
    }

    /* renamed from: a */
    private boolean m130679a(int i) {
        if (i < this.f167015a.mo2184b()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void registerAdapterDataObserver(RecyclerView.AbstractC1353c cVar) {
        super.registerAdapterDataObserver(cVar);
        this.f167017c.registerAdapterDataObserver(this.f167018d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void unregisterAdapterDataObserver(RecyclerView.AbstractC1353c cVar) {
        super.unregisterAdapterDataObserver(cVar);
        this.f167017c.unregisterAdapterDataObserver(this.f167018d);
    }

    /* renamed from: b */
    private boolean m130680b(int i) {
        if (this.f167015a.mo2184b() + this.f167017c.getItemCount() < i) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (m130679a(i)) {
            return this.f167015a.mo2187c(i);
        }
        if (m130680b(i)) {
            return this.f167016b.mo2187c((i - this.f167015a.mo2184b()) - this.f167017c.getItemCount());
        }
        return this.f167017c.getItemViewType(i - this.f167015a.mo2184b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f167017c.onAttachedToRecyclerView(recyclerView);
        final C742741 r3 = new AbstractC74276a() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.p3891b.C74273a.C742741 */

            static {
                Covode.recordClassIndex(87046);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.p3891b.C74273a.AbstractC74276a
            /* renamed from: a */
            public final int mo116880a(GridLayoutManager gridLayoutManager, GridLayoutManager.AbstractC1337c cVar, int i) {
                int itemViewType = C74273a.this.getItemViewType(i);
                if (C74273a.this.f167015a.mo2183a(itemViewType, null) != null) {
                    return gridLayoutManager.f4316b;
                }
                if (C74273a.this.f167016b.mo2183a(itemViewType, null) != null) {
                    return gridLayoutManager.f4316b;
                }
                if (cVar != null) {
                    return cVar.mo4342a(i - C74273a.this.f167015a.mo2184b());
                }
                return 1;
            }
        };
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final GridLayoutManager.AbstractC1337c cVar = gridLayoutManager.f4321g;
            gridLayoutManager.mo4320a(new GridLayoutManager.AbstractC1337c() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.p3891b.C74273a.C742752 */

                static {
                    Covode.recordClassIndex(87047);
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
                /* renamed from: a */
                public final int mo4342a(int i) {
                    return r3.mo116880a(gridLayoutManager, cVar, i);
                }
            });
            gridLayoutManager.mo4318a(gridLayoutManager.f4316b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        ViewGroup.LayoutParams layoutParams;
        this.f167017c.onViewAttachedToWindow(viewHolder);
        int layoutPosition = viewHolder.getLayoutPosition();
        if ((m130679a(layoutPosition) || m130680b(layoutPosition)) && (layoutParams = viewHolder.itemView.getLayoutParams()) != null && (layoutParams instanceof StaggeredGridLayoutManager.C1385b)) {
            ((StaggeredGridLayoutManager.C1385b) layoutParams).f4602b = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!m130679a(i) && !m130680b(i)) {
            this.f167017c.onBindViewHolder(viewHolder, i - this.f167015a.mo2184b());
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m130678a(C74273a aVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(11303);
        if (aVar.f167015a.mo2183a(i, null) != null) {
            viewHolder = C74277b.m130684a(aVar.f167015a.mo2183a(i, null));
            viewHolder.setIsRecyclable(false);
        } else if (aVar.f167016b.mo2183a(i, null) != null) {
            viewHolder = C74277b.m130684a(aVar.f167016b.mo2183a(i, null));
            viewHolder.setIsRecyclable(false);
        } else {
            viewHolder = aVar.f167017c.onCreateViewHolder(viewGroup, i);
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
        MethodCollector.m26664o(11303);
        return viewHolder;
    }
}
