package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.C1432h;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.g */
public final class C1428g extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private final C1432h f4693a;

    static {
        Covode.recordClassIndex(1566);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m4886a(this, viewGroup, i);
    }

    /* renamed from: androidx.recyclerview.widget.g$a */
    public static final class C1429a {

        /* renamed from: c */
        public static final C1429a f4694c = new C1429a(true, EnumC1431b.NO_STABLE_IDS);

        /* renamed from: a */
        public final boolean f4695a;

        /* renamed from: b */
        public final EnumC1431b f4696b;

        /* renamed from: androidx.recyclerview.widget.g$a$a */
        public static final class C1430a {

            /* renamed from: a */
            public boolean f4697a = C1429a.f4694c.f4695a;

            /* renamed from: b */
            public EnumC1431b f4698b = C1429a.f4694c.f4696b;

            static {
                Covode.recordClassIndex(1568);
            }

            /* renamed from: a */
            public final C1429a mo4916a() {
                return new C1429a(this.f4697a, this.f4698b);
            }
        }

        static {
            Covode.recordClassIndex(1567);
        }

        /* renamed from: androidx.recyclerview.widget.g$a$b */
        public enum EnumC1431b {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS;

            static {
                Covode.recordClassIndex(1569);
            }
        }

        C1429a(boolean z, EnumC1431b bVar) {
            this.f4695a = z;
            this.f4696b = bVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        int i = 0;
        for (C1486v vVar : this.f4693a.f4703d) {
            i += vVar.f4928e;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4914a(RecyclerView.AbstractC1350a.EnumC1351a aVar) {
        super.setStateRestorationPolicy(aVar);
    }

    /* renamed from: a */
    public final boolean mo4915a(RecyclerView.AbstractC1350a<? extends RecyclerView.ViewHolder> aVar) {
        return this.f4693a.mo4924a((RecyclerView.AbstractC1350a<RecyclerView.ViewHolder>) aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void setStateRestorationPolicy(RecyclerView.AbstractC1350a.EnumC1351a aVar) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    public C1428g(RecyclerView.AbstractC1350a<? extends RecyclerView.ViewHolder>... aVarArr) {
        this(C1429a.f4694c, aVarArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.f4693a.mo4919a(viewHolder).f4926c.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        this.f4693a.mo4919a(viewHolder).f4926c.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        C1432h hVar = this.f4693a;
        C1432h.C1433a a = hVar.mo4918a(i);
        C1486v vVar = a.f4708a;
        long a2 = vVar.f4925b.mo4864a(vVar.f4926c.getItemId(a.f4709b));
        hVar.mo4921a(a);
        return a2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        C1432h hVar = this.f4693a;
        C1432h.C1433a a = hVar.mo4918a(i);
        C1486v vVar = a.f4708a;
        int a2 = vVar.f4924a.mo4885a(vVar.f4926c.getItemViewType(a.f4709b));
        hVar.mo4921a(a);
        return a2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C1432h hVar = this.f4693a;
        for (WeakReference<RecyclerView> weakReference : hVar.f4701b) {
            if (weakReference.get() == recyclerView) {
                return;
            }
        }
        hVar.f4701b.add(new WeakReference<>(recyclerView));
        for (C1486v vVar : hVar.f4703d) {
            vVar.f4926c.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        C1432h hVar = this.f4693a;
        C1486v vVar = hVar.f4702c.get(viewHolder);
        if (vVar != null) {
            boolean onFailedToRecycleView = vVar.f4926c.onFailedToRecycleView(viewHolder);
            hVar.f4702c.remove(viewHolder);
            return onFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C1432h hVar = this.f4693a;
        C1486v vVar = hVar.f4702c.get(viewHolder);
        if (vVar != null) {
            vVar.f4926c.onViewRecycled(viewHolder);
            hVar.f4702c.remove(viewHolder);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C1432h hVar = this.f4693a;
        int size = hVar.f4701b.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = hVar.f4701b.get(size);
            if (weakReference.get() == null) {
                hVar.f4701b.remove(size);
            } else if (weakReference.get() == recyclerView) {
                hVar.f4701b.remove(size);
                break;
            }
            size--;
        }
        for (C1486v vVar : hVar.f4703d) {
            vVar.f4926c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    private C1428g(C1429a aVar, RecyclerView.AbstractC1350a<? extends RecyclerView.ViewHolder>... aVarArr) {
        this(aVar, Arrays.asList(aVarArr));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1432h hVar = this.f4693a;
        C1432h.C1433a a = hVar.mo4918a(i);
        hVar.f4702c.put(viewHolder, a.f4708a);
        C1486v vVar = a.f4708a;
        vVar.f4926c.bindViewHolder(viewHolder, a.f4709b);
        hVar.mo4921a(a);
    }

    public C1428g(C1429a aVar, List<? extends RecyclerView.AbstractC1350a<? extends RecyclerView.ViewHolder>> list) {
        this.f4693a = new C1432h(this, aVar);
        for (RecyclerView.AbstractC1350a<? extends RecyclerView.ViewHolder> aVar2 : list) {
            mo4915a(aVar2);
        }
        super.setHasStableIds(this.f4693a.mo4928c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int findRelativeAdapterPositionIn(RecyclerView.AbstractC1350a<? extends RecyclerView.ViewHolder> aVar, RecyclerView.ViewHolder viewHolder, int i) {
        C1432h hVar = this.f4693a;
        C1486v vVar = hVar.f4702c.get(viewHolder);
        if (vVar == null) {
            return -1;
        }
        int a = i - hVar.mo4917a(vVar);
        int itemCount = vVar.f4926c.getItemCount();
        if (a >= 0 && a < itemCount) {
            return vVar.f4926c.findRelativeAdapterPositionIn(aVar, viewHolder, a);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + a + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + viewHolder + "adapter:" + aVar);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m4886a(C1428g gVar, ViewGroup viewGroup, int i) {
        boolean a;
        C1486v a2 = gVar.f4693a.f4700a.mo4884a(i);
        RecyclerView.ViewHolder onCreateViewHolder = a2.f4926c.onCreateViewHolder(viewGroup, a2.f4924a.mo4886b(i));
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
        return onCreateViewHolder;
    }
}
