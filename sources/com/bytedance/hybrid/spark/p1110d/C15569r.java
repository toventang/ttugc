package com.bytedance.hybrid.spark.p1110d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21137b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.d.r */
public final class C15569r implements AbstractC15510f {

    /* renamed from: a */
    private final C21137b f37947a;

    /* renamed from: b */
    private final View f37948b;

    static {
        Covode.recordClassIndex(17831);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        if (this.f37947a.getShowMask()) {
            this.f37948b.setVisibility(0);
            return;
        }
        this.f37948b.setVisibility(0);
        this.f37948b.setAlpha(0.0f);
    }

    public C15569r(C21137b bVar, View view) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(view, "");
        this.f37947a = bVar;
        this.f37948b = view;
    }
}
