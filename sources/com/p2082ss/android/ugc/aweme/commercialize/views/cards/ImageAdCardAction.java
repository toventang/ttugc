package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38673e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.miniapp.utils.C59286a;
import org.greenrobot.eventbus.AbstractC90253j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ImageAdCardAction */
public class ImageAdCardAction extends AbsAdCardAction implements AbstractC33974au, AbstractC90253j {
    static {
        Covode.recordClassIndex(46427);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: e */
    public final void mo67490e() {
        super.mo67490e();
        mo67484a(new C38661b.C38662a().mo67230a("click").mo67233b("card").mo67229a(this.f91759c).mo67232a());
        if (AbstractC38757n.m78633a(this.f91758b, this.f91759c)) {
            return;
        }
        if (TextUtils.equals(this.f91759c.getAwemeRawAd().getType(), "app")) {
            if (this.f91759c.getAwemeRawAd().getWebType() != 1 || TextUtils.isEmpty(this.f91759c.getAwemeRawAd().getWebUrl())) {
                C38767w.m78671d(this.f91758b, this.f91759c);
            } else {
                AbstractC38757n.m78635a(this.f91758b, this.f91759c, (String) null, (String) null);
            }
        } else if (!C59286a.m108996a(this.f91758b, this.f91759c) && !C38767w.m78661e(this.f91758b, this.f91759c, 33) && !C38767w.m78631a(this.f91758b, 33)) {
            if (!C37699a.m76202E(this.f91759c) || TextUtils.isEmpty(C37699a.m76281b(this.f91759c)) || C37699a.m76203F(this.f91759c)) {
                AbstractC38757n.m78635a(this.f91758b, this.f91759c, (String) null, (String) null);
            } else {
                C38673e.m78468a(this.f91758b, "click_ad_card");
            }
        }
    }

    public ImageAdCardAction(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        super(context, aweme, aeVar);
        this.f91753a = 2131232517;
        this.f91762f = true;
    }
}
