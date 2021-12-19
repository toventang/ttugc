package com.airbnb.epoxy;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.Queue;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.airbnb.epoxy.al */
public final class C1922al extends RecyclerView.RecycledViewPool {

    /* renamed from: a */
    private final SparseArray<Queue<RecyclerView.ViewHolder>> f5770a = new SparseArray<>();

    static {
        Covode.recordClassIndex(2113);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final void clear() {
        this.f5770a.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final RecyclerView.ViewHolder getRecycledView(int i) {
        Queue<RecyclerView.ViewHolder> queue = this.f5770a.get(i);
        if (queue != null) {
            return queue.poll();
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final void putRecycledView(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154719c(viewHolder, "");
        int itemViewType = viewHolder.getItemViewType();
        Queue<RecyclerView.ViewHolder> queue = this.f5770a.get(itemViewType);
        if (queue == null) {
            queue = new LinkedList<>();
            this.f5770a.put(itemViewType, queue);
        }
        queue.add(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final void setMaxRecycledViews(int i, int i2) {
        throw new UnsupportedOperationException("UnboundedViewPool does not support setting a maximum number of recycled views");
    }
}
