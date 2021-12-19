package com.p2082ss.android.ugc.aweme.kids.discovery.p3348a;

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
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.a.c */
public class C57540c extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    final ArrayList<C57552g> f131355a = new ArrayList<>();

    /* renamed from: b */
    final ArrayList<C57552g> f131356b = new ArrayList<>();

    /* renamed from: c */
    final C0498h<C57552g> f131357c = new C0498h<>();

    /* renamed from: d */
    final C57553h f131358d = new C57553h();

    /* renamed from: e */
    public RecyclerView f131359e;

    /* renamed from: f */
    public RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> f131360f;

    /* renamed from: g */
    private final C0498h<C57552g> f131361g = new C0498h<>();

    /* renamed from: h */
    private final C57541a f131362h = new C57541a(this);

    static {
        Covode.recordClassIndex(67490);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m104247a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.a.c$a */
    public static final class C57541a extends RecyclerView.AbstractC1353c {

        /* renamed from: a */
        final /* synthetic */ C57540c f131363a;

        static {
            Covode.recordClassIndex(67491);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4655a() {
            this.f131363a.notifyDataSetChanged();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57541a(C57540c cVar) {
            this.f131363a = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4656a(int i, int i2) {
            C57540c cVar = this.f131363a;
            cVar.notifyItemRangeChanged(cVar.f131355a.size() + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: b */
        public final void mo4660b(int i, int i2) {
            C57540c cVar = this.f131363a;
            cVar.notifyItemRangeInserted(cVar.f131355a.size() + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: c */
        public final void mo4661c(int i, int i2) {
            C57540c cVar = this.f131363a;
            cVar.notifyItemRangeRemoved(cVar.f131355a.size() + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4657a(int i, int i2, int i3) {
            C57540c cVar = this.f131363a;
            cVar.notifyItemMoved(cVar.f131355a.size() + i, this.f131363a.f131355a.size() + i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4658a(int i, int i2, Object obj) {
            C57540c cVar = this.f131363a;
            cVar.notifyItemRangeChanged(cVar.f131355a.size() + i, i2, obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return this.f131355a.size() + this.f131356b.size() + this.f131360f.getItemCount();
    }

    /* renamed from: a */
    private final boolean mo94895a(int i) {
        if (i < this.f131355a.size()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        this.f131359e = null;
        this.f131360f.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void registerAdapterDataObserver(RecyclerView.AbstractC1353c cVar) {
        C89219l.m154721d(cVar, "");
        super.registerAdapterDataObserver(cVar);
        this.f131360f.registerAdapterDataObserver(this.f131362h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void unregisterAdapterDataObserver(RecyclerView.AbstractC1353c cVar) {
        C89219l.m154721d(cVar, "");
        super.unregisterAdapterDataObserver(cVar);
        this.f131360f.unregisterAdapterDataObserver(this.f131362h);
    }

    /* renamed from: b */
    private final boolean mo94896b(int i) {
        if (i >= this.f131355a.size() + this.f131360f.getItemCount()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        if (C57553h.m104270a(viewHolder.getItemViewType())) {
            return super.onFailedToRecycleView(viewHolder);
        }
        return this.f131360f.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        if (C57553h.m104270a(viewHolder.getItemViewType())) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f131360f.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        if (C57553h.m104270a(viewHolder.getItemViewType())) {
            super.onViewRecycled(viewHolder);
        } else {
            this.f131360f.onViewRecycled(viewHolder);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.a.c$b */
    public static final class C57542b extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ C57540c f131364e;

        /* renamed from: f */
        final /* synthetic */ GridLayoutManager f131365f;

        /* renamed from: g */
        final /* synthetic */ GridLayoutManager.AbstractC1337c f131366g;

        static {
            Covode.recordClassIndex(67492);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            if (C57553h.m104270a(this.f131364e.getItemViewType(i))) {
                GridLayoutManager gridLayoutManager = this.f131365f;
                if (gridLayoutManager != null) {
                    return gridLayoutManager.f4316b;
                }
                return 1;
            }
            GridLayoutManager.AbstractC1337c cVar = this.f131366g;
            if (cVar != null) {
                return cVar.mo4342a(i - this.f131364e.f131355a.size());
            }
            return 1;
        }

        C57542b(C57540c cVar, GridLayoutManager gridLayoutManager, GridLayoutManager.AbstractC1337c cVar2) {
            this.f131364e = cVar;
            this.f131365f = gridLayoutManager;
            this.f131366g = cVar2;
        }
    }

    public C57540c(RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar) {
        C89219l.m154721d(aVar, "");
        this.f131360f = aVar;
        setHasStableIds(this.f131360f.mHasStableIds);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        this.f131359e = recyclerView;
        this.f131360f.onAttachedToRecyclerView(recyclerView);
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.mo4320a(new C57542b(this, gridLayoutManager, gridLayoutManager.f4321g));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        if (C57553h.m104270a(viewHolder.getItemViewType())) {
            View view = viewHolder.itemView;
            C89219l.m154716b(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.C1385b) {
                ((StaggeredGridLayoutManager.C1385b) layoutParams).f4602b = true;
                return;
            }
            return;
        }
        this.f131360f.onViewAttachedToWindow(viewHolder);
    }

    /* renamed from: a */
    public final void mo94893a(View view) {
        int i;
        int size = this.f131356b.size();
        if (size >= 0 && size <= this.f131356b.size() && view != null) {
            C57553h hVar = this.f131358d;
            if (hVar.f131387b.size() > 0) {
                Integer removeFirst = hVar.f131387b.removeFirst();
                C89219l.m154716b(removeFirst, "");
                i = removeFirst.intValue();
            } else {
                i = hVar.f131386a;
                if (i <= 110000) {
                    hVar.f131386a++;
                } else {
                    throw new IllegalStateException("Your viewType is too much,it's impossible in common");
                }
            }
            C57552g gVar = new C57552g(i, view);
            this.f131356b.add(gVar);
            this.f131357c.mo2186b(i, gVar);
            notifyItemInserted((getItemCount() - this.f131356b.size()) + size);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        if (mo94895a(i)) {
            return this.f131355a.get(i).f131384a;
        }
        if (mo94896b(i)) {
            return this.f131356b.get((i - this.f131355a.size()) - this.f131360f.getItemCount()).f131384a;
        }
        int itemViewType = this.f131360f.getItemViewType(i - this.f131355a.size());
        if (!C57553h.m104270a(itemViewType)) {
            return itemViewType;
        }
        throw new IllegalArgumentException("HeaderAndFooterWrapper use the viewType between 100000 and 110000");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (!mo94895a(i) && !mo94896b(i)) {
            this.f131360f.onBindViewHolder(viewHolder, i - this.f131355a.size());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list, "");
        if (!mo94895a(i) && !mo94896b(i)) {
            this.f131360f.onBindViewHolder(viewHolder, i - this.f131355a.size(), list);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m104247a(C57540c cVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(2423);
        C89219l.m154721d(viewGroup, "");
        C57552g a2 = cVar.f131361g.mo2183a(i, null);
        if (a2 == null) {
            a2 = cVar.f131357c.mo2183a(i, null);
        }
        if (a2 == null) {
            a2 = cVar.f131360f.onCreateViewHolder(viewGroup, i);
            C89219l.m154716b(a2, "");
        }
        try {
            if (a2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = a2.getClass().getName();
        MethodCollector.m26664o(2423);
        return a2;
    }
}
