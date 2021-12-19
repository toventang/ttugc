package com.p2082ss.android.ugc.tools.view.p4363b;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;

/* renamed from: com.ss.android.ugc.tools.view.b.f */
public abstract class AbstractC84932f extends RecyclerView.AbstractC1350a {

    /* renamed from: q */
    public boolean f189783q = true;

    static {
        Covode.recordClassIndex(98926);
    }

    /* renamed from: a */
    public abstract int mo112426a();

    /* renamed from: a */
    public int mo122048a(int i) {
        return 0;
    }

    /* renamed from: a */
    public abstract RecyclerView.ViewHolder mo129695a(ViewGroup viewGroup);

    /* renamed from: a */
    public abstract RecyclerView.ViewHolder mo112427a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public abstract void mo129696a(RecyclerView.ViewHolder viewHolder);

    /* renamed from: a */
    public abstract void mo112428a(RecyclerView.ViewHolder viewHolder, int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo129694c(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m145982a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        if (this.f189783q) {
            return mo112426a() + 1;
        }
        return mo112426a();
    }

    /* renamed from: d */
    public final void mo129702d(boolean z) {
        if (z != this.f189783q) {
            this.f189783q = z;
            mo129694c(z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (!this.f189783q || i != mo112426a()) {
            return mo122048a(i);
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            mo129696a(viewHolder);
        } else {
            mo112428a(viewHolder, i);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m145982a(AbstractC84932f fVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        if (Integer.MIN_VALUE == i) {
            viewHolder = fVar.mo129695a(viewGroup);
        } else {
            viewHolder = fVar.mo112427a(viewGroup, i);
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
