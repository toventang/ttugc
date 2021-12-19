package com.p2082ss.android.ugc.aweme.i18n.musically.cut;

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

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.m */
public final class C53492m extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public C0498h<View> f122784a = new C0498h<>();

    /* renamed from: b */
    public C0498h<View> f122785b = new C0498h<>();

    /* renamed from: c */
    private RecyclerView.AbstractC1350a f122786c;

    /* renamed from: d */
    private RecyclerView.AbstractC1353c f122787d = new RecyclerView.AbstractC1353c() {
        /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53492m.C534953 */

        static {
            Covode.recordClassIndex(63068);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4655a() {
            C53492m.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4656a(int i, int i2) {
            C53492m mVar = C53492m.this;
            mVar.notifyItemRangeChanged(mVar.f122784a.mo2184b() + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: b */
        public final void mo4660b(int i, int i2) {
            C53492m mVar = C53492m.this;
            mVar.notifyItemRangeInserted(mVar.f122784a.mo2184b() + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: c */
        public final void mo4661c(int i, int i2) {
            C53492m mVar = C53492m.this;
            mVar.notifyItemRangeRemoved(mVar.f122784a.mo2184b() + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4657a(int i, int i2, int i3) {
            C53492m mVar = C53492m.this;
            mVar.notifyItemMoved(mVar.f122784a.mo2184b() + i, C53492m.this.f122784a.mo2184b() + i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4658a(int i, int i2, Object obj) {
            C53492m mVar = C53492m.this;
            mVar.notifyItemRangeChanged(mVar.f122784a.mo2184b() + i, i2, obj);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.m$a */
    public interface AbstractC53496a {
        static {
            Covode.recordClassIndex(63069);
        }

        /* renamed from: a */
        int mo90082a(GridLayoutManager gridLayoutManager, GridLayoutManager.AbstractC1337c cVar, int i);
    }

    static {
        Covode.recordClassIndex(63065);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m98700a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f122784a.mo2184b() + this.f122786c.getItemCount() + this.f122785b.mo2184b();
    }

    /* renamed from: a */
    private boolean m98701a(int i) {
        if (i < this.f122784a.mo2184b()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void registerAdapterDataObserver(RecyclerView.AbstractC1353c cVar) {
        super.registerAdapterDataObserver(cVar);
        this.f122786c.registerAdapterDataObserver(this.f122787d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void unregisterAdapterDataObserver(RecyclerView.AbstractC1353c cVar) {
        super.unregisterAdapterDataObserver(cVar);
        this.f122786c.unregisterAdapterDataObserver(this.f122787d);
    }

    public C53492m(RecyclerView.AbstractC1350a aVar) {
        this.f122786c = aVar;
    }

    /* renamed from: b */
    private boolean m98702b(int i) {
        if (this.f122784a.mo2184b() + this.f122786c.getItemCount() < i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo90081a(View view) {
        C0498h<View> hVar = this.f122785b;
        hVar.mo2186b(hVar.mo2184b() + 200000, view);
        notifyItemRangeChanged(getItemCount() - this.f122785b.mo2184b(), this.f122785b.mo2184b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (m98701a(i)) {
            return this.f122784a.mo2187c(i);
        }
        if (m98702b(i)) {
            return this.f122785b.mo2187c((i - this.f122784a.mo2184b()) - this.f122786c.getItemCount());
        }
        return this.f122786c.getItemViewType(i - this.f122784a.mo2184b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f122786c.onAttachedToRecyclerView(recyclerView);
        final C534931 r3 = new AbstractC53496a() {
            /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53492m.C534931 */

            static {
                Covode.recordClassIndex(63066);
            }

            @Override // com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53492m.AbstractC53496a
            /* renamed from: a */
            public final int mo90082a(GridLayoutManager gridLayoutManager, GridLayoutManager.AbstractC1337c cVar, int i) {
                int itemViewType = C53492m.this.getItemViewType(i);
                if (C53492m.this.f122784a.mo2183a(itemViewType, null) != null) {
                    return gridLayoutManager.f4316b;
                }
                if (C53492m.this.f122785b.mo2183a(itemViewType, null) != null) {
                    return gridLayoutManager.f4316b;
                }
                if (cVar != null) {
                    return cVar.mo4342a(i - C53492m.this.f122784a.mo2184b());
                }
                return 1;
            }
        };
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final GridLayoutManager.AbstractC1337c cVar = gridLayoutManager.f4321g;
            gridLayoutManager.mo4320a(new GridLayoutManager.AbstractC1337c() {
                /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53492m.C534942 */

                static {
                    Covode.recordClassIndex(63067);
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
                /* renamed from: a */
                public final int mo4342a(int i) {
                    return r3.mo90082a(gridLayoutManager, cVar, i);
                }
            });
            gridLayoutManager.mo4318a(gridLayoutManager.f4316b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        ViewGroup.LayoutParams layoutParams;
        this.f122786c.onViewAttachedToWindow(viewHolder);
        int layoutPosition = viewHolder.getLayoutPosition();
        if ((m98701a(layoutPosition) || m98702b(layoutPosition)) && (layoutParams = viewHolder.itemView.getLayoutParams()) != null && (layoutParams instanceof StaggeredGridLayoutManager.C1385b)) {
            ((StaggeredGridLayoutManager.C1385b) layoutParams).f4602b = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!m98701a(i) && !m98702b(i)) {
            this.f122786c.onBindViewHolder(viewHolder, i - this.f122784a.mo2184b());
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m98700a(C53492m mVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(10393);
        if (mVar.f122784a.mo2183a(i, null) != null) {
            viewHolder = C53512w.m98729a(viewGroup.getContext(), mVar.f122784a.mo2183a(i, null));
            viewHolder.setIsRecyclable(false);
        } else if (mVar.f122785b.mo2183a(i, null) != null) {
            viewHolder = C53512w.m98729a(viewGroup.getContext(), mVar.f122785b.mo2183a(i, null));
            viewHolder.setIsRecyclable(false);
        } else {
            viewHolder = mVar.f122786c.onCreateViewHolder(viewGroup, i);
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
        MethodCollector.m26664o(10393);
        return viewHolder;
    }
}
