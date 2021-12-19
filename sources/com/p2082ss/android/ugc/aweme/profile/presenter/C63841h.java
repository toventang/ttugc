package com.p2082ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.presenter.h */
public final /* synthetic */ class C63841h implements AbstractC88433f {

    /* renamed from: a */
    private final C63833b f144752a;

    static {
        Covode.recordClassIndex(75265);
    }

    C63841h(C63833b bVar) {
        this.f144752a = bVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C63833b bVar = this.f144752a;
        Throwable th = (Throwable) obj;
        C77283a.m135108a("AwemeModel", "fetchListRx: " + C76706a.m134271a(th), th);
        C34608n.m70658a().mo61083a(bVar.mHandler, new CallableC63846m(th), 0);
    }
}
