package com.bytedance.jedi.ext.adapter;

import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.ext.list.p1464a.C20431b;
import com.bytedance.jedi.arch.ext.list.p1464a.C20435c;
import com.bytedance.jedi.arch.ext.list.p1464a.C20438e;
import com.bytedance.jedi.ext.adapter.internal.C20657a;
import com.bytedance.jedi.ext.adapter.internal.C20669h;
import com.bytedance.jedi.ext.adapter.p1467b.C20633f;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.f */
public abstract class AbstractC20651f<T> extends AbstractC20553a<T, JediViewHolder<? extends AbstractC20467g, T>, C20654i<JediViewHolder<? extends AbstractC20467g, T>>> {

    /* renamed from: b */
    public final C20654i<JediViewHolder<? extends AbstractC20467g, T>> f48831b;

    /* renamed from: c */
    public final AbstractC1204m f48832c;

    /* renamed from: d */
    private final C20431b<T> f48833d;

    static {
        Covode.recordClassIndex(24185);
    }

    @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a, com.bytedance.jedi.ext.adapter.AbstractC20553a
    /* renamed from: a */
    public final C20431b<T> mo33761a() {
        return this.f48833d;
    }

    @Override // com.bytedance.jedi.ext.adapter.p1467b.AbstractC20628c
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C20633f mo33883b() {
        return this.f48831b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        RecyclerView recyclerView;
        int i;
        JediViewHolder jediViewHolder = (JediViewHolder) viewHolder;
        C89219l.m154719c(jediViewHolder, "");
        C20654i<JediViewHolder<? extends AbstractC20467g, T>> iVar = this.f48831b;
        C89219l.m154719c(jediViewHolder, "");
        C20657a aVar = iVar.f48798b;
        C89219l.m154719c(jediViewHolder, "");
        C20669h hVar = aVar.f48853c;
        if (hVar != null && (recyclerView = aVar.f48852b.f48743a) != null) {
            int itemViewType = jediViewHolder.getItemViewType();
            C89219l.m154719c(recyclerView, "");
            RecyclerView.RecycledViewPool.ScrapData scrapData = recyclerView.getRecycledViewPool().mScrap.get(itemViewType);
            if (scrapData != null) {
                i = scrapData.mMaxScrap;
            } else {
                i = -1;
            }
            int recycledViewCount = recyclerView.getRecycledViewPool().getRecycledViewCount(itemViewType);
            if (i != -1 && i <= recycledViewCount) {
                C89219l.m154719c(jediViewHolder, "");
                int itemViewType2 = jediViewHolder.getItemViewType();
                List<RecyclerView.ViewHolder> list = hVar.mo33922a().get(itemViewType2);
                if (list == null) {
                    list = new ArrayList<>();
                    hVar.mo33922a().put(itemViewType2, list);
                }
                list.add(jediViewHolder);
                C89219l.m154719c(jediViewHolder, "");
                jediViewHolder.resetInternal();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC20651f(AbstractC1204m mVar, C20438e eVar, C20435c<T> cVar) {
        super(eVar, cVar);
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(cVar, "");
        this.f48832c = mVar;
        C20654i<JediViewHolder<? extends AbstractC20467g, T>> iVar = new C20654i<>(mVar);
        mo33884a(iVar);
        this.f48831b = iVar;
        this.f48833d = new C20431b<>(new C20641d(this), cVar, eVar);
    }
}
