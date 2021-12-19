package com.bytedance.jedi.ext.adapter.internal;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.View$OnAttachStateChangeListenerC20591r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.a */
public final class C20657a {

    /* renamed from: a */
    public boolean f48851a = true;

    /* renamed from: b */
    public final View$OnAttachStateChangeListenerC20591r f48852b = new View$OnAttachStateChangeListenerC20591r((byte) 0);

    /* renamed from: c */
    public C20669h f48853c;

    /* renamed from: d */
    private int f48854d = -241;

    static {
        Covode.recordClassIndex(24193);
    }

    /* renamed from: a */
    public final void mo33910a() {
        RecyclerView recyclerView;
        if (this.f48851a && (recyclerView = this.f48852b.f48743a) != null) {
            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                this.f48854d = ((LinearLayoutManager) layoutManager).mo4371k();
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                this.f48854d = staggeredGridLayoutManager.mo4790a(new int[staggeredGridLayoutManager.f4556a])[0];
            }
        }
    }

    /* renamed from: b */
    public final void mo33913b(RecyclerView recyclerView) {
        C89219l.m154719c(recyclerView, "");
        this.f48852b.mo33873b(recyclerView);
        this.f48853c = null;
    }

    /* renamed from: a */
    public final void mo33912a(RecyclerView recyclerView) {
        C89219l.m154719c(recyclerView, "");
        this.f48852b.mo33872a(recyclerView);
        this.f48853c = new C20669h();
    }

    /* renamed from: a */
    public final void mo33911a(int i) {
        RecyclerView recyclerView;
        int i2;
        if (this.f48851a && (recyclerView = this.f48852b.f48743a) != null && (i2 = this.f48854d) != -241 && i2 >= i) {
            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                layoutManager.mo4363e(this.f48854d);
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                layoutManager.mo4363e(this.f48854d);
            }
        }
    }
}
