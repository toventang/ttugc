package com.bytedance.bdturing.verify.p867a;

import android.text.TextUtils;
import com.bytedance.bdturing.p866f.C13284b;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bdturing.verify.a.b */
public final class C13323b extends AbstractC13322a {

    /* renamed from: f */
    public String f32583f;

    /* renamed from: g */
    public String f32584g;

    static {
        Covode.recordClassIndex(15291);
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: b */
    public final int mo21495b() {
        return 7;
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: c */
    public final String mo21496c() {
        return "twice_verify";
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: d */
    public final int mo21497d() {
        return 6000;
    }

    private /* synthetic */ C13323b() {
        this(null, null);
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: a */
    public final void mo21492a(StringBuilder sb) {
        C89219l.m154719c(sb, "");
        C13284b.m23896a(sb, "decision_config", "block-sms");
        C13284b.m23895a(sb, "is_turing", 1);
        if (!TextUtils.isEmpty(this.f32583f)) {
            C13284b.m23896a(sb, "verify_ticket", this.f32583f);
        }
        if (!TextUtils.isEmpty(this.f32584g)) {
            C13284b.m23896a(sb, "show_mobile", this.f32584g);
        }
        C13284b.m23895a(sb, "use_turing_bridge", 1);
    }

    public C13323b(String str, String str2) {
        this.f32583f = str;
        this.f32584g = str2;
    }
}
