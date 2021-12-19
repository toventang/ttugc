package com.bytedance.bdturing.verify.p867a;

import com.bytedance.bdturing.p866f.C13284b;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bdturing.verify.a.f */
public final class C13327f extends AbstractC13322a {

    /* renamed from: f */
    public int f32588f;

    static {
        Covode.recordClassIndex(15295);
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: b */
    public final int mo21495b() {
        return 2;
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: c */
    public final String mo21496c() {
        return "verify";
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: d */
    public final int mo21497d() {
        return 6000;
    }

    public /* synthetic */ C13327f() {
        this(0);
    }

    public C13327f(int i) {
        this.f32588f = i;
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: a */
    public final void mo21492a(StringBuilder sb) {
        C89219l.m154719c(sb, "");
        int i = this.f32588f;
        if (i != 0) {
            C13284b.m23895a(sb, "challenge_code", i);
        }
    }
}
