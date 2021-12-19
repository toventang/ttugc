package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.s */
public final class C42908s extends RecyclerView.RecycledViewPool {
    static {
        Covode.recordClassIndex(51013);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final RecyclerView.ViewHolder getRecycledView(int i) {
        View view;
        MethodCollector.m26663i(5550);
        RecyclerView.ViewHolder recycledView = super.getRecycledView(i);
        if (!(recycledView == null || (view = recycledView.itemView) == null)) {
            C89219l.m154716b(view, "");
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        MethodCollector.m26664o(5550);
        return recycledView;
    }
}
