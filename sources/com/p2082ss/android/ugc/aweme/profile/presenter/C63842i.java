package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.presenter.i */
public final /* synthetic */ class C63842i implements AbstractC88983w {

    /* renamed from: a */
    private final C63833b f144753a;

    /* renamed from: b */
    private final String f144754b;

    static {
        Covode.recordClassIndex(75266);
    }

    C63842i(C63833b bVar, String str) {
        this.f144753a = bVar;
        this.f144754b = str;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        FeedItemList c = this.f144753a.mo103311c(this.f144754b);
        if (c == null) {
            c = new FeedItemList();
        }
        c.hasMore = 0;
        vVar.mo143031a(c);
    }
}
