package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38739d;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.miniapp.utils.C59286a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.LandingPageAdCardAction */
public class LandingPageAdCardAction extends AbsHalfWebPageAction implements AbstractC33974au {

    /* renamed from: a */
    public static final String f91775a = LandingPageAdCardAction.class.getSimpleName();

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static {
        Covode.recordClassIndex(46431);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: d */
    public final void mo67489d() {
        super.mo67489d();
        if (this.f91759c.getAwemeRawAd() != null && !this.f91759c.getAwemeRawAd().getDisableAutoTrackClick()) {
            mo67484a(new C38661b.C38662a().mo67230a("click").mo67233b("card").mo67229a(this.f91759c).mo67231a(C38739d.m78577d(this.f91759c)).mo67232a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: e */
    public final void mo67490e() {
        super.mo67490e();
        mo67484a(new C38661b.C38662a().mo67230a("otherclick").mo67233b("card").mo67229a(this.f91759c).mo67232a());
        if (!AbstractC38757n.m78633a(this.f91758b, this.f91759c) && !C59286a.m108996a(this.f91758b, this.f91759c)) {
            if (!C38767w.m78661e(this.f91758b, this.f91759c, 33)) {
                AbstractC38757n.m78635a(this.f91758b, this.f91759c, (String) null, (String) null);
            } else {
                return;
            }
        }
        if (this.f91759c.getAwemeRawAd() != null && this.f91759c.getAwemeRawAd().getDisableAutoTrackClick()) {
            mo67484a(new C38661b.C38662a().mo67230a("click").mo67233b("card").mo67229a(this.f91759c).mo67232a());
        }
    }

    public LandingPageAdCardAction(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        super(context, aweme, aeVar);
        this.f91762f = true;
    }
}
