package com.p2082ss.android.ugc.aweme.qrcode.p3653b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;

/* renamed from: com.ss.android.ugc.aweme.qrcode.b.b */
public final class C66374b extends AbstractC59233c {

    /* renamed from: a */
    public String f149278a;

    /* renamed from: b */
    public String f149279b;

    /* renamed from: c */
    public String f149280c;

    /* renamed from: d */
    public String f149281d;

    /* renamed from: e */
    public String f149282e;

    static {
        Covode.recordClassIndex(77906);
    }

    public C66374b() {
        super("qr_code_scanned");
    }

    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        mo96790a("url_content", this.f149278a, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("enter_method", this.f149279b, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("landing_page", this.f149280c, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("from_user_code", this.f149281d, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("qr_code_type", this.f149282e, AbstractC59233c.AbstractC59234a.f135177a);
    }
}
