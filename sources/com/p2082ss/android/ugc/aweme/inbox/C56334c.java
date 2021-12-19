package com.p2082ss.android.ugc.aweme.inbox;

import android.view.ViewGroup;
import androidx.recyclerview.widget.C1428g;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.c */
public final class C56334c extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final C1428g f128504a;

    /* renamed from: b */
    private final C56335a f128505b;

    /* renamed from: com.ss.android.ugc.aweme.inbox.c$a */
    public static final class C56335a extends RecyclerView.AbstractC1353c {

        /* renamed from: d */
        public static final C56296a f128506d = new C56296a();

        /* renamed from: e */
        public static final C56337a f128507e = new C56337a((byte) 0);

        /* renamed from: a */
        public C56296a f128508a = f128506d;

        /* renamed from: b */
        final C88411a f128509b;

        /* renamed from: c */
        public final C56334c f128510c;

        /* renamed from: f */
        private C88960c<C56296a> f128511f;

        /* renamed from: com.ss.android.ugc.aweme.inbox.c$a$a */
        public static final class C56337a {
            static {
                Covode.recordClassIndex(66157);
            }

            private C56337a() {
            }

            public /* synthetic */ C56337a(byte b) {
                this();
            }
        }

        static {
            Covode.recordClassIndex(66155);
        }

        public C56335a(C56334c cVar) {
            C89219l.m154721d(cVar, "");
            this.f128510c = cVar;
            C88960c<C56296a> cVar2 = new C88960c<>();
            C89219l.m154716b(cVar2, "");
            this.f128511f = cVar2;
            C88411a aVar = new C88411a();
            this.f128509b = aVar;
            AbstractC88412b d = this.f128511f.mo143291d(500, TimeUnit.MILLISECONDS).mo143278b(C88391a.m153580a(C88392a.f200660a)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.inbox.C56334c.C56335a.C563361 */

                /* renamed from: a */
                final /* synthetic */ C56335a f128512a;

                static {
                    Covode.recordClassIndex(66156);
                }

                {
                    this.f128512a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    C56296a aVar = (C56296a) obj;
                    if (!C89219l.m154714a(aVar, C56335a.f128506d)) {
                        if (aVar.f128431a == EnumC56315b.CHANGE) {
                            this.f128512a.f128510c.notifyItemRangeChanged(aVar.f128432b, aVar.f128433c);
                        } else {
                            this.f128512a.f128510c.notifyItemRangeInserted(aVar.f128432b, aVar.f128433c);
                        }
                        this.f128512a.f128508a = C56335a.f128506d;
                    }
                }
            });
            C89219l.m154716b(d, "");
            C88934a.m154195a(d, aVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: c */
        public final void mo4661c(int i, int i2) {
            this.f128510c.notifyItemRangeRemoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4656a(int i, int i2) {
            C56296a aVar = this.f128508a;
            int min = Math.min(i, aVar.f128432b);
            C56296a a = C56296a.m102296a(EnumC56315b.CHANGE, min, Math.max(aVar.f128432b + aVar.f128433c, i + i2) - min);
            this.f128508a = a;
            this.f128511f.onNext(a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: b */
        public final void mo4660b(int i, int i2) {
            EnumC56315b bVar;
            C56296a aVar = this.f128508a;
            int min = Math.min(i, aVar.f128432b);
            int max = Math.max(aVar.f128432b + aVar.f128433c, i + i2);
            if (aVar.f128431a == EnumC56315b.CHANGE) {
                bVar = EnumC56315b.CHANGE;
            } else {
                bVar = EnumC56315b.INSERT;
            }
            C56296a a = C56296a.m102296a(bVar, min, max - min);
            this.f128508a = a;
            this.f128511f.onNext(a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4657a(int i, int i2, int i3) {
            super.mo4657a(i, i2, i3);
            this.f128510c.notifyItemMoved(i, i2);
        }
    }

    static {
        Covode.recordClassIndex(66154);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m102323a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f128504a.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        return this.f128504a.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return this.f128504a.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void setHasStableIds(boolean z) {
        this.f128504a.setHasStableIds(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        this.f128504a.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        return this.f128504a.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        this.f128504a.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        this.f128504a.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        this.f128504a.onViewRecycled(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void registerAdapterDataObserver(RecyclerView.AbstractC1353c cVar) {
        C89219l.m154721d(cVar, "");
        this.f128504a.registerAdapterDataObserver(cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void unregisterAdapterDataObserver(RecyclerView.AbstractC1353c cVar) {
        C89219l.m154721d(cVar, "");
        this.f128504a.unregisterAdapterDataObserver(cVar);
    }

    public C56334c(C1428g gVar) {
        C89219l.m154721d(gVar, "");
        this.f128504a = gVar;
        C56335a aVar = new C56335a(this);
        this.f128505b = aVar;
        gVar.registerAdapterDataObserver(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        this.f128504a.onDetachedFromRecyclerView(recyclerView);
        this.f128505b.f128509b.dispose();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        this.f128504a.onBindViewHolder(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list, "");
        this.f128504a.onBindViewHolder(viewHolder, i, list);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m102323a(C56334c cVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(75);
        C89219l.m154721d(viewGroup, "");
        RecyclerView.ViewHolder onCreateViewHolder = cVar.f128504a.onCreateViewHolder(viewGroup, i);
        C89219l.m154716b(onCreateViewHolder, "");
        try {
            if (onCreateViewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(onCreateViewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) onCreateViewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(onCreateViewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = onCreateViewHolder.getClass().getName();
        MethodCollector.m26664o(75);
        return onCreateViewHolder;
    }
}
