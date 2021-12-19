package com.bytedance.bdturing.verify.p867a;

import com.bytedance.bdturing.p866f.C13284b;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bdturing.verify.a.l */
public final class C13333l extends AbstractC13322a {

    /* renamed from: f */
    public String f32596f;

    /* renamed from: g */
    public boolean f32597g;

    /* renamed from: h */
    public String f32598h;

    static {
        Covode.recordClassIndex(15301);
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: b */
    public final int mo21495b() {
        return 1;
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: c */
    public final String mo21496c() {
        return "sms";
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: d */
    public final int mo21497d() {
        return 6000;
    }

    public /* synthetic */ C13333l() {
        this(null);
    }

    private C13333l(String str) {
        this.f32596f = null;
        this.f32597g = false;
        this.f32598h = null;
        mo21493a(true);
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: a */
    public final void mo21492a(StringBuilder sb) {
        C89219l.m154719c(sb, "");
        C13284b.m23896a(sb, "scene", this.f32596f);
        C13284b.m23895a(sb, "show_success_toast", this.f32597g ? 1 : 0);
        C13284b.m23896a(sb, "uid", this.f32598h);
    }
}
