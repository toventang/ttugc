package com.p2082ss.android.ugc.aweme.framework.p3007b;

import android.content.Context;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1880e.C24428k;

/* renamed from: com.ss.android.ugc.aweme.framework.b.a */
public class C51425a extends RecyclerView.AbstractC1371n {

    /* renamed from: a */
    private int f118500a;

    static {
        Covode.recordClassIndex(60648);
    }

    public C51425a(Context context) {
        this.f118500a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public void mo4753a(RecyclerView recyclerView, int i) {
        super.mo4753a(recyclerView, i);
        if (i == 0) {
            C24428k.m46551a().mo40247e().f57872e.mo40429b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public void mo4754a(RecyclerView recyclerView, int i, int i2) {
        super.mo4754a(recyclerView, i, i2);
        int abs = Math.abs(i2);
        if (recyclerView.getScrollState() == 1 && abs < this.f118500a) {
            C24428k.m46551a().mo40247e().f57872e.mo40429b();
        } else if (recyclerView.getScrollState() == 1 && abs >= this.f118500a) {
            C24428k.m46551a().mo40247e().f57872e.mo40427a();
        } else if (recyclerView.getScrollState() == 2) {
            C24428k.m46551a().mo40247e().f57872e.mo40427a();
        }
    }
}
