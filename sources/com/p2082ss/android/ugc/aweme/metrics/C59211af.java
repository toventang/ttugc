package com.p2082ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;

/* renamed from: com.ss.android.ugc.aweme.metrics.af */
public final class C59211af extends AbstractC59233c {

    /* renamed from: a */
    public String f134808a;

    /* renamed from: b */
    public String f134809b;

    /* renamed from: c */
    public String f134810c;

    /* renamed from: d */
    private String f134811d;

    static {
        Covode.recordClassIndex(69574);
    }

    public C59211af() {
        super("qr_code_save");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        mo96790a("previous_page", this.f134808a, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("platform", this.f134809b, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("qr_code_type", this.f134810c, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("enter_method", this.f134811d, AbstractC59233c.AbstractC59234a.f135177a);
    }
}
