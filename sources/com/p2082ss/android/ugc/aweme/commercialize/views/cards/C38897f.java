package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.views.cards.TopPageAction;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.f */
public final /* synthetic */ class C38897f implements TopPageAction.AbstractC38859a {

    /* renamed from: a */
    private final C38888e f91872a;

    static {
        Covode.recordClassIndex(46484);
    }

    C38897f(C38888e eVar) {
        this.f91872a = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.TopPageAction.AbstractC38859a
    /* renamed from: a */
    public final void mo67518a(C38887d dVar) {
        C38888e eVar = this.f91872a;
        CardStruct ar = C37699a.m76272ar(eVar.f91837b);
        String cardUrl = ar != null ? ar.getCardUrl() : "";
        C1764a.m5929a(Locale.getDefault(), "onRenderFinish:%s, %d", new Object[]{cardUrl, Integer.valueOf(dVar.f91831a)});
        AbstractC38878ae a = eVar.mo67573a(false);
        if (a != null) {
            a.mo67533a(C1764a.m5929a(Locale.getDefault(), "javascript:window.modalLoadStatusEvent({'modal_url': '%s', 'status': %d})", new Object[]{cardUrl, Integer.valueOf(dVar.f91831a)}));
        }
    }
}
