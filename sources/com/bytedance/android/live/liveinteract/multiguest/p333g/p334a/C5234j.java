package com.bytedance.android.live.liveinteract.multiguest.p333g.p334a;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.a.j */
public final class C5234j extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private static int f13520a = -1;

    /* renamed from: b */
    private static int f13521b = -1;

    static {
        Covode.recordClassIndex(5826);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        Context context = recyclerView.getContext();
        if (f13520a <= 0) {
            f13520a = (int) C13628n.m24520b(context, 4.0f);
            f13521b = (int) C13628n.m24520b(context, 4.0f);
        }
        int e = RecyclerView.m4278e(view);
        if (e == 0) {
            rect.set(f13520a, 0, f13521b, 0);
        } else if (recyclerView.getAdapter().getItemCount() - 1 == e) {
            rect.set(f13521b, 0, f13520a, 0);
        } else {
            int i = f13521b;
            rect.set(i, 0, i, 0);
        }
    }
}
