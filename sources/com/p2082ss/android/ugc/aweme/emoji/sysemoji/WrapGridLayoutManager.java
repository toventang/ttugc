package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.WrapGridLayoutManager */
public class WrapGridLayoutManager extends GridLayoutManager {
    static {
        Covode.recordClassIndex(55171);
    }

    public WrapGridLayoutManager(int i) {
        super(i, 1, false);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final void mo4337c(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            super.mo4337c(oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public WrapGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
