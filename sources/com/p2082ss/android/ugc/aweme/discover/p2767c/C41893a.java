package com.p2082ss.android.ugc.aweme.discover.p2767c;

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
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.c.a */
public final class C41893a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    final ArrayList<C41907g> f97736a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<C41907g> f97737b = new ArrayList<>();

    /* renamed from: c */
    public final C0498h<C41907g> f97738c = new C0498h<>();

    /* renamed from: d */
    public final C41908h f97739d = new C41908h();

    /* renamed from: e */
    public RecyclerView f97740e;

    /* renamed from: f */
    public RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> f97741f;

    /* renamed from: g */
    private final C0498h<C41907g> f97742g = new C0498h<>();

    /* renamed from: h */
    private final C41894a f97743h = new C41894a(this);

    static {
        Covode.recordClassIndex(49819);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m83920a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.c.a$a */
    public static final class C41894a extends RecyclerView.AbstractC1353c {

        /* renamed from: a */
        final /* synthetic */ C41893a f97744a;

        static {
            Covode.recordClassIndex(49820);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4655a() {
            this.f97744a.notifyDataSetChanged();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41894a(C41893a aVar) {
            this.f97744a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4656a(int i, int i2) {
            C41893a aVar = this.f97744a;
            aVar.notifyItemRangeChanged(aVar.f97736a.size() + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: b */
        public final void mo4660b(int i, int i2) {
            C41893a aVar = this.f97744a;
            aVar.notifyItemRangeInserted(aVar.f97736a.size() + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: c */
        public final void mo4661c(int i, int i2) {
            C41893a aVar = this.f97744a;
            aVar.notifyItemRangeRemoved(aVar.f97736a.size() + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4657a(int i, int i2, int i3) {
            C41893a aVar = this.f97744a;
            aVar.notifyItemMoved(aVar.f97736a.size() + i, this.f97744a.f97736a.size() + i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4658a(int i, int i2, Object obj) {
            C41893a aVar = this.f97744a;
            aVar.notifyItemRangeChanged(aVar.f97736a.size() + i, i2, obj);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f97736a.size() + this.f97737b.size() + this.f97741f.getItemCount();
    }

    /* renamed from: a */
    public final List<View> mo71052a() {
        ArrayList<C41907g> arrayList = this.f97736a;
        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C41907g) it.next()).itemView);
        }
        return arrayList2;
    }

    /* renamed from: a */
    private final boolean m83921a(int i) {
        if (i < this.f97736a.size()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        this.f97740e = null;
        this.f97741f.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void unregisterAdapterDataObserver(RecyclerView.AbstractC1353c cVar) {
        C89219l.m154721d(cVar, "");
        super.unregisterAdapterDataObserver(cVar);
        this.f97741f.unregisterAdapterDataObserver(this.f97743h);
    }

    /* renamed from: b */
    private final boolean m83922b(int i) {
        if (i >= this.f97736a.size() + this.f97741f.getItemCount()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo71054a(View view) {
        mo71053a(this.f97736a.size(), view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        if (C41908h.m83951a(viewHolder.getItemViewType())) {
            return super.onFailedToRecycleView(viewHolder);
        }
        return this.f97741f.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        if (C41908h.m83951a(viewHolder.getItemViewType())) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f97741f.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        if (C41908h.m83951a(viewHolder.getItemViewType())) {
            super.onViewRecycled(viewHolder);
        } else {
            this.f97741f.onViewRecycled(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void registerAdapterDataObserver(RecyclerView.AbstractC1353c cVar) {
        C89219l.m154721d(cVar, "");
        super.registerAdapterDataObserver(cVar);
        RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar = this.f97741f;
        if (aVar != null) {
            try {
                aVar.unregisterAdapterDataObserver(this.f97743h);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f97741f.registerAdapterDataObserver(this.f97743h);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.c.a$b */
    public static final class C41895b extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ C41893a f97745e;

        /* renamed from: f */
        final /* synthetic */ GridLayoutManager f97746f;

        /* renamed from: g */
        final /* synthetic */ GridLayoutManager.AbstractC1337c f97747g;

        static {
            Covode.recordClassIndex(49821);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            if (C41908h.m83951a(this.f97745e.getItemViewType(i))) {
                GridLayoutManager gridLayoutManager = this.f97746f;
                if (gridLayoutManager != null) {
                    return gridLayoutManager.f4316b;
                }
                return 1;
            }
            GridLayoutManager.AbstractC1337c cVar = this.f97747g;
            if (cVar != null) {
                return cVar.mo4342a(i - this.f97745e.f97736a.size());
            }
            return 1;
        }

        C41895b(C41893a aVar, GridLayoutManager gridLayoutManager, GridLayoutManager.AbstractC1337c cVar) {
            this.f97745e = aVar;
            this.f97746f = gridLayoutManager;
            this.f97747g = cVar;
        }
    }

    public C41893a(RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar) {
        C89219l.m154721d(aVar, "");
        this.f97741f = aVar;
        setHasStableIds(this.f97741f.mHasStableIds);
    }

    /* renamed from: c */
    private boolean m83923c(int i) {
        if (i < 0 || i >= this.f97736a.size()) {
            return false;
        }
        C41907g remove = this.f97736a.remove(i);
        C89219l.m154716b(remove, "");
        C41907g gVar = remove;
        this.f97742g.mo2185b(gVar.f97772a);
        gVar.setIsRecyclable(false);
        this.f97739d.mo71066b(gVar.f97772a);
        notifyItemRemoved(i);
        return true;
    }

    /* renamed from: b */
    public final boolean mo71055b(View view) {
        int i = 0;
        if (view == null) {
            return false;
        }
        Iterator<C41907g> it = this.f97736a.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C89219l.m154714a(it.next().itemView, view)) {
                break;
            } else {
                i++;
            }
        }
        return m83923c(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        this.f97740e = recyclerView;
        this.f97741f.onAttachedToRecyclerView(recyclerView);
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.mo4320a(new C41895b(this, gridLayoutManager, gridLayoutManager.f4321g));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        if (C41908h.m83951a(viewHolder.getItemViewType())) {
            View view = viewHolder.itemView;
            C89219l.m154716b(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.C1385b) {
                ((StaggeredGridLayoutManager.C1385b) layoutParams).f4602b = true;
                return;
            }
            return;
        }
        this.f97741f.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (m83921a(i)) {
            return this.f97736a.get(i).f97772a;
        }
        if (m83922b(i)) {
            return this.f97737b.get((i - this.f97736a.size()) - this.f97741f.getItemCount()).f97772a;
        }
        int itemViewType = this.f97741f.getItemViewType(i - this.f97736a.size());
        if (!C41908h.m83951a(itemViewType)) {
            return itemViewType;
        }
        throw new IllegalArgumentException("HeaderAndFooterWrapper use the viewType between 100000 and 110000");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (!m83921a(i) && !m83922b(i)) {
            this.f97741f.onBindViewHolder(viewHolder, i - this.f97736a.size());
        }
    }

    /* renamed from: a */
    public final void mo71053a(int i, View view) {
        if (i >= 0 && i <= this.f97736a.size() && view != null) {
            int a = this.f97739d.mo71065a();
            C41907g gVar = new C41907g(a, view);
            this.f97736a.add(gVar);
            this.f97742g.mo2186b(a, gVar);
            notifyItemInserted(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list, "");
        if (!m83921a(i) && !m83922b(i)) {
            this.f97741f.onBindViewHolder(viewHolder, i - this.f97736a.size(), list);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m83920a(C41893a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(3362);
        C89219l.m154721d(viewGroup, "");
        C41907g a2 = aVar.f97742g.mo2183a(i, null);
        if (a2 == null) {
            a2 = aVar.f97738c.mo2183a(i, null);
        }
        if (a2 == null) {
            a2 = aVar.f97741f.onCreateViewHolder(viewGroup, i);
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
        MethodCollector.m26664o(3362);
        return a2;
    }
}
