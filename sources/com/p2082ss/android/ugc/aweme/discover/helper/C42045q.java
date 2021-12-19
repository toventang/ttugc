package com.p2082ss.android.ugc.aweme.discover.helper;

import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.q */
public final class C42045q extends RecyclerView.AbstractC1371n {

    /* renamed from: a */
    private int f98022a;

    /* renamed from: b */
    private final int f98023b;

    static {
        Covode.recordClassIndex(49975);
    }

    public C42045q() {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(C17867d.m33078a());
        C89219l.m154716b(viewConfiguration, "");
        this.f98023b = viewConfiguration.getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4753a(RecyclerView recyclerView, int i) {
        C89219l.m154721d(recyclerView, "");
        super.mo4753a(recyclerView, i);
        if (i == 0) {
            m84144a(recyclerView, true);
            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            this.f98022a = ((LinearLayoutManager) layoutManager).mo4371k();
        }
    }

    /* renamed from: a */
    public static void m84144a(RecyclerView recyclerView, boolean z) {
        TrendingTopicViewHolder trendingTopicViewHolder;
        int adapterPosition;
        C89219l.m154721d(recyclerView, "");
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int k = linearLayoutManager.mo4371k();
        int m = linearLayoutManager.mo4373m();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.ViewHolder a = recyclerView.mo4393a(recyclerView.getChildAt(i));
            if (a instanceof TrendingTopicViewHolder) {
                if (!z || k > (adapterPosition = (trendingTopicViewHolder = (TrendingTopicViewHolder) a).getAdapterPosition()) || m < adapterPosition) {
                    ((TrendingTopicViewHolder) a).mo70808o();
                } else {
                    trendingTopicViewHolder.mo70807n();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
        C89219l.m154721d(recyclerView, "");
        if (Math.abs(i2) <= this.f98023b) {
            m84144a(recyclerView, true);
        }
    }
}
