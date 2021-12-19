package com.bytedance.hybrid.spark.p1110d;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21136a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.d.g */
public final class C15554g implements AbstractC15510f {

    /* renamed from: a */
    private final C21136a f37916a;

    /* renamed from: b */
    private final ViewGroup f37917b;

    static {
        Covode.recordClassIndex(17816);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        C21136a aVar = this.f37916a;
        if (aVar == null || !aVar.getHideNavBar()) {
            this.f37917b.setVisibility(0);
        } else {
            this.f37917b.setVisibility(8);
        }
    }

    public C15554g(C21136a aVar, ViewGroup viewGroup) {
        C89219l.m154719c(viewGroup, "");
        this.f37916a = aVar;
        this.f37917b = viewGroup;
    }
}
