package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.presenter.g */
public final /* synthetic */ class C63840g implements AbstractC88433f {

    /* renamed from: a */
    private final C63833b f144751a;

    static {
        Covode.recordClassIndex(75264);
    }

    C63840g(C63833b bVar) {
        this.f144751a = bVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C63833b bVar = this.f144751a;
        C77283a.m135111b("AwemeModel", "fetchListRx: finished");
        C34608n.m70658a().mo61083a(bVar.mHandler, new CallableC63838e((FeedItemList) obj), 0);
    }
}
