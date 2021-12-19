package com.bytedance.ies.powerlist.page;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.page.m */
public final class C17723m extends RecyclerView.AbstractC1371n {

    /* renamed from: a */
    private final PowerList f42382a;

    /* renamed from: b */
    private final AbstractC89172b<Integer, C89391z> f42383b;

    static {
        Covode.recordClassIndex(20283);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17723m(PowerList powerList, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154719c(powerList, "");
        C89219l.m154719c(bVar, "");
        this.f42382a = powerList;
        this.f42383b = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
        Integer valueOf;
        C89219l.m154719c(recyclerView, "");
        super.mo4754a(recyclerView, i, i2);
        RecyclerView.AbstractC1362i layoutManager = this.f42382a.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            valueOf = Integer.valueOf(((LinearLayoutManager) layoutManager).mo4373m());
        } else if (layoutManager instanceof LinearLayoutManager) {
            valueOf = Integer.valueOf(((LinearLayoutManager) layoutManager).mo4373m());
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int i3 = staggeredGridLayoutManager.f4556a;
            int[] iArr = new int[i3];
            staggeredGridLayoutManager.mo4791b(iArr);
            int i4 = iArr[0];
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = iArr[i5];
                if (i6 > i4) {
                    i4 = i6;
                }
            }
            valueOf = Integer.valueOf(i4);
        } else {
            return;
        }
        if (valueOf != null && valueOf.intValue() >= 0) {
            int intValue = valueOf.intValue();
            if (layoutManager == null) {
                C89219l.m154707a();
            }
            if ((layoutManager.mo4368g() && !this.f42382a.canScrollVertically(1)) || (layoutManager.mo4366f() && !this.f42382a.canScrollHorizontally(1))) {
                this.f42383b.invoke(Integer.valueOf(intValue));
            }
        }
    }
}
