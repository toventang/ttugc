package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.wdiget;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.wdiget.HorizontalCenterLayoutManager */
public final class HorizontalCenterLayoutManager extends LinearLayoutManager {
    static {
        Covode.recordClassIndex(85125);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.wdiget.HorizontalCenterLayoutManager$a */
    public static final class C72451a extends C1481r {

        /* renamed from: f */
        final /* synthetic */ RecyclerView f162430f;

        static {
            Covode.recordClassIndex(85126);
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final float mo4862a(DisplayMetrics displayMetrics) {
            C89219l.m154721d(displayMetrics, "");
            return 150.0f / ((float) displayMetrics.densityDpi);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72451a(RecyclerView recyclerView, Context context) {
            super(context);
            this.f162430f = recyclerView;
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final int mo5011a(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalCenterLayoutManager(Context context) {
        super(0, false);
        C89219l.m154721d(context, "");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
        C89219l.m154721d(recyclerView, "");
        super.mo4354a(recyclerView, sVar, i);
        C72451a aVar = new C72451a(recyclerView, recyclerView.getContext());
        aVar.f4515g = i;
        mo4695a(aVar);
    }
}
