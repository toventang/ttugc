package com.bytedance.android.livesdk.feed.drawerfeed;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.feed.p533i.AbstractC8597a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.s */
public final /* synthetic */ class RunnableC8563s implements Runnable {

    /* renamed from: a */
    private final C8555l f21162a;

    /* renamed from: b */
    private final RecyclerView.ViewHolder f21163b;

    static {
        Covode.recordClassIndex(9418);
    }

    RunnableC8563s(C8555l lVar, RecyclerView.ViewHolder viewHolder) {
        this.f21162a = lVar;
        this.f21163b = viewHolder;
    }

    public final void run() {
        C8555l lVar = this.f21162a;
        RecyclerView.ViewHolder viewHolder = this.f21163b;
        if (lVar.getUserVisibleHint() && lVar.isResumed()) {
            ((AbstractC8597a) viewHolder).mo14909d();
        }
    }
}
