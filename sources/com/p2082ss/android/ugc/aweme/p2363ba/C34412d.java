package com.p2082ss.android.ugc.aweme.p2363ba;

import androidx.core.p036g.C0692e;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ba.d */
public final class C34412d {
    static {
        Covode.recordClassIndex(41356);
    }

    /* renamed from: a */
    public static C0692e<Integer, Integer> m70402a(RecyclerView recyclerView) {
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            return new C0692e<>(Integer.valueOf(linearLayoutManager.mo4371k()), Integer.valueOf(linearLayoutManager.mo4373m()));
        } else if (layoutManager instanceof GridLayoutManager) {
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) layoutManager;
            return new C0692e<>(Integer.valueOf(linearLayoutManager2.mo4371k()), Integer.valueOf(linearLayoutManager2.mo4373m()));
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int i = staggeredGridLayoutManager.f4556a;
            int[] iArr = new int[i];
            staggeredGridLayoutManager.mo4791b(iArr);
            int i2 = iArr[0];
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = iArr[i3];
                if (i4 > i2) {
                    i2 = i4;
                }
            }
            staggeredGridLayoutManager.mo4790a(iArr);
            int i5 = iArr[0];
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = iArr[i6];
                if (i7 < i5) {
                    i5 = i7;
                }
            }
            return new C0692e<>(Integer.valueOf(i5), Integer.valueOf(i2));
        } else {
            throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager, StaggeredGridLayoutManager");
        }
    }
}
