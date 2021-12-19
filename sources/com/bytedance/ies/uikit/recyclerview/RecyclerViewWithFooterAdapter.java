package com.bytedance.ies.uikit.recyclerview;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;

public abstract class RecyclerViewWithFooterAdapter extends RecyclerView.AbstractC1350a {
    protected boolean mShowFooter = true;

    static {
        Covode.recordClassIndex(20946);
    }

    /* renamed from: com_bytedance_ies_uikit_recyclerview_RecyclerViewWithFooterAdapter_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m33990xa2dc1e6d(String str, String str2) {
        return 0;
    }

    public abstract int getBasicItemCount();

    public int getBasicItemViewType(int i) {
        return 0;
    }

    public abstract void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i);

    public abstract void onBindFooterViewHolder(RecyclerView.ViewHolder viewHolder);

    public abstract RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i);

    public abstract RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m33991x7fa848c6(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        if (this.mShowFooter) {
            return getBasicItemCount() + 1;
        }
        return getBasicItemCount();
    }

    public void setShowFooter(boolean z) {
        this.mShowFooter = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (!this.mShowFooter || i != getBasicItemCount()) {
            return getBasicItemViewType(i);
        }
        return Integer.MIN_VALUE;
    }

    public final RecyclerView.ViewHolder RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        if (Integer.MIN_VALUE == i) {
            return onCreateFooterViewHolder(viewGroup);
        }
        return onCreateBasicViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            onBindFooterViewHolder(viewHolder);
        } else {
            onBindBasicViewHolder(viewHolder, i);
        }
    }

    /* renamed from: com_bytedance_ies_uikit_recyclerview_RecyclerViewWithFooterAdapter_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_onCreateViewHolder */
    public static RecyclerView.ViewHolder m33991x7fa848c6(RecyclerViewWithFooterAdapter recyclerViewWithFooterAdapter, ViewGroup viewGroup, int i) {
        boolean a;
        RecyclerView.ViewHolder RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___ = recyclerViewWithFooterAdapter.RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___(viewGroup, i);
        try {
            if (RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    String stringBuffer2 = stringBuffer.toString();
                    m33990xa2dc1e6d("RecyclerViewLancet", stringBuffer2);
                    C22708a.m42800a(stringBuffer2);
                    ViewGroup viewGroup2 = (ViewGroup) RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___.getClass().getName();
        return RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___;
    }
}
