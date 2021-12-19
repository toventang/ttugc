package com.bytedance.bdturing.verify.p867a;

import android.text.TextUtils;
import com.bytedance.bdturing.p866f.C13284b;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bdturing.verify.a.m */
public final class C13334m extends AbstractC13322a {

    /* renamed from: f */
    public String f32599f;

    /* renamed from: g */
    public String f32600g;

    /* renamed from: h */
    public String f32601h;

    static {
        Covode.recordClassIndex(15302);
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: b */
    public final int mo21495b() {
        return 6;
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

    private /* synthetic */ C13334m() {
        this("", "", "");
    }

    @Override // com.bytedance.bdturing.verify.p867a.AbstractC13322a
    /* renamed from: a */
    public final void mo21492a(StringBuilder sb) {
        C89219l.m154719c(sb, "");
        C13284b.m23896a(sb, "decision_config", "block-upsms");
        C13284b.m23895a(sb, "is_turing", 1);
        if (!TextUtils.isEmpty(this.f32599f)) {
            C13284b.m23896a(sb, "verify_ticket", this.f32599f);
        }
        C13284b.m23896a(sb, "channel_mobile", this.f32600g);
        C13284b.m23896a(sb, "sms_content", this.f32601h);
        C13284b.m23895a(sb, "use_turing_bridge", 1);
    }

    public C13334m(String str, String str2, String str3) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        this.f32599f = str;
        this.f32600g = str2;
        this.f32601h = str3;
    }
}
