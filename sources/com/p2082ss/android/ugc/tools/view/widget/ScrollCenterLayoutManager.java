package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84912r;

/* renamed from: com.ss.android.ugc.tools.view.widget.ScrollCenterLayoutManager */
public class ScrollCenterLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private RecyclerView.AbstractC1375r f190131a;

    /* renamed from: b */
    private Context f190132b;

    static {
        Covode.recordClassIndex(99018);
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.ScrollCenterLayoutManager$a */
    static class C85000a extends C1481r {
        static {
            Covode.recordClassIndex(99019);
        }

        C85000a(Context context) {
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

    public ScrollCenterLayoutManager(Context context) {
        super(0, false);
        this.f190132b = context;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public final void mo4363e(int i) {
        mo4347a(i, (int) (((float) (this.f4485J / 2)) - C84912r.m145930a(this.f190132b, 45.0f)));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
        Context context = recyclerView.getContext();
        if (this.f190131a == null) {
            this.f190131a = new C85000a(context);
        }
        RecyclerView.AbstractC1375r rVar = this.f190131a;
        rVar.f4515g = i;
        mo4695a(rVar);
    }

    public ScrollCenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f190132b = context;
    }
}
