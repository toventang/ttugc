package com.bytedance.hybrid.spark.p1110d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21137b;
import com.bytedance.lynx.p1507a.p1508a.p1513e.C21142a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.d.e */
public final class C15552e implements AbstractC15510f {

    /* renamed from: a */
    private final C21137b f37912a;

    /* renamed from: b */
    private final View f37913b;

    static {
        Covode.recordClassIndex(17814);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        int i = 0;
        if (this.f37912a.getMaskBgColor() != null) {
            View view = this.f37913b;
            C21142a maskBgColor = this.f37912a.getMaskBgColor();
            if (maskBgColor != null) {
                i = maskBgColor.getColor(this.f37913b.getContext());
            }
            view.setBackgroundColor(i);
            return;
        }
        this.f37913b.setBackgroundColor(0);
    }

    public C15552e(C21137b bVar, View view) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(view, "");
        this.f37912a = bVar;
        this.f37913b = view;
    }
}
