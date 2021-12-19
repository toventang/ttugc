package com.bytedance.bdturing.verify.p867a;

import android.text.TextUtils;
import com.bytedance.bdturing.p866f.C13284b;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bdturing.verify.a.o */
public final class C13336o extends AbstractC13322a {

    /* renamed from: f */
    public String f32602f;

    static {
        Covode.recordClassIndex(15304);
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: b */
    public final int mo21495b() {
        return 13;
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

    private /* synthetic */ C13336o() {
        this("");
    }

    public C13336o(String str) {
        C89219l.m154719c(str, "");
        this.f32602f = str;
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: a */
    public final void mo21492a(StringBuilder sb) {
        C89219l.m154719c(sb, "");
        C13284b.m23896a(sb, "decision_config", "mobile_voice_sms_verify");
        if (!TextUtils.isEmpty(this.f32602f)) {
            C13284b.m23896a(sb, "verify_ticket", this.f32602f);
        }
        C13284b.m23895a(sb, "use_turing_bridge", 1);
    }
}
