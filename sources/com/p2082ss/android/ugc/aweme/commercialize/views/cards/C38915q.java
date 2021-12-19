package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.TopPageActionV2;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.q */
public final /* synthetic */ class C38915q implements TopPageActionV2.AbstractC38860a {

    /* renamed from: a */
    private final C38907p f91917a;

    static {
        Covode.recordClassIndex(46502);
    }

    C38915q(C38907p pVar) {
        this.f91917a = pVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.TopPageActionV2.AbstractC38860a
    /* renamed from: a */
    public final void mo67521a(C38887d dVar) {
        CardStruct o;
        C38907p pVar = this.f91917a;
        String cardUrl = (C37663b.f89031b.mo65688a() == null || (o = C37663b.f89031b.mo65688a().mo65683o(pVar.f91884b)) == null) ? "" : o.getCardUrl();
        C1764a.m5929a(Locale.getDefault(), "onRenderFinish:%s, %d", new Object[]{cardUrl, Integer.valueOf(dVar.f91831a)});
        AbstractC38878ae a = pVar.mo67584a(false);
        if (a != null) {
            a.mo67533a(C1764a.m5929a(Locale.getDefault(), "javascript:window.modalLoadStatusEvent({'modal_url': '%s', 'status': %d})", new Object[]{cardUrl, Integer.valueOf(dVar.f91831a)}));
        }
    }
}
