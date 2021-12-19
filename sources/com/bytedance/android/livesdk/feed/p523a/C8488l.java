package com.bytedance.android.livesdk.feed.p523a;

import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.a.l */
final /* synthetic */ class C8488l implements AbstractC1214u {

    /* renamed from: a */
    private final C8476d f20995a;

    static {
        Covode.recordClassIndex(9341);
    }

    C8488l(C8476d dVar) {
        this.f20995a = dVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C8476d dVar = this.f20995a;
        Integer num = (Integer) obj;
        if (num != null && dVar.f20963b != null) {
            RecyclerView.AbstractC1362i layoutManager = dVar.f20963b.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).mo4347a(0, 0);
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).mo4347a(0, 0);
            }
            dVar.f20964c.mo14996g();
            dVar.f20963b.mo4413b(num.intValue());
        }
    }
}
