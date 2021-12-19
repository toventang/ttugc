package com.bytedance.android.livesdk.feed.p537m;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.m.a */
public final class C8644a extends RecyclerView.AbstractC1361h {
    static {
        Covode.recordClassIndex(9501);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int i;
        if (view.getVisibility() == 0) {
            i = C3966y.m9653a(3.0f);
        } else {
            i = 0;
        }
        RecyclerView.C1367j jVar = (RecyclerView.C1367j) view.getLayoutParams();
        if ((jVar instanceof StaggeredGridLayoutManager.C1385b) && ((StaggeredGridLayoutManager.C1385b) jVar).f4602b) {
            i = C3966y.m9653a(3.0f);
        }
        int a = C3966y.m9653a(1.5f);
        rect.set(a, i, a, 0);
    }
}
