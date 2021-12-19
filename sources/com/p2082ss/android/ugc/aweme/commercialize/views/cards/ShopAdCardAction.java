package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.miniapp.utils.C59286a;
import org.greenrobot.eventbus.AbstractC90253j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ShopAdCardAction */
public class ShopAdCardAction extends AbsAdCardAction implements AbstractC33974au, AbstractC90253j {

    /* renamed from: i */
    private int f91780i;

    static {
        Covode.recordClassIndex(46439);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: e */
    public final void mo67490e() {
        super.mo67490e();
        if (this.f91780i == 0) {
            mo67484a(new C38661b.C38662a().mo67230a("click").mo67233b("card").mo67229a(this.f91759c).mo67232a());
            if (!AbstractC38757n.m78633a(this.f91758b, this.f91759c) && !C59286a.m108996a(this.f91758b, this.f91759c) && !C38767w.m78661e(this.f91758b, this.f91759c, 2)) {
                AbstractC38757n.m78635a(this.f91758b, this.f91759c, (String) null, (String) null);
            }
        }
    }

    public ShopAdCardAction(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        super(context, aweme, aeVar);
        boolean z;
        if (C37699a.m76292e(aweme) != null) {
            this.f91780i = C37699a.m76292e(aweme).getCardStyle();
        }
        if (this.f91780i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f91762f = z;
        this.f91753a = 2131232515;
    }
}
