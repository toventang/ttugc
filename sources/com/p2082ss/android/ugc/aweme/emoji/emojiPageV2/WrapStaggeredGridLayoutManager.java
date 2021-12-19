package com.p2082ss.android.ugc.aweme.emoji.emojiPageV2;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.WrapStaggeredGridLayoutManager */
public class WrapStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    static {
        Covode.recordClassIndex(55051);
    }

    public WrapStaggeredGridLayoutManager(int i) {
        super(i, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i, androidx.recyclerview.widget.StaggeredGridLayoutManager
    /* renamed from: c */
    public final void mo4337c(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            super.mo4337c(oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i, androidx.recyclerview.widget.StaggeredGridLayoutManager
    /* renamed from: b */
    public final int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        try {
            return super.mo4331b(i, oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public WrapStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
