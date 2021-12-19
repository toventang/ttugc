package com.p2082ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;

/* renamed from: com.ss.android.ugc.aweme.metrics.p */
public final class C59251p extends AbstractC59233c {

    /* renamed from: a */
    public String f135280a;

    /* renamed from: b */
    public String f135281b;

    /* renamed from: c */
    public String f135282c;

    /* renamed from: d */
    private String f135283d;

    static {
        Covode.recordClassIndex(69614);
    }

    public C59251p() {
        super("enter_personal_detail_backup");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        mo96790a("group_id", this.f135281b, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("to_user_id", this.f135280a, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("enter_from", this.f135169h, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("enter_method", this.f135283d, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("request_id", this.f135282c, AbstractC59233c.AbstractC59234a.f135178b);
        if (C59208ac.m108762a(this.f135169h)) {
            mo96794h(this.f135281b);
        }
    }

    /* renamed from: a */
    public final C59251p mo96821a(String str) {
        this.f135169h = str;
        return this;
    }
}
