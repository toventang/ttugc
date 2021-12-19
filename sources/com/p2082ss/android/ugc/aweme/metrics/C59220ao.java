package com.p2082ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;

/* renamed from: com.ss.android.ugc.aweme.metrics.ao */
public final class C59220ao extends AbstractC59242h<C59220ao> {

    /* renamed from: a */
    protected String f134914a;

    /* renamed from: b */
    public String f134915b;

    /* renamed from: c */
    public String f134916c;

    /* renamed from: d */
    public Aweme f134917d;

    /* renamed from: e */
    public int f134918e;

    /* renamed from: p */
    private int f134919p;

    static {
        Covode.recordClassIndex(69583);
    }

    public C59220ao() {
        super("video_pause");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        mo96790a("author_id", C59208ac.m108758a(this.f134917d), AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("group_id", this.f134915b, AbstractC59233c.AbstractC59234a.f135178b);
        mo96794h(this.f134916c);
        mo96790a("enter_from", this.f134914a, AbstractC59233c.AbstractC59234a.f135177a);
        if (this.f134919p != 0) {
            mo96790a("is_long_item", new StringBuilder().append(this.f134919p).toString(), AbstractC59233c.AbstractC59234a.f135177a);
        }
        mo96785a("is_long", this.f134918e);
    }

    /* renamed from: a */
    public final C59220ao mo96762a(String str) {
        this.f134914a = str;
        return this;
    }
}
