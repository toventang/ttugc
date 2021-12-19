package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.v */
final /* synthetic */ class C38920v implements AbstractC34466a {

    /* renamed from: a */
    private final C38907p f91923a;

    static {
        Covode.recordClassIndex(46507);
    }

    C38920v(C38907p pVar) {
        this.f91923a = pVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C38907p pVar = this.f91923a;
        if (i != 4) {
            return false;
        }
        pVar.f91892j.mo60191a("ACTION_TOP_WEB_PAGE_HIDE", (Object) null);
        return true;
    }
}
