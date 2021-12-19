package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.LandingPageAdCardActionV2 */
public class LandingPageAdCardActionV2 extends AbsHalfWebPageActionV2 implements AbstractC33974au {
    static {
        Covode.recordClassIndex(46432);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: d */
    public final void mo67502d() {
        boolean z;
        super.mo67502d();
        if (C37663b.f89031b.mo65688a() != null) {
            z = C37663b.f89031b.mo65688a().mo65675g(this.f91766c);
        } else {
            z = false;
        }
        if (this.f91766c.getAwemeRawAd() != null && !this.f91766c.getAwemeRawAd().getDisableAutoTrackClick()) {
            mo67498a(new C38661b.C38662a().mo67230a("click").mo67233b("card").mo67229a(this.f91766c).mo67231a(z).mo67232a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: e */
    public final void mo67503e() {
        if (C37663b.f89031b.mo65688a() != null) {
            super.mo67503e();
            mo67498a(new C38661b.C38662a().mo67230a("otherclick").mo67233b("card").mo67229a(this.f91766c).mo67232a());
            if (!C37663b.f89031b.mo65688a().mo65660a(this.f91765b, this.f91766c) && !C37663b.f89031b.mo65688a().mo65664b(this.f91765b, this.f91766c)) {
                if (!C37663b.f89031b.mo65688a().mo65661a(this.f91765b, this.f91766c, 33)) {
                    C37663b.f89031b.mo65688a().mo65667c(this.f91765b, this.f91766c);
                } else {
                    return;
                }
            }
            if (this.f91766c.getAwemeRawAd() != null && this.f91766c.getAwemeRawAd().getDisableAutoTrackClick()) {
                mo67498a(new C38661b.C38662a().mo67230a("click").mo67233b("card").mo67229a(this.f91766c).mo67232a());
            }
        }
    }

    public LandingPageAdCardActionV2(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        super(context, aweme, aeVar);
        this.f91769f = true;
    }
}
