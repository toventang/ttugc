package com.p2082ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;

/* renamed from: com.ss.android.ugc.aweme.metrics.e */
public final class C59239e extends AbstractC59233c {

    /* renamed from: a */
    public String f135180a;

    /* renamed from: b */
    public String f135181b;

    /* renamed from: c */
    public String f135182c;

    static {
        Covode.recordClassIndex(69602);
    }

    public C59239e() {
        super("choose_filter");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        mo96790a("content_type", this.f135180a, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("enter_from", this.f135181b, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("filter_name", this.f135182c, AbstractC59233c.AbstractC59234a.f135177a);
    }
}
