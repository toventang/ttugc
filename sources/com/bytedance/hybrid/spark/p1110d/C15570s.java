package com.bytedance.hybrid.spark.p1110d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.hybrid.spark.p1111e.C15574d;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21137b;
import com.bytedance.lynx.p1507a.p1508a.p1514f.C21144b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.bytedance.hybrid.spark.d.s */
public final class C15570s implements AbstractC15510f {

    /* renamed from: a */
    private final C21137b f37949a;

    /* renamed from: b */
    private final View f37950b;

    static {
        Covode.recordClassIndex(17832);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        int width;
        ViewGroup.LayoutParams layoutParams = this.f37950b.getLayoutParams();
        if (this.f37949a.getWidth() > 0) {
            width = C89271h.m154772c(this.f37949a.getWidth(), C21144b.m39810b());
        } else if (this.f37949a.getWidth() != 0) {
            width = this.f37949a.getWidth();
        } else if (C89219l.m154714a((Object) this.f37949a.getGravity(), (Object) "center")) {
            Context context = this.f37950b.getContext();
            C89219l.m154709a((Object) context, "");
            width = C15574d.m28692a(context, 300.0d);
        } else {
            width = -1;
        }
        layoutParams.width = width;
    }

    public C15570s(C21137b bVar, View view) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(view, "");
        this.f37949a = bVar;
        this.f37950b = view;
    }
}
