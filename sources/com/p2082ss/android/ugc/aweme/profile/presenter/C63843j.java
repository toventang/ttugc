package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.j */
public final /* synthetic */ class C63843j implements AbstractC88983w {

    /* renamed from: a */
    private final C63833b f144755a;

    /* renamed from: b */
    private final String f144756b;

    /* renamed from: c */
    private final Aweme f144757c;

    static {
        Covode.recordClassIndex(75267);
    }

    public C63843j(C63833b bVar, String str, Aweme aweme) {
        this.f144755a = bVar;
        this.f144756b = str;
        this.f144757c = aweme;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        C63833b bVar = this.f144755a;
        String str = this.f144756b;
        Aweme aweme = this.f144757c;
        FeedItemList c = bVar.mo103311c(str);
        if (c != null && c.getItems() != null) {
            C50545m.m94763a(c.getItems(), aweme, null);
            bVar.mo103304a(c, str);
        }
    }
}
