package com.bytedance.android.live.uikit.recyclerview;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;

/* renamed from: com.bytedance.android.live.uikit.recyclerview.b */
public abstract class AbstractC6239b extends RecyclerView.AbstractC1350a {

    /* renamed from: b */
    public boolean f15608b = true;

    static {
        Covode.recordClassIndex(6948);
    }

    /* renamed from: a */
    public int mo12218a(int i) {
        return 0;
    }

    /* renamed from: a */
    public abstract RecyclerView.ViewHolder mo12212a(ViewGroup viewGroup);

    /* renamed from: a */
    public abstract RecyclerView.ViewHolder mo12219a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public abstract void mo12214a(RecyclerView.ViewHolder viewHolder);

    /* renamed from: a */
    public abstract void mo12220a(RecyclerView.ViewHolder viewHolder, int i);

    /* renamed from: c */
    public abstract int mo12221c();

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m13539a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        if (this.f15608b) {
            return mo12221c() + 1;
        }
        return mo12221c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (!this.f15608b || i != mo12221c()) {
            return mo12218a(i);
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            mo12214a(viewHolder);
        } else {
            mo12220a(viewHolder, i);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m13539a(AbstractC6239b bVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        if (Integer.MIN_VALUE == i) {
            viewHolder = bVar.mo12212a(viewGroup);
        } else {
            viewHolder = bVar.mo12219a(viewGroup, i);
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
