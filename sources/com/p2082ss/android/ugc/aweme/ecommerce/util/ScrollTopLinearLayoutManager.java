package com.p2082ss.android.ugc.aweme.ecommerce.util;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.util.ScrollTopLinearLayoutManager */
public final class ScrollTopLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public int f106089a;

    /* renamed from: b */
    public boolean f106090b = true;

    static {
        Covode.recordClassIndex(54044);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: g */
    public final boolean mo4368g() {
        if (!this.f106090b || !super.mo4368g()) {
            return false;
        }
        return true;
    }

    public ScrollTopLinearLayoutManager(Context context) {
        C89219l.m154721d(context, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.util.ScrollTopLinearLayoutManager$a */
    final class C45552a extends C1481r {

        /* renamed from: f */
        final /* synthetic */ ScrollTopLinearLayoutManager f106091f;

        static {
            Covode.recordClassIndex(54045);
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: b */
        public final int mo5013b() {
            return -1;
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: c */
        public final int mo5016c() {
            return -1;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45552a(ScrollTopLinearLayoutManager scrollTopLinearLayoutManager, Context context) {
            super(context);
            C89219l.m154721d(context, "");
            this.f106091f = scrollTopLinearLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r, androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final void mo4777a(View view, RecyclerView.C1378s sVar, RecyclerView.AbstractC1375r.C1376a aVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(sVar, "");
            C89219l.m154721d(aVar, "");
            int b = mo5015b(view, -1);
            int a = mo5012a(view, -1) + this.f106091f.f106089a;
            int a2 = mo5010a((int) Math.sqrt((double) ((b * b) + (a * a))));
            if (a2 > 0) {
                aVar.mo4780a(-b, -a, a2, this.f4912b);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        Context context = recyclerView.getContext();
        C89219l.m154716b(context, "");
        C45552a aVar = new C45552a(this, context);
        aVar.f4515g = i;
        mo4695a(aVar);
    }
}
