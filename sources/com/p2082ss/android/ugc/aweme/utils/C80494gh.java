package com.p2082ss.android.ugc.aweme.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.core.p036g.C0692e;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.utils.gh */
public final class C80494gh {
    static {
        Covode.recordClassIndex(93767);
    }

    /* renamed from: a */
    private static int m139515a(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: b */
    private static int m139519b(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 < i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static Rect m139516a(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == null || viewHolder.itemView == null) {
            return null;
        }
        View view = viewHolder.itemView;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    /* renamed from: a */
    public static C0692e<Integer, Integer> m139517a(RecyclerView recyclerView) {
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            return new C0692e<>(Integer.valueOf(linearLayoutManager.mo4371k()), Integer.valueOf(linearLayoutManager.mo4373m()));
        } else if (layoutManager instanceof GridLayoutManager) {
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) layoutManager;
            return new C0692e<>(Integer.valueOf(linearLayoutManager2.mo4371k()), Integer.valueOf(linearLayoutManager2.mo4373m()));
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.f4556a];
            staggeredGridLayoutManager.mo4791b(iArr);
            int a = m139515a(iArr);
            staggeredGridLayoutManager.mo4790a(iArr);
            return new C0692e<>(Integer.valueOf(m139519b(iArr)), Integer.valueOf(a));
        } else {
            throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager, StaggeredGridLayoutManager");
        }
    }

    /* renamed from: a */
    public static void m139518a(RecyclerView recyclerView, int i) {
        if (recyclerView != null) {
            recyclerView.setPadding(0, (int) C13628n.m24520b(recyclerView.getContext(), (float) i), 0, 0);
            recyclerView.setClipToPadding(false);
        }
    }
}
