package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVLinearLayoutManager */
public class MVLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public float f157578a = 5.0f;

    static {
        Covode.recordClassIndex(82958);
    }

    public MVLinearLayoutManager() {
        super(0, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVLinearLayoutManager$a */
    class C70507a extends C1481r {
        static {
            Covode.recordClassIndex(82959);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r
        /* renamed from: c */
        public final PointF mo4778c(int i) {
            return MVLinearLayoutManager.this.mo4360d(i);
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final float mo4862a(DisplayMetrics displayMetrics) {
            return MVLinearLayoutManager.this.f157578a / ((float) displayMetrics.densityDpi);
        }

        public C70507a(Context context) {
            super(context);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
        C70507a aVar = new C70507a(recyclerView.getContext());
        aVar.f4515g = i;
        mo4695a(aVar);
    }

    public MVLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
