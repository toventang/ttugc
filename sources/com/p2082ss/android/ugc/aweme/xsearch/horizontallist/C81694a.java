package com.p2082ss.android.ugc.aweme.xsearch.horizontallist;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1491x;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.C34150f;
import com.p2082ss.android.ugc.aweme.p2757dg.C41478e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.horizontallist.a */
public final class C81694a extends C34150f {

    /* renamed from: e */
    public final RecyclerView f182668e;

    /* renamed from: f */
    public final boolean f182669f;

    /* renamed from: g */
    public final int f182670g;

    static {
        Covode.recordClassIndex(95099);
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.C34150f, com.p2082ss.android.ugc.aweme.autoplay.p2348d.C34147e
    /* renamed from: a */
    public final int mo60478a(View view, AbstractC1491x xVar) {
        float f;
        C89219l.m154721d(view, "");
        C89219l.m154721d(xVar, "");
        int a = super.mo60478a(view, xVar);
        int e = RecyclerView.m4278e(view);
        if (e == -1 || e == 0) {
            return a;
        }
        RecyclerView.AbstractC1361h d = this.f182668e.mo4434d();
        C89219l.m154716b(d, "");
        if (d instanceof C41478e) {
            f = ((C41478e) d).f96778a;
        } else {
            f = 0.0f;
        }
        float f2 = ((float) a) + f;
        int i = (int) f2;
        if (((float) i) - f2 > 0.0f) {
            return i - 1;
        }
        return i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81694a(RecyclerView recyclerView, boolean z, int i) {
        super(z, i);
        C89219l.m154721d(recyclerView, "");
        this.f182668e = recyclerView;
        this.f182669f = z;
        this.f182670g = i;
    }
}
