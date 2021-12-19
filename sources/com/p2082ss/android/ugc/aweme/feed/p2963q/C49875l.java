package com.p2082ss.android.ugc.aweme.feed.p2963q;

import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.p2282ad.FeedAdServiceImpl;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.q.l */
public final /* synthetic */ class C49875l implements C33403c.AbstractC33409e {

    /* renamed from: a */
    private final AbstractC49815a f114962a;

    static {
        Covode.recordClassIndex(58982);
    }

    C49875l(AbstractC49815a aVar) {
        this.f114962a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.C33403c.AbstractC33409e
    public final void bs_() {
        AbstractC49815a aVar = this.f114962a;
        aVar.bs_();
        aVar.f114831bf = true;
        if (aVar.f114837bl != 4) {
            if (C33403c.f79377m > 0) {
                AbstractC49815a.m93287a(aVar.f114812an, C33403c.f79377m);
                AbstractC49815a.m93287a(aVar.f114814ap, -2);
            } else {
                AbstractC49815a.m93287a(aVar.f114814ap, 0);
            }
            if (C33403c.f79378n > 0) {
                AbstractC49815a.m93287a(aVar.f114813ao, C33403c.f79378n);
                AbstractC49815a.m93287a(aVar.f114815aq, -2);
            } else {
                AbstractC49815a.m93287a(aVar.f114815aq, 0);
            }
        } else {
            AbstractC49815a.m93287a(aVar.f114814ap, 0);
            AbstractC49815a.m93287a(aVar.f114815aq, 0);
        }
        FeedAdServiceImpl.m67808c().mo58883b().mo59084a(C13628n.m24504a(C17867d.m33078a()), aVar.f114759N.getHeight());
    }
}
