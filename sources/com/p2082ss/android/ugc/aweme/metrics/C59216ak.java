package com.p2082ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;

/* renamed from: com.ss.android.ugc.aweme.metrics.ak */
public final class C59216ak extends AbstractC59233c {

    /* renamed from: a */
    public String f134873a;

    /* renamed from: b */
    public String f134874b;

    static {
        Covode.recordClassIndex(69579);
    }

    public C59216ak() {
        super("tag_show");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        mo96790a("enter_from", this.f134873a, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("tag_id", this.f134874b, AbstractC59233c.AbstractC59234a.f135178b);
        mo96790a("content", "tag", AbstractC59233c.AbstractC59234a.f135177a);
    }
}
