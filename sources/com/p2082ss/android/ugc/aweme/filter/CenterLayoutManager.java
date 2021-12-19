package com.p2082ss.android.ugc.aweme.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.filter.CenterLayoutManager */
public class CenterLayoutManager extends LinearLayoutManager {
    static {
        Covode.recordClassIndex(59787);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.CenterLayoutManager$a */
    static class C50631a extends C1481r {
        static {
            Covode.recordClassIndex(59788);
        }

        C50631a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final float mo4862a(DisplayMetrics displayMetrics) {
            return 200.0f / ((float) displayMetrics.densityDpi);
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final int mo5011a(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
        C50631a aVar = new C50631a(recyclerView.getContext());
        aVar.f4515g = i;
        mo4695a(aVar);
    }

    public CenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
