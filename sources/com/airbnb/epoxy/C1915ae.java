package com.airbnb.epoxy;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.epoxy.ae */
public final class C1915ae extends RecyclerView.AbstractC1353c {

    /* renamed from: a */
    boolean f5769a;

    static {
        Covode.recordClassIndex(2106);
    }

    C1915ae() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
    /* renamed from: a */
    public final void mo4655a() {
        if (!this.f5769a) {
            throw new IllegalStateException("You cannot notify item changes directly. Call `requestModelBuild` instead.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
    /* renamed from: a */
    public final void mo4656a(int i, int i2) {
        mo4655a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
    /* renamed from: b */
    public final void mo4660b(int i, int i2) {
        mo4655a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
    /* renamed from: c */
    public final void mo4661c(int i, int i2) {
        mo4655a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
    /* renamed from: a */
    public final void mo4657a(int i, int i2, int i3) {
        mo4655a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
    /* renamed from: a */
    public final void mo4658a(int i, int i2, Object obj) {
        mo4655a();
    }
}
