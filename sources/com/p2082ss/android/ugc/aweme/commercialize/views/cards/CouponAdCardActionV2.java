package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.trill.R;
import org.greenrobot.eventbus.AbstractC90253j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.CouponAdCardActionV2 */
public class CouponAdCardActionV2 extends AbsAdCardActionV2 implements AbstractC33974au, AbstractC90253j {
    static {
        Covode.recordClassIndex(46418);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: d */
    public final void mo67502d() {
        CardStruct f;
        super.mo67502d();
        if (C37663b.f89031b.mo65688a() != null && (f = C37663b.f89031b.mo65688a().mo65672f(this.f91766c)) != null && f.getCardStyle() != 2 && this.f91767d.mo67539d() != null) {
            this.f91767d.mo67539d().setBackgroundResource(R.drawable.pc);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: e */
    public final void mo67503e() {
        super.mo67503e();
        mo67498a(new C38661b.C38662a().mo67230a("click").mo67233b("card").mo67229a(this.f91766c).mo67232a());
        if (C37663b.f89031b.mo65688a() != null) {
            C37663b.f89031b.mo65688a().mo65677i(this.f91766c);
        }
    }

    public CouponAdCardActionV2(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        super(context, aweme, aeVar);
        this.f91755a = 2131232518;
        this.f91769f = true;
    }
}
