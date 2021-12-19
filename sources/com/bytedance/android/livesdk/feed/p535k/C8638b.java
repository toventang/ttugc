package com.bytedance.android.livesdk.feed.p535k;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.k.b */
public final class C8638b extends RecyclerView.AbstractC1371n {

    /* renamed from: a */
    private String f21359a;

    static {
        Covode.recordClassIndex(9495);
    }

    public C8638b(String str) {
        this.f21359a = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4753a(RecyclerView recyclerView, int i) {
        if (i != 0) {
            LivePerformanceManager.getInstance().monitorPerformance(this.f21359a);
        }
    }
}
