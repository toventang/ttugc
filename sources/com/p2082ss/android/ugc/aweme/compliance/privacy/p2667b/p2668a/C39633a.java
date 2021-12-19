package com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.C39636b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.a */
public final class C39633a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private final C39636b f93414a;

    static {
        Covode.recordClassIndex(47352);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m80492a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.a$a */
    public static final class C39634a {

        /* renamed from: c */
        public static final C39634a f93415c = new C39634a(EnumC39635a.NO_STABLE_IDS);

        /* renamed from: a */
        public final boolean f93416a = true;

        /* renamed from: b */
        public final EnumC39635a f93417b;

        static {
            Covode.recordClassIndex(47353);
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.b.a.a$a$a */
        public enum EnumC39635a {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS;

            static {
                Covode.recordClassIndex(47354);
            }
        }

        private C39634a(EnumC39635a aVar) {
            this.f93417b = aVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        int i = 0;
        for (C39638c cVar : this.f93414a.f93423e) {
            i += cVar.f93434e;
        }
        return i;
    }

    public C39633a(List<? extends RecyclerView.AbstractC1350a<? extends RecyclerView.ViewHolder>> list) {
        this(C39634a.f93415c, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.f93414a.mo69047a(viewHolder).f93432c.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        this.f93414a.mo69047a(viewHolder).f93432c.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        C39636b bVar = this.f93414a;
        C39636b.C39637a a = bVar.mo69046a(i);
        C39638c cVar = a.f93427a;
        long a2 = cVar.f93431b.mo69056a(cVar.f93432c.getItemId(a.f93428b));
        bVar.mo69049a(a);
        return a2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        C39636b bVar = this.f93414a;
        C39636b.C39637a a = bVar.mo69046a(i);
        C39638c cVar = a.f93427a;
        int a2 = cVar.f93430a.mo69059a(cVar.f93432c.getItemViewType(a.f93428b));
        bVar.mo69049a(a);
        return a2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C39636b bVar = this.f93414a;
        for (WeakReference<RecyclerView> weakReference : bVar.f93421c) {
            if (weakReference.get() == recyclerView) {
                return;
            }
        }
        bVar.f93421c.add(new WeakReference<>(recyclerView));
        for (C39638c cVar : bVar.f93423e) {
            cVar.f93432c.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        C39636b bVar = this.f93414a;
        C39638c remove = bVar.f93422d.remove(viewHolder);
        if (remove != null) {
            return remove.f93432c.onFailedToRecycleView(viewHolder);
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C39636b bVar = this.f93414a;
        C39638c remove = bVar.f93422d.remove(viewHolder);
        if (remove != null) {
            remove.f93432c.onViewRecycled(viewHolder);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C39636b bVar = this.f93414a;
        int size = bVar.f93421c.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = bVar.f93421c.get(size);
            if (weakReference.get() == null) {
                bVar.f93421c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                bVar.f93421c.remove(size);
                break;
            }
            size--;
        }
        for (C39638c cVar : bVar.f93423e) {
            cVar.f93432c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C39636b bVar = this.f93414a;
        C39636b.C39637a a = bVar.mo69046a(i);
        bVar.f93422d.put(viewHolder, a.f93427a);
        C39638c cVar = a.f93427a;
        cVar.f93432c.onBindViewHolder(viewHolder, a.f93428b);
        bVar.mo69049a(a);
    }

    private C39633a(C39634a aVar, List<? extends RecyclerView.AbstractC1350a<? extends RecyclerView.ViewHolder>> list) {
        this.f93414a = new C39636b(this, aVar);
        Iterator<? extends RecyclerView.AbstractC1350a<? extends RecyclerView.ViewHolder>> it = list.iterator();
        while (it.hasNext()) {
            RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar2 = (RecyclerView.AbstractC1350a) it.next();
            C39636b bVar = this.f93414a;
            int size = bVar.f93423e.size();
            if (size < 0 || size > bVar.f93423e.size()) {
                throw new IndexOutOfBoundsException("Index must be between 0 and " + bVar.f93423e.size() + ". Given:" + size);
            } else if (!bVar.mo69053b() || aVar2.mHasStableIds) {
                int a = bVar.mo69044a(aVar2);
                if (a == -1 || bVar.f93423e.get(a) == null) {
                    C39638c cVar = new C39638c(aVar2, bVar, bVar.f93420b, bVar.f93424f.mo69055a());
                    bVar.f93423e.add(size, cVar);
                    for (WeakReference<RecyclerView> weakReference : bVar.f93421c) {
                        RecyclerView recyclerView = weakReference.get();
                        if (recyclerView != null) {
                            aVar2.onAttachedToRecyclerView(recyclerView);
                        }
                    }
                    if (cVar.f93434e > 0) {
                        bVar.f93419a.notifyItemRangeInserted(bVar.mo69045a(cVar), cVar.f93434e);
                    }
                }
            } else {
                throw new IllegalArgumentException("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
            }
        }
        super.setHasStableIds(this.f93414a.mo69053b());
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m80492a(C39633a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(11594);
        C39638c a2 = aVar.f93414a.f93420b.mo69057a(i);
        RecyclerView.ViewHolder onCreateViewHolder = a2.f93432c.onCreateViewHolder(viewGroup, a2.f93430a.mo69060b(i));
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
        MethodCollector.m26664o(11594);
        return onCreateViewHolder;
    }
}
