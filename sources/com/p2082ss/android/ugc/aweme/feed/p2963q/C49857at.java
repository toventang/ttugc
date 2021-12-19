package com.p2082ss.android.ugc.aweme.feed.p2963q;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33485al;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.ss.android.ugc.aweme.feed.q.at */
public final class C49857at implements AbstractC33485al, AbstractC49851ao {

    /* renamed from: a */
    final WeakReference<AbstractC49849am> f114935a;

    /* renamed from: b */
    private final int f114936b;

    /* renamed from: c */
    private final C88411a f114937c = new C88411a();

    static {
        Covode.recordClassIndex(58964);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: a */
    public final void mo59568a() {
        this.f114937c.dispose();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49851ao
    /* renamed from: c */
    public final void mo84885c() {
        BusinessComponentServiceUtils.getAppStateReporter().mo89997b(this);
        this.f114937c.dispose();
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: b */
    public final void mo59569b() {
        this.f114937c.dispose();
        this.f114937c.mo142945a(AbstractC88979t.m154310b("").mo143295e((long) this.f114936b, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C49858au(this), C49859av.f114939a));
    }

    public C49857at(AbstractC49849am amVar, int i) {
        this.f114935a = new WeakReference<>(amVar);
        this.f114936b = i;
        BusinessComponentServiceUtils.getAppStateReporter().mo89996a(this);
    }
}
