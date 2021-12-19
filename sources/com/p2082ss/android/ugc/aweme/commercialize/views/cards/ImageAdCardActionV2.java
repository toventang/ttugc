package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.depend.C37663b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38661b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import org.greenrobot.eventbus.AbstractC90253j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ImageAdCardActionV2 */
public class ImageAdCardActionV2 extends AbsAdCardActionV2 implements AbstractC33974au, AbstractC90253j {
    static {
        Covode.recordClassIndex(46428);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    /* renamed from: e */
    public final void mo67503e() {
        if (C37663b.f89031b.mo65688a() != null) {
            super.mo67503e();
            mo67498a(new C38661b.C38662a().mo67230a("click").mo67233b("card").mo67229a(this.f91766c).mo67232a());
            if (!C37663b.f89031b.mo65688a().mo65660a(this.f91765b, this.f91766c) && !C37663b.f89031b.mo65688a().mo65664b(this.f91765b, this.f91766c) && !C37663b.f89031b.mo65688a().mo65661a(this.f91765b, this.f91766c, 33) && !C37663b.f89031b.mo65688a().mo65659a(this.f91765b)) {
                if (!C37663b.f89031b.mo65688a().mo65679k(this.f91766c) || TextUtils.isEmpty(C37663b.f89031b.mo65688a().mo65680l(this.f91766c)) || C37663b.f89031b.mo65688a().mo65681m(this.f91766c)) {
                    C37663b.f89031b.mo65688a().mo65667c(this.f91765b, this.f91766c);
                } else {
                    C37663b.f89031b.mo65688a().mo65651a(this.f91765b, "click_ad_card");
                }
            }
        }
    }

    public ImageAdCardActionV2(Context context, Aweme aweme, AbstractC38878ae aeVar) {
        super(context, aweme, aeVar);
        this.f91755a = 2131232517;
        this.f91769f = true;
    }
}
