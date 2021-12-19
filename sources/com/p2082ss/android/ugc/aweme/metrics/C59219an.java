package com.p2082ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;

/* renamed from: com.ss.android.ugc.aweme.metrics.an */
public final class C59219an extends AbstractC59242h<C59219an> {

    /* renamed from: a */
    public String f134910a;

    /* renamed from: b */
    private String f134911b;

    /* renamed from: c */
    private Aweme f134912c;

    /* renamed from: d */
    private String f134913d;

    static {
        Covode.recordClassIndex(69582);
    }

    public C59219an() {
        super("tab_stay_time");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public final void mo69786a() {
        mo96790a("duration", this.f134910a, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("enter_from", this.f135169h, AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("group_id", C59208ac.m108771e(this.f134912c), AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("author_id", C59208ac.m108758a(this.f134912c), AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("city_info", "", AbstractC59233c.AbstractC59234a.f135177a);
        mo96790a("enter_method", this.f134913d, AbstractC59233c.AbstractC59234a.f135177a);
        if (!TextUtils.isEmpty(this.f134911b)) {
            mo96790a("page_type", this.f134911b, AbstractC59233c.AbstractC59234a.f135177a);
        }
    }

    /* renamed from: a */
    public final C59219an mo96761a(String str) {
        this.f135169h = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C59219an mo96749g(Aweme aweme) {
        super.mo96749g(aweme);
        this.f134912c = aweme;
        return this;
    }
}
