package com.p2082ss.android.ugc.aweme.common.p2629a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;

/* renamed from: com.ss.android.ugc.aweme.common.a.l */
public abstract class AbstractC39073l extends RecyclerView.AbstractC1350a {

    /* renamed from: v */
    public boolean f92274v = true;

    static {
        Covode.recordClassIndex(46689);
    }

    /* renamed from: a */
    public abstract RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public abstract void mo63355a(RecyclerView.ViewHolder viewHolder);

    /* renamed from: a */
    public abstract void mo60186a(RecyclerView.ViewHolder viewHolder, int i);

    /* renamed from: a_ */
    public abstract RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo67808b(boolean z) {
    }

    /* renamed from: c */
    public abstract int mo60933c();

    /* renamed from: c */
    public int mo60936c(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m79329a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        if (this.f92274v) {
            return mo60933c() + 1;
        }
        return mo60933c();
    }

    /* renamed from: d */
    public void mo67829d(boolean z) {
        if (z != this.f92274v) {
            this.f92274v = z;
            mo67808b(z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (!this.f92274v || i != mo60933c()) {
            return mo60936c(i);
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            mo63355a(viewHolder);
        } else {
            mo60186a(viewHolder, i);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m79329a(AbstractC39073l lVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        if (Integer.MIN_VALUE == i) {
            viewHolder = lVar.mo62748a_(viewGroup);
        } else {
            viewHolder = lVar.mo60184a(viewGroup, i);
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
