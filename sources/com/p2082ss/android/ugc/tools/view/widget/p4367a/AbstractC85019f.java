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
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.widget.a.f */
public abstract class AbstractC85019f extends AbstractC85017e {

    /* renamed from: a */
    private boolean f190197a;

    /* renamed from: b */
    public final RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> f190198b;

    /* renamed from: c */
    private final boolean f190199c;

    static {
        Covode.recordClassIndex(99040);
    }

    /* renamed from: a */
    public abstract RecyclerView.ViewHolder mo129673a(ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo129674a(RecyclerView.ViewHolder viewHolder);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m146158a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return this.f190198b.getItemCount() + mo129945a();
    }

    /* renamed from: a */
    public final int mo129945a() {
        int itemCount = this.f190198b.getItemCount();
        if ((!this.f190199c || itemCount != 0) && this.f190197a) {
            return 1;
        }
        return 0;
    }

    private AbstractC85019f(RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar) {
        C89219l.m154721d(aVar, "");
        this.f190198b = aVar;
        this.f190199c = true;
        aVar.registerAdapterDataObserver(new RecyclerView.AbstractC1353c(this) {
            /* class com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85019f.C850201 */

            /* renamed from: a */
            final /* synthetic */ AbstractC85019f f190200a;

            static {
                Covode.recordClassIndex(99041);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4655a() {
                this.f190200a.notifyDataSetChanged();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f190200a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4656a(int i, int i2) {
                AbstractC85019f fVar = this.f190200a;
                fVar.notifyItemRangeChanged(i + fVar.mo129945a(), i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: b */
            public final void mo4660b(int i, int i2) {
                AbstractC85019f fVar = this.f190200a;
                fVar.notifyItemRangeInserted(i + fVar.mo129945a(), i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: c */
            public final void mo4661c(int i, int i2) {
                AbstractC85019f fVar = this.f190200a;
                fVar.notifyItemRangeRemoved(i + fVar.mo129945a(), i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4657a(int i, int i2, int i3) {
                AbstractC85019f fVar = this.f190200a;
                fVar.notifyItemMoved(i + fVar.mo129945a(), i2 + this.f190200a.mo129945a());
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4658a(int i, int i2, Object obj) {
                AbstractC85019f fVar = this.f190200a;
                fVar.notifyItemRangeChanged(i + fVar.mo129945a(), i2, obj);
            }
        });
        this.f190197a = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        if (!this.f190197a || i != 0) {
            return this.f190198b.getItemViewType(i - mo129945a());
        }
        return -2147483646;
    }

    public /* synthetic */ AbstractC85019f(RecyclerView.AbstractC1350a aVar, byte b) {
        this(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (getItemViewType(i) == -2147483646) {
            mo129674a(viewHolder);
        } else {
            this.f190198b.onBindViewHolder(viewHolder, i - mo129945a());
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85017e
    /* renamed from: a */
    public final int mo129939a(int i, GridLayoutManager gridLayoutManager) {
        C89219l.m154721d(gridLayoutManager, "");
        if (getItemViewType(i) == -2147483646) {
            return gridLayoutManager.f4316b;
        }
        RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar = this.f190198b;
        if (aVar instanceof AbstractC85017e) {
            return ((AbstractC85017e) aVar).mo129939a(i - mo129945a(), gridLayoutManager);
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list, "");
        if (getItemViewType(i) == -2147483646) {
            onBindViewHolder(viewHolder, i);
        } else {
            this.f190198b.onBindViewHolder(viewHolder, i - mo129945a(), list);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m146158a(AbstractC85019f fVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        C89219l.m154721d(viewGroup, "");
        if (-2147483646 == i) {
            viewHolder = fVar.mo129673a(viewGroup);
        } else {
            viewHolder = fVar.f190198b.onCreateViewHolder(viewGroup, i);
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
