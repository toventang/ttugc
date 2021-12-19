package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.SpeedyLinearLayoutManager */
public final class SpeedyLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public static final C70544a f157766a = new C70544a((byte) 0);

    /* renamed from: b */
    private C1481r f157767b;

    static {
        Covode.recordClassIndex(83004);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.SpeedyLinearLayoutManager$a */
    public static final class C70544a {
        static {
            Covode.recordClassIndex(83005);
        }

        private C70544a() {
        }

        public /* synthetic */ C70544a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.SpeedyLinearLayoutManager$b */
    public static final class C70545b extends C1481r {

        /* renamed from: f */
        final /* synthetic */ RecyclerView f157768f;

        static {
            Covode.recordClassIndex(83006);
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: b */
        public final int mo5013b() {
            return -1;
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final float mo4862a(DisplayMetrics displayMetrics) {
            C89219l.m154721d(displayMetrics, "");
            return 440.0f / ((float) displayMetrics.densityDpi);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70545b(RecyclerView recyclerView, Context context) {
            super(context);
            this.f157768f = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r, androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final void mo4777a(View view, RecyclerView.C1378s sVar, RecyclerView.AbstractC1375r.C1376a aVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(sVar, "");
            C89219l.m154721d(aVar, "");
            int b = mo5015b(view, -1);
            int b2 = mo5014b(b);
            if (b2 > 0) {
                aVar.mo4780a(-b, 0, b2, this.f4911a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpeedyLinearLayoutManager(Context context) {
        super(0, false);
        C89219l.m154721d(context, "");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
        C89219l.m154721d(recyclerView, "");
        if (this.f157767b == null) {
            this.f157767b = new C70545b(recyclerView, recyclerView.getContext());
        }
        C1481r rVar = this.f157767b;
        if (rVar == null) {
            C89219l.m154715b();
        }
        rVar.f4515g = i;
        mo4695a(this.f157767b);
    }
}
