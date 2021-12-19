package com.p2082ss.android.ugc.aweme.tools.draft;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.au */
public final class C78174au extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private final int f175572a;

    static {
        Covode.recordClassIndex(91289);
    }

    public C78174au(int i) {
        this.f175572a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager.C1336b bVar = null;
        if (!(layoutManager instanceof GridLayoutManager)) {
            layoutManager = null;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (gridLayoutManager != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof GridLayoutManager.C1336b) {
                bVar = layoutParams;
            }
            GridLayoutManager.C1336b bVar2 = bVar;
            if (bVar2 != null) {
                int i = gridLayoutManager.f4316b;
                if (1 == bVar2.f4325b) {
                    int i2 = bVar2.f4324a;
                    rect.left = (this.f175572a * i2) / i;
                    int i3 = this.f175572a;
                    rect.right = i3 - (((i2 + 1) * i3) / i);
                    rect.top = this.f175572a;
                }
            }
        }
    }
}
