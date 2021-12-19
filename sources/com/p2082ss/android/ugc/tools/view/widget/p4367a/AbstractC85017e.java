package com.p2082ss.android.ugc.tools.view.widget.p4367a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.widget.a.e */
public abstract class AbstractC85017e extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {
    static {
        Covode.recordClassIndex(99038);
    }

    /* renamed from: a */
    public int mo129939a(int i, GridLayoutManager gridLayoutManager) {
        C89219l.m154721d(gridLayoutManager, "");
        return 1;
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.a.e$a */
    public static final class C85018a extends GridLayoutManager.AbstractC1337c {

        /* renamed from: e */
        final /* synthetic */ AbstractC85017e f190195e;

        /* renamed from: f */
        final /* synthetic */ RecyclerView.AbstractC1362i f190196f;

        static {
            Covode.recordClassIndex(99039);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            return this.f190195e.mo129939a(i, (GridLayoutManager) this.f190196f);
        }

        C85018a(AbstractC85017e eVar, RecyclerView.AbstractC1362i iVar) {
            this.f190195e = eVar;
            this.f190196f = iVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).mo4320a(new C85018a(this, layoutManager));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        boolean z;
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        View view = viewHolder.itemView;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.C1385b)) {
            StaggeredGridLayoutManager.C1385b bVar = (StaggeredGridLayoutManager.C1385b) layoutParams;
            if (getItemViewType(viewHolder.getLayoutPosition()) == -2147483646) {
                z = true;
            } else {
                z = false;
            }
            bVar.f4602b = z;
        }
    }
}
