package com.p2082ss.android.ugc.aweme.social.widget.card;

import androidx.recyclerview.widget.C1434i;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.c */
public final class C74772c extends RecyclerView.AbstractC1353c {

    /* renamed from: a */
    public final WeakReference<RecyclerView> f168071a;

    /* renamed from: b */
    private final C74774b f168072b;

    static {
        Covode.recordClassIndex(87617);
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.c$b */
    public static final class C74774b extends C1434i {
        static {
            Covode.recordClassIndex(87619);
        }

        C74774b() {
        }

        @Override // androidx.recyclerview.widget.C1434i, androidx.recyclerview.widget.AbstractC1391ab
        /* renamed from: a */
        public final boolean mo4850a(RecyclerView.ViewHolder viewHolder) {
            this.f4469k = 250;
            return super.mo4850a(viewHolder);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.c$a */
    static final class RunnableC74773a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f168073a;

        /* renamed from: b */
        final /* synthetic */ int f168074b;

        static {
            Covode.recordClassIndex(87618);
        }

        RunnableC74773a(RecyclerView recyclerView, int i) {
            this.f168073a = recyclerView;
            this.f168074b = i;
        }

        public final void run() {
            RecyclerView recyclerView = this.f168073a;
            C89219l.m154716b(recyclerView, "");
            RecyclerView.AbstractC1356f itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.f4469k = 0;
            }
            this.f168073a.mo4413b(this.f168074b);
        }
    }

    public C74772c(WeakReference<RecyclerView> weakReference) {
        C89219l.m154721d(weakReference, "");
        this.f168071a = weakReference;
        C74774b bVar = new C74774b();
        this.f168072b = bVar;
        RecyclerView recyclerView = weakReference.get();
        if (recyclerView != null) {
            recyclerView.setItemAnimator(bVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
    /* renamed from: b */
    public final void mo4660b(int i, int i2) {
        super.mo4660b(i, i2);
        RecyclerView recyclerView = this.f168071a.get();
        if (recyclerView != null) {
            recyclerView.post(new RunnableC74773a(recyclerView, i));
        }
    }
}
