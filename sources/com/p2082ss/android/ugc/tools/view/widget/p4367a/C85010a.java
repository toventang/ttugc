package com.p2082ss.android.ugc.tools.view.widget.p4367a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.tools.view.widget.a.a */
public final class C85010a {
    static {
        Covode.recordClassIndex(99031);
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.a.a$a */
    public static final class C85011a extends RecyclerView.AbstractC1353c {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC1350a f190186a;

        static {
            Covode.recordClassIndex(99032);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4655a() {
            this.f190186a.notifyDataSetChanged();
        }

        C85011a(RecyclerView.AbstractC1350a aVar) {
            this.f190186a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: b */
        public final void mo4660b(int i, int i2) {
            this.f190186a.notifyItemRangeInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: c */
        public final void mo4661c(int i, int i2) {
            this.f190186a.notifyItemRangeRemoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4656a(int i, int i2) {
            this.f190186a.notifyItemRangeChanged(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4657a(int i, int i2, int i3) {
            this.f190186a.notifyItemMoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4658a(int i, int i2, Object obj) {
            this.f190186a.notifyItemRangeChanged(i, i2, obj);
        }
    }
}
