package com.bytedance.hybrid.spark.p1110d;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21136a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.d.p */
public final class C15567p implements AbstractC15510f {

    /* renamed from: a */
    private final C21136a f37941a;

    /* renamed from: b */
    private final SparkActivity f37942b;

    /* renamed from: c */
    private final ViewGroup f37943c;

    static {
        Covode.recordClassIndex(17829);
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15510f
    /* renamed from: a */
    public final void mo25251a() {
        boolean z;
        C21136a aVar = this.f37941a;
        if (aVar != null) {
            z = aVar.getTransStatusBar();
        } else {
            z = false;
        }
        this.f37942b.f37986f = z;
        if (z) {
            this.f37943c.setVisibility(8);
        }
    }

    public C15567p(C21136a aVar, SparkActivity sparkActivity, ViewGroup viewGroup) {
        C89219l.m154719c(sparkActivity, "");
        C89219l.m154719c(viewGroup, "");
        this.f37941a = aVar;
        this.f37942b = sparkActivity;
        this.f37943c = viewGroup;
    }
}
