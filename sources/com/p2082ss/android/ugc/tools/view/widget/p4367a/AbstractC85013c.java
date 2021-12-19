package com.p2082ss.android.ugc.tools.view.widget.p4367a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.widget.a.c */
public abstract class AbstractC85013c<DATA> extends AbstractC85017e {

    /* renamed from: a */
    private final List<C89378p<Integer, DATA>> f190188a = new ArrayList();

    /* renamed from: b */
    public final Map<Integer, DATA> f190189b = new LinkedHashMap();

    /* renamed from: c */
    public final RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> f190190c;

    static {
        Covode.recordClassIndex(99034);
    }

    /* renamed from: a */
    public abstract RecyclerView.ViewHolder mo86248a(ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo86249a(RecyclerView.ViewHolder viewHolder, DATA data);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m146139a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return mo129941b(this.f190190c.getItemCount() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        if (this.f190189b.keySet().contains(Integer.valueOf(i))) {
            return -2147483647;
        }
        return this.f190190c.getItemViewType(mo129938a(i));
    }

    public AbstractC85013c(RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar) {
        C89219l.m154721d(aVar, "");
        this.f190190c = aVar;
        aVar.registerAdapterDataObserver(new RecyclerView.AbstractC1353c(this) {
            /* class com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85013c.C850141 */

            /* renamed from: a */
            final /* synthetic */ AbstractC85013c f190191a;

            static {
                Covode.recordClassIndex(99035);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4655a() {
                this.f190191a.notifyDataSetChanged();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f190191a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: b */
            public final void mo4660b(int i, int i2) {
                this.f190191a.notifyDataSetChanged();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: c */
            public final void mo4661c(int i, int i2) {
                this.f190191a.notifyDataSetChanged();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4656a(int i, int i2) {
                int b = this.f190191a.mo129941b(i);
                this.f190191a.notifyItemRangeChanged(b, this.f190191a.mo129941b(i + i2) - b);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4657a(int i, int i2, int i3) {
                this.f190191a.notifyDataSetChanged();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4658a(int i, int i2, Object obj) {
                int b = this.f190191a.mo129941b(i);
                this.f190191a.notifyItemRangeChanged(b, this.f190191a.mo129941b(i + i2) - b, obj);
            }
        });
    }

    /* renamed from: a */
    public final int mo129938a(int i) {
        Map<Integer, DATA> map = this.f190189b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, DATA> entry : map.entrySet()) {
            if (entry.getKey().intValue() < i) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return i - linkedHashMap.size();
    }

    /* renamed from: b */
    public final int mo129941b(int i) {
        List<C89378p<Integer, DATA>> list = this.f190188a;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (((Number) t.getFirst()).intValue() < i) {
                arrayList.add(t);
            }
        }
        return i + arrayList.size();
    }

    /* renamed from: a */
    public final void mo129940a(List<? extends C89378p<Integer, ? extends DATA>> list) {
        C89219l.m154721d(list, "");
        this.f190188a.clear();
        List<C89378p<Integer, DATA>> list2 = this.f190188a;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (((Number) t.getFirst()).intValue() >= 0) {
                arrayList.add(t);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(Integer.valueOf(((Number) ((C89378p) obj).getFirst()).intValue()))) {
                arrayList2.add(obj);
            }
        }
        list2.addAll(arrayList2);
        List<C89378p<Integer, DATA>> list3 = this.f190188a;
        if (list3.size() > 1) {
            C89070n.m154530a((List) list3, (Comparator) new C85015a());
        }
        this.f190189b.clear();
        for (C89378p<Integer, DATA> pVar : this.f190188a) {
            this.f190189b.put(Integer.valueOf(pVar.getFirst().intValue() + this.f190189b.size() + 1), pVar.getSecond());
        }
        notifyDataSetChanged();
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.a.c$a */
    public static final class C85015a<T> implements Comparator<T> {
        static {
            Covode.recordClassIndex(99036);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a((Integer) t.getFirst(), (Integer) t2.getFirst());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (getItemViewType(i) == -2147483647) {
            DATA data = this.f190189b.get(Integer.valueOf(i));
            if (data == null) {
                C89219l.m154715b();
            }
            mo86249a(viewHolder, data);
            return;
        }
        this.f190190c.onBindViewHolder(viewHolder, mo129938a(i));
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85017e
    /* renamed from: a */
    public final int mo129939a(int i, GridLayoutManager gridLayoutManager) {
        C89219l.m154721d(gridLayoutManager, "");
        if (getItemViewType(i) == -2147483647) {
            return gridLayoutManager.f4316b;
        }
        RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar = this.f190190c;
        if (aVar instanceof AbstractC85017e) {
            return ((AbstractC85017e) aVar).mo129939a(mo129938a(i), gridLayoutManager);
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list, "");
        if (getItemViewType(i) == -2147483647) {
            onBindViewHolder(viewHolder, i);
        } else {
            this.f190190c.onBindViewHolder(viewHolder, mo129938a(i), list);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m146139a(AbstractC85013c cVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        C89219l.m154721d(viewGroup, "");
        if (-2147483647 == i) {
            viewHolder = cVar.mo86248a(viewGroup);
        } else {
            viewHolder = cVar.f190190c.onCreateViewHolder(viewGroup, i);
            C89219l.m154716b(viewHolder, "");
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        return viewHolder;
    }
}
