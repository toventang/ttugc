package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.ScrollOffsetLayoutManager */
public class ScrollOffsetLayoutManager extends WrapLinearLayoutManager {

    /* renamed from: a */
    private final SparseIntArray f119109a = new SparseIntArray();

    static {
        Covode.recordClassIndex(61031);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4324a(RecyclerView.C1378s sVar) {
        super.mo4324a(sVar);
        int s = mo4730s();
        for (int i = 0; i < s; i++) {
            View g = mo4717g(i);
            if (g != null) {
                this.f119109a.put(i, g.getHeight());
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public final int mo4339e(RecyclerView.C1378s sVar) {
        int i;
        if (mo4730s() == 0) {
            return 0;
        }
        try {
            int k = mo4371k();
            int i2 = -((int) mo4358c(k).getY());
            for (int i3 = 0; i3 < k; i3++) {
                if (this.f119109a.indexOfKey(i3) >= 0) {
                    i = 0;
                } else {
                    i = this.f119109a.get(i3);
                }
                i2 += i;
            }
            return i2;
        } catch (Exception unused) {
            return 0;
        }
    }

    public ScrollOffsetLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
