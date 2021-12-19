package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37835d;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import org.greenrobot.eventbus.AbstractC90253j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.CouponAdCardAction */
public class CouponAdCardAction extends AbsAdCardAction implements AbstractC33974au, AbstractC90253j {
    static {
        Covode.recordClassIndex(46417);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: d */
    public final void mo67489d() {
        super.mo67489d();
        CardStruct e = C37699a.m76292e(this.f91759c);
        if (e != null && e.getCardStyle() != 2 && this.f91760d.mo67539d() != null) {
            this.f91760d.mo67539d().setBackgroundResource(R.drawable.pc);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    /* renamed from: e */
    public final void mo67490e() {
        super.mo67490e();
        mo67484a(new C38661b.C38662a().mo67230a("click").mo67233b("card").mo67229a(this.f91759c).mo67232a());
        AbstractC81915c.m141874a(new C37835d(this.f91759c, 17));
    }

    public CouponAdCardAction(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        super(context, aweme, aeVar);
        this.f91753a = 2131232518;
        this.f91762f = true;
    }
}
