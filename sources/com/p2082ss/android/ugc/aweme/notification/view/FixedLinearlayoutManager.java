package com.p2082ss.android.ugc.aweme.notification.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39109f;

/* renamed from: com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager */
public class FixedLinearlayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private String f141352a = "";

    static {
        Covode.recordClassIndex(73057);
    }

    public FixedLinearlayoutManager() {
    }

    public FixedLinearlayoutManager(String str) {
        super(1, false);
        this.f141352a = str;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final void mo4337c(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            super.mo4337c(oVar, sVar);
        } catch (Exception e) {
            if ("InboxFragment".equals(this.f141352a)) {
                C39109f.m79401a("InboxLayoutManager", "onLayoutChildren error, childCount:" + mo4730s() + " recyclerview.state:" + sVar.toString(), e);
            }
        }
    }

    public FixedLinearlayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
